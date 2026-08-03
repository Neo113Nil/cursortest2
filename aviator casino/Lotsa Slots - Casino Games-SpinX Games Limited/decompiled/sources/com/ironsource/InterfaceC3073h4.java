package com.ironsource;

/* renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3073h4 {

    /* renamed from: com.ironsource.h4$a */
    public static final class a implements com.ironsource.InterfaceC3073h4 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f6283a;

        public a(boolean z) {
            this.f6283a = z;
        }

        @Override // com.ironsource.InterfaceC3073h4
        public void a() {
            com.ironsource.C3327v8.a(com.ironsource.C3083he.x, new com.ironsource.C3238q8().a(com.ironsource.B5.y, java.lang.Boolean.valueOf(this.f6283a)).a());
        }
    }

    /* renamed from: com.ironsource.h4$b */
    public static final class b implements com.ironsource.InterfaceC3073h4 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f6284a;
        private final long b;
        private final com.ironsource.InterfaceC3216p4 c;

        public b(boolean z, long j, com.ironsource.InterfaceC3216p4 currentTimeProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.f6284a = z;
            this.b = j;
            this.c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC3073h4
        public void a() {
            com.ironsource.C3238q8 a2 = new com.ironsource.C3238q8().a(com.ironsource.B5.y, java.lang.Boolean.valueOf(this.f6284a));
            if (this.b > 0) {
                a2.a(com.ironsource.B5.B, java.lang.Long.valueOf(this.c.a() - this.b));
            }
            com.ironsource.C3327v8.a(com.ironsource.C3083he.w, a2.a());
        }

        public final com.ironsource.InterfaceC3216p4 b() {
            return this.c;
        }
    }

    void a();
}
