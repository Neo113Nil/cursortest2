package com.ironsource;

/* loaded from: classes5.dex */
public final class P3 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.P3.c f5891a;
    private final com.ironsource.P3.a b;
    private final com.ironsource.P3.d c;
    private final com.ironsource.P3.b d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.P3.a.g f5892a;
        private final com.ironsource.P3.a.c b;
        private final com.ironsource.P3.a.b c;
        private final com.ironsource.P3.a.d d;

        /* renamed from: com.ironsource.P3$a$a, reason: collision with other inner class name */
        public interface InterfaceC0121a {
            java.util.List<com.ironsource.P3.a.e> a();
        }

        public static final class b implements com.ironsource.P3.a.InterfaceC0121a {

            /* renamed from: a, reason: collision with root package name */
            private final java.util.List<com.ironsource.P3.a.e> f5893a;
            private final java.lang.Integer b;
            private final java.lang.Long c;
            private final com.ironsource.P3.c.C0124c d;
            private final java.lang.Integer e;
            private final java.lang.Boolean f;
            private final java.lang.Long g;
            private final java.lang.Boolean h;
            private final org.json.JSONObject i;
            private final java.lang.Boolean j;
            private final java.lang.Integer k;
            private final java.lang.Integer l;
            private final java.lang.Integer m;
            private final com.ironsource.P3.a.f n;

            public b() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public final java.lang.Boolean A() {
                return this.h;
            }

            public final java.lang.Boolean B() {
                return this.j;
            }

            public final com.ironsource.P3.a.b a(java.util.List<com.ironsource.P3.a.e> list, java.lang.Integer num, java.lang.Long l, com.ironsource.P3.c.C0124c c0124c, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Long l2, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Boolean bool3, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, com.ironsource.P3.a.f fVar) {
                return new com.ironsource.P3.a.b(list, num, l, c0124c, num2, bool, l2, bool2, jSONObject, bool3, num3, num4, num5, fVar);
            }

            public final java.util.List<com.ironsource.P3.a.e> b() {
                return this.f5893a;
            }

            public final java.lang.Boolean c() {
                return this.j;
            }

            public final java.lang.Integer d() {
                return this.k;
            }

            public final java.lang.Integer e() {
                return this.l;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.a.b)) {
                    return false;
                }
                com.ironsource.P3.a.b bVar = (com.ironsource.P3.a.b) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5893a, bVar.f5893a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, bVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, bVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, bVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, bVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, bVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, bVar.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, bVar.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, bVar.j) && kotlin.jvm.internal.Intrinsics.areEqual(this.k, bVar.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.l, bVar.l) && kotlin.jvm.internal.Intrinsics.areEqual(this.m, bVar.m) && kotlin.jvm.internal.Intrinsics.areEqual(this.n, bVar.n);
            }

            public final java.lang.Integer f() {
                return this.m;
            }

            public final com.ironsource.P3.a.f g() {
                return this.n;
            }

            public final java.lang.Integer h() {
                return this.b;
            }

            public int hashCode() {
                java.util.List<com.ironsource.P3.a.e> list = this.f5893a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                java.lang.Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                java.lang.Long l = this.c;
                int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                com.ironsource.P3.c.C0124c c0124c = this.d;
                int hashCode4 = (hashCode3 + (c0124c == null ? 0 : c0124c.hashCode())) * 31;
                java.lang.Integer num2 = this.e;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                java.lang.Boolean bool = this.f;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                java.lang.Long l2 = this.g;
                int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
                java.lang.Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                org.json.JSONObject jSONObject = this.i;
                int hashCode9 = (hashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                java.lang.Boolean bool3 = this.j;
                int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                java.lang.Integer num3 = this.k;
                int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
                java.lang.Integer num4 = this.l;
                int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
                java.lang.Integer num5 = this.m;
                int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
                com.ironsource.P3.a.f fVar = this.n;
                return hashCode13 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final java.lang.Long i() {
                return this.c;
            }

            public final com.ironsource.P3.c.C0124c j() {
                return this.d;
            }

            public final java.lang.Integer k() {
                return this.e;
            }

            public final java.lang.Boolean l() {
                return this.f;
            }

            public final java.lang.Long m() {
                return this.g;
            }

            public final java.lang.Boolean n() {
                return this.h;
            }

            public final org.json.JSONObject o() {
                return this.i;
            }

            public final org.json.JSONObject p() {
                return this.i;
            }

            public final java.lang.Integer q() {
                return this.m;
            }

            public final java.lang.Integer r() {
                return this.l;
            }

            public final java.lang.Long s() {
                return this.c;
            }

            public final java.lang.Integer t() {
                return this.e;
            }

            public java.lang.String toString() {
                return "Banner(placements=" + this.f5893a + ", maxNumOfAdaptersToLoadOnStart=" + this.b + ", atim=" + this.c + ", events=" + this.d + ", bannerInterval=" + this.e + ", collectBiddingDataAsyncEnabled=" + this.f + ", collectBiddingDataTimeout=" + this.g + ", sharedManagersThread=" + this.h + ", adUnits=" + this.i + ", isOneFlow=" + this.j + ", delayLoadFailure=" + this.k + ", advancedLoading=" + this.l + ", adapterTimeOutInSeconds=" + this.m + ", providers=" + this.n + ")";
            }

            public final java.lang.Boolean u() {
                return this.f;
            }

            public final java.lang.Long v() {
                return this.g;
            }

            public final java.lang.Integer w() {
                return this.k;
            }

            public final com.ironsource.P3.c.C0124c x() {
                return this.d;
            }

            public final java.lang.Integer y() {
                return this.b;
            }

            public final com.ironsource.P3.a.f z() {
                return this.n;
            }

            public b(java.util.List<com.ironsource.P3.a.e> list, java.lang.Integer num, java.lang.Long l, com.ironsource.P3.c.C0124c c0124c, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Long l2, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Boolean bool3, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, com.ironsource.P3.a.f fVar) {
                this.f5893a = list;
                this.b = num;
                this.c = l;
                this.d = c0124c;
                this.e = num2;
                this.f = bool;
                this.g = l2;
                this.h = bool2;
                this.i = jSONObject;
                this.j = bool3;
                this.k = num3;
                this.l = num4;
                this.m = num5;
                this.n = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0121a
            public java.util.List<com.ironsource.P3.a.e> a() {
                return this.f5893a;
            }

            public /* synthetic */ b(java.util.List list, java.lang.Integer num, java.lang.Long l, com.ironsource.P3.c.C0124c c0124c, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Long l2, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Boolean bool3, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, com.ironsource.P3.a.f fVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : c0124c, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : num5, (i & 8192) == 0 ? fVar : null);
            }
        }

        public static final class c implements com.ironsource.P3.a.InterfaceC0121a {

            /* renamed from: a, reason: collision with root package name */
            private final java.util.List<com.ironsource.P3.a.e> f5894a;
            private final com.ironsource.P3.c.C0124c b;
            private final java.lang.Integer c;
            private final java.lang.Integer d;
            private final java.lang.Integer e;
            private final java.lang.Boolean f;
            private final java.lang.Long g;
            private final java.lang.Boolean h;
            private final org.json.JSONObject i;
            private final java.lang.Integer j;
            private final java.lang.Integer k;
            private final java.lang.Boolean l;
            private final java.lang.Integer m;
            private final java.lang.Integer n;
            private final com.ironsource.P3.a.f o;

            public c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, androidx.compose.ui.layout.LayoutKt.LargeDimension, null);
            }

            public final java.lang.Integer A() {
                return this.m;
            }

            public final com.ironsource.P3.a.f B() {
                return this.o;
            }

            public final java.lang.Boolean C() {
                return this.h;
            }

            public final java.lang.Boolean D() {
                return this.l;
            }

            public final com.ironsource.P3.a.c a(java.util.List<com.ironsource.P3.a.e> list, com.ironsource.P3.c.C0124c c0124c, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Integer num4, java.lang.Integer num5, java.lang.Boolean bool3, java.lang.Integer num6, java.lang.Integer num7, com.ironsource.P3.a.f fVar) {
                return new com.ironsource.P3.a.c(list, c0124c, num, num2, num3, bool, l, bool2, jSONObject, num4, num5, bool3, num6, num7, fVar);
            }

            public final java.util.List<com.ironsource.P3.a.e> b() {
                return this.f5894a;
            }

            public final java.lang.Integer c() {
                return this.j;
            }

            public final java.lang.Integer d() {
                return this.k;
            }

            public final java.lang.Boolean e() {
                return this.l;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.a.c)) {
                    return false;
                }
                com.ironsource.P3.a.c cVar = (com.ironsource.P3.a.c) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5894a, cVar.f5894a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, cVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, cVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, cVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, cVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, cVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, cVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, cVar.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, cVar.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, cVar.j) && kotlin.jvm.internal.Intrinsics.areEqual(this.k, cVar.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.l, cVar.l) && kotlin.jvm.internal.Intrinsics.areEqual(this.m, cVar.m) && kotlin.jvm.internal.Intrinsics.areEqual(this.n, cVar.n) && kotlin.jvm.internal.Intrinsics.areEqual(this.o, cVar.o);
            }

            public final java.lang.Integer f() {
                return this.m;
            }

            public final java.lang.Integer g() {
                return this.n;
            }

            public final com.ironsource.P3.a.f h() {
                return this.o;
            }

            public int hashCode() {
                java.util.List<com.ironsource.P3.a.e> list = this.f5894a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                com.ironsource.P3.c.C0124c c0124c = this.b;
                int hashCode2 = (hashCode + (c0124c == null ? 0 : c0124c.hashCode())) * 31;
                java.lang.Integer num = this.c;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                java.lang.Integer num2 = this.d;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                java.lang.Integer num3 = this.e;
                int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                java.lang.Boolean bool = this.f;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                java.lang.Long l = this.g;
                int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
                java.lang.Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                org.json.JSONObject jSONObject = this.i;
                int hashCode9 = (hashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                java.lang.Integer num4 = this.j;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                java.lang.Integer num5 = this.k;
                int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
                java.lang.Boolean bool3 = this.l;
                int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                java.lang.Integer num6 = this.m;
                int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
                java.lang.Integer num7 = this.n;
                int hashCode14 = (hashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
                com.ironsource.P3.a.f fVar = this.o;
                return hashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final com.ironsource.P3.c.C0124c i() {
                return this.b;
            }

            public final java.lang.Integer j() {
                return this.c;
            }

            public final java.lang.Integer k() {
                return this.d;
            }

            public final java.lang.Integer l() {
                return this.e;
            }

            public final java.lang.Boolean m() {
                return this.f;
            }

            public final java.lang.Long n() {
                return this.g;
            }

            public final java.lang.Boolean o() {
                return this.h;
            }

            public final org.json.JSONObject p() {
                return this.i;
            }

            public final org.json.JSONObject q() {
                return this.i;
            }

            public final java.lang.Integer r() {
                return this.d;
            }

            public final java.lang.Integer s() {
                return this.k;
            }

            public final java.lang.Integer t() {
                return this.n;
            }

            public java.lang.String toString() {
                return "Interstitial(placements=" + this.f5894a + ", events=" + this.b + ", maxNumOfAdaptersToLoadOnStart=" + this.c + ", adapterTimeOutInSeconds=" + this.d + ", delayLoadFailure=" + this.e + ", collectBiddingDataAsyncEnabled=" + this.f + ", collectBiddingDataTimeout=" + this.g + ", sharedManagersThread=" + this.h + ", adUnits=" + this.i + ", expiredDurationInMinutes=" + this.j + ", advancedLoading=" + this.k + ", isOneFlow=" + this.l + ", parallelLoad=" + this.m + ", atim=" + this.n + ", providers=" + this.o + ")";
            }

            public final java.lang.Boolean u() {
                return this.f;
            }

            public final java.lang.Long v() {
                return this.g;
            }

            public final java.lang.Integer w() {
                return this.e;
            }

            public final com.ironsource.P3.c.C0124c x() {
                return this.b;
            }

            public final java.lang.Integer y() {
                return this.j;
            }

            public final java.lang.Integer z() {
                return this.c;
            }

            public c(java.util.List<com.ironsource.P3.a.e> list, com.ironsource.P3.c.C0124c c0124c, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Integer num4, java.lang.Integer num5, java.lang.Boolean bool3, java.lang.Integer num6, java.lang.Integer num7, com.ironsource.P3.a.f fVar) {
                this.f5894a = list;
                this.b = c0124c;
                this.c = num;
                this.d = num2;
                this.e = num3;
                this.f = bool;
                this.g = l;
                this.h = bool2;
                this.i = jSONObject;
                this.j = num4;
                this.k = num5;
                this.l = bool3;
                this.m = num6;
                this.n = num7;
                this.o = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0121a
            public java.util.List<com.ironsource.P3.a.e> a() {
                return this.f5894a;
            }

            public /* synthetic */ c(java.util.List list, com.ironsource.P3.c.C0124c c0124c, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Integer num4, java.lang.Integer num5, java.lang.Boolean bool3, java.lang.Integer num6, java.lang.Integer num7, com.ironsource.P3.a.f fVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c0124c, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : num7, (i & 16384) == 0 ? fVar : null);
            }
        }

        public static final class d implements com.ironsource.P3.a.InterfaceC0121a {

            /* renamed from: a, reason: collision with root package name */
            private final java.util.List<com.ironsource.P3.a.e> f5895a;
            private final com.ironsource.P3.c.C0124c b;
            private final java.lang.Boolean c;
            private final java.lang.Long d;
            private final java.lang.Boolean e;
            private final org.json.JSONObject f;
            private final java.lang.Integer g;
            private final java.lang.Integer h;
            private final java.lang.Integer i;
            private final java.lang.Integer j;
            private final java.lang.Long k;
            private final com.ironsource.P3.a.f l;

            public d() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }

            public final com.ironsource.P3.a.d a(java.util.List<com.ironsource.P3.a.e> list, com.ironsource.P3.c.C0124c c0124c, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Long l2, com.ironsource.P3.a.f fVar) {
                return new com.ironsource.P3.a.d(list, c0124c, bool, l, bool2, jSONObject, num, num2, num3, num4, l2, fVar);
            }

            public final java.util.List<com.ironsource.P3.a.e> b() {
                return this.f5895a;
            }

            public final java.lang.Integer c() {
                return this.j;
            }

            public final java.lang.Long d() {
                return this.k;
            }

            public final com.ironsource.P3.a.f e() {
                return this.l;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.a.d)) {
                    return false;
                }
                com.ironsource.P3.a.d dVar = (com.ironsource.P3.a.d) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5895a, dVar.f5895a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, dVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, dVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, dVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, dVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, dVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, dVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, dVar.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, dVar.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, dVar.j) && kotlin.jvm.internal.Intrinsics.areEqual(this.k, dVar.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.l, dVar.l);
            }

            public final com.ironsource.P3.c.C0124c f() {
                return this.b;
            }

            public final java.lang.Boolean g() {
                return this.c;
            }

            public final java.lang.Long h() {
                return this.d;
            }

            public int hashCode() {
                java.util.List<com.ironsource.P3.a.e> list = this.f5895a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                com.ironsource.P3.c.C0124c c0124c = this.b;
                int hashCode2 = (hashCode + (c0124c == null ? 0 : c0124c.hashCode())) * 31;
                java.lang.Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                java.lang.Long l = this.d;
                int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
                java.lang.Boolean bool2 = this.e;
                int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                org.json.JSONObject jSONObject = this.f;
                int hashCode6 = (hashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                java.lang.Integer num = this.g;
                int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                java.lang.Integer num2 = this.h;
                int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
                java.lang.Integer num3 = this.i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                java.lang.Integer num4 = this.j;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                java.lang.Long l2 = this.k;
                int hashCode11 = (hashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
                com.ironsource.P3.a.f fVar = this.l;
                return hashCode11 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final java.lang.Boolean i() {
                return this.e;
            }

            public final org.json.JSONObject j() {
                return this.f;
            }

            public final java.lang.Integer k() {
                return this.g;
            }

            public final java.lang.Integer l() {
                return this.h;
            }

            public final java.lang.Integer m() {
                return this.i;
            }

            public final org.json.JSONObject n() {
                return this.f;
            }

            public final java.lang.Integer o() {
                return this.j;
            }

            public final java.lang.Integer p() {
                return this.g;
            }

            public final java.lang.Long q() {
                return this.k;
            }

            public final java.lang.Boolean r() {
                return this.c;
            }

            public final java.lang.Long s() {
                return this.d;
            }

            public final java.lang.Integer t() {
                return this.h;
            }

            public java.lang.String toString() {
                return "NativeAd(placements=" + this.f5895a + ", events=" + this.b + ", collectBiddingDataAsyncEnabled=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", sharedManagersThread=" + this.e + ", adUnits=" + this.f + ", advancedLoading=" + this.g + ", delayLoadFailure=" + this.h + ", maxNumOfAdaptersToLoadOnStart=" + this.i + ", adapterTimeOutInSeconds=" + this.j + ", atim=" + this.k + ", providers=" + this.l + ")";
            }

            public final com.ironsource.P3.c.C0124c u() {
                return this.b;
            }

            public final java.lang.Integer v() {
                return this.i;
            }

            public final com.ironsource.P3.a.f w() {
                return this.l;
            }

            public final java.lang.Boolean x() {
                return this.e;
            }

            public d(java.util.List<com.ironsource.P3.a.e> list, com.ironsource.P3.c.C0124c c0124c, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Long l2, com.ironsource.P3.a.f fVar) {
                this.f5895a = list;
                this.b = c0124c;
                this.c = bool;
                this.d = l;
                this.e = bool2;
                this.f = jSONObject;
                this.g = num;
                this.h = num2;
                this.i = num3;
                this.j = num4;
                this.k = l2;
                this.l = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0121a
            public java.util.List<com.ironsource.P3.a.e> a() {
                return this.f5895a;
            }

            public /* synthetic */ d(java.util.List list, com.ironsource.P3.c.C0124c c0124c, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Long l2, com.ironsource.P3.a.f fVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c0124c, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : jSONObject, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : l2, (i & 2048) == 0 ? fVar : null);
            }
        }

        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.Integer f5896a;
            private final java.lang.String b;
            private final java.lang.Boolean c;
            private final java.lang.String d;
            private final java.lang.Integer e;
            private final java.lang.Boolean f;
            private final com.ironsource.P3.a.e.C0122a g;
            private final com.ironsource.P3.a.e.b h;

            /* renamed from: com.ironsource.P3$a$e$a, reason: collision with other inner class name */
            public static final class C0122a {

                /* renamed from: a, reason: collision with root package name */
                private final java.lang.Boolean f5897a;
                private final java.lang.String b;
                private final java.lang.Integer c;

                public C0122a() {
                    this(null, null, null, 7, null);
                }

                public final java.lang.Boolean a() {
                    return this.f5897a;
                }

                public final java.lang.String b() {
                    return this.b;
                }

                public final java.lang.Integer c() {
                    return this.c;
                }

                public final java.lang.Boolean d() {
                    return this.f5897a;
                }

                public final java.lang.Integer e() {
                    return this.c;
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.ironsource.P3.a.e.C0122a)) {
                        return false;
                    }
                    com.ironsource.P3.a.e.C0122a c0122a = (com.ironsource.P3.a.e.C0122a) obj;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.f5897a, c0122a.f5897a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c0122a.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c0122a.c);
                }

                public final java.lang.String f() {
                    return this.b;
                }

                public int hashCode() {
                    java.lang.Boolean bool = this.f5897a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    java.lang.String str = this.b;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    java.lang.Integer num = this.c;
                    return hashCode2 + (num != null ? num.hashCode() : 0);
                }

                public java.lang.String toString() {
                    return "Capping(enabled=" + this.f5897a + ", unit=" + this.b + ", maxImpressions=" + this.c + ")";
                }

                public C0122a(java.lang.Boolean bool, java.lang.String str, java.lang.Integer num) {
                    this.f5897a = bool;
                    this.b = str;
                    this.c = num;
                }

                public final com.ironsource.P3.a.e.C0122a a(java.lang.Boolean bool, java.lang.String str, java.lang.Integer num) {
                    return new com.ironsource.P3.a.e.C0122a(bool, str, num);
                }

                public static /* synthetic */ com.ironsource.P3.a.e.C0122a a(com.ironsource.P3.a.e.C0122a c0122a, java.lang.Boolean bool, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        bool = c0122a.f5897a;
                    }
                    if ((i & 2) != 0) {
                        str = c0122a.b;
                    }
                    if ((i & 4) != 0) {
                        num = c0122a.c;
                    }
                    return c0122a.a(bool, str, num);
                }

                public /* synthetic */ C0122a(java.lang.Boolean bool, java.lang.String str, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
                }
            }

            public static final class b {

                /* renamed from: a, reason: collision with root package name */
                private final java.lang.Boolean f5898a;
                private final java.lang.Integer b;

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final java.lang.Boolean a() {
                    return this.f5898a;
                }

                public final java.lang.Integer b() {
                    return this.b;
                }

                public final java.lang.Boolean c() {
                    return this.f5898a;
                }

                public final java.lang.Integer d() {
                    return this.b;
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.ironsource.P3.a.e.b)) {
                        return false;
                    }
                    com.ironsource.P3.a.e.b bVar = (com.ironsource.P3.a.e.b) obj;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.f5898a, bVar.f5898a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b);
                }

                public int hashCode() {
                    java.lang.Boolean bool = this.f5898a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    java.lang.Integer num = this.b;
                    return hashCode + (num != null ? num.hashCode() : 0);
                }

                public java.lang.String toString() {
                    return "Pacing(enabled=" + this.f5898a + ", numOfSeconds=" + this.b + ")";
                }

                public b(java.lang.Boolean bool, java.lang.Integer num) {
                    this.f5898a = bool;
                    this.b = num;
                }

                public final com.ironsource.P3.a.e.b a(java.lang.Boolean bool, java.lang.Integer num) {
                    return new com.ironsource.P3.a.e.b(bool, num);
                }

                public /* synthetic */ b(java.lang.Boolean bool, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
                }

                public static /* synthetic */ com.ironsource.P3.a.e.b a(com.ironsource.P3.a.e.b bVar, java.lang.Boolean bool, java.lang.Integer num, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        bool = bVar.f5898a;
                    }
                    if ((i & 2) != 0) {
                        num = bVar.b;
                    }
                    return bVar.a(bool, num);
                }
            }

            public e() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            public final java.lang.Integer a() {
                return this.f5896a;
            }

            public final java.lang.String b() {
                return this.b;
            }

            public final java.lang.Boolean c() {
                return this.c;
            }

            public final java.lang.String d() {
                return this.d;
            }

            public final java.lang.Integer e() {
                return this.e;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.a.e)) {
                    return false;
                }
                com.ironsource.P3.a.e eVar = (com.ironsource.P3.a.e) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5896a, eVar.f5896a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, eVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, eVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, eVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, eVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, eVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, eVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, eVar.h);
            }

            public final java.lang.Boolean f() {
                return this.f;
            }

            public final com.ironsource.P3.a.e.C0122a g() {
                return this.g;
            }

            public final com.ironsource.P3.a.e.b h() {
                return this.h;
            }

            public int hashCode() {
                java.lang.Integer num = this.f5896a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                java.lang.String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                java.lang.Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                java.lang.String str2 = this.d;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.Integer num2 = this.e;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                java.lang.Boolean bool2 = this.f;
                int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                com.ironsource.P3.a.e.C0122a c0122a = this.g;
                int hashCode7 = (hashCode6 + (c0122a == null ? 0 : c0122a.hashCode())) * 31;
                com.ironsource.P3.a.e.b bVar = this.h;
                return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            public final com.ironsource.P3.a.e.C0122a i() {
                return this.g;
            }

            public final java.lang.Boolean j() {
                return this.f;
            }

            public final com.ironsource.P3.a.e.b k() {
                return this.h;
            }

            public final java.lang.Integer l() {
                return this.f5896a;
            }

            public final java.lang.String m() {
                return this.b;
            }

            public final java.lang.Integer n() {
                return this.e;
            }

            public final java.lang.String o() {
                return this.d;
            }

            public final java.lang.Boolean p() {
                return this.c;
            }

            public java.lang.String toString() {
                return "Placement(placementId=" + this.f5896a + ", placementName=" + this.b + ", isDefault=" + this.c + ", virtualItemName=" + this.d + ", virtualItemCount=" + this.e + ", delivery=" + this.f + ", capping=" + this.g + ", pacing=" + this.h + ")";
            }

            public e(java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num2, java.lang.Boolean bool2, com.ironsource.P3.a.e.C0122a c0122a, com.ironsource.P3.a.e.b bVar) {
                this.f5896a = num;
                this.b = str;
                this.c = bool;
                this.d = str2;
                this.e = num2;
                this.f = bool2;
                this.g = c0122a;
                this.h = bVar;
            }

            public final com.ironsource.P3.a.e a(java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num2, java.lang.Boolean bool2, com.ironsource.P3.a.e.C0122a c0122a, com.ironsource.P3.a.e.b bVar) {
                return new com.ironsource.P3.a.e(num, str, bool, str2, num2, bool2, c0122a, bVar);
            }

            public /* synthetic */ e(java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num2, java.lang.Boolean bool2, com.ironsource.P3.a.e.C0122a c0122a, com.ironsource.P3.a.e.b bVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c0122a, (i & 128) == 0 ? bVar : null);
            }
        }

        public static final class f {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.Boolean f5899a;
            private final java.lang.Boolean b;

            /* JADX WARN: Multi-variable type inference failed */
            public f() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final java.lang.Boolean a() {
                return this.f5899a;
            }

            public final java.lang.Boolean b() {
                return this.b;
            }

            public final java.lang.Boolean c() {
                return this.f5899a;
            }

            public final java.lang.Boolean d() {
                return this.b;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.a.f)) {
                    return false;
                }
                com.ironsource.P3.a.f fVar = (com.ironsource.P3.a.f) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5899a, fVar.f5899a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, fVar.b);
            }

            public int hashCode() {
                java.lang.Boolean bool = this.f5899a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                java.lang.Boolean bool2 = this.b;
                return hashCode + (bool2 != null ? bool2.hashCode() : 0);
            }

            public java.lang.String toString() {
                return "Providers(parallelInit=" + this.f5899a + ", waitUntilAllProvidersFinishInit=" + this.b + ")";
            }

            public f(java.lang.Boolean bool, java.lang.Boolean bool2) {
                this.f5899a = bool;
                this.b = bool2;
            }

            public final com.ironsource.P3.a.f a(java.lang.Boolean bool, java.lang.Boolean bool2) {
                return new com.ironsource.P3.a.f(bool, bool2);
            }

            public static /* synthetic */ com.ironsource.P3.a.f a(com.ironsource.P3.a.f fVar, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    bool = fVar.f5899a;
                }
                if ((i & 2) != 0) {
                    bool2 = fVar.b;
                }
                return fVar.a(bool, bool2);
            }

            public /* synthetic */ f(java.lang.Boolean bool, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
            }
        }

        public static final class g implements com.ironsource.P3.a.InterfaceC0121a {

            /* renamed from: a, reason: collision with root package name */
            private final java.util.List<com.ironsource.P3.a.e> f5900a;
            private final java.lang.Integer b;
            private final java.lang.Integer c;
            private final java.lang.Integer d;
            private final java.lang.Integer e;
            private final java.lang.Integer f;
            private final java.lang.Boolean g;
            private final java.lang.Long h;
            private final java.lang.Boolean i;
            private final org.json.JSONObject j;
            private final java.lang.Integer k;
            private final java.lang.Boolean l;
            private final java.lang.Integer m;
            private final java.lang.Integer n;
            private final com.ironsource.P3.a.f o;

            public g() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, androidx.compose.ui.layout.LayoutKt.LargeDimension, null);
            }

            public final java.lang.Integer A() {
                return this.m;
            }

            public final com.ironsource.P3.a.f B() {
                return this.o;
            }

            public final java.lang.Boolean C() {
                return this.i;
            }

            public final java.lang.Boolean D() {
                return this.l;
            }

            public final com.ironsource.P3.a.g a(java.util.List<com.ironsource.P3.a.e> list, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Integer num6, java.lang.Boolean bool3, java.lang.Integer num7, java.lang.Integer num8, com.ironsource.P3.a.f fVar) {
                return new com.ironsource.P3.a.g(list, num, num2, num3, num4, num5, bool, l, bool2, jSONObject, num6, bool3, num7, num8, fVar);
            }

            public final java.util.List<com.ironsource.P3.a.e> b() {
                return this.f5900a;
            }

            public final org.json.JSONObject c() {
                return this.j;
            }

            public final java.lang.Integer d() {
                return this.k;
            }

            public final java.lang.Boolean e() {
                return this.l;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.a.g)) {
                    return false;
                }
                com.ironsource.P3.a.g gVar = (com.ironsource.P3.a.g) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5900a, gVar.f5900a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, gVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, gVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, gVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, gVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, gVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, gVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, gVar.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, gVar.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, gVar.j) && kotlin.jvm.internal.Intrinsics.areEqual(this.k, gVar.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.l, gVar.l) && kotlin.jvm.internal.Intrinsics.areEqual(this.m, gVar.m) && kotlin.jvm.internal.Intrinsics.areEqual(this.n, gVar.n) && kotlin.jvm.internal.Intrinsics.areEqual(this.o, gVar.o);
            }

            public final java.lang.Integer f() {
                return this.m;
            }

            public final java.lang.Integer g() {
                return this.n;
            }

            public final com.ironsource.P3.a.f h() {
                return this.o;
            }

            public int hashCode() {
                java.util.List<com.ironsource.P3.a.e> list = this.f5900a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                java.lang.Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                java.lang.Integer num2 = this.c;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                java.lang.Integer num3 = this.d;
                int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
                java.lang.Integer num4 = this.e;
                int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
                java.lang.Integer num5 = this.f;
                int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
                java.lang.Boolean bool = this.g;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                java.lang.Long l = this.h;
                int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
                java.lang.Boolean bool2 = this.i;
                int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                org.json.JSONObject jSONObject = this.j;
                int hashCode10 = (hashCode9 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                java.lang.Integer num6 = this.k;
                int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
                java.lang.Boolean bool3 = this.l;
                int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                java.lang.Integer num7 = this.m;
                int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
                java.lang.Integer num8 = this.n;
                int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
                com.ironsource.P3.a.f fVar = this.o;
                return hashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final java.lang.Integer i() {
                return this.b;
            }

            public final java.lang.Integer j() {
                return this.c;
            }

            public final java.lang.Integer k() {
                return this.d;
            }

            public final java.lang.Integer l() {
                return this.e;
            }

            public final java.lang.Integer m() {
                return this.f;
            }

            public final java.lang.Boolean n() {
                return this.g;
            }

            public final java.lang.Long o() {
                return this.h;
            }

            public final java.lang.Boolean p() {
                return this.i;
            }

            public final org.json.JSONObject q() {
                return this.j;
            }

            public final java.lang.Integer r() {
                return this.c;
            }

            public final java.lang.Integer s() {
                return this.e;
            }

            public final java.lang.Integer t() {
                return this.n;
            }

            public java.lang.String toString() {
                return "Rewarded(placements=" + this.f5900a + ", maxNumOfAdaptersToLoadOnStart=" + this.b + ", adapterTimeOutInSeconds=" + this.c + ", loadRVInterval=" + this.d + ", advancedLoading=" + this.e + ", expiredDurationInMinutes=" + this.f + ", collectBiddingDataAsyncEnabled=" + this.g + ", collectBiddingDataTimeout=" + this.h + ", sharedManagersThread=" + this.i + ", adUnits=" + this.j + ", delayLoadFailure=" + this.k + ", isOneFlow=" + this.l + ", parallelLoad=" + this.m + ", atim=" + this.n + ", providers=" + this.o + ")";
            }

            public final java.lang.Boolean u() {
                return this.g;
            }

            public final java.lang.Long v() {
                return this.h;
            }

            public final java.lang.Integer w() {
                return this.k;
            }

            public final java.lang.Integer x() {
                return this.f;
            }

            public final java.lang.Integer y() {
                return this.d;
            }

            public final java.lang.Integer z() {
                return this.b;
            }

            public g(java.util.List<com.ironsource.P3.a.e> list, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Integer num6, java.lang.Boolean bool3, java.lang.Integer num7, java.lang.Integer num8, com.ironsource.P3.a.f fVar) {
                this.f5900a = list;
                this.b = num;
                this.c = num2;
                this.d = num3;
                this.e = num4;
                this.f = num5;
                this.g = bool;
                this.h = l;
                this.i = bool2;
                this.j = jSONObject;
                this.k = num6;
                this.l = bool3;
                this.m = num7;
                this.n = num8;
                this.o = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0121a
            public java.util.List<com.ironsource.P3.a.e> a() {
                return this.f5900a;
            }

            public /* synthetic */ g(java.util.List list, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, org.json.JSONObject jSONObject, java.lang.Integer num6, java.lang.Boolean bool3, java.lang.Integer num7, java.lang.Integer num8, com.ironsource.P3.a.f fVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : jSONObject, (i & 1024) != 0 ? null : num6, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num7, (i & 8192) != 0 ? null : num8, (i & 16384) == 0 ? fVar : null);
            }
        }

        public a() {
            this(null, null, null, null, 15, null);
        }

        public final com.ironsource.P3.a.g a() {
            return this.f5892a;
        }

        public final com.ironsource.P3.a.c b() {
            return this.b;
        }

        public final com.ironsource.P3.a.b c() {
            return this.c;
        }

        public final com.ironsource.P3.a.d d() {
            return this.d;
        }

        public final com.ironsource.P3.a.b e() {
            return this.c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.P3.a)) {
                return false;
            }
            com.ironsource.P3.a aVar = (com.ironsource.P3.a) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f5892a, aVar.f5892a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, aVar.d);
        }

        public final com.ironsource.P3.a.c f() {
            return this.b;
        }

        public final com.ironsource.P3.a.d g() {
            return this.d;
        }

        public final com.ironsource.P3.a.g h() {
            return this.f5892a;
        }

        public int hashCode() {
            com.ironsource.P3.a.g gVar = this.f5892a;
            int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            com.ironsource.P3.a.c cVar = this.b;
            int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            com.ironsource.P3.a.b bVar = this.c;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            com.ironsource.P3.a.d dVar = this.d;
            return hashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "AdFormats(rewarded=" + this.f5892a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
        }

        public a(com.ironsource.P3.a.g gVar, com.ironsource.P3.a.c cVar, com.ironsource.P3.a.b bVar, com.ironsource.P3.a.d dVar) {
            this.f5892a = gVar;
            this.b = cVar;
            this.c = bVar;
            this.d = dVar;
        }

        public final com.ironsource.P3.a a(com.ironsource.P3.a.g gVar, com.ironsource.P3.a.c cVar, com.ironsource.P3.a.b bVar, com.ironsource.P3.a.d dVar) {
            return new com.ironsource.P3.a(gVar, cVar, bVar, dVar);
        }

        public static /* synthetic */ com.ironsource.P3.a a(com.ironsource.P3.a aVar, com.ironsource.P3.a.g gVar, com.ironsource.P3.a.c cVar, com.ironsource.P3.a.b bVar, com.ironsource.P3.a.d dVar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                gVar = aVar.f5892a;
            }
            if ((i & 2) != 0) {
                cVar = aVar.b;
            }
            if ((i & 4) != 0) {
                bVar = aVar.c;
            }
            if ((i & 8) != 0) {
                dVar = aVar.d;
            }
            return aVar.a(gVar, cVar, bVar, dVar);
        }

        public /* synthetic */ a(com.ironsource.P3.a.g gVar, com.ironsource.P3.a.c cVar, com.ironsource.P3.a.b bVar, com.ironsource.P3.a.d dVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gVar, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : dVar);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.Integer f5901a;
        private final java.lang.String b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final java.lang.Integer a() {
            return this.f5901a;
        }

        public final java.lang.String b() {
            return this.b;
        }

        public final java.lang.String c() {
            return this.b;
        }

        public final java.lang.Integer d() {
            return this.f5901a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.P3.b)) {
                return false;
            }
            com.ironsource.P3.b bVar = (com.ironsource.P3.b) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f5901a, bVar.f5901a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            java.lang.Integer num = this.f5901a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            java.lang.String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "AdQuality(initMode=" + this.f5901a + ", adqInitBlob=" + this.b + ")";
        }

        public b(java.lang.Integer num, java.lang.String str) {
            this.f5901a = num;
            this.b = str;
        }

        public final com.ironsource.P3.b a(java.lang.Integer num, java.lang.String str) {
            return new com.ironsource.P3.b(num, str);
        }

        public /* synthetic */ b(java.lang.Integer num, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
        }

        public static /* synthetic */ com.ironsource.P3.b a(com.ironsource.P3.b bVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = bVar.f5901a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            return bVar.a(num, str);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.P3.c.e f5902a;
        private final com.ironsource.P3.c.C0124c b;
        private final com.ironsource.P3.c.h c;
        private final com.ironsource.P3.c.f d;
        private final com.ironsource.P3.c.a e;
        private final com.ironsource.P3.c.b f;
        private final com.ironsource.P3.c.g g;
        private final com.ironsource.P3.c.d h;
        private final java.lang.Boolean i;
        private final java.lang.Boolean j;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.String f5903a;
            private final java.lang.String b;
            private final java.lang.String c;
            private final java.lang.Integer d;
            private final java.lang.Long e;
            private final java.lang.Integer f;
            private final java.lang.Boolean g;
            private final java.lang.Boolean h;
            private final java.lang.Integer i;
            private final java.lang.Boolean j;
            private final com.ironsource.P3.c.a.C0123a k;
            private final com.ironsource.P3.c.a.C0123a l;
            private final com.ironsource.P3.c.a.C0123a m;
            private final com.ironsource.P3.c.a.C0123a n;

            /* renamed from: com.ironsource.P3$c$a$a, reason: collision with other inner class name */
            public static final class C0123a {

                /* renamed from: a, reason: collision with root package name */
                private final java.lang.Boolean f5904a;
                private final java.lang.Integer b;
                private final java.lang.Boolean c;
                private final java.lang.Integer d;
                private final java.lang.Integer e;
                private final java.lang.Boolean f;
                private final java.lang.Boolean g;
                private final java.lang.Integer h;
                private final java.lang.Integer i;
                private final java.lang.Boolean j;

                public C0123a() {
                    this(null, null, null, null, null, null, null, null, null, null, 1023, null);
                }

                public final java.lang.Boolean a() {
                    return this.f5904a;
                }

                public final java.lang.Boolean b() {
                    return this.j;
                }

                public final java.lang.Integer c() {
                    return this.b;
                }

                public final java.lang.Boolean d() {
                    return this.c;
                }

                public final java.lang.Integer e() {
                    return this.d;
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.ironsource.P3.c.a.C0123a)) {
                        return false;
                    }
                    com.ironsource.P3.c.a.C0123a c0123a = (com.ironsource.P3.c.a.C0123a) obj;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.f5904a, c0123a.f5904a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c0123a.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c0123a.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c0123a.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c0123a.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c0123a.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c0123a.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, c0123a.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, c0123a.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, c0123a.j);
                }

                public final java.lang.Integer f() {
                    return this.e;
                }

                public final java.lang.Boolean g() {
                    return this.f;
                }

                public final java.lang.Boolean h() {
                    return this.g;
                }

                public int hashCode() {
                    java.lang.Boolean bool = this.f5904a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    java.lang.Integer num = this.b;
                    int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                    java.lang.Boolean bool2 = this.c;
                    int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    java.lang.Integer num2 = this.d;
                    int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    java.lang.Integer num3 = this.e;
                    int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    java.lang.Boolean bool3 = this.f;
                    int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    java.lang.Boolean bool4 = this.g;
                    int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                    java.lang.Integer num4 = this.h;
                    int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
                    java.lang.Integer num5 = this.i;
                    int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
                    java.lang.Boolean bool5 = this.j;
                    return hashCode9 + (bool5 != null ? bool5.hashCode() : 0);
                }

                public final java.lang.Integer i() {
                    return this.h;
                }

                public final java.lang.Integer j() {
                    return this.i;
                }

                public final java.lang.Integer k() {
                    return this.d;
                }

                public final java.lang.Boolean l() {
                    return this.j;
                }

                public final java.lang.Integer m() {
                    return this.b;
                }

                public final java.lang.Boolean n() {
                    return this.c;
                }

                public final java.lang.Boolean o() {
                    return this.f5904a;
                }

                public final java.lang.Integer p() {
                    return this.h;
                }

                public final java.lang.Integer q() {
                    return this.e;
                }

                public final java.lang.Integer r() {
                    return this.i;
                }

                public final java.lang.Boolean s() {
                    return this.f;
                }

                public final java.lang.Boolean t() {
                    return this.g;
                }

                public java.lang.String toString() {
                    return "AdFormatAuction(programmatic=" + this.f5904a + ", minTimeBeforeFirstAuction=" + this.b + ", objectPerWaterfall=" + this.c + ", auctionRetryInterval=" + this.d + ", timeToWaitBeforeAuction=" + this.e + ", isAuctionOnShowStart=" + this.f + ", isLoadWhileShow=" + this.g + ", timeToDeleteOldWaterfallAfterAuction=" + this.h + ", timeToWaitBeforeLoad=" + this.i + ", enableAuctionFallback=" + this.j + ")";
                }

                public C0123a(java.lang.Boolean bool, java.lang.Integer num, java.lang.Boolean bool2, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Integer num4, java.lang.Integer num5, java.lang.Boolean bool5) {
                    this.f5904a = bool;
                    this.b = num;
                    this.c = bool2;
                    this.d = num2;
                    this.e = num3;
                    this.f = bool3;
                    this.g = bool4;
                    this.h = num4;
                    this.i = num5;
                    this.j = bool5;
                }

                public final com.ironsource.P3.c.a.C0123a a(java.lang.Boolean bool, java.lang.Integer num, java.lang.Boolean bool2, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Integer num4, java.lang.Integer num5, java.lang.Boolean bool5) {
                    return new com.ironsource.P3.c.a.C0123a(bool, num, bool2, num2, num3, bool3, bool4, num4, num5, bool5);
                }

                public /* synthetic */ C0123a(java.lang.Boolean bool, java.lang.Integer num, java.lang.Boolean bool2, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Integer num4, java.lang.Integer num5, java.lang.Boolean bool5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : num5, (i & 512) == 0 ? bool5 : null);
                }
            }

            public a() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public final com.ironsource.P3.c.a.C0123a A() {
                return this.k;
            }

            public final java.lang.Boolean B() {
                return this.j;
            }

            public final java.lang.String a() {
                return this.f5903a;
            }

            public final java.lang.Boolean b() {
                return this.j;
            }

            public final com.ironsource.P3.c.a.C0123a c() {
                return this.k;
            }

            public final com.ironsource.P3.c.a.C0123a d() {
                return this.l;
            }

            public final com.ironsource.P3.c.a.C0123a e() {
                return this.m;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.c.a)) {
                    return false;
                }
                com.ironsource.P3.c.a aVar = (com.ironsource.P3.c.a) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5903a, aVar.f5903a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, aVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, aVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, aVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, aVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, aVar.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, aVar.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, aVar.j) && kotlin.jvm.internal.Intrinsics.areEqual(this.k, aVar.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.l, aVar.l) && kotlin.jvm.internal.Intrinsics.areEqual(this.m, aVar.m) && kotlin.jvm.internal.Intrinsics.areEqual(this.n, aVar.n);
            }

            public final com.ironsource.P3.c.a.C0123a f() {
                return this.n;
            }

            public final java.lang.String g() {
                return this.b;
            }

            public final java.lang.String h() {
                return this.c;
            }

            public int hashCode() {
                java.lang.String str = this.f5903a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                java.lang.Integer num = this.d;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                java.lang.Long l = this.e;
                int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
                java.lang.Integer num2 = this.f;
                int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                java.lang.Boolean bool = this.g;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                java.lang.Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                java.lang.Integer num3 = this.i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                java.lang.Boolean bool3 = this.j;
                int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                com.ironsource.P3.c.a.C0123a c0123a = this.k;
                int hashCode11 = (hashCode10 + (c0123a == null ? 0 : c0123a.hashCode())) * 31;
                com.ironsource.P3.c.a.C0123a c0123a2 = this.l;
                int hashCode12 = (hashCode11 + (c0123a2 == null ? 0 : c0123a2.hashCode())) * 31;
                com.ironsource.P3.c.a.C0123a c0123a3 = this.m;
                int hashCode13 = (hashCode12 + (c0123a3 == null ? 0 : c0123a3.hashCode())) * 31;
                com.ironsource.P3.c.a.C0123a c0123a4 = this.n;
                return hashCode13 + (c0123a4 != null ? c0123a4.hashCode() : 0);
            }

            public final java.lang.Integer i() {
                return this.d;
            }

            public final java.lang.Long j() {
                return this.e;
            }

            public final java.lang.Integer k() {
                return this.f;
            }

            public final java.lang.Boolean l() {
                return this.g;
            }

            public final java.lang.Boolean m() {
                return this.h;
            }

            public final java.lang.Integer n() {
                return this.i;
            }

            public final java.lang.String o() {
                return this.f5903a;
            }

            public final java.lang.Integer p() {
                return this.f;
            }

            public final java.lang.Long q() {
                return this.e;
            }

            public final java.lang.Integer r() {
                return this.d;
            }

            public final java.lang.String s() {
                return this.b;
            }

            public final com.ironsource.P3.c.a.C0123a t() {
                return this.m;
            }

            public java.lang.String toString() {
                return "Auction(auctionData=" + this.f5903a + ", auctioneerURL=" + this.b + ", extAuctioneerURL=" + this.c + ", auctionTrials=" + this.d + ", auctionTimeout=" + this.e + ", auctionSavedHistory=" + this.f + ", compressAuctionRequest=" + this.g + ", compressAuctionResponse=" + this.h + ", encryptionVersion=" + this.i + ", tokenPerAdapter=" + this.j + ", rewarded=" + this.k + ", interstitial=" + this.l + ", banner=" + this.m + ", nativeAd=" + this.n + ")";
            }

            public final java.lang.Boolean u() {
                return this.g;
            }

            public final java.lang.Boolean v() {
                return this.h;
            }

            public final java.lang.Integer w() {
                return this.i;
            }

            public final java.lang.String x() {
                return this.c;
            }

            public final com.ironsource.P3.c.a.C0123a y() {
                return this.l;
            }

            public final com.ironsource.P3.c.a.C0123a z() {
                return this.n;
            }

            public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Long l, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num3, java.lang.Boolean bool3, com.ironsource.P3.c.a.C0123a c0123a, com.ironsource.P3.c.a.C0123a c0123a2, com.ironsource.P3.c.a.C0123a c0123a3, com.ironsource.P3.c.a.C0123a c0123a4) {
                this.f5903a = str;
                this.b = str2;
                this.c = str3;
                this.d = num;
                this.e = l;
                this.f = num2;
                this.g = bool;
                this.h = bool2;
                this.i = num3;
                this.j = bool3;
                this.k = c0123a;
                this.l = c0123a2;
                this.m = c0123a3;
                this.n = c0123a4;
            }

            public final com.ironsource.P3.c.a a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Long l, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num3, java.lang.Boolean bool3, com.ironsource.P3.c.a.C0123a c0123a, com.ironsource.P3.c.a.C0123a c0123a2, com.ironsource.P3.c.a.C0123a c0123a3, com.ironsource.P3.c.a.C0123a c0123a4) {
                return new com.ironsource.P3.c.a(str, str2, str3, num, l, num2, bool, bool2, num3, bool3, c0123a, c0123a2, c0123a3, c0123a4);
            }

            public /* synthetic */ a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Long l, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num3, java.lang.Boolean bool3, com.ironsource.P3.c.a.C0123a c0123a, com.ironsource.P3.c.a.C0123a c0123a2, com.ironsource.P3.c.a.C0123a c0123a3, com.ironsource.P3.c.a.C0123a c0123a4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : c0123a, (i & 2048) != 0 ? null : c0123a2, (i & 4096) != 0 ? null : c0123a3, (i & 8192) == 0 ? c0123a4 : null);
            }
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.Boolean f5905a;
            private final java.lang.String b;
            private final java.lang.String c;
            private final java.lang.Boolean d;
            private final java.lang.Integer e;
            private final java.lang.Boolean f;
            private final java.util.List<java.lang.String> g;

            public b() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            public final java.lang.Boolean a() {
                return this.f5905a;
            }

            public final java.lang.String b() {
                return this.b;
            }

            public final java.lang.String c() {
                return this.c;
            }

            public final java.lang.Boolean d() {
                return this.d;
            }

            public final java.lang.Integer e() {
                return this.e;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.c.b)) {
                    return false;
                }
                com.ironsource.P3.c.b bVar = (com.ironsource.P3.c.b) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5905a, bVar.f5905a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, bVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, bVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, bVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, bVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, bVar.g);
            }

            public final java.lang.Boolean f() {
                return this.f;
            }

            public final java.util.List<java.lang.String> g() {
                return this.g;
            }

            public final java.lang.Boolean h() {
                return this.f5905a;
            }

            public int hashCode() {
                java.lang.Boolean bool = this.f5905a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                java.lang.String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                java.lang.String str2 = this.c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                java.lang.Integer num = this.e;
                int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                java.lang.Boolean bool3 = this.f;
                int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                java.util.List<java.lang.String> list = this.g;
                return hashCode6 + (list != null ? list.hashCode() : 0);
            }

            public final java.lang.Boolean i() {
                return this.d;
            }

            public final java.util.List<java.lang.String> j() {
                return this.g;
            }

            public final java.lang.String k() {
                return this.c;
            }

            public final java.lang.String l() {
                return this.b;
            }

            public final java.lang.Boolean m() {
                return this.f;
            }

            public final java.lang.Integer n() {
                return this.e;
            }

            public java.lang.String toString() {
                return "CrashReporter(enabled=" + this.f5905a + ", reporterURL=" + this.b + ", reporterKeyword=" + this.c + ", includeANR=" + this.d + ", timeout=" + this.e + ", setIgnoreDebugger=" + this.f + ", keysToInclude=" + this.g + ")";
            }

            public b(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.Boolean bool2, java.lang.Integer num, java.lang.Boolean bool3, java.util.List<java.lang.String> list) {
                this.f5905a = bool;
                this.b = str;
                this.c = str2;
                this.d = bool2;
                this.e = num;
                this.f = bool3;
                this.g = list;
            }

            public final com.ironsource.P3.c.b a(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.Boolean bool2, java.lang.Integer num, java.lang.Boolean bool3, java.util.List<java.lang.String> list) {
                return new com.ironsource.P3.c.b(bool, str, str2, bool2, num, bool3, list);
            }

            public static /* synthetic */ com.ironsource.P3.c.b a(com.ironsource.P3.c.b bVar, java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.Boolean bool2, java.lang.Integer num, java.lang.Boolean bool3, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    bool = bVar.f5905a;
                }
                if ((i & 2) != 0) {
                    str = bVar.b;
                }
                java.lang.String str3 = str;
                if ((i & 4) != 0) {
                    str2 = bVar.c;
                }
                java.lang.String str4 = str2;
                if ((i & 8) != 0) {
                    bool2 = bVar.d;
                }
                java.lang.Boolean bool4 = bool2;
                if ((i & 16) != 0) {
                    num = bVar.e;
                }
                java.lang.Integer num2 = num;
                if ((i & 32) != 0) {
                    bool3 = bVar.f;
                }
                java.lang.Boolean bool5 = bool3;
                if ((i & 64) != 0) {
                    list = bVar.g;
                }
                return bVar.a(bool, str3, str4, bool4, num2, bool5, list);
            }

            public /* synthetic */ b(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.Boolean bool2, java.lang.Integer num, java.lang.Boolean bool3, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : list);
            }
        }

        /* renamed from: com.ironsource.P3$c$c, reason: collision with other inner class name */
        public static final class C0124c {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.Boolean f5906a;
            private final java.lang.Boolean b;
            private final java.lang.Boolean c;
            private final java.lang.Integer d;
            private final java.lang.String e;
            private final java.lang.String f;
            private final java.lang.Integer g;
            private final java.lang.Integer h;
            private final java.lang.Integer i;
            private final java.util.List<java.lang.Integer> j;
            private final java.util.List<java.lang.Integer> k;
            private final java.util.List<java.lang.Integer> l;
            private final java.util.List<java.lang.Integer> m;
            private final org.json.JSONObject n;
            private final com.ironsource.P3.c.C0124c.a o;
            private final java.lang.String p;

            /* renamed from: com.ironsource.P3$c$c$a */
            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                private final java.lang.String f5907a;
                private final java.lang.Boolean b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final java.lang.String a() {
                    return this.f5907a;
                }

                public final java.lang.Boolean b() {
                    return this.b;
                }

                public final java.lang.Boolean c() {
                    return this.b;
                }

                public final java.lang.String d() {
                    return this.f5907a;
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.ironsource.P3.c.C0124c.a)) {
                        return false;
                    }
                    com.ironsource.P3.c.C0124c.a aVar = (com.ironsource.P3.c.C0124c.a) obj;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.f5907a, aVar.f5907a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b);
                }

                public int hashCode() {
                    java.lang.String str = this.f5907a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    java.lang.Boolean bool = this.b;
                    return hashCode + (bool != null ? bool.hashCode() : 0);
                }

                public java.lang.String toString() {
                    return "Pixel(pixelEventsUrl=" + this.f5907a + ", pixelEventsEnabled=" + this.b + ")";
                }

                public a(java.lang.String str, java.lang.Boolean bool) {
                    this.f5907a = str;
                    this.b = bool;
                }

                public final com.ironsource.P3.c.C0124c.a a(java.lang.String str, java.lang.Boolean bool) {
                    return new com.ironsource.P3.c.C0124c.a(str, bool);
                }

                public /* synthetic */ a(java.lang.String str, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
                }

                public static /* synthetic */ com.ironsource.P3.c.C0124c.a a(com.ironsource.P3.c.C0124c.a aVar, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.f5907a;
                    }
                    if ((i & 2) != 0) {
                        bool = aVar.b;
                    }
                    return aVar.a(str, bool);
                }
            }

            public C0124c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
            }

            public final com.ironsource.P3.c.C0124c.a A() {
                return this.o;
            }

            public final java.lang.Boolean B() {
                return this.b;
            }

            public final java.lang.Boolean C() {
                return this.f5906a;
            }

            public final java.lang.String D() {
                return this.f;
            }

            public final java.lang.String E() {
                return this.e;
            }

            public final java.util.List<java.lang.Integer> F() {
                return this.l;
            }

            public final java.lang.Boolean a() {
                return this.f5906a;
            }

            public final java.util.List<java.lang.Integer> b() {
                return this.j;
            }

            public final java.util.List<java.lang.Integer> c() {
                return this.k;
            }

            public final java.util.List<java.lang.Integer> d() {
                return this.l;
            }

            public final java.util.List<java.lang.Integer> e() {
                return this.m;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.c.C0124c)) {
                    return false;
                }
                com.ironsource.P3.c.C0124c c0124c = (com.ironsource.P3.c.C0124c) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5906a, c0124c.f5906a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c0124c.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c0124c.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c0124c.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c0124c.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c0124c.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c0124c.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, c0124c.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, c0124c.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, c0124c.j) && kotlin.jvm.internal.Intrinsics.areEqual(this.k, c0124c.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.l, c0124c.l) && kotlin.jvm.internal.Intrinsics.areEqual(this.m, c0124c.m) && kotlin.jvm.internal.Intrinsics.areEqual(this.n, c0124c.n) && kotlin.jvm.internal.Intrinsics.areEqual(this.o, c0124c.o) && kotlin.jvm.internal.Intrinsics.areEqual(this.p, c0124c.p);
            }

            public final org.json.JSONObject f() {
                return this.n;
            }

            public final com.ironsource.P3.c.C0124c.a g() {
                return this.o;
            }

            public final java.lang.String h() {
                return this.p;
            }

            public int hashCode() {
                java.lang.Boolean bool = this.f5906a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                java.lang.Boolean bool2 = this.b;
                int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                java.lang.Boolean bool3 = this.c;
                int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                java.lang.Integer num = this.d;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                java.lang.String str = this.e;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                java.lang.String str2 = this.f;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.Integer num2 = this.g;
                int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                java.lang.Integer num3 = this.h;
                int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
                java.lang.Integer num4 = this.i;
                int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
                java.util.List<java.lang.Integer> list = this.j;
                int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
                java.util.List<java.lang.Integer> list2 = this.k;
                int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
                java.util.List<java.lang.Integer> list3 = this.l;
                int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
                java.util.List<java.lang.Integer> list4 = this.m;
                int hashCode13 = (hashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
                org.json.JSONObject jSONObject = this.n;
                int hashCode14 = (hashCode13 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                com.ironsource.P3.c.C0124c.a aVar = this.o;
                int hashCode15 = (hashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                java.lang.String str3 = this.p;
                return hashCode15 + (str3 != null ? str3.hashCode() : 0);
            }

            public final java.lang.Boolean i() {
                return this.b;
            }

            public final java.lang.Boolean j() {
                return this.c;
            }

            public final java.lang.Integer k() {
                return this.d;
            }

            public final java.lang.String l() {
                return this.e;
            }

            public final java.lang.String m() {
                return this.f;
            }

            public final java.lang.Integer n() {
                return this.g;
            }

            public final java.lang.Integer o() {
                return this.h;
            }

            public final java.lang.Integer p() {
                return this.i;
            }

            public final java.lang.String q() {
                return this.p;
            }

            public final java.lang.Integer r() {
                return this.g;
            }

            public final java.lang.Boolean s() {
                return this.c;
            }

            public final java.lang.Integer t() {
                return this.d;
            }

            public java.lang.String toString() {
                return "Events(sendUltraEvents=" + this.f5906a + ", sendEventsToggle=" + this.b + ", eventsCompression=" + this.c + ", eventsCompressionLevel=" + this.d + ", serverEventsURL=" + this.e + ", serverEventsType=" + this.f + ", backupThreshold=" + this.g + ", maxNumberOfEvents=" + this.h + ", maxEventsPerBatch=" + this.i + ", optOut=" + this.j + ", optIn=" + this.k + ", triggerEvents=" + this.l + ", nonConnectivityEvents=" + this.m + ", genericParams=" + this.n + ", pixel=" + this.o + ", abt=" + this.p + ")";
            }

            public final org.json.JSONObject u() {
                return this.n;
            }

            public final java.lang.Integer v() {
                return this.i;
            }

            public final java.lang.Integer w() {
                return this.h;
            }

            public final java.util.List<java.lang.Integer> x() {
                return this.m;
            }

            public final java.util.List<java.lang.Integer> y() {
                return this.k;
            }

            public final java.util.List<java.lang.Integer> z() {
                return this.j;
            }

            public C0124c(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.util.List<java.lang.Integer> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.Integer> list3, java.util.List<java.lang.Integer> list4, org.json.JSONObject jSONObject, com.ironsource.P3.c.C0124c.a aVar, java.lang.String str3) {
                this.f5906a = bool;
                this.b = bool2;
                this.c = bool3;
                this.d = num;
                this.e = str;
                this.f = str2;
                this.g = num2;
                this.h = num3;
                this.i = num4;
                this.j = list;
                this.k = list2;
                this.l = list3;
                this.m = list4;
                this.n = jSONObject;
                this.o = aVar;
                this.p = str3;
            }

            public final com.ironsource.P3.c.C0124c a(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.util.List<java.lang.Integer> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.Integer> list3, java.util.List<java.lang.Integer> list4, org.json.JSONObject jSONObject, com.ironsource.P3.c.C0124c.a aVar, java.lang.String str3) {
                return new com.ironsource.P3.c.C0124c(bool, bool2, bool3, num, str, str2, num2, num3, num4, list, list2, list3, list4, jSONObject, aVar, str3);
            }

            public /* synthetic */ C0124c(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, org.json.JSONObject jSONObject, com.ironsource.P3.c.C0124c.a aVar, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : list3, (i & 4096) != 0 ? null : list4, (i & 8192) != 0 ? null : jSONObject, (i & 16384) != 0 ? null : aVar, (i & 32768) != 0 ? null : str3);
            }
        }

        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            private final java.util.Map<java.lang.String, java.lang.String> f5908a;

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final java.util.Map<java.lang.String, java.lang.String> a() {
                return this.f5908a;
            }

            public final java.util.Map<java.lang.String, java.lang.String> b() {
                return this.f5908a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.ironsource.P3.c.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5908a, ((com.ironsource.P3.c.d) obj).f5908a);
            }

            public int hashCode() {
                java.util.Map<java.lang.String, java.lang.String> map = this.f5908a;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            public java.lang.String toString() {
                return "External(mediationTypes=" + this.f5908a + ")";
            }

            public d(java.util.Map<java.lang.String, java.lang.String> map) {
                this.f5908a = map;
            }

            public final com.ironsource.P3.c.d a(java.util.Map<java.lang.String, java.lang.String> map) {
                return new com.ironsource.P3.c.d(map);
            }

            public /* synthetic */ d(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : map);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.ironsource.P3.c.d a(com.ironsource.P3.c.d dVar, java.util.Map map, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    map = dVar.f5908a;
                }
                return dVar.a(map);
            }
        }

        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.Integer f5909a;
            private final java.lang.Integer b;
            private final java.lang.Integer c;
            private final java.lang.Boolean d;

            public e() {
                this(null, null, null, null, 15, null);
            }

            public final java.lang.Integer a() {
                return this.f5909a;
            }

            public final java.lang.Integer b() {
                return this.b;
            }

            public final java.lang.Integer c() {
                return this.c;
            }

            public final java.lang.Boolean d() {
                return this.d;
            }

            public final java.lang.Integer e() {
                return this.c;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.c.e)) {
                    return false;
                }
                com.ironsource.P3.c.e eVar = (com.ironsource.P3.c.e) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5909a, eVar.f5909a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, eVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, eVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, eVar.d);
            }

            public final java.lang.Integer f() {
                return this.b;
            }

            public final java.lang.Integer g() {
                return this.f5909a;
            }

            public final java.lang.Boolean h() {
                return this.d;
            }

            public int hashCode() {
                java.lang.Integer num = this.f5909a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                java.lang.Integer num2 = this.b;
                int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                java.lang.Integer num3 = this.c;
                int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                java.lang.Boolean bool = this.d;
                return hashCode3 + (bool != null ? bool.hashCode() : 0);
            }

            public java.lang.String toString() {
                return "Loggers(server=" + this.f5909a + ", publisher=" + this.b + ", console=" + this.c + ", shouldSendPublisherLogsOnUIThread=" + this.d + ")";
            }

            public e(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool) {
                this.f5909a = num;
                this.b = num2;
                this.c = num3;
                this.d = bool;
            }

            public final com.ironsource.P3.c.e a(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool) {
                return new com.ironsource.P3.c.e(num, num2, num3, bool);
            }

            public static /* synthetic */ com.ironsource.P3.c.e a(com.ironsource.P3.c.e eVar, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    num = eVar.f5909a;
                }
                if ((i & 2) != 0) {
                    num2 = eVar.b;
                }
                if ((i & 4) != 0) {
                    num3 = eVar.c;
                }
                if ((i & 8) != 0) {
                    bool = eVar.d;
                }
                return eVar.a(num, num2, num3, bool);
            }

            public /* synthetic */ e(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : bool);
            }
        }

        public static final class f {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.String f5910a;
            private final java.lang.String b;
            private final org.json.JSONObject c;

            public f() {
                this(null, null, null, 7, null);
            }

            public final java.lang.String a() {
                return this.f5910a;
            }

            public final java.lang.String b() {
                return this.b;
            }

            public final org.json.JSONObject c() {
                return this.c;
            }

            public final org.json.JSONObject d() {
                return this.c;
            }

            public final java.lang.String e() {
                return this.b;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.c.f)) {
                    return false;
                }
                com.ironsource.P3.c.f fVar = (com.ironsource.P3.c.f) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5910a, fVar.f5910a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, fVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, fVar.c);
            }

            public final java.lang.String f() {
                return this.f5910a;
            }

            public int hashCode() {
                java.lang.String str = this.f5910a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                org.json.JSONObject jSONObject = this.c;
                return hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
            }

            public java.lang.String toString() {
                return "Segment(name=" + this.f5910a + ", id=" + this.b + ", custom=" + this.c + ")";
            }

            public f(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
                this.f5910a = str;
                this.b = str2;
                this.c = jSONObject;
            }

            public final com.ironsource.P3.c.f a(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
                return new com.ironsource.P3.c.f(str, str2, jSONObject);
            }

            public static /* synthetic */ com.ironsource.P3.c.f a(com.ironsource.P3.c.f fVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = fVar.f5910a;
                }
                if ((i & 2) != 0) {
                    str2 = fVar.b;
                }
                if ((i & 4) != 0) {
                    jSONObject = fVar.c;
                }
                return fVar.a(str, str2, jSONObject);
            }

            public /* synthetic */ f(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jSONObject);
            }
        }

        public static final class g {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.Boolean f5911a;
            private final com.ironsource.P3.c.g.a b;
            private final java.lang.Boolean c;
            private final com.ironsource.P3.c.g.C0125c d;
            private final java.util.List<java.lang.String> e;
            private final java.lang.Integer f;
            private final java.lang.Boolean g;
            private final com.ironsource.P3.c.g.b h;

            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                private final java.lang.String f5912a;
                private final java.lang.String b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final java.lang.String a() {
                    return this.f5912a;
                }

                public final java.lang.String b() {
                    return this.b;
                }

                public final java.lang.String c() {
                    return this.b;
                }

                public final java.lang.String d() {
                    return this.f5912a;
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.ironsource.P3.c.g.a)) {
                        return false;
                    }
                    com.ironsource.P3.c.g.a aVar = (com.ironsource.P3.c.g.a) obj;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.f5912a, aVar.f5912a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b);
                }

                public int hashCode() {
                    java.lang.String str = this.f5912a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    java.lang.String str2 = this.b;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public java.lang.String toString() {
                    return "ConsentView(pre=" + this.f5912a + ", post=" + this.b + ")";
                }

                public a(java.lang.String str, java.lang.String str2) {
                    this.f5912a = str;
                    this.b = str2;
                }

                public final com.ironsource.P3.c.g.a a(java.lang.String str, java.lang.String str2) {
                    return new com.ironsource.P3.c.g.a(str, str2);
                }

                public /* synthetic */ a(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }

                public static /* synthetic */ com.ironsource.P3.c.g.a a(com.ironsource.P3.c.g.a aVar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.f5912a;
                    }
                    if ((i & 2) != 0) {
                        str2 = aVar.b;
                    }
                    return aVar.a(str, str2);
                }
            }

            public static final class b {

                /* renamed from: a, reason: collision with root package name */
                private final org.json.JSONObject f5913a;

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final org.json.JSONObject a() {
                    return this.f5913a;
                }

                public final org.json.JSONObject b() {
                    return this.f5913a;
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof com.ironsource.P3.c.g.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5913a, ((com.ironsource.P3.c.g.b) obj).f5913a);
                }

                public int hashCode() {
                    org.json.JSONObject jSONObject = this.f5913a;
                    if (jSONObject == null) {
                        return 0;
                    }
                    return jSONObject.hashCode();
                }

                public java.lang.String toString() {
                    return "EpConfig(traits=" + this.f5913a + ")";
                }

                public b(org.json.JSONObject jSONObject) {
                    this.f5913a = jSONObject;
                }

                public final com.ironsource.P3.c.g.b a(org.json.JSONObject jSONObject) {
                    return new com.ironsource.P3.c.g.b(jSONObject);
                }

                public /* synthetic */ b(org.json.JSONObject jSONObject, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : jSONObject);
                }

                public static /* synthetic */ com.ironsource.P3.c.g.b a(com.ironsource.P3.c.g.b bVar, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        jSONObject = bVar.f5913a;
                    }
                    return bVar.a(jSONObject);
                }
            }

            /* renamed from: com.ironsource.P3$c$g$c, reason: collision with other inner class name */
            public static final class C0125c {

                /* renamed from: a, reason: collision with root package name */
                private final java.util.Map<java.lang.String, com.ironsource.P3.c.g.C0125c.a> f5914a;

                /* renamed from: com.ironsource.P3$c$g$c$a */
                public static final class a {

                    /* renamed from: a, reason: collision with root package name */
                    private final java.util.List<java.lang.String> f5915a;

                    /* JADX WARN: Multi-variable type inference failed */
                    public a() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    public final java.util.List<java.lang.String> a() {
                        return this.f5915a;
                    }

                    public final java.util.List<java.lang.String> b() {
                        return this.f5915a;
                    }

                    public boolean equals(java.lang.Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof com.ironsource.P3.c.g.C0125c.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5915a, ((com.ironsource.P3.c.g.C0125c.a) obj).f5915a);
                    }

                    public int hashCode() {
                        java.util.List<java.lang.String> list = this.f5915a;
                        if (list == null) {
                            return 0;
                        }
                        return list.hashCode();
                    }

                    public java.lang.String toString() {
                        return "Provider(skanIds=" + this.f5915a + ")";
                    }

                    public a(java.util.List<java.lang.String> list) {
                        this.f5915a = list;
                    }

                    public final com.ironsource.P3.c.g.C0125c.a a(java.util.List<java.lang.String> list) {
                        return new com.ironsource.P3.c.g.C0125c.a(list);
                    }

                    public /* synthetic */ a(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : list);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ com.ironsource.P3.c.g.C0125c.a a(com.ironsource.P3.c.g.C0125c.a aVar, java.util.List list, int i, java.lang.Object obj) {
                        if ((i & 1) != 0) {
                            list = aVar.f5915a;
                        }
                        return aVar.a(list);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C0125c() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final java.util.Map<java.lang.String, com.ironsource.P3.c.g.C0125c.a> a() {
                    return this.f5914a;
                }

                public final java.util.Map<java.lang.String, com.ironsource.P3.c.g.C0125c.a> b() {
                    return this.f5914a;
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof com.ironsource.P3.c.g.C0125c) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5914a, ((com.ironsource.P3.c.g.C0125c) obj).f5914a);
                }

                public int hashCode() {
                    java.util.Map<java.lang.String, com.ironsource.P3.c.g.C0125c.a> map = this.f5914a;
                    if (map == null) {
                        return 0;
                    }
                    return map.hashCode();
                }

                public java.lang.String toString() {
                    return "Skd(providers=" + this.f5914a + ")";
                }

                public C0125c(java.util.Map<java.lang.String, com.ironsource.P3.c.g.C0125c.a> map) {
                    this.f5914a = map;
                }

                public final com.ironsource.P3.c.g.C0125c a(java.util.Map<java.lang.String, com.ironsource.P3.c.g.C0125c.a> map) {
                    return new com.ironsource.P3.c.g.C0125c(map);
                }

                public /* synthetic */ C0125c(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : map);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ com.ironsource.P3.c.g.C0125c a(com.ironsource.P3.c.g.C0125c c0125c, java.util.Map map, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        map = c0125c.f5914a;
                    }
                    return c0125c.a(map);
                }
            }

            public g() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            public final java.lang.Boolean a() {
                return this.f5911a;
            }

            public final com.ironsource.P3.c.g.a b() {
                return this.b;
            }

            public final java.lang.Boolean c() {
                return this.c;
            }

            public final com.ironsource.P3.c.g.C0125c d() {
                return this.d;
            }

            public final java.util.List<java.lang.String> e() {
                return this.e;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.c.g)) {
                    return false;
                }
                com.ironsource.P3.c.g gVar = (com.ironsource.P3.c.g) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5911a, gVar.f5911a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, gVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, gVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, gVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, gVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, gVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, gVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, gVar.h);
            }

            public final java.lang.Integer f() {
                return this.f;
            }

            public final java.lang.Boolean g() {
                return this.g;
            }

            public final com.ironsource.P3.c.g.b h() {
                return this.h;
            }

            public int hashCode() {
                java.lang.Boolean bool = this.f5911a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                com.ironsource.P3.c.g.a aVar = this.b;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                java.lang.Boolean bool2 = this.c;
                int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                com.ironsource.P3.c.g.C0125c c0125c = this.d;
                int hashCode4 = (hashCode3 + (c0125c == null ? 0 : c0125c.hashCode())) * 31;
                java.util.List<java.lang.String> list = this.e;
                int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
                java.lang.Integer num = this.f;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                java.lang.Boolean bool3 = this.g;
                int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                com.ironsource.P3.c.g.b bVar = this.h;
                return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            public final com.ironsource.P3.c.g.a i() {
                return this.b;
            }

            public final com.ironsource.P3.c.g.b j() {
                return this.h;
            }

            public final java.util.List<java.lang.String> k() {
                return this.e;
            }

            public final java.lang.Boolean l() {
                return this.c;
            }

            public final java.lang.Boolean m() {
                return this.g;
            }

            public final java.lang.Boolean n() {
                return this.f5911a;
            }

            public final com.ironsource.P3.c.g.C0125c o() {
                return this.d;
            }

            public final java.lang.Integer p() {
                return this.f;
            }

            public java.lang.String toString() {
                return "Settings(sid=" + this.f5911a + ", consentView=" + this.b + ", passAdditionalContextualSignals=" + this.c + ", skd=" + this.d + ", isp=" + this.e + ", uaeh=" + this.f + ", sharedThreadPool=" + this.g + ", epConfig=" + this.h + ")";
            }

            public g(java.lang.Boolean bool, com.ironsource.P3.c.g.a aVar, java.lang.Boolean bool2, com.ironsource.P3.c.g.C0125c c0125c, java.util.List<java.lang.String> list, java.lang.Integer num, java.lang.Boolean bool3, com.ironsource.P3.c.g.b bVar) {
                this.f5911a = bool;
                this.b = aVar;
                this.c = bool2;
                this.d = c0125c;
                this.e = list;
                this.f = num;
                this.g = bool3;
                this.h = bVar;
            }

            public final com.ironsource.P3.c.g a(java.lang.Boolean bool, com.ironsource.P3.c.g.a aVar, java.lang.Boolean bool2, com.ironsource.P3.c.g.C0125c c0125c, java.util.List<java.lang.String> list, java.lang.Integer num, java.lang.Boolean bool3, com.ironsource.P3.c.g.b bVar) {
                return new com.ironsource.P3.c.g(bool, aVar, bool2, c0125c, list, num, bool3, bVar);
            }

            public /* synthetic */ g(java.lang.Boolean bool, com.ironsource.P3.c.g.a aVar, java.lang.Boolean bool2, com.ironsource.P3.c.g.C0125c c0125c, java.util.List list, java.lang.Integer num, java.lang.Boolean bool3, com.ironsource.P3.c.g.b bVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : c0125c, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool3, (i & 128) == 0 ? bVar : null);
            }
        }

        public static final class h {

            /* renamed from: a, reason: collision with root package name */
            private final java.util.List<java.lang.String> f5916a;
            private final org.json.JSONObject b;
            private final java.lang.Boolean c;
            private final java.lang.Boolean d;
            private final java.lang.Boolean e;

            public h() {
                this(null, null, null, null, null, 31, null);
            }

            public final java.util.List<java.lang.String> a() {
                return this.f5916a;
            }

            public final org.json.JSONObject b() {
                return this.b;
            }

            public final java.lang.Boolean c() {
                return this.c;
            }

            public final java.lang.Boolean d() {
                return this.d;
            }

            public final java.lang.Boolean e() {
                return this.e;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.P3.c.h)) {
                    return false;
                }
                com.ironsource.P3.c.h hVar = (com.ironsource.P3.c.h) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5916a, hVar.f5916a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, hVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, hVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, hVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, hVar.e);
            }

            public final java.lang.Boolean f() {
                return this.d;
            }

            public final java.lang.Boolean g() {
                return this.c;
            }

            public final java.lang.Boolean h() {
                return this.e;
            }

            public int hashCode() {
                java.util.List<java.lang.String> list = this.f5916a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                org.json.JSONObject jSONObject = this.b;
                int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                java.lang.Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                java.lang.Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                java.lang.Boolean bool3 = this.e;
                return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
            }

            public final java.util.List<java.lang.String> i() {
                return this.f5916a;
            }

            public final org.json.JSONObject j() {
                return this.b;
            }

            public java.lang.String toString() {
                return "Token(optInKeys=" + this.f5916a + ", tokenGenericParams=" + this.b + ", compressToken=" + this.c + ", compressExternalToken=" + this.d + ", oneToken=" + this.e + ")";
            }

            public h(java.util.List<java.lang.String> list, org.json.JSONObject jSONObject, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
                this.f5916a = list;
                this.b = jSONObject;
                this.c = bool;
                this.d = bool2;
                this.e = bool3;
            }

            public final com.ironsource.P3.c.h a(java.util.List<java.lang.String> list, org.json.JSONObject jSONObject, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
                return new com.ironsource.P3.c.h(list, jSONObject, bool, bool2, bool3);
            }

            public static /* synthetic */ com.ironsource.P3.c.h a(com.ironsource.P3.c.h hVar, java.util.List list, org.json.JSONObject jSONObject, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = hVar.f5916a;
                }
                if ((i & 2) != 0) {
                    jSONObject = hVar.b;
                }
                org.json.JSONObject jSONObject2 = jSONObject;
                if ((i & 4) != 0) {
                    bool = hVar.c;
                }
                java.lang.Boolean bool4 = bool;
                if ((i & 8) != 0) {
                    bool2 = hVar.d;
                }
                java.lang.Boolean bool5 = bool2;
                if ((i & 16) != 0) {
                    bool3 = hVar.e;
                }
                return hVar.a(list, jSONObject2, bool4, bool5, bool3);
            }

            public /* synthetic */ h(java.util.List list, org.json.JSONObject jSONObject, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : jSONObject, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3);
            }
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        public final com.ironsource.P3.c.e a() {
            return this.f5902a;
        }

        public final java.lang.Boolean b() {
            return this.j;
        }

        public final com.ironsource.P3.c.C0124c c() {
            return this.b;
        }

        public final com.ironsource.P3.c.h d() {
            return this.c;
        }

        public final com.ironsource.P3.c.f e() {
            return this.d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.P3.c)) {
                return false;
            }
            com.ironsource.P3.c cVar = (com.ironsource.P3.c) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f5902a, cVar.f5902a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, cVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, cVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, cVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, cVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, cVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, cVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, cVar.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, cVar.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, cVar.j);
        }

        public final com.ironsource.P3.c.a f() {
            return this.e;
        }

        public final com.ironsource.P3.c.b g() {
            return this.f;
        }

        public final com.ironsource.P3.c.g h() {
            return this.g;
        }

        public int hashCode() {
            com.ironsource.P3.c.e eVar = this.f5902a;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            com.ironsource.P3.c.C0124c c0124c = this.b;
            int hashCode2 = (hashCode + (c0124c == null ? 0 : c0124c.hashCode())) * 31;
            com.ironsource.P3.c.h hVar = this.c;
            int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            com.ironsource.P3.c.f fVar = this.d;
            int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            com.ironsource.P3.c.a aVar = this.e;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            com.ironsource.P3.c.b bVar = this.f;
            int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            com.ironsource.P3.c.g gVar = this.g;
            int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            com.ironsource.P3.c.d dVar = this.h;
            int hashCode8 = (hashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            java.lang.Boolean bool = this.i;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            java.lang.Boolean bool2 = this.j;
            return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final com.ironsource.P3.c.d i() {
            return this.h;
        }

        public final java.lang.Boolean j() {
            return this.i;
        }

        public final com.ironsource.P3.c.a k() {
            return this.e;
        }

        public final com.ironsource.P3.c.b l() {
            return this.f;
        }

        public final com.ironsource.P3.c.C0124c m() {
            return this.b;
        }

        public final com.ironsource.P3.c.d n() {
            return this.h;
        }

        public final java.lang.Boolean o() {
            return this.j;
        }

        public final com.ironsource.P3.c.e p() {
            return this.f5902a;
        }

        public final com.ironsource.P3.c.f q() {
            return this.d;
        }

        public final com.ironsource.P3.c.g r() {
            return this.g;
        }

        public final com.ironsource.P3.c.h s() {
            return this.c;
        }

        public final java.lang.Boolean t() {
            return this.i;
        }

        public java.lang.String toString() {
            return "Application(loggers=" + this.f5902a + ", events=" + this.b + ", token=" + this.c + ", segment=" + this.d + ", auction=" + this.e + ", crashReporter=" + this.f + ", settings=" + this.g + ", external=" + this.h + ", uuidEnabled=" + this.i + ", integration=" + this.j + ")";
        }

        public c(com.ironsource.P3.c.e eVar, com.ironsource.P3.c.C0124c c0124c, com.ironsource.P3.c.h hVar, com.ironsource.P3.c.f fVar, com.ironsource.P3.c.a aVar, com.ironsource.P3.c.b bVar, com.ironsource.P3.c.g gVar, com.ironsource.P3.c.d dVar, java.lang.Boolean bool, java.lang.Boolean bool2) {
            this.f5902a = eVar;
            this.b = c0124c;
            this.c = hVar;
            this.d = fVar;
            this.e = aVar;
            this.f = bVar;
            this.g = gVar;
            this.h = dVar;
            this.i = bool;
            this.j = bool2;
        }

        public final com.ironsource.P3.c a(com.ironsource.P3.c.e eVar, com.ironsource.P3.c.C0124c c0124c, com.ironsource.P3.c.h hVar, com.ironsource.P3.c.f fVar, com.ironsource.P3.c.a aVar, com.ironsource.P3.c.b bVar, com.ironsource.P3.c.g gVar, com.ironsource.P3.c.d dVar, java.lang.Boolean bool, java.lang.Boolean bool2) {
            return new com.ironsource.P3.c(eVar, c0124c, hVar, fVar, aVar, bVar, gVar, dVar, bool, bool2);
        }

        public /* synthetic */ c(com.ironsource.P3.c.e eVar, com.ironsource.P3.c.C0124c c0124c, com.ironsource.P3.c.h hVar, com.ironsource.P3.c.f fVar, com.ironsource.P3.c.a aVar, com.ironsource.P3.c.b bVar, com.ironsource.P3.c.g gVar, com.ironsource.P3.c.d dVar, java.lang.Boolean bool, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : eVar, (i & 2) != 0 ? null : c0124c, (i & 4) != 0 ? null : hVar, (i & 8) != 0 ? null : fVar, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : bVar, (i & 64) != 0 ? null : gVar, (i & 128) != 0 ? null : dVar, (i & 256) != 0 ? null : bool, (i & 512) == 0 ? bool2 : null);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f5917a;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final java.lang.String a() {
            return this.f5917a;
        }

        public final java.lang.String b() {
            return this.f5917a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.P3.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5917a, ((com.ironsource.P3.d) obj).f5917a);
        }

        public int hashCode() {
            java.lang.String str = this.f5917a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public java.lang.String toString() {
            return "TestSuite(controllerUrl=" + this.f5917a + ")";
        }

        public d(java.lang.String str) {
            this.f5917a = str;
        }

        public final com.ironsource.P3.d a(java.lang.String str) {
            return new com.ironsource.P3.d(str);
        }

        public /* synthetic */ d(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ com.ironsource.P3.d a(com.ironsource.P3.d dVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f5917a;
            }
            return dVar.a(str);
        }
    }

    public P3() {
        this(null, null, null, null, 15, null);
    }

    public final com.ironsource.P3.c a() {
        return this.f5891a;
    }

    public final com.ironsource.P3.a b() {
        return this.b;
    }

    public final com.ironsource.P3.d c() {
        return this.c;
    }

    public final com.ironsource.P3.b d() {
        return this.d;
    }

    public final com.ironsource.P3.a e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.P3)) {
            return false;
        }
        com.ironsource.P3 p3 = (com.ironsource.P3) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5891a, p3.f5891a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, p3.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, p3.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, p3.d);
    }

    public final com.ironsource.P3.b f() {
        return this.d;
    }

    public final com.ironsource.P3.c g() {
        return this.f5891a;
    }

    public final com.ironsource.P3.d h() {
        return this.c;
    }

    public int hashCode() {
        com.ironsource.P3.c cVar = this.f5891a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        com.ironsource.P3.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.ironsource.P3.d dVar = this.c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        com.ironsource.P3.b bVar = this.d;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Configurations2(application=" + this.f5891a + ", adFormats=" + this.b + ", testSuite=" + this.c + ", adQuality=" + this.d + ")";
    }

    public P3(com.ironsource.P3.c cVar, com.ironsource.P3.a aVar, com.ironsource.P3.d dVar, com.ironsource.P3.b bVar) {
        this.f5891a = cVar;
        this.b = aVar;
        this.c = dVar;
        this.d = bVar;
    }

    public final com.ironsource.P3 a(com.ironsource.P3.c cVar, com.ironsource.P3.a aVar, com.ironsource.P3.d dVar, com.ironsource.P3.b bVar) {
        return new com.ironsource.P3(cVar, aVar, dVar, bVar);
    }

    public static /* synthetic */ com.ironsource.P3 a(com.ironsource.P3 p3, com.ironsource.P3.c cVar, com.ironsource.P3.a aVar, com.ironsource.P3.d dVar, com.ironsource.P3.b bVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cVar = p3.f5891a;
        }
        if ((i & 2) != 0) {
            aVar = p3.b;
        }
        if ((i & 4) != 0) {
            dVar = p3.c;
        }
        if ((i & 8) != 0) {
            bVar = p3.d;
        }
        return p3.a(cVar, aVar, dVar, bVar);
    }

    public /* synthetic */ P3(com.ironsource.P3.c cVar, com.ironsource.P3.a aVar, com.ironsource.P3.d dVar, com.ironsource.P3.b bVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : bVar);
    }
}
