package io.github.sabpaisaandroid.activity;

import android.content.Intent;
import com.google.gson.Gson;
import io.github.sabpaisaandroid.SabPaisaGateway;
import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.models.EncryptModelResponse;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class k implements io.github.sabpaisaandroid.interfaces.a<EncryptModelResponse> {
    public final /* synthetic */ WebViewActivityLite a;

    public k(WebViewActivityLite webViewActivityLite) {
        this.a = webViewActivityLite;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        r7 = kotlin.text.StringsKt__StringsJVMKt.replace$default(r7, "=", "\":\"", false, 4, (java.lang.Object) null);
     */
    @Override // io.github.sabpaisaandroid.interfaces.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(EncryptModelResponse encryptModelResponse) {
        String replace$default;
        boolean equals$default;
        boolean equals$default2;
        boolean equals$default3;
        boolean equals$default4;
        boolean equals$default5;
        String replace$default2;
        EncryptModelResponse response = encryptModelResponse;
        Intrinsics.checkNotNullParameter(response, "response");
        String value = response.getValue();
        WebViewActivityLite webViewActivityLite = this.a;
        if (value != null) {
            int i = io.github.sabpaisaandroid.utils.a.a;
            replace$default = StringsKt__StringsJVMKt.replace$default(value, "\"", "", false, 4, (Object) null);
            String replace$default3 = (replace$default == null || replace$default2 == null) ? null : StringsKt__StringsJVMKt.replace$default(replace$default2, "&", "\",\"", false, 4, (Object) null);
            String b = android.support.v4.media.b.b("{\"", replace$default3, "\"}");
            String string = "decrypted response >>>>>>>>>>>>>>>>>>>>>>>>\n" + b;
            Intrinsics.checkNotNullParameter(string, "string");
            TransactionResponsesModel transactionResponsesModel = (TransactionResponsesModel) new Gson().fromJson(b, TransactionResponsesModel.class);
            webViewActivityLite.l = transactionResponsesModel;
            equals$default = StringsKt__StringsJVMKt.equals$default(transactionResponsesModel != null ? transactionResponsesModel.getStatusCode() : null, "statusCode", false, 2, null);
            if (equals$default) {
                webViewActivityLite.v(SabPaisaGateway.SAB_PAISA_QRCODE_TIMEOUT_EXCEPTION);
                return;
            }
            TransactionResponsesModel transactionResponsesModel2 = webViewActivityLite.l;
            equals$default2 = StringsKt__StringsJVMKt.equals$default(transactionResponsesModel2 != null ? transactionResponsesModel2.getStatus() : null, "FAILED", false, 2, null);
            if (!equals$default2) {
                TransactionResponsesModel transactionResponsesModel3 = webViewActivityLite.l;
                equals$default3 = StringsKt__StringsJVMKt.equals$default(transactionResponsesModel3 != null ? transactionResponsesModel3.getStatus() : null, "ABORTED", false, 2, null);
                if (!equals$default3) {
                    TransactionResponsesModel transactionResponsesModel4 = webViewActivityLite.l;
                    equals$default4 = StringsKt__StringsJVMKt.equals$default(transactionResponsesModel4 != null ? transactionResponsesModel4.getStatus() : null, "SUCCESS", false, 2, null);
                    if (equals$default4) {
                        Intent intent = new Intent();
                        intent.putExtra("TransactionResponsesModel", webViewActivityLite.l);
                        webViewActivityLite.setResult(SabPaisaGateway.SAB_PAISA_SUCCESS_RESPONSE_CODE, intent);
                        webViewActivityLite.v(SabPaisaGateway.SAB_PAISA_SUCCESS_RESPONSE_CODE);
                        return;
                    }
                    TransactionResponsesModel transactionResponsesModel5 = webViewActivityLite.l;
                    equals$default5 = StringsKt__StringsJVMKt.equals$default(transactionResponsesModel5 != null ? transactionResponsesModel5.getStatus() : null, "CHALLAN_GENERATED", false, 2, null);
                    if (equals$default5) {
                        Intrinsics.checkNotNullParameter("Show Challan", "string");
                        return;
                    }
                }
            }
        }
        WebViewActivityLite.Companion companion = WebViewActivityLite.INSTANCE;
        webViewActivityLite.v(SabPaisaGateway.SAB_PAISA_QRCODE_TIMEOUT_EXCEPTION);
    }
}
