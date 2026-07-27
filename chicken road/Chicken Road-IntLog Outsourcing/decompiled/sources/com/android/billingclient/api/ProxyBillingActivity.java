package com.android.billingclient.api;

import G0.C0058h;
import G0.C0060j;
import G0.M;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;

/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f4932a;

    /* renamed from: b, reason: collision with root package name */
    public ResultReceiver f4933b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4934c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4935d;

    /* renamed from: e, reason: collision with root package name */
    public int f4936e;

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
    public final void onActivityResult(int i2, int i3, Intent intent) {
        ResultReceiver resultReceiver;
        Intent a6;
        int i6;
        ResultReceiver resultReceiver2;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 100 || i2 == 110) {
            int i7 = AbstractC0357o0.d(intent, "ProxyBillingActivity").f862a;
            if (i3 == -1) {
                if (i7 != 0) {
                    i3 = -1;
                } else {
                    i7 = 0;
                    resultReceiver = this.f4932a;
                    if (resultReceiver == null) {
                        resultReceiver.send(i7, intent != null ? intent.getExtras() : null);
                    } else {
                        if (intent == null) {
                            a6 = a();
                        } else if (intent.getExtras() != null) {
                            String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                            if (string != null) {
                                a6 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                                a6.setPackage(getApplicationContext().getPackageName());
                                a6.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                                a6.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            } else {
                                Intent a7 = a();
                                a7.putExtras(intent.getExtras());
                                a7.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                a6 = a7;
                            }
                        } else {
                            a6 = a();
                            AbstractC0357o0.g("ProxyBillingActivity", "Got null bundle!");
                            a6.putExtra("RESPONSE_CODE", 6);
                            a6.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            C0058h b6 = C0060j.b();
                            b6.f854a = 6;
                            b6.f855b = "An internal error occurred.";
                            a6.putExtra("FAILURE_LOGGING_PAYLOAD", M.b(22, 2, b6.a()).b());
                            a6.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        }
                        if (i2 == 110) {
                            a6.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        sendBroadcast(a6);
                    }
                }
            }
            AbstractC0357o0.g("ProxyBillingActivity", "Activity finished with resultCode " + i3 + " and billing's responseCode: " + i7);
            resultReceiver = this.f4932a;
            if (resultReceiver == null) {
            }
        } else if (i2 == 101) {
            if (intent == null) {
                AbstractC0357o0.g("ProxyBillingActivity", "Got null intent!");
            } else {
                int i8 = AbstractC0357o0.f5220a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    AbstractC0357o0.g("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i6 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    resultReceiver2 = this.f4933b;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(i6, intent != null ? intent.getExtras() : null);
                    }
                }
            }
            i6 = 0;
            resultReceiver2 = this.f4933b;
            if (resultReceiver2 != null) {
            }
        } else {
            AbstractC0357o0.g("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i2 + "; skipping...");
        }
        this.f4934c = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC0357o0.f("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f4934c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f4932a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f4933b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f4935d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f4936e = bundle.getInt("activity_code", 100);
            return;
        }
        AbstractC0357o0.f("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f4936e = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f4935d = true;
                this.f4936e = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f4932a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f4933b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f4936e = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f4934c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f4936e, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e3) {
            AbstractC0357o0.h("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e3);
            ResultReceiver resultReceiver = this.f4932a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f4933b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent a6 = a();
                    if (this.f4935d) {
                        a6.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    a6.putExtra("RESPONSE_CODE", 6);
                    a6.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(a6);
                }
            }
            this.f4934c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f4934c) {
            Intent a6 = a();
            a6.putExtra("RESPONSE_CODE", 1);
            a6.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i2 = this.f4936e;
            if (i2 == 110 || i2 == 100) {
                a6.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(a6);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f4932a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f4933b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f4934c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f4935d);
        bundle.putInt("activity_code", this.f4936e);
    }
}
