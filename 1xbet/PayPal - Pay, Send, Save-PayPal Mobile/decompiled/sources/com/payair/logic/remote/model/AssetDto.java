package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/payair/logic/remote/model/AssetDto;", "", "", "type", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "height", "width", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/payair/logic/remote/model/AssetDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getData", "Ljava/lang/Integer;", "getHeight", "getType", "getWidth"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AssetDto {
    private final java.lang.String data;
    private final java.lang.Integer height;
    private final java.lang.String type;
    private final java.lang.Integer width;

    public AssetDto(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.data = str2;
        this.height = num;
        this.width = num2;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(com.payair.logic.remote.model.AssetDto.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.payair.logic.remote.model.AssetDto assetDto = (com.payair.logic.remote.model.AssetDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, assetDto.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, assetDto.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, assetDto.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, assetDto.width);
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final java.lang.Integer getHeight() {
        return this.height;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.Integer getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int a2 = com.payair.csdk.w3.a(this.data, this.type.hashCode() * 31, 31);
        java.lang.Integer num = this.height;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.width;
        return ((a2 + intValue) * 31) + (num2 != null ? num2.intValue() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        java.lang.String str2 = this.data;
        java.lang.Integer num = this.height;
        java.lang.Integer num2 = this.width;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetDto(type=");
        sb.append(str);
        sb.append(", data=");
        sb.append(str2);
        sb.append(", height=");
        sb.append(num);
        sb.append(", width=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public final com.payair.logic.remote.model.AssetDto copy(java.lang.String type, java.lang.String data, java.lang.Integer height, java.lang.Integer width) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.payair.logic.remote.model.AssetDto(type, data, height, width);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.payair.logic.remote.model.AssetDto copy$default(com.payair.logic.remote.model.AssetDto assetDto, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = assetDto.type;
        }
        if ((i & 2) != 0) {
            str2 = assetDto.data;
        }
        if ((i & 4) != 0) {
            num = assetDto.height;
        }
        if ((i & 8) != 0) {
            num2 = assetDto.width;
        }
        return assetDto.copy(str, str2, num, num2);
    }
}
