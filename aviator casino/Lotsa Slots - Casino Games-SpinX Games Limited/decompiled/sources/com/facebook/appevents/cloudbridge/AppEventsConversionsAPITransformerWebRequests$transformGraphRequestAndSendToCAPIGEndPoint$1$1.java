package com.facebook.appevents.cloudbridge;

/* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "responseCode", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
final class AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.util.List<java.util.Map<java.lang.String, java.lang.Object>> $processedEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> list) {
        super(2);
        this.$processedEvents = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.Integer num) {
        invoke2(str, num);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.String str, final java.lang.Integer num) {
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list = this.$processedEvents;
        com.facebook.internal.Utility.runOnNonUiThread(new java.lang.Runnable() { // from class: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1.m5116invoke$lambda0(num, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m5116invoke$lambda0(java.lang.Integer num, java.util.List processedEvents) {
        java.util.HashSet hashSet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
        hashSet = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.ACCEPTABLE_HTTP_RESPONSE;
        if (kotlin.collections.CollectionsKt.contains(hashSet, num)) {
            return;
        }
        com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.INSTANCE.handleError$facebook_core_release(num, processedEvents, 5);
    }
}
