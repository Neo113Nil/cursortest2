package io.ktor.client.call;

/* compiled from: HttpClientCall.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0004H\u0086H¢\u0006\u0004\b\u0002\u0010\u0005\u001a\"\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, d2 = {"T", "Lio/ktor/client/call/HttpClientCall;", "body", "(Lio/ktor/client/call/HttpClientCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "(Lio/ktor/client/statement/HttpResponse;Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpClientCallKt {
    public static final /* synthetic */ <T> java.lang.Object body(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super T> continuation) {
        io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object bodyNullable = call.bodyNullable(typeInfo, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return bodyNullable;
    }

    public static final <T> java.lang.Object body(io.ktor.client.statement.HttpResponse httpResponse, io.ktor.util.reflect.TypeInfo typeInfo, kotlin.coroutines.Continuation<? super T> continuation) {
        java.lang.Object bodyNullable = httpResponse.getCall().bodyNullable(typeInfo, continuation);
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return bodyNullable;
    }

    public static final /* synthetic */ <T> java.lang.Object body(io.ktor.client.call.HttpClientCall httpClientCall, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object bodyNullable = httpClientCall.bodyNullable(typeInfo, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return bodyNullable;
    }
}
