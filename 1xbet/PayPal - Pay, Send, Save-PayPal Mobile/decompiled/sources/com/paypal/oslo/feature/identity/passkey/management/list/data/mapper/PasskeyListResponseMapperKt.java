package com.paypal.oslo.feature.identity.passkey.management.list.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyListQuery$Data;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListSuccess;", "toDomain", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyListResponseMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError, com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListSuccess> toDomain(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Data> graphQLData) {
        java.time.Instant instant;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object url;
        java.lang.Object url2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Data data = graphQLData.getData();
        java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey> passkeys = data != null ? data.getPasskeys() : null;
        if (passkeys == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.MissingData.INSTANCE);
        }
        try {
            java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey> list = passkeys;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.Passkey passkey : list) {
                java.lang.String credentialId = passkey.getCredentialId();
                java.lang.String rawCredentialId = passkey.getRawCredentialId();
                java.lang.String deviceName = passkey.getDeviceName();
                java.lang.String rawValue = passkey.getDeviceOs().getRawValue();
                java.lang.Object createdTime = passkey.getCreatedTime();
                java.lang.String str3 = createdTime instanceof java.lang.String ? (java.lang.String) createdTime : null;
                if (str3 == null || (instant = java.time.Instant.parse(str3)) == null) {
                    instant = java.time.Instant.EPOCH;
                }
                java.time.Instant instant2 = instant;
                kotlin.jvm.internal.Intrinsics.checkNotNull(instant2);
                java.lang.Object lastLoginTime = passkey.getLastLoginTime();
                java.lang.String str4 = lastLoginTime instanceof java.lang.String ? (java.lang.String) lastLoginTime : null;
                java.time.Instant parse = str4 != null ? java.time.Instant.parse(str4) : null;
                java.lang.String lastLoginDevice = passkey.getLastLoginDevice();
                java.lang.String lastLoginLocation = passkey.getLastLoginLocation();
                java.lang.String authenticatorName = passkey.getAuthenticatorName();
                java.lang.String str5 = authenticatorName == null ? "" : authenticatorName;
                java.lang.String authenticatorAttestationGuid = passkey.getAuthenticatorAttestationGuid();
                java.lang.String str6 = authenticatorAttestationGuid == null ? "" : authenticatorAttestationGuid;
                com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorLightIcon authenticatorLightIcon = passkey.getAuthenticatorLightIcon();
                if (authenticatorLightIcon != null) {
                    com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon onURLIcon = authenticatorLightIcon.getOnURLIcon();
                    str = (onURLIcon == null || (url2 = onURLIcon.getUrl()) == null) ? null : url2.toString();
                } else {
                    str = null;
                }
                com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.AuthenticatorDarkIcon authenticatorDarkIcon = passkey.getAuthenticatorDarkIcon();
                if (authenticatorDarkIcon != null) {
                    com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OnURLIcon1 onURLIcon2 = authenticatorDarkIcon.getOnURLIcon();
                    str2 = (onURLIcon2 == null || (url = onURLIcon2.getUrl()) == null) ? null : url.toString();
                } else {
                    str2 = null;
                }
                arrayList.add(new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential(credentialId, rawCredentialId, deviceName, rawValue, instant2, parse, lastLoginDevice, lastLoginLocation, str5, str6, str, str2));
            }
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListSuccess(arrayList));
        } catch (java.lang.ClassCastException e) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to map passkey fetch response - class cast error", e);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ValidationError.INSTANCE);
        } catch (java.lang.IllegalArgumentException e2) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to map passkey fetch response - invalid argument", e2);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ValidationError.INSTANCE);
        }
    }
}
