package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ko {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f4806a;
    public final java.lang.ref.WeakReference b;

    public Ko(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.f4806a = new java.util.ArrayList();
        this.b = new java.lang.ref.WeakReference(view);
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.w()) {
            view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.inmobi.media.Ko$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets) {
                    return com.inmobi.media.Ko.a(com.inmobi.media.Ko.this, view2, windowInsets);
                }
            });
        }
    }

    public static final android.view.WindowInsets a(com.inmobi.media.Ko ko, android.view.View view, android.view.WindowInsets windowInsets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (!ko.f4806a.isEmpty()) {
            java.util.Iterator it = ko.f4806a.iterator();
            while (it.hasNext()) {
                com.inmobi.media.Oo oo = (com.inmobi.media.Oo) ((com.inmobi.media.Jo) it.next());
                oo.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                oo.f4884a.a(windowInsets);
                oo.a(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void a() {
        android.view.View view;
        this.f4806a.clear();
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.w() || (view = (android.view.View) this.b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
