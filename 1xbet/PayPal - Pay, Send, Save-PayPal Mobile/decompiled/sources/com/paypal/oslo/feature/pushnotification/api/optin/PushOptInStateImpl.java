package com.paypal.oslo.feature.pushnotification.api.optin;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0014\u0010+\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInStateImpl;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/OptInSource;", "source", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionManager;", "permissionManager", "Landroid/app/Activity;", "activity", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult;", "resultChannel", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatusHolder;", "permissionStatusHolder", "Lkotlin/Function0;", "", "launchPermissionRequest", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/api/optin/OptInSource;Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionManager;Landroid/app/Activity;Landroid/content/Context;Lkotlinx/coroutines/channels/Channel;Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatusHolder;Lkotlin/jvm/functions/Function0;)V", "requestPermission", "()V", "openSettings", "requestPermissionOrOpenSettings", "refreshStatus", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/pushnotification/api/optin/OptInSource;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionManager;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroid/app/Activity;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatusHolder;", "getInputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "getPermissionStatus", "()Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "permissionStatus", "", "getShouldShowRationale", "()Z", "shouldShowRationale", "getRequiresSettings", "requiresSettings", "Lkotlinx/coroutines/flow/Flow;", "getResultFlow", "()Lkotlinx/coroutines/flow/Flow;", "resultFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PushOptInStateImpl implements com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.app.Activity getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatusHolder getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult> Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.api.optin.OptInSource getHighSpeedVideoSizes;

    public PushOptInStateImpl(com.paypal.oslo.feature.pushnotification.api.optin.OptInSource optInSource, com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager pushNotificationPermissionManager, android.app.Activity activity, android.content.Context context, kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult> channel, com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatusHolder permissionStatusHolder, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optInSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationPermissionManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionStatusHolder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = optInSource;
        this.getHighResolutionOutputSizeshNQ4ISI = pushNotificationPermissionManager;
        this.getHighSpeedVideoFpsRanges = activity;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.Camera2StreamConfigurationMap = channel;
        this.getInputSizeshNQ4ISI = permissionStatusHolder;
        this.getOutputMinFrameDuration = function0;
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState
    public final /* bridge */ boolean isOptInRequired() {
        return super.isOptInRequired();
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState
    public final com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus getPermissionStatus() {
        return this.getInputSizeshNQ4ISI.getGet().invoke();
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState
    public final boolean getShouldShowRationale() {
        return this.getHighResolutionOutputSizeshNQ4ISI.shouldShowRationale(this.getHighSpeedVideoFpsRanges);
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState
    public final boolean getRequiresSettings() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.canRequestPermission(this.getHighSpeedVideoFpsRanges) || this.getHighResolutionOutputSizeshNQ4ISI.hasNotificationPermission()) ? false : true;
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult> getResultFlow() {
        return kotlinx.coroutines.flow.FlowKt.receiveAsFlow(this.Camera2StreamConfigurationMap);
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState
    public final void requestPermission() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.hasNotificationPermission()) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.Camera2StreamConfigurationMap.mo9266trySendJP2dKIU(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Granted.INSTANCE));
            return;
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isRuntimePermissionRequired()) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.Camera2StreamConfigurationMap.mo9266trySendJP2dKIU(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.NotRequired.INSTANCE));
        } else if (!this.getHighResolutionOutputSizeshNQ4ISI.canRequestPermission(this.getHighSpeedVideoFpsRanges)) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.Camera2StreamConfigurationMap.mo9266trySendJP2dKIU(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.RequiresSettings.INSTANCE));
        } else {
            this.getOutputMinFrameDuration.invoke();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState
    public final void openSettings() {
        android.content.Intent intent = new android.content.Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", this.getHighSpeedVideoFpsRangesFor.getPackageName());
        intent.addFlags(268435456);
        this.getHighSpeedVideoFpsRangesFor.startActivity(intent);
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState
    public final void requestPermissionOrOpenSettings() {
        if (getRequiresSettings()) {
            openSettings();
        } else {
            requestPermission();
        }
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState
    public final void refreshStatus() {
        this.getInputSizeshNQ4ISI.getSet().invoke(com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.computePermissionStatus(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges));
    }
}
