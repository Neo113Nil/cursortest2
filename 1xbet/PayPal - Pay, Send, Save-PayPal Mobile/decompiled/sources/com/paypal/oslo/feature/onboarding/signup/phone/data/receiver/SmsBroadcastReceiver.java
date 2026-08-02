package com.paypal.oslo.feature.onboarding.signup.phone.data.receiver;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/data/receiver/SmsBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "SmsListener"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SmsBroadcastReceiver extends android.content.BroadcastReceiver {
    private static java.lang.ref.WeakReference<com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.SmsListener> getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/data/receiver/SmsBroadcastReceiver$SmsListener;", "", "", "message", "", "onSmsReceived", "(Ljava/lang/String;)V", "onTimeout", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface SmsListener {
        void onSmsReceived(java.lang.String message);

        void onTimeout();
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/data/receiver/SmsBroadcastReceiver$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/signup/phone/data/receiver/SmsBroadcastReceiver$SmsListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "(Lcom/paypal/oslo/feature/onboarding/signup/phone/data/receiver/SmsBroadcastReceiver$SmsListener;)V", "clearListener", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void setListener(com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.SmsListener listener) {
            com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.getHighSpeedVideoFpsRangesFor = listener != null ? new java.lang.ref.WeakReference(listener) : null;
        }

        public final void clearListener() {
            com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.getHighSpeedVideoFpsRangesFor = null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle extras;
        com.google.android.gms.common.api.Status status;
        java.lang.ref.WeakReference<com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.SmsListener> weakReference;
        com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.SmsListener smsListener;
        java.lang.ref.WeakReference<com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.SmsListener> weakReference2;
        com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.SmsListener smsListener2;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(intent != null ? intent.getAction() : null, com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION) || (extras = intent.getExtras()) == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            status = (com.google.android.gms.common.api.Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS", com.google.android.gms.common.api.Status.class);
        } else {
            status = (com.google.android.gms.common.api.Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
        }
        java.lang.Integer valueOf = status != null ? java.lang.Integer.valueOf(status.getStatusCode()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            java.lang.String string = extras.getString(com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_SMS_MESSAGE);
            if (string == null || (weakReference2 = getHighSpeedVideoFpsRangesFor) == null || (smsListener2 = weakReference2.get()) == null) {
                return;
            }
            smsListener2.onSmsReceived(string);
            return;
        }
        if (valueOf == null || valueOf.intValue() != 15 || (weakReference = getHighSpeedVideoFpsRangesFor) == null || (smsListener = weakReference.get()) == null) {
            return;
        }
        smsListener.onTimeout();
    }
}
