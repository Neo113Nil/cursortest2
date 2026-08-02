package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalQuery;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExternalQuery {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalQuery.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalQuery.Companion(null);
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __buyerInfo_token = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cardFormData_token = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __cardFormData_fundingInstrumentId = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("fundingInstrumentId").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __fundingSelection_token = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __fundingSelection_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __checkoutPreferences_token = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __checkoutPreferences_tokenType = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("tokenType").build();
    private static final com.apollographql.apollo.api.ObjectType type = new com.apollographql.apollo.api.ObjectType.Builder("externalQuery").build();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalQuery$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__buyerInfo_token", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "get__buyerInfo_token", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__cardFormData_token", "get__cardFormData_token", "__cardFormData_fundingInstrumentId", "get__cardFormData_fundingInstrumentId", "__fundingSelection_token", "get__fundingSelection_token", "__fundingSelection_input", "get__fundingSelection_input", "__checkoutPreferences_token", "get__checkoutPreferences_token", "__checkoutPreferences_tokenType", "get__checkoutPreferences_tokenType", "Lcom/apollographql/apollo/api/ObjectType;", "type", "Lcom/apollographql/apollo/api/ObjectType;", "getType", "()Lcom/apollographql/apollo/api/ObjectType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__buyerInfo_token() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalQuery.__buyerInfo_token;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cardFormData_token() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalQuery.__cardFormData_token;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__cardFormData_fundingInstrumentId() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalQuery.__cardFormData_fundingInstrumentId;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__fundingSelection_token() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalQuery.__fundingSelection_token;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__fundingSelection_input() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalQuery.__fundingSelection_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__checkoutPreferences_token() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalQuery.__checkoutPreferences_token;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__checkoutPreferences_tokenType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalQuery.__checkoutPreferences_tokenType;
        }

        public final com.apollographql.apollo.api.ObjectType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalQuery.type;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
