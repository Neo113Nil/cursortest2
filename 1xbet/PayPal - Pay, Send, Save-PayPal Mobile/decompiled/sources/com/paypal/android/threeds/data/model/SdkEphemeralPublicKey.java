package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/android/threeds/data/model/SdkEphemeralPublicKey;", "", "", "kty", "crv", "x", "y", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/SdkEphemeralPublicKey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKty", "getCrv", "getX", "getY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SdkEphemeralPublicKey {
    public static final int $stable = 0;
    private final java.lang.String crv;
    private final java.lang.String kty;
    private final java.lang.String x;
    private final java.lang.String y;

    public SdkEphemeralPublicKey(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.kty = str;
        this.crv = str2;
        this.x = str3;
        this.y = str4;
    }

    public final java.lang.String getKty() {
        return this.kty;
    }

    public final java.lang.String getCrv() {
        return this.crv;
    }

    public final java.lang.String getX() {
        return this.x;
    }

    public final java.lang.String getY() {
        return this.y;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.kty;
        java.lang.String str2 = this.crv;
        java.lang.String str3 = this.x;
        java.lang.String str4 = this.y;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkEphemeralPublicKey(kty=");
        sb.append(str);
        sb.append(", crv=");
        sb.append(str2);
        sb.append(", x=");
        sb.append(str3);
        sb.append(", y=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.kty.hashCode() * 31) + this.crv.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.SdkEphemeralPublicKey)) {
            return false;
        }
        com.paypal.android.threeds.data.model.SdkEphemeralPublicKey sdkEphemeralPublicKey = (com.paypal.android.threeds.data.model.SdkEphemeralPublicKey) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.kty, sdkEphemeralPublicKey.kty) && kotlin.jvm.internal.Intrinsics.areEqual(this.crv, sdkEphemeralPublicKey.crv) && kotlin.jvm.internal.Intrinsics.areEqual(this.x, sdkEphemeralPublicKey.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.y, sdkEphemeralPublicKey.y);
    }

    public final com.paypal.android.threeds.data.model.SdkEphemeralPublicKey copy(java.lang.String kty, java.lang.String crv, java.lang.String x, java.lang.String y) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kty, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y, "");
        return new com.paypal.android.threeds.data.model.SdkEphemeralPublicKey(kty, crv, x, y);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getY() {
        return this.y;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCrv() {
        return this.crv;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKty() {
        return this.kty;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.SdkEphemeralPublicKey copy$default(com.paypal.android.threeds.data.model.SdkEphemeralPublicKey sdkEphemeralPublicKey, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sdkEphemeralPublicKey.kty;
        }
        if ((i & 2) != 0) {
            str2 = sdkEphemeralPublicKey.crv;
        }
        if ((i & 4) != 0) {
            str3 = sdkEphemeralPublicKey.x;
        }
        if ((i & 8) != 0) {
            str4 = sdkEphemeralPublicKey.y;
        }
        return sdkEphemeralPublicKey.copy(str, str2, str3, str4);
    }
}
