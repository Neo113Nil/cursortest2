package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/RequestType;", "", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/pds/core/Icon;", "icon", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/pds/core/Icon;", "component4", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/RequestType;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/paypal/pds/core/Icon;", "getIcon", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RequestType {
    public static final int $stable = 8;
    private final java.lang.String description;
    private final androidx.navigation3.runtime.NavKey destination;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String title;

    public RequestType(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        this.title = str;
        this.description = str2;
        this.icon = icon;
        this.destination = navKey;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.description;
        com.paypal.pds.core.Icon icon = this.icon;
        androidx.navigation3.runtime.NavKey navKey = this.destination;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestType(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", destination=");
        sb.append(navKey);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.destination.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType requestType = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, requestType.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, requestType.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, requestType.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, requestType.destination);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType copy(java.lang.String title, java.lang.String description, com.paypal.pds.core.Icon icon, androidx.navigation3.runtime.NavKey destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType(title, description, icon, destination);
    }

    /* renamed from: component4, reason: from getter */
    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType requestType, java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = requestType.title;
        }
        if ((i & 2) != 0) {
            str2 = requestType.description;
        }
        if ((i & 4) != 0) {
            icon = requestType.icon;
        }
        if ((i & 8) != 0) {
            navKey = requestType.destination;
        }
        return requestType.copy(str, str2, icon, navKey);
    }
}
