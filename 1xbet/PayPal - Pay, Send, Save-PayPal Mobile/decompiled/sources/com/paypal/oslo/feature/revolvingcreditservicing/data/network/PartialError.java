package com.paypal.oslo.feature.revolvingcreditservicing.data.network;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialError;", "", "", "fullPath", "message", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFullPath", "getMessage", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PartialError {
    public static final int $stable = 0;
    private final java.lang.String errorCode;
    private final java.lang.String fullPath;
    private final java.lang.String message;

    public PartialError(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.fullPath = str;
        this.message = str2;
        this.errorCode = str3;
    }

    public final java.lang.String getFullPath() {
        return this.fullPath;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fullPath;
        java.lang.String str2 = this.message;
        java.lang.String str3 = this.errorCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialError(fullPath=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", errorCode=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.fullPath.hashCode();
        java.lang.String str = this.message;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.errorCode;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError partialError = (com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fullPath, partialError.fullPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, partialError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, partialError.errorCode);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError copy(java.lang.String fullPath, java.lang.String message, java.lang.String errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullPath, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError(fullPath, message, errorCode);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFullPath() {
        return this.fullPath;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError partialError, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = partialError.fullPath;
        }
        if ((i & 2) != 0) {
            str2 = partialError.message;
        }
        if ((i & 4) != 0) {
            str3 = partialError.errorCode;
        }
        return partialError.copy(str, str2, str3);
    }
}
