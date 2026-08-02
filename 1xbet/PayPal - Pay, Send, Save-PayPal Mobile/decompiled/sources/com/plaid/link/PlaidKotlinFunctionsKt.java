package com.plaid.link;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "", "Lkotlin/ExtensionFunctionType;", "initializer", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "linkTokenConfiguration", "(Lkotlin/jvm/functions/Function1;)Lcom/plaid/link/configuration/LinkTokenConfiguration;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PlaidKotlinFunctionsKt {
    public static final /* synthetic */ com.plaid.link.configuration.LinkTokenConfiguration linkTokenConfiguration(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.plaid.link.configuration.LinkTokenConfiguration.Builder builder = new com.plaid.link.configuration.LinkTokenConfiguration.Builder();
        function1.invoke(builder);
        return builder.build();
    }
}
