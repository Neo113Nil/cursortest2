package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeviceOS;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "IOS", "ANDROID", "WEB", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceOS {

    @kotlin.Deprecated(message = "Use DeviceOSPlatform.ANDROID instead.")
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceOS ANDROID;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceOS.Companion INSTANCE;

    @kotlin.Deprecated(message = "Use DeviceOSPlatform.IOS instead.")
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceOS IOS;
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceOS UNKNOWN__;

    @kotlin.Deprecated(message = "Use DeviceOSPlatform.WEB instead.")
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceOS WEB;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeviceOS[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DeviceOS(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DeviceOS deviceOS = new com.paypal.oslo.api.graphql.schema.type.DeviceOS("IOS", 0, "IOS");
        IOS = deviceOS;
        com.paypal.oslo.api.graphql.schema.type.DeviceOS deviceOS2 = new com.paypal.oslo.api.graphql.schema.type.DeviceOS("ANDROID", 1, "ANDROID");
        ANDROID = deviceOS2;
        com.paypal.oslo.api.graphql.schema.type.DeviceOS deviceOS3 = new com.paypal.oslo.api.graphql.schema.type.DeviceOS("WEB", 2, "WEB");
        WEB = deviceOS3;
        com.paypal.oslo.api.graphql.schema.type.DeviceOS deviceOS4 = new com.paypal.oslo.api.graphql.schema.type.DeviceOS("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = deviceOS4;
        com.paypal.oslo.api.graphql.schema.type.DeviceOS[] deviceOSArr = {deviceOS, deviceOS2, deviceOS3, deviceOS4};
        getHighSpeedVideoSizes = deviceOSArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(deviceOSArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DeviceOS.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DeviceOS", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"IOS", "ANDROID", "WEB"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeviceOS$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceOS;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DeviceOS;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DeviceOS;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "getKnownEntries$annotations", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getKnownEntries$annotations() {
        }

        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DeviceOS.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DeviceOS> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DeviceOS[]{com.paypal.oslo.api.graphql.schema.type.DeviceOS.IOS, com.paypal.oslo.api.graphql.schema.type.DeviceOS.ANDROID, com.paypal.oslo.api.graphql.schema.type.DeviceOS.WEB});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DeviceOS[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DeviceOS[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DeviceOS[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DeviceOS safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DeviceOS.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DeviceOS) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DeviceOS deviceOS = (com.paypal.oslo.api.graphql.schema.type.DeviceOS) obj;
            return deviceOS == null ? com.paypal.oslo.api.graphql.schema.type.DeviceOS.UNKNOWN__ : deviceOS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DeviceOS[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DeviceOS[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DeviceOS valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DeviceOS) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DeviceOS.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DeviceOS> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
