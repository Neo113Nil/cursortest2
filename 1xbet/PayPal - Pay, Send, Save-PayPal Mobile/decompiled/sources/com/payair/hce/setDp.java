package com.payair.hce;

/* loaded from: classes4.dex */
public final class setDp extends com.payair.hce.Record {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int values;
    private static long writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 35 - (b2 * 2);
        int i5 = 718 - i;
        byte[] bArr = $$a;
        int i6 = 39 - (b * 2);
        char[] cArr = new char[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            int i8 = i6;
            int i9 = (i7 + (-i6)) - 2;
            i2 = i3;
            int i10 = i8;
            i5 = i9;
            i6 = i10;
            i3 = i2 + 1;
            int i11 = i6 + 1;
            cArr[i2] = (char) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i12 = i5;
            i8 = i11;
            i6 = bArr[i11];
            i7 = i12;
            int i92 = (i7 + (-i6)) - 2;
            i2 = i3;
            int i102 = i8;
            i5 = i92;
            i6 = i102;
            i3 = i2 + 1;
            int i112 = i6 + 1;
            cArr[i2] = (char) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            int i1122 = i6 + 1;
            cArr[i2] = (char) i5;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b2 * 2) + 4;
        int i5 = 99 - (b * 3);
        int i6 = 1 - (i * 2);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i6;
            i5 = (-i5) + i8;
            i4 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i4];
            int i9 = i4;
            i8 = i5;
            i5 = b3;
            i7 = i9;
            i5 = (-i5) + i8;
            i4 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 117) % 128;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(DigitizedCardProfile[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 48, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 381, (char) (62387 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(0, (byte) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(writeReplace), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.graphics.Color.red(0), 4014 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (40223 - (android.view.ViewConfiguration.getTouchSlop() >> 8)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 34, 211 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $10 = ($11 + 21) % 128;
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
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) {
        com.payair.hce.transactionCanBeResumed transactioncanberesumed;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2;
        boolean z;
        int i = values + 125;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            ((com.payair.hce.access300) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 490902825, -490902823, java.lang.System.identityHashCode(access202Var))).AlternateContactlessPaymentDataJson();
            access202Var.writeReplace();
            com.payair.hce.activateCardForToken activatecardfortoken = com.payair.hce.activateCardForToken.writeReplace;
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.getAutoMigrations AlternateContactlessPaymentDataJson2 = ((com.payair.hce.access300) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 490902825, -490902823, java.lang.System.identityHashCode(access202Var))).AlternateContactlessPaymentDataJson();
        if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.writeReplace) {
            if (((com.payair.hce.requestChangePin) ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 857149142, -857149112, java.lang.System.identityHashCode(access202Var)))).valueOf()) {
                com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
                com.payair.hce.RemotePaymentData AlternateContactlessPaymentDataJson3 = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir))).AlternateContactlessPaymentDataJson();
                transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{AlternateContactlessPaymentDataJson3}, -679041277, 679041281, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3));
                com.payair.hce.getCodeCacheDir getcodecachedir2 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
                com.payair.hce.RemotePaymentData AlternateContactlessPaymentDataJson4 = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir2}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir2))).AlternateContactlessPaymentDataJson();
                transactioncanberesumed2 = (com.payair.hce.transactionCanBeResumed) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{AlternateContactlessPaymentDataJson4}, 331459817, -331459817, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson4));
            } else {
                com.payair.hce.getCodeCacheDir getcodecachedir3 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
                com.payair.hce.RemotePaymentData writeReplace2 = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir3}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir3))).writeReplace();
                transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{writeReplace2}, -679041277, 679041281, java.lang.System.identityHashCode(writeReplace2));
                com.payair.hce.getCodeCacheDir getcodecachedir4 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
                com.payair.hce.RemotePaymentData writeReplace3 = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir4}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir4))).writeReplace();
                transactioncanberesumed2 = (com.payair.hce.transactionCanBeResumed) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{writeReplace3}, 331459817, -331459817, java.lang.System.identityHashCode(writeReplace3));
            }
            if (((java.lang.Boolean) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1867552031, 1867552044, java.lang.System.identityHashCode(access202Var))).booleanValue()) {
                int i2 = AlternateContactlessPaymentDataJson;
                int i3 = i2 + 113;
                values = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (transactioncanberesumed2 != null) {
                    values = (i2 + 37) % 128;
                    if (((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 857149142, -857149112, java.lang.System.identityHashCode(access202Var))).values() != com.payair.hce.activateVisaCardForToken.valueOf) {
                        z = (transactioncanberesumed2.AlternateContactlessPaymentDataJson(0) & 2) != 2;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (!z) {
                            arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                        }
                        return arrayList;
                    }
                    int i4 = AlternateContactlessPaymentDataJson;
                    values = (i4 + 3) % 128;
                    values = (i4 + 91) % 128;
                    z = (transactioncanberesumed2.AlternateContactlessPaymentDataJson(0) & 4) != 4;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    if (!z) {
                        arrayList2.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                    }
                    return arrayList2;
                }
            }
            if (!((java.lang.Boolean) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1867552031, 1867552044, java.lang.System.identityHashCode(access202Var))).booleanValue() && transactioncanberesumed != null) {
                int i5 = AlternateContactlessPaymentDataJson + 105;
                values = i5 % 128;
                if (i5 % 2 != 0) {
                    AlternateContactlessPaymentDataJson(transactioncanberesumed, AlternateContactlessPaymentDataJson2);
                    throw null;
                }
                boolean AlternateContactlessPaymentDataJson5 = AlternateContactlessPaymentDataJson(transactioncanberesumed, AlternateContactlessPaymentDataJson2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                if (AlternateContactlessPaymentDataJson5) {
                    arrayList3.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                }
                return arrayList3;
            }
        } else if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.values) {
            com.payair.hce.getCodeCacheDir getcodecachedir5 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
            com.payair.hce.transactionCanBeResumed valueOf = ((com.payair.hce.setTrack2EquivalentData) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir5}, 1387703596, -1387703595, java.lang.System.identityHashCode(getcodecachedir5))).valueOf();
            if (valueOf != null) {
                int i6 = AlternateContactlessPaymentDataJson + 7;
                values = i6 % 128;
                if (i6 % 2 != 0) {
                    AlternateContactlessPaymentDataJson(valueOf, AlternateContactlessPaymentDataJson2);
                    throw null;
                }
                boolean AlternateContactlessPaymentDataJson6 = AlternateContactlessPaymentDataJson(valueOf, AlternateContactlessPaymentDataJson2);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                if (AlternateContactlessPaymentDataJson6) {
                    arrayList4.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                }
                return arrayList4;
            }
        } else {
            com.payair.hce.getCodeCacheDir getcodecachedir6 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
            com.payair.hce.transactionCanBeResumed valueOf2 = ((com.payair.hce.addCardAndSuk) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir6}, -1462391279, 1462391281, java.lang.System.identityHashCode(getcodecachedir6))).valueOf();
            if (valueOf2 != null) {
                AlternateContactlessPaymentDataJson = (values + 39) % 128;
                boolean AlternateContactlessPaymentDataJson7 = AlternateContactlessPaymentDataJson(valueOf2, AlternateContactlessPaymentDataJson2);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                if (AlternateContactlessPaymentDataJson7) {
                    arrayList5.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                }
                return arrayList5;
            }
        }
        return new java.util.ArrayList();
    }

    private static boolean AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.getAutoMigrations getautomigrations) {
        com.payair.hce.transactionCanBeResumed values2 = getautomigrations.values();
        int i = AlternateContactlessPaymentDataJson + 65;
        values = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 3;
        }
        for (int i3 = 0; i3 < transactioncanberesumed.DigitizedCardProfile(); i3++) {
            if ((values2.AlternateContactlessPaymentDataJson(i3 + 3) & transactioncanberesumed.AlternateContactlessPaymentDataJson(i3)) != 0) {
                return true;
            }
        }
        values = (AlternateContactlessPaymentDataJson + 109) % 128;
        return false;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 0;
        AlternateContactlessPaymentDataJson = 1;
        char[] cArr = new char[1707];
        java.nio.ByteBuffer.wrap("^\u0080/â¼\u0098\r¢\u009a$k\u0005ø6FÜ×\u0083¤¸5\\\u0082\u001f\u0013+áånðÿ¬L[Ýdª(8×\u0089è\u0016\u00adçZtpÅ\u0016SÍ àÉo¸\r+w\u009aM\rËüêoÙÑ3@l3W¢³\u0015ð\u0084Äv\nù\u000ehNÛ J\u009c=ý¯/\u001e\u0004\u0081op¥ã\u009bRü\u008fÕþ·mÍÜ÷KqºP)c\u0097\u0089\u0006Öuíä\tSJÂ~0°¿·.ä\u009d\u0004\f ¼WÍ\"^Sïpxó\u0089Ø\u001aá¤\u00035EFe×\u0087`\u0094ñó\u0003\u0002\u008c*\u001d{®\u008e?¨HéÚ\u001bk\u0013ôG\u0005\u009f\u0096£'Ô±\u001cÂ SR^\u0080/ã¼\u0089\r·\u009a$k\u0006ø>F\u009e×\u0097¤¬5Z\u0082\u001cÕw¤\u00147~\u0086@\u0011ÓàæsÇÍ*\\>/Y¾°\tô\u0098Ä^\u0080/õ¼\u0099\r·\u009ajk\u0010ø=F\u009f×µ¤\u00985x\u0082\u0003\u00135áßnÕÿ©LKÝw^\u0080/õ¼\u0084\r§\u009a\u007fk\u0007ø4F\u009f×\u008b¤·5W\u0082C\u0013/áÓnóÿ¦L]Ý8ª>8Ë^Í/ï¼\u009a\rº\u009adk\u001a]í,\u0098¿é\u000eÊ\u0099\u0012hjûYEòÔè§Ú66\u0081.\u0010@â²m\u0091üÐO\u0004Þ6©\r;§\u008a\u0093\u0015òä1w@ÆyP¬#\u0086²å=Ì\u008c\b\u001f`^\u0080/õ¼\u0084\r§\u009a\u007fk\u0007ø4F\u009f×\u0085¤·5[\u0082C\u0013-áßnüÿ½LiÝ[ª`8Ô\u0089é\u0016\u009dçYf½\u0017È\u0084¹5\u009a¢BS:À\t~¢ï¶\u009c\u008a\rjº~+\u0012ÙîVÎÇ\u009btgåF\u0092\u0005\u0000Ï±ë.¿ßfLRý:k½\u0018Ë\u0089®^\u0080/â¼\u0098\r¢\u009a$k\fø<FÝ×\u0092¤¹5@\u0082\t\u00130áÎ^Ý/é¼Ó\r¶\u009a~k\u000bø5FÔ×É¤¶5Z\u0082\u001f\u00137àø\u0091Ú\u0002¥³\u009e$WÕuF\u000eøìiªfÙ\u0017¯\u0084Ö5â¢1S\u0014Àf~\u0080ïÒ\u009câ\r\u001fºL+iÙ\u0097V\u00adÇüt\u0015\u0084\u0010õ2fA×p@©±Õ^ó/Ç^Ý/é¼Ó\r¤\u009ayk\rø=FÅ×\u0084¤ª5\u001b\u0082\u0001\u0013\"áÔnäÿ®L^Ýuª98Ñ\u0089é\u0016\u0097ç[^È/ã¼\u0093\r\u00adTå%Ø¶®\u0007\u0090\u0090Da8^\u0080/ö¼\u008f\r»\u009ahkMø4Fß×\u0083¤«5Y\u0082\t\u00130uW\u0004j\u0097\u001c&\"±â@\u0099Ó²mMü\u001dÛ-ª&9V\u0088h\u001f£îÈ}èÃ\u001cRM!u}+\f\u0019\u009fg.K¹\u0095HäÛÆ^Ì/î¼\u008f\r»\u009afk\u000bø,FÝ^Ý/é¼Ó\r¤\u009ayk\rø=FÅ×\u0084¤ª5\u001b\u0082\b\u0013&áÌnøÿ«LZ©«Ø\u0096KàúÞmA\u009c&\u000f[^È/ã¼\u0093\r±\u009ayk\u000bø:\u00907á\u001crlÃNT\u0086¥ô6Å\u0088\u0010\u0019`j\u0019ûü^È/ã¼\u0093\r±\u009ayk\u000bø:Fï×\u009f¤æ5\u0003\u00823\u0013uá\u008e^Ý/é¼Ó\r¤\u009ayk\rø=FÅ×\u0084¤ª5\u001b\u0082\u0001\u0013,áÞnôÿ¤^Ü/â¼\u0096^Ê/ë¼\u0088\r¸\u009ajk\u0016ø6FÂ^î/ö¼\u008d\rô\u009aYk\u0017ø7FÄ×\u008e¤³5P\u0082L\u0013%áÕnãÿèL|Ý~ª?8Ë\u0089ö\u0016\u0097Õµ¤³7Â\u0086ý\u0011?àPsfÍË\\ï/Á¾%\t\u0017\u0098zj\u0094å£tÿÇ\u0010Vm!p³\u0090\u0002²\u009d\u0089l\nÿcN\u001a;\u0014J\u0012Ùch\\ÿ\u009e\u000eñ\u009dÇ#j²NÁ`P\u0084ç¶vÛ\u00845\u000b\u0002\u009a^)±¸ÌÏÑ]1ì\u0013s(\u0082«\u0011Â »6\u000bEIÔ2DM5y¦C\u0017,\u0080úq\u0080â\u00ad\\WÍ\u0016¾</Ào\u0093\u001e²\u008dÊ<ë«6ZPÉqw\u0083°¿Á\u0082RôãÊtU\u00852^Ý/ç¼\u0093\r·\u009ack\u0017ñ\u001e\u0080*\u0013\u0010¢g5ºÄÎWþé\u0006xG\u000bi\u009aØ-Í¼òN\u0018Á<Po^Ý/é¼Ó\r¿\u009ank\u0010ø7FÕ×\u008b¤ð5D\u0082\t\u0013.áÏ^\u009e^Ý/é¼Ó\r§\u009ank\u0001ø,FÂ×\u0082Î|ÒÛ£ï0Õ\u0081°\u0016xç\rt3ÊÒ[Ï(¨¹A\u000e\u0005\u009f!mÉâôsº^É/ó¼\u0091\r¸\u009aTk\u001aøaF\u0086«±Ú\u0085I¿øÚo\u0012\u009eg\rY³¸\"¥QÔÀ0wnæH\u0014³\u009b\u008f\nÔ¹!(\u0013_OÍ¼^È/ã¼\u0093\r±\u009ayk\u000bø:F\u009f×\u0094¤º5^\u0082C\u0013$áßnÿÿ\u00adLMÝ\u007fª..\u0095_¾ÌÎ}ìê$\u001bV\u0088g6²§ÂÔ»E^ò\u001ecm\u0091\u0083\u001e§\u008fÊ<\u001a\u00adsÚ&HÖù¡fÊ\u0097\u001a\u00048µX#\u009aP»ÁþNöÿol\n^È/ã¼\u0093\r±\u009ayk\u000bø:F\u009f×\u0080¤±5Z\u0082\u000b\u0013/áßnÎÿ»L[Ý}ªb8Ã\u0089þ\u0016\u009cçLtrÅ\u001eSÍ^È/ã¼\u0093\r±\u009ayk\u000bø:F\u009f×\u0091¤¼5Z\u0082\u0014\u0013{á\u008cnáÿçLIÝtª\"8Ü\u0089£\u0016ÄçY^È/é¼\u0092\r³\u009agk\u0007øvFÃ×\u0083¤µ5j\u0082\u000b\u00133áÒnþÿ¦LZÝIª58\u009c\u0089\u00ad\u0016ÝçNteÅ\u0019SË ÷±\u0095>°\u008fU\u001c\u0019í`{¹ªÅÛñHËù®n|\u009f\u0015\f5²Ä#\u0090P§ÁIv\u0011ç)^Ý/é¼Ó\r¶\u009adk\rø-FÙ×\u008a¤¿5R\u0082\t\u0013máØnäÿ¡LSÝrªc8Â\u0089ò\u0016\u009cçNteÅ\u0005SÞ ÷±\u0095>½\u008f~^î/è¼\u0099\r¦\u009adk\u000bø=F\u009d×\u009f¤æ5\u0003\fs}Gî}_\u0018ÈÐ9¥ª\u009b\u0014z\u0085gö\u0014gòÐ±A\u009d³x<^\u00ad\u001f\u001e¿\u008fÑø\u0087d:\u0015\u0002\u0086o7A Ç\u0007\u0081v¯åÓTçÃb2V¡h\u001f\u0094\u008e\u008eýèl\u0017ÛFJq¸Ð7¦¦ý\u0015\u0017\u0084!óy\u00152d\u000f÷|FMÑÉ æ³Â\rr\u009cfïS~°ÉîXÄª3%\u0004´W^Þ/ã¼\u0090\r¡\u009a%k\u0011ø?F\u009e×\u0081¤¿5^\u0082\t\u0013\u001cáÙnðÿ¥LZÝdª,x/\t\u0012\u009aa+P¼ÔMàÞÎ`oñz\u0082L\u0013 ¤Â5ÖÇ.H\u000eÙJj§û\u0093\u008cÅ^Ý/é¼Ó\r¿\u009ank\u0010ø7FÕ×\u008b¤ð5T\u0082\u0002\u0013'áÈnþÿ¡L[Ý8ª<8Á\u0089ö\u0016\u0087çM\u0000ÚqîâÔS±Äc5\n¦*\u0018\u0099\u0089\u0091ú¼k_Ü\u001eMj¿Ü0à¡«\u0012g\u0083\u007fô+fÎ×ùu\u008f\u0004»\u0097\u0081&é±=@]Ó%m\u0080üÀ\u008få\u001e\u000b©Z8?Ê\u008eEªÔôg\nö!\u0081m\u0013\u0086¢»=ÉÌ\u0015_&^Ý/é¼Ó\r¤\u009ayk\rø=FÅ×\u0084¤ª5\u001b\u0082\u000e\u00136áÓnýÿ¬L\u0011Ýpª$8Ê\u0089ü\u0016\u0097ç[tpÅ\u0005SÇ ë±\u0088dô\u0015À\u0086ú7\u008e [Q8Â\u0004|üí£\u009eÙ\u000f~¸0)\u0003ÛÿTÜÅÏvpçV\u0090\n\u0002ê³×,©ÝpN[ÿ7ié\u001aØQ\u0091 ¥³\u009f\u0002ë\u0095>d]÷aI\u0099ØÆ«Í:\u001c\u008dX\u001c{îØa¿ðñC\u001aÒ6¥e7Æ\u0086±\u0019×è\u000b{+Ê^\\\u0090/¹¾Â1ö\u0080(\u0013Y\u0015Rdf÷\\F-Ñá \u0083³²\rP\u009c\u001aï\u007f~ØÉ\u0096X¥ªY%z´i\u0007Ö\u0096ðá¬sLÂq]\u000f¬Ö?ý\u008e\u0091\u0018Ok~º\u0004Ë0X\né{~·\u008fÕ\u001cä¢\u00063L@XÑ\u0088fÙ÷ñ\u0005\u000e\u008af\u001bs¨\u00939¦NøÜ\u0019mlòM\u0003\u0099\u0090·!É·\u0012Ä.UUÚxkºøÖ\tõ^\u0095^\u0080/â¼\u0098\r¢\u009a$k\u0013ø<FÝ×\u0092¤\u00815E\u0082\u0005\u00133áßJW;5¨O\u0019u\u008eó\u007fÆìáR\u0004Ã[°l!\u0096\u0096\u0094\u0007öõ\fz5ëzX\u008aÉ ¾ô,\u0017\u009d\u0013\u0002Bó\u009b`¹ÑÙG\u001dÒ°£Ò0¨\u0081\u0092\u0016\u0014ç!t\u0006Êã[¼(\u008b¹q\u000es\u009f\u0014mïâÏs\u0081Àk^\u0080/â¼\u0098\r¢\u009a$k\u0011ø6FÓ×\u008c¤»5A\u0082C\u00132áßnüÿ½L[^\u0080/õ¼\u0084\r§\u009a$k\u0013ø<FÝ×\u0092¤\u00815A\u0082\u001e\u0013\"áÙnô^\u0080/õ¼\u0084\r§\u009a\u007fk\u0007ø4F\u009f×\u008b¤·5W\u0082C\u0013/áÓnóÿ«L`Ý{ª,8È\u0089÷\u0016\u009dçJt_Å\u0013SË ç±\u0089>´\u008fU\u001c\u0010í={âÈ\u0093Yó&G·\u0004\u0006\u001dw\u007fä\u0005U?Â¹3\u009d ·\u001eY\u008f%ü$mØÚ\u0082^\u0080/â¼\u0098\r¢\u009a$k\u0000ø*FÄ×¸¤ª5\\\u0082\u0001\u0013&ì!\u009dC\u000e9¿\u0003(\u0085Ù°J\u0097ôre-\u0016\u001a\u0087à0â¡\u0080ShÜDM\u000fþñoÛ\u0018\u0088\u008a`;H¤7^\u0080/õ¼\u0084\r§\u009a\u007fk\u0007ø4F\u009f×\u008b¤·5W\u0082C\u0013/áÓnóÿªLLÝbª+8Ë\u0089÷\u0016\u0096çLtrÅ(SÄ ë±\u0095>ý\u008fy\u001c\u000e\u008d¼üÞo¤Þ\u009eI\u0018¸<+\u0016\u0095ø\u0004ºw\u0081æjQ5àf\u0091\u0004\u0002~³D$ÂÕæFÌø\"if\u001aA\u008b¡<å^\u0080/â¼\u0098\r¢\u009a$k\u0000ø*FÄ×\u008a¤»5R\u0082\u0002^\u0080/â¼\u0098\r¢\u009a$k\u0000ø*FÄ×\u0088¤¬5\\\u0082\t^\u0080/â¼\u0098\r¢\u009a$k\u0000ø*FÄ×\u0091¤³5F\u0082\u000b\u009d_ì=\u007fGÎ}Yû¨ß;õ\u0085\u001b\u0014Hgfö\u008bAÚÐì\"\u0006öd\u0087\u0006\u0014|¥F2ÀÃäPÎî \u007f\\\fS\u009d¼*í^\u0080/â¼\u009c\r \u009ajkMø=Fß×\u0090¤°5Y\u0082\u0003\u0013\"áÞnâÿçL\u0011Ýnª/8\u008b\u0089ù\u0016\u0081ç]tk^\u0080/ë¼\u0093\r \u009a$k\u0015ø0FÞ×\u0083¤±5B\u0082\u001f\u0013láønâÿ¼LlÝ~ª,8Ö\u0089þ\u0016\u0096çotoÅ\u001bSÊ à±\u008e\u0018Ài¶úÏKûÜ(-\r¾p\u0000\u009f\u0091×âñs\u0007ÄXUp^\u009f/à¼\u009b\rô\u009a1^\u0080/ö¼\u008f\r»\u009ahkMø*FÕ×\u008b¤¸5\u001a\u0082\u0001\u0013\"áÊnâWÃ&ÿµ\u0097\u0004³\u0093lb\u0006ñ1O\u0095Þ\u008b\u00adº<R\u008b\u0003\u001a.èØgéö«E\u001aÔn£)^Ã/ï¼\u009f\r\u0093\u009aGk'ø\nFï×\u0085¤\u00ad5A\u0082B\u00130áÕMµ<Ö¯¼\u001e\u0082\u0089\u0011x:ë\tUáÄ»·\u008a&_\u0091:\u0000\u0019òë}Áì\u009e_yÎ\r¹\u0000+ü\u009aÂ\u001b\u0098j¿ùÝHäß-.C½m\u0003\u0086\u0092ÙáøW\u001d&~µ\u0014\u0004*\u0093¹b\u0092ñ«OXÞ\u0014\u00ad7<ÛOÈ>ª\u00adÔ\u001cè\u008b\"z\u0005éuW\u0097ÆØµø$\u0011\u0093K\u0002jð\u0096\u007fªî¯]YÌ:»u)Ã\u0098²\u0007Êö\u0011e;Ô\u0011B\u009e1  ØÔ\u0015¥c6\u001a\u0087.\u0010ýáØr¯ÌU]\u0007.\"¿Î\b\u009f\u0099¹Ò]£\\0$\u0081\u0005\u0016Øç¾t\u009fÊm^\u0080/â¼\u009c\r \u009ajkMø4FÙ×\u0094¤½5\u001a\u0082\u001c\u00131áÕn÷ÿ¡LSÝsª>8\u008b\u0089ø\u0016\u0087ç[t/ÅGS\u0081 æ±\u0093>¾\u008f$\u001c\fí1{ìÈ\u0094Y²&B·\u0002\u00040\u0092Íc¾ðªA[Îx_9-Êº÷\u000b\u0094".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
        DigitizedCardProfile = cArr;
        writeReplace = -8214638516756074618L;
    }

    static void init$1() {
        $$d = new byte[]{45, -88, -122, 76};
        $$e = 250;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.ESC, -102, com.google.common.base.Ascii.SI, 46, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = 85;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0cbd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0d7d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0e3d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x1120  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x11f2 A[Catch: all -> 0x01d7, TRY_ENTER, TryCatch #4 {all -> 0x01d7, blocks: (B:6:0x00d1, B:8:0x00e4, B:9:0x012f, B:18:0x0206, B:20:0x024a, B:21:0x0296, B:28:0x0320, B:30:0x0333, B:31:0x0385, B:39:0x0454, B:41:0x049e, B:42:0x04f4, B:46:0x050c, B:48:0x051b, B:49:0x0564, B:56:0x0608, B:58:0x0650, B:59:0x06a8, B:63:0x070a, B:65:0x071d, B:66:0x076d, B:72:0x0810, B:74:0x084a, B:75:0x08a5, B:82:0x0959, B:84:0x096c, B:85:0x09bb, B:93:0x0a6a, B:95:0x0ab8, B:96:0x0b0f, B:100:0x0b4c, B:102:0x0b5f, B:103:0x0bad, B:110:0x0c06, B:112:0x0c4e, B:113:0x0ca7, B:131:0x0d95, B:133:0x0dd0, B:134:0x0e27, B:138:0x0e62, B:140:0x0e72, B:141:0x0eb9, B:149:0x0f19, B:151:0x0f5c, B:152:0x0fb2, B:168:0x1138, B:170:0x1187, B:171:0x11dc, B:174:0x11f2, B:176:0x1201, B:177:0x1249, B:181:0x12e8, B:183:0x132f, B:184:0x138c, B:188:0x13a3, B:190:0x13bb, B:191:0x1403, B:197:0x14d9, B:199:0x152c, B:200:0x1580, B:204:0x15bc, B:206:0x15cf, B:207:0x161b, B:209:0x1624, B:211:0x1642, B:212:0x1695, B:217:0x23a5, B:219:0x23b8, B:220:0x2403, B:231:0x27e8, B:233:0x27fb, B:234:0x284a, B:239:0x2916, B:241:0x2929, B:242:0x297a, B:251:0x2a41, B:253:0x2a8d, B:254:0x2ae7, B:291:0x2d77, B:293:0x2db5, B:294:0x2e0b, B:309:0x2f9a, B:311:0x2fca, B:312:0x3021, B:316:0x305e, B:318:0x3071, B:319:0x30bf, B:323:0x3173, B:325:0x31b6, B:326:0x320a, B:330:0x3238, B:332:0x328a, B:333:0x32e2, B:363:0x2418, B:365:0x2435, B:366:0x2488, B:374:0x1fab, B:376:0x1fbe, B:377:0x200c, B:399:0x2029, B:401:0x203c, B:402:0x208a, B:410:0x2123, B:412:0x215d, B:413:0x21b8, B:418:0x22cc, B:420:0x230a, B:421:0x2369, B:425:0x21ed, B:427:0x2237, B:428:0x2293), top: B:5:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x23b8 A[Catch: all -> 0x01d7, TryCatch #4 {all -> 0x01d7, blocks: (B:6:0x00d1, B:8:0x00e4, B:9:0x012f, B:18:0x0206, B:20:0x024a, B:21:0x0296, B:28:0x0320, B:30:0x0333, B:31:0x0385, B:39:0x0454, B:41:0x049e, B:42:0x04f4, B:46:0x050c, B:48:0x051b, B:49:0x0564, B:56:0x0608, B:58:0x0650, B:59:0x06a8, B:63:0x070a, B:65:0x071d, B:66:0x076d, B:72:0x0810, B:74:0x084a, B:75:0x08a5, B:82:0x0959, B:84:0x096c, B:85:0x09bb, B:93:0x0a6a, B:95:0x0ab8, B:96:0x0b0f, B:100:0x0b4c, B:102:0x0b5f, B:103:0x0bad, B:110:0x0c06, B:112:0x0c4e, B:113:0x0ca7, B:131:0x0d95, B:133:0x0dd0, B:134:0x0e27, B:138:0x0e62, B:140:0x0e72, B:141:0x0eb9, B:149:0x0f19, B:151:0x0f5c, B:152:0x0fb2, B:168:0x1138, B:170:0x1187, B:171:0x11dc, B:174:0x11f2, B:176:0x1201, B:177:0x1249, B:181:0x12e8, B:183:0x132f, B:184:0x138c, B:188:0x13a3, B:190:0x13bb, B:191:0x1403, B:197:0x14d9, B:199:0x152c, B:200:0x1580, B:204:0x15bc, B:206:0x15cf, B:207:0x161b, B:209:0x1624, B:211:0x1642, B:212:0x1695, B:217:0x23a5, B:219:0x23b8, B:220:0x2403, B:231:0x27e8, B:233:0x27fb, B:234:0x284a, B:239:0x2916, B:241:0x2929, B:242:0x297a, B:251:0x2a41, B:253:0x2a8d, B:254:0x2ae7, B:291:0x2d77, B:293:0x2db5, B:294:0x2e0b, B:309:0x2f9a, B:311:0x2fca, B:312:0x3021, B:316:0x305e, B:318:0x3071, B:319:0x30bf, B:323:0x3173, B:325:0x31b6, B:326:0x320a, B:330:0x3238, B:332:0x328a, B:333:0x32e2, B:363:0x2418, B:365:0x2435, B:366:0x2488, B:374:0x1fab, B:376:0x1fbe, B:377:0x200c, B:399:0x2029, B:401:0x203c, B:402:0x208a, B:410:0x2123, B:412:0x215d, B:413:0x21b8, B:418:0x22cc, B:420:0x230a, B:421:0x2369, B:425:0x21ed, B:427:0x2237, B:428:0x2293), top: B:5:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x240c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x27e6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x2a8d A[Catch: all -> 0x01d7, TryCatch #4 {all -> 0x01d7, blocks: (B:6:0x00d1, B:8:0x00e4, B:9:0x012f, B:18:0x0206, B:20:0x024a, B:21:0x0296, B:28:0x0320, B:30:0x0333, B:31:0x0385, B:39:0x0454, B:41:0x049e, B:42:0x04f4, B:46:0x050c, B:48:0x051b, B:49:0x0564, B:56:0x0608, B:58:0x0650, B:59:0x06a8, B:63:0x070a, B:65:0x071d, B:66:0x076d, B:72:0x0810, B:74:0x084a, B:75:0x08a5, B:82:0x0959, B:84:0x096c, B:85:0x09bb, B:93:0x0a6a, B:95:0x0ab8, B:96:0x0b0f, B:100:0x0b4c, B:102:0x0b5f, B:103:0x0bad, B:110:0x0c06, B:112:0x0c4e, B:113:0x0ca7, B:131:0x0d95, B:133:0x0dd0, B:134:0x0e27, B:138:0x0e62, B:140:0x0e72, B:141:0x0eb9, B:149:0x0f19, B:151:0x0f5c, B:152:0x0fb2, B:168:0x1138, B:170:0x1187, B:171:0x11dc, B:174:0x11f2, B:176:0x1201, B:177:0x1249, B:181:0x12e8, B:183:0x132f, B:184:0x138c, B:188:0x13a3, B:190:0x13bb, B:191:0x1403, B:197:0x14d9, B:199:0x152c, B:200:0x1580, B:204:0x15bc, B:206:0x15cf, B:207:0x161b, B:209:0x1624, B:211:0x1642, B:212:0x1695, B:217:0x23a5, B:219:0x23b8, B:220:0x2403, B:231:0x27e8, B:233:0x27fb, B:234:0x284a, B:239:0x2916, B:241:0x2929, B:242:0x297a, B:251:0x2a41, B:253:0x2a8d, B:254:0x2ae7, B:291:0x2d77, B:293:0x2db5, B:294:0x2e0b, B:309:0x2f9a, B:311:0x2fca, B:312:0x3021, B:316:0x305e, B:318:0x3071, B:319:0x30bf, B:323:0x3173, B:325:0x31b6, B:326:0x320a, B:330:0x3238, B:332:0x328a, B:333:0x32e2, B:363:0x2418, B:365:0x2435, B:366:0x2488, B:374:0x1fab, B:376:0x1fbe, B:377:0x200c, B:399:0x2029, B:401:0x203c, B:402:0x208a, B:410:0x2123, B:412:0x215d, B:413:0x21b8, B:418:0x22cc, B:420:0x230a, B:421:0x2369, B:425:0x21ed, B:427:0x2237, B:428:0x2293), top: B:5:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x2cb4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x2d5f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x2e21 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x2d5c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x2417  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x20a3  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x20f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        int i4;
        java.lang.String str;
        java.lang.String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        java.lang.String next;
        long j;
        char c;
        long j2;
        java.lang.String[] strArr;
        java.lang.String str3;
        int i11;
        java.lang.String[] strArr2;
        java.lang.Object obj;
        java.lang.Object invoke;
        int i12;
        char c2;
        int i13;
        int i14;
        int i15;
        int i16;
        java.lang.String intern;
        java.lang.Object[] objArr;
        java.lang.String[][] strArr3;
        java.lang.String[] strArr4;
        java.lang.String str4;
        int i17;
        int i18;
        int i19;
        java.lang.Object obj2;
        java.lang.String next2;
        java.lang.String next3;
        AlternateContactlessPaymentDataJson = (values + 107) % 128;
        int i20 = 0;
        java.lang.Integer num2 = 0;
        int argb = android.graphics.Color.argb(0, 0, 0, 0);
        java.lang.String str5 = "";
        char c3 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(465 - argb, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 8, objArr2);
        java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(android.view.ViewConfiguration.getLongPressTimeout() >> 16, (char) android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27, objArr3);
        java.lang.String intern3 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(27 - android.graphics.Color.green(0), (char) (38895 - android.text.TextUtils.indexOf("", "")), 25 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr4);
        java.lang.String intern4 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(51 - android.view.MotionEvent.axisFromString(""), (char) (53589 - android.widget.ExpandableListView.getPackedPositionType(0L)), 18 - android.graphics.Color.argb(0, 0, 0, 0), objArr5);
        java.lang.String intern5 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(70 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 58072), android.view.KeyEvent.normalizeMetaState(0) + 28, objArr6);
        java.lang.String[] strArr5 = {intern3, intern4, intern5, ((java.lang.String) objArr6[0]).intern()};
        int i21 = 0;
        while (true) {
            if (i21 >= 4) {
                num = num2;
                i4 = i;
                break;
            }
            try {
                java.lang.Object[] objArr7 = {strArr5[i21]};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", c3) + 37, (android.os.Process.myTid() >> 22) + 3161, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(i20, i20) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i20, i20) == 0L ? 0 : -1)) + 33100));
                    byte b = $$a[16];
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((byte) (b + 1), b, 618, objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[i20];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[i20] = java.lang.String.class;
                    obj3 = cls.getMethod(str6, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj3);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7)).longValue();
                long j3 = ~i;
                num = num2;
                long j4 = ((-782) * longValue) + 476562281552L + ((~longValue) * (-783)) + ((~((-607860054) | j3 | longValue)) * (-783)) + ((((-1) ^ (longValue | j3)) | (-607860054)) * 783) + 299610685;
                int i22 = ~i;
                if (((((int) j4) & (((((~((-2131796603) | i22)) | (~(2136319995 | i))) * (-831)) - 1405053834) + ((~((-1410375713) | i)) * (-1662)) + (((~(i22 | (-725944284))) | (~(725944283 | i)) | (~(2131796602 | i))) * 831))) | (((int) (j4 >> 32)) & (((((-294981925) | i) * 376) - 2088991750) + (((~((-1298419101) | i22)) | 1281379480) * (-376)) + (((~(1298419100 | i)) | (-1559321785)) * 376)))) != 0) {
                    i4 = i ^ (i21 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    break;
                }
                i21++;
                num2 = num;
                i20 = 0;
                c3 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        char c4 = 14;
        if (i4 != i) {
            AlternateContactlessPaymentDataJson = (values + 55) % 128;
            java.lang.Object[] objArr9 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
            int i23 = ~i;
            java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1396470846 | i23)) | (-2000485760) | (~((-50360339) | i))) * 717) + 673652506 + (((~(i | 1396470846)) | (~(i23 | (-50360339))) | (-2000485760)) * 717))};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2712 - android.view.MotionEvent.axisFromString(""), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                byte[] bArr = $$a;
                byte b2 = (byte) (bArr[16] + 1);
                byte b3 = (byte) (bArr[14] + 1);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(b2, b3, (short) (b3 | 653), objArr11);
                obj4 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
            }
            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr10)).intValue();
            return objArr9;
        }
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 98, (char) android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 12, objArr12);
        java.lang.String intern6 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(110 - android.text.TextUtils.getOffsetAfter("", 0), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 35831), 13 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr13);
        java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a(123 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 19, objArr14);
        java.lang.String[] strArr6 = {intern6, intern7, ((java.lang.String) objArr14[0]).intern()};
        int i24 = 0;
        while (true) {
            if (i24 >= 3) {
                str = intern2;
                str2 = str5;
                i5 = i;
                break;
            }
            java.lang.Object[] objArr15 = {strArr6[i24]};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
            if (obj5 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.graphics.Color.red(0) + 3161, (char) (33099 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                byte[] bArr2 = $$a;
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                b((byte) (-bArr2[c4]), (byte) (-bArr2[21]), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr16);
                obj5 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj5);
            }
            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr15)).longValue();
            long j5 = i;
            long j6 = ~j5;
            str = intern2;
            str2 = str5;
            long j7 = j6 | (-900243805);
            long j8 = (370 * longValue2) + 333090207480L + ((longValue2 | 900243804 | j6) * (-369)) + (((~j7) | longValue2) * (-369)) + ((((j7 | longValue2) ^ (-1)) | (~(j5 | 900243804)) | (~((~longValue2) | 900243804))) * 369) + 95191099;
            int i25 = (int) (j8 >> 32);
            int i26 = ~i;
            if (((((int) j8) & ((((18874625 | r5) * (-712)) - 1660158947) + (((~((-18874626) | i26)) | (~((-407017541) | i))) * (-712)) + (((~((-425892166) | i26)) | 1011334244) * 712))) | (((((~(2132705895 | i)) | 725034989) * (-964)) + 1652137598 + (((~(i26 | 2132705895)) | 2172296) * (-964))) & i25)) != 0) {
                i5 = (i24 + 270) ^ i;
                break;
            }
            i24++;
            intern2 = str;
            str5 = str2;
            c4 = 14;
        }
        if (i5 != i) {
            values = (AlternateContactlessPaymentDataJson + 47) % 128;
            java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
            java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-1075677110) | r2)) | 975168988) * 226) - 2061496176) + (((~((~i) | (-1073742370))) | (~((-975168989) | i)) | 973234248) * (-113)) + ((~(i | (-1075677110))) * 113))};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj6 == null) {
                java.lang.String str7 = str2;
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, str7) + 50, android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) android.graphics.Color.alpha(0));
                byte[] bArr3 = $$a;
                byte b4 = (byte) (bArr3[16] + 1);
                byte b5 = (byte) (bArr3[14] + 1);
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                b(b4, b5, (short) (b5 | 653), objArr19);
                obj6 = cls4.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
            }
            ((int[]) objArr17[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr18)).intValue();
            return objArr17;
        }
        java.lang.String str8 = str2;
        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
        if (obj7 == null) {
            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 1864 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (41775 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
            int i27 = $$a[14] + 1;
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            b((byte) i27, r4[16], (short) i27, objArr20);
            obj7 = cls5.getMethod((java.lang.String) objArr20[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj7);
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, null)).longValue();
        long j9 = i;
        long j10 = ~(longValue3 | j9);
        long j11 = (((((111 * longValue3) + 21636330505L) + ((j10 | 198498444) * (-220))) + (((~(longValue3 | (-198498445))) | j10) * 220)) + (((~((~longValue3) | (-198498445))) | (~(198498444 | longValue3))) * 110)) - 1730714417;
        int i28 = ~(1552498504 | i);
        int i29 = ~i;
        int i30 = (((int) j11) & ((((~(1330267782 | i)) | 106958627) * (-964)) + 408753605 + (((~(1330267782 | i29)) | 2099489) * (-964)))) | (((int) (j11 >> 32)) & (((((-1515706070) | i28) * (-658)) - 73151430) + ((i28 | (-1591738334)) * 658)));
        int i31 = i30 != 0 ? (i30 + 199) ^ i : i;
        if (i31 != i) {
            java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i31}, null, null, new int[1]};
            java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(1114564489 | i29)) | (-2012145546)) | (~((-38700553) | i))) * 717) - 49478611) + (((~(i | 1114564489)) | (~(i29 | (-38700553))) | (-2012145546)) * 717))};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj8 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                byte[] bArr4 = $$a;
                byte b6 = (byte) (bArr4[16] + 1);
                byte b7 = (byte) (bArr4[14] + 1);
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                b(b6, b7, (short) (b7 | 653), objArr23);
                obj8 = cls6.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
            }
            ((int[]) objArr21[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr22)).intValue();
            return objArr21;
        }
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        a(141 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 21, objArr24);
        java.lang.String intern8 = ((java.lang.String) objArr24[0]).intern();
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a(161 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5, objArr25);
        java.lang.Object[] objArr26 = {intern8, ((java.lang.String) objArr25[0]).intern()};
        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
        if (obj9 == null) {
            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40, 2212 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.green(0));
            int i32 = $$a[14] + 1;
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            b((byte) i32, r13[16], (short) i32, objArr27);
            obj9 = cls7.getMethod((java.lang.String) objArr27[0], java.lang.String.class, java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj9);
        }
        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr26)).longValue();
        long j12 = ~((~longValue4) | (-49307688));
        long j13 = longValue4 | 49307687;
        long j14 = ~j9;
        long j15 = (((((longValue4 * (-755)) - 37227303685L) + (1512 * j12)) + ((j12 | (~(j13 | j9))) * (-756))) + ((j13 | j14) * 756)) - 784682289;
        int i33 = ((((int) (j15 >> 32)) & (((((~(i29 | 163446644)) | (-1274937207)) * 529) + 1520786966) + (((~(163446644 | i)) | (-1273779767)) * 529))) | (((int) j15) & ((((~((-1155279728) | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 308427207) + (((~(i29 | (-1155279728))) | (-1423846272)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE : i;
        if (i33 != i) {
            java.lang.Object[] objArr28 = {new int[]{i}, new int[]{i33}, null, null, new int[1]};
            java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((i29 | (-1342177285)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 220403623) + (((~(i29 | 657446859)) | (-1948402190)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj10 == null) {
                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 50, 2712 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                byte[] bArr5 = $$a;
                byte b8 = (byte) (bArr5[16] + 1);
                byte b9 = (byte) (bArr5[14] + 1);
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                b(b8, b9, (short) (b9 | 653), objArr30);
                obj10 = cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
            }
            ((int[]) objArr28[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr29)).intValue();
            return objArr28;
        }
        java.lang.Object[] objArr31 = new java.lang.Object[1];
        a(168 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 877), android.os.Process.getGidForName(str8) + 32, objArr31);
        java.lang.String intern9 = ((java.lang.String) objArr31[0]).intern();
        java.lang.Object[] objArr32 = new java.lang.Object[1];
        a(199 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 23, objArr32);
        java.lang.String intern10 = ((java.lang.String) objArr32[0]).intern();
        java.lang.Object[] objArr33 = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf(str8, str8, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 14397), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 28, objArr33);
        java.lang.String intern11 = ((java.lang.String) objArr33[0]).intern();
        java.lang.Object[] objArr34 = new java.lang.Object[1];
        a((android.os.Process.myPid() >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, objArr34);
        java.lang.String[] strArr7 = {intern9, intern10, intern11, ((java.lang.String) objArr34[0]).intern()};
        int i34 = 0;
        while (true) {
            if (i34 >= 4) {
                i6 = i;
                break;
            }
            java.lang.Object[] objArr35 = {strArr7[i34]};
            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
            if (obj11 == null) {
                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35, 3162 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str8, str8) + 33099));
                byte b10 = $$a[16];
                java.lang.Object[] objArr36 = new java.lang.Object[1];
                b((byte) (b10 + 1), b10, 618, objArr36);
                obj11 = cls9.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj11);
            }
            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr35)).longValue();
            long j16 = ~((~longValue5) | (-82178222));
            long j17 = ~(j9 | (-82178222));
            long j18 = (((-657) * longValue5) - 54155448298L) + (((~(longValue5 | 82178221)) | j16 | j17) * (-658)) + (658 * j16) + ((j17 | j16) * 658) + 989648960;
            if (((((int) j18) & ((((~(i29 | (-1714443819))) | 277217408) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 903556577 + (((~(i29 | 281479632)) | (-1718706043)) * (-440)) + (((-1714443819) | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) (j18 >> 32)) & ((((~(i29 | 312049939)) | (-1402590616)) * 529) + 1520786966 + (((~(312049939 | i)) | (-1125176472)) * 529)))) != 0) {
                i6 = (i34 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) ^ i;
                break;
            }
            i34++;
        }
        if (i6 != i) {
            java.lang.Object[] objArr37 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
            java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(i | (-1942238168))) | 37761426) | (~(i29 | 2013084671))) * 886) - 1605527825) + (((~(i29 | 1942238167)) | 108607930) * (-1772)) + ((~(i29 | 108607930)) * 886))};
            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj12 == null) {
                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getTrimmedLength(str8), 2713 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                byte[] bArr6 = $$a;
                byte b11 = (byte) (bArr6[16] + 1);
                byte b12 = (byte) (bArr6[14] + 1);
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                b(b11, b12, (short) (b12 | 653), objArr39);
                obj12 = cls10.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
            }
            ((int[]) objArr37[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr38)).intValue();
            return objArr37;
        }
        java.lang.Object[] objArr40 = new java.lang.Object[1];
        a(263 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 12 - android.os.Process.getGidForName(str8), objArr40);
        java.lang.Object[] objArr41 = {((java.lang.String) objArr40[0]).intern()};
        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
        if (obj13 == null) {
            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1921, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
            int i35 = $$a[14] + 1;
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            b((byte) i35, r12[16], (short) i35, objArr42);
            obj13 = cls11.getMethod((java.lang.String) objArr42[0], java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
        }
        java.lang.String str9 = (java.lang.String) ((java.lang.reflect.Method) obj13).invoke(null, objArr41);
        if (str9 != null) {
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, (char) (48698 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 10, objArr43);
            if (str9.contains(((java.lang.String) objArr43[0]).intern())) {
                i7 = i ^ 250;
                if (i7 == i) {
                    java.lang.Object[] objArr44 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                    java.lang.Object[] objArr45 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i29 | (-546573705))) | (~(1979530637 | i))) * (-302)) + 713515731 + ((~((-546573705) | i)) * (-604)) + (((~(i | 1432956933)) | 1361641473) * 302))};
                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj14 == null) {
                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.os.Process.myTid() >> 22));
                        byte[] bArr7 = $$a;
                        byte b13 = (byte) (bArr7[16] + 1);
                        byte b14 = (byte) (bArr7[14] + 1);
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        b(b13, b14, (short) (b14 | 653), objArr46);
                        obj14 = cls12.getMethod((java.lang.String) objArr46[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                    }
                    ((int[]) objArr44[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr45)).intValue();
                    return objArr44;
                }
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                a(285 - android.graphics.Color.alpha(0), (char) (android.graphics.Color.blue(0) + 14425), (android.os.Process.myPid() >> 22) + 17, objArr47);
                java.lang.String intern12 = ((java.lang.String) objArr47[0]).intern();
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                a(302 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.View.MeasureSpec.getMode(0) + 56017), 5 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr48);
                java.lang.String intern13 = ((java.lang.String) objArr48[0]).intern();
                java.io.File file = new java.io.File(intern12);
                if (file.exists() && file.isFile()) {
                    try {
                        java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                        java.lang.Object[] objArr49 = new java.lang.Object[1];
                        a(308 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, objArr49);
                        java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr49[0]).intern());
                        next3 = useDelimiter.hasNext() ? useDelimiter.next() : str8;
                        useDelimiter.close();
                    } catch (java.io.IOException unused) {
                    }
                    if (next3.contains(intern13)) {
                        int i36 = AlternateContactlessPaymentDataJson + 85;
                        values = i36 % 128;
                        i8 = i36 % 2 != 0 ? i ^ 10650 : i ^ 251;
                        if (i8 == i) {
                            java.lang.Object[] objArr50 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                            java.lang.Object[] objArr51 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~(i29 | (-25446510))) * (-783)) + 1201390481 + (((~(i29 | 1048126354)) | (-1002719744)) * 783))};
                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj15 == null) {
                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, android.text.TextUtils.getCapsMode(str8, 0, 0) + 2713, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                byte[] bArr8 = $$a;
                                byte b15 = (byte) (bArr8[16] + 1);
                                byte b16 = (byte) (bArr8[14] + 1);
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                b(b15, b16, (short) (b16 | 653), objArr52);
                                obj15 = cls13.getMethod((java.lang.String) objArr52[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                            }
                            ((int[]) objArr50[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr51)).intValue();
                            return objArr50;
                        }
                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                        a(309 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.View.getDefaultSize(0, 0) + 23, objArr53);
                        java.lang.Object[] objArr54 = {((java.lang.String) objArr53[0]).intern()};
                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj16 == null) {
                            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 40, android.view.View.MeasureSpec.getSize(0) + 1921, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            int i37 = $$a[14] + 1;
                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                            b((byte) i37, r12[16], (short) i37, objArr55);
                            obj16 = cls14.getMethod((java.lang.String) objArr55[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj16);
                        }
                        java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj16).invoke(null, objArr54)).toLowerCase();
                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                        a(333 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.indexOf(str8, str8, 0) + 4, objArr56);
                        if (lowerCase.contains(((java.lang.String) objArr56[0]).intern())) {
                            int i38 = values + 17;
                            AlternateContactlessPaymentDataJson = i38 % 128;
                            i9 = i38 % 2 == 0 ? i ^ 24614 : i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE;
                        } else {
                            i9 = i;
                        }
                        if (i9 != i) {
                            java.lang.Object[] objArr57 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                            java.lang.Object[] objArr58 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i29 | (-183754716))) | (~(1867091382 | i))) * com.visa.cbp.getCertUsage.getODAData) - 38759235) + (((~(i | (-183754716))) | (~(i29 | 1867091382))) * com.visa.cbp.getCertUsage.getODAData))};
                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj17 == null) {
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) android.graphics.Color.green(0));
                                byte[] bArr9 = $$a;
                                byte b17 = (byte) (bArr9[16] + 1);
                                byte b18 = (byte) (bArr9[14] + 1);
                                java.lang.Object[] objArr59 = new java.lang.Object[1];
                                b(b17, b18, (short) (b18 | 653), objArr59);
                                obj17 = cls15.getMethod((java.lang.String) objArr59[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj17);
                            }
                            ((int[]) objArr57[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr58)).intValue();
                            return objArr57;
                        }
                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                        a(android.graphics.Color.alpha(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14425), 17 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr60);
                        java.lang.String intern14 = ((java.lang.String) objArr60[0]).intern();
                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                        a(android.graphics.Color.blue(0) + 337, (char) (2620 - android.text.TextUtils.indexOf(str8, str8, 0)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 6, objArr61);
                        java.lang.String intern15 = ((java.lang.String) objArr61[0]).intern();
                        java.io.File file2 = new java.io.File(intern14);
                        if (file2.exists() && file2.isFile()) {
                            try {
                                java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                a(308 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.KeyEvent.getDeadChar(0, 0) + 2, objArr62);
                                java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr62[0]).intern());
                                next2 = useDelimiter2.hasNext() ? useDelimiter2.next() : str8;
                                useDelimiter2.close();
                            } catch (java.io.IOException unused2) {
                            }
                            if (next2.contains(intern15)) {
                                i10 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                if (i10 != i) {
                                    java.lang.Object[] objArr63 = {new int[]{i}, new int[]{i10}, null, null, new int[1]};
                                    java.lang.Object[] objArr64 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((i29 | 2375940) * (-192)) + 676305489 + (((~(i29 | (-1570314892))) | 478155266) * (-384)) + (((~(i | 1572690831)) | (~((-478155267) | i)) | (~(i29 | (-1092159626)))) * 192))};
                                    java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj18 == null) {
                                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 50, 2713 - android.view.KeyEvent.keyCodeFromString(str8), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                        byte[] bArr10 = $$a;
                                        byte b19 = (byte) (bArr10[16] + 1);
                                        byte b20 = (byte) (bArr10[14] + 1);
                                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                                        b(b19, b20, (short) (b20 | 653), objArr65);
                                        obj18 = cls16.getMethod((java.lang.String) objArr65[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                                    }
                                    ((int[]) objArr63[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr64)).intValue();
                                    return objArr63;
                                }
                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                if (obj19 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 44, 2763 - android.text.TextUtils.getOffsetBefore(str8, 0), (char) (android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                    int i39 = $$a[14] + 1;
                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                    b((byte) i39, r8[16], (short) i39, objArr66);
                                    obj19 = cls17.getMethod((java.lang.String) objArr66[0], null);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj19);
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, null)).longValue();
                                long j19 = ~longValue6;
                                long j20 = ~(longValue6 | (-1768194860));
                                long j21 = ((longValue6 * 371) - 656000293060L) + (((~(j19 | j14)) | (~(j9 | 1768194859))) * (-370)) + (((~(j19 | j9)) | (~(j14 | 1768194859)) | j20) * (-370)) + (j20 * 370) + 1893231623;
                                if (((((int) (j21 >> 32)) & (((((~(320221116 | i)) | (-2077667328)) * (-566)) - 1996409430) + ((~((-1757446212) | i)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | (((int) j21) & (((((~(i29 | (-1709189884))) | 1147152986) * (-241)) - 188185585) + (((~(i29 | (-562036898))) | 1398016) * 241)))) == 1) {
                                    java.lang.Object[] objArr67 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-9724166) | i)) * 623) - 510599714) + ((i29 | 19400712) * (-623)) + (((~(i | (-1020584776))) | 9724165 | (~(1030261322 | i))) * 623))};
                                    java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj20 == null) {
                                        java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.os.Process.myPid() >> 22) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                        byte[] bArr11 = $$a;
                                        byte b21 = (byte) (bArr11[16] + 1);
                                        byte b22 = (byte) (bArr11[14] + 1);
                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                        b(b21, b22, (short) (b22 | 653), objArr69);
                                        obj20 = cls18.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj20);
                                    }
                                    ((int[]) objArr67[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr68)).intValue();
                                    return objArr67;
                                }
                                java.lang.Object[] objArr70 = {1};
                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                if (obj21 == null) {
                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 27, 2364 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                    int i40 = $$a[14] + 1;
                                    java.lang.Object[] objArr71 = new java.lang.Object[1];
                                    b((byte) i40, r11[16], (short) i40, objArr71);
                                    obj21 = cls19.getMethod((java.lang.String) objArr71[0], java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj21);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr70)).longValue();
                                long j22 = ~longValue7;
                                long j23 = ~(longValue7 | (-664270279));
                                long j24 = ((longValue7 * 371) - 246444273509L) + (((~(j9 | 664270278)) | (~(j22 | j14))) * (-370)) + (((~(664270278 | j14)) | (~(j22 | j9)) | j23) * (-370)) + (j23 * 370) + 2072180478;
                                int i41 = ((((int) (j24 >> 32)) & (((((21250056 | i) * 988) + 1373953166) + (((~(i29 | (-1552463287))) | 268435744) * (-1976))) + ((((~(1305277598 | i)) | 21250056) | (~(i29 | (-1305277599)))) * 988))) | (((int) j24) & (((((((~(i29 | 1023410021)) | (~((-67111170) | i))) | (~((-542482465) | i))) * 765) + (-46467547)) + (((~(i29 | 956298852)) | (-1023410022)) * 1530)) + (((~(956298852 | i)) | (~(i29 | (-542482465)))) * 765)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                                if (i41 != i) {
                                    java.lang.Object[] objArr72 = {new int[]{i}, new int[]{i41}, null, null, new int[1]};
                                    int i42 = ~(i29 | 1596360591);
                                    java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((((~(i29 | (-454485507))) | 453412354) | (~(i29 | (-1596360592)))) | (~(1597433743 | i))) * (-84)) - 1771740891) + (((~(i | (-1596360592))) | 454485506 | i42) * (-84)) + (((-1597433744) | i42) * 84))};
                                    java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj22 == null) {
                                        java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), android.view.MotionEvent.axisFromString(str8) + 2714, (char) android.text.TextUtils.indexOf(str8, str8, 0));
                                        byte[] bArr12 = $$a;
                                        byte b23 = (byte) (bArr12[16] + 1);
                                        byte b24 = (byte) (bArr12[14] + 1);
                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                        b(b23, b24, (short) (b24 | 653), objArr74);
                                        obj22 = cls20.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                    }
                                    ((int[]) objArr72[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr73)).intValue();
                                    return objArr72;
                                }
                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 309, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 23, objArr75);
                                java.lang.Object[] objArr76 = {((java.lang.String) objArr75[0]).intern()};
                                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj23 == null) {
                                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.alpha(0), 1921 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                    int i43 = $$a[14] + 1;
                                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                                    b((byte) i43, r11[16], (short) i43, objArr77);
                                    obj23 = cls21.getMethod((java.lang.String) objArr77[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj23);
                                }
                                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj23).invoke(null, objArr76);
                                if (invoke2 != null) {
                                    java.lang.Object[] objArr78 = {invoke2, 42};
                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj24 == null) {
                                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.graphics.Color.alpha(0) + 2594, (char) (android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                        int i44 = $$a[14] + 1;
                                        java.lang.Object[] objArr79 = new java.lang.Object[1];
                                        b((byte) i44, r10[16], (short) i44, objArr79);
                                        obj24 = cls22.getMethod((java.lang.String) objArr79[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj24);
                                    }
                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr78)).longValue();
                                    long j25 = ~(510553551 | longValue8);
                                    long j26 = (~longValue8) | (-510553552);
                                    long j27 = 746546973 + ((1435 * longValue8) - 365556342516L) + ((longValue8 | (-510553552)) * (-1434)) + (((~(j14 | longValue8)) | j25 | (~(j26 | j9))) * 717) + (((~(j26 | j14)) | j25 | (~(longValue8 | j9))) * 717);
                                    if (((((int) j27) & ((((((~(774788478 | i)) | 22020097) | (~((-662437932) | i))) * (-754)) - 250192929) + (((~((-22020098) | i)) | (~(i29 | (-640417835)))) * (-754)) + ((i29 | 774788478) * 754))) | (((int) (j27 >> 32)) & ((((~(i29 | 597843278)) | 2035069689) * (-90)) + 1687905420 + (((~(597843278 | i)) | 44190982) * (-45)) + (((~((-2035069690) | i)) | 597843278 | (~(i29 | 2035069689))) * 45)))) == 1986687685) {
                                        j = j14;
                                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                                        a(446 - android.view.KeyEvent.keyCodeFromString(str8), (char) ((-1) - android.os.Process.getGidForName(str8)), 16 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr80);
                                        java.lang.Object[] objArr81 = {((java.lang.String) objArr80[0]).intern()};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj == null) {
                                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1922, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            int i45 = $$a[14] + 1;
                                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                                            b((byte) i45, r8[16], (short) i45, objArr82);
                                            obj = cls23.getMethod((java.lang.String) objArr82[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                                        }
                                        invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr81);
                                        if (invoke != null) {
                                            values = (AlternateContactlessPaymentDataJson + 85) % 128;
                                            i12 = 0;
                                        } else {
                                            java.lang.Object[] objArr83 = {invoke, 42};
                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj25 == null) {
                                                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str8, str8, 0, 0) + 28, 2594 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                int i46 = $$a[14] + 1;
                                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                b((byte) i46, r9[16], (short) i46, objArr84);
                                                obj25 = cls24.getMethod((java.lang.String) objArr84[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj25);
                                            }
                                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr83)).longValue();
                                            long j28 = ~longValue9;
                                            long j29 = ~(j9 | 825594184);
                                            long j30 = ~((-825594185) | longValue9);
                                            long j31 = 431506340 + ((408 * longValue9) - 671208071592L) + (((~(j28 | 825594184)) | j29) * (-814)) + (((~(j28 | j)) | j30 | j29) * 407) + (((~(longValue9 | j9)) | (~(j9 | (-825594185))) | j30) * 407);
                                            i12 = (((int) (j31 >> 32)) & ((((((~(i29 | 1752965106)) | 1104775778) * (-933)) - 2027995174) + (((~(i29 | 1104775778)) | 673453456) * 933)) - 2132945110)) | (((int) j31) & ((((~(1686588804 | i)) | (-1860173791)) * (-283)) + 414568144 + ((~((-173584987) | i)) * 283)));
                                        }
                                        if (i12 != 1986687685 && i12 != -1514516938) {
                                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                                            a(1161 - android.view.View.resolveSize(0, 0), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 14 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr85);
                                            java.lang.String intern16 = ((java.lang.String) objArr85[0]).intern();
                                            java.lang.Object[] objArr86 = new java.lang.Object[1];
                                            a(android.view.View.resolveSize(0, 0) + 1175, (char) (5335 - android.view.View.MeasureSpec.getMode(0)), 26 - android.view.KeyEvent.getDeadChar(0, 0), objArr86);
                                            java.lang.String intern17 = ((java.lang.String) objArr86[0]).intern();
                                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                                            a(android.view.KeyEvent.getDeadChar(0, 0) + 1201, (char) (android.graphics.Color.green(0) + 35888), android.view.View.resolveSize(0, 0) + 17, objArr87);
                                            java.lang.String intern18 = ((java.lang.String) objArr87[0]).intern();
                                            java.lang.Object[] objArr88 = new java.lang.Object[1];
                                            a((android.os.Process.myTid() >> 22) + 1218, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 17, objArr88);
                                            java.lang.String intern19 = ((java.lang.String) objArr88[0]).intern();
                                            java.lang.Object[] objArr89 = new java.lang.Object[1];
                                            a(1235 - android.text.TextUtils.indexOf(str8, str8, 0, 0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 16, objArr89);
                                            java.lang.String intern20 = ((java.lang.String) objArr89[0]).intern();
                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                            a(android.graphics.Color.argb(0, 0, 0, 0) + 1250, (char) android.text.TextUtils.getCapsMode(str8, 0, 0), 36 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr90);
                                            java.lang.String intern21 = ((java.lang.String) objArr90[0]).intern();
                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                            a(1287 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22685), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '$', objArr91);
                                            java.lang.String intern22 = ((java.lang.String) objArr91[0]).intern();
                                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                                            a(android.graphics.Color.blue(0) + 1299, (char) android.graphics.Color.green(0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 13, objArr92);
                                            java.lang.String intern23 = ((java.lang.String) objArr92[0]).intern();
                                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                                            a(1313 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.graphics.Color.green(0) + 45729), 22 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr93);
                                            java.lang.String intern24 = ((java.lang.String) objArr93[0]).intern();
                                            java.lang.Object[] objArr94 = new java.lang.Object[1];
                                            a(1334 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 31 - android.text.TextUtils.getTrimmedLength(str8), objArr94);
                                            java.lang.String intern25 = ((java.lang.String) objArr94[0]).intern();
                                            java.lang.Object[] objArr95 = new java.lang.Object[1];
                                            a(android.graphics.Color.blue(0) + 1365, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54075), 12 - (android.os.Process.myPid() >> 22), objArr95);
                                            java.lang.String intern26 = ((java.lang.String) objArr95[0]).intern();
                                            java.lang.Object[] objArr96 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1376, (char) (48870 - android.view.KeyEvent.getDeadChar(0, 0)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 12, objArr96);
                                            java.lang.String intern27 = ((java.lang.String) objArr96[0]).intern();
                                            java.lang.Object[] objArr97 = new java.lang.Object[1];
                                            a(1389 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr97);
                                            java.lang.String intern28 = ((java.lang.String) objArr97[0]).intern();
                                            java.lang.Object[] objArr98 = new java.lang.Object[1];
                                            a(android.graphics.Color.red(0) + 1401, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 12, objArr98);
                                            java.lang.String intern29 = ((java.lang.String) objArr98[0]).intern();
                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                            a(1413 - android.view.View.combineMeasuredStates(0, 0), (char) android.view.View.MeasureSpec.getMode(0), 13 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr99);
                                            java.lang.String intern30 = ((java.lang.String) objArr99[0]).intern();
                                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                                            a(1425 - android.view.View.resolveSize(0, 0), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50143), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 14, objArr100);
                                            java.lang.String intern31 = ((java.lang.String) objArr100[0]).intern();
                                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                                            a(1439 - android.text.TextUtils.indexOf(str8, str8, 0, 0), (char) (43236 - android.text.TextUtils.getTrimmedLength(str8)), 12 - android.graphics.Color.argb(0, 0, 0, 0), objArr101);
                                            java.lang.String intern32 = ((java.lang.String) objArr101[0]).intern();
                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                            a(android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1452, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, objArr102);
                                            java.lang.String intern33 = ((java.lang.String) objArr102[0]).intern();
                                            java.lang.Object[] objArr103 = new java.lang.Object[1];
                                            a(1475 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.text.TextUtils.indexOf(str8, str8, 0, 0) + 28, objArr103);
                                            java.lang.String[] strArr8 = {intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, ((java.lang.String) objArr103[0]).intern()};
                                            for (i17 = 0; i17 < 19; i17++) {
                                                java.lang.String str10 = strArr8[i17];
                                                java.lang.Object[] objArr104 = {str10};
                                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                if (obj26 == null) {
                                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str8, 0, 0) + 36, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3161, (char) (33098 - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                                    byte[] bArr13 = $$a;
                                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                    b((byte) (-bArr13[14]), (byte) (-bArr13[21]), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr105);
                                                    obj26 = cls25.getMethod((java.lang.String) objArr105[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj26);
                                                }
                                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr104)).longValue();
                                                long j32 = ((565 * longValue10) - 523896122242L) + (((~(longValue10 | j9)) | (~((~longValue10) | j)) | (-930543735)) * (-564)) + ((~((-930543735) | longValue10 | j9)) * 1128) + (((~(j | (-930543735))) | (~(longValue10 | 930543734))) * 564) + 64891169;
                                                if (((((int) (j32 >> 32)) & (((((~(i29 | (-1074267226))) | (-1783473660)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 1014088478) + (((~(i29 | (-1745421820))) | (-1112319066)) * (-440)) + (((-1074267226) | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j32) & (((((~(i29 | 312506028)) | (-1749732439)) * (-1042)) - 2121643718) + ((312506028 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(1749732438 | i)) | 312488616 | (~(i29 | (-1749715027)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) == 0) {
                                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                    a(1425 - android.view.KeyEvent.normalizeMetaState(0), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 50142), 14 - android.graphics.Color.red(0), objArr106);
                                                    if (str10.equals(((java.lang.String) objArr106[0]).intern())) {
                                                        java.lang.Object[] objArr107 = {str10};
                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                        if (obj27 == null) {
                                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str8, str8, 0, 0) + 36, 3161 - (android.os.Process.myPid() >> 22), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33098));
                                                            byte[] bArr14 = $$a;
                                                            java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                            b((byte) (-bArr14[14]), (byte) (-bArr14[21]), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr108);
                                                            obj27 = cls26.getMethod((java.lang.String) objArr108[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj27);
                                                        }
                                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr107)).longValue();
                                                        long j33 = ~longValue11;
                                                        long j34 = (((-317) * longValue11) - 322889593796L) + (((~(j9 | 1012193083)) | j33) * (-318)) + (((~(j33 | j9)) | (~(j | (-1012193084) | longValue11))) * 318) + (((~(j33 | j | (-1012193084))) | (~((-1012193084) | longValue11 | j9))) * 318) + 2007627987;
                                                        if (((((int) (j34 >> 32)) & (((((-89585642) | i) * (-50)) - 2073246962) + (((~((-1510017045) | i)) | (~(i29 | (-16795009)))) * 50) + (((~(i29 | (-89585642))) | (~(i29 | (-1526812053))) | 16795008) * 50))) | (((int) j34) & ((((~(i29 | 479971977)) | (~((-957254433) | i))) * 959) + 410400875 + (((~(479971977 | i)) | (~(i29 | (-957254433)))) * 959)))) != 0) {
                                                        }
                                                    }
                                                }
                                                i18 = i17;
                                            }
                                            i18 = -1;
                                            if (i18 >= 0 && (i19 = i ^ (i18 + 130)) != i) {
                                                java.lang.Object[] objArr109 = {new int[]{i}, new int[]{i19}, null, null, new int[1]};
                                                java.lang.Object[] objArr110 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i29 | 1651771878)) | 399074219) * (-1042)) - 2064572546) + ((1651771878 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i | (-399074220))) | 37749154 | (~(i29 | 2013096943))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj2 == null) {
                                                    java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.View.resolveSize(0, 0) + 2713, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                    byte[] bArr15 = $$a;
                                                    byte b25 = (byte) (bArr15[16] + 1);
                                                    byte b26 = (byte) (bArr15[14] + 1);
                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                    b(b25, b26, (short) (b26 | 653), objArr111);
                                                    obj2 = cls27.getMethod((java.lang.String) objArr111[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                                                }
                                                ((int[]) objArr109[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr110)).intValue();
                                                return objArr109;
                                            }
                                        }
                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                        a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 1503, (char) (17984 - android.graphics.Color.red(0)), android.view.KeyEvent.keyCodeFromString(str8) + 13, objArr112);
                                        java.lang.String intern34 = ((java.lang.String) objArr112[0]).intern();
                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                        a(1516 - android.text.TextUtils.getTrimmedLength(str8), (char) ((-1) - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.View.MeasureSpec.getMode(0) + 5, objArr113);
                                        java.lang.String[] strArr9 = {intern34, ((java.lang.String) objArr113[0]).intern()};
                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                        a(1521 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.view.KeyEvent.getDeadChar(0, 0), 15 - android.view.View.getDefaultSize(0, 0), objArr114);
                                        java.lang.String intern35 = ((java.lang.String) objArr114[0]).intern();
                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                        a(1536 - android.graphics.Color.red(0), (char) (2315 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 19 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr115);
                                        java.lang.String intern36 = ((java.lang.String) objArr115[0]).intern();
                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                        a(1556 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 13 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr116);
                                        java.lang.String[] strArr10 = {intern35, intern36, ((java.lang.String) objArr116[0]).intern()};
                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                        a(android.text.TextUtils.indexOf(str8, str8) + 1569, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4917), android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 22, objArr117);
                                        java.lang.String intern37 = ((java.lang.String) objArr117[0]).intern();
                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                        a(1590 - android.view.View.MeasureSpec.getSize(0), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17749), 10 - android.view.KeyEvent.normalizeMetaState(0), objArr118);
                                        java.lang.String[] strArr11 = {intern37, ((java.lang.String) objArr118[0]).intern()};
                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                        a(1601 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2461), 11 - android.text.TextUtils.indexOf(str8, str8, 0, 0), objArr119);
                                        java.lang.String intern38 = ((java.lang.String) objArr119[0]).intern();
                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                        a(337 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2620), 6 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr120);
                                        java.lang.String[] strArr12 = {intern38, ((java.lang.String) objArr120[0]).intern()};
                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                        a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 1612, (char) (4424 - android.view.View.resolveSize(0, 0)), 29 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr121);
                                        java.lang.String intern39 = ((java.lang.String) objArr121[0]).intern();
                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                        a(1590 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17749), 10 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr122);
                                        c2 = 0;
                                        java.lang.String[][] strArr13 = {strArr9, strArr10, strArr11, strArr12, new java.lang.String[]{intern39, ((java.lang.String) objArr122[0]).intern()}};
                                        i13 = -1;
                                        i14 = 0;
                                        while (true) {
                                            if (i14 < 5) {
                                                i15 = i;
                                                break;
                                            }
                                            java.lang.String[] strArr14 = strArr13[i14];
                                            java.lang.String str11 = strArr14[c2];
                                            java.lang.String[] strArr15 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr14, 1, strArr14.length);
                                            int length = strArr15.length;
                                            int i47 = i13;
                                            int i48 = 0;
                                            while (i48 < length) {
                                                java.lang.String str12 = strArr15[i48];
                                                int i49 = i47 + 1;
                                                java.io.File file3 = new java.io.File(str11);
                                                if (file3.exists() && file3.isFile()) {
                                                    try {
                                                        java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                                        strArr3 = strArr13;
                                                        try {
                                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                            strArr4 = strArr15;
                                                            try {
                                                                a(307 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 3, objArr123);
                                                                java.util.Scanner useDelimiter3 = scanner3.useDelimiter(((java.lang.String) objArr123[0]).intern());
                                                                if (useDelimiter3.hasNext()) {
                                                                    AlternateContactlessPaymentDataJson = (values + 87) % 128;
                                                                    str4 = useDelimiter3.next();
                                                                } else {
                                                                    str4 = str8;
                                                                }
                                                                useDelimiter3.close();
                                                            } catch (java.io.IOException unused3) {
                                                                continue;
                                                            }
                                                        } catch (java.io.IOException unused4) {
                                                        }
                                                    } catch (java.io.IOException unused5) {
                                                    }
                                                    if (str4.contains(str12)) {
                                                        int i50 = values + 99;
                                                        AlternateContactlessPaymentDataJson = i50 % 128;
                                                        i15 = i50 % 2 == 0 ? i ^ (i49 % 353) : i ^ (i47 + 171);
                                                    } else {
                                                        i48++;
                                                        strArr13 = strArr3;
                                                        i47 = i49;
                                                        strArr15 = strArr4;
                                                    }
                                                }
                                                strArr3 = strArr13;
                                                strArr4 = strArr15;
                                                i48++;
                                                strArr13 = strArr3;
                                                i47 = i49;
                                                strArr15 = strArr4;
                                            }
                                            i14++;
                                            i13 = i47;
                                            c2 = 0;
                                        }
                                        if (i15 == i) {
                                            java.lang.Object[] objArr124 = {new int[]{i}, new int[]{i15}, null, null, new int[1]};
                                            java.lang.Object[] objArr125 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i | (-1879662601))) | 3410949) * 449) + 1127863807 + (((~(i29 | (-1879662601))) | 3410949) * 449))};
                                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj28 == null) {
                                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetBefore(str8, 0), 2713 - android.view.KeyEvent.keyCodeFromString(str8), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                byte[] bArr16 = $$a;
                                                byte b27 = (byte) (bArr16[16] + 1);
                                                byte b28 = (byte) (bArr16[14] + 1);
                                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                b(b27, b28, (short) (b28 | 653), objArr126);
                                                obj28 = cls28.getMethod((java.lang.String) objArr126[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                                            }
                                            ((int[]) objArr124[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr125)).intValue();
                                            return objArr124;
                                        }
                                        try {
                                            java.lang.Object[] objArr127 = new java.lang.Object[1];
                                            a(1639 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35476), android.text.TextUtils.getOffsetBefore(str8, 0) + 13, objArr127);
                                            intern = ((java.lang.String) objArr127[0]).intern();
                                            objArr = new java.lang.Object[1];
                                            a(1652 - android.view.View.MeasureSpec.getMode(0), (char) (36021 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, objArr);
                                        } catch (java.lang.Exception unused6) {
                                            i16 = i ^ 151;
                                        }
                                        try {
                                            java.lang.Object[] objArr128 = {intern, ((java.lang.String) objArr[0]).intern()};
                                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                            if (obj29 == null) {
                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2212 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                int i51 = $$a[14] + 1;
                                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                b((byte) i51, r5[16], (short) i51, objArr129);
                                                obj29 = cls29.getMethod((java.lang.String) objArr129[0], java.lang.String.class, java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj29);
                                            }
                                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr128)).longValue();
                                            long j35 = (((((382 * longValue12) + 122711386760L) + (((longValue12 | j9) | 322924701) * (-381))) + ((((~(322924701 | (~longValue12))) | (~(j | longValue12))) | (~((-322924702) | longValue12))) * 381)) + ((~(longValue12 | 322924701)) * 381)) - 412449900;
                                            i16 = ((((int) (j35 >> 32)) & (((((i29 | 2621712) * (-192)) + (-1788177110)) + (((~(i29 | 272511410)) | 1707116109) * (-384))) + ((((~((-1707116110) | i)) | (~(i29 | 1979627519))) | (~((-269889699) | i))) * 192))) | (((int) j35) & (((((~(i29 | 1268667735)) | 168558674) * (-591)) + 1233347530) + ((1268667735 | i) * 591)))) != 0 ? i ^ 150 : i;
                                            if (i16 != i) {
                                                java.lang.Object[] objArr130 = {new int[]{i}, new int[]{i16}, null, null, new int[1]};
                                                java.lang.Object[] objArr131 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((r1 * 495) - 108537448) + (((~(i29 | 283826424)) | 4362392) * 495))};
                                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj30 == null) {
                                                    java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, android.view.View.getDefaultSize(0, 0) + 2713, (char) android.graphics.Color.red(0));
                                                    byte[] bArr17 = $$a;
                                                    byte b29 = (byte) (bArr17[16] + 1);
                                                    byte b30 = (byte) (bArr17[14] + 1);
                                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                    b(b29, b30, (short) (b30 | 653), objArr132);
                                                    obj30 = cls30.getMethod((java.lang.String) objArr132[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                                }
                                                ((int[]) objArr130[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr131)).intValue();
                                                return objArr130;
                                            }
                                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                                            a(android.view.MotionEvent.axisFromString(str8) + 1661, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 48 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr133);
                                            java.lang.Object[] objArr134 = {((java.lang.String) objArr133[0]).intern()};
                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                            if (obj31 == null) {
                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 3161 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 33099));
                                                byte b31 = $$a[16];
                                                java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                b((byte) (b31 + 1), b31, 618, objArr135);
                                                obj31 = cls31.getMethod((java.lang.String) objArr135[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj31);
                                            }
                                            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr134)).longValue();
                                            long j36 = ~(j9 | (-463924355));
                                            long j37 = ~longValue13;
                                            long j38 = ((-139) * longValue13) + 65413333914L + (((~((-463924355) | longValue13)) | j36) * (-280)) + ((j36 | (~(j37 | j9))) * 140) + (((~(longValue13 | j | (-463924355))) | (~((-463924355) | j37 | j9)) | (~(463924354 | j37 | j))) * 140) + 443546384;
                                            int i52 = ~(i29 | 1335230183);
                                            int i53 = ~((-408054219) | i);
                                            int i54 = (((((int) (j38 >> 32)) & ((((((~((-261379780) | i)) | 101996227) | i52) * (-470)) + 2130812844) + ((i52 | (~((-159383553) | i))) * 470))) | (((((((~(i29 | 1028811210)) | (-1029172192)) | i53) * (-252)) + 1204386261) + ((i53 | (~(i29 | (-360982)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)) & ((int) j38))) * 263) ^ i;
                                            if (i54 != i) {
                                                java.lang.Object[] objArr136 = {new int[]{i}, new int[]{i54}, null, null, new int[1]};
                                                java.lang.Object[] objArr137 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i29 | (-1996167377))) | (~((-54678722) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 235620895 + (((~(i | (-1958283281))) | (~(i29 | (-16794626)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj32 == null) {
                                                    java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetAfter(str8, 0), android.graphics.Color.green(0) + 2713, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                                    byte[] bArr18 = $$a;
                                                    byte b32 = (byte) (bArr18[16] + 1);
                                                    byte b33 = (byte) (bArr18[14] + 1);
                                                    java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                    b(b32, b33, (short) (b33 | 653), objArr138);
                                                    obj32 = cls32.getMethod((java.lang.String) objArr138[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                }
                                                ((int[]) objArr136[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr137)).intValue();
                                                return objArr136;
                                            }
                                            java.lang.Object[] objArr139 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                            java.lang.Object[] objArr140 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((~(i29 | (-1518860695))) | (~((-531985404) | i))) * 1900) - 632760965) + (((~(i29 | 531985403)) | (~(1518860694 | i))) * (-950)) + (((~(i | 531985403)) | (~(i29 | 1518860694))) * 950))};
                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj33 == null) {
                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.normalizeMetaState(0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2712, (char) android.view.View.MeasureSpec.getSize(0));
                                                byte[] bArr19 = $$a;
                                                byte b34 = (byte) (bArr19[16] + 1);
                                                byte b35 = (byte) (bArr19[14] + 1);
                                                java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                b(b34, b35, (short) (b35 | 653), objArr141);
                                                obj33 = cls33.getMethod((java.lang.String) objArr141[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                            }
                                            ((int[]) objArr139[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr140)).intValue();
                                            return objArr139;
                                        } catch (java.lang.Throwable th2) {
                                            java.lang.Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    }
                                }
                                java.lang.Object[] objArr142 = new java.lang.Object[1];
                                a(311 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23, objArr142);
                                java.lang.String intern40 = ((java.lang.String) objArr142[0]).intern();
                                java.lang.Object[] objArr143 = new java.lang.Object[1];
                                a(365 - android.graphics.Color.argb(0, 0, 0, 0), (char) (34245 - android.text.TextUtils.getCapsMode(str8, 0, 0)), android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 11, objArr143);
                                java.lang.String intern41 = ((java.lang.String) objArr143[0]).intern();
                                java.lang.Object[] objArr144 = new java.lang.Object[1];
                                a(376 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (9201 - android.view.KeyEvent.normalizeMetaState(0)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 7, objArr144);
                                java.lang.String intern42 = ((java.lang.String) objArr144[0]).intern();
                                java.lang.Object[] objArr145 = new java.lang.Object[1];
                                a(382 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (android.os.Process.myPid() >> 22) + 8, objArr145);
                                java.lang.String[] strArr16 = {intern40, intern41, intern42, ((java.lang.String) objArr145[0]).intern()};
                                java.lang.Object[] objArr146 = new java.lang.Object[1];
                                a(390 - android.graphics.Color.red(0), (char) (android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.text.TextUtils.indexOf(str8, str8, 0) + 17, objArr146);
                                java.lang.String intern43 = ((java.lang.String) objArr146[0]).intern();
                                java.lang.Object[] objArr147 = new java.lang.Object[1];
                                a(android.view.View.resolveSizeAndState(0, 0, 0) + 407, (char) (android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 63347), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 7, objArr147);
                                java.lang.String intern44 = ((java.lang.String) objArr147[0]).intern();
                                java.lang.Object[] objArr148 = new java.lang.Object[1];
                                a(android.graphics.Color.blue(0) + 414, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 7 - android.view.View.getDefaultSize(0, 0), objArr148);
                                java.lang.String intern45 = ((java.lang.String) objArr148[0]).intern();
                                java.lang.Object[] objArr149 = new java.lang.Object[1];
                                a(421 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 52990), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 11, objArr149);
                                java.lang.String intern46 = ((java.lang.String) objArr149[0]).intern();
                                java.lang.Object[] objArr150 = new java.lang.Object[1];
                                a(android.text.TextUtils.getCapsMode(str8, 0, 0) + 432, (char) android.graphics.Color.green(0), 14 - android.view.View.resolveSize(0, 0), objArr150);
                                java.lang.String[] strArr17 = {intern43, intern44, intern45, intern46, ((java.lang.String) objArr150[0]).intern()};
                                java.lang.Object[] objArr151 = new java.lang.Object[1];
                                a(446 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 16 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr151);
                                java.lang.String intern47 = ((java.lang.String) objArr151[0]).intern();
                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                a(462 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.text.TextUtils.getCapsMode(str8, 0, 0), android.graphics.Color.alpha(0) + 3, objArr152);
                                java.lang.String intern48 = ((java.lang.String) objArr152[0]).intern();
                                java.lang.Object[] objArr153 = new java.lang.Object[1];
                                a(472 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), 22 - android.text.TextUtils.getOffsetAfter(str8, 0), objArr153);
                                java.lang.String intern49 = ((java.lang.String) objArr153[0]).intern();
                                java.lang.Object[] objArr154 = new java.lang.Object[1];
                                a(495 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.MotionEvent.axisFromString(str8) + 35676), 25 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr154);
                                java.lang.String intern50 = ((java.lang.String) objArr154[0]).intern();
                                java.lang.Object[] objArr155 = new java.lang.Object[1];
                                a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 26058), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27, objArr155);
                                java.lang.String[] strArr18 = {intern47, intern48, str, intern49, intern50, ((java.lang.String) objArr155[0]).intern()};
                                java.lang.Object[] objArr156 = new java.lang.Object[1];
                                a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 547, (char) (6800 - android.view.View.MeasureSpec.getMode(0)), 11 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr156);
                                java.lang.String intern51 = ((java.lang.String) objArr156[0]).intern();
                                java.lang.Object[] objArr157 = new java.lang.Object[1];
                                a((android.os.Process.myTid() >> 22) + 559, (char) (12635 - android.graphics.Color.red(0)), 8 - android.text.TextUtils.getCapsMode(str8, 0, 0), objArr157);
                                java.lang.String intern52 = ((java.lang.String) objArr157[0]).intern();
                                java.lang.Object[] objArr158 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 567, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 61030), 5 - android.os.Process.getGidForName(str8), objArr158);
                                java.lang.String intern53 = ((java.lang.String) objArr158[0]).intern();
                                java.lang.Object[] objArr159 = new java.lang.Object[1];
                                a(android.view.View.resolveSizeAndState(0, 0, 0) + 573, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 6 - android.graphics.Color.red(0), objArr159);
                                java.lang.String[] strArr19 = {intern51, intern52, intern53, ((java.lang.String) objArr159[0]).intern()};
                                java.lang.Object[] objArr160 = new java.lang.Object[1];
                                a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 578, (char) (android.text.TextUtils.getOffsetAfter(str8, 0) + 44995), 17 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr160);
                                java.lang.String intern54 = ((java.lang.String) objArr160[0]).intern();
                                java.lang.Object[] objArr161 = new java.lang.Object[1];
                                a(414 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 7 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr161);
                                java.lang.String intern55 = ((java.lang.String) objArr161[0]).intern();
                                java.lang.Object[] objArr162 = new java.lang.Object[1];
                                a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 382, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), 8 - android.text.TextUtils.indexOf(str8, str8, 0), objArr162);
                                java.lang.String[] strArr20 = {intern54, intern55, ((java.lang.String) objArr162[0]).intern()};
                                java.lang.Object[] objArr163 = new java.lang.Object[1];
                                a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 595, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 14 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr163);
                                java.lang.String intern56 = ((java.lang.String) objArr163[0]).intern();
                                java.lang.Object[] objArr164 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO, (char) android.graphics.Color.red(0), 1 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr164);
                                java.lang.String[] strArr21 = {intern56, ((java.lang.String) objArr164[0]).intern()};
                                java.lang.Object[] objArr165 = new java.lang.Object[1];
                                a(android.text.TextUtils.indexOf(str8, str8, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, (char) android.text.TextUtils.indexOf(str8, str8), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8, objArr165);
                                java.lang.String intern57 = ((java.lang.String) objArr165[0]).intern();
                                java.lang.Object[] objArr166 = new java.lang.Object[1];
                                a(android.view.MotionEvent.axisFromString(str8) + 620, (char) (android.graphics.Color.blue(0) + 37091), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr166);
                                java.lang.String[] strArr22 = {intern57, ((java.lang.String) objArr166[0]).intern()};
                                java.lang.Object[] objArr167 = new java.lang.Object[1];
                                a(620 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 35846), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, objArr167);
                                java.lang.String intern58 = ((java.lang.String) objArr167[0]).intern();
                                java.lang.Object[] objArr168 = new java.lang.Object[1];
                                a(android.graphics.Color.alpha(0) + 462, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.getOffsetBefore(str8, 0) + 3, objArr168);
                                java.lang.String intern59 = ((java.lang.String) objArr168[0]).intern();
                                java.lang.Object[] objArr169 = new java.lang.Object[1];
                                a(407 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (63347 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 6 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr169);
                                java.lang.String intern60 = ((java.lang.String) objArr169[0]).intern();
                                java.lang.Object[] objArr170 = new java.lang.Object[1];
                                a(636 - android.graphics.Color.green(0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 8 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr170);
                                java.lang.String intern61 = ((java.lang.String) objArr170[0]).intern();
                                java.lang.Object[] objArr171 = new java.lang.Object[1];
                                a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 421, (char) (android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 52992), (android.os.Process.myTid() >> 22) + 11, objArr171);
                                java.lang.String intern62 = ((java.lang.String) objArr171[0]).intern();
                                java.lang.Object[] objArr172 = new java.lang.Object[1];
                                a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 384, (char) android.text.TextUtils.getTrimmedLength(str8), 14 - android.text.TextUtils.indexOf(str8, str8, 0), objArr172);
                                java.lang.String[] strArr23 = {intern58, intern59, intern60, intern61, intern62, ((java.lang.String) objArr172[0]).intern()};
                                java.lang.Object[] objArr173 = new java.lang.Object[1];
                                a(android.graphics.Color.green(0) + 644, (char) (62828 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), android.view.View.combineMeasuredStates(0, 0) + 20, objArr173);
                                java.lang.String intern63 = ((java.lang.String) objArr173[0]).intern();
                                java.lang.Object[] objArr174 = new java.lang.Object[1];
                                a(664 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.os.Process.myPid() >> 22), 19 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr174);
                                java.lang.String intern64 = ((java.lang.String) objArr174[0]).intern();
                                java.lang.Object[] objArr175 = new java.lang.Object[1];
                                a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 683, (char) (28765 - android.widget.ExpandableListView.getPackedPositionType(0L)), android.view.View.MeasureSpec.getSize(0) + 31, objArr175);
                                java.lang.String intern65 = ((java.lang.String) objArr175[0]).intern();
                                java.lang.Object[] objArr176 = new java.lang.Object[1];
                                a(714 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 27, objArr176);
                                java.lang.String intern66 = ((java.lang.String) objArr176[0]).intern();
                                java.lang.Object[] objArr177 = new java.lang.Object[1];
                                a(740 - android.text.TextUtils.indexOf(str8, str8), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.Color.argb(0, 0, 0, 0) + 23, objArr177);
                                java.lang.String intern67 = ((java.lang.String) objArr177[0]).intern();
                                java.lang.Object[] objArr178 = new java.lang.Object[1];
                                a(android.text.TextUtils.getCapsMode(str8, 0, 0) + 763, (char) android.view.KeyEvent.normalizeMetaState(0), 33 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr178);
                                java.lang.String[] strArr24 = {intern63, intern64, intern65, intern66, intern67, ((java.lang.String) objArr178[0]).intern(), str};
                                java.lang.Object[] objArr179 = new java.lang.Object[1];
                                a(796 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 62488), 13 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr179);
                                java.lang.String intern68 = ((java.lang.String) objArr179[0]).intern();
                                java.lang.Object[] objArr180 = new java.lang.Object[1];
                                a(android.text.TextUtils.getOffsetAfter(str8, 0) + 375, (char) (android.text.TextUtils.getOffsetBefore(str8, 0) + 9201), android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 8, objArr180);
                                java.lang.String[] strArr25 = {intern68, ((java.lang.String) objArr180[0]).intern()};
                                java.lang.Object[] objArr181 = new java.lang.Object[1];
                                a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED, (char) android.text.TextUtils.indexOf(str8, str8, 0), (-16777186) - android.graphics.Color.rgb(0, 0, 0), objArr181);
                                java.lang.String intern69 = ((java.lang.String) objArr181[0]).intern();
                                java.lang.Object[] objArr182 = new java.lang.Object[1];
                                a(839 - android.view.View.MeasureSpec.getMode(0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, objArr182);
                                java.lang.String[] strArr26 = {intern69, ((java.lang.String) objArr182[0]).intern()};
                                java.lang.Object[] objArr183 = new java.lang.Object[1];
                                a(android.text.TextUtils.getOffsetAfter(str8, 0) + 850, (char) (21166 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), 'C' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr183);
                                java.lang.String intern70 = ((java.lang.String) objArr183[0]).intern();
                                java.lang.Object[] objArr184 = new java.lang.Object[1];
                                a(870 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (15073 - android.view.View.combineMeasuredStates(0, 0)), 4 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr184);
                                java.lang.String[] strArr27 = {intern70, ((java.lang.String) objArr184[0]).intern()};
                                java.lang.Object[] objArr185 = new java.lang.Object[1];
                                a(874 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 22855), 19 - android.view.View.MeasureSpec.getMode(0), objArr185);
                                java.lang.String[] strArr28 = {((java.lang.String) objArr185[0]).intern()};
                                java.lang.Object[] objArr186 = new java.lang.Object[1];
                                a(892 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (19436 - android.view.View.resolveSize(0, 0)), 15 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr186);
                                java.lang.String[] strArr29 = {((java.lang.String) objArr186[0]).intern()};
                                java.lang.Object[] objArr187 = new java.lang.Object[1];
                                a(android.graphics.Color.green(0) + 909, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 19 - android.text.TextUtils.getOffsetBefore(str8, 0), objArr187);
                                java.lang.String[] strArr30 = {((java.lang.String) objArr187[0]).intern()};
                                java.lang.Object[] objArr188 = new java.lang.Object[1];
                                a(927 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (9968 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 19 - android.graphics.Color.alpha(0), objArr188);
                                java.lang.String[] strArr31 = {((java.lang.String) objArr188[0]).intern()};
                                java.lang.Object[] objArr189 = new java.lang.Object[1];
                                a(947 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 23, objArr189);
                                java.lang.String[] strArr32 = {((java.lang.String) objArr189[0]).intern()};
                                java.lang.Object[] objArr190 = new java.lang.Object[1];
                                a(android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 971, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 24071), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20, objArr190);
                                java.lang.String[] strArr33 = {((java.lang.String) objArr190[0]).intern()};
                                java.lang.Object[] objArr191 = new java.lang.Object[1];
                                a(991 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (11089 - android.graphics.ImageFormat.getBitsPerPixel(0)), 24 - android.graphics.Color.green(0), objArr191);
                                java.lang.String str13 = str;
                                java.lang.String[] strArr34 = {((java.lang.String) objArr191[0]).intern(), str13};
                                java.lang.Object[] objArr192 = new java.lang.Object[1];
                                a(1015 - android.view.View.resolveSize(0, 0), (char) android.text.TextUtils.getOffsetBefore(str8, 0), android.text.TextUtils.getOffsetBefore(str8, 0) + 28, objArr192);
                                java.lang.String[] strArr35 = {((java.lang.String) objArr192[0]).intern(), str13};
                                java.lang.Object[] objArr193 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_SPOT_HALFTONE, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14888), android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, objArr193);
                                java.lang.String[] strArr36 = {((java.lang.String) objArr193[0]).intern(), str13};
                                java.lang.Object[] objArr194 = new java.lang.Object[1];
                                a(1069 - android.os.Process.getGidForName(str8), (char) (3916 - android.text.TextUtils.getTrimmedLength(str8)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 31, objArr194);
                                java.lang.String[] strArr37 = {((java.lang.String) objArr194[0]).intern(), str13};
                                java.lang.Object[] objArr195 = new java.lang.Object[1];
                                a(android.text.TextUtils.getOffsetBefore(str8, 0) + 1101, (char) (android.view.View.getDefaultSize(0, 0) + 19343), 26 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr195);
                                java.lang.String[] strArr38 = {((java.lang.String) objArr195[0]).intern(), str13};
                                java.lang.Object[] objArr196 = new java.lang.Object[1];
                                a(android.view.KeyEvent.keyCodeFromString(str8) + 1128, (char) (58585 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 32, objArr196);
                                java.lang.String[][] strArr39 = {strArr16, strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, new java.lang.String[]{((java.lang.String) objArr196[0]).intern(), str13}};
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                int i55 = i;
                                int i56 = 0;
                                int i57 = 0;
                                while (i56 < 24) {
                                    int i58 = values + 119;
                                    AlternateContactlessPaymentDataJson = i58 % 128;
                                    if (i58 % 2 == 0) {
                                        strArr = strArr39[i56];
                                        java.lang.Object[] objArr197 = {strArr[1]};
                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj34 == null) {
                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 40, android.text.TextUtils.getOffsetAfter(str8, 0) + 1921, (char) android.text.TextUtils.getTrimmedLength(str8));
                                            int i59 = $$a[14] + 1;
                                            j2 = j14;
                                            java.lang.Object[] objArr198 = new java.lang.Object[1];
                                            b((byte) i59, r6[16], (short) i59, objArr198);
                                            obj34 = cls34.getMethod((java.lang.String) objArr198[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj34);
                                        } else {
                                            j2 = j14;
                                        }
                                        str3 = (java.lang.String) ((java.lang.reflect.Method) obj34).invoke(null, objArr197);
                                        strArr2 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr, 0, strArr.length);
                                        if (str3 != null) {
                                            i11 = 1;
                                            if (str3.length() != 0) {
                                                if (strArr.length != i11) {
                                                    for (java.lang.String str14 : strArr2) {
                                                        if (!str3.contains(str14)) {
                                                        }
                                                    }
                                                }
                                                i57++;
                                                i55 = i ^ (i56 + 10);
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                sb.append(str3);
                                                java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                a(android.graphics.Color.rgb(0, 0, 0) + 16778376, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr199);
                                                sb.append(((java.lang.String) objArr199[0]).intern());
                                                sb.append(str3);
                                                arrayList.add(sb.toString());
                                                break;
                                            }
                                            i56++;
                                            j14 = j2;
                                        } else {
                                            i56++;
                                            j14 = j2;
                                        }
                                    } else {
                                        j2 = j14;
                                        strArr = strArr39[i56];
                                        java.lang.Object[] objArr200 = {strArr[0]};
                                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj35 == null) {
                                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, 1921 - android.text.TextUtils.indexOf(str8, str8, 0, 0), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                            int i60 = $$a[14] + 1;
                                            java.lang.Object[] objArr201 = new java.lang.Object[1];
                                            b((byte) i60, r9[16], (short) i60, objArr201);
                                            obj35 = cls35.getMethod((java.lang.String) objArr201[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj35);
                                        }
                                        str3 = (java.lang.String) ((java.lang.reflect.Method) obj35).invoke(null, objArr200);
                                        i11 = 1;
                                        strArr2 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr, 1, strArr.length);
                                        if (str3 == null) {
                                            i56++;
                                            j14 = j2;
                                        }
                                        if (str3.length() != 0) {
                                        }
                                        i56++;
                                        j14 = j2;
                                    }
                                }
                                j = j14;
                                java.lang.Object[] objArr202 = new java.lang.Object[5];
                                if (i57 > 2) {
                                    objArr202[0] = new int[]{i};
                                    objArr202[1] = new int[]{i55};
                                    objArr202[4] = new int[1];
                                    objArr202[2] = arrayList;
                                    objArr202[3] = null;
                                    java.lang.Object[] objArr203 = {num, num, java.lang.Integer.valueOf((((((~((-1965930610) | i)) | (-84915489)) * (-948)) - 1453214331) + ((~(i29 | (-84783137))) * (-948))) - 916377512)};
                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj36 == null) {
                                        java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName(str8) + 51, android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                        byte[] bArr20 = $$a;
                                        byte b36 = (byte) (bArr20[16] + 1);
                                        byte b37 = (byte) (bArr20[14] + 1);
                                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                                        b(b36, b37, (short) (b37 | 653), objArr204);
                                        obj36 = cls36.getMethod((java.lang.String) objArr204[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                    }
                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr203)).intValue();
                                    c = 0;
                                    ((int[]) objArr202[4])[0] = intValue;
                                } else {
                                    objArr202[0] = new int[]{i};
                                    objArr202[1] = new int[]{i};
                                    objArr202[4] = new int[1];
                                    objArr202[2] = null;
                                    objArr202[3] = null;
                                    java.lang.Object[] objArr205 = {num, num, java.lang.Integer.valueOf(((((~(i29 | (-588119394))) | 1462726704) * (-602)) - 1220662914) + (((~((-588119394) | i)) | 51212320 | (~(i29 | 1999633777))) * (-301)) + ((~(i29 | 1462726704)) * 301))};
                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj37 == null) {
                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, android.view.KeyEvent.keyCodeFromString(str8) + 2713, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                        byte[] bArr21 = $$a;
                                        byte b38 = (byte) (bArr21[16] + 1);
                                        byte b39 = (byte) (bArr21[14] + 1);
                                        java.lang.Object[] objArr206 = new java.lang.Object[1];
                                        b(b38, b39, (short) (b39 | 653), objArr206);
                                        obj37 = cls37.getMethod((java.lang.String) objArr206[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                    }
                                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr205)).intValue();
                                    c = 0;
                                    ((int[]) objArr202[4])[0] = intValue2;
                                }
                                int i61 = ((int[]) objArr202[1])[c];
                                if (i61 != i) {
                                    int[] iArr = new int[1];
                                    int[] iArr2 = new int[1];
                                    java.util.List list = (java.util.List) objArr202[2];
                                    iArr[c] = i;
                                    iArr2[c] = i61;
                                    java.lang.Object[] objArr207 = {iArr, iArr2, list, null, new int[1]};
                                    java.lang.Object[] objArr208 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i | 674223050)) | (-2049956816)) * 305) + 493681076 + (((~(i29 | 674223050)) | (-1376623048)) * 305))};
                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj38 == null) {
                                        java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, 2712 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                        byte[] bArr22 = $$a;
                                        byte b40 = (byte) (bArr22[16] + 1);
                                        byte b41 = (byte) (bArr22[14] + 1);
                                        java.lang.Object[] objArr209 = new java.lang.Object[1];
                                        b(b40, b41, (short) (b41 | 653), objArr209);
                                        obj38 = cls38.getMethod((java.lang.String) objArr209[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                    }
                                    ((int[]) objArr207[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr208)).intValue();
                                    return objArr207;
                                }
                                java.lang.Object[] objArr802 = new java.lang.Object[1];
                                a(446 - android.view.KeyEvent.keyCodeFromString(str8), (char) ((-1) - android.os.Process.getGidForName(str8)), 16 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr802);
                                java.lang.Object[] objArr812 = {((java.lang.String) objArr802[0]).intern()};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj == null) {
                                }
                                invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr812);
                                if (invoke != null) {
                                }
                                if (i12 != 1986687685) {
                                    java.lang.Object[] objArr852 = new java.lang.Object[1];
                                    a(1161 - android.view.View.resolveSize(0, 0), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 14 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr852);
                                    java.lang.String intern162 = ((java.lang.String) objArr852[0]).intern();
                                    java.lang.Object[] objArr862 = new java.lang.Object[1];
                                    a(android.view.View.resolveSize(0, 0) + 1175, (char) (5335 - android.view.View.MeasureSpec.getMode(0)), 26 - android.view.KeyEvent.getDeadChar(0, 0), objArr862);
                                    java.lang.String intern172 = ((java.lang.String) objArr862[0]).intern();
                                    java.lang.Object[] objArr872 = new java.lang.Object[1];
                                    a(android.view.KeyEvent.getDeadChar(0, 0) + 1201, (char) (android.graphics.Color.green(0) + 35888), android.view.View.resolveSize(0, 0) + 17, objArr872);
                                    java.lang.String intern182 = ((java.lang.String) objArr872[0]).intern();
                                    java.lang.Object[] objArr882 = new java.lang.Object[1];
                                    a((android.os.Process.myTid() >> 22) + 1218, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 17, objArr882);
                                    java.lang.String intern192 = ((java.lang.String) objArr882[0]).intern();
                                    java.lang.Object[] objArr892 = new java.lang.Object[1];
                                    a(1235 - android.text.TextUtils.indexOf(str8, str8, 0, 0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 16, objArr892);
                                    java.lang.String intern202 = ((java.lang.String) objArr892[0]).intern();
                                    java.lang.Object[] objArr902 = new java.lang.Object[1];
                                    a(android.graphics.Color.argb(0, 0, 0, 0) + 1250, (char) android.text.TextUtils.getCapsMode(str8, 0, 0), 36 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr902);
                                    java.lang.String intern212 = ((java.lang.String) objArr902[0]).intern();
                                    java.lang.Object[] objArr912 = new java.lang.Object[1];
                                    a(1287 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22685), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '$', objArr912);
                                    java.lang.String intern222 = ((java.lang.String) objArr912[0]).intern();
                                    java.lang.Object[] objArr922 = new java.lang.Object[1];
                                    a(android.graphics.Color.blue(0) + 1299, (char) android.graphics.Color.green(0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 13, objArr922);
                                    java.lang.String intern232 = ((java.lang.String) objArr922[0]).intern();
                                    java.lang.Object[] objArr932 = new java.lang.Object[1];
                                    a(1313 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.graphics.Color.green(0) + 45729), 22 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr932);
                                    java.lang.String intern242 = ((java.lang.String) objArr932[0]).intern();
                                    java.lang.Object[] objArr942 = new java.lang.Object[1];
                                    a(1334 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 31 - android.text.TextUtils.getTrimmedLength(str8), objArr942);
                                    java.lang.String intern252 = ((java.lang.String) objArr942[0]).intern();
                                    java.lang.Object[] objArr952 = new java.lang.Object[1];
                                    a(android.graphics.Color.blue(0) + 1365, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54075), 12 - (android.os.Process.myPid() >> 22), objArr952);
                                    java.lang.String intern262 = ((java.lang.String) objArr952[0]).intern();
                                    java.lang.Object[] objArr962 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1376, (char) (48870 - android.view.KeyEvent.getDeadChar(0, 0)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 12, objArr962);
                                    java.lang.String intern272 = ((java.lang.String) objArr962[0]).intern();
                                    java.lang.Object[] objArr972 = new java.lang.Object[1];
                                    a(1389 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr972);
                                    java.lang.String intern282 = ((java.lang.String) objArr972[0]).intern();
                                    java.lang.Object[] objArr982 = new java.lang.Object[1];
                                    a(android.graphics.Color.red(0) + 1401, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 12, objArr982);
                                    java.lang.String intern292 = ((java.lang.String) objArr982[0]).intern();
                                    java.lang.Object[] objArr992 = new java.lang.Object[1];
                                    a(1413 - android.view.View.combineMeasuredStates(0, 0), (char) android.view.View.MeasureSpec.getMode(0), 13 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr992);
                                    java.lang.String intern302 = ((java.lang.String) objArr992[0]).intern();
                                    java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                    a(1425 - android.view.View.resolveSize(0, 0), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50143), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 14, objArr1002);
                                    java.lang.String intern312 = ((java.lang.String) objArr1002[0]).intern();
                                    java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                    a(1439 - android.text.TextUtils.indexOf(str8, str8, 0, 0), (char) (43236 - android.text.TextUtils.getTrimmedLength(str8)), 12 - android.graphics.Color.argb(0, 0, 0, 0), objArr1012);
                                    java.lang.String intern322 = ((java.lang.String) objArr1012[0]).intern();
                                    java.lang.Object[] objArr1022 = new java.lang.Object[1];
                                    a(android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1452, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, objArr1022);
                                    java.lang.String intern332 = ((java.lang.String) objArr1022[0]).intern();
                                    java.lang.Object[] objArr1032 = new java.lang.Object[1];
                                    a(1475 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.text.TextUtils.indexOf(str8, str8, 0, 0) + 28, objArr1032);
                                    java.lang.String[] strArr82 = {intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, intern292, intern302, intern312, intern322, intern332, ((java.lang.String) objArr1032[0]).intern()};
                                    while (i17 < 19) {
                                    }
                                    i18 = -1;
                                    if (i18 >= 0) {
                                        java.lang.Object[] objArr1092 = {new int[]{i}, new int[]{i19}, null, null, new int[1]};
                                        java.lang.Object[] objArr1102 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i29 | 1651771878)) | 399074219) * (-1042)) - 2064572546) + ((1651771878 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i | (-399074220))) | 37749154 | (~(i29 | 2013096943))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj2 == null) {
                                        }
                                        ((int[]) objArr1092[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr1102)).intValue();
                                        return objArr1092;
                                    }
                                }
                                java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 1503, (char) (17984 - android.graphics.Color.red(0)), android.view.KeyEvent.keyCodeFromString(str8) + 13, objArr1122);
                                java.lang.String intern342 = ((java.lang.String) objArr1122[0]).intern();
                                java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                a(1516 - android.text.TextUtils.getTrimmedLength(str8), (char) ((-1) - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.View.MeasureSpec.getMode(0) + 5, objArr1132);
                                java.lang.String[] strArr92 = {intern342, ((java.lang.String) objArr1132[0]).intern()};
                                java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                a(1521 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.view.KeyEvent.getDeadChar(0, 0), 15 - android.view.View.getDefaultSize(0, 0), objArr1142);
                                java.lang.String intern352 = ((java.lang.String) objArr1142[0]).intern();
                                java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                a(1536 - android.graphics.Color.red(0), (char) (2315 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 19 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr1152);
                                java.lang.String intern362 = ((java.lang.String) objArr1152[0]).intern();
                                java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                a(1556 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 13 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr1162);
                                java.lang.String[] strArr102 = {intern352, intern362, ((java.lang.String) objArr1162[0]).intern()};
                                java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                a(android.text.TextUtils.indexOf(str8, str8) + 1569, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4917), android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 22, objArr1172);
                                java.lang.String intern372 = ((java.lang.String) objArr1172[0]).intern();
                                java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                a(1590 - android.view.View.MeasureSpec.getSize(0), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17749), 10 - android.view.KeyEvent.normalizeMetaState(0), objArr1182);
                                java.lang.String[] strArr112 = {intern372, ((java.lang.String) objArr1182[0]).intern()};
                                java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                a(1601 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2461), 11 - android.text.TextUtils.indexOf(str8, str8, 0, 0), objArr1192);
                                java.lang.String intern382 = ((java.lang.String) objArr1192[0]).intern();
                                java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                a(337 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2620), 6 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr1202);
                                java.lang.String[] strArr122 = {intern382, ((java.lang.String) objArr1202[0]).intern()};
                                java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 1612, (char) (4424 - android.view.View.resolveSize(0, 0)), 29 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr1212);
                                java.lang.String intern392 = ((java.lang.String) objArr1212[0]).intern();
                                java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                a(1590 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17749), 10 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr1222);
                                c2 = 0;
                                java.lang.String[][] strArr132 = {strArr92, strArr102, strArr112, strArr122, new java.lang.String[]{intern392, ((java.lang.String) objArr1222[0]).intern()}};
                                i13 = -1;
                                i14 = 0;
                                while (true) {
                                    if (i14 < 5) {
                                    }
                                    i14++;
                                    i13 = i47;
                                    c2 = 0;
                                }
                                if (i15 == i) {
                                }
                            }
                        }
                        java.lang.Object[] objArr210 = new java.lang.Object[1];
                        a(342 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, objArr210);
                        java.lang.String intern71 = ((java.lang.String) objArr210[0]).intern();
                        java.lang.Object[] objArr211 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 356, (char) (11150 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, objArr211);
                        java.lang.String intern72 = ((java.lang.String) objArr211[0]).intern();
                        java.io.File file4 = new java.io.File(intern71);
                        if (file4.exists() && file4.isFile()) {
                            try {
                                java.util.Scanner scanner4 = new java.util.Scanner(new java.io.FileInputStream(file4));
                                java.lang.Object[] objArr212 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 307, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2 - (android.os.Process.myPid() >> 22), objArr212);
                                java.util.Scanner useDelimiter4 = scanner4.useDelimiter(((java.lang.String) objArr212[0]).intern());
                                next = useDelimiter4.hasNext() ? useDelimiter4.next() : str8;
                                useDelimiter4.close();
                            } catch (java.io.IOException unused7) {
                            }
                            if (next.contains(intern72)) {
                                AlternateContactlessPaymentDataJson = (values + 93) % 128;
                                i10 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                                if (i10 != i) {
                                }
                            }
                        }
                        i10 = i;
                        if (i10 != i) {
                        }
                    }
                }
                i8 = i;
                if (i8 == i) {
                }
            }
        }
        i7 = i;
        if (i7 == i) {
        }
    }
}
