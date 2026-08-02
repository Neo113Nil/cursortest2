package com.plaid.internal.core.crashreporting.internal.models;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/DebugImage;", "Ljava/io/Serializable;", "", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getType", "getUuid", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DebugImage implements java.io.Serializable {
    private static final java.lang.String DEFAULT_TYPE = "proguard";
    private final java.lang.String type;
    private final java.lang.String uuid;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugImage(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getUuid() {
        return this.uuid;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.uuid;
        java.lang.String str2 = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebugImage{uuid='");
        sb.append(str);
        sb.append("', type='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }

    public DebugImage(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.uuid = str;
        this.type = str2;
    }

    public /* synthetic */ DebugImage(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? DEFAULT_TYPE : str2);
    }
}
