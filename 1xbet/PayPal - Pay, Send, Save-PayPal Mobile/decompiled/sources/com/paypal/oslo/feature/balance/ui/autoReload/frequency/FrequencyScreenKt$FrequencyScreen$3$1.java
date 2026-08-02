package com.paypal.oslo.feature.balance.ui.autoReload.frequency;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class FrequencyScreenKt$FrequencyScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.time.DayOfWeek, java.lang.String> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final java.lang.String invoke(java.time.DayOfWeek dayOfWeek) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
        return ((com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel) this.receiver).getNarrowFormattedDayOfWeek(dayOfWeek);
    }

    FrequencyScreenKt$FrequencyScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel.class, "getNarrowFormattedDayOfWeek", "getNarrowFormattedDayOfWeek(Ljava/time/DayOfWeek;)Ljava/lang/String;", 0);
    }
}
