package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/atomicfu/TraceFormatKt$TraceFormat$1;", "Lkotlinx/atomicfu/TraceFormat;", "", "index", "", "event", "", "format", "(ILjava/lang/Object;)Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class TraceFormatKt$TraceFormat$1 extends kotlinx.atomicfu.TraceFormat {
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Object, java.lang.String> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public TraceFormatKt$TraceFormat$1(kotlin.jvm.functions.Function2<? super java.lang.Integer, java.lang.Object, java.lang.String> function2) {
        this.getHighSpeedVideoFpsRangesFor = function2;
    }

    @Override // kotlinx.atomicfu.TraceFormat
    public final java.lang.String format(int index, java.lang.Object event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        return this.getHighSpeedVideoFpsRangesFor.invoke(java.lang.Integer.valueOf(index), event);
    }
}
