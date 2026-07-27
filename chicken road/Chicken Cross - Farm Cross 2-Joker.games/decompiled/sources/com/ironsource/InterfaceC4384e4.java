package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4384e4 {

    /* renamed from: com.ironsource.e4$a */
    public static final class a implements InterfaceC4384e4 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f8149a;

        public a(boolean z) {
            this.f8149a = z;
        }

        @Override // com.ironsource.InterfaceC4384e4
        public void a() {
            C4656t8.a(C4430ge.x, new C4567o8().a(C4761z5.y, Boolean.valueOf(this.f8149a)).a());
        }
    }

    /* renamed from: com.ironsource.e4$b */
    public static final class b implements InterfaceC4384e4 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f8150a;
        private final long b;
        private final InterfaceC4527m4 c;

        public b(boolean z, long j, InterfaceC4527m4 currentTimeProvider) {
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.f8150a = z;
            this.b = j;
            this.c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC4384e4
        public void a() {
            C4567o8 a2 = new C4567o8().a(C4761z5.y, Boolean.valueOf(this.f8150a));
            if (this.b > 0) {
                a2.a(C4761z5.B, Long.valueOf(this.c.a() - this.b));
            }
            C4656t8.a(C4430ge.w, a2.a());
        }

        public final InterfaceC4527m4 b() {
            return this.c;
        }
    }

    void a();
}
