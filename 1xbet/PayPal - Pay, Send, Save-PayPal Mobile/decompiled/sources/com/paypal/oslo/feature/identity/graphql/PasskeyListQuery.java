package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\t!\"#$%&'( B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "Passkey", "AuthenticatorLightIcon", "OnURLIcon", "OnEmojiIcon", "AuthenticatorDarkIcon", "OnURLIcon1", "OnEmojiIcon1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyListQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "26737ed7cb4181f0b355247d8d8aabbdbd6ce257ac33026a06e2d8d347e60717";
    public static final java.lang.String OPERATION_NAME = "PasskeyList";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyListQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.PasskeyListQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$Passkey;", "passkeys", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPasskeys"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey> passkeys;

        public Data(java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.passkeys = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey> getPasskeys() {
            return this.passkeys;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey> list = this.passkeys;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(passkeys=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.passkeys.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkeys, ((com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Data) other).passkeys);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Data copy(java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey> passkeys) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeys, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Data(passkeys);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey> component1() {
            return this.passkeys;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Data copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.passkeys;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0096\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b8\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b9\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b:\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b;\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$Passkey;", "", "", "credentialId", "rawCredentialId", "deviceName", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyDeviceOS;", "deviceOs", "createdTime", "lastLoginTime", "lastLoginDevice", "lastLoginLocation", "authenticatorName", "authenticatorAttestationGuid", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorLightIcon;", "authenticatorLightIcon", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorDarkIcon;", "authenticatorDarkIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyDeviceOS;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorLightIcon;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorDarkIcon;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PasskeyDeviceOS;", "component5", "()Ljava/lang/Object;", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorLightIcon;", "component12", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorDarkIcon;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyDeviceOS;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorLightIcon;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorDarkIcon;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$Passkey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCredentialId", "getRawCredentialId", "getDeviceName", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyDeviceOS;", "getDeviceOs", "Ljava/lang/Object;", "getCreatedTime", "getLastLoginTime", "getLastLoginDevice", "getLastLoginLocation", "getAuthenticatorName", "getAuthenticatorAttestationGuid", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorLightIcon;", "getAuthenticatorLightIcon", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorDarkIcon;", "getAuthenticatorDarkIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Passkey {
        public static final int $stable = 8;
        private final java.lang.String authenticatorAttestationGuid;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon authenticatorDarkIcon;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon authenticatorLightIcon;
        private final java.lang.String authenticatorName;
        private final java.lang.Object createdTime;
        private final java.lang.String credentialId;
        private final java.lang.String deviceName;
        private final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS deviceOs;
        private final java.lang.String lastLoginDevice;
        private final java.lang.String lastLoginLocation;
        private final java.lang.Object lastLoginTime;
        private final java.lang.String rawCredentialId;

        public Passkey(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS, java.lang.Object obj, java.lang.Object obj2, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon authenticatorLightIcon, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon authenticatorDarkIcon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyDeviceOS, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.credentialId = str;
            this.rawCredentialId = str2;
            this.deviceName = str3;
            this.deviceOs = passkeyDeviceOS;
            this.createdTime = obj;
            this.lastLoginTime = obj2;
            this.lastLoginDevice = str4;
            this.lastLoginLocation = str5;
            this.authenticatorName = str6;
            this.authenticatorAttestationGuid = str7;
            this.authenticatorLightIcon = authenticatorLightIcon;
            this.authenticatorDarkIcon = authenticatorDarkIcon;
        }

        public final java.lang.String getCredentialId() {
            return this.credentialId;
        }

        public final java.lang.String getRawCredentialId() {
            return this.rawCredentialId;
        }

        public final java.lang.String getDeviceName() {
            return this.deviceName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS getDeviceOs() {
            return this.deviceOs;
        }

        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        public final java.lang.Object getLastLoginTime() {
            return this.lastLoginTime;
        }

        public final java.lang.String getLastLoginDevice() {
            return this.lastLoginDevice;
        }

        public final java.lang.String getLastLoginLocation() {
            return this.lastLoginLocation;
        }

        public final java.lang.String getAuthenticatorName() {
            return this.authenticatorName;
        }

        public final java.lang.String getAuthenticatorAttestationGuid() {
            return this.authenticatorAttestationGuid;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon getAuthenticatorLightIcon() {
            return this.authenticatorLightIcon;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon getAuthenticatorDarkIcon() {
            return this.authenticatorDarkIcon;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.credentialId;
            java.lang.String str2 = this.rawCredentialId;
            java.lang.String str3 = this.deviceName;
            com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS = this.deviceOs;
            java.lang.Object obj = this.createdTime;
            java.lang.Object obj2 = this.lastLoginTime;
            java.lang.String str4 = this.lastLoginDevice;
            java.lang.String str5 = this.lastLoginLocation;
            java.lang.String str6 = this.authenticatorName;
            java.lang.String str7 = this.authenticatorAttestationGuid;
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon authenticatorLightIcon = this.authenticatorLightIcon;
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon authenticatorDarkIcon = this.authenticatorDarkIcon;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Passkey(credentialId=");
            sb.append(str);
            sb.append(", rawCredentialId=");
            sb.append(str2);
            sb.append(", deviceName=");
            sb.append(str3);
            sb.append(", deviceOs=");
            sb.append(passkeyDeviceOS);
            sb.append(", createdTime=");
            sb.append(obj);
            sb.append(", lastLoginTime=");
            sb.append(obj2);
            sb.append(", lastLoginDevice=");
            sb.append(str4);
            sb.append(", lastLoginLocation=");
            sb.append(str5);
            sb.append(", authenticatorName=");
            sb.append(str6);
            sb.append(", authenticatorAttestationGuid=");
            sb.append(str7);
            sb.append(", authenticatorLightIcon=");
            sb.append(authenticatorLightIcon);
            sb.append(", authenticatorDarkIcon=");
            sb.append(authenticatorDarkIcon);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.credentialId.hashCode();
            int hashCode2 = this.rawCredentialId.hashCode();
            int hashCode3 = this.deviceName.hashCode();
            int hashCode4 = this.deviceOs.hashCode();
            int hashCode5 = this.createdTime.hashCode();
            java.lang.Object obj = this.lastLoginTime;
            int hashCode6 = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.lastLoginDevice;
            int hashCode7 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.lastLoginLocation;
            int hashCode8 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.authenticatorName;
            int hashCode9 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.authenticatorAttestationGuid;
            int hashCode10 = str4 == null ? 0 : str4.hashCode();
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon authenticatorLightIcon = this.authenticatorLightIcon;
            int hashCode11 = authenticatorLightIcon == null ? 0 : authenticatorLightIcon.hashCode();
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon authenticatorDarkIcon = this.authenticatorDarkIcon;
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (authenticatorDarkIcon != null ? authenticatorDarkIcon.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey passkey = (com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.credentialId, passkey.credentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawCredentialId, passkey.rawCredentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, passkey.deviceName) && this.deviceOs == passkey.deviceOs && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, passkey.createdTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastLoginTime, passkey.lastLoginTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastLoginDevice, passkey.lastLoginDevice) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastLoginLocation, passkey.lastLoginLocation) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorName, passkey.authenticatorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorAttestationGuid, passkey.authenticatorAttestationGuid) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorLightIcon, passkey.authenticatorLightIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorDarkIcon, passkey.authenticatorDarkIcon);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey copy(java.lang.String credentialId, java.lang.String rawCredentialId, java.lang.String deviceName, com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS deviceOs, java.lang.Object createdTime, java.lang.Object lastLoginTime, java.lang.String lastLoginDevice, java.lang.String lastLoginLocation, java.lang.String authenticatorName, java.lang.String authenticatorAttestationGuid, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon authenticatorLightIcon, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon authenticatorDarkIcon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawCredentialId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceOs, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdTime, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey(credentialId, rawCredentialId, deviceName, deviceOs, createdTime, lastLoginTime, lastLoginDevice, lastLoginLocation, authenticatorName, authenticatorAttestationGuid, authenticatorLightIcon, authenticatorDarkIcon);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getAuthenticatorName() {
            return this.authenticatorName;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getLastLoginLocation() {
            return this.lastLoginLocation;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getLastLoginDevice() {
            return this.lastLoginDevice;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getLastLoginTime() {
            return this.lastLoginTime;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS getDeviceOs() {
            return this.deviceOs;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDeviceName() {
            return this.deviceName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRawCredentialId() {
            return this.rawCredentialId;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon getAuthenticatorDarkIcon() {
            return this.authenticatorDarkIcon;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon getAuthenticatorLightIcon() {
            return this.authenticatorLightIcon;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getAuthenticatorAttestationGuid() {
            return this.authenticatorAttestationGuid;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCredentialId() {
            return this.credentialId;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorLightIcon;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon;", "onURLIcon", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon;", "onEmojiIcon", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorLightIcon;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon;", "getOnURLIcon", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon;", "getOnEmojiIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticatorLightIcon {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon onEmojiIcon;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon onURLIcon;

        public AuthenticatorLightIcon(java.lang.String str, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon onURLIcon, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon onEmojiIcon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onURLIcon = onURLIcon;
            this.onEmojiIcon = onEmojiIcon;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon getOnURLIcon() {
            return this.onURLIcon;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon getOnEmojiIcon() {
            return this.onEmojiIcon;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon onURLIcon = this.onURLIcon;
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon onEmojiIcon = this.onEmojiIcon;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticatorLightIcon(__typename=");
            sb.append(str);
            sb.append(", onURLIcon=");
            sb.append(onURLIcon);
            sb.append(", onEmojiIcon=");
            sb.append(onEmojiIcon);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon onURLIcon = this.onURLIcon;
            int hashCode2 = onURLIcon == null ? 0 : onURLIcon.hashCode();
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon onEmojiIcon = this.onEmojiIcon;
            return (((hashCode * 31) + hashCode2) * 31) + (onEmojiIcon != null ? onEmojiIcon.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon authenticatorLightIcon = (com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, authenticatorLightIcon.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onURLIcon, authenticatorLightIcon.onURLIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEmojiIcon, authenticatorLightIcon.onEmojiIcon);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon onURLIcon, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon onEmojiIcon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon(__typename, onURLIcon, onEmojiIcon);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon getOnEmojiIcon() {
            return this.onEmojiIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon getOnURLIcon() {
            return this.onURLIcon;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon authenticatorLightIcon, java.lang.String str, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon onURLIcon, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon onEmojiIcon, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authenticatorLightIcon.__typename;
            }
            if ((i & 2) != 0) {
                onURLIcon = authenticatorLightIcon.onURLIcon;
            }
            if ((i & 4) != 0) {
                onEmojiIcon = authenticatorLightIcon.onEmojiIcon;
            }
            return authenticatorLightIcon.copy(str, onURLIcon, onEmojiIcon);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon;", "", "url", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnURLIcon {
        public static final int $stable = 8;
        private final java.lang.Object url;

        public OnURLIcon(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.url = obj;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnURLIcon(url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon) other).url);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon copy(java.lang.Object url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon onURLIcon, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onURLIcon.url;
            }
            return onURLIcon.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon;", "", "", "emoji", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmoji"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEmojiIcon {
        public static final int $stable = 0;
        private final java.lang.String emoji;

        public OnEmojiIcon(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.emoji = str;
        }

        public final java.lang.String getEmoji() {
            return this.emoji;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.emoji;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEmojiIcon(emoji=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.emoji.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.emoji, ((com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon) other).emoji);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon copy(java.lang.String emoji) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emoji, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon(emoji);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmoji() {
            return this.emoji;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon onEmojiIcon, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onEmojiIcon.emoji;
            }
            return onEmojiIcon.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorDarkIcon;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon1;", "onURLIcon", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon1;", "onEmojiIcon", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon1;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon1;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon1;Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon1;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$AuthenticatorDarkIcon;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon1;", "getOnURLIcon", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon1;", "getOnEmojiIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticatorDarkIcon {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 onEmojiIcon;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 onURLIcon;

        public AuthenticatorDarkIcon(java.lang.String str, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 onURLIcon1, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 onEmojiIcon1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onURLIcon = onURLIcon1;
            this.onEmojiIcon = onEmojiIcon1;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 getOnURLIcon() {
            return this.onURLIcon;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 getOnEmojiIcon() {
            return this.onEmojiIcon;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 onURLIcon1 = this.onURLIcon;
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 onEmojiIcon1 = this.onEmojiIcon;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticatorDarkIcon(__typename=");
            sb.append(str);
            sb.append(", onURLIcon=");
            sb.append(onURLIcon1);
            sb.append(", onEmojiIcon=");
            sb.append(onEmojiIcon1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 onURLIcon1 = this.onURLIcon;
            int hashCode2 = onURLIcon1 == null ? 0 : onURLIcon1.hashCode();
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 onEmojiIcon1 = this.onEmojiIcon;
            return (((hashCode * 31) + hashCode2) * 31) + (onEmojiIcon1 != null ? onEmojiIcon1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon authenticatorDarkIcon = (com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, authenticatorDarkIcon.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onURLIcon, authenticatorDarkIcon.onURLIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEmojiIcon, authenticatorDarkIcon.onEmojiIcon);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 onURLIcon, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 onEmojiIcon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon(__typename, onURLIcon, onEmojiIcon);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 getOnEmojiIcon() {
            return this.onEmojiIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 getOnURLIcon() {
            return this.onURLIcon;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon authenticatorDarkIcon, java.lang.String str, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 onURLIcon1, com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 onEmojiIcon1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authenticatorDarkIcon.__typename;
            }
            if ((i & 2) != 0) {
                onURLIcon1 = authenticatorDarkIcon.onURLIcon;
            }
            if ((i & 4) != 0) {
                onEmojiIcon1 = authenticatorDarkIcon.onEmojiIcon;
            }
            return authenticatorDarkIcon.copy(str, onURLIcon1, onEmojiIcon1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon1;", "", "url", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnURLIcon1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnURLIcon1 {
        public static final int $stable = 8;
        private final java.lang.Object url;

        public OnURLIcon1(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.url = obj;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnURLIcon1(url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1) other).url);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 copy(java.lang.Object url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 onURLIcon1, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onURLIcon1.url;
            }
            return onURLIcon1.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon1;", "", "", "emoji", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$OnEmojiIcon1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmoji"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEmojiIcon1 {
        public static final int $stable = 0;
        private final java.lang.String emoji;

        public OnEmojiIcon1(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.emoji = str;
        }

        public final java.lang.String getEmoji() {
            return this.emoji;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.emoji;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEmojiIcon1(emoji=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.emoji.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1) && kotlin.jvm.internal.Intrinsics.areEqual(this.emoji, ((com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1) other).emoji);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 copy(java.lang.String emoji) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emoji, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1(emoji);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmoji() {
            return this.emoji;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnEmojiIcon1 onEmojiIcon1, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onEmojiIcon1.emoji;
            }
            return onEmojiIcon1.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query PasskeyList { passkeys { credentialId rawCredentialId deviceName deviceOs createdTime lastLoginTime lastLoginDevice lastLoginLocation authenticatorName authenticatorAttestationGuid authenticatorLightIcon { __typename ... on URLIcon { url } ... on EmojiIcon { emoji } } authenticatorDarkIcon { __typename ... on URLIcon { url } ... on EmojiIcon { emoji } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
