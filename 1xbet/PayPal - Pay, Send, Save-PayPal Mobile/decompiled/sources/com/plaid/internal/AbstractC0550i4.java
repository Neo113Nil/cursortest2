package com.plaid.internal;

/* renamed from: com.plaid.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC0550i4<T, U> {

    /* renamed from: com.plaid.internal.i4$a */
    public static final class a<U> extends com.plaid.internal.AbstractC0550i4 {

        /* renamed from: a, reason: collision with root package name */
        public final U f6438a;
        public final int b;

        public a(U u, int i) {
            this.f6438a = u;
            this.b = i;
        }

        public final int b() {
            return this.b;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.plaid.internal.AbstractC0550i4.a)) {
                return false;
            }
            com.plaid.internal.AbstractC0550i4.a aVar = (com.plaid.internal.AbstractC0550i4.a) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f6438a, aVar.f6438a) && this.b == aVar.b;
        }

        public final int hashCode() {
            U u = this.f6438a;
            return java.lang.Integer.hashCode(this.b) + ((u == null ? 0 : u.hashCode()) * 31);
        }

        public final java.lang.String toString() {
            U u = this.f6438a;
            int i = this.b;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(body=");
            sb.append(u);
            sb.append(", code=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.plaid.internal.i4$b */
    public static final class b extends com.plaid.internal.AbstractC0550i4 {

        /* renamed from: a, reason: collision with root package name */
        public final java.io.IOException f6439a;

        public b(java.io.IOException iOException) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iOException, "");
            this.f6439a = iOException;
        }

        public final java.io.IOException b() {
            return this.f6439a;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.plaid.internal.AbstractC0550i4.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6439a, ((com.plaid.internal.AbstractC0550i4.b) obj).f6439a);
        }

        public final int hashCode() {
            return this.f6439a.hashCode();
        }

        public final java.lang.String toString() {
            java.io.IOException iOException = this.f6439a;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(error=");
            sb.append(iOException);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.plaid.internal.i4$c */
    public static final class c<T> extends com.plaid.internal.AbstractC0550i4 {

        /* renamed from: a, reason: collision with root package name */
        public final T f6440a;

        public c(T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
            this.f6440a = t;
        }

        public final T b() {
            return this.f6440a;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.plaid.internal.AbstractC0550i4.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6440a, ((com.plaid.internal.AbstractC0550i4.c) obj).f6440a);
        }

        public final int hashCode() {
            return this.f6440a.hashCode();
        }

        public final java.lang.String toString() {
            T t = this.f6440a;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(body=");
            sb.append(t);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.plaid.internal.i4$d */
    public static final class d extends com.plaid.internal.AbstractC0550i4 {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.Throwable f6441a;

        public d(java.lang.Throwable th) {
            this.f6441a = th;
        }

        public final java.lang.Throwable b() {
            return this.f6441a;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.plaid.internal.AbstractC0550i4.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6441a, ((com.plaid.internal.AbstractC0550i4.d) obj).f6441a);
        }

        public final int hashCode() {
            java.lang.Throwable th = this.f6441a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.f6441a;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(error=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean a() {
        return !(this instanceof com.plaid.internal.AbstractC0550i4.c);
    }
}
