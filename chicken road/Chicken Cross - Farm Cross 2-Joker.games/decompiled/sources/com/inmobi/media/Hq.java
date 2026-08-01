package com.inmobi.media;

import android.view.View;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Hq {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6612a;
    public final WeakReference b;

    public Hq(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f6612a = new ArrayList();
        this.b = new WeakReference(view);
        Y5.f6965a.getClass();
        if (Y5.w()) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.inmobi.media.Hq$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return Hq.a(Hq.this, view2, windowInsets);
                }
            });
        }
    }

    public static final WindowInsets a(Hq hq, View view, WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (!hq.f6612a.isEmpty()) {
            Iterator it = hq.f6612a.iterator();
            while (it.hasNext()) {
                Lq lq = (Lq) ((Gq) it.next());
                lq.getClass();
                Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                lq.f6704a.a(windowInsets);
                lq.a(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void a() {
        View view;
        this.f6612a.clear();
        Y5.f6965a.getClass();
        if (!Y5.w() || (view = (View) this.b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
