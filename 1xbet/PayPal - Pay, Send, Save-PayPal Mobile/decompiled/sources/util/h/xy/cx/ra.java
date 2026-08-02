package util.h.xy.cx;

/* loaded from: classes5.dex */
abstract class ra {
    private static char Camera2StreamConfigurationMap = 48664;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = -278731955;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char getHighSpeedVideoSizes = 40454;
    private static char getHighSpeedVideoSizesFor = 58857;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI = 0;
    private static byte[] getOutputFormats = {-58, 7, 38, -34, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -37, 35, -7, -1, -46, kotlin.io.encoding.Base64.padSymbol, 46, -40, 39, -61, -40, -40};
    private static int getOutputMinFrameDuration = 2139312852;
    private static char getOutputSizeshNQ4ISI = 40811;
    private static short[] getOutputStallDuration = null;
    private static int getOutputStallDurationlomOqCM = -408873027;
    private final java.lang.String getOutputMinFrameDurationlomOqCM;
    private util.h.xy.cx.ra.ma getOutputSizes;
    private final java.lang.String getValidOutputFormatsForInputhNQ4ISI;
    private android.database.sqlite.SQLiteDatabase isOutputSupportedForhNQ4ISI;

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(util.h.xy.cx.ra raVar) {
        int i = (getInputSizeshNQ4ISI + 71) % 128;
        getInputFormats = i;
        java.lang.String str = raVar.getValidOutputFormatsForInputhNQ4ISI;
        getInputSizeshNQ4ISI = (i + 39) % 128;
        return str;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes(util.h.xy.cx.ra raVar) {
        int i = (getInputFormats + 23) % 128;
        getInputSizeshNQ4ISI = i;
        java.lang.String str = raVar.getOutputMinFrameDurationlomOqCM;
        int i2 = i + 57;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    ra(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("疻䱘\ue80b㏮쳮쮀뒤俉㿊旎䒐妫篸ߚ陚獿뒤俉죋썀퇉䎓揸⡯篸ߚ渉ﻵ⯴☳뿁믛嘎肳弟\ued7e\ue55a犌", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 38, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("썯Ḭ", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((-147059861) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (short) (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) android.graphics.Color.green(0), android.view.MotionEvent.axisFromString("") - 91, android.text.TextUtils.getTrimmedLength("") + 1742584647, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        this.getOutputMinFrameDurationlomOqCM = sb.toString();
        this.getValidOutputFormatsForInputhNQ4ISI = str;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final java.lang.String m26108() {
        int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
        short normalizeMetaState = (short) android.view.KeyEvent.normalizeMetaState(0);
        byte longPressTimeout = (byte) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
        getInputSizeshNQ4ISI = (getInputFormats + 91) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((-147059853) - (scrollBarSize >> 8), normalizeMetaState, longPressTimeout, (-92) - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1742584646, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            int i = getInputFormats + 57;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return intern;
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

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final java.lang.String m26111() {
        java.lang.Object obj;
        int i = getInputSizeshNQ4ISI + 43;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ue565ܑ漝迖揲들띢瓢", 28 >>> (android.view.ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ue565ܑ漝迖揲들띢瓢", 8 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        return ((java.lang.String) obj).intern();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected void m26109() throws util.h.xy.da.b {
        util.h.xy.cx.ra.ma maVar = new util.h.xy.cx.ra.ma(util.h.xy.da.mc.m26262().m26264());
        this.getOutputSizes = maVar;
        try {
            this.isOutputSupportedForhNQ4ISI = maVar.getWritableDatabase();
            int i = getInputSizeshNQ4ISI + 39;
            getInputFormats = i % 128;
            int i2 = i % 2;
        } catch (android.database.sqlite.SQLiteException unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("␚ￄꢑ蟈\uf2d9ໜ䀇\uf6daᕖ軷篸ߚ\uf833\uda31\uf51aⷚ㜀\uf1beꝌȤ諸옫钒\ueaa5ὂ\ue44f쿹蔖袶ᛑ⯴☳\ud94d릳ꅞ著礣鑈쿹蔖⭺⥧梻듐韗澭篸ߚ蔕瘃㿊旎黝獅⇻腫\ue55a犌", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 57, objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10801);
        }
    }

    final class ma extends android.database.sqlite.SQLiteOpenHelper {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoSizes = 1;
        private static long getHighSpeedVideoSizesFor = 9186626822223545797L;

        private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2 = getHighSpeedVideoSizes + 89;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            char[] charArray = str.toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizesFor ^ 7817488252581312552L, charArray, i);
            aVar.f2623 = 4;
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
            while (aVar.f2623 < m27721.length) {
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizesFor ^ 7817488252581312552L)));
                aVar.f2623++;
            }
            objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
        }

        ma(android.content.Context context) {
            super(context, util.h.xy.cx.ra.getHighSpeedVideoSizes(util.h.xy.cx.ra.this), (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 65) % 128;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            int i = getHighSpeedVideoFpsRanges + 85;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 33) % 128;
            if (sQLiteDatabase != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\ue99c\ue9d8Ƹᢑ㰇\ue716挄庁Ḉ㑍歞嘯ڸⲨ珳买ໆ⒑稢䞭㜅ᵖ䉯習㼸ᗮ", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(util.h.xy.cx.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.cx.ra.this));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("舞船쁼줰숒", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sQLiteDatabase.execSQL(sb.toString());
                onCreate(sQLiteDatabase);
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 115) % 128;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected void m26106() throws util.h.xy.da.b {
        util.h.xy.cx.ra.ma maVar = new util.h.xy.cx.ra.ma(util.h.xy.da.mc.m26262().m26264());
        this.getOutputSizes = maVar;
        try {
            this.isOutputSupportedForhNQ4ISI = maVar.getReadableDatabase();
            getInputFormats = (getInputSizeshNQ4ISI + 97) % 128;
        } catch (android.database.sqlite.SQLiteException unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("␚ￄꢑ蟈\uf2d9ໜ䀇\uf6daᕖ軷篸ߚ\uf833\uda31\uf51aⷚ㜀\uf1beꝌȤ諸옫钒\ueaa5ὂ\ue44f쿹蔖袶ᛑ⯴☳\ud94d릳ꅞ著礣鑈쿹蔖⭺⥧梻듐韗澭篸ߚ蔕瘃㿊旎黝獅⇻腫\ue55a犌", android.view.View.getDefaultSize(0, 0) + 57, objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10802);
        }
    }

    /* renamed from: ˋ */
    public void mo26102() {
        int i = getInputSizeshNQ4ISI + 71;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.isOutputSupportedForhNQ4ISI;
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.inTransaction()) {
                    int i2 = getInputSizeshNQ4ISI + 9;
                    getInputFormats = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.isOutputSupportedForhNQ4ISI.endTransaction();
                        throw new java.lang.NullPointerException();
                    }
                    this.isOutputSupportedForhNQ4ISI.endTransaction();
                }
                if (this.isOutputSupportedForhNQ4ISI.isOpen()) {
                    int i3 = getInputFormats + 31;
                    getInputSizeshNQ4ISI = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.isOutputSupportedForhNQ4ISI.close();
                    } else {
                        this.isOutputSupportedForhNQ4ISI.close();
                        throw new java.lang.ArithmeticException();
                    }
                }
            } catch (java.lang.Exception unused) {
                if (this.isOutputSupportedForhNQ4ISI.isOpen()) {
                    this.isOutputSupportedForhNQ4ISI.close();
                    getInputSizeshNQ4ISI = (getInputFormats + 113) % 128;
                }
            } catch (java.lang.Throwable th) {
                if (this.isOutputSupportedForhNQ4ISI.isOpen()) {
                    this.isOutputSupportedForhNQ4ISI.close();
                }
                throw th;
            }
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 27) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 11) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getOutputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizes ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    protected void Z_(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ب꿑\ue29d逶䏅磯௮烡ߚ顽윁訝䕁棁凜鎆駭\ueb70ⳛ延譀쁃\udc59᭶", 22 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
        sQLiteDatabase.execSQL(((java.lang.String) objArr[0]).intern());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("웴䃪\ue783\udaa3塚뒲祆\ud8ff孱궺鰪ӿ杤쎣惰\ufff3\uedff뜒ࡖ\uf827䱼繊\ude59\ueafd寮할\uf644䝙", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.GS, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(m26110());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("⭃婱驫滞檃墌⊬\ue88f飮湺䎥ﾙ钒\ueaa5켉물瓬孭㰅㛡ᕜ쬚㞉㮮駭\ueb70㻠Ꝥҫ欣렺\ue13a픴枦\ue343\ue157뿁믛飮湺했鋙", 42 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(m26108());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("瑂䨍︁蹘ꯀ굕\uedff뜒ࡖ\uf827㜘ࣦఁኚ했鋙", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 16, objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(m26111());
        int i = getInputFormats;
        getInputSizeshNQ4ISI = (i + 37) % 128;
        getInputSizeshNQ4ISI = (i + 73) % 128;
        try {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("瑂䨍︁蹘ꯀ굕\uedff뜒ࡖ\uf827㜘ࣦఁኚ㊓\udb39", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 16, objArr5);
            sb.append(((java.lang.String) objArr5[0]).intern());
            sQLiteDatabase.execSQL(sb.toString());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    protected java.lang.String m26110() {
        int i = (getInputFormats + 97) % 128;
        getInputSizeshNQ4ISI = i;
        java.lang.String str = this.getValidOutputFormatsForInputhNQ4ISI;
        int i2 = i + 113;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    protected final android.database.sqlite.SQLiteDatabase aa_() {
        int i = getInputFormats;
        getInputSizeshNQ4ISI = (i + 83) % 128;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.isOutputSupportedForhNQ4ISI;
        getInputSizeshNQ4ISI = (i + 5) % 128;
        return sQLiteDatabase;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final boolean m26107(android.content.Context context) {
        getInputFormats = (getInputSizeshNQ4ISI + 99) % 128;
        boolean contains = java.util.Arrays.asList(context.databaseList()).contains(this.getOutputMinFrameDurationlomOqCM);
        int i = getInputSizeshNQ4ISI + 7;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return contains;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int length;
        byte[] bArr;
        int i7;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i8 = i2 + ((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L)));
        boolean z2 = i8 == -1;
        if (z2) {
            byte[] bArr2 = getOutputFormats;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i9 = 0; i9 < length2; i9++) {
                    bArr3[i9] = (byte) (bArr2[i9] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            i8 = bArr2 != null ? (byte) (((byte) (getOutputFormats[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L)))) : (short) (((short) (getOutputStallDuration[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L))));
        }
        if (i8 > 0) {
            int i10 = getHighResolutionOutputSizeshNQ4ISI + 23;
            getHighSpeedVideoFpsRangesFor = i10 % 128;
            if (i10 % 2 == 0) {
                i4 = ((i << i8) >> 4) - ((int) (getHighSpeedVideoFpsRanges / (-2689713159175858216L)));
            } else {
                i4 = ((i + i8) - 2) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getOutputFormats;
            if (bArr4 != null) {
                int i11 = getHighResolutionOutputSizeshNQ4ISI + 75;
                getHighSpeedVideoFpsRangesFor = i11 % 128;
                if (i11 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i7 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i7 = 0;
                }
                while (i7 < length) {
                    bArr[i7] = (byte) (bArr4[i7] ^ (-2689713159175858216L));
                    i7++;
                }
                bArr4 = bArr;
            }
            if (bArr4 != null) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
                z = true;
            } else {
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i8) {
                if (z) {
                    int i12 = getHighSpeedVideoFpsRangesFor + 93;
                    getHighResolutionOutputSizeshNQ4ISI = i12 % 128;
                    if (i12 % 2 != 0) {
                        byte[] bArr5 = getOutputFormats;
                        meVar.f2647 = meVar.f2647 - 1;
                        i6 = meVar.f2646 - (((byte) (((byte) (bArr5[r9] + 2689713159175858216L)) >>> s)) ^ b);
                    } else {
                        byte[] bArr6 = getOutputFormats;
                        meVar.f2647 = meVar.f2647 - 1;
                        i6 = meVar.f2646 + (((byte) (((byte) (bArr6[r9] ^ (-2689713159175858216L))) + s)) ^ b);
                    }
                    meVar.f2644 = (char) i6;
                } else {
                    short[] sArr = getOutputStallDuration;
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
}
