package io.ktor.http.content;

/* compiled from: Multipart.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MultipartKt$sam$kotlinx_coroutines_flow_FlowCollector$0 implements kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function2<P1, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function;

    /* JADX WARN: Multi-variable type inference failed */
    MultipartKt$sam$kotlinx_coroutines_flow_FlowCollector$0(kotlin.jvm.functions.Function2<? super P1, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return this.function.invoke(obj, continuation);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof kotlinx.coroutines.flow.FlowCollector) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
