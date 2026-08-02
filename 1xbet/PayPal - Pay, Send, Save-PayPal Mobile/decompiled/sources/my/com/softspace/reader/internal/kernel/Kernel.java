package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
public abstract class Kernel {
    public static final int ERROR_CDCVM = 7054;
    public static final int ERROR_END_APPLICATION = 7055;
    public static final int ERROR_GENRAL_ERROR = 7005;
    public static final int ERROR_INVALID_CONFIGURATION = 7052;
    public static final int ERROR_IO_ERROR = 7056;
    public static final int ERROR_TRY_OTHER_INTERFACE = 7004;
    public static final int ERROR_UNSUPPORT_APPLICATION = 7006;
    public static final int OFFLINE_APPROVED = 16;
    public static final int SUCCESS = 0;
    public static final int UI_TRY_OTHER_INTERFACE = 3;
    public static final int UI_UNSUPPORT_APPLICATION = 2;
    protected static final byte[] COMMAND_SELECT = {0, -92, 4, 0};
    protected static final byte[] PAYLOAD_PPSE = {org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};

    public abstract java.lang.Integer getCvmType();

    public abstract byte[] getOnlineData();

    public abstract byte[] getOnlineResponseData();

    public abstract java.lang.Integer getTransactionResult();

    public abstract void init(android.content.Context context, byte[] bArr);

    public abstract int preProcessing(android.content.Context context, java.lang.String str, int i, byte[] bArr, my.com.softspace.reader.internal.kernel.Kernel.Callback callback);

    public abstract void release(android.content.Context context);

    public abstract void setDebitOptIn(boolean z);

    public abstract int start(android.content.Context context, java.lang.String str, int i, boolean z, boolean z2, my.com.softspace.reader.internal.kernel.Kernel.Callback callback);

    public interface Callback {
        byte[] exchangeAPDU(byte[] bArr) throws java.io.IOException;

        boolean isReadCardError();

        byte[] sendOnlineAuthentication(byte[] bArr, byte[] bArr2) throws java.lang.Exception;

        void setReadCardError(boolean z);

        int updateUI(int i);

        default java.lang.Object[] cipherOperation(boolean z, byte[] bArr, boolean z2) {
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return new java.lang.Object[]{0, bArr2};
        }

        default java.lang.Object[] hmacSHA256(byte[] bArr) {
            return new java.lang.Object[]{0, new byte[32]};
        }

        default java.lang.Object[] cmac(byte[] bArr) {
            return new java.lang.Object[]{0, new byte[16]};
        }
    }

    protected static final byte[] select(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new java.lang.IllegalArgumentException();
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(COMMAND_SELECT);
                byteArrayOutputStream.write(((byte) bArr.length) & 255);
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(0);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    protected static byte[] dropLast2(byte[] bArr) {
        return java.util.Arrays.copyOfRange(bArr, 0, bArr.length - 2);
    }

    protected static boolean sw9000(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return false;
        }
        int length = bArr.length;
        return bArr[length + (-2)] == -112 && bArr[length - 1] == 0;
    }

    protected static java.util.List<my.com.softspace.reader.internal.kernel.AIDInfo> aidInfoList(byte[] bArr, byte[] bArr2) {
        my.com.softspace.reader.internal.kernelconfig.BerTlv create = my.com.softspace.reader.internal.kernelconfig.BerTlv.create(bArr);
        assureTag(create, 111);
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> createList = my.com.softspace.reader.internal.kernelconfig.BerTlv.createList(create.getValue());
        my.com.softspace.reader.internal.kernelconfig.BerTlv assureTag = assureTag(createList, 132);
        my.com.softspace.reader.internal.kernelconfig.BerTlv assureTag2 = assureTag(createList, 165);
        byte[] value = assureTag.getValue();
        if (value.length > bArr2.length) {
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i("sskernel-config", "partial matching");
            value = java.util.Arrays.copyOf(value, bArr2.length);
        }
        if (!java.util.Arrays.equals(value, bArr2)) {
            throwNonEmv();
        }
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> createList2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.createList(assureTag2.getValue());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        for (my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv : createList2) {
            int intValue = berTlv.getTag().toIntValue();
            if (intValue == 48908) {
                for (my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv2 : my.com.softspace.reader.internal.kernelconfig.BerTlv.createList(berTlv.getValue())) {
                    if (berTlv2.getTag().toIntValue() == 97) {
                        byte[] nullableBerTlvFindValue = nullableBerTlvFindValue(berTlv2.getValue(), 79);
                        byte[] nullableBerTlvFindValue2 = nullableBerTlvFindValue(berTlv2.getValue(), 80);
                        byte[] nullableBerTlvFindValue3 = nullableBerTlvFindValue(berTlv2.getValue(), 135);
                        if (nullableBerTlvFindValue != null) {
                            arrayList.add(new my.com.softspace.reader.internal.kernel.AIDInfo(nullableBerTlvFindValue, nullableBerTlvFindValue2, nullableBerTlvFindValue3));
                        }
                    }
                }
            } else if (intValue == 80) {
                bArr3 = berTlv.getValue();
            } else if (intValue == 135) {
                bArr4 = berTlv.getValue();
            }
        }
        if (bArr3 == null && bArr4 == null) {
            return arrayList;
        }
        arrayList.add(new my.com.softspace.reader.internal.kernel.AIDInfo(bArr2, bArr3, bArr4));
        return arrayList;
    }

    protected static byte[] nullableBerTlvFindValue(byte[] bArr, int i) {
        try {
            my.com.softspace.reader.internal.kernelconfig.BerTlv nullableBerTlvFind = nullableBerTlvFind(bArr, i);
            if (nullableBerTlvFind == null) {
                return null;
            }
            return nullableBerTlvFind.getValue();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    protected static my.com.softspace.reader.internal.kernelconfig.BerTlv nullableBerTlvFind(byte[] bArr, int i) {
        try {
            return my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr, i);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    protected static my.com.softspace.reader.internal.kernelconfig.BerTlv nullableBerTlv(byte[] bArr) {
        try {
            return my.com.softspace.reader.internal.kernelconfig.BerTlv.create(bArr);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    protected static void throwNonEmv() {
        throw new java.lang.IllegalArgumentException();
    }

    protected static void assureTag(my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv, int i) {
        if (berTlv.getTag().toIntValue() != i) {
            throwNonEmv();
        }
    }

    protected static my.com.softspace.reader.internal.kernelconfig.BerTlv nullableTag(java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> list, int i) {
        for (my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv : list) {
            if (berTlv.getTag().toIntValue() == i) {
                return berTlv;
            }
        }
        return null;
    }

    protected static my.com.softspace.reader.internal.kernelconfig.BerTlv assureTag(java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> list, int i) {
        my.com.softspace.reader.internal.kernelconfig.BerTlv nullableTag = nullableTag(list, i);
        if (nullableTag == null) {
            throwNonEmv();
        }
        return nullableTag;
    }
}
