package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "Landroid/content/Context;", "context", "", "buildAutoSaveDetailsText", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Landroid/content/Context;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutoSaveDetailsFormatterKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r5.equals("BIWEEKLY") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        r2 = kotlin.collections.CollectionsKt.mutableListOf(r15.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_every_2_weeks));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r3 = com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion.getWeekdayName$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.INSTANCE, r3, (java.util.Locale) null, 2, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b2, code lost:
    
        if (r3.length() <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        r15 = r15.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_on_prefix, r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, "");
        r2.add(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r5.equals("BI_WEEKLY") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String buildAutoSaveDetailsText(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, android.content.Context context) {
        java.lang.String str;
        java.util.List listOf;
        str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings = goalSummaryDTO.getTransferSettings();
        if (transferSettings == null) {
            return "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.paypal.oslo.feature.savings.domain.model.MoneyData reloadAmount = transferSettings.getReloadAmount();
        if (reloadAmount != null) {
            arrayList.add(reloadAmount.getFormattedAmount());
        }
        java.lang.String recurrence = transferSettings.getRecurrence();
        java.lang.String nextReloadDate = transferSettings.getNextReloadDate();
        if (recurrence != null && nextReloadDate != null) {
            java.util.Date parseIsoDate = com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.INSTANCE.parseIsoDate(nextReloadDate);
            java.lang.String upperCase = recurrence.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            switch (upperCase.hashCode()) {
                case -1738378111:
                    if (upperCase.equals("WEEKLY")) {
                        listOf = kotlin.collections.CollectionsKt.mutableListOf(context.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_weekly));
                        if (parseIsoDate != null) {
                            java.lang.String weekdayName$default = com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion.getWeekdayName$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.INSTANCE, parseIsoDate, (java.util.Locale) null, 2, (java.lang.Object) null);
                            if (weekdayName$default.length() > 0) {
                                java.lang.String string = context.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_every_prefix, weekdayName$default);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                                listOf.add(string);
                                break;
                            }
                        }
                    }
                    listOf = kotlin.collections.CollectionsKt.listOf(recurrence);
                    break;
                case 313318265:
                    break;
                case 1954618349:
                    if (upperCase.equals("MONTHLY")) {
                        listOf = kotlin.collections.CollectionsKt.mutableListOf(context.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_every_month));
                        if (parseIsoDate != null) {
                            java.util.Calendar calendar = java.util.Calendar.getInstance();
                            calendar.setTime(parseIsoDate);
                            java.lang.String string2 = context.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_on_day_prefix, java.lang.String.valueOf(calendar.get(5)));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                            listOf.add(string2);
                            break;
                        }
                    }
                    listOf = kotlin.collections.CollectionsKt.listOf(recurrence);
                    break;
                case 1981213576:
                    break;
                default:
                    listOf = kotlin.collections.CollectionsKt.listOf(recurrence);
                    break;
            }
            arrayList.addAll(listOf);
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, " - ", null, null, 0, null, null, 62, null);
        java.lang.String financialInstrumentName = transferSettings.getFinancialInstrumentName();
        if (financialInstrumentName != null) {
            if (kotlin.text.StringsKt.equals(financialInstrumentName, com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, true)) {
                financialInstrumentName = "PayPal Balance";
            }
            java.lang.String lastFourChars = transferSettings.getLastFourChars();
            java.lang.String concat = lastFourChars != null ? "••••".concat(java.lang.String.valueOf(lastFourChars)) : null;
            java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{financialInstrumentName, concat != null ? concat : ""});
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listOf2) {
                if (((java.lang.String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            str = kotlin.collections.CollectionsKt.joinToString$default(arrayList2, " ", null, null, 0, null, null, 62, null);
        }
        java.util.List listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{joinToString$default, str});
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listOf3) {
            if (((java.lang.String) obj2).length() > 0) {
                arrayList3.add(obj2);
            }
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList3, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
    }
}
