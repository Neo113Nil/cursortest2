package com.paypal.oslo.feature.cryptocurrency.domain.model.preferences;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/CryptoPreference;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "intent", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference;", "assetPreference", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/CryptoPreference;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "getIntent", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference;", "getAssetPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoPreference {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference;
    private final java.lang.String assetSymbol;
    private final java.lang.String intent;

    public CryptoPreference(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.assetSymbol = str;
        this.intent = str2;
        this.assetPreference = assetPreference;
    }

    public /* synthetic */ CryptoPreference(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : assetPreference);
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String getIntent() {
        return this.intent;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference getAssetPreference() {
        return this.assetPreference;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetSymbol;
        java.lang.String str2 = this.intent;
        com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference = this.assetPreference;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoPreference(assetSymbol=");
        sb.append(str);
        sb.append(", intent=");
        sb.append(str2);
        sb.append(", assetPreference=");
        sb.append(assetPreference);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.assetSymbol.hashCode();
        int hashCode2 = this.intent.hashCode();
        com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference = this.assetPreference;
        return (((hashCode * 31) + hashCode2) * 31) + (assetPreference == null ? 0 : assetPreference.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference cryptoPreference = (com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, cryptoPreference.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, cryptoPreference.intent) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetPreference, cryptoPreference.assetPreference);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference copy(java.lang.String assetSymbol, java.lang.String intent, com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference(assetSymbol, intent, assetPreference);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference getAssetPreference() {
        return this.assetPreference;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getIntent() {
        return this.intent;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference cryptoPreference, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptoPreference.assetSymbol;
        }
        if ((i & 2) != 0) {
            str2 = cryptoPreference.intent;
        }
        if ((i & 4) != 0) {
            assetPreference = cryptoPreference.assetPreference;
        }
        return cryptoPreference.copy(str, str2, assetPreference);
    }
}
