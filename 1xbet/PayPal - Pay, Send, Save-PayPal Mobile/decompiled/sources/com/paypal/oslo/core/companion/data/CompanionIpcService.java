package com.paypal.oslo.core.companion.data;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0013\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/companion/data/CompanionIpcService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Lcom/paypal/oslo/core/companion/data/CompanionAppMessageHandler;", "companionAppMessageHandler", "Lcom/paypal/oslo/core/companion/data/CompanionAppMessageHandler;", "getCompanionAppMessageHandler", "()Lcom/paypal/oslo/core/companion/data/CompanionAppMessageHandler;", "setCompanionAppMessageHandler", "(Lcom/paypal/oslo/core/companion/data/CompanionAppMessageHandler;)V", "Landroid/os/Messenger;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.hilt.android.AndroidEntryPoint
/* loaded from: classes10.dex */
public final class CompanionIpcService extends com.paypal.oslo.core.companion.data.Hilt_CompanionIpcService {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.companion.data.CompanionIpcService$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.companion.data.CompanionIpcService.$r8$lambda$VrbS7C3KzcXCzAZyuNqg7qeVji8(com.paypal.oslo.core.companion.data.CompanionIpcService.this);
        }
    });

    @javax.inject.Inject
    public com.paypal.oslo.core.companion.data.CompanionAppMessageHandler companionAppMessageHandler;

    public final com.paypal.oslo.core.companion.data.CompanionAppMessageHandler getCompanionAppMessageHandler() {
        com.paypal.oslo.core.companion.data.CompanionAppMessageHandler companionAppMessageHandler = this.companionAppMessageHandler;
        if (companionAppMessageHandler != null) {
            return companionAppMessageHandler;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setCompanionAppMessageHandler(com.paypal.oslo.core.companion.data.CompanionAppMessageHandler companionAppMessageHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionAppMessageHandler, "");
        this.companionAppMessageHandler = companionAppMessageHandler;
    }

    public static /* synthetic */ android.os.Messenger $r8$lambda$VrbS7C3KzcXCzAZyuNqg7qeVji8(com.paypal.oslo.core.companion.data.CompanionIpcService companionIpcService) {
        return new android.os.Messenger(companionIpcService.getCompanionAppMessageHandler());
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        android.os.IBinder binder = ((android.os.Messenger) this.getHighSpeedVideoSizes.getValue()).getBinder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(binder, "");
        return binder;
    }

    @Override // com.paypal.oslo.core.companion.data.Hilt_CompanionIpcService, android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.paypal.oslo.core.companion.data.Hilt_CompanionIpcService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
