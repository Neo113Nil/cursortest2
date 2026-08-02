package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/ui/DisplayInfoData;", "", "", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "logoUrl", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/amexandp3/ui/DisplayInfoData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getDescription", "getLogoUrl", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DisplayInfoData {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final java.lang.String errorMessage;
    private final java.lang.String logoUrl;
    private final java.lang.String name;

    public DisplayInfoData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.description = str2;
        this.logoUrl = str3;
        this.errorMessage = str4;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.description;
        java.lang.String str3 = this.logoUrl;
        java.lang.String str4 = this.errorMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayInfoData(name=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", logoUrl=");
        sb.append(str3);
        sb.append(", errorMessage=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.description.hashCode();
        int hashCode3 = this.logoUrl.hashCode();
        java.lang.String str = this.errorMessage;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.ui.DisplayInfoData)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.amexandp3.ui.DisplayInfoData displayInfoData = (com.paypal.oslo.feature.wallet.amexandp3.ui.DisplayInfoData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, displayInfoData.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, displayInfoData.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, displayInfoData.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, displayInfoData.errorMessage);
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.ui.DisplayInfoData copy(java.lang.String name2, java.lang.String description, java.lang.String logoUrl, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.DisplayInfoData(name2, description, logoUrl, errorMessage);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.DisplayInfoData copy$default(com.paypal.oslo.feature.wallet.amexandp3.ui.DisplayInfoData displayInfoData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = displayInfoData.name;
        }
        if ((i & 2) != 0) {
            str2 = displayInfoData.description;
        }
        if ((i & 4) != 0) {
            str3 = displayInfoData.logoUrl;
        }
        if ((i & 8) != 0) {
            str4 = displayInfoData.errorMessage;
        }
        return displayInfoData.copy(str, str2, str3, str4);
    }
}
