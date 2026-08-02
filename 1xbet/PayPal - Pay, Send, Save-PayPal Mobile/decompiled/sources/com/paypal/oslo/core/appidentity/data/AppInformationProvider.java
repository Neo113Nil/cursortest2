package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0013\u001a\u0006*\u00020\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0019\u0010\u0018\u001a\u0006*\u00020\u001b0\u001b8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001b\u0010%\u001a\u00020\u000b8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010 R\u001a\u0010&\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 R\u0014\u0010)\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0014\u0010+\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0016\u0010-\u001a\u0004\u0018\u00010\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010 "}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/AppInformationProvider;", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/appidentity/data/AppGUID;", "internalAppGUID", "Lcom/paypal/oslo/core/appidentity/data/SessionReader;", "sessionReader", "veniceSessionReader", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/core/appidentity/data/AppGUID;Lcom/paypal/oslo/core/appidentity/data/SessionReader;Lcom/paypal/oslo/core/appidentity/data/SessionReader;)V", "", "appGuid", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isFirstLaunch", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/appidentity/data/AppGUID;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/appidentity/data/SessionReader;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Landroid/content/pm/PackageManager;", "Landroid/content/pm/PackageManager;", "Landroid/content/pm/PackageInfo;", "Lkotlin/Lazy;", "appName", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", "appVersion", "getAppVersion", "buildNumber$delegate", "getBuildNumber", "buildNumber", com.visa.cbp.ConsumerInfo.setSignature, "getPackageName", "getSessionID", "sessionID", "getVeniceSessionId", "veniceSessionId", "getAppGUID", "appGUID"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppInformationProvider implements com.paypal.oslo.core.appidentity.domain.AppInformation {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.data.SessionReader getHighSpeedVideoFpsRanges;
    private final java.lang.String appName;
    private final java.lang.String appVersion;

    /* renamed from: buildNumber$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy buildNumber;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.pm.PackageManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.data.AppGUID getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.data.SessionReader Camera2StreamConfigurationMap;
    private final java.lang.String packageName;

    @javax.inject.Inject
    public AppInformationProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.core.appidentity.data.AppGUID appGUID, com.paypal.oslo.core.appidentity.data.SessionReader sessionReader, com.paypal.oslo.core.appidentity.data.SessionReader sessionReader2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appGUID, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReader2, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = appGUID;
        this.getHighSpeedVideoFpsRanges = sessionReader;
        this.Camera2StreamConfigurationMap = sessionReader2;
        this.getHighSpeedVideoSizes = context.getPackageManager();
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.appidentity.data.AppInformationProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.appidentity.data.AppInformationProvider.$r8$lambda$BmZa31PUxE0LFo016f1slOw_H6o(com.paypal.oslo.core.appidentity.data.AppInformationProvider.this);
            }
        });
        this.getInputSizeshNQ4ISI = lazy;
        this.appName = "Oslo";
        java.lang.String str = ((android.content.pm.PackageInfo) lazy.getValue()).versionName;
        this.appVersion = str == null ? "0.0.0" : str;
        this.buildNumber = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.appidentity.data.AppInformationProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.appidentity.data.AppInformationProvider.$r8$lambda$_4KsIdOxn4L7TzUhkNyUCPr7gQs(com.paypal.oslo.core.appidentity.data.AppInformationProvider.this);
            }
        });
        java.lang.String packageName = context.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.packageName = packageName;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.AppInformation
    public final java.lang.String getAppName() {
        return this.appName;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.AppInformation
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.AppInformation
    public final java.lang.String getBuildNumber() {
        return (java.lang.String) this.buildNumber.getValue();
    }

    @Override // com.paypal.oslo.core.appidentity.domain.AppInformation
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.AppInformation
    public final java.lang.String getSessionID() {
        return this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // com.paypal.oslo.core.appidentity.domain.AppInformation
    public final java.lang.String getVeniceSessionId() {
        return this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // com.paypal.oslo.core.appidentity.domain.AppInformation
    public final java.lang.String getAppGUID() {
        return this.getHighResolutionOutputSizeshNQ4ISI.value();
    }

    @Override // com.paypal.oslo.core.appidentity.domain.AppInformation
    public final java.lang.Object appGuid(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue(continuation);
    }

    @Override // com.paypal.oslo.core.appidentity.domain.AppInformation
    public final java.lang.Object isFirstLaunch(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIsFirstLaunch(continuation);
    }

    public static /* synthetic */ android.content.pm.PackageInfo $r8$lambda$BmZa31PUxE0LFo016f1slOw_H6o(com.paypal.oslo.core.appidentity.data.AppInformationProvider appInformationProvider) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return appInformationProvider.getHighSpeedVideoSizes.getPackageInfo(appInformationProvider.getHighSpeedVideoFpsRangesFor.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
        }
        return appInformationProvider.getHighSpeedVideoSizes.getPackageInfo(appInformationProvider.getHighSpeedVideoFpsRangesFor.getPackageName(), 0);
    }

    public static /* synthetic */ java.lang.String $r8$lambda$_4KsIdOxn4L7TzUhkNyUCPr7gQs(com.paypal.oslo.core.appidentity.data.AppInformationProvider appInformationProvider) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return java.lang.String.valueOf(((android.content.pm.PackageInfo) appInformationProvider.getInputSizeshNQ4ISI.getValue()).getLongVersionCode());
        }
        return java.lang.String.valueOf(((android.content.pm.PackageInfo) appInformationProvider.getInputSizeshNQ4ISI.getValue()).versionCode);
    }
}
