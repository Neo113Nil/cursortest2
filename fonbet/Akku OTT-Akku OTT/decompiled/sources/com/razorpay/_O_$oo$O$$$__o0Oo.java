package com.razorpay;

import android.app.Activity;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/razorpay/UpiTurboCheckout$Companion;", "", "()V", "initTurboSdk", "", "context", "Landroid/content/Context;", "customerMobile", "", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class _O_$oo$O$$$__o0Oo {
    private _O_$oo$O$$$__o0Oo() {
    }

    public final void initTurboSdk(Context context, String customerMobile) {
        boolean contains$default;
        Class<?> loadClass;
        Intrinsics.checkNotNullParameter(context, "context");
        HashMap<String, String> plugins = BaseUtils.getAllPluginsFromManifest(context);
        Intrinsics.checkNotNullExpressionValue(plugins, "plugins");
        for (Map.Entry<String, String> entry : plugins.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            contains$default = StringsKt__StringsKt.contains$default(key, "upi_turbo", false, 2, (Object) null);
            if (contains$default) {
                ClassLoader classLoader = RzpTurboExternalPlugin.class.getClassLoader();
                Object newInstance = (classLoader == null || (loadClass = classLoader.loadClass(entry.getValue())) == null) ? null : loadClass.newInstance();
                if (newInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.razorpay.RzpTurboExternalPlugin");
                }
                ((RzpTurboExternalPlugin) newInstance).preloadUpiAccountsCheckout((Activity) context, customerMobile, null);
            }
        }
    }

    public /* synthetic */ _O_$oo$O$$$__o0Oo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
