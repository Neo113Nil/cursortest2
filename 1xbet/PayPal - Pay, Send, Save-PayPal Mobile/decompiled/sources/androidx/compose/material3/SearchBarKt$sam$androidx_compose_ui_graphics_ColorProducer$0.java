package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0 implements androidx.compose.ui.graphics.ColorProducer, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function0 getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.graphics.ColorProducer
    /* renamed from: invoke-0d7_KjU */
    public final /* synthetic */ long mo2598invoke0d7_KjU() {
        return ((androidx.compose.ui.graphics.Color) this.getHighSpeedVideoFpsRangesFor.invoke()).m6006unboximpl();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.ui.graphics.ColorProducer) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(kotlin.jvm.functions.Function0 function0) {
        this.getHighSpeedVideoFpsRangesFor = function0;
    }
}
