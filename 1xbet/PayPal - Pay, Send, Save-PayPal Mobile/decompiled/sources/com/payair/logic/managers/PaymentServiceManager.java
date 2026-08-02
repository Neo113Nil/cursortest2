package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/payair/logic/managers/PaymentServiceManager;", "", "Landroid/content/Intent;", "getChangeDefaultPaymentAppIntent", "()Landroid/content/Intent;", "", "isDefaultPaymentApp", "()Z", "Landroid/app/Activity;", "activity", "", "removePreferredService", "(Landroid/app/Activity;)V", "setPreferredService", "Landroidx/activity/result/ActivityResultLauncher;", "activityResultLauncher", "startActivityToSetDefaultPaymentApp", "(Landroidx/activity/result/ActivityResultLauncher;)Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PaymentServiceManager {
    android.content.Intent getChangeDefaultPaymentAppIntent();

    boolean isDefaultPaymentApp();

    void removePreferredService(android.app.Activity activity);

    void setPreferredService(android.app.Activity activity);

    boolean startActivityToSetDefaultPaymentApp(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher);
}
