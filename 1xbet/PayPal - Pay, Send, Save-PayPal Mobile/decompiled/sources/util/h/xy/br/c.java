package util.h.xy.br;

/* loaded from: classes18.dex */
public class c {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static boolean getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static long getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static boolean getInputFormats;
    private static char[] getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static char[] getOutputMinFrameDurationlomOqCM;
    private final java.util.List<util.h.xy.br.c.ra> getOutputSizeshNQ4ISI = new java.util.ArrayList(30);

    static {
        getHighSpeedVideoFpsRangesFor();
        getOutputFormats = "c";
        int i = getOutputMinFrameDuration + 3;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static final class ra {
        static int Camera2StreamConfigurationMap = 0;
        static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static char[] getHighSpeedVideoSizesFor = null;
        private static long getInputFormats = 0;
        private static int getInputSizeshNQ4ISI = 0;
        private static boolean getOutputFormats = false;
        private static int getOutputMinFrameDuration = 1;
        private static int getOutputMinFrameDurationlomOqCM;
        private static boolean getOutputSizeshNQ4ISI;
        double getHighSpeedVideoFpsRanges;
        double getHighSpeedVideoFpsRangesFor;
        double getHighSpeedVideoSizes;

        public final double getHighSpeedVideoFpsRanges() {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = (i + 49) % 128;
            double d = this.getHighSpeedVideoFpsRangesFor;
            double d2 = this.getHighSpeedVideoFpsRanges;
            double d3 = this.getHighSpeedVideoSizes;
            int i2 = i + 29;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                return d + d2 + d3;
            }
            throw new java.lang.ArithmeticException();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䑛\ua7e3草\ueea7쨍㙯ᇂ紲墊䓈ꁎ莯\uef19쭥㛙ሳ綊姦䕂ꂕ谞\ue861쯼㜠ኔ绬婞䖨ꄔ赵\ue8d5푥", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 58271, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䐵갈鐝ﳣ\ue4b1첉㕨ᴼ\u05f8淔喚빬\ua632蹙", 59441 - android.view.View.resolveSize(0, 0), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(this.getHighSpeedVideoFpsRanges);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䐵쯬寕\ueb0f笡譕᪵ꪯ㫐䨀\uda22橐廬৵", android.view.KeyEvent.keyCodeFromString("") + 36821, objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            java.lang.String obj = sb.toString();
            int i = Camera2StreamConfigurationMap + 41;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return obj;
            }
            throw null;
        }

