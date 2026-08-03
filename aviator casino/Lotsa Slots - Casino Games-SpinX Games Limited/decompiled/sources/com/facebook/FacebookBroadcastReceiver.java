package com.facebook;

/* compiled from: FacebookBroadcastReceiver.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0014J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\u0010"}, d2 = {"Lcom/facebook/FacebookBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onFailedAppCall", "", "appCallId", "", "action", "extras", "Landroid/os/Bundle;", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onSuccessfulAppCall", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class FacebookBroadcastReceiver extends android.content.BroadcastReceiver {
    protected void onFailedAppCall(java.lang.String appCallId, java.lang.String action, android.os.Bundle extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
    }

    protected void onSuccessfulAppCall(java.lang.String appCallId, java.lang.String action, android.os.Bundle extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra(com.facebook.internal.NativeProtocol.EXTRA_PROTOCOL_CALL_ID);
        java.lang.String stringExtra2 = intent.getStringExtra(com.facebook.internal.NativeProtocol.EXTRA_PROTOCOL_ACTION);
        android.os.Bundle extras = intent.getExtras();
        if (stringExtra == null || stringExtra2 == null || extras == null) {
            return;
        }
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        if (com.facebook.internal.NativeProtocol.isErrorResult(intent)) {
            onFailedAppCall(stringExtra, stringExtra2, extras);
        } else {
            onSuccessfulAppCall(stringExtra, stringExtra2, extras);
        }
    }
}
