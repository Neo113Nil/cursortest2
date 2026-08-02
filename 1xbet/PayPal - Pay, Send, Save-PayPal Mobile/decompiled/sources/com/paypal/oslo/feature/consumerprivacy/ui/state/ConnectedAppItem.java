package com.paypal.oslo.feature.consumerprivacy.ui.state;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0080\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0084\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b\f\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b3\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b4\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b5\u0010\u0017R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b6\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;", "", "", "id", "name", "", "permissionsCount", "", "permissions", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "", "isCdr", "clientId", "grantId", "consentsCount", "activeGrantIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppActionType;ZLjava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppActionType;", "component6", "()Z", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppActionType;ZLjava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getId", "getName", com.visa.cbp.getEncExpo.warmup, "getPermissionsCount", "Ljava/util/List;", "getPermissions", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppActionType;", "getActionType", "Z", "getClientId", "getGrantId", "getConsentsCount", "getActiveGrantIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConnectedAppItem {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType actionType;
    private final java.util.List<java.lang.String> activeGrantIds;
    private final java.lang.String clientId;
    private final int consentsCount;
    private final java.lang.String grantId;
    private final java.lang.String id;
    private final boolean isCdr;
    private final java.lang.String name;
    private final java.util.List<java.lang.String> permissions;
    private final int permissionsCount;

    public ConnectedAppItem(java.lang.String str, java.lang.String str2, int i, java.util.List<java.lang.String> list, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType connectedAppActionType, boolean z, java.lang.String str3, java.lang.String str4, int i2, java.util.List<java.lang.String> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppActionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.id = str;
        this.name = str2;
        this.permissionsCount = i;
        this.permissions = list;
        this.actionType = connectedAppActionType;
        this.isCdr = z;
        this.clientId = str3;
        this.grantId = str4;
        this.consentsCount = i2;
        this.activeGrantIds = list2;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final int getPermissionsCount() {
        return this.permissionsCount;
    }

    public /* synthetic */ ConnectedAppItem(java.lang.String str, java.lang.String str2, int i, java.util.List list, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType connectedAppActionType, boolean z, java.lang.String str3, java.lang.String str4, int i2, java.util.List list2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i3 & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i3 & 16) != 0 ? com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType.REMOVE : connectedAppActionType, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    public final java.util.List<java.lang.String> getPermissions() {
        return this.permissions;
    }

    public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType getActionType() {
        return this.actionType;
    }

    public final boolean isCdr() {
        return this.isCdr;
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.lang.String getGrantId() {
        return this.grantId;
    }

    public final int getConsentsCount() {
        return this.consentsCount;
    }

    public final java.util.List<java.lang.String> getActiveGrantIds() {
        return this.activeGrantIds;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        int i = this.permissionsCount;
        java.util.List<java.lang.String> list = this.permissions;
        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType connectedAppActionType = this.actionType;
        boolean z = this.isCdr;
        java.lang.String str3 = this.clientId;
        java.lang.String str4 = this.grantId;
        int i2 = this.consentsCount;
        java.util.List<java.lang.String> list2 = this.activeGrantIds;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectedAppItem(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", permissionsCount=");
        sb.append(i);
        sb.append(", permissions=");
        sb.append(list);
        sb.append(", actionType=");
        sb.append(connectedAppActionType);
        sb.append(", isCdr=");
        sb.append(z);
        sb.append(", clientId=");
        sb.append(str3);
        sb.append(", grantId=");
        sb.append(str4);
        sb.append(", consentsCount=");
        sb.append(i2);
        sb.append(", activeGrantIds=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.name.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.permissionsCount);
        int hashCode4 = this.permissions.hashCode();
        int hashCode5 = this.actionType.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.isCdr);
        java.lang.String str = this.clientId;
        int hashCode7 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.grantId;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.consentsCount)) * 31) + this.activeGrantIds.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem)) {
            return false;
        }
        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem = (com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, connectedAppItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, connectedAppItem.name) && this.permissionsCount == connectedAppItem.permissionsCount && kotlin.jvm.internal.Intrinsics.areEqual(this.permissions, connectedAppItem.permissions) && this.actionType == connectedAppItem.actionType && this.isCdr == connectedAppItem.isCdr && kotlin.jvm.internal.Intrinsics.areEqual(this.clientId, connectedAppItem.clientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.grantId, connectedAppItem.grantId) && this.consentsCount == connectedAppItem.consentsCount && kotlin.jvm.internal.Intrinsics.areEqual(this.activeGrantIds, connectedAppItem.activeGrantIds);
    }

    public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem copy(java.lang.String id, java.lang.String name2, int permissionsCount, java.util.List<java.lang.String> permissions, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType actionType, boolean isCdr, java.lang.String clientId, java.lang.String grantId, int consentsCount, java.util.List<java.lang.String> activeGrantIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeGrantIds, "");
        return new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem(id, name2, permissionsCount, permissions, actionType, isCdr, clientId, grantId, consentsCount, activeGrantIds);
    }

    /* renamed from: component9, reason: from getter */
    public final int getConsentsCount() {
        return this.consentsCount;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getGrantId() {
        return this.grantId;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCdr() {
        return this.isCdr;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType getActionType() {
        return this.actionType;
    }

    public final java.util.List<java.lang.String> component4() {
        return this.permissions;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPermissionsCount() {
        return this.permissionsCount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.List<java.lang.String> component10() {
        return this.activeGrantIds;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
