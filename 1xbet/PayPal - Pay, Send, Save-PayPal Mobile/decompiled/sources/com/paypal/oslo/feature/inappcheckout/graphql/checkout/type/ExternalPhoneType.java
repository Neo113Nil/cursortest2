package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "HOME", "WORK", "MOBILE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalPhoneType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType HOME;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType MOBILE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType UNKNOWN__;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType WORK;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalPhoneType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType externalPhoneType = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType("HOME", 0, "HOME");
        HOME = externalPhoneType;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType externalPhoneType2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType("WORK", 1, "WORK");
        WORK = externalPhoneType2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType externalPhoneType3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType("MOBILE", 2, "MOBILE");
        MOBILE = externalPhoneType3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType externalPhoneType4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = externalPhoneType4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType[] externalPhoneTypeArr = {externalPhoneType, externalPhoneType2, externalPhoneType3, externalPhoneType4};
        getHighSpeedVideoFpsRangesFor = externalPhoneTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(externalPhoneTypeArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalPhoneType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"HOME", "WORK", "MOBILE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneType;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType.HOME, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType.WORK, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType.MOBILE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType externalPhoneType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType) obj;
            return externalPhoneType == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType.UNKNOWN__ : externalPhoneType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
