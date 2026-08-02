package com.paypal.oslo.feature.smartroute.utils;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/utils/SliderUtils;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/smartroute/utils/SourceState;", "sourceState", "Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn;", "processSliderChange", "(Lcom/paypal/oslo/feature/smartroute/utils/SourceState;)Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn;", "Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn$Success;", "result", "processMaxLimitSliders", "(Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn$Success;)Lcom/paypal/oslo/feature/smartroute/utils/SourceState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SliderUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.smartroute.utils.SliderUtils INSTANCE = new com.paypal.oslo.feature.smartroute.utils.SliderUtils();

    private SliderUtils() {
    }

    public final com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn processSliderChange(com.paypal.oslo.feature.smartroute.utils.SourceState sourceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceState, "");
        java.util.Iterator<T> it = sourceState.getListSliderTargets().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((com.paypal.oslo.feature.smartroute.utils.SliderTarget) it.next()).getValue();
        }
        if (i > sourceState.getMaxValue() || i < sourceState.getMinValue()) {
            return com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Error.INSTANCE;
        }
        return new com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Success(com.paypal.oslo.feature.smartroute.utils.SourceState.copy$default(sourceState, 0, 0, sourceState.getMaxValue() - i, null, 11, null));
    }

    public final com.paypal.oslo.feature.smartroute.utils.SourceState processMaxLimitSliders(com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Success result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        java.util.Iterator<T> it = result.getSourceState().getListSliderTargets().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((com.paypal.oslo.feature.smartroute.utils.SliderTarget) it.next()).getValue();
        }
        int maxValue = result.getSourceState().getMaxValue();
        com.paypal.oslo.feature.smartroute.utils.SourceState sourceState = result.getSourceState();
        java.util.List<com.paypal.oslo.feature.smartroute.utils.SliderTarget> listSliderTargets = result.getSourceState().getListSliderTargets();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSliderTargets, 10));
        for (com.paypal.oslo.feature.smartroute.utils.SliderTarget sliderTarget : listSliderTargets) {
            arrayList.add(com.paypal.oslo.feature.smartroute.utils.SliderTarget.copy$default(sliderTarget, 0, (maxValue - i) + sliderTarget.getValue(), null, 0.0f, 13, null));
        }
        return com.paypal.oslo.feature.smartroute.utils.SourceState.copy$default(sourceState, 0, 0, 0, arrayList, 7, null);
    }
}
