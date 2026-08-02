package com.payair.hce;

/* loaded from: classes4.dex */
public class getDescription extends com.payair.hce.getReasonCode<java.lang.Byte> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static int values;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        ?? r6 = 113 - b;
        int i3 = 4 - (s * 2);
        int i4 = 1 - (s2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            byte b2 = r6;
            i = 0;
            int i5 = i3;
            i3++;
            i2 = i5 + (-b2);
            bArr2[i] = i2 == true ? (byte) 1 : (byte) 0;
            i++;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i3];
            i5 = i2;
            i3++;
            i2 = i5 + (-b2);
            bArr2[i] = i2 == true ? (byte) 1 : (byte) 0;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = r6;
            bArr2[i] = i2 == true ? (byte) 1 : (byte) 0;
            i++;
            if (i == i4) {
            }
        }
    }

    /* synthetic */ getDescription(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        values = (valueOf + 9) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ue66b㯳嶯習", 56807 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern());
        values = (valueOf + 63) % 128;
        return values2;
    }

    private getDescription() {
        try {
            valueOf(null);
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.graphics.Color.alpha(0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1842, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3600));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (DigitizedCardProfile ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1442 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (29682 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, (byte) 1, (short) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $10 = ($11 + 39) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i3 = $10 + 47;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 64, 1443 - android.graphics.Color.blue(0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 29682));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((short) 0, (byte) 1, (short) 0, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                throw null;
            }
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj4 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.graphics.Color.green(0), (-16775773) - android.graphics.Color.rgb(0, 0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29681));
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b((short) 0, (byte) 1, (short) 0, objArr9);
                obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public static com.payair.hce.setMobilePin<java.lang.Byte> writeReplace() {
        com.payair.hce.setMobilePin<java.lang.Byte> setmobilepin = new com.payair.hce.setMobilePin<java.lang.Byte>() { // from class: com.payair.hce.getDescription.4
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static int AlternateContactlessPaymentDataJson;
            private static char[] valueOf;
            private static int values;
            private static long writeReplace;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
                int i4;
                int i5 = 37 - (i * 34);
                byte[] bArr = $$a;
                int i6 = i2 + 65;
                int i7 = i3 * 2;
                char[] cArr = new char[i7 + 1];
                if (bArr == null) {
                    int i8 = i6;
                    i6 = i7;
                    i4 = 0;
                    i6 = (i6 + i8) - 2;
                    i5++;
                    cArr[i4] = (char) i6;
                    if (i4 == i7) {
                        objArr[0] = new java.lang.String(cArr);
                        return;
                    }
                    i4++;
                    i8 = bArr[i5];
                    i6 = (i6 + i8) - 2;
                    i5++;
                    cArr[i4] = (char) i6;
                    if (i4 == i7) {
                    }
                } else {
                    i4 = 0;
                    i5++;
                    cArr[i4] = (char) i6;
                    if (i4 == i7) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(short s, int i, short s2, java.lang.Object[] objArr) {
                int i2;
                int i3;
                int i4 = (s * 3) + 99;
                int i5 = 1 - (s2 * 3);
                byte[] bArr = $$d;
                int i6 = 4 - (i * 3);
                byte[] bArr2 = new byte[i5];
                if (bArr == null) {
                    int i7 = i5;
                    i3 = 0;
                    i4 += i7;
                    i6++;
                    i2 = i3;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i3 == i5) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i7 = bArr[i6];
                    i4 += i7;
                    i6++;
                    i2 = i3;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i3 == i5) {
                    }
                } else {
                    i2 = 0;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i3 == i5) {
                    }
                }
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<java.lang.Byte> valueOf() {
                com.payair.hce.getDescription getdescription = new com.payair.hce.getDescription((byte) 0);
                int i = values + 105;
                AlternateContactlessPaymentDataJson = i % 128;
                if (i % 2 == 0) {
                    return getdescription;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x01d1  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x01d2  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
                long j;
                java.lang.Throwable cause;
                com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
                long[] jArr = new long[i2];
                getcvmmodel.valueOf = 0;
                while (true) {
                    j = 0;
                    if (getcvmmodel.valueOf >= i2) {
                        break;
                    }
                    $11 = ($10 + 67) % 128;
                    int i3 = getcvmmodel.valueOf;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(valueOf[i + getcvmmodel.valueOf])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 48, 381 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (62388 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            c((short) 0, 0, (short) 0, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                        }
                        java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(writeReplace), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35, 3966 - android.view.KeyEvent.getDeadChar(0, 0), (char) (40222 - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                        }
                        jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                        java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.getDeadChar(0, 0), 211 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                    } catch (java.lang.Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                char[] cArr = new char[i2];
                getcvmmodel.valueOf = 0;
                while (getcvmmodel.valueOf < i2) {
                    $10 = ($11 + 35) % 128;
                    cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                    java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 212 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                    j = 0;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                AlternateContactlessPaymentDataJson = 0;
                values = 1;
                char[] cArr = new char[1707];
                java.nio.ByteBuffer.wrap("ÈÊÿ\u0098¦²mØ\u0014®Ûÿ\u0082\u001cI&pI'bîv\u0096\u0085]¡\u0004ÿËÚòö¹\u0011`>\u0017BÞM\u0085bM·t°;ªâÜ©÷P\n^\u0080iÒ0øû\u0092\u0082äMµ\u0014Vßlæ\u0003±(x<\u0000ÏËë\u0092µ]\u0081d±/Oöc\u00812H\u0010\u0013+ÛÐâê\u00adät\u0093^\u0080iÒ0øû\u0092\u0082äMµ\u0014Vßlæ\u0003±(x<\u0000ÏËë\u0092µ]\u0082d¡/Qöe\u0016\u0002!Gxf³\u0015Êf\u0005=\\Ô\u0097æ®\u0090ù 0²H\u0011\u0083fÚ\u0007\u0015\u001f,>gÛ¾íÉ\u009c\u0000\u009e[\u0086\u0093Bªjåf<\u0001w9\u008eÕÙ÷^\u0080iÓ0éû\u0087\u0082äM¶\u0014^ß.æ\u0017±<x:\u0000Ì^\u0080iÓ0éû\u0087\u0082äM¡\u0014PßmæI±>x'\u0000ÓËó^\u0080iÅ0ùû\u0087\u0082ªM \u0014]ß/æ5±\bx\u0018\u0000ÓËõ\u0092\u008f]µd¹/Kög\u0003O4\nm+¦Xßp\u0010xI\u009b\u0082à»Äìè%ø]\\\u0096 ÏL\u0000\\9yr\u0092«çÜÑ\u0015Ô^Íiß0úû\u008a\u0082¤Mª^\u0080iÅ0äû\u0097\u0082¿M·\u0014Tß/æ\u0005±'x;\u0000\u0093Ëí\u0092\u008f]\u009cd\u00ad/iöK\u0081@H\u001a\u0013>ÛÏâü\u00ad½t\u0094?±ÆK\u0091xXac\u0015*-^\u0080iÅ0äû\u0097\u0082¿M·\u0014Tß/æ\u0005±'x;\u0000\u0093Ëí\u0092\u008f]\u009cd\u00ad/iöK\u0081@H\u0004\u0013)ÛÍâùâAÕ\u0004\u008c%GV>~ñv¨\u0095cîZÊ\ræÄö¼Rw..BáRØw\u0093\u009bJª=Ùôã¯×g\u0013^:\u0011>ÈF\u00831z\u0097-¢^\u0080iÒ0øû\u0092\u0082äM¼\u0014\\ßmæ\u0012±)x \u0000ÙËð\u0092\u009e^ÝiÙ0³û\u0086\u0082¾M»\u0014UßdæI±&x:\u0000ÏË÷^ÁiÓ0üû\u0097\u0082®Mü\u0014Wßeæ\u0013\u0091(¦nÿG4#M\u0000\u0082UÛ÷\u0010Á)£~\u0083·\u008eÏm\u0004X]6\u0092<«\u001dàä^ÁiÓ0ðû\u0091\u0082¸M´ùæÎâ\u0097\u0088\\¯%\u0082ê\u0086³fxNA?\u0016\u0001ß@§êlÙ5¿ú¿Ã\u0085\u0088eQ^&\"ï:´\u0012|üEÀ^ÈiÓ0óû\u009d\rº:·c\u0091¨ÿÑÛ\u001e×^ói÷^\u0080iÆ0ïû\u008b\u0082¨Mý\u0014Tßoæ\u0003±;x9\u0000ÙËð^ÙiÔ0òû\u009c\u0082¬M§\u0014\\ßsæ\u0013^èiÓ0óû\u009d\u0082¦M½\u0014Mßiæ\b± ëMÜO\u0085aN\u001d73ø2¡ÀµÎ\u0082ÜÛí\u0010\u0089i¤¦¹ÿN4oä¾Óº\u008aÐA÷8Ú÷Þ®>e\u0016\\g\u000bYÂ\u0018º»q\u0085(ÿçûÞØ\u00959^ÙiÔ0òû\u009c\u0082óMä\u0014I^ÈiÓ0óû\u0081\u0082¹M»\u0014Z^ÈiÓ0óû\u0081\u0082¹M»\u0014Zß_æ\u001f±vxcS\u008ed\u0095=µöÇ\u008fÿ@ý\u0019\u001cÒ\u0019ëY¼0u%\r¥Æó\u009f\u0098Y\u009cn\u00987òüÕ\u0085øJü\u0013\u001cØ4áE¶{\u007f:\u0007\u0090Ì\u00ad\u0095ÏZÕcõµ9\u00827Û\u0013\u001bâ,óuÀ¾ Ç\u0082\b\u008eQ~\u009aZ\u0099.®\u0006÷-<\u0004EY\u008agÓ\u0097\u0018´!Îvã¿ðÇ\\\f%UE\u009aC£8è¼1®Fß\u008fÛÔö\u001c\u0007Î-ù\u001b :kU\u0012gÝx\u0084\u009eOãv÷!ÉèÝ\u0090_[\"\u0002\\Í[ôw¿\u0088få\u0011ÈØØ\u0083êKAr2=kä\u0002\u0082\u0083µµì\u0094'û^É\u0091ÖÈ0\u0003M:Ymg¤sÜñ\u0017\u008cNò\u0081õ¸Ùó&*K]f\u0094vÏD\u0007ï>\u009cqÅ¨¬ãì\u001a~MUë®Üª\u0085ÀNÿ7ÙøÓ¡.j\u0004Su\u0004OÍC^ÈiÙ0ñû\u0080\u0082\u00adM»\u0014Jßh\u0090ã§îþÈ5¦LÉ\u0083Þ^Ýi×0óû\u0087\u0082£M§æ\u0001Ñ\u0005\u0088oCH:eõa¬\u0081g©^Ø\tæÀ§¸\u0002s-*WåCÜ`^ÝiÙ0³û\u008f\u0082®M \u0014Wßeæ\u000b±`x$\u0000ÙËî\u0092\u009f^\u009e\u0012 %¤|Î·êÎÓ\u0001ÌX1\u0093\u000fª\u007f^\u009f\u008d:º>ãT(aQY\u009e\\Ç²\f\u00835®bÙ«ÀÓ4\u0018\u0000Ax\u008eu·Kº¬\u008d¦Ô\u0094\u001fífñ©Ïðd;S\ré:íc\u0087¨²Ñ\u008a\u001e\u008fGa\u008cPµ}â\u001c+\bSæ\u0098ÐÁ»\u000e·7\u009c|y¥[Ò7\u001b4^ÈiÓ0óû\u0081\u0082¹M»\u0014Zß/æ\u0014±*x>\u0000\u0093Ëä\u0092\u008f]\u009fd½/Möo\u0081\u000e^ÈiÓ0óû\u0081\u0082¹M»\u0014Zß_æ\u001f±vxc\u0000\u0093Ëð\u0092\u008e]\u009ad\u0087/Gö>\u0081[H[\u0013<ÛÇâç\u00adõt\u0085?·ÆF\u0091SXkcB*w^ÈiÓ0óû\u0081\u0082¹M»\u0014Zß/æ\u0000±!x:\u0000ÛËï\u0092\u008f]®d«/[öm\u0081BH\u0013\u0013>ÛÌâì\u00adât\u009e?½^ÈiÓ0óû\u0081\u0082¹M»\u0014Zß/æ\u0011±,x:\u0000ÄË»\u0092Ü]\u0081d÷/Iöd\u0081\u0002H\f\u0013cÛ\u0094âù/Þ\u0018ÏAä\u008a\u0095ó±<¡e\u0000®e\u0097\u0015À3\t\u001cqÍºåã\u0094,\u0088\u0015 ^L\u0087Oð\u00039Zb{ª\u009b\u0093øÜã\u0005\u008fN\u00ad·Aàs)f\u00123[/\u0083\u0086Ì¯Ùuîq·\u001b|.\u0005\fÊ\u0015\u0093åXÄa 6\u0087ÿ\u0099\u0087qLY^ÝiÙ0³û\u0086\u0082¤M½\u0014Mßiæ\n±/x2\u0000ÙË\u00ad\u0092\u0088]\u0084d±/Söb\u0081CH\u0012\u00132ÛÌâî\u00adõt\u0085?®ÆW\u0091eX}c\u000e^îiØ0ùû\u0096\u0082¤M»\u0014]ß-æ\u001f±vxc·Æ\u0080ÂÙ¨\u0012\u009dk¥¤ ýN6\u007f\u000fRX1\u0091'éÔ\"è{\u009d´\u008b\u008dºÆ\n\u001fth\u0012'#\u0010+I\u0016\u0082hû\u001e^ÆiØ0ôû\u0090\u0082åM¡\u0014OßcæI±?x0\u0000ÑËö\u0092Ç]\u0081dª/Pöv\u0081\u001e\u009d\u0096ª\u009bó¸8ÙA\u00ad\u008eò×\u0006\u001cf%Brg»tÃ\u009a\b QÇ\u009eÀ§ã\u00ad§\u009aªÃ\u0089\bèq\u009c¾Øç&,W\u0015xBV\u008bGó 8¥að®é\u0097ÌÜ#\u0005\rru \u0019\u0017\u0014N7\u0085Vü\"3fj\u0098¡é\u0098ÌÏê\u0006ö~$µ ìH#X\u001alQ\u0091\u0088µÿÓöÏÁË\u0098¡S\u009d*¼å²¼EwwN\u0019\u0019rÐ&¨Àcõ:\u008aõ\u008cÌ£\u0087I^:)\u000eà\u0003»$sÅJÿ^ÝiÙ0³û\u0086\u0082¤M½\u0014Mß.æ\u0016±+x8\u0000ÉË\u00ad\u0092\u008b]\u0087d¼/`öh\u0081\fH\u0019\u0013>^ÝiÙ0³û\u008b\u0082¯M¿\u0014\u0017ßbæ\u0012±'x9\u0000ØË\u00ad\u0092\u008c]\u0098d¶/Xöc\u0081\u001fH\u0004\u0013)ÛËâç\u00adä^ÝiÙ0³û\u0094\u0082¹M½\u0014]ßuæ\u0004±:x{\u0000ÞËö\u0092\u0083]\u009dd¼/\u0011ö`\u0081\u0004H\u001a\u0013<ÛÇâû\u00adàt\u0085?·ÆK\u0091x^ÝiÙ0³û\u0097\u0082²M¡\u0014Mßeæ\n±`x7\u0000ÉËê\u0092\u0086]\u0095dö/Yöo\u0081\u0003H\u0013\u0013>ÛÐâù\u00adât\u009e?°ÆQ×\u0099à\u009d¹÷rÓ\u000böÄå\u009d\tV!oN8Uñt\u0089\u0080B³\u001b\u0080Ô×íé¦\u0012\u007f.\bMÁ\u001e\u009ayR\u008fk£$³ýÖ¶èO\u0011\u0018:Ñ>êP£q^ÝiÙ0³û\u0092\u0082®M¼\u0014]ßoæ\u0015±`x7\u0000ÉËê\u0092\u0086]\u0095dö/Yöo\u0081\u0003H\u0013\u0013>ÛÐâù\u00adât\u009e?°ÆQ^ÝiÙ0³û\u0092\u0082®M¼\u0014]ßoæ\u0015±\u0011x1\u0000ÐËè\u0092\u0087]ßdº/Jöo\u0081\u0001H\u0010\u0013uÛÄâà\u00adþt\u0090?»ÆW\u0091|Xac\u0013*/òÜ^\u0095»\u0016\u008cDÕn\u001e\u0004gr¨5ñÊ:û\u0003\u0084T\u0087\u009d³åC.ew\u0019ò\u0085Å×\u009cýW\u0097.áá¤¸SsfJ\t\u001d.Ô$¬\u0096gä>\u008eñ\u0087È¸\u0083XZb-\u0006ä\u0015¿\u0001wÀNé\u0001ûØ\u008b\u0093¿^\u0080iÒ0øû\u0092\u0082äM¡\u0014Vßcæ\f±+x!\u0000\u0093Ëä\u0092\u008f]\u009fd¡/[jÌ]\u009e\u0004´ÏÞ¶¨yí \u001aë/Ò@\u0085gLm4ßÿ¾¦ÃiÐPá\u001b\u0017@Âw\u0087.¦åÕ\u009c¦Sá\n\u001eÁ/øP¯Sfc\u001e\u008cÕ \u008cËCÖénÞ+\u0087\nLy5QúY£ºhÁQå\u0006ÉÏÙ·}|\u0001%mê}ÓU\u0098\u008eA\u00856âÿö¤Ùl#U\u0004\u001a!Ã}\u0088Uq©&\u0097ï\u009aÔË\u009dÞE#\n\fó\r¸=aYVª¬+\u009byÂS\t9pO¿\u001bæá-ß\u0014\u0093C\u0082\u008a\u008eòd\r/:}cW¨=ÑK\u001e\u001fGå\u008cÛµ\u0097â\u0095+\u0093S~\u0098I^\u0080iÒ0øû\u0092\u0082äM¡\u0014Vßcæ\f±+x!\u0000\u0093Ëá\u0092\u0099]\u0085d¾/Pöj\u0081\tH\u0011\u0013)ÛÆ^\u0080iÅ0äû\u0097\u0082¿M·\u0014Tß/æ\u000b±'x7\u0000\u0093Ëï\u0092\u0083]\u0093dº/Lör\u0081\u000bH\u001b\u00137ÛÆâì\u00adât¨?´ÆK\u0091eX=c\t*.^\u0080iÒ0øû\u0092\u0082äM°\u0014Jßtæ\u0006±-x6\u0000Ù^\u0080iÒ0øû\u0092\u0082äM°\u0014Jßtæ\u0000±7x'\u0000Ó^\u0080iÒ0øû\u0092\u0082äM°\u0014Jßtæ\n±+x2\u0000Ò^\u0080iÒ0øû\u0092\u0082äM°\u0014Jßtæ\b±<x<\u0000ÙÒ&åt¼^w4\u000eBÁ\u0016\u0098ìSÒj·=\u0085ô\u0080\u008c}^\u0080iÒ0øû\u0092\u0082äM°\u0014Jßtæ\u0017±)x4\u0000ÕËó\u0092\u0089^\u0080iÒ0øû\u0092\u0082äM°\u0014Jßtæ8±'x8\u0000Ù¸®\u008füÖÒ\u001d¾d\u0084«Óòs9A\u0000>W\u000e\u009e\u0017æý-Ìt »¬\u0082ÙÉ?\u0010Pg!®uõ\u0017=ÿ\u0004ÓKÕÝTê\u000f³'xD\u00010Îq\u0097\u0084\\ºe×2õûö\u0083\u001bHx\u0011|ÞVçx¬¸uº\u0002ØËÒ\u0090êX\u0012a\u001b.+÷O¼nE\u0094\u0012ª^\u0080iÆ0ïû\u008b\u0082¨Mý\u0014Pßoæ\u0017±!x'\u0000ÈËð^\u009fiÐ0ûûÄ\u0082ñ^\u0080iÆ0ïû\u008b\u0082¨Mý\u0014Jßeæ\u000b±(xz\u0000ÑËâ\u0092\u009a]\u0082^ÈiÄ0üû\u0088\u0082§M½\u0014Zß.æ\u0000±!x9\u0000ØËå\u0092\u0083]\u0082d°/\u0011öu\u0081\u0002oËX×\u0001÷Ê«³\u008f|\u009f%bîW×\r\u00805I)1\u009aúø£\u008d\u000e\u001a9I`s«\u001dÒ~\u001d%DÆ\u008fþ¶\u0094áµ(\u0090PE\u009bvÂ\u0014\r\u000e4!\u007fÖ¦²Ñ\u008f\u0018\u0083C\u00ad^ÍiÚ0èû\u0081\u0082¸M¦\u0014Xßcæ\f±=^\u0080iÓ0éû\u0087\u0082äM¿\u0014Vßuæ\t±:x&\u0085|².ë\u0000 lYV\u0096\u0001Ï¡\u0004\u0093=ìjÜ£ÅÛ/\u0010\u001eIr\u0086~¿\u000bôí-\u009eZá\u0093§ÈÆ\u0000.9\u0005v\u001f¯%äZ\u001d´J\u009c^\u0080iÆ0ïû\u008b\u0082¨Mý\u0014Zßpæ\u0012±'x;\u0000ÚËì^èiÙ0ñû\u0080\u0082\u00adM»\u0014Jßh^\u0080iÒ0üû\u0090\u0082ªMý\u0014Tßiæ\u0014±-xz\u0000ÌËñ\u0092\u0085]\u0097d±/Söc\u0081\u001eH[\u00138Û×âû\u00ad¿tÇ?ñÆF\u0091cX~cT*,òÁ½ìDä\u000f\u0092Ö²áB¨@sm:NÅ*\u008dËTØ\u001fé&\u008añ§¸´".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
                valueOf = cArr;
                writeReplace = 486258408377117110L;
            }

            static void init$1() {
                $$d = new byte[]{68, 10, 35, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
                $$e = 40;
            }

            static void init$0() {
                $$a = new byte[]{117, 72, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
                $$b = 84;
            }

            /* JADX WARN: Removed duplicated region for block: B:115:0x0c23  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x0cfb  */
            /* JADX WARN: Removed duplicated region for block: B:168:0x11ff  */
            /* JADX WARN: Removed duplicated region for block: B:175:0x12c1 A[Catch: all -> 0x01d9, TRY_ENTER, TryCatch #5 {all -> 0x01d9, blocks: (B:6:0x00d6, B:8:0x00e9, B:9:0x012e, B:18:0x01fd, B:20:0x0233, B:21:0x0289, B:28:0x0314, B:30:0x0327, B:31:0x0370, B:39:0x0443, B:42:0x04e8, B:45:0x0493, B:46:0x04fe, B:48:0x050d, B:49:0x0553, B:58:0x0631, B:61:0x06d5, B:64:0x067c, B:66:0x073c, B:68:0x074f, B:69:0x07a3, B:75:0x084b, B:78:0x08e1, B:81:0x088d, B:86:0x0992, B:88:0x09a5, B:89:0x09ee, B:97:0x0ac1, B:100:0x0b56, B:103:0x0b03, B:105:0x0b91, B:107:0x0ba4, B:108:0x0be9, B:116:0x0c3b, B:119:0x0ce5, B:122:0x0c8f, B:124:0x0d49, B:126:0x0d5c, B:127:0x0da9, B:133:0x0e69, B:136:0x0efe, B:139:0x0ea7, B:141:0x0f42, B:143:0x0f55, B:144:0x0f9d, B:150:0x0ffd, B:152:0x1036, B:153:0x108f, B:169:0x1220, B:171:0x1258, B:172:0x12ab, B:175:0x12c1, B:177:0x12d0, B:178:0x1315, B:182:0x13c9, B:185:0x1466, B:188:0x140e, B:190:0x147d, B:192:0x1495, B:193:0x14de, B:199:0x1589, B:201:0x15c1, B:202:0x1614, B:206:0x1656, B:208:0x1669, B:209:0x16b3, B:211:0x16bc, B:213:0x16da, B:214:0x1729, B:219:0x23cc, B:221:0x23df, B:222:0x2424, B:233:0x2801, B:235:0x2814, B:236:0x2861, B:241:0x292d, B:243:0x2940, B:244:0x298d, B:253:0x2a7d, B:255:0x2abc, B:256:0x2b19, B:290:0x2d92, B:292:0x2dd3, B:293:0x2e2c, B:312:0x2f0c, B:315:0x2f9d, B:318:0x2f48, B:320:0x2fd6, B:323:0x3035, B:327:0x30f3, B:329:0x312b, B:330:0x3180, B:334:0x31b4, B:336:0x31fa, B:337:0x3250, B:340:0x2fea, B:359:0x2430, B:361:0x244e, B:362:0x249b, B:368:0x204f, B:370:0x2062, B:371:0x20b1, B:396:0x215b, B:398:0x2196, B:399:0x21e7, B:404:0x22ec, B:407:0x238b, B:410:0x2336, B:412:0x2216, B:414:0x225b, B:415:0x22b3), top: B:5:0x00d6 }] */
            /* JADX WARN: Removed duplicated region for block: B:221:0x23df A[Catch: all -> 0x01d9, TryCatch #5 {all -> 0x01d9, blocks: (B:6:0x00d6, B:8:0x00e9, B:9:0x012e, B:18:0x01fd, B:20:0x0233, B:21:0x0289, B:28:0x0314, B:30:0x0327, B:31:0x0370, B:39:0x0443, B:42:0x04e8, B:45:0x0493, B:46:0x04fe, B:48:0x050d, B:49:0x0553, B:58:0x0631, B:61:0x06d5, B:64:0x067c, B:66:0x073c, B:68:0x074f, B:69:0x07a3, B:75:0x084b, B:78:0x08e1, B:81:0x088d, B:86:0x0992, B:88:0x09a5, B:89:0x09ee, B:97:0x0ac1, B:100:0x0b56, B:103:0x0b03, B:105:0x0b91, B:107:0x0ba4, B:108:0x0be9, B:116:0x0c3b, B:119:0x0ce5, B:122:0x0c8f, B:124:0x0d49, B:126:0x0d5c, B:127:0x0da9, B:133:0x0e69, B:136:0x0efe, B:139:0x0ea7, B:141:0x0f42, B:143:0x0f55, B:144:0x0f9d, B:150:0x0ffd, B:152:0x1036, B:153:0x108f, B:169:0x1220, B:171:0x1258, B:172:0x12ab, B:175:0x12c1, B:177:0x12d0, B:178:0x1315, B:182:0x13c9, B:185:0x1466, B:188:0x140e, B:190:0x147d, B:192:0x1495, B:193:0x14de, B:199:0x1589, B:201:0x15c1, B:202:0x1614, B:206:0x1656, B:208:0x1669, B:209:0x16b3, B:211:0x16bc, B:213:0x16da, B:214:0x1729, B:219:0x23cc, B:221:0x23df, B:222:0x2424, B:233:0x2801, B:235:0x2814, B:236:0x2861, B:241:0x292d, B:243:0x2940, B:244:0x298d, B:253:0x2a7d, B:255:0x2abc, B:256:0x2b19, B:290:0x2d92, B:292:0x2dd3, B:293:0x2e2c, B:312:0x2f0c, B:315:0x2f9d, B:318:0x2f48, B:320:0x2fd6, B:323:0x3035, B:327:0x30f3, B:329:0x312b, B:330:0x3180, B:334:0x31b4, B:336:0x31fa, B:337:0x3250, B:340:0x2fea, B:359:0x2430, B:361:0x244e, B:362:0x249b, B:368:0x204f, B:370:0x2062, B:371:0x20b1, B:396:0x215b, B:398:0x2196, B:399:0x21e7, B:404:0x22ec, B:407:0x238b, B:410:0x2336, B:412:0x2216, B:414:0x225b, B:415:0x22b3), top: B:5:0x00d6 }] */
            /* JADX WARN: Removed duplicated region for block: B:224:0x242d  */
            /* JADX WARN: Removed duplicated region for block: B:232:0x27ff  */
            /* JADX WARN: Removed duplicated region for block: B:250:0x2a4d  */
            /* JADX WARN: Removed duplicated region for block: B:271:0x2ce4  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x2d7a  */
            /* JADX WARN: Removed duplicated region for block: B:296:0x2e42  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x2eef  */
            /* JADX WARN: Removed duplicated region for block: B:319:0x2fb3  */
            /* JADX WARN: Removed duplicated region for block: B:357:0x2d77 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:359:0x2430 A[Catch: all -> 0x01d9, TryCatch #5 {all -> 0x01d9, blocks: (B:6:0x00d6, B:8:0x00e9, B:9:0x012e, B:18:0x01fd, B:20:0x0233, B:21:0x0289, B:28:0x0314, B:30:0x0327, B:31:0x0370, B:39:0x0443, B:42:0x04e8, B:45:0x0493, B:46:0x04fe, B:48:0x050d, B:49:0x0553, B:58:0x0631, B:61:0x06d5, B:64:0x067c, B:66:0x073c, B:68:0x074f, B:69:0x07a3, B:75:0x084b, B:78:0x08e1, B:81:0x088d, B:86:0x0992, B:88:0x09a5, B:89:0x09ee, B:97:0x0ac1, B:100:0x0b56, B:103:0x0b03, B:105:0x0b91, B:107:0x0ba4, B:108:0x0be9, B:116:0x0c3b, B:119:0x0ce5, B:122:0x0c8f, B:124:0x0d49, B:126:0x0d5c, B:127:0x0da9, B:133:0x0e69, B:136:0x0efe, B:139:0x0ea7, B:141:0x0f42, B:143:0x0f55, B:144:0x0f9d, B:150:0x0ffd, B:152:0x1036, B:153:0x108f, B:169:0x1220, B:171:0x1258, B:172:0x12ab, B:175:0x12c1, B:177:0x12d0, B:178:0x1315, B:182:0x13c9, B:185:0x1466, B:188:0x140e, B:190:0x147d, B:192:0x1495, B:193:0x14de, B:199:0x1589, B:201:0x15c1, B:202:0x1614, B:206:0x1656, B:208:0x1669, B:209:0x16b3, B:211:0x16bc, B:213:0x16da, B:214:0x1729, B:219:0x23cc, B:221:0x23df, B:222:0x2424, B:233:0x2801, B:235:0x2814, B:236:0x2861, B:241:0x292d, B:243:0x2940, B:244:0x298d, B:253:0x2a7d, B:255:0x2abc, B:256:0x2b19, B:290:0x2d92, B:292:0x2dd3, B:293:0x2e2c, B:312:0x2f0c, B:315:0x2f9d, B:318:0x2f48, B:320:0x2fd6, B:323:0x3035, B:327:0x30f3, B:329:0x312b, B:330:0x3180, B:334:0x31b4, B:336:0x31fa, B:337:0x3250, B:340:0x2fea, B:359:0x2430, B:361:0x244e, B:362:0x249b, B:368:0x204f, B:370:0x2062, B:371:0x20b1, B:396:0x215b, B:398:0x2196, B:399:0x21e7, B:404:0x22ec, B:407:0x238b, B:410:0x2336, B:412:0x2216, B:414:0x225b, B:415:0x22b3), top: B:5:0x00d6 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] values(android.content.Context context, int i, int i2, int i3) {
                java.lang.Object obj;
                java.lang.Integer num;
                int i4;
                int i5;
                int i6;
                int i7;
                java.lang.String str;
                int i8;
                int i9;
                int i10;
                int i11;
                java.lang.String next;
                int i12;
                long j;
                java.lang.String str2;
                long j2;
                int i13;
                java.lang.Object[] objArr;
                char c;
                java.lang.String[][] strArr;
                java.lang.Object obj2;
                java.lang.Object invoke;
                int i14;
                char c2;
                int i15;
                int i16;
                int i17;
                int i18;
                java.lang.String intern;
                java.io.File file;
                java.lang.String str3;
                java.lang.String[][] strArr2;
                java.lang.String next2;
                int i19;
                java.lang.String str4;
                int i20;
                int i21;
                java.lang.String[] strArr3;
                java.lang.String next3;
                int i22;
                int i23 = 0;
                java.lang.Integer num2 = 0;
                int i24 = 1;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(465 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.View.combineMeasuredStates(0, 0) + 17704), 8 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", "") + 38474), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 27, objArr3);
                java.lang.String intern3 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(android.view.KeyEvent.getDeadChar(0, 0) + 27, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 24 - android.view.MotionEvent.axisFromString(""), objArr4);
                java.lang.String intern4 = ((java.lang.String) objArr4[0]).intern();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a(android.view.Gravity.getAbsoluteGravity(0, 0) + 52, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 18 - android.view.View.MeasureSpec.getSize(0), objArr5);
                java.lang.String intern5 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 70, (char) (18561 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 29 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr6);
                java.lang.String[] strArr4 = {intern3, intern4, intern5, ((java.lang.String) objArr6[0]).intern()};
                int i25 = 0;
                while (true) {
                    obj = null;
                    if (i25 >= 4) {
                        num = num2;
                        i4 = i;
                        break;
                    }
                    try {
                        java.lang.Object[] objArr7 = {strArr4[i25]};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 37, 3161 - android.text.TextUtils.getOffsetBefore("", i23), (char) (33099 - android.text.TextUtils.getTrimmedLength("")));
                            byte b = $$a[14];
                            byte b2 = b;
                            java.lang.Object[] objArr8 = new java.lang.Object[i24];
                            b(b2, (short) (b2 | 652), (byte) (b - i24), objArr8);
                            java.lang.String str5 = (java.lang.String) objArr8[i23];
                            java.lang.Class<?>[] clsArr = new java.lang.Class[i24];
                            clsArr[i23] = java.lang.String.class;
                            obj3 = cls.getMethod(str5, clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj3);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7)).longValue();
                        long j3 = ~longValue;
                        num = num2;
                        long j4 = i;
                        long j5 = (((((longValue * 949) + 509750401453L) + (((~(j3 | j4)) | 538279198) * (-948))) + ((~((j3 | 538279198) | (~j4))) * (-948))) + (((-538279199) | j3) * 948)) - 799388909;
                        if (((((int) (j5 >> 32)) & (((((~((-4850177) | r4)) | (~((-1342557186) | i))) * (-302)) - 521834258) + ((~((-4850177) | i)) * (-604)) + (((~((-1347407362) | i)) | 167776338) * 302))) | (((int) j5) & (((((~(2110240411 | r4)) | 747500474) * (-328)) - 1588276687) + ((747500474 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((~i) | 2110781371)) | (~((-2110240412) | i)) | 746959514) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)))) != 0) {
                            i4 = i ^ (i25 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                            break;
                        }
                        i25++;
                        num2 = num;
                        i23 = 0;
                        i24 = 1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i26 = 3;
                if (i4 != i) {
                    java.lang.Object[] objArr9 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
                    java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~(1383269119 | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 178397705 + (((~((~i) | 1383269119)) | 37880466) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                        byte[] bArr = $$a;
                        byte b3 = bArr[14];
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b(b3, (short) (b3 - 1), (byte) (-bArr[16]), objArr11);
                        obj4 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                    }
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr10)).intValue();
                    return objArr9;
                }
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 98, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 12 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr12);
                java.lang.String intern6 = ((java.lang.String) objArr12[0]).intern();
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(android.graphics.Color.argb(0, 0, 0, 0) + 110, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 13 - android.graphics.Color.argb(0, 0, 0, 0), objArr13);
                java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (char) android.view.View.resolveSizeAndState(0, 0, 0), 18 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr14);
                java.lang.String[] strArr5 = {intern6, intern7, ((java.lang.String) objArr14[0]).intern()};
                int i27 = 0;
                while (true) {
                    if (i27 >= i26) {
                        i5 = i;
                        break;
                    }
                    java.lang.Object[] objArr15 = {strArr5[i27]};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                    if (obj5 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 36, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3161, (char) (33147 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        byte b4 = $$a[14];
                        byte b5 = b4;
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        b(b5, (short) (b5 | 652), (byte) (b4 - 1), objArr16);
                        obj5 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj5);
                    }
                    long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(obj, objArr15)).longValue();
                    long j6 = ~i;
                    long j7 = j6 | 495070930;
                    long j8 = ~longValue2;
                    java.lang.String[] strArr6 = strArr5;
                    long j9 = (((((53 * longValue2) - 25248617430L) + ((~(j7 | longValue2)) * 52)) + ((((~(j8 | j6)) | (~(j8 | 495070930))) | (~j7)) * (-52))) + (((~((-495070931) | longValue2)) | (~(j6 | (-495070931)))) * 52)) - 1832739038;
                    int i28 = (int) (j9 >> 32);
                    int i29 = ~i;
                    if (((((int) j9) & ((((((~(1449911957 | i)) | 8392810) | r4) * (-470)) - 1787573007) + (((~((-1445619221) | i29)) | (~(1458304767 | i))) * 470))) | (((((~((-1481342441) | i29)) | (-44116030)) * (-90)) + 1687905420 + (((~((-1481342441) | i)) | 44040213) * (-45)) + (((~(i29 | (-44116030))) | (~(44116029 | i)) | (-1481342441)) * 45)) & i28)) != 0) {
                        i5 = i ^ (i27 + 270);
                        break;
                    }
                    i27++;
                    strArr5 = strArr6;
                    i26 = 3;
                    obj = null;
                }
                if (i5 != i) {
                    java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-1109167242) | r3)) | (~(2050813321 | i))) * (-831)) - 500226736) + ((~((-1109134466) | i)) * (-1662)) + (((~(i | 941678856)) | (~((~i) | (-941678857))) | (~(1109167241 | i))) * 831))};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj6 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 50, android.text.TextUtils.indexOf("", "") + 2713, (char) android.text.TextUtils.indexOf("", "", 0));
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[14];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        b(b6, (short) (b6 - 1), (byte) (-bArr2[16]), objArr19);
                        obj6 = cls4.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                    }
                    ((int[]) objArr17[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr18)).intValue();
                    return objArr17;
                }
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
                if (obj7 == null) {
                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 26, 1865 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (41774 - android.view.MotionEvent.axisFromString("")));
                    byte b7 = $$a[14];
                    byte b8 = b7;
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    b(b8, (short) (b8 | 652), (byte) (b7 - 1), objArr20);
                    obj7 = cls5.getMethod((java.lang.String) objArr20[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj7);
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, null)).longValue();
                long j10 = i;
                long j11 = ~j10;
                long j12 = ~longValue3;
                long j13 = j11 | (-135947355);
                long j14 = ((((((-903) * longValue3) - 123032356275L) + (((~(j11 | longValue3)) | (~(j10 | 135947354))) * (-1808))) + (((~((135947354 | j12) | j10)) | (~(j13 | longValue3))) * 904)) + ((((~(135947354 | longValue3)) | (~(j12 | j10))) | (~j13)) * 904)) - 1793265507;
                int i30 = ~i;
                int i31 = (((int) j14) & ((((1097150680 | r2) * 764) - 2080067039) + (((~(1097150680 | i30)) | 680544549) * (-1528)) + (((~(1760590205 | i30)) | 697649573) * 764))) | (((((1409275290 | i30) * (-369)) - 802173004) + (((~((-32146577) | i30)) | 1405079834) * (-369)) + (((~(32146576 | i)) | 1377128714 | (~((-4195457) | i30))) * 369)) & ((int) (j14 >> 32)));
                if (i31 != 0) {
                    int i32 = values + 121;
                    AlternateContactlessPaymentDataJson = i32 % 128;
                    if (i32 % 2 != 0) {
                        i6 = 1;
                        i22 = (i31 >>> 1) + 32589;
                    } else {
                        i6 = 1;
                        i22 = i31 + 199;
                    }
                    i7 = i22 ^ i;
                } else {
                    i6 = 1;
                    i7 = i;
                }
                if (i7 != i) {
                    int[] iArr = new int[i6];
                    int[] iArr2 = new int[i6];
                    iArr[0] = i;
                    iArr2[0] = i7;
                    java.lang.Object[] objArr21 = {iArr, iArr2, null, null, new int[i6]};
                    java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1273417898 | i30)) | 777428199) * (-1042)) + 1338250678 + ((1273417898 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i | (-777428200))) | 172396706 | (~(i30 | 1878449391))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj8 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2713 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte[] bArr3 = $$a;
                        byte b9 = bArr3[14];
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        b(b9, (short) (b9 - 1), (byte) (-bArr3[16]), objArr23);
                        obj8 = cls6.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                    }
                    ((int[]) objArr21[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr22)).intValue();
                    return objArr21;
                }
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                a(141 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 24016), 20 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr24);
                java.lang.String intern8 = ((java.lang.String) objArr24[0]).intern();
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 161, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, objArr25);
                java.lang.Object[] objArr26 = {intern8, ((java.lang.String) objArr25[0]).intern()};
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                if (obj9 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 2212 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                    byte b10 = $$a[14];
                    byte b11 = b10;
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    b(b11, (short) (b11 | 652), (byte) (b10 - 1), objArr27);
                    obj9 = cls7.getMethod((java.lang.String) objArr27[0], java.lang.String.class, java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj9);
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr26)).longValue();
                long j15 = ~(728579530 | longValue4);
                long j16 = ((((((-375) * longValue4) - 273217323750L) + ((((~((~longValue4) | (-728579531))) | j10) | j15) * 376)) + ((j15 | (~(728579530 | j11))) * (-376))) + ((longValue4 | (~((-728579531) | j10))) * 376)) - 1463954132;
                int i33 = ~((-705697041) | i);
                int i34 = ((((int) (j16 >> 32)) & (((((65666 | i33) * (-476)) + 564141474) + (i33 * 952)) + ((~((-705697041) | i30)) * 476))) | (((int) j16) & ((((((~((-1075048022) | i)) | (-1783889494)) * (-502)) + (-192652029)) + ((~((-1196630) | i30)) * (-502))) + (((~((-1782692865) | i)) | (-1075048022)) * 502)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE : i;
                if (i34 != i) {
                    java.lang.Object[] objArr28 = {new int[]{i}, new int[]{i34}, null, null, new int[1]};
                    java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-865603690) | i30)) | (-1185242409)) * (-933)) + 180664694) + (((~((-1185242409) | i30)) | 1143295232) * 933)) - 1696953170)};
                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj10 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.getTrimmedLength("") + 2713, (char) android.view.View.combineMeasuredStates(0, 0));
                        byte[] bArr4 = $$a;
                        byte b12 = bArr4[14];
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        b(b12, (short) (b12 - 1), (byte) (-bArr4[16]), objArr30);
                        obj10 = cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                    }
                    ((int[]) objArr28[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr29)).intValue();
                    return objArr28;
                }
                java.lang.String str6 = "";
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                a(166 - android.view.MotionEvent.axisFromString(""), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.indexOf(str6, str6) + 31, objArr31);
                java.lang.String intern9 = ((java.lang.String) objArr31[0]).intern();
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                a(199 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.os.Process.myTid() >> 22), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23, objArr32);
                java.lang.String intern10 = ((java.lang.String) objArr32[0]).intern();
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                a(android.widget.ExpandableListView.getPackedPositionType(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, (char) (48320 - android.os.Process.getGidForName(str6)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28, objArr33);
                java.lang.String intern11 = ((java.lang.String) objArr33[0]).intern();
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (char) android.text.TextUtils.getCapsMode(str6, 0, 0), android.text.TextUtils.getOffsetBefore(str6, 0) + 14, objArr34);
                java.lang.String[] strArr7 = {intern9, intern10, intern11, ((java.lang.String) objArr34[0]).intern()};
                int i35 = 0;
                while (true) {
                    if (i35 >= 4) {
                        str = str6;
                        i8 = i;
                        break;
                    }
                    java.lang.Object[] objArr35 = {strArr7[i35]};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                    if (obj11 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 36, 3161 - android.graphics.Color.argb(0, 0, 0, 0), (char) (33099 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                        byte b13 = (byte) ($$a[14] - 1);
                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                        b(b13, (short) (b13 | 35), b13, objArr36);
                        obj11 = cls9.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj11);
                    }
                    long j17 = ~((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr35)).longValue();
                    str = str6;
                    java.lang.String[] strArr8 = strArr7;
                    int i36 = i35;
                    long j18 = ((r3 * (-858)) - 236448289060L) + ((j10 | (-274939871)) * (-859)) + (((~(j17 | 274939870 | j10)) | (~(j11 | (-274939871)))) * 859) + (((~(j17 | j11)) | (~((-274939871) | j17))) * 859) + 1182410609;
                    int i37 = (int) (j18 >> 32);
                    int i38 = (int) j18;
                    int i39 = ~((-34248705) | i30);
                    if (((i37 & ((((94376192 | i) * 988) - 1896703054) + (((~(765662004 | i30)) | 278594) * (-1976)) + (((~((-671564407) | i)) | 94376192 | (~(671564406 | i30))) * 988))) | (i38 & ((((~(52141193 | i)) | (-1402977706) | i39) * (-470)) + 588215353 + ((i39 | (~((-1350836513) | i))) * 470)))) != 0) {
                        values = (AlternateContactlessPaymentDataJson + 25) % 128;
                        i8 = i ^ (i36 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        break;
                    }
                    i35 = i36 + 1;
                    strArr7 = strArr8;
                    str6 = str;
                }
                if (i8 != i) {
                    java.lang.Object[] objArr37 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                    java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1870174193) | i30)) | (~(180671905 | i))) * 959) + 1020824415 + (((~(i | (-1870174193))) | (~(i30 | 180671905))) * 959))};
                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj12 == null) {
                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 50, android.os.Process.getGidForName(str) + 2714, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte[] bArr5 = $$a;
                        byte b14 = bArr5[14];
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        b(b14, (short) (b14 - 1), (byte) (-bArr5[16]), objArr39);
                        obj12 = cls10.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                    }
                    ((int[]) objArr37[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr38)).intValue();
                    return objArr37;
                }
                java.lang.String str7 = str;
                java.lang.Object[] objArr40 = new java.lang.Object[1];
                a(263 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.graphics.Color.green(0), android.text.TextUtils.getOffsetAfter(str7, 0) + 13, objArr40);
                java.lang.Object[] objArr41 = {((java.lang.String) objArr40[0]).intern()};
                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj13 == null) {
                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40, 1921 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.view.View.MeasureSpec.getSize(0));
                    byte b15 = $$a[14];
                    byte b16 = b15;
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    b(b16, (short) (b16 | 652), (byte) (b15 - 1), objArr42);
                    obj13 = cls11.getMethod((java.lang.String) objArr42[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
                }
                java.lang.String str8 = (java.lang.String) ((java.lang.reflect.Method) obj13).invoke(null, objArr41);
                if (str8 != null) {
                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                    a(275 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore(str7, 0), 9 - android.text.TextUtils.getCapsMode(str7, 0, 0), objArr43);
                    if (str8.contains(((java.lang.String) objArr43[0]).intern())) {
                        i9 = i ^ 250;
                        if (i9 == i) {
                            java.lang.Object[] objArr44 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                            java.lang.Object[] objArr45 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-67219491) | i)) | (~((-1074793797) | i30))) * 920) + 763079801 + (((~((-908832812) | i30)) | 67219490) * 920) + (((~(i | (-841613322))) | (~(i30 | (-67219491))) | (~((-1074793797) | i))) * 920))};
                            java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj14 == null) {
                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.graphics.Color.rgb(0, 0, 0) + 16779929, (char) ((-1) - android.view.MotionEvent.axisFromString(str7)));
                                byte[] bArr6 = $$a;
                                byte b17 = bArr6[14];
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                b(b17, (short) (b17 - 1), (byte) (-bArr6[16]), objArr46);
                                obj14 = cls12.getMethod((java.lang.String) objArr46[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                            }
                            ((int[]) objArr44[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr45)).intValue();
                            return objArr44;
                        }
                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                        a(284 - android.view.MotionEvent.axisFromString(str7), (char) (53160 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (android.os.Process.myTid() >> 22) + 17, objArr47);
                        java.lang.String intern12 = ((java.lang.String) objArr47[0]).intern();
                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                        a(301 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), android.text.TextUtils.indexOf(str7, str7) + 6, objArr48);
                        java.lang.Object[] objArr49 = {intern12, ((java.lang.String) objArr48[0]).intern()};
                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                        if (obj15 == null) {
                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2213, (char) (android.os.Process.myTid() >> 22));
                            byte b18 = $$a[14];
                            byte b19 = b18;
                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                            b(b19, (short) (b19 | 652), (byte) (b18 - 1), objArr50);
                            obj15 = cls13.getMethod((java.lang.String) objArr50[0], java.lang.String.class, java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj15);
                        }
                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr49)).longValue();
                        long j19 = ((((((-215) * longValue5) - 21933664732L) + ((~(j10 | (-101076796))) * 216)) + ((((-101076796) | (~longValue5)) | j11) * (-216))) + (((~((-101076796) | j11)) | longValue5) * 216)) - 634297806;
                        int i40 = ~((-705171523) | i);
                        int i41 = ((((int) (j19 >> 32)) & ((((((-2143207416) | i40) * (-476)) + (-1476449838)) + (i40 * 952)) + ((~((-705171523) | i30)) * 476))) | (((int) j19) & (((((((~(1739099745 | i30)) | 274083990) | (~((-301873336) | i30))) * (-1136)) + (-1738041619)) + ((((~(1739099745 | i)) | (~((-301873336) | i))) | (~((-1711310401) | i30))) * (-568))) + ((((~((-1739099746) | i30)) | (~(301873335 | i30))) | (~((-274083991) | i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION)))) != 0 ? i ^ 251 : i;
                        if (i41 != i) {
                            java.lang.Object[] objArr51 = {new int[]{i}, new int[]{i41}, null, null, new int[1]};
                            java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(662987986 | i30)) | (-2008902912)) * 529) + 321706580 + (((~(i | 662987986)) | (-1387858112)) * 529))};
                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj16 == null) {
                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50, android.widget.ExpandableListView.getPackedPositionType(0L) + 2713, (char) android.text.TextUtils.getCapsMode(str7, 0, 0));
                                byte[] bArr7 = $$a;
                                byte b20 = bArr7[14];
                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                b(b20, (short) (b20 - 1), (byte) (-bArr7[16]), objArr53);
                                obj16 = cls14.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                            }
                            ((int[]) objArr51[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr52)).intValue();
                            return objArr51;
                        }
                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                        a(307 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (42812 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 23 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr54);
                        java.lang.Object[] objArr55 = {((java.lang.String) objArr54[0]).intern()};
                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj17 == null) {
                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 40, 1921 - android.text.TextUtils.getCapsMode(str7, 0, 0), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                            byte b21 = $$a[14];
                            byte b22 = b21;
                            java.lang.Object[] objArr56 = new java.lang.Object[1];
                            b(b22, (short) (b22 | 652), (byte) (b21 - 1), objArr56);
                            obj17 = cls15.getMethod((java.lang.String) objArr56[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                        }
                        java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj17).invoke(null, objArr55)).toLowerCase();
                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                        a(331 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.os.Process.myTid() >> 22), android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5, objArr57);
                        if (lowerCase.contains(((java.lang.String) objArr57[0]).intern())) {
                            values = (AlternateContactlessPaymentDataJson + 67) % 128;
                            i10 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE;
                        } else {
                            i10 = i;
                        }
                        if (i10 != i) {
                            java.lang.Object[] objArr58 = {new int[]{i}, new int[]{i10}, null, null, new int[1]};
                            java.lang.Object[] objArr59 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-243598314) | i)) | 67437121) * (-283)) - 339285140) + ((~(i | (-176161193))) * 283))};
                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj18 == null) {
                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.os.Process.myPid() >> 22));
                                byte[] bArr8 = $$a;
                                byte b23 = bArr8[14];
                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                b(b23, (short) (b23 - 1), (byte) (-bArr8[16]), objArr60);
                                obj18 = cls16.getMethod((java.lang.String) objArr60[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                            }
                            ((int[]) objArr58[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr59)).intValue();
                            return objArr58;
                        }
                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                        a(android.graphics.Color.alpha(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (char) (53159 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.view.View.MeasureSpec.getMode(0) + 17, objArr61);
                        java.lang.String intern13 = ((java.lang.String) objArr61[0]).intern();
                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                        a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + com.visa.cbp.getCertUsage.setODAData, (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 21348), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6, objArr62);
                        java.lang.String intern14 = ((java.lang.String) objArr62[0]).intern();
                        java.io.File file2 = new java.io.File(intern13);
                        if (file2.exists() && file2.isFile()) {
                            try {
                                java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file2));
                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                a(android.text.TextUtils.indexOf(str7, str7, 0) + 341, (char) android.view.View.resolveSizeAndState(0, 0, 0), 2 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr63);
                                java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr63[0]).intern());
                                next3 = useDelimiter.hasNext() ? useDelimiter.next() : str7;
                                useDelimiter.close();
                            } catch (java.io.IOException unused) {
                            }
                            if (next3.contains(intern14)) {
                                values = (AlternateContactlessPaymentDataJson + 91) % 128;
                                i11 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                if (i11 != i) {
                                    java.lang.Object[] objArr64 = {new int[]{i}, new int[]{i11}, null, null, new int[1]};
                                    java.lang.Object[] objArr65 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((r2 * 992) - 1556536159) + (((~((-443549913) | i)) | 440402072 | (~(i30 | 1610444025))) * (-496)) + ((1607296185 | i) * 496))};
                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj19 == null) {
                                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 50, 2713 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                        byte[] bArr9 = $$a;
                                        byte b24 = bArr9[14];
                                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                                        b(b24, (short) (b24 - 1), (byte) (-bArr9[16]), objArr66);
                                        obj19 = cls17.getMethod((java.lang.String) objArr66[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                                    }
                                    ((int[]) objArr64[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr65)).intValue();
                                    return objArr64;
                                }
                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                if (obj20 == null) {
                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 44, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2763, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    byte b25 = $$a[14];
                                    byte b26 = b25;
                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                    b(b26, (short) (b26 | 652), (byte) (b25 - 1), objArr67);
                                    obj20 = cls18.getMethod((java.lang.String) objArr67[0], null);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj20);
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, null)).longValue();
                                long j20 = ~longValue6;
                                long j21 = 148448634 | longValue6;
                                long j22 = (longValue6 * (-751)) + 111484924885L + (((~(j10 | 148448634)) | (~(j20 | 148448634))) * 1504) + ((~(j21 | j10)) * (-1504)) + (((~((-148448635) | j20)) | (~j21)) * 752) + 273485398;
                                if (((((int) (j22 >> 32)) & ((((-606176257) | i) * (-627)) + 635053320 + (((~(1719111464 | i)) | (-1138629421)) * (-627)) + (((~((-1719111465) | i30)) | (~((-1138629421) | i))) * 627))) | (((int) j22) & (((((~((-1232972558) | i)) | (-1624768329)) * (-318)) - 1474230005) + (((~((-1624768329) | i)) | (~(1778384717 | i30))) * 318) + (((~((-545412161) | i30)) | (~(1778384717 | i))) * 318)))) == 1) {
                                    java.lang.Object[] objArr68 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    java.lang.Object[] objArr69 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((-95457870) | i) * 376) - 268140391) + (((~(i30 | 979795942)) | (-1073151984)) * (-376)) + (((~(i | (-979795943))) | 1071050155) * 376))};
                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj21 == null) {
                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                        byte[] bArr10 = $$a;
                                        byte b27 = bArr10[14];
                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                        b(b27, (short) (b27 - 1), (byte) (-bArr10[16]), objArr70);
                                        obj21 = cls19.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                    }
                                    ((int[]) objArr68[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr69)).intValue();
                                    return objArr68;
                                }
                                java.lang.Object[] objArr71 = {1};
                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                if (obj22 == null) {
                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 2412 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                    byte b28 = $$a[14];
                                    byte b29 = b28;
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    b(b29, (short) (b29 | 652), (byte) (b28 - 1), objArr72);
                                    obj22 = cls20.getMethod((java.lang.String) objArr72[0], java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj22);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr71)).longValue();
                                long j23 = ~((~longValue7) | 771032030);
                                long j24 = ((-107) * longValue7) + 42406761650L + (((~(longValue7 | j11)) | (~(longValue7 | (-771032031)))) * (-108)) + (((~(j10 | (-771032031))) | j23 | (~(771032030 | j11))) * 54) + ((j23 | j10) * 54) + 636878169;
                                int i42 = ((((int) (j24 >> 32)) & ((((((~((-21534422) | i)) | (-1458760833)) * (-668)) + 647783546) + (((~((-1458760833) | i)) | (-21534422)) * 1336)) + (((-4228225) | i) * 668))) | (((int) j24) & (((((~(1753457092 | i)) | (-1775479254)) * 305) + (-1704616964)) + (((~(1753457092 | i30)) | (-1104283794)) * 305)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                                if (i42 != i) {
                                    java.lang.Object[] objArr73 = {new int[]{i}, new int[]{i42}, null, null, new int[1]};
                                    java.lang.Object[] objArr74 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((-1694638345) | i30) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 116977753 + (((~(317573703 | i30)) | (-1973577998)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj23 == null) {
                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0));
                                        byte[] bArr11 = $$a;
                                        byte b30 = bArr11[14];
                                        java.lang.Object[] objArr75 = new java.lang.Object[1];
                                        b(b30, (short) (b30 - 1), (byte) (-bArr11[16]), objArr75);
                                        obj23 = cls21.getMethod((java.lang.String) objArr75[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                    }
                                    ((int[]) objArr73[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr74)).intValue();
                                    return objArr73;
                                }
                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 308, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 42811), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 23, objArr76);
                                java.lang.Object[] objArr77 = {((java.lang.String) objArr76[0]).intern()};
                                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj24 == null) {
                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1921 - android.text.TextUtils.indexOf(str7, str7, 0), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                    byte b31 = $$a[14];
                                    byte b32 = b31;
                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                    b(b32, (short) (b32 | 652), (byte) (b31 - 1), objArr78);
                                    obj24 = cls22.getMethod((java.lang.String) objArr78[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj24);
                                }
                                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj24).invoke(null, objArr77);
                                if (invoke2 != null) {
                                    java.lang.Object[] objArr79 = {invoke2, 42};
                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj25 == null) {
                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 28, 2594 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.view.KeyEvent.normalizeMetaState(0));
                                        byte b33 = $$a[14];
                                        byte b34 = b33;
                                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                                        b(b34, (short) (b34 | 652), (byte) (b33 - 1), objArr80);
                                        obj25 = cls23.getMethod((java.lang.String) objArr80[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj25);
                                    }
                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr79)).longValue();
                                    long j25 = ~longValue8;
                                    long j26 = ((-958) * longValue8) + 292480760664L + (((~(j25 | j11)) | (~(j10 | 305303507)) | (~((-305303508) | j11))) * 959) + ((~((-305303508) | longValue8)) * (-959)) + (((~(305303507 | j11)) | (~(j25 | j10)) | (~(j10 | (-305303508)))) * 959) + 1562404032;
                                    int i43 = (int) (j26 >> 32);
                                    i12 = i;
                                    int i44 = ~((-1517137657) | i12);
                                    if (((((int) j26) & (((((~(1181294953 | i30)) | (~(255931456 | i12))) * 1900) - 1871736089) + (((~((-255931457) | i30)) | (~((-1181294954) | i12))) * (-950)) + (((~((-255931457) | i12)) | (~((-1181294954) | i30))) * 950))) | (((((~((-1517137657) | i30)) | 4261960) * (-245)) + 1872183464 + (i44 * (-245)) + ((i44 | (-79911246)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE)) & i43)) == 1986687685) {
                                        str2 = str7;
                                        j = j11;
                                        i13 = i12;
                                        j2 = j10;
                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                        a(446 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1857 - android.graphics.Color.green(0)), 16 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr81);
                                        java.lang.Object[] objArr82 = {((java.lang.String) objArr81[0]).intern()};
                                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj2 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength(str2) + 40, 1921 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.text.TextUtils.getOffsetBefore(str2, 0));
                                            byte b35 = $$a[14];
                                            byte b36 = b35;
                                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                                            b(b36, (short) (b36 | 652), (byte) (b35 - 1), objArr83);
                                            obj2 = cls24.getMethod((java.lang.String) objArr83[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                        }
                                        invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr82);
                                        if (invoke != null) {
                                            i14 = 0;
                                        } else {
                                            java.lang.Object[] objArr84 = {invoke, 42};
                                            java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj26 == null) {
                                                java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.text.TextUtils.getCapsMode(str2, 0, 0) + 2594, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                byte b37 = $$a[14];
                                                byte b38 = b37;
                                                java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                b(b38, (short) (b38 | 652), (byte) (b37 - 1), objArr85);
                                                obj26 = cls25.getMethod((java.lang.String) objArr85[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj26);
                                            }
                                            long j27 = ~((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr84)).longValue();
                                            long j28 = ~((-253459664) | j27);
                                            long j29 = ((r7 * (-463)) - 117858743760L) + (((~(j | (-253459664))) | (~(j27 | j)) | j28) * 464) + ((j2 | 253459663 | j27) * (-464)) + (((~(j2 | (-253459664))) | j28) * 464) + 1510560188;
                                            i14 = (((int) (j29 >> 32)) & ((((~(445451511 | i30)) | (~(1882677922 | i13))) * 959) + 730360655 + (((~(445451511 | i13)) | (~(1882677922 | i30))) * 959))) | (((int) j29) & ((((~((-730710030) | i30)) | (~(2127030856 | i13))) * 959) + 1899618585 + (((~((-730710030) | i13)) | (~(2127030856 | i30))) * 959)));
                                        }
                                        if (i14 != 1986687685 && i14 != -1514516938) {
                                            java.lang.Object[] objArr86 = new java.lang.Object[1];
                                            a(1160 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (58774 - android.graphics.Color.blue(0)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, objArr86);
                                            java.lang.String intern15 = ((java.lang.String) objArr86[0]).intern();
                                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                                            a(1176 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (44036 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.widget.ExpandableListView.getPackedPositionChild(0L) + 27, objArr87);
                                            java.lang.String intern16 = ((java.lang.String) objArr87[0]).intern();
                                            java.lang.Object[] objArr88 = new java.lang.Object[1];
                                            a(1201 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 17 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr88);
                                            java.lang.String intern17 = ((java.lang.String) objArr88[0]).intern();
                                            java.lang.Object[] objArr89 = new java.lang.Object[1];
                                            a(android.graphics.Color.blue(0) + 1218, (char) (13388 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), android.view.Gravity.getAbsoluteGravity(0, 0) + 17, objArr89);
                                            java.lang.String intern18 = ((java.lang.String) objArr89[0]).intern();
                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                            a(1235 - android.view.KeyEvent.normalizeMetaState(0), (char) (7746 - android.view.View.combineMeasuredStates(0, 0)), android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, objArr90);
                                            java.lang.String intern19 = ((java.lang.String) objArr90[0]).intern();
                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                            a(1250 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (47086 - android.widget.ExpandableListView.getPackedPositionType(0L)), android.view.KeyEvent.normalizeMetaState(0) + 37, objArr91);
                                            java.lang.String intern20 = ((java.lang.String) objArr91[0]).intern();
                                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                                            a(1288 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (62122 - android.view.MotionEvent.axisFromString(str2)), android.graphics.Color.argb(0, 0, 0, 0) + 12, objArr92);
                                            java.lang.String intern21 = ((java.lang.String) objArr92[0]).intern();
                                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1299, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 21423), android.view.View.resolveSizeAndState(0, 0, 0) + 13, objArr93);
                                            java.lang.String intern22 = ((java.lang.String) objArr93[0]).intern();
                                            java.lang.Object[] objArr94 = new java.lang.Object[1];
                                            a(android.text.TextUtils.indexOf(str2, str2, 0) + 1312, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 22 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr94);
                                            java.lang.String intern23 = ((java.lang.String) objArr94[0]).intern();
                                            java.lang.Object[] objArr95 = new java.lang.Object[1];
                                            a(android.view.View.MeasureSpec.getSize(0) + 1334, (char) android.graphics.Color.alpha(0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, objArr95);
                                            java.lang.String intern24 = ((java.lang.String) objArr95[0]).intern();
                                            java.lang.Object[] objArr96 = new java.lang.Object[1];
                                            a(1365 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.getTrimmedLength(str2) + 12, objArr96);
                                            java.lang.String intern25 = ((java.lang.String) objArr96[0]).intern();
                                            java.lang.Object[] objArr97 = new java.lang.Object[1];
                                            a(1376 - android.view.MotionEvent.axisFromString(str2), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 12 - android.view.View.MeasureSpec.getMode(0), objArr97);
                                            java.lang.String intern26 = ((java.lang.String) objArr97[0]).intern();
                                            java.lang.Object[] objArr98 = new java.lang.Object[1];
                                            a(1389 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 13 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr98);
                                            java.lang.String intern27 = ((java.lang.String) objArr98[0]).intern();
                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                            a(1401 - (android.os.Process.myTid() >> 22), (char) ((-1) - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 12 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr99);
                                            java.lang.String intern28 = ((java.lang.String) objArr99[0]).intern();
                                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                                            a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1412, (char) (36006 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr100);
                                            java.lang.String intern29 = ((java.lang.String) objArr100[0]).intern();
                                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                                            a(1425 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 14 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr101);
                                            java.lang.String intern30 = ((java.lang.String) objArr101[0]).intern();
                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                            a(android.view.View.resolveSizeAndState(0, 0, 0) + 1439, (char) android.view.View.MeasureSpec.getMode(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 13, objArr102);
                                            java.lang.String intern31 = ((java.lang.String) objArr102[0]).intern();
                                            java.lang.Object[] objArr103 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1450, (char) (58926 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), android.text.TextUtils.indexOf(str2, str2, 0) + 24, objArr103);
                                            java.lang.String intern32 = ((java.lang.String) objArr103[0]).intern();
                                            java.lang.Object[] objArr104 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1475, (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 33749), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27, objArr104);
                                            java.lang.String[] strArr9 = {intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, ((java.lang.String) objArr104[0]).intern()};
                                            i19 = 0;
                                            while (i19 < 19) {
                                                java.lang.String str9 = strArr9[i19];
                                                java.lang.Object[] objArr105 = {str9};
                                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                if (obj27 == null) {
                                                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3160, (char) (33099 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                                                    byte b39 = $$a[14];
                                                    byte b40 = b39;
                                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                    b(b40, (short) (b40 | 652), (byte) (b39 - 1), objArr106);
                                                    obj27 = cls26.getMethod((java.lang.String) objArr106[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj27);
                                                }
                                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr105)).longValue();
                                                long j30 = ~longValue9;
                                                str4 = str2;
                                                long j31 = ((((((-987) * longValue9) + 538120060602L) + (((~((j30 | j) | 544105218)) | (~((longValue9 | 544105218) | j2))) * 988)) + ((544105218 | j30) * (-988))) + ((((~((-544105219) | j30)) | (~(j30 | j2))) | (~(longValue9 | (j | 544105218)))) * 988)) - 1881773326;
                                                if (((((int) (j31 >> 32)) & (((((~((-1408291811) | i13)) | (-28934601)) * (-948)) - 897163790) + ((~((-28344769) | i30)) * (-948)) + 1775228516)) | (((int) j31) & ((((((~(239579245 | i13)) | (~((-1197647165) | i30))) | r8) * (-516)) - 995419247) + (((~(1332196733 | i13)) | (~((-134549570) | i30))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~((-239579246) | i30)) | 134549569) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)))) == 0) {
                                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1426, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 14 - android.graphics.Color.red(0), objArr107);
                                                    if (str9.equals(((java.lang.String) objArr107[0]).intern())) {
                                                        java.lang.Object[] objArr108 = {str9};
                                                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                        if (obj28 == null) {
                                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3161, (char) (android.text.TextUtils.getCapsMode(str4, 0, 0) + 33099));
                                                            byte b41 = $$a[14];
                                                            byte b42 = (byte) (b41 - 1);
                                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                            b(b42, (short) (b42 | 41), b41, objArr109);
                                                            obj28 = cls27.getMethod((java.lang.String) objArr109[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj28);
                                                        }
                                                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr108)).longValue();
                                                        long j32 = ~longValue10;
                                                        long j33 = ~(j2 | 431832178);
                                                        str4 = str4;
                                                        strArr3 = strArr9;
                                                        i21 = i19;
                                                        long j34 = (881 * longValue10) + 380444148818L + (((~(j32 | (-431832179))) | (~(j2 | (-431832179))) | (~(j32 | j2))) * (-880)) + (((~(j | (-431832179))) | longValue10 | j33) * (-880)) + (j33 * 880) + 563602725;
                                                        if (((((int) (j34 >> 32)) & (((((~((-1275018631) | i30)) | 162207780) * (-235)) - 652860988) + (((~((-1275018631) | i13)) | 162207780) * (-470)) + (((~((-1112810883) | i13)) | 32) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) | (((int) j34) & (((((~((-1292031105) | i13)) | (~((-272630086) | i30))) * 920) - 2038855459) + (((~((-1293079697) | i30)) | 1292031104) * 920) + (((~((-1292031105) | i30)) | (~((-1048593) | i13)) | (~((-272630086) | i13))) * 920)))) == 0) {
                                                        }
                                                    } else {
                                                        str4 = str4;
                                                        strArr3 = strArr9;
                                                        i21 = i19;
                                                    }
                                                    i19 = i21 + 1;
                                                    strArr9 = strArr3;
                                                    str2 = str4;
                                                } else {
                                                    i21 = i19;
                                                }
                                                i20 = i21;
                                            }
                                            str4 = str2;
                                            i20 = -1;
                                            if (i20 >= 0) {
                                                int i45 = (AlternateContactlessPaymentDataJson + 119) % 128;
                                                values = i45;
                                                int i46 = (i20 + 130) ^ i13;
                                                if (i46 != i13) {
                                                    AlternateContactlessPaymentDataJson = (i45 + 29) % 128;
                                                    java.lang.Object[] objArr110 = {new int[]{i13}, new int[]{i46}, null, null, new int[1]};
                                                    java.lang.Object[] objArr111 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((1093239605 | r1) * 764) - 505039927) + (((~(i30 | 1093239605)) | 940730440) * (-1528)) + (((~(957606492 | i30)) | 2017093993) * 764))};
                                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj29 == null) {
                                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 50, 2713 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                                        byte[] bArr12 = $$a;
                                                        byte b43 = bArr12[14];
                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                        b(b43, (short) (b43 - 1), (byte) (-bArr12[16]), objArr112);
                                                        obj29 = cls28.getMethod((java.lang.String) objArr112[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj29);
                                                    }
                                                    ((int[]) objArr110[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr111)).intValue();
                                                    return objArr110;
                                                }
                                            }
                                            str2 = str4;
                                        }
                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                        a(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1504, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr113);
                                        java.lang.String intern33 = ((java.lang.String) objArr113[0]).intern();
                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                        a(android.text.TextUtils.getTrimmedLength(str2) + 1516, (char) (android.os.Process.getGidForName(str2) + 1), android.text.TextUtils.indexOf(str2, str2, 0, 0) + 5, objArr114);
                                        java.lang.String[] strArr10 = {intern33, ((java.lang.String) objArr114[0]).intern()};
                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1521, (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, objArr115);
                                        java.lang.String intern34 = ((java.lang.String) objArr115[0]).intern();
                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                        a(1536 - android.text.TextUtils.getOffsetBefore(str2, 0), (char) android.text.TextUtils.indexOf(str2, str2, 0), 19 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr116);
                                        java.lang.String intern35 = ((java.lang.String) objArr116[0]).intern();
                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                        a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1555, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 12552), 14 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr117);
                                        java.lang.String[] strArr11 = {intern34, intern35, ((java.lang.String) objArr117[0]).intern()};
                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                        a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1569, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 20634), 21 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr118);
                                        java.lang.String intern36 = ((java.lang.String) objArr118[0]).intern();
                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                        a(1590 - android.graphics.Color.alpha(0), (char) android.text.TextUtils.getOffsetBefore(str2, 0), 10 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr119);
                                        java.lang.String[] strArr12 = {intern36, ((java.lang.String) objArr119[0]).intern()};
                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                        a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 1601, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.view.View.combineMeasuredStates(0, 0) + 11, objArr120);
                                        java.lang.String intern37 = ((java.lang.String) objArr120[0]).intern();
                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.visa.cbp.getCertUsage.setAppPrgrmID, (char) (android.view.MotionEvent.axisFromString(str2) + 21348), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 6, objArr121);
                                        java.lang.String[] strArr13 = {intern37, ((java.lang.String) objArr121[0]).intern()};
                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                        a(1611 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (56316 - android.view.Gravity.getAbsoluteGravity(0, 0)), 29 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr122);
                                        java.lang.String intern38 = ((java.lang.String) objArr122[0]).intern();
                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                        a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 1591, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, objArr123);
                                        c2 = 0;
                                        java.lang.String[][] strArr14 = {strArr10, strArr11, strArr12, strArr13, new java.lang.String[]{intern38, ((java.lang.String) objArr123[0]).intern()}};
                                        i15 = 0;
                                        i16 = -1;
                                        loop4: while (true) {
                                            if (i15 < 5) {
                                                i17 = i13;
                                                break;
                                            }
                                            java.lang.String[] strArr15 = strArr14[i15];
                                            java.lang.String str10 = strArr15[c2];
                                            java.lang.String[] strArr16 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr15, 1, strArr15.length);
                                            int length = strArr16.length;
                                            int i47 = i16;
                                            int i48 = 0;
                                            while (i48 < length) {
                                                java.lang.String str11 = strArr16[i48];
                                                java.io.File file3 = new java.io.File(str10);
                                                if (file3.exists() && file3.isFile()) {
                                                    try {
                                                        java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                                        strArr2 = strArr14;
                                                        try {
                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                            a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 341, (char) ((-1) - android.view.MotionEvent.axisFromString(str2)), 3 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr124);
                                                            java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr124[0]).intern());
                                                            next2 = useDelimiter2.hasNext() ? useDelimiter2.next() : str2;
                                                            useDelimiter2.close();
                                                        } catch (java.io.IOException unused2) {
                                                            continue;
                                                        }
                                                    } catch (java.io.IOException unused3) {
                                                    }
                                                    if (next2.contains(str11)) {
                                                        values = (AlternateContactlessPaymentDataJson + 13) % 128;
                                                        i17 = i13 ^ (i47 + 171);
                                                        break loop4;
                                                    }
                                                    i48++;
                                                    i47++;
                                                    strArr14 = strArr2;
                                                }
                                                strArr2 = strArr14;
                                                i48++;
                                                i47++;
                                                strArr14 = strArr2;
                                            }
                                            i15++;
                                            i16 = i47;
                                            c2 = 0;
                                        }
                                        if (i17 == i13) {
                                            java.lang.Object[] objArr125 = {new int[]{i13}, new int[]{i17}, null, null, new int[1]};
                                            java.lang.Object[] objArr126 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-1232548383) | i13)) | 4600338) * 576) + 1879500625) + (((~((-1227948045) | i30)) | 813697377) * 576)) - 1645172608)};
                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj30 == null) {
                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 50, 2713 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                                byte[] bArr13 = $$a;
                                                byte b44 = bArr13[14];
                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                b(b44, (short) (b44 - 1), (byte) (-bArr13[16]), objArr127);
                                                obj30 = cls29.getMethod((java.lang.String) objArr127[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                            }
                                            ((int[]) objArr125[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr126)).intValue();
                                            return objArr125;
                                        }
                                        try {
                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                            a(android.text.TextUtils.indexOf(str2, str2, 0) + 1639, (char) ((-1) - android.os.Process.getGidForName(str2)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, objArr128);
                                            java.lang.String intern39 = ((java.lang.String) objArr128[0]).intern();
                                            java.lang.Object[] objArr129 = new java.lang.Object[1];
                                            a(android.text.TextUtils.indexOf(str2, str2) + 1652, (char) android.view.KeyEvent.normalizeMetaState(0), 8 - android.view.View.MeasureSpec.getMode(0), objArr129);
                                            intern = ((java.lang.String) objArr129[0]).intern();
                                            file = new java.io.File(intern39);
                                        } catch (java.lang.Exception unused4) {
                                            i18 = i13 ^ 151;
                                        }
                                        if (file.exists() && file.isFile()) {
                                            try {
                                                java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file));
                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + com.visa.cbp.getCertUsage.isReperso, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2 - android.graphics.Color.red(0), objArr130);
                                                java.util.Scanner useDelimiter3 = scanner3.useDelimiter(((java.lang.String) objArr130[0]).intern());
                                                if (useDelimiter3.hasNext()) {
                                                    AlternateContactlessPaymentDataJson = (values + 63) % 128;
                                                    str3 = useDelimiter3.next();
                                                } else {
                                                    str3 = str2;
                                                }
                                                useDelimiter3.close();
                                            } catch (java.io.IOException unused5) {
                                            }
                                            if (str3.contains(intern)) {
                                                i18 = i13 ^ 150;
                                                if (i18 == i13) {
                                                    java.lang.Object[] objArr131 = {new int[]{i13}, new int[]{i18}, null, null, new int[1]};
                                                    java.lang.Object[] objArr132 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-712042355) | i30)) | 172000786) | r1) * (-502)) - 1799072547) + (((~(1878845311 | i13)) | (~(i30 | (-540041569)))) * 502))};
                                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj31 == null) {
                                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str2, 0, 0) + 50, android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                        byte[] bArr14 = $$a;
                                                        byte b45 = bArr14[14];
                                                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                        b(b45, (short) (b45 - 1), (byte) (-bArr14[16]), objArr133);
                                                        obj31 = cls30.getMethod((java.lang.String) objArr133[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                    }
                                                    ((int[]) objArr131[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr132)).intValue();
                                                    return objArr131;
                                                }
                                                java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                a(1659 - android.os.Process.getGidForName(str2), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 47 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr134);
                                                java.lang.Object[] objArr135 = {((java.lang.String) objArr134[0]).intern()};
                                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                if (obj32 == null) {
                                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.Gravity.getAbsoluteGravity(0, 0), 3161 - android.text.TextUtils.indexOf(str2, str2, 0, 0), (char) (33099 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                                                    byte b46 = $$a[14];
                                                    byte b47 = (byte) (b46 - 1);
                                                    java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                    b(b47, (short) (b47 | 41), b46, objArr136);
                                                    obj32 = cls31.getMethod((java.lang.String) objArr136[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj32);
                                                }
                                                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr135)).longValue();
                                                long j35 = ~longValue11;
                                                long j36 = (longValue11 * (-978)) + 436775998120L + ((~(j35 | j)) * 979) + ((j2 | 445689794) * (-979)) + (((~(j35 | j2)) | (~(j | 445689794))) * 979) + 549745109;
                                                int i49 = ~(1595407471 | i30);
                                                int i50 = ~(890145266 | i30);
                                                int i51 = (((((int) j36) & (((((((~((-890145267) | i13)) | (~(1967595619 | i30))) | i50) * (-516)) + 944139921) + (((~((-889585763) | i13)) | (~((-1078009858) | i30))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) + ((i50 | 1078009857) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))) | (((int) (j36 >> 32)) & (((((((~((-1595407472) | i13)) | (~((-158181061) | i30))) | i49) * (-516)) + 50809466) + (((~((-1444042796) | i13)) | (~(1602223855 | i30))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) + ((i49 | (-1602223856)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)))) * 263) ^ i13;
                                                java.lang.Object[] objArr137 = new java.lang.Object[5];
                                                if (i51 != i13) {
                                                    objArr137[0] = new int[]{i13};
                                                    objArr137[1] = new int[]{i51};
                                                    objArr137[4] = new int[1];
                                                    objArr137[2] = null;
                                                    objArr137[3] = null;
                                                    java.lang.Object[] objArr138 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((-78647393) | i30) * 494) - 1731195749) + (((~(1934093977 | i30)) | (-1974636642)) * 494))};
                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj33 == null) {
                                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 50, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2713, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                        byte[] bArr15 = $$a;
                                                        byte b48 = bArr15[14];
                                                        java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                        b(b48, (short) (b48 - 1), (byte) (-bArr15[16]), objArr139);
                                                        obj33 = cls32.getMethod((java.lang.String) objArr139[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                    }
                                                    ((int[]) objArr137[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr138)).intValue();
                                                    return objArr137;
                                                }
                                                objArr137[0] = new int[]{i13};
                                                objArr137[1] = new int[]{i13};
                                                objArr137[4] = new int[1];
                                                objArr137[2] = null;
                                                objArr137[3] = null;
                                                java.lang.Object[] objArr140 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((-1591373) | i13) * (-627)) - 558839884) + (((~((-1873056564) | i13)) | 177789534) * (-627)) + (((~(i13 | 177789534)) | (~(i30 | 1873056563))) * 627))};
                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj34 == null) {
                                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 50, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                    byte[] bArr16 = $$a;
                                                    byte b49 = bArr16[14];
                                                    java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                    b(b49, (short) (b49 - 1), (byte) (-bArr16[16]), objArr141);
                                                    obj34 = cls33.getMethod((java.lang.String) objArr141[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                }
                                                ((int[]) objArr137[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr140)).intValue();
                                                return objArr137;
                                            }
                                        }
                                        i18 = i13;
                                        if (i18 == i13) {
                                        }
                                    }
                                } else {
                                    i12 = i;
                                }
                                java.lang.Object[] objArr142 = new java.lang.Object[1];
                                a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 308, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42811), 24 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr142);
                                java.lang.String intern40 = ((java.lang.String) objArr142[0]).intern();
                                java.lang.Object[] objArr143 = new java.lang.Object[1];
                                a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 366, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 10, objArr143);
                                java.lang.String intern41 = ((java.lang.String) objArr143[0]).intern();
                                java.lang.Object[] objArr144 = new java.lang.Object[1];
                                a(375 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.text.TextUtils.getOffsetBefore(str7, 0) + 46487), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 7, objArr144);
                                java.lang.String intern42 = ((java.lang.String) objArr144[0]).intern();
                                java.lang.Object[] objArr145 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 382, (char) (60210 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7, objArr145);
                                java.lang.String[] strArr17 = {intern40, intern41, intern42, ((java.lang.String) objArr145[0]).intern()};
                                java.lang.Object[] objArr146 = new java.lang.Object[1];
                                a(android.graphics.Color.rgb(0, 0, 0) + 16777606, (char) (android.graphics.Color.rgb(0, 0, 0) + 16824931), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 17, objArr146);
                                java.lang.String intern43 = ((java.lang.String) objArr146[0]).intern();
                                java.lang.Object[] objArr147 = new java.lang.Object[1];
                                a(407 - android.view.View.resolveSize(0, 0), (char) android.graphics.Color.alpha(0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 7, objArr147);
                                java.lang.String intern44 = ((java.lang.String) objArr147[0]).intern();
                                java.lang.Object[] objArr148 = new java.lang.Object[1];
                                a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 366, (char) (android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), android.graphics.ImageFormat.getBitsPerPixel(0) + 8, objArr148);
                                java.lang.String intern45 = ((java.lang.String) objArr148[0]).intern();
                                java.lang.Object[] objArr149 = new java.lang.Object[1];
                                a(android.graphics.Color.red(0) + 421, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 11 - android.graphics.Color.alpha(0), objArr149);
                                java.lang.String intern46 = ((java.lang.String) objArr149[0]).intern();
                                java.lang.Object[] objArr150 = new java.lang.Object[1];
                                a(432 - android.text.TextUtils.indexOf(str7, str7, 0, 0), (char) (3398 - android.view.View.resolveSizeAndState(0, 0, 0)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, objArr150);
                                java.lang.String[] strArr18 = {intern43, intern44, intern45, intern46, ((java.lang.String) objArr150[0]).intern()};
                                java.lang.Object[] objArr151 = new java.lang.Object[1];
                                a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 445, (char) (android.view.View.MeasureSpec.getMode(0) + 1857), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, objArr151);
                                java.lang.String intern47 = ((java.lang.String) objArr151[0]).intern();
                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                a(462 - android.text.TextUtils.getOffsetAfter(str7, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 60388), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 3, objArr152);
                                java.lang.String intern48 = ((java.lang.String) objArr152[0]).intern();
                                java.lang.Object[] objArr153 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 472, (char) (android.text.TextUtils.indexOf(str7, str7, 0, 0) + 51136), 22 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr153);
                                java.lang.String intern49 = ((java.lang.String) objArr153[0]).intern();
                                java.lang.Object[] objArr154 = new java.lang.Object[1];
                                a(android.os.Process.getGidForName(str7) + 496, (char) (android.view.KeyEvent.normalizeMetaState(0) + 37059), 25 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr154);
                                java.lang.String intern50 = ((java.lang.String) objArr154[0]).intern();
                                java.lang.Object[] objArr155 = new java.lang.Object[1];
                                a(520 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (56429 - android.view.KeyEvent.keyCodeFromString(str7)), 28 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr155);
                                j = j11;
                                str2 = str7;
                                j2 = j10;
                                java.lang.String[] strArr19 = {intern47, intern48, intern2, intern49, intern50, ((java.lang.String) objArr155[0]).intern()};
                                java.lang.Object[] objArr156 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 548, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 46451), android.view.View.MeasureSpec.getMode(0) + 11, objArr156);
                                java.lang.String intern51 = ((java.lang.String) objArr156[0]).intern();
                                java.lang.Object[] objArr157 = new java.lang.Object[1];
                                a(559 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.indexOf(str2, str2), 8 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr157);
                                java.lang.String intern52 = ((java.lang.String) objArr157[0]).intern();
                                java.lang.Object[] objArr158 = new java.lang.Object[1];
                                a(567 - (android.os.Process.myPid() >> 22), (char) (52793 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 6 - android.view.View.resolveSizeAndState(0, 0, 0), objArr158);
                                java.lang.String intern53 = ((java.lang.String) objArr158[0]).intern();
                                java.lang.Object[] objArr159 = new java.lang.Object[1];
                                a(574 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetAfter(str2, 0), 6 - android.text.TextUtils.indexOf(str2, str2), objArr159);
                                java.lang.String[] strArr20 = {intern51, intern52, intern53, ((java.lang.String) objArr159[0]).intern()};
                                java.lang.Object[] objArr160 = new java.lang.Object[1];
                                a(android.graphics.Color.red(0) + 579, (char) (47324 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), 16 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr160);
                                java.lang.String intern54 = ((java.lang.String) objArr160[0]).intern();
                                java.lang.Object[] objArr161 = new java.lang.Object[1];
                                a(414 - android.graphics.Color.alpha(0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.view.View.combineMeasuredStates(0, 0) + 7, objArr161);
                                java.lang.String intern55 = ((java.lang.String) objArr161[0]).intern();
                                java.lang.Object[] objArr162 = new java.lang.Object[1];
                                a((android.os.Process.myPid() >> 22) + 382, (char) (60162 - android.view.KeyEvent.normalizeMetaState(0)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7, objArr162);
                                java.lang.String[] strArr21 = {intern54, intern55, ((java.lang.String) objArr162[0]).intern()};
                                java.lang.Object[] objArr163 = new java.lang.Object[1];
                                a(594 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.green(0), 14 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr163);
                                java.lang.String intern56 = ((java.lang.String) objArr163[0]).intern();
                                java.lang.Object[] objArr164 = new java.lang.Object[1];
                                a(657 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr164);
                                java.lang.String[] strArr22 = {intern56, ((java.lang.String) objArr164[0]).intern()};
                                java.lang.Object[] objArr165 = new java.lang.Object[1];
                                a((android.os.Process.myPid() >> 22) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, (char) (19582 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 9 - android.text.TextUtils.getOffsetAfter(str2, 0), objArr165);
                                java.lang.String intern57 = ((java.lang.String) objArr165[0]).intern();
                                java.lang.Object[] objArr166 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 619, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 1 - android.view.View.resolveSize(0, 0), objArr166);
                                java.lang.String[] strArr23 = {intern57, ((java.lang.String) objArr166[0]).intern()};
                                java.lang.Object[] objArr167 = new java.lang.Object[1];
                                a(620 - android.text.TextUtils.getOffsetBefore(str2, 0), (char) (54247 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 16 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr167);
                                java.lang.String intern58 = ((java.lang.String) objArr167[0]).intern();
                                java.lang.Object[] objArr168 = new java.lang.Object[1];
                                a(462 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (60388 - android.view.MotionEvent.axisFromString(str2)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '-', objArr168);
                                java.lang.String intern59 = ((java.lang.String) objArr168[0]).intern();
                                java.lang.Object[] objArr169 = new java.lang.Object[1];
                                a(407 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.text.TextUtils.indexOf(str2, str2, 0), 6 - android.view.MotionEvent.axisFromString(str2), objArr169);
                                java.lang.String intern60 = ((java.lang.String) objArr169[0]).intern();
                                java.lang.Object[] objArr170 = new java.lang.Object[1];
                                a(684 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 58469), android.view.KeyEvent.normalizeMetaState(0) + 8, objArr170);
                                java.lang.String intern61 = ((java.lang.String) objArr170[0]).intern();
                                java.lang.Object[] objArr171 = new java.lang.Object[1];
                                a(android.os.Process.getGidForName(str2) + 422, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 11 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr171);
                                java.lang.String intern62 = ((java.lang.String) objArr171[0]).intern();
                                java.lang.Object[] objArr172 = new java.lang.Object[1];
                                a(433 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.view.View.combineMeasuredStates(0, 0) + 3398), 14 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr172);
                                java.lang.String[] strArr24 = {intern58, intern59, intern60, intern61, intern62, ((java.lang.String) objArr172[0]).intern()};
                                java.lang.Object[] objArr173 = new java.lang.Object[1];
                                a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 645, (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 21301), 20 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr173);
                                java.lang.String intern63 = ((java.lang.String) objArr173[0]).intern();
                                java.lang.Object[] objArr174 = new java.lang.Object[1];
                                a(android.view.View.MeasureSpec.getSize(0) + 664, (char) android.view.KeyEvent.keyCodeFromString(str2), 19 - android.text.TextUtils.indexOf(str2, str2, 0), objArr174);
                                java.lang.String intern64 = ((java.lang.String) objArr174[0]).intern();
                                java.lang.Object[] objArr175 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 683, (char) android.graphics.Color.red(0), (android.os.Process.myTid() >> 22) + 31, objArr175);
                                java.lang.String intern65 = ((java.lang.String) objArr175[0]).intern();
                                java.lang.Object[] objArr176 = new java.lang.Object[1];
                                a(714 - android.text.TextUtils.indexOf(str2, str2), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, objArr176);
                                java.lang.String intern66 = ((java.lang.String) objArr176[0]).intern();
                                java.lang.Object[] objArr177 = new java.lang.Object[1];
                                a(android.view.MotionEvent.axisFromString(str2) + 741, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 'G' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr177);
                                java.lang.String intern67 = ((java.lang.String) objArr177[0]).intern();
                                java.lang.Object[] objArr178 = new java.lang.Object[1];
                                a(764 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (28950 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), 32 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr178);
                                i13 = i12;
                                java.lang.String[] strArr25 = {intern63, intern64, intern65, intern66, intern67, ((java.lang.String) objArr178[0]).intern(), intern2};
                                java.lang.Object[] objArr179 = new java.lang.Object[1];
                                a(796 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (34728 - android.text.TextUtils.getOffsetBefore(str2, 0)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 13, objArr179);
                                java.lang.String intern68 = ((java.lang.String) objArr179[0]).intern();
                                java.lang.Object[] objArr180 = new java.lang.Object[1];
                                a(375 - android.graphics.Color.red(0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 46487), android.view.View.getDefaultSize(0, 0) + 7, objArr180);
                                java.lang.String[] strArr26 = {intern68, ((java.lang.String) objArr180[0]).intern()};
                                java.lang.Object[] objArr181 = new java.lang.Object[1];
                                a(808 - android.view.MotionEvent.axisFromString(str2), (char) android.graphics.Color.red(0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29, objArr181);
                                java.lang.String intern69 = ((java.lang.String) objArr181[0]).intern();
                                java.lang.Object[] objArr182 = new java.lang.Object[1];
                                a(839 - android.view.View.MeasureSpec.getSize(0), (char) android.view.Gravity.getAbsoluteGravity(0, 0), 11 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr182);
                                java.lang.String[] strArr27 = {intern69, ((java.lang.String) objArr182[0]).intern()};
                                java.lang.Object[] objArr183 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 850, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59675), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, objArr183);
                                java.lang.String intern70 = ((java.lang.String) objArr183[0]).intern();
                                java.lang.Object[] objArr184 = new java.lang.Object[1];
                                a(868 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (31225 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), android.text.TextUtils.getOffsetBefore(str2, 0) + 5, objArr184);
                                java.lang.String[] strArr28 = {intern70, ((java.lang.String) objArr184[0]).intern()};
                                java.lang.Object[] objArr185 = new java.lang.Object[1];
                                a((-16776342) - android.graphics.Color.rgb(0, 0, 0), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), 19 - android.view.KeyEvent.getDeadChar(0, 0), objArr185);
                                java.lang.String[] strArr29 = {((java.lang.String) objArr185[0]).intern()};
                                java.lang.Object[] objArr186 = new java.lang.Object[1];
                                a(893 - android.text.TextUtils.getOffsetBefore(str2, 0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49991), 16 - android.text.TextUtils.getOffsetAfter(str2, 0), objArr186);
                                java.lang.String[] strArr30 = {((java.lang.String) objArr186[0]).intern()};
                                java.lang.Object[] objArr187 = new java.lang.Object[1];
                                a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 908, (char) (android.graphics.Color.rgb(0, 0, 0) + 16839545), android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 20, objArr187);
                                java.lang.String[] strArr31 = {((java.lang.String) objArr187[0]).intern()};
                                java.lang.Object[] objArr188 = new java.lang.Object[1];
                                a(928 - android.view.KeyEvent.keyCodeFromString(str2), (char) (32455 - (android.os.Process.myTid() >> 22)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, objArr188);
                                java.lang.String[] strArr32 = {((java.lang.String) objArr188[0]).intern()};
                                java.lang.Object[] objArr189 = new java.lang.Object[1];
                                a(android.view.View.resolveSizeAndState(0, 0, 0) + 947, (char) (android.text.TextUtils.indexOf(str2, str2, 0) + 43026), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 23, objArr189);
                                java.lang.String[] strArr33 = {((java.lang.String) objArr189[0]).intern()};
                                java.lang.Object[] objArr190 = new java.lang.Object[1];
                                a(969 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.text.TextUtils.indexOf(str2, str2, 0), 20 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr190);
                                java.lang.String[] strArr34 = {((java.lang.String) objArr190[0]).intern()};
                                java.lang.Object[] objArr191 = new java.lang.Object[1];
                                a(android.view.KeyEvent.keyCodeFromString(str2) + 991, (char) (android.os.Process.getGidForName(str2) + 1), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, objArr191);
                                java.lang.String[] strArr35 = {((java.lang.String) objArr191[0]).intern(), intern2};
                                java.lang.Object[] objArr192 = new java.lang.Object[1];
                                a(android.graphics.Color.blue(0) + 1015, (char) ((-1) - android.view.MotionEvent.axisFromString(str2)), android.text.TextUtils.indexOf(str2, str2, 0, 0) + 28, objArr192);
                                java.lang.String[] strArr36 = {((java.lang.String) objArr192[0]).intern(), intern2};
                                java.lang.Object[] objArr193 = new java.lang.Object[1];
                                a(1043 - android.text.TextUtils.getTrimmedLength(str2), (char) android.text.TextUtils.indexOf(str2, str2, 0), android.view.View.combineMeasuredStates(0, 0) + 27, objArr193);
                                java.lang.String[] strArr37 = {((java.lang.String) objArr193[0]).intern(), intern2};
                                java.lang.Object[] objArr194 = new java.lang.Object[1];
                                a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1069, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35140), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30, objArr194);
                                java.lang.String[] strArr38 = {((java.lang.String) objArr194[0]).intern(), intern2};
                                java.lang.Object[] objArr195 = new java.lang.Object[1];
                                a(1101 - android.graphics.Color.alpha(0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 27 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr195);
                                java.lang.String[] strArr39 = {((java.lang.String) objArr195[0]).intern(), intern2};
                                java.lang.Object[] objArr196 = new java.lang.Object[1];
                                a(1128 - android.text.TextUtils.indexOf(str2, str2, 0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 32 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr196);
                                java.lang.String[][] strArr40 = {strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, new java.lang.String[]{((java.lang.String) objArr196[0]).intern(), intern2}};
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                int i52 = i13;
                                int i53 = 0;
                                int i54 = 0;
                                while (i53 < 24) {
                                    java.lang.String[] strArr41 = strArr40[i53];
                                    java.lang.Object[] objArr197 = {strArr41[0]};
                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj35 == null) {
                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 40, 1920 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                        byte b50 = $$a[14];
                                        byte b51 = b50;
                                        strArr = strArr40;
                                        java.lang.Object[] objArr198 = new java.lang.Object[1];
                                        b(b51, (short) (b51 | 652), (byte) (b50 - 1), objArr198);
                                        obj35 = cls34.getMethod((java.lang.String) objArr198[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj35);
                                    } else {
                                        strArr = strArr40;
                                    }
                                    java.lang.String str12 = (java.lang.String) ((java.lang.reflect.Method) obj35).invoke(null, objArr197);
                                    java.lang.String[] strArr42 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr41, 1, strArr41.length);
                                    if (str12 != null && str12.length() != 0) {
                                        if (strArr41.length != 1) {
                                            for (java.lang.String str13 : strArr42) {
                                                values = (AlternateContactlessPaymentDataJson + 17) % 128;
                                                if (str12.contains(str13)) {
                                                    values = (AlternateContactlessPaymentDataJson + 25) % 128;
                                                }
                                            }
                                        }
                                        i54++;
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append(str12);
                                        java.lang.Object[] objArr199 = new java.lang.Object[1];
                                        a(1161 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.View.getDefaultSize(0, 0) + 1, objArr199);
                                        sb.append(((java.lang.String) objArr199[0]).intern());
                                        sb.append(str12);
                                        arrayList.add(sb.toString());
                                        i52 = (i53 + 10) ^ i13;
                                        break;
                                    }
                                    i53++;
                                    strArr40 = strArr;
                                }
                                if (i54 > 2) {
                                    objArr = new java.lang.Object[]{new int[]{i13}, new int[]{i52}, arrayList, null, new int[1]};
                                    java.lang.Object[] objArr200 = {num, num, java.lang.Integer.valueOf(((((~((-562119177) | i13)) | r1) * 590) - 1032050009) + (((~((-1281236424) | i30)) | 1073745925 | (~(769609674 | i30))) * (-1180)) + (((~((-769609675) | i30)) | (~(1281236423 | i30))) * 590))};
                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj36 == null) {
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 51, android.os.Process.getGidForName(str2) + 2714, (char) android.text.TextUtils.getTrimmedLength(str2));
                                        byte[] bArr17 = $$a;
                                        byte b52 = bArr17[14];
                                        java.lang.Object[] objArr201 = new java.lang.Object[1];
                                        b(b52, (short) (b52 - 1), (byte) (-bArr17[16]), objArr201);
                                        obj36 = cls35.getMethod((java.lang.String) objArr201[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                    }
                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr200)).intValue();
                                    c = 0;
                                    ((int[]) objArr[4])[0] = intValue;
                                } else {
                                    objArr = new java.lang.Object[]{new int[]{i13}, new int[]{i13}, null, null, new int[1]};
                                    java.lang.Object[] objArr202 = {num, num, java.lang.Integer.valueOf((((~(1798250732 | i30)) | (-1865379054) | (~((-185467045) | i13))) * 717) + 517533852 + (((~(1798250732 | i13)) | (~((-185467045) | i30)) | (-1865379054)) * 717))};
                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj37 == null) {
                                        java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 50, 2713 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.KeyEvent.keyCodeFromString(str2));
                                        byte[] bArr18 = $$a;
                                        byte b53 = bArr18[14];
                                        java.lang.Object[] objArr203 = new java.lang.Object[1];
                                        b(b53, (short) (b53 - 1), (byte) (-bArr18[16]), objArr203);
                                        obj37 = cls36.getMethod((java.lang.String) objArr203[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                    }
                                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr202)).intValue();
                                    c = 0;
                                    ((int[]) objArr[4])[0] = intValue2;
                                }
                                int i55 = ((int[]) objArr[1])[c];
                                if (i55 != i13) {
                                    int[] iArr3 = new int[1];
                                    int[] iArr4 = new int[1];
                                    java.util.List list = (java.util.List) objArr[2];
                                    iArr3[c] = i13;
                                    iArr4[c] = i55;
                                    java.lang.Object[] objArr204 = {iArr3, iArr4, list, null, new int[1]};
                                    java.lang.Object[] objArr205 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-822108225) | i30)) | (~((-1085409550) | i30))) * (-184)) - 1642680999) + (((~(i30 | (-1157073712))) | ((~((-893772387) | i30)) | 71664162)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 902744120)};
                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj38 == null) {
                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.graphics.Color.red(0) + 2713, (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                        byte[] bArr19 = $$a;
                                        byte b54 = bArr19[14];
                                        java.lang.Object[] objArr206 = new java.lang.Object[1];
                                        b(b54, (short) (b54 - 1), (byte) (-bArr19[16]), objArr206);
                                        obj38 = cls37.getMethod((java.lang.String) objArr206[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                    }
                                    ((int[]) objArr204[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr205)).intValue();
                                    return objArr204;
                                }
                                java.lang.Object[] objArr812 = new java.lang.Object[1];
                                a(446 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1857 - android.graphics.Color.green(0)), 16 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr812);
                                java.lang.Object[] objArr822 = {((java.lang.String) objArr812[0]).intern()};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                }
                                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr822);
                                if (invoke != null) {
                                }
                                if (i14 != 1986687685) {
                                    java.lang.Object[] objArr862 = new java.lang.Object[1];
                                    a(1160 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (58774 - android.graphics.Color.blue(0)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, objArr862);
                                    java.lang.String intern152 = ((java.lang.String) objArr862[0]).intern();
                                    java.lang.Object[] objArr872 = new java.lang.Object[1];
                                    a(1176 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (44036 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.widget.ExpandableListView.getPackedPositionChild(0L) + 27, objArr872);
                                    java.lang.String intern162 = ((java.lang.String) objArr872[0]).intern();
                                    java.lang.Object[] objArr882 = new java.lang.Object[1];
                                    a(1201 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 17 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr882);
                                    java.lang.String intern172 = ((java.lang.String) objArr882[0]).intern();
                                    java.lang.Object[] objArr892 = new java.lang.Object[1];
                                    a(android.graphics.Color.blue(0) + 1218, (char) (13388 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), android.view.Gravity.getAbsoluteGravity(0, 0) + 17, objArr892);
                                    java.lang.String intern182 = ((java.lang.String) objArr892[0]).intern();
                                    java.lang.Object[] objArr902 = new java.lang.Object[1];
                                    a(1235 - android.view.KeyEvent.normalizeMetaState(0), (char) (7746 - android.view.View.combineMeasuredStates(0, 0)), android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, objArr902);
                                    java.lang.String intern192 = ((java.lang.String) objArr902[0]).intern();
                                    java.lang.Object[] objArr912 = new java.lang.Object[1];
                                    a(1250 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (47086 - android.widget.ExpandableListView.getPackedPositionType(0L)), android.view.KeyEvent.normalizeMetaState(0) + 37, objArr912);
                                    java.lang.String intern202 = ((java.lang.String) objArr912[0]).intern();
                                    java.lang.Object[] objArr922 = new java.lang.Object[1];
                                    a(1288 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (62122 - android.view.MotionEvent.axisFromString(str2)), android.graphics.Color.argb(0, 0, 0, 0) + 12, objArr922);
                                    java.lang.String intern212 = ((java.lang.String) objArr922[0]).intern();
                                    java.lang.Object[] objArr932 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1299, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 21423), android.view.View.resolveSizeAndState(0, 0, 0) + 13, objArr932);
                                    java.lang.String intern222 = ((java.lang.String) objArr932[0]).intern();
                                    java.lang.Object[] objArr942 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf(str2, str2, 0) + 1312, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 22 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr942);
                                    java.lang.String intern232 = ((java.lang.String) objArr942[0]).intern();
                                    java.lang.Object[] objArr952 = new java.lang.Object[1];
                                    a(android.view.View.MeasureSpec.getSize(0) + 1334, (char) android.graphics.Color.alpha(0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, objArr952);
                                    java.lang.String intern242 = ((java.lang.String) objArr952[0]).intern();
                                    java.lang.Object[] objArr962 = new java.lang.Object[1];
                                    a(1365 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.getTrimmedLength(str2) + 12, objArr962);
                                    java.lang.String intern252 = ((java.lang.String) objArr962[0]).intern();
                                    java.lang.Object[] objArr972 = new java.lang.Object[1];
                                    a(1376 - android.view.MotionEvent.axisFromString(str2), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 12 - android.view.View.MeasureSpec.getMode(0), objArr972);
                                    java.lang.String intern262 = ((java.lang.String) objArr972[0]).intern();
                                    java.lang.Object[] objArr982 = new java.lang.Object[1];
                                    a(1389 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 13 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr982);
                                    java.lang.String intern272 = ((java.lang.String) objArr982[0]).intern();
                                    java.lang.Object[] objArr992 = new java.lang.Object[1];
                                    a(1401 - (android.os.Process.myTid() >> 22), (char) ((-1) - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 12 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr992);
                                    java.lang.String intern282 = ((java.lang.String) objArr992[0]).intern();
                                    java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                    a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1412, (char) (36006 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr1002);
                                    java.lang.String intern292 = ((java.lang.String) objArr1002[0]).intern();
                                    java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                    a(1425 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 14 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr1012);
                                    java.lang.String intern302 = ((java.lang.String) objArr1012[0]).intern();
                                    java.lang.Object[] objArr1022 = new java.lang.Object[1];
                                    a(android.view.View.resolveSizeAndState(0, 0, 0) + 1439, (char) android.view.View.MeasureSpec.getMode(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 13, objArr1022);
                                    java.lang.String intern312 = ((java.lang.String) objArr1022[0]).intern();
                                    java.lang.Object[] objArr1032 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1450, (char) (58926 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), android.text.TextUtils.indexOf(str2, str2, 0) + 24, objArr1032);
                                    java.lang.String intern322 = ((java.lang.String) objArr1032[0]).intern();
                                    java.lang.Object[] objArr1042 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1475, (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 33749), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27, objArr1042);
                                    java.lang.String[] strArr92 = {intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, intern292, intern302, intern312, intern322, ((java.lang.String) objArr1042[0]).intern()};
                                    i19 = 0;
                                    while (i19 < 19) {
                                    }
                                    str4 = str2;
                                    i20 = -1;
                                    if (i20 >= 0) {
                                    }
                                    str2 = str4;
                                }
                                java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                a(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1504, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr1132);
                                java.lang.String intern332 = ((java.lang.String) objArr1132[0]).intern();
                                java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                a(android.text.TextUtils.getTrimmedLength(str2) + 1516, (char) (android.os.Process.getGidForName(str2) + 1), android.text.TextUtils.indexOf(str2, str2, 0, 0) + 5, objArr1142);
                                java.lang.String[] strArr102 = {intern332, ((java.lang.String) objArr1142[0]).intern()};
                                java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1521, (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, objArr1152);
                                java.lang.String intern342 = ((java.lang.String) objArr1152[0]).intern();
                                java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                a(1536 - android.text.TextUtils.getOffsetBefore(str2, 0), (char) android.text.TextUtils.indexOf(str2, str2, 0), 19 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr1162);
                                java.lang.String intern352 = ((java.lang.String) objArr1162[0]).intern();
                                java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1555, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 12552), 14 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr1172);
                                java.lang.String[] strArr112 = {intern342, intern352, ((java.lang.String) objArr1172[0]).intern()};
                                java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1569, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 20634), 21 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr1182);
                                java.lang.String intern362 = ((java.lang.String) objArr1182[0]).intern();
                                java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                a(1590 - android.graphics.Color.alpha(0), (char) android.text.TextUtils.getOffsetBefore(str2, 0), 10 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr1192);
                                java.lang.String[] strArr122 = {intern362, ((java.lang.String) objArr1192[0]).intern()};
                                java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 1601, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.view.View.combineMeasuredStates(0, 0) + 11, objArr1202);
                                java.lang.String intern372 = ((java.lang.String) objArr1202[0]).intern();
                                java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.visa.cbp.getCertUsage.setAppPrgrmID, (char) (android.view.MotionEvent.axisFromString(str2) + 21348), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 6, objArr1212);
                                java.lang.String[] strArr132 = {intern372, ((java.lang.String) objArr1212[0]).intern()};
                                java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                a(1611 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (56316 - android.view.Gravity.getAbsoluteGravity(0, 0)), 29 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr1222);
                                java.lang.String intern382 = ((java.lang.String) objArr1222[0]).intern();
                                java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 1591, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, objArr1232);
                                c2 = 0;
                                java.lang.String[][] strArr142 = {strArr102, strArr112, strArr122, strArr132, new java.lang.String[]{intern382, ((java.lang.String) objArr1232[0]).intern()}};
                                i15 = 0;
                                i16 = -1;
                                loop4: while (true) {
                                    if (i15 < 5) {
                                    }
                                    i15++;
                                    i16 = i47;
                                    c2 = 0;
                                }
                                if (i17 == i13) {
                                }
                            }
                        }
                        java.lang.Object[] objArr207 = new java.lang.Object[1];
                        a(342 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.text.TextUtils.getCapsMode(str7, 0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, objArr207);
                        java.lang.String intern71 = ((java.lang.String) objArr207[0]).intern();
                        java.lang.Object[] objArr208 = new java.lang.Object[1];
                        a(android.view.MotionEvent.axisFromString(str7) + 357, (char) android.view.KeyEvent.normalizeMetaState(0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, objArr208);
                        java.lang.String intern72 = ((java.lang.String) objArr208[0]).intern();
                        java.io.File file4 = new java.io.File(intern71);
                        if (file4.exists() && file4.isFile()) {
                            try {
                                java.util.Scanner scanner4 = new java.util.Scanner(new java.io.FileInputStream(file4));
                                java.lang.Object[] objArr209 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 341, (char) (android.os.Process.myTid() >> 22), 2 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr209);
                                java.util.Scanner useDelimiter4 = scanner4.useDelimiter(((java.lang.String) objArr209[0]).intern());
                                next = useDelimiter4.hasNext() ? useDelimiter4.next() : str7;
                                useDelimiter4.close();
                            } catch (java.io.IOException unused6) {
                            }
                            if (next.contains(intern72)) {
                                i11 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                                if (i11 != i) {
                                }
                            }
                        }
                        i11 = i;
                        if (i11 != i) {
                        }
                    }
                }
                i9 = i;
                if (i9 == i) {
                }
            }
        };
        int i = valueOf + 115;
        values = i % 128;
        if (i % 2 != 0) {
            return setmobilepin;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        int i = valueOf + 27;
        values = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (transactioncanberesumed == null || transactioncanberesumed.DigitizedCardProfile() == 0) {
            super.valueOf(com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) 0));
            super.AlternateContactlessPaymentDataJson((byte) 0);
            int i2 = valueOf + 53;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(java.lang.Byte.valueOf(transactioncanberesumed.AlternateContactlessPaymentDataJson(0)));
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        values = 1;
        DigitizedCardProfile = 4818066285470257370L;
    }

    static void init$0() {
        $$a = new byte[]{63, kotlin.io.encoding.Base64.padSymbol, -101, com.google.common.base.Ascii.SI};
        $$b = 89;
    }
}
