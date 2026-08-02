package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroid/content/Context;", "", "phoneNumber", "", "launchDialer", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "Lkotlin/Function0;", "onFailure", "launchActivityIntent", "(Landroid/content/Context;Landroid/content/Intent;Lkotlin/jvm/functions/Function0;)V", "openAppStoreForUpdate", "(Landroid/content/Context;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ContextExtensionsKt {
    public static final void launchDialer(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setData(android.net.Uri.parse("tel:".concat(java.lang.String.valueOf(str))));
        launchActivityIntent$default(context, intent, null, 2, null);
    }

    public static /* synthetic */ void launchActivityIntent$default(android.content.Context context, android.content.Intent intent, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.utils.ContextExtensionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        launchActivityIntent(context, intent, function0);
    }

    public static final void launchActivityIntent(android.content.Context context, android.content.Intent intent, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        try {
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException unused) {
            function0.invoke();
        }
    }

    public static final void openAppStoreForUpdate(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        launchActivityIntent(context, new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("market://details?id=com.paypal.android.p2pmobile")), new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.utils.ContextExtensionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.utils.ContextExtensionsKt.$r8$lambda$nbKwLJISyFpmvoxNG4cIFoFk1L0(context);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nbKwLJISyFpmvoxNG4cIFoFk1L0(android.content.Context context) {
        launchActivityIntent$default(context, new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://play.google.com/store/apps/details?id=com.paypal.android.p2pmobile")), null, 2, null);
        return kotlin.Unit.INSTANCE;
    }
}
