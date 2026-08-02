package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/app/navigation/TopBarUiState;", "", "", "showAccountSwitch", "", "profileImageUrl", "displayName", "", "notificationCount", "showLeftSection", "<init>", "(ZLjava/lang/String;Ljava/lang/String;IZ)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()I", "component5", "copy", "(ZLjava/lang/String;Ljava/lang/String;IZ)Lcom/paypal/oslo/app/navigation/TopBarUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Z", "getShowAccountSwitch", "Ljava/lang/String;", "getProfileImageUrl", "getDisplayName", com.visa.cbp.getEncExpo.warmup, "getNotificationCount", "getShowLeftSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TopBarUiState {
    public static final int $stable = 0;
    private final java.lang.String displayName;
    private final int notificationCount;
    private final java.lang.String profileImageUrl;
    private final boolean showAccountSwitch;
    private final boolean showLeftSection;

    public TopBarUiState(boolean z, java.lang.String str, java.lang.String str2, int i, boolean z2) {
        this.showAccountSwitch = z;
        this.profileImageUrl = str;
        this.displayName = str2;
        this.notificationCount = i;
        this.showLeftSection = z2;
    }

    public /* synthetic */ TopBarUiState(boolean z, java.lang.String str, java.lang.String str2, int i, boolean z2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) == 0 ? str2 : null, (i2 & 8) == 0 ? i : 0, (i2 & 16) != 0 ? true : z2);
    }

    public final boolean getShowAccountSwitch() {
        return this.showAccountSwitch;
    }

    public final java.lang.String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final int getNotificationCount() {
        return this.notificationCount;
    }

    public final boolean getShowLeftSection() {
        return this.showLeftSection;
    }

    public final java.lang.String toString() {
        boolean z = this.showAccountSwitch;
        java.lang.String str = this.profileImageUrl;
        java.lang.String str2 = this.displayName;
        int i = this.notificationCount;
        boolean z2 = this.showLeftSection;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TopBarUiState(showAccountSwitch=");
        sb.append(z);
        sb.append(", profileImageUrl=");
        sb.append(str);
        sb.append(", displayName=");
        sb.append(str2);
        sb.append(", notificationCount=");
        sb.append(i);
        sb.append(", showLeftSection=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.showAccountSwitch);
        java.lang.String str = this.profileImageUrl;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.displayName;
        return (((((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.notificationCount)) * 31) + java.lang.Boolean.hashCode(this.showLeftSection);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.app.navigation.TopBarUiState)) {
            return false;
        }
        com.paypal.oslo.app.navigation.TopBarUiState topBarUiState = (com.paypal.oslo.app.navigation.TopBarUiState) other;
        return this.showAccountSwitch == topBarUiState.showAccountSwitch && kotlin.jvm.internal.Intrinsics.areEqual(this.profileImageUrl, topBarUiState.profileImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, topBarUiState.displayName) && this.notificationCount == topBarUiState.notificationCount && this.showLeftSection == topBarUiState.showLeftSection;
    }

    public final com.paypal.oslo.app.navigation.TopBarUiState copy(boolean showAccountSwitch, java.lang.String profileImageUrl, java.lang.String displayName, int notificationCount, boolean showLeftSection) {
        return new com.paypal.oslo.app.navigation.TopBarUiState(showAccountSwitch, profileImageUrl, displayName, notificationCount, showLeftSection);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowLeftSection() {
        return this.showLeftSection;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNotificationCount() {
        return this.notificationCount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowAccountSwitch() {
        return this.showAccountSwitch;
    }

    public static /* synthetic */ com.paypal.oslo.app.navigation.TopBarUiState copy$default(com.paypal.oslo.app.navigation.TopBarUiState topBarUiState, boolean z, java.lang.String str, java.lang.String str2, int i, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = topBarUiState.showAccountSwitch;
        }
        if ((i2 & 2) != 0) {
            str = topBarUiState.profileImageUrl;
        }
        java.lang.String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = topBarUiState.displayName;
        }
        java.lang.String str4 = str2;
        if ((i2 & 8) != 0) {
            i = topBarUiState.notificationCount;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z2 = topBarUiState.showLeftSection;
        }
        return topBarUiState.copy(z, str3, str4, i3, z2);
    }

    public TopBarUiState() {
        this(false, null, null, 0, false, 31, null);
    }
}
