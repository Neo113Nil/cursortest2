package io.github.sabpaisaandroid.activity;

import android.os.Bundle;
import android.webkit.WebView;
import com.google.gson.Gson;
import io.github.sabpaisaandroid.SabPaisaGateway;
import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.models.EncryptModelResponse;
import io.github.sabpaisaandroid.models.PaymentDetailsModel;
import java.net.URLEncoder;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class l implements io.github.sabpaisaandroid.interfaces.a<EncryptModelResponse> {
    public final /* synthetic */ HashMap<String, String> a;
    public final /* synthetic */ WebViewActivityLite b;
    public final /* synthetic */ Bundle c;

    public l(HashMap<String, String> hashMap, WebViewActivityLite webViewActivityLite, Bundle bundle) {
        this.a = hashMap;
        this.b = webViewActivityLite;
        this.c = bundle;
    }

    @Override // io.github.sabpaisaandroid.interfaces.a
    public final void a(EncryptModelResponse encryptModelResponse) {
        String str;
        String str2;
        EncryptModelResponse response = encryptModelResponse;
        Intrinsics.checkNotNullParameter(response, "response");
        String value = response.getValue();
        if (value != null) {
            HashMap<String, String> hashMap = this.a;
            hashMap.put("encryptedData", value);
            this.c.getString("client_txn_id", "");
            WebViewActivityLite.Companion companion = WebViewActivityLite.INSTANCE;
            WebViewActivityLite webViewActivityLite = this.b;
            if (webViewActivityLite.e) {
                if (webViewActivityLite.a == null) {
                    Gson gson = new Gson();
                    StringBuilder sb = new StringBuilder("{'aes_api_key':'");
                    String str3 = hashMap.get("sec_key");
                    Intrinsics.checkNotNull(str3);
                    sb.append(str3);
                    sb.append("','aes_api_iv':'");
                    String str4 = hashMap.get("sec_iv");
                    Intrinsics.checkNotNull(str4);
                    sb.append(str4);
                    sb.append("', 'clientCode':'");
                    String str5 = hashMap.get("clientCode");
                    Intrinsics.checkNotNull(str5);
                    sb.append(str5);
                    sb.append("','clientTxnid':'");
                    String str6 = hashMap.get("txn");
                    Intrinsics.checkNotNull(str6);
                    sb.append(str6);
                    sb.append("'}");
                    webViewActivityLite.a = (PaymentDetailsModel) gson.fromJson(sb.toString(), PaymentDetailsModel.class);
                }
                String webViewPostData = String.valueOf(hashMap.get("encryptedData"));
                Intrinsics.checkNotNullParameter(webViewPostData, "webViewPostData");
                webViewActivityLite.getOnBackPressedDispatcher().addCallback(webViewActivityLite, webViewActivityLite.p);
                WebView webView = webViewActivityLite.j;
                if (webView != null) {
                    webView.setWebViewClient(new m(webViewActivityLite));
                }
                WebView webView2 = webViewActivityLite.j;
                if (webView2 != null) {
                    webView2.setWebChromeClient(new o(webViewActivityLite));
                }
                WebView webView3 = webViewActivityLite.j;
                if (webView3 != null) {
                    webView3.setVerticalScrollBarEnabled(true);
                }
                WebView webView4 = webViewActivityLite.j;
                if (webView4 != null) {
                    webView4.setHorizontalScrollBarEnabled(true);
                }
                String string = "URl: ".concat(webViewPostData);
                Intrinsics.checkNotNullParameter(string, "string");
                String str7 = "encData=" + URLEncoder.encode(webViewPostData, "UTF-8") + "&clientCode=" + URLEncoder.encode(webViewActivityLite.o, "UTF-8");
                String string2 = "URl: POSTDATA " + str7;
                Intrinsics.checkNotNullParameter(string2, "string");
                StringBuilder sb2 = new StringBuilder("URl: POSTDATA ");
                SabPaisaGateway.INSTANCE.getClass();
                str = SabPaisaGateway.initUrl;
                sb2.append(str);
                String string3 = sb2.toString();
                Intrinsics.checkNotNullParameter(string3, "string");
                WebView webView5 = webViewActivityLite.j;
                if (webView5 != null) {
                    str2 = SabPaisaGateway.initUrl;
                    byte[] bytes = str7.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    webView5.postUrl(str2, bytes);
                }
            }
        }
    }
}
