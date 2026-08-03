package com.inmobi.media;

/* loaded from: classes5.dex */
public final class K8 implements com.inmobi.media.InterfaceC2470ho {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.N8 f4796a;

    public K8(com.inmobi.media.N8 n8) {
        this.f4796a = n8;
    }

    @Override // com.inmobi.media.InterfaceC2470ho
    public final void a(java.util.ArrayList visibleViews, java.util.ArrayList invisibleViews) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        java.util.Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            com.inmobi.media.L8 l8 = (com.inmobi.media.L8) this.f4796a.f4850a.get(view);
            if (l8 == null) {
                this.f4796a.a(view);
            } else {
                com.inmobi.media.L8 l82 = (com.inmobi.media.L8) this.f4796a.b.get(view);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(l8.f4813a, l82 != null ? l82.f4813a : null)) {
                    l8.d = android.os.SystemClock.uptimeMillis();
                    this.f4796a.b.put(view, l8);
                }
            }
        }
        java.util.Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            this.f4796a.b.remove((android.view.View) it2.next());
        }
        com.inmobi.media.N8 n8 = this.f4796a;
        if (n8.e.hasMessages(0)) {
            return;
        }
        n8.e.postDelayed(n8.f, n8.g);
    }
}
