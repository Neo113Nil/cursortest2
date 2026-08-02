package com.zettle.sdk.feature.taptopay.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0001@BX\u0080.¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u001f\u0010\u000f\u001a\u00020\n*\u00020\t8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"", "TapToPayFeatureId", "Ljava/lang/String;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeatureDelegate;", "p0", "delegate", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeatureDelegate;", "getDelegate", "()Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeatureDelegate;", "Lcom/zettle/sdk/commons/thread/EventsLoop$Companion;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "TapToPay$delegate", "Lkotlin/Lazy;", "getTapToPay", "(Lcom/zettle/sdk/commons/thread/EventsLoop$Companion;)Lcom/zettle/sdk/commons/thread/EventsLoop;", "TapToPay"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayFeatureKt {
    private static final kotlin.Lazy TapToPay$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.thread.EventsLoop>() { // from class: com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureKt$TapToPay$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.commons.thread.EventsLoop invoke() {
            return com.zettle.sdk.commons.thread.EventsLoop.INSTANCE.create("TapToPay");
        }
    });
    public static final java.lang.String TapToPayFeatureId = "TapToPay";
    private static com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureDelegate delegate;

    public static final com.zettle.sdk.commons.thread.EventsLoop getTapToPay(com.zettle.sdk.commons.thread.EventsLoop.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return (com.zettle.sdk.commons.thread.EventsLoop) TapToPay$delegate.getValue();
    }

    public static final com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureDelegate getDelegate() {
        com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureDelegate tapToPayFeatureDelegate = delegate;
        if (tapToPayFeatureDelegate != null) {
            return tapToPayFeatureDelegate;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }
}
