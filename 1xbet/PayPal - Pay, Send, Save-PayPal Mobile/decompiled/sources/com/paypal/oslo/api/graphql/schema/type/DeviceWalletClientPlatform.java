package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletClientPlatform;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ANDROID", "IOS", "DESKTOP", "MOBILE_WEB", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceWalletClientPlatform {
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform ANDROID;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform DESKTOP;
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform IOS;
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform MOBILE_WEB;
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DeviceWalletClientPlatform(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform deviceWalletClientPlatform = new com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform("ANDROID", 0, "ANDROID");
        ANDROID = deviceWalletClientPlatform;
        com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform deviceWalletClientPlatform2 = new com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform("IOS", 1, "IOS");
        IOS = deviceWalletClientPlatform2;
        com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform deviceWalletClientPlatform3 = new com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform("DESKTOP", 2, "DESKTOP");
        DESKTOP = deviceWalletClientPlatform3;
        com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform deviceWalletClientPlatform4 = new com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform("MOBILE_WEB", 3, "MOBILE_WEB");
        MOBILE_WEB = deviceWalletClientPlatform4;
        com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform deviceWalletClientPlatform5 = new com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = deviceWalletClientPlatform5;
        com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform[] deviceWalletClientPlatformArr = {deviceWalletClientPlatform, deviceWalletClientPlatform2, deviceWalletClientPlatform3, deviceWalletClientPlatform4, deviceWalletClientPlatform5};
        getHighSpeedVideoFpsRangesFor = deviceWalletClientPlatformArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(deviceWalletClientPlatformArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DeviceWalletClientPlatform", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ANDROID", "IOS", "DESKTOP", "MOBILE_WEB"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletClientPlatform$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletClientPlatform;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletClientPlatform;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletClientPlatform;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform[]{com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform.ANDROID, com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform.IOS, com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform.DESKTOP, com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform.MOBILE_WEB});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform deviceWalletClientPlatform = (com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform) obj;
            return deviceWalletClientPlatform == null ? com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform.UNKNOWN__ : deviceWalletClientPlatform;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DeviceWalletClientPlatform> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
