package com.sabpaisa.sabpaisa_flutter;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.github.sabpaisaandroid.SabPaisaGateway;
import io.github.sabpaisaandroid.interfaces.IPaymentSuccessCallBack;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SabPaisaDelegate implements PluginRegistry.ActivityResultListener, IPaymentSuccessCallBack<TransactionResponsesModel> {
    private static final int CODE_PAYMENT_ERROR = 1;
    private static final int CODE_PAYMENT_SUCCESS = 0;
    private static final int INCOMPATIBLE_PLUGIN = 3;
    private static final int INVALID_OPTIONS = 1;
    private static final int NETWORK_ERROR = 0;
    private static final int PAYMENT_CANCELLED = 2;
    private static final int TLS_ERROR = 3;
    private static final int UNKNOWN_ERROR = 100;
    private final Activity activity;
    Gson gson = new Gson();
    private String packageName;
    private Map<String, Object> pendingReply;
    private MethodChannel.Result pendingResult;

    public SabPaisaDelegate(Activity activity) {
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

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i, int i2, Intent intent) {
        return true;
    }

    public void openCheckout(Map<String, Object> map, MethodChannel.Result result) {
        this.pendingResult = result;
        JSONObject jSONObject = new JSONObject(map);
        SabPaisaModel sabPaisaModel = (SabPaisaModel) new Gson().fromJson(jSONObject.toString(), SabPaisaModel.class);
        jSONObject.toString();
        SabPaisaGateway.INSTANCE.builder().setAmount(Double.valueOf(sabPaisaModel.getAmount()).doubleValue()).setFirstName(sabPaisaModel.getFirst_name()).setLastName(sabPaisaModel.getLast_name()).setMobileNumber(sabPaisaModel.getMobile_number()).setEmailId(sabPaisaModel.getEmail_id()).setClientCode(sabPaisaModel.getClient_code()).setAesApiIv(sabPaisaModel.getAes_iv()).setAesApiKey(sabPaisaModel.getAes_key()).setTransUserName(sabPaisaModel.getUser_name()).setTransUserPassword(sabPaisaModel.getPassword()).setClientTransactionId(sabPaisaModel.getTxn_id()).setCallbackUrl(sabPaisaModel.getCallback_url()).setEnv(sabPaisaModel.getEnv()).setUdf1(sabPaisaModel.getUdf1()).setUdf2(sabPaisaModel.getUdf2()).setUdf3(sabPaisaModel.getUdf3()).setUdf4(sabPaisaModel.getUdf4()).setUdf5(sabPaisaModel.getUdf5()).setUdf6(sabPaisaModel.getUdf6()).setUdf7(sabPaisaModel.getUdf7()).setUdf8(sabPaisaModel.getUdf8()).setUdf9(sabPaisaModel.getUdf9()).setUdf10(sabPaisaModel.getUdf10()).setUdf11(sabPaisaModel.getUdf11()).setUdf12(sabPaisaModel.getUdf12()).setUdf13(sabPaisaModel.getUdf13()).setUdf14(sabPaisaModel.getUdf14()).setUdf15(sabPaisaModel.getUdf15()).setUdf16(sabPaisaModel.getUdf16()).setUdf17(sabPaisaModel.getUdf17()).setUdf18(sabPaisaModel.getUdf18()).setUdf19(sabPaisaModel.getUdf19()).setUdf20(sabPaisaModel.getUdf20()).build().init(this.activity, this);
    }

    public void resync(MethodChannel.Result result) {
        result.success(this.pendingReply);
        this.pendingReply = null;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    @Override // io.github.sabpaisaandroid.interfaces.IPaymentSuccessCallBack
    public void onPaymentFail(@Nullable TransactionResponsesModel transactionResponsesModel) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", 1);
        hashMap.put("data", new Gson().toJson(transactionResponsesModel));
        sendReply(hashMap);
    }

    @Override // io.github.sabpaisaandroid.interfaces.IPaymentSuccessCallBack
    public void onPaymentSuccess(@Nullable TransactionResponsesModel transactionResponsesModel) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", 0);
        hashMap.put("data", new Gson().toJson(transactionResponsesModel));
        sendReply(hashMap);
    }
}
