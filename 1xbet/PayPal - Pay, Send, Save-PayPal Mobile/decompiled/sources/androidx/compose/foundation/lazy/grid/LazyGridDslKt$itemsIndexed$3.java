package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$3 implements kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, java.lang.Integer, androidx.compose.foundation.lazy.grid.GridItemSpan> {
    final /* synthetic */ java.util.List<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, java.lang.Integer, T, androidx.compose.foundation.lazy.grid.GridItemSpan> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ androidx.compose.foundation.lazy.grid.GridItemSpan invoke(androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope lazyGridItemSpanScope, java.lang.Integer num) {
        return androidx.compose.foundation.lazy.grid.GridItemSpan.m1803boximpl(m1815invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m1815invoke_orMbw(androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(lazyGridItemSpanScope, java.lang.Integer.valueOf(i), this.getHighSpeedVideoFpsRanges.get(i)).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$3(kotlin.jvm.functions.Function3<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function3, java.util.List<? extends T> list) {
        this.getHighSpeedVideoFpsRangesFor = function3;
        this.getHighSpeedVideoFpsRanges = list;
    }
}
