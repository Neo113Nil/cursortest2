package com.payair.hce;

/* loaded from: classes4.dex */
public final class unregisterReceiver implements com.payair.hce.sendStickyOrderedBroadcastAsUser {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getCiacDecline;
    private static char[] getProfileVersion;
    private com.payair.hce.sendOrderedBroadcast AlternateContactlessPaymentDataJson;
    private com.payair.hce.removeStickyBroadcastAsUser valueOf;
    private com.payair.hce.checkPermission RecordsJson = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
    private java.util.List<com.payair.hce.moveSharedPreferencesFrom> DigitizedCardProfile = new java.util.ArrayList();
    private int getAid = com.payair.hce.startForegroundService.valueOf;
    private java.util.Map<java.lang.String, java.lang.String> writeReplace = new java.util.HashMap();
    private java.util.concurrent.LinkedBlockingDeque<com.payair.hce.getExternalFilesDirs> values = new java.util.concurrent.LinkedBlockingDeque<>(1);

    private static void c(byte b, byte b2, short s, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i = (b * 2) + 107;
        int i2 = s * 3;
        int i3 = b2 + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = (-i) + i3;
            i3 = i3;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i = (-bArr[i6]) + i;
            i3 = i6;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0340  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4;
        com.payair.hce.fileList filelist;
        com.payair.hce.fileList databaselist;
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i5 | i6;
        int i8 = ~i3;
        if ((i * (-167)) + (i2 * (-167)) + (((~i7) | (~(i6 | i8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + ((~(i7 | i3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | i6 | i3)) | (~(i2 | i5)) | (~(i5 | i8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) != 1) {
            com.payair.hce.getExternalFilesDirs getexternalfilesdirs = (com.payair.hce.getExternalFilesDirs) objArr[0];
            java.lang.String str = (java.lang.String) objArr[1];
            java.lang.String str2 = (java.lang.String) objArr[2];
            java.lang.String str3 = (java.lang.String) objArr[3];
            switch (com.payair.hce.unregisterReceiver.AnonymousClass3.values[getexternalfilesdirs.values() - 1]) {
                case 1:
                case 2:
                    com.payair.hce.deleteFile DigitizedCardProfile = getexternalfilesdirs.DigitizedCardProfile();
                    com.payair.hce.getWallpaper getwallpaper = new com.payair.hce.getWallpaper((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{DigitizedCardProfile}, -350567645, 350567645, java.lang.System.identityHashCode(DigitizedCardProfile)), str, str2, str3);
                    int i9 = SdkCoreAlternateContactlessPaymentDataImpl + 1;
                    getCiacDecline = i9 % 128;
                    int i10 = i9 % 2;
                    filelist = getwallpaper;
                    break;
                case 3:
                case 4:
                    filelist = new com.payair.hce.fileList(str, str2, str3);
                    break;
                case 5:
                    com.payair.hce.deleteFile DigitizedCardProfile2 = getexternalfilesdirs.DigitizedCardProfile();
                    databaselist = new com.payair.hce.databaseList((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{DigitizedCardProfile2}, -350567645, 350567645, java.lang.System.identityHashCode(DigitizedCardProfile2)), str, str2, str3);
                    filelist = databaselist;
                    break;
                case 6:
                case 7:
                    com.payair.hce.deleteFile DigitizedCardProfile3 = getexternalfilesdirs.DigitizedCardProfile();
                    databaselist = new com.payair.hce.moveDatabaseFrom((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{DigitizedCardProfile3}, -350567645, 350567645, java.lang.System.identityHashCode(DigitizedCardProfile3)), str, -1, str2, str3);
                    filelist = databaselist;
                    break;
                case 8:
                case 9:
                    com.payair.hce.deleteFile DigitizedCardProfile4 = getexternalfilesdirs.DigitizedCardProfile();
                    databaselist = new com.payair.hce.openOrCreateDatabase((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{DigitizedCardProfile4}, -350567645, 350567645, java.lang.System.identityHashCode(DigitizedCardProfile4)), str, -1, str2, str3);
                    SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 121) % 128;
                    filelist = databaselist;
                    break;
                case 10:
                    com.payair.hce.deleteFile DigitizedCardProfile5 = getexternalfilesdirs.DigitizedCardProfile();
                    databaselist = new com.payair.hce.getDir((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{DigitizedCardProfile5}, -350567645, 350567645, java.lang.System.identityHashCode(DigitizedCardProfile5)), str, str2, str3);
                    filelist = databaselist;
                    break;
                case 11:
                    filelist = new com.payair.hce.getExternalMediaDirs(str, str2, str3);
                    break;
                default:
                    filelist = null;
                    break;
            }
            return new com.payair.hce.getDatabasePath(getexternalfilesdirs.values(), filelist);
        }
        com.payair.hce.unregisterReceiver unregisterreceiver = (com.payair.hce.unregisterReceiver) objArr[0];
        com.payair.hce.getDatabasePath getdatabasepath = (com.payair.hce.getDatabasePath) objArr[1];
        int i11 = getCiacDecline + 81;
        SdkCoreAlternateContactlessPaymentDataImpl = i11 % 128;
        if (i11 % 2 == 0) {
            switch (com.payair.hce.unregisterReceiver.AnonymousClass3.values[((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() - 1]) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                default:
                    i4 = 0;
                    break;
            }
        } else {
            int[] iArr = com.payair.hce.unregisterReceiver.AnonymousClass3.values;
            switch (iArr[0]) {
                case 1:
                    com.payair.hce.getWallpaper getwallpaper2 = (com.payair.hce.getWallpaper) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast))).DigitizedCardProfile((com.payair.hce.checkForSuccess) com.payair.hce.getWallpaper.valueOf(new java.lang.Object[]{getwallpaper2}, 303362241, -303362241, java.lang.System.identityHashCode(getwallpaper2)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getwallpaper2}, -1279268571, 1279268573, java.lang.System.identityHashCode(getwallpaper2)));
                    break;
                case 2:
                    com.payair.hce.getWallpaper getwallpaper3 = (com.payair.hce.getWallpaper) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast2))).valueOf((com.payair.hce.checkForSuccess) com.payair.hce.getWallpaper.valueOf(new java.lang.Object[]{getwallpaper3}, 303362241, -303362241, java.lang.System.identityHashCode(getwallpaper3)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getwallpaper3}, -1279268571, 1279268573, java.lang.System.identityHashCode(getwallpaper3)));
                    break;
                case 3:
                    unregisterreceiver.getAid = com.payair.hce.startForegroundService.writeReplace;
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast3))).RecordsJson();
                    break;
                case 4:
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast4 = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast4}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast4))).DigitizedCardProfile();
                    break;
                case 5:
                    com.payair.hce.databaseList databaselist2 = (com.payair.hce.databaseList) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast5 = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast5}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast5))).valueOf((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{databaselist2}, -1279268571, 1279268573, java.lang.System.identityHashCode(databaselist2)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{databaselist2}, -2043543314, 2043543319, java.lang.System.identityHashCode(databaselist2)), (java.util.List<com.payair.hce.isNetworkError>) com.payair.hce.databaseList.writeReplace(new java.lang.Object[]{databaselist2}, -524184704, 524184704, java.lang.System.identityHashCode(databaselist2)));
                    break;
                case 6:
                    com.payair.hce.moveDatabaseFrom movedatabasefrom = (com.payair.hce.moveDatabaseFrom) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast6 = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast6}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast6))).valueOf((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{movedatabasefrom}, -1279268571, 1279268573, java.lang.System.identityHashCode(movedatabasefrom)));
                    break;
                case 7:
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast7 = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast7}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast7))).valueOf();
                    break;
                case 8:
                    com.payair.hce.fileList filelist2 = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath));
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast8 = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast8}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast8))).DigitizedCardProfile((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist2}, -1279268571, 1279268573, java.lang.System.identityHashCode(filelist2)));
                    break;
                case 9:
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast9 = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast9}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast9))).writeReplace();
                    SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 19) % 128;
                    break;
                case 10:
                    com.payair.hce.getDir getdir = (com.payair.hce.getDir) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast10 = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast10}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast10))).values((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getdir}, -1279268571, 1279268573, java.lang.System.identityHashCode(getdir)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getdir}, -2043543314, 2043543319, java.lang.System.identityHashCode(getdir)));
                    break;
                case 11:
                    com.payair.hce.getExternalMediaDirs getexternalmediadirs = (com.payair.hce.getExternalMediaDirs) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast11 = unregisterreceiver.AlternateContactlessPaymentDataJson;
                    ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast11}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast11))).values((java.lang.String) com.payair.hce.getExternalMediaDirs.values(new java.lang.Object[]{getexternalmediadirs}, -1143098849, 1143098849, java.lang.System.identityHashCode(getexternalmediadirs)));
                    break;
                default:
                    i4 = 0;
                    break;
            }
        }
        if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
            return null;
        }
        unregisterreceiver.AlternateContactlessPaymentDataJson((java.lang.String) null);
        return null;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10;
        $11 = (i2 + 119) % 128;
        if (str != null) {
            $11 = (i2 + 93) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(IccPrivateKeyCrtComponentsJson ^ (-3824242241614154557L), cArr, i);
        int i3 = 4;
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - i3;
            int i4 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % i3]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(IccPrivateKeyCrtComponentsJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.getTrimmedLength("") + 1921, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((byte) 5, (byte) -1, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 429, (char) (android.graphics.Color.red(0) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((byte) 6, (byte) -1, (short) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i3 = 4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    public unregisterReceiver(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast) {
        this.AlternateContactlessPaymentDataJson = sendorderedbroadcast;
        this.valueOf = new com.payair.hce.removeStickyBroadcastAsUser(sendorderedbroadcast);
    }

    public final java.lang.String valueOf(int i, com.payair.hce.deleteFile deletefile) {
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.AlternateContactlessPaymentDataJson;
        java.lang.String DigitizedCardProfile = ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast))).DigitizedCardProfile();
        com.payair.hce.getExternalFilesDirs getexternalfilesdirs = new com.payair.hce.getExternalFilesDirs(i, deletefile);
        if (DigitizedCardProfile == null || DigitizedCardProfile.isEmpty()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{0, 31, 0, 0}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", false, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{31, 29, 0, 24}, "\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", true, objArr2);
            AlternateContactlessPaymentDataJson((com.payair.hce.getDatabasePath) valueOf(new java.lang.Object[]{getexternalfilesdirs, null, intern, ((java.lang.String) objArr2[0]).intern()}, 608776371, -608776371, (int) java.lang.System.currentTimeMillis()));
            return null;
        }
        values(DigitizedCardProfile);
        if (this.values.size() > 0) {
            SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 15) % 128;
            if (i != com.payair.hce.sendOrderedBroadcastAsUser.writeReplace) {
                getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 79) % 128;
                if (i != com.payair.hce.sendOrderedBroadcastAsUser.valueOf) {
                    this.values.element();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b("䅍\uf48b䄟舑\ue0e1놊ࣔ⽢吉꺚ᷖѰ欬鮡㛸᥊縸炲䯬\uee53ᕙ浐岛쒸⡎婆", 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(new int[]{60, 36, 174, 25}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001", true, objArr4);
                    AlternateContactlessPaymentDataJson((com.payair.hce.getDatabasePath) valueOf(new java.lang.Object[]{getexternalfilesdirs, null, intern2, ((java.lang.String) objArr4[0]).intern()}, 608776371, -608776371, (int) java.lang.System.currentTimeMillis()));
                    return null;
                }
            }
        }
        java.lang.String str = deletefile != null ? (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile)) : null;
        int i2 = com.payair.hce.unregisterReceiver.AnonymousClass3.values[i - 1];
        if (i2 == 1 || i2 == 2) {
            try {
                com.payair.hce.moveSharedPreferencesFrom valueOf = valueOf(str);
                if (valueOf != null) {
                    return valueOf.DigitizedCardProfile(getexternalfilesdirs);
                }
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a(new int[]{96, 13, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 4}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000", false, objArr5);
                java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b("쥺\u074c줩皅ￍ䉧ﱠつ\udc1e嵰\ue974\u1b7f\ue33d栈쉚ل\uf624荌뼝\uf146鵈麧ꠣ\udba6", android.graphics.Color.red(0), objArr6);
                AlternateContactlessPaymentDataJson((com.payair.hce.getDatabasePath) valueOf(new java.lang.Object[]{getexternalfilesdirs, null, intern3, ((java.lang.String) objArr6[0]).intern()}, 608776371, -608776371, (int) java.lang.System.currentTimeMillis()));
            } catch (com.payair.hce.VisaReperso e) {
                AlternateContactlessPaymentDataJson((com.payair.hce.getDatabasePath) valueOf(new java.lang.Object[]{getexternalfilesdirs, null, e.writeReplace(), e.getMessage()}, 608776371, -608776371, (int) java.lang.System.currentTimeMillis()));
            }
        } else {
            if (i2 == 3) {
                this.getAid = com.payair.hce.startForegroundService.DigitizedCardProfile;
                return this.DigitizedCardProfile.get(0).DigitizedCardProfile(getexternalfilesdirs);
            }
            if (i2 == 4) {
                return this.DigitizedCardProfile.get(0).DigitizedCardProfile(getexternalfilesdirs);
            }
            try {
                com.payair.hce.moveSharedPreferencesFrom valueOf2 = valueOf(str);
                if (valueOf2 != null) {
                    if (str != null && !str.isEmpty()) {
                        this.writeReplace.put(str, valueOf2.AlternateContactlessPaymentDataJson());
                    }
                    return valueOf2.DigitizedCardProfile(getexternalfilesdirs);
                }
                try {
                    int i3 = com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson;
                    com.payair.hce.getExternalFilesDirs getexternalfilesdirs2 = new com.payair.hce.getExternalFilesDirs(com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson);
                    com.payair.hce.moveSharedPreferencesFrom movesharedpreferencesfrom = this.DigitizedCardProfile.get(0);
                    this.values.add(getexternalfilesdirs);
                    java.lang.String DigitizedCardProfile2 = movesharedpreferencesfrom.DigitizedCardProfile(getexternalfilesdirs2);
                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 35;
                    getCiacDecline = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 3 / 5;
                    }
                    return DigitizedCardProfile2;
                } catch (java.lang.IllegalStateException unused) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b("䅍\uf48b䄟舑\ue0e1놊ࣔ⽢吉꺚ᷖѰ欬鮡㛸᥊縸炲䯬\uee53ᕙ浐岛쒸⡎婆", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, objArr7);
                    java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(new int[]{60, 36, 174, 25}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001", true, objArr8);
                    AlternateContactlessPaymentDataJson((com.payair.hce.getDatabasePath) valueOf(new java.lang.Object[]{getexternalfilesdirs, null, intern4, ((java.lang.String) objArr8[0]).intern()}, 608776371, -608776371, (int) java.lang.System.currentTimeMillis()));
                }
            } catch (com.payair.hce.VisaReperso e2) {
                AlternateContactlessPaymentDataJson((com.payair.hce.getDatabasePath) valueOf(new java.lang.Object[]{getexternalfilesdirs, null, e2.writeReplace(), e2.getMessage()}, 608776371, -608776371, (int) java.lang.System.currentTimeMillis()));
            } catch (java.lang.Exception e3) {
                e3.getMessage();
            }
        }
        return null;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = getProfileVersion;
        if (cArr2 != null) {
            int i7 = $11;
            $10 = (i7 + 47) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            $10 = (i7 + 55) % 128;
            int i8 = 0;
            while (i8 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i2] = java.lang.Integer.valueOf(cArr2[i8]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.ImageFormat.getBitsPerPixel(i2), 2807 - android.view.View.combineMeasuredStates(i2, i2), (char) (android.os.Process.getGidForName("") + 1));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        cArr = cArr2;
                        c((byte) 1, (byte) -1, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                    }
                    cArr3[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i8++;
                    cArr2 = cArr;
                    i2 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        java.lang.System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr2 != null) {
            $11 = ($10 + 37) % 128;
            char[] cArr5 = new char[i4];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i4) {
                int i9 = $10 + 47;
                $11 = i9 % 128;
                if (i9 % 2 != 0 ? bArr2[getaccounttype.writeReplace] != 1 : bArr2[getaccounttype.writeReplace] != 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 43, android.text.TextUtils.getOffsetBefore("", 0) + 2880, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b = (byte) ($$b & 7);
                        byte b2 = (byte) (b - 3);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(b, b2, (byte) (b2 + 1), objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj2);
                    }
                    cArr5[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, android.view.View.resolveSizeAndState(0, 0, 0) + 2836, (char) (android.os.Process.myPid() >> 22));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        c((byte) 0, (byte) -1, (short) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr5[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.os.Process.myTid() >> 22))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i12 = i4 - i6;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i12, i6);
            java.lang.System.arraycopy(cArr6, i6, cArr4, 0, i12);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i4];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr4[(i4 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            $10 = ($11 + 61) % 128;
            cArr4 = cArr7;
        }
        if (i5 > 0) {
            int i13 = 0;
            while (true) {
                getaccounttype.writeReplace = i13;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i13 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* renamed from: com.payair.hce.unregisterReceiver$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        private static int DigitizedCardProfile = 1;
        private static int valueOf;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[((int[]) com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 1427773450, -1427773450, (int) java.lang.System.currentTimeMillis())).length];
            values = iArr;
            try {
                int i = com.payair.hce.sendOrderedBroadcastAsUser.writeReplace;
                iArr[0] = 1;
                int i2 = DigitizedCardProfile;
                int i3 = i2 & 101;
                int i4 = (i2 ^ 101) | i3;
                valueOf = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = values;
                int i5 = com.payair.hce.sendOrderedBroadcastAsUser.valueOf;
                iArr2[2] = 2;
                int i6 = valueOf;
                DigitizedCardProfile = (((i6 ^ 80) + ((i6 & 80) << 1)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = values;
                int i7 = com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson;
                iArr3[4] = 3;
                int i8 = valueOf;
                DigitizedCardProfile = (((i8 & 57) - (~(i8 | 57))) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = values;
                int i9 = com.payair.hce.sendOrderedBroadcastAsUser.getGpoResponse;
                iArr4[12] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = values;
                int i10 = com.payair.hce.sendOrderedBroadcastAsUser.getAid;
                iArr5[5] = 5;
                int i11 = DigitizedCardProfile;
                valueOf = (((i11 & 54) + (i11 | 54)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = values;
                int i12 = com.payair.hce.sendOrderedBroadcastAsUser.getProfileVersion;
                iArr6[6] = 6;
                int i13 = valueOf;
                int i14 = i13 & 13;
                int i15 = -(-((i13 ^ 13) | i14));
                int i16 = (i14 & i15) + (i15 | i14);
                DigitizedCardProfile = i16 % 128;
                int i17 = i16 % 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = values;
                int i18 = com.payair.hce.sendOrderedBroadcastAsUser.IccPrivateKeyCrtComponentsJson;
                iArr7[7] = 7;
                int i19 = valueOf;
                int i20 = i19 & 53;
                int i21 = -(-(i19 | 53));
                int i22 = (i20 & i21) + (i21 | i20);
                DigitizedCardProfile = i22 % 128;
                int i23 = i22 % 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = values;
                int i24 = com.payair.hce.sendOrderedBroadcastAsUser.RecordsJson;
                iArr8[8] = 8;
                int i25 = DigitizedCardProfile;
                valueOf = (((i25 ^ 38) + ((i25 & 38) << 1)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = values;
                int i26 = com.payair.hce.sendOrderedBroadcastAsUser.SdkCoreAlternateContactlessPaymentDataImpl;
                iArr9[9] = 9;
                int i27 = DigitizedCardProfile;
                int i28 = i27 & 109;
                int i29 = i27 | 109;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                valueOf = i30 % 128;
                int i31 = i30 % 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = values;
                int i32 = com.payair.hce.sendOrderedBroadcastAsUser.getPaymentFci;
                iArr10[10] = 10;
                int i33 = valueOf;
                int i34 = i33 & 33;
                int i35 = (i33 | 33) & (~i34);
                int i36 = i34 << 1;
                DigitizedCardProfile = (((i35 | i36) << 1) - (i35 ^ i36)) % 128;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = values;
                int i37 = com.payair.hce.sendOrderedBroadcastAsUser.getCvrMaskAnd;
                iArr11[11] = 11;
                int i38 = DigitizedCardProfile;
                int i39 = i38 & 5;
                int i40 = i39 + ((5 ^ i38) | i39);
                valueOf = i40 % 128;
                if (i40 % 2 != 0) {
                    throw null;
                }
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[Catch: all -> 0x033d, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x001f, B:7:0x0025, B:9:0x0028, B:10:0x002e, B:12:0x0045, B:16:0x0053, B:19:0x0099, B:21:0x009f, B:23:0x00a9, B:24:0x00ad, B:26:0x00b3, B:27:0x010e, B:29:0x011e, B:33:0x014f, B:36:0x00c4, B:38:0x00ec, B:40:0x00f7, B:41:0x00ff, B:47:0x010d, B:48:0x0200, B:49:0x0233, B:50:0x006f, B:52:0x008e, B:54:0x016c, B:56:0x017a, B:58:0x0184, B:59:0x0188, B:61:0x0193, B:62:0x01db, B:64:0x01ea, B:67:0x01f9, B:70:0x01a4, B:72:0x01cc, B:73:0x0234, B:75:0x023a, B:77:0x0244, B:79:0x024f, B:80:0x0254, B:86:0x025e, B:87:0x025f, B:89:0x0265, B:90:0x02c0, B:93:0x0276, B:95:0x029e, B:97:0x02a9, B:98:0x02b1, B:104:0x02bf, B:107:0x02ca, B:108:0x0307, B:109:0x0308, B:110:0x033c, B:43:0x0106, B:44:0x010b, B:82:0x0257, B:83:0x025c, B:100:0x02b8, B:101:0x02bd), top: B:2:0x0001, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e A[Catch: all -> 0x033d, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x001f, B:7:0x0025, B:9:0x0028, B:10:0x002e, B:12:0x0045, B:16:0x0053, B:19:0x0099, B:21:0x009f, B:23:0x00a9, B:24:0x00ad, B:26:0x00b3, B:27:0x010e, B:29:0x011e, B:33:0x014f, B:36:0x00c4, B:38:0x00ec, B:40:0x00f7, B:41:0x00ff, B:47:0x010d, B:48:0x0200, B:49:0x0233, B:50:0x006f, B:52:0x008e, B:54:0x016c, B:56:0x017a, B:58:0x0184, B:59:0x0188, B:61:0x0193, B:62:0x01db, B:64:0x01ea, B:67:0x01f9, B:70:0x01a4, B:72:0x01cc, B:73:0x0234, B:75:0x023a, B:77:0x0244, B:79:0x024f, B:80:0x0254, B:86:0x025e, B:87:0x025f, B:89:0x0265, B:90:0x02c0, B:93:0x0276, B:95:0x029e, B:97:0x02a9, B:98:0x02b1, B:104:0x02bf, B:107:0x02ca, B:108:0x0307, B:109:0x0308, B:110:0x033c, B:43:0x0106, B:44:0x010b, B:82:0x0257, B:83:0x025c, B:100:0x02b8, B:101:0x02bd), top: B:2:0x0001, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014f A[Catch: all -> 0x033d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x001f, B:7:0x0025, B:9:0x0028, B:10:0x002e, B:12:0x0045, B:16:0x0053, B:19:0x0099, B:21:0x009f, B:23:0x00a9, B:24:0x00ad, B:26:0x00b3, B:27:0x010e, B:29:0x011e, B:33:0x014f, B:36:0x00c4, B:38:0x00ec, B:40:0x00f7, B:41:0x00ff, B:47:0x010d, B:48:0x0200, B:49:0x0233, B:50:0x006f, B:52:0x008e, B:54:0x016c, B:56:0x017a, B:58:0x0184, B:59:0x0188, B:61:0x0193, B:62:0x01db, B:64:0x01ea, B:67:0x01f9, B:70:0x01a4, B:72:0x01cc, B:73:0x0234, B:75:0x023a, B:77:0x0244, B:79:0x024f, B:80:0x0254, B:86:0x025e, B:87:0x025f, B:89:0x0265, B:90:0x02c0, B:93:0x0276, B:95:0x029e, B:97:0x02a9, B:98:0x02b1, B:104:0x02bf, B:107:0x02ca, B:108:0x0307, B:109:0x0308, B:110:0x033c, B:43:0x0106, B:44:0x010b, B:82:0x0257, B:83:0x025c, B:100:0x02b8, B:101:0x02bd), top: B:2:0x0001, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: all -> 0x033d, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x001f, B:7:0x0025, B:9:0x0028, B:10:0x002e, B:12:0x0045, B:16:0x0053, B:19:0x0099, B:21:0x009f, B:23:0x00a9, B:24:0x00ad, B:26:0x00b3, B:27:0x010e, B:29:0x011e, B:33:0x014f, B:36:0x00c4, B:38:0x00ec, B:40:0x00f7, B:41:0x00ff, B:47:0x010d, B:48:0x0200, B:49:0x0233, B:50:0x006f, B:52:0x008e, B:54:0x016c, B:56:0x017a, B:58:0x0184, B:59:0x0188, B:61:0x0193, B:62:0x01db, B:64:0x01ea, B:67:0x01f9, B:70:0x01a4, B:72:0x01cc, B:73:0x0234, B:75:0x023a, B:77:0x0244, B:79:0x024f, B:80:0x0254, B:86:0x025e, B:87:0x025f, B:89:0x0265, B:90:0x02c0, B:93:0x0276, B:95:0x029e, B:97:0x02a9, B:98:0x02b1, B:104:0x02bf, B:107:0x02ca, B:108:0x0307, B:109:0x0308, B:110:0x033c, B:43:0x0106, B:44:0x010b, B:82:0x0257, B:83:0x025c, B:100:0x02b8, B:101:0x02bd), top: B:2:0x0001, inners: #0, #1, #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeReplace(java.lang.String str) throws com.payair.hce.VisaReperso {
        com.payair.hce.moveSharedPreferencesFrom DigitizedCardProfile;
        synchronized (this) {
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.AlternateContactlessPaymentDataJson;
            java.lang.String DigitizedCardProfile2 = ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast))).DigitizedCardProfile();
            if (DigitizedCardProfile2 == null || DigitizedCardProfile2.isEmpty()) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{31, 29, 0, 24}, "\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", true, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b("儺ｧ关䯧\ue3f4멭섹ⱹ䑦ꕺ퐻ݷ筓遍？ᩍ湞", '0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                throw new com.payair.hce.VisaReperso(intern, ((java.lang.String) objArr2[0]).intern());
            }
            values(DigitizedCardProfile2);
            try {
                com.payair.hce.sendStickyBroadcastAsUser writeReplace = this.valueOf.writeReplace(str);
                writeReplace.AlternateContactlessPaymentDataJson();
                writeReplace.DigitizedCardProfile();
                java.lang.String pendingAction = writeReplace.valueOf().getPendingAction();
                if (pendingAction == null) {
                    if (writeReplace.AlternateContactlessPaymentDataJson() != null && !writeReplace.AlternateContactlessPaymentDataJson().isEmpty()) {
                        int i = getCiacDecline + 71;
                        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                        if (i % 2 != 0) {
                            writeReplace.AlternateContactlessPaymentDataJson();
                            throw new java.lang.NullPointerException();
                        }
                        DigitizedCardProfile2 = writeReplace.AlternateContactlessPaymentDataJson();
                    }
                    com.payair.hce.moveSharedPreferencesFrom DigitizedCardProfile3 = DigitizedCardProfile(DigitizedCardProfile2);
                    if (DigitizedCardProfile3 == null) {
                        this.DigitizedCardProfile.add(new com.payair.hce.moveSharedPreferencesFrom(this.AlternateContactlessPaymentDataJson, DigitizedCardProfile2, this, writeReplace.valueOf()));
                    } else {
                        if (!com.payair.hce.stopService.AlternateContactlessPaymentDataJson(((com.payair.hce.DeviceNotSecureException) com.payair.hce.moveSharedPreferencesFrom.valueOf(new java.lang.Object[]{DigitizedCardProfile3}, 176217998, -176217997, java.lang.System.identityHashCode(DigitizedCardProfile3))).getSessionCode()).equalsIgnoreCase(com.payair.hce.stopService.AlternateContactlessPaymentDataJson(writeReplace.valueOf().getSessionCode()))) {
                            int i2 = getCiacDecline + 93;
                            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                            if (i2 % 2 != 0) {
                                DigitizedCardProfile3.values(writeReplace.valueOf());
                                throw new java.lang.ArithmeticException();
                            }
                            DigitizedCardProfile3.values(writeReplace.valueOf());
                        }
                    }
                    this.getAid = com.payair.hce.startForegroundService.values;
                    AlternateContactlessPaymentDataJson(DigitizedCardProfile2);
                    return;
                }
                int hashCode = pendingAction.hashCode();
                if (hashCode != -2055493451) {
                    if (hashCode == 1657877864) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b("蛫皓蚹냱䚡㎒㨪褨鎯Ⲙ⼤ꈲ겉ᦾЕ뼈름\uf2b7礀䠓", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr3);
                        if (pendingAction.equals(((java.lang.String) objArr3[0]).intern())) {
                            if (writeReplace.AlternateContactlessPaymentDataJson() != null && !writeReplace.AlternateContactlessPaymentDataJson().isEmpty()) {
                                DigitizedCardProfile2 = writeReplace.AlternateContactlessPaymentDataJson();
                            }
                            DigitizedCardProfile = DigitizedCardProfile(DigitizedCardProfile2);
                            if (DigitizedCardProfile != null) {
                                this.DigitizedCardProfile.add(new com.payair.hce.moveSharedPreferencesFrom(this.AlternateContactlessPaymentDataJson, DigitizedCardProfile2, this, writeReplace.valueOf()));
                            } else {
                                if (!com.payair.hce.stopService.AlternateContactlessPaymentDataJson(((com.payair.hce.DeviceNotSecureException) com.payair.hce.moveSharedPreferencesFrom.valueOf(new java.lang.Object[]{DigitizedCardProfile}, 176217998, -176217997, java.lang.System.identityHashCode(DigitizedCardProfile))).getSessionCode()).equalsIgnoreCase(com.payair.hce.stopService.AlternateContactlessPaymentDataJson(writeReplace.valueOf().getSessionCode()))) {
                                    int i3 = getCiacDecline + 3;
                                    SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        DigitizedCardProfile.values(writeReplace.valueOf());
                                        throw new java.lang.ArithmeticException();
                                    }
                                    DigitizedCardProfile.values(writeReplace.valueOf());
                                }
                            }
                            if (writeReplace.valueOf().getTokenUniqueReference() != null) {
                                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.AlternateContactlessPaymentDataJson;
                                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast2))).IccPrivateKeyCrtComponentsJson();
                                getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 125) % 128;
                                return;
                            } else {
                                writeReplace.valueOf().getTokenUniqueReference();
                                this.writeReplace.put(writeReplace.valueOf().getTokenUniqueReference(), DigitizedCardProfile2);
                                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.AlternateContactlessPaymentDataJson;
                                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast3))).AlternateContactlessPaymentDataJson(writeReplace.valueOf().getTokenUniqueReference());
                                return;
                            }
                        }
                    }
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(new int[]{118, 52, 155, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true, objArr4);
                    java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b("儺ｧ关䯧\ue3f4멭섹ⱹ䑦ꕺ퐻ݷ筓遍？ᩍ湞", android.os.Process.myTid() >> 22, objArr5);
                    throw new com.payair.hce.VisaReperso(intern2, ((java.lang.String) objArr5[0]).intern());
                }
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(new int[]{109, 9, 147, 2}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000", false, objArr6);
                if (pendingAction.equals(((java.lang.String) objArr6[0]).intern())) {
                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 95;
                    getCiacDecline = i4 % 128;
                    if (i4 % 2 != 0) {
                        java.lang.String tokenUniqueReference = writeReplace.valueOf().getTokenUniqueReference();
                        if (writeReplace.AlternateContactlessPaymentDataJson() != null && !writeReplace.AlternateContactlessPaymentDataJson().isEmpty()) {
                            DigitizedCardProfile2 = writeReplace.AlternateContactlessPaymentDataJson();
                        }
                        this.writeReplace.put(tokenUniqueReference, DigitizedCardProfile2);
                        com.payair.hce.moveSharedPreferencesFrom DigitizedCardProfile4 = DigitizedCardProfile(DigitizedCardProfile2);
                        if (DigitizedCardProfile4 == null) {
                            this.DigitizedCardProfile.add(new com.payair.hce.moveSharedPreferencesFrom(this.AlternateContactlessPaymentDataJson, DigitizedCardProfile2, this, writeReplace.valueOf()));
                        } else {
                            if (!com.payair.hce.stopService.AlternateContactlessPaymentDataJson(((com.payair.hce.DeviceNotSecureException) com.payair.hce.moveSharedPreferencesFrom.valueOf(new java.lang.Object[]{DigitizedCardProfile4}, 176217998, -176217997, java.lang.System.identityHashCode(DigitizedCardProfile4))).getSessionCode()).equalsIgnoreCase(com.payair.hce.stopService.AlternateContactlessPaymentDataJson(writeReplace.valueOf().getSessionCode()))) {
                                SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 3) % 128;
                                DigitizedCardProfile4.values(writeReplace.valueOf());
                            }
                        }
                        com.payair.hce.getFilesDir getfilesdir = new com.payair.hce.getFilesDir(tokenUniqueReference);
                        if (!writeReplace.valueOf().getIsRedigitization()) {
                            valueOf(com.payair.hce.sendOrderedBroadcastAsUser.writeReplace, getfilesdir);
                            return;
                        } else {
                            getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 69) % 128;
                            valueOf(com.payair.hce.sendOrderedBroadcastAsUser.valueOf, getfilesdir);
                            return;
                        }
                    }
                    if (writeReplace.AlternateContactlessPaymentDataJson() != null) {
                        DigitizedCardProfile2 = writeReplace.AlternateContactlessPaymentDataJson();
                    }
                    DigitizedCardProfile = DigitizedCardProfile(DigitizedCardProfile2);
                    if (DigitizedCardProfile != null) {
                    }
                    if (writeReplace.valueOf().getTokenUniqueReference() != null) {
                    }
                }
                java.lang.Object[] objArr42 = new java.lang.Object[1];
                a(new int[]{118, 52, 155, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true, objArr42);
                java.lang.String intern22 = ((java.lang.String) objArr42[0]).intern();
                java.lang.Object[] objArr52 = new java.lang.Object[1];
                b("儺ｧ关䯧\ue3f4멭섹ⱹ䑦ꕺ퐻ݷ筓遍？ᩍ湞", android.os.Process.myTid() >> 22, objArr52);
                throw new com.payair.hce.VisaReperso(intern22, ((java.lang.String) objArr52[0]).intern());
            } catch (java.security.GeneralSecurityException e) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b("Ζ梟σ呑轁ⶵ\udeb8䃯ᛪ㊮쯩毩⧙ߛ\ue089盌㳔\uec98鶌膝垦\uf16e諪ꬥ櫦왥\ua7e6똩綟ꭝ峐섎邇끟䧀\uec12ꭸ蕻朽\uf76c빲横ᱧ", android.graphics.Color.argb(0, 0, 0, 0), objArr7);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr7[0]).intern());
                sb.append(e.getMessage());
                java.lang.String obj = sb.toString();
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b("嗊㢓喙᧣灏經錠뿜䂙投蘢铃羾垸괌觱檻벷퀓绪Ǖꅒ읹向㳕陕", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr8);
                throw new com.payair.hce.VisaReperso(obj, ((java.lang.String) objArr8[0]).intern());
            }
        }
    }

    private void AlternateContactlessPaymentDataJson(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 79) % 128;
        com.payair.hce.getExternalFilesDirs poll = this.values.poll();
        if (poll != null) {
            com.payair.hce.deleteFile DigitizedCardProfile = poll.DigitizedCardProfile();
            java.lang.String str2 = (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{DigitizedCardProfile}, -350567645, 350567645, java.lang.System.identityHashCode(DigitizedCardProfile));
            if (str2 != null && !str2.isEmpty()) {
                SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 119) % 128;
                if (str != null && !str.isEmpty()) {
                    this.writeReplace.put(str2, str);
                }
            }
            valueOf(poll.values(), poll.DigitizedCardProfile());
        }
    }

    private com.payair.hce.moveSharedPreferencesFrom valueOf(java.lang.String str) throws com.payair.hce.VisaReperso {
        SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 121) % 128;
        java.util.Iterator<com.payair.hce.moveSharedPreferencesFrom> it = this.DigitizedCardProfile.iterator();
        while (it.hasNext()) {
            com.payair.hce.moveSharedPreferencesFrom next = it.next();
            if (((com.payair.hce.DeviceNotSecureException) com.payair.hce.moveSharedPreferencesFrom.valueOf(new java.lang.Object[]{next}, 176217998, -176217997, java.lang.System.identityHashCode(next))) != null && next.values() == com.payair.hce.moveSharedPreferencesFrom.values.writeReplace) {
                it.remove();
            }
        }
        if (this.DigitizedCardProfile.size() <= 1) {
            getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 125) % 128;
            return null;
        }
        com.payair.hce.moveSharedPreferencesFrom writeReplace = writeReplace();
        if (str != null) {
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 89;
            getCiacDecline = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (!str.isEmpty()) {
                getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 61) % 128;
                if (!this.writeReplace.isEmpty()) {
                    int i2 = getCiacDecline + 23;
                    SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.writeReplace.get(str);
                        throw null;
                    }
                    if (this.writeReplace.get(str) != null) {
                        com.payair.hce.moveSharedPreferencesFrom DigitizedCardProfile = DigitizedCardProfile(this.writeReplace.get(str));
                        if (DigitizedCardProfile == null) {
                            if (writeReplace != null) {
                                this.writeReplace.put(str, writeReplace.AlternateContactlessPaymentDataJson());
                                return writeReplace;
                            }
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            a(new int[]{60, 36, 174, 25}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001", true, objArr);
                            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            b("䅍\uf48b䄟舑\ue0e1놊ࣔ⽢吉꺚ᷖѰ欬鮡㛸᥊縸炲䯬\uee53ᕙ浐岛쒸⡎婆", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr2);
                            throw new com.payair.hce.VisaReperso(intern, ((java.lang.String) objArr2[0]).intern());
                        }
                        SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 5) % 128;
                        if (DigitizedCardProfile.DigitizedCardProfile() == com.payair.hce.moveSharedPreferencesFrom.valueOf.writeReplace) {
                            getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 105) % 128;
                            return DigitizedCardProfile;
                        }
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(new int[]{60, 36, 174, 25}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001", true, objArr3);
                        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b("䅍\uf48b䄟舑\ue0e1놊ࣔ⽢吉꺚ᷖѰ欬鮡㛸᥊縸炲䯬\uee53ᕙ浐岛쒸⡎婆", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr4);
                        throw new com.payair.hce.VisaReperso(intern2, ((java.lang.String) objArr4[0]).intern());
                    }
                }
                if (writeReplace != null) {
                    this.writeReplace.put(str, writeReplace.AlternateContactlessPaymentDataJson());
                    return writeReplace;
                }
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a(new int[]{60, 36, 174, 25}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001", true, objArr5);
                java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b("䅍\uf48b䄟舑\ue0e1놊ࣔ⽢吉꺚ᷖѰ欬鮡㛸᥊縸炲䯬\uee53ᕙ浐岛쒸⡎婆", android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr6);
                throw new com.payair.hce.VisaReperso(intern3, ((java.lang.String) objArr6[0]).intern());
            }
        }
        if (writeReplace != null) {
            return writeReplace;
        }
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(new int[]{60, 36, 174, 25}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001", true, objArr7);
        java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        b("䅍\uf48b䄟舑\ue0e1놊ࣔ⽢吉꺚ᷖѰ欬鮡㛸᥊縸炲䯬\uee53ᕙ浐岛쒸⡎婆", android.text.TextUtils.getCapsMode("", 0, 0), objArr8);
        throw new com.payair.hce.VisaReperso(intern4, ((java.lang.String) objArr8[0]).intern());
    }

    public final void AlternateContactlessPaymentDataJson() {
        java.util.Iterator<com.payair.hce.moveSharedPreferencesFrom> it = this.DigitizedCardProfile.iterator();
        if (it.hasNext()) {
            SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 99) % 128;
            it.next();
        }
        while (it.hasNext()) {
            int i = getCiacDecline + 51;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                it.next().valueOf();
            } else {
                it.next().valueOf();
                throw new java.lang.ArithmeticException();
            }
        }
    }

    private com.payair.hce.moveSharedPreferencesFrom DigitizedCardProfile(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 81) % 128;
        for (int i = 1; i < this.DigitizedCardProfile.size(); i++) {
            getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 71) % 128;
            if (this.DigitizedCardProfile.get(i).AlternateContactlessPaymentDataJson().equalsIgnoreCase(str)) {
                return this.DigitizedCardProfile.get(i);
            }
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 101) % 128;
        return null;
    }

    private com.payair.hce.moveSharedPreferencesFrom writeReplace() {
        SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 87) % 128;
        for (int i = 1; i < this.DigitizedCardProfile.size(); i++) {
            SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 47) % 128;
            com.payair.hce.moveSharedPreferencesFrom movesharedpreferencesfrom = this.DigitizedCardProfile.get(i);
            if (movesharedpreferencesfrom.values() == com.payair.hce.moveSharedPreferencesFrom.values.valueOf && movesharedpreferencesfrom.DigitizedCardProfile() == com.payair.hce.moveSharedPreferencesFrom.valueOf.writeReplace) {
                return movesharedpreferencesfrom;
            }
        }
        return null;
    }

    private void values(java.lang.String str) {
        if (str != null) {
            SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 49) % 128;
            if (str.isEmpty()) {
                return;
            }
            getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 75) % 128;
            if (this.DigitizedCardProfile.size() != 0) {
                this.DigitizedCardProfile.get(0).writeReplace(str);
            } else {
                this.DigitizedCardProfile.add(new com.payair.hce.moveSharedPreferencesFrom(this.AlternateContactlessPaymentDataJson, str, this, null));
            }
        }
    }

    @Override // com.payair.hce.sendStickyOrderedBroadcastAsUser
    public final void values(com.payair.hce.getDatabasePath getdatabasepath) {
        getCiacDecline = (SdkCoreAlternateContactlessPaymentDataImpl + 81) % 128;
        int i = com.payair.hce.unregisterReceiver.AnonymousClass3.values[((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() - 1];
        if (i == 2) {
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.AlternateContactlessPaymentDataJson;
            com.payair.hce.ExpirationDate expirationDate = (com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast));
            com.payair.hce.fileList filelist = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath));
            expirationDate.RecordsJson((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist}, -1279268571, 1279268573, java.lang.System.identityHashCode(filelist)));
            SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 41) % 128;
            return;
        }
        if (i == 8) {
            com.payair.hce.openOrCreateDatabase openorcreatedatabase = (com.payair.hce.openOrCreateDatabase) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.AlternateContactlessPaymentDataJson;
            ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast2))).AlternateContactlessPaymentDataJson((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{openorcreatedatabase}, -1279268571, 1279268573, java.lang.System.identityHashCode(openorcreatedatabase)), openorcreatedatabase.RecordsJson());
        } else {
            if (i != 9) {
                return;
            }
            com.payair.hce.openOrCreateDatabase openorcreatedatabase2 = (com.payair.hce.openOrCreateDatabase) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.AlternateContactlessPaymentDataJson;
            ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast3))).IccPrivateKeyCrtComponentsJson(openorcreatedatabase2.RecordsJson());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x052a  */
    @Override // com.payair.hce.sendStickyOrderedBroadcastAsUser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AlternateContactlessPaymentDataJson(com.payair.hce.getDatabasePath getdatabasepath) {
        switch (com.payair.hce.unregisterReceiver.AnonymousClass3.values[((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() - 1]) {
            case 1:
            case 2:
                com.payair.hce.getWallpaper getwallpaper = (com.payair.hce.getWallpaper) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.AlternateContactlessPaymentDataJson;
                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast))).valueOf((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getwallpaper}, -1279268571, 1279268573, java.lang.System.identityHashCode(getwallpaper)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getwallpaper}, 1373679103, -1373679102, java.lang.System.identityHashCode(getwallpaper)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getwallpaper}, -1777947608, 1777947612, java.lang.System.identityHashCode(getwallpaper)), (java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)));
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                    if (writeReplace() != null) {
                        AlternateContactlessPaymentDataJson((java.lang.String) null);
                        return;
                    }
                    return;
                }
                if (this.getAid == com.payair.hce.startForegroundService.values) {
                    AlternateContactlessPaymentDataJson((java.lang.String) null);
                    return;
                }
                return;
            case 3:
                this.getAid = com.payair.hce.startForegroundService.valueOf;
                com.payair.hce.fileList filelist = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath));
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.AlternateContactlessPaymentDataJson;
                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast2))).DigitizedCardProfile((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist}, 1373679103, -1373679102, java.lang.System.identityHashCode(filelist)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist}, -1777947608, 1777947612, java.lang.System.identityHashCode(filelist)), (java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)));
                com.payair.hce.getExternalFilesDirs poll = this.values.poll();
                if (poll != null) {
                    int i = getCiacDecline + 17;
                    SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                    if (i % 2 == 0) {
                        AlternateContactlessPaymentDataJson((com.payair.hce.getDatabasePath) valueOf(new java.lang.Object[]{poll, (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist}, -2043543314, 2043543319, java.lang.System.identityHashCode(filelist)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist}, 1373679103, -1373679102, java.lang.System.identityHashCode(filelist)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist}, -1777947608, 1777947612, java.lang.System.identityHashCode(filelist))}, 608776371, -608776371, (int) java.lang.System.currentTimeMillis()));
                    } else {
                        AlternateContactlessPaymentDataJson((com.payair.hce.getDatabasePath) valueOf(new java.lang.Object[]{poll, (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist}, -2043543314, 2043543319, java.lang.System.identityHashCode(filelist)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist}, 1373679103, -1373679102, java.lang.System.identityHashCode(filelist)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist}, -1777947608, 1777947612, java.lang.System.identityHashCode(filelist))}, 608776371, -608776371, (int) java.lang.System.currentTimeMillis()));
                        throw null;
                    }
                }
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                }
                break;
            case 4:
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.AlternateContactlessPaymentDataJson;
                com.payair.hce.ExpirationDate expirationDate = (com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast3));
                com.payair.hce.fileList filelist2 = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath));
                java.lang.String str = (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist2}, 1373679103, -1373679102, java.lang.System.identityHashCode(filelist2));
                com.payair.hce.fileList filelist3 = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath));
                expirationDate.valueOf(str, (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist3}, -1777947608, 1777947612, java.lang.System.identityHashCode(filelist3)), (java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)));
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                }
                break;
            case 5:
                com.payair.hce.databaseList databaselist = (com.payair.hce.databaseList) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast4 = this.AlternateContactlessPaymentDataJson;
                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast4}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast4))).AlternateContactlessPaymentDataJson((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{databaselist}, -1279268571, 1279268573, java.lang.System.identityHashCode(databaselist)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{databaselist}, -2043543314, 2043543319, java.lang.System.identityHashCode(databaselist)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{databaselist}, 1373679103, -1373679102, java.lang.System.identityHashCode(databaselist)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{databaselist}, -1777947608, 1777947612, java.lang.System.identityHashCode(databaselist)), (java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)));
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                }
                break;
            case 6:
                com.payair.hce.moveDatabaseFrom movedatabasefrom = (com.payair.hce.moveDatabaseFrom) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast5 = this.AlternateContactlessPaymentDataJson;
                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast5}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast5))).values((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{movedatabasefrom}, -1279268571, 1279268573, java.lang.System.identityHashCode(movedatabasefrom)), ((java.lang.Integer) com.payair.hce.moveDatabaseFrom.AlternateContactlessPaymentDataJson(new java.lang.Object[]{movedatabasefrom}, 1849555291, -1849555291, java.lang.System.identityHashCode(movedatabasefrom))).intValue(), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{movedatabasefrom}, 1373679103, -1373679102, java.lang.System.identityHashCode(movedatabasefrom)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{movedatabasefrom}, -1777947608, 1777947612, java.lang.System.identityHashCode(movedatabasefrom)), (java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)));
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                }
                break;
            case 7:
                com.payair.hce.moveDatabaseFrom movedatabasefrom2 = (com.payair.hce.moveDatabaseFrom) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast6 = this.AlternateContactlessPaymentDataJson;
                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast6}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast6))).values(((java.lang.Integer) com.payair.hce.moveDatabaseFrom.AlternateContactlessPaymentDataJson(new java.lang.Object[]{movedatabasefrom2}, 1849555291, -1849555291, java.lang.System.identityHashCode(movedatabasefrom2))).intValue(), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{movedatabasefrom2}, 1373679103, -1373679102, java.lang.System.identityHashCode(movedatabasefrom2)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{movedatabasefrom2}, -1777947608, 1777947612, java.lang.System.identityHashCode(movedatabasefrom2)), (java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)));
                SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 81) % 128;
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                }
                break;
            case 8:
                com.payair.hce.openOrCreateDatabase openorcreatedatabase = (com.payair.hce.openOrCreateDatabase) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast7 = this.AlternateContactlessPaymentDataJson;
                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast7}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast7))).writeReplace((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{openorcreatedatabase}, -1279268571, 1279268573, java.lang.System.identityHashCode(openorcreatedatabase)), openorcreatedatabase.values(), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{openorcreatedatabase}, 1373679103, -1373679102, java.lang.System.identityHashCode(openorcreatedatabase)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{openorcreatedatabase}, -1777947608, 1777947612, java.lang.System.identityHashCode(openorcreatedatabase)), (java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)));
                SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 81) % 128;
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                }
                break;
            case 9:
                com.payair.hce.openOrCreateDatabase openorcreatedatabase2 = (com.payair.hce.openOrCreateDatabase) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast8 = this.AlternateContactlessPaymentDataJson;
                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast8}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast8))).AlternateContactlessPaymentDataJson(openorcreatedatabase2.values(), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{openorcreatedatabase2}, 1373679103, -1373679102, java.lang.System.identityHashCode(openorcreatedatabase2)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{openorcreatedatabase2}, -1777947608, 1777947612, java.lang.System.identityHashCode(openorcreatedatabase2)), (java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)));
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                }
                break;
            case 10:
                com.payair.hce.getDir getdir = (com.payair.hce.getDir) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast9 = this.AlternateContactlessPaymentDataJson;
                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast9}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast9))).valueOf((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getdir}, -1279268571, 1279268573, java.lang.System.identityHashCode(getdir)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getdir}, -2043543314, 2043543319, java.lang.System.identityHashCode(getdir)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getdir}, 1373679103, -1373679102, java.lang.System.identityHashCode(getdir)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getdir}, -1777947608, 1777947612, java.lang.System.identityHashCode(getdir)), (java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)));
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                }
                break;
            case 11:
                com.payair.hce.getExternalMediaDirs getexternalmediadirs = (com.payair.hce.getExternalMediaDirs) ((com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath)));
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast10 = this.AlternateContactlessPaymentDataJson;
                ((com.payair.hce.ExpirationDate) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast10}, 1414273022, -1414273018, java.lang.System.identityHashCode(sendorderedbroadcast10))).writeReplace((java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getexternalmediadirs}, 1373679103, -1373679102, java.lang.System.identityHashCode(getexternalmediadirs)), (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{getexternalmediadirs}, -1777947608, 1777947612, java.lang.System.identityHashCode(getexternalmediadirs)), (java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)));
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                }
                break;
            default:
                if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                }
                break;
        }
    }

    @Override // com.payair.hce.sendStickyOrderedBroadcastAsUser
    public final void writeReplace(com.payair.hce.getDatabasePath getdatabasepath) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 39;
        getCiacDecline = i % 128;
        if (i % 2 != 0) {
            AlternateContactlessPaymentDataJson(getdatabasepath);
            SdkCoreAlternateContactlessPaymentDataImpl = (getCiacDecline + 63) % 128;
        } else {
            AlternateContactlessPaymentDataJson(getdatabasepath);
            throw null;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getCiacDecline = 1;
        getProfileVersion = new char[]{16871, 16773, 16776, 16774, 16768, 16797, 16797, 16775, 16772, 16768, 16770, 16768, 16792, 16799, 16780, 16772, 16772, 16798, 16792, 16768, 16799, 16791, 16798, 16773, 16773, 16779, 16772, 16776, 16783, 16777, 16774, 16889, 16807, 16807, 16807, 16808, 16810, 16809, 16809, 16793, 16888, 16780, 16802, 16831, 16800, 16807, 16789, 16887, 16780, 16808, 16804, 16808, 16805, 16828, 16789, 16772, 16769, 16797, 16884, 16772, 16734, 16622, 16623, 16596, 16673, 16697, 16594, 16700, 16694, 16593, 16601, 16601, 16601, 16602, 16604, 16603, 16603, 16603, 16698, 16702, 16596, 16593, 16594, 16601, 16583, 16672, 16591, 16618, 16620, 16599, 16673, 16692, 16622, 16592, 16593, 16601, 16821, 16696, 16698, 16698, 16702, 16676, 16675, 16675, 16673, 16703, 16676, 16699, 16696, 16831, 16687, 16684, 16682, 16685, 16683, 16684, 16687, 16687, 16810, 16684, 16587, 16587, 16691, 16659, 16684, 16583, 16585, 16583, 16587, 16691, 16591, 16588, 16588, 16583, 16578, 16583, 16684, 16684, 16584, 16657, 16684, 16583, 16585, 16583, 16584, 16691, 16661, 16656, 16587, 16584, 16591, 16586, 16586, 16587, 16685, 16659, 16585, 16579, 16586, 16589, 16685, 16684, 16578, 16683, 16659, 16589, 16588, 16690, 16588, 16690};
        IccPrivateKeyCrtComponentsJson = -3991145504767528569L;
    }

    @Override // com.payair.hce.sendStickyOrderedBroadcastAsUser
    public final void DigitizedCardProfile(com.payair.hce.getDatabasePath getdatabasepath) {
        valueOf(new java.lang.Object[]{this, getdatabasepath}, -1074445395, 1074445396, java.lang.System.identityHashCode(this));
    }

    private static com.payair.hce.getDatabasePath DigitizedCardProfile(com.payair.hce.getExternalFilesDirs getexternalfilesdirs, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return (com.payair.hce.getDatabasePath) valueOf(new java.lang.Object[]{getexternalfilesdirs, str, str2, str3}, 608776371, -608776371, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.CAN, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -20, -99};
        $$b = 138;
    }
}
