package io.github.sabpaisaandroid.utils;

import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.models.PaymentDetailsModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nSabPaisaUtility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SabPaisaUtility.kt\nio/github/sabpaisaandroid/utils/SabPaisaUtility\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,171:1\n37#2,2:172\n37#2,2:174\n*S KotlinDebug\n*F\n+ 1 SabPaisaUtility.kt\nio/github/sabpaisaandroid/utils/SabPaisaUtility\n*L\n67#1:172,2\n69#1:174,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    public static final /* synthetic */ int a = 0;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("^4[0-9]{6,}$");
        arrayList.add("^5[1-5][0-9]{5,}$");
        arrayList.add("^3[47][0-9]{5,}$");
        arrayList.add("^3(?:0[0-5]|[68][0-9])[0-9]{4,}$");
        arrayList.add("^6(?:011|5[0-9]{2})[0-9]{3,}$");
        arrayList.add("^(?:2131|1800|35[0-9]{3})[0-9]{3,}$");
    }

    public static void a(String url, PaymentDetailsModel paymentDetailsModel, WebViewActivityLite.d invoke) {
        boolean contains$default;
        List split$default;
        List split$default2;
        boolean contains$default2;
        List split$default3;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        String aes_api_key = paymentDetailsModel != null ? paymentDetailsModel.getAes_api_key() : null;
        String aes_api_iv = paymentDetailsModel != null ? paymentDetailsModel.getAes_api_iv() : null;
        contains$default = StringsKt__StringsKt.contains$default(url, "encResponse=", false, 2, (Object) null);
        if (contains$default) {
            split$default = StringsKt__StringsKt.split$default(url, new String[]{"encResponse="}, false, 2, 2, (Object) null);
            split$default2 = StringsKt__StringsKt.split$default(((String[]) split$default.toArray(new String[0]))[1], new String[]{"&"}, false, 0, 6, (Object) null);
            String str = ((String[]) split$default2.toArray(new String[0]))[0];
            System.out.getClass();
            String replace = new Regex("%2B").replace(str, "+");
            contains$default2 = StringsKt__StringsKt.contains$default(replace, ":", false, 2, (Object) null);
            if (contains$default2) {
                split$default3 = StringsKt__StringsKt.split$default(replace, new String[]{":"}, false, 0, 6, (Object) null);
                replace = (String) split$default3.get(0);
            }
            String string = "URL_TODECRYPT " + url;
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNull(aes_api_key);
            Intrinsics.checkNotNull(aes_api_iv);
            invoke.invoke(replace, aes_api_key, aes_api_iv);
        }
    }
}
