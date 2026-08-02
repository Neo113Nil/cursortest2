package com.paypal.android.threeds.security;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\nJ\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nJ\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\nR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/android/threeds/security/SecurityCheck;", "", "<init>", "()V", "", "Lcom/paypal/android/threeds/security/Warning;", "getWarnings", "()Ljava/util/List;", "", "isRootedDevices", "()Z", "Ljava/lang/Class;", "classNameList", "isSdkTampered", "(Ljava/util/List;)Z", "isDebuggerAttached", "isEmulator", "isUnsupportedOSVersion", "checkBuildTags", "checkSudoFolders", "isAbleToExecuteSudoCommand", "Camera2StreamConfigurationMap", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecurityCheck {
    public static final com.paypal.android.threeds.security.SecurityCheck INSTANCE = new com.paypal.android.threeds.security.SecurityCheck();
    private static final java.util.List<java.lang.Class<? extends java.lang.Object>> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Class[]{com.paypal.android.threeds.init.ConfigurationParams.class, com.paypal.android.threeds.init.ThreeDsService.class, com.paypal.android.threeds.transaction.ThreeDsTransaction.class, com.paypal.android.threeds.repository.ApiRepository.class});
    public static final int $stable = 8;

    private SecurityCheck() {
    }

    public final java.util.List<com.paypal.android.threeds.security.Warning> getWarnings() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Starting security checks", null, null, 6, null);
        if (isRootedDevices()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Security check failed: Device is rooted", null, null, 6, null);
            arrayList.add(new com.paypal.android.threeds.security.Warning(com.paypal.android.threeds.utils.ConstantUtil.SECURITY_CHECK_ROOTED_ID, com.paypal.android.threeds.utils.ConstantUtil.SECURITY_CHECK_ROOTED_DESCRIPTION, com.paypal.android.threeds.security.Warning.Severity.HIGH));
        }
        if (isSdkTampered(Camera2StreamConfigurationMap)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Security check failed: SDK is tampered", null, null, 6, null);
            arrayList.add(new com.paypal.android.threeds.security.Warning(com.paypal.android.threeds.utils.ConstantUtil.SECURITY_CHECK_SDK_TAMPERED_ID, com.paypal.android.threeds.utils.ConstantUtil.SECURITY_CHECK_SDK_TAMPERED_DESCRIPTION, com.paypal.android.threeds.security.Warning.Severity.HIGH));
        }
        if (isEmulator()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Security check warning: Running on emulator", null, null, 6, null);
            arrayList.add(new com.paypal.android.threeds.security.Warning(com.paypal.android.threeds.utils.ConstantUtil.SECURITY_CHECK_EMULATOR_ID, com.paypal.android.threeds.utils.ConstantUtil.SECURITY_CHECK_EMULATOR_DESCRIPTION, com.paypal.android.threeds.security.Warning.Severity.HIGH));
        }
        if (isDebuggerAttached()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Security check warning: Debugger is attached", null, null, 6, null);
            arrayList.add(new com.paypal.android.threeds.security.Warning(com.paypal.android.threeds.utils.ConstantUtil.SECURITY_CHECK_DEBUGGER_ATTACHED_ID, com.paypal.android.threeds.utils.ConstantUtil.SECURITY_CHECK_DEBUGGER_ATTACHED_DESCRIPTION, com.paypal.android.threeds.security.Warning.Severity.MEDIUM));
        }
        if (isUnsupportedOSVersion()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Security check failed: Unsupported OS version: ".concat(java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT)), null, null, 6, null);
            arrayList.add(new com.paypal.android.threeds.security.Warning(com.paypal.android.threeds.utils.ConstantUtil.SECURITY_CHECK_UNSUPPORTED_OS_ID, com.paypal.android.threeds.utils.ConstantUtil.SECURITY_CHECK_UNSUPPORTED_OS_DESCRIPTION, com.paypal.android.threeds.security.Warning.Severity.HIGH));
        }
        com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
        int size = arrayList.size();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Security checks completed. Found ");
        sb.append(size);
        sb.append(" warnings");
        com.paypal.android.logger.Logger.i$default(logger, sb.toString(), null, null, 6, null);
        return arrayList;
    }

    public final boolean isRootedDevices() {
        return checkBuildTags() || checkSudoFolders() || isAbleToExecuteSudoCommand();
    }

    public final boolean isSdkTampered(java.util.List<? extends java.lang.Class<? extends java.lang.Object>> classNameList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classNameList, "");
        java.util.Iterator<? extends java.lang.Class<? extends java.lang.Object>> it = classNameList.iterator();
        while (it.hasNext()) {
            try {
                java.lang.Class.forName(it.next().getName());
            } catch (java.lang.ClassNotFoundException unused) {
                return true;
            }
        }
        return false;
    }

    public final boolean isDebuggerAttached() {
        return android.os.Debug.isDebuggerConnected() || android.os.Debug.waitingForDebugger();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r0, "generic", false, 2, (java.lang.Object) null) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isEmulator() {
        java.lang.String str = android.os.Build.BRAND;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        if (kotlin.text.StringsKt.startsWith$default(str, "generic", false, 2, (java.lang.Object) null)) {
            java.lang.String str2 = android.os.Build.DEVICE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        }
        java.lang.String str3 = android.os.Build.FINGERPRINT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
        if (!kotlin.text.StringsKt.startsWith$default(str3, "generic", false, 2, (java.lang.Object) null)) {
            java.lang.String str4 = android.os.Build.FINGERPRINT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
            if (!kotlin.text.StringsKt.startsWith$default(str4, "unknown", false, 2, (java.lang.Object) null)) {
                java.lang.String str5 = android.os.Build.HARDWARE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "");
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str5, (java.lang.CharSequence) "goldfish", false, 2, (java.lang.Object) null)) {
                    java.lang.String str6 = android.os.Build.HARDWARE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
                    if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str6, (java.lang.CharSequence) "ranchu", false, 2, (java.lang.Object) null)) {
                        java.lang.String str7 = android.os.Build.MODEL;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null)) {
                            java.lang.String str8 = android.os.Build.MODEL;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str8, "");
                            if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) str8, (java.lang.CharSequence) "emulator", true)) {
                                java.lang.String str9 = android.os.Build.MODEL;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str9, "");
                                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str9, (java.lang.CharSequence) "Android SDK built for x86", false, 2, (java.lang.Object) null)) {
                                    java.lang.String str10 = android.os.Build.MANUFACTURER;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str10, "");
                                    if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str10, (java.lang.CharSequence) "Genymotion", false, 2, (java.lang.Object) null)) {
                                        java.lang.String str11 = android.os.Build.PRODUCT;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str11, "");
                                        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str11, (java.lang.CharSequence) "sdk_google", false, 2, (java.lang.Object) null)) {
                                            java.lang.String str12 = android.os.Build.PRODUCT;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str12, "");
                                            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str12, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null)) {
                                                java.lang.String str13 = android.os.Build.PRODUCT;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str13, "");
                                                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str13, (java.lang.CharSequence) "sdk", false, 2, (java.lang.Object) null)) {
                                                    java.lang.String str14 = android.os.Build.PRODUCT;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str14, "");
                                                    if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str14, (java.lang.CharSequence) "sdk_x86", false, 2, (java.lang.Object) null)) {
                                                        java.lang.String str15 = android.os.Build.PRODUCT;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str15, "");
                                                        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str15, (java.lang.CharSequence) "sdk_gphone64_arm64", false, 2, (java.lang.Object) null)) {
                                                            java.lang.String str16 = android.os.Build.PRODUCT;
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str16, "");
                                                            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str16, (java.lang.CharSequence) "vbox86p", false, 2, (java.lang.Object) null)) {
                                                                java.lang.String str17 = android.os.Build.PRODUCT;
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str17, "");
                                                                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str17, (java.lang.CharSequence) "emulator", false, 2, (java.lang.Object) null)) {
                                                                    java.lang.String str18 = android.os.Build.PRODUCT;
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str18, "");
                                                                    if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str18, (java.lang.CharSequence) "simulator", false, 2, (java.lang.Object) null)) {
                                                                        return false;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean isUnsupportedOSVersion() {
        return com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 21;
    }

    public final boolean checkBuildTags() {
        java.lang.String str = android.os.Build.TAGS;
        return str != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "test-keys", false, 2, (java.lang.Object) null);
    }

    public final boolean checkSudoFolders() {
        java.lang.String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new java.io.File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isAbleToExecuteSudoCommand() {
        java.lang.Process process = null;
        try {
            process = java.lang.Runtime.getRuntime().exec(new java.lang.String[]{"/system/xbin/which", "su"});
            return new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream())).readLine() != null;
        } catch (java.lang.Throwable th) {
            try {
                com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
                java.lang.String message = th.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception occurred while checking sudo command: ");
                sb.append(message);
                com.paypal.android.logger.Logger.i$default(logger, sb.toString(), null, null, 6, null);
                if (process != null) {
                    process.destroy();
                }
                return false;
            } finally {
                if (process != null) {
                    process.destroy();
                }
            }
        }
    }
}
