package com.payair.logic.notifications;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\t"}, d2 = {"Lcom/payair/logic/notifications/CustomData;", "Lcom/payair/hce/communication/JsonResponse;", "", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "status", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/notifications/CustomData;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTokenUniqueReference", util.h.xy.cb.b.f1091, "getStatus", "c", "getTitle"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CustomData extends com.payair.hce.communication.JsonResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String tokenUniqueReference;

    /* renamed from: b, reason: from kotlin metadata */
    public final java.lang.String status;

    /* renamed from: c, reason: from kotlin metadata */
    public final java.lang.String title;

    public CustomData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.tokenUniqueReference = str;
        this.status = str2;
        this.title = str3;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public final int hashCode() {
        return this.title.hashCode() + com.payair.csdk.w3.a(this.status, this.tokenUniqueReference.hashCode() * 31, 31);
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        java.lang.String str = this.tokenUniqueReference;
        java.lang.String str2 = this.status;
        java.lang.String str3 = this.title;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomData(tokenUniqueReference=");
        sb.append(str);
        sb.append(", status=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.logic.notifications.CustomData)) {
            return false;
        }
        com.payair.logic.notifications.CustomData customData = (com.payair.logic.notifications.CustomData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tokenUniqueReference, customData.tokenUniqueReference) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, customData.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, customData.title);
    }

    public final com.payair.logic.notifications.CustomData copy(java.lang.String tokenUniqueReference, java.lang.String status, java.lang.String title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.payair.logic.notifications.CustomData(tokenUniqueReference, status, title);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public static /* synthetic */ com.payair.logic.notifications.CustomData copy$default(com.payair.logic.notifications.CustomData customData, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = customData.tokenUniqueReference;
        }
        if ((i & 2) != 0) {
            str2 = customData.status;
        }
        if ((i & 4) != 0) {
            str3 = customData.title;
        }
        return customData.copy(str, str2, str3);
    }
}
