package util.h.xy.cm;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final byte[] getHighSpeedVideoFpsRangesFor;
    private static int[] getHighSpeedVideoSizes = null;
    private static long getHighSpeedVideoSizesFor = 0;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static long getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;

    static /* synthetic */ byte[] Camera2StreamConfigurationMap() {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 81) % 128;
        byte[] outputFormats = getOutputFormats();
        int i = getHighSpeedVideoFpsRanges + 67;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            return outputFormats;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoSizes();
        getInputSizeshNQ4ISI = util.h.xy.cm.a.class.getName();
        getHighSpeedVideoFpsRangesFor = getHighResolutionOutputSizeshNQ4ISI();
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 37) % 128;
    }

    private a() {
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getOutputFormats ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputFormats ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25958() {
        int i = getOutputMinFrameDuration + 107;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges();
            getInputSizeshNQ4ISI();
        } else {
            getHighSpeedVideoFpsRanges();
            getInputSizeshNQ4ISI();
            throw new java.lang.ArithmeticException();
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 43;
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = i3;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizesFor ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizesFor ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighSpeedVideoSizes;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 81) % 128;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoSizes;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        java.lang.String str = new java.lang.String(cArr2, 0, i);
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 59) % 128;
        objArr[0] = str;
    }

    private static void getHighSpeedVideoFpsRanges() throws java.lang.SecurityException {
        int i = (getOutputMinFrameDuration + 85) % 128;
        getHighSpeedVideoFpsRanges = i;
        int i2 = i + 57;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0 || android.os.Build.VERSION.SDK_INT > 95) {
            return;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("쪃쫬䅽联䯁閯ҏ\ue1daⓋ綷픚漊鲛⪚轢剹䭊쟅ʆ蚶昍ﰖ埽\ue9f9ድꥂ硯\udc67즣䖭贬܇\ue462狳퇮橋鍭⼥婢庒丞쐩ཱུ臈竇\uf156倕\uf434ᆨ궅擒\udf69챗嫀", (-1) - android.view.MotionEvent.axisFromString(""), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName(((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\uf866\uf834\ue497툚\uee18쟈谼팁값\ud86d蝹\ue7d5깲", android.view.View.MeasureSpec.getMode(0), objArr2);
            cls.getMethod(((java.lang.String) objArr2[0]).intern(), byte[].class).invoke(null, getOutputFormats());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("쪃쫬䅽联䯁閯ҏ\ue1daⓋ綷픚漊鲛⪚轢剹䭊쟅ʆ蚶昍ﰖ埽\ue9f9ድꥂ硯\udc67즣䖭贬܇\ue462狳퇮橋鍭⼥婢庒丞쐩ཱུ臈竇\uf156倕\uf434ᆨ궅擒\udf69챗嫀", android.widget.ExpandableListView.getPackedPositionType(0L), objArr3);
            java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr3[0]).intern());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("퀍큟Ṹญᓷᯟ텅ﭪ\uf16b⊝孤모蘙疖瞵蟘凉飤", android.graphics.Color.alpha(0), objArr4);
            java.lang.reflect.Method method = cls2.getMethod(((java.lang.String) objArr4[0]).intern(), java.lang.String.class, java.lang.Long.TYPE);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\ue05d\ue072\uef36회\ue59c썵롷쭊顫폯菓펨뙃蓆꼖\ueedc", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr5);
            int intValue = ((java.lang.Integer) method.invoke(null, ((java.lang.String) objArr5[0]).intern(), 1024)).intValue();
            if (intValue != 1024) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ꋊꊟ刖\uedb7墶\uf84e䊹覂披滕룹⥽\uf4df㧬鑢ᐟ⌗풭潨샜๘\uef38㩝꾇竲먲ᖃ驝ꇿ四\ue082䅣谧憁밎ⱹﭬ㱊靽ᣬ☒휼抳잧\u128f\ue230㶢뉡称뻎ऍ饃ꑊ", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr6);
                sb.append(((java.lang.String) objArr6[0]).intern());
                sb.append(intValue);
                throw new java.io.IOException(sb.toString());
            }
            int i3 = getHighSpeedVideoFpsRanges + 17;
            getOutputMinFrameDuration = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (java.lang.Exception e) {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\ue332\ue374녂봎믭ꣻᄤ졯ㄢ趏\ue80f竴딭\udaf3쒄䞝拿㟿㾟鍿侢ద櫩ﰻ㭹奇䕯짰\ue030떽끐", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr7);
            throw new java.lang.SecurityException(((java.lang.String) objArr7[0]).intern(), e);
        }
    }

    public static class b extends java.security.SecureRandomSpi {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static long getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static char getHighSpeedVideoSizes = 0;
        private static final java.io.File getHighSpeedVideoSizesFor;
        private static java.io.OutputStream getInputFormats = null;
        private static int getInputSizeshNQ4ISI = 0;
        private static java.io.DataInputStream getOutputFormats = null;
        private static final java.lang.Object getOutputMinFrameDuration;
        private static int getOutputSizeshNQ4ISI = 0;
        private static final long serialVersionUID = 4505677622609423129L;
        private boolean getOutputStallDuration;

        private static void getHighSpeedVideoFpsRanges(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 27;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            char[] charArray = str3.toCharArray();
            char[] charArray2 = str2.toCharArray();
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 93;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            char[] charArray3 = str.toCharArray();
            util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
            int length = charArray2.length;
            char[] cArr = new char[length];
            int length2 = charArray.length;
            char[] cArr2 = new char[length2];
            java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
            java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
            cArr[0] = (char) (cArr[0] ^ c);
            cArr2[2] = (char) (cArr2[2] + ((char) i));
            int length3 = charArray3.length;
            char[] cArr3 = new char[length3];
            rcVar.f2652 = 0;
            while (rcVar.f2652 < length3) {
                int i4 = (rcVar.f2652 + 2) % 4;
                int i5 = (rcVar.f2652 + 3) % 4;
                rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i4]) % 65535);
                cArr2[i5] = (char) (((cArr[i5] * 32718) + cArr2[i4]) / 65535);
                cArr[i5] = rcVar.f2653;
                cArr3[rcVar.f2652] = (char) ((((cArr[i5] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoFpsRanges ^ 2457411417541981002L)) ^ ((int) (getInputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoSizes ^ 2457411417541981002L)));
                rcVar.f2652++;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        static {
            Camera2StreamConfigurationMap();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("酣且離兔\ue0d5\ua87f䘖\uecb2櫏덦ㄇᘶ", (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), android.text.TextUtils.indexOf("", ""), "汩찡烧麒", "\u0000\u0000\u0000\u0000", objArr);
            getHighSpeedVideoSizesFor = new java.io.File(((java.lang.String) objArr[0]).intern());
            getOutputMinFrameDuration = new java.lang.Object();
            getHighSpeedVideoFpsRangesFor = (getOutputSizeshNQ4ISI + 89) % 128;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
        
            r1.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x001f, code lost:
        
            if (r1 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        
            if (r1 != null) goto L26;
         */
        @Override // java.security.SecureRandomSpi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void engineSetSeed(byte[] bArr) {
            java.io.OutputStream outputStream = null;
            try {
                synchronized (getOutputMinFrameDuration) {
                    outputStream = getHighSpeedVideoSizes();
                }
                outputStream.write(bArr);
                outputStream.flush();
            } catch (java.io.IOException unused) {
            } catch (java.lang.Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                this.getOutputStallDuration = true;
                throw th;
            }
            this.getOutputStallDuration = true;
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            java.io.DataInputStream highSpeedVideoFpsRanges;
            if (!this.getOutputStallDuration) {
                engineSetSeed(util.h.xy.cm.a.Camera2StreamConfigurationMap());
            }
            try {
                synchronized (getOutputMinFrameDuration) {
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                }
                synchronized (highSpeedVideoFpsRanges) {
                    highSpeedVideoFpsRanges.readFully(bArr);
                }
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("┞⯠ძ\uebec讘᨞閴鞭淖恶䆎詠憆擭샠\ua4cb⚒\uedb1퍉ﶩ", (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.ViewConfiguration.getLongPressTimeout() >> 16, "钼닻ﺾ鸵", "\u0000\u0000\u0000\u0000", objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(getHighSpeedVideoSizesFor);
                throw new java.lang.SecurityException(sb.toString(), e);
            }
        }

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i) {
            int i2 = getHighSpeedVideoFpsRangesFor + 75;
            getOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                byte[] bArr = new byte[i];
                engineNextBytes(bArr);
                int i3 = getOutputSizeshNQ4ISI + 97;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 != 0) {
                    return bArr;
                }
                throw null;
            }
            engineNextBytes(new byte[i]);
            throw new java.lang.ArithmeticException();
        }

        private static java.io.DataInputStream getHighSpeedVideoFpsRanges() {
            java.io.DataInputStream dataInputStream;
            synchronized (getOutputMinFrameDuration) {
                if (getOutputFormats == null) {
                    try {
                        getOutputFormats = new java.io.DataInputStream(new java.io.FileInputStream(getHighSpeedVideoSizesFor));
                    } catch (java.io.IOException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("炊\ue48f紓怃流Ꮳ㷫耜\u139a峴\ue57b\uf3ad붎歸똄", (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 36943), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 617287619, "㴥㓰俛熐", "\u0000\u0000\u0000\u0000", objArr);
                        sb.append(((java.lang.String) objArr[0]).intern());
                        sb.append(getHighSpeedVideoSizesFor);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("읍踕蓁㊈⟝떥뭯ྣ룷\ue828碏䱚", (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "䤎\udab5뾃쇤", "\u0000\u0000\u0000\u0000", objArr2);
                        sb.append(((java.lang.String) objArr2[0]).intern());
                        throw new java.lang.SecurityException(sb.toString(), e);
                    }
                }
                dataInputStream = getOutputFormats;
            }
            return dataInputStream;
        }

        private static java.io.OutputStream getHighSpeedVideoSizes() throws java.io.IOException {
            java.io.OutputStream outputStream;
            synchronized (getOutputMinFrameDuration) {
                if (getInputFormats == null) {
                    getInputFormats = new java.io.FileOutputStream(getHighSpeedVideoSizesFor);
                }
                outputStream = getInputFormats;
            }
            return outputStream;
        }

        static void Camera2StreamConfigurationMap() {
            getHighSpeedVideoFpsRanges = 2457411417541981002L;
            getInputSizeshNQ4ISI = 294925130;
            getHighSpeedVideoSizes = (char) 11163;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (util.h.xy.cm.a.ma.class.equals(r3[0].getClass()) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getInputSizeshNQ4ISI() throws java.lang.SecurityException {
        int i = getOutputMinFrameDuration + 9;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0 || android.os.Build.VERSION.SDK_INT > 87) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ひ〡鬔鎆醿虹呷ᬸ瑨\ua7dc웿㾫晬\uf0e5\uea1a˟뇴ᶚᅵ혻鲣♁䑗륬\ue82d", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        java.security.Provider[] providers = java.security.Security.getProviders(((java.lang.String) objArr[0]).intern());
        if (providers != null) {
            int i2 = getOutputMinFrameDuration + 73;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0 ? providers.length > 0 : providers.length > 0) {
            }
        }
        java.security.Security.insertProviderAt(new util.h.xy.cm.a.ma(), 1);
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ue020࿙\ue04a煌𤋮\uddff骒㳢㝞슎돑敐仵ꯟ\ueb6d䶗斩琳\u0087뫶봃岸㧖\ue326퓢◜儚쮗\uebaf\u0e00", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr2);
            java.security.SecureRandom secureRandom = (java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(null).newInstance(null);
            if (!util.h.xy.cm.a.ma.class.equals(secureRandom.getProvider().getClass())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\udadf\udab1\ueb02\u09d2\ue1a9\u1c39콳\uf1b4\uef39\ud7ca岎ꓮ賝胲灧馂嬙涻謒䵆瘗嘮\ude65∑ʦ̬\uf1e6\u17de\ud9eb\uef97ҷ쳺\uf477\ud888塯ꆤ荱蕀獅镃幕渀蛛䨲檋嬲\ud987㾙Ɨ", android.graphics.ImageFormat.getBitsPerPixel(0) + 1, objArr3);
                sb.append(((java.lang.String) objArr3[0]).intern());
                sb.append(secureRandom.getProvider().getClass());
                throw new java.lang.SecurityException(sb.toString());
            }
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\uf369\uf33a쭽箍쇻湐窧\ud801嫼\uf7af⻊ᄙ", android.text.TextUtils.indexOf("", ""), objArr4);
                try {
                    java.lang.Object[] objArr5 = {((java.lang.String) objArr4[0]).intern()};
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ue020࿙\ue04a煌𤋮\uddff骒㳢㝞슎돑敐仵ꯟ\ueb6d䶗斩琳\u0087뫶봃岸㧖\ue326퓢◜儚쮗\uebaf\u0e00", android.view.ViewConfiguration.getScrollBarSize() >> 8, objArr6);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr6[0]);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("늌좊닫០㴻吉ﰼ딼斲ם핬\ueca4᱂沝跍", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr7);
                    java.security.SecureRandom secureRandom2 = (java.security.SecureRandom) cls.getMethod((java.lang.String) objArr7[0], java.lang.String.class).invoke(null, objArr5);
                    int i3 = getOutputMinFrameDuration + 97;
                    getHighSpeedVideoFpsRanges = i3 % 128;
                    if (i3 % 2 != 0) {
                        util.h.xy.cm.a.ma.class.equals(secureRandom2.getProvider().getClass());
                        throw null;
                    }
                    if (util.h.xy.cm.a.ma.class.equals(secureRandom2.getProvider().getClass())) {
                        return;
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{1883429514, -1458684581, 1933595223, -1661877445, 202230662, -1875932128, -1354247601, -1722307927, 1608331562, 830011757, 701076556, 1088372633, 596492860, 156618591, -213136767, -604770822, -183183918, -869103431, 1770894530, 1933892627, 1470516475, 1783200647, -2131817337, 1090732626, -902181020, 506653211, -1287004205, -60880401, -179142282, -141343468, -2092983421, -1234069990}, 63 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr8);
                    sb2.append(((java.lang.String) objArr8[0]).intern());
                    sb2.append(secureRandom2.getProvider().getClass());
                    throw new java.lang.SecurityException(sb2.toString());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.security.NoSuchAlgorithmException e) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u139cᏏも놬㨄ꑱᶗ㣴㷌\u0c50\ue4eb瘩䗌孔젒䭢鈔똓㍃龿뼕跆晬\uf0e4쯨\ud887", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr9);
                throw new java.lang.SecurityException(((java.lang.String) objArr9[0]).intern(), e);
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static class ma extends java.security.Provider {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static final long serialVersionUID = -9066126413676138745L;
        private static char[] getHighResolutionOutputSizeshNQ4ISI = {41919, 41969, 41868, 41876, 41912, 41905, 41900, 41915, 41965, 41908, 41872, 41917, 41970, 41913, 41980, 41898, 41914, 41971, 41899, 41902, 41897, 41871, 41904, 41907, 41903, 41874, 41918, 41883, 41906, 41877, 41885, 41909, 41916, 41892, 41870, 41896};
        private static char getHighSpeedVideoSizes = 38464;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ma() {
            super(r1, 1.0d, ((java.lang.String) r5[0]).intern());
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8), "\u0007\"\u001a\u0016 \u0003\u001f\u001c㗥", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (28 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), " \f\u0007\"\u001a\u0016\u001f\u0003\u001e\f\f\u0001\"\r\u001e\u0001\r\u0014\n\u001d\u0005\u0016\u0002\u0011\u001a\u0016\u0002\u001d\u0013\u0019\f\b\u0014\u0012\r!\u0001\u0010\u0014\r!\u000b\u0011\u0005\u0014\u001a\u0019\f\u001a\f\u0010\u0005\u000e\u0010\u000e\u0017\u0017\u0007\"\n\u001d\u000b", android.text.TextUtils.getOffsetAfter("", 0) + 62, objArr2);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 79), "\u0013\u000f\u0002\u0012\u0019\u0013#\n\"\n\u001d\u000b\u000f\u0012\u0000!\u000e\b\u001f\u001c㘬", android.view.View.resolveSize(0, 0) + 21, objArr3);
            put(((java.lang.String) objArr3[0]).intern(), util.h.xy.cm.a.b.class.getName());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (88 - android.view.View.resolveSizeAndState(0, 0, 0)), "\u0013\u000f\u0002\u0012\u0019\u0013#\n\"\n\u001d\u000b\u000f\u0012\u0000!\u000e\b\u001f\u001c\u001a\u000f#\u000b\n\u0012\u0011\u0001\u0010\u0019\u001f\u0011\u0005\u001c㙌", 36 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
            java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 121), "\u0016\u0012\u0011\"\u0017\u0006\u0019\u0013", 8 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr5);
            put(intern2, ((java.lang.String) objArr5[0]).intern());
        }

        private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2;
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 91) % 128;
            char[] charArray = str.toCharArray();
            util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
            char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
            if (cArr != null) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 115) % 128;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    int i4 = (getHighSpeedVideoFpsRanges + 33) % 128;
                    Camera2StreamConfigurationMap = i4;
                    cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
                    i3++;
                    getHighSpeedVideoFpsRanges = (i4 + 31) % 128;
                }
                cArr = cArr2;
            }
            char c = (char) (4042185467053315654L ^ getHighSpeedVideoSizes);
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                int i5 = getHighSpeedVideoFpsRanges + 113;
                Camera2StreamConfigurationMap = i5 % 128;
                if (i5 % 2 == 0) {
                    i2 = i + 31;
                    cArr3[i2] = (char) (charArray[i2] << b);
                } else {
                    i2 = i - 1;
                    cArr3[i2] = (char) (charArray[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                mcVar.f2638 = 0;
                while (mcVar.f2638 < i2) {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                    if (mcVar.f2641 == mcVar.f2636) {
                        cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                        cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                        int i6 = getHighSpeedVideoFpsRanges + 63;
                        Camera2StreamConfigurationMap = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        mcVar.f2639 = mcVar.f2641 / c;
                        mcVar.f2640 = mcVar.f2641 % c;
                        mcVar.f2637 = mcVar.f2636 / c;
                        mcVar.f2635 = mcVar.f2636 % c;
                        if (mcVar.f2640 == mcVar.f2635) {
                            mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                            mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                            int i8 = mcVar.f2639;
                            int i9 = mcVar.f2640;
                            int i10 = mcVar.f2637;
                            int i11 = mcVar.f2635;
                            cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                            cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                        } else if (mcVar.f2639 == mcVar.f2637) {
                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 77) % 128;
                            mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                            mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                            int i12 = mcVar.f2639;
                            int i13 = mcVar.f2640;
                            int i14 = mcVar.f2637;
                            int i15 = mcVar.f2635;
                            cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                            cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                        } else {
                            int i16 = mcVar.f2639;
                            int i17 = mcVar.f2635;
                            int i18 = mcVar.f2637;
                            int i19 = mcVar.f2640;
                            cArr3[mcVar.f2638] = cArr[(i16 * c) + i17];
                            cArr3[mcVar.f2638 + 1] = cArr[(i18 * c) + i19];
                        }
                    }
                    mcVar.f2638 += 2;
                }
            }
            for (int i20 = 0; i20 < i; i20++) {
                cArr3[i20] = (char) (cArr3[i20] ^ 13722);
            }
            objArr[0] = new java.lang.String(cArr3);
        }
    }

    private static byte[] getOutputFormats() {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(java.lang.System.currentTimeMillis());
            dataOutputStream.writeLong(java.lang.System.nanoTime());
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 125) % 128;
            try {
                dataOutputStream.writeInt(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue());
                try {
                    dataOutputStream.writeInt(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myUid", null).invoke(null, null)).intValue());
                    dataOutputStream.write(getHighSpeedVideoFpsRangesFor);
                    dataOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    int i = getHighSpeedVideoFpsRanges + 3;
                    getOutputMinFrameDuration = i % 128;
                    if (i % 2 != 0) {
                        return byteArray;
                    }
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (java.io.IOException e) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᛄᚂ坃ꊻ巬띎㵌㶙ᵊ殎\uf7ba嚜䃛㳲\udb25毵霂퇿⁸뼹멐\uea27甒큳캹뽯媞", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr);
            throw new java.lang.SecurityException(((java.lang.String) objArr[0]).intern(), e);
        }
    }

    private static java.lang.String getHighSpeedVideoSizesFor() {
        java.lang.Class<?> cls;
        java.lang.String str;
        int i = getHighSpeedVideoFpsRanges + 121;
        getOutputMinFrameDuration = i % 128;
        try {
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("뚼糄뛝䁭襾盱ꮡ響憃놉英츓ᡳ\ud8c3\uda0b\ue6af㌹ݩ㆙ᇹ", (-1) >>> (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("뜉띚\u1754\u001cᷟᗒ癒鱰噱⮕", android.graphics.drawable.Drawable.resolveOpacity(0, 1), objArr2);
                str = (java.lang.String) objArr2[0];
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("뚼糄뛝䁭襾盱ꮡ響憃놉英츓ᡳ\ud8c3\uda0b\ue6af㌹ݩ㆙ᇹ", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr3);
                cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("뜉띚\u1754\u001cᷟᗒ癒鱰噱⮕", android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr4);
                str = (java.lang.String) objArr4[0];
            }
            java.lang.String str2 = (java.lang.String) cls.getField(str.intern()).get(null);
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 105) % 128;
            return str2;
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.NoSuchFieldException | java.lang.SecurityException unused) {
            return null;
        }
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("뚼糄뛝䁭襾盱ꮡ響憃놉英츓ᡳ\ud8c3\uda0b\ue6af㌹ݩ㆙ᇹ", android.view.View.getDefaultSize(0, 0), objArr);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("▆Ĕ◀蕞\uf489쮓溸⪨\uf293챢䟶猍譯ꔮὂ", android.os.Process.myPid() >> 22, objArr2);
        java.lang.String str = (java.lang.String) cls.getField((java.lang.String) objArr2[0]).get(null);
        if (str != null) {
            int i = getHighSpeedVideoFpsRanges + 29;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 == 0) {
                sb.append(str);
                throw null;
            }
            sb.append(str);
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 49) % 128;
        }
        java.lang.String highSpeedVideoSizesFor = getHighSpeedVideoSizesFor();
        if (highSpeedVideoSizesFor != null) {
            sb.append(highSpeedVideoSizesFor);
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 95) % 128;
        }
        try {
            java.lang.String obj = sb.toString();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᮊᯟ\uded4킁푎앛㴚りᵝ", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr3);
            return obj.getBytes(((java.lang.String) objArr3[0]).intern());
        } catch (java.io.UnsupportedEncodingException unused) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-139358836, 30468743, 1045777490, -1799210778, 2113169936, -318006212, -1675153032, -1712974021, -413934891, 194236130, -868543321, 1426925041, -999607243, 1453866499}, 28 - android.graphics.Color.alpha(0), objArr4);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr4[0]).intern());
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputFormats = -1833855516474077700L;
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = 3906602450664944358L;
        getHighSpeedVideoSizes = new int[]{1627477105, -2075777693, 1057184892, -280947315, 261031812, 425766135, -859755062, 2054379738, 1981120451, 200880583, 839784317, 608243410, -1361462335, 751859852, 606935667, -441831019, -1385480920, -480286454};
    }
}
