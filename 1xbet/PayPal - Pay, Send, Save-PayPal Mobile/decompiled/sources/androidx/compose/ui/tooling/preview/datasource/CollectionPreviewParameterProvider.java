package androidx.compose.ui.tooling.preview.datasource;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "T", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "collection", "<init>", "(Ljava/util/Collection;)V", "getHighSpeedVideoFpsRanges", "Ljava/util/Collection;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "values"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CollectionPreviewParameterProvider<T> implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<T> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Collection<T> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(java.util.Collection<? extends T> collection) {
        this.getHighResolutionOutputSizeshNQ4ISI = collection;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public kotlin.sequences.Sequence<T> getValues() {
        return kotlin.collections.CollectionsKt.asSequence(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
