package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.m1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4524m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C4524m1 f8325a = new C4524m1();

    /* renamed from: com.ironsource.m1$a */
    public static final class a implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final IronSource.a f8326a;

        public a(IronSource.a value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8326a = value;
        }

        private final IronSource.a a() {
            return this.f8326a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f8326a == ((a) obj).f8326a;
        }

        public int hashCode() {
            return this.f8326a.hashCode();
        }

        public String toString() {
            return "AdFormatEntity(value=" + this.f8326a + ")";
        }

        public final a a(IronSource.a value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new a(value);
        }

        public static /* synthetic */ a a(a aVar, IronSource.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.f8326a;
            }
            return aVar.a(aVar2);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("adUnit", Integer.valueOf(Gf.c(this.f8326a)));
        }
    }

    /* renamed from: com.ironsource.m1$b */
    public static final class b implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8327a;

        public b(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8327a = value;
        }

        private final String a() {
            return this.f8327a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f8327a, ((b) obj).f8327a);
        }

        public int hashCode() {
            return this.f8327a.hashCode();
        }

        public String toString() {
            return "AdIdentifier(value=" + this.f8327a + ")";
        }

        public final b a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new b(value);
        }

        public static /* synthetic */ b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f8327a;
            }
            return bVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f8327a);
        }
    }

    /* renamed from: com.ironsource.m1$c */
    public static final class c implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final AdSize f8328a;

        public c(AdSize size) {
            Intrinsics.checkNotNullParameter(size, "size");
            this.f8328a = size;
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            int i;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String sizeDescription = this.f8328a.getSizeDescription();
            int hashCode = sizeDescription.hashCode();
            if (hashCode == -96588539) {
                if (sizeDescription.equals(com.ironsource.mediationsdk.j.g)) {
                    i = 3;
                }
                i = 0;
            } else if (hashCode == 72205083) {
                if (sizeDescription.equals(com.ironsource.mediationsdk.j.b)) {
                    i = 2;
                }
                i = 0;
            } else if (hashCode != 446888797) {
                if (hashCode == 1951953708 && sizeDescription.equals(com.ironsource.mediationsdk.j.f8411a)) {
                    i = 1;
                }
                i = 0;
            } else {
                if (sizeDescription.equals(com.ironsource.mediationsdk.j.d)) {
                    i = 4;
                }
                i = 0;
            }
            bundle.put(com.ironsource.mediationsdk.j.h, Integer.valueOf(i));
        }
    }

    /* renamed from: com.ironsource.m1$d */
    public static final class d implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8329a;

        public d(String auctionId) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f8329a = auctionId;
        }

        private final String a() {
            return this.f8329a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f8329a, ((d) obj).f8329a);
        }

        public int hashCode() {
            return this.f8329a.hashCode();
        }

        public String toString() {
            return "AuctionId(auctionId=" + this.f8329a + ")";
        }

        public final d a(String auctionId) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            return new d(auctionId);
        }

        public static /* synthetic */ d a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f8329a;
            }
            return dVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("auctionId", this.f8329a);
        }
    }

    /* renamed from: com.ironsource.m1$e */
    public static final class e implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f8330a;

        public e(int i) {
            this.f8330a = i;
        }

        private final int a() {
            return this.f8330a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f8330a == ((e) obj).f8330a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f8330a);
        }

        public String toString() {
            return "DemandOnly(value=" + this.f8330a + ")";
        }

        public final e a(int i) {
            return new e(i);
        }

        public static /* synthetic */ e a(e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.f8330a;
            }
            return eVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f8330a));
        }
    }

    /* renamed from: com.ironsource.m1$f */
    public static final class f implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final long f8331a;

        public f(long j) {
            this.f8331a = j;
        }

        private final long a() {
            return this.f8331a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f8331a == ((f) obj).f8331a;
        }

        public int hashCode() {
            return Long.hashCode(this.f8331a);
        }

        public String toString() {
            return "Duration(duration=" + this.f8331a + ")";
        }

        public final f a(long j) {
            return new f(j);
        }

        public static /* synthetic */ f a(f fVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = fVar.f8331a;
            }
            return fVar.a(j);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.f8331a));
        }
    }

    /* renamed from: com.ironsource.m1$g */
    public static final class g implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8332a;

        public g(String dynamicSourceId) {
            Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            this.f8332a = dynamicSourceId;
        }

        private final String a() {
            return this.f8332a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.f8332a, ((g) obj).f8332a);
        }

        public int hashCode() {
            return this.f8332a.hashCode();
        }

        public String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.f8332a + ")";
        }

        public final g a(String dynamicSourceId) {
            Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            return new g(dynamicSourceId);
        }

        public static /* synthetic */ g a(g gVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.f8332a;
            }
            return gVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f8332a);
        }
    }

    /* renamed from: com.ironsource.m1$h */
    public static final class h implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8333a;

        public h(String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.f8333a = sourceId;
        }

        private final String a() {
            return this.f8333a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f8333a, ((h) obj).f8333a);
        }

        public int hashCode() {
            return this.f8333a.hashCode();
        }

        public String toString() {
            return "DynamicSourceId(sourceId=" + this.f8333a + ")";
        }

        public final h a(String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new h(sourceId);
        }

        public static /* synthetic */ h a(h hVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.f8333a;
            }
            return hVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f8333a);
        }
    }

    /* renamed from: com.ironsource.m1$i */
    public static final class i implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f8334a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }
    }

    /* renamed from: com.ironsource.m1$j */
    public static final class j implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f8335a;

        public j(int i) {
            this.f8335a = i;
        }

        private final int a() {
            return this.f8335a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f8335a == ((j) obj).f8335a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f8335a);
        }

        public String toString() {
            return "ErrorCode(code=" + this.f8335a + ")";
        }

        public final j a(int i) {
            return new j(i);
        }

        public static /* synthetic */ j a(j jVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = jVar.f8335a;
            }
            return jVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(this.f8335a));
        }
    }

    /* renamed from: com.ironsource.m1$k */
    public static final class k implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8336a;

        public k(String str) {
            this.f8336a = str;
        }

        private final String a() {
            return this.f8336a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.areEqual(this.f8336a, ((k) obj).f8336a);
        }

        public int hashCode() {
            String str = this.f8336a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ErrorReason(reason=" + this.f8336a + ")";
        }

        public final k a(String str) {
            return new k(str);
        }

        public static /* synthetic */ k a(k kVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = kVar.f8336a;
            }
            return kVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String str = this.f8336a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f8336a);
        }
    }

    /* renamed from: com.ironsource.m1$l */
    public static final class l implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8337a;

        public l(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8337a = value;
        }

        private final String a() {
            return this.f8337a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Intrinsics.areEqual(this.f8337a, ((l) obj).f8337a);
        }

        public int hashCode() {
            return this.f8337a.hashCode();
        }

        public String toString() {
            return "Ext1(value=" + this.f8337a + ")";
        }

        public final l a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new l(value);
        }

        public static /* synthetic */ l a(l lVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lVar.f8337a;
            }
            return lVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.f8337a);
        }
    }

    /* renamed from: com.ironsource.m1$m */
    public static final class m implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f8338a;

        public m(JSONObject jSONObject) {
            this.f8338a = jSONObject;
        }

        private final JSONObject a() {
            return this.f8338a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.areEqual(this.f8338a, ((m) obj).f8338a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f8338a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public String toString() {
            return "GenericParams(genericParams=" + this.f8338a + ")";
        }

        public final m a(JSONObject jSONObject) {
            return new m(jSONObject);
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = mVar.f8338a;
            }
            return mVar.a(jSONObject);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            JSONObject jSONObject = this.f8338a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    /* renamed from: com.ironsource.m1$n */
    public static final class n implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f8339a;

        public n(int i) {
            this.f8339a = i;
        }

        private final int a() {
            return this.f8339a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f8339a == ((n) obj).f8339a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f8339a);
        }

        public String toString() {
            return "InstanceType(instanceType=" + this.f8339a + ")";
        }

        public final n a(int i) {
            return new n(i);
        }

        public static /* synthetic */ n a(n nVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nVar.f8339a;
            }
            return nVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.f8339a));
        }
    }

    /* renamed from: com.ironsource.m1$o */
    public static final class o implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f8340a;

        public o(int i) {
            this.f8340a = i;
        }

        private final int a() {
            return this.f8340a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f8340a == ((o) obj).f8340a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f8340a);
        }

        public String toString() {
            return "MultipleAdObjects(value=" + this.f8340a + ")";
        }

        public final o a(int i) {
            return new o(i);
        }

        public static /* synthetic */ o a(o oVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = oVar.f8340a;
            }
            return oVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.f8340a));
        }
    }

    /* renamed from: com.ironsource.m1$p */
    public static final class p implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f8341a;

        public p(int i) {
            this.f8341a = i;
        }

        private final int a() {
            return this.f8341a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f8341a == ((p) obj).f8341a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f8341a);
        }

        public String toString() {
            return "OneFlow(value=" + this.f8341a + ")";
        }

        public final p a(int i) {
            return new p(i);
        }

        public static /* synthetic */ p a(p pVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pVar.f8341a;
            }
            return pVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.f8341a));
        }
    }

    /* renamed from: com.ironsource.m1$q */
    public static final class q implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8342a;

        public q(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8342a = value;
        }

        private final String a() {
            return this.f8342a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && Intrinsics.areEqual(this.f8342a, ((q) obj).f8342a);
        }

        public int hashCode() {
            return this.f8342a.hashCode();
        }

        public String toString() {
            return "Placement(value=" + this.f8342a + ")";
        }

        public final q a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new q(value);
        }

        public static /* synthetic */ q a(q qVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = qVar.f8342a;
            }
            return qVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("placement", this.f8342a);
        }
    }

    /* renamed from: com.ironsource.m1$r */
    public static final class r implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f8343a;

        public r(int i) {
            this.f8343a = i;
        }

        private final int a() {
            return this.f8343a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f8343a == ((r) obj).f8343a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f8343a);
        }

        public String toString() {
            return "Programmatic(programmatic=" + this.f8343a + ")";
        }

        public final r a(int i) {
            return new r(i);
        }

        public static /* synthetic */ r a(r rVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rVar.f8343a;
            }
            return rVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f8343a));
        }
    }

    /* renamed from: com.ironsource.m1$s */
    public static final class s implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8344a;

        public s(String sourceName) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            this.f8344a = sourceName;
        }

        private final String a() {
            return this.f8344a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Intrinsics.areEqual(this.f8344a, ((s) obj).f8344a);
        }

        public int hashCode() {
            return this.f8344a.hashCode();
        }

        public String toString() {
            return "Provider(sourceName=" + this.f8344a + ")";
        }

        public final s a(String sourceName) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            return new s(sourceName);
        }

        public static /* synthetic */ s a(s sVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sVar.f8344a;
            }
            return sVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.f8344a);
        }
    }

    /* renamed from: com.ironsource.m1$t */
    public static final class t implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f8345a;

        public t(int i) {
            this.f8345a = i;
        }

        private final int a() {
            return this.f8345a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f8345a == ((t) obj).f8345a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f8345a);
        }

        public String toString() {
            return "RewardAmount(value=" + this.f8345a + ")";
        }

        public final t a(int i) {
            return new t(i);
        }

        public static /* synthetic */ t a(t tVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tVar.f8345a;
            }
            return tVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f8345a));
        }
    }

    /* renamed from: com.ironsource.m1$u */
    public static final class u implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8346a;

        public u(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8346a = value;
        }

        private final String a() {
            return this.f8346a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && Intrinsics.areEqual(this.f8346a, ((u) obj).f8346a);
        }

        public int hashCode() {
            return this.f8346a.hashCode();
        }

        public String toString() {
            return "RewardName(value=" + this.f8346a + ")";
        }

        public final u a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new u(value);
        }

        public static /* synthetic */ u a(u uVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uVar.f8346a;
            }
            return uVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f8346a);
        }
    }

    /* renamed from: com.ironsource.m1$v */
    public static final class v implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8347a;

        public v(String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.f8347a = version;
        }

        private final String a() {
            return this.f8347a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && Intrinsics.areEqual(this.f8347a, ((v) obj).f8347a);
        }

        public int hashCode() {
            return this.f8347a.hashCode();
        }

        public String toString() {
            return "SdkVersion(version=" + this.f8347a + ")";
        }

        public final v a(String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            return new v(version);
        }

        public static /* synthetic */ v a(v vVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = vVar.f8347a;
            }
            return vVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f8347a);
        }
    }

    /* renamed from: com.ironsource.m1$w */
    public static final class w implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f8348a;

        public w(int i) {
            this.f8348a = i;
        }

        private final int a() {
            return this.f8348a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f8348a == ((w) obj).f8348a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f8348a);
        }

        public String toString() {
            return "SessionDepth(sessionDepth=" + this.f8348a + ")";
        }

        public final w a(int i) {
            return new w(i);
        }

        public static /* synthetic */ w a(w wVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = wVar.f8348a;
            }
            return wVar.a(i);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.f8348a));
        }
    }

    /* renamed from: com.ironsource.m1$x */
    public static final class x implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8349a;

        public x(String subProviderId) {
            Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            this.f8349a = subProviderId;
        }

        private final String a() {
            return this.f8349a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && Intrinsics.areEqual(this.f8349a, ((x) obj).f8349a);
        }

        public int hashCode() {
            return this.f8349a.hashCode();
        }

        public String toString() {
            return "SubProviderId(subProviderId=" + this.f8349a + ")";
        }

        public final x a(String subProviderId) {
            Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            return new x(subProviderId);
        }

        public static /* synthetic */ x a(x xVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = xVar.f8349a;
            }
            return xVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("spId", this.f8349a);
        }
    }

    /* renamed from: com.ironsource.m1$y */
    public static final class y implements InterfaceC4542n1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8350a;

        public y(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8350a = value;
        }

        private final String a() {
            return this.f8350a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && Intrinsics.areEqual(this.f8350a, ((y) obj).f8350a);
        }

        public int hashCode() {
            return this.f8350a.hashCode();
        }

        public String toString() {
            return "TransId(value=" + this.f8350a + ")";
        }

        public final y a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new y(value);
        }

        public static /* synthetic */ y a(y yVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = yVar.f8350a;
            }
            return yVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4542n1
        public void a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_TRANS_ID, this.f8350a);
        }
    }

    private C4524m1() {
    }
}
