package com.paypal.oslo.feature.settings.closeaccount.ui.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ<\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/LinkDestination;", "", "Landroidx/navigation3/runtime/NavKey;", "native", "", "url", "text", "tag", "<init>", "(Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/LinkDestination;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroidx/navigation3/runtime/NavKey;", "getNative", "Ljava/lang/String;", "getUrl", "getText", "getTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LinkDestination {
    public static final int $stable = 8;
    private final androidx.navigation3.runtime.NavKey native;
    private final java.lang.String tag;
    private final java.lang.String text;
    private final java.lang.String url;

    public LinkDestination(androidx.navigation3.runtime.NavKey navKey, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.native = navKey;
        this.url = str;
        this.text = str2;
        this.tag = str3;
    }

    public /* synthetic */ LinkDestination(androidx.navigation3.runtime.NavKey navKey, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : navKey, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }

    public final androidx.navigation3.runtime.NavKey getNative() {
        return this.native;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final java.lang.String toString() {
        androidx.navigation3.runtime.NavKey navKey = this.native;
        java.lang.String str = this.url;
        java.lang.String str2 = this.text;
        java.lang.String str3 = this.tag;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkDestination(native=");
        sb.append(navKey);
        sb.append(", url=");
        sb.append(str);
        sb.append(", text=");
        sb.append(str2);
        sb.append(", tag=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        androidx.navigation3.runtime.NavKey navKey = this.native;
        int hashCode = navKey == null ? 0 : navKey.hashCode();
        java.lang.String str = this.url;
        return (((((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.text.hashCode()) * 31) + this.tag.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination)) {
            return false;
        }
        com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination linkDestination = (com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.native, linkDestination.native) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, linkDestination.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, linkDestination.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.tag, linkDestination.tag);
    }

    public final com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination copy(androidx.navigation3.runtime.NavKey r2, java.lang.String url, java.lang.String text, java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination(r2, url, text, tag);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTag() {
        return this.tag;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.navigation3.runtime.NavKey getNative() {
        return this.native;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination linkDestination, androidx.navigation3.runtime.NavKey navKey, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            navKey = linkDestination.native;
        }
        if ((i & 2) != 0) {
            str = linkDestination.url;
        }
        if ((i & 4) != 0) {
            str2 = linkDestination.text;
        }
        if ((i & 8) != 0) {
            str3 = linkDestination.tag;
        }
        return linkDestination.copy(navKey, str, str2, str3);
    }

    public LinkDestination() {
        this(null, null, null, null, 15, null);
    }
}
