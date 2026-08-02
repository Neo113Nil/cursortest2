package com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/calculator/AllTransactionsStatementCalculator;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/AllTransactionsConfig;", "config", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/config/AllTransactionsConfig;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Ljava/time/LocalDate;", "currentDate", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/StatementAvailabilityResult;", "calculateAvailableYears", "(Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/StatementAvailabilityResult;", "", "", "p0", "getHighSpeedVideoSizes", "(Ljava/util/List;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/time/LocalDate;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/AllTransactionsConfig;", "Lcom/paypal/oslo/core/userstore/UserStore;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllTransactionsStatementCalculator {
    private static final java.time.format.DateTimeFormatter Camera2StreamConfigurationMap;

    @java.lang.Deprecated
    public static final java.lang.String DOWNLOAD_ENDPOINT = "/v1/customer/transaction-statements";

    @java.lang.Deprecated
    public static final int FALLBACK_YEAR = 2020;

    @java.lang.Deprecated
    public static final int FIRST_DAY_OF_MONTH = 1;

    @java.lang.Deprecated
    public static final int FIRST_MONTH = 1;

    @java.lang.Deprecated
    public static final int YEAR_LENGTH = 4;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator.Companion Companion = new com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public AllTransactionsStatementCalculator(com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig allTransactionsConfig, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allTransactionsConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRangesFor = allTransactionsConfig;
        this.Camera2StreamConfigurationMap = userStore;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult calculateAvailableYears$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator allTransactionsStatementCalculator, java.time.LocalDate localDate, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            localDate = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        }
        return allTransactionsStatementCalculator.calculateAvailableYears(localDate);
    }

    private static java.lang.String getHighSpeedVideoSizes(java.util.List<java.lang.String> p0) {
        return "/v1/customer/transaction-statements?".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(p0, "&", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator.$r8$lambda$QlclgSLBoz5RPb0DCpcl3JujStI((java.lang.String) obj);
            }
        }, 30, null)));
    }

    private static java.time.LocalDate getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        try {
            java.lang.String substring = p0.substring(0, 4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            int parseInt = java.lang.Integer.parseInt(substring);
            java.lang.String substring2 = p0.substring(4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            java.time.LocalDate of = java.time.LocalDate.of(parseInt, java.lang.Integer.parseInt(substring2), 1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(of);
            return of;
        } catch (java.lang.Exception unused) {
            java.time.LocalDate of2 = java.time.LocalDate.of(FALLBACK_YEAR, 1, 1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(of2);
            return of2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/calculator/AllTransactionsStatementCalculator$Companion;", "", "<init>", "()V", "", "DOWNLOAD_ENDPOINT", "Ljava/lang/String;", "", "YEAR_LENGTH", com.visa.cbp.getEncExpo.warmup, "FIRST_DAY_OF_MONTH", "FIRST_MONTH", "FALLBACK_YEAR", "Ljava/time/format/DateTimeFormatter;", "Camera2StreamConfigurationMap", "Ljava/time/format/DateTimeFormatter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.time.format.DateTimeFormatter ofPattern = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofPattern, "");
        Camera2StreamConfigurationMap = ofPattern;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$QlclgSLBoz5RPb0DCpcl3JujStI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return "start_dates=".concat(java.lang.String.valueOf(str));
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult calculateAvailableYears(java.time.LocalDate currentDate) {
        java.util.Date accountCreatedTime;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentDate, "");
        com.paypal.oslo.core.userstore.model.UserState value = this.Camera2StreamConfigurationMap.getUserState().getValue();
        java.lang.Long valueOf = (!(value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) || (accountCreatedTime = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getAccountCreatedTime()) == null) ? null : java.lang.Long.valueOf(accountCreatedTime.getTime());
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            java.time.LocalDate minusMonths = currentDate.minusMonths(this.getHighSpeedVideoFpsRangesFor.getEnableDayOfMonth() > currentDate.getDayOfMonth() ? 2L : 1L);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(minusMonths, "");
            java.time.LocalDate highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor.getWireOnMonth());
            java.time.LocalDate minusMonths2 = minusMonths.minusMonths(this.getHighSpeedVideoFpsRangesFor.getRollingMonths());
            java.time.LocalDate localDate = java.time.Instant.ofEpochMilli(longValue).atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(minusMonths2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(localDate);
            java.time.LocalDate localDate2 = (java.time.LocalDate) kotlin.comparisons.ComparisonsKt.maxOf(highSpeedVideoFpsRangesFor, minusMonths2, localDate);
            if (localDate2.compareTo((java.time.chrono.ChronoLocalDate) currentDate) > 0 || localDate2.compareTo((java.time.chrono.ChronoLocalDate) minusMonths) > 0) {
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult.NoStatementsYet.INSTANCE;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            while (minusMonths.compareTo((java.time.chrono.ChronoLocalDate) localDate2) >= 0) {
                int year = minusMonths.getYear();
                java.lang.String displayName = minusMonths.getMonth().getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.getDefault());
                java.lang.String format = java.time.LocalDate.of(minusMonths.getYear(), minusMonths.getMonth(), 1).format(Camera2StreamConfigurationMap);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                kotlin.jvm.internal.Intrinsics.checkNotNull(displayName);
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem monthItem = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem(displayName, getHighSpeedVideoSizes(kotlin.collections.CollectionsKt.listOf(format)));
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(year);
                java.lang.Object obj = linkedHashMap.get(valueOf2);
                if (obj == null) {
                    obj = (java.util.List) new java.util.ArrayList();
                    linkedHashMap.put(valueOf2, obj);
                }
                ((java.util.List) obj).add(monthItem);
                minusMonths = minusMonths.minusMonths(1L);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(minusMonths, "");
            }
            java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(linkedHashMap.entrySet(), new java.util.Comparator() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator$generateYearAccordionItems$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Integer) ((java.util.Map.Entry) t2).getKey(), (java.lang.Integer) ((java.util.Map.Entry) t).getKey());
                }
            });
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
            int i = 0;
            for (java.lang.Object obj2 : sortedWith) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
                int intValue = ((java.lang.Number) entry.getKey()).intValue();
                java.util.List list = (java.util.List) entry.getValue();
                java.util.List list2 = list;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(kotlin.text.StringsKt.substringBefore$default(kotlin.text.StringsKt.substringAfter$default(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem) it.next()).getUrl(), "start_dates=", (java.lang.String) null, 2, (java.lang.Object) null), "&", (java.lang.String) null, 2, (java.lang.Object) null));
                }
                arrayList.add(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem(intValue, list, i == 0, getHighSpeedVideoSizes(arrayList2)));
                i++;
            }
            java.util.ArrayList arrayList3 = arrayList;
            if (arrayList3.isEmpty()) {
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult.NoStatementsYet.INSTANCE;
            }
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult.Success(arrayList3);
        }
        return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult.AccountCreationUnavailable.INSTANCE;
    }
}
