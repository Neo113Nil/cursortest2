package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Wn {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5039a;
    public java.lang.ref.WeakReference b;
    public final com.inmobi.media.core.config.models.AdConfig c;

    public Wn(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi container) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        this.f5039a = container;
        this.c = container.getAdConfig();
    }

    public void a() {
        java.lang.ref.WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public abstract void a(android.content.Context context, byte b);

    public abstract void a(android.view.View view);

    public abstract void a(android.view.View view, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(java.util.Map map);

    public android.view.View b() {
        java.lang.ref.WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    public abstract android.view.View c();

    public abstract void d();
}
