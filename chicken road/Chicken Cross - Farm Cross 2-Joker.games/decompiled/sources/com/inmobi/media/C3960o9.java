package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3960o9 implements InterfaceC3664dq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4044r9 f7283a;

    public C3960o9(C4044r9 c4044r9) {
        this.f7283a = c4044r9;
    }

    @Override // com.inmobi.media.InterfaceC3664dq
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            C3988p9 c3988p9 = (C3988p9) this.f7283a.f7346a.get(view);
            if (c3988p9 == null) {
                this.f7283a.a(view);
            } else {
                C3988p9 c3988p92 = (C3988p9) this.f7283a.b.get(view);
                if (!Intrinsics.areEqual(c3988p9.f7301a, c3988p92 != null ? c3988p92.f7301a : null)) {
                    c3988p9.d = SystemClock.uptimeMillis();
                    this.f7283a.b.put(view, c3988p9);
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            this.f7283a.b.remove((View) it2.next());
        }
        C4044r9 c4044r9 = this.f7283a;
        if (c4044r9.e.hasMessages(0)) {
            return;
        }
        c4044r9.e.postDelayed(c4044r9.f, c4044r9.g);
    }
}
