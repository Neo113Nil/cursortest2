package com.ironsource;

/* renamed from: com.ironsource.bf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2976bf implements com.ironsource.K8, com.ironsource.K8.a {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.Integer> f6163a = new java.util.HashMap();
    private final java.util.Map<java.lang.String, java.lang.Integer> b = new java.util.HashMap();

    @Override // com.ironsource.K8.a
    public void a(java.util.List<? extends com.ironsource.K8.b> smashes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smashes, "smashes");
        for (com.ironsource.K8.b bVar : smashes) {
            this.f6163a.put(bVar.c(), 0);
            this.b.put(bVar.c(), java.lang.Integer.valueOf(bVar.b()));
        }
    }

    @Override // com.ironsource.K8
    public boolean b(com.ironsource.K8.b smash) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            java.lang.String c = smash.c();
            if (this.f6163a.containsKey(c)) {
                java.lang.Integer num = this.f6163a.get(c);
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                z = num.intValue() >= smash.b();
            }
        }
        return z;
    }

    @Override // com.ironsource.K8.a
    public void a(com.ironsource.K8.b smash) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            java.lang.String c = smash.c();
            if (this.f6163a.containsKey(c)) {
                java.util.Map<java.lang.String, java.lang.Integer> map = this.f6163a;
                java.lang.Integer num = map.get(c);
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                map.put(c, java.lang.Integer.valueOf(num.intValue() + 1));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.ironsource.K8
    public boolean a() {
        for (java.lang.String str : this.b.keySet()) {
            java.lang.Integer num = this.f6163a.get(str);
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            java.lang.Integer num2 = this.b.get(str);
            kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
            if (intValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
