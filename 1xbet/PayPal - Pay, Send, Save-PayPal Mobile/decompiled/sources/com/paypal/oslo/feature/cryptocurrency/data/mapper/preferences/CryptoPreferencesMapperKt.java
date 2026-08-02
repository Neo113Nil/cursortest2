package com.paypal.oslo.feature.cryptocurrency.data.mapper.preferences;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\n\u001a\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$AssetPreference;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "intent", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/CryptoPreference;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$AssetPreference;Ljava/lang/String;Ljava/lang/String;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/UpdateCryptocurrencyAssetPreferenceMutation$AssetPreference;", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/UpdateCryptocurrencyAssetPreferenceMutation$AssetPreference;Ljava/lang/String;Ljava/lang/String;)Larrow/core/Either;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/type/CryptocurrencyPreferenceStatus;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference$Status;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference$Status;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoPreferencesMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference> toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference assetPreference, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetPreference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(assetPreference.getStatus());
        if (Camera2StreamConfigurationMap == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        java.lang.Object rate = assetPreference.getRate();
        java.lang.String obj = rate != null ? rate.toString() : null;
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference(str, str2, new com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference(Camera2StreamConfigurationMap, obj != null ? obj : "", assetPreference.getHasOptInBefore())));
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference> toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.UpdateCryptocurrencyAssetPreferenceMutation.AssetPreference assetPreference, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetPreference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(assetPreference.getStatus());
        if (Camera2StreamConfigurationMap == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        java.lang.Object rate = assetPreference.getRate();
        java.lang.String obj = rate != null ? rate.toString() : null;
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference(str, str2, new com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference(Camera2StreamConfigurationMap, obj != null ? obj : "", assetPreference.getHasOptInBefore())));
    }

    private static final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status Camera2StreamConfigurationMap(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus) {
        int i = com.paypal.oslo.feature.cryptocurrency.data.mapper.preferences.CryptoPreferencesMapperKt.WhenMappings.$EnumSwitchMapping$0[cryptocurrencyPreferenceStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status.OPT_IN;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status.OPT_OUT;
        }
        if (i == 3) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.OPT_IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.OPT_OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
