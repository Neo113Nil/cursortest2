package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/izettle/android/net/Request$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/izettle/android/net/Request;", "request", "(Lkotlin/jvm/functions/Function1;)Lcom/izettle/android/net/Request;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RequestKt {
    public static final com.izettle.android.net.Request request(kotlin.jvm.functions.Function1<? super com.izettle.android.net.Request.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.izettle.android.net.Request.Builder builder = new com.izettle.android.net.Request.Builder();
        function1.invoke(builder);
        return builder.build();
    }
}
