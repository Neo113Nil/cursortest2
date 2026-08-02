package androidx.compose.material3.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 implements androidx.compose.material3.internal.FloatProducer, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function0 getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.material3.internal.FloatProducer
    public final /* synthetic */ float invoke() {
        return ((java.lang.Number) this.getHighSpeedVideoFpsRangesFor.invoke()).floatValue();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.material3.internal.FloatProducer) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(kotlin.jvm.functions.Function0 function0) {
        this.getHighSpeedVideoFpsRangesFor = function0;
    }
}
