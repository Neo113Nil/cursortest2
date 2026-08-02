package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class SdkCoreDigitizedCardProfileImpl {
    public abstract <T> T DigitizedCardProfile(java.lang.Class<T> cls) throws java.lang.Exception;

    public static com.payair.hce.SdkCoreDigitizedCardProfileImpl AlternateContactlessPaymentDataJson() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("sun.misc.Unsafe");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final java.lang.Object obj = declaredField.get(null);
            final java.lang.reflect.Method method = cls.getMethod("allocateInstance", java.lang.Class.class);
            return new com.payair.hce.SdkCoreDigitizedCardProfileImpl() { // from class: com.payair.hce.SdkCoreDigitizedCardProfileImpl.2
                @Override // com.payair.hce.SdkCoreDigitizedCardProfileImpl
                public final <T> T DigitizedCardProfile(java.lang.Class<T> cls2) throws java.lang.Exception {
                    AlternateContactlessPaymentDataJson(cls2);
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (java.lang.Exception unused) {
            try {
                try {
                    java.lang.reflect.Method declaredMethod = java.io.ObjectStreamClass.class.getDeclaredMethod("getConstructorId", java.lang.Class.class);
                    declaredMethod.setAccessible(true);
                    final int intValue = ((java.lang.Integer) declaredMethod.invoke(null, java.lang.Object.class)).intValue();
                    final java.lang.reflect.Method declaredMethod2 = java.io.ObjectStreamClass.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new com.payair.hce.SdkCoreDigitizedCardProfileImpl() { // from class: com.payair.hce.SdkCoreDigitizedCardProfileImpl.5
                        private static final byte[] $$a = null;
                        private static final int $$b = 0;
                        private static final byte[] $$d = null;
                        private static final int $$e = 0;
                        private static int $10;
                        private static int $11;
                        private static long DigitizedCardProfile;
                        private static int IccPrivateKeyCrtComponentsJson;
                        private static int valueOf;
                        private static char[] writeReplace;

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
                            int i4;
                            int i5;
                            int i6 = (i * 2) + 4;
                            byte[] bArr = $$a;
                            int i7 = i2 * 2;
                            char[] cArr = new char[i7 + 1];
                            int i8 = 718 - i3;
                            if (bArr == null) {
                                int i9 = i8;
                                int i10 = 0;
                                i5 = i6;
                                i6 = (i6 + i9) - 2;
                                i5++;
                                i4 = i10;
                                cArr[i4] = (char) i6;
                                i10 = i4 + 1;
                                if (i4 == i7) {
                                    objArr[0] = new java.lang.String(cArr);
                                    return;
                                }
                                i9 = bArr[i5];
                                i6 = (i6 + i9) - 2;
                                i5++;
                                i4 = i10;
                                cArr[i4] = (char) i6;
                                i10 = i4 + 1;
                                if (i4 == i7) {
                                }
                            } else {
                                i4 = 0;
                                i5 = i6;
                                i6 = i8;
                                cArr[i4] = (char) i6;
                                i10 = i4 + 1;
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
                        private static void c(byte b, int i, byte b2, java.lang.Object[] objArr) {
                            int i2;
                            int i3 = (i * 3) + 99;
                            byte[] bArr = $$d;
                            int i4 = b * 4;
                            int i5 = b2 + 4;
                            byte[] bArr2 = new byte[i4 + 1];
                            if (bArr == null) {
                                int i6 = i4;
                                int i7 = 0;
                                i3 += -i6;
                                i2 = i7;
                                bArr2[i2] = (byte) i3;
                                i5++;
                                i7 = i2 + 1;
                                if (i2 == i4) {
                                    objArr[0] = new java.lang.String(bArr2, 0);
                                    return;
                                }
                                i6 = bArr[i5];
                                i3 += -i6;
                                i2 = i7;
                                bArr2[i2] = (byte) i3;
                                i5++;
                                i7 = i2 + 1;
                                if (i2 == i4) {
                                }
                            } else {
                                i2 = 0;
                                bArr2[i2] = (byte) i3;
                                i5++;
                                i7 = i2 + 1;
                                if (i2 == i4) {
                                }
                            }
                        }

                        @Override // com.payair.hce.SdkCoreDigitizedCardProfileImpl
                        public final <T> T DigitizedCardProfile(java.lang.Class<T> cls2) throws java.lang.Exception {
                            T t;
                            int i = IccPrivateKeyCrtComponentsJson + 115;
                            valueOf = i % 128;
                            if (i % 2 != 0) {
                                AlternateContactlessPaymentDataJson(cls2);
                                java.lang.reflect.Method method2 = declaredMethod2;
                                java.lang.Object[] objArr = new java.lang.Object[2];
                                objArr[0] = cls2;
                                objArr[0] = java.lang.Integer.valueOf(intValue);
                                t = (T) method2.invoke(null, objArr);
                            } else {
                                AlternateContactlessPaymentDataJson(cls2);
                                t = (T) declaredMethod2.invoke(null, cls2, java.lang.Integer.valueOf(intValue));
                            }
                            IccPrivateKeyCrtComponentsJson = (valueOf + 85) % 128;
                            return t;
                        }

                        private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
                            com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
                            long[] jArr = new long[i2];
                            getcvmmodel.valueOf = 0;
                            while (getcvmmodel.valueOf < i2) {
                                int i3 = getcvmmodel.valueOf;
                                try {
                                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(writeReplace[i + getcvmmodel.valueOf])};
                                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                                    if (obj2 == null) {
                                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 48, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 380, (char) (62389 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        c((byte) 0, 0, (byte) -1, objArr3);
                                        obj2 = cls2.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj2);
                                    }
                                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 3966, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj3);
                                    }
                                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).longValue();
                                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                                    if (obj4 == null) {
                                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 34, 212 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.graphics.Color.blue(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                                    }
                                    ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
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
                                int i4 = $10 + 77;
                                $11 = i4 % 128;
                                if (i4 % 2 == 0) {
                                    cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                                    java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                                    if (obj5 == null) {
                                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 34, android.graphics.Color.argb(0, 0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
                                    }
                                    ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
                                    throw null;
                                }
                                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                                java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                                if (obj6 == null) {
                                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 211 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.os.Process.myPid() >> 22))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                                }
                                ((java.lang.reflect.Method) obj6).invoke(null, objArr7);
                                $11 = ($10 + 117) % 128;
                            }
                            objArr[0] = new java.lang.String(cArr);
                        }

                        static {
                            init$1();
                            $10 = 0;
                            $11 = 1;
                            init$0();
                            valueOf = 0;
                            IccPrivateKeyCrtComponentsJson = 1;
                            char[] cArr = new char[1707];
                            java.nio.ByteBuffer.wrap("^\u0080\u0007©ì\u000eRÿ;\bà\"F\u008c/m\u0095Ûz»#\u0012\u0089ên_×\n½\u0092buÈë±_\u0016.ü\u009a¥t\u000búð°Y\u0011?þä^M>^\u0080\u0007©ì\u000eRÿ;\bà\"F\u008c/m\u0095Ûz»#\u0012\u0089ên_×\n½\u0083bxÈÿ±H\u0016\u0014ü\u008d¥w\u000b×ð Y\u0015?û^\u0080\u0007©ì\u000eRÿ;\bà\"F\u008c/m\u0095Ûz»#\u0012\u0089ên_×\n½\u0080bhÈá±N^\u0080\u0007¾ì\u0012Rú;\bà(F\u008c/e\u0095Êz±#\u001e\u0089¶nP×:½\u009fbuÈé±D\u00168ü\u0081¥X\u000bÇð¢Y\u0015?ëäXM)3\u0080^\u0080\u0007¨ì\u001fRê;\bà!F\u0084//\u0095Ïz¯#\u0014\u0089é`\u008a9¢Ò\u0015là\u0005\u0002Þ<x\u0080\u0011f«\u009bD§\u001d\u0003·üPM|\u0007%9Î\u0088pm\u0019ÁÂ°d\u0000\r©·jX\u001c\u0001±«qLÆõ·\u009f0@÷ê|\u0093ËÒ=\u008b\u0003`¯ÞG·îl\u009dÊ3£\u0093\u0019nö\t¯¤\u0005\u000bâæ[\u00811,îÂDP=¾\u009a\u0085p;^Í\u0007¤ì\fRç;Hà=íS´m_Áá)\u0088\u0080Sóõ]\u009cý&\u000eÉg\u0090Æ:eÝ\u008adã\u000eMÑ·{\n\u0002³¥µOT\u0016±¸\u001bCeê\u009f\u008c/W\u0081þæ\u0080^+¶Í\t\u0094l^\u0080\u0007¾ì\u0012Rú;Sà F\u008e/.\u0095Ýz´#\u0015\u0089¶nY×0½\u009ebdÈÙ±`\u0016fü\u0099¥u\u000bÊð³^\u0080\u0007¾ì\u0012Rú;Sà F\u008e/.\u0095Óz´#\u0019\u0089¶n[×<½\u0091b\u007fÈê±@\u0016>ü¿¥J\u000bÕð±Y\u000e?ïä\u0013M(3\u0096^\u0080\u0007©ì\u000eRÿ;\bà+F\u0086/l\u0095Êzº#\u000e\u0089ünD×!^Ý\u0007¢ìERë;Rà,F\u008f/e\u0095\u0091zµ#\u0014\u0089ênC^Á\u0007¨ì\nRú;BàkF\u008d/d\u0095Ë^\u0080\u0007½ì\u0019Ræ;DàjF\u0085/h\u0095Óz¸#\b\u0089ànD×!½\u0096b|Èü^Á\u0007¨ì\u0006Rü;Tà#^Ý\u0007¢ìERù;Uà*F\u0087/t\u0095Üz©#U\u0089ônV×;½\u0086bwÈî±N\u0016?ü\u009c¥u\u000bÀð±^È\u0007¨ì\u0005Rð0\u000bi}\u0082Ö<#U\u0086\u008eñùÈ ·^\u0080\u0007½ì\u0019Ræ;DàjF\u008e/n\u0095Ûz¨#\u0017\u0089ünD^Ù\u0007¯ì\u0004Rñ;@à0F\u0086/r\u0095Ë^è\u0007¨ì\u0005Rð;Jà*F\u0097/h\u0095Ðz³^Ú\u0007£ì\u0000Rç;Hà2F\u008d^Ì\u0007¥ì\u0019Ræ;Jà,F\u0096/lh$1[Ú¼d\u0000\r¬ÖÓp~\u0019\u008d£%LP\u0015¬¿\u0004X«áÚ\u008bcT\u008bþ\u0013ý\u0010¤fOÍñ8\u0098ÖCºåZ^È\u0007¨ì\u0005Rì;Uà,F\u0080^È\u0007¨ì\u0005Rì;Uà,F\u0080/^\u0095Çzå#M^È\u0007¨ì\u0005Rì;Uà,F\u0080/^\u0095Çzå#M\u0089Æn\u0001×a^Ý\u0007¢ìERù;Uà*F\u0087/t\u0095Üz©#U\u0089ônX×1½\u0096b}^Ü\u0007©ì\u0000}\u0001$kÏÕq.\u0018\u008dÃúeG\f¸6|o/\u0084\u0089:;Sç\u0088¢.\u001fGçýD\u0012\"K\u008cá+\u0006Ã¿¨Õ\u0013\n£ ^Ù×~«\u0094\u0014ÍøcR'\u009a~×\u0095{+\u008fB<\u0099X?óVUì\u0098\u0003íZDðÍ\u0017!®TÄî\u001b\t±\u008fÈyoY\u0085òÜ\u0001rñ\u0089Ï -FÝ^î\u0007£ì\u000fRû;Hà,F\u0087/!\u0095ìz\u0099#0\u0089¹nU× ½\u009ab}Èû±\r\u0016-ü\u0086¥u\u000b\u0085ð»YY?©äbMm3Í&\u0014\u007fk\u0094\u008c*(C\u008f\u0098þ>NW¿í\u0017\u0002f[×^È\u0007¢ì\u0007Rí;Aà,F\u0090/i^Ù\u0007¯ì\u0004Rñ;\u001fàs^Ý\u0007¬ì\u0005Rê;Oà0R¿\u000bÀà'^\u009b77ìHJå#\u0016\u0099¾vË/7\u0085\u0099b'ÛV±ÿn\u0017Ë¾\u0092Áy&Ç\u0081®!uTÓîº\u0007\u0000°ï\u0090¶i\u001c\u009fû9BC^\u009erË+´ÀS~ì\u0017TÌ0j\u0080\u0003e¹Ìàq\u00ad\u001bôd\u001f\u0083¡-È\u0094\u0013êµIÜ£fW\u0089kÐÏz0\u009d\u0095$æNV\u0091£&í\u007f\u009c\u0094#*ÁC\\\u0098\u0019>ÿW\u0013¹6àI\u000b®µ\u0000Ü¹\u0007Ç¡dÈ\u008erz\u009dPÄùn\u001c\u0089»0ÛZj\u0085\u008a/\u0016V¯ñÎ\u001bv^È\u0007¨ì\u0005Rì;Uà,F\u0080/.\u0095Ìz¹#\u0010\u0089¶nP×0½\u009dbtÈý±D\u0016(^È\u0007¨ì\u0005Rì;Uà,F\u0080/^\u0095Çzå#M\u0089¶nD×1½\u0098bNÈ÷±\u0015\u0016}üÆ¥`\u000bÀð\u00adY\u0004?íäTM83¦\u0098o~\u008d'å2Çk§\u0080\n>ãWZ\u008c#*\u008fC!ù×\u0016½O\u001båñ\u0002T»?Ñ£\u000em¤äÝIzk\u0090\u0081ÉmgÄ\u009c©5\u001cSù\u0088Q^È\u0007¨ì\u0005Rì;Uà,F\u0080/.\u0095Éz¿#\u0014\u0089án\u000f×c½\u0083b>Èù±O\u0016$ü\u0091¥?\u000b\u0093ð³^È\u0007¢ì\u0004Rî;Kà FÌ/r\u0095Ûz¶#$\u0089þnG×=½\u009cb\u007fÈê±r\u00163üÑ¥1\u000b\u008að¤Y\u0004?ñäXM)3\u0090\u0098t~ê'«\u008cIrÙ¨Fñ9\u001aÞ¤pÍÓ\u0016±°\fÙöcK\u008c'Õ\u0084\u007fg\u0098ÞE\"\u001c]÷ºI\u0014 ·ûÕ]h4\u0097\u008e-aC8ã\u0092\u0003uæÌÈ¦yy\u0087Ó\u001cª¶\r\u009açp¾\u0091\u00104ë[Bû$\u0012ÿ²VÖ(o\u0083\u0086e>Ig\u0010*û\u0086Er,Á÷¥Q\u000e8¥\u0082Nml4Ä^Ý\u0007¢ìERë;Rà,F\u008f/e\u0095\u0091z¹#\u0012\u0089ênG×9½\u0092bhÈ¡±D\u0016/5Ðl£\u0087\u00139öP\u0001^Æ\u0007£ì\u0002Rý;\tà6F\u0095/b\u0095\u0091z¬#\u001e\u0089ônB×x½\u0083bcÈà±]\u00168^Þ\u0007¨ì\u0006Rü;\tà-F\u0094//\u0095Òz¼#\u0012\u0089÷n\\×0½\u008abb^Þ\u0007¨ì\u0006Rü;\tà6F\u0085//\u0095Ùz¼#\u0010\u0089ünh×6½\u0092b|Èê±_\u0016*^Þ\u0007¨ì\u0006Rü;\tà6F\u0085//\u0095Óz¾#\u001f\u0089ÆnS×0½\u009dbbÈæ±Y\u00162ÇP\u009e/uÈËo¢Ïyºß\u0000¶é\f^ã~º\u0097\u0010z÷ÞNª$\u0011ûõQf(\u008e\u008f·e\u0001<ç\u0092]i*Hh\u0011\u0017úðD^-ýö\u009fP\"9\u009a\u0083{l\r5£\u009fYx¬Á\u0081«0tÀÞe§ö\u0000\u009fê1³×êy³\u0006XáæB\u008fçT\u008còi\u009bÇ!nÎ\u0010\u0097³=YÚ½c\u0097\t>ÖÛ|L\u0005ì¢\u009dH=\u0011Ñ¿hD\tí±ê\u007f³\u0000Xçæ[\u008f÷T\u0088ò%\u009bÖ!~Î\u000b\u0097÷=YÚàc\u009e\t=Ö×|\u0003\u0005é¢\u0080H%\u0011Â¿bD\u0013í³\u008bOPöù\u0097\u0087/^Ý\u0007¢ìERú;^à6F\u0097/d\u0095Òzó#\u0019\u0089ìn^×9½\u0097b?Èé±D\u0016%ü\u008e¥b\u000b×ð³Y\u0013?öäSM/*,sS\u0098´&\u000bO¯\u0094Ç2f[\u0095á#\u000esWïý\u0010\u001a²£\u008aÉ`\u0016\u0095¼\u0017Å°bÞ\u00886Ñ\u0090\u007f=\u0084\\-÷K\u000b\u0090¾9ÚGzì\u008f\n*SV^Ý\u0007¢ìERÿ;Bà+F\u0087/n\u0095Ízó#\u0019\u0089ìn^×9½\u0097b?Èé±D\u0016%ü\u008e¥b\u000b×ð³Y\u0013?öäSM/^Ý\u0007¢ìERÿ;Bà+F\u0087/n\u0095Íz\u0082#\u001f\u0089õn\\×8½ÝbsÈú±D\u0016'ü\u008d¥)\u000bÃðªY\u000f?øäXM)3\u0089\u0098e~Ü'½\u008c\u0005ì\u0084\u0081óØÚ3}\u008d\u008cä{?G\u0099õð\u001fJ¹¥ñüxV\u0083±4\bC^\u0080\u0007©ì\u000eRÿ;\bà6F\u008c/b\u0095Ôz¸#\u000f\u0089¶nU×4½\u0080btÈí±L\u0016%ü\u008d¥X\u000bÂð¦Y\u000f?æäY^\u0080\u0007©ì\u000eRÿ;\bà6F\u008c/b\u0095Ôz¸#\u000f\u0089¶nP×0½\u009dbhÈë\u0090\u0096É¿\"\u0018\u009céõ\u001e. \u0088\u009aát[Â´®í\u0019G  P\u0019&s\u0088¬r\u0006ýO»\u0016\u0085ý)CÁ*3ñ\u000fW½>W\u0084ñk¹24\u0098Ð\u007fmÆ\r¬\u00ad~\u000f'1Ì\u009dru\u001bÜÀ¯f\u0001\u000f¡µ\\Z;\u0003\u0096©9NÔ÷³\u009d\u001eBýè_\u0091Ï6¥Ü\n\u0085ä+EÐ/y±\u001ftÄ×m¶\u0013\u0003¸ÿ^e\u0007-¬\u009bR\rû÷¡\nF5ï\u0087^\u0080\u0007©ì\u000eRÿ;\bà'F\u0090/u\u0095àzº#\u000b\u0089ê\n¬S\u0085¸\"\u0006Óo$´\u000b\u0012¼{YÁÌ.\u0085w>ÝØ:~^\u0080\u0007©ì\u000eRÿ;\bà6F\u008c/b\u0095Ôz¸#\u000f\u0089¶nU×&½\u0087bwÈà±A\u0016/ü\u008c¥u\u000bÁ^\u0080\u0007¾ì\u0012Rú;Sà F\u008e/.\u0095Óz´#\u0019\u0089¶n[×<½\u0091bsÈü±Y\u0016-ü\u0086¥k\u000bÁð¦Y\u0013?ÀäWM53\u0090\u00989~Æ'¼eV<\u007f×Øi)\u0000ÞÛñ}F\u0014£®\bAh\u0018Î²*^\u0080\u0007©ì\u000eRÿ;\bà'F\u0090/u\u0095Øz¤#\t\u0089öë*²\u0003Y¤çU\u008e¢U\u008dó:\u009aß xÏ\u0012\u0096¶<]^\u0080\u0007©ì\u000eRÿ;\bà'F\u0090/u\u0095Ðz¯#\u0012\u0089ü\u0016ÏOæ¤A\u001a°sG¨h\u000eßg:Ý\u00862ÿkGÁ±^\u0080\u0007©ì\u000eRÿ;\bà'F\u0090/u\u0095Ïzº#\u001a\u0089ðnG×6\u0094\u009cÍµ&\u0012\u0098ãñ\u0014*;\u008c\u008cåi_ü°¨é\nCàâI»`PÃî4\u0087\u008f\\£úN\u0093§)\u0001Æz\u009fÞ5?Ò\u009fkø\u0001IÞ÷th\r\u009cªà@\u000f\u0019¬·\u001fL~åÃ^\u0080\u0007 ì\u0005Rý;\bà2F\u008a/o\u0095Ûz²#\f\u0089ên\u0018×\u0017½\u0080beÈÜ±E\u0016*ü\u009b¥b\u000bÁð\u0085Y\u000e?óäYM>3\u008b\u0004R]o¶Ë\b4a\u0096º¸\u001cXu¼Ï\u001d `yÛÓ?4\u00969Û`ï\u008bI5í\\Y\\A\u0005|îØP'9\u0085â«DQ-¥\u0097\u0012xz!\u0095\u008b5l\u0097Õä¿A^È\u0007¿ì\nRå;Kà*F\u0080//\u0095Øz²#\u0017\u0089ýnQ×<½\u0080byÈ¡±^\u0016$^Ã\u0007¤ì\tRÎ;kà\u0000F°/^\u0095Ýz®#\u000f\u0089·nD×: úyÒ\u0092e,\u0090Er\u009eR8üQ\u001fë¬\u0004Æ]^÷\u0080\u0010\"©KÃì\u001c\b¶\u0086ÏyhI\u0082þÛ\u0011^Í\u0007¡ì\u001eRì;Tà1F\u0082/b\u0095Ôz®^\u0080\u0007¨ì\u001fRê;\bà(F\u008c/t\u0095Ñz©#\b^\u0080\u0007©ì\nRý;FàjF\u0087/n\u0095Èz³#\u0017\u0089önV×1½\u0080b>È¡±I\u0016;üÆ¥f\u000bÕð³Y\u0012?±äEM63\u0095^\u0080\u0007½ì\u0019Ræ;DàjF\u0080/q\u0095Êz´#\u0015\u0089ÿnX^è\u0007¢ì\u0007Rí;Aà,F\u0090/i^\u0080\u0007©ì\nRý;FàjF\u008e/h\u0095Ìz¾#T\u0089énE×:½\u0095bxÈã±H\u00168üÆ¥d\u000bÐð±YN?¯ä\u0012M83\u0096\u0098z~\u009b'¾\u008c\u0018r\u008cÛ\u007f\u0081Äf¿Ï\u000eµ÷\u001aWÃo©\u0092\u000exôÖ]¬\u0002\u001eèøQV".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
                            writeReplace = cArr;
                            DigitizedCardProfile = 2537907594786441165L;
                        }

                        static void init$1() {
                            $$d = new byte[]{75, -78, -116, -102};
                            $$e = 102;
                        }

                        static void init$0() {
                            $$a = new byte[]{38, -91, 120, 99, com.google.common.base.Ascii.SI, -10, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
                            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:108:0x0e0b  */
                        /* JADX WARN: Removed duplicated region for block: B:115:0x0ed5  */
                        /* JADX WARN: Removed duplicated region for block: B:162:0x1512  */
                        /* JADX WARN: Removed duplicated region for block: B:169:0x15e5 A[Catch: all -> 0x022c, TRY_ENTER, TryCatch #9 {all -> 0x022c, blocks: (B:6:0x011d, B:8:0x0130, B:9:0x017b, B:18:0x0261, B:20:0x0290, B:21:0x02d9, B:29:0x03d3, B:31:0x03e6, B:32:0x043c, B:40:0x0536, B:42:0x0580, B:43:0x05d3, B:46:0x05e9, B:48:0x05f8, B:49:0x063f, B:55:0x0774, B:57:0x07c7, B:58:0x0822, B:62:0x08c7, B:64:0x08da, B:65:0x0931, B:71:0x0a0a, B:73:0x0a4b, B:74:0x0a9f, B:81:0x0b67, B:83:0x0b7a, B:84:0x0bc4, B:92:0x0c89, B:94:0x0cd3, B:95:0x0d2d, B:99:0x0d68, B:101:0x0d7b, B:102:0x0dc8, B:109:0x0e23, B:111:0x0e6d, B:112:0x0ebf, B:116:0x0f7a, B:118:0x0f8d, B:119:0x0fe0, B:125:0x10aa, B:127:0x10eb, B:128:0x1142, B:132:0x1180, B:134:0x1193, B:135:0x11e0, B:141:0x123a, B:143:0x1277, B:144:0x12c9, B:163:0x152f, B:165:0x157b, B:166:0x15cf, B:169:0x15e5, B:171:0x15f4, B:172:0x1640, B:176:0x170e, B:178:0x174c, B:179:0x17a7, B:183:0x17c0, B:185:0x17d8, B:186:0x1823, B:192:0x18df, B:194:0x1922, B:195:0x1978, B:199:0x19b9, B:201:0x19cc, B:202:0x1a1a, B:204:0x1a23, B:206:0x1a41, B:207:0x1a91, B:212:0x2bd0, B:214:0x2be3, B:215:0x2c34, B:226:0x3185, B:228:0x3198, B:229:0x31e9, B:234:0x32b9, B:236:0x32cc, B:237:0x3319, B:249:0x33f6, B:251:0x343b, B:252:0x3491, B:291:0x38e7, B:293:0x3920, B:294:0x397b, B:319:0x3b44, B:321:0x3b8e, B:322:0x3be2, B:326:0x3c1c, B:328:0x3c2f, B:329:0x3c7c, B:333:0x3d37, B:335:0x3d80, B:336:0x3dd5, B:340:0x3df9, B:342:0x3e3b, B:343:0x3e95, B:382:0x2c49, B:384:0x2c66, B:385:0x2cbd, B:391:0x27e7, B:393:0x27fa, B:394:0x284f, B:418:0x2968, B:420:0x299d, B:421:0x29f0, B:426:0x2af8, B:428:0x2b38, B:429:0x2b91, B:433:0x2a1f, B:435:0x2a58, B:436:0x2ab1, B:450:0x140a, B:452:0x141d, B:453:0x1472), top: B:5:0x011d }] */
                        /* JADX WARN: Removed duplicated region for block: B:214:0x2be3 A[Catch: all -> 0x022c, TryCatch #9 {all -> 0x022c, blocks: (B:6:0x011d, B:8:0x0130, B:9:0x017b, B:18:0x0261, B:20:0x0290, B:21:0x02d9, B:29:0x03d3, B:31:0x03e6, B:32:0x043c, B:40:0x0536, B:42:0x0580, B:43:0x05d3, B:46:0x05e9, B:48:0x05f8, B:49:0x063f, B:55:0x0774, B:57:0x07c7, B:58:0x0822, B:62:0x08c7, B:64:0x08da, B:65:0x0931, B:71:0x0a0a, B:73:0x0a4b, B:74:0x0a9f, B:81:0x0b67, B:83:0x0b7a, B:84:0x0bc4, B:92:0x0c89, B:94:0x0cd3, B:95:0x0d2d, B:99:0x0d68, B:101:0x0d7b, B:102:0x0dc8, B:109:0x0e23, B:111:0x0e6d, B:112:0x0ebf, B:116:0x0f7a, B:118:0x0f8d, B:119:0x0fe0, B:125:0x10aa, B:127:0x10eb, B:128:0x1142, B:132:0x1180, B:134:0x1193, B:135:0x11e0, B:141:0x123a, B:143:0x1277, B:144:0x12c9, B:163:0x152f, B:165:0x157b, B:166:0x15cf, B:169:0x15e5, B:171:0x15f4, B:172:0x1640, B:176:0x170e, B:178:0x174c, B:179:0x17a7, B:183:0x17c0, B:185:0x17d8, B:186:0x1823, B:192:0x18df, B:194:0x1922, B:195:0x1978, B:199:0x19b9, B:201:0x19cc, B:202:0x1a1a, B:204:0x1a23, B:206:0x1a41, B:207:0x1a91, B:212:0x2bd0, B:214:0x2be3, B:215:0x2c34, B:226:0x3185, B:228:0x3198, B:229:0x31e9, B:234:0x32b9, B:236:0x32cc, B:237:0x3319, B:249:0x33f6, B:251:0x343b, B:252:0x3491, B:291:0x38e7, B:293:0x3920, B:294:0x397b, B:319:0x3b44, B:321:0x3b8e, B:322:0x3be2, B:326:0x3c1c, B:328:0x3c2f, B:329:0x3c7c, B:333:0x3d37, B:335:0x3d80, B:336:0x3dd5, B:340:0x3df9, B:342:0x3e3b, B:343:0x3e95, B:382:0x2c49, B:384:0x2c66, B:385:0x2cbd, B:391:0x27e7, B:393:0x27fa, B:394:0x284f, B:418:0x2968, B:420:0x299d, B:421:0x29f0, B:426:0x2af8, B:428:0x2b38, B:429:0x2b91, B:433:0x2a1f, B:435:0x2a58, B:436:0x2ab1, B:450:0x140a, B:452:0x141d, B:453:0x1472), top: B:5:0x011d }] */
                        /* JADX WARN: Removed duplicated region for block: B:217:0x2c3d  */
                        /* JADX WARN: Removed duplicated region for block: B:225:0x3183  */
                        /* JADX WARN: Removed duplicated region for block: B:246:0x33cd  */
                        /* JADX WARN: Removed duplicated region for block: B:267:0x373e  */
                        /* JADX WARN: Removed duplicated region for block: B:290:0x38cf  */
                        /* JADX WARN: Removed duplicated region for block: B:297:0x3991  */
                        /* JADX WARN: Removed duplicated region for block: B:318:0x3b2c  */
                        /* JADX WARN: Removed duplicated region for block: B:325:0x3bf8  */
                        /* JADX WARN: Removed duplicated region for block: B:379:0x38ca A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:381:0x2c48  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public static java.lang.Object[] values(android.content.Context context, int i, int i2, int i3) {
                            java.lang.Integer num;
                            java.lang.Integer num2;
                            int i4;
                            java.lang.String str;
                            int i5;
                            int i6;
                            java.lang.String str2;
                            int i7;
                            int i8;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            long j;
                            char c;
                            java.lang.Object[] objArr;
                            java.lang.String[][] strArr;
                            java.lang.Object obj2;
                            java.lang.Object invoke;
                            int i14;
                            char c2;
                            int i15;
                            java.lang.String str3;
                            int i16;
                            java.lang.String str4;
                            int i17;
                            int i18;
                            int i19;
                            java.lang.String str5;
                            java.io.File file;
                            java.util.Scanner scanner;
                            int touchSlop;
                            int i20;
                            java.lang.String next;
                            java.lang.String[][] strArr2;
                            java.lang.String[] strArr3;
                            java.lang.String str6;
                            int i21;
                            java.lang.String str7;
                            int i22;
                            java.lang.String str8;
                            int i23;
                            java.lang.String str9;
                            java.lang.String str10 = "";
                            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int i24 = 0;
                            java.lang.Integer num3 = 0;
                            int i25 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                            int i26 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                            int i27 = (i26 * 860) - 7860996;
                            int i28 = ((i26 ^ i) | (i26 & i)) * (-859);
                            int i29 = ~i;
                            int i30 = ~((i29 ^ i26) | (i29 & i26));
                            int i31 = ~i26;
                            int i32 = (i31 & (-9163)) | (i31 ^ (-9163));
                            int i33 = ~((i32 ^ i) | (i32 & i));
                            int i34 = (i27 ^ i28) + ((i27 & i28) << 1) + (((i33 ^ i30) | (i33 & i30)) * 859);
                            int i35 = ~((i29 ^ (-9163)) | (i29 & (-9163)));
                            int i36 = ~((i26 ^ (-9163)) | (i26 & (-9163)));
                            int i37 = -(-(((i35 ^ i36) | (i36 & i35)) * 859));
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            a(464 - indexOf, 8 - (~i25), (char) ((i34 & i37) + (i37 | i34)), objArr2);
                            java.lang.String str11 = (java.lang.String) objArr2[0];
                            int size = android.view.View.MeasureSpec.getSize(0);
                            char c3 = 16;
                            java.lang.Integer num4 = 16;
                            int i38 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(size, (i38 ^ 27) + ((i38 & 27) << 1), (char) ((-2) - (~(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr3);
                            java.lang.String str12 = (java.lang.String) objArr3[0];
                            int i39 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            int indexOf2 = android.text.TextUtils.indexOf("", "", 0);
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            a((i39 ^ 28) + ((i39 & 28) << 1), (indexOf2 ^ 25) + ((indexOf2 & 25) << 1), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr4);
                            java.lang.String str13 = (java.lang.String) objArr4[0];
                            int i40 = -(-android.view.View.getDefaultSize(0, 0));
                            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            a((i40 & 52) + (i40 | 52), (maxKeyCode ^ 18) + ((maxKeyCode & 18) << 1), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr5);
                            java.lang.String str14 = (java.lang.String) objArr5[0];
                            int i41 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            a((i41 & 71) + (i41 | 71), 28 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr6);
                            java.lang.String[] strArr4 = {str12, str13, str14, (java.lang.String) objArr6[0]};
                            int i42 = 0;
                            while (true) {
                                if (i42 >= 4) {
                                    num = num3;
                                    num2 = num4;
                                    i4 = i;
                                    break;
                                }
                                try {
                                    java.lang.Object[] objArr7 = {strArr4[i42]};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                    if (obj3 == null) {
                                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i24, i24), android.widget.ExpandableListView.getPackedPositionType(0L) + 3161, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33051));
                                        byte b = $$a[c3];
                                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                                        b((byte) (b - 1), b, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr8);
                                        java.lang.String str15 = (java.lang.String) objArr8[i24];
                                        java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                        clsArr[i24] = java.lang.String.class;
                                        obj3 = cls2.getMethod(str15, clsArr);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj3);
                                    }
                                    long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7)).longValue();
                                    long j2 = i;
                                    num = num3;
                                    long j3 = (~j2) | 621972080;
                                    num2 = num4;
                                    long j4 = ((-518) * longValue) + 322181537958L + (((~j3) | longValue) * 519) + (((~(j3 | longValue)) | (~((-621972081) | longValue | j2))) * (-519)) + (((~(longValue | j2)) | (-621972081)) * 519) + 1617406984;
                                    int i43 = ((int) (j4 >> 32)) & (((((~(1163760100 | i)) | (-1693980785)) * (-366)) - 2062010012) + (((~((-547358737) | i)) | 17138052) * 366));
                                    int i44 = ((int) j4) & (((~((-1592330415) | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 717603037 + (((~((-1592330415) | i29)) | 18264832) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                    if (((i44 ^ i43) | (i44 & i43)) != 0) {
                                        valueOf = (IccPrivateKeyCrtComponentsJson + 63) % 128;
                                        int i45 = (i42 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) + (i42 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                                        i4 = (i45 | i) & (~(i & i45));
                                        break;
                                    }
                                    int i46 = (i42 & 119) + (i42 | 119);
                                    i42 = ((i46 | (-118)) << 1) - (i46 ^ (-118));
                                    num3 = num;
                                    num4 = num2;
                                    i24 = 0;
                                    c3 = 16;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            int i47 = 3;
                            if (i4 != i) {
                                valueOf = (IccPrivateKeyCrtComponentsJson + 51) % 128;
                                java.lang.Object[] objArr9 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
                                int i48 = ~(i | 1050703875);
                                java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((87854477 | i48) * (-658)) + 345112611 + ((i48 | 18646412) * 658))};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj4 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 50, android.view.Gravity.getAbsoluteGravity(0, 0) + 2713, (char) android.view.View.combineMeasuredStates(0, 0));
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    b(r4[16], (byte) (-$$a[18]), 653, objArr11);
                                    obj4 = cls3.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                }
                                ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr10)).intValue();
                                return objArr9;
                            }
                            int i49 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int i50 = -android.graphics.Color.red(0);
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            a(((i49 | 98) << 1) - (i49 ^ 98), ((i50 | 12) << 1) - (i50 ^ 12), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr12);
                            java.lang.String str16 = (java.lang.String) objArr12[0];
                            int i51 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                            int indexOf3 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            int blue = android.graphics.Color.blue(0);
                            char c4 = (char) (((blue | 15882) << 1) - (blue ^ 15882));
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            a((i51 & 110) + (i51 | 110), 12 - indexOf3, c4, objArr13);
                            java.lang.String str17 = (java.lang.String) objArr13[0];
                            int i52 = -android.view.View.resolveSizeAndState(0, 0, 0);
                            int i53 = i52 * (-661);
                            int i54 = (((-81303) | i53) << 1) - (i53 ^ (-81303));
                            int i55 = ~i52;
                            int i56 = ~(i55 | (-124));
                            int i57 = -(-(((i56 & i29) | (i56 ^ i29)) * 1324));
                            int i58 = (((i54 ^ i57) + ((i57 & i54) << 1)) - (~(-(-(((~((i52 ^ i) | (i52 & i))) | (~(i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE))) * (-1324)))))) - 1;
                            int i59 = ~((i55 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i55 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
                            int i60 = ~((i52 ^ (-124)) | (i52 & (-124)));
                            int i61 = -(-(((i60 ^ i59) | (i60 & i59)) * 662));
                            int i62 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            a((i58 & i61) + (i61 | i58), (i62 ^ 19) + ((i62 & 19) << 1), (char) (android.graphics.Color.rgb(0, 0, 0) + 16786055), objArr14);
                            java.lang.String[] strArr5 = {str16, str17, (java.lang.String) objArr14[0]};
                            int i63 = 0;
                            while (true) {
                                if (i63 >= i47) {
                                    str = str11;
                                    i5 = i;
                                    break;
                                }
                                java.lang.Object[] objArr15 = {strArr5[i63]};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                if (obj5 == null) {
                                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36, 3161 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 33099));
                                    byte[] bArr = $$a;
                                    byte b2 = (byte) (bArr[20] - 1);
                                    byte b3 = (byte) (bArr[16] - 1);
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    b(b2, b3, (short) (b3 | 618), objArr16);
                                    obj5 = cls4.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj5);
                                }
                                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr15)).longValue();
                                long j5 = ~longValue2;
                                long j6 = i;
                                long j7 = ~j6;
                                str = str11;
                                java.lang.String[] strArr6 = strArr5;
                                long j8 = (~(j5 | j7)) | (~(j5 | (-257856365))) | (~((-257856365) | j7));
                                long j9 = (591 * longValue2) + 151877398985L + (((~(longValue2 | 257856364 | j6)) | j8) * 590) + (j8 * (-1180)) + (((~(j7 | longValue2)) | (~(j7 | 257856364))) * 590) + 1165327103;
                                int i64 = ((int) (j9 >> 32)) & ((((~(1777702483 | i)) | (~((-16777299) | i29))) * 920) + 2038856378 + (((~(1096815699 | i29)) | (-1777702484)) * 920) + (((~(1777702483 | i29)) | (~((-680886785) | i)) | (~((-16777299) | i))) * 920));
                                int i65 = ((int) j9) & ((((~(1560597589 | i29)) | 123371179) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1453938690 + (((~(1600061183 | i29)) | (~((-1476690005) | i))) * (-519)) + (((~(123371179 | i)) | (-1560597590)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                if (((i64 ^ i65) | (i65 & i64)) != 0) {
                                    int i66 = valueOf;
                                    IccPrivateKeyCrtComponentsJson = ((i66 ^ 3) + ((i66 & 3) << 1)) % 128;
                                    int i67 = (i63 & 270) + (i63 | 270);
                                    i5 = (i67 & i29) | ((~i67) & i);
                                    break;
                                }
                                i63++;
                                str11 = str;
                                strArr5 = strArr6;
                                i47 = 3;
                            }
                            if (i5 != i) {
                                java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
                                java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((~((-2042373955) | i29)) | 2033983744) | (~(8472143 | i29))) * 464) - 1081756383) + (((-8390211) | i) * (-464)) + (((~(i | 8472143)) | 2033983744) * 464))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    b(r2[16], (byte) (-$$a[18]), 653, objArr19);
                                    obj6 = cls5.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                ((int[]) objArr17[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr18)).intValue();
                                return objArr17;
                            }
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
                            if (obj7 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.indexOf("", "", 0, 0), 1864 - android.text.TextUtils.getTrimmedLength(""), (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 41775));
                                byte[] bArr2 = $$a;
                                byte b4 = (byte) (bArr2[20] - 1);
                                byte b5 = (byte) (bArr2[16] - 1);
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                b(b4, b5, b5, objArr20);
                                obj7 = cls6.getMethod((java.lang.String) objArr20[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj7);
                            }
                            long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, null)).longValue();
                            long j10 = i;
                            long j11 = ~j10;
                            long j12 = ~longValue3;
                            long j13 = ~(j12 | 104036247 | j10);
                            long j14 = ((((((-712) * longValue3) + 74281880358L) + ((((~(longValue3 | (-104036248))) | (~(j11 | (-104036248)))) | j13) * (-713))) + (j13 * 1426)) + ((~(j12 | j11)) * 713)) - 2033249109;
                            int i68 = ((int) (j14 >> 32)) & (((((~((-277368918) | i29)) | 1714595328) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 1910708142) + (((~((-415848702) | i29)) | 1853075112) * (-440)) + (((-277368918) | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                            int i69 = ((int) j14) & (((~((-16779782) | i29)) * 433) + 492224304 + (((~(22048687 | i)) | 1415177722) * (-433)) + (((~(1415177722 | i)) | 5268906) * 433));
                            int i70 = (i69 ^ i68) | (i68 & i69);
                            if (i70 != 0) {
                                int i71 = IccPrivateKeyCrtComponentsJson;
                                valueOf = ((i71 & 59) + (i71 | 59)) % 128;
                                int i72 = i70 * (-159);
                                int i73 = ((i72 | 159) << 1) - (i72 ^ 159);
                                int i74 = i70 * 160;
                                int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                                int i76 = -(-(((~((~i29) | i29)) | (~((i70 ^ (-1)) | i70))) * (-160)));
                                int i77 = ~i70;
                                int i78 = ~((i77 ^ i29) | (i77 & i29));
                                int i79 = (i75 & i76) + (i76 | i75) + ((i78 | (i78 ^ (-1))) * 160);
                                int i80 = i79 * 477;
                                int i81 = (((-95000) | i80) << 1) - (i80 ^ (-95000));
                                int i82 = ~i79;
                                int i83 = ~((i82 ^ 200) | (i82 & 200));
                                int i84 = (i79 ^ (-201)) | (i79 & (-201));
                                int i85 = ~((i84 ^ i) | (i84 & i));
                                int i86 = ((i83 ^ i85) | (i83 & i85)) * (-476);
                                int i87 = i79 | (-201);
                                int i88 = (i29 ^ (-201)) | (i29 & (-201));
                                int i89 = (((i81 | i86) << 1) - (i86 ^ i81)) + ((~((i87 & i) | (i87 ^ i))) * 952) + ((~((i88 & i79) | (i88 ^ i79))) * 476);
                                i6 = ((~i89) & i) | (i89 & i29);
                            } else {
                                i6 = i;
                            }
                            if (i6 != i) {
                                java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
                                java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-131073873) | i)) | (~(1919772225 | i29))) * (-1808)) - 24761719) + (((~((-37750337) | i)) | (~(2013095761 | i29))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i | (-1919772226))) | 93323536 | (~(131073872 | i29))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj8 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    b(r3[16], (byte) (-$$a[18]), 653, objArr23);
                                    obj8 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                }
                                ((int[]) objArr21[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr22)).intValue();
                                return objArr21;
                            }
                            int i90 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                            int i91 = -(-android.view.View.getDefaultSize(0, 0));
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a(140 - (~i90), (i91 ^ 20) + ((i91 & 20) << 1), (char) (36029 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr24);
                            java.lang.String str18 = (java.lang.String) objArr24[0];
                            int i92 = -android.graphics.Color.argb(0, 0, 0, 0);
                            int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                            int i93 = ~pressedStateDuration;
                            int i94 = i93 | i29;
                            int i95 = (pressedStateDuration * (-432)) + 2604 + ((~((i94 & 6) | (i94 ^ 6))) * 433);
                            int i96 = ~((i & (-7)) | (i ^ (-7)));
                            int i97 = -(-(((i93 & i96) | (i96 ^ i93)) * (-433)));
                            int i98 = (i95 ^ i97) + ((i97 & i95) << 1);
                            int i99 = -(-(((~((pressedStateDuration ^ 6) | (pressedStateDuration & 6))) | (~((i93 ^ i) | (i93 & i)))) * 433));
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a(((i92 | 161) << 1) - (i92 ^ 161), (i98 & i99) + (i99 | i98), (char) android.graphics.Color.red(0), objArr25);
                            java.lang.Object[] objArr26 = {str18, (java.lang.String) objArr25[0]};
                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                            if (obj9 == null) {
                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2213, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                byte[] bArr3 = $$a;
                                byte b6 = (byte) (bArr3[20] - 1);
                                byte b7 = (byte) (bArr3[16] - 1);
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                b(b6, b7, b7, objArr27);
                                obj9 = cls8.getMethod((java.lang.String) objArr27[0], java.lang.String.class, java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj9);
                            }
                            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr26)).longValue();
                            long j15 = ~longValue4;
                            long j16 = ((((((-493) * longValue4) - 178927139160L) + ((j15 | (-361468968)) * (-988))) + (((longValue4 | 361468967) | j11) * 494)) + (((~(longValue4 | (-361468968))) | ((~(j15 | 361468967)) | (~(j11 | longValue4)))) * 494)) - 373905634;
                            int i100 = ((int) (j16 >> 32)) & (((((~(14301836 | i29)) | 1451528247) * (-602)) - 925982921) + (((~(14301836 | i)) | 1443135539 | (~((-5909129) | i29))) * (-301)) + ((~(1451528247 | i29)) * 301));
                            int i101 = ~(156113502 | i);
                            int i102 = ((int) j16) & ((((-1610512991) | i101) * (-814)) + 386118946 + ((i101 | (~(1593339912 | i29)) | 138940424) * 407) + (((~((-156113503) | i)) | 138940424 | (~((-1593339913) | i))) * 407));
                            int i103 = ((i100 ^ i102) | (i100 & i102)) != 0 ? (i & (-263)) | (i29 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) : i;
                            if (i103 != i) {
                                int i104 = IccPrivateKeyCrtComponentsJson;
                                valueOf = ((i104 & 43) + (i104 | 43)) % 128;
                                java.lang.Object[] objArr28 = {new int[]{i}, new int[]{i103}, null, null, new int[1]};
                                java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((~((-939371691) | i29)) | (-1111474408)) * (-933)) + 392801088) + (((~((-1111474408) | i29)) | 1073889349) * 933)) - 1471841968)};
                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj10 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    b(r4[16], (byte) (-$$a[18]), 653, objArr30);
                                    obj10 = cls9.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                                }
                                ((int[]) objArr28[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr29)).intValue();
                                return objArr28;
                            }
                            int i105 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                            int i106 = -android.view.View.MeasureSpec.getSize(0);
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            a(((i105 | 167) << 1) - (i105 ^ 167), (i106 & 31) + (i106 | 31), (char) (46034 - (~(-(-android.graphics.drawable.Drawable.resolveOpacity(0, 0))))), objArr31);
                            java.lang.String str19 = (java.lang.String) objArr31[0];
                            int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a((deadChar ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE) + ((deadChar & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE) << 1), 22 - (~(-(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0)))), (char) android.view.KeyEvent.normalizeMetaState(0), objArr32);
                            java.lang.String str20 = (java.lang.String) objArr32[0];
                            int i107 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int i108 = -(-(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            a((i107 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (i107 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE), ((i108 | 28) << 1) - (i108 ^ 28), (char) (android.os.Process.myPid() >> 22), objArr33);
                            java.lang.String str21 = (java.lang.String) objArr33[0];
                            int i109 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int i110 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            a((i109 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE) + (i109 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE), (i110 & 15) + (i110 | 15), (char) android.graphics.Color.red(0), objArr34);
                            java.lang.String[] strArr7 = {str19, str20, str21, (java.lang.String) objArr34[0]};
                            int i111 = 0;
                            while (true) {
                                if (i111 >= 4) {
                                    str2 = str10;
                                    i7 = i;
                                    break;
                                }
                                java.lang.Object[] objArr35 = {strArr7[i111]};
                                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                if (obj11 == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.green(0), 3161 - android.graphics.Color.alpha(0), (char) (33099 - android.view.View.combineMeasuredStates(0, 0)));
                                    byte b8 = $$a[16];
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    b((byte) (b8 - 1), b8, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr36);
                                    obj11 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj11);
                                }
                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr35)).longValue();
                                long j17 = ~longValue5;
                                long j18 = ~(j17 | j10);
                                str2 = str10;
                                java.lang.String[] strArr8 = strArr7;
                                long j19 = (longValue5 * 246) + 18544182268L + (((~(j17 | j11)) | (~(j17 | (-76000747)))) * (-245)) + ((-245) * j18) + (((-76000747) | j18) * 245) + 1071435650;
                                int i112 = ~((-841153520) | i29);
                                int i113 = ((int) (j19 >> 32)) & (((1209009152 | i112) * (-970)) + 1737965834 + ((i112 | (-2050162672)) * 970));
                                int i114 = ((int) j19) & (((((-1593830335) | r5) * (-476)) - 889624495) + ((~((-2097417) | i)) * 952) + ((~((-2097417) | i29)) * 476));
                                if (((i113 ^ i114) | (i113 & i114)) != 0) {
                                    int i115 = valueOf;
                                    IccPrivateKeyCrtComponentsJson = ((i115 ^ 107) + ((i115 & 107) << 1)) % 128;
                                    int i116 = i111 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                                    i7 = (i116 | i) & (~(i & i116));
                                    break;
                                }
                                i111 = ((i111 & 1) << 1) + (i111 ^ 1);
                                strArr7 = strArr8;
                                str10 = str2;
                            }
                            if (i7 != i) {
                                valueOf = (IccPrivateKeyCrtComponentsJson + 79) % 128;
                                java.lang.Object[] objArr37 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                                java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((83886188 | i) * 988) - 1019535787) + (((~(260081278 | i29)) | 1614569729) * (-1976)) + (((~(i | (-1790764820))) | 83886188 | (~(1790764819 | i29))) * 988))};
                                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj12 == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    b(r2[16], (byte) (-$$a[18]), 653, objArr39);
                                    obj12 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                                }
                                ((int[]) objArr37[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr38)).intValue();
                                return objArr37;
                            }
                            java.lang.String str22 = str2;
                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                            a(261 - (~(-android.view.MotionEvent.axisFromString(str2))), 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.TextUtils.lastIndexOf(str22, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr40);
                            java.lang.Object[] objArr41 = {(java.lang.String) objArr40[0]};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj13 == null) {
                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 40, 1921 - android.text.TextUtils.indexOf(str22, str22, 0), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                byte[] bArr4 = $$a;
                                byte b9 = (byte) (bArr4[20] - 1);
                                byte b10 = (byte) (bArr4[16] - 1);
                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                b(b9, b10, b10, objArr42);
                                obj13 = cls12.getMethod((java.lang.String) objArr42[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
                            }
                            java.lang.String str23 = (java.lang.String) ((java.lang.reflect.Method) obj13).invoke(null, objArr41);
                            if (str23 != null) {
                                long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                                int i117 = -android.view.View.MeasureSpec.getSize(0);
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                a((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, ((i117 | 9) << 1) - (i117 ^ 9), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr43);
                                if (str23.contains((java.lang.String) objArr43[0])) {
                                    i8 = (i & (-251)) | (i29 & 250);
                                    if (i8 == i) {
                                        java.lang.Object[] objArr44 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                                        java.lang.Object[] objArr45 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(1343926562 | i29)) | 706919535) * (-328)) + 660908773 + ((706919535 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(i | (-1343926563))) | 176162 | (~(2050669935 | i29))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj14 == null) {
                                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 50, android.text.TextUtils.indexOf(str22, str22, 0) + 2713, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                                            b(r2[16], (byte) (-$$a[18]), 653, objArr46);
                                            obj14 = cls13.getMethod((java.lang.String) objArr46[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                                        }
                                        ((int[]) objArr44[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr45)).intValue();
                                        return objArr44;
                                    }
                                    int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                                    int i118 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    int i119 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int i120 = (i119 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) - 987;
                                    int i121 = (i29 ^ (-2)) | (i29 & (-2));
                                    int i122 = (i119 ^ 1) | (i119 & 1);
                                    int i123 = ((~((i121 & i119) | (i121 ^ i119))) | (~((i122 & i) | (i122 ^ i)))) * 988;
                                    int i124 = (i120 ^ i123) + ((i120 & i123) << 1);
                                    int i125 = -(-(((i119 ^ (-2)) | (i119 & (-2))) * (-988)));
                                    int i126 = ~i119;
                                    int i127 = ~((i126 & (-2)) | (i126 ^ (-2)));
                                    int i128 = ~(i | (-2));
                                    int i129 = (i127 & i128) | (i127 ^ i128);
                                    int i130 = ~(i119 | i29 | 1);
                                    char c5 = (char) ((i124 & i125) + (i125 | i124) + (((i130 ^ i129) | (i130 & i129)) * 988));
                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                    a((tapTimeout >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (i118 ^ 17) + ((i118 & 17) << 1), c5, objArr47);
                                    java.lang.String str24 = (java.lang.String) objArr47[0];
                                    int i131 = -(-android.text.TextUtils.getOffsetBefore(str22, 0));
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    a((i131 ^ 302) + ((i131 & 302) << 1), '6' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr48);
                                    java.lang.Object[] objArr49 = {str24, (java.lang.String) objArr48[0]};
                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                    if (obj15 == null) {
                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2213, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                        byte[] bArr5 = $$a;
                                        byte b11 = (byte) (bArr5[20] - 1);
                                        byte b12 = (byte) (bArr5[16] - 1);
                                        java.lang.Object[] objArr50 = new java.lang.Object[1];
                                        b(b11, b12, b12, objArr50);
                                        obj15 = cls14.getMethod((java.lang.String) objArr50[0], java.lang.String.class, java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj15);
                                    }
                                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr49)).longValue();
                                    long j20 = ~longValue6;
                                    long j21 = ~(j11 | longValue6);
                                    java.lang.Integer num5 = num;
                                    long j22 = (((((517 * longValue6) - 108896413705L) + ((((~(j20 | j10)) | (~(j11 | 211449347))) | j21) * (-516))) + (((~(((-211449348) | j20) | j10)) | (~(((-211449348) | j11) | longValue6))) * 516)) + (((~(longValue6 | (-211449348))) | j21) * 516)) - 946823949;
                                    int i132 = ((int) (j22 >> 32)) & ((((~(983126910 | i)) | (-999904127)) * 305) + 1704617878 + (((~(i29 | 983126910)) | (-454099501)) * 305));
                                    int i133 = ((int) j22) & ((((~((-39059753) | i)) | 671163393) * 449) + 1090475947 + (((~(i29 | (-39059753))) | 671163393) * 449));
                                    int i134 = ((i133 ^ i132) | (i132 & i133)) != 0 ? i ^ 251 : i;
                                    if (i134 != i) {
                                        java.lang.Object[] objArr51 = {new int[]{i}, new int[]{i134}, null, null, new int[1]};
                                        java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~(i | (-538994757))) | r2) * 590) - 991512745) + (((~(i29 | (-1503298748))) | 1494746153 | (~(i29 | 547547350))) * (-1180)) + (((~(i29 | (-547547351))) | (~(i29 | 1503298747))) * 590))};
                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj16 == null) {
                                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            java.lang.Object[] objArr53 = new java.lang.Object[1];
                                            b(r2[16], (byte) (-$$a[18]), 653, objArr53);
                                            obj16 = cls15.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                                        }
                                        ((int[]) objArr51[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr52)).intValue();
                                        return objArr51;
                                    }
                                    int i135 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    a((i135 ^ 308) + ((i135 & 308) << 1), 23 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.text.TextUtils.getOffsetAfter(str22, 0), objArr54);
                                    java.lang.Object[] objArr55 = {(java.lang.String) objArr54[0]};
                                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj17 == null) {
                                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.KeyEvent.normalizeMetaState(0), 1922 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                        byte[] bArr6 = $$a;
                                        byte b13 = (byte) (bArr6[20] - 1);
                                        byte b14 = (byte) (bArr6[16] - 1);
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        b(b13, b14, b14, objArr56);
                                        obj17 = cls16.getMethod((java.lang.String) objArr56[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                                    }
                                    java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj17).invoke(null, objArr55)).toLowerCase();
                                    int i136 = -(-android.view.View.MeasureSpec.getSize(0));
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    a((i136 ^ com.visa.cbp.getCertUsage.getAucAID) + ((i136 & com.visa.cbp.getCertUsage.getAucAID) << 1), 2 - (~(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr57);
                                    int i137 = lowerCase.contains((java.lang.String) objArr57[0]) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                                    if (i137 != i) {
                                        java.lang.Object[] objArr58 = {new int[]{i}, new int[]{i137}, null, null, new int[1]};
                                        java.lang.Object[] objArr59 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((~((-507530704) | i)) | 440405442) * 1504) + 1707840417) + ((~(i | (-67125262))) * (-1504))) - 601815504)};
                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj18 == null) {
                                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(str22), 2713 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                                            b(r3[16], (byte) (-$$a[18]), 653, objArr60);
                                            obj18 = cls17.getMethod((java.lang.String) objArr60[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                                        }
                                        ((int[]) objArr58[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr59)).intValue();
                                        return objArr58;
                                    }
                                    int capsMode = android.text.TextUtils.getCapsMode(str22, 0, 0);
                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                    a((capsMode & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE) + (capsMode | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE), 16 - (~(-(-android.text.TextUtils.indexOf(str22, str22)))), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr61);
                                    java.lang.String str25 = (java.lang.String) objArr61[0];
                                    int i138 = -(-android.text.TextUtils.indexOf(str22, str22, 0));
                                    int i139 = -android.view.KeyEvent.normalizeMetaState(0);
                                    int rgb = android.graphics.Color.rgb(0, 0, 0);
                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                    a((i138 & com.visa.cbp.getCertUsage.setAppPrgrmID) + (i138 | com.visa.cbp.getCertUsage.setAppPrgrmID), (i139 ^ 6) + ((i139 & 6) << 1), (char) ((16805586 & rgb) + (rgb | 16805586)), objArr62);
                                    java.lang.String str26 = (java.lang.String) objArr62[0];
                                    java.io.File file2 = new java.io.File(str25);
                                    if (file2.exists() && file2.isFile()) {
                                        try {
                                            java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                                            a(340 - (~(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2, (char) (42810 - (~(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))), objArr63);
                                            java.util.Scanner useDelimiter = scanner2.useDelimiter((java.lang.String) objArr63[0]);
                                            if (useDelimiter.hasNext()) {
                                                int i140 = IccPrivateKeyCrtComponentsJson + 109;
                                                valueOf = i140 % 128;
                                                if (i140 % 2 != 0) {
                                                    useDelimiter.next();
                                                    throw new java.lang.NullPointerException();
                                                }
                                                str9 = useDelimiter.next();
                                            } else {
                                                str9 = str22;
                                            }
                                            useDelimiter.close();
                                        } catch (java.io.IOException unused2) {
                                        }
                                        if (str9.contains(str26)) {
                                            i10 = ~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
                                            i11 = i | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                            i9 = i10 & i11;
                                            if (i9 != i) {
                                                java.lang.Object[] objArr64 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                                                int i141 = ~(353812036 | i);
                                                java.lang.Object[] objArr65 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((1612710153 | i141) * (-814)) + 1013785796 + ((i141 | (~(i29 | (-1697034062))) | 269488128) * 407) + (((~(i | (-353812037))) | 269488128 | (~(1697034061 | i))) * 407))};
                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj19 == null) {
                                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, 2713 - android.view.View.MeasureSpec.getMode(0), (char) android.view.View.MeasureSpec.getMode(0));
                                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                    b(r3[16], (byte) (-$$a[18]), 653, objArr66);
                                                    obj19 = cls18.getMethod((java.lang.String) objArr66[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                                                }
                                                ((int[]) objArr64[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr65)).intValue();
                                                return objArr64;
                                            }
                                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                            if (obj20 == null) {
                                                java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 2763 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                byte[] bArr7 = $$a;
                                                byte b15 = (byte) (bArr7[20] - 1);
                                                byte b16 = (byte) (bArr7[16] - 1);
                                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                b(b15, b16, b16, objArr67);
                                                obj20 = cls19.getMethod((java.lang.String) objArr67[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj20);
                                            }
                                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, null)).longValue();
                                            long j23 = ~longValue7;
                                            long j24 = j23 | 2007610489;
                                            java.lang.String str27 = str;
                                            long j25 = ((-167) * longValue7) + 335270951830L + (((~j24) | (~(j23 | j11))) * 168) + ((~(j24 | j10)) * 168) + (((~(2007610489 | j11)) | (~(2007610489 | longValue7)) | (~((-2007610490) | j23 | j10))) * 168) + 2132647253;
                                            if (((((int) j25) & ((((~(i29 | 89425758)) | (-1347800652)) * (-235)) + 1211410072 + (((~(89425758 | i)) | (-1347800652)) * (-470)) + (((~((-1342261250) | i)) | 83886356) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) | (((int) (j25 >> 32)) & (((((~(i29 | 1393035212)) | 1464705672) * (-865)) - 992335130) + ((~((-1393035213) | i)) * 865) + (((~(i29 | (-1393035213))) | (~(i29 | 1464705672))) * 865)))) == 1) {
                                                int i142 = IccPrivateKeyCrtComponentsJson;
                                                valueOf = ((i142 & 109) + (i142 | 109)) % 128;
                                                java.lang.Object[] objArr68 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                java.lang.Object[] objArr69 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf((((~(i | 1079234545)) | 971611552) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 1132001471 + (((~(i29 | 1079234545)) | 967315456) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj21 == null) {
                                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str22, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2712, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                    b(r3[16], (byte) (-$$a[18]), 653, objArr70);
                                                    obj21 = cls20.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                                }
                                                ((int[]) objArr68[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr69)).intValue();
                                                return objArr68;
                                            }
                                            java.lang.String str28 = str22;
                                            java.lang.Object[] objArr71 = {1};
                                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                            if (obj22 == null) {
                                                java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.getTrimmedLength(str28) + 2364, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                byte[] bArr8 = $$a;
                                                byte b17 = (byte) (bArr8[20] - 1);
                                                byte b18 = (byte) (bArr8[16] - 1);
                                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                b(b17, b18, b18, objArr72);
                                                obj22 = cls21.getMethod((java.lang.String) objArr72[0], java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj22);
                                            }
                                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr71)).longValue();
                                            long j26 = ~longValue8;
                                            long j27 = (((-317) * longValue8) - 224431603374L) + (((~(j10 | 703547345)) | j26) * (-318)) + (((~(j11 | (-703547346) | longValue8)) | (~(j26 | j10))) * 318) + (((~(longValue8 | (-703547346) | j10)) | (~(j26 | j11 | (-703547346)))) * 318) + 2111457545;
                                            int i143 = (~((-1686534406) | i)) | 1610766341;
                                            int i144 = ((int) (j27 >> 32)) & ((i143 * 992) + 1537498186 + ((i143 | (~(i29 | (-173539931)))) * (-496)) + (((-249307995) | i) * 496));
                                            int i145 = ((int) j27) & (((~(i29 | (-35717125))) * 130) + 325246763 + (((~((-35717125) | i)) | 1074024529) * 130));
                                            int i146 = ((i144 ^ i145) | (i144 & i145)) != 0 ? (~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) & (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) : i;
                                            if (i146 != i) {
                                                valueOf = (IccPrivateKeyCrtComponentsJson + 99) % 128;
                                                java.lang.Object[] objArr73 = {new int[]{i}, new int[]{i146}, null, null, new int[1]};
                                                java.lang.Object[] objArr74 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((i29 | (-1974627434)) * 1444) - 1191286113) + ((((~(i | 124109013)) | (-2012736766)) | (~(1926737084 | i))) * (-1444))) - 248135646)};
                                                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj23 == null) {
                                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 50, 2713 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                    b(r2[16], (byte) (-$$a[18]), 653, objArr75);
                                                    obj23 = cls22.getMethod((java.lang.String) objArr75[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                                }
                                                ((int[]) objArr73[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr74)).intValue();
                                                return objArr73;
                                            }
                                            int i147 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                            int i148 = -(android.os.Process.myPid() >> 22);
                                            java.lang.Object[] objArr76 = new java.lang.Object[1];
                                            a(((i147 | 308) << 1) - (i147 ^ 308), (i148 & 23) + (i148 | 23), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr76);
                                            java.lang.Object[] objArr77 = {(java.lang.String) objArr76[0]};
                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj24 == null) {
                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.View.MeasureSpec.getMode(0) + 1921, (char) (android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                byte[] bArr9 = $$a;
                                                byte b19 = (byte) (bArr9[20] - 1);
                                                byte b20 = (byte) (bArr9[16] - 1);
                                                java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                b(b19, b20, b20, objArr78);
                                                obj24 = cls23.getMethod((java.lang.String) objArr78[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj24);
                                            }
                                            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj24).invoke(null, objArr77);
                                            if (invoke2 != null) {
                                                java.lang.Object[] objArr79 = {invoke2, 42};
                                                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj25 == null) {
                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.os.Process.getGidForName(str28), 2594 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.text.TextUtils.indexOf(str28, str28));
                                                    byte[] bArr10 = $$a;
                                                    byte b21 = (byte) (bArr10[20] - 1);
                                                    byte b22 = (byte) (bArr10[16] - 1);
                                                    java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                    b(b21, b22, b22, objArr80);
                                                    obj25 = cls24.getMethod((java.lang.String) objArr80[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj25);
                                                }
                                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr79)).longValue();
                                                long j28 = ~longValue9;
                                                long j29 = ~(j11 | longValue9);
                                                long j30 = ((971 * longValue9) - 267341837399L) + (((~(j28 | 137876141)) | j29) * (-970)) + ((~(longValue9 | (-137876142))) * 1940) + (((~((-137876142) | j28)) | j29) * 970) + 1119224383;
                                                int i149 = ((int) (j30 >> 32)) & ((((~(i29 | 786087129)) | (~((-710585434) | i))) * (-831)) + 296235912 + ((~((-1361068323) | i)) * (-1662)) + (((~(i29 | 2071653755)) | (~((-2071653756) | i)) | (~((-786087130) | i))) * 831));
                                                int i150 = ((int) j30) & ((((~((-1013924916) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 162866467) + ((i29 | (-608453634)) * (-216)) + (((~(i29 | (-1013924916))) | (-423301495)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                                                if (((i150 ^ i149) | (i149 & i150)) == 1986687685) {
                                                    i13 = i128;
                                                    j = j11;
                                                    i12 = i29;
                                                    int i151 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                    int i152 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                    a(445 - (~i151), (i152 & 15) + (i152 | 15), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr81);
                                                    java.lang.Object[] objArr82 = {(java.lang.String) objArr81[0]};
                                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj2 == null) {
                                                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, 1921 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-1) - android.os.Process.getGidForName(str28)));
                                                        byte[] bArr11 = $$a;
                                                        byte b23 = (byte) (bArr11[20] - 1);
                                                        byte b24 = (byte) (bArr11[16] - 1);
                                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                        b(b23, b24, b24, objArr83);
                                                        obj2 = cls25.getMethod((java.lang.String) objArr83[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                                    }
                                                    invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr82);
                                                    if (invoke != null) {
                                                        valueOf = (IccPrivateKeyCrtComponentsJson + 79) % 128;
                                                        i14 = 0;
                                                    } else {
                                                        java.lang.Object[] objArr84 = {invoke, 42};
                                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                        if (obj26 == null) {
                                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2594, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                                            byte[] bArr12 = $$a;
                                                            byte b25 = (byte) (bArr12[20] - 1);
                                                            byte b26 = (byte) (bArr12[16] - 1);
                                                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                            b(b25, b26, b26, objArr85);
                                                            obj26 = cls26.getMethod((java.lang.String) objArr85[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj26);
                                                        }
                                                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr84)).longValue();
                                                        long j31 = ~longValue10;
                                                        long j32 = ((-987) * longValue10) + 469793368697L + (((~(475018573 | longValue10 | j10)) | (~(j31 | j | 475018573))) * 988) + ((475018573 | j31) * (-988)) + (((~((-475018574) | j31)) | (~(j31 | j10)) | (~(longValue10 | j | 475018573))) * 988) + 782081951;
                                                        int i153 = ~(91893756 | i);
                                                        i14 = (((int) (j32 >> 32)) & (((((~((-690611374) | i)) | (-746615038)) * (-964)) - 1010699098) + (((~((-690611374) | i12)) | 19497984) * (-964)))) | (((int) j32) & (((18875812 | i153) * (-196)) + 835817605 + ((i153 | 73017944) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)));
                                                    }
                                                    if (i14 != 1986687685 && i14 != -1514516938) {
                                                        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                        int i154 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                        int i155 = -android.graphics.Color.blue(0);
                                                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                        a((minimumFlingVelocity & 1161) + (minimumFlingVelocity | 1161), 14 - (~i154), (char) ((57203 ^ i155) + ((i155 & 57203) << 1)), objArr86);
                                                        java.lang.String str29 = (java.lang.String) objArr86[0];
                                                        long uptimeMillis = android.os.SystemClock.uptimeMillis();
                                                        int mode = android.view.View.MeasureSpec.getMode(0);
                                                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                        a(1176 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), (mode ^ 26) + ((mode & 26) << 1), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr87);
                                                        java.lang.String str30 = (java.lang.String) objArr87[0];
                                                        int i156 = -(-android.view.KeyEvent.normalizeMetaState(0));
                                                        int i157 = -(-(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                        a(((i156 | 1201) << 1) - (i156 ^ 1201), (i157 ^ 17) + ((i157 & 17) << 1), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr88);
                                                        java.lang.String str31 = (java.lang.String) objArr88[0];
                                                        int red = android.graphics.Color.red(0);
                                                        int i158 = -(-android.text.TextUtils.indexOf(str28, str28, 0, 0));
                                                        int i159 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                        int i160 = i159 * 50;
                                                        int i161 = ((-5117623) & i160) + (i160 | (-5117623));
                                                        int i162 = ~(((-52760) ^ i12) | ((-52760) & i12));
                                                        int i163 = ~(((-52760) ^ i159) | ((-52760) & i159));
                                                        int i164 = ((i162 ^ i163) | (i162 & i163)) * 98;
                                                        int i165 = (i161 & i164) + (i164 | i161);
                                                        int i166 = ~i159;
                                                        int i167 = ~((i166 ^ i12) | (i166 & i12));
                                                        int i168 = (i167 ^ (-52760)) | ((-52760) & i167);
                                                        int i169 = ~((i159 ^ i) | (i159 & i));
                                                        int i170 = -(-(((i168 ^ i169) | (i168 & i169)) * (-49)));
                                                        int i171 = ~(((-52760) ^ i) | ((-52760) & i));
                                                        int i172 = ~((i159 ^ 52759) | (52759 & i159));
                                                        char c6 = (char) ((i165 ^ i170) + ((i170 & i165) << 1) + (((i172 ^ i171) | (i172 & i171)) * 49));
                                                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                        a(1218 - red, 16 - (~i158), c6, objArr89);
                                                        java.lang.String str32 = (java.lang.String) objArr89[0];
                                                        int lastIndexOf = android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                        int i173 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int threadPriority = android.os.Process.getThreadPriority(0);
                                                        char c7 = (char) (4410 - (~(((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6)));
                                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                        a((lastIndexOf & 1236) + (lastIndexOf | 1236), (i173 ^ 15) + ((i173 & 15) << 1), c7, objArr90);
                                                        java.lang.String str33 = (java.lang.String) objArr90[0];
                                                        int i174 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                        int i175 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                        int i176 = -android.text.TextUtils.getCapsMode(str28, 0, 0);
                                                        int i177 = (i176 * 165) - 1358605;
                                                        int i178 = ~((i12 ^ 8335) | (i12 & 8335));
                                                        int i179 = ((i178 ^ i176) | (i178 & i176)) * (-328);
                                                        int i180 = ((i177 | i179) << 1) - (i177 ^ i179);
                                                        int i181 = (i176 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                                                        int i182 = i176 | i12;
                                                        char c8 = (char) ((((i180 & i181) + (i181 | i180)) - (~((((~((~i176) | (-8336))) | (~((i ^ (-8336)) | (i & (-8336))))) | (~((i182 & 8335) | (i182 ^ 8335)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) - 1);
                                                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                        a(((i174 | 1250) << 1) - (i174 ^ 1250), 36 - (~i175), c8, objArr91);
                                                        java.lang.String str34 = (java.lang.String) objArr91[0];
                                                        int i183 = -(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                        a((i183 & 1287) + (i183 | 1287), ((windowTouchSlop | 12) << 1) - (windowTouchSlop ^ 12), (char) android.view.KeyEvent.keyCodeFromString(str28), objArr92);
                                                        java.lang.String str35 = (java.lang.String) objArr92[0];
                                                        int resolveSize = android.view.View.resolveSize(0, 0);
                                                        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString(str28);
                                                        int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                                                        java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                        a(((resolveSize | 1299) << 1) - (resolveSize ^ 1299), 13 - keyCodeFromString, (char) ((scrollBarSize & 21548) + (scrollBarSize | 21548)), objArr93);
                                                        java.lang.String str36 = (java.lang.String) objArr93[0];
                                                        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                        int resolveSize2 = android.view.View.resolveSize(0, 0);
                                                        java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                        a(1312 - packedPositionGroup, ((resolveSize2 | 22) << 1) - (resolveSize2 ^ 22), (char) android.text.TextUtils.getTrimmedLength(str28), objArr94);
                                                        java.lang.String str37 = (java.lang.String) objArr94[0];
                                                        int i184 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                                        int blue2 = android.graphics.Color.blue(0);
                                                        java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                        a(((i184 | 1335) << 1) - (i184 ^ 1335), ((blue2 | 31) << 1) - (blue2 ^ 31), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr95);
                                                        java.lang.String str38 = (java.lang.String) objArr95[0];
                                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                        a(1365 - android.graphics.Color.alpha(0), 11 - android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (15317 - (~(-android.view.KeyEvent.keyCodeFromString(str28)))), objArr96);
                                                        java.lang.String str39 = (java.lang.String) objArr96[0];
                                                        int i185 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                        int i186 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                        java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                        a((i185 & 1377) + (i185 | 1377), ((i186 | 12) << 1) - (i186 ^ 12), (char) ((-2) - (~(-(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr97);
                                                        java.lang.String str40 = (java.lang.String) objArr97[0];
                                                        int i187 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                        float length = android.graphics.PointF.length(0.0f, 0.0f);
                                                        int i188 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                        a((i187 ^ 1388) + ((i187 & 1388) << 1), (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 12, (char) ((46506 ^ i188) + ((i188 & 46506) << 1)), objArr98);
                                                        java.lang.String str41 = (java.lang.String) objArr98[0];
                                                        int i189 = -android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                        java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                        a((i189 ^ my.com.softspace.common.util.ScreenUtil.DEVICE_SCREEN_INFO_PX_RES_WIDTH) + ((i189 & my.com.softspace.common.util.ScreenUtil.DEVICE_SCREEN_INFO_PX_RES_WIDTH) << 1), 11 - (~(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), (char) android.graphics.Color.argb(0, 0, 0, 0), objArr99);
                                                        java.lang.String str42 = (java.lang.String) objArr99[0];
                                                        int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                        int i190 = -(-android.view.KeyEvent.keyCodeFromString(str28));
                                                        int i191 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                        java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                        a(1413 - (~lastIndexOf2), (i190 ^ 12) + ((i190 & 12) << 1), (char) ((i191 ^ 18511) + ((i191 & 18511) << 1)), objArr100);
                                                        java.lang.String str43 = (java.lang.String) objArr100[0];
                                                        int offsetBefore = android.text.TextUtils.getOffsetBefore(str28, 0);
                                                        java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                        a((offsetBefore ^ 1425) + ((offsetBefore & 1425) << 1), 13 - (~(-android.view.KeyEvent.keyCodeFromString(str28))), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr101);
                                                        java.lang.String str44 = (java.lang.String) objArr101[0];
                                                        int capsMode2 = android.text.TextUtils.getCapsMode(str28, 0, 0);
                                                        int i192 = -(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                        int i193 = -(-android.graphics.Color.rgb(0, 0, 0));
                                                        java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                        a(1439 - capsMode2, (i192 & 12) + (i192 | 12), (char) ((16828956 ^ i193) + ((i193 & 16828956) << 1)), objArr102);
                                                        java.lang.String str45 = (java.lang.String) objArr102[0];
                                                        int i194 = -(android.os.Process.myPid() >> 22);
                                                        java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                        a((i194 ^ 1451) + ((i194 & 1451) << 1), 24 - (~(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (char) (48328 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))))), objArr103);
                                                        java.lang.String str46 = (java.lang.String) objArr103[0];
                                                        int i195 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                        int i196 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i197 = i196 * 491;
                                                        int i198 = (i197 & (-13692)) + (i197 | (-13692));
                                                        int i199 = ~i196;
                                                        int i200 = (i199 ^ (-29)) | (i199 & (-29));
                                                        int i201 = -(-(((i200 ^ i12) | (i200 & i12)) * (-490)));
                                                        int i202 = (i198 & i201) + (i198 | i201);
                                                        int i203 = -(-(((~((i196 ^ (-29)) | (i196 & (-29)))) | (~((i ^ (-29)) | (i & (-29))))) * 490));
                                                        int i204 = ((i202 | i203) << 1) - (i203 ^ i202);
                                                        int i205 = -(-(i199 * 490));
                                                        int i206 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                        java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                        a(((i195 | 1476) << 1) - (i195 ^ 1476), (i204 ^ i205) + ((i205 & i204) << 1), (char) ((i206 & 1) + (i206 | 1)), objArr104);
                                                        java.lang.String[] strArr9 = {str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, (java.lang.String) objArr104[0]};
                                                        i22 = 0;
                                                        while (i22 < 19) {
                                                            java.lang.String str47 = strArr9[i22];
                                                            java.lang.Object[] objArr105 = {str47};
                                                            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                            if (obj27 == null) {
                                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 36, 3161 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (33099 - android.view.Gravity.getAbsoluteGravity(0, 0)));
                                                                byte[] bArr13 = $$a;
                                                                byte b27 = (byte) (bArr13[20] - 1);
                                                                byte b28 = (byte) (bArr13[16] - 1);
                                                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                b(b27, b28, (short) (b28 | 618), objArr106);
                                                                obj27 = cls27.getMethod((java.lang.String) objArr106[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj27);
                                                            }
                                                            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr105)).longValue();
                                                            long j33 = ~longValue11;
                                                            long j34 = (-875203147) | j33;
                                                            long j35 = j33 | j;
                                                            java.lang.String[] strArr10 = strArr9;
                                                            int i207 = i22;
                                                            str8 = str28;
                                                            long j36 = 32267592 + (193 * longValue11) + 168914207178L + ((j | (~(longValue11 | (-875203147)))) * (-192)) + (((~j35) | (~j34)) * (-384)) + (((~(j35 | 875203146)) | (~(j34 | j10)) | (~(875203146 | longValue11 | j10))) * 192);
                                                            int i208 = ((int) (j36 >> 32)) & ((((~(114236749 | i12)) * (-560)) - 265975638) + ((~((-1209016337) | i)) * (-560)) + (((~(1322989661 | i12)) | 263424) * 560));
                                                            int i209 = ((int) j36) & (((~((-445604732) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 538317149 + (((-8716626) | i12) * (-216)) + (((~((-445604732) | i12)) | (-991621679)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                                                            if (((i209 ^ i208) | (i209 & i208)) == 0) {
                                                                float minVolume = android.media.AudioTrack.getMinVolume();
                                                                int i210 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                a(1425 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), (i210 & 13) + (i210 | 13), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr107);
                                                                if (str47.equals((java.lang.String) objArr107[0])) {
                                                                    java.lang.Object[] objArr108 = {str47};
                                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                    if (obj28 == null) {
                                                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3161, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33099));
                                                                        byte b29 = $$a[16];
                                                                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                        b((byte) (b29 - 1), b29, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr109);
                                                                        obj28 = cls28.getMethod((java.lang.String) objArr109[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj28);
                                                                    }
                                                                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr108)).longValue();
                                                                    long j37 = ~((~longValue12) | j10);
                                                                    long j38 = (((-574) * longValue12) - 477503527172L) + (((~(j | (-831887679))) | j37) * 1150) + (((~(j | longValue12)) | j37) * (-575)) + (((~(j | 831887678)) | (~(j10 | (-831887679)))) * 575) + 163547225;
                                                                    int i211 = ((int) (j38 >> 32)) & (((((-293642241) | i12) * 494) - 1387809146) + (((~((-1038525035) | i12)) | (-1367975297)) * 494));
                                                                    int i212 = ~((-53379653) | i);
                                                                    int i213 = ((int) j38) & (((((~((-53379653) | i12)) | 557636) * (-245)) - 1117848284) + (i212 * (-245)) + ((i212 | (-1490606063)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                                                                    if (((i211 ^ i213) | (i211 & i213)) != 0) {
                                                                        int i214 = IccPrivateKeyCrtComponentsJson + 7;
                                                                        int i215 = i214 % 128;
                                                                        valueOf = i215;
                                                                        if (i214 % 2 != 0) {
                                                                            throw null;
                                                                        }
                                                                        IccPrivateKeyCrtComponentsJson = ((i215 ^ 109) + ((i215 & 109) << 1)) % 128;
                                                                    }
                                                                }
                                                                i22 = (((i207 | (-72)) << 1) - (i207 ^ (-72))) + 73;
                                                                strArr9 = strArr10;
                                                                str28 = str8;
                                                            }
                                                            i23 = i207;
                                                        }
                                                        str8 = str28;
                                                        i23 = -1;
                                                        if (i23 >= 0) {
                                                            int i216 = i23 + 130;
                                                            int i217 = (~(i & i216)) & (i216 | i);
                                                            if (i217 != i) {
                                                                IccPrivateKeyCrtComponentsJson = (valueOf + 11) % 128;
                                                                java.lang.Object[] objArr110 = {new int[]{i}, new int[]{i217}, null, null, new int[1]};
                                                                java.lang.Object[] objArr111 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-176590227) | i)) | (~((-1158680590) | i12))) * 497) - 1741385854) + (((~(i | (-1158680590))) | (~(i12 | (-715575283))) | 538985056) * 497))};
                                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj29 == null) {
                                                                    java.lang.String str48 = str8;
                                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, android.text.TextUtils.indexOf(str48, str48, 0, 0) + 2713, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                    b(r5[16], (byte) (-$$a[18]), 653, objArr112);
                                                                    obj29 = cls29.getMethod((java.lang.String) objArr112[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj29);
                                                                }
                                                                ((int[]) objArr110[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr111)).intValue();
                                                                return objArr110;
                                                            }
                                                        }
                                                        str28 = str8;
                                                    }
                                                    int i218 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                    int indexOf4 = android.text.TextUtils.indexOf(str28, str28, 0);
                                                    int i219 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                    a((i218 & 1503) + (i218 | 1503), (indexOf4 & 13) + (indexOf4 | 13), (char) ((i219 ^ 23250) + ((i219 & 23250) << 1)), objArr113);
                                                    java.lang.String str49 = (java.lang.String) objArr113[0];
                                                    int i220 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    int i221 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int i222 = -android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                    a((i220 ^ 1515) + ((i220 & 1515) << 1), 4 - (~i221), (char) ((i222 & 26435) + (i222 | 26435)), objArr114);
                                                    java.lang.String[] strArr11 = {str49, (java.lang.String) objArr114[0]};
                                                    int i223 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                    long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                                                    int i224 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                    a(((i223 | 1521) << 1) - (i223 ^ 1521), (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + 14, (char) (((i224 | androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED) << 1) - (i224 ^ androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED)), objArr115);
                                                    java.lang.String str50 = (java.lang.String) objArr115[0];
                                                    int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                                                    int i225 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                    a((absoluteGravity & 1536) + (absoluteGravity | 1536), (i225 ^ 20) + ((i225 & 20) << 1), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), objArr116);
                                                    java.lang.String str51 = (java.lang.String) objArr116[0];
                                                    int capsMode3 = android.text.TextUtils.getCapsMode(str28, 0, 0);
                                                    int i226 = capsMode3 * (-109);
                                                    int i227 = ~capsMode3;
                                                    int i228 = ~((i ^ 1555) | (i & 1555));
                                                    int i229 = ~((capsMode3 ^ 1555) | (capsMode3 & 1555));
                                                    int i230 = ~(i | 1555);
                                                    int i231 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                    a((i226 ^ 172605) + ((i226 & 172605) << 1) + (((i228 & i227) | (i227 ^ i228)) * (-220)) + (((i229 & i230) | (i229 ^ i230)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((~((capsMode3 & (-1556)) | (capsMode3 ^ (-1556)))) | (~(i227 | 1555))) * 110), (i231 ^ 14) + ((i231 & 14) << 1), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr117);
                                                    java.lang.String[] strArr12 = {str50, str51, (java.lang.String) objArr117[0]};
                                                    int argb = android.graphics.Color.argb(0, 0, 0, 0);
                                                    int i232 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                    int i233 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                    a(argb + 1569, ((i232 | 20) << 1) - (i232 ^ 20), (char) ((i233 & androidx.media3.muxer.WebmConstants.MkvEbmlElement.SIGNATURE_ELEMENT_LIST) + (i233 | androidx.media3.muxer.WebmConstants.MkvEbmlElement.SIGNATURE_ELEMENT_LIST)), objArr118);
                                                    java.lang.String str52 = (java.lang.String) objArr118[0];
                                                    int i234 = -android.graphics.Color.red(0);
                                                    int i235 = -(-android.view.View.MeasureSpec.getMode(0));
                                                    java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                    a(1589 - (~i234), (i235 & 10) + (i235 | 10), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr119);
                                                    java.lang.String[] strArr13 = {str52, (java.lang.String) objArr119[0]};
                                                    int i236 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                    a((i236 ^ 1600) + ((i236 & 1600) << 1), (-16777206) - (~(-android.graphics.Color.rgb(0, 0, 0))), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr120);
                                                    java.lang.String str53 = (java.lang.String) objArr120[0];
                                                    int i237 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                    int i238 = -(-android.view.KeyEvent.normalizeMetaState(0));
                                                    char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    char c9 = (char) (((mirror | 28322) << 1) - (mirror ^ 28322));
                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                    a((i237 & com.visa.cbp.getCertUsage.setODAData) + (i237 | com.visa.cbp.getCertUsage.setODAData), (i238 & 6) + (i238 | 6), c9, objArr121);
                                                    java.lang.String[] strArr14 = {str53, (java.lang.String) objArr121[0]};
                                                    int minimumFlingVelocity2 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                    int i239 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int i240 = (i239 * (-209)) - 6061;
                                                    int i241 = ~i239;
                                                    int i242 = -(-((~((i241 ^ (-30)) | (i241 & (-30)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                    int i243 = (i240 ^ i242) + ((i240 & i242) << 1);
                                                    int i244 = ~((i12 ^ (-30)) | (i12 & (-30)));
                                                    int i245 = ~((i241 & i) | (i241 ^ i));
                                                    int i246 = -(-(((i244 ^ i245) | (i245 & i244)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                    int i247 = ((i243 | i246) << 1) - (i246 ^ i243);
                                                    int i248 = (i241 & i12) | (i241 ^ i12);
                                                    int i249 = ~((i248 ^ 29) | (i248 & 29));
                                                    int i250 = (i239 ^ (-30)) | (i239 & (-30));
                                                    int i251 = ~((i250 ^ i) | (i250 & i));
                                                    int i252 = ((i251 ^ i249) | (i251 & i249)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                    a((minimumFlingVelocity2 ^ 1611) + ((minimumFlingVelocity2 & 1611) << 1), (i247 ^ i252) + ((i252 & i247) << 1), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr122);
                                                    java.lang.String str54 = (java.lang.String) objArr122[0];
                                                    int i253 = -android.text.TextUtils.getOffsetBefore(str28, 0);
                                                    int i254 = -android.view.View.MeasureSpec.getSize(0);
                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                    a(1589 - (~i253), (i254 ^ 10) + ((i254 & 10) << 1), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr123);
                                                    c2 = 0;
                                                    java.lang.String[][] strArr15 = {strArr11, strArr12, strArr13, strArr14, new java.lang.String[]{str54, (java.lang.String) objArr123[0]}};
                                                    int i255 = -1;
                                                    i15 = 0;
                                                    loop4: while (true) {
                                                        if (i15 < 5) {
                                                            str3 = str28;
                                                            i16 = i;
                                                            break;
                                                        }
                                                        java.lang.String[] strArr16 = strArr15[i15];
                                                        java.lang.String str55 = strArr16[c2];
                                                        java.lang.String[] strArr17 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr16, 1, strArr16.length);
                                                        int length2 = strArr17.length;
                                                        int i256 = IccPrivateKeyCrtComponentsJson;
                                                        valueOf = (((i256 | 55) << 1) - (i256 ^ 55)) % 128;
                                                        int i257 = 0;
                                                        while (i257 < length2) {
                                                            java.lang.String str56 = strArr17[i257];
                                                            int i258 = i255 + 14;
                                                            i255 = ((i258 | (-13)) << 1) - (i258 ^ (-13));
                                                            java.io.File file3 = new java.io.File(str55);
                                                            if (file3.exists() && file3.isFile()) {
                                                                try {
                                                                    java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                                                    int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString(str28);
                                                                    int i259 = -android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                    int i260 = i259 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd;
                                                                    strArr2 = strArr15;
                                                                    int i261 = ((i260 | (-987)) << 1) - (i260 ^ (-987));
                                                                    int i262 = (i259 ^ 1) | (i259 & 1);
                                                                    strArr3 = strArr17;
                                                                    int i263 = ((~(i12 | (-2) | i259)) | (~((i262 ^ i) | (i262 & i)))) * 988;
                                                                    int i264 = ((i261 | i263) << 1) - (i261 ^ i263);
                                                                    int i265 = (i259 | (-2)) * (-988);
                                                                    str6 = str55;
                                                                    int i266 = (~((~i259) | (-2))) | (~((i ^ (-2)) | (i & (-2))));
                                                                    int i267 = (i259 & i12) | (i259 ^ i12);
                                                                    int i268 = ~((i267 & 1) | (i267 ^ 1));
                                                                    i21 = length2;
                                                                    try {
                                                                        int i269 = -android.text.TextUtils.indexOf(str28, str28, 0);
                                                                        int i270 = i269 * (-1939);
                                                                        int i271 = (i270 & 41569481) + (i270 | 41569481);
                                                                        int i272 = ~((-42812) | i269);
                                                                        str3 = str28;
                                                                        int i273 = ~((i12 ^ 42811) | (i12 & 42811));
                                                                        int i274 = -(-((i272 | i273) * (-970)));
                                                                        int i275 = ((i271 | i274) << 1) - (i271 ^ i274);
                                                                        int i276 = ~i269;
                                                                        int i277 = -(-((~((42811 ^ i276) | (i276 & 42811))) * 1940));
                                                                        int i278 = (i275 ^ i277) + ((i275 & i277) << 1);
                                                                        int i279 = ~((i276 & (-42812)) | ((-42812) ^ i276));
                                                                        int i280 = -(-(((i273 & i279) | (i279 ^ i273)) * 970));
                                                                        try {
                                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                            a(341 - keyCodeFromString2, (i264 & i265) + (i265 | i264) + (((i266 ^ i268) | (i266 & i268)) * 988), (char) ((i278 ^ i280) + ((i278 & i280) << 1)), objArr124);
                                                                            java.util.Scanner useDelimiter2 = scanner3.useDelimiter((java.lang.String) objArr124[0]);
                                                                            if (useDelimiter2.hasNext()) {
                                                                                int i281 = valueOf;
                                                                                int i282 = (i281 ^ 7) + ((i281 & 7) << 1);
                                                                                IccPrivateKeyCrtComponentsJson = i282 % 128;
                                                                                if (i282 % 2 == 0) {
                                                                                    useDelimiter2.next();
                                                                                    throw new java.lang.ArithmeticException();
                                                                                }
                                                                                str7 = useDelimiter2.next();
                                                                            } else {
                                                                                str7 = str3;
                                                                            }
                                                                            useDelimiter2.close();
                                                                        } catch (java.io.IOException unused3) {
                                                                            continue;
                                                                        }
                                                                    } catch (java.io.IOException unused4) {
                                                                        str3 = str28;
                                                                    }
                                                                } catch (java.io.IOException unused5) {
                                                                }
                                                                if (str7.contains(str56)) {
                                                                    int i283 = valueOf;
                                                                    IccPrivateKeyCrtComponentsJson = (((i283 | 97) << 1) - (i283 ^ 97)) % 128;
                                                                    int i284 = i255 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                                    i16 = ((~i284) & i) | (i284 & i12);
                                                                    break loop4;
                                                                }
                                                                i257++;
                                                                strArr15 = strArr2;
                                                                length2 = i21;
                                                                strArr17 = strArr3;
                                                                str55 = str6;
                                                                str28 = str3;
                                                            }
                                                            strArr2 = strArr15;
                                                            str3 = str28;
                                                            strArr3 = strArr17;
                                                            str6 = str55;
                                                            i21 = length2;
                                                            i257++;
                                                            strArr15 = strArr2;
                                                            length2 = i21;
                                                            strArr17 = strArr3;
                                                            str55 = str6;
                                                            str28 = str3;
                                                        }
                                                        i15++;
                                                        c2 = 0;
                                                    }
                                                    if (i16 == i) {
                                                        java.lang.Object[] objArr125 = {new int[]{i}, new int[]{i16}, null, null, new int[1]};
                                                        java.lang.Object[] objArr126 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(i | (-352454754))) | 1622147080) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 617805844 + ((~((-352454754) | i12)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj30 == null) {
                                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.view.View.combineMeasuredStates(0, 0) + 2713, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                            java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                            b(r5[16], (byte) (-$$a[18]), 653, objArr127);
                                                            obj30 = cls30.getMethod((java.lang.String) objArr127[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                                        }
                                                        ((int[]) objArr125[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr126)).intValue();
                                                        return objArr125;
                                                    }
                                                    try {
                                                        int i285 = -android.view.View.getDefaultSize(0, 0);
                                                        int i286 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                        int i287 = i286 * (-209);
                                                        int i288 = ((i287 | (-2717)) << 1) - (i287 ^ (-2717));
                                                        int i289 = ~i286;
                                                        int i290 = (~(i289 | (-14))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                                        int i291 = ~((i12 & (-14)) | (i12 ^ (-14)));
                                                        int i292 = ~((i289 & i) | (i289 ^ i));
                                                        int i293 = i289 | i12;
                                                        int i294 = ~((i293 ^ 13) | (i293 & 13));
                                                        int i295 = (i286 ^ (-14)) | (i286 & (-14));
                                                        int i296 = ~((i295 ^ i) | (i295 & i));
                                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                        a(1638 - (~i285), (i288 & i290) + (i288 | i290) + (((i292 & i291) | (i291 ^ i292)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((i296 ^ i294) | (i296 & i294)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr128);
                                                        java.lang.String str57 = (java.lang.String) objArr128[0];
                                                        int i297 = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                        a((i297 & 1652) + (i297 | 1652), 7 - (~(-android.widget.ExpandableListView.getPackedPositionGroup(0L))), (char) android.view.View.getDefaultSize(0, 0), objArr129);
                                                        str5 = (java.lang.String) objArr129[0];
                                                        file = new java.io.File(str57);
                                                    } catch (java.lang.Exception unused6) {
                                                        str4 = str3;
                                                    }
                                                    if (file.exists()) {
                                                        int i298 = IccPrivateKeyCrtComponentsJson;
                                                        valueOf = (((i298 | 115) << 1) - (i298 ^ 115)) % 128;
                                                        if (file.isFile()) {
                                                            try {
                                                                scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                                                                touchSlop = android.view.ViewConfiguration.getTouchSlop();
                                                                i20 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                str4 = str3;
                                                            } catch (java.io.IOException unused7) {
                                                            }
                                                            try {
                                                                int i299 = -android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                a((touchSlop >> 8) + 341, (i20 & 2) + (i20 | 2), (char) ((42810 & i299) + (i299 | 42810)), objArr130);
                                                                java.util.Scanner useDelimiter3 = scanner.useDelimiter((java.lang.String) objArr130[0]);
                                                                next = useDelimiter3.hasNext() ? useDelimiter3.next() : str4;
                                                                useDelimiter3.close();
                                                            } catch (java.io.IOException unused8) {
                                                            } catch (java.lang.Exception unused9) {
                                                                i17 = i & (-152);
                                                                i18 = i12 & 151;
                                                                i19 = i17 | i18;
                                                                if (i19 != i) {
                                                                }
                                                            }
                                                            if (next.contains(str5)) {
                                                                valueOf = (IccPrivateKeyCrtComponentsJson + 81) % 128;
                                                                int i300 = ~(((-754554292) & i) | ((-754554292) ^ i));
                                                                int i301 = (((i300 ^ 685315506) | (685315506 & i300)) * (-566)) + 1565086316;
                                                                int i302 = ((-1496783656) & i301) + (i301 | (-1496783656));
                                                                int i303 = (~(((-69238786) & i) | ((-69238786) ^ i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
                                                                int i304 = ~(((-1683887074) & i) | ((-1683887074) ^ i));
                                                                int i305 = -(-(((i304 ^ (-428666096)) | ((-428666096) & i304)) * 398));
                                                                int i306 = ~(((-1683887074) & i12) | ((-1683887074) ^ i12));
                                                                int i307 = (i306 ^ (-2111766512)) | ((-2111766512) & i306);
                                                                if ((i302 & i303) + (i303 | i302) > ((((1388671822 | i305) << 1) - (1388671822 ^ i305)) - 213058058) + (((1683100416 & i307) | (1683100416 ^ i307)) * 398)) {
                                                                    i17 = i & (-9268);
                                                                    i18 = i12 & 9267;
                                                                    i19 = i17 | i18;
                                                                    if (i19 != i) {
                                                                        java.lang.Object[] objArr131 = {new int[]{i}, new int[]{i19}, null, null, new int[1]};
                                                                        java.lang.Object[] objArr132 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-206419523) | i)) | (~(i12 | 1844426575))) * (-318)) - 25157781) + (((~(751810383 | i)) | 1092616192) * (-318)) + (((~(i | (-751810384))) | (-1299035715)) * 318))};
                                                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj31 == null) {
                                                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                            b(r5[16], (byte) (-$$a[18]), 653, objArr133);
                                                                            obj31 = cls31.getMethod((java.lang.String) objArr133[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                                        }
                                                                        ((int[]) objArr131[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr132)).intValue();
                                                                        return objArr131;
                                                                    }
                                                                    java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                                    a(1659 - (~(-(-android.view.KeyEvent.keyCodeFromString(str4)))), 47 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr134);
                                                                    java.lang.Object[] objArr135 = {(java.lang.String) objArr134[0]};
                                                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                    if (obj32 == null) {
                                                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 36, 3161 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (33147 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                        byte b30 = $$a[16];
                                                                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                                        b((byte) (b30 - 1), b30, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr136);
                                                                        obj32 = cls32.getMethod((java.lang.String) objArr136[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj32);
                                                                    }
                                                                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr135)).longValue();
                                                                    long j39 = ~longValue13;
                                                                    long j40 = ~(j10 | (-800813932));
                                                                    long j41 = 1796248835 + ((881 * longValue13) - 705517074092L) + (((~(j39 | 800813931)) | (~(j10 | 800813931)) | (~(j39 | j10))) * (-880)) + ((longValue13 | (~(j | 800813931)) | j40) * (-880)) + (j40 * 880);
                                                                    int i308 = ((int) (j41 >> 32)) & (((((~((-108085555) | i12)) | r5) * 1150) - 334238508) + (((~((-1329140857) | i)) | (~(1329140856 | i12))) * (-575)) + (((~((-108085555) | i)) | (~(108085554 | i12))) * 575));
                                                                    int i309 = ((int) j41) & ((((-1711341612) | i) * 140) + 718477569 + (((~((-1711341612) | i12)) | 1) * (-280)) + (((~(274115201 | i12)) | (-1985456812) | i13) * 140));
                                                                    int i310 = (((i309 ^ i308) | (i308 & i309)) * 263) ^ i;
                                                                    int[] iArr = new int[1];
                                                                    int[] iArr2 = new int[1];
                                                                    int[] iArr3 = new int[1];
                                                                    int[] iArr4 = iArr;
                                                                    if (i310 != i) {
                                                                        iArr4[0] = i;
                                                                        iArr2[0] = i310;
                                                                        java.lang.Object[] objArr137 = {iArr, iArr2, null, null, iArr3};
                                                                        java.lang.Object[] objArr138 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~((-1732986036) | i)) | 37879954) * 336) + 1106085481 + (((~(i | 317860062)) | (-2012966144)) * (-168)) + (((~(317860062 | i12)) | (-1732986036)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj33 == null) {
                                                                            java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, 2712 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                            java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                                            b(r5[16], (byte) (-$$a[18]), 653, objArr139);
                                                                            obj33 = cls33.getMethod((java.lang.String) objArr139[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                                        }
                                                                        ((int[]) objArr137[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr138)).intValue();
                                                                        return objArr137;
                                                                    }
                                                                    iArr4[0] = i;
                                                                    iArr2[0] = i;
                                                                    java.lang.Object[] objArr140 = {iArr, iArr2, null, null, iArr3};
                                                                    java.lang.Object[] objArr141 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf(((((-1916431370) | i12) * 1444) - 1191286113) + (((~(i | 370786508)) | (-1983638734) | (~(1680059589 | i))) * (-1444)) + 683979106)};
                                                                    java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj34 == null) {
                                                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSize(0, 0), 2713 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                                                        java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                                        b(r5[16], (byte) (-$$a[18]), 653, objArr142);
                                                                        obj34 = cls34.getMethod((java.lang.String) objArr142[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                                    }
                                                                    ((int[]) objArr140[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr141)).intValue();
                                                                    return objArr140;
                                                                }
                                                                i19 = (~(i & 150)) & (i | 150);
                                                                if (i19 != i) {
                                                                }
                                                            }
                                                            i19 = i;
                                                            if (i19 != i) {
                                                            }
                                                        }
                                                    }
                                                    str4 = str3;
                                                    i19 = i;
                                                    if (i19 != i) {
                                                    }
                                                }
                                            }
                                            int defaultSize = android.view.View.getDefaultSize(0, 0);
                                            int i311 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                            java.lang.Object[] objArr143 = new java.lang.Object[1];
                                            a(308 - defaultSize, (i311 & 23) + (i311 | 23), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr143);
                                            java.lang.String str58 = (java.lang.String) objArr143[0];
                                            int i312 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int i313 = -(-android.view.View.MeasureSpec.getMode(0));
                                            java.lang.Object[] objArr144 = new java.lang.Object[1];
                                            a(((i312 | 365) << 1) - (i312 ^ 365), (i313 & 10) + (i313 | 10), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr144);
                                            java.lang.String str59 = (java.lang.String) objArr144[0];
                                            int i314 = -(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                            int i315 = -android.text.TextUtils.indexOf(str28, str28);
                                            int i316 = i315 * 193;
                                            int i317 = (i316 ^ 1351) + ((i316 & 1351) << 1);
                                            int i318 = ~i315;
                                            int i319 = ~((i318 ^ 7) | (i318 & 7));
                                            int i320 = -(-(((i319 & i29) | (i29 ^ i319)) * (-192)));
                                            int i321 = (i317 & i320) + (i317 | i320);
                                            int i322 = (i318 & (-8)) | (i318 ^ (-8));
                                            int i323 = ~i322;
                                            int i324 = (i29 ^ (-8)) | (i29 & (-8));
                                            int i325 = ~i324;
                                            int i326 = ((i323 ^ i325) | (i325 & i323)) * (-384);
                                            int i327 = ~((i322 ^ i) | (i322 & i));
                                            int i328 = ~((i324 & i315) | (i324 ^ i315));
                                            int i329 = (i327 ^ i328) | (i327 & i328);
                                            int i330 = (i315 ^ 7) | (i315 & 7);
                                            int i331 = ~((i330 ^ i) | (i330 & i));
                                            java.lang.Object[] objArr145 = new java.lang.Object[1];
                                            a((i314 ^ 327) + ((i314 & 327) << 1), (i321 ^ i326) + ((i326 & i321) << 1) + (((i331 & i329) | (i331 ^ i329)) * 192), (char) android.view.View.getDefaultSize(0, 0), objArr145);
                                            java.lang.String str60 = (java.lang.String) objArr145[0];
                                            int i332 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            java.lang.Object[] objArr146 = new java.lang.Object[1];
                                            a((i332 ^ 382) + ((i332 & 382) << 1), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 8, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr146);
                                            java.lang.String[] strArr18 = {str58, str59, str60, (java.lang.String) objArr146[0]};
                                            int green = android.graphics.Color.green(0);
                                            int i333 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                            java.lang.Object[] objArr147 = new java.lang.Object[1];
                                            a(green + 390, ((i333 | 16) << 1) - (i333 ^ 16), (char) (14073 - (~android.view.MotionEvent.axisFromString(str28))), objArr147);
                                            java.lang.String str61 = (java.lang.String) objArr147[0];
                                            int i334 = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
                                            int i335 = -android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            int i336 = -(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                            java.lang.Object[] objArr148 = new java.lang.Object[1];
                                            a((i334 & 407) + (i334 | 407), (i335 ^ 6) + ((i335 & 6) << 1), (char) (((41881 | i336) << 1) - (i336 ^ 41881)), objArr148);
                                            java.lang.String str62 = (java.lang.String) objArr148[0];
                                            int myPid = android.os.Process.myPid();
                                            int indexOf5 = android.text.TextUtils.indexOf(str28, str28, 0);
                                            java.lang.Object[] objArr149 = new java.lang.Object[1];
                                            a(413 - (~(myPid >> 22)), ((indexOf5 | 7) << 1) - (indexOf5 ^ 7), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr149);
                                            java.lang.String str63 = (java.lang.String) objArr149[0];
                                            int i337 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            java.lang.Object[] objArr150 = new java.lang.Object[1];
                                            a(((i337 | 421) << 1) - (i337 ^ 421), 10 - (~(-(-android.graphics.Color.red(0)))), (char) android.text.TextUtils.getOffsetBefore(str28, 0), objArr150);
                                            java.lang.String str64 = (java.lang.String) objArr150[0];
                                            java.lang.Object[] objArr151 = new java.lang.Object[1];
                                            a(android.view.KeyEvent.keyCodeFromString(str28) + 432, (android.os.Process.myTid() >> 22) + 14, (char) (0 - (~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))), objArr151);
                                            java.lang.String[] strArr19 = {str61, str62, str63, str64, (java.lang.String) objArr151[0]};
                                            int lastIndexOf3 = android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            int i338 = -(-android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                                            a(lastIndexOf3 + 447, (i338 ^ 17) + ((i338 & 17) << 1), (char) ((-2) - (~(-android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))), objArr152);
                                            java.lang.String str65 = (java.lang.String) objArr152[0];
                                            int alpha = android.graphics.Color.alpha(0);
                                            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                            java.lang.Object[] objArr153 = new java.lang.Object[1];
                                            a(alpha + 462, (keyRepeatDelay & 3) + (keyRepeatDelay | 3), (char) android.text.TextUtils.indexOf(str28, str28, 0, 0), objArr153);
                                            java.lang.String str66 = (java.lang.String) objArr153[0];
                                            int i339 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            int i340 = i339 * (-919);
                                            int i341 = ~i339;
                                            int i342 = i341 | (-474);
                                            int i343 = ~((i342 & i) | (i342 ^ i));
                                            i12 = i29;
                                            int i344 = (i12 ^ (-474)) | (i12 & (-474));
                                            int i345 = ~((i344 ^ i339) | (i344 & i339));
                                            int i346 = ((((-434687) | i340) << 1) - (i340 ^ (-434687))) + (((i343 & i345) | (i345 ^ i343)) * 920);
                                            int i347 = ~((i341 ^ (-474)) | (i341 & (-474)));
                                            int i348 = ~((i341 ^ i12) | (i341 & i12));
                                            int i349 = -(-(((i347 & i348) | (i347 ^ i348)) * 920));
                                            int i350 = ~((i342 & i12) | (i342 ^ i12));
                                            int i351 = ~((i341 ^ 473) | (i341 & 473) | i);
                                            int i352 = (i351 ^ i350) | (i351 & i350);
                                            int i353 = (i339 ^ (-474)) | (i339 & (-474));
                                            int i354 = ~((i353 ^ i) | (i353 & i));
                                            int i355 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                            int i356 = -android.text.TextUtils.indexOf(str28, str28, 0, 0);
                                            java.lang.Object[] objArr154 = new java.lang.Object[1];
                                            a((i346 & i349) + (i349 | i346) + (((i354 ^ i352) | (i354 & i352)) * 920), 21 - (~i355), (char) ((i356 ^ 26770) + ((i356 & 26770) << 1)), objArr154);
                                            java.lang.String str67 = (java.lang.String) objArr154[0];
                                            int i357 = -android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                            int i358 = -(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            java.lang.Object[] objArr155 = new java.lang.Object[1];
                                            a((i357 & 494) + (i357 | 494), (i358 ^ 25) + ((i358 & 25) << 1), (char) (31093 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr155);
                                            java.lang.String str68 = (java.lang.String) objArr155[0];
                                            int i359 = -android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                            int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                            java.lang.Object[] objArr156 = new java.lang.Object[1];
                                            a(((i359 | my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) << 1) - (i359 ^ my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE), (keyRepeatDelay2 ^ 28) + ((keyRepeatDelay2 & 28) << 1), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr156);
                                            java.lang.String[] strArr20 = {str65, str66, str27, str67, str68, (java.lang.String) objArr156[0]};
                                            int i360 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                                            int i361 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            java.lang.Object[] objArr157 = new java.lang.Object[1];
                                            a(547 - (~i360), (maximumFlingVelocity >> 16) + 11, (char) ((i361 ^ 30922) + ((i361 & 30922) << 1)), objArr157);
                                            java.lang.String str69 = (java.lang.String) objArr157[0];
                                            int i362 = -android.view.KeyEvent.keyCodeFromString(str28);
                                            int i363 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            java.lang.Object[] objArr158 = new java.lang.Object[1];
                                            a((i362 ^ 559) + ((i362 & 559) << 1), (i363 ^ 8) + ((i363 & 8) << 1), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr158);
                                            java.lang.String str70 = (java.lang.String) objArr158[0];
                                            int touchSlop2 = android.view.ViewConfiguration.getTouchSlop();
                                            int i364 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int i365 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            java.lang.Object[] objArr159 = new java.lang.Object[1];
                                            a((touchSlop2 >> 8) + 567, (i364 ^ 6) + ((i364 & 6) << 1), (char) ((i365 ^ 1) + ((i365 & 1) << 1)), objArr159);
                                            java.lang.String str71 = (java.lang.String) objArr159[0];
                                            int i366 = -android.os.Process.getGidForName(str28);
                                            java.lang.Object[] objArr160 = new java.lang.Object[1];
                                            i13 = i128;
                                            a(((i366 | 572) << 1) - (i366 ^ 572), 5 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((-2) - (~(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr160);
                                            java.lang.String[] strArr21 = {str69, str70, str71, (java.lang.String) objArr160[0]};
                                            int i367 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int i368 = (i367 * 71) - 40020;
                                            int i369 = ~i367;
                                            int i370 = ~((i369 & 580) | (i369 ^ 580));
                                            int i371 = ~((i ^ 580) | (i & 580));
                                            int i372 = -(-(((i370 ^ i371) | (i370 & i371)) * (-140)));
                                            int i373 = (i367 ^ 580) | (i367 & 580);
                                            int i374 = (i368 ^ i372) + ((i368 & i372) << 1) + ((~((i373 & i) | (i373 ^ i))) * 70);
                                            int i375 = (~(i369 | 580)) | (~(i367 | (-581)));
                                            int i376 = ~((i367 ^ i) | (i367 & i));
                                            int i377 = ((i376 ^ i375) | (i376 & i375)) * 70;
                                            int capsMode4 = android.text.TextUtils.getCapsMode(str28, 0, 0);
                                            int i378 = -(-android.graphics.Color.rgb(0, 0, 0));
                                            java.lang.Object[] objArr161 = new java.lang.Object[1];
                                            a((i374 ^ i377) + ((i377 & i374) << 1), 16 - capsMode4, (char) (((16780386 | i378) << 1) - (i378 ^ 16780386)), objArr161);
                                            java.lang.String str72 = (java.lang.String) objArr161[0];
                                            int i379 = -(-android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                                            a((i379 ^ 415) + ((i379 & 415) << 1), 5 - (~(-android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr162);
                                            java.lang.String str73 = (java.lang.String) objArr162[0];
                                            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                            java.lang.Object[] objArr163 = new java.lang.Object[1];
                                            a((makeMeasureSpec & 382) + (makeMeasureSpec | 382), 8 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.view.KeyEvent.getDeadChar(0, 0), objArr163);
                                            java.lang.String[] strArr22 = {str72, str73, (java.lang.String) objArr163[0]};
                                            java.lang.Object[] objArr164 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 595, 13 - (~(-android.text.TextUtils.indexOf(str28, str28, 0))), (char) (38242 - (~(android.view.ViewConfiguration.getTapTimeout() >> 16))), objArr164);
                                            java.lang.String str74 = (java.lang.String) objArr164[0];
                                            int i380 = -android.view.KeyEvent.keyCodeFromString(str28);
                                            int i381 = (i380 * 860) - 522522;
                                            int i382 = ((i380 ^ i) | (i380 & i)) * (-859);
                                            int i383 = ~(i12 | i380);
                                            int i384 = ~i380;
                                            int i385 = (i384 ^ (-610)) | (i384 & (-610));
                                            int i386 = ~((i385 ^ i) | (i385 & i));
                                            int i387 = ~((i12 ^ (-610)) | (i12 & (-610)));
                                            int i388 = ~(i380 | (-610));
                                            float length3 = android.graphics.PointF.length(0.0f, 0.0f);
                                            int indexOf6 = android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                            j = j11;
                                            java.lang.Object[] objArr165 = new java.lang.Object[1];
                                            a(((((i381 ^ i382) + ((i381 & i382) << 1)) + (((i383 & i386) | (i383 ^ i386)) * 859)) - (~(((i388 ^ i387) | (i388 & i387)) * 859))) - 1, (length3 > 0.0f ? 1 : (length3 == 0.0f ? 0 : -1)) + 1, (char) ((indexOf6 ^ 1) + ((indexOf6 & 1) << 1)), objArr165);
                                            java.lang.String[] strArr23 = {str74, (java.lang.String) objArr165[0]};
                                            int red2 = android.graphics.Color.red(0);
                                            int i389 = -android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            int i390 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                                            int i391 = i390 * (-317);
                                            int i392 = ~i390;
                                            int i393 = (i392 & (-11287)) | (i392 ^ (-11287));
                                            int i394 = ~((i393 ^ i) | (i393 & i));
                                            int i395 = (i12 ^ i390) | (i12 & i390);
                                            int i396 = ~((i395 & 11286) | (i395 ^ 11286));
                                            int i397 = ((((3600234 | i391) << 1) - (i391 ^ 3600234)) - (~(-(-(((i394 & i396) | (i394 ^ i396)) * (-318)))))) - 1;
                                            int i398 = ~((i390 ^ (-11287)) | (i390 & (-11287)));
                                            int i399 = ~((i390 ^ i) | (i390 & i));
                                            int i400 = ((i399 ^ i398) | (i399 & i398)) * (-318);
                                            int i401 = ((i397 | i400) << 1) - (i400 ^ i397);
                                            int i402 = ~((i392 ^ i) | (i392 & i));
                                            int i403 = -(-(((i402 ^ (-11287)) | (i402 & (-11287))) * 318));
                                            char c10 = (char) (((i401 | i403) << 1) - (i403 ^ i401));
                                            java.lang.Object[] objArr166 = new java.lang.Object[1];
                                            a(610 - red2, 7 - (~i389), c10, objArr166);
                                            java.lang.String str75 = (java.lang.String) objArr166[0];
                                            int i404 = -android.graphics.Color.rgb(0, 0, 0);
                                            int i405 = -(-android.graphics.Color.green(0));
                                            int i406 = -(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                            java.lang.Object[] objArr167 = new java.lang.Object[1];
                                            a((-16776598) - (~i404), (i405 & 1) + (i405 | 1), (char) (((48878 | i406) << 1) - (i406 ^ 48878)), objArr167);
                                            java.lang.String[] strArr24 = {str75, (java.lang.String) objArr167[0]};
                                            java.lang.Object[] objArr168 = new java.lang.Object[1];
                                            a(620 - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, (char) (62406 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr168);
                                            java.lang.String str76 = (java.lang.String) objArr168[0];
                                            long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
                                            int i407 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                            java.lang.Object[] objArr169 = new java.lang.Object[1];
                                            a((uptimeMillis2 > 0L ? 1 : (uptimeMillis2 == 0L ? 0 : -1)) + 461, (i407 ^ 3) + ((i407 & 3) << 1), (char) ((-2) - (~(-android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))), objArr169);
                                            java.lang.String str77 = (java.lang.String) objArr169[0];
                                            int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                                            int i408 = -(-android.text.TextUtils.indexOf(str28, str28, 0, 0));
                                            java.lang.Object[] objArr170 = new java.lang.Object[1];
                                            a(407 - resolveOpacity, ((doubleTapTimeout | 7) << 1) - (doubleTapTimeout ^ 7), (char) ((41929 & i408) + (i408 | 41929)), objArr170);
                                            java.lang.String str78 = (java.lang.String) objArr170[0];
                                            int i409 = -(android.os.Process.myTid() >> 22);
                                            int i410 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                            int axisFromString = android.view.MotionEvent.axisFromString(str28);
                                            java.lang.Object[] objArr171 = new java.lang.Object[1];
                                            a((i409 & 636) + (i409 | 636), (i410 & 8) + (i410 | 8), (char) ((axisFromString & 30757) + (axisFromString | 30757)), objArr171);
                                            java.lang.String str79 = (java.lang.String) objArr171[0];
                                            int i411 = -(-android.text.TextUtils.indexOf(str28, str28));
                                            int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                            int i412 = (tapTimeout2 * 141) - 3069;
                                            int i413 = -(-(((i ^ 11) | (i & 11)) * 140));
                                            int i414 = ~tapTimeout2;
                                            int i415 = ~(i414 | 11);
                                            int i416 = ~((i12 ^ 11) | (i12 & 11));
                                            int i417 = (((i412 ^ i413) + ((i412 & i413) << 1)) - (~(((i416 ^ i415) | (i415 & i416)) * (-280)))) - 1;
                                            int i418 = ~((tapTimeout2 ^ (-12)) | (tapTimeout2 & (-12)));
                                            int i419 = ~((tapTimeout2 ^ i12) | (tapTimeout2 & i12));
                                            int i420 = (i419 ^ i418) | (i419 & i418);
                                            int i421 = ~((i414 & 11) | (i414 ^ 11) | i);
                                            int i422 = ((i420 ^ i421) | (i420 & i421)) * 140;
                                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                                            a(420 - (~i411), ((i417 | i422) << 1) - (i422 ^ i417), (char) android.view.View.getDefaultSize(0, 0), objArr172);
                                            java.lang.String str80 = (java.lang.String) objArr172[0];
                                            int i423 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                            int i424 = -android.text.TextUtils.indexOf(str28, str28, 0);
                                            int i425 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                            java.lang.Object[] objArr173 = new java.lang.Object[1];
                                            a(((i423 | 432) << 1) - (i423 ^ 432), (i424 ^ 14) + ((i424 & 14) << 1), (char) ((i425 & 1) + (i425 | 1)), objArr173);
                                            java.lang.String[] strArr25 = {str76, str77, str78, str79, str80, (java.lang.String) objArr173[0]};
                                            int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                                            int i426 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                            int i427 = i426 * 319;
                                            int i428 = (i427 ^ (-6340)) + ((i427 & (-6340)) << 1);
                                            int i429 = ~i426;
                                            int i430 = ~((i429 ^ i) | (i429 & i));
                                            int i431 = -(-(((i430 ^ (-21)) | (i430 & (-21))) * (-318)));
                                            int i432 = ((i428 | i431) << 1) - (i431 ^ i428);
                                            int i433 = -(-(((~((i ^ (-21)) | (i & (-21)))) | (~((i12 ^ i426) | (i12 & i426) | 20))) * 318));
                                            int i434 = (i12 ^ (-21)) | (i12 & (-21));
                                            int i435 = (i426 & 20) | (i426 ^ 20);
                                            int i436 = -(-android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                            java.lang.Object[] objArr174 = new java.lang.Object[1];
                                            a(combineMeasuredStates + 644, (((i432 | i433) << 1) - (i433 ^ i432)) + (((~((i426 ^ i434) | (i434 & i426))) | (~((i435 & i) | (i435 ^ i)))) * 318), (char) ((59372 ^ i436) + ((i436 & 59372) << 1)), objArr174);
                                            java.lang.String str81 = (java.lang.String) objArr174[0];
                                            int i437 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i438 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                            java.lang.Object[] objArr175 = new java.lang.Object[1];
                                            a((i437 & 664) + (i437 | 664), (i438 ^ 18) + ((i438 & 18) << 1), (char) android.view.View.resolveSize(0, 0), objArr175);
                                            java.lang.String str82 = (java.lang.String) objArr175[0];
                                            int alpha2 = android.graphics.Color.alpha(0);
                                            int i439 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                            int i440 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                            java.lang.Object[] objArr176 = new java.lang.Object[1];
                                            a(alpha2 + 683, (i439 & 31) + (i439 | 31), (char) ((i440 ^ 1) + ((i440 & 1) << 1)), objArr176);
                                            java.lang.String str83 = (java.lang.String) objArr176[0];
                                            int i441 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                            java.lang.Object[] objArr177 = new java.lang.Object[1];
                                            a((i441 & 714) + (i441 | 714), 25 - android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 27664), objArr177);
                                            java.lang.String str84 = (java.lang.String) objArr177[0];
                                            int rgb2 = android.graphics.Color.rgb(0, 0, 0);
                                            int red3 = android.graphics.Color.red(0);
                                            java.lang.Object[] objArr178 = new java.lang.Object[1];
                                            a(((16777956 | rgb2) << 1) - (rgb2 ^ 16777956), ((red3 | 23) << 1) - (red3 ^ 23), (char) android.text.TextUtils.indexOf(str28, str28, 0), objArr178);
                                            java.lang.String str85 = (java.lang.String) objArr178[0];
                                            float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                                            int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                            int i442 = -(-android.view.MotionEvent.axisFromString(str28));
                                            java.lang.Object[] objArr179 = new java.lang.Object[1];
                                            a(763 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), (scrollBarFadeDuration ^ 33) + ((scrollBarFadeDuration & 33) << 1), (char) (((i442 | 1) << 1) - (i442 ^ 1)), objArr179);
                                            java.lang.String[] strArr26 = {str81, str82, str83, str84, str85, (java.lang.String) objArr179[0], str27};
                                            int i443 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                            int i444 = -android.view.View.MeasureSpec.getSize(0);
                                            int i445 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                            java.lang.Object[] objArr180 = new java.lang.Object[1];
                                            a(794 - (~i443), ((i444 | 13) << 1) - (i444 ^ 13), (char) ((63132 & i445) + (i445 | 63132)), objArr180);
                                            java.lang.String str86 = (java.lang.String) objArr180[0];
                                            int i446 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                            int lastIndexOf4 = android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            int i447 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            java.lang.Object[] objArr181 = new java.lang.Object[1];
                                            a((i446 ^ 375) + ((i446 & 375) << 1), lastIndexOf4 + 8, (char) ((i447 & 1) + (i447 | 1)), objArr181);
                                            java.lang.String[] strArr27 = {str86, (java.lang.String) objArr181[0]};
                                            int indexOf7 = android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                            int offsetAfter = android.text.TextUtils.getOffsetAfter(str28, 0);
                                            int i448 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                                            a((indexOf7 ^ 810) + ((indexOf7 & 810) << 1), offsetAfter + 30, (char) (((i448 | 7166) << 1) - (i448 ^ 7166)), objArr182);
                                            java.lang.String str87 = (java.lang.String) objArr182[0];
                                            int green2 = android.graphics.Color.green(0);
                                            int indexOf8 = android.text.TextUtils.indexOf(str28, str28, 0);
                                            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                                            char c11 = (char) (((normalizeMetaState | 6025) << 1) - (normalizeMetaState ^ 6025));
                                            java.lang.Object[] objArr183 = new java.lang.Object[1];
                                            a(green2 + 839, 11 - indexOf8, c11, objArr183);
                                            java.lang.String[] strArr28 = {str87, (java.lang.String) objArr183[0]};
                                            int axisFromString2 = android.view.MotionEvent.axisFromString(str28);
                                            int i449 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                            java.lang.Object[] objArr184 = new java.lang.Object[1];
                                            a((axisFromString2 & 851) + (axisFromString2 | 851), ((i449 | 19) << 1) - (i449 ^ 19), (char) android.view.KeyEvent.getDeadChar(0, 0), objArr184);
                                            java.lang.String str88 = (java.lang.String) objArr184[0];
                                            int i450 = -(-(android.os.Process.myPid() >> 22));
                                            int i451 = -(android.os.Process.myPid() >> 22);
                                            int i452 = -android.graphics.Color.blue(0);
                                            java.lang.Object[] objArr185 = new java.lang.Object[1];
                                            a((i450 & 869) + (i450 | 869), 4 - (~i451), (char) ((i452 ^ 27403) + ((i452 & 27403) << 1)), objArr185);
                                            java.lang.String[] strArr29 = {str88, (java.lang.String) objArr185[0]};
                                            int blue3 = android.graphics.Color.blue(0);
                                            int i453 = blue3 * 51;
                                            int i454 = (((((-42826) | i453) << 1) - (i453 ^ (-42826))) - (~(-(-(((blue3 ^ i) | (blue3 & i)) * (-50)))))) - 1;
                                            int i455 = ~blue3;
                                            int i456 = (i455 ^ (-875)) | (i455 & (-875));
                                            int i457 = ~((i456 ^ i) | (i456 & i));
                                            int i458 = (i12 ^ (-875)) | (i12 & (-875));
                                            int i459 = ~(i458 | blue3);
                                            int i460 = -(-(((i457 ^ i459) | (i457 & i459)) * 50));
                                            int i461 = (i454 ^ i460) + ((i460 & i454) << 1);
                                            int i462 = ~i458;
                                            int i463 = ~((blue3 ^ (-875)) | (blue3 & (-875)));
                                            int i464 = (i462 ^ i463) | (i462 & i463);
                                            int i465 = ~((blue3 ^ i12) | (blue3 & i12));
                                            int i466 = ((i464 ^ i465) | (i465 & i464)) * 50;
                                            int threadPriority2 = android.os.Process.getThreadPriority(0);
                                            java.lang.Object[] objArr186 = new java.lang.Object[1];
                                            a((i461 ^ i466) + ((i466 & i461) << 1), 18 - (~(-(-(((threadPriority2 ^ 20) + ((threadPriority2 & 20) << 1)) >> 6)))), (char) android.graphics.Color.alpha(0), objArr186);
                                            java.lang.String[] strArr30 = {(java.lang.String) objArr186[0]};
                                            java.lang.Object[] objArr187 = new java.lang.Object[1];
                                            a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 893, 14 - (~(-android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr187);
                                            java.lang.String[] strArr31 = {(java.lang.String) objArr187[0]};
                                            java.lang.Object[] objArr188 = new java.lang.Object[1];
                                            a(910 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 19 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr188);
                                            java.lang.String[] strArr32 = {(java.lang.String) objArr188[0]};
                                            int i467 = -android.text.TextUtils.getTrimmedLength(str28);
                                            java.lang.Object[] objArr189 = new java.lang.Object[1];
                                            a(((i467 | com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE) << 1) - (i467 ^ com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE), 19 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-2) - (~(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr189);
                                            java.lang.String[] strArr33 = {(java.lang.String) objArr189[0]};
                                            int green3 = android.graphics.Color.green(0);
                                            int i468 = -(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                            java.lang.Object[] objArr190 = new java.lang.Object[1];
                                            a(green3 + 947, (i468 & 23) + (i468 | 23), (char) (39308 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8))))), objArr190);
                                            java.lang.String[] strArr34 = {(java.lang.String) objArr190[0]};
                                            int capsMode5 = android.text.TextUtils.getCapsMode(str28, 0, 0);
                                            int i469 = capsMode5 * (-589);
                                            int i470 = (573270 & i469) + (i469 | 573270);
                                            int i471 = ~((i12 ^ (-971)) | (i12 & (-971)));
                                            int i472 = ~((capsMode5 ^ (-971)) | (capsMode5 & (-971)));
                                            int i473 = ~((i12 ^ capsMode5) | (i12 & capsMode5));
                                            int i474 = i471 | i472 | i473;
                                            int i475 = ~capsMode5;
                                            int i476 = (i475 & 970) | (i475 ^ 970);
                                            int i477 = ~((i476 ^ i) | (i476 & i));
                                            int i478 = -(-(((i474 ^ i477) | (i474 & i477)) * 590));
                                            int i479 = ~(i12 | (-971));
                                            int i480 = (i472 ^ i479) | (i479 & i472);
                                            int i481 = ((((i470 | i478) << 1) - (i478 ^ i470)) - (~(-(-(((i480 & i473) | (i480 ^ i473)) * (-1180)))))) - 1;
                                            int i482 = ((~((i475 & i12) | (i475 ^ i12))) | (~((i12 ^ 970) | (i12 & 970)))) * 590;
                                            int offsetAfter2 = android.text.TextUtils.getOffsetAfter(str28, 0);
                                            int i483 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                            java.lang.Object[] objArr191 = new java.lang.Object[1];
                                            a((i481 ^ i482) + ((i482 & i481) << 1), offsetAfter2 + 21, (char) ((i483 ^ 5813) + ((i483 & 5813) << 1)), objArr191);
                                            java.lang.String[] strArr35 = {(java.lang.String) objArr191[0]};
                                            int i484 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                            int keyRepeatDelay3 = android.view.ViewConfiguration.getKeyRepeatDelay();
                                            int i485 = -(-(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                            java.lang.Object[] objArr192 = new java.lang.Object[1];
                                            a(((i484 | 991) << 1) - (i484 ^ 991), (keyRepeatDelay3 >> 16) + 24, (char) ((46244 & i485) + (i485 | 46244)), objArr192);
                                            java.lang.String[] strArr36 = {(java.lang.String) objArr192[0], str27};
                                            java.lang.Object[] objArr193 = new java.lang.Object[1];
                                            a(1015 - android.text.TextUtils.indexOf(str28, str28, 0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27, (char) (46240 - (~(-android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))), objArr193);
                                            java.lang.String[] strArr37 = {(java.lang.String) objArr193[0], str27};
                                            java.lang.Object[] objArr194 = new java.lang.Object[1];
                                            a(1041 - (~(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 25 - (~(-(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))), (char) android.graphics.Color.green(0), objArr194);
                                            java.lang.String[] strArr38 = {(java.lang.String) objArr194[0], str27};
                                            int mode2 = android.view.View.MeasureSpec.getMode(0);
                                            int i486 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                            int i487 = -(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                            java.lang.Object[] objArr195 = new java.lang.Object[1];
                                            a(mode2 + 1070, ((i486 | 31) << 1) - (i486 ^ 31), (char) (((i487 | 29937) << 1) - (i487 ^ 29937)), objArr195);
                                            java.lang.String[] strArr39 = {(java.lang.String) objArr195[0], str27};
                                            int i488 = -android.view.MotionEvent.axisFromString(str28);
                                            int i489 = (i488 * 592) - 649000;
                                            int i490 = ~i488;
                                            int i491 = -(-((~((i490 ^ 1100) | (i490 & 1100))) * (-1182)));
                                            int i492 = i490 | (-1101);
                                            int i493 = ~((i492 ^ i12) | (i492 & i12));
                                            int i494 = ~((i488 ^ 1100) | (i488 & 1100));
                                            int i495 = (i490 & i) | (i ^ i490);
                                            java.lang.Object[] objArr196 = new java.lang.Object[1];
                                            a((((((i489 | i491) << 1) - (i489 ^ i491)) - (~(((i494 ^ i493) | (i494 & i493)) * (-591)))) - 1) + (((i495 & (-1101)) | (i495 ^ (-1101))) * 591), android.view.KeyEvent.getDeadChar(0, 0) + 27, (char) android.view.View.MeasureSpec.getSize(0), objArr196);
                                            java.lang.String[] strArr40 = {(java.lang.String) objArr196[0], str27};
                                            int i496 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                            int i497 = -android.text.TextUtils.indexOf(str28, str28, 0, 0);
                                            java.lang.Object[] objArr197 = new java.lang.Object[1];
                                            a((i496 ^ 1128) + ((i496 & 1128) << 1), (i497 ^ 32) + ((i497 & 32) << 1), (char) android.graphics.Color.red(0), objArr197);
                                            char c12 = 0;
                                            java.lang.String[][] strArr41 = {strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, new java.lang.String[]{(java.lang.String) objArr197[0], str27}};
                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                            int i498 = i;
                                            int i499 = 0;
                                            int i500 = 0;
                                            while (i499 < 24) {
                                                java.lang.String[] strArr42 = strArr41[i499];
                                                java.lang.Object[] objArr198 = {strArr42[c12]};
                                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj35 == null) {
                                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1920, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                    byte[] bArr14 = $$a;
                                                    byte b31 = (byte) (bArr14[20] - 1);
                                                    byte b32 = (byte) (bArr14[16] - 1);
                                                    strArr = strArr41;
                                                    java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                    b(b31, b32, b32, objArr199);
                                                    obj35 = cls35.getMethod((java.lang.String) objArr199[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj35);
                                                } else {
                                                    strArr = strArr41;
                                                }
                                                java.lang.String str89 = (java.lang.String) ((java.lang.reflect.Method) obj35).invoke(null, objArr198);
                                                java.lang.String[] strArr43 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr42, 1, strArr42.length);
                                                if (str89 != null && str89.length() != 0) {
                                                    int i501 = valueOf;
                                                    IccPrivateKeyCrtComponentsJson = (((i501 | 87) << 1) - (i501 ^ 87)) % 128;
                                                    if (strArr42.length != 1) {
                                                        int length4 = strArr43.length;
                                                        for (int i502 = 0; i502 < length4; i502 = ((i502 | 1) << 1) - (i502 ^ 1)) {
                                                            if (!str89.contains(strArr43[i502])) {
                                                            }
                                                        }
                                                    }
                                                    int i503 = ((i500 | 60) << 1) - (i500 ^ 60);
                                                    i500 = ((i503 | (-59)) << 1) - (i503 ^ (-59));
                                                    int i504 = i499 + 10;
                                                    i498 = (~(i & i504)) & (i504 | i);
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                    sb.append(str89);
                                                    int minimumFlingVelocity3 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                    int i505 = minimumFlingVelocity3 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION;
                                                    int i506 = ((-1047480) ^ i505) + ((i505 & (-1047480)) << 1);
                                                    int i507 = ~minimumFlingVelocity3;
                                                    int i508 = -(-(((~((i12 & 1160) | (i12 ^ 1160))) | (~((i507 ^ i) | (i507 & i)))) * (-1808)));
                                                    int i509 = ~((i507 ^ (-1161)) | (i507 & (-1161)) | i);
                                                    int i510 = minimumFlingVelocity3 | i12;
                                                    int i511 = ~(i510 | 1160);
                                                    int i512 = (i506 ^ i508) + ((i506 & i508) << 1) + (((i509 & i511) | (i509 ^ i511)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                                                    int i513 = ~((i507 & 1160) | (i507 ^ 1160));
                                                    int i514 = ~((i ^ (-1161)) | (i & (-1161)));
                                                    int i515 = (i513 ^ i514) | (i513 & i514);
                                                    int i516 = ~i510;
                                                    int i517 = ((i516 ^ i515) | (i516 & i515)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
                                                    java.lang.Object[] objArr200 = new java.lang.Object[1];
                                                    a((i512 ^ i517) + ((i517 & i512) << 1), 0 - (~android.view.View.MeasureSpec.getSize(0)), (char) (45583 - (~(-(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))))), objArr200);
                                                    sb.append((java.lang.String) objArr200[0]);
                                                    sb.append(str89);
                                                    arrayList.add(sb.toString());
                                                    int i518 = valueOf;
                                                    IccPrivateKeyCrtComponentsJson = (((i518 | 1) << 1) - (i518 ^ 1)) % 128;
                                                    break;
                                                }
                                                i499 = ((i499 & 78) + (i499 | 78)) - 77;
                                                strArr41 = strArr;
                                                c12 = 0;
                                            }
                                            if (i500 > 2) {
                                                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i498}, arrayList, null, new int[1]};
                                                java.lang.Object[] objArr201 = {num5, num5, java.lang.Integer.valueOf((((~((-630779924) | i)) | 555253761) * (-283)) + 273870508 + ((~((-75526163) | i)) * 283))};
                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj36 == null) {
                                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.view.View.combineMeasuredStates(0, 0));
                                                    java.lang.Object[] objArr202 = new java.lang.Object[1];
                                                    b(r9[16], (byte) (-$$a[18]), 653, objArr202);
                                                    obj36 = cls36.getMethod((java.lang.String) objArr202[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                                }
                                                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr201)).intValue();
                                                c = 0;
                                                ((int[]) objArr[4])[0] = intValue2;
                                            } else {
                                                java.lang.Object[] objArr203 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                java.lang.Object[] objArr204 = {num5, num5, java.lang.Integer.valueOf(((((~((-992578473) | i)) | (-1058267626)) * (-948)) - 92928803) + ((~((-989954473) | i12)) * (-948)) + 1807414348)};
                                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj37 == null) {
                                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.TextUtils.getCapsMode(str28, 0, 0) + 2713, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                    java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                    b(r8[16], (byte) (-$$a[18]), 653, objArr205);
                                                    obj37 = cls37.getMethod((java.lang.String) objArr205[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                }
                                                c = 0;
                                                ((int[]) objArr203[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr204)).intValue();
                                                objArr = objArr203;
                                            }
                                            int i519 = ((int[]) objArr[1])[c];
                                            if (i519 != i) {
                                                int i520 = IccPrivateKeyCrtComponentsJson;
                                                valueOf = ((i520 & 43) + (i520 | 43)) % 128;
                                                java.lang.Object[] objArr206 = {new int[]{i}, new int[]{i519}, (java.util.List) objArr[2], null, new int[1]};
                                                java.lang.Object[] objArr207 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(i | 273474557)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 668355031) + (((-1773144065) | i12) * (-216)) + (((~(i12 | 273474557)) | 1777371540) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj38 == null) {
                                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((-1) - android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                    java.lang.Object[] objArr208 = new java.lang.Object[1];
                                                    b(r5[16], (byte) (-$$a[18]), 653, objArr208);
                                                    obj38 = cls38.getMethod((java.lang.String) objArr208[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                                }
                                                ((int[]) objArr206[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr207)).intValue();
                                                return objArr206;
                                            }
                                            int i1512 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                            int i1522 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            java.lang.Object[] objArr812 = new java.lang.Object[1];
                                            a(445 - (~i1512), (i1522 & 15) + (i1522 | 15), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr812);
                                            java.lang.Object[] objArr822 = {(java.lang.String) objArr812[0]};
                                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj2 == null) {
                                            }
                                            invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr822);
                                            if (invoke != null) {
                                            }
                                            if (i14 != 1986687685) {
                                                int minimumFlingVelocity4 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                int i1542 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                int i1552 = -android.graphics.Color.blue(0);
                                                java.lang.Object[] objArr862 = new java.lang.Object[1];
                                                a((minimumFlingVelocity4 & 1161) + (minimumFlingVelocity4 | 1161), 14 - (~i1542), (char) ((57203 ^ i1552) + ((i1552 & 57203) << 1)), objArr862);
                                                java.lang.String str292 = (java.lang.String) objArr862[0];
                                                long uptimeMillis3 = android.os.SystemClock.uptimeMillis();
                                                int mode3 = android.view.View.MeasureSpec.getMode(0);
                                                java.lang.Object[] objArr872 = new java.lang.Object[1];
                                                a(1176 - (uptimeMillis3 > 0L ? 1 : (uptimeMillis3 == 0L ? 0 : -1)), (mode3 ^ 26) + ((mode3 & 26) << 1), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr872);
                                                java.lang.String str302 = (java.lang.String) objArr872[0];
                                                int i1562 = -(-android.view.KeyEvent.normalizeMetaState(0));
                                                int i1572 = -(-(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                java.lang.Object[] objArr882 = new java.lang.Object[1];
                                                a(((i1562 | 1201) << 1) - (i1562 ^ 1201), (i1572 ^ 17) + ((i1572 & 17) << 1), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr882);
                                                java.lang.String str312 = (java.lang.String) objArr882[0];
                                                int red4 = android.graphics.Color.red(0);
                                                int i1582 = -(-android.text.TextUtils.indexOf(str28, str28, 0, 0));
                                                int i1592 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                int i1602 = i1592 * 50;
                                                int i1612 = ((-5117623) & i1602) + (i1602 | (-5117623));
                                                int i1622 = ~(((-52760) ^ i12) | ((-52760) & i12));
                                                int i1632 = ~(((-52760) ^ i1592) | ((-52760) & i1592));
                                                int i1642 = ((i1622 ^ i1632) | (i1622 & i1632)) * 98;
                                                int i1652 = (i1612 & i1642) + (i1642 | i1612);
                                                int i1662 = ~i1592;
                                                int i1672 = ~((i1662 ^ i12) | (i1662 & i12));
                                                int i1682 = (i1672 ^ (-52760)) | ((-52760) & i1672);
                                                int i1692 = ~((i1592 ^ i) | (i1592 & i));
                                                int i1702 = -(-(((i1682 ^ i1692) | (i1682 & i1692)) * (-49)));
                                                int i1712 = ~(((-52760) ^ i) | ((-52760) & i));
                                                int i1722 = ~((i1592 ^ 52759) | (52759 & i1592));
                                                char c62 = (char) ((i1652 ^ i1702) + ((i1702 & i1652) << 1) + (((i1722 ^ i1712) | (i1722 & i1712)) * 49));
                                                java.lang.Object[] objArr892 = new java.lang.Object[1];
                                                a(1218 - red4, 16 - (~i1582), c62, objArr892);
                                                java.lang.String str322 = (java.lang.String) objArr892[0];
                                                int lastIndexOf5 = android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                int i1732 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int threadPriority3 = android.os.Process.getThreadPriority(0);
                                                char c72 = (char) (4410 - (~(((threadPriority3 ^ 20) + ((threadPriority3 & 20) << 1)) >> 6)));
                                                java.lang.Object[] objArr902 = new java.lang.Object[1];
                                                a((lastIndexOf5 & 1236) + (lastIndexOf5 | 1236), (i1732 ^ 15) + ((i1732 & 15) << 1), c72, objArr902);
                                                java.lang.String str332 = (java.lang.String) objArr902[0];
                                                int i1742 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                int i1752 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                int i1762 = -android.text.TextUtils.getCapsMode(str28, 0, 0);
                                                int i1772 = (i1762 * 165) - 1358605;
                                                int i1782 = ~((i12 ^ 8335) | (i12 & 8335));
                                                int i1792 = ((i1782 ^ i1762) | (i1782 & i1762)) * (-328);
                                                int i1802 = ((i1772 | i1792) << 1) - (i1772 ^ i1792);
                                                int i1812 = (i1762 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                                                int i1822 = i1762 | i12;
                                                char c82 = (char) ((((i1802 & i1812) + (i1812 | i1802)) - (~((((~((~i1762) | (-8336))) | (~((i ^ (-8336)) | (i & (-8336))))) | (~((i1822 & 8335) | (i1822 ^ 8335)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) - 1);
                                                java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                a(((i1742 | 1250) << 1) - (i1742 ^ 1250), 36 - (~i1752), c82, objArr912);
                                                java.lang.String str342 = (java.lang.String) objArr912[0];
                                                int i1832 = -(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                int windowTouchSlop2 = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                                                java.lang.Object[] objArr922 = new java.lang.Object[1];
                                                a((i1832 & 1287) + (i1832 | 1287), ((windowTouchSlop2 | 12) << 1) - (windowTouchSlop2 ^ 12), (char) android.view.KeyEvent.keyCodeFromString(str28), objArr922);
                                                java.lang.String str352 = (java.lang.String) objArr922[0];
                                                int resolveSize3 = android.view.View.resolveSize(0, 0);
                                                int keyCodeFromString3 = android.view.KeyEvent.keyCodeFromString(str28);
                                                int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                                                java.lang.Object[] objArr932 = new java.lang.Object[1];
                                                a(((resolveSize3 | 1299) << 1) - (resolveSize3 ^ 1299), 13 - keyCodeFromString3, (char) ((scrollBarSize2 & 21548) + (scrollBarSize2 | 21548)), objArr932);
                                                java.lang.String str362 = (java.lang.String) objArr932[0];
                                                int packedPositionGroup2 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                int resolveSize22 = android.view.View.resolveSize(0, 0);
                                                java.lang.Object[] objArr942 = new java.lang.Object[1];
                                                a(1312 - packedPositionGroup2, ((resolveSize22 | 22) << 1) - (resolveSize22 ^ 22), (char) android.text.TextUtils.getTrimmedLength(str28), objArr942);
                                                java.lang.String str372 = (java.lang.String) objArr942[0];
                                                int i1842 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                                int blue22 = android.graphics.Color.blue(0);
                                                java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                a(((i1842 | 1335) << 1) - (i1842 ^ 1335), ((blue22 | 31) << 1) - (blue22 ^ 31), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr952);
                                                java.lang.String str382 = (java.lang.String) objArr952[0];
                                                java.lang.Object[] objArr962 = new java.lang.Object[1];
                                                a(1365 - android.graphics.Color.alpha(0), 11 - android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (15317 - (~(-android.view.KeyEvent.keyCodeFromString(str28)))), objArr962);
                                                java.lang.String str392 = (java.lang.String) objArr962[0];
                                                int i1852 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                int i1862 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                java.lang.Object[] objArr972 = new java.lang.Object[1];
                                                a((i1852 & 1377) + (i1852 | 1377), ((i1862 | 12) << 1) - (i1862 ^ 12), (char) ((-2) - (~(-(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr972);
                                                java.lang.String str402 = (java.lang.String) objArr972[0];
                                                int i1872 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                float length5 = android.graphics.PointF.length(0.0f, 0.0f);
                                                int i1882 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                java.lang.Object[] objArr982 = new java.lang.Object[1];
                                                a((i1872 ^ 1388) + ((i1872 & 1388) << 1), (length5 > 0.0f ? 1 : (length5 == 0.0f ? 0 : -1)) + 12, (char) ((46506 ^ i1882) + ((i1882 & 46506) << 1)), objArr982);
                                                java.lang.String str412 = (java.lang.String) objArr982[0];
                                                int i1892 = -android.text.TextUtils.indexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                java.lang.Object[] objArr992 = new java.lang.Object[1];
                                                a((i1892 ^ my.com.softspace.common.util.ScreenUtil.DEVICE_SCREEN_INFO_PX_RES_WIDTH) + ((i1892 & my.com.softspace.common.util.ScreenUtil.DEVICE_SCREEN_INFO_PX_RES_WIDTH) << 1), 11 - (~(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), (char) android.graphics.Color.argb(0, 0, 0, 0), objArr992);
                                                java.lang.String str422 = (java.lang.String) objArr992[0];
                                                int lastIndexOf22 = android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                int i1902 = -(-android.view.KeyEvent.keyCodeFromString(str28));
                                                int i1912 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                                a(1413 - (~lastIndexOf22), (i1902 ^ 12) + ((i1902 & 12) << 1), (char) ((i1912 ^ 18511) + ((i1912 & 18511) << 1)), objArr1002);
                                                java.lang.String str432 = (java.lang.String) objArr1002[0];
                                                int offsetBefore2 = android.text.TextUtils.getOffsetBefore(str28, 0);
                                                java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                                a((offsetBefore2 ^ 1425) + ((offsetBefore2 & 1425) << 1), 13 - (~(-android.view.KeyEvent.keyCodeFromString(str28))), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr1012);
                                                java.lang.String str442 = (java.lang.String) objArr1012[0];
                                                int capsMode22 = android.text.TextUtils.getCapsMode(str28, 0, 0);
                                                int i1922 = -(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                int i1932 = -(-android.graphics.Color.rgb(0, 0, 0));
                                                java.lang.Object[] objArr1022 = new java.lang.Object[1];
                                                a(1439 - capsMode22, (i1922 & 12) + (i1922 | 12), (char) ((16828956 ^ i1932) + ((i1932 & 16828956) << 1)), objArr1022);
                                                java.lang.String str452 = (java.lang.String) objArr1022[0];
                                                int i1942 = -(android.os.Process.myPid() >> 22);
                                                java.lang.Object[] objArr1032 = new java.lang.Object[1];
                                                a((i1942 ^ 1451) + ((i1942 & 1451) << 1), 24 - (~(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (char) (48328 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))))), objArr1032);
                                                java.lang.String str462 = (java.lang.String) objArr1032[0];
                                                int i1952 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                int i1962 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i1972 = i1962 * 491;
                                                int i1982 = (i1972 & (-13692)) + (i1972 | (-13692));
                                                int i1992 = ~i1962;
                                                int i2002 = (i1992 ^ (-29)) | (i1992 & (-29));
                                                int i2012 = -(-(((i2002 ^ i12) | (i2002 & i12)) * (-490)));
                                                int i2022 = (i1982 & i2012) + (i1982 | i2012);
                                                int i2032 = -(-(((~((i1962 ^ (-29)) | (i1962 & (-29)))) | (~((i ^ (-29)) | (i & (-29))))) * 490));
                                                int i2042 = ((i2022 | i2032) << 1) - (i2032 ^ i2022);
                                                int i2052 = -(-(i1992 * 490));
                                                int i2062 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                java.lang.Object[] objArr1042 = new java.lang.Object[1];
                                                a(((i1952 | 1476) << 1) - (i1952 ^ 1476), (i2042 ^ i2052) + ((i2052 & i2042) << 1), (char) ((i2062 & 1) + (i2062 | 1)), objArr1042);
                                                java.lang.String[] strArr92 = {str292, str302, str312, str322, str332, str342, str352, str362, str372, str382, str392, str402, str412, str422, str432, str442, str452, str462, (java.lang.String) objArr1042[0]};
                                                i22 = 0;
                                                while (i22 < 19) {
                                                }
                                                str8 = str28;
                                                i23 = -1;
                                                if (i23 >= 0) {
                                                }
                                                str28 = str8;
                                            }
                                            int i2182 = -android.graphics.Color.argb(0, 0, 0, 0);
                                            int indexOf42 = android.text.TextUtils.indexOf(str28, str28, 0);
                                            int i2192 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                            a((i2182 & 1503) + (i2182 | 1503), (indexOf42 & 13) + (indexOf42 | 13), (char) ((i2192 ^ 23250) + ((i2192 & 23250) << 1)), objArr1132);
                                            java.lang.String str492 = (java.lang.String) objArr1132[0];
                                            int i2202 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            int i2212 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i2222 = -android.text.TextUtils.lastIndexOf(str28, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                            a((i2202 ^ 1515) + ((i2202 & 1515) << 1), 4 - (~i2212), (char) ((i2222 & 26435) + (i2222 | 26435)), objArr1142);
                                            java.lang.String[] strArr112 = {str492, (java.lang.String) objArr1142[0]};
                                            int i2232 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                            long currentThreadTimeMillis2 = android.os.SystemClock.currentThreadTimeMillis();
                                            int i2242 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                            a(((i2232 | 1521) << 1) - (i2232 ^ 1521), (currentThreadTimeMillis2 > (-1L) ? 1 : (currentThreadTimeMillis2 == (-1L) ? 0 : -1)) + 14, (char) (((i2242 | androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED) << 1) - (i2242 ^ androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED)), objArr1152);
                                            java.lang.String str502 = (java.lang.String) objArr1152[0];
                                            int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(0, 0);
                                            int i2252 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                            a((absoluteGravity2 & 1536) + (absoluteGravity2 | 1536), (i2252 ^ 20) + ((i2252 & 20) << 1), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), objArr1162);
                                            java.lang.String str512 = (java.lang.String) objArr1162[0];
                                            int capsMode32 = android.text.TextUtils.getCapsMode(str28, 0, 0);
                                            int i2262 = capsMode32 * (-109);
                                            int i2272 = ~capsMode32;
                                            int i2282 = ~((i ^ 1555) | (i & 1555));
                                            int i2292 = ~((capsMode32 ^ 1555) | (capsMode32 & 1555));
                                            int i2302 = ~(i | 1555);
                                            int i2312 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                                            java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                            a((i2262 ^ 172605) + ((i2262 & 172605) << 1) + (((i2282 & i2272) | (i2272 ^ i2282)) * (-220)) + (((i2292 & i2302) | (i2292 ^ i2302)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((~((capsMode32 & (-1556)) | (capsMode32 ^ (-1556)))) | (~(i2272 | 1555))) * 110), (i2312 ^ 14) + ((i2312 & 14) << 1), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr1172);
                                            java.lang.String[] strArr122 = {str502, str512, (java.lang.String) objArr1172[0]};
                                            int argb2 = android.graphics.Color.argb(0, 0, 0, 0);
                                            int i2322 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                            int i2332 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                            a(argb2 + 1569, ((i2322 | 20) << 1) - (i2322 ^ 20), (char) ((i2332 & androidx.media3.muxer.WebmConstants.MkvEbmlElement.SIGNATURE_ELEMENT_LIST) + (i2332 | androidx.media3.muxer.WebmConstants.MkvEbmlElement.SIGNATURE_ELEMENT_LIST)), objArr1182);
                                            java.lang.String str522 = (java.lang.String) objArr1182[0];
                                            int i2342 = -android.graphics.Color.red(0);
                                            int i2352 = -(-android.view.View.MeasureSpec.getMode(0));
                                            java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                            a(1589 - (~i2342), (i2352 & 10) + (i2352 | 10), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr1192);
                                            java.lang.String[] strArr132 = {str522, (java.lang.String) objArr1192[0]};
                                            int i2362 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                            a((i2362 ^ 1600) + ((i2362 & 1600) << 1), (-16777206) - (~(-android.graphics.Color.rgb(0, 0, 0))), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr1202);
                                            java.lang.String str532 = (java.lang.String) objArr1202[0];
                                            int i2372 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                            int i2382 = -(-android.view.KeyEvent.normalizeMetaState(0));
                                            char mirror2 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            char c92 = (char) (((mirror2 | 28322) << 1) - (mirror2 ^ 28322));
                                            java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                            a((i2372 & com.visa.cbp.getCertUsage.setODAData) + (i2372 | com.visa.cbp.getCertUsage.setODAData), (i2382 & 6) + (i2382 | 6), c92, objArr1212);
                                            java.lang.String[] strArr142 = {str532, (java.lang.String) objArr1212[0]};
                                            int minimumFlingVelocity22 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                            int i2392 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            int i2402 = (i2392 * (-209)) - 6061;
                                            int i2412 = ~i2392;
                                            int i2422 = -(-((~((i2412 ^ (-30)) | (i2412 & (-30)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                            int i2432 = (i2402 ^ i2422) + ((i2402 & i2422) << 1);
                                            int i2442 = ~((i12 ^ (-30)) | (i12 & (-30)));
                                            int i2452 = ~((i2412 & i) | (i2412 ^ i));
                                            int i2462 = -(-(((i2442 ^ i2452) | (i2452 & i2442)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                            int i2472 = ((i2432 | i2462) << 1) - (i2462 ^ i2432);
                                            int i2482 = (i2412 & i12) | (i2412 ^ i12);
                                            int i2492 = ~((i2482 ^ 29) | (i2482 & 29));
                                            int i2502 = (i2392 ^ (-30)) | (i2392 & (-30));
                                            int i2512 = ~((i2502 ^ i) | (i2502 & i));
                                            int i2522 = ((i2512 ^ i2492) | (i2512 & i2492)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                            java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                            a((minimumFlingVelocity22 ^ 1611) + ((minimumFlingVelocity22 & 1611) << 1), (i2472 ^ i2522) + ((i2522 & i2472) << 1), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr1222);
                                            java.lang.String str542 = (java.lang.String) objArr1222[0];
                                            int i2532 = -android.text.TextUtils.getOffsetBefore(str28, 0);
                                            int i2542 = -android.view.View.MeasureSpec.getSize(0);
                                            java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                            a(1589 - (~i2532), (i2542 ^ 10) + ((i2542 & 10) << 1), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr1232);
                                            c2 = 0;
                                            java.lang.String[][] strArr152 = {strArr112, strArr122, strArr132, strArr142, new java.lang.String[]{str542, (java.lang.String) objArr1232[0]}};
                                            int i2552 = -1;
                                            i15 = 0;
                                            loop4: while (true) {
                                                if (i15 < 5) {
                                                }
                                                i15++;
                                                c2 = 0;
                                            }
                                            if (i16 == i) {
                                            }
                                        }
                                    }
                                    int i521 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i522 = -(android.os.Process.myTid() >> 22);
                                    java.lang.Object[] objArr209 = new java.lang.Object[1];
                                    a((i521 & 343) + (i521 | 343), (i522 & 13) + (i522 | 13), (char) (0 - (~(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), objArr209);
                                    java.lang.String str90 = (java.lang.String) objArr209[0];
                                    int indexOf9 = android.text.TextUtils.indexOf(str22, str22);
                                    int i523 = -(-(android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                    java.lang.Object[] objArr210 = new java.lang.Object[1];
                                    a(355 - (~indexOf9), ((i523 | 9) << 1) - (i523 ^ 9), (char) android.view.KeyEvent.getDeadChar(0, 0), objArr210);
                                    java.lang.Object[] objArr211 = {str90, (java.lang.String) objArr210[0]};
                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                    if (obj39 == null) {
                                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 2212 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.text.TextUtils.getOffsetBefore(str22, 0));
                                        byte[] bArr15 = $$a;
                                        byte b33 = (byte) (bArr15[20] - 1);
                                        byte b34 = (byte) (bArr15[16] - 1);
                                        java.lang.Object[] objArr212 = new java.lang.Object[1];
                                        b(b33, b34, b34, objArr212);
                                        obj39 = cls39.getMethod((java.lang.String) objArr212[0], java.lang.String.class, java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj39);
                                    }
                                    long j42 = ~((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, objArr211)).longValue();
                                    long j43 = j10 | 209806736;
                                    long j44 = (((((r7 * (-667)) - 280091992560L) + ((j42 | (~j43)) * (-668))) + (((~(j42 | j10)) | 209806736) * 1336)) + ((j43 | j42) * 668)) - 945181338;
                                    int i524 = ((int) (j44 >> 32)) & (((2070675455 | i) * (-676)) + 1665756466 + (((~(i29 | 2030780382)) | (-2070675456)) * 676) + (((~(i29 | 593553971)) | 1477121484 | (~((-39895074) | i))) * 676));
                                    int i525 = ((int) j44) & ((((~((-222380780) | i)) | 1214845630) * (-465)) + 1480971420 + (((~(1214845630 | i)) | (-222380780)) * 930) + (((-83902530) | i) * 465));
                                    if (((i524 ^ i525) | (i524 & i525)) != 0) {
                                        i10 = ~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
                                        i11 = i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                                        i9 = i10 & i11;
                                        if (i9 != i) {
                                        }
                                    } else {
                                        i9 = i;
                                        if (i9 != i) {
                                        }
                                    }
                                }
                            }
                            i8 = i;
                            if (i8 == i) {
                            }
                        }
                    };
                } catch (java.lang.Exception unused2) {
                    return new com.payair.hce.SdkCoreDigitizedCardProfileImpl() { // from class: com.payair.hce.SdkCoreDigitizedCardProfileImpl.3
                        @Override // com.payair.hce.SdkCoreDigitizedCardProfileImpl
                        public final <T> T DigitizedCardProfile(java.lang.Class<T> cls2) {
                            throw new java.lang.UnsupportedOperationException("Cannot allocate ".concat(java.lang.String.valueOf(cls2)));
                        }
                    };
                }
            } catch (java.lang.Exception unused3) {
                final java.lang.reflect.Method declaredMethod3 = java.io.ObjectInputStream.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Class.class);
                declaredMethod3.setAccessible(true);
                return new com.payair.hce.SdkCoreDigitizedCardProfileImpl() { // from class: com.payair.hce.SdkCoreDigitizedCardProfileImpl.1
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static final byte[] $$d = null;
                    private static final int $$e = 0;
                    private static int $10;
                    private static int $11;
                    private static int DigitizedCardProfile;
                    private static short[] IccPrivateKeyCrtComponentsJson;
                    private static int RecordsJson;
                    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
                    private static long getAid;
                    private static int getProfileVersion;
                    private static int valueOf;
                    private static int values;
                    private static byte[] writeReplace;

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
                        int i3;
                        byte[] bArr = $$a;
                        int i4 = s * 34;
                        int i5 = (i2 * 653) + 65;
                        int i6 = (i * 34) + 4;
                        char[] cArr = new char[35 - i4];
                        int i7 = 34 - i4;
                        if (bArr == null) {
                            int i8 = i5;
                            i5 = i7;
                            i3 = 0;
                            i6++;
                            i5 = (i5 + i8) - 2;
                            cArr[i3] = (char) i5;
                            if (i3 == i7) {
                                objArr[0] = new java.lang.String(cArr);
                                return;
                            }
                            i3++;
                            i8 = bArr[i6];
                            i6++;
                            i5 = (i5 + i8) - 2;
                            cArr[i3] = (char) i5;
                            if (i3 == i7) {
                            }
                        } else {
                            i3 = 0;
                            cArr[i3] = (char) i5;
                            if (i3 == i7) {
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0032). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void d(byte b, byte b2, int i, java.lang.Object[] objArr) {
                        int i2;
                        int i3 = 3 - (b * 2);
                        int i4 = i * 4;
                        byte[] bArr = $$d;
                        int i5 = 104 - (b2 * 5);
                        byte[] bArr2 = new byte[1 - i4];
                        if (bArr == null) {
                            int i6 = i5;
                            int i7 = 0;
                            int i8 = i3;
                            int i9 = (-i3) + i6;
                            i2 = i7;
                            int i10 = i8;
                            i5 = i9;
                            i3 = i10;
                            bArr2[i2] = (byte) i5;
                            int i11 = i3 + 1;
                            if (i2 == 0 - i4) {
                                objArr[0] = new java.lang.String(bArr2, 0);
                                return;
                            }
                            int i12 = i5;
                            i8 = i11;
                            i3 = bArr[i11];
                            i7 = i2 + 1;
                            i6 = i12;
                            int i92 = (-i3) + i6;
                            i2 = i7;
                            int i102 = i8;
                            i5 = i92;
                            i3 = i102;
                            bArr2[i2] = (byte) i5;
                            int i112 = i3 + 1;
                            if (i2 == 0 - i4) {
                            }
                        } else {
                            i2 = 0;
                            bArr2[i2] = (byte) i5;
                            int i1122 = i3 + 1;
                            if (i2 == 0 - i4) {
                            }
                        }
                    }

                    private static void c(char c, int i, int i2, java.lang.Object[] objArr) {
                        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
                        long[] jArr = new long[i];
                        getcvmmodel.valueOf = 0;
                        while (getcvmmodel.valueOf < i) {
                            int i3 = getcvmmodel.valueOf;
                            try {
                                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl[i2 + getcvmmodel.valueOf])};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                                if (obj2 == null) {
                                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 381, (char) (62388 - android.text.TextUtils.getTrimmedLength("")));
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    d((byte) 0, (byte) 1, 0, objArr3);
                                    obj2 = cls2.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj2);
                                }
                                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                                if (obj3 == null) {
                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3966, (char) (android.view.View.resolveSize(0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj3);
                                }
                                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).longValue();
                                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                                if (obj4 == null) {
                                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 212 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                                }
                                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        char[] cArr = new char[i];
                        getcvmmodel.valueOf = 0;
                        int i4 = $10 + 111;
                        $11 = i4 % 128;
                        int i5 = i4 % 2;
                        while (getcvmmodel.valueOf < i) {
                            $10 = ($11 + 101) % 128;
                            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                            if (obj5 == null) {
                                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.os.Process.myTid() >> 22), 212 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
                            }
                            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
                        }
                        objArr[0] = new java.lang.String(cArr);
                    }

                    @Override // com.payair.hce.SdkCoreDigitizedCardProfileImpl
                    public final <T> T DigitizedCardProfile(java.lang.Class<T> cls2) throws java.lang.Exception {
                        getProfileVersion = (RecordsJson + 107) % 128;
                        AlternateContactlessPaymentDataJson(cls2);
                        T t = (T) declaredMethod3.invoke(null, cls2, java.lang.Object.class);
                        getProfileVersion = (RecordsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        return t;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x018f  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x0258  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(int i, short s, int i2, int i3, byte b, java.lang.Object[] objArr) {
                        int i4;
                        boolean z;
                        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(DigitizedCardProfile)};
                            char c = 0;
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                            long j = 0;
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 27, 29 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj2);
                            }
                            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue();
                            if (intValue2 == -1) {
                                int i5 = $10 + 53;
                                $11 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    i4 = 1;
                                    if (i4 != 0) {
                                        byte[] bArr = writeReplace;
                                        if (bArr != null) {
                                            int length = bArr.length;
                                            byte[] bArr2 = new byte[length];
                                            int i6 = 0;
                                            while (i6 < length) {
                                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                                objArr3[c] = java.lang.Integer.valueOf(bArr[i6]);
                                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                                if (obj3 == null) {
                                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, 5089 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("e", java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                                                }
                                                bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr3)).byteValue();
                                                i6++;
                                                c = 0;
                                                j = 0;
                                            }
                                            bArr = bArr2;
                                        }
                                        if (bArr != null) {
                                            byte[] bArr3 = writeReplace;
                                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(values)};
                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                                            if (obj4 == null) {
                                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 30, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                                            }
                                            intValue2 = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                                        } else {
                                            intValue2 = (short) (((short) (IccPrivateKeyCrtComponentsJson[i2 + ((int) (values ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                                        }
                                    }
                                    if (intValue2 > 0) {
                                        $10 = ($11 + 75) % 128;
                                        gettrack2constructiondata.writeReplace = ((i2 + intValue2) - 2) + ((int) (values ^ (-4897270311952305750L))) + i4;
                                        java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(valueOf), sb};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                                        if (obj5 == null) {
                                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.keyCodeFromString(""), 2364 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                                            d((byte) 0, (byte) 0, 0, objArr6);
                                            obj5 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj5);
                                        }
                                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                        byte[] bArr4 = writeReplace;
                                        if (bArr4 != null) {
                                            int length2 = bArr4.length;
                                            byte[] bArr5 = new byte[length2];
                                            for (int i7 = 0; i7 < length2; i7++) {
                                                bArr5[i7] = (byte) (bArr4[i7] ^ (-4897270311952305750L));
                                            }
                                            bArr4 = bArr5;
                                        }
                                        if (bArr4 != null) {
                                            int i8 = $10 + 73;
                                            $11 = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                z = true;
                                                gettrack2constructiondata.DigitizedCardProfile = 1;
                                                while (gettrack2constructiondata.DigitizedCardProfile < intValue2) {
                                                    if (z) {
                                                        $11 = ($10 + 105) % 128;
                                                        byte[] bArr6 = writeReplace;
                                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r4] ^ (-4897270311952305750L))) + s)) ^ b));
                                                    } else {
                                                        short[] sArr = IccPrivateKeyCrtComponentsJson;
                                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r4] ^ (-4897270311952305750L))) + s)) ^ b));
                                                    }
                                                    sb.append(gettrack2constructiondata.values);
                                                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                                    gettrack2constructiondata.DigitizedCardProfile++;
                                                    $11 = ($10 + 73) % 128;
                                                }
                                            }
                                        }
                                        z = false;
                                        gettrack2constructiondata.DigitizedCardProfile = 1;
                                        while (gettrack2constructiondata.DigitizedCardProfile < intValue2) {
                                        }
                                    }
                                    objArr[0] = sb.toString();
                                }
                            }
                            i4 = 0;
                            if (i4 != 0) {
                            }
                            if (intValue2 > 0) {
                            }
                            objArr[0] = sb.toString();
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }

                    static {
                        init$1();
                        $10 = 0;
                        $11 = 1;
                        init$0();
                        RecordsJson = 0;
                        getProfileVersion = 1;
                        values = -223141997;
                        DigitizedCardProfile = 520368555;
                        valueOf = 1827916563;
                        writeReplace = new byte[]{kotlin.io.encoding.Base64.padSymbol, 34, 58, -41, kotlin.io.encoding.Base64.padSymbol, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -40, 34, 58, 42, 56, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 34, -110, -125, -101, -76, -110, -107, -71, -125, -101, -117, com.visa.cbp.getEncExpo.registerForActivityResult, -121, -106, -25, 70, -126, -57, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -101, -98, -74, -101, Byte.MIN_VALUE, -99, -54, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -116, -113, -126, -109, -117, -110, -53, -51, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.visa.cbp.getEncExpo.IResultReceiver2, 126, 114, 64, com.visa.cbp.getEncExpo.IResultReceiver2, 116, Byte.MAX_VALUE, 103, 118, com.google.common.base.Ascii.EM, 110, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 10, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, 81, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.NAK, -78, -113, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -74, -86, -86, -86, -86, -86, -86, -86};
                        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{46196, 11607, 34345, 32739, 53450, 18848, 9081, 33807, 32022, 55030, 20419, 8325, 39520, 29511, 54281, 19887, 9878, 40854, 29027, 59941, 17152, 9457, 40361, 24264, 51174, 27779, 38267, 14974, 41744, 51660, 28410, 38824, 15430, 42329, 51754, 28882, 39414, 50108, 23186, 61943, 2063, 42762, 15972, 21688, 62350, 2780, 41266, 14378, 22353, 60845, 1160, 24316, 51147, 27830, 38150, 14893, 41798, 51601, 19159, 54260, 30858, 33088, 11881, 46851, 56794, 31404, 33717, 10325, 45408, 56870, 25795, 36324, 10922, 45836, 55302, 24887, 36736, 5282, 48551, 55881, 25365, 34851, 5873, 49055, 50311, 28028, 35328, 4901, 14353, 41270, 2645, 62366, 23781, 50644, 44822, 2092, 61806, 23173, 50090, 44267, 5650, 65385, 22622, 49546, 43720, 5092, 64770, 26200, 53102, 43171, 4570, 64232, 25662, 52548, 46711, 24264, 51174, 27779, 38242, 14961, 41728, 51667, 28410, 38817, 15424, 42354, 46180, 11591, 34361, 32755, 53466, 18864, 9065, 33823, 32006, 55014, 20435, 8341, 39536, 29527, 54297, 19903, 9909, 40836, 28979, 59922, 17180, 9470, 40355, 30352, 59473, 16700, 14863, 37828};
                        getAid = -6766013513958307965L;
                    }

                    static void init$1() {
                        $$d = new byte[]{68, 10, 35, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
                        $$e = 202;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:204:0x12c4, code lost:
                    
                        r2 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
                        ((int[]) r2[0])[0] = r10;
                        ((int[]) r2[1])[0] = r10;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:207:0x12dd, code lost:
                    
                        r3 = new java.lang.Object[]{java.lang.Integer.valueOf(r39), 0, java.lang.Integer.valueOf((((((~(1895820287 | r5)) | 671873) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 179953016) + (((~(1889231079 | r5)) | 7261081) * (-440))) + ((1895820287 | r10) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
                        r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:208:0x1323, code lost:
                    
                        if (r4 != null) goto L192;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:209:0x1325, code lost:
                    
                        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getMode(0), 2713 - android.view.KeyEvent.keyCodeFromString(r11), (char) android.text.TextUtils.getCapsMode(r11, 0, 0));
                        r4 = (byte) (com.payair.hce.SdkCoreDigitizedCardProfileImpl.AnonymousClass1.$$a[14] - 1);
                        r6 = r4;
                        r8 = new java.lang.Object[1];
                        a(r4, r6, r6, r8);
                        r4 = r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r4);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:212:0x1380, code lost:
                    
                        ((int[]) r2[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r4).invoke(null, r3)).intValue();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:213:0x1387, code lost:
                    
                        return r2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:215:0x1388, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:216:0x1389, code lost:
                    
                        r2 = r0.getCause();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:217:0x138e, code lost:
                    
                        if (r2 != null) goto L199;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:218:0x1390, code lost:
                    
                        throw r2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:219:0x1391, code lost:
                    
                        throw r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:249:0x0c36, code lost:
                    
                        if (r7.capacity() == 4) goto L167;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:251:0x13d8, code lost:
                    
                        r5 = r6;
                        r2 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
                        ((int[]) r2[0])[0] = r10;
                        ((int[]) r2[1])[0] = (r10 & (-2)) | (r5 & 1);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:254:0x13f7, code lost:
                    
                        r3 = new java.lang.Object[]{java.lang.Integer.valueOf(r39), 16, java.lang.Integer.valueOf((((((~((-1424471685) | r5)) | (~((-472020477) | r10))) * (-370)) - 776045184) + ((((~((-1424471685) | r10)) | (~(r5 | (-472020477)))) | (-1558706173)) * (-370))) - 1195666346)};
                        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:255:0x1444, code lost:
                    
                        if (r1 != null) goto L226;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:256:0x1446, code lost:
                    
                        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2714 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), (char) (android.os.Process.myTid() >> 22));
                        r4 = (byte) (com.payair.hce.SdkCoreDigitizedCardProfileImpl.AnonymousClass1.$$a[14] - 1);
                        r6 = r4;
                        r8 = new java.lang.Object[1];
                        a(r4, r6, r6, r8);
                        r1 = r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:259:0x14aa, code lost:
                    
                        ((int[]) r2[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r3)).intValue();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:260:0x14b1, code lost:
                    
                        return r2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:262:0x14b2, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:263:0x14b3, code lost:
                    
                        r2 = r0.getCause();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:264:0x14b8, code lost:
                    
                        if (r2 != null) goto L233;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:265:0x14ba, code lost:
                    
                        throw r2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:266:0x14bb, code lost:
                    
                        throw r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:71:0x044d, code lost:
                    
                        if (r8.capacity() == 3) goto L70;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:72:0x0468, code lost:
                    
                        r10 = 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:93:0x0459, code lost:
                    
                        r10 = com.payair.hce.SdkCoreDigitizedCardProfileImpl.AnonymousClass1.RecordsJson;
                        com.payair.hce.SdkCoreDigitizedCardProfileImpl.AnonymousClass1.getProfileVersion = ((r10 ^ 77) + ((r10 & 77) << 1)) % 128;
                        r10 = 1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:96:0x0457, code lost:
                    
                        if (r8.capacity() == 4) goto L70;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x1553 A[Catch: all -> 0x00da, TryCatch #16 {all -> 0x00da, blocks: (B:7:0x0039, B:9:0x0081, B:10:0x00c7, B:17:0x0105, B:19:0x0153, B:20:0x0199, B:35:0x024e, B:37:0x0292, B:38:0x02e2, B:86:0x14fa, B:88:0x1553, B:89:0x15aa), top: B:4:0x0020 }] */
                    /* JADX WARN: Type inference failed for: r10v13 */
                    /* JADX WARN: Type inference failed for: r10v14 */
                    /* JADX WARN: Type inference failed for: r10v2 */
                    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
                    /* JADX WARN: Type inference failed for: r10v38 */
                    /* JADX WARN: Type inference failed for: r10v4 */
                    /* JADX WARN: Type inference failed for: r10v5 */
                    /* JADX WARN: Type inference failed for: r10v56 */
                    /* JADX WARN: Type inference failed for: r10v57 */
                    /* JADX WARN: Type inference failed for: r10v6 */
                    /* JADX WARN: Type inference failed for: r10v64 */
                    /* JADX WARN: Type inference failed for: r10v65 */
                    /* JADX WARN: Type inference failed for: r10v66 */
                    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
                    /* JADX WARN: Type inference failed for: r10v70, types: [java.nio.ByteBuffer] */
                    /* JADX WARN: Type inference failed for: r10v71 */
                    /* JADX WARN: Type inference failed for: r10v8 */
                    /* JADX WARN: Type inference failed for: r10v80 */
                    /* JADX WARN: Type inference failed for: r10v81 */
                    /* JADX WARN: Type inference failed for: r10v82 */
                    /* JADX WARN: Type inference failed for: r10v83 */
                    /* JADX WARN: Type inference failed for: r10v84 */
                    /* JADX WARN: Type inference failed for: r10v85 */
                    /* JADX WARN: Type inference failed for: r4v122, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r4v124, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r4v50, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r5v107, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r5v127, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r5v6, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r6v48, types: [int[]] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
                        ?? r10;
                        java.lang.Object obj2;
                        int i4;
                        java.lang.String str;
                        java.nio.LongBuffer longBuffer;
                        boolean z;
                        int i5;
                        java.lang.Object obj3;
                        java.lang.Throwable th;
                        java.lang.String str2;
                        java.nio.LongBuffer longBuffer2;
                        ?? r102;
                        java.lang.String str3;
                        int i6 = RecordsJson;
                        int i7 = 1;
                        int i8 = (i6 ^ 3) + ((i6 & 3) << 1);
                        getProfileVersion = i8 % 128;
                        if (i8 % 2 == 0) {
                            throw null;
                        }
                        int i9 = 16;
                        int i10 = 0;
                        try {
                            if (context == null) {
                                java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr[0])[0] = i;
                                ((int[]) objArr[1])[0] = i;
                                int i11 = ~i;
                                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((608248344 | i) * 988) - 827224820) + (((~(627286809 | i11)) | 1250166886) * (-1976)) + (((~(i11 | 1269205351)) | (~(i | (-1269205352))) | 608248344) * 988))};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj4 == null) {
                                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 50, 2713 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                    byte b = (byte) ($$a[14] - 1);
                                    byte b2 = b;
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    a(b, b2, b2, objArr3);
                                    obj4 = cls2.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                }
                                ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr2)).intValue();
                                return objArr;
                            }
                            java.lang.String str4 = "";
                            if (strArr.length == 0) {
                                java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr4[0])[0] = i;
                                ((int[]) objArr4[1])[0] = i ^ 4;
                                int i12 = ~i;
                                int i13 = ~(552795537 | i12);
                                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i12 | 1343696623)) | 551604496) * (-1188)) + 960805334 + (((~(i | (-1343696624))) | 551604496 | i13) * 594) + (((~(i12 | (-1343696624))) | 1342505582 | i13) * 594))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 50, android.widget.ExpandableListView.getPackedPositionType(0L) + 2713, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                    byte b3 = (byte) ($$a[14] - 1);
                                    byte b4 = b3;
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    a(b3, b4, b4, objArr6);
                                    obj5 = cls3.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr5)).intValue();
                                return objArr4;
                            }
                            int length = strArr.length;
                            java.nio.LongBuffer[] longBufferArr = new java.nio.LongBuffer[length];
                            int i14 = 0;
                            while (i14 < strArr.length) {
                                java.lang.String lowerCase = strArr[i14].toLowerCase();
                                int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                                int i15 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                                int myPid = android.os.Process.myPid() >> 22;
                                java.lang.Object[] objArr7 = new java.lang.Object[i7];
                                b(edgeSlop >> 16, (short) ((i15 & (-34)) + (i15 | (-34))), 306762183 - (keyRepeatTimeout >> 16), (myPid & (-1945631359)) + (myPid | (-1945631359)), (byte) (android.os.Process.myTid() >> 22), objArr7);
                                java.lang.String replaceAll = lowerCase.replaceAll((java.lang.String) objArr7[i10], str4);
                                java.nio.LongBuffer[] longBufferArr2 = longBufferArr;
                                long longValue = new java.math.BigInteger(replaceAll.substring(i9, 32), i9).longValue();
                                long longValue2 = new java.math.BigInteger(replaceAll.substring(i10, i9), i9).longValue();
                                int length2 = replaceAll.length();
                                if (length2 == 32) {
                                    str3 = str4;
                                    longBufferArr2[i14] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                                } else {
                                    if (length2 != 64) {
                                        java.lang.Object[] objArr8 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr8[0])[0] = i;
                                        ((int[]) objArr8[1])[0] = (~(i & 3)) & (i | 3);
                                        int i16 = ~i;
                                        java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(i16 | (-140670127))) | 4210732) | (~(1755822034 | i16))) * (-397)) - 1040348816) + ((i | 1623573372) * 397))};
                                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj6 == null) {
                                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str4, str4, 0, 0), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                            byte b5 = (byte) ($$a[14] - 1);
                                            byte b6 = b5;
                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                            a(b5, b6, b6, objArr10);
                                            obj6 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                        }
                                        ((int[]) objArr8[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr9)).intValue();
                                        return objArr8;
                                    }
                                    str3 = str4;
                                    longBufferArr2[i14] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                                }
                                i14++;
                                longBufferArr = longBufferArr2;
                                str4 = str3;
                                i7 = 1;
                                i9 = 16;
                                i10 = 0;
                            }
                            java.nio.LongBuffer[] longBufferArr3 = longBufferArr;
                            java.lang.String str5 = str4;
                            try {
                            } catch (java.lang.Throwable unused4) {
                                r10 = i;
                            }
                            if (context == null) {
                                RecordsJson = (getProfileVersion + 79) % 128;
                                java.lang.Object[] objArr11 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr11[0])[0] = i;
                                ((int[]) objArr11[1])[0] = i;
                                int i17 = ~i;
                                try {
                                    java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((-239181903) | i17) * 494) + 1327050624 + (((~(i17 | 834554673)) | (-250980991)) * 494))};
                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj7 == null) {
                                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, 2713 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                        byte b7 = (byte) ($$a[14] - 1);
                                        byte b8 = b7;
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        a(b7, b8, b8, objArr13);
                                        obj7 = cls5.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                    }
                                    ((int[]) objArr11[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr12)).intValue();
                                    return objArr11;
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause = th2.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            }
                            byte[][] bArr = new byte[length][];
                            int i18 = 0;
                            int i19 = 0;
                            r10 = i9;
                            while (i18 < length) {
                                int i20 = getProfileVersion + 99;
                                RecordsJson = i20 % 128;
                                if (i20 % 2 != 0) {
                                    longBuffer2 = longBufferArr3[i18];
                                } else {
                                    longBuffer2 = longBufferArr3[i18];
                                }
                                if (r102 != 0) {
                                    getProfileVersion = (RecordsJson + 77) % 128;
                                    try {
                                        r102 = java.nio.ByteBuffer.allocate(32);
                                        java.nio.LongBuffer asLongBuffer = r102.asLongBuffer();
                                        long[] array = longBuffer2.array();
                                        int length3 = array.length;
                                        for (int i21 = 0; i21 < length3; i21 = (i21 & 1) + (i21 | 1)) {
                                            asLongBuffer.put(array[i21]);
                                        }
                                        bArr[i19] = r102.array();
                                        i19 = (((i19 | (-103)) << 1) - (i19 ^ (-103))) + 104;
                                    } catch (java.lang.Throwable unused5) {
                                        r10 = i;
                                    }
                                }
                                i18 = (i18 & (-28)) + (i18 | (-28)) + 29;
                                r10 = r102;
                            }
                            if (i19 > 0) {
                                RecordsJson = (getProfileVersion + 9) % 128;
                                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                                int i22 = (~(currentTimeMillis & 343337308)) & (343337308 | currentTimeMillis);
                                int i23 = ~i22;
                                int i24 = ~i;
                                try {
                                    java.lang.Object[] objArr14 = {java.lang.Integer.valueOf((i & i23) | (i22 & i24)), bArr, java.lang.Integer.valueOf(i19)};
                                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                                    if (obj8 == null) {
                                        try {
                                            str2 = str5;
                                            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.MeasureSpec.getSize(0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 429, (char) (android.text.TextUtils.getCapsMode(str2, 0, 0) + 31610));
                                            byte b9 = $$a[14];
                                            byte b10 = b9;
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            a(b9, b10, b10, objArr15);
                                            obj8 = cls6.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, obj8);
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            java.lang.Throwable cause2 = th.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th;
                                        }
                                    } else {
                                        str2 = str5;
                                    }
                                    long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, objArr14)).longValue();
                                    long j = ~longValue3;
                                    long j2 = j | 1120477094;
                                    long j3 = i;
                                    long j4 = ~j3;
                                    i4 = length;
                                    java.lang.String str6 = str2;
                                    long j5 = ((-496) * longValue3) + 555756639120L + ((~j2) * 497) + (((~(j2 | j3)) | (~(j | j4 | (-1120477095)))) * 497) + (((~(j4 | 1120477094)) | (~(longValue3 | 1120477094)) | (~(j3 | (-1120477095) | j))) * 497) + 2054377802;
                                    r10 = i;
                                    int i25 = ((int) (j5 >> 32)) & ((((~((-1947975691) | i24)) | (-510749280)) * (-602)) + 1133968300 + (((~((-1947975691) | r10)) | 1611300864 | (~((-174074454) | i24))) * (-301)) + ((~((-510749280) | i24)) * 301));
                                    int i26 = ((int) j5) & (((((~((-446395932) | r10)) | 990830478) * (-465)) - 1726165300) + (((~(990830478 | r10)) | (-446395932)) * 930) + (((-9510930) | r10) * 465));
                                    int i27 = (i26 ^ i25) | (i25 & i26);
                                    int i28 = (i22 & (~i27)) | (i23 & i27);
                                    if ((i2 & 1) == 1 && (i28 ^ r10) == 15) {
                                        getProfileVersion = (RecordsJson + 97) % 128;
                                        java.lang.Object[] objArr16 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr16[0])[0] = r10;
                                        ((int[]) objArr16[1])[0] = i28;
                                        try {
                                            java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1843095547 | r10)) | 53396613) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 131605065 + (((~(1843095547 | i24)) | 35946500) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj9 == null) {
                                                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                                byte b11 = (byte) ($$a[14] - 1);
                                                byte b12 = b11;
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a(b11, b12, b12, objArr18);
                                                obj9 = cls7.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                                            }
                                            ((int[]) objArr16[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr17)).intValue();
                                            return objArr16;
                                        } catch (java.lang.Throwable th4) {
                                            java.lang.Throwable cause3 = th4.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th4;
                                        }
                                    }
                                    if (((~(i28 & r10)) & (i28 | r10)) == 0) {
                                        int i29 = RecordsJson;
                                        getProfileVersion = ((i29 ^ 119) + ((i29 & 119) << 1)) % 128;
                                        java.lang.Object[] objArr19 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr19[0])[0] = r10;
                                        ((int[]) objArr19[1])[0] = i28;
                                        int i30 = ~(947605441 | r10);
                                        try {
                                            java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((7406400 | i30) * (-196)) - 542239044) + ((i30 | 940199041) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))};
                                            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj10 == null) {
                                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) android.text.TextUtils.getOffsetBefore(str6, 0));
                                                byte b13 = (byte) ($$a[14] - 1);
                                                byte b14 = b13;
                                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                a(b13, b14, b14, objArr21);
                                                obj10 = cls8.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                                            }
                                            ((int[]) objArr19[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr20)).intValue();
                                            return objArr19;
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause4 = th5.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th5;
                                        }
                                    }
                                    str = str6;
                                    int i31 = (i28 & i24) | ((~i28) & r10);
                                    r10 = r10;
                                    if (i31 == 11) {
                                        int i32 = getProfileVersion;
                                        RecordsJson = (((i32 | 113) << 1) - (i32 ^ 113)) % 128;
                                        java.lang.Object[] objArr22 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr22[0])[0] = r10;
                                        ((int[]) objArr22[1])[0] = i28;
                                        try {
                                            java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((1627488884 | r2) * (-814)) - 1014304562) + (((~(268719498 | r10)) | (~((-1627772663) | i24)) | 268435720) * 407) + (((~((-268719499) | r10)) | 268435720 | (~(1627772662 | r10))) * 407))};
                                            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj11 == null) {
                                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, android.view.View.MeasureSpec.getMode(0) + 2713, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                byte b15 = (byte) ($$a[14] - 1);
                                                byte b16 = b15;
                                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                a(b15, b16, b16, objArr24);
                                                obj11 = cls9.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                                            }
                                            ((int[]) objArr22[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr23)).intValue();
                                            return objArr22;
                                        } catch (java.lang.Throwable th6) {
                                            java.lang.Throwable cause5 = th6.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th6;
                                        }
                                    }
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                }
                                int i33 = ~r10;
                                java.lang.Object[] objArr25 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr25[0])[0] = r10;
                                ((int[]) objArr25[1])[0] = (r10 & (-3)) | (i33 & 2);
                                java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1009878297) | r10)) | (~(886613864 | i33))) * (-1808)) + 1658388992 + (((~((-873497865) | r10)) | (~(1022994296 | i33))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i33 | 1009878296)) | (~((-886613865) | r10)) | 136380432) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj2 == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, 2713 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                    byte b17 = (byte) ($$a[14] - 1);
                                    byte b18 = b17;
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    a(b17, b18, b18, objArr27);
                                    obj2 = cls10.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                                }
                                ((int[]) objArr25[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr26)).intValue();
                                return objArr25;
                            }
                            r10 = i;
                            i4 = length;
                            str = str5;
                            try {
                                int i34 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i35 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                int i36 = ~i35;
                                int i37 = ~((i36 ^ (-23)) | (i36 & (-23)));
                                int i38 = ~r10;
                                int i39 = (i38 ^ i35) | (i38 & i35);
                                int i40 = ~((i39 ^ 22) | (i39 & 22));
                                int i41 = (i35 * 829) + 18238 + (((i37 ^ i40) | (i37 & i40)) * (-828));
                                int i42 = (i35 ^ 22) | (i35 & 22);
                                int i43 = -(-(((i42 ^ i38) | (i42 & i38)) * (-828)));
                                int threadPriority = android.os.Process.getThreadPriority(0);
                                int i44 = (threadPriority * (-661)) - 13220;
                                int i45 = ~threadPriority;
                                int i46 = ~((i45 ^ (-21)) | (i45 & (-21)));
                                int i47 = -(-(((i46 ^ i38) | (i46 & i38)) * 1324));
                                int i48 = ((i44 | i47) << 1) - (i44 ^ i47);
                                int i49 = ~((r10 ^ 20) | (r10 & 20));
                                int i50 = ~((threadPriority ^ r10) | (threadPriority & r10));
                                int i51 = ((i49 ^ i50) | (i49 & i50)) * (-1324);
                                int i52 = ((i48 | i51) << 1) - (i51 ^ i48);
                                int i53 = ~(threadPriority | (-21));
                                int i54 = ~(i45 | 20);
                                int i55 = ((i53 ^ i54) | (i53 & i54)) * 662;
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                c((char) ((60091 & i34) + (i34 | 60091)), (((i41 & i43) + (i43 | i41)) - (~((~i42) * 828))) - 1, ((i52 ^ i55) + ((i55 & i52) << 1)) >> 6, objArr28);
                                java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                int i56 = -android.text.TextUtils.getTrimmedLength(str);
                                short size = (short) (android.view.View.MeasureSpec.getSize(0) + 118);
                                int i57 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                                int i58 = packedPositionType * (-494);
                                int i59 = ((((-930805188) & i58) + (i58 | (-930805188))) - (~((~(((-1945631314) & packedPositionType) | ((-1945631314) ^ packedPositionType))) * (-495)))) - 1;
                                int i60 = (packedPositionType ^ i38) | (packedPositionType & i38);
                                int i61 = i60 * 495;
                                int i62 = ~packedPositionType;
                                int i63 = ~((i62 ^ 1945631313) | (1945631313 & i62));
                                int i64 = ~i60;
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                b((i56 & 16) + (i56 | 16), size, (306762183 ^ i57) + ((i57 & 306762183) << 1), (i59 ^ i61) + ((i61 & i59) << 1) + (((i63 & i64) | (i63 ^ i64)) * 495), (byte) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr29);
                                java.lang.Object invoke = cls11.getMethod((java.lang.String) objArr29[0], null).invoke(context, null);
                                try {
                                    int i65 = -android.view.KeyEvent.getDeadChar(0, 0);
                                    int i66 = -android.view.View.MeasureSpec.getSize(0);
                                    int i67 = (i66 ^ r10) | (i66 & r10);
                                    int i68 = ~i67;
                                    int i69 = (((i66 * (-1335)) - 15341) - (~(((i68 ^ (-24)) | (i68 & (-24))) * (-668)))) - 1;
                                    int i70 = ~((r10 & (-24)) | (r10 ^ (-24)));
                                    int i71 = -(-(((i66 ^ i70) | (i66 & i70)) * 1336));
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    c((char) (((60090 | i65) << 1) - (i65 ^ 60090)), (i69 & i71) + (i71 | i69) + ((i67 | (-24)) * 668), android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr30);
                                    java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                    char doubleTapTimeout = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    int i72 = -(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    c(doubleTapTimeout, (i72 & 14) + (i72 | 14), 23 - android.text.TextUtils.getCapsMode(str, 0, 0), objArr31);
                                    java.lang.Object invoke2 = cls12.getMethod((java.lang.String) objArr31[0], null).invoke(context, null);
                                    int i73 = RecordsJson;
                                    getProfileVersion = ((i73 ^ 101) + ((i73 & 101) << 1)) % 128;
                                    try {
                                        java.lang.Object[] objArr32 = {invoke2, 64};
                                        int tapTimeout = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                        int i74 = tapTimeout * (-496);
                                        int i75 = ~tapTimeout;
                                        int i76 = (i74 ^ (-15872)) + ((i74 & (-15872)) << 1);
                                        int i77 = (i75 ^ (-33)) | (i75 & (-33));
                                        int i78 = i76 + ((~i77) * 497);
                                        int i79 = ~(i77 | r10);
                                        int i80 = (i38 ^ (-33)) | (i38 & (-33));
                                        int i81 = ~((i80 ^ tapTimeout) | (i80 & tapTimeout));
                                        int i82 = ((i79 ^ i81) | (i79 & i81)) * 497;
                                        int i83 = (i78 & i82) + (i82 | i78);
                                        int i84 = ~((i75 ^ i38) | (i75 & i38));
                                        int i85 = ~((i75 ^ 32) | (i75 & 32));
                                        int i86 = (i84 ^ i85) | (i85 & i84);
                                        int i87 = (tapTimeout ^ (-33)) | (tapTimeout & (-33));
                                        int i88 = ~((i87 ^ r10) | (i87 & r10));
                                        int i89 = ((i88 ^ i86) | (i88 & i86)) * 497;
                                        short s = (short) ((-43) - (~(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                        int i90 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i91 = ((-306762201) ^ i90) | ((-306762201) & i90);
                                        int i92 = (((i90 * 624) - 1827527376) - (~(-(-((~(i91 | r10)) * 623))))) - 1;
                                        int i93 = ~i90;
                                        int i94 = ~((i93 ^ 306762200) | (306762200 & i93));
                                        int i95 = ((i94 ^ i38) | (i94 & i38)) * (-623);
                                        int i96 = (i92 & i95) + (i92 | i95);
                                        int i97 = ~i91;
                                        int i98 = ~(((-306762201) & r10) | ((-306762201) ^ r10));
                                        int i99 = (i97 ^ i98) | (i97 & i98);
                                        int i100 = ~((i90 ^ r10) | (i90 & r10));
                                        int i101 = ((i100 ^ i99) | (i100 & i99)) * 623;
                                        int i102 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                        int i103 = (i102 * (-381)) + 100941504;
                                        int i104 = ~i102;
                                        int i105 = -(-(i104 * (-191)));
                                        int i106 = ~(r10 | (-1945631319));
                                        int i107 = (((i103 ^ i105) + ((i103 & i105) << 1)) - (~(((i102 ^ i106) | (i106 & i102)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) - 1;
                                        int i108 = ~(((-1945631319) & i104) | ((-1945631319) ^ i104));
                                        int i109 = ~(((-1945631319) & i38) | ((-1945631319) ^ i38));
                                        int i110 = ((i108 ^ i109) | (i108 & i109)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                        b(((i83 | i89) << 1) - (i89 ^ i83), s, (i96 ^ i101) + ((i101 & i96) << 1), (i107 ^ i110) + ((i110 & i107) << 1), (byte) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr33);
                                        java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr33[0]);
                                        char offsetAfter = (char) (android.text.TextUtils.getOffsetAfter(str, 0) + 40308);
                                        int blue = android.graphics.Color.blue(0);
                                        int myPid2 = android.os.Process.myPid() >> 22;
                                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                                        c(offsetAfter, ((blue | 14) << 1) - (blue ^ 14), (myPid2 ^ 37) + ((myPid2 & 37) << 1), objArr34);
                                        java.lang.Object invoke3 = cls13.getMethod((java.lang.String) objArr34[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr32);
                                        int i111 = i4;
                                        int i112 = 0;
                                        r10 = r10;
                                        loop3: while (true) {
                                            if (i112 >= i111) {
                                                break;
                                            }
                                            int i113 = RecordsJson;
                                            int i114 = (i113 & 77) + (i113 | 77);
                                            getProfileVersion = i114 % 128;
                                            if (i114 % 2 == 0) {
                                                longBuffer = longBufferArr3[i112];
                                                if (longBuffer.capacity() == 2) {
                                                    RecordsJson = (getProfileVersion + 55) % 128;
                                                    z = true;
                                                }
                                                int i115 = getProfileVersion;
                                                RecordsJson = ((i115 & 107) + (i115 | 107)) % 128;
                                                z = false;
                                            } else {
                                                longBuffer = longBufferArr3[i112];
                                            }
                                            if (z) {
                                                char mode = (char) android.view.View.MeasureSpec.getMode(0);
                                                int i116 = -android.graphics.Color.green(0);
                                                int i117 = (i116 * 71) - 483;
                                                int i118 = ~i116;
                                                int i119 = -(-(((~((i118 & 7) | (i118 ^ 7))) | (~((r10 ^ 7) | (r10 & 7)))) * (-140)));
                                                int i120 = (i117 ^ i119) + ((i117 & i119) << 1);
                                                int i121 = -(-((~((i116 ^ 7) | (i116 & 7) | r10)) * 70));
                                                int i122 = (i120 & i121) + (i121 | i120);
                                                int i123 = (~(i118 | 7)) | (~((i116 & (-8)) | (i116 ^ (-8))));
                                                int i124 = ~((i116 ^ r10) | (i116 & r10));
                                                int i125 = -(-(((i124 ^ i123) | (i124 & i123)) * 70));
                                                int lastIndexOf = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                int i126 = lastIndexOf * (-494);
                                                int i127 = (i126 & (-25688)) + (i126 | (-25688)) + ((~(lastIndexOf | 52)) * (-495));
                                                int i128 = (lastIndexOf ^ i38) | (lastIndexOf & i38);
                                                int i129 = -(-(i128 * 495));
                                                int i130 = ~lastIndexOf;
                                                i5 = i111;
                                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                c(mode, ((i122 | i125) << 1) - (i125 ^ i122), (i127 & i129) + (i127 | i129) + (((~i128) | (~((i130 & (-53)) | (i130 ^ (-53))))) * 495), objArr35);
                                                obj3 = objArr35[0];
                                            } else {
                                                i5 = i111;
                                                int i131 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                int i132 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int threadPriority2 = android.os.Process.getThreadPriority(0);
                                                int i133 = -(-(((threadPriority2 & 20) + (threadPriority2 | 20)) >> 6));
                                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                b(((i131 | 2) << 1) - (i131 ^ 2), (short) ((i132 & (-112)) + (i132 | (-112))), (306762231 & i133) + (i133 | 306762231), (-1945631342) - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), (byte) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr36);
                                                obj3 = objArr36[0];
                                            }
                                            java.lang.String str7 = (java.lang.String) obj3;
                                            int i134 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                                            c((char) ((i134 & 5144) + (i134 | 5144)), 30 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 58, objArr37);
                                            java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr37[0]);
                                            int i135 = -android.graphics.Color.argb(0, 0, 0, 0);
                                            int i136 = i135 * 141;
                                            int i137 = ((i136 | (-1251)) << 1) - (i136 ^ (-1251));
                                            int i138 = ~i135;
                                            int i139 = -(-(((~(i138 | r10)) | (~(i138 | 9))) * (-280)));
                                            int i140 = ((i137 | i139) << 1) - (i137 ^ i139);
                                            int i141 = ~((i138 ^ r10) | (i138 & r10));
                                            int i142 = ~((r10 ^ (-10)) | (r10 & (-10)));
                                            int i143 = -(-(((i141 & i142) | (i141 ^ i142)) * 140));
                                            int i144 = (i138 ^ (-10)) | (i138 & (-10));
                                            int i145 = (i138 ^ i38) | (i138 & i38);
                                            int i146 = (~((i145 ^ 9) | (i145 & 9))) | (~((i144 ^ r10) | (i144 & r10)));
                                            int i147 = (i38 & (-10)) | (i38 ^ (-10));
                                            int i148 = ~((i135 ^ i147) | (i135 & i147));
                                            int i149 = -android.view.KeyEvent.normalizeMetaState(0);
                                            int i150 = (i149 * 714) - 29192;
                                            int i151 = ~i149;
                                            int i152 = i112;
                                            int i153 = ~(i151 | i38);
                                            int i154 = ~((i151 & 41) | (i151 ^ 41));
                                            int i155 = (i153 & i154) | (i153 ^ i154);
                                            int i156 = (i149 ^ (-42)) | (i149 & (-42));
                                            int i157 = ~((i156 & r10) | (i156 ^ r10));
                                            int i158 = -(-(((i155 & i157) | (i155 ^ i157)) * (-713)));
                                            int i159 = (i150 & i158) + (i158 | i150);
                                            int i160 = i157 * 1426;
                                            short s2 = (short) ((i159 & i160) + (i160 | i159) + ((~((i38 ^ (-42)) | (i38 & (-42)))) * 713));
                                            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                            int i161 = maxKeyCode * (-375);
                                            int i162 = (928279617 ^ i161) + ((i161 & 928279617) << 1);
                                            int i163 = ~maxKeyCode;
                                            java.nio.LongBuffer longBuffer3 = longBuffer;
                                            int i164 = (~((i163 ^ (-306762234)) | (i163 & (-306762234)))) | r10;
                                            java.lang.String str8 = str;
                                            int i165 = ~((maxKeyCode ^ 306762233) | (maxKeyCode & 306762233));
                                            int i166 = -(-(((i164 ^ i165) | (i165 & i164)) * 376));
                                            int i167 = ~((i38 ^ maxKeyCode) | (i38 & maxKeyCode));
                                            int i168 = ~(maxKeyCode | 306762233);
                                            int i169 = ~((i163 ^ r10) | (i163 & r10));
                                            int i170 = i38;
                                            int i171 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            byte fadingEdgeLength = (byte) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                            java.lang.Object obj12 = invoke3;
                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                            b((i140 ^ i143) + ((i143 & i140) << 1) + (((i148 ^ i146) | (i146 & i148)) * 140), s2, (((((i162 ^ i166) + ((i166 & i162) << 1)) - (~(((i167 ^ i168) | (i167 & i168)) * (-376)))) - 1) - (~(((306762233 & i169) | (306762233 ^ i169)) * 376))) - 1, (-1945631303) - (~i171), fadingEdgeLength, objArr38);
                                            java.lang.Object obj13 = obj12;
                                            java.lang.Object[] objArr39 = (java.lang.Object[]) cls14.getField((java.lang.String) objArr38[0]).get(obj13);
                                            int length4 = objArr39.length;
                                            int i172 = 0;
                                            r10 = fadingEdgeLength;
                                            while (i172 < length4) {
                                                java.lang.Object obj14 = objArr39[i172];
                                                try {
                                                    int i173 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                                                    int keyRepeatTimeout2 = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                    int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                    c((char) ((i173 ^ 26324) + ((i173 & 26324) << 1)), (keyRepeatTimeout2 & 27) + (keyRepeatTimeout2 | 27), (tapTimeout2 & 88) + (tapTimeout2 | 88), objArr40);
                                                    java.lang.Class<?> cls15 = java.lang.Class.forName((java.lang.String) objArr40[0]);
                                                    char fadingEdgeLength2 = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    int i174 = -android.view.View.resolveSize(0, 0);
                                                    int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                    c(fadingEdgeLength2, (i174 ^ 11) + ((i174 & 11) << 1), (maxKeyCode2 & 115) + (maxKeyCode2 | 115), objArr41);
                                                    r10 = (java.lang.String) objArr41[0];
                                                    java.lang.Object invoke4 = cls15.getMethod(r10, java.lang.String.class).invoke(null, str7);
                                                    int i175 = getProfileVersion;
                                                    int i176 = ((i175 & 111) + (i175 | 111)) % 128;
                                                    RecordsJson = i176;
                                                    getProfileVersion = (i176 + 95) % 128;
                                                    try {
                                                        int i177 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                        int i178 = i177 * (-1939);
                                                        int i179 = (58332825 & i178) + (i178 | 58332825);
                                                        int i180 = -(-(((~(((-60076) & i177) | ((-60076) ^ i177))) | (~((i170 ^ 60075) | (i170 & 60075)))) * (-970)));
                                                        int i181 = (i179 & i180) + (i180 | i179);
                                                        int i182 = ~i177;
                                                        int i183 = (~((60075 ^ i182) | (60075 & i182))) * 1940;
                                                        int i184 = ((i181 | i183) << 1) - (i183 ^ i181);
                                                        int i185 = ~(i182 | (-60076));
                                                        int i186 = ~(i170 | 60075);
                                                        int i187 = ((i185 ^ i186) | (i185 & i186)) * 970;
                                                        char c = (char) (((i184 | i187) << 1) - (i187 ^ i184));
                                                        int i188 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                        java.lang.String str9 = str8;
                                                        int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                        int i189 = lastIndexOf2 * (-559);
                                                        int i190 = (lastIndexOf2 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (lastIndexOf2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                                        int i191 = (((71247 | i189) << 1) - (i189 ^ 71247)) + ((~((i170 ^ lastIndexOf2) | (i170 & lastIndexOf2))) * (-560));
                                                        r10 = i;
                                                        int i192 = (i191 - (~(-(-((~((i190 ^ r10) | (i190 & r10))) * (-560)))))) - 1;
                                                        int i193 = ~lastIndexOf2;
                                                        int i194 = ~((i193 ^ 127) | (i193 & 127));
                                                        int i195 = ~(i170 | 127);
                                                        int i196 = ((i194 ^ i195) | (i194 & i195)) * 560;
                                                        try {
                                                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                            c(c, (i188 ^ 28) + ((i188 & 28) << 1), (i192 ^ i196) + ((i196 & i192) << 1), objArr42);
                                                            java.lang.Class<?> cls16 = java.lang.Class.forName((java.lang.String) objArr42[0]);
                                                            int keyRepeatTimeout3 = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                            int i197 = keyRepeatTimeout3 * (-518);
                                                            int i198 = ((i197 | (-5180)) << 1) - (i197 ^ (-5180));
                                                            int i199 = ~keyRepeatTimeout3;
                                                            int i200 = (i199 ^ i170) | (i199 & i170);
                                                            int i201 = ~i200;
                                                            int i202 = -(-(((i201 & 10) | (i201 ^ 10)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                                            int i203 = ((i198 | i202) << 1) - (i198 ^ i202);
                                                            int i204 = ~((i200 ^ 10) | (i200 & 10));
                                                            int i205 = (keyRepeatTimeout3 ^ 10) | (keyRepeatTimeout3 & 10);
                                                            int i206 = ~((i205 ^ r10) | (i205 & r10));
                                                            int i207 = ((i204 ^ i206) | (i204 & i206)) * (-519);
                                                            int i208 = ~((r10 ^ 10) | (r10 & 10));
                                                            int i209 = -(-(((keyRepeatTimeout3 ^ i208) | (keyRepeatTimeout3 & i208)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                                            int i210 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int i211 = (i210 * 784) + com.knotapi.knot.utilities.Constants.ID_SQUARE_SPACE;
                                                            int i212 = ~i210;
                                                            int i213 = (i212 & i170) | (i212 ^ i170);
                                                            int i214 = (~((i213 & 60) | (i213 ^ 60))) * (-783);
                                                            int i215 = (i211 ^ i214) + ((i214 & i211) << 1);
                                                            int i216 = ((~(i170 | 60)) | i212) * 783;
                                                            int i217 = -(-android.view.View.MeasureSpec.getMode(0));
                                                            int i218 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                            java.lang.Object[] objArr43 = objArr39;
                                                            int i219 = i218 * 758;
                                                            int i220 = (i219 & 2018447568) + (i219 | 2018447568);
                                                            int i221 = -(-(((i218 ^ i170) | (i218 & i170)) * (-757)));
                                                            int i222 = (i220 & i221) + (i220 | i221);
                                                            int i223 = -(-((~((1945631299 ^ i218) | (i218 & 1945631299) | r10)) * 1514));
                                                            int i224 = (i222 & i223) + (i223 | i222);
                                                            int i225 = ~i218;
                                                            int i226 = ~((i225 ^ 1945631299) | (i225 & 1945631299));
                                                            java.lang.Object obj15 = obj13;
                                                            int i227 = ~((i170 ^ 1945631299) | (i170 & 1945631299));
                                                            int i228 = (i226 ^ i227) | (i226 & i227);
                                                            int i229 = ~(((-1945631300) ^ i218) | (i218 & (-1945631300)) | r10);
                                                            int i230 = -(-(((i228 ^ i229) | (i229 & i228)) * 757));
                                                            int i231 = length4;
                                                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                            b(((((i203 | i207) << 1) - (i207 ^ i203)) - (~i209)) - 1, (short) ((i215 & i216) + (i216 | i215)), (306762242 ^ i217) + ((i217 & 306762242) << 1), (i224 & i230) + (i224 | i230), (byte) android.view.Gravity.getAbsoluteGravity(0, 0), objArr44);
                                                            java.lang.Object invoke5 = cls16.getMethod((java.lang.String) objArr44[0], null).invoke(obj14, null);
                                                            int i232 = RecordsJson;
                                                            getProfileVersion = ((i232 ^ 19) + ((i232 & 19) << 1)) % 128;
                                                            try {
                                                                java.lang.Object[] objArr45 = {invoke5};
                                                                int i233 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                int i234 = (i233 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) - 25982775;
                                                                int i235 = i170;
                                                                int i236 = i235 | (-26326);
                                                                int i237 = (i233 ^ 26325) | (i233 & 26325);
                                                                int i238 = -(-(((~((i236 ^ i233) | (i236 & i233))) | (~((i237 ^ r10) | (i237 & r10)))) * 988));
                                                                int i239 = (i234 & i238) + (i234 | i238);
                                                                int i240 = ((i233 ^ (-26326)) | (i233 & (-26326))) * (-988);
                                                                int i241 = (i239 ^ i240) + ((i240 & i239) << 1);
                                                                int i242 = ~((~i233) | (-26326));
                                                                int i243 = ~((r10 & (-26326)) | (r10 ^ (-26326)));
                                                                int i244 = (i242 ^ i243) | (i242 & i243);
                                                                int i245 = (i233 ^ i235) | (i235 & i233);
                                                                int i246 = ~((i245 ^ 26325) | (i245 & 26325));
                                                                int i247 = ((i246 ^ i244) | (i246 & i244)) * 988;
                                                                char c2 = (char) ((i241 & i247) + (i247 | i241));
                                                                int i248 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                int i249 = i248 * 784;
                                                                int i250 = (i249 ^ (-21114)) + ((i249 & (-21114)) << 1) + 21924;
                                                                int i251 = ~i248;
                                                                int i252 = i251 | i235;
                                                                int i253 = -(-((~((i252 ^ 27) | (i252 & 27))) * (-783)));
                                                                int i254 = ((i250 | i253) << 1) - (i253 ^ i250);
                                                                int i255 = ~((i235 ^ 27) | (i235 & 27));
                                                                int i256 = -(-(((i251 ^ i255) | (i251 & i255)) * 783));
                                                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                                                c(c2, ((i254 | i256) << 1) - (i256 ^ i254), 88 - android.view.View.resolveSize(0, 0), objArr46);
                                                                java.lang.Class<?> cls17 = java.lang.Class.forName((java.lang.String) objArr46[0]);
                                                                int i257 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                                int i258 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                int i259 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                int i260 = i259 * (-500);
                                                                int i261 = (1237696656 & i260) + (i260 | 1237696656);
                                                                int i262 = ~i259;
                                                                int i263 = -(-(((~((i259 ^ (-306762253)) | ((-306762253) & i259))) | (~((306762252 ^ i262) | (306762252 & i262) | r10))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                                int i264 = (i261 ^ i263) + ((i263 & i261) << 1);
                                                                int i265 = -(-((~(((-306762253) ^ i262) | ((-306762253) & i262))) * 1002));
                                                                int i266 = i262 | i235;
                                                                int i267 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                int i268 = i172;
                                                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                                b(((i257 | 4) << 1) - (i257 ^ 4), (short) ((i258 ^ (-23)) + ((i258 & (-23)) << 1)), (i264 ^ i265) + ((i265 & i264) << 1) + ((~((306762252 & i266) | (i266 ^ 306762252))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING), (((-1945631316) | i267) << 1) - ((-1945631316) ^ i267), (byte) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr47);
                                                                if (java.nio.ByteBuffer.wrap((byte[]) cls17.getMethod((java.lang.String) objArr47[0], byte[].class).invoke(invoke4, objArr45)).asLongBuffer().equals(longBuffer3.rewind())) {
                                                                    break loop3;
                                                                }
                                                                i172 = i268 + 1;
                                                                objArr39 = objArr43;
                                                                i170 = i235;
                                                                str8 = str9;
                                                                length4 = i231;
                                                                obj13 = obj15;
                                                                r10 = r10;
                                                            } catch (java.lang.Throwable th8) {
                                                                java.lang.Throwable cause6 = th8.getCause();
                                                                if (cause6 != null) {
                                                                    throw cause6;
                                                                }
                                                                throw th8;
                                                            }
                                                        } catch (java.lang.Throwable th9) {
                                                            th = th9;
                                                            java.lang.Throwable th10 = th;
                                                            java.lang.Throwable cause7 = th10.getCause();
                                                            if (cause7 != null) {
                                                                throw cause7;
                                                            }
                                                            throw th10;
                                                        }
                                                    } catch (java.lang.Throwable th11) {
                                                        th = th11;
                                                    }
                                                } catch (java.lang.Throwable th12) {
                                                    java.lang.Throwable cause8 = th12.getCause();
                                                    if (cause8 != null) {
                                                        throw cause8;
                                                    }
                                                    throw th12;
                                                }
                                            }
                                            r10 = i;
                                            java.lang.Object obj16 = obj13;
                                            i112 = i152 + 1;
                                            i38 = i170;
                                            str = str8;
                                            i111 = i5;
                                            invoke3 = obj16;
                                            int i332 = ~r10;
                                            java.lang.Object[] objArr252 = {new int[1], new int[1], new int[1]};
                                            ((int[]) objArr252[0])[0] = r10;
                                            ((int[]) objArr252[1])[0] = (r10 & (-3)) | (i332 & 2);
                                            java.lang.Object[] objArr262 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1009878297) | r10)) | (~(886613864 | i332))) * (-1808)) + 1658388992 + (((~((-873497865) | r10)) | (~(1022994296 | i332))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i332 | 1009878296)) | (~((-886613865) | r10)) | 136380432) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj2 == null) {
                                            }
                                            ((int[]) objArr252[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr262)).intValue();
                                            return objArr252;
                                        }
                                    } catch (java.lang.Throwable th13) {
                                        java.lang.Throwable cause9 = th13.getCause();
                                        if (cause9 != null) {
                                            throw cause9;
                                        }
                                        throw th13;
                                    }
                                } catch (java.lang.Throwable th14) {
                                    java.lang.Throwable cause10 = th14.getCause();
                                    if (cause10 != null) {
                                        throw cause10;
                                    }
                                    throw th14;
                                }
                            } catch (java.lang.Throwable th15) {
                                java.lang.Throwable cause11 = th15.getCause();
                                if (cause11 != null) {
                                    throw cause11;
                                }
                                throw th15;
                            }
                        } catch (java.lang.Throwable th16) {
                            java.lang.Throwable cause12 = th16.getCause();
                            if (cause12 != null) {
                                throw cause12;
                            }
                            throw th16;
                        }
                    }

                    static void init$0() {
                        $$a = new byte[]{77, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 43, -56, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
                        $$b = 125;
                    }
                };
            }
        }
    }

    static void AlternateContactlessPaymentDataJson(java.lang.Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (java.lang.reflect.Modifier.isInterface(modifiers)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
        if (java.lang.reflect.Modifier.isAbstract(modifiers)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new java.lang.UnsupportedOperationException(sb2.toString());
        }
    }
}
