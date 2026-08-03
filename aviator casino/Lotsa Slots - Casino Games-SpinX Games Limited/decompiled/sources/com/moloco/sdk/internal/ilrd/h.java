package com.moloco.sdk.internal.ilrd;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6993a = 0;

    public static final class a extends com.moloco.sdk.internal.ilrd.h {
        public static final int c = 0;
        public final java.lang.String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String reason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            this.b = reason;
        }

        public final java.lang.String a() {
            return this.b;
        }

        public final java.lang.String b() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.moloco.sdk.internal.ilrd.h.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.moloco.sdk.internal.ilrd.h.a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public java.lang.String toString() {
            return "Error(reason=" + this.b + ')';
        }

        public final com.moloco.sdk.internal.ilrd.h.a a(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            return new com.moloco.sdk.internal.ilrd.h.a(reason);
        }

        public static /* synthetic */ com.moloco.sdk.internal.ilrd.h.a a(com.moloco.sdk.internal.ilrd.h.a aVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = aVar.b;
            }
            return aVar.a(str);
        }
    }

    public static final class b extends com.moloco.sdk.internal.ilrd.h {
        public static final com.moloco.sdk.internal.ilrd.h.b b = new com.moloco.sdk.internal.ilrd.h.b();
        public static final int c = 0;

        public b() {
            super(null);
        }
    }

    public static final class c extends com.moloco.sdk.internal.ilrd.h {
        public static final com.moloco.sdk.internal.ilrd.h.c b = new com.moloco.sdk.internal.ilrd.h.c();
        public static final int c = 0;

        public c() {
            super(null);
        }
    }

    public /* synthetic */ h(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public h() {
    }
}
