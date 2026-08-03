package com.ironsource;

/* renamed from: com.ironsource.o1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3195o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3195o1 f6506a = new com.ironsource.C3195o1();

    /* renamed from: com.ironsource.o1$a */
    public static final class a implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.mediationsdk.IronSource.a f6507a;

        public a(com.ironsource.mediationsdk.IronSource.a value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.f6507a = value;
        }

        private final com.ironsource.mediationsdk.IronSource.a a() {
            return this.f6507a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.a) && this.f6507a == ((com.ironsource.C3195o1.a) obj).f6507a;
        }

        public int hashCode() {
            return this.f6507a.hashCode();
        }

        public java.lang.String toString() {
            return "AdFormatEntity(value=" + this.f6507a + ")";
        }

        public final com.ironsource.C3195o1.a a(com.ironsource.mediationsdk.IronSource.a value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.C3195o1.a(value);
        }

        public static /* synthetic */ com.ironsource.C3195o1.a a(com.ironsource.C3195o1.a aVar, com.ironsource.mediationsdk.IronSource.a aVar2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.f6507a;
            }
            return aVar.a(aVar2);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("adUnit", java.lang.Integer.valueOf(com.ironsource.Ff.c(this.f6507a)));
        }
    }

    /* renamed from: com.ironsource.o1$b */
    public static final class b implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6508a;

        public b(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.f6508a = value;
        }

        private final java.lang.String a() {
            return this.f6508a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6508a, ((com.ironsource.C3195o1.b) obj).f6508a);
        }

        public int hashCode() {
            return this.f6508a.hashCode();
        }

        public java.lang.String toString() {
            return "AdIdentifier(value=" + this.f6508a + ")";
        }

        public final com.ironsource.C3195o1.b a(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.C3195o1.b(value);
        }

        public static /* synthetic */ com.ironsource.C3195o1.b a(com.ironsource.C3195o1.b bVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f6508a;
            }
            return bVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f6508a);
        }
    }

    /* renamed from: com.ironsource.o1$c */
    public static final class c implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final com.unity3d.ironsourceads.AdSize f6509a;

        public c(com.unity3d.ironsourceads.AdSize size) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
            this.f6509a = size;
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            int i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            java.lang.String sizeDescription = this.f6509a.getSizeDescription();
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
                if (hashCode == 1951953708 && sizeDescription.equals(com.ironsource.mediationsdk.j.f6439a)) {
                    i = 1;
                }
                i = 0;
            } else {
                if (sizeDescription.equals(com.ironsource.mediationsdk.j.d)) {
                    i = 4;
                }
                i = 0;
            }
            bundle.put(com.ironsource.mediationsdk.j.h, java.lang.Integer.valueOf(i));
        }
    }

    /* renamed from: com.ironsource.o1$d */
    public static final class d implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6510a;

        public d(java.lang.String auctionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f6510a = auctionId;
        }

        private final java.lang.String a() {
            return this.f6510a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6510a, ((com.ironsource.C3195o1.d) obj).f6510a);
        }

        public int hashCode() {
            return this.f6510a.hashCode();
        }

        public java.lang.String toString() {
            return "AuctionId(auctionId=" + this.f6510a + ")";
        }

        public final com.ironsource.C3195o1.d a(java.lang.String auctionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            return new com.ironsource.C3195o1.d(auctionId);
        }

        public static /* synthetic */ com.ironsource.C3195o1.d a(com.ironsource.C3195o1.d dVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f6510a;
            }
            return dVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("auctionId", this.f6510a);
        }
    }

    /* renamed from: com.ironsource.o1$e */
    public static final class e implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f6511a;

        public e(int i) {
            this.f6511a = i;
        }

        private final int a() {
            return this.f6511a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.e) && this.f6511a == ((com.ironsource.C3195o1.e) obj).f6511a;
        }

        public int hashCode() {
            return this.f6511a;
        }

        public java.lang.String toString() {
            return "DemandOnly(value=" + this.f6511a + ")";
        }

        public final com.ironsource.C3195o1.e a(int i) {
            return new com.ironsource.C3195o1.e(i);
        }

        public static /* synthetic */ com.ironsource.C3195o1.e a(com.ironsource.C3195o1.e eVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.f6511a;
            }
            return eVar.a(i);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, java.lang.Integer.valueOf(this.f6511a));
        }
    }

    /* renamed from: com.ironsource.o1$f */
    public static final class f implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final long f6512a;

        public f(long j) {
            this.f6512a = j;
        }

        private final long a() {
            return this.f6512a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.f) && this.f6512a == ((com.ironsource.C3195o1.f) obj).f6512a;
        }

        public int hashCode() {
            return kotlin.UByte$$ExternalSyntheticBackport0.m(this.f6512a);
        }

        public java.lang.String toString() {
            return "Duration(duration=" + this.f6512a + ")";
        }

        public final com.ironsource.C3195o1.f a(long j) {
            return new com.ironsource.C3195o1.f(j);
        }

        public static /* synthetic */ com.ironsource.C3195o1.f a(com.ironsource.C3195o1.f fVar, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = fVar.f6512a;
            }
            return fVar.a(j);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(this.f6512a));
        }
    }

    /* renamed from: com.ironsource.o1$g */
    public static final class g implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6513a;

        public g(java.lang.String dynamicSourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            this.f6513a = dynamicSourceId;
        }

        private final java.lang.String a() {
            return this.f6513a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6513a, ((com.ironsource.C3195o1.g) obj).f6513a);
        }

        public int hashCode() {
            return this.f6513a.hashCode();
        }

        public java.lang.String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.f6513a + ")";
        }

        public final com.ironsource.C3195o1.g a(java.lang.String dynamicSourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            return new com.ironsource.C3195o1.g(dynamicSourceId);
        }

        public static /* synthetic */ com.ironsource.C3195o1.g a(com.ironsource.C3195o1.g gVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = gVar.f6513a;
            }
            return gVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f6513a);
        }
    }

    /* renamed from: com.ironsource.o1$h */
    public static final class h implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6514a;

        public h(java.lang.String sourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.f6514a = sourceId;
        }

        private final java.lang.String a() {
            return this.f6514a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6514a, ((com.ironsource.C3195o1.h) obj).f6514a);
        }

        public int hashCode() {
            return this.f6514a.hashCode();
        }

        public java.lang.String toString() {
            return "DynamicSourceId(sourceId=" + this.f6514a + ")";
        }

        public final com.ironsource.C3195o1.h a(java.lang.String sourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new com.ironsource.C3195o1.h(sourceId);
        }

        public static /* synthetic */ com.ironsource.C3195o1.h a(com.ironsource.C3195o1.h hVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = hVar.f6514a;
            }
            return hVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f6514a);
        }
    }

    /* renamed from: com.ironsource.o1$i */
    public static final class i implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3195o1.i f6515a = new com.ironsource.C3195o1.i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        }
    }

    /* renamed from: com.ironsource.o1$j */
    public static final class j implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f6516a;

        public j(int i) {
            this.f6516a = i;
        }

        private final int a() {
            return this.f6516a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.j) && this.f6516a == ((com.ironsource.C3195o1.j) obj).f6516a;
        }

        public int hashCode() {
            return this.f6516a;
        }

        public java.lang.String toString() {
            return "ErrorCode(code=" + this.f6516a + ")";
        }

        public final com.ironsource.C3195o1.j a(int i) {
            return new com.ironsource.C3195o1.j(i);
        }

        public static /* synthetic */ com.ironsource.C3195o1.j a(com.ironsource.C3195o1.j jVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = jVar.f6516a;
            }
            return jVar.a(i);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("errorCode", java.lang.Integer.valueOf(this.f6516a));
        }
    }

    /* renamed from: com.ironsource.o1$k */
    public static final class k implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6517a;

        public k(java.lang.String str) {
            this.f6517a = str;
        }

        private final java.lang.String a() {
            return this.f6517a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6517a, ((com.ironsource.C3195o1.k) obj).f6517a);
        }

        public int hashCode() {
            java.lang.String str = this.f6517a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public java.lang.String toString() {
            return "ErrorReason(reason=" + this.f6517a + ")";
        }

        public final com.ironsource.C3195o1.k a(java.lang.String str) {
            return new com.ironsource.C3195o1.k(str);
        }

        public static /* synthetic */ com.ironsource.C3195o1.k a(com.ironsource.C3195o1.k kVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = kVar.f6517a;
            }
            return kVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            java.lang.String str = this.f6517a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f6517a);
        }
    }

    /* renamed from: com.ironsource.o1$l */
    public static final class l implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6518a;

        public l(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.f6518a = value;
        }

        private final java.lang.String a() {
            return this.f6518a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.l) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6518a, ((com.ironsource.C3195o1.l) obj).f6518a);
        }

        public int hashCode() {
            return this.f6518a.hashCode();
        }

        public java.lang.String toString() {
            return "Ext1(value=" + this.f6518a + ")";
        }

        public final com.ironsource.C3195o1.l a(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.C3195o1.l(value);
        }

        public static /* synthetic */ com.ironsource.C3195o1.l a(com.ironsource.C3195o1.l lVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = lVar.f6518a;
            }
            return lVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, this.f6518a);
        }
    }

    /* renamed from: com.ironsource.o1$m */
    public static final class m implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final org.json.JSONObject f6519a;

        public m(org.json.JSONObject jSONObject) {
            this.f6519a = jSONObject;
        }

        private final org.json.JSONObject a() {
            return this.f6519a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.m) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6519a, ((com.ironsource.C3195o1.m) obj).f6519a);
        }

        public int hashCode() {
            org.json.JSONObject jSONObject = this.f6519a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public java.lang.String toString() {
            return "GenericParams(genericParams=" + this.f6519a + ")";
        }

        public final com.ironsource.C3195o1.m a(org.json.JSONObject jSONObject) {
            return new com.ironsource.C3195o1.m(jSONObject);
        }

        public static /* synthetic */ com.ironsource.C3195o1.m a(com.ironsource.C3195o1.m mVar, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                jSONObject = mVar.f6519a;
            }
            return mVar.a(jSONObject);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            org.json.JSONObject jSONObject = this.f6519a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    /* renamed from: com.ironsource.o1$n */
    public static final class n implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f6520a;

        public n(int i) {
            this.f6520a = i;
        }

        private final int a() {
            return this.f6520a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.n) && this.f6520a == ((com.ironsource.C3195o1.n) obj).f6520a;
        }

        public int hashCode() {
            return this.f6520a;
        }

        public java.lang.String toString() {
            return "InstanceType(instanceType=" + this.f6520a + ")";
        }

        public final com.ironsource.C3195o1.n a(int i) {
            return new com.ironsource.C3195o1.n(i);
        }

        public static /* synthetic */ com.ironsource.C3195o1.n a(com.ironsource.C3195o1.n nVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = nVar.f6520a;
            }
            return nVar.a(i);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("instanceType", java.lang.Integer.valueOf(this.f6520a));
        }
    }

    /* renamed from: com.ironsource.o1$o */
    public static final class o implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f6521a;

        public o(int i) {
            this.f6521a = i;
        }

        private final int a() {
            return this.f6521a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.o) && this.f6521a == ((com.ironsource.C3195o1.o) obj).f6521a;
        }

        public int hashCode() {
            return this.f6521a;
        }

        public java.lang.String toString() {
            return "MultipleAdObjects(value=" + this.f6521a + ")";
        }

        public final com.ironsource.C3195o1.o a(int i) {
            return new com.ironsource.C3195o1.o(i);
        }

        public static /* synthetic */ com.ironsource.C3195o1.o a(com.ironsource.C3195o1.o oVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = oVar.f6521a;
            }
            return oVar.a(i);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isMultipleAdObjects", java.lang.Integer.valueOf(this.f6521a));
        }
    }

    /* renamed from: com.ironsource.o1$p */
    public static final class p implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f6522a;

        public p(int i) {
            this.f6522a = i;
        }

        private final int a() {
            return this.f6522a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.p) && this.f6522a == ((com.ironsource.C3195o1.p) obj).f6522a;
        }

        public int hashCode() {
            return this.f6522a;
        }

        public java.lang.String toString() {
            return "OneFlow(value=" + this.f6522a + ")";
        }

        public final com.ironsource.C3195o1.p a(int i) {
            return new com.ironsource.C3195o1.p(i);
        }

        public static /* synthetic */ com.ironsource.C3195o1.p a(com.ironsource.C3195o1.p pVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = pVar.f6522a;
            }
            return pVar.a(i);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isOneFlow", java.lang.Integer.valueOf(this.f6522a));
        }
    }

    /* renamed from: com.ironsource.o1$q */
    public static final class q implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6523a;

        public q(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.f6523a = value;
        }

        private final java.lang.String a() {
            return this.f6523a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.q) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6523a, ((com.ironsource.C3195o1.q) obj).f6523a);
        }

        public int hashCode() {
            return this.f6523a.hashCode();
        }

        public java.lang.String toString() {
            return "Placement(value=" + this.f6523a + ")";
        }

        public final com.ironsource.C3195o1.q a(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.C3195o1.q(value);
        }

        public static /* synthetic */ com.ironsource.C3195o1.q a(com.ironsource.C3195o1.q qVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = qVar.f6523a;
            }
            return qVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("placement", this.f6523a);
        }
    }

    /* renamed from: com.ironsource.o1$r */
    public static final class r implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f6524a;

        public r(int i) {
            this.f6524a = i;
        }

        private final int a() {
            return this.f6524a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.r) && this.f6524a == ((com.ironsource.C3195o1.r) obj).f6524a;
        }

        public int hashCode() {
            return this.f6524a;
        }

        public java.lang.String toString() {
            return "Programmatic(programmatic=" + this.f6524a + ")";
        }

        public final com.ironsource.C3195o1.r a(int i) {
            return new com.ironsource.C3195o1.r(i);
        }

        public static /* synthetic */ com.ironsource.C3195o1.r a(com.ironsource.C3195o1.r rVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = rVar.f6524a;
            }
            return rVar.a(i);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, java.lang.Integer.valueOf(this.f6524a));
        }
    }

    /* renamed from: com.ironsource.o1$s */
    public static final class s implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6525a;

        public s(java.lang.String sourceName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            this.f6525a = sourceName;
        }

        private final java.lang.String a() {
            return this.f6525a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.s) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6525a, ((com.ironsource.C3195o1.s) obj).f6525a);
        }

        public int hashCode() {
            return this.f6525a.hashCode();
        }

        public java.lang.String toString() {
            return "Provider(sourceName=" + this.f6525a + ")";
        }

        public final com.ironsource.C3195o1.s a(java.lang.String sourceName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            return new com.ironsource.C3195o1.s(sourceName);
        }

        public static /* synthetic */ com.ironsource.C3195o1.s a(com.ironsource.C3195o1.s sVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sVar.f6525a;
            }
            return sVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, this.f6525a);
        }
    }

    /* renamed from: com.ironsource.o1$t */
    public static final class t implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f6526a;

        public t(int i) {
            this.f6526a = i;
        }

        private final int a() {
            return this.f6526a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.t) && this.f6526a == ((com.ironsource.C3195o1.t) obj).f6526a;
        }

        public int hashCode() {
            return this.f6526a;
        }

        public java.lang.String toString() {
            return "RewardAmount(value=" + this.f6526a + ")";
        }

        public final com.ironsource.C3195o1.t a(int i) {
            return new com.ironsource.C3195o1.t(i);
        }

        public static /* synthetic */ com.ironsource.C3195o1.t a(com.ironsource.C3195o1.t tVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = tVar.f6526a;
            }
            return tVar.a(i);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, java.lang.Integer.valueOf(this.f6526a));
        }
    }

    /* renamed from: com.ironsource.o1$u */
    public static final class u implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6527a;

        public u(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.f6527a = value;
        }

        private final java.lang.String a() {
            return this.f6527a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.u) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6527a, ((com.ironsource.C3195o1.u) obj).f6527a);
        }

        public int hashCode() {
            return this.f6527a.hashCode();
        }

        public java.lang.String toString() {
            return "RewardName(value=" + this.f6527a + ")";
        }

        public final com.ironsource.C3195o1.u a(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.C3195o1.u(value);
        }

        public static /* synthetic */ com.ironsource.C3195o1.u a(com.ironsource.C3195o1.u uVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = uVar.f6527a;
            }
            return uVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, this.f6527a);
        }
    }

    /* renamed from: com.ironsource.o1$v */
    public static final class v implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6528a;

        public v(java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
            this.f6528a = version;
        }

        private final java.lang.String a() {
            return this.f6528a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.v) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6528a, ((com.ironsource.C3195o1.v) obj).f6528a);
        }

        public int hashCode() {
            return this.f6528a.hashCode();
        }

        public java.lang.String toString() {
            return "SdkVersion(version=" + this.f6528a + ")";
        }

        public final com.ironsource.C3195o1.v a(java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
            return new com.ironsource.C3195o1.v(version);
        }

        public static /* synthetic */ com.ironsource.C3195o1.v a(com.ironsource.C3195o1.v vVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = vVar.f6528a;
            }
            return vVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f6528a);
        }
    }

    /* renamed from: com.ironsource.o1$w */
    public static final class w implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f6529a;

        public w(int i) {
            this.f6529a = i;
        }

        private final int a() {
            return this.f6529a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.w) && this.f6529a == ((com.ironsource.C3195o1.w) obj).f6529a;
        }

        public int hashCode() {
            return this.f6529a;
        }

        public java.lang.String toString() {
            return "SessionDepth(sessionDepth=" + this.f6529a + ")";
        }

        public final com.ironsource.C3195o1.w a(int i) {
            return new com.ironsource.C3195o1.w(i);
        }

        public static /* synthetic */ com.ironsource.C3195o1.w a(com.ironsource.C3195o1.w wVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = wVar.f6529a;
            }
            return wVar.a(i);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("sessionDepth", java.lang.Integer.valueOf(this.f6529a));
        }
    }

    /* renamed from: com.ironsource.o1$x */
    public static final class x implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6530a;

        public x(java.lang.String subProviderId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            this.f6530a = subProviderId;
        }

        private final java.lang.String a() {
            return this.f6530a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6530a, ((com.ironsource.C3195o1.x) obj).f6530a);
        }

        public int hashCode() {
            return this.f6530a.hashCode();
        }

        public java.lang.String toString() {
            return "SubProviderId(subProviderId=" + this.f6530a + ")";
        }

        public final com.ironsource.C3195o1.x a(java.lang.String subProviderId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            return new com.ironsource.C3195o1.x(subProviderId);
        }

        public static /* synthetic */ com.ironsource.C3195o1.x a(com.ironsource.C3195o1.x xVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = xVar.f6530a;
            }
            return xVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("spId", this.f6530a);
        }
    }

    /* renamed from: com.ironsource.o1$y */
    public static final class y implements com.ironsource.InterfaceC3213p1 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6531a;

        public y(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.f6531a = value;
        }

        private final java.lang.String a() {
            return this.f6531a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.C3195o1.y) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6531a, ((com.ironsource.C3195o1.y) obj).f6531a);
        }

        public int hashCode() {
            return this.f6531a.hashCode();
        }

        public java.lang.String toString() {
            return "TransId(value=" + this.f6531a + ")";
        }

        public final com.ironsource.C3195o1.y a(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.C3195o1.y(value);
        }

        public static /* synthetic */ com.ironsource.C3195o1.y a(com.ironsource.C3195o1.y yVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = yVar.f6531a;
            }
            return yVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3213p1
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_TRANS_ID, this.f6531a);
        }
    }

    private C3195o1() {
    }
}
