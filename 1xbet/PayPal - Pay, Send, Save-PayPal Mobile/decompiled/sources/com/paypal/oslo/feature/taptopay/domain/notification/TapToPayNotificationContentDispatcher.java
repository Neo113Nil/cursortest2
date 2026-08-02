package com.paypal.oslo.feature.taptopay.domain.notification;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001c\b\u0007\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/notification/TapToPayNotificationContentDispatcher;", "", "", "Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContentProvider;", "Lkotlin/jvm/JvmSuppressWildcards;", "providers", "<init>", "(Ljava/util/Set;)V", "Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContext;", "context", "Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationData;", "getContent", "(Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContext;)Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationData;", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TapToPayNotificationContentDispatcher {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public TapToPayNotificationContentDispatcher(java.util.Set<com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.sortedWith(set, new java.util.Comparator() { // from class: com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher$special$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider) t2).getPriority()), java.lang.Integer.valueOf(((com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider) t).getPriority()));
            }
        });
    }

    public final com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationData getContent(com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext context) {
        com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationData tapToPayNotificationData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.Iterator<T> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        do {
            tapToPayNotificationData = null;
            if (!it.hasNext()) {
                break;
            }
            com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider tapToPayNotificationContentProvider = (com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider) it.next();
            try {
                tapToPayNotificationData = tapToPayNotificationContentProvider.provideContent(context);
            } catch (java.lang.Exception e) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(tapToPayNotificationContentProvider.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "unknown";
                }
                com.paypal.android.logger.Logger.e$default(logger, "Notification content provider failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("providerName", simpleName)), null, e, 4, null);
            }
        } while (tapToPayNotificationData == null);
        return tapToPayNotificationData;
    }
}
