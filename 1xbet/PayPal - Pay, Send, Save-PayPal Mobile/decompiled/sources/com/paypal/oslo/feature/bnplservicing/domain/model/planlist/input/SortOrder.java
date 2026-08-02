package com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortOrder;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ASC", "DESC", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SortOrder {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder ASC;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder DESC;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SortOrder(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder sortOrder = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder("ASC", 0);
        ASC = sortOrder;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder sortOrder2 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder("DESC", 1);
        DESC = sortOrder2;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder sortOrder3 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder("UNKNOWN", 2);
        UNKNOWN = sortOrder3;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder[] sortOrderArr = {sortOrder, sortOrder2, sortOrder3};
        Camera2StreamConfigurationMap = sortOrderArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(sortOrderArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortOrder$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortOrder;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortOrder;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder sortOrder = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder) obj;
            return sortOrder == null ? com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder.UNKNOWN : sortOrder;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
