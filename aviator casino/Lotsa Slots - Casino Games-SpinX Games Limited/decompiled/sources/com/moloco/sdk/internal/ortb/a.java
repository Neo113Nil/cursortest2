package com.moloco.sdk.internal.ortb;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7005a = 0;

    /* renamed from: com.moloco.sdk.internal.ortb.a$a, reason: collision with other inner class name */
    public static final class C0184a extends com.moloco.sdk.internal.ortb.a {
        public static final int c = 8;
        public final java.lang.Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0184a(java.lang.Exception cause) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
            this.b = cause;
        }

        public final java.lang.Exception a() {
            return this.b;
        }

        public final java.lang.Exception b() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.moloco.sdk.internal.ortb.a.C0184a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.moloco.sdk.internal.ortb.a.C0184a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public java.lang.String toString() {
            return "InvalidJson(cause=" + this.b + ')';
        }

        public final com.moloco.sdk.internal.ortb.a.C0184a a(java.lang.Exception cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
            return new com.moloco.sdk.internal.ortb.a.C0184a(cause);
        }

        public static /* synthetic */ com.moloco.sdk.internal.ortb.a.C0184a a(com.moloco.sdk.internal.ortb.a.C0184a c0184a, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = c0184a.b;
            }
            return c0184a.a(exc);
        }
    }

    public static final class b extends com.moloco.sdk.internal.ortb.a {
        public static final int c = 8;
        public final java.util.List<java.lang.String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.util.List<java.lang.String> fields) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "fields");
            this.b = fields;
        }

        public final java.util.List<java.lang.String> a() {
            return this.b;
        }

        public final java.util.List<java.lang.String> b() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.moloco.sdk.internal.ortb.a.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.moloco.sdk.internal.ortb.a.b) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public java.lang.String toString() {
            return "MissingRequiredFields(fields=" + this.b + ')';
        }

        public final com.moloco.sdk.internal.ortb.a.b a(java.util.List<java.lang.String> fields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "fields");
            return new com.moloco.sdk.internal.ortb.a.b(fields);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.moloco.sdk.internal.ortb.a.b a(com.moloco.sdk.internal.ortb.a.b bVar, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = bVar.b;
            }
            return bVar.a(list);
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public a() {
    }
}
