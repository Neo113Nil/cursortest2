package com.moloco.sdk.internal.error;

/* loaded from: classes5.dex */
public final class a {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6955a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.lang.String a() {
        return this.f6955a;
    }

    public final java.lang.String b() {
        return this.f6955a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.moloco.sdk.internal.error.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6955a, ((com.moloco.sdk.internal.error.a) obj).f6955a);
    }

    public int hashCode() {
        java.lang.String str = this.f6955a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "ErrorMetadata(mtid=" + this.f6955a + ')';
    }

    public a(java.lang.String str) {
        this.f6955a = str;
    }

    public final com.moloco.sdk.internal.error.a a(java.lang.String str) {
        return new com.moloco.sdk.internal.error.a(str);
    }

    public /* synthetic */ a(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ com.moloco.sdk.internal.error.a a(com.moloco.sdk.internal.error.a aVar, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f6955a;
        }
        return aVar.a(str);
    }
}
