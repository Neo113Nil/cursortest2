package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b"}, d2 = {"Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "Landroid/os/Parcelable;", "", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "current", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAvailable", "getCurrent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LocalizedLinkAccountBalance implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.link.result.LocalizedLinkAccountBalance> CREATOR = new com.plaid.link.result.LocalizedLinkAccountBalance.Creator();

    @com.google.gson.annotations.SerializedName(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY)
    private final java.lang.String available;

    @com.google.gson.annotations.SerializedName("current")
    private final java.lang.String current;

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LocalizedLinkAccountBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.result.LocalizedLinkAccountBalance createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.link.result.LocalizedLinkAccountBalance(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.result.LocalizedLinkAccountBalance[] newArray(int i) {
            return new com.plaid.link.result.LocalizedLinkAccountBalance[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalizedLinkAccountBalance() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String getAvailable() {
        return this.available;
    }

    public final java.lang.String getCurrent() {
        return this.current;
    }

    public LocalizedLinkAccountBalance(java.lang.String str, java.lang.String str2) {
        this.available = str;
        this.current = str2;
    }

    public /* synthetic */ LocalizedLinkAccountBalance(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.available);
        parcel.writeString(this.current);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.available;
        java.lang.String str2 = this.current;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocalizedLinkAccountBalance(available=");
        sb.append(str);
        sb.append(", current=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.available;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.current;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.plaid.link.result.LocalizedLinkAccountBalance)) {
            return false;
        }
        com.plaid.link.result.LocalizedLinkAccountBalance localizedLinkAccountBalance = (com.plaid.link.result.LocalizedLinkAccountBalance) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.available, localizedLinkAccountBalance.available) && kotlin.jvm.internal.Intrinsics.areEqual(this.current, localizedLinkAccountBalance.current);
    }

    public final com.plaid.link.result.LocalizedLinkAccountBalance copy(java.lang.String available, java.lang.String current) {
        return new com.plaid.link.result.LocalizedLinkAccountBalance(available, current);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrent() {
        return this.current;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAvailable() {
        return this.available;
    }

    public static /* synthetic */ com.plaid.link.result.LocalizedLinkAccountBalance copy$default(com.plaid.link.result.LocalizedLinkAccountBalance localizedLinkAccountBalance, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = localizedLinkAccountBalance.available;
        }
        if ((i & 2) != 0) {
            str2 = localizedLinkAccountBalance.current;
        }
        return localizedLinkAccountBalance.copy(str, str2);
    }
}
