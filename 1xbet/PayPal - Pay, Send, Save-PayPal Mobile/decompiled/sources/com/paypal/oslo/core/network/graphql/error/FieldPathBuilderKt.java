package com.paypal.oslo.core.network.graphql.error;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/core/network/graphql/error/FieldPathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "", "fieldPath", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FieldPathBuilderKt {
    public static final java.lang.String fieldPath(kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.error.FieldPathBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.paypal.oslo.core.network.graphql.error.FieldPathBuilder fieldPathBuilder = new com.paypal.oslo.core.network.graphql.error.FieldPathBuilder();
        function1.invoke(fieldPathBuilder);
        return fieldPathBuilder.build$graphql_release();
    }
}
