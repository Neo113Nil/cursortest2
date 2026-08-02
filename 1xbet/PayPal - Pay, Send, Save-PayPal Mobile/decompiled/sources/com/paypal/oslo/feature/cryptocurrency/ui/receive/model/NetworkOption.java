package com.paypal.oslo.feature.cryptocurrency.ui.receive.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/NetworkOption;", "", "", "id", "name", "logoUrl", "", "isDefault", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/NetworkOption;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getLogoUrl", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NetworkOption {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final boolean isDefault;
    private final java.lang.String logoUrl;
    private final java.lang.String name;

    public NetworkOption(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.name = str2;
        this.logoUrl = str3;
        this.isDefault = z;
    }

    public /* synthetic */ NetworkOption(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.logoUrl;
        boolean z = this.isDefault;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkOption(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", logoUrl=");
        sb.append(str3);
        sb.append(", isDefault=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.logoUrl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isDefault);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption networkOption = (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, networkOption.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, networkOption.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, networkOption.logoUrl) && this.isDefault == networkOption.isDefault;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption copy(java.lang.String id, java.lang.String name2, java.lang.String logoUrl, boolean isDefault) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption(id, name2, logoUrl, isDefault);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption copy$default(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption networkOption, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = networkOption.id;
        }
        if ((i & 2) != 0) {
            str2 = networkOption.name;
        }
        if ((i & 4) != 0) {
            str3 = networkOption.logoUrl;
        }
        if ((i & 8) != 0) {
            z = networkOption.isDefault;
        }
        return networkOption.copy(str, str2, str3, z);
    }
}
