package com.inmobi.media;

/* renamed from: com.inmobi.media.t7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2770t7 implements com.inmobi.media.InterfaceC2470ho {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2797u7 f5460a;

    public C2770t7(com.inmobi.media.C2797u7 c2797u7) {
        this.f5460a = c2797u7;
    }

    @Override // com.inmobi.media.InterfaceC2470ho
    public final void a(java.util.ArrayList visibleViews, java.util.ArrayList invisibleViews) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        java.util.Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            com.inmobi.media.InterfaceC2339co interfaceC2339co = (com.inmobi.media.InterfaceC2339co) this.f5460a.i.get(view);
            if (interfaceC2339co != null) {
                com.inmobi.media.Xh xh = (com.inmobi.media.Xh) interfaceC2339co;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                if (view instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
                    if (xh.f5050a.hasWindowFocus()) {
                        xh.f5050a.d(true);
                    } else {
                        xh.f5050a.d(false);
                    }
                }
            }
        }
        java.util.Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            android.view.View view2 = (android.view.View) it2.next();
            com.inmobi.media.InterfaceC2339co interfaceC2339co2 = (com.inmobi.media.InterfaceC2339co) this.f5460a.i.get(view2);
            if (interfaceC2339co2 != null) {
                com.inmobi.media.Xh xh2 = (com.inmobi.media.Xh) interfaceC2339co2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                if (view2 instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
                    if (xh2.f5050a.hasWindowFocus()) {
                        xh2.f5050a.d(false);
                    } else {
                        xh2.f5050a.d(false);
                    }
                }
            }
        }
    }
}
