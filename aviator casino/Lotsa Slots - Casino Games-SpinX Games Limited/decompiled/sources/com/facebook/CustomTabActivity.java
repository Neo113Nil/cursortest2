package com.facebook;

/* compiled from: CustomTabActivity.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "()V", "closeReceiver", "Landroid/content/BroadcastReceiver;", "onActivityResult", "", "requestCode", "", com.ironsource.X3.f.f, "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabActivity extends android.app.Activity {
    private static final int CUSTOM_TAB_REDIRECT_REQUEST_CODE = 2;
    private android.content.BroadcastReceiver closeReceiver;
    public static final java.lang.String CUSTOM_TAB_REDIRECT_ACTION = kotlin.jvm.internal.Intrinsics.stringPlus("CustomTabActivity", ".action_customTabRedirect");
    public static final java.lang.String DESTROY_ACTION = kotlin.jvm.internal.Intrinsics.stringPlus("CustomTabActivity", ".action_destroy");

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.facebook.CustomTabMainActivity.class);
        intent.setAction(CUSTOM_TAB_REDIRECT_ACTION);
        intent.putExtra(com.facebook.CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 0) {
            android.content.Intent intent = new android.content.Intent(CUSTOM_TAB_REDIRECT_ACTION);
            intent.putExtra(com.facebook.CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
            com.facebook.CustomTabActivity customTabActivity = this;
            androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(customTabActivity).sendBroadcast(intent);
            android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.facebook.CustomTabActivity$onActivityResult$closeReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context, android.content.Intent intent2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent2, "intent");
                    com.facebook.CustomTabActivity.this.finish();
                }
            };
            androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(customTabActivity).registerReceiver(broadcastReceiver, new android.content.IntentFilter(DESTROY_ACTION));
            this.closeReceiver = broadcastReceiver;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        android.content.BroadcastReceiver broadcastReceiver = this.closeReceiver;
        if (broadcastReceiver != null) {
            androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
        }
        super.onDestroy();
    }
}
