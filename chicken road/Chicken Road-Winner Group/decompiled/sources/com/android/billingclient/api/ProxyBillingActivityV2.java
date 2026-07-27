package com.android.billingclient.api;

import A0.j;
import Y1.C0077a;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import c.k;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import e.C0285f;

/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends k {

    /* renamed from: s, reason: collision with root package name */
    public j f2534s;

    /* renamed from: t, reason: collision with root package name */
    public j f2535t;

    /* renamed from: u, reason: collision with root package name */
    public ResultReceiver f2536u;

    /* renamed from: v, reason: collision with root package name */
    public ResultReceiver f2537v;

    @Override // c.k, s.AbstractActivityC1181b, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2534s = h(new C0077a(9), new io.flutter.plugin.editing.k(this));
        this.f2535t = h(new C0077a(9), new b0.j(this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f2536u = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f2537v = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        AbstractC0213o0.f("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f2536u = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            j jVar = this.f2534s;
            kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            kotlin.jvm.internal.j.d(intentSender, "pendingIntent.intentSender");
            jVar.G(new C0285f(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f2537v = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            j jVar2 = this.f2535t;
            kotlin.jvm.internal.j.e(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            kotlin.jvm.internal.j.d(intentSender2, "pendingIntent.intentSender");
            jVar2.G(new C0285f(intentSender2, null, 0, 0));
        }
    }

    @Override // c.k, s.AbstractActivityC1181b, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f2536u;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2537v;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
