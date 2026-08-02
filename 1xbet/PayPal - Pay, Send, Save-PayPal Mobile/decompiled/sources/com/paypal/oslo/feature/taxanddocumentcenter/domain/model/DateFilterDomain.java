package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/DateFilterDomain;", "", "", "p0", "<init>", "(Ljava/lang/String;IJ)V", "months", "J", "getMonths", "()J", "Companion", "PAST_MONTH", "PAST_3_MONTHS", "PAST_6_MONTHS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DateFilterDomain {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain.Companion INSTANCE;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain PAST_3_MONTHS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain PAST_6_MONTHS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain PAST_MONTH;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final long months;

    private DateFilterDomain(java.lang.String str, int i, long j) {
        this.months = j;
    }

    public final long getMonths() {
        return this.months;
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain dateFilterDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain("PAST_MONTH", 0, 1L);
        PAST_MONTH = dateFilterDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain dateFilterDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain("PAST_3_MONTHS", 1, 3L);
        PAST_3_MONTHS = dateFilterDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain dateFilterDomain3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain("PAST_6_MONTHS", 2, 6L);
        PAST_6_MONTHS = dateFilterDomain3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain[] dateFilterDomainArr = {dateFilterDomain, dateFilterDomain2, dateFilterDomain3};
        getHighResolutionOutputSizeshNQ4ISI = dateFilterDomainArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(dateFilterDomainArr);
        INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/DateFilterDomain$Companion;", "", "<init>", "()V", "", "index", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/DateFilterDomain;", "fromIndex", "(I)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/DateFilterDomain;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain fromIndex(int index) {
            kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain> entries = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain.getEntries();
            return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain) ((index < 0 || index >= entries.size()) ? com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain.PAST_MONTH : entries.get(index));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
