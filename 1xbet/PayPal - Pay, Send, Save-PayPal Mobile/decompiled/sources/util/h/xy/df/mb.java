package util.h.xy.df;

/* loaded from: classes5.dex */
public class mb {
    static int Camera2StreamConfigurationMap = 0;
    static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static int getOutputMinFrameDuration;
    final java.util.Map<java.lang.String, java.util.List<byte[]>> getHighSpeedVideoFpsRangesFor;

    /* synthetic */ mb(util.h.xy.df.mb.a aVar, byte b) {
        this(aVar);
    }

    static {
        getHighSpeedVideoFpsRanges();
        getInputSizeshNQ4ISI = util.h.xy.df.mb.class.getName();
        int i = Camera2StreamConfigurationMap + 11;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private mb(util.h.xy.df.mb.a aVar) {
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableMap(util.h.xy.df.mb.a.getHighSpeedVideoFpsRangesFor(aVar));
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 13) % 128;
        char[] cArr = charArray;
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr2 = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = cArr[raVar.f2649];
            cArr2[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr2[i4] = (char) (cArr2[i4] - ((int) (getOutputMinFrameDuration ^ (-4839292868003314026L))));
            raVar.f2649++;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 45) % 128;
        }
        if (i2 > 0) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 53) % 128;
            raVar.f2648 = i2;
            char[] cArr3 = new char[i];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr3, raVar.f2648, cArr2, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr4 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr4[raVar.f2649] = cArr2[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    static byte[] Camera2StreamConfigurationMap(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        util.h.xy.eh.mc mcVar = new util.h.xy.eh.mc();
        mcVar.mo26562(bArr, 0, bArr.length);
        mcVar.mo26563(bArr2, 0);
        int i = Camera2StreamConfigurationMap + 113;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x023c A[EDGE_INSN: B:21:0x023c->B:17:0x023c BREAK  A[LOOP:0: B:11:0x021d->B:20:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        java.util.Iterator it;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = false;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\uffff\uffff\u0003", 2 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2 - android.view.View.combineMeasuredStates(0, 0), 180 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, objArr);
        try {
            if (str2.startsWith(((java.lang.String) objArr[0]).intern())) {
                java.lang.String substring = str2.substring(3);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u0000\u0002\uffff\u0001\ufffe￭ ￮￫\u001f\ufff1￬￬￭&1\u0000￫\u001f￭\u001f\ufff1￬￫\u001e!�\uffef￮", android.widget.ExpandableListView.getPackedPositionType(0L) + 29, 14 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), 197 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), false, objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(substring.toLowerCase());
                arrayList.add(sb.toString());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("￭￪\u001e\ufff0￫￫￭%0\uffff￪\u001d ￼￮￭\uffff\u0001\ufffe\u0000�￬\u001f", 23 - makeMeasureSpec, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 7, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 199, false, objArr3);
                sb2.append(((java.lang.String) objArr3[0]).intern());
                sb2.append(substring.toLowerCase());
                arrayList.add(sb2.toString());
            } else {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\ufffe\u0002", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2, 2 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.View.resolveSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, false, objArr4);
                if (str2.startsWith(((java.lang.String) objArr4[0]).intern())) {
                    java.lang.String substring2 = str2.substring(2);
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("￫￫\ufff0\u001e￪￭\u001f￬\ufff0�\u0000\ufffe\u0001\uffff￭￮￼ \u001d￪\uffff0%", android.view.View.resolveSizeAndState(0, 0, 0) + 23, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22, 198 - android.text.TextUtils.getOffsetAfter("", 0), true, objArr5);
                    sb3.append(((java.lang.String) objArr5[0]).intern());
                    sb3.append(substring2.toLowerCase());
                    arrayList.add(sb3.toString());
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\u001e￤￩\u0017￥\u0017￣\ufff8)", 9 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 206 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), true, objArr6);
                    sb4.append(((java.lang.String) objArr6[0]).intern());
                    sb4.append(substring2.toLowerCase());
                    arrayList.add(sb4.toString());
                } else {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\t￣\u0014", android.graphics.Color.alpha(0) + 3, 1 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.graphics.Color.blue(0) + 226, true, objArr7);
                    sb5.append(((java.lang.String) objArr7[0]).intern());
                    sb5.append(str2.toLowerCase());
                    arrayList.add(sb5.toString());
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
                    it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (java.util.regex.Pattern.compile((java.lang.String) it.next()).matcher(str.toLowerCase()).find()) {
                            z = true;
                            break;
                        }
                    }
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 69) % 128;
                    return z;
                }
            }
            it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 69) % 128;
            return z;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final class a {
        private static int Camera2StreamConfigurationMap = 1;
        private static char getHighResolutionOutputSizeshNQ4ISI = 37074;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static char getHighSpeedVideoSizes = 8731;
        private static char getHighSpeedVideoSizesFor = 3941;
        private static int getOutputFormats = 1;
        private static char getOutputMinFrameDuration = 45397;
        private final java.util.Map<java.lang.String, java.util.List<byte[]>> getInputFormats = new java.util.LinkedHashMap();

        static /* synthetic */ java.util.Map getHighSpeedVideoFpsRangesFor(util.h.xy.df.mb.a aVar) {
            int i = (getHighSpeedVideoFpsRangesFor + 27) % 128;
            getOutputFormats = i;
            java.util.Map<java.lang.String, java.util.List<byte[]>> map = aVar.getInputFormats;
            int i2 = i + 39;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                return map;
            }
            throw null;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final util.h.xy.df.mb.a m26275(java.lang.String str, java.util.List<byte[]> list) {
            if (str.length() > 0 && list.size() != 0) {
                this.getInputFormats.put(str, list);
                return this;
            }
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                int intValue = (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 13;
                int i = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = (i + 91) % 128;
                getHighSpeedVideoFpsRanges = (i + 103) % 128;
                char[] charArray = "増\udc04ﾶ⏦\ue542刱祰㜣増\udc04灌삩\udc34ꅓ".toCharArray();
                util.h.xz.b.e eVar = new util.h.xz.b.e();
                char[] cArr = new char[charArray.length];
                int i2 = 0;
                eVar.f2630 = 0;
                char[] cArr2 = new char[2];
                while (eVar.f2630 < charArray.length) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 33) % 128;
                    cArr2[i2] = charArray[eVar.f2630];
                    cArr2[1] = charArray[eVar.f2630 + 1];
                    int i3 = 58224;
                    int i4 = i2;
                    while (i4 < 16) {
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 67) % 128;
                        char c = cArr2[1];
                        char c2 = cArr2[i2];
                        char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighSpeedVideoSizes ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                        cArr2[1] = c3;
                        cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                        i3 -= 40503;
                        i4++;
                        i2 = 0;
                    }
                    int i5 = i2;
                    cArr[eVar.f2630] = cArr2[i5];
                    cArr[eVar.f2630 + 1] = cArr2[1];
                    eVar.f2630 += 2;
                    i2 = i5;
                }
                int i6 = i2;
                objArr[i6] = new java.lang.String(cArr, i6, intValue);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[i6]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final util.h.xy.df.mb m26274() {
            util.h.xy.df.mb mbVar = new util.h.xy.df.mb(this, (byte) 0);
            int i = getHighSpeedVideoFpsRangesFor + 49;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                return mbVar;
            }
            throw null;
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputMinFrameDuration = -1231763938;
    }
}
