package com.ironsource;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class W1 implements X1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4550n9 f7982a;
    private final com.ironsource.mediationsdk.d b;
    private final C4382e2 c;

    public W1(C4550n9 instanceInfo, com.ironsource.mediationsdk.d auctionDataUtils, C4382e2 c4382e2) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        Intrinsics.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.f7982a = instanceInfo;
        this.b = auctionDataUtils;
        this.c = c4382e2;
    }

    @Override // com.ironsource.X1
    public void a(String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C4382e2 c4382e2 = this.c;
        if (c4382e2 == null || (emptyList = c4382e2.b()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    @Override // com.ironsource.X1
    public void b(String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C4382e2 c4382e2 = this.c;
        if (c4382e2 == null || (emptyList = c4382e2.a()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    @Override // com.ironsource.X1
    public void c(String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C4382e2 c4382e2 = this.c;
        if (c4382e2 == null || (emptyList = c4382e2.c()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.b.a(str, this.f7982a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.f7982a.e(), this.f7982a.f(), this.f7982a.d(), "", "", "", ""));
        }
    }
}
