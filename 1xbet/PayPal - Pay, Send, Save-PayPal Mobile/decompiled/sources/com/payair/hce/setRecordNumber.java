package com.payair.hce;

/* loaded from: classes4.dex */
public final class setRecordNumber extends com.payair.hce.Record {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i2 * 2) + 4;
        byte[] bArr = $$a;
        int i5 = i * 2;
        int i6 = 718 - s;
        char[] cArr = new char[i5 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i4++;
            i6 = (i6 + i7) - 2;
            i3 = i8;
            cArr[i3] = (char) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i4];
            i4++;
            i6 = (i6 + i7) - 2;
            i3 = i8;
            cArr[i3] = (char) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            cArr[i3] = (char) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i * 2) + 99;
        byte[] bArr = $$d;
        int i5 = b * 3;
        int i6 = 3 - (i2 * 3);
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4 += -i6;
            i6 = i7;
            i3 = i8;
            int i9 = i6 + 1;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i9;
            i6 = bArr[i9];
            i4 += -i6;
            i6 = i7;
            i3 = i8;
            int i92 = i6 + 1;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == 0 - i5) {
            }
        } else {
            i3 = 0;
            int i922 = i6 + 1;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == 0 - i5) {
            }
        }
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = (com.payair.hce.onContactlessPaymentCompleted) access202Var;
        com.payair.hce.onDeleteCardFailed ondeletecardfailed = (com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted));
        java.lang.Byte b = (java.lang.Byte) com.payair.hce.onDeleteCardFailed.writeReplace(new java.lang.Object[]{ondeletecardfailed}, 724539993, -724539993, java.lang.System.identityHashCode(ondeletecardfailed));
        if (b != null) {
            int i = values + 37;
            writeReplace = i % 128;
            if (i % 2 != 0) {
                if (b.byteValue() < 0 || b.byteValue() > 32) {
                    arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                }
            } else {
                throw new java.lang.ArithmeticException();
            }
        }
        values = (writeReplace + 41) % 128;
        return arrayList;
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 125;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[getcvmmodel.valueOf * i])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 48, android.graphics.Color.alpha(0) + 381, (char) (android.graphics.Color.rgb(0, 0, 0) + 16839604));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(0, (byte) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35, android.graphics.Color.alpha(0) + 3966, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 34, android.text.TextUtils.indexOf("", "") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 48, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 381, (char) (62388 - (android.os.Process.myPid() >> 22)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c(0, (byte) 0, 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 35, 3965 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (40224 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 35, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 49) % 128;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 34, android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        java.lang.String str = new java.lang.String(cArr);
        $11 = ($10 + 33) % 128;
        objArr[0] = str;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 0;
        writeReplace = 1;
        char[] cArr = new char[1707];
        java.nio.ByteBuffer.wrap("ow.íì\u009fª]h3&*åÑ£\u0083a´?gý\u001b¼Ðzü8\u009aöW´\u0003r,1ËÏ\u008f\u008d¨K\u007f\t\"ÈÝ\u0086ïD¡\u0002RÀ\u0007\u001f\u00ad^7\u009cEÚ\u0087\u0018éVð\u0095\u000bÓY\u0011nO½\u008dÁÌ\n\n&H@\u0086\u009cÄÔ\u0002âA\u0006¿oýe;¦yÕ¸\u0017ö14~\u0096y×ã\u0015\u0091SS\u0091=ß$\u001cßZ\u008d\u0098ºÆi\u0004\u0015EÞ\u0083òÁ\u0094\u000fKM\u0010\u008b(ÈÔ\u001dI\\Ä\u009e½Øf\u001a\rT\u001e\u0097ïÑµ\u0013\u009bMS\u008f)Î²\bÍJ\u0094\u0084dÆ=\u0000\u0010Cî½§ÿ\u008d9m{!ºñôÕ6\u008apj².ì\u0014þ\u009c¿\u0007}e;£ùØ·Ât22*ðK®\u0098lö-8^\u0080\u001f\u001bÝy\u009b¿YÄ\u0017ÉÔ \u0092uP\t\u000e\u0086Ì÷\u008d;K\u0013^\u0080\u001f\rÝi\u009b¿Y\u008a\u0017ÈÔ-\u00927Pu\u000e°ÌÈ\u008d;K\u0015\tWÇ\u0085\u0085ñCË\u0000/^\u0080\u001f\rÝt\u009b¯Y\u009f\u0017ßÔ$\u00927PK\u000e\u009fÌç\u008d{K\u000f\t[Ç£\u0085þCÝ\u0000`þn¼C^Í\u001f\u0017Ýj\u009b²Y\u0084\u0017Âü¹½uFH\u0007ÅÅ¼\u0083gAW\u000f\u0017Ìì\u008aÿH\u008d\u0016WÔ#\u0095³SÅ\u0011\u009fßd\u009d-[!\u0018Ëæø¤\u008abV /áä¯\u008dm\u009c+aé3·\u0018tÉ2¥ðu^\u0080\u001f\rÝt\u009b¯Y\u009f\u0017ßÔ$\u00927PE\u000e\u009fÌë\u008d{K\r\tWÇ¬\u0085åCé\u0000\u0003þ0¼\\z\u00898åù)^\u0080\u001f\rÝt\u009b¯Y\u009f\u0017ßÔ$\u00927PK\u000e\u009fÌç\u008d{K\u000f\t[Ç£\u0085þCÚ\u0000#þh¼zz¶8úù+·\u0007uG3èñæ¯Ë-\u001dl\u0087®õè7*YdI§±áè#Ï}\f¿mþ¬8\u008dzÛ´]õ\u00917£q>³\u001eýS>¥xüº\u0089ä\u001e&jg§¡\u0097^Á\u001f\u001bÝl\u009b¯Y\u008e\u0017\u0094Ô'\u0092}PS»%ú«8Ú~\u0016¼-ò01\u008awÔµîë6)Sh\u0088®µìã\"\u0001`X¦ihn)´ëÏ\u00ad\u0006o7!s^Ý\u001f\u0011Ý#\u009b¬Y\u0099\u0017ÕÔ-\u0092mPD\u000e\u0082Ì«\u008d9K\u0002\t\\Ç´\u0085öCÞ\u0000-þi¼Yz\u00898ïù+0Ãq\u0010³hõ®ô}µ¸wÆ1\u0000ó<½x\u008eSÏÝ\r¬K`\u0089[ÇF\u0004÷B¤\u0080\u0090ÞP\u001c:]â\u009bÃ^Ù\u001f\u001cÝb\u009b¤Y\u008c\u0017ÏÔ,\u0092kPS^è\u001f\u001bÝc\u009b¥Y\u0086\u0017ÕÔ=\u0092qPH\u000e\u0098;Kz\u0081¸÷þ#<\u0015r\\±¶gï&5ä\\¢\u0090`¥.ðí\u001f«V!ý`1¢\u0003ä\u008c&¹hõ«\ríM/dq¢³\u008bò\u00104&vd¸\u0088úÓ<ú^Ù\u001f\u001cÝb\u009b¤YÓ\u0017\u008cÔ9ùý¸.zV<\u008cþ¬°æs\u001f@[\u0001\u0088Ãð\u0085*G\n\t@Ê¹\u008cÔNÌ\u0010]Ò ª2ëá)\u0099oC\u00adcã) Ðf½¤¥ú48Iyñ¿¯ýü^Ý\u001f\u0011Ý#\u009b¬Y\u0099\u0017ÕÔ-\u0092mPD\u000e\u0082Ì«\u008d9K\f\tVÇ¤\u0085ü^Ü\u001f\u001aÝf^Ê\u001f\u0013Ýx\u009b°Y\u008a\u0017ÎÔ&\u0092j\u000fØN8\u008cKÊÊ\b\u008fFù\u0085\u0011ÃZ\u0001x_\u00ad\u009dÖÜB\u001a3Xk\u0096\u0085Ô\u0086\u0012ÊQ\u0010¯Yíu+ iÙ^î\u001f\u0010Ýi\u009b®Y\u0084\u0017ÓÔ-\u00928Pt\u000e²ÌÎ\u008dtK\u0001\tGÇ¨\u0085üCË\u0000nþ{¼Cz\u00898ªù!·Pu\u0001\u001b=ZÃ\u0098ºÞ}\u001cWR\u0000\u0091þ×ë\u0015§Ka\u0089\u001dÈ§\u000eÒL\u0094\u0082{À/\u0006\u0018E½»¨ù\u0090?Z}y¼òò\u00830ÒvJ´pêC^Ý\u001f\u0011Ý#\u009b´Y\u008a\u0017ÈÔ-\u0092oPF\u000e\u0084Ìà^È\u001f\u0011Ýa\u009b¸Y\u008d\u0017ÓÔ:\u0092pÖ#\u0097æU\u0098\u0013^Ñ)\u009fv^Ý\u001f\u001fÝc\u009b¿Y\u0083\u0017Ï^Ý\u001f\u0011Ý#\u009b¬Y\u0099\u0017ÕÔ-\u0092mPD\u000e\u0082Ì«\u008d6K\u0011\tSÇ¯\u0085ô¶a÷\u00ad5\u009fs\u000b±2ÿt<\u009bzÁ¸÷æd$He\u008d£²áû^\u009e\u0004xE´\u0087\u0086Á\n\u0003+M|\u008e\u0099ÈÏ\nç^\u009f^Ý\u001f\u0011Ý#\u009b¾Y\u009e\u0017ÓÔ%\u0092|P\t\u000e\u0086Ì÷\u008d;K\u0007\tGÇ¢\u0085äë±ªsh\u0019.ÈìÌ¢ºa\t'V^Ý\u001f\u0011Ý#\u009b¾Y\u009e\u0017ÓÔ%\u0092|P\t\u000e\u0090Ìì\u008d:K\u0004\tWÇ³\u0085àCÍ\u0000'þs¼X\u0093PÒ\u0083\u0010ûV!\u0094\u0001ÚK\u0019²_¯\u009dÌÃ\n\u0001v@ã\u0086\u009cÄÏ\n7Hm\u008eUÍ¿3æ^È\u001f\u001bÝc\u009b¹Y\u0099\u0017ÓÔ*\u0092GP_\u000eÎÌ³\u008d{K\u0010\tVÇª\u0085ÏCÇ\u0000vþ+¼\u0003z\u009c8ïù7·\ruE3¯ñö¯ûl\u000b*:èç^È\u001f\u001bÝc\u009b¹Y\u0099\u0017ÓÔ*\u00927P@\u000e\u0099Ìê\u008d3K\u000f\tWÇ\u009e\u0085ãCÛ\u0000%þ2¼Kz\u009e8äù<·\u001au^3¥^È\u001f\u001bÝc\u009b¹Y\u0099\u0017ÓÔ*\u00927PQ\u000e\u0094Ìê\u008d,K[\t\u0004Ç±\u0085¿CÉ\u0000,þr¼TzÃ8¼ù)\u0012ôS-\u0091^×\u0087\u0015»[ã\u0098ZÞW\u001c\u007fB¡\u0080æÁ\u000f\u0007/Ef\u008b\u0092ÉÂ\u000fæL-²Yð(6ñt\u0099µ\u0002û19e\u007f\u009f½Ûãñ ,fa¤\u0095êä(\u0085^Ý\u001f\u0011Ý#\u009b¾Y\u0084\u0017ÕÔ=\u0092tPH\u000e\u0097Ìá\u008d1K\u0011pS1\u009fó\u00adµ0w\n9[ú³¼ÿ~Ä \u0019âl£¿eÃ'Þé:«wm].¤Ð½\u0092ÄT\u001c\u0016j×°\u0099\u0083[Ë\u001d8ßi\u0081CB\u0093\u0004ø Oá±#Èe\u000f§%ér*\u008cl\u0094®þðo2\u0012^Ý\u001f\u0011Ý#\u009b¾Y\u009e\u0017ÓÔ%\u0092|P\t\u000e\u0092Ìì\u008d'K\u0013\t^Ç \u0085éC\u0091\u0000'þy\u0092\u0081ÓA\u0011$Wò\u0095\u009c&<gê¥\u009eãR!?o3¬Åê\u0081(óv}´\u001aõÃ3ìqå¿Ký\u0018;*xÄ\u0086\u0094^Þ\u001f\u001bÝ`\u009b©YÅ\u0017ÒÔ>\u00926PJ\u000e\u0097Ìì\u008d:K\b\tWÇ¸\u0085ã`¸!}ã\u0006¥Ïg£)¯êI¬Pn'0ñò\u0088³WuZ77ùÆ»\u009b}¼>ZÀ\u001alq-´ïÏ©\u0006kj%fæ\u0080 \u0099bä<:þN¿¤y¨;øõ\u0000·Lqy2\u0095ÌË^Ý\u001f\u0011Ý#\u009b·Y\u008e\u0017ÈÔ'\u0092}PK\u000eØÌä\u008d:K\u0007\t@Ç®\u0085ùCÛ\u0000`þl¼Iz\u00968ÿù=z};±ù\u0083¿\u001e}$3uð\u009d¶\u0096tö*3èH©\u0081oí-óã\u0017¡Tg@$\u0080ÚÜ\u0098á^>^Ý\u001f\u0011Ý#\u009b³Y\u008f\u0017×Ôg\u0092zPR\u000e\u009fÌé\u008d0KM\tTÇ¨\u0085þCØ\u0000+þo¼\\z\u00898ãù7·\u001csB2\u008eð¼¶3t\u0006:Jù²¿ò}Û#\u001dá4 ©f\u0089$Äê2¨kn\u000e-·Óë\u0091ÝW\u0003\u0015pÔ´\u009a\u0087XÚ\u001e0Üd\u0082OÿÈ¾\u0004|6:ºø\u0087¶Üu(3hñ_¯Ímò,4ê\u001f¨Kf°$«âÌ¡2_f\u001d^Û\u008b\u0099íX<\u0016\u000fÔK\u0092½Pô^Ý\u001f\u0011Ý#\u009b¯Y\u0092\u0017ÉÔ=\u0092}PJ\u000e©Ìà\u008d,K\u0017\t\u001cÇ£\u0085åCÖ\u0000\"þy¼\u0002z\u009d8ãù7·\u000fuR3´ñå¯Öl\u001a*lè¥\u009d\u0018ÜÔ\u001eæXo\u009aKÔ\u0011\u0017èQ²\u0093\u0090Í\u001d\u000f\"Nä\u0088ÏÊ\u009b\u0004`F{\u0080\u001cÃâ=¶\u007f\u008e¹[û=:ìtß¶\u009bðm2$^Ý\u001f\u0011Ý#\u009bªY\u008e\u0017ÔÔ-\u0092wPU\u000e©Ìá\u008d8K\b\t_Çï\u0085òCÊ\u0000'þq¼HzÕ8ìù0·\u0006uP3£ñç¯Ôl\u0001*kè¿¦\u0094^\u0095©\u0089è\u0013*al£®ÍàÂ#%e|§[ù ;üz4¼\u001aþ^Í¥\u008c?NM\b\u008fÊá\u0084ìG\u0003\u0001^Ãi\u009d¶_Ô\u001e^Ø$\u009avT\u0097\u0016ÐÐø\u0093\nmV/mé\u0081«Èj\u0019$#æk \u0087æ¥§?eM#\u008fáá¯ìl\u0003*^èi¶¶tÔ5^ó!±r\u007f\u008a=Ìûþ^\u0080\u001f\u001aÝh\u009bªYÄ\u0017ÉÔ&\u0092{PL\u000e\u0093Ìñ\u008d{K\u0012\tWÇ¬\u0085åCÛbh#åá\u009c§Ge,+#èÄ®\u009dlº2Að\u0019±Îwê5¹ûL^\u0080\u001f\rÝt\u009b¯Y\u009f\u0017ßÔ$\u00927PK\u000e\u009fÌç\u008d{K\u000f\t[Ç£\u0085óCà\u0000#þ|¼@z\u00978åù:·7uS3£ñ÷¯Ñl\u0014*]è ¦\u0085dâ%+ãC¡O\u001f¤æ²§(eZ#\u0098áö¯êl\b*^èJ¶£tÇ5\u0015^\u0080\u001f\u001aÝh\u009bªYÄ\u0017ØÔ:\u0092lPx\u000e\u0082Ìì\u008d9K\u0006^\u0080\u001f\u001aÝh\u009bªYÄ\u0017ÉÔ&\u0092{PL\u000e\u0093Ìñ\u008d{K\u0001\tAÇµ\u0085öCÐ\u0000\"þy¼Iz\u00898î^\u0080\u001f\rÝt\u009b¯Y\u009f\u0017ßÔ$\u00927PK\u000e\u009fÌç\u008d{K\u000f\t[Ç£\u0085òCÌ\u0000:þ{¼Cz\u00978îù<·\u001auh3¬ñû¯Íl]*qè¾^\u0080\u001f\u001aÝh\u009bªYÄ\u0017ØÔ:\u0092lPF\u000e\u0095Ìæ\u008d1^\u0080\u001f\u001aÝh\u009bªYÄ\u0017ØÔ:\u0092lP@\u000e\u008fÌ÷\u008d;^\u0080\u001f\u001aÝh\u009bªYÄ\u0017ØÔ:\u0092lPJ\u000e\u0093Ìâ\u008d:§ÑæK$9bû \u0095î\u0089-kk=©\u0019÷Õ5½t`ã×¢M`?&ýä\u0093ª\u008fim/;í\u0006³Ìq¡0dVB\u0017ØÕª\u0093hQ\u0006\u001f\u001aÜø\u009a®X\u0095\u0006SÄ&\u0085ÿCÑ\u0001\u0093^\u0080\u001f\u001aÝh\u009bªYÄ\u0017ØÔ:\u0092lPx\u000e\u009fÌè\u008d1^\u0080\u001f\u001aÝl\u009b¨Y\u008a\u0017\u0095Ô-\u0092wPP\u000e\u0098Ìé\u008d;K\u0002\tVÇ²\u0085¿C\u0091\u00006þ\u007f¼\u0003z\u00998ùù-·\u0003J«\u000b8ÉH\u008f\u0083Mï\u0003æÀ\u000b\u0086]Dh\u001a²ØÙ\u0099\f_g\u001d[Ó\u0099\u0091ÏWÇ\u0014\rêW¨unµ,Åí4£,ap'\u0089åÛ»ýZs\u001býÙ\u008c\u009f@]{\u0013fÐÓ\u0096\u0084T¤\njÈ\u0004\u0089ÓOã$`eç§\u0094á\u0003#.^\u0080\u001f\u000eÝ\u007f\u009b³Y\u0088\u0017\u0095Ô:\u0092}PK\u000e\u0090Ìª\u008d9K\u0002\tBÇ²)ýh9ªYì\u0085.²`à£\u001få\u0003'uy¬»Üú\u0005<0~n°\u0087òÍ4¤w\b\u0089G^Ã\u001f\u0017Ýo\u009b\u009bY§\u0017ÿÔ\u001a\u0092GPE\u000e\u0085Ìñ\u008dzK\u0010\t]\u0096ß×D\u0015&Sà\u0091\u009bß\u0088\u001csZ#\u0098\u0011ÆÈ\u0004\u0085Eh\u0083SÁ\t\u000fûM¬\u008b\u0093È?6:t\u001e²Èn®/qí\u001b«Úiû'\u00adäK¢\u0018`/>æa\u00ad 6âT¤\u0092fé(úë\u000b\u00ad@od1¯óÛ^\u0080\u001f\u001aÝl\u009b¨Y\u008a\u0017\u0095Ô-\u0092wPP\u000e\u0098Ìé\u008d;K\u0002\tVÇ²\u0085¿C\u0091\u0000*þm¼\u0003z\u009a8úù)·\u001bu\u00193¾ñø¯È^\u0080\u001f\u000eÝ\u007f\u009b³Y\u0088\u0017\u0095Ô*\u0092hPR\u000e\u009fÌë\u008d2K\fYA\u0018¸ÚÈ\u009c\u0011^$\u0010zÓ\u0093\u0095Ù^\u0080\u001f\u001aÝl\u009b¨Y\u008a\u0017\u0095Ô$\u0092qPT\u000e\u0095Ìª\u008d$K\u0011\t]Ç§\u0085ùCÓ\u0000+þn¼\u0003z\u00988ÿù+·Gu\u00073éñö¯Ël\u001e*,è¼¦\u0089dì%,ã\u0002¡J\u001f¢Ýè\u009bÝXV\u0016jÔ³\u0092\u0088PÁ\u0011*Ï\u007f\u008dD".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
        AlternateContactlessPaymentDataJson = cArr;
        DigitizedCardProfile = -1212830596383236226L;
    }

    static void init$1() {
        $$d = new byte[]{125, -89, 109, 76};
        $$e = 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0bbd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0d6c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0e34  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x11dd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x12a3 A[Catch: all -> 0x01d4, TRY_ENTER, TryCatch #5 {all -> 0x01d4, blocks: (B:6:0x00d1, B:8:0x00e4, B:9:0x0132, B:18:0x0201, B:20:0x0245, B:21:0x0299, B:28:0x0334, B:30:0x0347, B:31:0x039a, B:39:0x045c, B:41:0x04a7, B:42:0x0503, B:45:0x0519, B:47:0x0528, B:48:0x0571, B:54:0x0638, B:56:0x0684, B:57:0x06d9, B:73:0x07b1, B:75:0x07fd, B:76:0x0854, B:82:0x090d, B:84:0x0920, B:85:0x096e, B:93:0x0a41, B:95:0x0a8e, B:96:0x0aea, B:100:0x0b26, B:102:0x0b39, B:103:0x0b83, B:110:0x0bdd, B:112:0x0c23, B:113:0x0c81, B:133:0x0d8c, B:135:0x0dc7, B:136:0x0e1e, B:140:0x0e5a, B:142:0x0e6a, B:143:0x0eb2, B:151:0x0f25, B:153:0x0f73, B:154:0x0fca, B:170:0x11fa, B:172:0x1232, B:173:0x128d, B:176:0x12a3, B:178:0x12b2, B:179:0x12f5, B:183:0x13bd, B:185:0x13ff, B:186:0x145c, B:190:0x1473, B:192:0x148b, B:193:0x14d2, B:199:0x1578, B:201:0x15c6, B:202:0x161e, B:206:0x165d, B:208:0x1670, B:209:0x16b6, B:211:0x16bf, B:213:0x16dd, B:214:0x1728, B:220:0x2506, B:222:0x2519, B:223:0x2564, B:234:0x2964, B:236:0x2977, B:237:0x29ca, B:242:0x2a8b, B:244:0x2a9e, B:245:0x2aed, B:253:0x2bb4, B:255:0x2bef, B:256:0x2c48, B:293:0x2ed7, B:295:0x2f26, B:296:0x2f81, B:312:0x30ea, B:314:0x312b, B:315:0x3187, B:319:0x31c5, B:321:0x31d8, B:322:0x3224, B:326:0x32d9, B:328:0x331e, B:329:0x3379, B:333:0x33a7, B:335:0x33ed, B:336:0x3447, B:367:0x2571, B:369:0x258f, B:370:0x25e4, B:376:0x2081, B:378:0x2094, B:379:0x20e7, B:392:0x2114, B:394:0x2127, B:395:0x217a, B:409:0x2289, B:411:0x22ca, B:412:0x231f, B:417:0x2424, B:419:0x2471, B:420:0x24ce, B:424:0x2356, B:426:0x2398, B:427:0x23eb, B:434:0x10e5, B:436:0x10f8, B:437:0x1147), top: B:5:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x2519 A[Catch: all -> 0x01d4, TryCatch #5 {all -> 0x01d4, blocks: (B:6:0x00d1, B:8:0x00e4, B:9:0x0132, B:18:0x0201, B:20:0x0245, B:21:0x0299, B:28:0x0334, B:30:0x0347, B:31:0x039a, B:39:0x045c, B:41:0x04a7, B:42:0x0503, B:45:0x0519, B:47:0x0528, B:48:0x0571, B:54:0x0638, B:56:0x0684, B:57:0x06d9, B:73:0x07b1, B:75:0x07fd, B:76:0x0854, B:82:0x090d, B:84:0x0920, B:85:0x096e, B:93:0x0a41, B:95:0x0a8e, B:96:0x0aea, B:100:0x0b26, B:102:0x0b39, B:103:0x0b83, B:110:0x0bdd, B:112:0x0c23, B:113:0x0c81, B:133:0x0d8c, B:135:0x0dc7, B:136:0x0e1e, B:140:0x0e5a, B:142:0x0e6a, B:143:0x0eb2, B:151:0x0f25, B:153:0x0f73, B:154:0x0fca, B:170:0x11fa, B:172:0x1232, B:173:0x128d, B:176:0x12a3, B:178:0x12b2, B:179:0x12f5, B:183:0x13bd, B:185:0x13ff, B:186:0x145c, B:190:0x1473, B:192:0x148b, B:193:0x14d2, B:199:0x1578, B:201:0x15c6, B:202:0x161e, B:206:0x165d, B:208:0x1670, B:209:0x16b6, B:211:0x16bf, B:213:0x16dd, B:214:0x1728, B:220:0x2506, B:222:0x2519, B:223:0x2564, B:234:0x2964, B:236:0x2977, B:237:0x29ca, B:242:0x2a8b, B:244:0x2a9e, B:245:0x2aed, B:253:0x2bb4, B:255:0x2bef, B:256:0x2c48, B:293:0x2ed7, B:295:0x2f26, B:296:0x2f81, B:312:0x30ea, B:314:0x312b, B:315:0x3187, B:319:0x31c5, B:321:0x31d8, B:322:0x3224, B:326:0x32d9, B:328:0x331e, B:329:0x3379, B:333:0x33a7, B:335:0x33ed, B:336:0x3447, B:367:0x2571, B:369:0x258f, B:370:0x25e4, B:376:0x2081, B:378:0x2094, B:379:0x20e7, B:392:0x2114, B:394:0x2127, B:395:0x217a, B:409:0x2289, B:411:0x22ca, B:412:0x231f, B:417:0x2424, B:419:0x2471, B:420:0x24ce, B:424:0x2356, B:426:0x2398, B:427:0x23eb, B:434:0x10e5, B:436:0x10f8, B:437:0x1147), top: B:5:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x256d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x2962  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x2bef A[Catch: all -> 0x01d4, TryCatch #5 {all -> 0x01d4, blocks: (B:6:0x00d1, B:8:0x00e4, B:9:0x0132, B:18:0x0201, B:20:0x0245, B:21:0x0299, B:28:0x0334, B:30:0x0347, B:31:0x039a, B:39:0x045c, B:41:0x04a7, B:42:0x0503, B:45:0x0519, B:47:0x0528, B:48:0x0571, B:54:0x0638, B:56:0x0684, B:57:0x06d9, B:73:0x07b1, B:75:0x07fd, B:76:0x0854, B:82:0x090d, B:84:0x0920, B:85:0x096e, B:93:0x0a41, B:95:0x0a8e, B:96:0x0aea, B:100:0x0b26, B:102:0x0b39, B:103:0x0b83, B:110:0x0bdd, B:112:0x0c23, B:113:0x0c81, B:133:0x0d8c, B:135:0x0dc7, B:136:0x0e1e, B:140:0x0e5a, B:142:0x0e6a, B:143:0x0eb2, B:151:0x0f25, B:153:0x0f73, B:154:0x0fca, B:170:0x11fa, B:172:0x1232, B:173:0x128d, B:176:0x12a3, B:178:0x12b2, B:179:0x12f5, B:183:0x13bd, B:185:0x13ff, B:186:0x145c, B:190:0x1473, B:192:0x148b, B:193:0x14d2, B:199:0x1578, B:201:0x15c6, B:202:0x161e, B:206:0x165d, B:208:0x1670, B:209:0x16b6, B:211:0x16bf, B:213:0x16dd, B:214:0x1728, B:220:0x2506, B:222:0x2519, B:223:0x2564, B:234:0x2964, B:236:0x2977, B:237:0x29ca, B:242:0x2a8b, B:244:0x2a9e, B:245:0x2aed, B:253:0x2bb4, B:255:0x2bef, B:256:0x2c48, B:293:0x2ed7, B:295:0x2f26, B:296:0x2f81, B:312:0x30ea, B:314:0x312b, B:315:0x3187, B:319:0x31c5, B:321:0x31d8, B:322:0x3224, B:326:0x32d9, B:328:0x331e, B:329:0x3379, B:333:0x33a7, B:335:0x33ed, B:336:0x3447, B:367:0x2571, B:369:0x258f, B:370:0x25e4, B:376:0x2081, B:378:0x2094, B:379:0x20e7, B:392:0x2114, B:394:0x2127, B:395:0x217a, B:409:0x2289, B:411:0x22ca, B:412:0x231f, B:417:0x2424, B:419:0x2471, B:420:0x24ce, B:424:0x2356, B:426:0x2398, B:427:0x23eb, B:434:0x10e5, B:436:0x10f8, B:437:0x1147), top: B:5:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x2b8e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x2e1f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x2ebf  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x2f97  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x2ebc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x2571 A[Catch: all -> 0x01d4, TryCatch #5 {all -> 0x01d4, blocks: (B:6:0x00d1, B:8:0x00e4, B:9:0x0132, B:18:0x0201, B:20:0x0245, B:21:0x0299, B:28:0x0334, B:30:0x0347, B:31:0x039a, B:39:0x045c, B:41:0x04a7, B:42:0x0503, B:45:0x0519, B:47:0x0528, B:48:0x0571, B:54:0x0638, B:56:0x0684, B:57:0x06d9, B:73:0x07b1, B:75:0x07fd, B:76:0x0854, B:82:0x090d, B:84:0x0920, B:85:0x096e, B:93:0x0a41, B:95:0x0a8e, B:96:0x0aea, B:100:0x0b26, B:102:0x0b39, B:103:0x0b83, B:110:0x0bdd, B:112:0x0c23, B:113:0x0c81, B:133:0x0d8c, B:135:0x0dc7, B:136:0x0e1e, B:140:0x0e5a, B:142:0x0e6a, B:143:0x0eb2, B:151:0x0f25, B:153:0x0f73, B:154:0x0fca, B:170:0x11fa, B:172:0x1232, B:173:0x128d, B:176:0x12a3, B:178:0x12b2, B:179:0x12f5, B:183:0x13bd, B:185:0x13ff, B:186:0x145c, B:190:0x1473, B:192:0x148b, B:193:0x14d2, B:199:0x1578, B:201:0x15c6, B:202:0x161e, B:206:0x165d, B:208:0x1670, B:209:0x16b6, B:211:0x16bf, B:213:0x16dd, B:214:0x1728, B:220:0x2506, B:222:0x2519, B:223:0x2564, B:234:0x2964, B:236:0x2977, B:237:0x29ca, B:242:0x2a8b, B:244:0x2a9e, B:245:0x2aed, B:253:0x2bb4, B:255:0x2bef, B:256:0x2c48, B:293:0x2ed7, B:295:0x2f26, B:296:0x2f81, B:312:0x30ea, B:314:0x312b, B:315:0x3187, B:319:0x31c5, B:321:0x31d8, B:322:0x3224, B:326:0x32d9, B:328:0x331e, B:329:0x3379, B:333:0x33a7, B:335:0x33ed, B:336:0x3447, B:367:0x2571, B:369:0x258f, B:370:0x25e4, B:376:0x2081, B:378:0x2094, B:379:0x20e7, B:392:0x2114, B:394:0x2127, B:395:0x217a, B:409:0x2289, B:411:0x22ca, B:412:0x231f, B:417:0x2424, B:419:0x2471, B:420:0x24ce, B:424:0x2356, B:426:0x2398, B:427:0x23eb, B:434:0x10e5, B:436:0x10f8, B:437:0x1147), top: B:5:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x086a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        java.lang.Integer num2;
        int i4;
        java.lang.String str;
        int i5;
        int i6;
        int i7;
        long j;
        java.lang.String str2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        java.lang.String str3;
        char c;
        int i14;
        java.lang.String[][] strArr;
        java.util.ArrayList arrayList;
        int i15;
        int i16;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object obj;
        java.lang.Object invoke;
        java.lang.String str7;
        int i17;
        char c2;
        int i18;
        int i19;
        int i20;
        java.lang.String intern;
        java.lang.Object[] objArr;
        java.lang.String[][] strArr2;
        java.lang.String[] strArr3;
        java.lang.String str8;
        int i21;
        java.lang.String next;
        int i22;
        int i23;
        java.lang.Object obj2;
        java.lang.String next2;
        java.lang.String str9;
        java.lang.String next3;
        java.lang.Integer num3 = 16;
        int i24 = 0;
        java.lang.Integer num4 = 0;
        java.lang.String str10 = "";
        int i25 = 1;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(466 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 7 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
        java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12790), 26 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr3);
        java.lang.String intern3 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 27, (char) (16685 - android.text.TextUtils.getOffsetAfter("", 0)), 25 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr4);
        java.lang.String intern4 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 53, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51448), 18 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr5);
        java.lang.String intern5 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(69 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.view.View.combineMeasuredStates(0, 0) + 17353), 29 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr6);
        java.lang.String[] strArr4 = {intern3, intern4, intern5, ((java.lang.String) objArr6[0]).intern()};
        int i26 = 0;
        while (true) {
            if (i26 >= 4) {
                num = num3;
                num2 = num4;
                i4 = i;
                break;
            }
            try {
                java.lang.Object[] objArr7 = {strArr4[i26]};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 37, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i24) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i24) == 0.0d ? 0 : -1)) + 3161, (char) (android.view.View.MeasureSpec.getMode(i24) + 33099));
                    byte b = $$a[16];
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(b, b2, (short) (b2 | 612), objArr8);
                    java.lang.String str11 = (java.lang.String) objArr8[i24];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[i24] = java.lang.String.class;
                    obj3 = cls.getMethod(str11, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj3);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7)).longValue();
                long j2 = i;
                num2 = num4;
                num = num3;
                long j3 = 1434443662 + (((-271) * longValue) - 119849391207L) + (((~((~j2) | (~longValue) | 439008758)) | (~((-439008759) | longValue | j2))) * (-272)) + (((~(439008758 | longValue)) | (~(439008758 | j2))) * (-272)) + (((~((-439008759) | j2)) | longValue) * 272);
                int i27 = ~i;
                if (((((int) j3) & (((~((-1358287585) | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 978696893 + (((~(i27 | (-1358287585))) | (-1425396458)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) | (((int) (j3 >> 32)) & (((1702220666 | i27) * (-757)) + 265270652 + ((~(1879048191 | i)) * 1514) + (((~(264994255 | i27)) | 1614053936 | (~((-176827526) | i))) * 757)))) != 0) {
                    i4 = i ^ (i26 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    break;
                }
                i26++;
                num4 = num2;
                num3 = num;
                i24 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i28 = 3;
        if (i4 != i) {
            java.lang.Object[] objArr9 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
            int i29 = ~i;
            int i30 = ~(1066740594 | i);
            java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i | 984105503)) | (~((-981467667) | i29))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 2030271737 + (((~((-984105504) | i29)) | i30) * (-1040)) + (((~(i29 | (-1066740595))) | 2637837 | i30) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2713, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                byte[] bArr = $$a;
                byte b3 = (byte) (-bArr[18]);
                byte b4 = bArr[16];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(b3, b4, (short) (b4 | 652), objArr11);
                obj4 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
            }
            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr10)).intValue();
            return objArr9;
        }
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 97, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40989), 12 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
        java.lang.String intern6 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 109, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 13, objArr13);
        java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 18 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr14);
        java.lang.String[] strArr5 = {intern6, intern7, ((java.lang.String) objArr14[0]).intern()};
        int i31 = 0;
        while (true) {
            if (i31 >= i28) {
                str = str10;
                i5 = i;
                break;
            }
            java.lang.Object[] objArr15 = {strArr5[i31]};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
            if (obj5 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 36, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3161, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33100));
                byte b5 = (byte) ($$a[16] - i25);
                java.lang.Object[] objArr16 = new java.lang.Object[i25];
                b(b5, (byte) (b5 | 18), (short) 618, objArr16);
                java.lang.String str12 = (java.lang.String) objArr16[0];
                java.lang.Class<?>[] clsArr2 = new java.lang.Class[i25];
                clsArr2[0] = java.lang.String.class;
                obj5 = cls3.getMethod(str12, clsArr2);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj5);
            }
            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr15)).longValue();
            long j4 = i;
            str = str10;
            long j5 = ~longValue2;
            long j6 = ~j4;
            long j7 = ((-675) * longValue2) + 124186287767L + ((j4 | 183436171 | j5) * (-676)) + (((~(j5 | 183436171)) | (~(j6 | 183436171))) * 676) + ((((j4 | (longValue2 | 183436171)) ^ (-1)) | (~(j6 | j5)) | (~((-183436172) | j5))) * 676) + 724034567;
            int i32 = ~((-954824438) | i);
            int i33 = ~i;
            if (((((int) j7) & ((((~(i33 | 1189479393)) | 134238216 | (~((-247747017) | i33))) * (-397)) + 899177768 + ((1210208809 | i) * 397))) | (((int) (j7 >> 32)) & (((1090781450 | i32) * (-196)) + 1988821330 + ((i32 | (-2045605888)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)))) != 0) {
                i5 = (i31 + 270) ^ i;
                break;
            }
            i31++;
            str10 = str;
            i28 = 3;
            i25 = 1;
        }
        if (i5 != i) {
            java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
            int i34 = ~i;
            java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((~(1572693887 | i34)) * 52) + 1142207093 + (((~(497289050 | i34)) | (~((-1553557048) | i34)) | 1075404837) * (-52)) + (((~(i34 | (-497289051))) | 19136840) * 52))};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj6 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                byte[] bArr2 = $$a;
                byte b6 = (byte) (-bArr2[18]);
                byte b7 = bArr2[16];
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                b(b6, b7, (short) (b7 | 652), objArr19);
                obj6 = cls4.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
            }
            ((int[]) objArr17[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr18)).intValue();
            return objArr17;
        }
        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
        if (obj7 == null) {
            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 26, android.graphics.Color.green(0) + 1864, (char) (41774 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
            int i35 = $$a[16] - 1;
            byte b8 = (byte) i35;
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            b(b8, (byte) (b8 | 18), (short) i35, objArr20);
            obj7 = cls5.getMethod((java.lang.String) objArr20[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj7);
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, null)).longValue();
        long j8 = ~longValue3;
        long j9 = i;
        long j10 = ~(longValue3 | j9);
        long j11 = j9;
        long j12 = ((((((-195) * longValue3) + 223710695356L) + (((~(j8 | (-572150116))) | j10) * (-196))) + ((longValue3 | (-572150116)) * 392)) + (((~(572150115 | j8)) | j10) * 196)) - 1357062746;
        int i36 = ~i;
        int i37 = (((int) (j12 >> 32)) & (((((~(242747745 | i36)) | 1679974156) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1453938172) + (((~(1853513581 | i36)) | (~((-173539426) | i))) * (-519)) + (((~(1679974156 | i)) | (-242747746)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) | (((int) j12) & (((((~((-1663537344) | i)) | (-1731172800)) * (-502)) - 2054859589) + ((~((-536969258) | i36)) * (-502)) + (((~((-1194203543) | i)) | (-1663537344)) * 502)));
        if (i37 != 0) {
            writeReplace = (values + 63) % 128;
            i6 = (i37 + 199) ^ i;
        } else {
            i6 = i;
        }
        if (i6 != i) {
            writeReplace = (values + 51) % 128;
            java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
            java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((637260523 | i) * (-50)) + 1889299211 + (((~(i | (-71406243))) | (~((-1342179333) | i36))) * 50) + (((~((-1413585575) | i36)) | 1342179332 | (~(i36 | 637260523))) * 50))};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj8 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), 2713 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                byte[] bArr3 = $$a;
                byte b9 = (byte) (-bArr3[18]);
                byte b10 = bArr3[16];
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                b(b9, b10, (short) (b10 | 652), objArr23);
                obj8 = cls6.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
            }
            ((int[]) objArr21[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr22)).intValue();
            return objArr21;
        }
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        a(141 - android.view.KeyEvent.keyCodeFromString(str), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 20 - android.view.View.MeasureSpec.getMode(0), objArr24);
        java.lang.String intern8 = ((java.lang.String) objArr24[0]).intern();
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a(161 - android.view.KeyEvent.normalizeMetaState(0), (char) android.view.View.MeasureSpec.getMode(0), 5 - android.view.MotionEvent.axisFromString(str), objArr25);
        java.lang.String intern9 = ((java.lang.String) objArr25[0]).intern();
        java.io.File file = new java.io.File(intern8);
        if (file.exists() && file.isFile()) {
            try {
                java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                a(166 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 41546), android.view.KeyEvent.getDeadChar(0, 0) + 2, objArr26);
                java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr26[0]).intern());
                next3 = useDelimiter.hasNext() ? useDelimiter.next() : str;
                useDelimiter.close();
            } catch (java.io.IOException unused) {
            }
            if (next3.contains(intern9)) {
                values = (writeReplace + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                i7 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                if (i7 == i) {
                    java.lang.Object[] objArr27 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                    java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((151808385 | i36) * (-192)) + 676305489 + (((~((-1894810129) | i36)) | 4227584) * (-384)) + (((~(i | (-4227585))) | (~(i36 | (-1890582545))) | (~(2046618513 | i))) * 192))};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj9 == null) {
                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 50, 2713 - android.view.KeyEvent.keyCodeFromString(str), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                        byte[] bArr4 = $$a;
                        byte b11 = (byte) (-bArr4[18]);
                        byte b12 = bArr4[16];
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        b(b11, b12, (short) (b12 | 652), objArr29);
                        obj9 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                    }
                    ((int[]) objArr27[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr28)).intValue();
                    return objArr27;
                }
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                a(169 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (6344 - android.text.TextUtils.indexOf(str, str, 0)), 31 - android.text.TextUtils.indexOf(str, str, 0, 0), objArr30);
                java.lang.String intern10 = ((java.lang.String) objArr30[0]).intern();
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                a(200 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.Process.myTid() >> 22) + 23, objArr31);
                java.lang.String intern11 = ((java.lang.String) objArr31[0]).intern();
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                a((android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, (char) (android.os.Process.myTid() >> 22), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29, objArr32);
                java.lang.String intern12 = ((java.lang.String) objArr32[0]).intern();
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 250, (char) (29597 - android.graphics.Color.blue(0)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SI, objArr33);
                java.lang.String[] strArr6 = {intern10, intern11, intern12, ((java.lang.String) objArr33[0]).intern()};
                int i38 = 0;
                int i39 = 4;
                while (true) {
                    if (i38 >= i39) {
                        j = j11;
                        str2 = intern2;
                        i8 = i36;
                        i9 = i;
                        break;
                    }
                    java.lang.Object[] objArr34 = {strArr6[i38]};
                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                    if (obj10 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str) + 36, android.graphics.Color.blue(0) + 3161, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33099));
                        byte b13 = $$a[16];
                        byte b14 = (byte) (b13 - 1);
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        b(b13, b14, (short) (b14 | 612), objArr35);
                        obj10 = cls8.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj10);
                    }
                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr34)).longValue();
                    j = j11;
                    long j13 = ~j;
                    int i40 = i38;
                    long j14 = ~(longValue4 | (-107913196));
                    str2 = intern2;
                    java.lang.String[] strArr7 = strArr6;
                    long j15 = (~longValue4) | 107913195;
                    i8 = i36;
                    long j16 = (1435 * longValue4) + 77265848336L + ((longValue4 | 107913195) * (-1434)) + (((~(j15 | j)) | (~(j13 | longValue4)) | j14) * 717) + (((~(j15 | j13)) | j14 | (~(longValue4 | j))) * 717) + 1103348099;
                    if (((((int) j16) & (((((i8 | (-1409239976)) * 1324) + 818885255) + (((~((-33229480) | i)) | (~((-1403996931) | i))) * (-1324))) - 438189906)) | (((int) (j16 >> 32)) & (((i8 | (-1107888147)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1671182346 + (((~(i8 | (-1847527540))) | (-1378462099)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)))) != 0) {
                        i9 = i ^ (i40 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        break;
                    }
                    i38 = i40 + 1;
                    strArr6 = strArr7;
                    intern2 = str2;
                    i36 = i8;
                    i39 = 4;
                    j11 = j;
                }
                if (i9 != i) {
                    java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                    java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((~(i8 | (-173015404))) | 1877830694) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1481356134) + (((~(i8 | (-1048906))) | (~(1878879599 | i))) * (-519)) + (((~(i | 1877830694)) | 173015403) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj11 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 50, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                        byte[] bArr5 = $$a;
                        byte b15 = (byte) (-bArr5[18]);
                        byte b16 = bArr5[16];
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        b(b15, b16, (short) (b16 | 652), objArr38);
                        obj11 = cls9.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                    }
                    ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr37)).intValue();
                    return objArr36;
                }
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                a(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, (char) (android.text.TextUtils.getTrimmedLength(str) + 60032), android.graphics.Color.alpha(0) + 13, objArr39);
                java.lang.Object[] objArr40 = {((java.lang.String) objArr39[0]).intern()};
                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj12 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40, 1921 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int i41 = $$a[16] - 1;
                    byte b17 = (byte) i41;
                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                    b(b17, (byte) (b17 | 18), (short) i41, objArr41);
                    obj12 = cls10.getMethod((java.lang.String) objArr41[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                }
                java.lang.String str13 = (java.lang.String) ((java.lang.reflect.Method) obj12).invoke(null, objArr40);
                if (str13 != null) {
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    a(android.text.TextUtils.indexOf(str, str, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 9 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr42);
                    if (str13.contains(((java.lang.String) objArr42[0]).intern())) {
                        i10 = i ^ 250;
                        if (i10 == i) {
                            writeReplace = (values + 55) % 128;
                            java.lang.Object[] objArr43 = {new int[]{i}, new int[]{i10}, null, null, new int[1]};
                            java.lang.Object[] objArr44 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i8 | (-673727013))) * 433) - 1410921946) + (((~((-1368593884) | i)) | (-682252215)) * (-433)) + (((~(i | (-682252215))) | (-2042320896)) * 433))};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj13 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str) + 50, 2713 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                byte[] bArr6 = $$a;
                                byte b18 = (byte) (-bArr6[18]);
                                byte b19 = bArr6[16];
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                b(b18, b19, (short) (b19 | 652), objArr45);
                                obj13 = cls11.getMethod((java.lang.String) objArr45[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj13);
                            }
                            ((int[]) objArr43[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr44)).intValue();
                            return objArr43;
                        }
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        a(288 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 58789), android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 18, objArr46);
                        java.lang.String intern13 = ((java.lang.String) objArr46[0]).intern();
                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                        a(304 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.text.TextUtils.getTrimmedLength(str) + 13999), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 6, objArr47);
                        java.lang.String intern14 = ((java.lang.String) objArr47[0]).intern();
                        java.io.File file2 = new java.io.File(intern13);
                        if (file2.exists() && file2.isFile()) {
                            try {
                                java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                a(166 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.graphics.Color.green(0) + 41546), 2 - android.text.TextUtils.getOffsetAfter(str, 0), objArr48);
                                java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr48[0]).intern());
                                if (useDelimiter2.hasNext()) {
                                    int i42 = values + 5;
                                    writeReplace = i42 % 128;
                                    if (i42 % 2 == 0) {
                                        useDelimiter2.next();
                                        throw null;
                                    }
                                    str9 = useDelimiter2.next();
                                } else {
                                    str9 = str;
                                }
                                useDelimiter2.close();
                            } catch (java.io.IOException unused2) {
                            }
                            if (str9.contains(intern14)) {
                                int i43 = writeReplace + 111;
                                values = i43 % 128;
                                if (i43 % 2 == 0) {
                                    i11 = i ^ 251;
                                    if (i11 == i) {
                                        writeReplace = (values + 41) % 128;
                                        java.lang.Object[] objArr49 = {new int[]{i}, new int[]{i11}, null, null, new int[1]};
                                        java.lang.Object[] objArr50 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i8 | (-900729098))) * (-783)) - 1832920523) + (((~(i8 | 1112339574)) | (-938506524)) * 783))};
                                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj14 == null) {
                                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getMode(0), 2713 - android.view.View.resolveSize(0, 0), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                            byte[] bArr7 = $$a;
                                            byte b20 = (byte) (-bArr7[18]);
                                            byte b21 = bArr7[16];
                                            java.lang.Object[] objArr51 = new java.lang.Object[1];
                                            b(b20, b21, (short) (b21 | 652), objArr51);
                                            obj14 = cls12.getMethod((java.lang.String) objArr51[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                                        }
                                        ((int[]) objArr49[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr50)).intValue();
                                        return objArr49;
                                    }
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    a(310 - android.view.KeyEvent.getDeadChar(0, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 23, objArr52);
                                    java.lang.Object[] objArr53 = {((java.lang.String) objArr52[0]).intern()};
                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj15 == null) {
                                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 1921 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0));
                                        int i44 = $$a[16] - 1;
                                        byte b22 = (byte) i44;
                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                        b(b22, (byte) (b22 | 18), (short) i44, objArr54);
                                        obj15 = cls13.getMethod((java.lang.String) objArr54[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj15);
                                    }
                                    java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj15).invoke(null, objArr53)).toLowerCase();
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.visa.cbp.getCertUsage.getODAData, (char) (28172 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 5, objArr55);
                                    if (lowerCase.contains(((java.lang.String) objArr55[0]).intern())) {
                                        int i45 = values + 39;
                                        writeReplace = i45 % 128;
                                        i12 = i45 % 2 == 0 ? i ^ 13095 : i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE;
                                    } else {
                                        i12 = i;
                                    }
                                    if (i12 != i) {
                                        writeReplace = (values + 43) % 128;
                                        java.lang.Object[] objArr56 = {new int[]{i}, new int[]{i12}, null, null, new int[1]};
                                        java.lang.Object[] objArr57 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((((~((-294411989) | i)) | 286019648) | (~(1756434109 | i))) * (-754)) - 802205361) + (((~(i | (-286019649))) | (~(i8 | 2042453757))) * (-754)) + ((i8 | (-294411989)) * 754))};
                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj16 == null) {
                                            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 2713 - android.graphics.Color.green(0), (char) android.graphics.Color.alpha(0));
                                            byte[] bArr8 = $$a;
                                            byte b23 = (byte) (-bArr8[18]);
                                            byte b24 = bArr8[16];
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            b(b23, b24, (short) (b24 | 652), objArr58);
                                            obj16 = cls14.getMethod((java.lang.String) objArr58[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                                        }
                                        ((int[]) objArr56[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr57)).intValue();
                                        return objArr56;
                                    }
                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 58789), 18 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr59);
                                    java.lang.String intern15 = ((java.lang.String) objArr59[0]).intern();
                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                    a(337 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (43684 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 6, objArr60);
                                    java.lang.String intern16 = ((java.lang.String) objArr60[0]).intern();
                                    java.io.File file3 = new java.io.File(intern15);
                                    if (file3.exists() && file3.isFile()) {
                                        try {
                                            java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                            a(166 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 41546), android.view.View.MeasureSpec.getMode(0) + 2, objArr61);
                                            java.util.Scanner useDelimiter3 = scanner3.useDelimiter(((java.lang.String) objArr61[0]).intern());
                                            next2 = useDelimiter3.hasNext() ? useDelimiter3.next() : str;
                                            useDelimiter3.close();
                                        } catch (java.io.IOException unused3) {
                                        }
                                        if (next2.contains(intern16)) {
                                            i13 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                            if (i13 == i) {
                                                java.lang.Object[] objArr62 = {new int[]{i}, new int[]{i13}, null, null, new int[1]};
                                                int i46 = ~(i | (-2097426));
                                                java.lang.Object[] objArr63 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((17829888 | i46) * (-476)) + 949563893 + (i46 * 952) + ((~(i8 | (-2097426))) * 476))};
                                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj17 == null) {
                                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str) + 50, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2713, (char) ((-1) - android.view.MotionEvent.axisFromString(str)));
                                                    byte[] bArr9 = $$a;
                                                    byte b25 = (byte) (-bArr9[18]);
                                                    byte b26 = bArr9[16];
                                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                    b(b25, b26, (short) (b26 | 652), objArr64);
                                                    obj17 = cls15.getMethod((java.lang.String) objArr64[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj17);
                                                }
                                                ((int[]) objArr62[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr63)).intValue();
                                                return objArr62;
                                            }
                                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                            if (obj18 == null) {
                                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 44, android.view.View.getDefaultSize(0, 0) + 2763, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                int i47 = $$a[16] - 1;
                                                byte b27 = (byte) i47;
                                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                b(b27, (byte) (b27 | 18), (short) i47, objArr65);
                                                obj18 = cls16.getMethod((java.lang.String) objArr65[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj18);
                                            }
                                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, null)).longValue();
                                            long j17 = ~longValue5;
                                            long j18 = ~j;
                                            long j19 = j17 | j18;
                                            long j20 = ((-112) * longValue5) + 63141697584L + (((~j19) | (-563765157)) * 226) + (((~(longValue5 | 563765156)) | (~(563765156 | j)) | (~((-563765157) | j19))) * (-113)) + ((~(j17 | j)) * 113) + 688801920;
                                            int i48 = ~((-1405714420) | i);
                                            if (((((int) j20) & (((1376332353 | i48) * (-814)) + 412532284 + ((i48 | (~(i8 | 31511990)) | 2129924) * 407) + (((~(1405714419 | i)) | 2129924 | (~((-31511991) | i))) * 407))) | (((int) (j20 >> 32)) & (((((~(i8 | (-97682284))) | 1339544127) * (-602)) - 273464673) + (((~((-97682284) | i)) | 97681963 | (~(i8 | 1339544447))) * (-301)) + ((~(i8 | 1339544127)) * 301)))) == 1) {
                                                java.lang.Object[] objArr66 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                java.lang.Object[] objArr67 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((~(i8 | (-1353237972))) | 8422802) * 446) - 2093446413) + (((~(i | (-1344815170))) | 689185324) * 446)) - 538397604)};
                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj19 == null) {
                                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2714, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                                    byte[] bArr10 = $$a;
                                                    byte b28 = (byte) (-bArr10[18]);
                                                    byte b29 = bArr10[16];
                                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                    b(b28, b29, (short) (b29 | 652), objArr68);
                                                    obj19 = cls17.getMethod((java.lang.String) objArr68[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                                                }
                                                ((int[]) objArr66[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr67)).intValue();
                                                return objArr66;
                                            }
                                            java.lang.Object[] objArr69 = {1};
                                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                            if (obj20 == null) {
                                                java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.graphics.ImageFormat.getBitsPerPixel(0), 2364 - android.view.View.combineMeasuredStates(0, 0), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                int i49 = $$a[16] - 1;
                                                byte b30 = (byte) i49;
                                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                b(b30, (byte) (b30 | 18), (short) i49, objArr70);
                                                obj20 = cls18.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj20);
                                            }
                                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr69)).longValue();
                                            long j21 = ~((-165797442) | longValue6);
                                            long j22 = ((-69) * longValue6) + 11771618311L + (((~(longValue6 | j)) | j21) * (-140)) + ((~(165797441 | longValue6 | j)) * 70) + (((~((~longValue6) | 165797441)) | j21 | (~(165797441 | j))) * 70) + 1242112758;
                                            int i50 = (int) (j22 >> 32);
                                            int i51 = ~((-1074003973) | i);
                                            int i52 = ((i50 & (((((((~(i8 | 1932276748)) | 67191360) | i51) * (-713)) + 839372486) + (i51 * 1426)) + ((~(i8 | 925464136)) * 713))) | (((int) j22) & (((((~(i8 | (-1084271777))) | (-1773469110)) * (-591)) + (-730957094)) + (((-1084271777) | i) * 591)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                                            if (i52 != i) {
                                                java.lang.Object[] objArr71 = {new int[]{i}, new int[]{i52}, null, null, new int[1]};
                                                int i53 = i8;
                                                java.lang.Object[] objArr72 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((i | 2050845257) * 614) + 906710395 + (((~(i8 | (-573309925))) | 573309504 | (~(i8 | 1477536173))) * (-1228)) + (((~(i53 | 2050845677)) | (~(i53 | (-421)))) * 614))};
                                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj21 == null) {
                                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, 2712 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.View.MeasureSpec.getSize(0));
                                                    byte[] bArr11 = $$a;
                                                    byte b31 = (byte) (-bArr11[18]);
                                                    byte b32 = bArr11[16];
                                                    java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                    b(b31, b32, (short) (b32 | 652), objArr73);
                                                    obj21 = cls19.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                                }
                                                ((int[]) objArr71[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr72)).intValue();
                                                return objArr71;
                                            }
                                            int i54 = i8;
                                            java.lang.Object[] objArr74 = new java.lang.Object[1];
                                            a(311 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 23 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr74);
                                            java.lang.Object[] objArr75 = {((java.lang.String) objArr74[0]).intern()};
                                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj22 == null) {
                                                java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str) + 41, android.view.View.resolveSizeAndState(0, 0, 0) + 1921, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                int i55 = $$a[16] - 1;
                                                byte b33 = (byte) i55;
                                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                b(b33, (byte) (b33 | 18), (short) i55, objArr76);
                                                obj22 = cls20.getMethod((java.lang.String) objArr76[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj22);
                                            }
                                            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj22).invoke(null, objArr75);
                                            if (invoke2 != null) {
                                                java.lang.Object[] objArr77 = {invoke2, 42};
                                                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj23 == null) {
                                                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.blue(0), 2594 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.graphics.Color.green(0));
                                                    int i56 = $$a[16] - 1;
                                                    byte b34 = (byte) i56;
                                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                    b(b34, (byte) (b34 | 18), (short) i56, objArr78);
                                                    obj23 = cls21.getMethod((java.lang.String) objArr78[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj23);
                                                }
                                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr77)).longValue();
                                                long j23 = ~longValue7;
                                                long j24 = (((-97) * longValue7) - 1524211400) + (((~(j23 | (-30484228))) | (~(j23 | j18))) * 98) + (((~(j | (-30484228))) | (~(j18 | 30484227)) | j23) * (-49)) + (((~(longValue7 | (-30484228))) | (~(j23 | j))) * 49) + 1287584752;
                                                if (((((int) (j24 >> 32)) & (((((365602475 | i54) * 1324) - 818884594) + (((~(1038001919 | i)) | (~(399224491 | i))) * (-1324))) - 765228744)) | (((int) j24) & ((((((-1426072866) | i) * (-381)) + 714879648) + (((~(715866846 | i54)) | (-1426138538)) * 381)) - 2127085027))) == 1986687685) {
                                                    str3 = str;
                                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                    a(445 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.green(0), 16 - android.text.TextUtils.indexOf(str3, str3), objArr79);
                                                    java.lang.Object[] objArr80 = {((java.lang.String) objArr79[0]).intern()};
                                                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj == null) {
                                                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, 1920 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0));
                                                        int i57 = $$a[16] - 1;
                                                        byte b35 = (byte) i57;
                                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                        b(b35, (byte) (b35 | 18), (short) i57, objArr81);
                                                        obj = cls22.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                                                    }
                                                    invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr80);
                                                    if (invoke != null) {
                                                        str7 = str3;
                                                        i17 = 0;
                                                    } else {
                                                        java.lang.Object[] objArr82 = {invoke, 42};
                                                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                        if (obj24 == null) {
                                                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.widget.ExpandableListView.getPackedPositionChild(0L), 2595 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                            int i58 = $$a[16] - 1;
                                                            byte b36 = (byte) i58;
                                                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                            b(b36, (byte) (b36 | 18), (short) i58, objArr83);
                                                            obj24 = cls23.getMethod((java.lang.String) objArr83[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj24);
                                                        }
                                                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr82)).longValue();
                                                        long j25 = ~longValue8;
                                                        long j26 = 514048353 | j25;
                                                        str7 = str3;
                                                        long j27 = ((-764) * longValue8) + 785979933266L + (((~(longValue8 | 514048353 | j)) | (~(j26 | j18)) | (~((-514048354) | j25 | j))) * 765) + (((~j26) | (~(j18 | 514048353))) * 1530) + (((~(514048353 | j)) | (~(j25 | j18 | (-514048354)))) * 765) + 1771148878;
                                                        i17 = (((int) (j27 >> 32)) & ((((~(2126503919 | i54)) | (~((-344506497) | i))) * 988) + 1698569206 + (((~(344771012 | i)) | 1781732907 | (~((-344506497) | i54))) * 988))) | (((int) j27) & (((((~((-159482881) | i54)) | (~((-369125445) | i))) * (-302)) - 236057241) + ((~((-159482881) | i)) * (-604)) + (((~((-528608325) | i)) | 539492641) * 302)));
                                                    }
                                                    if (i17 != 1986687685 && i17 != -1514516938) {
                                                        java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                        a(android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1162, (char) (63240 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 14 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr84);
                                                        java.lang.String intern17 = ((java.lang.String) objArr84[0]).intern();
                                                        java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                        a(android.view.KeyEvent.getDeadChar(0, 0) + 1175, (char) (android.graphics.Color.rgb(0, 0, 0) + 16814885), android.text.TextUtils.indexOf(str7, str7, 0, 0) + 26, objArr85);
                                                        java.lang.String intern18 = ((java.lang.String) objArr85[0]).intern();
                                                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                        a(android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1202, (char) (android.text.TextUtils.getTrimmedLength(str7) + 47141), 17 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr86);
                                                        java.lang.String intern19 = ((java.lang.String) objArr86[0]).intern();
                                                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                        a(1218 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 16 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr87);
                                                        java.lang.String intern20 = ((java.lang.String) objArr87[0]).intern();
                                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                        a(android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1236, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 15593), android.view.View.resolveSize(0, 0) + 15, objArr88);
                                                        java.lang.String intern21 = ((java.lang.String) objArr88[0]).intern();
                                                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                        a((android.os.Process.myPid() >> 22) + 1250, (char) android.view.View.resolveSizeAndState(0, 0, 0), android.view.KeyEvent.normalizeMetaState(0) + 37, objArr89);
                                                        java.lang.String intern22 = ((java.lang.String) objArr89[0]).intern();
                                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1287, (char) (47154 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), android.graphics.ImageFormat.getBitsPerPixel(0) + 13, objArr90);
                                                        java.lang.String intern23 = ((java.lang.String) objArr90[0]).intern();
                                                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                        a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1299, (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.view.View.MeasureSpec.getSize(0) + 13, objArr91);
                                                        java.lang.String intern24 = ((java.lang.String) objArr91[0]).intern();
                                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                        a(1311 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.KeyEvent.getDeadChar(0, 0), android.view.View.MeasureSpec.getMode(0) + 22, objArr92);
                                                        java.lang.String intern25 = ((java.lang.String) objArr92[0]).intern();
                                                        java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                        a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1333, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, objArr93);
                                                        java.lang.String intern26 = ((java.lang.String) objArr93[0]).intern();
                                                        java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                        a(1365 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.text.TextUtils.indexOf(str7, str7), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 12, objArr94);
                                                        java.lang.String intern27 = ((java.lang.String) objArr94[0]).intern();
                                                        java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                        a(android.text.TextUtils.indexOf(str7, str7, 0) + 1377, (char) android.text.TextUtils.getTrimmedLength(str7), 11 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr95);
                                                        java.lang.String intern28 = ((java.lang.String) objArr95[0]).intern();
                                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                        a(1388 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.indexOf(str7, str7, 0, 0), 12 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr96);
                                                        java.lang.String intern29 = ((java.lang.String) objArr96[0]).intern();
                                                        java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                        a(1401 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (63825 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, objArr97);
                                                        java.lang.String intern30 = ((java.lang.String) objArr97[0]).intern();
                                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                        a((android.os.Process.myTid() >> 22) + 1413, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 48471), android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, objArr98);
                                                        java.lang.String intern31 = ((java.lang.String) objArr98[0]).intern();
                                                        java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                        a(1426 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (2241 - android.os.Process.getGidForName(str7)), android.text.TextUtils.indexOf(str7, str7, 0, 0) + 14, objArr99);
                                                        java.lang.String intern32 = ((java.lang.String) objArr99[0]).intern();
                                                        java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                        a(1439 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 12, objArr100);
                                                        java.lang.String intern33 = ((java.lang.String) objArr100[0]).intern();
                                                        java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                        a(1450 - android.view.MotionEvent.axisFromString(str7), (char) android.view.View.MeasureSpec.getMode(0), 25 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr101);
                                                        java.lang.String intern34 = ((java.lang.String) objArr101[0]).intern();
                                                        java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                        a(1475 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (5163 - android.view.KeyEvent.keyCodeFromString(str7)), 28 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr102);
                                                        java.lang.String[] strArr8 = {intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, intern34, ((java.lang.String) objArr102[0]).intern()};
                                                        i22 = 0;
                                                        while (true) {
                                                            if (i22 < 19) {
                                                                i22 = -1;
                                                                break;
                                                            }
                                                            java.lang.String str14 = strArr8[i22];
                                                            java.lang.Object[] objArr103 = {str14};
                                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                            if (obj25 == null) {
                                                                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 3161 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33098));
                                                                byte b37 = (byte) ($$a[16] - 1);
                                                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                b(b37, (byte) (b37 | 18), (short) 618, objArr104);
                                                                obj25 = cls24.getMethod((java.lang.String) objArr104[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj25);
                                                            }
                                                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr103)).longValue();
                                                            long j28 = ~((~longValue9) | (-402591750));
                                                            long j29 = ~((-402591750) | j);
                                                            long j30 = (((-657) * longValue9) - 265307963250L) + (((~(longValue9 | 402591749)) | j28 | j29) * (-658)) + (658 * j28) + ((j28 | j29) * 658) + 1310062488;
                                                            if (((((int) j30) & (((1143014400 | i) * 988) + 267944025 + (((~(1853310554 | i54)) | 294134177) * (-1976)) + (((~((-1004430332) | i)) | 1143014400 | (~(1004430331 | i54))) * 988))) | (((int) (j30 >> 32)) & (((((~(1803449984 | i)) | (-2147382998)) * (-140)) - 116067290) + ((~((-343933014) | i)) * 70) + (((~((-366223574) | i)) | (-2125092438)) * 70)))) != 0) {
                                                                break;
                                                            }
                                                            java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                            a(1425 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2242), android.view.Gravity.getAbsoluteGravity(0, 0) + 14, objArr105);
                                                            if (str14.equals(((java.lang.String) objArr105[0]).intern())) {
                                                                java.lang.Object[] objArr106 = {str14};
                                                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                if (obj26 == null) {
                                                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.red(0), 3161 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (33099 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                                    byte b38 = $$a[16];
                                                                    byte b39 = (byte) (b38 - 1);
                                                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                    b(b38, b39, (short) (b39 | 612), objArr107);
                                                                    obj26 = cls25.getMethod((java.lang.String) objArr107[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj26);
                                                                }
                                                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr106)).longValue();
                                                                long j31 = ~longValue10;
                                                                long j32 = (~(j31 | 389215899)) | (~(j31 | j18)) | (~(j18 | 389215899));
                                                                long j33 = ((591 * longValue10) - 229248164511L) + (((~(longValue10 | (-389215900) | j)) | j32) * 590) + (j32 * (-1180)) + (((~(j18 | (-389215900))) | (~(j18 | longValue10))) * 590) + 606219004;
                                                                int i59 = (int) (j33 >> 32);
                                                                int i60 = ~((-826739239) | i54);
                                                                if (((i59 & ((((1208524808 | i60) * (-970)) - 298612208) + ((i60 | (-2035264047)) * 970))) | (((int) j33) & (((((~((-331293142) | i54)) | 19472725) * 98) - 302327989) + (((~(1768519551 | i54)) | (-331293142) | (~((-1768519552) | i))) * (-49)) + (((~((-331293142) | i)) | 1749046826) * 49)))) != 0) {
                                                                    break;
                                                                }
                                                            }
                                                            i22++;
                                                        }
                                                        if (i22 >= 0 && (i23 = i ^ (i22 + 130)) != i) {
                                                            java.lang.Object[] objArr108 = {new int[]{i}, new int[]{i23}, null, null, new int[1]};
                                                            java.lang.Object[] objArr109 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((((~((-972219653) | i54)) | 4358148) | r1) * (-502)) - 56330903) + (((~(i | 2046487949)) | (~(i54 | (-967861505)))) * 502))};
                                                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj2 == null) {
                                                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2712, (char) android.text.TextUtils.getOffsetAfter(str7, 0));
                                                                byte[] bArr12 = $$a;
                                                                byte b40 = (byte) (-bArr12[18]);
                                                                byte b41 = bArr12[16];
                                                                java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                b(b40, b41, (short) (b41 | 652), objArr110);
                                                                obj2 = cls26.getMethod((java.lang.String) objArr110[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                                                            }
                                                            ((int[]) objArr108[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr109)).intValue();
                                                            return objArr108;
                                                        }
                                                    }
                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                    a((-16775713) - android.graphics.Color.rgb(0, 0, 0), (char) (android.graphics.Color.blue(0) + 1267), 14 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr111);
                                                    java.lang.String intern35 = ((java.lang.String) objArr111[0]).intern();
                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                    a((android.os.Process.myPid() >> 22) + 1516, (char) (31487 - android.text.TextUtils.getTrimmedLength(str7)), android.text.TextUtils.getOffsetAfter(str7, 0) + 5, objArr112);
                                                    java.lang.String[] strArr9 = {intern35, ((java.lang.String) objArr112[0]).intern()};
                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                    a(android.view.Gravity.getAbsoluteGravity(0, 0) + 1521, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, objArr113);
                                                    java.lang.String intern36 = ((java.lang.String) objArr113[0]).intern();
                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                    a(1536 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (30517 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), 19 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr114);
                                                    java.lang.String intern37 = ((java.lang.String) objArr114[0]).intern();
                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                    a(1555 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.graphics.Color.blue(0), 14 - android.view.View.getDefaultSize(0, 0), objArr115);
                                                    java.lang.String[] strArr10 = {intern36, intern37, ((java.lang.String) objArr115[0]).intern()};
                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1569, (char) (51294 - android.view.MotionEvent.axisFromString(str7)), 21 - android.text.TextUtils.getOffsetBefore(str7, 0), objArr116);
                                                    java.lang.String intern38 = ((java.lang.String) objArr116[0]).intern();
                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                    a(1591 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (12387 - android.graphics.Color.argb(0, 0, 0, 0)), android.view.View.resolveSize(0, 0) + 10, objArr117);
                                                    java.lang.String[] strArr11 = {intern38, ((java.lang.String) objArr117[0]).intern()};
                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                    a(1599 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (16173 - android.view.View.resolveSizeAndState(0, 0, 0)), 11 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr118);
                                                    java.lang.String intern39 = ((java.lang.String) objArr118[0]).intern();
                                                    java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                    a(337 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (43684 - android.view.View.resolveSizeAndState(0, 0, 0)), 5 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr119);
                                                    java.lang.String[] strArr12 = {intern39, ((java.lang.String) objArr119[0]).intern()};
                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                    a(1612 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 28 - android.graphics.Color.blue(0), objArr120);
                                                    java.lang.String intern40 = ((java.lang.String) objArr120[0]).intern();
                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.getOffsetBefore(str7, 0) + 1590, (char) (12388 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 10 - android.view.View.MeasureSpec.getMode(0), objArr121);
                                                    c2 = 0;
                                                    java.lang.String[][] strArr13 = {strArr9, strArr10, strArr11, strArr12, new java.lang.String[]{intern40, ((java.lang.String) objArr121[0]).intern()}};
                                                    int i61 = -1;
                                                    i18 = 0;
                                                    loop4: while (true) {
                                                        if (i18 < 5) {
                                                            i19 = i;
                                                            break;
                                                        }
                                                        java.lang.String[] strArr14 = strArr13[i18];
                                                        java.lang.String str15 = strArr14[c2];
                                                        java.lang.String[] strArr15 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr14, 1, strArr14.length);
                                                        int length = strArr15.length;
                                                        int i62 = 0;
                                                        while (i62 < length) {
                                                            java.lang.String str16 = strArr15[i62];
                                                            java.io.File file4 = new java.io.File(str15);
                                                            if (file4.exists() && file4.isFile()) {
                                                                try {
                                                                    strArr2 = strArr13;
                                                                    try {
                                                                        java.util.Scanner scanner4 = new java.util.Scanner(new java.io.FileInputStream(file4));
                                                                        strArr3 = strArr15;
                                                                        str8 = str15;
                                                                        try {
                                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                            i21 = length;
                                                                            try {
                                                                                a(167 - android.graphics.Color.red(0), (char) (41546 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3, objArr122);
                                                                                java.util.Scanner useDelimiter4 = scanner4.useDelimiter(((java.lang.String) objArr122[0]).intern());
                                                                                next = useDelimiter4.hasNext() ? useDelimiter4.next() : str7;
                                                                                useDelimiter4.close();
                                                                            } catch (java.io.IOException unused4) {
                                                                                continue;
                                                                            }
                                                                        } catch (java.io.IOException unused5) {
                                                                        }
                                                                    } catch (java.io.IOException unused6) {
                                                                    }
                                                                } catch (java.io.IOException unused7) {
                                                                }
                                                                if (next.contains(str16)) {
                                                                    i19 = (i61 + 171) ^ i;
                                                                    break loop4;
                                                                }
                                                                i62++;
                                                                i61++;
                                                                strArr15 = strArr3;
                                                                strArr13 = strArr2;
                                                                str15 = str8;
                                                                length = i21;
                                                            }
                                                            strArr2 = strArr13;
                                                            strArr3 = strArr15;
                                                            str8 = str15;
                                                            i21 = length;
                                                            i62++;
                                                            i61++;
                                                            strArr15 = strArr3;
                                                            strArr13 = strArr2;
                                                            str15 = str8;
                                                            length = i21;
                                                        }
                                                        i18++;
                                                        c2 = 0;
                                                    }
                                                    if (i19 == i) {
                                                        java.lang.Object[] objArr123 = {new int[]{i}, new int[]{i19}, null, null, new int[1]};
                                                        java.lang.Object[] objArr124 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-1851710351) | i54)) | (~(1876876175 | i))) * (-831)) + 950806470 + ((~((-1677740429) | i)) * (-1662)) + (((~(i | 1851710350)) | (~(i54 | (-199135748))) | (~(199135747 | i))) * 831))};
                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj27 == null) {
                                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 51, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                            byte[] bArr13 = $$a;
                                                            byte b42 = (byte) (-bArr13[18]);
                                                            byte b43 = bArr13[16];
                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                            b(b42, b43, (short) (b43 | 652), objArr125);
                                                            obj27 = cls27.getMethod((java.lang.String) objArr125[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj27);
                                                        }
                                                        ((int[]) objArr123[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr124)).intValue();
                                                        return objArr123;
                                                    }
                                                    try {
                                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                        a(1638 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 13 - android.view.View.resolveSizeAndState(0, 0, 0), objArr126);
                                                        intern = ((java.lang.String) objArr126[0]).intern();
                                                        objArr = new java.lang.Object[1];
                                                        a(1653 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (1961 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, objArr);
                                                    } catch (java.lang.Exception unused8) {
                                                        i20 = i ^ 151;
                                                    }
                                                    try {
                                                        java.lang.Object[] objArr127 = {intern, ((java.lang.String) objArr[0]).intern()};
                                                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                                        if (obj28 == null) {
                                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(38 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 2213, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                            int i63 = $$a[16] - 1;
                                                            byte b44 = (byte) i63;
                                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                            b(b44, (byte) (b44 | 18), (short) i63, objArr128);
                                                            obj28 = cls28.getMethod((java.lang.String) objArr128[0], java.lang.String.class, java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj28);
                                                        }
                                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr127)).longValue();
                                                        long j34 = ~((~longValue11) | (-431588377));
                                                        long j35 = ~((-431588377) | j);
                                                        long j36 = ((((((-657) * longValue11) - 284416740443L) + ((((~(longValue11 | 431588376)) | j34) | j35) * (-658))) + (658 * j34)) + ((j34 | j35) * 658)) - 303786225;
                                                        i20 = ((((int) (j36 >> 32)) & ((((((-1227434539) | i54) * 1444) + (-1153123274)) + ((((~((-966681152) | i)) | 815153173) | (~((-1891059734) | i))) * (-1444))) + 1444473460)) | (((int) j36) & ((((~((-86311425) | i54)) * (-783)) + 1246620094) + (((~((-623348657) | i54)) | 813877753) * 783)))) != 0 ? i ^ 150 : i;
                                                        if (i20 != i) {
                                                            java.lang.Object[] objArr129 = {new int[]{i}, new int[]{i20}, null, null, new int[1]};
                                                            java.lang.Object[] objArr130 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((((~((-334267265) | i54)) | (-1716578834)) * (-933)) + 844341020) + (((~(i54 | (-1716578834))) | 1678796817) * 933)) - 1288080154)};
                                                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj29 == null) {
                                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 2713 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                byte[] bArr14 = $$a;
                                                                byte b45 = (byte) (-bArr14[18]);
                                                                byte b46 = bArr14[16];
                                                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                b(b45, b46, (short) (b46 | 652), objArr131);
                                                                obj29 = cls29.getMethod((java.lang.String) objArr131[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj29);
                                                            }
                                                            ((int[]) objArr129[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr130)).intValue();
                                                            return objArr129;
                                                        }
                                                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                        a(1661 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.text.TextUtils.getCapsMode(str7, 0, 0) + 47, objArr132);
                                                        java.lang.Object[] objArr133 = {((java.lang.String) objArr132[0]).intern()};
                                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                        if (obj30 == null) {
                                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str7, 0) + 36, 3161 - android.view.View.MeasureSpec.getSize(0), (char) (33098 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                            byte b47 = $$a[16];
                                                            byte b48 = (byte) (b47 - 1);
                                                            java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                            b(b47, b48, (short) (b48 | 612), objArr134);
                                                            obj30 = cls30.getMethod((java.lang.String) objArr134[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj30);
                                                        }
                                                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr133)).longValue();
                                                        long j37 = j18 | 266227654;
                                                        long j38 = ~longValue12;
                                                        long j39 = j38 | j18;
                                                        long j40 = ((-183) * longValue12) + 48719660865L + (((~(j39 | (-266227655))) | (~(j37 | longValue12))) * (-184)) + (((~(j38 | 266227654)) | (~j37) | (~j39)) * 184) + ((longValue12 | (-266227655)) * 184) + 1261662558;
                                                        int i64 = (((((int) (j40 >> 32)) & ((((2130608127 | i54) * 494) - 212866990) + (((~(2091150074 | i54)) | 1516142517) * 494))) | (((int) j40) & ((((((~((-1212171521) | i)) | r5) * 590) - 649924509) + ((((~((-839889596) | i54)) | 34209825) | (~(2017851290 | i54))) * (-1180))) + (((~((-2017851291) | i54)) | (~(839889595 | i54))) * 590)))) * 263) ^ i;
                                                        if (i64 != i) {
                                                            java.lang.Object[] objArr135 = {new int[]{i}, new int[]{i64}, null, null, new int[1]};
                                                            java.lang.Object[] objArr136 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-1212030776) | i)) | (-2046779264)) * (-502)) + 426442479 + ((~(i54 | (-1207963942))) * (-502)) + (((~(i | (-838815323))) | (-1212030776)) * 502))};
                                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj31 == null) {
                                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, str7, 0) + 50, 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                                byte[] bArr15 = $$a;
                                                                byte b49 = (byte) (-bArr15[18]);
                                                                byte b50 = bArr15[16];
                                                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                                b(b49, b50, (short) (b50 | 652), objArr137);
                                                                obj31 = cls31.getMethod((java.lang.String) objArr137[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                            }
                                                            ((int[]) objArr135[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr136)).intValue();
                                                            return objArr135;
                                                        }
                                                        java.lang.Object[] objArr138 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                        java.lang.Object[] objArr139 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((-537477634) | i) * (-627)) - 558839884) + (((~((-1311909357) | i)) | 738936741) * (-627)) + (((~(i | 738936741)) | (~(i54 | 1311909356))) * 627))};
                                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj32 == null) {
                                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.getDefaultSize(0, 0) + 2713, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                            byte[] bArr16 = $$a;
                                                            byte b51 = (byte) (-bArr16[18]);
                                                            byte b52 = bArr16[16];
                                                            java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                            b(b51, b52, (short) (b52 | 652), objArr140);
                                                            obj32 = cls32.getMethod((java.lang.String) objArr140[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                        }
                                                        ((int[]) objArr138[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr139)).intValue();
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
                                            java.lang.Object[] objArr141 = new java.lang.Object[1];
                                            a(310 - android.view.View.resolveSize(0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 22 - android.view.MotionEvent.axisFromString(str), objArr141);
                                            java.lang.String intern41 = ((java.lang.String) objArr141[0]).intern();
                                            java.lang.Object[] objArr142 = new java.lang.Object[1];
                                            a(366 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.os.Process.myPid() >> 22), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10, objArr142);
                                            java.lang.String intern42 = ((java.lang.String) objArr142[0]).intern();
                                            java.lang.Object[] objArr143 = new java.lang.Object[1];
                                            a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 374, (char) (26001 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), 7 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr143);
                                            java.lang.String intern43 = ((java.lang.String) objArr143[0]).intern();
                                            java.lang.Object[] objArr144 = new java.lang.Object[1];
                                            a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 382, (char) (14628 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 8, objArr144);
                                            java.lang.String[] strArr16 = {intern41, intern42, intern43, ((java.lang.String) objArr144[0]).intern()};
                                            java.lang.Object[] objArr145 = new java.lang.Object[1];
                                            a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 390, (char) (32544 - android.view.View.resolveSize(0, 0)), 18 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr145);
                                            java.lang.String intern44 = ((java.lang.String) objArr145[0]).intern();
                                            java.lang.Object[] objArr146 = new java.lang.Object[1];
                                            a(407 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 7 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr146);
                                            java.lang.String intern45 = ((java.lang.String) objArr146[0]).intern();
                                            java.lang.Object[] objArr147 = new java.lang.Object[1];
                                            a(414 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 42805), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 7, objArr147);
                                            java.lang.String intern46 = ((java.lang.String) objArr147[0]).intern();
                                            java.lang.Object[] objArr148 = new java.lang.Object[1];
                                            a(421 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (7827 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), 11 - android.graphics.Color.blue(0), objArr148);
                                            java.lang.String intern47 = ((java.lang.String) objArr148[0]).intern();
                                            java.lang.Object[] objArr149 = new java.lang.Object[1];
                                            a(android.view.View.combineMeasuredStates(0, 0) + 432, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 62713), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 14, objArr149);
                                            java.lang.String[] strArr17 = {intern44, intern45, intern46, intern47, ((java.lang.String) objArr149[0]).intern()};
                                            java.lang.Object[] objArr150 = new java.lang.Object[1];
                                            a(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 447, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 16 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr150);
                                            java.lang.String intern48 = ((java.lang.String) objArr150[0]).intern();
                                            java.lang.Object[] objArr151 = new java.lang.Object[1];
                                            a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 462, (char) android.text.TextUtils.indexOf(str, str, 0), android.graphics.Color.red(0) + 3, objArr151);
                                            java.lang.String intern49 = ((java.lang.String) objArr151[0]).intern();
                                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                                            a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 472, (char) (20791 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 21 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr152);
                                            java.lang.String intern50 = ((java.lang.String) objArr152[0]).intern();
                                            java.lang.Object[] objArr153 = new java.lang.Object[1];
                                            a(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 496, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 25 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr153);
                                            java.lang.String intern51 = ((java.lang.String) objArr153[0]).intern();
                                            java.lang.Object[] objArr154 = new java.lang.Object[1];
                                            a(521 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.text.TextUtils.getOffsetAfter(str, 0) + 17875), (-16777188) - android.graphics.Color.rgb(0, 0, 0), objArr154);
                                            java.lang.String[] strArr18 = {intern48, intern49, str2, intern50, intern51, ((java.lang.String) objArr154[0]).intern()};
                                            java.lang.Object[] objArr155 = new java.lang.Object[1];
                                            a((android.os.Process.myPid() >> 22) + 548, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, objArr155);
                                            java.lang.String intern52 = ((java.lang.String) objArr155[0]).intern();
                                            java.lang.Object[] objArr156 = new java.lang.Object[1];
                                            a(559 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 8 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr156);
                                            java.lang.String intern53 = ((java.lang.String) objArr156[0]).intern();
                                            java.lang.Object[] objArr157 = new java.lang.Object[1];
                                            a(android.view.View.combineMeasuredStates(0, 0) + 567, (char) (35066 - android.text.TextUtils.indexOf(str, str, 0, 0)), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 7, objArr157);
                                            java.lang.String intern54 = ((java.lang.String) objArr157[0]).intern();
                                            java.lang.Object[] objArr158 = new java.lang.Object[1];
                                            a(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 574, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 6 - (android.os.Process.myPid() >> 22), objArr158);
                                            java.lang.String[] strArr19 = {intern52, intern53, intern54, ((java.lang.String) objArr158[0]).intern()};
                                            java.lang.Object[] objArr159 = new java.lang.Object[1];
                                            a(android.view.MotionEvent.axisFromString(str) + 580, (char) android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, objArr159);
                                            java.lang.String intern55 = ((java.lang.String) objArr159[0]).intern();
                                            java.lang.Object[] objArr160 = new java.lang.Object[1];
                                            a(414 - android.view.View.MeasureSpec.getMode(0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 42805), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7, objArr160);
                                            java.lang.String intern56 = ((java.lang.String) objArr160[0]).intern();
                                            java.lang.Object[] objArr161 = new java.lang.Object[1];
                                            a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 382, (char) (14627 - (android.os.Process.myPid() >> 22)), (android.os.Process.myPid() >> 22) + 8, objArr161);
                                            java.lang.String[] strArr20 = {intern55, intern56, ((java.lang.String) objArr161[0]).intern()};
                                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                                            a(643 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (59581 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 14 - android.view.View.combineMeasuredStates(0, 0), objArr162);
                                            java.lang.String intern57 = ((java.lang.String) objArr162[0]).intern();
                                            java.lang.Object[] objArr163 = new java.lang.Object[1];
                                            a(608 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr163);
                                            java.lang.String[] strArr21 = {intern57, ((java.lang.String) objArr163[0]).intern()};
                                            java.lang.Object[] objArr164 = new java.lang.Object[1];
                                            a(610 - android.view.View.MeasureSpec.getSize(0), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 23205), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 9, objArr164);
                                            java.lang.String intern58 = ((java.lang.String) objArr164[0]).intern();
                                            java.lang.Object[] objArr165 = new java.lang.Object[1];
                                            a(619 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.KeyEvent.keyCodeFromString(str) + 1, objArr165);
                                            java.lang.String[] strArr22 = {intern58, ((java.lang.String) objArr165[0]).intern()};
                                            java.lang.Object[] objArr166 = new java.lang.Object[1];
                                            a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 619, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, objArr166);
                                            java.lang.String intern59 = ((java.lang.String) objArr166[0]).intern();
                                            java.lang.Object[] objArr167 = new java.lang.Object[1];
                                            a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 462, (char) android.text.TextUtils.indexOf(str, str), 3 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr167);
                                            java.lang.String intern60 = ((java.lang.String) objArr167[0]).intern();
                                            java.lang.Object[] objArr168 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 407, (char) android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7, objArr168);
                                            java.lang.String intern61 = ((java.lang.String) objArr168[0]).intern();
                                            java.lang.Object[] objArr169 = new java.lang.Object[1];
                                            a(637 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (46456 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), 8 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr169);
                                            java.lang.String intern62 = ((java.lang.String) objArr169[0]).intern();
                                            java.lang.Object[] objArr170 = new java.lang.Object[1];
                                            a(420 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (7827 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), android.graphics.Color.rgb(0, 0, 0) + 16777227, objArr170);
                                            java.lang.String intern63 = ((java.lang.String) objArr170[0]).intern();
                                            java.lang.Object[] objArr171 = new java.lang.Object[1];
                                            a(432 - android.text.TextUtils.indexOf(str, str, 0), (char) (62714 - android.graphics.Color.green(0)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 14, objArr171);
                                            java.lang.String[] strArr23 = {intern59, intern60, intern61, intern62, intern63, ((java.lang.String) objArr171[0]).intern()};
                                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                                            a(android.text.TextUtils.getCapsMode(str, 0, 0) + 644, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), android.text.TextUtils.getOffsetBefore(str, 0) + 20, objArr172);
                                            java.lang.String intern64 = ((java.lang.String) objArr172[0]).intern();
                                            java.lang.Object[] objArr173 = new java.lang.Object[1];
                                            a(664 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (52632 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 18 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr173);
                                            java.lang.String intern65 = ((java.lang.String) objArr173[0]).intern();
                                            java.lang.Object[] objArr174 = new java.lang.Object[1];
                                            a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 683, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, objArr174);
                                            java.lang.String intern66 = ((java.lang.String) objArr174[0]).intern();
                                            java.lang.Object[] objArr175 = new java.lang.Object[1];
                                            a(713 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.view.View.combineMeasuredStates(0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25, objArr175);
                                            java.lang.String intern67 = ((java.lang.String) objArr175[0]).intern();
                                            java.lang.Object[] objArr176 = new java.lang.Object[1];
                                            a(740 - android.text.TextUtils.getOffsetBefore(str, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, objArr176);
                                            java.lang.String intern68 = ((java.lang.String) objArr176[0]).intern();
                                            java.lang.Object[] objArr177 = new java.lang.Object[1];
                                            a(763 - android.graphics.Color.alpha(0), (char) (19516 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 33 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr177);
                                            java.lang.String[] strArr24 = {intern64, intern65, intern66, intern67, intern68, ((java.lang.String) objArr177[0]).intern(), str2};
                                            java.lang.Object[] objArr178 = new java.lang.Object[1];
                                            a(796 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.graphics.Color.green(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 14, objArr178);
                                            java.lang.String intern69 = ((java.lang.String) objArr178[0]).intern();
                                            java.lang.Object[] objArr179 = new java.lang.Object[1];
                                            a(375 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26001), android.view.View.MeasureSpec.getSize(0) + 7, objArr179);
                                            java.lang.String[] strArr25 = {intern69, ((java.lang.String) objArr179[0]).intern()};
                                            java.lang.Object[] objArr180 = new java.lang.Object[1];
                                            a(android.view.View.combineMeasuredStates(0, 0) + 809, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 11918), android.widget.ExpandableListView.getPackedPositionChild(0L) + 31, objArr180);
                                            java.lang.String intern70 = ((java.lang.String) objArr180[0]).intern();
                                            java.lang.Object[] objArr181 = new java.lang.Object[1];
                                            a(android.widget.ExpandableListView.getPackedPositionChild(0L) + androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 65185), 11 - android.graphics.Color.green(0), objArr181);
                                            java.lang.String[] strArr26 = {intern70, ((java.lang.String) objArr181[0]).intern()};
                                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 850, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 18 - android.os.Process.getGidForName(str), objArr182);
                                            java.lang.String intern71 = ((java.lang.String) objArr182[0]).intern();
                                            java.lang.Object[] objArr183 = new java.lang.Object[1];
                                            a(android.graphics.Color.red(0) + 869, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 52313), 5 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr183);
                                            java.lang.String[] strArr27 = {intern71, ((java.lang.String) objArr183[0]).intern()};
                                            java.lang.Object[] objArr184 = new java.lang.Object[1];
                                            a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 874, (char) (30970 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 18 - android.os.Process.getGidForName(str), objArr184);
                                            java.lang.String[] strArr28 = {((java.lang.String) objArr184[0]).intern()};
                                            java.lang.Object[] objArr185 = new java.lang.Object[1];
                                            a(941 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, objArr185);
                                            java.lang.String[] strArr29 = {((java.lang.String) objArr185[0]).intern()};
                                            java.lang.Object[] objArr186 = new java.lang.Object[1];
                                            a(909 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (15974 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 19, objArr186);
                                            java.lang.String[] strArr30 = {((java.lang.String) objArr186[0]).intern()};
                                            java.lang.Object[] objArr187 = new java.lang.Object[1];
                                            a(927 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 12975), 19 - android.graphics.Color.blue(0), objArr187);
                                            java.lang.String[] strArr31 = {((java.lang.String) objArr187[0]).intern()};
                                            java.lang.Object[] objArr188 = new java.lang.Object[1];
                                            a(946 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 23 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr188);
                                            java.lang.String[] strArr32 = {((java.lang.String) objArr188[0]).intern()};
                                            java.lang.Object[] objArr189 = new java.lang.Object[1];
                                            a(970 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 9376), 21 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr189);
                                            java.lang.String[] strArr33 = {((java.lang.String) objArr189[0]).intern()};
                                            java.lang.Object[] objArr190 = new java.lang.Object[1];
                                            a(990 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), 23 - android.view.MotionEvent.axisFromString(str), objArr190);
                                            java.lang.String str17 = str2;
                                            java.lang.String[] strArr34 = {((java.lang.String) objArr190[0]).intern(), str17};
                                            java.lang.Object[] objArr191 = new java.lang.Object[1];
                                            a(1015 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (11680 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 27 - android.view.MotionEvent.axisFromString(str), objArr191);
                                            java.lang.String[] strArr35 = {((java.lang.String) objArr191[0]).intern(), str17};
                                            java.lang.Object[] objArr192 = new java.lang.Object[1];
                                            a(1043 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (41237 - android.text.TextUtils.indexOf(str, str)), 27 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr192);
                                            java.lang.String[] strArr36 = {((java.lang.String) objArr192[0]).intern(), str17};
                                            java.lang.Object[] objArr193 = new java.lang.Object[1];
                                            a(1070 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 31 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr193);
                                            java.lang.String[] strArr37 = {((java.lang.String) objArr193[0]).intern(), str17};
                                            java.lang.Object[] objArr194 = new java.lang.Object[1];
                                            a(1101 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (50117 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 28 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr194);
                                            java.lang.String[] strArr38 = {((java.lang.String) objArr194[0]).intern(), str17};
                                            java.lang.Object[] objArr195 = new java.lang.Object[1];
                                            a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1128, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 33, objArr195);
                                            java.lang.String[][] strArr39 = {strArr16, strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, new java.lang.String[]{((java.lang.String) objArr195[0]).intern(), str17}};
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            int i65 = i;
                                            int i66 = 0;
                                            int i67 = 0;
                                            while (i66 < 24) {
                                                java.lang.String[] strArr40 = strArr39[i66];
                                                java.lang.Object[] objArr196 = {strArr40[0]};
                                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj33 == null) {
                                                    strArr = strArr39;
                                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetBefore(str, 0), android.text.TextUtils.getTrimmedLength(str) + 1921, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                    int i68 = $$a[16] - 1;
                                                    byte b53 = (byte) i68;
                                                    arrayList = arrayList2;
                                                    i15 = i65;
                                                    java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                    b(b53, (byte) (b53 | 18), (short) i68, objArr197);
                                                    obj33 = cls33.getMethod((java.lang.String) objArr197[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj33);
                                                } else {
                                                    strArr = strArr39;
                                                    arrayList = arrayList2;
                                                    i15 = i65;
                                                }
                                                java.lang.String str18 = (java.lang.String) ((java.lang.reflect.Method) obj33).invoke(null, objArr196);
                                                java.lang.String[] strArr41 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr40, 1, strArr40.length);
                                                if (str18 == null || str18.length() == 0) {
                                                    i16 = i66;
                                                    str4 = str;
                                                    arrayList2 = arrayList;
                                                } else {
                                                    int i69 = writeReplace + 83;
                                                    values = i69 % 128;
                                                    if (i69 % 2 == 0 ? strArr40.length == 1 : strArr40.length == 0) {
                                                        str6 = str18;
                                                        i16 = i66;
                                                        str5 = str;
                                                    } else {
                                                        java.lang.Object[] objArr198 = {str18, strArr41};
                                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                        if (obj34 == null) {
                                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 2880, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                                            int i70 = $$a[16] - 1;
                                                            byte b54 = (byte) i70;
                                                            java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                            b(b54, (byte) (b54 | 18), (short) i70, objArr199);
                                                            obj34 = cls34.getMethod((java.lang.String) objArr199[0], java.lang.String.class, java.lang.String[].class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj34);
                                                        }
                                                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr198)).longValue();
                                                        long j41 = ~(123549032 | longValue13);
                                                        long j42 = ~longValue13;
                                                        str5 = str;
                                                        long j43 = ~(j42 | (-123549033));
                                                        i16 = i66;
                                                        str6 = str18;
                                                        long j44 = (((((longValue13 * 263) + 64616144259L) + (((j41 | j43) | (~(j42 | j))) * 262)) + ((-786) * j43)) + ((((~(j42 | j18)) | j41) | j43) * 262)) - 1905162746;
                                                        int i71 = (int) (j44 >> 32);
                                                        int i72 = ~((-746630281) | i54);
                                                        if (((i71 & ((((~(1842396296 | i)) | (-2111110605) | i72) * (-470)) + 1352687436 + ((i72 | (~((-268714309) | i))) * 470))) | (((((16777344 | r6) * (-476)) - 1142571847) + ((~((-539494674) | i)) * 952) + ((~((-539494674) | i54)) * 476)) & ((int) j44))) == 0) {
                                                            arrayList2 = arrayList;
                                                            str4 = str5;
                                                        }
                                                    }
                                                    i67++;
                                                    i65 = i ^ (i16 + 10);
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                    java.lang.String str19 = str6;
                                                    sb.append(str19);
                                                    str4 = str5;
                                                    java.lang.Object[] objArr200 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1161, (char) android.view.View.resolveSize(0, 0), android.view.KeyEvent.normalizeMetaState(0) + 1, objArr200);
                                                    sb.append(((java.lang.String) objArr200[0]).intern());
                                                    sb.append(str19);
                                                    arrayList2 = arrayList;
                                                    arrayList2.add(sb.toString());
                                                    str = str4;
                                                    i66 = i16 + 1;
                                                    strArr39 = strArr;
                                                }
                                                i65 = i15;
                                                str = str4;
                                                i66 = i16 + 1;
                                                strArr39 = strArr;
                                            }
                                            int i73 = i65;
                                            str3 = str;
                                            java.lang.Object[] objArr201 = new java.lang.Object[5];
                                            if (i67 > 2) {
                                                objArr201[0] = new int[]{i};
                                                objArr201[1] = new int[]{i73};
                                                objArr201[4] = new int[1];
                                                objArr201[2] = arrayList2;
                                                objArr201[3] = null;
                                                java.lang.Object[] objArr202 = {num2, num2, java.lang.Integer.valueOf(((((~((-1838551667) | i)) | (-1840733056)) * (-502)) - 1906775469) + ((~((-1628438625) | i54)) * (-502)) + (((~((-212294432) | i)) | (-1838551667)) * 502))};
                                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj35 == null) {
                                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.text.TextUtils.indexOf(str3, str3, 0, 0));
                                                    byte[] bArr17 = $$a;
                                                    byte b55 = (byte) (-bArr17[18]);
                                                    byte b56 = bArr17[16];
                                                    java.lang.Object[] objArr203 = new java.lang.Object[1];
                                                    b(b55, b56, (short) (b56 | 652), objArr203);
                                                    obj35 = cls35.getMethod((java.lang.String) objArr203[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                }
                                                ((int[]) objArr201[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr202)).intValue();
                                                i14 = 1;
                                                c = 0;
                                            } else {
                                                objArr201[0] = new int[]{i};
                                                objArr201[1] = new int[]{i};
                                                objArr201[4] = new int[1];
                                                objArr201[2] = null;
                                                objArr201[3] = null;
                                                java.lang.Object[] objArr204 = {num2, num2, java.lang.Integer.valueOf((((~((-1083261197) | i)) * 623) - 1576243380) + ((891300993 | i54) * (-623)) + (((~((-1121403151) | i)) | 1083261196 | (~(929442947 | i))) * 623))};
                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj36 == null) {
                                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.KeyEvent.keyCodeFromString(str3) + 2713, (char) android.text.TextUtils.getCapsMode(str3, 0, 0));
                                                    byte[] bArr18 = $$a;
                                                    byte b57 = (byte) (-bArr18[18]);
                                                    byte b58 = bArr18[16];
                                                    java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                    b(b57, b58, (short) (b58 | 652), objArr205);
                                                    obj36 = cls36.getMethod((java.lang.String) objArr205[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                                }
                                                c = 0;
                                                ((int[]) objArr201[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr204)).intValue();
                                                i14 = 1;
                                            }
                                            int i74 = ((int[]) objArr201[i14])[c];
                                            if (i74 != i) {
                                                int[] iArr = new int[i14];
                                                int[] iArr2 = new int[i14];
                                                java.util.List list = (java.util.List) objArr201[2];
                                                iArr[c] = i;
                                                iArr2[c] = i74;
                                                java.lang.Object[] objArr206 = {iArr, iArr2, list, null, new int[i14]};
                                                java.lang.Object[] objArr207 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((((~((-1237529526) | i54)) | (~((-813316573) | i))) | (~(813316572 | i54))) * 959) - 2109360156) + (((~(i | 813316572)) | (~(i54 | (-813316573))) | (~((-1237529526) | i))) * 959))};
                                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj37 == null) {
                                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.widget.ExpandableListView.getPackedPositionChild(0L), 2713 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                                    byte[] bArr19 = $$a;
                                                    byte b59 = (byte) (-bArr19[18]);
                                                    byte b60 = bArr19[16];
                                                    java.lang.Object[] objArr208 = new java.lang.Object[1];
                                                    b(b59, b60, (short) (b60 | 652), objArr208);
                                                    obj37 = cls37.getMethod((java.lang.String) objArr208[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                }
                                                ((int[]) objArr206[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr207)).intValue();
                                                return objArr206;
                                            }
                                            java.lang.Object[] objArr792 = new java.lang.Object[1];
                                            a(445 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.green(0), 16 - android.text.TextUtils.indexOf(str3, str3), objArr792);
                                            java.lang.Object[] objArr802 = {((java.lang.String) objArr792[0]).intern()};
                                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj == null) {
                                            }
                                            invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr802);
                                            if (invoke != null) {
                                            }
                                            if (i17 != 1986687685) {
                                                java.lang.Object[] objArr842 = new java.lang.Object[1];
                                                a(android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1162, (char) (63240 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 14 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr842);
                                                java.lang.String intern172 = ((java.lang.String) objArr842[0]).intern();
                                                java.lang.Object[] objArr852 = new java.lang.Object[1];
                                                a(android.view.KeyEvent.getDeadChar(0, 0) + 1175, (char) (android.graphics.Color.rgb(0, 0, 0) + 16814885), android.text.TextUtils.indexOf(str7, str7, 0, 0) + 26, objArr852);
                                                java.lang.String intern182 = ((java.lang.String) objArr852[0]).intern();
                                                java.lang.Object[] objArr862 = new java.lang.Object[1];
                                                a(android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1202, (char) (android.text.TextUtils.getTrimmedLength(str7) + 47141), 17 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr862);
                                                java.lang.String intern192 = ((java.lang.String) objArr862[0]).intern();
                                                java.lang.Object[] objArr872 = new java.lang.Object[1];
                                                a(1218 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 16 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr872);
                                                java.lang.String intern202 = ((java.lang.String) objArr872[0]).intern();
                                                java.lang.Object[] objArr882 = new java.lang.Object[1];
                                                a(android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1236, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 15593), android.view.View.resolveSize(0, 0) + 15, objArr882);
                                                java.lang.String intern212 = ((java.lang.String) objArr882[0]).intern();
                                                java.lang.Object[] objArr892 = new java.lang.Object[1];
                                                a((android.os.Process.myPid() >> 22) + 1250, (char) android.view.View.resolveSizeAndState(0, 0, 0), android.view.KeyEvent.normalizeMetaState(0) + 37, objArr892);
                                                java.lang.String intern222 = ((java.lang.String) objArr892[0]).intern();
                                                java.lang.Object[] objArr902 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1287, (char) (47154 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), android.graphics.ImageFormat.getBitsPerPixel(0) + 13, objArr902);
                                                java.lang.String intern232 = ((java.lang.String) objArr902[0]).intern();
                                                java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1299, (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.view.View.MeasureSpec.getSize(0) + 13, objArr912);
                                                java.lang.String intern242 = ((java.lang.String) objArr912[0]).intern();
                                                java.lang.Object[] objArr922 = new java.lang.Object[1];
                                                a(1311 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.KeyEvent.getDeadChar(0, 0), android.view.View.MeasureSpec.getMode(0) + 22, objArr922);
                                                java.lang.String intern252 = ((java.lang.String) objArr922[0]).intern();
                                                java.lang.Object[] objArr932 = new java.lang.Object[1];
                                                a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1333, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, objArr932);
                                                java.lang.String intern262 = ((java.lang.String) objArr932[0]).intern();
                                                java.lang.Object[] objArr942 = new java.lang.Object[1];
                                                a(1365 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.text.TextUtils.indexOf(str7, str7), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 12, objArr942);
                                                java.lang.String intern272 = ((java.lang.String) objArr942[0]).intern();
                                                java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                a(android.text.TextUtils.indexOf(str7, str7, 0) + 1377, (char) android.text.TextUtils.getTrimmedLength(str7), 11 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr952);
                                                java.lang.String intern282 = ((java.lang.String) objArr952[0]).intern();
                                                java.lang.Object[] objArr962 = new java.lang.Object[1];
                                                a(1388 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.indexOf(str7, str7, 0, 0), 12 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr962);
                                                java.lang.String intern292 = ((java.lang.String) objArr962[0]).intern();
                                                java.lang.Object[] objArr972 = new java.lang.Object[1];
                                                a(1401 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (63825 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, objArr972);
                                                java.lang.String intern302 = ((java.lang.String) objArr972[0]).intern();
                                                java.lang.Object[] objArr982 = new java.lang.Object[1];
                                                a((android.os.Process.myTid() >> 22) + 1413, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 48471), android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, objArr982);
                                                java.lang.String intern312 = ((java.lang.String) objArr982[0]).intern();
                                                java.lang.Object[] objArr992 = new java.lang.Object[1];
                                                a(1426 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (2241 - android.os.Process.getGidForName(str7)), android.text.TextUtils.indexOf(str7, str7, 0, 0) + 14, objArr992);
                                                java.lang.String intern322 = ((java.lang.String) objArr992[0]).intern();
                                                java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                                a(1439 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 12, objArr1002);
                                                java.lang.String intern332 = ((java.lang.String) objArr1002[0]).intern();
                                                java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                                a(1450 - android.view.MotionEvent.axisFromString(str7), (char) android.view.View.MeasureSpec.getMode(0), 25 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr1012);
                                                java.lang.String intern342 = ((java.lang.String) objArr1012[0]).intern();
                                                java.lang.Object[] objArr1022 = new java.lang.Object[1];
                                                a(1475 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (5163 - android.view.KeyEvent.keyCodeFromString(str7)), 28 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr1022);
                                                java.lang.String[] strArr82 = {intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, intern292, intern302, intern312, intern322, intern332, intern342, ((java.lang.String) objArr1022[0]).intern()};
                                                i22 = 0;
                                                while (true) {
                                                    if (i22 < 19) {
                                                    }
                                                    i22++;
                                                }
                                                if (i22 >= 0) {
                                                    java.lang.Object[] objArr1082 = {new int[]{i}, new int[]{i23}, null, null, new int[1]};
                                                    java.lang.Object[] objArr1092 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((((~((-972219653) | i54)) | 4358148) | r1) * (-502)) - 56330903) + (((~(i | 2046487949)) | (~(i54 | (-967861505)))) * 502))};
                                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj2 == null) {
                                                    }
                                                    ((int[]) objArr1082[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr1092)).intValue();
                                                    return objArr1082;
                                                }
                                            }
                                            java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                            a((-16775713) - android.graphics.Color.rgb(0, 0, 0), (char) (android.graphics.Color.blue(0) + 1267), 14 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr1112);
                                            java.lang.String intern352 = ((java.lang.String) objArr1112[0]).intern();
                                            java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                            a((android.os.Process.myPid() >> 22) + 1516, (char) (31487 - android.text.TextUtils.getTrimmedLength(str7)), android.text.TextUtils.getOffsetAfter(str7, 0) + 5, objArr1122);
                                            java.lang.String[] strArr92 = {intern352, ((java.lang.String) objArr1122[0]).intern()};
                                            java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                            a(android.view.Gravity.getAbsoluteGravity(0, 0) + 1521, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, objArr1132);
                                            java.lang.String intern362 = ((java.lang.String) objArr1132[0]).intern();
                                            java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                            a(1536 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (30517 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), 19 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr1142);
                                            java.lang.String intern372 = ((java.lang.String) objArr1142[0]).intern();
                                            java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                            a(1555 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.graphics.Color.blue(0), 14 - android.view.View.getDefaultSize(0, 0), objArr1152);
                                            java.lang.String[] strArr102 = {intern362, intern372, ((java.lang.String) objArr1152[0]).intern()};
                                            java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1569, (char) (51294 - android.view.MotionEvent.axisFromString(str7)), 21 - android.text.TextUtils.getOffsetBefore(str7, 0), objArr1162);
                                            java.lang.String intern382 = ((java.lang.String) objArr1162[0]).intern();
                                            java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                            a(1591 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (12387 - android.graphics.Color.argb(0, 0, 0, 0)), android.view.View.resolveSize(0, 0) + 10, objArr1172);
                                            java.lang.String[] strArr112 = {intern382, ((java.lang.String) objArr1172[0]).intern()};
                                            java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                            a(1599 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (16173 - android.view.View.resolveSizeAndState(0, 0, 0)), 11 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr1182);
                                            java.lang.String intern392 = ((java.lang.String) objArr1182[0]).intern();
                                            java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                            a(337 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (43684 - android.view.View.resolveSizeAndState(0, 0, 0)), 5 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr1192);
                                            java.lang.String[] strArr122 = {intern392, ((java.lang.String) objArr1192[0]).intern()};
                                            java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                            a(1612 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 28 - android.graphics.Color.blue(0), objArr1202);
                                            java.lang.String intern402 = ((java.lang.String) objArr1202[0]).intern();
                                            java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                            a(android.text.TextUtils.getOffsetBefore(str7, 0) + 1590, (char) (12388 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 10 - android.view.View.MeasureSpec.getMode(0), objArr1212);
                                            c2 = 0;
                                            java.lang.String[][] strArr132 = {strArr92, strArr102, strArr112, strArr122, new java.lang.String[]{intern402, ((java.lang.String) objArr1212[0]).intern()}};
                                            int i612 = -1;
                                            i18 = 0;
                                            loop4: while (true) {
                                                if (i18 < 5) {
                                                }
                                                i18++;
                                                c2 = 0;
                                            }
                                            if (i19 == i) {
                                            }
                                        }
                                    }
                                    java.lang.Object[] objArr209 = new java.lang.Object[1];
                                    a(343 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (53460 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 13, objArr209);
                                    java.lang.String intern72 = ((java.lang.String) objArr209[0]).intern();
                                    java.lang.Object[] objArr210 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 356, (char) (android.os.Process.getGidForName(str) + 1), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 10, objArr210);
                                    java.lang.Object[] objArr211 = {intern72, ((java.lang.String) objArr210[0]).intern()};
                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                    if (obj38 == null) {
                                        java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 39, 2212 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                        int i75 = $$a[16] - 1;
                                        byte b61 = (byte) i75;
                                        java.lang.Object[] objArr212 = new java.lang.Object[1];
                                        b(b61, (byte) (b61 | 18), (short) i75, objArr212);
                                        obj38 = cls38.getMethod((java.lang.String) objArr212[0], java.lang.String.class, java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj38);
                                    }
                                    long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj38).invoke(null, objArr211)).longValue();
                                    long j45 = ~j;
                                    long j46 = ((((((-159) * longValue14) + 3520951014L) + ((22144345 | longValue14) * 160)) + (((~(longValue14 | (-22144346))) | (~((-22144346) | j45))) * (-160))) + (((~((~longValue14) | j45)) | (-22144346)) * 160)) - 713230256;
                                    i13 = ((((int) (j46 >> 32)) & (((((554959360 | i) * 988) + (-1213627386)) + (((~(i8 | 962501571)) | 67182628) * (-1976))) + ((((~((-474724840) | i)) | 554959360) | (~(i8 | 474724839))) * 988))) | (((int) j46) & ((((((~(1757750938 | i)) | (-320524529)) * (-948)) + (-252380263)) + ((~(i8 | (-320524385))) * (-948))) - 1184983608))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE : i;
                                    if (i13 == i) {
                                    }
                                }
                            }
                        }
                        i11 = i;
                        if (i11 == i) {
                        }
                    }
                }
                i10 = i;
                if (i10 == i) {
                }
            }
        }
        i7 = i;
        if (i7 == i) {
        }
    }

    static void init$0() {
        $$a = new byte[]{58, -44, -87, com.visa.cbp.getEncExpo.IResultReceiver2, com.google.common.base.Ascii.SI, -10, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE;
    }
}
