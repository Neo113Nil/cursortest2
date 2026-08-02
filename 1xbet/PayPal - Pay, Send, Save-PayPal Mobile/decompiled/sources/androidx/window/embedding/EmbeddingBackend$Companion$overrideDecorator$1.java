package androidx.window.embedding;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class EmbeddingBackend$Companion$overrideDecorator$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.window.embedding.EmbeddingBackend, androidx.window.embedding.EmbeddingBackend> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final androidx.window.embedding.EmbeddingBackend invoke(androidx.window.embedding.EmbeddingBackend embeddingBackend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingBackend, "");
        return ((androidx.window.embedding.EmbeddingBackendDecorator) this.receiver).decorate(embeddingBackend);
    }

    EmbeddingBackend$Companion$overrideDecorator$1(java.lang.Object obj) {
        super(1, obj, androidx.window.embedding.EmbeddingBackendDecorator.class, "decorate", "decorate(Landroidx/window/embedding/EmbeddingBackend;)Landroidx/window/embedding/EmbeddingBackend;", 0);
    }
}
