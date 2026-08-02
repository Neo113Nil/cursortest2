package com.paypal.oslo.feature.activity.ui.search.view.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchSuggestionComposeKt$SearchSuggestionCompose$lambda$0$1$0$$inlined$items$default$2 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1 Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.Camera2StreamConfigurationMap.invoke(this.getHighSpeedVideoFpsRanges.get(i));
    }

    public ActivitySearchSuggestionComposeKt$SearchSuggestionCompose$lambda$0$1$0$$inlined$items$default$2(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRanges = list;
    }
}