        static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2;
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 41) % 128;
            char[] charArray = str.toCharArray();
            util.h.xz.b.d dVar = new util.h.xz.b.d();
            dVar.f2628 = i;
            int length = charArray.length;
            long[] jArr = new long[length];
            dVar.f2629 = 0;
            while (dVar.f2629 < charArray.length) {
                jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getInputFormats ^ (-7508379876853140581L));
                dVar.f2629++;
            }
            char[] cArr = new char[length];
            dVar.f2629 = 0;
            while (dVar.f2629 < charArray.length) {
                int i3 = getInputSizeshNQ4ISI + 79;
                getOutputMinFrameDuration = i3 % 128;
                if (i3 % 2 == 0) {
                    cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                    i2 = dVar.f2629;
                } else {
                    cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                    i2 = dVar.f2629 + 1;
                }
                dVar.f2629 = i2;
                getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 81) % 128;
            }
            java.lang.String str2 = new java.lang.String(cArr);
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 99) % 128;
            objArr[0] = str2;
        }

        static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
            byte[] bytes = str.getBytes("ISO-8859-1");
            util.h.xz.b.md mdVar = new util.h.xz.b.md();
            char[] cArr = getHighSpeedVideoSizesFor;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i2 = 0; i2 < length; i2++) {
                    cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
                }
                cArr = cArr2;
            }
            int i3 = (int) ((-3299939579226817547L) ^ getOutputMinFrameDurationlomOqCM);
            if (getOutputSizeshNQ4ISI) {
                mdVar.f2642 = bytes.length;
                char[] cArr3 = new char[mdVar.f2642];
                mdVar.f2643 = 0;
                while (mdVar.f2643 < mdVar.f2642) {
                    cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                    mdVar.f2643++;
                }
                objArr[0] = new java.lang.String(cArr3);
                return;
            }
            if (getOutputFormats) {
                throw null;
            }
            throw null;
        }

        static void Camera2StreamConfigurationMap() {
            getHighSpeedVideoSizesFor = new char[]{64244, 64251, 64241, 64231, 64250, 64252, 64315, 64230, 64279, 64224, 64249, 64280, 64276, 64283, 64256, 64275, 64278, 64257, 64263, 64272, 64282, 64273, 64281};
            getOutputMinFrameDurationlomOqCM = -1074857131;
            getOutputFormats = true;
            getOutputSizeshNQ4ISI = true;
        }

        static {
            Camera2StreamConfigurationMap();
            getInputFormats = -3066635780969039998L;
        }
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 11) % 128;
            jArr[rbVar.f2651] = (((char) (getOutputMinFrameDurationlomOqCM[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizes))) ^ c;
            rbVar.f2651++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 97) % 128;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String m25598() {
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - android.graphics.Color.green(0), "\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(str);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(android.view.View.MeasureSpec.getMode(0) + 127, "\u0087\u008e\u008c\u008d\u008c\u008b\u0087\u008a\u0089\u0081\u0088\u0087", objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(i);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes(-android.graphics.ImageFormat.getBitsPerPixel(0), (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.graphics.Color.argb(0, 0, 0, 0), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        java.lang.String obj = sb.toString();
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 45;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    static final class mb implements java.util.Comparator<util.h.xy.br.c.ra> {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoFpsRangesFor;

        private mb() {
        }

        /* synthetic */ mb(byte b) {
            this();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(util.h.xy.br.c.ra raVar, util.h.xy.br.c.ra raVar2) {
            int i = (Camera2StreamConfigurationMap + 23) % 128;
            getHighSpeedVideoFpsRangesFor = i;
            util.h.xy.br.c.ra raVar3 = raVar;
            util.h.xy.br.c.ra raVar4 = raVar2;
            int i2 = i + 39;
            Camera2StreamConfigurationMap = i2 % 128;
            int highSpeedVideoFpsRanges = (int) (i2 % 2 == 0 ? raVar3.getHighSpeedVideoFpsRanges() + raVar4.getHighSpeedVideoFpsRanges() : raVar3.getHighSpeedVideoFpsRanges() - raVar4.getHighSpeedVideoFpsRanges());
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 113) % 128;
            return highSpeedVideoFpsRanges;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m25599() {
        int packedPositionType;
        int i;
        int i2;
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 101;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 != 0) {
            packedPositionType = 65 >> android.widget.ExpandableListView.getPackedPositionType(1L);
            i = -android.view.MotionEvent.axisFromString("");
            i2 = 0;
        } else {
            packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L) + 10;
            i = -android.view.MotionEvent.axisFromString("");
            i2 = 1;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(packedPositionType, i, (char) (i2 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.view.View.combineMeasuredStates(0, 0), "\u0093\u0090\u0092\u0091\u0090\u008f", objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.graphics.Color.argb(0, 0, 0, 0), "\u0091\u0093\u0094\u0084\u0090", objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern().substring(1));
            sb.append(intern);
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes(9 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 11 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10378), objArr4);
            sb2.append(java.lang.System.getProperty(((java.lang.String) objArr4[0]).intern()));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - (android.view.KeyEvent.getMaxKeyCode() >> 16), "\u009c\u009b\u009a\u0096\u0099\u0098\u0089\u0097\u0096\u0095\u0087", objArr5);
            sb2.append(((java.lang.String) objArr5[0]).intern());
            sb2.append(obj);
            java.lang.String obj2 = sb2.toString();
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 79;
            getOutputMinFrameDuration = i4 % 128;
            if (i4 % 2 == 0) {
                return obj2;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(android.content.Context context, java.util.List<util.h.xy.br.c.ra> list) {
        try {
            new java.io.File(context.getFilesDir(), util.h.xy.br.a.f1029).createNewFile();
            getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
            int i = 0;
            while (i < list.size()) {
                java.lang.String str = util.h.xy.br.a.f1029;
                util.h.xy.br.c.ra raVar = list.get(i);
                java.lang.Object[] objArr = new java.lang.Object[1];
                util.h.xy.br.c.ra.getHighResolutionOutputSizeshNQ4ISI("䐵", android.view.View.combineMeasuredStates(0, 0) + 55001, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                util.h.xy.br.c.ra.getHighSpeedVideoFpsRangesFor(127 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), "\u0083\u008b\u0086\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                util.h.xy.br.c.ra.getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.getDeadChar(0, 0) + 127, "\u0093\u0094\u0093\u008f\u0092\u0091\u008d\u0090\u008f\u008e\u008d\u008c", objArr3);
                sb.append((java.lang.String) cls.getField((java.lang.String) objArr3[0]).get(null));
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                util.h.xy.br.c.ra.getHighResolutionOutputSizeshNQ4ISI("䑆", 45160 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr4);
                sb.append(((java.lang.String) objArr4[0]).intern());
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                util.h.xy.br.c.ra.getHighSpeedVideoFpsRangesFor(126 - android.view.MotionEvent.axisFromString(""), "\u0083\u008b\u0086\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                util.h.xy.br.c.ra.getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0097\u0094\u0096\u0095\u008c", objArr6);
                sb.append((java.lang.String) cls2.getField((java.lang.String) objArr6[0]).get(null));
                sb.append(intern);
                sb.append(m25598());
                sb.append(intern);
                sb.append(java.lang.Integer.valueOf(i).toString());
                sb.append(intern);
                sb.append(java.lang.Double.valueOf(raVar.getHighSpeedVideoFpsRangesFor).toString());
                sb.append(intern);
                sb.append(java.lang.Double.valueOf(raVar.getHighSpeedVideoFpsRanges).toString());
                sb.append(intern);
                sb.append(java.lang.Double.valueOf(raVar.getHighSpeedVideoSizes).toString());
                sb.append(intern);
                sb.append(java.lang.Double.valueOf(raVar.getHighSpeedVideoFpsRanges()).toString());
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                util.h.xy.br.c.ra.getHighResolutionOutputSizeshNQ4ISI("䐵੦\ud88b꼤絉쏢鈩", android.graphics.Color.alpha(0) + 20063, objArr7);
                sb.append(((java.lang.String) objArr7[0]).intern());
                java.lang.String obj = sb.toString();
                util.h.xy.br.c.ra.Camera2StreamConfigurationMap = (util.h.xy.br.c.ra.getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
                util.h.xy.br.mc.m25610(context, str, obj);
                i++;
                getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getInputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                int i3 = getHighSpeedVideoFpsRangesFor + 117;
                Camera2StreamConfigurationMap = i3 % 128;
                if (i3 % 2 == 0) {
                    cArr2[i2] = (char) (cArr[i2] - 3299939579226817547L);
                    i2 <<= 1;
                } else {
                    cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
                    i2++;
                }
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
        if (!getHighSpeedVideoFpsRanges) {
            if (!getInputFormats) {
                throw null;
            }
            throw null;
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 1) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience m25603(android.content.Context context, int i, int i2) {
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        int i4 = i3 + 97;
        getOutputMinFrameDuration = i4 % 128;
        byte b = 0;
        if (i4 % 2 == 0 ? i <= 10 : i <= 74) {
            if (i >= 0) {
                int i5 = i3 + 57;
                getOutputMinFrameDuration = i5 % 128;
                if (i5 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (context != null && i2 >= 5) {
                    util.h.xy.br.mb highSpeedVideoSizes = getHighSpeedVideoSizes(context);
                    if (highSpeedVideoSizes == null) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(128 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0087\u008e\u008e¡\u0082\u0087\u008c\u009f\u0087 \u0085\u0082\u0082\u0098\u0094\u0087\u0099 \u0086\u008e\u0086\u009f\u0098\u009e\u0098\u009d\u0087\u008c\u0094\u0086\u008d\u008c\u009a", objArr);
                        throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
                    }
                    if (highSpeedVideoSizes == util.h.xy.br.mb.f1032) {
                        return com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.TWO_TAP_ALWAYS;
                    }
                    double d = i;
                    getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
                    for (int i6 = 0; i6 < i2; i6++) {
                        try {
                            java.lang.Thread.sleep(0L, 1);
                        } catch (java.lang.InterruptedException unused) {
                        }
                        this.getOutputSizeshNQ4ISI.add(m25600(context));
                    }
                    java.util.Collections.sort(this.getOutputSizeshNQ4ISI, new util.h.xy.br.c.mb(b));
                    double highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getOutputSizeshNQ4ISI.subList(2, i2 - 2));
                    getHighSpeedVideoFpsRangesFor(context, this.getOutputSizeshNQ4ISI);
                    if (highSpeedVideoFpsRangesFor >= (d * 0.01d * 150.0d) + 150.0d) {
                        return com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.TWO_TAP_ALWAYS;
                    }
                    com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience paymentExperience = com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_ENABLED;
                    int i7 = getOutputMinFrameDuration + 105;
                    getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                    if (i7 % 2 != 0) {
                        return paymentExperience;
                    }
                    throw null;
                }
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19, 20 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.green(0), objArr2);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
    }

    private static double getHighSpeedVideoFpsRangesFor(java.util.List<util.h.xy.br.c.ra> list) {
        int i = getOutputMinFrameDuration;
        getHighResolutionOutputSizeshNQ4ISI = (i + 59) % 128;
        if (list == null) {
            return Double.MAX_VALUE;
        }
        getHighResolutionOutputSizeshNQ4ISI = (i + 109) % 128;
        if (list.isEmpty()) {
            return Double.MAX_VALUE;
        }
        java.util.Iterator<util.h.xy.br.c.ra> it = list.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += it.next().getHighSpeedVideoFpsRanges();
        }
        return d / list.size();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.br.c.ra m25600(android.content.Context context) {
        long j;
        long j2;
        util.h.xy.br.c.ra raVar = new util.h.xy.br.c.ra();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j3 = 0;
        try {
            util.h.xy.br.mc.m25609(context);
            j = java.lang.System.currentTimeMillis() - currentTimeMillis;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, "¦¥£\u0099\u008c¤£\u008c \u0086\u0084¢", objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0090\u0082\u0085\u008d\u0081¯\u0082\u0085\u009e¡¯\u0083\u0084\u0085® \u0098\u0084 \u0096\u0087\u0082\u0086\u0087¬\u00ad\u008f¦\u0091\u0087¬«\u0092\u0087\u008e\u0086\u0084\u009e\u0081\u0087\u0082\u0085\u0087\u0082\u0084\u0085\u009f\u0087©\u0098ª\u0087\u008c\u0084\u0098\u008c\u009e©\u008c¤\u0098¨\u0096\u0087§\u0098\u0086\u008e\u008e\u0086¢", objArr2);
                long highResolutionOutputSizeshNQ4ISI = util.h.xy.br.mc.getHighResolutionOutputSizeshNQ4ISI(context, 3, intern, ((java.lang.String) objArr2[0]).intern());
                long Camera2StreamConfigurationMap2 = util.h.xy.br.mc.Camera2StreamConfigurationMap();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0099\u008c¤£\u0083\u0098\u008c\u0084", objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "  ©\u008c\u0095 ©\u008c\u0095\u0090\u0083\u0084\u0085® \u0098\u0084 \u0096\u0087\u0082\u0086\u0087\u008e\u0085\u0085¨\u0094\u0096\u0087\u0084\u0098§§\u0098\u0084µ\u0087\u008a´\u0087\u0083\u0084\u0098ª\u0083³\u0087²\u0082\u0086\u009b\u0087\u008c¨ \u0087 \u0098\u0087\u0083\u008c \u0098\u0094¡\u0083\u008c\u0087\u0099\u008e\u009f\u0098\u009f\u0085\u0084\u009e\u0087©\u0098ª\u0087\u008c¨\u0087¬\u0082\u008c\u0083\u0084\u0081\u0087\u0099\u0084\u0098±\u0087\u0083\u0082\u0098\u0087\u008c\u0084\u0098\u008c\u009e©\u008c¤\u0098¨\u0096\u0087\u0082¨\u0085°\u0087®\u0085\u0087\u0082\u0085©\u0087\u008c¨\u0095\u0087\u0090\u0082\u0085\u008d\u0081¯\u0082\u0085\u009e¡¯\u0083\u0084\u0085® \u0098\u0084 \u0096\u0087\u0082\u0086\u0087¬\u00ad\u008f¦\u0091\u0087¬«\u0092\u0087\u008e\u0086\u0084\u009e\u0081\u0087\u0082\u0085\u0087\u0082\u0084\u0085\u009f\u0087©\u0098ª\u0087\u008c\u0084\u0098\u008c\u009e©\u008c¤\u0098¨\u0096\u0087§\u0098\u0086\u008e\u008e\u0086¢", objArr4);
                util.h.xy.br.mc.getHighResolutionOutputSizeshNQ4ISI(context, 1, intern2, ((java.lang.String) objArr4[0]).intern());
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, "\u0099\u008c¤£\u0083\u0098\u008c\u0084", objArr5);
                long highResolutionOutputSizeshNQ4ISI2 = util.h.xy.br.mc.getHighResolutionOutputSizeshNQ4ISI(context, ((java.lang.String) objArr5[0]).intern());
                long highSpeedVideoFpsRangesFor = util.h.xy.br.mc.getHighSpeedVideoFpsRangesFor();
                raVar.getHighSpeedVideoFpsRanges = highResolutionOutputSizeshNQ4ISI + Camera2StreamConfigurationMap2;
                raVar.getHighSpeedVideoSizes = highResolutionOutputSizeshNQ4ISI2 + highSpeedVideoFpsRangesFor;
                util.h.xy.br.mc.getHighSpeedVideoSizes(context);
                util.h.xy.br.mc.f1035 = null;
                util.h.xy.br.mc.f1034 = null;
                j2 = 0;
                j3 = util.h.xy.br.mc.getHighResolutionOutputSizeshNQ4ISI();
            } catch (java.lang.Exception unused) {
                j2 = 150;
                raVar.getHighSpeedVideoFpsRangesFor = j3 + j + j2;
                double d = j2;
                raVar.getHighSpeedVideoSizes += d;
                raVar.getHighSpeedVideoFpsRanges += d;
                getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
                return raVar;
            }
        } catch (java.lang.Exception unused2) {
            j = 0;
        }
        raVar.getHighSpeedVideoFpsRangesFor = j3 + j + j2;
        double d2 = j2;
        raVar.getHighSpeedVideoSizes += d2;
        raVar.getHighSpeedVideoFpsRanges += d2;
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
        return raVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r5 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r0 > 0.0d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r2 = r2 + 13;
        util.h.xy.br.c.getHighResolutionOutputSizeshNQ4ISI = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if ((r2 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r5 = util.h.xy.br.mb.f1032;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r5 = util.h.xy.br.mb.f1032;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0 > 1.0d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
    
        if (java.lang.Runtime.getRuntime().availableProcessors() < 4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (java.lang.Runtime.getRuntime().availableProcessors() < 5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0055, code lost:
    
        r5 = util.h.xy.br.mb.f1033;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        util.h.xy.br.c.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.br.c.getOutputMinFrameDuration + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r5 = util.h.xy.br.c.getHighResolutionOutputSizeshNQ4ISI + 45;
        r2 = r5 % 128;
        util.h.xy.br.c.getOutputMinFrameDuration = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static util.h.xy.br.mb getHighSpeedVideoSizes(android.content.Context context) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 17;
        getOutputMinFrameDuration = i % 128;
        double highSpeedVideoFpsRangesFor = i % 2 != 0 ? getHighSpeedVideoFpsRangesFor(context) : getHighSpeedVideoFpsRangesFor(context);
    }

    private static double getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(126 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0099 \u0086\u008d\u0086 \u0094\u0098", objArr);
        ((android.app.ActivityManager) context.getSystemService(((java.lang.String) objArr[0]).intern())).getMemoryInfo(memoryInfo);
        double d = memoryInfo.totalMem / 1.073741824E9d;
        int i = getOutputMinFrameDuration + 37;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return d;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25601(android.content.Context context, com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience paymentExperience) {
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
        util.h.xy.br.ma.m25607(context, paymentExperience.toString().getBytes());
        int i = getHighResolutionOutputSizeshNQ4ISI + 11;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience m25602(android.content.Context context) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 7;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience m25606 = util.h.xy.br.ma.m25606(context);
            int i2 = getOutputMinFrameDuration + 57;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                return m25606;
            }
            throw null;
        }
        util.h.xy.br.ma.m25606(context);
        throw null;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getInputSizeshNQ4ISI = new char[]{64204, 64147, 64169, 64159, 64146, 64148, 64237, 64213, 64189, 64180, 64177, 64168, 64155, 64145, 64219, 64211, 64220, 64223, 64221, 64174, 64185, 64190, 64181, 64172, 64132, 64201, 64182, 64210, 64206, 64157, 64175, 64153, 64152, 64186, 64162, 64150, 64218, 64216, 64144, 64149, 64158, 64154, 64222, 64209, 64217, 64171, 64208, 64183, 64176, 64170, 64200, 64187, 64202};
        getHighSpeedVideoSizesFor = -1074857203;
        getInputFormats = true;
        getHighSpeedVideoFpsRanges = true;
        getOutputMinFrameDurationlomOqCM = new char[]{39976, 39969, 3866, 47669, 9725, 53409, 17307, 61266, 39447, 1532, 45283, 46304, 10191, 37530, 3425, 63594, 27414, 51165, 45704, 11646, 38967, 40000, 3904, 47616, 9709, 53408, 17307, 61277, 39440, 1465, 45219, 9100, 53008, 31244, 58874, 37031, 921, 44886, 23043, 50683, 28905};
        getHighSpeedVideoSizes = 8291991274685337394L;
    }
}
