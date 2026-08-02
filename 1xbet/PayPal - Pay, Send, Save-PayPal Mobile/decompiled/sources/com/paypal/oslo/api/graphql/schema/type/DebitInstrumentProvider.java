package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvider;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PAYPAL", "GIPHY", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, "ISSUER", "BIN", "PAN", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentProvider {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider BIN;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider GIPHY;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider ISSUER;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider NETWORK;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider PAN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider PAYPAL;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentProvider(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider debitInstrumentProvider = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider("PAYPAL", 0, "PAYPAL");
        PAYPAL = debitInstrumentProvider;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider debitInstrumentProvider2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider("GIPHY", 1, "GIPHY");
        GIPHY = debitInstrumentProvider2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider debitInstrumentProvider3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, 2, com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE);
        NETWORK = debitInstrumentProvider3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider debitInstrumentProvider4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider("ISSUER", 3, "ISSUER");
        ISSUER = debitInstrumentProvider4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider debitInstrumentProvider5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider("BIN", 4, "BIN");
        BIN = debitInstrumentProvider5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider debitInstrumentProvider6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider("PAN", 5, "PAN");
        PAN = debitInstrumentProvider6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider debitInstrumentProvider7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider("UNKNOWN", 6, "UNKNOWN");
        UNKNOWN = debitInstrumentProvider7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider debitInstrumentProvider8 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentProvider8;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider[] debitInstrumentProviderArr = {debitInstrumentProvider, debitInstrumentProvider2, debitInstrumentProvider3, debitInstrumentProvider4, debitInstrumentProvider5, debitInstrumentProvider6, debitInstrumentProvider7, debitInstrumentProvider8};
        getHighSpeedVideoFpsRanges = debitInstrumentProviderArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentProviderArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentProvider", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PAYPAL", "GIPHY", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, "ISSUER", "BIN", "PAN", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvider$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvider;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvider;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvider;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.PAYPAL, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.GIPHY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.NETWORK, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.ISSUER, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.BIN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.PAN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider debitInstrumentProvider = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider) obj;
            return debitInstrumentProvider == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.UNKNOWN__ : debitInstrumentProvider;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvider> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
