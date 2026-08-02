package io.github.sabpaisaandroid.activity;

import android.os.Bundle;
import androidx.core.app.FrameMetricsAggregator;
import androidx.media3.common.C0338w;
import com.google.gson.Gson;
import io.github.sabpaisaandroid.SabPaisaGateway;
import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.models.CreditCardResponse;
import io.github.sabpaisaandroid.models.EncryptModel;
import io.github.sabpaisaandroid.models.EncryptModelResponse;
import io.github.sabpaisaandroid.models.SabPaisaFraudModel;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import io.github.sabpaisaandroid.network.SabPaisaEndPoints;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class j extends Lambda implements Function1<SabPaisaFraudModel, Unit> {
    public final /* synthetic */ WebViewActivityLite a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(WebViewActivityLite webViewActivityLite) {
        super(1);
        this.a = webViewActivityLite;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SabPaisaFraudModel sabPaisaFraudModel) {
        String joinToString$default;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object random;
        Integer status_code;
        SabPaisaFraudModel sabPaisaFraudModel2 = sabPaisaFraudModel;
        WebViewActivityLite webViewActivityLite = this.a;
        if (sabPaisaFraudModel2 == null || (status_code = sabPaisaFraudModel2.getStatus_code()) == null || status_code.intValue() != 400) {
            WebViewActivityLite.Companion companion = WebViewActivityLite.INSTANCE;
            io.github.sabpaisaandroid.network.c.e = null;
            io.github.sabpaisaandroid.network.c.f = null;
            Bundle itBundle = webViewActivityLite.getIntent().getExtras();
            if (itBundle != null) {
                webViewActivityLite.o = itBundle.getString("clientCode", "");
                int i = io.github.sabpaisaandroid.utils.a.a;
                String firstName = itBundle.getString("firstname", "");
                Intrinsics.checkNotNullExpressionValue(firstName, "getString(...)");
                String lastName = itBundle.getString("lastname", "");
                Intrinsics.checkNotNullExpressionValue(lastName, "getString(...)");
                String mobileNumber = itBundle.getString("mobile_number", "");
                Intrinsics.checkNotNullExpressionValue(mobileNumber, "getString(...)");
                String clientCode = webViewActivityLite.o;
                Intrinsics.checkNotNull(clientCode);
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                Intrinsics.checkNotNullParameter(lastName, "lastName");
                Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
                Intrinsics.checkNotNullParameter(clientCode, "clientCode");
                Intrinsics.checkNotNullParameter(itBundle, "itBundle");
                double d = itBundle.getDouble("amount", 0.0d);
                String str6 = "email_id";
                String string = itBundle.getString("email_id", "");
                String string2 = itBundle.getString("transUserName", "");
                String string3 = itBundle.getString("transUserPassword", "");
                HashMap hashMap = new HashMap();
                SabPaisaGateway.INSTANCE.getClass();
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList(10);
                int i2 = 0;
                for (int i3 = 10; i2 < i3; i3 = 10) {
                    String str7 = str6;
                    random = CollectionsKt___CollectionsKt.random(CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('a', 'z'), (Iterable) new CharRange('A', 'Z')), (Iterable) new CharRange('0', '9')), Random.INSTANCE);
                    Character ch = (Character) random;
                    ch.getClass();
                    arrayList.add(ch);
                    i2++;
                    str6 = str7;
                    string = string;
                }
                String str8 = str6;
                String str9 = string;
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
                sb.append(joinToString$default);
                sb.append((new Date().getTime() / 1000) % Integer.MAX_VALUE);
                String string4 = itBundle.getString("clienttransactionid", sb.toString());
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                hashMap.put("txn", string4);
                String string5 = itBundle.getString("callback_url");
                hashMap.put("firstname", firstName);
                hashMap.put("lastname", lastName);
                hashMap.put("mobile_number", mobileNumber);
                hashMap.put("amount", String.valueOf(d));
                Intrinsics.checkNotNull(str9);
                hashMap.put(str8, str9);
                Intrinsics.checkNotNull(string2);
                hashMap.put("transUserName", string2);
                Intrinsics.checkNotNull(string3);
                hashMap.put("transUserPassword", string3);
                String string6 = itBundle.getString("udf1", "");
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                hashMap.put("udf1", string6);
                String string7 = itBundle.getString("udf2", "");
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                hashMap.put("udf2", string7);
                String string8 = itBundle.getString("udf3", "");
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                hashMap.put("udf3", string8);
                String string9 = itBundle.getString("udf4", "");
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                hashMap.put("udf4", string9);
                String string10 = itBundle.getString("udf5", "");
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                hashMap.put("udf5", string10);
                String string11 = itBundle.getString("udf6", "");
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                hashMap.put("udf6", string11);
                String string12 = itBundle.getString("udf7", "");
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                hashMap.put("udf7", string12);
                String string13 = itBundle.getString("udf8", "");
                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                hashMap.put("udf8", string13);
                String string14 = itBundle.getString("udf9", "");
                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                hashMap.put("udf9", string14);
                String string15 = itBundle.getString("udf10", "");
                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                hashMap.put("udf10", string15);
                String string16 = itBundle.getString("udf11", "");
                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                hashMap.put("udf11", string16);
                String string17 = itBundle.getString("udf12", "");
                Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                hashMap.put("udf12", string17);
                String string18 = itBundle.getString("udf13", "");
                Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                hashMap.put("udf13", string18);
                String string19 = itBundle.getString("udf14", "");
                Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
                hashMap.put("udf14", string19);
                String string20 = itBundle.getString("udf15", "");
                Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
                hashMap.put("udf15", string20);
                String string21 = itBundle.getString("udf16", "");
                Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
                hashMap.put("udf16", string21);
                String string22 = itBundle.getString("udf17", "");
                Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                hashMap.put("udf17", string22);
                String string23 = itBundle.getString("udf18", "");
                Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
                hashMap.put("udf18", string23);
                String string24 = itBundle.getString("udf19", "");
                Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
                hashMap.put("udf19", string24);
                String string25 = itBundle.getString("udf20", "");
                Intrinsics.checkNotNullExpressionValue(string25, "getString(...)");
                hashMap.put("udf20", string25);
                String string26 = itBundle.getString("payerAddress", "");
                Intrinsics.checkNotNullExpressionValue(string26, "getString(...)");
                hashMap.put("payerAddress", string26);
                String string27 = itBundle.getString("amountType", "");
                Intrinsics.checkNotNullExpressionValue(string27, "getString(...)");
                hashMap.put("amountType", string27);
                String string28 = itBundle.getString("mcc", "");
                Intrinsics.checkNotNullExpressionValue(string28, "getString(...)");
                hashMap.put("mcc", string28);
                String string29 = itBundle.getString("transDate", "");
                Intrinsics.checkNotNullExpressionValue(string29, "getString(...)");
                hashMap.put("transDate", string29);
                String string30 = itBundle.getString("programId", "");
                Intrinsics.checkNotNullExpressionValue(string30, "getString(...)");
                hashMap.put("programId", string30);
                hashMap.put("sec_key", itBundle.getString("aes_api_key", "").toString());
                hashMap.put("sec_iv", itBundle.getString("aes_api_iv", "").toString());
                hashMap.put("clientCode", clientCode);
                str = SabPaisaGateway.initUrl;
                hashMap.put("sappaisa_url", str);
                str2 = SabPaisaGateway.endPointBaseUrl;
                Intrinsics.checkNotNullParameter(str2, "<set-?>");
                str3 = SabPaisaGateway.endPointBaseUrl;
                Intrinsics.checkNotNullParameter(str3, "<set-?>");
                str4 = SabPaisaGateway.txnEnquiryEndpoint;
                Intrinsics.checkNotNullParameter(str4, "<set-?>");
                io.github.sabpaisaandroid.network.c.i = str4;
                StringBuilder sb2 = new StringBuilder("payerName=");
                sb2.append(firstName);
                sb2.append(' ');
                sb2.append(lastName);
                sb2.append("&payerEmail=");
                androidx.collection.e.d(sb2, str9, "&payerMobile=", mobileNumber, "&clientTxnId=");
                sb2.append((String) hashMap.get("txn"));
                sb2.append("&amount=");
                sb2.append(d);
                androidx.collection.e.d(sb2, "&clientCode=", clientCode, "&transUserName=", string2);
                androidx.collection.e.d(sb2, "&transUserPassword=", string3, "&callbackUrl=", string5);
                sb2.append("&channelId=mobile");
                StringBuilder d2 = androidx.browser.browseractions.a.d(sb2.toString(), "&udf1=");
                d2.append((String) C0338w.b(d2, (String) C0338w.b(d2, (String) C0338w.b(d2, (String) C0338w.b(d2, (String) C0338w.b(d2, (String) C0338w.b(d2, (String) C0338w.b(d2, (String) C0338w.b(d2, (String) C0338w.b(d2, (String) hashMap.get("udf1"), "&udf2=", hashMap, "udf2"), "&udf3=", hashMap, "udf3"), "&udf4=", hashMap, "udf4"), "&udf5=", hashMap, "udf5"), "&udf6=", hashMap, "udf6"), "&udf7=", hashMap, "udf7"), "&udf8=", hashMap, "udf8"), "&udf9=", hashMap, "udf9"), "&udf10=", hashMap, "udf10"));
                StringBuilder d3 = androidx.browser.browseractions.a.d(d2.toString(), "&udf11=");
                d3.append((String) C0338w.b(d3, (String) C0338w.b(d3, (String) C0338w.b(d3, (String) C0338w.b(d3, (String) C0338w.b(d3, (String) C0338w.b(d3, (String) C0338w.b(d3, (String) C0338w.b(d3, (String) C0338w.b(d3, (String) hashMap.get("udf11"), "&udf12=", hashMap, "udf12"), "&udf13=", hashMap, "udf13"), "&udf14=", hashMap, "udf14"), "&udf15=", hashMap, "udf15"), "&udf16=", hashMap, "udf16"), "&udf17=", hashMap, "udf17"), "&udf18=", hashMap, "udf18"), "&udf19=", hashMap, "udf19"), "&udf20=", hashMap, "udf20"));
                StringBuilder d4 = androidx.browser.browseractions.a.d(d3.toString(), "&payerAddress=no address&amountType=");
                d4.append((String) C0338w.b(d4, (String) C0338w.b(d4, (String) C0338w.b(d4, (String) hashMap.get("amountType"), "&mcc=", hashMap, "mcc"), "&transDate=", hashMap, "transDate"), "&programId=", hashMap, "programId"));
                d4.append("&packageName=");
                str5 = SabPaisaGateway.packageName;
                d4.append(str5);
                String sb3 = d4.toString();
                String info = "before encrypt: " + sb3;
                Intrinsics.checkNotNullParameter(info, "info");
                hashMap.put("spURL", sb3);
                String info2 = "after encrypt: " + ((String) hashMap.get("encryptedData"));
                Intrinsics.checkNotNullParameter(info2, "info");
                Object obj = hashMap.get("sec_key");
                Intrinsics.checkNotNull(obj);
                String str10 = (String) obj;
                Object obj2 = hashMap.get("sec_iv");
                Intrinsics.checkNotNull(obj2);
                String str11 = (String) obj2;
                Object obj3 = hashMap.get("spURL");
                Intrinsics.checkNotNull(obj3);
                String str12 = (String) obj3;
                final l lVar = new l(hashMap, webViewActivityLite, itBundle);
                Retrofit a = io.github.sabpaisaandroid.network.c.a();
                SabPaisaEndPoints sabPaisaEndPoints = a != null ? (SabPaisaEndPoints) a.create(SabPaisaEndPoints.class) : null;
                final EncryptModel encryptModel = new EncryptModel(null, null, null, null, null, str10, str11, str12, 31, null);
                Call<EncryptModelResponse> b = sabPaisaEndPoints != null ? sabPaisaEndPoints.b(encryptModel) : null;
                String requestObject = new Gson().toJson(encryptModel);
                Intrinsics.checkNotNullExpressionValue(requestObject, "toJson(...)");
                Intrinsics.checkNotNullParameter(requestObject, "requestObject");
                if (b != null) {
                    b.enqueue(new Callback<EncryptModelResponse>() { // from class: io.github.sabpaisaandroid.activity.WebViewActivityLite$encryptNetworkCall$1
                        @Override // retrofit2.Callback
                        public final void onFailure(Call<EncryptModelResponse> requestUrl, Throwable th) {
                            Intrinsics.checkNotNullParameter(requestUrl, "call");
                            Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
                            if (th != null) {
                                th.getMessage();
                            }
                        }

                        @Override // retrofit2.Callback
                        public final void onResponse(Call<EncryptModelResponse> call, Response<EncryptModelResponse> response) {
                            Intrinsics.checkNotNullParameter(call, "call");
                            Intrinsics.checkNotNullParameter(response, "response");
                            EncryptModelResponse body = response.body();
                            if (body != null) {
                                lVar.a(body);
                            }
                            if (response.body() == null) {
                                String toJson = new Gson().toJson(EncryptModel.this);
                                Intrinsics.checkNotNullExpressionValue(toJson, "toJson(...)");
                                Intrinsics.checkNotNullParameter(response, "response");
                                Intrinsics.checkNotNullParameter(toJson, "toJson");
                                try {
                                    Gson gson = new Gson();
                                    ResponseBody errorBody = response.errorBody();
                                    String string31 = errorBody != null ? errorBody.string() : null;
                                    Intrinsics.checkNotNull(string31);
                                    Object fromJson = gson.fromJson(string31, (Class<Object>) CreditCardResponse.class);
                                    Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                                    ((CreditCardResponse) fromJson).getErrorMessage();
                                } catch (Exception unused) {
                                }
                            }
                        }
                    });
                }
            }
        } else {
            TransactionResponsesModel transactionResponsesModel = new TransactionResponsesModel(null, null, null, null, null, null, null, null, null, null, null, "CLIENT CODE BLOCKED", "1000", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6145, FrameMetricsAggregator.EVERY_DURATION, null);
            webViewActivityLite.u(true, transactionResponsesModel, new i(transactionResponsesModel, webViewActivityLite));
        }
        return Unit.INSTANCE;
    }
}
