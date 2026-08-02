package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLProfilePresentation;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BNPLProfilePresentation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.Companion INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.Companion(null);
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __plans_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __status_placementLocation = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("placementLocation").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __nextBestAction_placementLocation = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("placementLocation").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __prequalificationSummary_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __applicationEligibility_input = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("input").build();
    private static final com.apollographql.apollo.api.ObjectType type = new com.apollographql.apollo.api.ObjectType.Builder("BNPLProfilePresentation").build();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLProfilePresentation$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__plans_input", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "get__plans_input", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__status_placementLocation", "get__status_placementLocation", "__nextBestAction_placementLocation", "get__nextBestAction_placementLocation", "__prequalificationSummary_input", "get__prequalificationSummary_input", "__applicationEligibility_input", "get__applicationEligibility_input", "Lcom/apollographql/apollo/api/ObjectType;", "type", "Lcom/apollographql/apollo/api/ObjectType;", "getType", "()Lcom/apollographql/apollo/api/ObjectType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__plans_input() {
            return com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.__plans_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__status_placementLocation() {
            return com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.__status_placementLocation;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__nextBestAction_placementLocation() {
            return com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.__nextBestAction_placementLocation;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__prequalificationSummary_input() {
            return com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.__prequalificationSummary_input;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__applicationEligibility_input() {
            return com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.__applicationEligibility_input;
        }

        public final com.apollographql.apollo.api.ObjectType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.type;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
