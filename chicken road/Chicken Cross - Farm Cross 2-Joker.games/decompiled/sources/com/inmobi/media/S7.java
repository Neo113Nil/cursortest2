package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class S7 implements InterfaceC3664dq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T7 f6844a;

    public S7(T7 t7) {
        this.f6844a = t7;
    }

    @Override // com.inmobi.media.InterfaceC3664dq
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            Zp zp = (Zp) this.f6844a.i.get(view);
            if (zp != null) {
                C3913mj c3913mj = (C3913mj) zp;
                Intrinsics.checkNotNullParameter(view, "view");
                if (view instanceof Ej) {
                    if (c3913mj.f7251a.hasWindowFocus()) {
                        c3913mj.f7251a.d(true);
                    } else {
                        c3913mj.f7251a.d(false);
                    }
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            Zp zp2 = (Zp) this.f6844a.i.get(view2);
            if (zp2 != null) {
                C3913mj c3913mj2 = (C3913mj) zp2;
                Intrinsics.checkNotNullParameter(view2, "view");
                if (view2 instanceof Ej) {
                    if (c3913mj2.f7251a.hasWindowFocus()) {
                        c3913mj2.f7251a.d(false);
                    } else {
                        c3913mj2.f7251a.d(false);
                    }
                }
            }
        }
    }
}
