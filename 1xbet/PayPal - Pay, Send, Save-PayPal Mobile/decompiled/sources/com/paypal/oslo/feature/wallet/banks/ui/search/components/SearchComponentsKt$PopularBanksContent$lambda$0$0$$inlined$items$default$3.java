package com.paypal.oslo.feature.wallet.banks.ui.search.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchComponentsKt$PopularBanksContent$lambda$0$0$$inlined$items$default$3 implements kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, java.lang.Integer, androidx.compose.foundation.lazy.grid.GridItemSpan> {
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ androidx.compose.foundation.lazy.grid.GridItemSpan invoke(androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope lazyGridItemSpanScope, java.lang.Integer num) {
        return androidx.compose.foundation.lazy.grid.GridItemSpan.m1803boximpl(m20971invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m20971invoke_orMbw(androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return ((androidx.compose.foundation.lazy.grid.GridItemSpan) this.getHighSpeedVideoFpsRanges.invoke(lazyGridItemSpanScope, this.getHighSpeedVideoSizes.get(i))).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    public SearchComponentsKt$PopularBanksContent$lambda$0$0$$inlined$items$default$3(kotlin.jvm.functions.Function2 function2, java.util.List list) {
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighSpeedVideoSizes = list;
    }
}
