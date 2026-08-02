package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/MediaDeviceInfo;", "", "", "deviceId", "groupId", "kind", "label", "faceMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/MediaDeviceInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceId", "getGroupId", "getKind", "getLabel", "getFaceMode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MediaDeviceInfo {
    public static final int $stable = 0;
    private final java.lang.String deviceId;
    private final java.lang.String faceMode;
    private final java.lang.String groupId;
    private final java.lang.String kind;
    private final java.lang.String label;

    public MediaDeviceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.deviceId = str;
        this.groupId = str2;
        this.kind = str3;
        this.label = str4;
        this.faceMode = str5;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.lang.String getGroupId() {
        return this.groupId;
    }

    public final java.lang.String getKind() {
        return this.kind;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String getFaceMode() {
        return this.faceMode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceId;
        java.lang.String str2 = this.groupId;
        java.lang.String str3 = this.kind;
        java.lang.String str4 = this.label;
        java.lang.String str5 = this.faceMode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaDeviceInfo(deviceId=");
        sb.append(str);
        sb.append(", groupId=");
        sb.append(str2);
        sb.append(", kind=");
        sb.append(str3);
        sb.append(", label=");
        sb.append(str4);
        sb.append(", faceMode=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.deviceId.hashCode() * 31) + this.groupId.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.label.hashCode()) * 31) + this.faceMode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo mediaDeviceInfo = (com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, mediaDeviceInfo.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.groupId, mediaDeviceInfo.groupId) && kotlin.jvm.internal.Intrinsics.areEqual(this.kind, mediaDeviceInfo.kind) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, mediaDeviceInfo.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.faceMode, mediaDeviceInfo.faceMode);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo copy(java.lang.String deviceId, java.lang.String groupId, java.lang.String kind, java.lang.String label, java.lang.String faceMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(groupId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceMode, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo(deviceId, groupId, kind, label, faceMode);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFaceMode() {
        return this.faceMode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getKind() {
        return this.kind;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo mediaDeviceInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mediaDeviceInfo.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = mediaDeviceInfo.groupId;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = mediaDeviceInfo.kind;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = mediaDeviceInfo.label;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = mediaDeviceInfo.faceMode;
        }
        return mediaDeviceInfo.copy(str, str6, str7, str8, str5);
    }
}
