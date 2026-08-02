package com.payair.logic.implementation;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcom/payair/logic/implementation/AndroidPaymentService;", "Lcom/payair/logic/managers/PaymentServiceManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Intent;", "getChangeDefaultPaymentAppIntent", "()Landroid/content/Intent;", "", "isDefaultPaymentApp", "()Z", "Landroidx/activity/result/ActivityResultLauncher;", "activityResultLauncher", "startActivityToSetDefaultPaymentApp", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Landroid/app/Activity;", "activity", "", "setPreferredService", "(Landroid/app/Activity;)V", "removePreferredService"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidPaymentService implements com.payair.logic.managers.PaymentServiceManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4437a;
    public final kotlin.Lazy b;

    public AndroidPaymentService(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f4437a = context;
        this.b = kotlin.LazyKt.lazy(new com.payair.csdk.a(this));
    }

    @Override // com.payair.logic.managers.PaymentServiceManager
    public final android.content.Intent getChangeDefaultPaymentAppIntent() {
        if (android.os.Build.VERSION.SDK_INT < 35) {
            android.content.Intent intent = new android.content.Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
            intent.putExtra("category", "payment");
            intent.putExtra(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, (android.content.ComponentName) this.b.getValue());
            return intent;
        }
        java.lang.Object systemService = this.f4437a.getSystemService("role");
        android.app.role.RoleManager roleManager = systemService instanceof android.app.role.RoleManager ? (android.app.role.RoleManager) systemService : null;
        if (roleManager != null) {
            if (roleManager.isRoleAvailable("android.app.role.WALLET")) {
                com.paypal.android.logger.Logger.i$default(com.payair.logging.LoggerKt.getLog(), "Role Wallet is available", null, null, 6, null);
                return roleManager.createRequestRoleIntent("android.app.role.WALLET");
            }
            com.paypal.android.logger.Logger.i$default(com.payair.logging.LoggerKt.getLog(), "Role Wallet is not available", null, null, 6, null);
        }
        return null;
    }

    @Override // com.payair.logic.managers.PaymentServiceManager
    public final boolean isDefaultPaymentApp() {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.f4437a);
        if (defaultAdapter == null) {
            return false;
        }
        try {
            return android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter).isDefaultServiceForCategory((android.content.ComponentName) this.b.getValue(), "payment");
        } catch (java.lang.Exception e) {
            com.payair.logging.LoggerKt.getLog().e("Error in checking default payment app", e);
            return false;
        }
    }

    @Override // com.payair.logic.managers.PaymentServiceManager
    public final void removePreferredService(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.f4437a);
        if (defaultAdapter != null) {
            android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter).unsetPreferredService(activity);
        }
    }

    @Override // com.payair.logic.managers.PaymentServiceManager
    public final void setPreferredService(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.f4437a);
        if (defaultAdapter != null) {
            android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter).setPreferredService(activity, (android.content.ComponentName) this.b.getValue());
        }
    }

    @Override // com.payair.logic.managers.PaymentServiceManager
    public final boolean startActivityToSetDefaultPaymentApp(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        if (android.nfc.NfcAdapter.getDefaultAdapter(this.f4437a) == null) {
            return false;
        }
        android.content.Intent changeDefaultPaymentAppIntent = getChangeDefaultPaymentAppIntent();
        if (changeDefaultPaymentAppIntent != null) {
            activityResultLauncher.launch(changeDefaultPaymentAppIntent);
            bool = java.lang.Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
