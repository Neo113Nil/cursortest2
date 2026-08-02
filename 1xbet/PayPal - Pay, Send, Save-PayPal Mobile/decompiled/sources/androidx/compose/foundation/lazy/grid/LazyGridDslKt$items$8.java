package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$8 implements kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, java.lang.Integer, androidx.compose.foundation.lazy.grid.GridItemSpan> {
    final /* synthetic */ T[] Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, T, androidx.compose.foundation.lazy.grid.GridItemSpan> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ androidx.compose.foundation.lazy.grid.GridItemSpan invoke(androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope lazyGridItemSpanScope, java.lang.Integer num) {
        return androidx.compose.foundation.lazy.grid.GridItemSpan.m1803boximpl(m1814invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m1814invoke_orMbw(androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return this.getHighSpeedVideoSizes.invoke(lazyGridItemSpanScope, this.Camera2StreamConfigurationMap[i]).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$8(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function2, T[] tArr) {
        this.getHighSpeedVideoSizes = function2;
        this.Camera2StreamConfigurationMap = tArr;
    }
}
