package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lcom/payair/model/Response;", "getData", "(Lcom/payair/model/Response;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "mapData", "mapIfSuccess", "(Lcom/payair/model/Response;Lkotlin/jvm/functions/Function1;)Lcom/payair/model/Response;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ResponseKt {
    public static final <T> com.payair.model.Response mapIfSuccess(com.payair.model.Response response, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (!(response instanceof com.payair.model.Response.Success)) {
            return response;
        }
        try {
            return new com.payair.model.Response.Success(function1.invoke((java.lang.Object) ((com.payair.model.Response.Success) response).getData()));
        } catch (java.lang.ClassCastException unused) {
            return new com.payair.model.Response.Error(101, null, 2, null);
        }
    }

    public static final /* synthetic */ <T> T getData(com.payair.model.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        T t = null;
        com.payair.model.Response.Success success = response instanceof com.payair.model.Response.Success ? (com.payair.model.Response.Success) response : null;
        if (success != null) {
            t = (T) success.getData();
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        T t2 = t;
        return t;
    }
}
