package com.inmobi.media;

/* loaded from: classes5.dex */
public final class O3 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f4867a;
    public final com.inmobi.media.Z3 b;
    public final com.inmobi.media.C2799u9 c;
    public final kotlinx.coroutines.flow.MutableSharedFlow d;
    public kotlinx.coroutines.Job e;
    public android.view.View f;
    public com.inmobi.media.Dl g;
    public com.inmobi.media.Ej h;
    public com.inmobi.media.T3 i;
    public final com.inmobi.media.Y3 j;

    public O3(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Z3 companionTelemetryHelper, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionTelemetryHelper, "companionTelemetryHelper");
        this.f4867a = coroutineScope;
        this.b = companionTelemetryHelper;
        this.c = c2799u9;
        this.d = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.i = com.inmobi.media.Q3.f4909a;
        this.j = new com.inmobi.media.Y3(context, c2799u9);
    }

    public final void a(java.util.ArrayList companionAds) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        if (companionAds.isEmpty()) {
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.i, com.inmobi.media.Q3.f4909a)) {
            java.util.Objects.toString(this.i);
            return;
        }
        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(this.b.f5078a);
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("CompanionAdAvailable", a2, com.inmobi.media.EnumC2728rk.f5431a);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f4867a, null, null, new com.inmobi.media.N3(this, companionAds, null), 3, null);
        this.e = launch$default;
    }

    public final void b() {
        android.view.View view = this.f;
        if (view != null) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.O3$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.inmobi.media.O3.a(com.inmobi.media.O3.this, view2);
                }
            });
        }
    }

    public static final void a(com.inmobi.media.O3 o3, android.view.View view) {
        com.inmobi.media.Dl dl = o3.g;
        if (dl != null) {
            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) dl.b, (java.lang.Iterable) dl.c);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : plus) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.De) obj).b, com.ironsource.Y3.d)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.inmobi.media.De) it.next()).f4662a);
            }
            com.inmobi.media.T4.a(o3.d, o3.f4867a, new com.inmobi.media.U3(arrayList2));
        }
    }

    public final void a() {
        android.view.ViewParent parent;
        com.inmobi.media.C2799u9 c2799u9 = this.c;
        if (c2799u9 != null) {
            c2799u9.a("CompanionAdManager", "destroy");
        }
        com.inmobi.media.Ej ej = this.h;
        if (ej != null) {
            com.squareup.picasso.Picasso picasso = com.inmobi.media.Yf.f5066a;
            com.inmobi.media.Yf.b(ej.f4688a).cancelTag(ej.c);
        }
        com.inmobi.media.L6.a(this.e);
        android.view.View view = this.f;
        if (view != null && (parent = view.getParent()) != null) {
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f);
            }
        }
        this.e = null;
        this.h = null;
        this.f = null;
        this.i = com.inmobi.media.Q3.f4909a;
    }
}
