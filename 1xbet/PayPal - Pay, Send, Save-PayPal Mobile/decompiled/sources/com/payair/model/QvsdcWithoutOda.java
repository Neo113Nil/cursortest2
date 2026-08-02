package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/payair/model/QvsdcWithoutOda;", "", "", "aip", "afl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/QvsdcWithoutOda;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAfl", "getAip"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QvsdcWithoutOda {
    public java.lang.String afl;
    public java.lang.String aip;

    /* JADX WARN: Multi-variable type inference failed */
    public QvsdcWithoutOda() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final java.lang.String getAfl() {
        return this.afl;
    }

    public final java.lang.String getAip() {
        return this.aip;
    }

    public QvsdcWithoutOda(java.lang.String str, java.lang.String str2) {
        this.aip = str;
        this.afl = str2;
    }

    public /* synthetic */ QvsdcWithoutOda(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.aip;
        java.lang.String str2 = this.afl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QvsdcWithoutOda(aip=");
        sb.append(str);
        sb.append(", afl=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.aip;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.afl;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.QvsdcWithoutOda)) {
            return false;
        }
        com.payair.model.QvsdcWithoutOda qvsdcWithoutOda = (com.payair.model.QvsdcWithoutOda) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.aip, qvsdcWithoutOda.aip) && kotlin.jvm.internal.Intrinsics.areEqual(this.afl, qvsdcWithoutOda.afl);
    }

    public final com.payair.model.QvsdcWithoutOda copy(java.lang.String aip, java.lang.String afl) {
        return new com.payair.model.QvsdcWithoutOda(aip, afl);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAfl() {
        return this.afl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAip() {
        return this.aip;
    }

    public static /* synthetic */ com.payair.model.QvsdcWithoutOda copy$default(com.payair.model.QvsdcWithoutOda qvsdcWithoutOda, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = qvsdcWithoutOda.aip;
        }
        if ((i & 2) != 0) {
            str2 = qvsdcWithoutOda.afl;
        }
        return qvsdcWithoutOda.copy(str, str2);
    }
}
