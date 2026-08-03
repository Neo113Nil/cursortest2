package com.ironsource;

/* renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3226pe {
    public static final com.ironsource.C3226pe.a c = new com.ironsource.C3226pe.a(null);
    public static final int d = 2070;
    public static final int e = 2080;
    public static final int f = 2090;
    public static final int g = 2100;
    public static final int h = 2110;

    /* renamed from: a, reason: collision with root package name */
    private final int f6557a;
    private final java.lang.String b;

    /* renamed from: com.ironsource.pe$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3226pe(int i, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f6557a = i;
        this.b = errorMessage;
    }

    public final int a() {
        return this.f6557a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final int c() {
        return this.f6557a;
    }

    public final java.lang.String d() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3226pe)) {
            return false;
        }
        com.ironsource.C3226pe c3226pe = (com.ironsource.C3226pe) obj;
        return this.f6557a == c3226pe.f6557a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3226pe.b);
    }

    public int hashCode() {
        return (this.f6557a * 31) + this.b.hashCode();
    }

    public java.lang.String toString() {
        return "SdkError(errorCode=" + this.f6557a + ", errorMessage=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3226pe(com.ironsource.mediationsdk.logger.IronSourceError error) {
        this(r0, r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        java.lang.String errorMessage = error.getErrorMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "error.errorMessage");
    }

    public final com.ironsource.C3226pe a(int i, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new com.ironsource.C3226pe(i, errorMessage);
    }

    public static /* synthetic */ com.ironsource.C3226pe a(com.ironsource.C3226pe c3226pe, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c3226pe.f6557a;
        }
        if ((i2 & 2) != 0) {
            str = c3226pe.b;
        }
        return c3226pe.a(i, str);
    }
}
