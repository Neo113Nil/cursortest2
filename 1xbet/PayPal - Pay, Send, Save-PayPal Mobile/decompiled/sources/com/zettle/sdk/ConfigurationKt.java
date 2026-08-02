package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lcom/zettle/sdk/Configuration;", "", "Lkotlin/ExtensionFunctionType;", "init", "config", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Lcom/zettle/sdk/Configuration;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ConfigurationKt {
    public static final com.zettle.sdk.Configuration config(android.content.Context context, kotlin.jvm.functions.Function1<? super com.zettle.sdk.Configuration, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.zettle.sdk.Configuration configuration = new com.zettle.sdk.Configuration(context, com.zettle.sdk.ConfigurationSettingsKt.createConfigurationSettings());
        function1.invoke(configuration);
        return configuration;
    }
}
