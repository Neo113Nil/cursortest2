package com.paypal.oslo.feature.qrc.graphql.type;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSession;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QRCodeSession {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeSession.Companion INSTANCE = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeSession.Companion(null);
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __paymentOptions_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.ObjectType type = new com.apollographql.apollo.api.ObjectType.Builder("QRCodeSession").build();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSession$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__paymentOptions_input", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "get__paymentOptions_input", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "Lcom/apollographql/apollo/api/ObjectType;", "type", "Lcom/apollographql/apollo/api/ObjectType;", "getType", "()Lcom/apollographql/apollo/api/ObjectType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__paymentOptions_input() {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodeSession.__paymentOptions_input;
        }

        public final com.apollographql.apollo.api.ObjectType getType() {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodeSession.type;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
