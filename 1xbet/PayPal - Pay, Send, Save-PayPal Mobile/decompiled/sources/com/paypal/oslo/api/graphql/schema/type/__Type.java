package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/__Type;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class __Type {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.__Type.Companion INSTANCE = new com.paypal.oslo.api.graphql.schema.type.__Type.Companion(null);
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __fields_includeDeprecated = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("includeDeprecated").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __enumValues_includeDeprecated = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("includeDeprecated").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __inputFields_includeDeprecated = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("includeDeprecated").build();
    private static final com.apollographql.apollo.api.ObjectType type = new com.apollographql.apollo.api.ObjectType.Builder("__Type").build();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/__Type$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__fields_includeDeprecated", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "get__fields_includeDeprecated", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__enumValues_includeDeprecated", "get__enumValues_includeDeprecated", "__inputFields_includeDeprecated", "get__inputFields_includeDeprecated", "Lcom/apollographql/apollo/api/ObjectType;", "type", "Lcom/apollographql/apollo/api/ObjectType;", "getType", "()Lcom/apollographql/apollo/api/ObjectType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__fields_includeDeprecated() {
            return com.paypal.oslo.api.graphql.schema.type.__Type.__fields_includeDeprecated;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__enumValues_includeDeprecated() {
            return com.paypal.oslo.api.graphql.schema.type.__Type.__enumValues_includeDeprecated;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__inputFields_includeDeprecated() {
            return com.paypal.oslo.api.graphql.schema.type.__Type.__inputFields_includeDeprecated;
        }

        public final com.apollographql.apollo.api.ObjectType getType() {
            return com.paypal.oslo.api.graphql.schema.type.__Type.type;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
