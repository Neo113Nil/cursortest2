package com.android.billingclient.api;

import a0.C0087a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import m0.C1120h;
import m0.M;

/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f2529a;

    /* renamed from: b, reason: collision with root package name */
    public ResultReceiver f2530b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2531c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2532d;

    /* renamed from: e, reason: collision with root package name */
    public int f2533e;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i3, int i4, Intent intent) {
        ResultReceiver resultReceiver;
        Intent a3;
        int i5;
        ResultReceiver resultReceiver2;
        super.onActivityResult(i3, i4, intent);
        if (i3 == 100 || i3 == 110) {
            int i6 = AbstractC0213o0.d(intent, "ProxyBillingActivity").f10046a;
            if (i4 == -1) {
                if (i6 != 0) {
                    i4 = -1;
                } else {
                    i6 = 0;
                    resultReceiver = this.f2529a;
                    if (resultReceiver == null) {
                        resultReceiver.send(i6, intent != null ? intent.getExtras() : null);
                    } else {
                        if (intent == null) {
                            a3 = a();
                        } else if (intent.getExtras() != null) {
                            String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                            if (string != null) {
                                a3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                                a3.setPackage(getApplicationContext().getPackageName());
                                a3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                                a3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            } else {
                                Intent a4 = a();
                                a4.putExtras(intent.getExtras());
                                a4.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                a3 = a4;
                            }
                        } else {
                            a3 = a();
                            AbstractC0213o0.g("ProxyBillingActivity", "Got null bundle!");
                            a3.putExtra("RESPONSE_CODE", 6);
                            a3.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            C0087a a5 = C1120h.a();
                            a5.f1781b = 6;
                            a5.f1780a = "An internal error occurred.";
                            a3.putExtra("FAILURE_LOGGING_PAYLOAD", M.b(22, 2, a5.a()).b());
                            a3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        }
                        if (i3 == 110) {
                            a3.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        sendBroadcast(a3);
                    }
                }
            }
            AbstractC0213o0.g("ProxyBillingActivity", "Activity finished with resultCode " + i4 + " and billing's responseCode: " + i6);
            resultReceiver = this.f2529a;
            if (resultReceiver == null) {
            }
        } else if (i3 == 101) {
            if (intent == null) {
                AbstractC0213o0.g("ProxyBillingActivity", "Got null intent!");
            } else {
                int i7 = AbstractC0213o0.f2786a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    AbstractC0213o0.g("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i5 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    resultReceiver2 = this.f2530b;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(i5, intent != null ? intent.getExtras() : null);
                    }
                }
            }
            i5 = 0;
            resultReceiver2 = this.f2530b;
            if (resultReceiver2 != null) {
            }
        } else {
            AbstractC0213o0.g("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i3 + "; skipping...");
        }
        this.f2531c = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC0213o0.f("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f2531c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f2529a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f2530b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f2532d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f2533e = bundle.getInt("activity_code", 100);
            return;
        }
        AbstractC0213o0.f("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f2533e = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f2532d = true;
                this.f2533e = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f2529a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f2530b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f2533e = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f2531c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f2533e, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e3) {
            AbstractC0213o0.h("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e3);
            ResultReceiver resultReceiver = this.f2529a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f2530b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent a3 = a();
                    if (this.f2532d) {
                        a3.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    a3.putExtra("RESPONSE_CODE", 6);
                    a3.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(a3);
                }
            }
            this.f2531c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f2531c) {
            Intent a3 = a();
            a3.putExtra("RESPONSE_CODE", 1);
            a3.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i3 = this.f2533e;
            if (i3 == 110 || i3 == 100) {
                a3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(a3);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f2529a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2530b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f2531c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f2532d);
        bundle.putInt("activity_code", this.f2533e);
    }
}
