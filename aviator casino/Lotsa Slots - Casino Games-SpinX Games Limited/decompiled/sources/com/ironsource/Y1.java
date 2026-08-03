package com.ironsource;

/* loaded from: classes5.dex */
public final class Y1 implements com.ironsource.Z1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3167m9 f6086a;
    private final com.ironsource.mediationsdk.d b;
    private final com.ironsource.C3053g2 c;

    public Y1(com.ironsource.C3167m9 instanceInfo, com.ironsource.mediationsdk.d auctionDataUtils, com.ironsource.C3053g2 c3053g2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.f6086a = instanceInfo;
        this.b = auctionDataUtils;
        this.c = c3053g2;
    }

    @Override // com.ironsource.Z1
    public void a(java.lang.String methodName) {
        java.util.List<java.lang.String> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
        com.ironsource.C3053g2 c3053g2 = this.c;
        if (c3053g2 == null || (emptyList = c3053g2.b()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    @Override // com.ironsource.Z1
    public void b(java.lang.String methodName) {
        java.util.List<java.lang.String> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
        com.ironsource.C3053g2 c3053g2 = this.c;
        if (c3053g2 == null || (emptyList = c3053g2.a()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    @Override // com.ironsource.Z1
    public void c(java.lang.String methodName) {
        java.util.List<java.lang.String> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
        com.ironsource.C3053g2 c3053g2 = this.c;
        if (c3053g2 == null || (emptyList = c3053g2.c()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    private final void a(java.util.List<java.lang.String> list, java.lang.String str) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            this.b.a(str, this.f6086a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.f6086a.e(), this.f6086a.f(), this.f6086a.d(), "", "", "", ""));
        }
    }
}
