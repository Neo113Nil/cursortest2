package androidx.core.content;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroid/content/SharedPreferences;", "", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.QUERY_COMMIT, "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "", "Lkotlin/ExtensionFunctionType;", "action", "edit", "(Landroid/content/SharedPreferences;ZLkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SharedPreferencesKt {
    public static final void edit(android.content.SharedPreferences sharedPreferences, boolean z, kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> function1) {
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        function1.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(android.content.SharedPreferences sharedPreferences, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        function1.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
