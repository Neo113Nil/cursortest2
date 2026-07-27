package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class M3 {

    /* renamed from: a, reason: collision with root package name */
    private final c f7760a;
    private final a b;
    private final d c;
    private final b d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final g f7761a;
        private final c b;
        private final b c;
        private final d d;

        /* renamed from: com.ironsource.M3$a$a, reason: collision with other inner class name */
        public interface InterfaceC0310a {
            List<e> a();
        }

        public static final class b implements InterfaceC0310a {

            /* renamed from: a, reason: collision with root package name */
            private final List<e> f7762a;
            private final Integer b;
            private final Long c;
            private final c.C0313c d;
            private final Integer e;
            private final Boolean f;
            private final Long g;
            private final Boolean h;
            private final JSONObject i;
            private final Boolean j;
            private final Integer k;
            private final Integer l;
            private final Integer m;
            private final f n;

            public b() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public final Boolean A() {
                return this.h;
            }

            public final Boolean B() {
                return this.j;
            }

            public final b a(List<e> list, Integer num, Long l, c.C0313c c0313c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar) {
                return new b(list, num, l, c0313c, num2, bool, l2, bool2, jSONObject, bool3, num3, num4, num5, fVar);
            }

            public final List<e> b() {
                return this.f7762a;
            }

            public final Boolean c() {
                return this.j;
            }

            public final Integer d() {
                return this.k;
            }

            public final Integer e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f7762a, bVar.f7762a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && Intrinsics.areEqual(this.d, bVar.d) && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f) && Intrinsics.areEqual(this.g, bVar.g) && Intrinsics.areEqual(this.h, bVar.h) && Intrinsics.areEqual(this.i, bVar.i) && Intrinsics.areEqual(this.j, bVar.j) && Intrinsics.areEqual(this.k, bVar.k) && Intrinsics.areEqual(this.l, bVar.l) && Intrinsics.areEqual(this.m, bVar.m) && Intrinsics.areEqual(this.n, bVar.n);
            }

            public final Integer f() {
                return this.m;
            }

            public final f g() {
                return this.n;
            }

            public final Integer h() {
                return this.b;
            }

            public int hashCode() {
                List<e> list = this.f7762a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.c;
                int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                c.C0313c c0313c = this.d;
                int hashCode4 = (hashCode3 + (c0313c == null ? 0 : c0313c.hashCode())) * 31;
                Integer num2 = this.e;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.f;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l2 = this.g;
                int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.i;
                int hashCode9 = (hashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool3 = this.j;
                int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num3 = this.k;
                int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.l;
                int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.m;
                int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
                f fVar = this.n;
                return hashCode13 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final Long i() {
                return this.c;
            }

            public final c.C0313c j() {
                return this.d;
            }

            public final Integer k() {
                return this.e;
            }

            public final Boolean l() {
                return this.f;
            }

            public final Long m() {
                return this.g;
            }

            public final Boolean n() {
                return this.h;
            }

            public final JSONObject o() {
                return this.i;
            }

            public final JSONObject p() {
                return this.i;
            }

            public final Integer q() {
                return this.m;
            }

            public final Integer r() {
                return this.l;
            }

            public final Long s() {
                return this.c;
            }

            public final Integer t() {
                return this.e;
            }

            public String toString() {
                return "Banner(placements=" + this.f7762a + ", maxNumOfAdaptersToLoadOnStart=" + this.b + ", atim=" + this.c + ", events=" + this.d + ", bannerInterval=" + this.e + ", collectBiddingDataAsyncEnabled=" + this.f + ", collectBiddingDataTimeout=" + this.g + ", sharedManagersThread=" + this.h + ", adUnits=" + this.i + ", isOneFlow=" + this.j + ", delayLoadFailure=" + this.k + ", advancedLoading=" + this.l + ", adapterTimeOutInSeconds=" + this.m + ", providers=" + this.n + ")";
            }

            public final Boolean u() {
                return this.f;
            }

            public final Long v() {
                return this.g;
            }

            public final Integer w() {
                return this.k;
            }

            public final c.C0313c x() {
                return this.d;
            }

            public final Integer y() {
                return this.b;
            }

            public final f z() {
                return this.n;
            }

            public b(List<e> list, Integer num, Long l, c.C0313c c0313c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar) {
                this.f7762a = list;
                this.b = num;
                this.c = l;
                this.d = c0313c;
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

            @Override // com.ironsource.M3.a.InterfaceC0310a
            public List<e> a() {
                return this.f7762a;
            }

            public /* synthetic */ b(List list, Integer num, Long l, c.C0313c c0313c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : c0313c, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : num5, (i & 8192) == 0 ? fVar : null);
            }
        }

        public static final class c implements InterfaceC0310a {

            /* renamed from: a, reason: collision with root package name */
            private final List<e> f7763a;
            private final c.C0313c b;
            private final Integer c;
            private final Integer d;
            private final Integer e;
            private final Boolean f;
            private final Long g;
            private final Boolean h;
            private final JSONObject i;
            private final Integer j;
            private final Integer k;
            private final Boolean l;
            private final Integer m;
            private final Integer n;
            private final f o;

            public c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }

            public final Integer A() {
                return this.m;
            }

            public final f B() {
                return this.o;
            }

            public final Boolean C() {
                return this.h;
            }

            public final Boolean D() {
                return this.l;
            }

            public final c a(List<e> list, c.C0313c c0313c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar) {
                return new c(list, c0313c, num, num2, num3, bool, l, bool2, jSONObject, num4, num5, bool3, num6, num7, fVar);
            }

            public final List<e> b() {
                return this.f7763a;
            }

            public final Integer c() {
                return this.j;
            }

            public final Integer d() {
                return this.k;
            }

            public final Boolean e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f7763a, cVar.f7763a) && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c, cVar.c) && Intrinsics.areEqual(this.d, cVar.d) && Intrinsics.areEqual(this.e, cVar.e) && Intrinsics.areEqual(this.f, cVar.f) && Intrinsics.areEqual(this.g, cVar.g) && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.i, cVar.i) && Intrinsics.areEqual(this.j, cVar.j) && Intrinsics.areEqual(this.k, cVar.k) && Intrinsics.areEqual(this.l, cVar.l) && Intrinsics.areEqual(this.m, cVar.m) && Intrinsics.areEqual(this.n, cVar.n) && Intrinsics.areEqual(this.o, cVar.o);
            }

            public final Integer f() {
                return this.m;
            }

            public final Integer g() {
                return this.n;
            }

            public final f h() {
                return this.o;
            }

            public int hashCode() {
                List<e> list = this.f7763a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C0313c c0313c = this.b;
                int hashCode2 = (hashCode + (c0313c == null ? 0 : c0313c.hashCode())) * 31;
                Integer num = this.c;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.d;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.e;
                int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.g;
                int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.i;
                int hashCode9 = (hashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num4 = this.j;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.k;
                int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool3 = this.l;
                int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num6 = this.m;
                int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Integer num7 = this.n;
                int hashCode14 = (hashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
                f fVar = this.o;
                return hashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final c.C0313c i() {
                return this.b;
            }

            public final Integer j() {
                return this.c;
            }

            public final Integer k() {
                return this.d;
            }

            public final Integer l() {
                return this.e;
            }

            public final Boolean m() {
                return this.f;
            }

            public final Long n() {
                return this.g;
            }

            public final Boolean o() {
                return this.h;
            }

            public final JSONObject p() {
                return this.i;
            }

            public final JSONObject q() {
                return this.i;
            }

            public final Integer r() {
                return this.d;
            }

            public final Integer s() {
                return this.k;
            }

            public final Integer t() {
                return this.n;
            }

            public String toString() {
                return "Interstitial(placements=" + this.f7763a + ", events=" + this.b + ", maxNumOfAdaptersToLoadOnStart=" + this.c + ", adapterTimeOutInSeconds=" + this.d + ", delayLoadFailure=" + this.e + ", collectBiddingDataAsyncEnabled=" + this.f + ", collectBiddingDataTimeout=" + this.g + ", sharedManagersThread=" + this.h + ", adUnits=" + this.i + ", expiredDurationInMinutes=" + this.j + ", advancedLoading=" + this.k + ", isOneFlow=" + this.l + ", parallelLoad=" + this.m + ", atim=" + this.n + ", providers=" + this.o + ")";
            }

            public final Boolean u() {
                return this.f;
            }

            public final Long v() {
                return this.g;
            }

            public final Integer w() {
                return this.e;
            }

            public final c.C0313c x() {
                return this.b;
            }

            public final Integer y() {
                return this.j;
            }

            public final Integer z() {
                return this.c;
            }

            public c(List<e> list, c.C0313c c0313c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar) {
                this.f7763a = list;
                this.b = c0313c;
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

            @Override // com.ironsource.M3.a.InterfaceC0310a
            public List<e> a() {
                return this.f7763a;
            }

            public /* synthetic */ c(List list, c.C0313c c0313c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c0313c, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : num7, (i & 16384) == 0 ? fVar : null);
            }
        }

        public static final class d implements InterfaceC0310a {

            /* renamed from: a, reason: collision with root package name */
            private final List<e> f7764a;
            private final c.C0313c b;
            private final Boolean c;
            private final Long d;
            private final Boolean e;
            private final JSONObject f;
            private final Integer g;
            private final Integer h;
            private final Integer i;
            private final Integer j;
            private final Long k;
            private final f l;

            public d() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }

            public final d a(List<e> list, c.C0313c c0313c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar) {
                return new d(list, c0313c, bool, l, bool2, jSONObject, num, num2, num3, num4, l2, fVar);
            }

            public final List<e> b() {
                return this.f7764a;
            }

            public final Integer c() {
                return this.j;
            }

            public final Long d() {
                return this.k;
            }

            public final f e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f7764a, dVar.f7764a) && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.c, dVar.c) && Intrinsics.areEqual(this.d, dVar.d) && Intrinsics.areEqual(this.e, dVar.e) && Intrinsics.areEqual(this.f, dVar.f) && Intrinsics.areEqual(this.g, dVar.g) && Intrinsics.areEqual(this.h, dVar.h) && Intrinsics.areEqual(this.i, dVar.i) && Intrinsics.areEqual(this.j, dVar.j) && Intrinsics.areEqual(this.k, dVar.k) && Intrinsics.areEqual(this.l, dVar.l);
            }

            public final c.C0313c f() {
                return this.b;
            }

            public final Boolean g() {
                return this.c;
            }

            public final Long h() {
                return this.d;
            }

            public int hashCode() {
                List<e> list = this.f7764a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C0313c c0313c = this.b;
                int hashCode2 = (hashCode + (c0313c == null ? 0 : c0313c.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.d;
                int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.e;
                int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f;
                int hashCode6 = (hashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num = this.g;
                int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.h;
                int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.j;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Long l2 = this.k;
                int hashCode11 = (hashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
                f fVar = this.l;
                return hashCode11 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final Boolean i() {
                return this.e;
            }

            public final JSONObject j() {
                return this.f;
            }

            public final Integer k() {
                return this.g;
            }

            public final Integer l() {
                return this.h;
            }

            public final Integer m() {
                return this.i;
            }

            public final JSONObject n() {
                return this.f;
            }

            public final Integer o() {
                return this.j;
            }

            public final Integer p() {
                return this.g;
            }

            public final Long q() {
                return this.k;
            }

            public final Boolean r() {
                return this.c;
            }

            public final Long s() {
                return this.d;
            }

            public final Integer t() {
                return this.h;
            }

            public String toString() {
                return "NativeAd(placements=" + this.f7764a + ", events=" + this.b + ", collectBiddingDataAsyncEnabled=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", sharedManagersThread=" + this.e + ", adUnits=" + this.f + ", advancedLoading=" + this.g + ", delayLoadFailure=" + this.h + ", maxNumOfAdaptersToLoadOnStart=" + this.i + ", adapterTimeOutInSeconds=" + this.j + ", atim=" + this.k + ", providers=" + this.l + ")";
            }

            public final c.C0313c u() {
                return this.b;
            }

            public final Integer v() {
                return this.i;
            }

            public final f w() {
                return this.l;
            }

            public final Boolean x() {
                return this.e;
            }

            public d(List<e> list, c.C0313c c0313c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar) {
                this.f7764a = list;
                this.b = c0313c;
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

            @Override // com.ironsource.M3.a.InterfaceC0310a
            public List<e> a() {
                return this.f7764a;
            }

            public /* synthetic */ d(List list, c.C0313c c0313c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c0313c, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : jSONObject, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : l2, (i & 2048) == 0 ? fVar : null);
            }
        }

        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            private final Integer f7765a;
            private final String b;
            private final Boolean c;
            private final String d;
            private final Integer e;
            private final Boolean f;
            private final C0311a g;
            private final b h;

            /* renamed from: com.ironsource.M3$a$e$a, reason: collision with other inner class name */
            public static final class C0311a {

                /* renamed from: a, reason: collision with root package name */
                private final Boolean f7766a;
                private final String b;
                private final Integer c;

                public C0311a() {
                    this(null, null, null, 7, null);
                }

                public final Boolean a() {
                    return this.f7766a;
                }

                public final String b() {
                    return this.b;
                }

                public final Integer c() {
                    return this.c;
                }

                public final Boolean d() {
                    return this.f7766a;
                }

                public final Integer e() {
                    return this.c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0311a)) {
                        return false;
                    }
                    C0311a c0311a = (C0311a) obj;
                    return Intrinsics.areEqual(this.f7766a, c0311a.f7766a) && Intrinsics.areEqual(this.b, c0311a.b) && Intrinsics.areEqual(this.c, c0311a.c);
                }

                public final String f() {
                    return this.b;
                }

                public int hashCode() {
                    Boolean bool = this.f7766a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    String str = this.b;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num = this.c;
                    return hashCode2 + (num != null ? num.hashCode() : 0);
                }

                public String toString() {
                    return "Capping(enabled=" + this.f7766a + ", unit=" + this.b + ", maxImpressions=" + this.c + ")";
                }

                public C0311a(Boolean bool, String str, Integer num) {
                    this.f7766a = bool;
                    this.b = str;
                    this.c = num;
                }

                public final C0311a a(Boolean bool, String str, Integer num) {
                    return new C0311a(bool, str, num);
                }

                public static /* synthetic */ C0311a a(C0311a c0311a, Boolean bool, String str, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = c0311a.f7766a;
                    }
                    if ((i & 2) != 0) {
                        str = c0311a.b;
                    }
                    if ((i & 4) != 0) {
                        num = c0311a.c;
                    }
                    return c0311a.a(bool, str, num);
                }

                public /* synthetic */ C0311a(Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
                }
            }

            public static final class b {

                /* renamed from: a, reason: collision with root package name */
                private final Boolean f7767a;
                private final Integer b;

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final Boolean a() {
                    return this.f7767a;
                }

                public final Integer b() {
                    return this.b;
                }

                public final Boolean c() {
                    return this.f7767a;
                }

                public final Integer d() {
                    return this.b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return Intrinsics.areEqual(this.f7767a, bVar.f7767a) && Intrinsics.areEqual(this.b, bVar.b);
                }

                public int hashCode() {
                    Boolean bool = this.f7767a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.b;
                    return hashCode + (num != null ? num.hashCode() : 0);
                }

                public String toString() {
                    return "Pacing(enabled=" + this.f7767a + ", numOfSeconds=" + this.b + ")";
                }

                public b(Boolean bool, Integer num) {
                    this.f7767a = bool;
                    this.b = num;
                }

                public final b a(Boolean bool, Integer num) {
                    return new b(bool, num);
                }

                public /* synthetic */ b(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
                }

                public static /* synthetic */ b a(b bVar, Boolean bool, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = bVar.f7767a;
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

            public final Integer a() {
                return this.f7765a;
            }

            public final String b() {
                return this.b;
            }

            public final Boolean c() {
                return this.c;
            }

            public final String d() {
                return this.d;
            }

            public final Integer e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.f7765a, eVar.f7765a) && Intrinsics.areEqual(this.b, eVar.b) && Intrinsics.areEqual(this.c, eVar.c) && Intrinsics.areEqual(this.d, eVar.d) && Intrinsics.areEqual(this.e, eVar.e) && Intrinsics.areEqual(this.f, eVar.f) && Intrinsics.areEqual(this.g, eVar.g) && Intrinsics.areEqual(this.h, eVar.h);
            }

            public final Boolean f() {
                return this.f;
            }

            public final C0311a g() {
                return this.g;
            }

            public final b h() {
                return this.h;
            }

            public int hashCode() {
                Integer num = this.f7765a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.d;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.e;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool2 = this.f;
                int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C0311a c0311a = this.g;
                int hashCode7 = (hashCode6 + (c0311a == null ? 0 : c0311a.hashCode())) * 31;
                b bVar = this.h;
                return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            public final C0311a i() {
                return this.g;
            }

            public final Boolean j() {
                return this.f;
            }

            public final b k() {
                return this.h;
            }

            public final Integer l() {
                return this.f7765a;
            }

            public final String m() {
                return this.b;
            }

            public final Integer n() {
                return this.e;
            }

            public final String o() {
                return this.d;
            }

            public final Boolean p() {
                return this.c;
            }

            public String toString() {
                return "Placement(placementId=" + this.f7765a + ", placementName=" + this.b + ", isDefault=" + this.c + ", virtualItemName=" + this.d + ", virtualItemCount=" + this.e + ", delivery=" + this.f + ", capping=" + this.g + ", pacing=" + this.h + ")";
            }

            public e(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0311a c0311a, b bVar) {
                this.f7765a = num;
                this.b = str;
                this.c = bool;
                this.d = str2;
                this.e = num2;
                this.f = bool2;
                this.g = c0311a;
                this.h = bVar;
            }

            public final e a(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0311a c0311a, b bVar) {
                return new e(num, str, bool, str2, num2, bool2, c0311a, bVar);
            }

            public /* synthetic */ e(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0311a c0311a, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c0311a, (i & 128) == 0 ? bVar : null);
            }
        }

        public static final class f {

            /* renamed from: a, reason: collision with root package name */
            private final Boolean f7768a;
            private final Boolean b;

            /* JADX WARN: Multi-variable type inference failed */
            public f() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final Boolean a() {
                return this.f7768a;
            }

            public final Boolean b() {
                return this.b;
            }

            public final Boolean c() {
                return this.f7768a;
            }

            public final Boolean d() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f7768a, fVar.f7768a) && Intrinsics.areEqual(this.b, fVar.b);
            }

            public int hashCode() {
                Boolean bool = this.f7768a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.b;
                return hashCode + (bool2 != null ? bool2.hashCode() : 0);
            }

            public String toString() {
                return "Providers(parallelInit=" + this.f7768a + ", waitUntilAllProvidersFinishInit=" + this.b + ")";
            }

            public f(Boolean bool, Boolean bool2) {
                this.f7768a = bool;
                this.b = bool2;
            }

            public final f a(Boolean bool, Boolean bool2) {
                return new f(bool, bool2);
            }

            public static /* synthetic */ f a(f fVar, Boolean bool, Boolean bool2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = fVar.f7768a;
                }
                if ((i & 2) != 0) {
                    bool2 = fVar.b;
                }
                return fVar.a(bool, bool2);
            }

            public /* synthetic */ f(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
            }
        }

        public static final class g implements InterfaceC0310a {

            /* renamed from: a, reason: collision with root package name */
            private final List<e> f7769a;
            private final Integer b;
            private final Integer c;
            private final Integer d;
            private final Integer e;
            private final Integer f;
            private final Boolean g;
            private final Long h;
            private final Boolean i;
            private final JSONObject j;
            private final Integer k;
            private final Boolean l;
            private final Integer m;
            private final Integer n;
            private final f o;

            public g() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }

            public final Integer A() {
                return this.m;
            }

            public final f B() {
                return this.o;
            }

            public final Boolean C() {
                return this.i;
            }

            public final Boolean D() {
                return this.l;
            }

            public final g a(List<e> list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar) {
                return new g(list, num, num2, num3, num4, num5, bool, l, bool2, jSONObject, num6, bool3, num7, num8, fVar);
            }

            public final List<e> b() {
                return this.f7769a;
            }

            public final JSONObject c() {
                return this.j;
            }

            public final Integer d() {
                return this.k;
            }

            public final Boolean e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.areEqual(this.f7769a, gVar.f7769a) && Intrinsics.areEqual(this.b, gVar.b) && Intrinsics.areEqual(this.c, gVar.c) && Intrinsics.areEqual(this.d, gVar.d) && Intrinsics.areEqual(this.e, gVar.e) && Intrinsics.areEqual(this.f, gVar.f) && Intrinsics.areEqual(this.g, gVar.g) && Intrinsics.areEqual(this.h, gVar.h) && Intrinsics.areEqual(this.i, gVar.i) && Intrinsics.areEqual(this.j, gVar.j) && Intrinsics.areEqual(this.k, gVar.k) && Intrinsics.areEqual(this.l, gVar.l) && Intrinsics.areEqual(this.m, gVar.m) && Intrinsics.areEqual(this.n, gVar.n) && Intrinsics.areEqual(this.o, gVar.o);
            }

            public final Integer f() {
                return this.m;
            }

            public final Integer g() {
                return this.n;
            }

            public final f h() {
                return this.o;
            }

            public int hashCode() {
                List<e> list = this.f7769a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.c;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.d;
                int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.e;
                int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f;
                int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool = this.g;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.h;
                int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.i;
                int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.j;
                int hashCode10 = (hashCode9 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num6 = this.k;
                int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Boolean bool3 = this.l;
                int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num7 = this.m;
                int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
                Integer num8 = this.n;
                int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
                f fVar = this.o;
                return hashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final Integer i() {
                return this.b;
            }

            public final Integer j() {
                return this.c;
            }

            public final Integer k() {
                return this.d;
            }

            public final Integer l() {
                return this.e;
            }

            public final Integer m() {
                return this.f;
            }

            public final Boolean n() {
                return this.g;
            }

            public final Long o() {
                return this.h;
            }

            public final Boolean p() {
                return this.i;
            }

            public final JSONObject q() {
                return this.j;
            }

            public final Integer r() {
                return this.c;
            }

            public final Integer s() {
                return this.e;
            }

            public final Integer t() {
                return this.n;
            }

            public String toString() {
                return "Rewarded(placements=" + this.f7769a + ", maxNumOfAdaptersToLoadOnStart=" + this.b + ", adapterTimeOutInSeconds=" + this.c + ", loadRVInterval=" + this.d + ", advancedLoading=" + this.e + ", expiredDurationInMinutes=" + this.f + ", collectBiddingDataAsyncEnabled=" + this.g + ", collectBiddingDataTimeout=" + this.h + ", sharedManagersThread=" + this.i + ", adUnits=" + this.j + ", delayLoadFailure=" + this.k + ", isOneFlow=" + this.l + ", parallelLoad=" + this.m + ", atim=" + this.n + ", providers=" + this.o + ")";
            }

            public final Boolean u() {
                return this.g;
            }

            public final Long v() {
                return this.h;
            }

            public final Integer w() {
                return this.k;
            }

            public final Integer x() {
                return this.f;
            }

            public final Integer y() {
                return this.d;
            }

            public final Integer z() {
                return this.b;
            }

            public g(List<e> list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar) {
                this.f7769a = list;
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

            @Override // com.ironsource.M3.a.InterfaceC0310a
            public List<e> a() {
                return this.f7769a;
            }

            public /* synthetic */ g(List list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : jSONObject, (i & 1024) != 0 ? null : num6, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num7, (i & 8192) != 0 ? null : num8, (i & 16384) == 0 ? fVar : null);
            }
        }

        public a() {
            this(null, null, null, null, 15, null);
        }

        public final g a() {
            return this.f7761a;
        }

        public final c b() {
            return this.b;
        }

        public final b c() {
            return this.c;
        }

        public final d d() {
            return this.d;
        }

        public final b e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f7761a, aVar.f7761a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d);
        }

        public final c f() {
            return this.b;
        }

        public final d g() {
            return this.d;
        }

        public final g h() {
            return this.f7761a;
        }

        public int hashCode() {
            g gVar = this.f7761a;
            int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            c cVar = this.b;
            int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            b bVar = this.c;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            d dVar = this.d;
            return hashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            return "AdFormats(rewarded=" + this.f7761a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
        }

        public a(g gVar, c cVar, b bVar, d dVar) {
            this.f7761a = gVar;
            this.b = cVar;
            this.c = bVar;
            this.d = dVar;
        }

        public final a a(g gVar, c cVar, b bVar, d dVar) {
            return new a(gVar, cVar, bVar, dVar);
        }

        public static /* synthetic */ a a(a aVar, g gVar, c cVar, b bVar, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                gVar = aVar.f7761a;
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

        public /* synthetic */ a(g gVar, c cVar, b bVar, d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gVar, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : dVar);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Integer f7770a;
        private final String b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final Integer a() {
            return this.f7770a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.b;
        }

        public final Integer d() {
            return this.f7770a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f7770a, bVar.f7770a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            Integer num = this.f7770a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "AdQuality(initMode=" + this.f7770a + ", adqInitBlob=" + this.b + ")";
        }

        public b(Integer num, String str) {
            this.f7770a = num;
            this.b = str;
        }

        public final b a(Integer num, String str) {
            return new b(num, str);
        }

        public /* synthetic */ b(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
        }

        public static /* synthetic */ b a(b bVar, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = bVar.f7770a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            return bVar.a(num, str);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final e f7771a;
        private final C0313c b;
        private final h c;
        private final f d;
        private final a e;
        private final b f;
        private final g g;
        private final d h;
        private final Boolean i;
        private final Boolean j;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final String f7772a;
            private final String b;
            private final String c;
            private final Integer d;
            private final Long e;
            private final Integer f;
            private final Boolean g;
            private final Boolean h;
            private final Integer i;
            private final Boolean j;
            private final C0312a k;
            private final C0312a l;
            private final C0312a m;
            private final C0312a n;

            /* renamed from: com.ironsource.M3$c$a$a, reason: collision with other inner class name */
            public static final class C0312a {

                /* renamed from: a, reason: collision with root package name */
                private final Boolean f7773a;
                private final Integer b;
                private final Boolean c;
                private final Integer d;
                private final Integer e;
                private final Boolean f;
                private final Boolean g;
                private final Integer h;
                private final Integer i;
                private final Boolean j;

                public C0312a() {
                    this(null, null, null, null, null, null, null, null, null, null, 1023, null);
                }

                public final Boolean a() {
                    return this.f7773a;
                }

                public final Boolean b() {
                    return this.j;
                }

                public final Integer c() {
                    return this.b;
                }

                public final Boolean d() {
                    return this.c;
                }

                public final Integer e() {
                    return this.d;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0312a)) {
                        return false;
                    }
                    C0312a c0312a = (C0312a) obj;
                    return Intrinsics.areEqual(this.f7773a, c0312a.f7773a) && Intrinsics.areEqual(this.b, c0312a.b) && Intrinsics.areEqual(this.c, c0312a.c) && Intrinsics.areEqual(this.d, c0312a.d) && Intrinsics.areEqual(this.e, c0312a.e) && Intrinsics.areEqual(this.f, c0312a.f) && Intrinsics.areEqual(this.g, c0312a.g) && Intrinsics.areEqual(this.h, c0312a.h) && Intrinsics.areEqual(this.i, c0312a.i) && Intrinsics.areEqual(this.j, c0312a.j);
                }

                public final Integer f() {
                    return this.e;
                }

                public final Boolean g() {
                    return this.f;
                }

                public final Boolean h() {
                    return this.g;
                }

                public int hashCode() {
                    Boolean bool = this.f7773a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.b;
                    int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool2 = this.c;
                    int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Integer num2 = this.d;
                    int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.e;
                    int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    Boolean bool3 = this.f;
                    int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    Boolean bool4 = this.g;
                    int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                    Integer num4 = this.h;
                    int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
                    Integer num5 = this.i;
                    int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
                    Boolean bool5 = this.j;
                    return hashCode9 + (bool5 != null ? bool5.hashCode() : 0);
                }

                public final Integer i() {
                    return this.h;
                }

                public final Integer j() {
                    return this.i;
                }

                public final Integer k() {
                    return this.d;
                }

                public final Boolean l() {
                    return this.j;
                }

                public final Integer m() {
                    return this.b;
                }

                public final Boolean n() {
                    return this.c;
                }

                public final Boolean o() {
                    return this.f7773a;
                }

                public final Integer p() {
                    return this.h;
                }

                public final Integer q() {
                    return this.e;
                }

                public final Integer r() {
                    return this.i;
                }

                public final Boolean s() {
                    return this.f;
                }

                public final Boolean t() {
                    return this.g;
                }

                public String toString() {
                    return "AdFormatAuction(programmatic=" + this.f7773a + ", minTimeBeforeFirstAuction=" + this.b + ", objectPerWaterfall=" + this.c + ", auctionRetryInterval=" + this.d + ", timeToWaitBeforeAuction=" + this.e + ", isAuctionOnShowStart=" + this.f + ", isLoadWhileShow=" + this.g + ", timeToDeleteOldWaterfallAfterAuction=" + this.h + ", timeToWaitBeforeLoad=" + this.i + ", enableAuctionFallback=" + this.j + ")";
                }

                public C0312a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5) {
                    this.f7773a = bool;
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

                public final C0312a a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5) {
                    return new C0312a(bool, num, bool2, num2, num3, bool3, bool4, num4, num5, bool5);
                }

                public /* synthetic */ C0312a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : num5, (i & 512) == 0 ? bool5 : null);
                }
            }

            public a() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public final C0312a A() {
                return this.k;
            }

            public final Boolean B() {
                return this.j;
            }

            public final String a() {
                return this.f7772a;
            }

            public final Boolean b() {
                return this.j;
            }

            public final C0312a c() {
                return this.k;
            }

            public final C0312a d() {
                return this.l;
            }

            public final C0312a e() {
                return this.m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f7772a, aVar.f7772a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g) && Intrinsics.areEqual(this.h, aVar.h) && Intrinsics.areEqual(this.i, aVar.i) && Intrinsics.areEqual(this.j, aVar.j) && Intrinsics.areEqual(this.k, aVar.k) && Intrinsics.areEqual(this.l, aVar.l) && Intrinsics.areEqual(this.m, aVar.m) && Intrinsics.areEqual(this.n, aVar.n);
            }

            public final C0312a f() {
                return this.n;
            }

            public final String g() {
                return this.b;
            }

            public final String h() {
                return this.c;
            }

            public int hashCode() {
                String str = this.f7772a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.d;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.e;
                int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
                Integer num2 = this.f;
                int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.g;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num3 = this.i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool3 = this.j;
                int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                C0312a c0312a = this.k;
                int hashCode11 = (hashCode10 + (c0312a == null ? 0 : c0312a.hashCode())) * 31;
                C0312a c0312a2 = this.l;
                int hashCode12 = (hashCode11 + (c0312a2 == null ? 0 : c0312a2.hashCode())) * 31;
                C0312a c0312a3 = this.m;
                int hashCode13 = (hashCode12 + (c0312a3 == null ? 0 : c0312a3.hashCode())) * 31;
                C0312a c0312a4 = this.n;
                return hashCode13 + (c0312a4 != null ? c0312a4.hashCode() : 0);
            }

            public final Integer i() {
                return this.d;
            }

            public final Long j() {
                return this.e;
            }

            public final Integer k() {
                return this.f;
            }

            public final Boolean l() {
                return this.g;
            }

            public final Boolean m() {
                return this.h;
            }

            public final Integer n() {
                return this.i;
            }

            public final String o() {
                return this.f7772a;
            }

            public final Integer p() {
                return this.f;
            }

            public final Long q() {
                return this.e;
            }

            public final Integer r() {
                return this.d;
            }

            public final String s() {
                return this.b;
            }

            public final C0312a t() {
                return this.m;
            }

            public String toString() {
                return "Auction(auctionData=" + this.f7772a + ", auctioneerURL=" + this.b + ", extAuctioneerURL=" + this.c + ", auctionTrials=" + this.d + ", auctionTimeout=" + this.e + ", auctionSavedHistory=" + this.f + ", compressAuctionRequest=" + this.g + ", compressAuctionResponse=" + this.h + ", encryptionVersion=" + this.i + ", tokenPerAdapter=" + this.j + ", rewarded=" + this.k + ", interstitial=" + this.l + ", banner=" + this.m + ", nativeAd=" + this.n + ")";
            }

            public final Boolean u() {
                return this.g;
            }

            public final Boolean v() {
                return this.h;
            }

            public final Integer w() {
                return this.i;
            }

            public final String x() {
                return this.c;
            }

            public final C0312a y() {
                return this.l;
            }

            public final C0312a z() {
                return this.n;
            }

            public a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0312a c0312a, C0312a c0312a2, C0312a c0312a3, C0312a c0312a4) {
                this.f7772a = str;
                this.b = str2;
                this.c = str3;
                this.d = num;
                this.e = l;
                this.f = num2;
                this.g = bool;
                this.h = bool2;
                this.i = num3;
                this.j = bool3;
                this.k = c0312a;
                this.l = c0312a2;
                this.m = c0312a3;
                this.n = c0312a4;
            }

            public final a a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0312a c0312a, C0312a c0312a2, C0312a c0312a3, C0312a c0312a4) {
                return new a(str, str2, str3, num, l, num2, bool, bool2, num3, bool3, c0312a, c0312a2, c0312a3, c0312a4);
            }

            public /* synthetic */ a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0312a c0312a, C0312a c0312a2, C0312a c0312a3, C0312a c0312a4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : c0312a, (i & 2048) != 0 ? null : c0312a2, (i & 4096) != 0 ? null : c0312a3, (i & 8192) == 0 ? c0312a4 : null);
            }
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            private final Boolean f7774a;
            private final String b;
            private final String c;
            private final Boolean d;
            private final Integer e;
            private final Boolean f;
            private final List<String> g;

            public b() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            public final Boolean a() {
                return this.f7774a;
            }

            public final String b() {
                return this.b;
            }

            public final String c() {
                return this.c;
            }

            public final Boolean d() {
                return this.d;
            }

            public final Integer e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f7774a, bVar.f7774a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && Intrinsics.areEqual(this.d, bVar.d) && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f) && Intrinsics.areEqual(this.g, bVar.g);
            }

            public final Boolean f() {
                return this.f;
            }

            public final List<String> g() {
                return this.g;
            }

            public final Boolean h() {
                return this.f7774a;
            }

            public int hashCode() {
                Boolean bool = this.f7774a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num = this.e;
                int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.f;
                int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                List<String> list = this.g;
                return hashCode6 + (list != null ? list.hashCode() : 0);
            }

            public final Boolean i() {
                return this.d;
            }

            public final List<String> j() {
                return this.g;
            }

            public final String k() {
                return this.c;
            }

            public final String l() {
                return this.b;
            }

            public final Boolean m() {
                return this.f;
            }

            public final Integer n() {
                return this.e;
            }

            public String toString() {
                return "CrashReporter(enabled=" + this.f7774a + ", reporterURL=" + this.b + ", reporterKeyword=" + this.c + ", includeANR=" + this.d + ", timeout=" + this.e + ", setIgnoreDebugger=" + this.f + ", keysToInclude=" + this.g + ")";
            }

            public b(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List<String> list) {
                this.f7774a = bool;
                this.b = str;
                this.c = str2;
                this.d = bool2;
                this.e = num;
                this.f = bool3;
                this.g = list;
            }

            public final b a(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List<String> list) {
                return new b(bool, str, str2, bool2, num, bool3, list);
            }

            public static /* synthetic */ b a(b bVar, Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = bVar.f7774a;
                }
                if ((i & 2) != 0) {
                    str = bVar.b;
                }
                String str3 = str;
                if ((i & 4) != 0) {
                    str2 = bVar.c;
                }
                String str4 = str2;
                if ((i & 8) != 0) {
                    bool2 = bVar.d;
                }
                Boolean bool4 = bool2;
                if ((i & 16) != 0) {
                    num = bVar.e;
                }
                Integer num2 = num;
                if ((i & 32) != 0) {
                    bool3 = bVar.f;
                }
                Boolean bool5 = bool3;
                if ((i & 64) != 0) {
                    list = bVar.g;
                }
                return bVar.a(bool, str3, str4, bool4, num2, bool5, list);
            }

            public /* synthetic */ b(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : list);
            }
        }

        /* renamed from: com.ironsource.M3$c$c, reason: collision with other inner class name */
        public static final class C0313c {

            /* renamed from: a, reason: collision with root package name */
            private final Boolean f7775a;
            private final Boolean b;
            private final Boolean c;
            private final Integer d;
            private final String e;
            private final String f;
            private final Integer g;
            private final Integer h;
            private final Integer i;
            private final List<Integer> j;
            private final List<Integer> k;
            private final List<Integer> l;
            private final List<Integer> m;
            private final JSONObject n;
            private final a o;
            private final String p;

            /* renamed from: com.ironsource.M3$c$c$a */
            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                private final String f7776a;
                private final Boolean b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.f7776a;
                }

                public final Boolean b() {
                    return this.b;
                }

                public final Boolean c() {
                    return this.b;
                }

                public final String d() {
                    return this.f7776a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return Intrinsics.areEqual(this.f7776a, aVar.f7776a) && Intrinsics.areEqual(this.b, aVar.b);
                }

                public int hashCode() {
                    String str = this.f7776a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Boolean bool = this.b;
                    return hashCode + (bool != null ? bool.hashCode() : 0);
                }

                public String toString() {
                    return "Pixel(pixelEventsUrl=" + this.f7776a + ", pixelEventsEnabled=" + this.b + ")";
                }

                public a(String str, Boolean bool) {
                    this.f7776a = str;
                    this.b = bool;
                }

                public final a a(String str, Boolean bool) {
                    return new a(str, bool);
                }

                public /* synthetic */ a(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
                }

                public static /* synthetic */ a a(a aVar, String str, Boolean bool, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.f7776a;
                    }
                    if ((i & 2) != 0) {
                        bool = aVar.b;
                    }
                    return aVar.a(str, bool);
                }
            }

            public C0313c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
            }

            public final a A() {
                return this.o;
            }

            public final Boolean B() {
                return this.b;
            }

            public final Boolean C() {
                return this.f7775a;
            }

            public final String D() {
                return this.f;
            }

            public final String E() {
                return this.e;
            }

            public final List<Integer> F() {
                return this.l;
            }

            public final Boolean a() {
                return this.f7775a;
            }

            public final List<Integer> b() {
                return this.j;
            }

            public final List<Integer> c() {
                return this.k;
            }

            public final List<Integer> d() {
                return this.l;
            }

            public final List<Integer> e() {
                return this.m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0313c)) {
                    return false;
                }
                C0313c c0313c = (C0313c) obj;
                return Intrinsics.areEqual(this.f7775a, c0313c.f7775a) && Intrinsics.areEqual(this.b, c0313c.b) && Intrinsics.areEqual(this.c, c0313c.c) && Intrinsics.areEqual(this.d, c0313c.d) && Intrinsics.areEqual(this.e, c0313c.e) && Intrinsics.areEqual(this.f, c0313c.f) && Intrinsics.areEqual(this.g, c0313c.g) && Intrinsics.areEqual(this.h, c0313c.h) && Intrinsics.areEqual(this.i, c0313c.i) && Intrinsics.areEqual(this.j, c0313c.j) && Intrinsics.areEqual(this.k, c0313c.k) && Intrinsics.areEqual(this.l, c0313c.l) && Intrinsics.areEqual(this.m, c0313c.m) && Intrinsics.areEqual(this.n, c0313c.n) && Intrinsics.areEqual(this.o, c0313c.o) && Intrinsics.areEqual(this.p, c0313c.p);
            }

            public final JSONObject f() {
                return this.n;
            }

            public final a g() {
                return this.o;
            }

            public final String h() {
                return this.p;
            }

            public int hashCode() {
                Boolean bool = this.f7775a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.b;
                int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.c;
                int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num = this.d;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.e;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.g;
                int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.h;
                int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.i;
                int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
                List<Integer> list = this.j;
                int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
                List<Integer> list2 = this.k;
                int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<Integer> list3 = this.l;
                int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<Integer> list4 = this.m;
                int hashCode13 = (hashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
                JSONObject jSONObject = this.n;
                int hashCode14 = (hashCode13 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                a aVar = this.o;
                int hashCode15 = (hashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                String str3 = this.p;
                return hashCode15 + (str3 != null ? str3.hashCode() : 0);
            }

            public final Boolean i() {
                return this.b;
            }

            public final Boolean j() {
                return this.c;
            }

            public final Integer k() {
                return this.d;
            }

            public final String l() {
                return this.e;
            }

            public final String m() {
                return this.f;
            }

            public final Integer n() {
                return this.g;
            }

            public final Integer o() {
                return this.h;
            }

            public final Integer p() {
                return this.i;
            }

            public final String q() {
                return this.p;
            }

            public final Integer r() {
                return this.g;
            }

            public final Boolean s() {
                return this.c;
            }

            public final Integer t() {
                return this.d;
            }

            public String toString() {
                return "Events(sendUltraEvents=" + this.f7775a + ", sendEventsToggle=" + this.b + ", eventsCompression=" + this.c + ", eventsCompressionLevel=" + this.d + ", serverEventsURL=" + this.e + ", serverEventsType=" + this.f + ", backupThreshold=" + this.g + ", maxNumberOfEvents=" + this.h + ", maxEventsPerBatch=" + this.i + ", optOut=" + this.j + ", optIn=" + this.k + ", triggerEvents=" + this.l + ", nonConnectivityEvents=" + this.m + ", genericParams=" + this.n + ", pixel=" + this.o + ", abt=" + this.p + ")";
            }

            public final JSONObject u() {
                return this.n;
            }

            public final Integer v() {
                return this.i;
            }

            public final Integer w() {
                return this.h;
            }

            public final List<Integer> x() {
                return this.m;
            }

            public final List<Integer> y() {
                return this.k;
            }

            public final List<Integer> z() {
                return this.j;
            }

            public C0313c(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, JSONObject jSONObject, a aVar, String str3) {
                this.f7775a = bool;
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

            public final C0313c a(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, JSONObject jSONObject, a aVar, String str3) {
                return new C0313c(bool, bool2, bool3, num, str, str2, num2, num3, num4, list, list2, list3, list4, jSONObject, aVar, str3);
            }

            public /* synthetic */ C0313c(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List list, List list2, List list3, List list4, JSONObject jSONObject, a aVar, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : list3, (i & 4096) != 0 ? null : list4, (i & 8192) != 0 ? null : jSONObject, (i & 16384) != 0 ? null : aVar, (i & 32768) != 0 ? null : str3);
            }
        }

        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            private final Map<String, String> f7777a;

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final Map<String, String> a() {
                return this.f7777a;
            }

            public final Map<String, String> b() {
                return this.f7777a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f7777a, ((d) obj).f7777a);
            }

            public int hashCode() {
                Map<String, String> map = this.f7777a;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            public String toString() {
                return "External(mediationTypes=" + this.f7777a + ")";
            }

            public d(Map<String, String> map) {
                this.f7777a = map;
            }

            public final d a(Map<String, String> map) {
                return new d(map);
            }

            public /* synthetic */ d(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : map);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ d a(d dVar, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = dVar.f7777a;
                }
                return dVar.a(map);
            }
        }

        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            private final Integer f7778a;
            private final Integer b;
            private final Integer c;
            private final Boolean d;

            public e() {
                this(null, null, null, null, 15, null);
            }

            public final Integer a() {
                return this.f7778a;
            }

            public final Integer b() {
                return this.b;
            }

            public final Integer c() {
                return this.c;
            }

            public final Boolean d() {
                return this.d;
            }

            public final Integer e() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.f7778a, eVar.f7778a) && Intrinsics.areEqual(this.b, eVar.b) && Intrinsics.areEqual(this.c, eVar.c) && Intrinsics.areEqual(this.d, eVar.d);
            }

            public final Integer f() {
                return this.b;
            }

            public final Integer g() {
                return this.f7778a;
            }

            public final Boolean h() {
                return this.d;
            }

            public int hashCode() {
                Integer num = this.f7778a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.b;
                int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.c;
                int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.d;
                return hashCode3 + (bool != null ? bool.hashCode() : 0);
            }

            public String toString() {
                return "Loggers(server=" + this.f7778a + ", publisher=" + this.b + ", console=" + this.c + ", shouldSendPublisherLogsOnUIThread=" + this.d + ")";
            }

            public e(Integer num, Integer num2, Integer num3, Boolean bool) {
                this.f7778a = num;
                this.b = num2;
                this.c = num3;
                this.d = bool;
            }

            public final e a(Integer num, Integer num2, Integer num3, Boolean bool) {
                return new e(num, num2, num3, bool);
            }

            public static /* synthetic */ e a(e eVar, Integer num, Integer num2, Integer num3, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = eVar.f7778a;
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

            public /* synthetic */ e(Integer num, Integer num2, Integer num3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : bool);
            }
        }

        public static final class f {

            /* renamed from: a, reason: collision with root package name */
            private final String f7779a;
            private final String b;
            private final JSONObject c;

            public f() {
                this(null, null, null, 7, null);
            }

            public final String a() {
                return this.f7779a;
            }

            public final String b() {
                return this.b;
            }

            public final JSONObject c() {
                return this.c;
            }

            public final JSONObject d() {
                return this.c;
            }

            public final String e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f7779a, fVar.f7779a) && Intrinsics.areEqual(this.b, fVar.b) && Intrinsics.areEqual(this.c, fVar.c);
            }

            public final String f() {
                return this.f7779a;
            }

            public int hashCode() {
                String str = this.f7779a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                JSONObject jSONObject = this.c;
                return hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
            }

            public String toString() {
                return "Segment(name=" + this.f7779a + ", id=" + this.b + ", custom=" + this.c + ")";
            }

            public f(String str, String str2, JSONObject jSONObject) {
                this.f7779a = str;
                this.b = str2;
                this.c = jSONObject;
            }

            public final f a(String str, String str2, JSONObject jSONObject) {
                return new f(str, str2, jSONObject);
            }

            public static /* synthetic */ f a(f fVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fVar.f7779a;
                }
                if ((i & 2) != 0) {
                    str2 = fVar.b;
                }
                if ((i & 4) != 0) {
                    jSONObject = fVar.c;
                }
                return fVar.a(str, str2, jSONObject);
            }

            public /* synthetic */ f(String str, String str2, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jSONObject);
            }
        }

        public static final class g {

            /* renamed from: a, reason: collision with root package name */
            private final Boolean f7780a;
            private final a b;
            private final Boolean c;
            private final C0314c d;
            private final List<String> e;
            private final Integer f;
            private final Boolean g;
            private final b h;

            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                private final String f7781a;
                private final String b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.f7781a;
                }

                public final String b() {
                    return this.b;
                }

                public final String c() {
                    return this.b;
                }

                public final String d() {
                    return this.f7781a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return Intrinsics.areEqual(this.f7781a, aVar.f7781a) && Intrinsics.areEqual(this.b, aVar.b);
                }

                public int hashCode() {
                    String str = this.f7781a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.b;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "ConsentView(pre=" + this.f7781a + ", post=" + this.b + ")";
                }

                public a(String str, String str2) {
                    this.f7781a = str;
                    this.b = str2;
                }

                public final a a(String str, String str2) {
                    return new a(str, str2);
                }

                public /* synthetic */ a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }

                public static /* synthetic */ a a(a aVar, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.f7781a;
                    }
                    if ((i & 2) != 0) {
                        str2 = aVar.b;
                    }
                    return aVar.a(str, str2);
                }
            }

            public static final class b {

                /* renamed from: a, reason: collision with root package name */
                private final JSONObject f7782a;

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final JSONObject a() {
                    return this.f7782a;
                }

                public final JSONObject b() {
                    return this.f7782a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && Intrinsics.areEqual(this.f7782a, ((b) obj).f7782a);
                }

                public int hashCode() {
                    JSONObject jSONObject = this.f7782a;
                    if (jSONObject == null) {
                        return 0;
                    }
                    return jSONObject.hashCode();
                }

                public String toString() {
                    return "EpConfig(traits=" + this.f7782a + ")";
                }

                public b(JSONObject jSONObject) {
                    this.f7782a = jSONObject;
                }

                public final b a(JSONObject jSONObject) {
                    return new b(jSONObject);
                }

                public /* synthetic */ b(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : jSONObject);
                }

                public static /* synthetic */ b a(b bVar, JSONObject jSONObject, int i, Object obj) {
                    if ((i & 1) != 0) {
                        jSONObject = bVar.f7782a;
                    }
                    return bVar.a(jSONObject);
                }
            }

            /* renamed from: com.ironsource.M3$c$g$c, reason: collision with other inner class name */
            public static final class C0314c {

                /* renamed from: a, reason: collision with root package name */
                private final Map<String, a> f7783a;

                /* renamed from: com.ironsource.M3$c$g$c$a */
                public static final class a {

                    /* renamed from: a, reason: collision with root package name */
                    private final List<String> f7784a;

                    /* JADX WARN: Multi-variable type inference failed */
                    public a() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    public final List<String> a() {
                        return this.f7784a;
                    }

                    public final List<String> b() {
                        return this.f7784a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && Intrinsics.areEqual(this.f7784a, ((a) obj).f7784a);
                    }

                    public int hashCode() {
                        List<String> list = this.f7784a;
                        if (list == null) {
                            return 0;
                        }
                        return list.hashCode();
                    }

                    public String toString() {
                        return "Provider(skanIds=" + this.f7784a + ")";
                    }

                    public a(List<String> list) {
                        this.f7784a = list;
                    }

                    public final a a(List<String> list) {
                        return new a(list);
                    }

                    public /* synthetic */ a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : list);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ a a(a aVar, List list, int i, Object obj) {
                        if ((i & 1) != 0) {
                            list = aVar.f7784a;
                        }
                        return aVar.a(list);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C0314c() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final Map<String, a> a() {
                    return this.f7783a;
                }

                public final Map<String, a> b() {
                    return this.f7783a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0314c) && Intrinsics.areEqual(this.f7783a, ((C0314c) obj).f7783a);
                }

                public int hashCode() {
                    Map<String, a> map = this.f7783a;
                    if (map == null) {
                        return 0;
                    }
                    return map.hashCode();
                }

                public String toString() {
                    return "Skd(providers=" + this.f7783a + ")";
                }

                public C0314c(Map<String, a> map) {
                    this.f7783a = map;
                }

                public final C0314c a(Map<String, a> map) {
                    return new C0314c(map);
                }

                public /* synthetic */ C0314c(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : map);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ C0314c a(C0314c c0314c, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        map = c0314c.f7783a;
                    }
                    return c0314c.a(map);
                }
            }

            public g() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            public final Boolean a() {
                return this.f7780a;
            }

            public final a b() {
                return this.b;
            }

            public final Boolean c() {
                return this.c;
            }

            public final C0314c d() {
                return this.d;
            }

            public final List<String> e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.areEqual(this.f7780a, gVar.f7780a) && Intrinsics.areEqual(this.b, gVar.b) && Intrinsics.areEqual(this.c, gVar.c) && Intrinsics.areEqual(this.d, gVar.d) && Intrinsics.areEqual(this.e, gVar.e) && Intrinsics.areEqual(this.f, gVar.f) && Intrinsics.areEqual(this.g, gVar.g) && Intrinsics.areEqual(this.h, gVar.h);
            }

            public final Integer f() {
                return this.f;
            }

            public final Boolean g() {
                return this.g;
            }

            public final b h() {
                return this.h;
            }

            public int hashCode() {
                Boolean bool = this.f7780a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                a aVar = this.b;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                Boolean bool2 = this.c;
                int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C0314c c0314c = this.d;
                int hashCode4 = (hashCode3 + (c0314c == null ? 0 : c0314c.hashCode())) * 31;
                List<String> list = this.e;
                int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
                Integer num = this.f;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.g;
                int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                b bVar = this.h;
                return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            public final a i() {
                return this.b;
            }

            public final b j() {
                return this.h;
            }

            public final List<String> k() {
                return this.e;
            }

            public final Boolean l() {
                return this.c;
            }

            public final Boolean m() {
                return this.g;
            }

            public final Boolean n() {
                return this.f7780a;
            }

            public final C0314c o() {
                return this.d;
            }

            public final Integer p() {
                return this.f;
            }

            public String toString() {
                return "Settings(sid=" + this.f7780a + ", consentView=" + this.b + ", passAdditionalContextualSignals=" + this.c + ", skd=" + this.d + ", isp=" + this.e + ", uaeh=" + this.f + ", sharedThreadPool=" + this.g + ", epConfig=" + this.h + ")";
            }

            public g(Boolean bool, a aVar, Boolean bool2, C0314c c0314c, List<String> list, Integer num, Boolean bool3, b bVar) {
                this.f7780a = bool;
                this.b = aVar;
                this.c = bool2;
                this.d = c0314c;
                this.e = list;
                this.f = num;
                this.g = bool3;
                this.h = bVar;
            }

            public final g a(Boolean bool, a aVar, Boolean bool2, C0314c c0314c, List<String> list, Integer num, Boolean bool3, b bVar) {
                return new g(bool, aVar, bool2, c0314c, list, num, bool3, bVar);
            }

            public /* synthetic */ g(Boolean bool, a aVar, Boolean bool2, C0314c c0314c, List list, Integer num, Boolean bool3, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : c0314c, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool3, (i & 128) == 0 ? bVar : null);
            }
        }

        public static final class h {

            /* renamed from: a, reason: collision with root package name */
            private final List<String> f7785a;
            private final JSONObject b;
            private final Boolean c;
            private final Boolean d;
            private final Boolean e;

            public h() {
                this(null, null, null, null, null, 31, null);
            }

            public final List<String> a() {
                return this.f7785a;
            }

            public final JSONObject b() {
                return this.b;
            }

            public final Boolean c() {
                return this.c;
            }

            public final Boolean d() {
                return this.d;
            }

            public final Boolean e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return Intrinsics.areEqual(this.f7785a, hVar.f7785a) && Intrinsics.areEqual(this.b, hVar.b) && Intrinsics.areEqual(this.c, hVar.c) && Intrinsics.areEqual(this.d, hVar.d) && Intrinsics.areEqual(this.e, hVar.e);
            }

            public final Boolean f() {
                return this.d;
            }

            public final Boolean g() {
                return this.c;
            }

            public final Boolean h() {
                return this.e;
            }

            public int hashCode() {
                List<String> list = this.f7785a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                JSONObject jSONObject = this.b;
                int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.e;
                return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
            }

            public final List<String> i() {
                return this.f7785a;
            }

            public final JSONObject j() {
                return this.b;
            }

            public String toString() {
                return "Token(optInKeys=" + this.f7785a + ", tokenGenericParams=" + this.b + ", compressToken=" + this.c + ", compressExternalToken=" + this.d + ", oneToken=" + this.e + ")";
            }

            public h(List<String> list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3) {
                this.f7785a = list;
                this.b = jSONObject;
                this.c = bool;
                this.d = bool2;
                this.e = bool3;
            }

            public final h a(List<String> list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3) {
                return new h(list, jSONObject, bool, bool2, bool3);
            }

            public static /* synthetic */ h a(h hVar, List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = hVar.f7785a;
                }
                if ((i & 2) != 0) {
                    jSONObject = hVar.b;
                }
                JSONObject jSONObject2 = jSONObject;
                if ((i & 4) != 0) {
                    bool = hVar.c;
                }
                Boolean bool4 = bool;
                if ((i & 8) != 0) {
                    bool2 = hVar.d;
                }
                Boolean bool5 = bool2;
                if ((i & 16) != 0) {
                    bool3 = hVar.e;
                }
                return hVar.a(list, jSONObject2, bool4, bool5, bool3);
            }

            public /* synthetic */ h(List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : jSONObject, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3);
            }
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        public final e a() {
            return this.f7771a;
        }

        public final Boolean b() {
            return this.j;
        }

        public final C0313c c() {
            return this.b;
        }

        public final h d() {
            return this.c;
        }

        public final f e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f7771a, cVar.f7771a) && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c, cVar.c) && Intrinsics.areEqual(this.d, cVar.d) && Intrinsics.areEqual(this.e, cVar.e) && Intrinsics.areEqual(this.f, cVar.f) && Intrinsics.areEqual(this.g, cVar.g) && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.i, cVar.i) && Intrinsics.areEqual(this.j, cVar.j);
        }

        public final a f() {
            return this.e;
        }

        public final b g() {
            return this.f;
        }

        public final g h() {
            return this.g;
        }

        public int hashCode() {
            e eVar = this.f7771a;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            C0313c c0313c = this.b;
            int hashCode2 = (hashCode + (c0313c == null ? 0 : c0313c.hashCode())) * 31;
            h hVar = this.c;
            int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            f fVar = this.d;
            int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            a aVar = this.e;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar = this.f;
            int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            g gVar = this.g;
            int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            d dVar = this.h;
            int hashCode8 = (hashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Boolean bool = this.i;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.j;
            return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final d i() {
            return this.h;
        }

        public final Boolean j() {
            return this.i;
        }

        public final a k() {
            return this.e;
        }

        public final b l() {
            return this.f;
        }

        public final C0313c m() {
            return this.b;
        }

        public final d n() {
            return this.h;
        }

        public final Boolean o() {
            return this.j;
        }

        public final e p() {
            return this.f7771a;
        }

        public final f q() {
            return this.d;
        }

        public final g r() {
            return this.g;
        }

        public final h s() {
            return this.c;
        }

        public final Boolean t() {
            return this.i;
        }

        public String toString() {
            return "Application(loggers=" + this.f7771a + ", events=" + this.b + ", token=" + this.c + ", segment=" + this.d + ", auction=" + this.e + ", crashReporter=" + this.f + ", settings=" + this.g + ", external=" + this.h + ", uuidEnabled=" + this.i + ", integration=" + this.j + ")";
        }

        public c(e eVar, C0313c c0313c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2) {
            this.f7771a = eVar;
            this.b = c0313c;
            this.c = hVar;
            this.d = fVar;
            this.e = aVar;
            this.f = bVar;
            this.g = gVar;
            this.h = dVar;
            this.i = bool;
            this.j = bool2;
        }

        public final c a(e eVar, C0313c c0313c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2) {
            return new c(eVar, c0313c, hVar, fVar, aVar, bVar, gVar, dVar, bool, bool2);
        }

        public /* synthetic */ c(e eVar, C0313c c0313c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : eVar, (i & 2) != 0 ? null : c0313c, (i & 4) != 0 ? null : hVar, (i & 8) != 0 ? null : fVar, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : bVar, (i & 64) != 0 ? null : gVar, (i & 128) != 0 ? null : dVar, (i & 256) != 0 ? null : bool, (i & 512) == 0 ? bool2 : null);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f7786a;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.f7786a;
        }

        public final String b() {
            return this.f7786a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f7786a, ((d) obj).f7786a);
        }

        public int hashCode() {
            String str = this.f7786a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "TestSuite(controllerUrl=" + this.f7786a + ")";
        }

        public d(String str) {
            this.f7786a = str;
        }

        public final d a(String str) {
            return new d(str);
        }

        public /* synthetic */ d(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ d a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f7786a;
            }
            return dVar.a(str);
        }
    }

    public M3() {
        this(null, null, null, null, 15, null);
    }

    public final c a() {
        return this.f7760a;
    }

    public final a b() {
        return this.b;
    }

    public final d c() {
        return this.c;
    }

    public final b d() {
        return this.d;
    }

    public final a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M3)) {
            return false;
        }
        M3 m3 = (M3) obj;
        return Intrinsics.areEqual(this.f7760a, m3.f7760a) && Intrinsics.areEqual(this.b, m3.b) && Intrinsics.areEqual(this.c, m3.c) && Intrinsics.areEqual(this.d, m3.d);
    }

    public final b f() {
        return this.d;
    }

    public final c g() {
        return this.f7760a;
    }

    public final d h() {
        return this.c;
    }

    public int hashCode() {
        c cVar = this.f7760a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.d;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "Configurations2(application=" + this.f7760a + ", adFormats=" + this.b + ", testSuite=" + this.c + ", adQuality=" + this.d + ")";
    }

    public M3(c cVar, a aVar, d dVar, b bVar) {
        this.f7760a = cVar;
        this.b = aVar;
        this.c = dVar;
        this.d = bVar;
    }

    public final M3 a(c cVar, a aVar, d dVar, b bVar) {
        return new M3(cVar, aVar, dVar, bVar);
    }

    public static /* synthetic */ M3 a(M3 m3, c cVar, a aVar, d dVar, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = m3.f7760a;
        }
        if ((i & 2) != 0) {
            aVar = m3.b;
        }
        if ((i & 4) != 0) {
            dVar = m3.c;
        }
        if ((i & 8) != 0) {
            bVar = m3.d;
        }
        return m3.a(cVar, aVar, dVar, bVar);
    }

    public /* synthetic */ M3(c cVar, a aVar, d dVar, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : bVar);
    }
}
