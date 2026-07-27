package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4555ne {
    public static final a c = new a(null);
    public static final int d = 2070;
    public static final int e = 2080;
    public static final int f = 2090;
    public static final int g = 2100;
    public static final int h = 2110;

    /* renamed from: a, reason: collision with root package name */
    private final int f8456a;
    private final String b;

    /* renamed from: com.ironsource.ne$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4555ne(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f8456a = i;
        this.b = errorMessage;
    }

    public final int a() {
        return this.f8456a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.f8456a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4555ne)) {
            return false;
        }
        C4555ne c4555ne = (C4555ne) obj;
        return this.f8456a == c4555ne.f8456a && Intrinsics.areEqual(this.b, c4555ne.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f8456a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SdkError(errorCode=" + this.f8456a + ", errorMessage=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4555ne(IronSourceError error) {
        this(r0, r3);
        Intrinsics.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "error.errorMessage");
    }

    public final C4555ne a(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new C4555ne(i, errorMessage);
    }

    public static /* synthetic */ C4555ne a(C4555ne c4555ne, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c4555ne.f8456a;
        }
        if ((i2 & 2) != 0) {
            str = c4555ne.b;
        }
        return c4555ne.a(i, str);
    }
}
