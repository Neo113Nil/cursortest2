package com.payair.hce;

/* loaded from: classes4.dex */
public class setAllowClickWhenDisabled implements com.payair.hce.setStatusCodeFromServer {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static int writeReplace;

    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2 = b * 2;
        byte[] bArr = $$a;
        int i3 = 39 - (s * 2);
        int i4 = 718 - i;
        char[] cArr = new char[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = (i4 + i2) - 2;
        }
        while (true) {
            i5++;
            i3++;
            cArr[i5] = (char) i4;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i4 = (i4 + bArr[i3]) - 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = (b * 2) + 4;
        byte[] bArr = $$d;
        int i6 = 1 - (s * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i4 = 0;
            i5++;
            i2 = i7 + (-i8);
            i3 = i4;
            int i9 = i2;
            int i10 = i5;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i9;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i10];
            i7 = i9;
            i5 = i10;
            i5++;
            i2 = i7 + (-i8);
            i3 = i4;
            int i92 = i2;
            int i102 = i5;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i92;
            if (i4 == i6) {
            }
        } else {
            i2 = (i * 4) + 99;
            i3 = 0;
            int i922 = i2;
            int i1022 = i5;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i922;
            if (i4 == i6) {
            }
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void writeReplace(java.lang.String str, java.lang.Object... objArr) {
        int i = writeReplace;
        int i2 = i & 119;
        int i3 = (i2 - (~((i ^ 119) | i2))) - 1;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void values(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        int i = valueOf;
        int i2 = i & 3;
        int i3 = -(-((i ^ 3) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        writeReplace = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void valueOf(java.lang.String str, java.lang.Object... objArr) {
        int i = valueOf + 63;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void DigitizedCardProfile(java.lang.String str, java.lang.Object... objArr) {
        int i = valueOf;
        int i2 = (i & 73) + (i | 73);
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void values(java.lang.String str, java.lang.Object... objArr) {
        int i = writeReplace;
        int i2 = (i & 65) + (i | 65);
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.Object... objArr) {
        valueOf = (writeReplace + 37) % 128;
    }

    private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.MeasureSpec.getMode(0), android.text.TextUtils.indexOf("", "", 0, 0) + 381, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 62387));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((byte) 0, (short) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 35, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3918, (char) (40222 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 34, android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $10 = ($11 + 83) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i4 = $10 + 9;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 212 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.text.TextUtils.indexOf("", ""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                throw new java.lang.ArithmeticException();
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 211 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        java.lang.String str = new java.lang.String(cArr);
        int i5 = $10 + 97;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        writeReplace = 1;
        char[] cArr = new char[1707];
        java.nio.ByteBuffer.wrap("\tE\u001d¥ Y7\u001d[énZu\u0007\u0099«¬V³\u000fÇ\u00adê@ñ\u0006\u0005\u009a(Q?\u000bC¾VC}\t\u0081¨\u0094E»2Ï«ÒGù\u0003\rº\u0010Q\u001c¬\bL5°\"ôN\u0000{³`î\u008cB¹¿¦æÒDÿ©äï\u0010s=©*ïVCC½hÚ\u0094V\u0081¯®öÚRÇªìï\u0012¡\u0006A;½,ù@\ru¾nã\u0082O·²¨ëÜIñ¤êâ\u001e~3§$òXPM¶^\u0080Jww\u0080`Ý\f,9\u0095\"ÂÎfû\u0082äÀ\u0090d½Ù¦ÌRo\u007f\u0099hÎ\u0014y\u0001\u009d*ÚÖvÃ¬ìÊ\u0098|\u0085\u0086®ÓZyG\u0083pß^\u0080Jaw\u008d`Í\f,9\u009c\"ÊÎ,û\u0087äÞ\u0090n½\u0086^\u0080Jaw\u008d`Í\f,9\u008b\"ÄÎoûÙäÜ\u0090s½\u0099¦Û^\u0080Jww\u009d`Í\fb9\u008a\"ÉÎ-û¥äê\u0090L½\u0099¦ÝRe\u007f±hË\u0014k\u0001\u0095gZs\u00adNZY\u00075\u00ad\u0000G\u001b\u001a÷÷ÂAÝ\u001f©¹\u0084\u0003\u009f\u001dk³FMQ\u001e-§8\u0000\u0013\u0000ï«^ÍJmw\u009e`À\fl9\u0080^óJE^\u0080Jww\u0080`Ý\fw9\u009d\"ÀÎ-û\u0095äÅ\u0090o½Ù¦ÅRe\u007f\u0098hß\u0014I\u0001¹*\u0084ÖpÃ\u0096ìÅ\u0098h\u0085ß®ÄZsG\u009fpÒ\u001ci\t\u009f2É^\u0080Jww\u0080`Ý\fw9\u009d\"ÀÎ-û\u0095äÅ\u0090o½Ù¦ÅRe\u007f\u0098hß\u0014I\u0001¹*\u0084ÖnÃ\u0081ìÇ\u0098mÈ¿ÜHá¿öâ\u009aH¯¢´ÿX\u0012m¤rú\u0006\\+æ0øÄVé¨þû\u0082E\u0097¦¼ã@wU\u0081zç\u000eP\u0013¢8èÌ\rÑ½æöÝ\u009bÉ{ô\u0087ãÃ\u008f7º\u008d¡ÓMtx\u0099gÐ\u0013o>\u0088%ÃÑo^ÝJkw×`Ì\fv9\u0091\"ÁÎfûÙäÄ\u0090n½\u0085¦ßõÄádÜ\u009dËØ§c\u0092Ó\u0089ÆebP\u0086\u008eÔ\u009a §ß°\u0095Ü4é\u0083ò\u009f\u001e?+Ï4\u009d@&mÛv\u008c\u0082 ¯Ä¸\u0093Ä8e¢q\u0002L÷[¸7\u0013\u0002ý]ÙIotÓcÚ\u000fu:\u0093!ÍÍsø\u0090çÜ\u0093+¾\u009f¥ÎQj|\u0084kÈ\u0017z\u0002\u0093)ÙÕoÀ\u0085ïÉ\u009bk^ÈJaw\u0097`×^ÙJfw\u0096`Ö\fp9\u009e«K¿¿\u0082@\u0095\nù«Ì\u001c×\u000b;¦\u000eX\u0011\u0012e¦HXS\u0013^ÙJfw\u0096`Ö\fd9\u008d\"ÈÎqû\u0083^èJaw\u0097`×\fn9\u0097\"ÙÎkû\u0098äÂ?\u0095+%\u0016Ý\u0001\u008fm#XÀC\u008c\u008bï\u009fO¢¨µâÙMì²÷û\u001bL^ÝJkw×`Þ\fq9\u0097\"ÉÎwû\u0094äØ\u0090/½\u0092¦ÎRv\u007f\u009chÉ\u0014z^ÙJfw\u0096`Ö\f;9Î\"Ý^ÈJaw\u0097`Ë\fq9\u0091\"Î^ÈJaw\u0097`Ë\fq9\u0091\"ÎÎ]û\u008fä\u0094\u00907^ÈJaw\u0097`Ë\fq9\u0091\"ÎÎ]û\u008fä\u0094\u00907½©¦\u009dR4^ÝJkw×`Þ\fq9\u0097\"ÉÎwû\u0094äØ\u0090/½\u009b¦ÄRd\u007f\u0090hÆ^ÜJ`w\u0092^ÊJiw\u008c`Â\fb9\u008c\"ÂÎpÈkÜñá\fö\u000b\u009aÔ¯\b´FXóm\u001brD\u0006á+S0HÄêé\u0002þ\u000f\u0082Ù\u0097\u0019¼^@ôU\u001bzH\u009a\\\u008eØ³/¤nÈÞý#æ{\n\u0090?\u0016 ZTøydb{\u0096Ç».¬tÐÙÅfî}\u0012Ã\u00073(:\\×Axj#^îJjw\u009d`Ü\fl9\u0091\"ÉÎ\"û¤äè\u0090J½Ö¦ÉRu\u007f\u009chÆ\u0014k\u0001Ô*ÏÖqÃ\u0081ì\u0088\u0098e\u0085Ê®\u0091ZCGÇp\u0092\u0018\u0019\f¯1\u0013&\u0002J¦\u007fNd\r\u0088±½R¢\u001aÖ ^ÈJkw\u0095`Ê\fe9\u0091\"ÞÎj^ÙJfw\u0096`Ö\f;9Îx\u0093l+QÙF\u0083*%\u001fÃ\u008b \u009f\u0096¢*µ#Ù\u008cìj÷4\u001b\u008a.i1%EÒhis$\u0087\u009cªf½3?\u0082+4\u0016\u0088\u0001\u009am9XÕC\u009c¯8\u009aÄ\u0085Ýñ/ÜÌÇ\u00993*\u008b^ÁÙÕoèÓÿÙ\u0093b¦\u009f½ÜQtd\u0096^\u009fÙ~ÍÈðtço\u008bÕ¾2¥bIÅ|zc\u007f\u0017Ð::!lÕÖø5ï}®fºÞ\u0087:\u0090müóÉ/Ò:>\u009b^\u008fJ9w\u0085`\u009e\f$9Ã\"\u0093Î4û\u008bä\u0098\u0090:½Ê¦\u009eR7\u007fÕh\u0088\u0014?\u0001Ï*\u0095Ö8^ÈJaw\u0097`Ë\fq9\u0091\"ÎÎ-û\u0084äÈ\u0090j½Ù¦ÌRe\u007f\u009bhÏ\u0014m\u0001\u009d*Ê^ÈJaw\u0097`Ë\fq9\u0091\"ÎÎ]û\u008fä\u0094\u00907½Ù¦ØRd\u007f\u009ehõ\u0014g\u0001Ì*\u009fÖ1Ã\u0094ìÍ\u0098s\u0085\u0097®ÕZuG\u0092pù\u001cc\tÈ2\u0093V<B\u0095\u007fch?\u0004\u00851e*:ÆÙódì7\u0098\u009aµe®3Z\u0091w^`-\u001c\u008f\tk\"rÞ\u008dËbä2\u0090\u008c\u008dt¦:R\u008b^ÈJaw\u0097`Ë\fq9\u0091\"ÎÎ-û\u0081äÎ\u0090n½\u008e¦\u0093R6\u007f\u0085h\u0085\u0014i\u0001\u0096*ÆÖfÃËì\u009e\u0098m^ÈJkw\u0096`É\fo9\u009d\"\u0082Îqû\u0093äÇ\u0090^½\u0091¦ÛRh\u007f\u009ahÄ\u0014z\u0001«*ÑÖ&ÃÅì\u0087\u0098z\u0085\u0097®ÉZyG\u0083pÏ\u001cx\t¯2ÝÞ\"Ëù^ÝJkw×`Ì\fl9\u0097\"ÙÎnû\u0098äÍ\u0090e½\u0093¦Ù^ÝJkw×`Ì\fl9\u0097\"ÙÎkû\u009aäÍ\u0090f½\u0093¦\u0085Rb\u007f\u0080hÃ\u0014s\u0001\u0090*\u0087ÖxÃ\u009aìÆ\u0098z\u0085\u0097®ÕZlG\u0083pÏ\u001cu\t\u0084^îJjw\u009d`Ü\fl9\u0091\"ÉÎ/û\u008fä\u0094\u00907^ÝJkw×`Ì\fv9\u0091\"ÁÎfûÙäÈ\u0090h½\u0085¦ÛRl\u007f\u0094hÓ\u00141\u0001\u009d*Í^ÛJaw\u008a`Ú\f.Ø#Ì\u008fñuæ?\u008aÈ¿n¤>H\u0084}<b8\u0016\u0081;~ ;ÔÈù`î=\u0092\u0095\u0087a¬?^ÞJaw\u0094`Û\f-9\u0090\"ÚÎ,û\u009aäÍ\u0090h½\u0098¦ÀRe\u007f\u008chÙ^ÞJaw\u0094`Û\f-9\u008b\"ËÎ,û\u0091äÍ\u0090j½\u0093¦ôRc\u007f\u0094hÇ\u0014z\u0001\u0086*È^ÞJaw\u0094`Û\f-9\u008b\"ËÎ,û\u009bäÏ\u0090e½©¦ÏRe\u007f\u009bhÙ\u0014v\u0001\u0080*Ð#Å7s\nÏ\u001dÝq~D\u0092_Û³\u007f\u0086\u0083\u0099\u009aíxÀ\u0080Û×/j\u0002\u0082\u0015Ûic|ÂWÀ«c¾\u0086\u0091Ååa^ÝJkw×`Ì\fl9\u0097\"ÙÎ,û\u0086äÉ\u0090l½\u0083¦\u0085Ra\u007f\u0083hÎ\u0014@\u0001\u009a*ÈÖsÃ\u0096^ÝJkw×`Á\fg9\u0095\"\u0083Î`û\u0082äÅ\u0090m½\u0092¦\u0085Rf\u007f\u009chÄ\u0014x\u0001\u0091*ÛÖnÃ\u0081ìÁ\u0098s\u0085\u0086J÷^Acýtô\u0018[-½6ãÚ]ï¾ðò\u0084\u0005©¾²ôFCk³|ä\u0000\u001b\u0015¸>êÂZ×¾øç\u008cE\u0091¨ºÿN_Sµdø^ÝJkw×`Ý\fz9\u008b\"ÙÎgû\u009aä\u0082\u0090c½\u0083¦ÂRl\u007f\u0091h\u0084\u0014y\u0001\u009d*ÇÖyÃ\u0096ìÚ\u0098m\u0085\u0080®ÎZrG\u0085\u009fî\u008bX¶ä¡îÍIø¸ãê\u000fT:©%ÀQW|½gì\u0093\u001d¾¤©ìÕEÀ«ëþ\u0017\u0003\u0002¦-òY@D¦oñ\u009b]\u0086²±çÝAÈ\u00adóâ^ÝJkw×`Ø\ff9\u0096\"ÉÎmû\u0085ä\u0082\u0090c½\u0083¦ÂRl\u007f\u0091h\u0084\u0014y\u0001\u009d*ÇÖyÃ\u0096ìÚ\u0098m\u0085\u0080®ÎZrG\u0085^ÝJkw×`Ø\ff9\u0096\"ÉÎmû\u0085äó\u0090e½\u009a¦ÀRm\u007fÛhÈ\u0014j\u0001\u009d*ÅÖzÃÝìÎ\u0098t\u0085\u009c®ÀZyG\u0083pÖ\u001ci\t\u00992ËÞnpßÛ¹ÏYò¥åá\u0089\u0015¼°§ñKV~»aÊ\u0015H8¦#â×\\@\u0082Tbi\u009e~Ú\u0012.'\u0089<ÀÐcå\u009eúË\u008ew£Û¸ËLca\u0084vÍ\n\u007f\u001f\u00974ÅÈxÝ®òÍ\u0086z\u009b\u009e°ÜDz^\u0080J`w\u009c`Ø\f,9\u008b\"ÂÎaû\u009cäÉ\u0090u½Ù¦ÌRe\u007f\u009bhÓ\u0014{j/~ÏC3Tw8\u0083\r$\u0016múÎÏ3Ðf¤Ú\u0089v\u0092ufÊK7\\p Ôîiú\u009eÇiÐ4¼Å\u0089`\u0092!~\u0086KkT\u001a \u009c\rm\u0016#â\u008aÏyx\u001clëQ\u001cFA*ë\u001f\u0001\u0004\\è±Ý\u0007ÂY¶ÿ\u009bE\u0080[tõY\u000bNU2Ü'\u0005\fTðîå\u0003Ê[¾â£1\u0088_|åa\u000fVO:à/3\u0014Høãí>ÒMÆ««!\u0090P^\u0080J`w\u009c`Ø\f,9\u009a\"ÞÎvû¨äË\u0090q½\u0085^\u0080J`w\u009c`Ø\f,9\u009a\"ÞÎvû¨äØ\u0090h½\u009b¦Î^\u0080J`w\u009c`Ø\f,9\u008b\"ÂÎaû\u009cäÉ\u0090u½Ù¦ÉRs\u007f\u0081hÌ\u0014p\u0001\u0098*ÍÖ{Ã\u0081ìÌ^\u0080Jww\u0080`Ý\fw9\u009d\"ÀÎ-û\u009bäÅ\u0090c½Ù¦ÇRi\u007f\u0097hÈ\u0014l\u0001\u0080*ÏÖqÃ\u009fìÌ\u0098x\u0085\u0080®øZvG\u009fpÏ\u001c5\t\u00832ÊM\u008cYld\u0090sÔ\u001f *\u00961ÒÝzè\u009a÷Ã\u0083n®\u009fj\u000b~ëC\u0017TS8§\r\u0011\u0016UúýÏ\u001bÐ^¤ø\u0089\u0012OÝ[=fÁq\u0085\u001dq(Ç3\u0083ß+êÇõ\u0094\u0081;¬Å^\u0080J`w\u009c`Ø\f,9\u009a\"ÞÎvû\u0098äÞ\u0090h½\u0093â_ö¿ËCÜ\u0007°ó\u0085E\u009e\u0001r©G^X\u001e,\u00ad\u0001Ne\u0006qæL\u001a[^7ª\u0002\u001c\u0019XõðÀ\u0001ßM«æ\u0086\u0019\u009d]iåðLä¬ÙPÎ\u0014¢à\u0097V\u008c\u0012`ºUdJ\t> \u0013_^\u0080J`w\u0098`Ú\fb9×\"ÉÎmû\u0080äÂ\u0090m½\u0099¦ÊRd\u007f\u0086h\u0085\u00141\u0001\u008c*ËÖ1Ã\u0091ìÛ\u0098i\u0085\u0099^\u0080Jiw\u0097`Ú\f,9\u008f\"ÄÎlû\u0093äÃ\u0090v½\u0085¦\u0084RB\u007f\u0086hÞ\u0014L\u0001\u009c*ÈÖlÃ\u0096ìÌ\u0098[\u0085\u009d®ËZxG\u0094pÔ\u0086\u0018\u0092ì¯\u0013¸YÔøáOú\\\u0016õ#\u001f<[Hëe\u001a~@^\u009fJbw\u009f`\u008e\f9)Ò=&\u0000Ù\u0017\u0093{2N\u0085U\u008c¹5\u008cÉ\u0093\u0098ç|ÊÉÑ\u0098%\"\bÔ^ÈJvw\u0098`Â\fo9\u0097\"ÎÎ,û\u0090äÃ\u0090m½\u0092¦ÍRi\u007f\u0086hÂ\u00141\u0001\u0087*Æ^ÃJmw\u009b`é\fO9½\"þÎ]û\u0095äß\u0090u½Ø¦ØRo^\u0080Jaw\u008d`Í\f,9\u0095\"ÈÎfû\u009eäÍ\u0090^½\u0095¦ÄRd\u007f\u0090hÉ\u0014l\u0001Ú*ÑÖsÃ\u009fRUFð{\u0014lS\u0000è5\u0014.TÂù÷\u0004èG^\u0080Jaw\u008d`Í\f,9\u0095\"ÂÎwû\u0099äØ\u0090r^\u0080J`w\u0098`Ú\fb9×\"ÉÎmû\u0080äÂ\u0090m½\u0099¦ÊRd\u007f\u0086h\u0085\u00141\u0001\u0090*ÙÖ1Ã\u0092ìØ\u0098m\u0085\u0081®\u0089ZdG\u009cpÊ^\u0080Jtw\u008b`Á\f`9×\"ÎÎrû\u0082äÅ\u0090o½\u0090¦ÄÛSÏÐò.åq\u0089Þ¼*§eKÑ^\u0080J`w\u0098`Ú\fb9×\"ÀÎkû\u0084äÏ\u0090.½\u0086¦ÙRo\u007f\u0093hÃ\u0014s\u0001\u0091*ÚÖ1Ã\u0090ìÝ\u0098o\u0085Ý®\u0097Z3G\u0092pÉ\u001cv\tÞ2ÈÞsË¬ôÖàv\u008d¸¶Ê¢jO¹x\u008cdz\u0011©:Ì&cÓ¢üÍèp".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
        AlternateContactlessPaymentDataJson = cArr;
        DigitizedCardProfile = -7917188472266470908L;
    }

    static void init$1() {
        $$d = new byte[]{18, 126, 13, 102};
        $$e = 186;
    }

    /* JADX WARN: Code restructure failed: missing block: B:420:0x28a0, code lost:
    
        if (((r3 ^ r8) | (r8 & r3)) != 0) goto L277;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0e44  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0efd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x1019  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x10d1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x14c5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x1580 A[Catch: all -> 0x025b, TRY_ENTER, TryCatch #7 {all -> 0x025b, blocks: (B:6:0x0126, B:8:0x0139, B:9:0x018b, B:18:0x0293, B:20:0x02bf, B:21:0x0309, B:28:0x03b1, B:30:0x03c4, B:31:0x0411, B:42:0x0560, B:45:0x05ea, B:48:0x0597, B:49:0x0600, B:51:0x060f, B:52:0x0659, B:58:0x0737, B:60:0x0781, B:61:0x07d4, B:77:0x095f, B:79:0x099c, B:80:0x09f1, B:86:0x0b0d, B:88:0x0b20, B:89:0x0b6b, B:99:0x0c84, B:101:0x0ce8, B:102:0x0d3d, B:109:0x0d93, B:111:0x0da6, B:112:0x0dea, B:119:0x0e5c, B:121:0x0e93, B:122:0x0ee7, B:139:0x1031, B:141:0x1069, B:142:0x10bb, B:146:0x10fa, B:148:0x110d, B:149:0x1157, B:157:0x11c9, B:159:0x1201, B:160:0x1255, B:176:0x14dd, B:178:0x1515, B:179:0x156a, B:182:0x1580, B:184:0x158f, B:185:0x15d4, B:189:0x169a, B:192:0x1734, B:195:0x16da, B:197:0x174b, B:199:0x1763, B:200:0x17a8, B:206:0x1857, B:209:0x18eb, B:212:0x1895, B:214:0x1931, B:216:0x1944, B:217:0x1989, B:219:0x1992, B:221:0x19b0, B:222:0x1a00, B:227:0x2bc1, B:229:0x2bd4, B:230:0x2c1a, B:243:0x31d0, B:245:0x31e3, B:246:0x3230, B:264:0x3460, B:266:0x34af, B:267:0x3504, B:252:0x334e, B:254:0x3361, B:255:0x33af, B:307:0x3839, B:310:0x38cc, B:313:0x3877, B:330:0x3a75, B:332:0x3abe, B:333:0x3b11, B:337:0x3b97, B:339:0x3baa, B:340:0x3bf6, B:344:0x3cac, B:346:0x3d05, B:347:0x3d5c, B:351:0x3d89, B:353:0x3dc6, B:354:0x3e1d, B:383:0x2c26, B:385:0x2c44, B:386:0x2c8e, B:392:0x25e2, B:394:0x25f5, B:395:0x2641, B:404:0x266a, B:406:0x267d, B:407:0x26cf, B:415:0x276d, B:417:0x2786, B:418:0x27d6, B:428:0x293a, B:430:0x2986, B:431:0x29df, B:436:0x2aec, B:438:0x2b30, B:439:0x2b86, B:443:0x2a17, B:445:0x2a5b, B:446:0x2ab4, B:453:0x13bb, B:455:0x13ce, B:456:0x141f), top: B:5:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x2bd4 A[Catch: all -> 0x025b, TryCatch #7 {all -> 0x025b, blocks: (B:6:0x0126, B:8:0x0139, B:9:0x018b, B:18:0x0293, B:20:0x02bf, B:21:0x0309, B:28:0x03b1, B:30:0x03c4, B:31:0x0411, B:42:0x0560, B:45:0x05ea, B:48:0x0597, B:49:0x0600, B:51:0x060f, B:52:0x0659, B:58:0x0737, B:60:0x0781, B:61:0x07d4, B:77:0x095f, B:79:0x099c, B:80:0x09f1, B:86:0x0b0d, B:88:0x0b20, B:89:0x0b6b, B:99:0x0c84, B:101:0x0ce8, B:102:0x0d3d, B:109:0x0d93, B:111:0x0da6, B:112:0x0dea, B:119:0x0e5c, B:121:0x0e93, B:122:0x0ee7, B:139:0x1031, B:141:0x1069, B:142:0x10bb, B:146:0x10fa, B:148:0x110d, B:149:0x1157, B:157:0x11c9, B:159:0x1201, B:160:0x1255, B:176:0x14dd, B:178:0x1515, B:179:0x156a, B:182:0x1580, B:184:0x158f, B:185:0x15d4, B:189:0x169a, B:192:0x1734, B:195:0x16da, B:197:0x174b, B:199:0x1763, B:200:0x17a8, B:206:0x1857, B:209:0x18eb, B:212:0x1895, B:214:0x1931, B:216:0x1944, B:217:0x1989, B:219:0x1992, B:221:0x19b0, B:222:0x1a00, B:227:0x2bc1, B:229:0x2bd4, B:230:0x2c1a, B:243:0x31d0, B:245:0x31e3, B:246:0x3230, B:264:0x3460, B:266:0x34af, B:267:0x3504, B:252:0x334e, B:254:0x3361, B:255:0x33af, B:307:0x3839, B:310:0x38cc, B:313:0x3877, B:330:0x3a75, B:332:0x3abe, B:333:0x3b11, B:337:0x3b97, B:339:0x3baa, B:340:0x3bf6, B:344:0x3cac, B:346:0x3d05, B:347:0x3d5c, B:351:0x3d89, B:353:0x3dc6, B:354:0x3e1d, B:383:0x2c26, B:385:0x2c44, B:386:0x2c8e, B:392:0x25e2, B:394:0x25f5, B:395:0x2641, B:404:0x266a, B:406:0x267d, B:407:0x26cf, B:415:0x276d, B:417:0x2786, B:418:0x27d6, B:428:0x293a, B:430:0x2986, B:431:0x29df, B:436:0x2aec, B:438:0x2b30, B:439:0x2b86, B:443:0x2a17, B:445:0x2a5b, B:446:0x2ab4, B:453:0x13bb, B:455:0x13ce, B:456:0x141f), top: B:5:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x2c23  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x2d37  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x3757  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x3822  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x38e1  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x381e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x2c26 A[Catch: all -> 0x025b, TryCatch #7 {all -> 0x025b, blocks: (B:6:0x0126, B:8:0x0139, B:9:0x018b, B:18:0x0293, B:20:0x02bf, B:21:0x0309, B:28:0x03b1, B:30:0x03c4, B:31:0x0411, B:42:0x0560, B:45:0x05ea, B:48:0x0597, B:49:0x0600, B:51:0x060f, B:52:0x0659, B:58:0x0737, B:60:0x0781, B:61:0x07d4, B:77:0x095f, B:79:0x099c, B:80:0x09f1, B:86:0x0b0d, B:88:0x0b20, B:89:0x0b6b, B:99:0x0c84, B:101:0x0ce8, B:102:0x0d3d, B:109:0x0d93, B:111:0x0da6, B:112:0x0dea, B:119:0x0e5c, B:121:0x0e93, B:122:0x0ee7, B:139:0x1031, B:141:0x1069, B:142:0x10bb, B:146:0x10fa, B:148:0x110d, B:149:0x1157, B:157:0x11c9, B:159:0x1201, B:160:0x1255, B:176:0x14dd, B:178:0x1515, B:179:0x156a, B:182:0x1580, B:184:0x158f, B:185:0x15d4, B:189:0x169a, B:192:0x1734, B:195:0x16da, B:197:0x174b, B:199:0x1763, B:200:0x17a8, B:206:0x1857, B:209:0x18eb, B:212:0x1895, B:214:0x1931, B:216:0x1944, B:217:0x1989, B:219:0x1992, B:221:0x19b0, B:222:0x1a00, B:227:0x2bc1, B:229:0x2bd4, B:230:0x2c1a, B:243:0x31d0, B:245:0x31e3, B:246:0x3230, B:264:0x3460, B:266:0x34af, B:267:0x3504, B:252:0x334e, B:254:0x3361, B:255:0x33af, B:307:0x3839, B:310:0x38cc, B:313:0x3877, B:330:0x3a75, B:332:0x3abe, B:333:0x3b11, B:337:0x3b97, B:339:0x3baa, B:340:0x3bf6, B:344:0x3cac, B:346:0x3d05, B:347:0x3d5c, B:351:0x3d89, B:353:0x3dc6, B:354:0x3e1d, B:383:0x2c26, B:385:0x2c44, B:386:0x2c8e, B:392:0x25e2, B:394:0x25f5, B:395:0x2641, B:404:0x266a, B:406:0x267d, B:407:0x26cf, B:415:0x276d, B:417:0x2786, B:418:0x27d6, B:428:0x293a, B:430:0x2986, B:431:0x29df, B:436:0x2aec, B:438:0x2b30, B:439:0x2b86, B:443:0x2a17, B:445:0x2a5b, B:446:0x2ab4, B:453:0x13bb, B:455:0x13ce, B:456:0x141f), top: B:5:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0a07  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        java.lang.String str;
        int i4;
        java.lang.Integer num2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c;
        long j;
        long j2;
        int i17;
        char c2;
        java.lang.String[][] strArr;
        int i18;
        int i19;
        int i20;
        java.lang.Object obj;
        java.lang.Object invoke;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        java.lang.String str2;
        java.lang.Object[] objArr;
        java.lang.String[][] strArr2;
        java.lang.String[] strArr3;
        int i28;
        java.lang.String next;
        int i29;
        java.lang.String next2;
        java.lang.String str3;
        java.lang.String next3;
        java.lang.Integer num3 = 16;
        int i30 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int i31 = -(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16));
        int i32 = 1;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((i30 ^ 465) + ((i30 & 465) << 1), (i31 ^ 8) + ((i31 & 8) << 1), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr2);
        char c3 = 0;
        java.lang.Integer num4 = 0;
        java.lang.String str4 = (java.lang.String) objArr2[0];
        int indexOf = android.text.TextUtils.indexOf("", "", 0);
        int i33 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
        int i34 = -(-android.graphics.Color.alpha(0));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(indexOf, ((i33 | 27) << 1) - (i33 ^ 27), (char) ((i34 ^ 22469) + ((i34 & 22469) << 1)), objArr3);
        java.lang.String str5 = (java.lang.String) objArr3[0];
        int i35 = -android.text.TextUtils.indexOf("", "", 0);
        int i36 = i35 * (-391);
        int i37 = (i36 & (-5265)) + (i36 | (-5265));
        int i38 = ~((i35 ^ (-28)) | (i35 & (-28)));
        int i39 = ~((i ^ 27) | (i & 27));
        int i40 = ((i38 & i39) | (i38 ^ i39)) * (-196);
        int i41 = (i37 ^ i40) + ((i40 & i37) << 1);
        int i42 = (i35 | 27) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
        int i43 = ~i35;
        int i44 = ~((i43 ^ (-28)) | (i43 & (-28)));
        int i45 = ~(i | 27);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((i41 & i42) + (i42 | i41) + (((i44 ^ i45) | (i44 & i45)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), 25 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (16939 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr4);
        java.lang.String str6 = (java.lang.String) objArr4[0];
        int i46 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int i47 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
        int i48 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a((i46 ^ 51) + ((i46 & 51) << 1), 17 - (~i47), (char) ((i48 ^ 19490) + ((i48 & 19490) << 1)), objArr5);
        java.lang.String str7 = (java.lang.String) objArr5[0];
        int i49 = -(android.os.Process.myTid() >> 22);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a((i49 & 70) + (i49 | 70), 27 - (~(-android.view.View.getDefaultSize(0, 0))), (char) android.view.View.getDefaultSize(0, 0), objArr6);
        java.lang.String[] strArr4 = {str5, str6, str7, (java.lang.String) objArr6[0]};
        int i50 = 0;
        while (true) {
            if (i50 >= 4) {
                num = num4;
                str = str4;
                i4 = i;
                break;
            }
            try {
                java.lang.Object[] objArr7 = {strArr4[i50]};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 36, 3162 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (33099 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
                    java.lang.Object[] objArr8 = new java.lang.Object[i32];
                    b(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) ($$a[20] - i32), r12[16], objArr8);
                    java.lang.String str8 = (java.lang.String) objArr8[c3];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[i32];
                    clsArr[c3] = java.lang.String.class;
                    obj2 = cls.getMethod(str8, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj2);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr7)).longValue();
                long j3 = i;
                long j4 = longValue | 308820040;
                java.lang.String[] strArr5 = strArr4;
                long j5 = ~j3;
                int i51 = i50;
                num = num4;
                str = str4;
                long j6 = (((-279) * longValue) - 43543625781L) + ((longValue | j3) * 140) + (((~(j5 | longValue)) | (~j4)) * (-280)) + (((~(j5 | (-308820041))) | (~((~longValue) | (-308820041))) | ((-1) ^ (j4 | j3))) * 140) + 1304254944;
                int i52 = ~i;
                int i53 = ((int) (j6 >> 32)) & ((((~(1651592869 | i)) | (-1744134064) | (~((-1113606822) | i52))) * 886) + 1764090350 + (((~((-1651592870) | i52)) | (-1206148016)) * (-1772)) + ((~((-1206148016) | i52)) * 886));
                int i54 = ~((-276824341) | i);
                int i55 = ((int) j6) & ((((~((-1333720226) | i52)) | 86523905 | i54) * (-713)) + 317516906 + (i54 * 1426) + ((~((-1524020661) | i52)) * 713));
                if (((i55 ^ i53) | (i53 & i55)) != 0) {
                    int i56 = writeReplace;
                    valueOf = ((i56 ^ 107) + ((i56 & 107) << 1)) % 128;
                    int i57 = ((i51 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) << 1) - (i51 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    i4 = (~(i & i57)) & (i57 | i);
                    break;
                }
                i50 = i51 + 1;
                strArr4 = strArr5;
                num4 = num;
                str4 = str;
                c3 = 0;
                i32 = 1;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (i4 != i) {
            valueOf = (writeReplace + 81) % 128;
            java.lang.Object[] objArr9 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
            java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf(((r1 * 495) - 27568318) + (((~((~i) | 275321251)) | 4198818) * 495))};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj3 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.blue(0), 2713 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                byte b = (byte) (-$$a[18]);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(653, b, b, objArr11);
                obj3 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
            }
            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr10)).intValue();
            return objArr9;
        }
        int i58 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a((i58 ^ 97) + ((i58 & 97) << 1), (resolveOpacity ^ 12) + ((resolveOpacity & 12) << 1), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr12);
        java.lang.String str9 = (java.lang.String) objArr12[0];
        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
        int i59 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a((doubleTapTimeout ^ 110) + ((doubleTapTimeout & 110) << 1), ((i59 | 14) << 1) - (i59 ^ 14), (char) (android.os.Process.myTid() >> 22), objArr13);
        java.lang.String str10 = (java.lang.String) objArr13[0];
        int i60 = -(-(android.os.Process.myPid() >> 22));
        int i61 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a((i60 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i60 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), (i61 & 18) + (i61 | 18), (char) ((modifierMetaStateMask & 1) + (modifierMetaStateMask | 1)), objArr14);
        java.lang.String[] strArr6 = {str9, str10, (java.lang.String) objArr14[0]};
        int i62 = 0;
        while (true) {
            if (i62 >= 3) {
                num2 = num3;
                i5 = i;
                break;
            }
            java.lang.Object[] objArr15 = {strArr6[i62]};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
            if (obj4 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 3161, (char) (android.graphics.Color.red(0) + 33099));
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                b(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) ($$a[20] - 1), r13[16], objArr16);
                obj4 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj4);
            }
            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr15)).longValue();
            long j7 = i;
            java.lang.String[] strArr7 = strArr6;
            long j8 = ~j7;
            num2 = num3;
            long j9 = j8 | 267652564;
            long j10 = ((370 * longValue2) - 99031449050L) + ((longValue2 | (-267652565) | j8) * (-369)) + (((~j9) | longValue2) * (-369)) + ((((j9 | longValue2) ^ (-1)) | (~((~longValue2) | (-267652565))) | (~(j7 | (-267652565)))) * 369) + 1263087468;
            int i63 = ~i;
            int i64 = ((int) (j10 >> 32)) & (((~((-1074794635) | i63)) * 130) + 578772310 + (((~((-1074794635) | i)) | 88146208) * 130));
            int i65 = ((int) j10) & ((((~(300678199 | i63)) | (-2013265400)) * (-108)) + 1091698037 + (((~(1737904609 | i)) | 25317409 | (~((-1737904610) | i63))) * 54) + ((25317409 | i) * 54));
            if (((i65 ^ i64) | (i65 & i64)) != 0) {
                int i66 = ~(((-1070365294) & i63) | ((-1070365294) ^ i63));
                int i67 = -(-(((i66 ^ 540912988) | (540912988 & i66)) * (-235)));
                int i68 = ~((-1070365294) | i);
                int i69 = -(-(((i68 ^ 540912988) | (540912988 & i68)) * (-470)));
                int i70 = ~((-532697634) | i);
                int i71 = ~(586509284 | i);
                int i72 = ~((531255854 & i) | (531255854 ^ i));
                int i73 = (((((44057124 & i63) | (44057124 ^ i63)) * 1324) - 108381306) - (~(((i71 ^ i72) | (i71 & i72)) * (-1324)))) - 1;
                if ((((((570085568 | i67) << 1) - (i67 ^ 570085568)) - (~i69)) - 1) + (((3245328 & i70) | (3245328 ^ i70)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) <= ((-1270910884) ^ i73) + (((-1270910884) & i73) << 1)) {
                    int i74 = (i62 & (-6174)) + (i62 | (-6174));
                    i5 = ((~i74) & i) | (i74 & i63);
                } else {
                    i5 = ((i62 & 270) + (i62 | 270)) ^ i;
                }
            } else {
                i62++;
                strArr6 = strArr7;
                num3 = num2;
            }
        }
        if (i5 != i) {
            java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
            java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(1878875505 | i)) | 171970592) * (-756)) + 120920669 + (((~i) | 1878875505) * 756))};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj5 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                byte b2 = (byte) (-$$a[18]);
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                b(653, b2, b2, objArr19);
                obj5 = cls4.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
            }
            ((int[]) objArr17[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr18)).intValue();
            return objArr17;
        }
        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
        if (obj6 == null) {
            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 26, 1865 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41774));
            short s = (short) ($$a[16] - 1);
            byte b3 = (byte) s;
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            b(s, b3, b3, objArr20);
            obj6 = cls5.getMethod((java.lang.String) objArr20[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj6);
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, null)).longValue();
        long j11 = ~longValue3;
        long j12 = i;
        long j13 = ~j12;
        long j14 = ((((((-987) * longValue3) - 1120588646569L) + (((~((j11 | j13) | (-1133052221))) | (~((longValue3 | (-1133052221)) | j12))) * 988)) + (((-1133052221) | j11) * (-988))) + ((((~(1133052220 | j11)) | (~(j11 | j12))) | (~(((-1133052221) | j13) | longValue3))) * 988)) - 796160641;
        int i75 = ~i;
        int i76 = ~(1641599625 | i75);
        int i77 = (((int) j14) & (((1216141260 | i76) * 764) + 71430545 + (((~(1216141260 | i75)) | 562036737) * (-1528)) + ((i76 | 698615109) * 764))) | (((int) (j14 >> 32)) & ((((~(1620555524 | i75)) | 153632848) * 98) + 845337363 + (((~(1237185360 | i75)) | 1620555524 | (~((-1237185361) | i))) * (-49)) + (((~(1620555524 | i)) | 1083552512) * 49)));
        if (i77 != 0) {
            int i78 = 199 - (~(i77 - 1));
            i6 = ((~i78) & i) | (i78 & i75);
        } else {
            i6 = i;
        }
        if (i6 != i) {
            int i79 = writeReplace;
            valueOf = ((i79 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i79 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
            java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
            java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((-1610891329) | i) * (-676)) + 1437219557 + (((~(389618991 | i75)) | 1610891328) * 676) + (((~(i | 2000510319)) | (~((-1661227107) | i75)) | 50335778) * 676))};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj7 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                byte b4 = (byte) (-$$a[18]);
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                b(653, b4, b4, objArr23);
                obj7 = cls6.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
            }
            ((int[]) objArr21[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
            return objArr21;
        }
        int i80 = -android.text.TextUtils.indexOf("", "", 0, 0);
        int i81 = (i80 * 69) - 9447;
        int i82 = ~i80;
        int i83 = (i82 ^ (-142)) | (i82 & (-142));
        int i84 = ~((i83 ^ i75) | (i83 & i75));
        int i85 = ~((i80 & 141) | (i80 ^ 141));
        int i86 = (i85 ^ i84) | (i84 & i85);
        int i87 = ~((i ^ 141) | (i & 141));
        int i88 = ((i86 ^ i87) | (i86 & i87)) * (-68);
        int i89 = ((i81 | i88) << 1) - (i88 ^ i81);
        int i90 = (i82 & i75) | (i82 ^ i75);
        int i91 = (~((i90 ^ 141) | (i90 & 141))) * (-68);
        int i92 = ~((i75 & (-142)) | (i75 ^ (-142)));
        int i93 = -android.text.TextUtils.getOffsetAfter("", 0);
        int i94 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        a((((i89 | i91) << 1) - (i91 ^ i89)) + (((i92 & i82) | (i92 ^ i82)) * 68), ((i93 | 20) << 1) - (i93 ^ 20), (char) ((i94 ^ 14809) + ((i94 & 14809) << 1)), objArr24);
        java.lang.String str11 = (java.lang.String) objArr24[0];
        int i95 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
        int i96 = (i95 * 371) + 59731;
        int i97 = ~i95;
        int i98 = -(-(((~((i75 ^ (-162)) | (i75 & (-162)))) | (~((i97 ^ i) | (i97 & i)))) * (-370)));
        int i99 = (~((i97 ^ i75) | (i97 & i75))) | (~(i | (-162)));
        int i100 = ~((i95 ^ 161) | (i95 & 161));
        int i101 = ((((i96 | i98) << 1) - (i96 ^ i98)) - (~(-(-(((i99 & i100) | (i99 ^ i100)) * (-370)))))) - 1;
        int i102 = -(-(i100 * com.knotapi.knot.utilities.Constants.ID_KROGER));
        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a(((i101 | i102) << 1) - (i102 ^ i101), ((packedPositionGroup | 6) << 1) - (packedPositionGroup ^ 6), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr25);
        java.lang.String str12 = (java.lang.String) objArr25[0];
        java.io.File file = new java.io.File(str11);
        if (file.exists()) {
            valueOf = (writeReplace + 109) % 128;
            if (file.isFile()) {
                try {
                    java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                    int i103 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    int i104 = -(-android.text.TextUtils.indexOf("", "", 0));
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    a((i103 ^ 166) + ((i103 & 166) << 1), ((i104 | 2) << 1) - (i104 ^ 2), (char) (android.os.Process.myPid() >> 22), objArr26);
                    java.util.Scanner useDelimiter = scanner.useDelimiter((java.lang.String) objArr26[0]);
                    next3 = useDelimiter.hasNext() ? useDelimiter.next() : "";
                    useDelimiter.close();
                } catch (java.io.IOException unused) {
                }
                if (next3.contains(str12)) {
                    i7 = (i & (-263)) | (i75 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
                    if (i7 == i) {
                        int i105 = writeReplace;
                        valueOf = (((i105 | 69) << 1) - (i105 ^ 69)) % 128;
                        java.lang.Object[] objArr27 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                        java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~(i | (-1827605709))) | (-223240390)) * (-948)) - 1724221571) + ((~((-206438597) | i75)) * (-948)) + 731868844)};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj8 == null) {
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) (android.os.Process.myPid() >> 22));
                            byte b5 = (byte) (-$$a[18]);
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            b(653, b5, b5, objArr29);
                            obj8 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                        }
                        ((int[]) objArr27[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr28)).intValue();
                        return objArr27;
                    }
                    int i106 = -android.view.View.resolveSizeAndState(0, 0, 0);
                    int i107 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int axisFromString = android.view.MotionEvent.axisFromString("");
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    a((i106 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE) + ((i106 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE) << 1), ((i107 | 32) << 1) - (i107 ^ 32), (char) ((axisFromString & 1) + (axisFromString | 1)), objArr30);
                    java.lang.String str13 = (java.lang.String) objArr30[0];
                    long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                    int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    a((elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + 199, (scrollDefaultDelay & 23) + (scrollDefaultDelay | 23), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr31);
                    java.lang.String str14 = (java.lang.String) objArr31[0];
                    int i108 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int rgb = android.graphics.Color.rgb(0, 0, 0);
                    int i109 = (rgb * (-755)) + 218082668;
                    int i110 = ~rgb;
                    int i111 = ~((i110 ^ (-16777245)) | ((-16777245) & i110));
                    int i112 = i111 * 1512;
                    int i113 = (i109 & i112) + (i109 | i112);
                    int i114 = (16777244 ^ rgb) | (16777244 & rgb);
                    int i115 = ~((i114 & i) | (i114 ^ i));
                    int i116 = -(-(((i115 & i111) | (i111 ^ i115)) * (-756)));
                    int i117 = (i113 & i116) + (i116 | i113);
                    int i118 = 16777244 | rgb;
                    int i119 = ((i118 ^ i75) | (i118 & i75)) * 756;
                    int i120 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    a((i108 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE) + ((i108 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE) << 1), (i117 ^ i119) + ((i119 & i117) << 1), (char) (((38463 | i120) << 1) - (i120 ^ 38463)), objArr32);
                    java.lang.String str15 = (java.lang.String) objArr32[0];
                    long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                    int i121 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int indexOf2 = android.text.TextUtils.indexOf("", "", 0, 0);
                    char c4 = (char) ((33563 ^ indexOf2) + ((indexOf2 & 33563) << 1));
                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                    a((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 250, 13 - (~i121), c4, objArr33);
                    java.lang.String[] strArr8 = {str13, str14, str15, (java.lang.String) objArr33[0]};
                    int i122 = 4;
                    int i123 = 0;
                    while (true) {
                        if (i123 >= i122) {
                            i8 = i75;
                            i9 = i;
                            break;
                        }
                        java.lang.Object[] objArr34 = {strArr8[i123]};
                        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj9 == null) {
                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.alpha(0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3161, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33098));
                            short s2 = (short) ($$a[16] - 1);
                            byte b6 = (byte) s2;
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            b(s2, b6, b6, objArr35);
                            obj9 = cls8.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj9);
                        }
                        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr34)).longValue();
                        long j15 = ~longValue4;
                        java.lang.String[] strArr9 = strArr8;
                        long j16 = ~(j12 | 205365710);
                        int i124 = i123;
                        long j17 = ~(longValue4 | (-205365711));
                        i8 = i75;
                        long j18 = (((((408 * longValue4) - 166962322230L) + (((~(j15 | 205365710)) | j16) * (-814))) + ((j16 | ((~(j15 | j13)) | j17)) * 407)) + ((((~((-205365711) | j12)) | j17) | (~(longValue4 | j12))) * 407)) - 1543033818;
                        int i125 = ((int) (j18 >> 32)) & ((((~(i8 | (-1513120864))) | (~((-75894453) | i))) * com.visa.cbp.getCertUsage.getODAData) + 576103923 + (((~((-1513120864) | i)) | (~(i8 | (-75894453)))) * com.visa.cbp.getCertUsage.getODAData));
                        int i126 = ((int) j18) & ((((((~(i8 | (-746589463))) | (~((-16842785) | i))) | (~((-1347719178) | i))) * 765) - 1380765706) + (((~(i8 | (-763432247))) | 746589462) * 1530) + (((~((-763432247) | i)) | (~(i8 | (-1347719178)))) * 765));
                        if (((i126 ^ i125) | (i125 & i126)) != 0) {
                            int i127 = writeReplace;
                            int i128 = (i127 ^ 13) + ((i127 & 13) << 1);
                            valueOf = i128 % 128;
                            if (i128 % 2 != 0) {
                                int i129 = i124 + 8554;
                                i9 = (~(i & i129)) & (i129 | i);
                            } else {
                                i9 = i ^ (i124 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                            }
                        } else {
                            int i130 = i124 - 96;
                            i123 = (i130 ^ 97) + ((i130 & 97) << 1);
                            writeReplace = (valueOf + 51) % 128;
                            strArr8 = strArr9;
                            i75 = i8;
                            i122 = 4;
                        }
                    }
                    if (i9 != i) {
                        int i131 = writeReplace;
                        valueOf = ((i131 ^ 93) + ((i131 & 93) << 1)) % 128;
                        java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                        java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((~(i8 | (-472753044))) | 470647186) | (~(i8 | (-1578093055)))) * (-1136)) - 1299675319) + (((~((-472753044) | i)) | (~((-1578093055) | i)) | (~(i8 | 1580198911))) * (-568)) + (((~(i | (-470647187))) | (~(i8 | 472753043)) | (~(i8 | 1578093054))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                        java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj10 == null) {
                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                            byte b7 = (byte) (-$$a[18]);
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            b(653, b7, b7, objArr38);
                            obj10 = cls9.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                        }
                        ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr37)).intValue();
                        int i132 = valueOf + 73;
                        writeReplace = i132 % 128;
                        if (i132 % 2 != 0) {
                            return objArr36;
                        }
                        throw new java.lang.ArithmeticException();
                    }
                    int i133 = -android.view.View.getDefaultSize(0, 0);
                    int myTid = android.os.Process.myTid() >> 22;
                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                    a((i133 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE) + (i133 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE), (myTid ^ 13) + ((myTid & 13) << 1), (char) ((-2) - (~(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr39);
                    java.lang.Object[] objArr40 = {(java.lang.String) objArr39[0]};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj11 == null) {
                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 1921 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                        short s3 = (short) ($$a[16] - 1);
                        byte b8 = (byte) s3;
                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                        b(s3, b8, b8, objArr41);
                        obj11 = cls10.getMethod((java.lang.String) objArr41[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                    }
                    java.lang.String str16 = (java.lang.String) ((java.lang.reflect.Method) obj11).invoke(null, objArr40);
                    if (str16 != null) {
                        int i134 = valueOf;
                        writeReplace = ((i134 ^ 35) + ((i134 & 35) << 1)) % 128;
                        int resolveSize = android.view.View.resolveSize(0, 0);
                        int green = android.graphics.Color.green(0);
                        int i135 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                        a(resolveSize + com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, (green & 9) + (green | 9), (char) ((43782 ^ i135) + ((i135 & 43782) << 1)), objArr42);
                        if (str16.contains((java.lang.String) objArr42[0])) {
                            i10 = i8;
                            i11 = (i & (-251)) | (i10 & 250);
                            if (i11 == i) {
                                java.lang.Object[] objArr43 = {new int[]{i}, new int[]{i11}, null, null, new int[1]};
                                java.lang.Object[] objArr44 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-807672236) | i)) | 807667721) * (-283)) - 1307422844) + ((~(i | (-4515))) * 283))};
                                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj12 == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2712, (char) android.graphics.Color.red(0));
                                    byte b9 = (byte) (-$$a[18]);
                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                    b(653, b9, b9, objArr45);
                                    obj12 = cls11.getMethod((java.lang.String) objArr45[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                                }
                                ((int[]) objArr43[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr44)).intValue();
                                return objArr43;
                            }
                            int i136 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                            a(((i136 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE) << 1) - (i136 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE), (maxKeyCode & 17) + (maxKeyCode | 17), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 53332), objArr46);
                            java.lang.String str17 = (java.lang.String) objArr46[0];
                            int i137 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i138 = i137 * (-1529);
                            int i139 = ~i137;
                            int i140 = (i139 ^ (-304)) | (i139 & (-304));
                            int i141 = ~(i140 | i10);
                            int i142 = i139 | 303;
                            int i143 = ~((i142 & i) | (i142 ^ i));
                            int i144 = (i141 & i143) | (i141 ^ i143);
                            int i145 = (i137 ^ (-304)) | (i137 & (-304));
                            int i146 = ~((i145 & i) | (i145 ^ i));
                            int i147 = (((((-231492) & i138) + (i138 | (-231492))) - (~(-(-(((i144 ^ i146) | (i144 & i146)) * 765))))) - 1) + (((~i140) | (~((i139 ^ i10) | (i139 & i10)))) * 1530);
                            int i148 = ~((i139 & i) | (i139 ^ i));
                            int i149 = (i10 ^ (-304)) | (i10 & (-304));
                            int i150 = ~((i137 ^ i149) | (i137 & i149));
                            int i151 = ((i150 ^ i148) | (i150 & i148)) * 765;
                            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            a((i147 ^ i151) + ((i151 & i147) << 1), (lastIndexOf & 7) + (lastIndexOf | 7), (char) (android.os.Process.getGidForName("") + 15204), objArr47);
                            java.lang.String str18 = (java.lang.String) objArr47[0];
                            java.io.File file2 = new java.io.File(str17);
                            if (file2.exists() && file2.isFile()) {
                                try {
                                    java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                    int i152 = -android.graphics.Color.red(0);
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    a(((i152 | 167) << 1) - (i152 ^ 167), android.view.View.resolveSizeAndState(0, 0, 0) + 2, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr48);
                                    java.util.Scanner useDelimiter2 = scanner2.useDelimiter((java.lang.String) objArr48[0]);
                                    if (useDelimiter2.hasNext()) {
                                        valueOf = (writeReplace + 17) % 128;
                                        str3 = useDelimiter2.next();
                                    } else {
                                        str3 = "";
                                    }
                                    useDelimiter2.close();
                                } catch (java.io.IOException unused2) {
                                }
                                if (str3.contains(str18)) {
                                    i12 = (i & (-252)) | (i10 & 251);
                                    if (i12 == i) {
                                        java.lang.Object[] objArr49 = {new int[]{i}, new int[]{i12}, null, null, new int[1]};
                                        java.lang.Object[] objArr50 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(i | 2042452991)) | 8393106) * (-756)) + 1899865005 + ((2042452991 | i10) * 756))};
                                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj13 == null) {
                                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.graphics.Color.green(0));
                                            byte b10 = (byte) (-$$a[18]);
                                            java.lang.Object[] objArr51 = new java.lang.Object[1];
                                            b(653, b10, b10, objArr51);
                                            obj13 = cls12.getMethod((java.lang.String) objArr51[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj13);
                                        }
                                        ((int[]) objArr49[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr50)).intValue();
                                        return objArr49;
                                    }
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 310, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 771), objArr52);
                                    java.lang.Object[] objArr53 = {(java.lang.String) objArr52[0]};
                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj14 == null) {
                                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1921, (char) android.view.View.MeasureSpec.getSize(0));
                                        short s4 = (short) ($$a[16] - 1);
                                        byte b11 = (byte) s4;
                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                        b(s4, b11, b11, objArr54);
                                        obj14 = cls13.getMethod((java.lang.String) objArr54[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                                    }
                                    java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj14).invoke(null, objArr53)).toLowerCase();
                                    int i153 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    a(333 - (~i153), (absoluteGravity & 4) + (absoluteGravity | 4), (char) (android.os.Process.myPid() >> 22), objArr55);
                                    if (lowerCase.contains((java.lang.String) objArr55[0])) {
                                        int i154 = writeReplace;
                                        int i155 = (i154 & 119) + (i154 | 119);
                                        valueOf = i155 % 128;
                                        i13 = i155 % 2 != 0 ? (~(i & 24173)) & (i | 24173) : (i & (-265)) | (i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
                                    } else {
                                        i13 = i;
                                    }
                                    if (i13 != i) {
                                        java.lang.Object[] objArr56 = {new int[]{i}, new int[]{i13}, null, null, new int[1]};
                                        java.lang.Object[] objArr57 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((-1161035786) | i10) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1044620153 + (((~(i10 | 713643748)) | (-1698512970)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj15 == null) {
                                            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                            byte b12 = (byte) (-$$a[18]);
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            b(653, b12, b12, objArr58);
                                            obj15 = cls14.getMethod((java.lang.String) objArr58[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                                        }
                                        ((int[]) objArr56[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr57)).intValue();
                                        return objArr56;
                                    }
                                    int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode();
                                    int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                    a(286 - (~(maxKeyCode2 >> 16)), (deadChar ^ 17) + ((deadChar & 17) << 1), (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 53332), objArr59);
                                    java.lang.String str19 = (java.lang.String) objArr59[0];
                                    int indexOf3 = android.text.TextUtils.indexOf("", "");
                                    int i156 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                    a(336 - (~indexOf3), (i156 & 5) + (i156 | 5), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr60);
                                    java.lang.String str20 = (java.lang.String) objArr60[0];
                                    java.io.File file3 = new java.io.File(str19);
                                    if (file3.exists() && file3.isFile()) {
                                        try {
                                            java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                            int i157 = -android.graphics.Color.argb(0, 0, 0, 0);
                                            int rgb2 = android.graphics.Color.rgb(0, 0, 0);
                                            int i158 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                            a((i157 & 167) + (i157 | 167), (16777218 ^ rgb2) + ((rgb2 & 16777218) << 1), (char) ((~i158) + (i158 << 1)), objArr61);
                                            java.util.Scanner useDelimiter3 = scanner3.useDelimiter((java.lang.String) objArr61[0]);
                                            next2 = useDelimiter3.hasNext() ? useDelimiter3.next() : "";
                                            useDelimiter3.close();
                                        } catch (java.io.IOException unused3) {
                                        }
                                        if (next2.contains(str20)) {
                                            i14 = (i & (-261)) | (i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
                                            if (i14 == i) {
                                                java.lang.Object[] objArr62 = {new int[]{i}, new int[]{i14}, null, null, new int[1]};
                                                java.lang.Object[] objArr63 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((-1141401634) | i10) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1740892839) + (((~(i10 | 468944222)) | (-1169845614)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj16 == null) {
                                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                    byte b13 = (byte) (-$$a[18]);
                                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                    b(653, b13, b13, objArr64);
                                                    obj16 = cls15.getMethod((java.lang.String) objArr64[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                                                }
                                                ((int[]) objArr62[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr63)).intValue();
                                                return objArr62;
                                            }
                                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                            if (obj17 == null) {
                                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2764 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore("", 0));
                                                short s5 = (short) ($$a[16] - 1);
                                                byte b14 = (byte) s5;
                                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                b(s5, b14, b14, objArr65);
                                                obj17 = cls16.getMethod((java.lang.String) objArr65[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj17);
                                            }
                                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, null)).longValue();
                                            long j19 = ~longValue5;
                                            long j20 = ~((-1266170632) | j13);
                                            int i159 = i10;
                                            long j21 = (713 * longValue5) + 900247319352L + (((~(j19 | (-1266170632))) | j20) * (-712)) + (((~(j19 | j13 | (-1266170632))) | (~(longValue5 | (-1266170632) | j12))) * (-712)) + ((j19 | j20) * 712) + 1391207395;
                                            int i160 = ~(i159 | 1168135522);
                                            int i161 = ((int) (j21 >> 32)) & ((((~((-1168135523) | i)) | (~(i159 | 269090888)) | i160) * (-516)) + 1487789586 + (((~(i | (-65))) | (~(i159 | (-269090825)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((i160 | 269090824) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
                                            int i162 = ((int) j21) & ((((~(i159 | (-1320432081))) | 68419920 | (~(i159 | 1537308805))) * 464) + 409326181 + (((-1252012161) | i) * (-464)) + (((~(1537308805 | i)) | 68419920) * 464));
                                            if (((i162 ^ i161) | (i161 & i162)) == 1) {
                                                java.lang.Object[] objArr66 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                java.lang.Object[] objArr67 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i159 | (-1526146653))) | (-524699446)) * (-983)) + 795338624 + (((~(i159 | (-524699446))) | 83902753) * 983))};
                                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj18 == null) {
                                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2714 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                    byte b15 = (byte) (-$$a[18]);
                                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                    b(653, b15, b15, objArr68);
                                                    obj18 = cls17.getMethod((java.lang.String) objArr68[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                                                }
                                                ((int[]) objArr66[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr67)).intValue();
                                                return objArr66;
                                            }
                                            java.lang.Object[] objArr69 = {1};
                                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                            if (obj19 == null) {
                                                java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 27, android.text.TextUtils.indexOf("", "") + 2364, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                short s6 = (short) ($$a[16] - 1);
                                                byte b16 = (byte) s6;
                                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                b(s6, b16, b16, objArr70);
                                                obj19 = cls18.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj19);
                                            }
                                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr69)).longValue();
                                            long j22 = (-248055101) | j13;
                                            long j23 = ((-494) * longValue6) + 122539219894L + ((~(longValue6 | (-248055101))) * (-495)) + (495 * j22) + (((~((~longValue6) | 248055100)) | (~j22)) * 495) + 1655965300;
                                            int i163 = ((int) (j23 >> 32)) & ((((~((-1229127061) | i)) | 138565652) * 336) + 501358106 + (((~(208099350 | i)) | (-1298660759)) * (-168)) + (((~(i159 | 208099350)) | (-1229127061)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                            int i164 = ((int) j23) & ((((~(1978568213 | i)) | (-1437251199)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 59877837 + (((~(i159 | 1978568213)) | (-1437251199)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                                            if (((i163 ^ i164) | (i163 & i164)) != 0) {
                                                i15 = i159;
                                                i16 = (i & (-221)) | (i15 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                                            } else {
                                                i15 = i159;
                                                i16 = i;
                                            }
                                            if (i16 != i) {
                                                java.lang.Object[] objArr71 = {new int[]{i}, new int[]{i16}, null, null, new int[1]};
                                                java.lang.Object[] objArr72 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(i | (-1927592300))) | (-123253799)) * (-964)) + 1971405217 + (((~((-1927592300) | i15)) | 1889798473) * (-964)))};
                                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj20 == null) {
                                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                    byte b17 = (byte) (-$$a[18]);
                                                    java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                    b(653, b17, b17, objArr73);
                                                    obj20 = cls19.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj20);
                                                }
                                                ((int[]) objArr71[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr72)).intValue();
                                                return objArr71;
                                            }
                                            int i165 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                            int i166 = -android.text.TextUtils.indexOf("", "");
                                            java.lang.Object[] objArr74 = new java.lang.Object[1];
                                            a((i165 & 310) + (i165 | 310), ((i166 | 23) << 1) - (i166 ^ 23), (char) (770 - (~(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), objArr74);
                                            java.lang.Object[] objArr75 = {(java.lang.String) objArr74[0]};
                                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj21 == null) {
                                                java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 1921 - android.view.View.resolveSize(0, 0), (char) android.view.KeyEvent.keyCodeFromString(""));
                                                short s7 = (short) ($$a[16] - 1);
                                                byte b18 = (byte) s7;
                                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                b(s7, b18, b18, objArr76);
                                                obj21 = cls20.getMethod((java.lang.String) objArr76[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj21);
                                            }
                                            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj21).invoke(null, objArr75);
                                            if (invoke2 != null) {
                                                java.lang.Object[] objArr77 = {invoke2, 42};
                                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj22 == null) {
                                                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777244, 2595 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                    short s8 = (short) ($$a[16] - 1);
                                                    byte b19 = (byte) s8;
                                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                    b(s8, b19, b19, objArr78);
                                                    obj22 = cls21.getMethod((java.lang.String) objArr78[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj22);
                                                }
                                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr77)).longValue();
                                                long j24 = (530 * longValue7) + 107413506818L + (((~(longValue7 | 202666992)) | (~(202666992 | j13))) * 529) + (((~longValue7) | (~(202666992 | j12))) * 529) + 1054433532;
                                                int i167 = ~(1025862897 | i15);
                                                if (((((int) (j24 >> 32)) & ((((~((-411363514) | i15)) | 402942129 | (~((-1025862898) | i15)) | (~(1034284281 | i))) * (-84)) + 1905160562 + (((~((-1025862898) | i)) | 411363513 | i167) * (-84)) + ((i167 | (-1034284282)) * 84))) | (((int) j24) & (((((~((-1107300497) | i15)) | (~((-29622795) | i))) * 988) - 293036675) + (((~(300303119 | i)) | (-1407603616) | (~((-29622795) | i15))) * 988)))) == 1986687685) {
                                                    i17 = i15;
                                                    j2 = j13;
                                                    j = j12;
                                                    c = 4;
                                                    int i168 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                    a((i168 & 446) + (i168 | 446), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 16, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr79);
                                                    java.lang.Object[] objArr80 = {(java.lang.String) objArr79[0]};
                                                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj == null) {
                                                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 40, 1922 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                        short s9 = (short) ($$a[16] - 1);
                                                        byte b20 = (byte) s9;
                                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                        b(s9, b20, b20, objArr81);
                                                        obj = cls22.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                                                    }
                                                    invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr80);
                                                    if (invoke != null) {
                                                        i21 = 0;
                                                    } else {
                                                        java.lang.Object[] objArr82 = {invoke, 42};
                                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                        if (obj23 == null) {
                                                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.GS, android.view.KeyEvent.getDeadChar(0, 0) + 2594, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                            short s10 = (short) ($$a[16] - 1);
                                                            byte b21 = (byte) s10;
                                                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                            b(s10, b21, b21, objArr83);
                                                            obj23 = cls23.getMethod((java.lang.String) objArr83[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj23);
                                                        }
                                                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr82)).longValue();
                                                        long j25 = ~longValue8;
                                                        long j26 = ((-661) * longValue8) + 506583809830L + ((j2 | (~(766390029 | j25))) * 1324) + (((~(j | (-766390030))) | (~(longValue8 | j))) * (-1324)) + (((~(longValue8 | 766390029)) | (~(j25 | (-766390030)))) * 662) + 2023490554;
                                                        int i169 = ((int) (j26 >> 32)) & ((((i17 | (-2063580760)) * (-192)) - 1788177110) + (((~(i17 | (-1889504258))) | 1611302913) * (-384)) + (((~((-1611302914) | i)) | (~(i17 | (-278201345))) | (~((-174076503) | i))) * 192));
                                                        int i170 = ((int) j26) & ((((~(1023518065 | i)) | (~(i17 | (-402694193)))) * (-406)) + 88130031 + ((~(i17 | (-11014153))) * (-406)) + (((~(413708344 | i)) | (~(i17 | (-1023518066)))) * 406));
                                                        i21 = (i169 ^ i170) | (i169 & i170);
                                                    }
                                                    if (i21 != 1986687685) {
                                                        int i171 = valueOf;
                                                        int i172 = ((i171 | 53) << 1) - (i171 ^ 53);
                                                        int i173 = i172 % 128;
                                                        writeReplace = i173;
                                                        if (i172 % 2 == 0) {
                                                            throw null;
                                                        }
                                                        if (i21 != -1514516938) {
                                                            valueOf = (i173 + 93) % 128;
                                                            int i174 = -(-android.widget.ExpandableListView.getPackedPositionType(0L));
                                                            int i175 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                            int i176 = -(-android.graphics.Color.blue(0));
                                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                            a((i174 ^ 1161) + ((i174 & 1161) << 1), ((i175 | 14) << 1) - (i175 ^ 14), (char) (((34105 | i176) << 1) - (i176 ^ 34105)), objArr84);
                                                            java.lang.String str21 = (java.lang.String) objArr84[0];
                                                            int i177 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                                            int i178 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                                                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                            a((i177 & 1176) + (i177 | 1176), (i178 & 26) + (i178 | 26), (char) (7681 - (~android.text.TextUtils.getOffsetAfter("", 0))), objArr85);
                                                            java.lang.String str22 = (java.lang.String) objArr85[0];
                                                            int argb = android.graphics.Color.argb(0, 0, 0, 0);
                                                            int i179 = -android.view.MotionEvent.axisFromString("");
                                                            java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                            a(1201 - argb, ((i179 | 16) << 1) - (i179 ^ 16), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr86);
                                                            java.lang.String str23 = (java.lang.String) objArr86[0];
                                                            int i180 = -(-android.text.TextUtils.getTrimmedLength(""));
                                                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                            a((i180 ^ 1218) + ((i180 & 1218) << 1), 16 - (~(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (char) (13486 - (~(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))), objArr87);
                                                            java.lang.String str24 = (java.lang.String) objArr87[0];
                                                            int i181 = -android.text.TextUtils.getOffsetBefore("", 0);
                                                            java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                            a((i181 & 1235) + (i181 | 1235), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 15, (char) (45288 - android.view.MotionEvent.axisFromString("")), objArr88);
                                                            java.lang.String str25 = (java.lang.String) objArr88[0];
                                                            int i182 = -(-android.text.TextUtils.getCapsMode("", 0, 0));
                                                            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                            int i183 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                            java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                            a(((i182 | 1250) << 1) - (i182 ^ 1250), mirror - 11, (char) ((i183 ^ 9884) + ((i183 & 9884) << 1)), objArr89);
                                                            java.lang.String str26 = (java.lang.String) objArr89[0];
                                                            int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                            int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                                                            int i184 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                            a(((lastIndexOf2 | 1288) << 1) - (lastIndexOf2 ^ 1288), 12 - (keyRepeatTimeout >> 16), (char) ((i184 ^ 1) + ((i184 & 1) << 1)), objArr90);
                                                            java.lang.String str27 = (java.lang.String) objArr90[0];
                                                            int i185 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                            int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                                                            int i186 = ~keyCodeFromString;
                                                            int i187 = ~((i186 ^ i17) | (i186 & i17));
                                                            int i188 = ~(keyCodeFromString | (-14));
                                                            int i189 = (i188 ^ i187) | (i187 & i188);
                                                            int i190 = ~((keyCodeFromString ^ i) | (keyCodeFromString & i));
                                                            int i191 = (keyCodeFromString * (-337)) + 4407 + (((i189 ^ i190) | (i189 & i190)) * (-338));
                                                            int i192 = (~(i186 | 13)) * 338;
                                                            int i193 = (keyCodeFromString ^ 13) | (keyCodeFromString & 13);
                                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                            a((i185 ^ 1299) + ((i185 & 1299) << 1), ((((i191 | i192) << 1) - (i192 ^ i191)) - (~(((~((i193 ^ i) | (i193 & i))) | i187) * 338))) - 1, (char) android.view.View.combineMeasuredStates(0, 0), objArr91);
                                                            java.lang.String str28 = (java.lang.String) objArr91[0];
                                                            int indexOf4 = android.text.TextUtils.indexOf("", "", 0);
                                                            int i194 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                            a(indexOf4 + 1312, (i194 & 22) + (i194 | 22), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr92);
                                                            java.lang.String str29 = (java.lang.String) objArr92[0];
                                                            int lastIndexOf3 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                            int i195 = -(android.os.Process.myPid() >> 22);
                                                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                            a(((lastIndexOf3 | 1335) << 1) - (lastIndexOf3 ^ 1335), (i195 ^ 31) + ((i195 & 31) << 1), (char) android.view.View.MeasureSpec.getMode(0), objArr93);
                                                            java.lang.String str30 = (java.lang.String) objArr93[0];
                                                            int i196 = -android.view.View.MeasureSpec.getMode(0);
                                                            int doubleTapTimeout2 = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                            int i197 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                            int i198 = ~i197;
                                                            int i199 = ~((i198 & i17) | (i198 ^ i17));
                                                            int i200 = ~(i198 | i);
                                                            int i201 = ((((i197 * 236) + 2296596) - (~(-(-(((i199 ^ 4876) | (i199 & 4876)) * (-235)))))) - 1) + (((i200 & 4876) | (i200 ^ 4876)) * (-470));
                                                            int i202 = (i198 ^ 4876) | (i198 & 4876);
                                                            int i203 = ((~((i197 ^ (-4877)) | (i197 & (-4877)))) | (~((i202 ^ i) | (i202 & i)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
                                                            java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                            a(1364 - (~i196), ((doubleTapTimeout2 | 12) << 1) - (doubleTapTimeout2 ^ 12), (char) (((i201 | i203) << 1) - (i203 ^ i201)), objArr94);
                                                            java.lang.String str31 = (java.lang.String) objArr94[0];
                                                            int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                            int tapTimeout = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                                            int i204 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                            java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                            a((maximumFlingVelocity ^ 1377) + ((maximumFlingVelocity & 1377) << 1), (tapTimeout & 12) + (tapTimeout | 12), (char) ((i204 ^ 13451) + ((i204 & 13451) << 1)), objArr95);
                                                            java.lang.String str32 = (java.lang.String) objArr95[0];
                                                            int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                            java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                            a(((packedPositionChild | 1390) << 1) - (packedPositionChild ^ 1390), 11 - (~(-(-android.view.View.MeasureSpec.getSize(0)))), (char) (4444 - (~(-(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))))), objArr96);
                                                            java.lang.String str33 = (java.lang.String) objArr96[0];
                                                            int i205 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                            char mirror2 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                            java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                            a(((i205 | 1401) << 1) - (i205 ^ 1401), (mirror2 & 65500) + (mirror2 | 65500), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr97);
                                                            java.lang.String str34 = (java.lang.String) objArr97[0];
                                                            float minVolume = android.media.AudioTrack.getMinVolume();
                                                            int i206 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                                            int i207 = i206 * 1773;
                                                            int i208 = ~((~i206) | (-13));
                                                            int i209 = ~((i ^ (-13)) | (i & (-13)));
                                                            int i210 = (i208 ^ i209) | (i208 & i209);
                                                            int i211 = i17 | i206;
                                                            int i212 = ~((i211 & 12) | (i211 ^ 12));
                                                            int i213 = (i207 ^ (-10620)) + ((i207 & (-10620)) << 1) + (((i210 & i212) | (i210 ^ i212)) * 886);
                                                            int i214 = (i206 | (~((i17 ^ 12) | (i17 & 12)))) * (-1772);
                                                            int i215 = (i213 & i214) + (i214 | i213);
                                                            int i216 = (~i211) * 886;
                                                            int i217 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                            java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                            a((minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 1413, (i215 & i216) + (i216 | i215), (char) ((48351 ^ i217) + ((i217 & 48351) << 1)), objArr98);
                                                            java.lang.String str35 = (java.lang.String) objArr98[0];
                                                            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                                                            int doubleTapTimeout3 = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                            int i218 = doubleTapTimeout3 * (-665);
                                                            int i219 = ~doubleTapTimeout3;
                                                            int i220 = (((i218 | 4676) << 1) - (i218 ^ 4676)) + (i219 * (-333));
                                                            int i221 = ~(i219 | i17);
                                                            int i222 = ~((i ^ 14) | (i & 14));
                                                            int i223 = ((i221 ^ i222) | (i221 & i222)) * com.visa.cbp.getCertUsage.getODAData;
                                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                            a(1423 - (~(elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1))), (i220 & i223) + (i223 | i220) + (((~((i219 ^ i) | (i219 & i))) | (~((i17 ^ 14) | (i17 & 14)))) * com.visa.cbp.getCertUsage.getODAData), (char) (15237 - (~(-(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))))), objArr99);
                                                            java.lang.String str36 = (java.lang.String) objArr99[0];
                                                            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                                                            int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString("");
                                                            int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                            char c5 = (char) (((44748 | resolveOpacity2) << 1) - (resolveOpacity2 ^ 44748));
                                                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                            a(normalizeMetaState + 1439, ((keyCodeFromString2 | 12) << 1) - (keyCodeFromString2 ^ 12), c5, objArr100);
                                                            java.lang.String str37 = (java.lang.String) objArr100[0];
                                                            int i224 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                            int i225 = i224 * 483;
                                                            int i226 = ~i224;
                                                            int i227 = ~((i226 ^ (-1453)) | (i226 & (-1453)));
                                                            int i228 = (i226 & i17) | (i226 ^ i17);
                                                            int i229 = ~i228;
                                                            int i230 = (351384 & i225) + (i225 | 351384) + (((i227 & i229) | (i227 ^ i229)) * (-241));
                                                            int i231 = -(-(((i224 ^ 1452) | (i224 & 1452)) * (-482)));
                                                            int i232 = ~((i224 ^ (-1453)) | (i224 & (-1453)));
                                                            int i233 = ~((i228 ^ 1452) | (i228 & 1452));
                                                            int i234 = -(-(((i232 ^ i233) | (i232 & i233)) * 241));
                                                            int resolveOpacity3 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                            int i235 = -android.graphics.Color.rgb(0, 0, 0);
                                                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                            a(((((i230 | i231) << 1) - (i231 ^ i230)) - (~i234)) - 1, resolveOpacity3 + 24, (char) (((-16777216) & i235) + (i235 | (-16777216))), objArr101);
                                                            java.lang.String str38 = (java.lang.String) objArr101[0];
                                                            long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                                                            int i236 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                            a(1476 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), (i236 & 28) + (i236 | 28), (char) android.text.TextUtils.indexOf("", "", 0), objArr102);
                                                            java.lang.String[] strArr10 = {str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, (java.lang.String) objArr102[0]};
                                                            int i237 = 0;
                                                            while (i237 < 19) {
                                                                java.lang.String str39 = strArr10[i237];
                                                                java.lang.Object[] objArr103 = {str39};
                                                                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                                if (obj24 == null) {
                                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36, 3161 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (33099 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                                                    short s11 = (short) ($$a[16] - 1);
                                                                    byte b22 = (byte) s11;
                                                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                    b(s11, b22, b22, objArr104);
                                                                    obj24 = cls24.getMethod((java.lang.String) objArr104[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj24);
                                                                }
                                                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr103)).longValue();
                                                                long j27 = ~longValue9;
                                                                int i238 = i237;
                                                                long j28 = ((((((-675) * longValue9) - 172302263301L) + (((j | (-254508513)) | j27) * (-676))) + (((~(j2 | (-254508513))) | (~((-254508513) | j27))) * 676)) + ((((~(254508512 | j27)) | (~(j27 | j2))) | (~((longValue9 | (-254508513)) | j))) * 676)) - 1083159595;
                                                                int i239 = ~((-570490945) | i);
                                                                int i240 = ((int) (j28 >> 32)) & ((((~(i17 | (-501010358))) | 135285248 | i239) * (-713)) + 373210474 + (i239 * 1426) + ((~(i17 | (-936216054))) * 713));
                                                                int i241 = ((int) j28) & (((r8 * 495) - 406370066) + (((~(i17 | (-437866422))) | (-999903222)) * 495));
                                                                if (((i240 ^ i241) | (i240 & i241)) != 0) {
                                                                    int i242 = writeReplace;
                                                                    int i243 = (i242 & 111) + (i242 | 111);
                                                                    valueOf = i243 % 128;
                                                                    if (i243 % 2 != 0) {
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    int i244 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                    int i245 = -android.text.TextUtils.indexOf("", "");
                                                                    int i246 = i245 * 367;
                                                                    int i247 = (i246 ^ 5138) + ((i246 & 5138) << 1);
                                                                    int i248 = ((i245 ^ 14) | (i245 & 14)) * (-366);
                                                                    int i249 = (i247 & i248) + (i248 | i247);
                                                                    int i250 = ((~(i | (-15))) | i245) * (-366);
                                                                    int i251 = (i249 ^ i250) + ((i250 & i249) << 1);
                                                                    int i252 = ~i245;
                                                                    int i253 = ~((i252 ^ 14) | (i252 & 14));
                                                                    int i254 = (i245 ^ (-15)) | (i245 & (-15));
                                                                    int i255 = ~((i254 ^ i) | (i254 & i));
                                                                    int i256 = -(-(((i255 ^ i253) | (i255 & i253)) * 366));
                                                                    int i257 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                    a((i244 ^ 1425) + ((i244 & 1425) << 1), ((i251 | i256) << 1) - (i256 ^ i251), (char) ((i257 ^ 15237) + ((i257 & 15237) << 1)), objArr105);
                                                                    if (str39.equals((java.lang.String) objArr105[0])) {
                                                                        int i258 = writeReplace;
                                                                        valueOf = (((i258 | 15) << 1) - (i258 ^ 15)) % 128;
                                                                        java.lang.Object[] objArr106 = {str39};
                                                                        java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                        if (obj25 == null) {
                                                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 36, android.text.TextUtils.getCapsMode("", 0, 0) + 3161, (char) (33100 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                                                            java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                            b(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) ($$a[20] - 1), r8[16], objArr107);
                                                                            obj25 = cls25.getMethod((java.lang.String) objArr107[0], java.lang.String.class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj25);
                                                                        }
                                                                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr106)).longValue();
                                                                        long j29 = ~longValue10;
                                                                        long j30 = (46 * longValue10) + 42716136222L + (((~(j29 | j2)) | 928611657) * (-90)) + (((~(longValue10 | 928611657)) | (~(j29 | j))) * (-45)) + (((~(j2 | 928611657)) | j29 | (~(j | (-928611658)))) * 45) + 66823246;
                                                                        int i259 = ((int) (j30 >> 32)) & ((((~(i17 | (-1785564623))) | 4261890 | (~(i17 | (-348338212)))) * (-397)) + 796123866 + (((-2125379054) | i) * 397));
                                                                        int i260 = ((int) j30) & ((((~((-1529568432) | i)) | 268505097) * (-566)) + 212803131 + ((~((-1261063335) | i)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
                                                                        if (((i259 ^ i260) | (i259 & i260)) == 0) {
                                                                        }
                                                                    }
                                                                    i237 = i238 + 1;
                                                                }
                                                                i29 = i238;
                                                            }
                                                            i29 = -1;
                                                            if (i29 >= 0) {
                                                                int i261 = i29 + 130;
                                                                int i262 = ((~i261) & i) | (i261 & i17);
                                                                if (i262 != i) {
                                                                    java.lang.Object[] objArr108 = {new int[]{i}, new int[]{i262}, null, null, new int[1]};
                                                                    java.lang.Object[] objArr109 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~((-212365160) | i)) | (-1838480939)) * (-318)) + 342103895 + (((~((-1838480939) | i)) | (~(i17 | 1841102703))) * 318) + (((~(i | 1841102703)) | (~(i17 | (-1628737545)))) * 318))};
                                                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj26 == null) {
                                                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                                        byte b23 = (byte) (-$$a[18]);
                                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                        b(653, b23, b23, objArr110);
                                                                        obj26 = cls26.getMethod((java.lang.String) objArr110[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj26);
                                                                    }
                                                                    ((int[]) objArr108[c])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr109)).intValue();
                                                                    return objArr108;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int i263 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                    a(((i263 | 1502) << 1) - (i263 ^ 1502), 12 - (~(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16))), (char) ((-16721768) - android.graphics.Color.rgb(0, 0, 0)), objArr111);
                                                    java.lang.String str40 = (java.lang.String) objArr111[0];
                                                    int i264 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                    int i265 = -(-android.view.View.getDefaultSize(0, 0));
                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                    a(((i264 | 1515) << 1) - (i264 ^ 1515), ((i265 | 5) << 1) - (i265 ^ 5), (char) android.view.View.MeasureSpec.getSize(0), objArr112);
                                                    java.lang.String[] strArr11 = {str40, (java.lang.String) objArr112[0]};
                                                    int i266 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                    int i267 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                    a(((i266 | 1520) << 1) - (i266 ^ 1520), (i267 ^ 15) + ((i267 & 15) << 1), (char) (30547 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr113);
                                                    java.lang.String str41 = (java.lang.String) objArr113[0];
                                                    int i268 = -(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                                    int red = android.graphics.Color.red(0);
                                                    int lastIndexOf4 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                    char c6 = (char) (((lastIndexOf4 | 1) << 1) - (lastIndexOf4 ^ 1));
                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                    a((i268 & 1536) + (i268 | 1536), 18 - (~red), c6, objArr114);
                                                    java.lang.String str42 = (java.lang.String) objArr114[0];
                                                    int myPid = android.os.Process.myPid();
                                                    int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                    a(1555 - (myPid >> 22), (bitsPerPixel & 15) + (bitsPerPixel | 15), (char) android.text.TextUtils.indexOf("", ""), objArr115);
                                                    java.lang.String[] strArr12 = {str41, str42, (java.lang.String) objArr115[0]};
                                                    int indexOf5 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                    a((indexOf5 & 1570) + (indexOf5 | 1570), 20 - (~android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr116);
                                                    java.lang.String str43 = (java.lang.String) objArr116[0];
                                                    int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout();
                                                    byte modifierMetaStateMask2 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                    int i269 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                    int i270 = (i269 * (-419)) + 1357304;
                                                    int i271 = -(-((~((i ^ 3224) | (i & 3224))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                                    int i272 = ~i269;
                                                    int i273 = (i270 & i271) + (i270 | i271) + (((i272 ^ 3224) | (i272 & 3224)) * (-420));
                                                    int i274 = ~(i272 | (-3225));
                                                    int i275 = i17;
                                                    int i276 = ~((i275 ^ 3224) | (i275 & 3224));
                                                    int i277 = ((i274 ^ i276) | (i274 & i276)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                    a(1590 - (tapTimeout2 >> 16), 9 - modifierMetaStateMask2, (char) (((i273 | i277) << 1) - (i277 ^ i273)), objArr117);
                                                    java.lang.String[] strArr13 = {str43, (java.lang.String) objArr117[0]};
                                                    int i278 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int i279 = -android.view.KeyEvent.getDeadChar(0, 0);
                                                    int i280 = i279 * (-464);
                                                    int i281 = ~i279;
                                                    int i282 = (i ^ 11) | (i & 11);
                                                    int i283 = ~i282;
                                                    int i284 = (((i280 | (-10219)) << 1) - (i280 ^ (-10219))) + (((i283 & i281) | (i283 ^ i281)) * (-465));
                                                    int i285 = ~(i281 | i);
                                                    int i286 = ((i285 ^ 11) | (i285 & 11)) * 930;
                                                    int i287 = (i284 ^ i286) + ((i286 & i284) << 1);
                                                    int i288 = -(-((i281 | i282) * 465));
                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                    a((i278 ^ 1600) + ((i278 & 1600) << 1), (i287 ^ i288) + ((i288 & i287) << 1), (char) ((-2) - (~(-android.os.Process.getGidForName("")))), objArr118);
                                                    java.lang.String str44 = (java.lang.String) objArr118[0];
                                                    int i289 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                    a((i289 & 337) + (i289 | 337), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 6, (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr119);
                                                    java.lang.String[] strArr14 = {str44, (java.lang.String) objArr119[0]};
                                                    int i290 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    int i291 = -android.text.TextUtils.indexOf("", "");
                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                    a(1610 - (~i290), (i291 & 28) + (i291 | 28), (char) (0 - (~(-(-((byte) android.view.KeyEvent.getModifierMetaStateMask()))))), objArr120);
                                                    java.lang.String str45 = (java.lang.String) objArr120[0];
                                                    int i292 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                                    float maxVolume = android.media.AudioTrack.getMaxVolume();
                                                    int i293 = -android.view.View.MeasureSpec.getSize(0);
                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                    a((i292 ^ 1591) + ((i292 & 1591) << 1), (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 9, (char) ((i293 & 3224) + (i293 | 3224)), objArr121);
                                                    java.lang.String[][] strArr15 = {strArr11, strArr12, strArr13, strArr14, new java.lang.String[]{str45, (java.lang.String) objArr121[0]}};
                                                    int i294 = -1;
                                                    i22 = 0;
                                                    loop4: while (true) {
                                                        if (i22 < 5) {
                                                            i23 = 1;
                                                            i24 = i;
                                                            break;
                                                        }
                                                        int i295 = valueOf;
                                                        writeReplace = ((i295 ^ 85) + ((i295 & 85) << 1)) % 128;
                                                        java.lang.String[] strArr16 = strArr15[i22];
                                                        java.lang.String str46 = strArr16[0];
                                                        java.lang.String[] strArr17 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr16, 1, strArr16.length);
                                                        int length = strArr17.length;
                                                        int i296 = 0;
                                                        while (i296 < length) {
                                                            java.lang.String str47 = strArr17[i296];
                                                            int i297 = i294 + 22;
                                                            i294 = (i297 & (-21)) + (i297 | (-21));
                                                            java.io.File file4 = new java.io.File(str46);
                                                            if (file4.exists()) {
                                                                writeReplace = (valueOf + 15) % 128;
                                                                if (file4.isFile()) {
                                                                    try {
                                                                        java.util.Scanner scanner4 = new java.util.Scanner(new java.io.FileInputStream(file4));
                                                                        int i298 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                        int i299 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                                                                        strArr2 = strArr15;
                                                                        try {
                                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                            strArr3 = strArr17;
                                                                            i28 = length;
                                                                            try {
                                                                                a(((i298 | 167) << 1) - (i298 ^ 167), (i299 ^ 2) + ((i299 & 2) << 1), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr122);
                                                                                java.util.Scanner useDelimiter4 = scanner4.useDelimiter((java.lang.String) objArr122[0]);
                                                                                next = useDelimiter4.hasNext() ? useDelimiter4.next() : "";
                                                                                useDelimiter4.close();
                                                                            } catch (java.io.IOException unused4) {
                                                                                continue;
                                                                            }
                                                                        } catch (java.io.IOException unused5) {
                                                                        }
                                                                    } catch (java.io.IOException unused6) {
                                                                    }
                                                                    if (next.contains(str47)) {
                                                                        int i300 = (i294 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) + ((i294 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) << 1);
                                                                        i24 = ((~i300) & i) | (i300 & i275);
                                                                        i23 = 1;
                                                                        break loop4;
                                                                    }
                                                                    i296 = (i296 ^ 1) + ((i296 & 1) << 1);
                                                                    strArr15 = strArr2;
                                                                    strArr17 = strArr3;
                                                                    length = i28;
                                                                }
                                                            }
                                                            strArr2 = strArr15;
                                                            strArr3 = strArr17;
                                                            i28 = length;
                                                            i296 = (i296 ^ 1) + ((i296 & 1) << 1);
                                                            strArr15 = strArr2;
                                                            strArr17 = strArr3;
                                                            length = i28;
                                                        }
                                                        i22++;
                                                    }
                                                    if (i24 == i) {
                                                        int[] iArr = new int[i23];
                                                        int[] iArr2 = new int[i23];
                                                        iArr[0] = i;
                                                        iArr2[0] = i24;
                                                        java.lang.Object[] objArr123 = {iArr, iArr2, null, null, new int[i23]};
                                                        java.lang.Object[] objArr124 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~(i | (-1577609370))) | 1111321697) * 398) - 79723611) + (((~((-1577609370) | i275)) | 1111321697) * 398))};
                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj27 == null) {
                                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                                            byte b24 = (byte) (-$$a[18]);
                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                            b(653, b24, b24, objArr125);
                                                            obj27 = cls27.getMethod((java.lang.String) objArr125[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj27);
                                                        }
                                                        ((int[]) objArr123[c])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr124)).intValue();
                                                        return objArr123;
                                                    }
                                                    try {
                                                        int i301 = -android.graphics.Color.red(0);
                                                        int threadPriority = android.os.Process.getThreadPriority(0);
                                                        int i302 = ((threadPriority & 20) + (threadPriority | 20)) >> 6;
                                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                        a((i301 ^ 1639) + ((i301 & 1639) << 1), (i302 ^ 13) + ((i302 & 13) << 1), (char) ((-(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)))) - 1), objArr126);
                                                        str2 = (java.lang.String) objArr126[0];
                                                        int i303 = -(-android.view.KeyEvent.keyCodeFromString(""));
                                                        int threadPriority2 = android.os.Process.getThreadPriority(0);
                                                        int scrollDefaultDelay2 = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                        objArr = new java.lang.Object[1];
                                                        a((i303 & 1652) + (i303 | 1652), ((((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6) + 8, (char) ((34235 ^ scrollDefaultDelay2) + ((scrollDefaultDelay2 & 34235) << 1)), objArr);
                                                    } catch (java.lang.Exception unused7) {
                                                        i25 = i & (-152);
                                                        i26 = i275 & 151;
                                                    }
                                                    try {
                                                        java.lang.Object[] objArr127 = {str2, (java.lang.String) objArr[0]};
                                                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                                        if (obj28 == null) {
                                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 38, 2213 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                            short s12 = (short) ($$a[16] - 1);
                                                            byte b25 = (byte) s12;
                                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                            b(s12, b25, b25, objArr128);
                                                            obj28 = cls28.getMethod((java.lang.String) objArr128[0], java.lang.String.class, java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj28);
                                                        }
                                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr127)).longValue();
                                                        long j31 = ~longValue11;
                                                        long j32 = (((((302 * longValue11) - 347856008700L) + ((~((longValue11 | 1159520029) | j)) * (-301))) + (((~(j31 | j)) | (~(j2 | 1159520029))) * (-301))) + (((~(j | (-1159520030))) | j31) * 301)) - 1894894631;
                                                        int i304 = (int) (j32 >> 32);
                                                        int i305 = (int) j32;
                                                        int i306 = ~((-561093649) | i275);
                                                        if (((i304 & ((((~(2130673663 | i275)) | (~((-307888278) | i))) * 988) + 866465694 + (((~(385558975 | i)) | 1745114688 | (~((-307888278) | i275))) * 988))) | (i305 & ((((((-2004614587) | i306) | (~(561093648 | i))) * (-338)) - 392124049) + ((i306 | (~((-1443520939) | i))) * 338)))) != 0) {
                                                            int i307 = valueOf + 115;
                                                            writeReplace = i307 % 128;
                                                            if (i307 % 2 == 0) {
                                                                i25 = i & (-12263);
                                                                i26 = i275 & 12262;
                                                                i27 = i25 | i26;
                                                            } else {
                                                                i27 = i ^ 150;
                                                            }
                                                        } else {
                                                            i27 = i;
                                                        }
                                                        if (i27 != i) {
                                                            java.lang.Object[] objArr129 = {new int[]{i}, new int[]{i27}, null, null, new int[1]};
                                                            java.lang.Object[] objArr130 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(1505270395 | i275)) | (-2042420096) | (~((-8426003) | i))) * 717) + 1377813491 + (((~(i | 1505270395)) | (~((-8426003) | i275)) | (-2042420096)) * 717))};
                                                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj29 == null) {
                                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2713, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                                byte b26 = (byte) (-$$a[18]);
                                                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                b(653, b26, b26, objArr131);
                                                                obj29 = cls29.getMethod((java.lang.String) objArr131[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj29);
                                                            }
                                                            ((int[]) objArr129[c])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr130)).intValue();
                                                            return objArr129;
                                                        }
                                                        int i308 = -android.view.View.getDefaultSize(0, 0);
                                                        int keyRepeatTimeout2 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                                                        int i309 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                        int i310 = i309 * 193;
                                                        int i311 = ~i309;
                                                        int i312 = ~((i311 ^ 1) | (i311 & 1));
                                                        int i313 = (i311 ^ (-2)) | (i311 & (-2));
                                                        int i314 = ~i313;
                                                        int i315 = (i275 ^ (-2)) | (i275 & (-2));
                                                        int i316 = ~i315;
                                                        int i317 = ~(i313 | i);
                                                        int i318 = ~((i315 & i309) | (i315 ^ i309));
                                                        int i319 = (i309 ^ 1) | (i309 & 1);
                                                        char c7 = (char) (((((((i310 | 193) << 1) - (i310 ^ 193)) + (((i312 & i275) | (i312 ^ i275)) * (-192))) + (((i314 & i316) | (i314 ^ i316)) * (-384))) - (~(-(-(((~((i319 ^ i) | (i319 & i))) | ((i317 & i318) | (i317 ^ i318))) * 192))))) - 1);
                                                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                        a((i308 & 1660) + (i308 | 1660), 46 - (~(keyRepeatTimeout2 >> 16)), c7, objArr132);
                                                        java.lang.Object[] objArr133 = {(java.lang.String) objArr132[0]};
                                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                        if (obj30 == null) {
                                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3161 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 33100));
                                                            byte b27 = (byte) ($$a[16] - 1);
                                                            java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                            b(618, b27, b27, objArr134);
                                                            obj30 = cls30.getMethod((java.lang.String) objArr134[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj30);
                                                        }
                                                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr133)).longValue();
                                                        long j33 = ~longValue12;
                                                        long j34 = ~(j2 | (-825961682) | longValue12);
                                                        long j35 = ((471 * longValue12) - 389027952222L) + ((longValue12 | (-825961682)) * (-470)) + (((~(825961681 | j33)) | (~(j33 | j)) | j34) * (-470)) + (((~((-825961682) | j33 | j)) | j34) * 470) + 1733432420;
                                                        int i320 = ((int) (j35 >> 32)) & ((((((~(2085736488 | i275)) | (~(772004396 | i))) | (~((-772004397) | i275))) * 959) - 1849120772) + (((~(2085736488 | i)) | (~(772004396 | i275)) | (~((-772004397) | i))) * 959));
                                                        int i321 = ((int) j35) & ((((~((-732558641) | i275)) | 16793616 | (~(2125182245 | i275))) * (-397)) + 1664852628 + ((1426210837 | i) * 397));
                                                        int i322 = ((i320 ^ i321) | (i320 & i321)) * 263;
                                                        int i323 = ((~i322) & i) | (i322 & i275);
                                                        if (i323 != i) {
                                                            java.lang.Object[] objArr135 = {new int[]{i}, new int[]{i323}, null, null, new int[1]};
                                                            java.lang.Object[] objArr136 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~((-829906487) | i275)) | (~((-1220939612) | i275))) * (-867)) + 2017951652 + (((~((-829906487) | i)) | 4591122 | (~((-1220939612) | i))) * (-1734)) + (((~(i | (-1216348490))) | (~((-4591123) | i275)) | (~((-825315365) | i))) * 867))};
                                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj31 == null) {
                                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2713 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                                                                byte b28 = (byte) (-$$a[18]);
                                                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                                b(653, b28, b28, objArr137);
                                                                obj31 = cls31.getMethod((java.lang.String) objArr137[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                            }
                                                            ((int[]) objArr135[c])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr136)).intValue();
                                                            return objArr135;
                                                        }
                                                        java.lang.Object[] objArr138 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                        java.lang.Object[] objArr139 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((~(i | (-1502613505))) | 539131969) * 449) - 1416922737) + (((~((-1502613505) | i275)) | 539131969) * 449))};
                                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj32 == null) {
                                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                            byte b29 = (byte) (-$$a[18]);
                                                            java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                            b(653, b29, b29, objArr140);
                                                            obj32 = cls32.getMethod((java.lang.String) objArr140[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                        }
                                                        ((int[]) objArr138[c])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr139)).intValue();
                                                        return objArr138;
                                                    } catch (java.lang.Throwable th2) {
                                                        java.lang.Throwable cause2 = th2.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            byte modifierMetaStateMask3 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                            int i324 = -(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                            int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                                            java.lang.Object[] objArr141 = new java.lang.Object[1];
                                            a(309 - modifierMetaStateMask3, (i324 & 23) + (i324 | 23), (char) ((offsetAfter & 772) + (offsetAfter | 772)), objArr141);
                                            java.lang.String str48 = (java.lang.String) objArr141[0];
                                            int i325 = -android.view.MotionEvent.axisFromString("");
                                            int packedPositionChild2 = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                            java.lang.Object[] objArr142 = new java.lang.Object[1];
                                            a(((i325 | 364) << 1) - (i325 ^ 364), (packedPositionChild2 ^ 11) + ((packedPositionChild2 & 11) << 1), (char) android.graphics.Color.green(0), objArr142);
                                            java.lang.String str49 = (java.lang.String) objArr142[0];
                                            int i326 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int i327 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            int i328 = -android.text.TextUtils.getOffsetBefore("", 0);
                                            java.lang.Object[] objArr143 = new java.lang.Object[1];
                                            a((i326 & 375) + (i326 | 375), ((i327 | 6) << 1) - (i327 ^ 6), (char) ((i328 & 24911) + (i328 | 24911)), objArr143);
                                            java.lang.String str50 = (java.lang.String) objArr143[0];
                                            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                                            int i329 = -android.text.TextUtils.indexOf("", "");
                                            java.lang.Object[] objArr144 = new java.lang.Object[1];
                                            a(((makeMeasureSpec | 382) << 1) - (makeMeasureSpec ^ 382), (fadingEdgeLength >> 16) + 8, (char) ((54563 ^ i329) + ((i329 & 54563) << 1)), objArr144);
                                            java.lang.String[] strArr18 = {str48, str49, str50, (java.lang.String) objArr144[0]};
                                            int tapTimeout3 = android.view.ViewConfiguration.getTapTimeout();
                                            int i330 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            java.lang.Object[] objArr145 = new java.lang.Object[1];
                                            a((tapTimeout3 >> 16) + 390, (i330 ^ 17) + ((i330 & 17) << 1), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr145);
                                            java.lang.String str51 = (java.lang.String) objArr145[0];
                                            int i331 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                            int i332 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            java.lang.Object[] objArr146 = new java.lang.Object[1];
                                            a(406 - (~i331), (i332 ^ 7) + ((i332 & 7) << 1), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr146);
                                            java.lang.String str52 = (java.lang.String) objArr146[0];
                                            int touchSlop = android.view.ViewConfiguration.getTouchSlop() >> 8;
                                            int threadPriority3 = android.os.Process.getThreadPriority(0);
                                            int i333 = ((threadPriority3 & 20) + (threadPriority3 | 20)) >> 6;
                                            int i334 = i333 * 868;
                                            int i335 = ~i333;
                                            int i336 = (i335 ^ (-8)) | (i335 & (-8));
                                            int i337 = (~((i335 ^ i) | (i335 & i))) | (~i336);
                                            int i338 = ~((i ^ (-8)) | (i & (-8)));
                                            int i339 = ~((i336 ^ i15) | (i336 & i15));
                                            int i340 = (i335 & 7) | (i335 ^ 7);
                                            int i341 = ~((i340 & i) | (i340 ^ i));
                                            int i342 = (i339 & i341) | (i339 ^ i341);
                                            int i343 = (i333 ^ (-8)) | (i333 & (-8));
                                            int i344 = ~((i343 ^ i) | (i343 & i));
                                            java.lang.Object[] objArr147 = new java.lang.Object[1];
                                            a((touchSlop ^ 414) + ((touchSlop & 414) << 1), ((((i334 ^ 6076) + ((i334 & 6076) << 1)) - (~(((~(i15 | (-8))) | (~(i335 | i15))) * (-867)))) - 1) + (((i337 ^ i338) | (i337 & i338)) * (-1734)) + (((i344 ^ i342) | (i342 & i344)) * 867), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr147);
                                            java.lang.String str53 = (java.lang.String) objArr147[0];
                                            int i345 = -android.view.View.getDefaultSize(0, 0);
                                            java.lang.Object[] objArr148 = new java.lang.Object[1];
                                            a((i345 & 421) + (i345 | 421), 11 - (~(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), (char) ((-2) - (~(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))), objArr148);
                                            java.lang.String str54 = (java.lang.String) objArr148[0];
                                            int i346 = -(-android.text.TextUtils.indexOf("", "", 0));
                                            java.lang.Object[] objArr149 = new java.lang.Object[1];
                                            a((i346 & 432) + (i346 | 432), (android.os.Process.myPid() >> 22) + 14, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr149);
                                            java.lang.String[] strArr19 = {str51, str52, str53, str54, (java.lang.String) objArr149[0]};
                                            int i347 = -android.view.MotionEvent.axisFromString("");
                                            int i348 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                            java.lang.Object[] objArr150 = new java.lang.Object[1];
                                            a(444 - (~i347), ((i348 | 15) << 1) - (i348 ^ 15), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr150);
                                            java.lang.String str55 = (java.lang.String) objArr150[0];
                                            java.lang.Object[] objArr151 = new java.lang.Object[1];
                                            a((android.os.Process.myTid() >> 22) + 462, 1 - (~(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr151);
                                            java.lang.String str56 = (java.lang.String) objArr151[0];
                                            int i349 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                            int i350 = -android.text.TextUtils.indexOf("", "", 0, 0);
                                            int i351 = -(-android.text.TextUtils.indexOf("", ""));
                                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                                            a(((i349 | 473) << 1) - (i349 ^ 473), 21 - (~i350), (char) ((38533 & i351) + (i351 | 38533)), objArr152);
                                            java.lang.String str57 = (java.lang.String) objArr152[0];
                                            int i352 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int i353 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                            java.lang.Object[] objArr153 = new java.lang.Object[1];
                                            a((i352 ^ 495) + ((i352 & 495) << 1), ((i353 | 26) << 1) - (i353 ^ 26), (char) (android.text.TextUtils.indexOf("", "") + 50354), objArr153);
                                            java.lang.String str58 = (java.lang.String) objArr153[0];
                                            int i354 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                                            int i355 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                                            java.lang.Object[] objArr154 = new java.lang.Object[1];
                                            a((i354 & my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + (i354 | my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE), (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + 29, (char) ((i355 ^ 1) + ((i355 & 1) << 1)), objArr154);
                                            c = 4;
                                            java.lang.String[] strArr20 = {str55, str56, str, str57, str58, (java.lang.String) objArr154[0]};
                                            int i356 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                            int edgeSlop = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                                            char c8 = (char) ((edgeSlop ^ 18116) + ((edgeSlop & 18116) << 1));
                                            java.lang.Object[] objArr155 = new java.lang.Object[1];
                                            a(((i356 | 548) << 1) - (i356 ^ 548), (keyRepeatDelay ^ 11) + ((keyRepeatDelay & 11) << 1), c8, objArr155);
                                            java.lang.String str59 = (java.lang.String) objArr155[0];
                                            java.lang.Object[] objArr156 = new java.lang.Object[1];
                                            a(559 - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 7 - (~(-(-(android.view.ViewConfiguration.getScrollBarSize() >> 8)))), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr156);
                                            java.lang.String str60 = (java.lang.String) objArr156[0];
                                            long currentThreadTimeMillis2 = android.os.SystemClock.currentThreadTimeMillis();
                                            int mode = android.view.View.MeasureSpec.getMode(0);
                                            java.lang.Object[] objArr157 = new java.lang.Object[1];
                                            a((currentThreadTimeMillis2 > (-1L) ? 1 : (currentThreadTimeMillis2 == (-1L) ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, ((mode | 6) << 1) - (mode ^ 6), (char) android.graphics.Color.blue(0), objArr157);
                                            java.lang.String str61 = (java.lang.String) objArr157[0];
                                            int i357 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                            int i358 = -android.text.TextUtils.indexOf("", "", 0);
                                            int i359 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                                            java.lang.Object[] objArr158 = new java.lang.Object[1];
                                            j = j12;
                                            a(((i357 | 573) << 1) - (i357 ^ 573), ((i358 | 6) << 1) - (i358 ^ 6), (char) ((i359 & 9806) + (i359 | 9806)), objArr158);
                                            java.lang.String[] strArr21 = {str59, str60, str61, (java.lang.String) objArr158[0]};
                                            int i360 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                            int i361 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                            java.lang.Object[] objArr159 = new java.lang.Object[1];
                                            a((i360 ^ 578) + ((i360 & 578) << 1), ((i361 | 15) << 1) - (i361 ^ 15), (char) (54780 - (~(-(-(android.view.KeyEvent.getMaxKeyCode() >> 16))))), objArr159);
                                            java.lang.String str62 = (java.lang.String) objArr159[0];
                                            int i362 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int i363 = (i362 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - 373842;
                                            int i364 = ~i362;
                                            int i365 = ~(i364 | i);
                                            int i366 = ~((i15 ^ 414) | (i15 & 414));
                                            int i367 = ((i365 ^ i366) | (i365 & i366)) * (-1808);
                                            int i368 = (i363 & i367) + (i363 | i367);
                                            int i369 = i364 | (-415);
                                            int i370 = ~((i369 ^ i) | (i369 & i));
                                            int i371 = (i362 & i15) | (i15 ^ i362);
                                            int i372 = ~((i371 & 414) | (i371 ^ 414));
                                            int i373 = -(-(((i370 ^ i372) | (i370 & i372)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                                            int i374 = ~((i364 ^ 414) | (i364 & 414));
                                            int i375 = ~(i | (-415));
                                            int i376 = (i374 ^ i375) | (i374 & i375);
                                            int i377 = ~i371;
                                            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                                            int i378 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            j2 = j13;
                                            java.lang.Object[] objArr160 = new java.lang.Object[1];
                                            a((((i368 | i373) << 1) - (i373 ^ i368)) + (((i377 ^ i376) | (i377 & i376)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN), (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 6, (char) (((i378 | 48) << 1) - (i378 ^ 48)), objArr160);
                                            java.lang.String str63 = (java.lang.String) objArr160[0];
                                            int i379 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            int normalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0);
                                            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                                            int i380 = scrollBarSize * 471;
                                            int i381 = (((25699173 ^ i380) + ((i380 & 25699173) << 1)) - (~(-(-(((54563 ^ scrollBarSize) | (54563 & scrollBarSize)) * (-470)))))) - 1;
                                            int i382 = ~scrollBarSize;
                                            int i383 = ~((i382 ^ (-54564)) | ((-54564) & i382));
                                            int i384 = ~(((-54564) ^ i) | ((-54564) & i));
                                            int i385 = i15 | scrollBarSize;
                                            int i386 = ((i383 & i384) | (i383 ^ i384) | (~((54563 ^ i385) | (i385 & 54563)))) * (-470);
                                            int i387 = (-54564) | scrollBarSize;
                                            int i388 = ~((i387 ^ i) | (i387 & i));
                                            int i389 = (scrollBarSize ^ i15) | (scrollBarSize & i15);
                                            int i390 = ~((i389 ^ 54563) | (54563 & i389));
                                            char c9 = (char) (((((i381 | i386) << 1) - (i386 ^ i381)) - (~(((i390 ^ i388) | (i390 & i388)) * 470))) - 1);
                                            java.lang.Object[] objArr161 = new java.lang.Object[1];
                                            a(((i379 | 381) << 1) - (i379 ^ 381), normalizeMetaState2 + 8, c9, objArr161);
                                            java.lang.String[] strArr22 = {str62, str63, (java.lang.String) objArr161[0]};
                                            int i391 = -android.graphics.Color.red(0);
                                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                                            a(((i391 | 595) << 1) - (i391 ^ 595), 14 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (24927 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr162);
                                            java.lang.String str64 = (java.lang.String) objArr162[0];
                                            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                                            int i392 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            int i393 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                            java.lang.Object[] objArr163 = new java.lang.Object[1];
                                            a(resolveSizeAndState + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO, i392, (char) ((54721 ^ i393) + ((i393 & 54721) << 1)), objArr163);
                                            java.lang.String[] strArr23 = {str64, (java.lang.String) objArr163[0]};
                                            java.lang.Object[] objArr164 = new java.lang.Object[1];
                                            a(609 - (~(-(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0)))), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, (char) (my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F34_CH_VERIF_METHOD_RESULT - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr164);
                                            java.lang.String str65 = (java.lang.String) objArr164[0];
                                            int i394 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int i395 = -(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            java.lang.Object[] objArr165 = new java.lang.Object[1];
                                            a((i394 & 619) + (i394 | 619), ((i395 | 1) << 1) - (i395 ^ 1), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr165);
                                            java.lang.String[] strArr24 = {str65, (java.lang.String) objArr165[0]};
                                            int tapTimeout4 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                            java.lang.Object[] objArr166 = new java.lang.Object[1];
                                            a(((tapTimeout4 | 620) << 1) - (tapTimeout4 ^ 620), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, (char) (34722 - (~(-android.text.TextUtils.indexOf("", "", 0, 0)))), objArr166);
                                            java.lang.String str66 = (java.lang.String) objArr166[0];
                                            int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                                            int i396 = -android.view.KeyEvent.getDeadChar(0, 0);
                                            java.lang.Object[] objArr167 = new java.lang.Object[1];
                                            a(((pressedStateDuration | 462) << 1) - (pressedStateDuration ^ 462), (i396 & 3) + (i396 | 3), (char) (0 - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr167);
                                            java.lang.String str67 = (java.lang.String) objArr167[0];
                                            int i397 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                            java.lang.Object[] objArr168 = new java.lang.Object[1];
                                            a((i397 ^ 408) + ((i397 & 408) << 1), 6 - (~(android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr168);
                                            java.lang.String str68 = (java.lang.String) objArr168[0];
                                            int offsetAfter2 = android.text.TextUtils.getOffsetAfter("", 0);
                                            int alpha = android.graphics.Color.alpha(0);
                                            int i398 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                            java.lang.Object[] objArr169 = new java.lang.Object[1];
                                            a(offsetAfter2 + 636, (alpha ^ 8) + ((alpha & 8) << 1), (char) (((61615 | i398) << 1) - (i398 ^ 61615)), objArr169);
                                            java.lang.String str69 = (java.lang.String) objArr169[0];
                                            int i399 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                            int i400 = -android.text.TextUtils.getOffsetBefore("", 0);
                                            java.lang.Object[] objArr170 = new java.lang.Object[1];
                                            a((i399 & androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + (i399 | androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING), (i400 ^ 11) + ((i400 & 11) << 1), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr170);
                                            java.lang.String str70 = (java.lang.String) objArr170[0];
                                            int i401 = -(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                            int i402 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                            java.lang.Object[] objArr171 = new java.lang.Object[1];
                                            a(431 - (~i401), (i402 & 15) + (i402 | 15), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr171);
                                            java.lang.String[] strArr25 = {str66, str67, str68, str69, str70, (java.lang.String) objArr171[0]};
                                            int i403 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            int i404 = -android.view.View.getDefaultSize(0, 0);
                                            int i405 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                            int i406 = ~((i ^ (-82)) | (i & (-82)));
                                            int i407 = ~(i405 | i15);
                                            char c10 = (char) (((i405 * 980) - 79218) + ((~((i15 ^ (-82)) | (i15 & (-82)))) * 979) + ((i405 | i) * (-979)) + (((i407 & i406) | (i406 ^ i407)) * 979));
                                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                                            a(((i403 | 643) << 1) - (i403 ^ 643), (i404 ^ 20) + ((i404 & 20) << 1), c10, objArr172);
                                            java.lang.String str71 = (java.lang.String) objArr172[0];
                                            int maxKeyCode3 = android.view.KeyEvent.getMaxKeyCode();
                                            int i408 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            java.lang.Object[] objArr173 = new java.lang.Object[1];
                                            a(664 - (maxKeyCode3 >> 16), (i408 ^ 19) + ((i408 & 19) << 1), (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr173);
                                            java.lang.String str72 = (java.lang.String) objArr173[0];
                                            int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                                            int i409 = packedPositionType * (-721);
                                            int i410 = ((-492443) & i409) + (i409 | (-492443));
                                            int i411 = ~packedPositionType;
                                            int i412 = ~(i411 | (-684));
                                            int i413 = ~(packedPositionType | 683);
                                            int i414 = -(-(((i412 ^ i15) | (i412 & i15) | i413) * 1444));
                                            int i415 = ~((packedPositionType ^ i) | (packedPositionType & i));
                                            int i416 = (i413 ^ i415) | (i413 & i415);
                                            int i417 = ~((i ^ 683) | (i & 683));
                                            int i418 = (i410 ^ i414) + ((i410 & i414) << 1) + (((i416 & i417) | (i416 ^ i417)) * (-1444));
                                            int i419 = -(-(((~((i411 ^ 683) | (i411 & 683))) | (~((packedPositionType & (-684)) | (packedPositionType ^ (-684))))) * 722));
                                            int i420 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            int i421 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                            java.lang.Object[] objArr174 = new java.lang.Object[1];
                                            a((i418 ^ i419) + ((i419 & i418) << 1), ((i420 | 30) << 1) - (i420 ^ 30), (char) (((i421 | 1) << 1) - (i421 ^ 1)), objArr174);
                                            java.lang.String str73 = (java.lang.String) objArr174[0];
                                            int i422 = -(-android.text.TextUtils.indexOf("", "", 0, 0));
                                            int i423 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int i424 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            java.lang.Object[] objArr175 = new java.lang.Object[1];
                                            a(713 - (~i422), 25 - (~i423), (char) ((i424 ^ 2292) + ((i424 & 2292) << 1)), objArr175);
                                            java.lang.String str74 = (java.lang.String) objArr175[0];
                                            int i425 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            int i426 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                            java.lang.Object[] objArr176 = new java.lang.Object[1];
                                            a(740 - (~i425), (i426 ^ 23) + ((i426 & 23) << 1), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr176);
                                            java.lang.String str75 = (java.lang.String) objArr176[0];
                                            java.lang.Object[] objArr177 = new java.lang.Object[1];
                                            a(android.view.KeyEvent.keyCodeFromString("") + 763, 32 - (~(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), objArr177);
                                            java.lang.String[] strArr26 = {str71, str72, str73, str74, str75, (java.lang.String) objArr177[0], str};
                                            java.lang.Object[] objArr178 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 796, 13 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr178);
                                            java.lang.String str76 = (java.lang.String) objArr178[0];
                                            java.lang.Object[] objArr179 = new java.lang.Object[1];
                                            a(374 - (~(-(-(android.view.ViewConfiguration.getTapTimeout() >> 16)))), 6 - (~(-android.text.TextUtils.getOffsetAfter("", 0))), (char) (24910 - (~(android.os.Process.myTid() >> 22))), objArr179);
                                            java.lang.String[] strArr27 = {str76, (java.lang.String) objArr179[0]};
                                            int resolveSize2 = android.view.View.resolveSize(0, 0);
                                            java.lang.Object[] objArr180 = new java.lang.Object[1];
                                            a(((resolveSize2 | 809) << 1) - (resolveSize2 ^ 809), 30 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr180);
                                            java.lang.String str77 = (java.lang.String) objArr180[0];
                                            long uptimeMillis = android.os.SystemClock.uptimeMillis();
                                            int mode2 = android.view.View.MeasureSpec.getMode(0);
                                            int i427 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                            java.lang.Object[] objArr181 = new java.lang.Object[1];
                                            a((uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 838, mode2 + 11, (char) (((i427 | 1) << 1) - (i427 ^ 1)), objArr181);
                                            java.lang.String[] strArr28 = {str77, (java.lang.String) objArr181[0]};
                                            int i428 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                            int size = android.view.View.MeasureSpec.getSize(0);
                                            int packedPositionChild3 = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                                            a((i428 & 850) + (i428 | 850), (size ^ 19) + ((size & 19) << 1), (char) ((packedPositionChild3 ^ 1) + ((packedPositionChild3 & 1) << 1)), objArr182);
                                            java.lang.String str78 = (java.lang.String) objArr182[0];
                                            int i429 = -(-android.text.TextUtils.indexOf("", ""));
                                            int i430 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            java.lang.Object[] objArr183 = new java.lang.Object[1];
                                            a((i429 & 869) + (i429 | 869), (i430 & 5) + (i430 | 5), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr183);
                                            java.lang.String[] strArr29 = {str78, (java.lang.String) objArr183[0]};
                                            int resolveOpacity4 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                            int i431 = -(-android.view.View.MeasureSpec.getSize(0));
                                            int i432 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            java.lang.Object[] objArr184 = new java.lang.Object[1];
                                            a(((resolveOpacity4 | 874) << 1) - (resolveOpacity4 ^ 874), (i431 ^ 19) + ((i431 & 19) << 1), (char) ((34533 & i432) + (i432 | 34533)), objArr184);
                                            java.lang.String[] strArr30 = {(java.lang.String) objArr184[0]};
                                            java.lang.Object[] objArr185 = new java.lang.Object[1];
                                            a(android.text.TextUtils.indexOf("", "", 0, 0) + 893, 15 - (~(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8))), (char) android.view.View.MeasureSpec.getMode(0), objArr185);
                                            java.lang.String[] strArr31 = {(java.lang.String) objArr185[0]};
                                            int pressedStateDuration2 = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                                            int i433 = -(-android.text.TextUtils.getOffsetBefore("", 0));
                                            java.lang.Object[] objArr186 = new java.lang.Object[1];
                                            a(((pressedStateDuration2 | 909) << 1) - (pressedStateDuration2 ^ 909), (i433 ^ 19) + ((i433 & 19) << 1), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr186);
                                            java.lang.String[] strArr32 = {(java.lang.String) objArr186[0]};
                                            int i434 = -android.view.KeyEvent.keyCodeFromString("");
                                            java.lang.Object[] objArr187 = new java.lang.Object[1];
                                            a((i434 & com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE) + (i434 | com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE), 18 - (~(-android.text.TextUtils.getCapsMode("", 0, 0))), (char) ((-2) - (~(-android.graphics.ImageFormat.getBitsPerPixel(0)))), objArr187);
                                            java.lang.String[] strArr33 = {(java.lang.String) objArr187[0]};
                                            int i435 = -(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                            int indexOf6 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            int i436 = -android.text.TextUtils.getOffsetAfter("", 0);
                                            java.lang.Object[] objArr188 = new java.lang.Object[1];
                                            a((i435 ^ 947) + ((i435 & 947) << 1), ((indexOf6 | 24) << 1) - (indexOf6 ^ 24), (char) ((i436 & 32024) + (i436 | 32024)), objArr188);
                                            java.lang.String[] strArr34 = {(java.lang.String) objArr188[0]};
                                            int i437 = -(-(android.os.Process.myTid() >> 22));
                                            int i438 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                            java.lang.Object[] objArr189 = new java.lang.Object[1];
                                            a((i437 & 970) + (i437 | 970), ((i438 | 21) << 1) - (i438 ^ 21), (char) android.graphics.Color.alpha(0), objArr189);
                                            java.lang.String[] strArr35 = {(java.lang.String) objArr189[0]};
                                            int i439 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            java.lang.Object[] objArr190 = new java.lang.Object[1];
                                            a((i439 ^ 992) + ((i439 & 992) << 1), 16777239 - (~android.graphics.Color.rgb(0, 0, 0)), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr190);
                                            java.lang.String str79 = str;
                                            java.lang.String[] strArr36 = {(java.lang.String) objArr190[0], str79};
                                            int indexOf7 = android.text.TextUtils.indexOf("", "", 0, 0);
                                            int i440 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            java.lang.Object[] objArr191 = new java.lang.Object[1];
                                            a((indexOf7 ^ 1015) + ((indexOf7 & 1015) << 1), (i440 ^ 76) + ((i440 & 76) << 1), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 5162), objArr191);
                                            java.lang.String[] strArr37 = {(java.lang.String) objArr191[0], str79};
                                            int i441 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                            int i442 = -android.text.TextUtils.indexOf("", "");
                                            java.lang.Object[] objArr192 = new java.lang.Object[1];
                                            a(((i441 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTS_VISIBLE) << 1) - (i441 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTS_VISIBLE), (i442 ^ 27) + ((i442 & 27) << 1), (char) android.text.TextUtils.getOffsetAfter("", 0), objArr192);
                                            java.lang.String[] strArr38 = {(java.lang.String) objArr192[0], str79};
                                            int offsetAfter3 = android.text.TextUtils.getOffsetAfter("", 0);
                                            int i443 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                                            java.lang.Object[] objArr193 = new java.lang.Object[1];
                                            a(((offsetAfter3 | 1070) << 1) - (offsetAfter3 ^ 1070), ((i443 | 31) << 1) - (i443 ^ 31), (char) ((-16727757) - android.graphics.Color.rgb(0, 0, 0)), objArr193);
                                            java.lang.String[] strArr39 = {(java.lang.String) objArr193[0], str79};
                                            int i444 = -(-android.graphics.Color.green(0));
                                            int maxKeyCode4 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                            java.lang.Object[] objArr194 = new java.lang.Object[1];
                                            a(((i444 | 1101) << 1) - (i444 ^ 1101), (maxKeyCode4 & 27) + (maxKeyCode4 | 27), (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr194);
                                            java.lang.String[] strArr40 = {(java.lang.String) objArr194[0], str79};
                                            int i445 = -android.os.Process.getGidForName("");
                                            java.lang.Object[] objArr195 = new java.lang.Object[1];
                                            a(((i445 | 1127) << 1) - (i445 ^ 1127), 31 - (~(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16))), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr195);
                                            char c11 = 0;
                                            java.lang.String[][] strArr41 = {strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, new java.lang.String[]{(java.lang.String) objArr195[0], str79}};
                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                            int i446 = i;
                                            int i447 = 0;
                                            int i448 = 0;
                                            while (i447 < 24) {
                                                java.lang.String[] strArr42 = strArr41[i447];
                                                java.lang.Object[] objArr196 = {strArr42[c11]};
                                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj33 == null) {
                                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 41, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1921, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                                    short s13 = (short) ($$a[16] - 1);
                                                    byte b30 = (byte) s13;
                                                    strArr = strArr41;
                                                    java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                    b(s13, b30, b30, objArr197);
                                                    obj33 = cls33.getMethod((java.lang.String) objArr197[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj33);
                                                } else {
                                                    strArr = strArr41;
                                                }
                                                java.lang.String str80 = (java.lang.String) ((java.lang.reflect.Method) obj33).invoke(null, objArr196);
                                                java.lang.String[] strArr43 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr42, 1, strArr42.length);
                                                if (str80 == null || str80.length() == 0) {
                                                    i18 = i15;
                                                    i19 = i448;
                                                    i20 = i446;
                                                } else {
                                                    if (strArr42.length != 1) {
                                                        int i449 = valueOf + 125;
                                                        writeReplace = i449 % 128;
                                                        if (i449 % 2 == 0) {
                                                            java.lang.Object[] objArr198 = {str80, strArr43};
                                                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                            if (obj34 == null) {
                                                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2880, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                                short s14 = (short) ($$a[16] - 1);
                                                                byte b31 = (byte) s14;
                                                                java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                                b(s14, b31, b31, objArr199);
                                                                obj34 = cls34.getMethod((java.lang.String) objArr199[0], java.lang.String.class, java.lang.String[].class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj34);
                                                            }
                                                            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr198)).longValue();
                                                            long j36 = ~(523400385 | longValue13);
                                                            i18 = i15;
                                                            long j37 = ~longValue13;
                                                            i19 = i448;
                                                            i20 = i446;
                                                            long j38 = ~(j2 | (-523400386));
                                                            long j39 = ((((((-1187) * longValue13) - 311423229670L) + (((~(j2 | longValue13)) | j36) * (-1188))) + ((((~(j37 | j)) | j36) | j38) * 594)) + ((((~(j37 | (-523400386))) | (~(j37 | j2))) | j38) * 594)) - 1505311393;
                                                            int i450 = ((int) (j39 << 100)) & ((((~((-1576410891) | i)) | 139184479) * (-964)) + 1708753166 + (((~(i18 | (-1576410891))) | 138545418) * (-964)));
                                                            int i451 = ~(i18 | (-718833700));
                                                            int i452 = ((int) j39) & (((1428496912 | i451 | (~(718833699 | i))) * (-338)) + 358392693 + ((i451 | (~(2147330611 | i))) * 338));
                                                            if (((i452 ^ i450) | (i450 & i452)) != 0) {
                                                            }
                                                        } else {
                                                            i18 = i15;
                                                            i19 = i448;
                                                            i20 = i446;
                                                            java.lang.Object[] objArr200 = {str80, strArr43};
                                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                            if (obj35 == null) {
                                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2880, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                                short s15 = (short) ($$a[16] - 1);
                                                                byte b32 = (byte) s15;
                                                                java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                                b(s15, b32, b32, objArr201);
                                                                obj35 = cls35.getMethod((java.lang.String) objArr201[0], java.lang.String.class, java.lang.String[].class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj35);
                                                            }
                                                            long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr200)).longValue();
                                                            long j40 = ~longValue14;
                                                            long j41 = 1432938945 | j40;
                                                            long j42 = ((((((-496) * longValue14) + 710737717216L) + ((~j41) * 497)) + (((~(j41 | j)) | (~((j40 | j2) | (-1432938946)))) * 497)) + ((((~(j2 | 1432938945)) | (~(longValue14 | 1432938945))) | (~(((-1432938946) | j40) | j))) * 497)) - 595772833;
                                                            int i453 = ((int) (j42 >> 32)) & ((((~(i18 | (-356890412))) | 4494891 | (~(i18 | (-1080336000)))) * (-1136)) + 1738041050 + (((~((-356890412) | i)) | (~((-1080336000) | i)) | (~(i18 | 1432731519))) * (-568)) + (((~(i18 | 356890411)) | (~(i18 | 1080335999)) | (~((-4494892) | i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION));
                                                            int i454 = ((int) j42) & ((((~(i18 | (-1858070148))) | 999670738) * 226) + 2055568080 + (((~((-999670739) | i)) | 285213008 | (~(i18 | (-1143612418)))) * (-113)) + ((~((-1858070148) | i)) * 113));
                                                        }
                                                        i447 = (i447 | 1) + (i447 & 1);
                                                        strArr41 = strArr;
                                                        i15 = i18;
                                                        c11 = 0;
                                                    } else {
                                                        i18 = i15;
                                                        i19 = i448;
                                                    }
                                                    int i455 = i447 + 10;
                                                    i446 = (~(i & i455)) & (i455 | i);
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                    sb.append(str80);
                                                    int i456 = -android.graphics.Color.red(0);
                                                    java.lang.Object[] objArr202 = new java.lang.Object[1];
                                                    a((i456 ^ 1160) + ((i456 & 1160) << 1), -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (11849 - (~(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))), objArr202);
                                                    sb.append((java.lang.String) objArr202[0]);
                                                    sb.append(str80);
                                                    arrayList.add(sb.toString());
                                                    i448 = ((i19 ^ 36) + ((i19 & 36) << 1)) - 35;
                                                    i447 = (i447 | 1) + (i447 & 1);
                                                    strArr41 = strArr;
                                                    i15 = i18;
                                                    c11 = 0;
                                                }
                                                i448 = i19;
                                                i446 = i20;
                                                i447 = (i447 | 1) + (i447 & 1);
                                                strArr41 = strArr;
                                                i15 = i18;
                                                c11 = 0;
                                            }
                                            i17 = i15;
                                            int i457 = i446;
                                            java.lang.Object[] objArr203 = new java.lang.Object[5];
                                            if (i448 > 2) {
                                                objArr203[0] = new int[]{i};
                                                objArr203[1] = new int[]{i457};
                                                objArr203[4] = new int[1];
                                                objArr203[2] = arrayList;
                                                objArr203[3] = null;
                                                java.lang.Object[] objArr204 = {num, num, java.lang.Integer.valueOf((((2050769293 | i) * 614) - 1086663437) + (((~(i17 | (-840996495))) | 840958092 | (~(i17 | 1209849603))) * (-1228)) + (((~(i17 | (-38403))) | (~(i17 | 2050807695))) * 614))};
                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj36 == null) {
                                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 50, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                                    byte b33 = (byte) (-$$a[18]);
                                                    java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                    b(653, b33, b33, objArr205);
                                                    obj36 = cls36.getMethod((java.lang.String) objArr205[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                                }
                                                c2 = 0;
                                                ((int[]) objArr203[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr204)).intValue();
                                            } else {
                                                objArr203[0] = new int[]{i};
                                                objArr203[1] = new int[]{i};
                                                objArr203[4] = new int[1];
                                                objArr203[2] = null;
                                                objArr203[3] = null;
                                                int i458 = ~(361306914 | i);
                                                java.lang.Object[] objArr206 = {num, num, java.lang.Integer.valueOf((((((~((-361306915) | i)) | 75502114) | (~((-1689539184) | i))) * (-880)) - 1385820159) + (((~(i17 | (-361306915))) | 1689539183 | i458) * (-880)) + (i458 * 880))};
                                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj37 == null) {
                                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                                                    byte b34 = (byte) (-$$a[18]);
                                                    java.lang.Object[] objArr207 = new java.lang.Object[1];
                                                    b(653, b34, b34, objArr207);
                                                    obj37 = cls37.getMethod((java.lang.String) objArr207[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                }
                                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr206)).intValue();
                                                c2 = 0;
                                                ((int[]) objArr203[4])[0] = intValue;
                                            }
                                            int i459 = ((int[]) objArr203[1])[c2];
                                            if (i459 != i) {
                                                int[] iArr3 = new int[1];
                                                int[] iArr4 = new int[1];
                                                java.util.List list = (java.util.List) objArr203[2];
                                                iArr3[c2] = i;
                                                iArr4[c2] = i459;
                                                java.lang.Object[] objArr208 = {iArr3, iArr4, list, null, new int[1]};
                                                java.lang.Object[] objArr209 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((-18153537) | i) * (-627)) - 558839884) + (((~((-1588084654) | i)) | 462761444) * (-627)) + (((~(i | 462761444)) | (~(i17 | 1588084653))) * 627))};
                                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj38 == null) {
                                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                    byte b35 = (byte) (-$$a[18]);
                                                    java.lang.Object[] objArr210 = new java.lang.Object[1];
                                                    b(653, b35, b35, objArr210);
                                                    obj38 = cls38.getMethod((java.lang.String) objArr210[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                                }
                                                ((int[]) objArr208[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr209)).intValue();
                                                return objArr208;
                                            }
                                            int i1682 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                            java.lang.Object[] objArr792 = new java.lang.Object[1];
                                            a((i1682 & 446) + (i1682 | 446), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 16, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr792);
                                            java.lang.Object[] objArr802 = {(java.lang.String) objArr792[0]};
                                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj == null) {
                                            }
                                            invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr802);
                                            if (invoke != null) {
                                            }
                                            if (i21 != 1986687685) {
                                            }
                                            int i2632 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                            a(((i2632 | 1502) << 1) - (i2632 ^ 1502), 12 - (~(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16))), (char) ((-16721768) - android.graphics.Color.rgb(0, 0, 0)), objArr1112);
                                            java.lang.String str402 = (java.lang.String) objArr1112[0];
                                            int i2642 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                            int i2652 = -(-android.view.View.getDefaultSize(0, 0));
                                            java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                            a(((i2642 | 1515) << 1) - (i2642 ^ 1515), ((i2652 | 5) << 1) - (i2652 ^ 5), (char) android.view.View.MeasureSpec.getSize(0), objArr1122);
                                            java.lang.String[] strArr112 = {str402, (java.lang.String) objArr1122[0]};
                                            int i2662 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                            int i2672 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                            a(((i2662 | 1520) << 1) - (i2662 ^ 1520), (i2672 ^ 15) + ((i2672 & 15) << 1), (char) (30547 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr1132);
                                            java.lang.String str412 = (java.lang.String) objArr1132[0];
                                            int i2682 = -(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                            int red2 = android.graphics.Color.red(0);
                                            int lastIndexOf42 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            char c62 = (char) (((lastIndexOf42 | 1) << 1) - (lastIndexOf42 ^ 1));
                                            java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                            a((i2682 & 1536) + (i2682 | 1536), 18 - (~red2), c62, objArr1142);
                                            java.lang.String str422 = (java.lang.String) objArr1142[0];
                                            int myPid2 = android.os.Process.myPid();
                                            int bitsPerPixel2 = android.graphics.ImageFormat.getBitsPerPixel(0);
                                            java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                            a(1555 - (myPid2 >> 22), (bitsPerPixel2 & 15) + (bitsPerPixel2 | 15), (char) android.text.TextUtils.indexOf("", ""), objArr1152);
                                            java.lang.String[] strArr122 = {str412, str422, (java.lang.String) objArr1152[0]};
                                            int indexOf52 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                            a((indexOf52 & 1570) + (indexOf52 | 1570), 20 - (~android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr1162);
                                            java.lang.String str432 = (java.lang.String) objArr1162[0];
                                            int tapTimeout22 = android.view.ViewConfiguration.getTapTimeout();
                                            byte modifierMetaStateMask22 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                            int i2692 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                            int i2702 = (i2692 * (-419)) + 1357304;
                                            int i2712 = -(-((~((i ^ 3224) | (i & 3224))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                            int i2722 = ~i2692;
                                            int i2732 = (i2702 & i2712) + (i2702 | i2712) + (((i2722 ^ 3224) | (i2722 & 3224)) * (-420));
                                            int i2742 = ~(i2722 | (-3225));
                                            int i2752 = i17;
                                            int i2762 = ~((i2752 ^ 3224) | (i2752 & 3224));
                                            int i2772 = ((i2742 ^ i2762) | (i2742 & i2762)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
                                            java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                            a(1590 - (tapTimeout22 >> 16), 9 - modifierMetaStateMask22, (char) (((i2732 | i2772) << 1) - (i2772 ^ i2732)), objArr1172);
                                            java.lang.String[] strArr132 = {str432, (java.lang.String) objArr1172[0]};
                                            int i2782 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int i2792 = -android.view.KeyEvent.getDeadChar(0, 0);
                                            int i2802 = i2792 * (-464);
                                            int i2812 = ~i2792;
                                            int i2822 = (i ^ 11) | (i & 11);
                                            int i2832 = ~i2822;
                                            int i2842 = (((i2802 | (-10219)) << 1) - (i2802 ^ (-10219))) + (((i2832 & i2812) | (i2832 ^ i2812)) * (-465));
                                            int i2852 = ~(i2812 | i);
                                            int i2862 = ((i2852 ^ 11) | (i2852 & 11)) * 930;
                                            int i2872 = (i2842 ^ i2862) + ((i2862 & i2842) << 1);
                                            int i2882 = -(-((i2812 | i2822) * 465));
                                            java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                            a((i2782 ^ 1600) + ((i2782 & 1600) << 1), (i2872 ^ i2882) + ((i2882 & i2872) << 1), (char) ((-2) - (~(-android.os.Process.getGidForName("")))), objArr1182);
                                            java.lang.String str442 = (java.lang.String) objArr1182[0];
                                            int i2892 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                            a((i2892 & 337) + (i2892 | 337), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 6, (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr1192);
                                            java.lang.String[] strArr142 = {str442, (java.lang.String) objArr1192[0]};
                                            int i2902 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            int i2912 = -android.text.TextUtils.indexOf("", "");
                                            java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                            a(1610 - (~i2902), (i2912 & 28) + (i2912 | 28), (char) (0 - (~(-(-((byte) android.view.KeyEvent.getModifierMetaStateMask()))))), objArr1202);
                                            java.lang.String str452 = (java.lang.String) objArr1202[0];
                                            int i2922 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                            float maxVolume2 = android.media.AudioTrack.getMaxVolume();
                                            int i2932 = -android.view.View.MeasureSpec.getSize(0);
                                            java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                            a((i2922 ^ 1591) + ((i2922 & 1591) << 1), (maxVolume2 > 0.0f ? 1 : (maxVolume2 == 0.0f ? 0 : -1)) + 9, (char) ((i2932 & 3224) + (i2932 | 3224)), objArr1212);
                                            java.lang.String[][] strArr152 = {strArr112, strArr122, strArr132, strArr142, new java.lang.String[]{str452, (java.lang.String) objArr1212[0]}};
                                            int i2942 = -1;
                                            i22 = 0;
                                            loop4: while (true) {
                                                if (i22 < 5) {
                                                }
                                                i22++;
                                            }
                                            if (i24 == i) {
                                            }
                                        }
                                    }
                                    int i460 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    char mirror3 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    int i461 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                    java.lang.Object[] objArr211 = new java.lang.Object[1];
                                    a((i460 ^ my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD) + ((i460 & my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD) << 1), (mirror3 ^ 65501) + ((mirror3 & 65501) << 1), (char) ((62923 ^ i461) + ((i461 & 62923) << 1)), objArr211);
                                    java.lang.String str81 = (java.lang.String) objArr211[0];
                                    int i462 = -android.view.KeyEvent.getDeadChar(0, 0);
                                    int i463 = i462 * (-445);
                                    int i464 = ~i462;
                                    int i465 = ~((i464 ^ (-357)) | (i464 & (-357)));
                                    int i466 = ~((i10 ^ (-357)) | (i10 & (-357)));
                                    int i467 = ((((-158420) & i463) + (i463 | (-158420))) - (~(-(-(((i465 ^ i466) | (i466 & i465)) * 446))))) - 1;
                                    int i468 = ~(i464 | 356);
                                    int i469 = ~((i462 ^ (-357)) | (i462 & (-357)) | i);
                                    int i470 = -(-(((i469 ^ i468) | (i469 & i468)) * 446));
                                    java.lang.Object[] objArr212 = new java.lang.Object[1];
                                    a((((i467 ^ i470) + ((i470 & i467) << 1)) - (~(i465 * 446))) - 1, 9 - android.graphics.Color.blue(0), (char) android.view.View.resolveSize(0, 0), objArr212);
                                    java.lang.Object[] objArr213 = {str81, (java.lang.String) objArr212[0]};
                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                    if (obj39 == null) {
                                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 39, 2213 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                                        short s16 = (short) ($$a[16] - 1);
                                        byte b36 = (byte) s16;
                                        java.lang.Object[] objArr214 = new java.lang.Object[1];
                                        b(s16, b36, b36, objArr214);
                                        obj39 = cls39.getMethod((java.lang.String) objArr214[0], java.lang.String.class, java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj39);
                                    }
                                    long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, objArr213)).longValue();
                                    long j43 = ((((((-55) * longValue15) - 44921010255L) + (((~(816745641 | j12)) | longValue15) * 56)) + ((~(816745641 | longValue15)) * (-56))) + (((~(longValue15 | j13)) | 816745641) * 56)) - 1552120243;
                                    int i471 = (int) (j43 >> 32);
                                    int i472 = ~((-82619514) | i);
                                    i14 = ((i471 & (((((8650784 | i472) * (-814)) + 72034514) + ((i472 | ((~((-1519845925) | i10)) | (-1593814654))) * 407)) + ((((~(82619513 | i)) | (-1593814654)) | (~(1519845924 | i))) * 407))) | (((int) j43) & ((((((~(661457977 | i10)) | (~((-640485425) | i))) * (-831)) + (-934518818)) + ((~((-135283009) | i)) * (-1662))) + ((((~(775768432 | i10)) | (~((-775768433) | i))) | (~((-661457978) | i))) * 831)))) != 0 ? (i & (-262)) | (i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE) : i;
                                    if (i14 == i) {
                                    }
                                }
                            }
                            i12 = i;
                            if (i12 == i) {
                            }
                        }
                    }
                    i10 = i8;
                    i11 = i;
                    if (i11 == i) {
                    }
                }
            }
        }
        i7 = i;
        if (i7 == i) {
        }
    }

    static void init$0() {
        $$a = new byte[]{35, -24, 78, -57, com.google.common.base.Ascii.SI, -10, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE;
    }
}
