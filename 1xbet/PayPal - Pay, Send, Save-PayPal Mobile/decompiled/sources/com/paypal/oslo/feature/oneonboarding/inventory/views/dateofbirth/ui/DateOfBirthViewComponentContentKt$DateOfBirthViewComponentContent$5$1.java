package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class DateOfBirthViewComponentContentKt$DateOfBirthViewComponentContent$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.time.LocalDate, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(java.time.LocalDate localDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        ((com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel) this.receiver).setPickerSelectedDate(localDate);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.time.LocalDate localDate) {
        getHighSpeedVideoFpsRangesFor(localDate);
        return kotlin.Unit.INSTANCE;
    }

    DateOfBirthViewComponentContentKt$DateOfBirthViewComponentContent$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel.class, "setPickerSelectedDate", "setPickerSelectedDate(Ljava/time/LocalDate;)V", 0);
    }
}
