package com.paypal.oslo.feature.balance.ui.autoReload.frequency;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class FrequencyScreenKt$FrequencyScreen$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> {
    public final java.lang.Boolean getHighSpeedVideoSizes(long j) {
        return java.lang.Boolean.valueOf(((com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel) this.receiver).isDateSelectable(j));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Long l) {
        return getHighSpeedVideoSizes(l.longValue());
    }

    FrequencyScreenKt$FrequencyScreen$4$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel.class, "isDateSelectable", "isDateSelectable(J)Z", 0);
    }
}
