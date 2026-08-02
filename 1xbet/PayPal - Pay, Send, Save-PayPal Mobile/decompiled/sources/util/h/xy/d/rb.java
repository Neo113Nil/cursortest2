package util.h.xy.d;

/* loaded from: classes5.dex */
public final class rb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int[] getHighSpeedVideoSizesFor = {-1239917259, 752730493, -1522192102, 1690561102, -1317138656, -1254763347, 1820431787, -1051312340, -1225176918, -889071008, 83563272, -1529062120, 1446162486, 946097050, -1033580588, -523644029, 1737469728, -1278791446};
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;
    private com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel getOutputFormats;
    private final byte[] getOutputMinFrameDuration;
    private final util.h.xy.d.rb.a getOutputSizes;
    private byte[] getOutputStallDuration;
    private final int getOutputStallDurationlomOqCM;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        private static char Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static final /* synthetic */ util.h.xy.d.rb.a[] getHighSpeedVideoFpsRangesFor;
        private static long getHighSpeedVideoSizes = 0;
        private static int getHighSpeedVideoSizesFor = 0;
        private static int getInputSizeshNQ4ISI = 1;
        private static int getOutputFormats;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.d.rb.a f1146;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.d.rb.a f1147;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.d.rb.a f1148;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.d.rb.a f1149;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.d.rb.a f1150;
        private int getInputFormats;
        private java.lang.String getOutputMinFrameDuration;

        public static util.h.xy.d.rb.a valueOf(java.lang.String str) {
            getOutputFormats = (getInputSizeshNQ4ISI + 67) % 128;
            util.h.xy.d.rb.a aVar = (util.h.xy.d.rb.a) java.lang.Enum.valueOf(util.h.xy.d.rb.a.class, str);
            int i = getOutputFormats + 3;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        public static util.h.xy.d.rb.a[] values() {
            int i = getInputSizeshNQ4ISI + 19;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            util.h.xy.d.rb.a[] aVarArr = (util.h.xy.d.rb.a[]) getHighSpeedVideoFpsRangesFor.clone();
            int i2 = getInputSizeshNQ4ISI + 67;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                return aVarArr;
            }
            throw null;
        }

        static {
            getHighSpeedVideoFpsRangesFor();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("┯뱩\ue2bb峎ᭌᤅ", (char) (40939 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), android.view.ViewConfiguration.getJumpTapTimeout() >> 16, "帽曤\uebe7֟", "\u0000\u0000\u0000\u0000", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("┯뱩\ue2bb峎ᭌᤅ", (char) (40938 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22, "帽曤\uebe7֟", "\u0000\u0000\u0000\u0000", objArr2);
                util.h.xy.d.rb.a aVar = new util.h.xy.d.rb.a(intern, 0, 0, ((java.lang.String) objArr2[0]).intern());
                f1149 = aVar;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("稖⒅쯃䌇ᯆ챬쮉餒ᴭ\uf1bdᴳ趝귌\uf323㝮⛷⹂䊎ꥆꢋ", (char) android.graphics.Color.argb(0, 0, 0, 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "糚셡ъ폊", "\u0000\u0000\u0000\u0000", objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("稖⒅쯃䌇ᯆ챬쮉餒ᴭ\uf1bdᴳ趝귌\uf323㝮⛷⹂䊎ꥆꢋ", (char) android.view.View.resolveSizeAndState(0, 0, 0), android.view.View.combineMeasuredStates(0, 0), "糚셡ъ폊", "\u0000\u0000\u0000\u0000", objArr4);
                util.h.xy.d.rb.a aVar2 = new util.h.xy.d.rb.a(intern2, 1, 1, ((java.lang.String) objArr4[0]).intern());
                f1146 = aVar2;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("彆諎\ue4e3䮔ꋰƧ\ue781\u2453퀶䡲\ude92붊㒹㯟岾", (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 64947), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1229378845, "ᶒ䛕덉뫽", "\u0000\u0000\u0000\u0000", objArr5);
                java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("彆諎\ue4e3䮔ꋰƧ\ue781\u2453퀶䡲\ude92붊㒹㯟岾", (char) (64947 - android.text.TextUtils.indexOf("", "")), 1229378846 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "ᶒ䛕덉뫽", "\u0000\u0000\u0000\u0000", objArr6);
                util.h.xy.d.rb.a aVar3 = new util.h.xy.d.rb.a(intern3, 2, 2, ((java.lang.String) objArr6[0]).intern());
                f1147 = aVar3;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("生ᝒᑡ仲덯榷묗鿸ᙌ", (char) android.text.TextUtils.indexOf("", "", 0, 0), (-1272032330) - android.graphics.ImageFormat.getBitsPerPixel(0), "랒⹓슴坾", "\u0000\u0000\u0000\u0000", objArr7);
                java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("生ᝒᑡ仲덯榷묗鿸ᙌ", (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1272032329, "랒⹓슴坾", "\u0000\u0000\u0000\u0000", objArr8);
                util.h.xy.d.rb.a aVar4 = new util.h.xy.d.rb.a(intern4, 3, 3, ((java.lang.String) objArr8[0]).intern());
                f1148 = aVar4;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ᄒ낱쏦\uec24퉗Ｘ\ud8f5\uf857\ue938\ue8c0縠薽ꩨ\uf6d3㩵載", (char) (4767 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "蔋\uf836鿞‒", "\u0000\u0000\u0000\u0000", objArr9);
                java.lang.String intern5 = ((java.lang.String) objArr9[0]).intern();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ᄒ낱쏦\uec24퉗Ｘ\ud8f5\uf857\ue938\ue8c0縠薽ꩨ\uf6d3㩵載", (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4766), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, "蔋\uf836鿞‒", "\u0000\u0000\u0000\u0000", objArr10);
                util.h.xy.d.rb.a aVar5 = new util.h.xy.d.rb.a(intern5, 4, 4, ((java.lang.String) objArr10[0]).intern());
                f1150 = aVar5;
                int i = getInputSizeshNQ4ISI;
                getOutputFormats = (i + 113) % 128;
                util.h.xy.d.rb.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
                int i2 = i + 69;
                getOutputFormats = i2 % 128;
                if (i2 % 2 == 0) {
                    getHighSpeedVideoFpsRangesFor = aVarArr;
                    return;
                }
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private a(java.lang.String str, int i, int i2, java.lang.String str2) {
            this.getInputFormats = i2;
            this.getOutputMinFrameDuration = str2;
        }

        /* renamed from: ᐝ, reason: contains not printable characters */
        public final int m26236() {
            int i = getOutputFormats;
            getInputSizeshNQ4ISI = (i + 41) % 128;
            int i2 = this.getInputFormats;
            getInputSizeshNQ4ISI = (i + 11) % 128;
            return i2;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            int i = getOutputFormats;
            getInputSizeshNQ4ISI = (i + 87) % 128;
            java.lang.String str = this.getOutputMinFrameDuration;
            getInputSizeshNQ4ISI = (i + 117) % 128;
            return str;
        }

        private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
            int i2 = getHighSpeedVideoFpsRanges + 9;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            char[] charArray = str3.toCharArray();
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            char[] charArray2 = str2.toCharArray();
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
            char[] cArr = charArray2;
            char[] charArray3 = str.toCharArray();
            util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int length2 = charArray.length;
            char[] cArr3 = new char[length2];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, length);
            java.lang.System.arraycopy(charArray, 0, cArr3, 0, length2);
            cArr2[0] = (char) (cArr2[0] ^ c);
            cArr3[2] = (char) (cArr3[2] + ((char) i));
            int length3 = charArray3.length;
            char[] cArr4 = new char[length3];
            rcVar.f2652 = 0;
            while (rcVar.f2652 < length3) {
                int i3 = (rcVar.f2652 + 2) % 4;
                int i4 = (rcVar.f2652 + 3) % 4;
                rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i3]) % 65535);
                cArr3[i4] = (char) (((cArr2[i4] * 32718) + cArr3[i3]) / 65535);
                cArr2[i4] = rcVar.f2653;
                cArr4[rcVar.f2652] = (char) ((((cArr2[i4] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizes ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizesFor ^ 2457411417541981002L))) ^ ((char) (Camera2StreamConfigurationMap ^ 2457411417541981002L)));
                rcVar.f2652++;
            }
            objArr[0] = new java.lang.String(cArr4);
        }

        static void getHighSpeedVideoFpsRangesFor() {
            getHighSpeedVideoSizes = 2457411417541981002L;
            getHighSpeedVideoSizesFor = 294925130;
            Camera2StreamConfigurationMap = (char) 37577;
        }
    }

    public rb(int i, util.h.xy.d.rb.a aVar, byte[] bArr, java.lang.String str, byte[] bArr2, java.lang.String str2, int i2, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel) {
        this.getOutputStallDurationlomOqCM = i;
        this.getOutputSizes = aVar;
        this.getOutputMinFrameDuration = bArr;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getOutputStallDuration = bArr2;
        this.getHighSpeedVideoSizes = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getOutputFormats = profileChannel;
    }

    public rb(util.h.xy.d.rb rbVar, util.h.xy.d.rb.a aVar, java.lang.String str) {
        this.getOutputStallDuration = null;
        this.getOutputFormats = null;
        this.getOutputStallDurationlomOqCM = rbVar.getOutputStallDurationlomOqCM;
        this.getOutputSizes = aVar;
        this.getOutputMinFrameDuration = rbVar.getOutputMinFrameDuration;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getOutputStallDuration = rbVar.getOutputStallDuration;
        this.getHighSpeedVideoSizes = rbVar.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = rbVar.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputFormats = rbVar.m26235();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m26230() {
        int i = getInputSizeshNQ4ISI + 45;
        int i2 = i % 128;
        getInputFormats = i2;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = this.getOutputStallDurationlomOqCM;
        getInputSizeshNQ4ISI = (i2 + 97) % 128;
        return i3;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.d.rb.a m26233() {
        int i = getInputFormats;
        getInputSizeshNQ4ISI = (i + 121) % 128;
        util.h.xy.d.rb.a aVar = this.getOutputSizes;
        int i2 = i + 45;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26228() {
        int i = getInputSizeshNQ4ISI;
        int i2 = i + 103;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.getOutputMinFrameDuration;
        int i3 = i + 65;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final java.lang.String m26229() {
        int i = (getInputSizeshNQ4ISI + 69) % 128;
        getInputFormats = i;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        int i2 = i + 85;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m26231() {
        int i = getInputSizeshNQ4ISI + 103;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return this.getOutputStallDuration;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final java.lang.String m26226() {
        int i = getInputFormats;
        int i2 = i + 19;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.getHighSpeedVideoSizes;
        int i3 = i + 51;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final int m26232() {
        int i = (getInputSizeshNQ4ISI + 47) % 128;
        getInputFormats = i;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        getInputSizeshNQ4ISI = (i + 69) % 128;
        return i2;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel m26235() {
        int i = getInputFormats;
        getInputSizeshNQ4ISI = (i + 27) % 128;
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel = this.getOutputFormats;
        getInputSizeshNQ4ISI = (i + 21) % 128;
        return profileChannel;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26234(java.lang.String str, java.lang.String str2) {
        getInputFormats = (getInputSizeshNQ4ISI + 19) % 128;
        m26230();
        m26229();
        util.h.xy.ar.b.m25074(m26228());
        util.h.xy.ar.b.m25074(m26231());
        m26233();
        m26226();
        m26232();
        m26235();
        int i = getInputFormats + 9;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26227(java.lang.String str) {
        int[] iArr;
        int length;
        int[] iArr2;
        int i;
        getInputSizeshNQ4ISI = (getInputFormats + 105) % 128;
        int[] iArr3 = {-1925591454, -677529223, -1302368226, 843978182, -1022660600, -610488292, 1867008796, 1238308639};
        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 14;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[16];
        int[] iArr4 = getHighSpeedVideoSizesFor;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 73) % 128;
                iArr5[i2] = (int) (iArr4[i2] ^ (-5569649899877129369L));
            }
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = getHighSpeedVideoSizesFor;
        if (iArr7 != null) {
            int i3 = getHighSpeedVideoFpsRanges + 121;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i = 0;
            }
            while (i < length) {
                iArr2[i] = (int) (iArr7[i] ^ (-5569649899877129369L));
                i++;
                iArr3 = iArr3;
            }
            iArr = iArr3;
            iArr7 = iArr2;
        } else {
            iArr = iArr3;
        }
        java.lang.System.arraycopy(iArr7, 0, iArr6, 0, length3);
        cVar.f2626 = 0;
        while (cVar.f2626 < 8) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 7) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr6);
            int i4 = 0;
            for (int i5 = 16; i4 < i5; i5 = 16) {
                cVar.f2627 ^= iArr6[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i6 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i6;
                i4++;
            }
            int i7 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i7;
            cVar.f2625 ^= iArr6[16];
            cVar.f2627 ^= iArr6[17];
            int i8 = cVar.f2627;
            int i9 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr6);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 21) % 128;
        }
        m26234(str, new java.lang.String(cArr2, 0, indexOf).intern());
        getInputFormats = (getInputSizeshNQ4ISI + 57) % 128;
    }
}
