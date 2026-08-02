package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/payair/model/Asset;", "", "Lcom/payair/model/AssetType;", "assetType", "", com.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA, "", "height", "width", "<init>", "(Lcom/payair/model/AssetType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Lcom/payair/model/AssetType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Lcom/payair/model/AssetType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/payair/model/Asset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/payair/model/AssetType;", "getAssetType", "Ljava/lang/Integer;", "getHeight", "Ljava/lang/String;", "getRawData", "getWidth"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Asset {
    public com.payair.model.AssetType assetType;
    public java.lang.Integer height;
    public java.lang.String rawData;
    public java.lang.Integer width;

    public Asset(com.payair.model.AssetType assetType, java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.assetType = assetType;
        this.rawData = str;
        this.height = num;
        this.width = num2;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(com.payair.model.Asset.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.payair.model.Asset asset = (com.payair.model.Asset) other;
        return this.assetType == asset.assetType && kotlin.jvm.internal.Intrinsics.areEqual(this.rawData, asset.rawData) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, asset.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, asset.width);
    }

    public final com.payair.model.AssetType getAssetType() {
        return this.assetType;
    }

    public final java.lang.Integer getHeight() {
        return this.height;
    }

    public final java.lang.String getRawData() {
        return this.rawData;
    }

    public final java.lang.Integer getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int a2 = com.payair.csdk.w3.a(this.rawData, this.assetType.hashCode() * 31, 31);
        java.lang.Integer num = this.height;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.width;
        return ((a2 + intValue) * 31) + (num2 != null ? num2.intValue() : 0);
    }

    public /* synthetic */ Asset() {
    }

    public final java.lang.String toString() {
        com.payair.model.AssetType assetType = this.assetType;
        java.lang.String str = this.rawData;
        java.lang.Integer num = this.height;
        java.lang.Integer num2 = this.width;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Asset(assetType=");
        sb.append(assetType);
        sb.append(", rawData=");
        sb.append(str);
        sb.append(", height=");
        sb.append(num);
        sb.append(", width=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public final com.payair.model.Asset copy(com.payair.model.AssetType assetType, java.lang.String rawData, java.lang.Integer height, java.lang.Integer width) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawData, "");
        return new com.payair.model.Asset(assetType, rawData, height, width);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRawData() {
        return this.rawData;
    }

    /* renamed from: component1, reason: from getter */
    public final com.payair.model.AssetType getAssetType() {
        return this.assetType;
    }

    public static /* synthetic */ com.payair.model.Asset copy$default(com.payair.model.Asset asset, com.payair.model.AssetType assetType, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            assetType = asset.assetType;
        }
        if ((i & 2) != 0) {
            str = asset.rawData;
        }
        if ((i & 4) != 0) {
            num = asset.height;
        }
        if ((i & 8) != 0) {
            num2 = asset.width;
        }
        return asset.copy(assetType, str, num, num2);
    }
}
