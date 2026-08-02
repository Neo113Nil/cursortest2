package com.razorpay.razorpay_flutter;

import android.app.Activity;
import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.razorpay.C$0o__;
import com.razorpay.Checkout;
import com.razorpay.CheckoutActivity;
import com.razorpay.ExternalWalletListener;
import com.razorpay.PaymentData;
import com.razorpay.PaymentResultWithDataListener;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class RazorpayDelegate implements PluginRegistry.ActivityResultListener, ExternalWalletListener, PaymentResultWithDataListener {
    private static final int CODE_PAYMENT_ERROR = 1;
    private static final int CODE_PAYMENT_EXTERNAL_WALLET = 2;
    private static final int CODE_PAYMENT_SUCCESS = 0;
    private static final int INCOMPATIBLE_PLUGIN = 3;
    private static final int INVALID_OPTIONS = 1;
    private static final int NETWORK_ERROR = 0;
    private static final int PAYMENT_CANCELLED = 2;
    private static final int TLS_ERROR = 3;
    private static final int UNKNOWN_ERROR = 100;
    private final Activity activity;
    private String packageName;
    private Map<String, Object> pendingReply;
    private MethodChannel.Result pendingResult;

    public RazorpayDelegate(Activity activity) {
        this.activity = activity;
    }

    private void sendReply(Map<String, Object> map) {
        MethodChannel.Result result = this.pendingResult;
        if (result == null) {
            this.pendingReply = map;
        } else {
            result.success(map);
            this.pendingReply = null;
        }
    }

    private static int translateRzpPaymentError(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 0;
        }
        if (i != 3) {
            return (i == 6 || i == 7) ? 3 : 100;
        }
        return 1;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i, int i2, Intent intent) {
        RazorpayDelegate razorpayDelegate;
        Intent intent2;
        try {
            razorpayDelegate = this;
            intent2 = intent;
            try {
                Checkout.class.getMethod("merchantActivityResult", Activity.class, Integer.class, Integer.class, Intent.class, PaymentResultWithDataListener.class, ExternalWalletListener.class).invoke(null, this.activity, Integer.valueOf(i), Integer.valueOf(i2), intent2, razorpayDelegate, this);
                return true;
            } catch (Exception unused) {
                Checkout.handleActivityResult(razorpayDelegate.activity, i, i2, intent2, razorpayDelegate, this);
                return true;
            }
        } catch (Exception unused2) {
            razorpayDelegate = this;
            intent2 = intent;
        }
    }

    @Override // com.razorpay.ExternalWalletListener
    public void onExternalWalletSelected(String str, PaymentData paymentData) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", 2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("external_wallet", str);
        hashMap.put("data", hashMap2);
        sendReply(hashMap);
    }

    @Override // com.razorpay.PaymentResultWithDataListener
    public void onPaymentError(int i, String str, PaymentData paymentData) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", Integer.valueOf(translateRzpPaymentError(i)));
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            hashMap2.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, jSONObject.getString("description"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            HashMap hashMap3 = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap3.put(next, jSONObject2.getString(next));
            }
            jSONObject.remove("metadata");
            HashMap hashMap4 = new HashMap();
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                hashMap4.put(next2, jSONObject.get(next2));
            }
            hashMap4.put("metadata", hashMap3);
            hashMap4.put("email", paymentData.getUserEmail());
            hashMap4.put("contact", paymentData.getUserContact());
            hashMap2.put("responseBody", hashMap4);
        } catch (JSONException unused) {
            hashMap2.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, str);
            hashMap2.put("responseBody", str);
        }
        hashMap.put("data", hashMap2);
        sendReply(hashMap);
    }

    @Override // com.razorpay.PaymentResultWithDataListener
    public void onPaymentSuccess(String str, PaymentData paymentData) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", 0);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("razorpay_payment_id", paymentData.getPaymentId());
        hashMap2.put("razorpay_order_id", paymentData.getOrderId());
        hashMap2.put("razorpay_signature", paymentData.getSignature());
        if (paymentData.getData().has("razorpay_subscription_id")) {
            try {
                hashMap2.put("razorpay_subscription_id", paymentData.getData().optString("razorpay_subscription_id"));
            } catch (Exception unused) {
            }
        }
        hashMap.put("data", hashMap2);
        sendReply(hashMap);
    }

    public void openCheckout(Map<String, Object> map, MethodChannel.Result result) {
        this.pendingResult = result;
        JSONObject jSONObject = new JSONObject(map);
        if (this.activity.getPackageName().equalsIgnoreCase(this.packageName)) {
            Intent intent = new Intent(this.activity, (Class<?>) CheckoutActivity.class);
            intent.putExtra(C$0o__.OPTIONS, jSONObject.toString());
            intent.putExtra(C$0o__.FRAMEWORK, "flutter");
            this.activity.startActivityForResult(intent, Checkout.RZP_REQUEST_CODE);
        }
    }

    public void resync(MethodChannel.Result result) {
        result.success(this.pendingReply);
        this.pendingReply = null;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}
