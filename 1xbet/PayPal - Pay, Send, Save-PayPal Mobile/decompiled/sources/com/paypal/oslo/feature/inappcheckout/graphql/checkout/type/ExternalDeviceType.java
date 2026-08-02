package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "COMPUTER", "MOBILE", "TABLET", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalDeviceType {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType COMPUTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType MOBILE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType TABLET;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType UNKNOWN;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalDeviceType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType("COMPUTER", 0, "COMPUTER");
        COMPUTER = externalDeviceType;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType("MOBILE", 1, "MOBILE");
        MOBILE = externalDeviceType2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType("TABLET", 2, "TABLET");
        TABLET = externalDeviceType3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType("UNKNOWN", 3, "UNKNOWN");
        UNKNOWN = externalDeviceType4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = externalDeviceType5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType[] externalDeviceTypeArr = {externalDeviceType, externalDeviceType2, externalDeviceType3, externalDeviceType4, externalDeviceType5};
        getHighSpeedVideoFpsRangesFor = externalDeviceTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(externalDeviceTypeArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalDeviceType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"COMPUTER", "MOBILE", "TABLET", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.COMPUTER, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.MOBILE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.TABLET, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType) obj;
            return externalDeviceType == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.UNKNOWN__ : externalDeviceType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
