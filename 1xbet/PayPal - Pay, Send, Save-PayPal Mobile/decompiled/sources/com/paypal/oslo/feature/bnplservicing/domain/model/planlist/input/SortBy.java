package com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortBy;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CREATE_DATE", "NEXT_PAYMENT_DUE_DATE", "VCC_TOKEN_CREATE_TIME", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SortBy {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy CREATE_DATE;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy NEXT_PAYMENT_DUE_DATE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy UNKNOWN;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy VCC_TOKEN_CREATE_TIME;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private SortBy(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy sortBy = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy("CREATE_DATE", 0);
        CREATE_DATE = sortBy;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy sortBy2 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy("NEXT_PAYMENT_DUE_DATE", 1);
        NEXT_PAYMENT_DUE_DATE = sortBy2;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy sortBy3 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy("VCC_TOKEN_CREATE_TIME", 2);
        VCC_TOKEN_CREATE_TIME = sortBy3;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy sortBy4 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy("UNKNOWN", 3);
        UNKNOWN = sortBy4;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy[] sortByArr = {sortBy, sortBy2, sortBy3, sortBy4};
        Camera2StreamConfigurationMap = sortByArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(sortByArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortBy$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortBy;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortBy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy sortBy = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy) obj;
            return sortBy == null ? com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy.UNKNOWN : sortBy;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
