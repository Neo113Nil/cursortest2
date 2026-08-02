package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$3 implements kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, java.lang.Integer, androidx.compose.foundation.lazy.grid.GridItemSpan> {
    final /* synthetic */ java.util.List<T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, T, androidx.compose.foundation.lazy.grid.GridItemSpan> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ androidx.compose.foundation.lazy.grid.GridItemSpan invoke(androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope lazyGridItemSpanScope, java.lang.Integer num) {
        return androidx.compose.foundation.lazy.grid.GridItemSpan.m1803boximpl(m1813invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m1813invoke_orMbw(androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return this.getHighSpeedVideoSizes.invoke(lazyGridItemSpanScope, this.getHighResolutionOutputSizeshNQ4ISI.get(i)).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$3(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function2, java.util.List<? extends T> list) {
        this.getHighSpeedVideoSizes = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
