package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/identity/GooglePhoneHintIdentityClient;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/identity/PhoneHintIdentityClient;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lcom/google/android/gms/tasks/Task;", "Landroid/app/PendingIntent;", "getPhoneNumberHintIntent", "(Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "getPhoneNumberFromIntent", "(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GooglePhoneHintIdentityClient implements com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity.PhoneHintIdentityClient {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity.PhoneHintIdentityClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> getPhoneNumberHintIntent(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.google.android.gms.tasks.Task<android.app.PendingIntent> phoneNumberHintIntent = com.google.android.gms.auth.api.identity.Identity.getSignInClient(activity).getPhoneNumberHintIntent(com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest.builder().build());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(phoneNumberHintIntent, "");
        return phoneNumberHintIntent;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity.PhoneHintIdentityClient
    public final java.lang.String getPhoneNumberFromIntent(android.content.Context context, android.content.Intent data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String phoneNumberFromIntent = com.google.android.gms.auth.api.identity.Identity.getSignInClient(context).getPhoneNumberFromIntent(data);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(phoneNumberFromIntent, "");
        return phoneNumberFromIntent;
    }
}
