package com.ironsource;

/* renamed from: com.ironsource.vg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3335vg {

    /* renamed from: com.ironsource.vg$a */
    public static final class a extends com.ironsource.AbstractC3335vg {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.AbstractC3317ug f6787a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.ironsource.AbstractC3317ug error) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            this.f6787a = error;
        }

        public final com.ironsource.AbstractC3317ug a() {
            return this.f6787a;
        }

        public final com.ironsource.AbstractC3317ug b() {
            return this.f6787a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.AbstractC3335vg.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6787a, ((com.ironsource.AbstractC3335vg.a) obj).f6787a);
        }

        public int hashCode() {
            return this.f6787a.hashCode();
        }

        public java.lang.String toString() {
            return "Failure(error=" + this.f6787a + ")";
        }

        public final com.ironsource.AbstractC3335vg.a a(com.ironsource.AbstractC3317ug error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            return new com.ironsource.AbstractC3335vg.a(error);
        }

        public static /* synthetic */ com.ironsource.AbstractC3335vg.a a(com.ironsource.AbstractC3335vg.a aVar, com.ironsource.AbstractC3317ug abstractC3317ug, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC3317ug = aVar.f6787a;
            }
            return aVar.a(abstractC3317ug);
        }
    }

    /* renamed from: com.ironsource.vg$b */
    public static final class b extends com.ironsource.AbstractC3335vg {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.AbstractC3335vg.b f6788a = new com.ironsource.AbstractC3335vg.b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC3335vg(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3335vg() {
    }
}
