package com.paypal.oslo.feature.activity.ui.search.view.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent activitySearchEvent) {
        com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent activitySearchEvent2 = activitySearchEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchEvent2, "");
        ((com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel) this.receiver).processEvent$activity_prodRelease(activitySearchEvent2);
        return kotlin.Unit.INSTANCE;
    }

    ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel.class, "processEvent", "processEvent$activity_prodRelease(Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;)V", 0);
    }
}
