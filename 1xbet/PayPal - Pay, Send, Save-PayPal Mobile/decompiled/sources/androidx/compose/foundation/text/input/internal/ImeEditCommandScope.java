package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "", "Landroidx/compose/ui/text/TextRange;", "range", "mapFromTransformed-GEjPoXI", "(J)J", "mapFromTransformed", "mapToTransformed-GEjPoXI", "mapToTransformed", "", "beginBatchEdit", "()Z", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "Lkotlin/ExtensionFunctionType;", "block", "edit", "(Lkotlin/jvm/functions/Function1;)V", "endBatchEdit", "", "getTransformedLength", "()I", "transformedLength"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ImeEditCommandScope {
    boolean beginBatchEdit();

    void edit(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.input.TextFieldBuffer, kotlin.Unit> block);

    boolean endBatchEdit();

    int getTransformedLength();

    /* renamed from: mapFromTransformed-GEjPoXI */
    long mo2206mapFromTransformedGEjPoXI(long range);

    /* renamed from: mapToTransformed-GEjPoXI */
    long mo2207mapToTransformedGEjPoXI(long range);
}
