package util.h.xy.by;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static final /* synthetic */ util.h.xy.by.ma[] getHighSpeedVideoSizesFor;
    private static short[] getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 0;
    private static final java.lang.String getOutputFormats;
    private static byte[] getOutputMinFrameDuration = null;
    private static int getOutputSizes = 1;
    private static int getOutputStallDurationlomOqCM;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.by.ma f1067;
    private android.content.Context isOutputSupportedForhNQ4ISI;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.ac.a f1068;
    private final java.util.concurrent.locks.Lock unwrapAs = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock isOutputSupportedFor = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getOutputSizeshNQ4ISI = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getOutputStallDuration = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getValidOutputFormatsForInputhNQ4ISI = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock toString = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getOutputMinFrameDurationlomOqCM = new java.util.concurrent.locks.ReentrantLock();

    private ma(java.lang.String str) {
    }

    public static util.h.xy.by.ma valueOf(java.lang.String str) {
        int i = getInputSizeshNQ4ISI + 103;
        getOutputSizes = i % 128;
        util.h.xy.by.ma maVar = (util.h.xy.by.ma) java.lang.Enum.valueOf(util.h.xy.by.ma.class, str);
        if (i % 2 == 0) {
            throw null;
        }
        getOutputSizes = (getInputSizeshNQ4ISI + 115) % 128;
        return maVar;
    }

    public static util.h.xy.by.ma[] values() {
        int i = getInputSizeshNQ4ISI + 109;
        getOutputSizes = i % 128;
        util.h.xy.by.ma[] maVarArr = getHighSpeedVideoSizesFor;
        if (i % 2 != 0) {
            return (util.h.xy.by.ma[]) maVarArr.clone();
        }
        throw null;
    }

    static {
        util.h.xy.by.ma[] maVarArr;
        getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 57480, (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (111 - android.view.Gravity.getAbsoluteGravity(0, 0)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 13, (-635349639) - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
        util.h.xy.by.ma maVar = new util.h.xy.by.ma(((java.lang.String) objArr[0]).intern());
        f1067 = maVar;
        int i = getOutputSizes + 87;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            maVarArr = new util.h.xy.by.ma[0];
            maVarArr[1] = maVar;
        } else {
            maVarArr = new util.h.xy.by.ma[]{maVar};
        }
        getHighSpeedVideoSizesFor = maVarArr;
        getOutputFormats = util.h.xy.by.ma.class.getName();
        int i2 = getOutputSizes + 1;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25804(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            if (util.h.xy.ag.a.m24556().m24558() == null) {
                int i = getOutputSizes + 53;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    throw new java.lang.NullPointerException();
                }
                if (context == null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\b\u0002\u0004\ufff2\u0013\u000e\u0011\u0000\u0006\u0004\uffbf\u0005\u0000\b\u000b\u0004\u0003\uffd9\uffbf\r\u0014\u000b\u000b\uffbf\f￢\u000e\r\u0013\u0004\u0017\u0013ￍ￨\r\b\u0013\b\u0000\u000b\b\u0019\u0004\uffbf\u000f\u0011\u000e\u0015\ufff2\u0004\u0011\u0015", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 52, 33 - android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, false, objArr);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern());
                }
                util.h.xy.ag.a.m24556().m24559(context);
                this.isOutputSupportedForhNQ4ISI = context;
            } else {
                this.isOutputSupportedForhNQ4ISI = util.h.xy.ag.a.m24556().m24558();
            }
            if (util.h.xy.by.mb.f1069.m25820()) {
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f716);
            }
            if (util.h.xy.by.a.f1065.m25792()) {
                getOutputSizes = (getInputSizeshNQ4ISI + 95) % 128;
                try {
                    m25799();
                    util.h.xy.by.ra.f1070.m25823(this.isOutputSupportedForhNQ4ISI);
                    util.h.xy.ac.d.m24541(util.h.xy.by.ra.f1070.f1071, f1067.f1068);
                    util.h.xy.by.a.f1065.m25791();
                    getOutputSizes = (getInputSizeshNQ4ISI + 37) % 128;
                } catch (util.h.xy.ac.mc e) {
                    e = e;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\u0003\b\u0003ﾺ\uffff\u0001\ufffb\f\t\u000e\rﾺ\u0001\b\u0003\b\t\u0003\r\u0003\u0010\t\f￪\b\t\u0003\u000e\n\uffff�\u0012\uffffﾺ\b\t\u0003\u000e\ufffb\u0014\u0003\u0006\ufffb\u000e", 44 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 25, 220 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), true, objArr2);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr2[0]).intern(), e);
                } catch (util.h.xy.da.b e2) {
                    e = e2;
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\u0003\b\u0003ﾺ\uffff\u0001\ufffb\f\t\u000e\rﾺ\u0001\b\u0003\b\t\u0003\r\u0003\u0010\t\f￪\b\t\u0003\u000e\n\uffff�\u0012\uffffﾺ\b\t\u0003\u000e\ufffb\u0014\u0003\u0006\ufffb\u000e", 44 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 25, 220 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), true, objArr22);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr22[0]).intern(), e);
                }
            }
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getHighSpeedVideoFpsRanges ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 51) % 128;
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            int i5 = getHighSpeedVideoFpsRangesFor + 73;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            int i6 = i5 % 2;
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25809(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Object obj;
        try {
            this.isOutputSupportedFor.lock();
            if (z) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0005\ufff5\u0004\u0002", 16777220 + android.graphics.Color.rgb(0, 0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2, 231 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), false, objArr);
                obj = objArr[0];
            } else {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\u000b\u0004\ufff9\ufffe�", android.view.View.combineMeasuredStates(0, 0) + 5, 4 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), 223 - android.view.View.getDefaultSize(0, 0), true, objArr2);
                    obj = objArr2[0];
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            java.lang.String intern = ((java.lang.String) obj).intern();
            byte[] m27422 = util.h.xy.t.mb.f2417.m27422();
            util.h.xy.by.ma maVar = f1067;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes((-397664394) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 139), (-12) - android.text.TextUtils.getTrimmedLength(""), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 635349606, objArr3);
            byte[] m25817 = maVar.m25817(((java.lang.String) objArr3[0]).intern());
            if (util.h.xy.ar.b.m25068(m27422) && !util.h.xy.ar.b.m25068(m25817)) {
                int i = getInputSizeshNQ4ISI + 95;
                getOutputSizes = i % 128;
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(i % 2 == 0 ? (-397664394) % android.graphics.Color.green(0) : (-397664394) - android.graphics.Color.green(0), (short) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (byte) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 91), android.view.View.resolveSize(0, 0) - 12, (-635349606) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
                    maVar.getHighSpeedVideoSizes(((java.lang.String) objArr4[0]).intern());
                    int i2 = getOutputSizes + 81;
                    getInputSizeshNQ4ISI = i2 % 128;
                    int i3 = i2 % 2;
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            util.h.xy.t.mb.f2417.m27464(intern.getBytes());
            this.isOutputSupportedFor.unlock();
            int i4 = getOutputSizes + 93;
            getInputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 4;
            }
        } catch (java.lang.Throwable th3) {
            this.isOutputSupportedFor.unlock();
            throw th3;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m25806() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        this.isOutputSupportedFor.lock();
        try {
            byte[] m27422 = util.h.xy.t.mb.f2417.m27422();
            boolean z = false;
            if (util.h.xy.ar.b.m25068(m27422)) {
                getInputSizeshNQ4ISI = (getOutputSizes + 21) % 128;
                util.h.xy.by.ma maVar = f1067;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 397664395, (short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 92), android.widget.ExpandableListView.getPackedPositionType(0L) - 12, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 635349606, objArr);
                byte[] m25817 = maVar.m25817(((java.lang.String) objArr[0]).intern());
                if (!util.h.xy.ar.b.m25068(m25817)) {
                    util.h.xy.t.mb.f2417.m27464(m25817);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((-397664394) - android.text.TextUtils.indexOf("", ""), (short) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (android.widget.ExpandableListView.getPackedPositionChild(0L) - 90), (-13) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (-635349607) - android.graphics.Color.blue(0), objArr2);
                    maVar.getHighSpeedVideoSizes(((java.lang.String) objArr2[0]).intern());
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\u0005\ufff5\u0004\u0002", 3 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, false, objArr3);
                        z = ((java.lang.String) objArr3[0]).intern().equalsIgnoreCase(new java.lang.String(m25817));
                        getOutputSizes = (getInputSizeshNQ4ISI + 71) % 128;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            } else {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0005\ufff5\u0004\u0002", 4 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.graphics.Color.rgb(0, 0, 0) + 16777218, 231 - android.graphics.Color.blue(0), false, objArr4);
                z = ((java.lang.String) objArr4[0]).intern().equalsIgnoreCase(new java.lang.String(m27422));
            }
            this.isOutputSupportedFor.unlock();
            getInputSizeshNQ4ISI = (getOutputSizes + 41) % 128;
            return z;
        } catch (java.lang.Throwable th2) {
            this.isOutputSupportedFor.unlock();
            throw th2;
        }
    }

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int length;
        byte[] bArr;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L)));
        if (i6 == -1) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 45) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr2 = getOutputMinFrameDuration;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr3[i7] = (byte) (bArr2[i7] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            if (bArr2 != null) {
                int i8 = getHighResolutionOutputSizeshNQ4ISI + 111;
                getHighSpeedVideoFpsRangesFor = i8 % 128;
                i6 = (byte) (i8 % 2 != 0 ? ((byte) (getOutputMinFrameDuration[i << ((int) (getHighSpeedVideoSizes * (-2689713159175858216L)))] | (-2689713159175858216L))) >> ((int) (Camera2StreamConfigurationMap / (-2689713159175858216L))) : ((byte) (getOutputMinFrameDuration[((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            } else {
                i6 = (short) (((short) (getInputFormats[((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            }
        }
        if (i6 > 0) {
            int i9 = (int) (getHighSpeedVideoSizes ^ (-2689713159175858216L));
            if (z) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 53) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i6) - 2) + i9 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getOutputMinFrameDuration;
            if (bArr4 != null) {
                int i10 = getHighSpeedVideoFpsRangesFor + 99;
                getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
                if (i10 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    bArr[i5] = (byte) (bArr4[i5] ^ (-2689713159175858216L));
                    i5++;
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
                }
                bArr4 = bArr;
            }
            boolean z2 = bArr4 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    byte[] bArr5 = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getInputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25811(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputSizes = (getInputSizeshNQ4ISI + 107) % 128;
        try {
            this.getOutputSizeshNQ4ISI.lock();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u000b\u0006\u0002￼\u0005\ufffe\ufffa\u0004\ufff6", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 9, 5 - android.graphics.Color.red(0), 224 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), false, objArr);
            m25808(((java.lang.String) objArr[0]).intern(), str.getBytes());
            this.getOutputSizeshNQ4ISI.unlock();
            getOutputSizes = (getInputSizeshNQ4ISI + 39) % 128;
        } catch (java.lang.Throwable th) {
            this.getOutputSizeshNQ4ISI.unlock();
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.lang.String m25815() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputSizes = (getInputSizeshNQ4ISI + 79) % 128;
        try {
            this.getOutputSizeshNQ4ISI.lock();
            util.h.xy.by.ma maVar = f1067;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u000b\u0006\u0002￼\u0005\ufffe\ufffa\u0004\ufff6", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 9, 4 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 224 - android.text.TextUtils.indexOf("", "", 0, 0), false, objArr);
            byte[] m25817 = maVar.m25817(((java.lang.String) objArr[0]).intern());
            java.lang.String str = !util.h.xy.ar.b.m25068(m25817) ? new java.lang.String(m25817) : null;
            this.getOutputSizeshNQ4ISI.unlock();
            getOutputSizes = (getInputSizeshNQ4ISI + 61) % 128;
            return str;
        } catch (java.lang.Throwable th) {
            this.getOutputSizeshNQ4ISI.unlock();
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25802() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputSizes + 7) % 128;
        try {
            this.getOutputSizeshNQ4ISI.lock();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u000b\u0006\u0002￼\u0005\ufffe\ufffa\u0004\ufff6", 9 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '+', 224 - android.graphics.Color.alpha(0), false, objArr);
            getHighSpeedVideoSizes(((java.lang.String) objArr[0]).intern());
            this.getOutputSizeshNQ4ISI.unlock();
            int i = getOutputSizes + 93;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        } catch (java.lang.Throwable th) {
            this.getOutputSizeshNQ4ISI.unlock();
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25810(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        try {
            this.unwrapAs.lock();
            int rgb = android.graphics.Color.rgb(0, 0, 0);
            short maximumDrawingCacheSize = (short) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte size = (byte) (31 - android.view.View.MeasureSpec.getSize(0));
            getOutputSizes = (getInputSizeshNQ4ISI + 17) % 128;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes((-414441601) - rgb, maximumDrawingCacheSize, size, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) - 8, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 635349615, objArr);
                m25808(((java.lang.String) objArr[0]).intern(), bArr);
                this.unwrapAs.unlock();
                getInputSizeshNQ4ISI = (getOutputSizes + 91) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (java.lang.Throwable th2) {
            this.unwrapAs.unlock();
            throw th2;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m25813() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputSizes = (getInputSizeshNQ4ISI + 125) % 128;
        try {
            this.unwrapAs.lock();
            util.h.xy.by.ma maVar = f1067;
            int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((-397664385) - deadChar, (short) (android.view.ViewConfiguration.getTapTimeout() >> 16), (byte) (31 - android.view.Gravity.getAbsoluteGravity(0, 0)), (-9) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (-635349616) - android.view.MotionEvent.axisFromString(""), objArr);
            byte[] m25817 = maVar.m25817(((java.lang.String) objArr[0]).intern());
            this.unwrapAs.unlock();
            int i = getOutputSizes + 5;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return m25817;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            this.unwrapAs.unlock();
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25807() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputSizes = (getInputSizeshNQ4ISI + 21) % 128;
        try {
            this.unwrapAs.lock();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((-397664385) - android.view.KeyEvent.getDeadChar(0, 0), (short) android.view.KeyEvent.normalizeMetaState(0), (byte) (31 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 8, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 635349615, objArr);
            getHighSpeedVideoSizes(((java.lang.String) objArr[0]).intern());
            this.unwrapAs.unlock();
            getInputSizeshNQ4ISI = (getOutputSizes + 49) % 128;
        } catch (java.lang.Throwable th) {
            this.unwrapAs.unlock();
            throw th;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25812(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputSizes + 75) % 128;
        try {
            this.getOutputMinFrameDurationlomOqCM.lock();
            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((longPressTimeout >> 16) - 397664372, (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) ((-89) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-13) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-635349603) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            m25808(((java.lang.String) objArr[0]).intern(), bArr);
            this.getOutputMinFrameDurationlomOqCM.unlock();
            int i = (getOutputSizes + 61) % 128;
            getInputSizeshNQ4ISI = i;
            getOutputSizes = (i + 33) % 128;
        } catch (java.lang.Throwable th) {
            this.getOutputMinFrameDurationlomOqCM.unlock();
            throw th;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final byte[] m25796() {
        getOutputSizes = (getInputSizeshNQ4ISI + 111) % 128;
        try {
            this.getOutputMinFrameDurationlomOqCM.lock();
            util.h.xy.by.ma maVar = f1067;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 397664372, (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), (byte) ((-88) - android.text.TextUtils.indexOf("", "")), (-14) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (-635349603) - android.text.TextUtils.getOffsetBefore("", 0), objArr);
                byte[] m25817 = maVar.m25817(((java.lang.String) objArr[0]).intern());
                this.getOutputMinFrameDurationlomOqCM.unlock();
                return m25817;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            this.getOutputMinFrameDurationlomOqCM.unlock();
            getInputSizeshNQ4ISI = (getOutputSizes + 99) % 128;
            return new byte[0];
        } catch (java.lang.Throwable th2) {
            this.getOutputMinFrameDurationlomOqCM.unlock();
            throw th2;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m25795() {
        getOutputSizes = (getInputSizeshNQ4ISI + 115) % 128;
        try {
            this.getOutputMinFrameDurationlomOqCM.lock();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((-397664373) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) android.graphics.drawable.Drawable.resolveOpacity(0, 0), (byte) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 89), (-13) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (-635349603) - android.graphics.Color.alpha(0), objArr);
            getHighSpeedVideoSizes(((java.lang.String) objArr[0]).intern());
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
        } catch (java.lang.Throwable th) {
            this.getOutputMinFrameDurationlomOqCM.unlock();
            throw th;
        }
        this.getOutputMinFrameDurationlomOqCM.unlock();
        int i = getInputSizeshNQ4ISI + 97;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25805(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputSizes + 125) % 128;
        try {
            this.getValidOutputFormatsForInputhNQ4ISI.lock();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0003\u0004\ufff8\ufff9\ufffe\ufff4\u0003\u0004\ufffe\t\ufff6\b\u0007\ufffa\u000b", 15 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 3 - android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 227, true, objArr);
            m25808(((java.lang.String) objArr[0]).intern(), bArr);
            this.getValidOutputFormatsForInputhNQ4ISI.unlock();
            int i = getInputSizeshNQ4ISI + 81;
            getOutputSizes = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        } catch (java.lang.Throwable th) {
            this.getValidOutputFormatsForInputhNQ4ISI.unlock();
            throw th;
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final byte[] m25814() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        try {
            this.getValidOutputFormatsForInputhNQ4ISI.lock();
            util.h.xy.by.ma maVar = f1067;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0003\u0004\ufff8\ufff9\ufffe\ufff4\u0003\u0004\ufffe\t\ufff6\b\u0007\ufffa\u000b", 15 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 3 - android.view.View.MeasureSpec.getMode(0), android.text.TextUtils.getOffsetAfter("", 0) + 226, true, objArr);
            byte[] m25817 = maVar.m25817(((java.lang.String) objArr[0]).intern());
            this.getValidOutputFormatsForInputhNQ4ISI.unlock();
            int i = getOutputSizes;
            getInputSizeshNQ4ISI = (i + 35) % 128;
            getInputSizeshNQ4ISI = (i + 13) % 128;
            return m25817;
        } catch (java.lang.Throwable th) {
            this.getValidOutputFormatsForInputhNQ4ISI.unlock();
            throw th;
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m25818() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputSizes = (getInputSizeshNQ4ISI + 27) % 128;
        try {
            this.getValidOutputFormatsForInputhNQ4ISI.lock();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0003\u0004\ufff8\ufff9\ufffe\ufff4\u0003\u0004\ufffe\t\ufff6\b\u0007\ufffa\u000b", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 4, 226 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), true, objArr);
            getHighSpeedVideoSizes(((java.lang.String) objArr[0]).intern());
            this.getValidOutputFormatsForInputhNQ4ISI.unlock();
            getOutputSizes = (getInputSizeshNQ4ISI + 103) % 128;
        } catch (java.lang.Throwable th) {
            this.getValidOutputFormatsForInputhNQ4ISI.unlock();
            throw th;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m25798() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputSizes = (getInputSizeshNQ4ISI + 93) % 128;
        try {
            this.toString.lock();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0003\u000b\u0004\ufff5\ufffb\ufff9\u0004\ufffb\u000b\u0007\ufffb\t\b\ufffb\ufff8", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 16, android.view.View.MeasureSpec.getSize(0) + 12, 225 - android.text.TextUtils.getOffsetAfter("", 0), true, objArr);
            getHighSpeedVideoSizes(((java.lang.String) objArr[0]).intern());
            this.toString.unlock();
            getInputSizeshNQ4ISI = (getOutputSizes + 89) % 128;
        } catch (java.lang.Throwable th) {
            this.toString.unlock();
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25803(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputSizes + 119) % 128;
        try {
            this.toString.lock();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0003\u000b\u0004\ufff5\ufffb\ufff9\u0004\ufffb\u000b\u0007\ufffb\t\b\ufffb\ufff8", 16 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '$', 225 - android.view.View.MeasureSpec.getSize(0), true, objArr);
            m25808(((java.lang.String) objArr[0]).intern(), bArr);
            this.toString.unlock();
            getInputSizeshNQ4ISI = (getOutputSizes + 57) % 128;
        } catch (java.lang.Throwable th) {
            this.toString.unlock();
            throw th;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final byte[] m25800() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputSizes + 35) % 128;
        try {
            this.toString.lock();
            util.h.xy.by.ma maVar = f1067;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0003\u000b\u0004\ufff5\ufffb\ufff9\u0004\ufffb\u000b\u0007\ufffb\t\b\ufffb\ufff8", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 15, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 225, true, objArr);
            byte[] m25817 = maVar.m25817(((java.lang.String) objArr[0]).intern());
            this.toString.unlock();
            int i = getOutputSizes;
            getInputSizeshNQ4ISI = (i + 15) % 128;
            int i2 = i + 47;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                return m25817;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            this.toString.unlock();
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25816(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputSizes = (getInputSizeshNQ4ISI + 33) % 128;
        try {
            this.getOutputSizeshNQ4ISI.lock();
            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((doubleTapTimeout >> 16) - 397664364, (short) (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 107), (-1) - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (-635349593) - android.text.TextUtils.indexOf("", "", 0), objArr);
            m25808(((java.lang.String) objArr[0]).intern(), bArr);
            this.getOutputSizeshNQ4ISI.unlock();
            int i = getInputSizeshNQ4ISI + 31;
            getOutputSizes = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        } catch (java.lang.Throwable th) {
            this.getOutputSizeshNQ4ISI.unlock();
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25808(java.lang.String str, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        m25799();
        try {
            this.f1068.m24537(str.getBytes(), bArr);
        } catch (util.h.xy.ac.mc e) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("�\u0012\uffffﾺ\uffff\f\t\u000e\rﾺ\uffff\u0001\ufffb\f\t\u000e\rﾺ\u0001\b\u0003\b\t\u0003\r\u0003\u0010\t\f￪\b\t\u0003\u000e\n\uffff", android.widget.ExpandableListView.getPackedPositionChild(0L) + 37, 30 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), 221 - android.graphics.Color.alpha(0), true, objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern(), e);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m25817(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputSizes + 19;
        getInputSizeshNQ4ISI = i % 128;
        byte[] bytes = str.getBytes();
        if (i % 2 == 0) {
            return m25797(bytes);
        }
        m25797(bytes);
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public final byte[] m25797(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 7;
        getOutputSizes = i % 128;
        try {
            if (i % 2 != 0) {
                m25799();
                byte[] m24538 = this.f1068.m24538(bArr);
                getInputSizeshNQ4ISI = (getOutputSizes + 83) % 128;
                return m24538;
            }
            m25799();
            this.f1068.m24538(bArr);
            throw null;
        } catch (util.h.xy.ac.mc e) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0000�\u0001\u000eﾼ\u0001\u0003�\u000e\u000b\u0010\u000fﾼ\u0003\n\u0005\n\u000b\u0005\u000f\u0005\u0012\u000b\u000e￬\n\u000b\u0005\u0010\f\u0001\uffff\u0014\u0001ﾼ", 35 - android.text.TextUtils.getTrimmedLength(""), 25 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 219 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, objArr);
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern(), e);
        }
    }

    private void getHighSpeedVideoSizes(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputSizes = (getInputSizeshNQ4ISI + 99) % 128;
        byte[] bytes = str.getBytes();
        int i = getInputSizeshNQ4ISI + 15;
        getOutputSizes = i % 128;
        int i2 = i % 2;
        m25799();
        if (i2 == 0) {
            this.f1068.m24539(bytes);
            throw new java.lang.ArithmeticException();
        }
        this.f1068.m24539(bytes);
        int i3 = getOutputSizes + 1;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m25801() {
        try {
            m25799();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
        }
        try {
            this.unwrapAs.lock();
            this.isOutputSupportedFor.lock();
            this.getOutputSizeshNQ4ISI.lock();
            this.getOutputStallDuration.lock();
            this.getValidOutputFormatsForInputhNQ4ISI.lock();
            this.toString.lock();
            this.getOutputMinFrameDurationlomOqCM.lock();
            util.h.xy.ac.a aVar = this.f1068;
            if (aVar != null) {
                getOutputSizes = (getInputSizeshNQ4ISI + 117) % 128;
                aVar.m24536();
                this.f1068 = null;
            }
            this.unwrapAs.unlock();
            this.isOutputSupportedFor.unlock();
            this.getOutputSizeshNQ4ISI.unlock();
            this.getOutputStallDuration.unlock();
            this.getValidOutputFormatsForInputhNQ4ISI.unlock();
            this.toString.unlock();
            this.getOutputMinFrameDurationlomOqCM.unlock();
            int i = getOutputSizes + 101;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        } catch (java.lang.Throwable th) {
            this.unwrapAs.unlock();
            this.isOutputSupportedFor.unlock();
            this.getOutputSizeshNQ4ISI.unlock();
            this.getOutputStallDuration.unlock();
            this.getValidOutputFormatsForInputhNQ4ISI.unlock();
            this.toString.unlock();
            this.getOutputMinFrameDurationlomOqCM.unlock();
            throw th;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final void m25799() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            if (this.f1068 == null) {
                getInputSizeshNQ4ISI = (getOutputSizes + 29) % 128;
                if (this.isOutputSupportedForhNQ4ISI == null) {
                    if (util.h.xy.ag.a.m24556().m24558() == null) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\u0012\ufff0\u0004\u0005\u0012\u0001\b\u0013\uffc0\u0005\u0003\t\u0016\u0012\u0005\ufff3\u0016\u000f\u0012\ufff0ￎ\u0014\u0018\u0005\u0014\u000e\u000f￣\r\uffc0\f\f\u0015\u000e\uffc0ￚ\u0004\u0005\f\t\u0001\u0006\uffc0\u0014\t\u000e\t\uffc0\u0005\u0003\u000e\u0005\u0012\u0005\u0006\u0005", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 56, android.text.TextUtils.indexOf("", "") + 20, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 215, true, objArr);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern());
                    }
                    getInputSizeshNQ4ISI = (getOutputSizes + 49) % 128;
                    this.isOutputSupportedForhNQ4ISI = util.h.xy.ag.a.m24556().m24558();
                    int i = getInputSizeshNQ4ISI + 51;
                    getOutputSizes = i % 128;
                    int i2 = i % 2;
                }
                byte[] m24548 = util.h.xy.ad.a.m24548(util.h.xy.z.mb.m27715());
                util.h.xy.al.rb.m25016(m24548);
                util.h.xy.ac.c cVar = new util.h.xy.ac.c(m24548);
                android.content.Context context = this.isOutputSupportedForhNQ4ISI;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ufff7\ufff6\ufff5\b\ufffb\r\t\u0007", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, 3 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 227 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), true, objArr2);
                this.f1068 = new util.h.xy.ac.a(context, ((java.lang.String) objArr2[0]).intern(), cVar);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\b\ufff9\ufffb\u0005", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, 194 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), false, objArr3);
                util.h.xy.am.ma.m25030(((java.lang.String) objArr3[0]).intern(), m24548);
                int i3 = getOutputSizes + 109;
                getInputSizeshNQ4ISI = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRanges = -1231763743;
        getHighSpeedVideoSizes = -267192494;
        Camera2StreamConfigurationMap = -408873010;
        getOutputStallDurationlomOqCM = -1031815928;
        getOutputMinFrameDuration = new byte[]{-126, -124, 125, Byte.MIN_VALUE, Byte.MIN_VALUE, 121, 84, -81, com.visa.cbp.getEncExpo.IResultReceiver, -58, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -21, 18, 56, -63, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -44, 44, -54, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -42, -59, 117, 105, -101, -119, 115, com.visa.cbp.getEncExpo.IResultReceiver, -125, 114, 77, -76, 68, -77, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 93, -91, 84, -90, 72, -66, 78, 72, 71, -95, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -77, -90, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 89, -75, 66, -70, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -74, -78, -78, -40, -40, -40, -40, -40};
    }
}
