package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PromotionPlatform;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "WEB", "IOS", "IPADOS", "ANDROID", "EMAIL", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromotionPlatform {
    public static final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform ANDROID;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform EMAIL;
    public static final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform IOS;
    public static final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform IPADOS;
    public static final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform WEB;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PromotionPlatform[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PromotionPlatform(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform = new com.paypal.oslo.api.graphql.schema.type.PromotionPlatform("WEB", 0, "WEB");
        WEB = promotionPlatform;
        com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform2 = new com.paypal.oslo.api.graphql.schema.type.PromotionPlatform("IOS", 1, "IOS");
        IOS = promotionPlatform2;
        com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform3 = new com.paypal.oslo.api.graphql.schema.type.PromotionPlatform("IPADOS", 2, "IPADOS");
        IPADOS = promotionPlatform3;
        com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform4 = new com.paypal.oslo.api.graphql.schema.type.PromotionPlatform("ANDROID", 3, "ANDROID");
        ANDROID = promotionPlatform4;
        com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform5 = new com.paypal.oslo.api.graphql.schema.type.PromotionPlatform("EMAIL", 4, "EMAIL");
        EMAIL = promotionPlatform5;
        com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform6 = new com.paypal.oslo.api.graphql.schema.type.PromotionPlatform("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = promotionPlatform6;
        com.paypal.oslo.api.graphql.schema.type.PromotionPlatform[] promotionPlatformArr = {promotionPlatform, promotionPlatform2, promotionPlatform3, promotionPlatform4, promotionPlatform5, promotionPlatform6};
        getHighSpeedVideoSizes = promotionPlatformArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(promotionPlatformArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PromotionPlatform", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"WEB", "IOS", "IPADOS", "ANDROID", "EMAIL"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PromotionPlatform$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionPlatform;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PromotionPlatform;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PromotionPlatform;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PromotionPlatform> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PromotionPlatform[]{com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.WEB, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.IOS, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.IPADOS, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.EMAIL});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PromotionPlatform[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PromotionPlatform[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PromotionPlatform) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform = (com.paypal.oslo.api.graphql.schema.type.PromotionPlatform) obj;
            return promotionPlatform == null ? com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.UNKNOWN__ : promotionPlatform;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PromotionPlatform[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PromotionPlatform[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PromotionPlatform valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PromotionPlatform) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PromotionPlatform> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
