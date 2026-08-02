package io.github.sabpaisaandroid.activity;

import android.content.Intent;
import com.google.gson.Gson;
import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.models.EncryptModelResponse;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class a implements io.github.sabpaisaandroid.interfaces.a<EncryptModelResponse> {
    public final /* synthetic */ e a;
    public final /* synthetic */ WebViewActivityLite.b b;
    public final /* synthetic */ WebViewActivityLite.c c;

    public a(e eVar, WebViewActivityLite.b bVar, WebViewActivityLite.c cVar) {
        this.a = eVar;
        this.b = bVar;
        this.c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        if (r1.equals("CHALLAN_GENERATED") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r2.t(r0, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r1.equals("NOT COMPLETED") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (r1.equals("SUCCESS") == false) goto L29;
     */
    @Override // io.github.sabpaisaandroid.interfaces.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(EncryptModelResponse encryptModelResponse) {
        String replace$default;
        String replace$default2;
        EncryptModelResponse response = encryptModelResponse;
        Intrinsics.checkNotNullParameter(response, "response");
        String info = response.getValue();
        if (info != null) {
            String string = "Before decrypted response >>>>>>>>>>>>>>>>>>>>>>>>\n".concat(info);
            Intrinsics.checkNotNullParameter(string, "string");
            replace$default = StringsKt__StringsJVMKt.replace$default(info, "=", "\":\"", false, 4, (Object) null);
            replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "&", "\",\"", false, 4, (Object) null);
            String b = android.support.v4.media.b.b("{\"", replace$default2, "\"}");
            String string2 = "decrypted response >>>>>>>>>>>>>>>>>>>>>>>>\n" + b;
            Intrinsics.checkNotNullParameter(string2, "string");
            TransactionResponsesModel transactionResponsesModel = (TransactionResponsesModel) new Gson().fromJson(b, TransactionResponsesModel.class);
            new Intent().putExtra("TransactionResponsesModel", transactionResponsesModel);
            String status = transactionResponsesModel.getStatus();
            e eVar = this.a;
            WebViewActivityLite.c cVar = this.c;
            if (status != null) {
                int hashCode = status.hashCode();
                if (hashCode != -1757359925) {
                    if (hashCode != -1149187101) {
                        if (hashCode != -1032858370) {
                            if (hashCode == -349414183) {
                            }
                        }
                    }
                } else if (status.equals("INITIATED")) {
                    cVar.invoke(transactionResponsesModel);
                }
                Intrinsics.checkNotNullParameter(info, "info");
            }
            eVar.u(false, transactionResponsesModel, cVar);
            Intrinsics.checkNotNullParameter(info, "info");
        }
    }
}
