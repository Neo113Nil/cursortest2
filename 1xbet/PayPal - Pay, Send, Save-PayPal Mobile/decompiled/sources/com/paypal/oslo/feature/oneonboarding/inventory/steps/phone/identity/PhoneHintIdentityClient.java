package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/identity/PhoneHintIdentityClient;", "", "Landroid/app/Activity;", "activity", "Lcom/google/android/gms/tasks/Task;", "Landroid/app/PendingIntent;", "getPhoneNumberHintIntent", "(Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "getPhoneNumberFromIntent", "(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PhoneHintIdentityClient {
    java.lang.String getPhoneNumberFromIntent(android.content.Context context, android.content.Intent data) throws java.lang.Exception;

    com.google.android.gms.tasks.Task<android.app.PendingIntent> getPhoneNumberHintIntent(android.app.Activity activity);
}
