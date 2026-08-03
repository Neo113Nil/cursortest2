package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

/* loaded from: classes5.dex */
public interface i extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g {

    public static abstract class a {
        public static final int b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7820a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a, reason: collision with other inner class name */
        public static final class C0294a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a {
            public static final int e = 8;
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h c;
            public final boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0294a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h viewModel, boolean z) {
                super(z, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.c = viewModel;
                this.d = z;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h viewModel, boolean z) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a(viewModel, z);
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h b() {
                return this.c;
            }

            public final boolean c() {
                return this.d;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h d() {
                return this.c;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a)) {
                    return false;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a c0294a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.c, c0294a.c) && this.d == c0294a.d;
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.d);
            }

            public java.lang.String toString() {
                return "Companion(viewModel=" + this.c + ", isLastAdPart=" + this.d + ')';
            }

            public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a c0294a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    hVar = c0294a.c;
                }
                if ((i & 2) != 0) {
                    z = c0294a.d;
                }
                return c0294a.a(hVar, z);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.d;
            }
        }

        public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a {
            public static final int e = 8;
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e c;
            public final boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e viewModel, boolean z) {
                super(z, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.c = viewModel;
                this.d = z;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e viewModel, boolean z) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b(viewModel, z);
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e b() {
                return this.c;
            }

            public final boolean c() {
                return this.d;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e d() {
                return this.c;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b)) {
                    return false;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.c, bVar.c) && this.d == bVar.d;
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.d);
            }

            public java.lang.String toString() {
                return "DEC(viewModel=" + this.c + ", isLastAdPart=" + this.d + ')';
            }

            public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    eVar = bVar.c;
                }
                if ((i & 2) != 0) {
                    z = bVar.d;
                }
                return bVar.a(eVar, z);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.d;
            }
        }

        public static final class c extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a {
            public static final int e = 8;
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k c;
            public final boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k viewModel, boolean z) {
                super(z, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.c = viewModel;
                this.d = z;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k viewModel, boolean z) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c(viewModel, z);
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k b() {
                return this.c;
            }

            public final boolean c() {
                return this.d;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k d() {
                return this.c;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c)) {
                    return false;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.c, cVar.c) && this.d == cVar.d;
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.d);
            }

            public java.lang.String toString() {
                return "Linear(viewModel=" + this.c + ", isLastAdPart=" + this.d + ')';
            }

            public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    kVar = cVar.c;
                }
                if ((i & 2) != 0) {
                    z = cVar.d;
                }
                return cVar.a(kVar, z);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.d;
            }
        }

        public static final class d extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a {
            public static final int e = 8;
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i c;
            public final boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i viewModel, boolean z) {
                super(z, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.c = viewModel;
                this.d = z;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i viewModel, boolean z) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.d(viewModel, z);
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i b() {
                return this.c;
            }

            public final boolean c() {
                return this.d;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i d() {
                return this.c;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.d)) {
                    return false;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.d) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.c, dVar.c) && this.d == dVar.d;
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.d);
            }

            public java.lang.String toString() {
                return "Mraid(viewModel=" + this.c + ", isLastAdPart=" + this.d + ')';
            }

            public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i iVar, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    iVar = dVar.c;
                }
                if ((i & 2) != 0) {
                    z = dVar.d;
                }
                return dVar.a(iVar, z);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.d;
            }
        }

        public /* synthetic */ a(boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        public boolean a() {
            return this.f7820a;
        }

        public a(boolean z) {
            this.f7820a = z;
        }
    }

    void A();

    kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> P();

    kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a> k();

    kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> n();

    void x();

    void z();
}
