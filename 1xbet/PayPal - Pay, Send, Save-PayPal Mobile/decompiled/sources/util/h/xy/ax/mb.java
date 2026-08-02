package util.h.xy.ax;

/* loaded from: classes5.dex */
public class mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static util.h.xy.ax.mb getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoSizes;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private java.lang.String getOutputSizeshNQ4ISI;

    static {
        int i = Camera2StreamConfigurationMap + 59;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (r0.charAt(r12) == '/') goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b3, code lost:
    
        if (r3.charAt(r2) == '/') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x024d, code lost:
    
        if (r4 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0260, code lost:
    
        if (r4 == null) goto L91;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0288: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:106:0x0288 */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0284 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private mb() {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2;
        java.io.InputStream inputStream3;
        int i;
        java.util.Properties properties;
        java.lang.String highSpeedVideoFpsRanges;
        java.lang.String highSpeedVideoFpsRanges2;
        java.lang.String highSpeedVideoFpsRanges3;
        java.lang.String highSpeedVideoFpsRanges4;
        java.lang.String highSpeedVideoFpsRanges5;
        java.lang.String highSpeedVideoFpsRanges6;
        java.lang.String highSpeedVideoFpsRanges7;
        java.lang.String highSpeedVideoFpsRanges8;
        int i2;
        int length;
        this.getInputFormats = com.adjust.sdk.Constants.CONNECTION_TIMEOUT_VERIFY;
        this.getOutputMinFrameDuration = com.adjust.sdk.Constants.CONNECTION_TIMEOUT_VERIFY;
        this.getOutputFormats = 3;
        this.getHighResolutionOutputSizeshNQ4ISI = 10000;
        try {
        } catch (java.lang.Throwable th) {
            th = th;
            inputStream2 = inputStream;
        }
        try {
            try {
                android.content.res.AssetManager assets = util.h.xy.bh.ra.m25484().m25485().getAssets();
                properties = new java.util.Properties();
                inputStream3 = assets.open(util.h.xy.al.ra.f531);
            } catch (java.io.IOException unused) {
            }
            try {
                properties.load(inputStream3);
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(properties.getProperty(util.h.xy.al.ra.f757));
                highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(properties.getProperty(util.h.xy.al.ra.f670));
                highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(properties.getProperty(util.h.xy.al.ra.f749));
                highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(properties.getProperty(util.h.xy.al.ra.f592));
                highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(properties.getProperty(util.h.xy.al.ra.f657));
                highSpeedVideoFpsRanges6 = getHighSpeedVideoFpsRanges(properties.getProperty(util.h.xy.al.ra.f582));
                highSpeedVideoFpsRanges7 = getHighSpeedVideoFpsRanges(properties.getProperty(util.h.xy.al.ra.f523));
                highSpeedVideoFpsRanges8 = getHighSpeedVideoFpsRanges(properties.getProperty(util.h.xy.al.ra.f521));
            } catch (java.io.FileNotFoundException e) {
                e = e;
                e.getMessage();
                if (inputStream3 != null) {
                    inputStream3.close();
                }
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 35) % 128;
                i = Camera2StreamConfigurationMap + 81;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                }
            } catch (java.io.IOException e2) {
                e = e2;
                e.getMessage();
            } catch (java.lang.Exception e3) {
                e = e3;
                e.getMessage();
                if (inputStream3 != null) {
                    inputStream3.close();
                }
                i = Camera2StreamConfigurationMap + 81;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                }
            }
        } catch (java.io.FileNotFoundException e4) {
            e = e4;
            inputStream3 = null;
        } catch (java.io.IOException e5) {
            e = e5;
            inputStream3 = null;
        } catch (java.lang.Exception e6) {
            e = e6;
            inputStream3 = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStream2 = null;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
        if (highSpeedVideoFpsRanges != null) {
            int i3 = getHighSpeedVideoSizes + 107;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (highSpeedVideoFpsRanges.length() > 0) {
                int i4 = getHighSpeedVideoSizes;
                int i5 = ((i4 | 81) << 1) - (i4 ^ 81);
                Camera2StreamConfigurationMap = i5 % 128;
                if (i5 % 2 == 0) {
                    length = highSpeedVideoFpsRanges.length();
                    if (highSpeedVideoFpsRanges.charAt(length) == 'T') {
                        highSpeedVideoFpsRanges = highSpeedVideoFpsRanges.substring(0, length);
                    }
                } else {
                    length = highSpeedVideoFpsRanges.length() - 1;
                }
                inputStream3.close();
                i = Camera2StreamConfigurationMap + 81;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        if (highSpeedVideoFpsRanges8 != null) {
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i6 = ~((identityHashCode ^ (-1505924399)) | (identityHashCode & (-1505924399)));
            int i7 = (i6 ^ 16782604) | (i6 & 16782604);
            int i8 = ~((identityHashCode ^ (-589641038)) | ((-589641038) & identityHashCode));
            int i9 = ((i7 ^ i8) | (i7 & i8)) * (-880);
            int i10 = ((i9 | (-642789045)) << 1) - (i9 ^ (-642789045));
            int i11 = ~((-1505924399) | (~identityHashCode));
            int i12 = (i11 ^ 589641037) | (i11 & 589641037);
            int i13 = ~(identityHashCode | 1505924398);
            int i14 = ((i12 ^ i13) | (i12 & i13)) * (-880);
            int i15 = -(-((~((identityHashCode ^ 1505924398) | (identityHashCode & 1505924398))) * 880));
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i16 = ((identityHashCode2 ^ (-1278955356)) | (identityHashCode2 & (-1278955356)) | 490968186) * (-676);
            int i17 = ~identityHashCode2;
            int i18 = ~((i17 ^ (-1278955356)) | ((-1278955356) & i17));
            int i19 = (~((i17 & 490968186) | (i17 ^ 490968186))) | (-1568399228);
            int i20 = ~(identityHashCode2 | (-201524315));
            if (((((i10 | i14) << 1) - (i10 ^ i14)) - (~i15)) - 1 <= (((((i16 & (-1873305083)) + (i16 | (-1873305083))) - (~(((1077431041 & i18) | (i18 ^ 1077431041)) * 676))) - 1) - (~(-(-(((i20 & i19) | (i19 ^ i20)) * 676))))) - 1) {
                throw new java.lang.NullPointerException();
            }
            if (highSpeedVideoFpsRanges8.length() > 0) {
                int i21 = getHighSpeedVideoSizes;
                int i22 = ((i21 | 41) << 1) - (i21 ^ 41);
                Camera2StreamConfigurationMap = i22 % 128;
                if (i22 % 2 == 0) {
                    i2 = highSpeedVideoFpsRanges8.length() >> 1;
                    if (highSpeedVideoFpsRanges8.charAt(i2) == ')') {
                        highSpeedVideoFpsRanges8 = highSpeedVideoFpsRanges8.substring(0, i2);
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 121) % 128;
                    }
                } else {
                    i2 = (-2) - (~highSpeedVideoFpsRanges8.length());
                }
                inputStream3.close();
                i = Camera2StreamConfigurationMap + 81;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                }
            }
        }
        this.getInputSizeshNQ4ISI = highSpeedVideoFpsRanges;
        if (highSpeedVideoFpsRanges2 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 121) % 128;
            if (highSpeedVideoFpsRanges2.length() > 0) {
                this.getInputFormats = java.lang.Integer.parseInt(highSpeedVideoFpsRanges2);
            }
        }
        if (highSpeedVideoFpsRanges3 != null) {
            int i23 = Camera2StreamConfigurationMap + 87;
            getHighSpeedVideoSizes = i23 % 128;
            if (i23 % 2 != 0) {
                throw null;
            }
            if (highSpeedVideoFpsRanges3.length() > 0) {
                this.getOutputMinFrameDuration = java.lang.Integer.parseInt(highSpeedVideoFpsRanges3);
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 93) % 128;
            }
        }
        if (highSpeedVideoFpsRanges4 != null && highSpeedVideoFpsRanges4.length() > 0) {
            int i24 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = (((i24 | 117) << 1) - (i24 ^ 117)) % 128;
            this.getOutputFormats = java.lang.Integer.parseInt(highSpeedVideoFpsRanges4);
            int i25 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i25 & 13) + (i25 | 13)) % 128;
        }
        if (highSpeedVideoFpsRanges5 != null) {
            int i26 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = (((i26 | 49) << 1) - (i26 ^ 49)) % 128;
            if (highSpeedVideoFpsRanges5.length() > 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.parseInt(highSpeedVideoFpsRanges5);
            }
        }
        this.getOutputSizeshNQ4ISI = highSpeedVideoFpsRanges6;
        this.getHighSpeedVideoSizesFor = highSpeedVideoFpsRanges7;
        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges8;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.ax.mb m25250() {
        util.h.xy.ax.mb mbVar;
        synchronized (util.h.xy.ax.mb.class) {
            int i = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = ((i ^ 37) + ((i & 37) << 1)) % 128;
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = new util.h.xy.ax.mb();
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 39) % 128;
            }
            mbVar = getHighSpeedVideoFpsRanges;
            int i2 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = ((i2 ^ 13) + ((i2 & 13) << 1)) % 128;
        }
        return mbVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public util.h.xy.au.re m25252() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 121) + ((i & 121) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.getInputSizeshNQ4ISI;
        if (str == null || str.length() <= 0) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 27) % 128;
            return null;
        }
        util.h.xy.au.re reVar = new util.h.xy.au.re(this.getInputSizeshNQ4ISI, this.getInputFormats, this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI);
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 39) % 128;
        return reVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.au.rf m25253() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 3) + (i | 3);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.getOutputSizeshNQ4ISI;
        if (str == null || str.length() <= 0) {
            int i3 = Camera2StreamConfigurationMap + 3;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        return new util.h.xy.au.rf(this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public util.h.xy.au.e m25251() {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i ^ 25) + ((i & 25) << 1)) % 128;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (str == null) {
            return null;
        }
        int i2 = (i & 117) + (i | 117);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str.length() <= 0) {
            return null;
        }
        util.h.xy.au.e eVar = new util.h.xy.au.e(this.getHighSpeedVideoFpsRangesFor);
        int i3 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i3 ^ 89) + ((i3 & 89) << 1)) % 128;
        return eVar;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 19) << 1) - (i ^ 19);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            if (str == null || str.length() == 0) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 25) % 128;
                return str;
            }
            java.lang.String trim = str.trim();
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 7) % 128;
            return trim;
        }
        throw new java.lang.ArithmeticException();
    }
}
