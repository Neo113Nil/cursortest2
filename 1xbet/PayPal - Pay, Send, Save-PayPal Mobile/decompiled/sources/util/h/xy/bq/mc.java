package util.h.xy.bq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
final class mc {
    private static int Camera2StreamConfigurationMap = 1;
    public static final util.h.xy.bq.mc getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    static int getHighSpeedVideoFpsRangesFor = 0;
    static int getHighSpeedVideoSizes = 1;
    private static long getHighSpeedVideoSizesFor;
    private static final /* synthetic */ util.h.xy.bq.mc[] getInputFormats;
    private static short[] getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static byte[] getOutputMinFrameDuration;
    private static int getOutputSizes;
    private static final java.lang.String getOutputSizeshNQ4ISI;
    private static int getOutputStallDuration;

    private mc(java.lang.String str) {
    }

    public static util.h.xy.bq.mc valueOf(java.lang.String str) {
        int i = getHighSpeedVideoSizes + 33;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.bq.mc mcVar = (util.h.xy.bq.mc) java.lang.Enum.valueOf(util.h.xy.bq.mc.class, str);
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = getHighSpeedVideoFpsRangesFor + 41;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return mcVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.bq.mc[] values() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 73) % 128;
        util.h.xy.bq.mc[] mcVarArr = (util.h.xy.bq.mc[]) getInputFormats.clone();
        int i = getHighSpeedVideoSizes + 77;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return mcVarArr;
        }
        throw null;
    }

    static {
        util.h.xy.bq.mc[] mcVarArr;
        getHighSpeedVideoSizes();
        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((pressedStateDuration >> 16) - 169120517, (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (-80) - android.view.View.resolveSize(0, 0), 310279772 - android.text.TextUtils.indexOf("", ""), objArr);
        util.h.xy.bq.mc mcVar = new util.h.xy.bq.mc(((java.lang.String) objArr[0]).intern());
        getHighResolutionOutputSizeshNQ4ISI = mcVar;
        int i = getHighSpeedVideoSizes;
        int i2 = i + 5;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            mcVarArr = new util.h.xy.bq.mc[1];
            mcVarArr[1] = mcVar;
        } else {
            mcVarArr = new util.h.xy.bq.mc[]{mcVar};
        }
        getInputFormats = mcVarArr;
        getOutputSizeshNQ4ISI = "mc";
        int i3 = i + 97;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static void Camera2StreamConfigurationMap(long j, char c) {
        int i = (getHighSpeedVideoFpsRangesFor + 95) % 128;
        getHighSpeedVideoSizes = i;
        if (j <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("䲙䳘ᨹ澞魕爊炮ጡ鯟嚿姉䫥\ue2ba㸃˟緋즕\ue15b\uea2f钽ၕ젺팅쿕", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (j >= com.gemalto.mfs.mwsdk.payment.engine.remote.DSRPConstants.MAX_AMOUNT_LIMIT) {
            getHighSpeedVideoFpsRangesFor = (i + 55) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("켋콆ﳸ襓↡걥쩍쵒ᡎ끿\ue370铃愺\ud88f렪ꎾ䨝ߎ傍䫟鏂\u2eff槼ᇯﳣ唏㺅㤠얞簧흁쁎\u2d77ꬻ", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
        }
        if (c < 0 || c > 999) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("㔚㕓蜡\uf285\ue113벼૱\udd83\ue25e쮺⏋萚鬉ꍎ碅덠뀇簍遼娓榚唈ꥈĦڷ", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr3);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
        }
    }

    static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges + 77;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizesFor ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizesFor ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 7) % 128;
        objArr[0] = str2;
    }

    static void getHighSpeedVideoFpsRangesFor(char c, com.gemalto.mfs.mwsdk.payment.engine.TransactionType transactionType, com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType cryptogramDataType) {
        if (c < 0 || c > 999) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ꖑꗘ(疌錅ᕻ磧瑄狕䲳凝ⷝஂ\u245dઔ᪻\u209d\ufb18\ue270\uf38d沈툭\udb55꣠", 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (transactionType == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.argb(0, 0, 0, 0) - 169120676, (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (byte) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-80) - android.view.View.resolveSizeAndState(0, 0, 0), 310279784 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
        }
        if (transactionType != com.gemalto.mfs.mwsdk.payment.engine.TransactionType.PURCHASE) {
            int i = getHighSpeedVideoSizes + 35;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                com.gemalto.mfs.mwsdk.payment.engine.TransactionType transactionType2 = com.gemalto.mfs.mwsdk.payment.engine.TransactionType.CASH;
                throw null;
            }
            if (transactionType != com.gemalto.mfs.mwsdk.payment.engine.TransactionType.CASH && transactionType != com.gemalto.mfs.mwsdk.payment.engine.TransactionType.PURCHASE_WITH_CASHBACK) {
                int i2 = getHighSpeedVideoSizes + 75;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    com.gemalto.mfs.mwsdk.payment.engine.TransactionType transactionType3 = com.gemalto.mfs.mwsdk.payment.engine.TransactionType.REFUND;
                    throw null;
                }
                if (transactionType != com.gemalto.mfs.mwsdk.payment.engine.TransactionType.REFUND) {
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 169120653, (short) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1), (byte) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 80, 310279772 - android.view.View.resolveSizeAndState(0, 0, 0), objArr3);
                        throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
        }
        if (cryptogramDataType == null) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("⯇⮄ꀒ햪㒾坉\udf53㙧ﲛ\uec8f\uf665澽藶葥굺墣껞嬤䗓놿眳爁糺\uead2ᠯ৩⮑쉏ⅹ\u20fd쉶㭋", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, objArr4);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr4[0]).intern());
        }
        if (cryptogramDataType == com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType.UCAF || cryptogramDataType == com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType.DE55) {
            return;
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 31) % 128;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("궝귔¬甈䃻濻\uab19ໄ站䰷舣坝ΎⓄ\ud966急⢑ﮁ㆐襟\uf15c튫࣯퉁鸴ꥊ忆\ufafdꜹ聯똏ϐ侥在贸⳿ᓽ\u2feb\ue44e甖㶁ۻ㭵鹾쩬\udd84Ꮋ", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr5);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr5[0]).intern());
    }

    static void Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        if (paymentType == null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 37) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(0, 0, 0) - 169120613, (short) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 81, 310279779 - android.graphics.Color.alpha(0), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 39) % 128;
            if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 75) % 128;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-169120594) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 80, 310279780 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
            }
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 57) % 128;
    }

    final void getHighSpeedVideoSizes(util.h.xy.bq.rc rcVar) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 3) % 128;
        long m25578 = rcVar.m25578();
        char m25581 = rcVar.m25581();
        rcVar.m25583();
        rcVar.m25577();
        rcVar.m25572();
        rcVar.m25576();
        rcVar.m25575();
        Camera2StreamConfigurationMap(rcVar.m25579());
        Camera2StreamConfigurationMap(m25578, m25581);
        int i = getHighSpeedVideoFpsRangesFor + 115;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r3 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ab, code lost:
    
        if (r3 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getOutputStallDuration ^ (-2689713159175858216L)));
        if (i6 == -1) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 115) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i7 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (i7 + 69) % 128;
            byte[] bArr2 = getOutputMinFrameDuration;
            if (bArr2 != null) {
                int i8 = i7 + 21;
                getHighSpeedVideoFpsRanges = i8 % 128;
                if (i8 % 2 != 0) {
                    length = bArr2.length;
                    bArr = new byte[length];
                } else {
                    length = bArr2.length;
                    bArr = new byte[length];
                }
                for (int i9 = 0; i9 < length; i9++) {
                    bArr[i9] = (byte) (bArr2[i9] ^ (-2689713159175858216L));
                }
                bArr2 = bArr;
            }
            i6 = bArr2 != null ? (byte) (((byte) (getOutputMinFrameDuration[((int) (getOutputSizes ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputStallDuration ^ (-2689713159175858216L)))) : (short) (((short) (getInputSizeshNQ4ISI[((int) (getOutputSizes ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputStallDuration ^ (-2689713159175858216L))));
        }
        if (i6 > 0) {
            int i10 = Camera2StreamConfigurationMap + 31;
            getHighSpeedVideoFpsRanges = i10 % 128;
            if (i10 % 2 != 0) {
                i4 = (i << i6) + 2 + ((int) (getOutputSizes - 2689713159175858216L));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getOutputSizes ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputMinFrameDuration;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    bArr4[i11] = (byte) (bArr3[i11] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 109) % 128;
                    byte[] bArr5 = getOutputMinFrameDuration;
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
        objArr[0] = sb.toString();
    }

    public static void getHighSpeedVideoFpsRangesFor(util.h.xy.bq.rc rcVar) {
        long m25578 = rcVar.m25578();
        char m25581 = rcVar.m25581();
        char m25583 = rcVar.m25583();
        byte[] m25574 = rcVar.m25574();
        rcVar.m25584();
        if (m25578 < 0) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 97) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 169120567, (short) android.graphics.Color.green(0), (byte) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (-79) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 310279764, objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (m25581 < 0) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 13) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("㔚㕓蜡\uf285\ue113벼૱\udd83\ue25e쮺⏋萚鬉ꍎ碅덠뀇簍遼娓榚唈ꥈĦڷ", android.view.View.getDefaultSize(0, 0), objArr2);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
        }
        if (m25583 >= 0) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 67) % 128;
            if (m25583 <= 999) {
                if (util.h.xy.ar.b.m25070(m25574)) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((-169120548) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) android.graphics.Color.green(0), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (-80) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 310279764, objArr3);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
                }
                if (util.h.xy.ar.b.m25084(m25574) >= 0) {
                    return;
                }
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 111) % 128;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 169120534, (short) android.graphics.Color.blue(0), (byte) android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 80, 310279772 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr4[0]).intern());
            }
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ꖑꗘ(疌錅ᕻ磧瑄狕䲳凝ⷝஂ\u245dઔ᪻\u209d\ufb18\ue270\uf38d沈툭\udb55꣠", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr5);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr5[0]).intern());
    }

    static void getHighSpeedVideoSizes(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = 8096061789350104546L;
        getOutputSizes = -306871172;
        getOutputStallDuration = -408873065;
        getOutputFormats = 169907765;
        getOutputMinFrameDuration = new byte[]{17, -40, 47, -33, -106, 117, -46, -111, 99, 45, 47, -35, -116, 106, 39, -34, 45, -55, -38, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -35, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -58, 0, 42, -55, 38, 41, -43, 41, -39, -54, -52, -11, 118, -37, -47, -98, 99, 45, 47, -3, -20, 106, 39, -34, 45, -55, -38, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -35, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -58, -20, 100, 35, 37, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -48, -3, com.google.common.base.Ascii.GS, -40, 47, -33, -106, 117, -46, -111, 99, 45, 47, -35, -116, 116, -34, -47, 32, 44, com.visa.cbp.getEncExpo.startTransaction, -55, 19, 39, 41, -38, -37, 39, -40, 35, -38, -117, 116, -35, -39, -106, 99, 45, 47, -35, -116, 116, -34, -47, 32, 44, com.visa.cbp.getEncExpo.startTransaction, -55, com.google.common.base.Ascii.ESC, 117, -41, -54, -21, 116, -35, -39, -106, 117, -46, -111, 116, -34, 33, -34, -38, -12, com.google.common.base.Ascii.EM, -40, 47, -33, -10, 117, -46, -111, 103, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -53, 37, -100, 4, 35, -48, com.google.common.base.Ascii.EM, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -53, 37, -100, 4, 35, -48, -7, 100, 35, 37, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -48, -3, 97, -38, 45, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -39, -35, -35};
    }
}
