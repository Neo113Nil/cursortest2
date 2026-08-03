package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public interface a {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C0158a implements com.ironsource.mediationsdk.demandOnly.a {

        /* renamed from: a, reason: collision with root package name */
        private final java.util.List<com.ironsource.C3232q2> f6413a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0158a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public com.ironsource.C3232q2 a(java.lang.String instanceName) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            java.util.Iterator<T> it = this.f6413a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.ironsource.C3232q2) obj).c(), instanceName)) {
                    break;
                }
            }
            return (com.ironsource.C3232q2) obj;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public java.lang.String b() {
            if (this.f6413a.isEmpty()) {
                return "";
            }
            return "1" + ((com.ironsource.C3232q2) kotlin.collections.CollectionsKt.first((java.util.List) this.f6413a)).c();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public com.ironsource.C3232q2 get(int i) {
            if (i < 0 || i >= this.f6413a.size()) {
                return null;
            }
            return this.f6413a.get(i);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.f6413a.isEmpty();
        }

        public C0158a(java.util.List<com.ironsource.C3232q2> waterfall) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            this.f6413a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public java.util.List<com.ironsource.C3232q2> a() {
            return this.f6413a;
        }

        public /* synthetic */ C0158a(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new java.util.ArrayList() : list);
        }
    }

    com.ironsource.C3232q2 a(java.lang.String str);

    java.util.List<com.ironsource.C3232q2> a();

    java.lang.String b();

    com.ironsource.C3232q2 get(int i);

    boolean isEmpty();
}
