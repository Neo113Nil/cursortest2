package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AgenticSurface;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ANY", "HOME", com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, "SPEND", "ME", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AgenticSurface {
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSurface ANY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSurface.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSurface HOME;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSurface ME;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSurface SEND;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSurface SPEND;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSurface UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AgenticSurface[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AgenticSurface(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AgenticSurface agenticSurface = new com.paypal.oslo.api.graphql.schema.type.AgenticSurface("ANY", 0, "ANY");
        ANY = agenticSurface;
        com.paypal.oslo.api.graphql.schema.type.AgenticSurface agenticSurface2 = new com.paypal.oslo.api.graphql.schema.type.AgenticSurface("HOME", 1, "HOME");
        HOME = agenticSurface2;
        com.paypal.oslo.api.graphql.schema.type.AgenticSurface agenticSurface3 = new com.paypal.oslo.api.graphql.schema.type.AgenticSurface(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, 2, com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend);
        SEND = agenticSurface3;
        com.paypal.oslo.api.graphql.schema.type.AgenticSurface agenticSurface4 = new com.paypal.oslo.api.graphql.schema.type.AgenticSurface("SPEND", 3, "SPEND");
        SPEND = agenticSurface4;
        com.paypal.oslo.api.graphql.schema.type.AgenticSurface agenticSurface5 = new com.paypal.oslo.api.graphql.schema.type.AgenticSurface("ME", 4, "ME");
        ME = agenticSurface5;
        com.paypal.oslo.api.graphql.schema.type.AgenticSurface agenticSurface6 = new com.paypal.oslo.api.graphql.schema.type.AgenticSurface("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = agenticSurface6;
        com.paypal.oslo.api.graphql.schema.type.AgenticSurface[] agenticSurfaceArr = {agenticSurface, agenticSurface2, agenticSurface3, agenticSurface4, agenticSurface5, agenticSurface6};
        getHighResolutionOutputSizeshNQ4ISI = agenticSurfaceArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(agenticSurfaceArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AgenticSurface.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AgenticSurface", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ANY", "HOME", com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, "SPEND", "ME"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AgenticSurface$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticSurface;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AgenticSurface;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AgenticSurface;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AgenticSurface.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AgenticSurface> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AgenticSurface[]{com.paypal.oslo.api.graphql.schema.type.AgenticSurface.ANY, com.paypal.oslo.api.graphql.schema.type.AgenticSurface.HOME, com.paypal.oslo.api.graphql.schema.type.AgenticSurface.SEND, com.paypal.oslo.api.graphql.schema.type.AgenticSurface.SPEND, com.paypal.oslo.api.graphql.schema.type.AgenticSurface.ME});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AgenticSurface[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AgenticSurface[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AgenticSurface[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AgenticSurface safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AgenticSurface.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AgenticSurface) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AgenticSurface agenticSurface = (com.paypal.oslo.api.graphql.schema.type.AgenticSurface) obj;
            return agenticSurface == null ? com.paypal.oslo.api.graphql.schema.type.AgenticSurface.UNKNOWN__ : agenticSurface;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AgenticSurface[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AgenticSurface[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AgenticSurface valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AgenticSurface) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AgenticSurface.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AgenticSurface> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
