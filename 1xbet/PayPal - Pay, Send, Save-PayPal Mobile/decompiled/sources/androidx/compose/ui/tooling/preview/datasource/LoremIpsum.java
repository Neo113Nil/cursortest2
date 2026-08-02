package androidx.compose.ui.tooling.preview.datasource;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "", "words", "<init>", "(I)V", "()V", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "values"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class LoremIpsum implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<java.lang.String> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    public LoremIpsum(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public LoremIpsum() {
        this(500);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public kotlin.sequences.Sequence<java.lang.String> getValues() {
        java.util.List list;
        int i = this.getHighSpeedVideoSizes;
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        list = androidx.compose.ui.tooling.preview.datasource.LoremIpsumKt.getHighResolutionOutputSizeshNQ4ISI;
        final int size = list.size();
        return kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new java.lang.String[]{kotlin.sequences.SequencesKt.joinToString$default(kotlin.sequences.SequencesKt.take(kotlin.sequences.SequencesKt.generateSequence(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.ui.tooling.preview.datasource.LoremIpsum.$r8$lambda$hKk_JmdKhroMKKw6KsKoy5ftZ14(kotlin.jvm.internal.Ref.IntRef.this, size);
            }
        }), i), " ", null, null, 0, null, null, 62, null)});
    }

    public static /* synthetic */ java.lang.String $r8$lambda$hKk_JmdKhroMKKw6KsKoy5ftZ14(kotlin.jvm.internal.Ref.IntRef intRef, int i) {
        java.util.List list;
        list = androidx.compose.ui.tooling.preview.datasource.LoremIpsumKt.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = intRef.element;
        intRef.element = i2 + 1;
        return (java.lang.String) list.get(i2 % i);
    }
}
