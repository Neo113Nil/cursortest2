package io.github.sabpaisaandroid.network;

import io.github.sabpaisaandroid.models.EncryptModel;
import io.github.sabpaisaandroid.models.EncryptModelResponse;
import io.github.sabpaisaandroid.models.PaymentStatusModel;
import io.github.sabpaisaandroid.models.PaymentStatusResponseModel;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0010H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\u0014\b\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001aH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010\u0007J\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010\u0007J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\u0007J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\"\u0010\u0007¨\u0006#"}, d2 = {"Lio/github/sabpaisaandroid/network/SabPaisaEndPoints;", "", "Lio/github/sabpaisaandroid/models/CreditCardRequest;", "creditCardRequest", "Lretrofit2/Call;", "Lio/github/sabpaisaandroid/models/CreditCardResponse;", "confirmCardTransaction", "(Lio/github/sabpaisaandroid/models/CreditCardRequest;)Lretrofit2/Call;", "confirmCashModeTransaction", "confirmNetBankingTransaction", "Lio/github/sabpaisaandroid/models/EncryptModel;", "encryptModel", "Lio/github/sabpaisaandroid/models/EncryptModelResponse;", "decrypt", "(Lio/github/sabpaisaandroid/models/EncryptModel;)Lretrofit2/Call;", "encrypt", "", "encData", "clientCode", "Lokhttp3/ResponseBody;", "getInitiateTransactionPost", "(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "Lio/github/sabpaisaandroid/models/PaymentStatusModel;", "Lio/github/sabpaisaandroid/models/PaymentStatusResponseModel;", "getPaymentRequest", "(Lio/github/sabpaisaandroid/models/PaymentStatusModel;)Lretrofit2/Call;", "", "queryMap", "Lio/github/sabpaisaandroid/models/PaymentDetailsModel;", "getPaymodeDetails", "(Ljava/util/Map;)Lretrofit2/Call;", "upiGooglePayRequest", "upiIntentPayRequest", "upiRequest", "walletRequest", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: io.github.sabpaisaandroid.network.f, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public interface SabPaisaEndPoints {
    @Headers({"Cache-control: no-cache"})
    @POST("/decrypt")
    Call<EncryptModelResponse> a(@Body EncryptModel encryptModel);

    @Headers({"Cache-control: no-cache"})
    @POST("/encrypt")
    Call<EncryptModelResponse> b(@Body EncryptModel encryptModel);

    @Headers({"Content-Type: application/json"})
    @POST("/SPTxtnEnquiry/getTxnStatusByClientxnId")
    Call<PaymentStatusResponseModel> c(@Body PaymentStatusModel paymentStatusModel);
}
