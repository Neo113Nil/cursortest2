package com.paypal.oslo.core.pushnotification.domain.notification;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JP\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationAction;", "", "", "id", "title", "icon", "", "metadata", "", "opensApp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationAction;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getIcon", "Ljava/util/Map;", "getMetadata", "Z", "getOpensApp"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class NotificationAction {
    private final java.lang.String icon;
    private final java.lang.String id;
    private final java.util.Map<java.lang.String, java.lang.String> metadata;
    private final boolean opensApp;
    private final java.lang.String title;

    public NotificationAction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.id = str;
        this.title = str2;
        this.icon = str3;
        this.metadata = map;
        this.opensApp = z;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getIcon() {
        return this.icon;
    }

    public /* synthetic */ NotificationAction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 16) != 0 ? false : z);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return this.metadata;
    }

    public final boolean getOpensApp() {
        return this.opensApp;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.icon;
        java.util.Map<java.lang.String, java.lang.String> map = this.metadata;
        boolean z = this.opensApp;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationAction(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(str3);
        sb.append(", metadata=");
        sb.append(map);
        sb.append(", opensApp=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.title.hashCode();
        java.lang.String str = this.icon;
        return (((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.metadata.hashCode()) * 31) + java.lang.Boolean.hashCode(this.opensApp);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction)) {
            return false;
        }
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction notificationAction = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, notificationAction.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, notificationAction.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, notificationAction.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, notificationAction.metadata) && this.opensApp == notificationAction.opensApp;
    }

    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction copy(java.lang.String id, java.lang.String title, java.lang.String icon, java.util.Map<java.lang.String, java.lang.String> metadata, boolean opensApp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction(id, title, icon, metadata, opensApp);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getOpensApp() {
        return this.opensApp;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component4() {
        return this.metadata;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction notificationAction, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = notificationAction.id;
        }
        if ((i & 2) != 0) {
            str2 = notificationAction.title;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = notificationAction.icon;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            map = notificationAction.metadata;
        }
        java.util.Map map2 = map;
        if ((i & 16) != 0) {
            z = notificationAction.opensApp;
        }
        return notificationAction.copy(str, str4, str5, map2, z);
    }
}
