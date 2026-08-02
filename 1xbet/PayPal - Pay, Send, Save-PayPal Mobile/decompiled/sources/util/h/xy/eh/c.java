package util.h.xy.eh;

/* loaded from: classes5.dex */
public final class c extends util.h.xy.eh.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = -408872992;
    private static byte[] getHighSpeedVideoFpsRangesFor = {-109, -43, -98, 103, -109, 99, 115, -78, 97, 109, 81, 100, -114, -101, -105, 81, -52, 97, 107, 36, -34, -99, -109, com.visa.cbp.getEncExpo.IResultReceiver2, 97, -99, 98, com.visa.cbp.getEncExpo.registerForActivityResult, com.visa.cbp.getEncExpo.IResultReceiver2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -50, 103, 99, 44, 103, 111, 100, 104, -40, -40, -40};
    private static int getHighSpeedVideoSizes = 570294840;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static short[] getInputSizeshNQ4ISI = null;
    private static int getOutputMinFrameDuration = 146239718;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L)));
        boolean z2 = i5 == -1;
        if (z2) {
            byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i6 = 0; i6 < length2; i6++) {
                    bArr3[i6] = (byte) (bArr2[i6] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            if (bArr2 != null) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
                i5 = (byte) (((byte) (getHighSpeedVideoFpsRangesFor[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
            } else {
                i5 = (short) (((short) (getInputSizeshNQ4ISI[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
            }
        }
        if (i5 > 0) {
            int i7 = (int) (getOutputMinFrameDuration ^ (-2689713159175858216L));
            if (z2) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i5) - 2) + i7 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getHighSpeedVideoFpsRangesFor;
            if (bArr4 != null) {
                int i8 = Camera2StreamConfigurationMap + 115;
                getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                if (i8 % 2 != 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                }
                for (int i9 = 0; i9 < length; i9++) {
                    bArr[i9] = (byte) (bArr4[i9] ^ (-2689713159175858216L));
                }
                bArr4 = bArr;
            }
            if (bArr4 != null) {
                int i10 = Camera2StreamConfigurationMap + 33;
                getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
                if (i10 % 2 == 0) {
                    z = true;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i5) {
                        if (z) {
                            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 91) % 128;
                            byte[] bArr5 = getHighSpeedVideoFpsRangesFor;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        } else {
                            short[] sArr = getInputSizeshNQ4ISI;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        }
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        meVar.f2645++;
                    }
                }
            }
            z = false;
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
            }
        }
        objArr[0] = sb.toString();
    }

    @Override // util.h.xy.eh.mb, util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final int mo26563(byte[] bArr, int i) {
        getHighSpeedVideoSizesFor = (getInputFormats + 87) % 128;
        m26586(2, 2);
        int mo26563 = super.mo26563(bArr, i);
        getInputFormats = (getHighSpeedVideoSizesFor + 21) % 128;
        return mo26563;
    }

    @Override // util.h.xy.eh.mb, util.h.xy.ef.rd
    /* renamed from: ˎ */
    public final java.lang.String mo26561() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(283744484 - android.view.KeyEvent.getDeadChar(0, 0), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (byte) (android.text.TextUtils.indexOf("", "", 0, 0) + 69), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 51, android.view.KeyEvent.getDeadChar(0, 0) + 966847091, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.f2165);
        java.lang.String obj = sb.toString();
        getInputFormats = (getHighSpeedVideoSizesFor + 97) % 128;
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i) {
        super(i);
        int i2 = getHighSpeedVideoSizesFor;
        getInputFormats = (i2 + 111) % 128;
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            getInputFormats = (i2 + 99) % 128;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(283744450 - android.view.KeyEvent.normalizeMetaState(0), (short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) - 78), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 43, 966847048 + android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(i);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(283744461 - android.text.TextUtils.getTrimmedLength(""), (short) android.widget.ExpandableListView.getPackedPositionType(0L), (byte) (android.text.TextUtils.indexOf("", "", 0) - 70), (-33) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 966847039, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public c() {
        this(256);
    }
}
