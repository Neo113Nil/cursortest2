package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\bf\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004"}, d2 = {"Lcom/zettle/android/entities/Access;", "", "", "getAccountSettings", "()Ljava/lang/String;", "accountSettings", "getApiMerchantDbaData", "apiMerchantDbaData", "getApiOrganization", "apiOrganization", "getCashRegister", "cashRegister", "getEMoney", "eMoney", "getExtendedReportInsights", "extendedReportInsights", "getInvoice", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "getLibrary", com.google.android.libraries.places.api.model.PlaceTypes.LIBRARY, "Companion", "Scope"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Access {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.android.entities.Access.Companion INSTANCE = com.zettle.android.entities.Access.Companion.$$INSTANCE;

    java.lang.String getAccountSettings();

    java.lang.String getApiMerchantDbaData();

    java.lang.String getApiOrganization();

    java.lang.String getCashRegister();

    java.lang.String getEMoney();

    java.lang.String getExtendedReportInsights();

    java.lang.String getInvoice();

    java.lang.String getLibrary();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/zettle/android/entities/Access$Scope;", "", "<init>", "(Ljava/lang/String;I)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "matches", "(Ljava/lang/String;)Z", "WRITE", "READ", "NONE"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Scope {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ com.zettle.android.entities.Access.Scope[] $VALUES;
        public static final com.zettle.android.entities.Access.Scope WRITE = new com.zettle.android.entities.Access.Scope("WRITE", 0);
        public static final com.zettle.android.entities.Access.Scope READ = new com.zettle.android.entities.Access.Scope("READ", 1);
        public static final com.zettle.android.entities.Access.Scope NONE = new com.zettle.android.entities.Access.Scope("NONE", 2);

        private Scope(java.lang.String str, int i) {
        }

        static {
            com.zettle.android.entities.Access.Scope[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public final boolean matches(java.lang.String value) {
            return value != null && value.equals(toString());
        }

        public static com.zettle.android.entities.Access.Scope[] values() {
            return (com.zettle.android.entities.Access.Scope[]) $VALUES.clone();
        }

        public static com.zettle.android.entities.Access.Scope valueOf(java.lang.String str) {
            return (com.zettle.android.entities.Access.Scope) java.lang.Enum.valueOf(com.zettle.android.entities.Access.Scope.class, str);
        }

        public static kotlin.enums.EnumEntries<com.zettle.android.entities.Access.Scope> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ com.zettle.android.entities.Access.Scope[] $values() {
            return new com.zettle.android.entities.Access.Scope[]{WRITE, READ, NONE};
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002H\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J`\u0010\u000e\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/android/entities/Access$Companion;", "Lkotlin/Function8;", "", "Lcom/zettle/android/entities/Access;", "<init>", "()V", "eMoney", "apiMerchantDbaData", "apiOrganization", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "cashRegister", com.google.android.libraries.places.api.model.PlaceTypes.LIBRARY, "accountSettings", "extendedReportInsights", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/android/entities/Access;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements kotlin.jvm.functions.Function8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.zettle.android.entities.Access> {
        static final /* synthetic */ com.zettle.android.entities.Access.Companion $$INSTANCE = new com.zettle.android.entities.Access.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function8
        public final com.zettle.android.entities.Access invoke(java.lang.String eMoney, java.lang.String apiMerchantDbaData, java.lang.String apiOrganization, java.lang.String invoice, java.lang.String cashRegister, java.lang.String library, java.lang.String accountSettings, java.lang.String extendedReportInsights) {
            return new com.zettle.android.entities.AccessImpl(eMoney, apiMerchantDbaData, apiOrganization, invoice, cashRegister, library, accountSettings, extendedReportInsights);
        }
    }
}
