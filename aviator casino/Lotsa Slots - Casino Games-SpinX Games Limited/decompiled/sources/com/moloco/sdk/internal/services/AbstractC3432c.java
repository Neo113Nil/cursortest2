package com.moloco.sdk.internal.services;

/* renamed from: com.moloco.sdk.internal.services.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3432c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7261a = 0;

    /* renamed from: com.moloco.sdk.internal.services.c$a */
    public static final class a extends com.moloco.sdk.internal.services.AbstractC3432c {
        public static final int c = 0;
        public final java.lang.String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String id) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
            this.b = id;
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
            return (obj instanceof com.moloco.sdk.internal.services.AbstractC3432c.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.moloco.sdk.internal.services.AbstractC3432c.a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public java.lang.String toString() {
            return "Available(id=" + this.b + ')';
        }

        public final com.moloco.sdk.internal.services.AbstractC3432c.a a(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
            return new com.moloco.sdk.internal.services.AbstractC3432c.a(id);
        }

        public static /* synthetic */ com.moloco.sdk.internal.services.AbstractC3432c.a a(com.moloco.sdk.internal.services.AbstractC3432c.a aVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = aVar.b;
            }
            return aVar.a(str);
        }
    }

    /* renamed from: com.moloco.sdk.internal.services.c$b */
    public static final class b extends com.moloco.sdk.internal.services.AbstractC3432c {
        public static final com.moloco.sdk.internal.services.AbstractC3432c.b b = new com.moloco.sdk.internal.services.AbstractC3432c.b();
        public static final int c = 0;

        public b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC3432c(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC3432c() {
    }
}
