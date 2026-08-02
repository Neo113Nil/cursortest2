package arrow.core.raise;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes.dex */
public final class RaiseKt__RaiseAccumulateKt$accumulating$1$1$1 implements kotlin.jvm.functions.Function1 {
    final /* synthetic */ arrow.core.raise.Raise<arrow.core.NonEmptyList<? extends Error>> getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return invoke((arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Void invoke(Error error) {
        this.getHighResolutionOutputSizeshNQ4ISI.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(error))));
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise) {
        this.getHighResolutionOutputSizeshNQ4ISI = raise;
    }
}
