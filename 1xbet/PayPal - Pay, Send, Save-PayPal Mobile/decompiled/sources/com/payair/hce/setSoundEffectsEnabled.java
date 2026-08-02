package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSoundEffectsEnabled {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int writeReplace;
    private com.payair.hce.HCEDatabase valueOf;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        switch ((i * 71) + (i2 * (-69)) + (((~(i2 | i3)) | i4) * (-140)) + ((~(i | i2 | i3)) * 70) + (((~(i | (~i2))) | i4 | (~(i3 | i))) * 70)) {
            case 1:
                return writeReplace(objArr);
            case 2:
                return DigitizedCardProfile(objArr);
            case 3:
                return valueOf(objArr);
            case 4:
                return AlternateContactlessPaymentDataJson(objArr);
            case 5:
                com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = (com.payair.hce.setSoundEffectsEnabled) objArr[0];
                int i5 = writeReplace + 87;
                DigitizedCardProfile = i5 % 128;
                setsoundeffectsenabled.valueOf = (com.payair.hce.HCEDatabase) (i5 % 2 != 0 ? androidx.room.Room.databaseBuilder((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis()), com.payair.hce.HCEDatabase.class, "payair.db").addMigrations(com.payair.hce.HCEDatabase.MIGRATION_1_2, com.payair.hce.HCEDatabase.MIGRATION_2_3) : androidx.room.Room.databaseBuilder((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis()), com.payair.hce.HCEDatabase.class, "payair.db").addMigrations(com.payair.hce.HCEDatabase.MIGRATION_1_2, com.payair.hce.HCEDatabase.MIGRATION_2_3)).build();
                int i6 = writeReplace;
                DigitizedCardProfile = ((((i6 | 102) << 1) - (i6 ^ 102)) - 1) % 128;
                return null;
            case 6:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 7:
                return RecordsJson(objArr);
            case 8:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            default:
                return values(objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = s2 + 4;
        int i6 = 1 - (s * 4);
        int i7 = (i * 4) + 66;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            i5 += i7;
            i3 = i8;
            i2 = i9;
            bArr2[i2] = (byte) i5;
            i4 = i2 + 1;
            int i10 = i3 + 1;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i10;
            i7 = bArr[i10];
            i9 = i4;
            i5 += i7;
            i3 = i8;
            i2 = i9;
            bArr2[i2] = (byte) i5;
            i4 = i2 + 1;
            int i102 = i3 + 1;
            if (i4 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i5;
            i5 = i7;
            bArr2[i2] = (byte) i5;
            i4 = i2 + 1;
            int i1022 = i3 + 1;
            if (i4 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = 118 - (b * 50);
        byte[] bArr = $$a;
        int i3 = 9 - (s2 * 6);
        int i4 = s * 13;
        byte[] bArr2 = new byte[20 - i4];
        int i5 = 19 - i4;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i2 = i2 + (-i6) + 2;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i++;
            i2 = i2 + (-i6) + 2;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$d;
        int i3 = i * 3;
        int i4 = 119 - (b * 3);
        int i5 = 4 - (b2 * 4);
        byte[] bArr2 = new byte[i3 + 12];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 += i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i3 + 11) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i2 + 1;
            i6 = i5;
            i5 = bArr[i5];
            i7 = i8;
            i4 += i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i3 + 11) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i3 + 11) {
            }
        }
    }

    setSoundEffectsEnabled() {
        DigitizedCardProfile(new java.lang.Object[]{this}, -1256923521, 1256923526, java.lang.System.identityHashCode(this));
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = (com.payair.hce.setSoundEffectsEnabled) objArr[0];
        int i = writeReplace;
        DigitizedCardProfile = (((i & (-6)) | ((~i) & 5)) + ((i & 5) << 1)) % 128;
        com.payair.hce.PayairUserDataDao payairUserDataDao = setsoundeffectsenabled.valueOf.payairUserDataDao();
        int i2 = DigitizedCardProfile + 47;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return payairUserDataDao;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = (com.payair.hce.setSoundEffectsEnabled) objArr[0];
        int i = writeReplace;
        int i2 = (((i & (-120)) | ((~i) & 119)) - (~(-(-((i & 119) << 1))))) - 1;
        DigitizedCardProfile = i2 % 128;
        com.payair.hce.HCEDatabase hCEDatabase = setsoundeffectsenabled.valueOf;
        if (i2 % 2 != 0) {
            hCEDatabase.temporaryDataDao();
            throw null;
        }
        com.payair.hce.TemporaryDataDao temporaryDataDao = hCEDatabase.temporaryDataDao();
        int i3 = writeReplace;
        int i4 = ((i3 ^ 50) + ((i3 & 50) << 1)) - 1;
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            return temporaryDataDao;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = (com.payair.hce.setSoundEffectsEnabled) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 109;
        int i3 = ((i ^ 109) | i2) << 1;
        int i4 = -((i | 109) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        writeReplace = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                java.util.List<com.payair.hce.setPointerIcon> list = ((com.payair.hce.PayairUserDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1578315683, 1578315685, java.lang.System.identityHashCode(setsoundeffectsenabled))).getAll().get();
                DigitizedCardProfile = (writeReplace + 89) % 128;
                return list;
            }
            ((com.payair.hce.PayairUserDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1578315683, 1578315685, java.lang.System.identityHashCode(setsoundeffectsenabled))).getAll().get();
            throw new java.lang.ArithmeticException();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return java.util.Collections.emptyList();
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = (com.payair.hce.setSoundEffectsEnabled) objArr[0];
        com.payair.hce.setPointerIcon[] setpointericonArr = (com.payair.hce.setPointerIcon[]) objArr[1];
        int i = writeReplace;
        int i2 = ((i | 3) << 1) - (i ^ 3);
        DigitizedCardProfile = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ((com.payair.hce.PayairUserDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1578315683, 1578315685, java.lang.System.identityHashCode(setsoundeffectsenabled))).insert(setpointericonArr).get();
                int i3 = DigitizedCardProfile;
                int i4 = i3 | 77;
                int i5 = ((i4 << 1) - (~(-((~(i3 & 77)) & i4)))) - 1;
                writeReplace = i5 % 128;
                if (i5 % 2 != 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }
            ((com.payair.hce.PayairUserDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1578315683, 1578315685, java.lang.System.identityHashCode(setsoundeffectsenabled))).insert(setpointericonArr).get();
            throw null;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = (com.payair.hce.setSoundEffectsEnabled) objArr[0];
        com.payair.hce.setPointerIcon setpointericon = (com.payair.hce.setPointerIcon) objArr[1];
        int i = writeReplace;
        int i2 = i ^ 47;
        int i3 = ((i & 47) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        DigitizedCardProfile = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                ((com.payair.hce.PayairUserDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1578315683, 1578315685, java.lang.System.identityHashCode(setsoundeffectsenabled))).delete(setpointericon).get();
                return null;
            }
            ((com.payair.hce.PayairUserDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1578315683, 1578315685, java.lang.System.identityHashCode(setsoundeffectsenabled))).delete(setpointericon).get();
            throw new java.lang.ArithmeticException();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = (com.payair.hce.setSoundEffectsEnabled) objArr[0];
        int i = writeReplace + 65;
        DigitizedCardProfile = i % 128;
        try {
            if (i % 2 == 0) {
                return ((com.payair.hce.TemporaryDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1958271237, 1958271237, java.lang.System.identityHashCode(setsoundeffectsenabled))).getAll().get();
            }
            ((com.payair.hce.TemporaryDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1958271237, 1958271237, java.lang.System.identityHashCode(setsoundeffectsenabled))).getAll().get();
            throw new java.lang.ArithmeticException();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return java.util.Collections.emptyList();
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = (com.payair.hce.setSoundEffectsEnabled) objArr[0];
        com.payair.hce.setZ[] setzArr = (com.payair.hce.setZ[]) objArr[1];
        int i = DigitizedCardProfile;
        int i2 = i ^ 111;
        int i3 = ((i & 111) | i2) << 1;
        int i4 = -i2;
        writeReplace = ((i3 & i4) + (i3 | i4)) % 128;
        try {
            ((com.payair.hce.TemporaryDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1958271237, 1958271237, java.lang.System.identityHashCode(setsoundeffectsenabled))).insert(setzArr).get();
            writeReplace = (DigitizedCardProfile + 69) % 128;
            return null;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.Throwable.class).newInstance(e));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private static void c(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AlternateContactlessPaymentDataJson;
        int i4 = 16;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            $10 = ($11 + 19) % 128;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                $10 = ($11 + 11) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i7])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> i4) + 27, 29 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr3[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i7++;
                    $11 = ($10 + 87) % 128;
                    i4 = 16;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AlternateContactlessPaymentDataJson;
        if (iArr5 != null) {
            $11 = ($10 + 99) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 57;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[i5];
                    objArr3[0] = java.lang.Integer.valueOf(iArr5[i8]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        i3 = length3;
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, (android.os.Process.myPid() >> 22) + 29, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    } else {
                        i3 = length3;
                    }
                    iArr6[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                } else {
                    i3 = length3;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr5[i8])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, 28 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                    }
                    iArr6[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    i8++;
                }
                length3 = i3;
                i5 = 1;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr5, i2, iArr4, i2, length2);
        istransitsupported.valueOf = i2;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[i2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr4[i10];
                java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 5088 - android.graphics.Color.alpha(0), (char) (android.os.Process.myTid() >> 22))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i10++;
            }
            int i12 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i12;
            istransitsupported.values ^= iArr4[16];
            istransitsupported.DigitizedCardProfile ^= iArr4[17];
            int i13 = istransitsupported.DigitizedCardProfile;
            int i14 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr4);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 50, android.os.Process.getGidForName("") + 2924, (char) (3037 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a((short) 0, (short) -1, 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03bc A[Catch: all -> 0x0687, TryCatch #3 {all -> 0x0687, blocks: (B:22:0x01ae, B:24:0x01cd, B:25:0x0208, B:37:0x0395, B:39:0x03bc, B:40:0x0407), top: B:17:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        long j;
        android.content.Context context;
        java.lang.Object obj;
        java.lang.Object[] objArr2;
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = (com.payair.hce.setSoundEffectsEnabled) objArr[0];
        com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[1];
        int i = writeReplace;
        int i2 = (i & (-6)) | ((~i) & 5);
        int i3 = -(-((i & 5) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        DigitizedCardProfile = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                ((com.payair.hce.TemporaryDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1958271237, 1958271237, java.lang.System.identityHashCode(setsoundeffectsenabled))).delete(setz).get();
                return null;
            }
            ((com.payair.hce.TemporaryDataDao) DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1958271237, 1958271237, java.lang.System.identityHashCode(setsoundeffectsenabled))).delete(setz).get();
            throw new java.lang.ArithmeticException();
        } catch (java.lang.InterruptedException e) {
            e = e;
            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.getTrimmedLength(""), android.os.Process.getGidForName("") + 1582, (char) (android.os.Process.getGidForName("") + 1));
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[26]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b(b, bArr[12], b, objArr3);
            j = cls.getField((java.lang.String) objArr3[0]).getLong(null);
            try {
                if (j != -1) {
                    int i5 = -android.graphics.Color.green(0);
                    int identityHashCode = java.lang.System.identityHashCode(setsoundeffectsenabled);
                    int i6 = i5 * (-375);
                    int i7 = ~i5;
                    int i8 = i7 & (i7 | i5);
                    int i9 = ~((i8 ^ (-23)) | (i8 & (-23)));
                    int i10 = (i5 & (-23)) | (i7 & 22);
                    int i11 = i5 & 22;
                    int i12 = (-2) - (~(((i6 ^ (-8250)) + ((i6 & (-8250)) << 1)) - (~((((identityHashCode ^ i9) | (i9 & identityHashCode)) | (~((i10 ^ i11) | (i10 & i11)))) * 376))));
                    int i13 = ~identityHashCode;
                    int i14 = i13 & (i13 | identityHashCode);
                    int i15 = (i14 ^ i5) | (i14 & i5);
                    int i16 = ~i15;
                    int i17 = (i15 | i16) & i16;
                    int i18 = ~((i5 ^ 22) | i11);
                    int i19 = ((i18 ^ i17) | (i18 & i17)) * (-376);
                    int i20 = (i12 ^ i19) + ((i19 & i12) << 1);
                    int i21 = i7 & identityHashCode;
                    int i22 = (~i21) & (i7 | identityHashCode);
                    int i23 = (i21 ^ i22) | (i21 & i22);
                    int i24 = ~i23;
                    int i25 = (i23 | i24) & i24;
                    int i26 = ((i25 ^ 22) | (i25 & 22)) * 376;
                    int i27 = i20 & i26;
                    int i28 = -(-((i26 ^ i20) | i27));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    c(new int[]{449501488, -282714756, 1255509480, 851119833, 1195097999, 847783149, 451596061, 1383797772, 146090338, -1302207431, 2032099554, -430626327}, (i27 ^ i28) + ((i28 & i27) << 1), objArr4);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    int i29 = -android.view.View.getDefaultSize(0, 0);
                    int i30 = i29 ^ 15;
                    int i31 = -(-((i29 & 15) << 1));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c(new int[]{533059444, 1740471877, -819082967, -1167731143, 2039392577, -1551529149, 343887678, -762003063}, ((i30 | i31) << 1) - (i31 ^ i30), objArr5);
                    if (j + 1942 >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr5[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                        writeReplace = (DigitizedCardProfile + 15) % 128;
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47, android.view.View.MeasureSpec.getSize(0) + 1581, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                        byte b2 = bArr[12];
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b(b2, (byte) (-bArr[26]), b2, objArr6);
                        java.lang.Object[] objArr7 = {cls3.getField((java.lang.String) objArr6[0]).get(null), 874672635, 0};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.Gravity.getAbsoluteGravity(0, 0), 4905 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.view.View.resolveSize(0, 0))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj2);
                        }
                        objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj2).invoke(null, objArr7);
                        int i32 = DigitizedCardProfile;
                        int i33 = i32 & 79;
                        writeReplace = ((i33 - (~(-(-((i32 ^ 79) | i33))))) - 1) % 128;
                        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add((java.lang.String) objArr2[2]);
                            arrayList.add((java.lang.String) objArr2[3]);
                            writeReplace = (DigitizedCardProfile + 47) % 128;
                        }
                        int i34 = writeReplace;
                        int i35 = i34 & 29;
                        int i36 = (i34 ^ 29) | i35;
                        DigitizedCardProfile = (((i35 | i36) << 1) - (i36 ^ i35)) % 128;
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.Throwable.class).newInstance(e));
                    }
                }
                int i37 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int identityHashCode2 = java.lang.System.identityHashCode(setsoundeffectsenabled);
                int i38 = (i37 * 141) - 3753;
                int i39 = ~i37;
                int i40 = (i39 ^ 27) | (i39 & 27);
                int i41 = ~i40;
                int i42 = (i40 | i41) & i41;
                int i43 = i39 & identityHashCode2;
                int i44 = (i39 ^ identityHashCode2) | i43;
                int i45 = ~i44;
                int i46 = (i44 | i45) & i45;
                int i47 = -(-(((i42 ^ i46) | (i46 & i42)) * (-280)));
                int i48 = ((i38 ^ i47) | (i38 & i47)) << 1;
                int i49 = -((i38 & (~i47)) | ((~i38) & i47));
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                int i51 = ~identityHashCode2;
                int i52 = ~i39;
                int i53 = (i39 & i51) | (i52 & identityHashCode2);
                int i54 = ~((i53 & i43) | (i43 ^ i53));
                int i55 = identityHashCode2 ^ (-28);
                int i56 = identityHashCode2 & (-28);
                int i57 = (i55 ^ i56) | (i55 & i56);
                int i58 = ~i57;
                int i59 = i58 & (i57 | i58);
                int i60 = i54 & i59;
                int i61 = (i59 | i54) & (~i60);
                int i62 = -(-(((i61 ^ i60) | (i61 & i60)) * 140));
                int i63 = i50 ^ i62;
                int i64 = (((i62 & i50) | i63) << 1) - i63;
                int i65 = (i39 ^ (-28)) | (i39 & (-28));
                int i66 = (i65 & i51) | ((~i65) & identityHashCode2);
                int i67 = i65 & identityHashCode2;
                int i68 = (i67 ^ i66) | (i67 & i66);
                int i69 = ~i68;
                int i70 = (i68 | i69) & i69;
                int i71 = (identityHashCode2 | i51) & i51;
                int i72 = (i71 & i52) | (i39 & (~i71)) | (i71 & i39);
                int i73 = ~(((~i72) & 27) | (i72 & (-28)) | (i72 & 27));
                int i74 = i70 & i73;
                int i75 = (i73 | i70) & (~i74);
                int i76 = (i75 ^ i74) | (i75 & i74);
                int i77 = ~(i37 | i51 | (-28));
                int i78 = i76 ^ i77;
                int i79 = i77 & i76;
                int i80 = -(-(((i79 ^ i78) | (i79 & i78)) * 140));
                int i81 = i64 & i80;
                int i82 = (i64 | i80) & (~i81);
                int i83 = -(-(i81 << 1));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                c(new int[]{449501488, -282714756, 1255509480, 851119833, -1045364736, -346236798, -1381080812, -53184756, -1874401862, 1997176781, -464290979, -1596967350, 89988285, -155473804}, ((i82 | i83) << 1) - (i82 ^ i83), objArr8);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                int i84 = -android.graphics.Color.green(0);
                int i85 = i84 ^ 18;
                int i86 = (i84 & 18) << 1;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                c(new int[]{-242600661, -1885398127, -1467569149, -1299216793, -1715404244, 462609902, 409492874, -808757429, 1761990099, -793936588}, (i85 & i86) + (i86 | i85), objArr9);
                context = (android.content.Context) cls4.getMethod((java.lang.String) objArr9[0], new java.lang.Class[0]).invoke(null, null);
                if (context != null) {
                    int i87 = writeReplace;
                    DigitizedCardProfile = (((i87 | 15) << 1) - (i87 ^ 15)) % 128;
                    context = context.getApplicationContext();
                    int i88 = DigitizedCardProfile;
                    writeReplace = ((i88 ^ 103) + ((i88 & 103) << 1)) % 128;
                }
                int i89 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                int i90 = i89 & 16;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                c(new int[]{-451529536, -1633076821, 490292147, 1637149333, 1867551616, 1862169975, 775620587, -264725912}, (((i89 ^ 16) | i90) << 1) - ((i89 | 16) & (~i90)), objArr10);
                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
                int i91 = indexOf & 16;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                c(new int[]{1070191642, -590703193, 1302958063, 1029298291, -929749678, 2916963, 381460094, -1166814683}, (((indexOf ^ 16) | i91) << 1) - ((~i91) & (indexOf | 16)), objArr11);
                java.lang.Object[] objArr12 = {context, java.lang.Integer.valueOf(((java.lang.Integer) cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class).invoke(null, setsoundeffectsenabled)).intValue()), 0, 874672635};
                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1963823933);
                if (obj == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.KeyEvent.keyCodeFromString(""), android.widget.ExpandableListView.getPackedPositionChild(0L) + 3920, (char) (19389 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    d(0, (byte) 0, (byte) 0, objArr13);
                    obj = cls6.getMethod((java.lang.String) objArr13[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1963823933, obj);
                }
                objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr12);
                if (context != null) {
                    int i92 = DigitizedCardProfile;
                    int i93 = i92 & 43;
                    int i94 = (i92 | 43) & (~i93);
                    int i95 = i93 << 1;
                    writeReplace = (((i94 | i95) << 1) - (i94 ^ i95)) % 128;
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 47, 1580 - android.view.MotionEvent.axisFromString(""), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                    byte b3 = bArr[12];
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    b(b3, (byte) (-bArr[26]), b3, objArr14);
                    cls7.getField((java.lang.String) objArr14[0]).set(null, objArr2);
                    try {
                        try {
                            int edgeSlop = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                            int identityHashCode3 = java.lang.System.identityHashCode(setsoundeffectsenabled);
                            int i96 = edgeSlop * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                            int i97 = i96 & (-11440);
                            int i98 = -(-((i96 ^ (-11440)) | i97));
                            int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                            int i100 = ~identityHashCode3;
                            int i101 = (i100 & (-23)) | ((~i100) & 22);
                            int i102 = i100 & 22;
                            int i103 = (i101 ^ i102) | (i101 & i102);
                            int i104 = ~i103;
                            int i105 = (i103 | i104) & i104;
                            int i106 = edgeSlop & i105;
                            int i107 = (i105 | edgeSlop) & (~i106);
                            int i108 = -(-(((i107 ^ i106) | (i107 & i106)) * (-1042)));
                            int i109 = i99 & i108;
                            int i110 = -(-((i108 ^ i99) | i109));
                            int i111 = (i109 ^ i110) + ((i110 & i109) << 1);
                            int i112 = (identityHashCode3 & (-23)) | i102;
                            int i113 = identityHashCode3 & 22;
                            int i114 = ((i112 ^ i113) | (i112 & i113)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                            int i115 = ((i111 ^ i114) | (i111 & i114)) << 1;
                            int i116 = -(((~i114) & i111) | ((~i111) & i114));
                            int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                            int i118 = ~edgeSlop;
                            int i119 = (i118 | edgeSlop) & i118;
                            int i120 = i119 ^ (-23);
                            int i121 = i119 & (-23);
                            int i122 = ~((i121 ^ i120) | (i121 & i120));
                            int i123 = i118 ^ identityHashCode3;
                            int i124 = identityHashCode3 & i118;
                            int i125 = ~((i124 ^ i123) | (i124 & i123));
                            int i126 = (i125 ^ i122) | (i122 & i125);
                            int i127 = (edgeSlop ^ i100) | (edgeSlop & i100);
                            int i128 = (i127 & (-23)) | ((~i127) & 22);
                            int i129 = i127 & 22;
                            int i130 = ~((i129 ^ i128) | (i129 & i128));
                            int i131 = i126 ^ i130;
                            int i132 = i130 & i126;
                            int i133 = -(-(((i132 ^ i131) | (i132 & i131)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(new int[]{449501488, -282714756, 1255509480, 851119833, 1195097999, 847783149, 451596061, 1383797772, 146090338, -1302207431, 2032099554, -430626327}, (((i117 ^ i133) | (i117 & i133)) << 1) - (((~i133) & i117) | ((~i117) & i133)), objArr15);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                            byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                            int identityHashCode4 = java.lang.System.identityHashCode(setsoundeffectsenabled);
                            int i134 = modifierMetaStateMask * (-496);
                            int i135 = i134 ^ (-7936);
                            int i136 = -(-((i134 & (-7936)) << 1));
                            int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                            int i138 = ~modifierMetaStateMask;
                            int i139 = (i138 | modifierMetaStateMask) & i138;
                            int i140 = i139 & (-17);
                            int i141 = (i139 | (-17)) & (~i140);
                            int i142 = -(-((~((i141 ^ i140) | (i141 & i140))) * 497));
                            int i143 = i137 | i142;
                            int i144 = i143 << 1;
                            int i145 = -((~(i142 & i137)) & i143);
                            int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                            int i147 = i138 & (-17);
                            int i148 = ((~i147) & (i138 | (-17))) | i147 | identityHashCode4;
                            int i149 = ~i148;
                            int i150 = (i148 | i149) & i149;
                            int i151 = ~identityHashCode4;
                            int i152 = i151 ^ (-17);
                            int i153 = i151 & (-17);
                            int i154 = (i152 ^ i153) | (i153 & i152);
                            int i155 = i154 & modifierMetaStateMask;
                            int i156 = (i154 | modifierMetaStateMask) & (~i155);
                            int i157 = ~((i156 ^ i155) | (i156 & i155));
                            int i158 = -(-(((i150 ^ i157) | (i150 & i157)) * 497));
                            int i159 = (((~i158) & i146) | ((~i146) & i158)) + ((i146 & i158) << 1);
                            int i160 = ~((i138 & i151) | (i138 ^ i151));
                            int i161 = ~(i138 | 16);
                            int i162 = i160 & i161;
                            int i163 = (i161 | i160) & (~i162);
                            int i164 = (i163 ^ i162) | (i163 & i162);
                            int i165 = i147 | (modifierMetaStateMask & 16);
                            int i166 = modifierMetaStateMask & (-17);
                            int i167 = (i166 ^ i165) | (i166 & i165);
                            int i168 = (i151 & i167) | ((~i167) & identityHashCode4);
                            int i169 = identityHashCode4 & i167;
                            int i170 = (i169 ^ i168) | (i169 & i168);
                            int i171 = ~i170;
                            int i172 = (i170 | i171) & i171;
                            int i173 = i164 ^ i172;
                            int i174 = i172 & i164;
                            int i175 = ((i174 ^ i173) | (i174 & i173)) * 497;
                            int i176 = i159 & i175;
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            c(new int[]{533059444, 1740471877, -819082967, -1167731143, 2039392577, -1551529149, 343887678, -762003063}, (((i159 ^ i175) | i176) << 1) - ((i175 | i159) & (~i176)), objArr16);
                            long longValue = ((java.lang.Long) cls8.getDeclaredMethod((java.lang.String) objArr16[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1580 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                            byte b4 = (byte) (-bArr[26]);
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            b(b4, bArr[12], b4, objArr17);
                            cls9.getField((java.lang.String) objArr17[0]).set(null, java.lang.Long.valueOf(longValue));
                            int i177 = writeReplace;
                            DigitizedCardProfile = (((i177 ^ 28) + ((i177 & 28) << 1)) - 1) % 128;
                        } catch (java.lang.Exception unused) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
                }
                int i342 = writeReplace;
                int i352 = i342 & 29;
                int i362 = (i342 ^ 29) | i352;
                DigitizedCardProfile = (((i352 | i362) << 1) - (i362 ^ i352)) % 128;
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.Throwable.class).newInstance(e));
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (java.util.concurrent.ExecutionException e2) {
            e = e2;
            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.getTrimmedLength(""), android.os.Process.getGidForName("") + 1582, (char) (android.os.Process.getGidForName("") + 1));
            byte[] bArr2 = $$a;
            byte b5 = (byte) (-bArr2[26]);
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            b(b5, bArr2[12], b5, objArr32);
            j = cls10.getField((java.lang.String) objArr32[0]).getLong(null);
            if (j != -1) {
            }
            int i372 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int identityHashCode22 = java.lang.System.identityHashCode(setsoundeffectsenabled);
            int i382 = (i372 * 141) - 3753;
            int i392 = ~i372;
            int i402 = (i392 ^ 27) | (i392 & 27);
            int i412 = ~i402;
            int i422 = (i402 | i412) & i412;
            int i432 = i392 & identityHashCode22;
            int i442 = (i392 ^ identityHashCode22) | i432;
            int i452 = ~i442;
            int i462 = (i442 | i452) & i452;
            int i472 = -(-(((i422 ^ i462) | (i462 & i422)) * (-280)));
            int i482 = ((i382 ^ i472) | (i382 & i472)) << 1;
            int i492 = -((i382 & (~i472)) | ((~i382) & i472));
            int i502 = ((i482 | i492) << 1) - (i492 ^ i482);
            int i512 = ~identityHashCode22;
            int i522 = ~i392;
            int i532 = (i392 & i512) | (i522 & identityHashCode22);
            int i542 = ~((i532 & i432) | (i432 ^ i532));
            int i552 = identityHashCode22 ^ (-28);
            int i562 = identityHashCode22 & (-28);
            int i572 = (i552 ^ i562) | (i552 & i562);
            int i582 = ~i572;
            int i592 = i582 & (i572 | i582);
            int i602 = i542 & i592;
            int i612 = (i592 | i542) & (~i602);
            int i622 = -(-(((i612 ^ i602) | (i612 & i602)) * 140));
            int i632 = i502 ^ i622;
            int i642 = (((i622 & i502) | i632) << 1) - i632;
            int i652 = (i392 ^ (-28)) | (i392 & (-28));
            int i662 = (i652 & i512) | ((~i652) & identityHashCode22);
            int i672 = i652 & identityHashCode22;
            int i682 = (i672 ^ i662) | (i672 & i662);
            int i692 = ~i682;
            int i702 = (i682 | i692) & i692;
            int i712 = (identityHashCode22 | i512) & i512;
            int i722 = (i712 & i522) | (i392 & (~i712)) | (i712 & i392);
            int i732 = ~(((~i722) & 27) | (i722 & (-28)) | (i722 & 27));
            int i742 = i702 & i732;
            int i752 = (i732 | i702) & (~i742);
            int i762 = (i752 ^ i742) | (i752 & i742);
            int i772 = ~(i372 | i512 | (-28));
            int i782 = i762 ^ i772;
            int i792 = i772 & i762;
            int i802 = -(-(((i792 ^ i782) | (i792 & i782)) * 140));
            int i812 = i642 & i802;
            int i822 = (i642 | i802) & (~i812);
            int i832 = -(-(i812 << 1));
            java.lang.Object[] objArr82 = new java.lang.Object[1];
            c(new int[]{449501488, -282714756, 1255509480, 851119833, -1045364736, -346236798, -1381080812, -53184756, -1874401862, 1997176781, -464290979, -1596967350, 89988285, -155473804}, ((i822 | i832) << 1) - (i822 ^ i832), objArr82);
            java.lang.Class<?> cls42 = java.lang.Class.forName((java.lang.String) objArr82[0]);
            int i842 = -android.graphics.Color.green(0);
            int i852 = i842 ^ 18;
            int i862 = (i842 & 18) << 1;
            java.lang.Object[] objArr92 = new java.lang.Object[1];
            c(new int[]{-242600661, -1885398127, -1467569149, -1299216793, -1715404244, 462609902, 409492874, -808757429, 1761990099, -793936588}, (i852 & i862) + (i862 | i852), objArr92);
            context = (android.content.Context) cls42.getMethod((java.lang.String) objArr92[0], new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
            }
            int i892 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            int i902 = i892 & 16;
            java.lang.Object[] objArr102 = new java.lang.Object[1];
            c(new int[]{-451529536, -1633076821, 490292147, 1637149333, 1867551616, 1862169975, 775620587, -264725912}, (((i892 ^ 16) | i902) << 1) - ((i892 | 16) & (~i902)), objArr102);
            java.lang.Class<?> cls52 = java.lang.Class.forName((java.lang.String) objArr102[0]);
            int indexOf2 = android.text.TextUtils.indexOf("", "", 0, 0);
            int i912 = indexOf2 & 16;
            java.lang.Object[] objArr112 = new java.lang.Object[1];
            c(new int[]{1070191642, -590703193, 1302958063, 1029298291, -929749678, 2916963, 381460094, -1166814683}, (((indexOf2 ^ 16) | i912) << 1) - ((~i912) & (indexOf2 | 16)), objArr112);
            java.lang.Object[] objArr122 = {context, java.lang.Integer.valueOf(((java.lang.Integer) cls52.getMethod((java.lang.String) objArr112[0], java.lang.Object.class).invoke(null, setsoundeffectsenabled)).intValue()), 0, 874672635};
            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1963823933);
            if (obj == null) {
            }
            objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr122);
            if (context != null) {
            }
            if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
            }
            int i3422 = writeReplace;
            int i3522 = i3422 & 29;
            int i3622 = (i3422 ^ 29) | i3522;
            DigitizedCardProfile = (((i3522 | i3622) << 1) - (i3622 ^ i3522)) % 128;
            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.Throwable.class).newInstance(e));
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        DigitizedCardProfile = 0;
        writeReplace = 1;
        AlternateContactlessPaymentDataJson = new int[]{955119365, -2060168765, -502586890, 1346800336, -1687415890, 540161606, 10805311, -1233300278, 625024216, 1268793108, 300828988, -2041714569, -1842516427, 1747405569, 846169267, 1463960766, 1375545857, -1175996285};
    }

    final void DigitizedCardProfile(com.payair.hce.setZ setz) {
        DigitizedCardProfile(new java.lang.Object[]{this, setz}, -1781100477, 1781100483, java.lang.System.identityHashCode(this));
    }

    final void AlternateContactlessPaymentDataJson(com.payair.hce.setZ... setzArr) {
        DigitizedCardProfile(new java.lang.Object[]{this, setzArr}, -1513871850, 1513871853, java.lang.System.identityHashCode(this));
    }

    final java.util.List<com.payair.hce.setZ> AlternateContactlessPaymentDataJson() {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{this}, -1392515677, 1392515685, java.lang.System.identityHashCode(this));
    }

    final void writeReplace(com.payair.hce.setPointerIcon setpointericon) {
        DigitizedCardProfile(new java.lang.Object[]{this, setpointericon}, 1341743887, -1341743886, java.lang.System.identityHashCode(this));
    }

    final void valueOf(com.payair.hce.setPointerIcon... setpointericonArr) {
        DigitizedCardProfile(new java.lang.Object[]{this, setpointericonArr}, 646732337, -646732333, java.lang.System.identityHashCode(this));
    }

    final java.util.List<com.payair.hce.setPointerIcon> values() {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{this}, -1003984198, 1003984205, java.lang.System.identityHashCode(this));
    }

    static void init$2() {
        $$g = new byte[]{120, 91, -87, 14};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE;
    }

    private com.payair.hce.TemporaryDataDao valueOf() {
        return (com.payair.hce.TemporaryDataDao) DigitizedCardProfile(new java.lang.Object[]{this}, -1958271237, 1958271237, java.lang.System.identityHashCode(this));
    }

    private com.payair.hce.PayairUserDataDao DigitizedCardProfile() {
        return (com.payair.hce.PayairUserDataDao) DigitizedCardProfile(new java.lang.Object[]{this}, -1578315683, 1578315685, java.lang.System.identityHashCode(this));
    }

    static void init$1() {
        $$d = new byte[]{125, com.google.common.base.Ascii.SI, -77, -54, -5, -9, com.google.common.base.Ascii.VT, -15, -19, 19, com.google.common.base.Ascii.VT, -4, -11, 2, 2};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -31, 80, -73, com.google.common.base.Ascii.ETB, -9, -7, 18, com.google.common.base.Ascii.CAN, -21, -35, 4, 0, -9, 13, -15, com.google.common.base.Ascii.ETB, 3, 35, -28, -15, 16, com.google.common.base.Ascii.SYN, -32, 5, com.google.common.base.Ascii.VT, -1, -1, 9};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
    }

    private void writeReplace() {
        DigitizedCardProfile(new java.lang.Object[]{this}, -1256923521, 1256923526, java.lang.System.identityHashCode(this));
    }
}
