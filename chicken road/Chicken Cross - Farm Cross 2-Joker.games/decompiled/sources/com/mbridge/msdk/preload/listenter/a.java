package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* compiled from: PreloadListenerEx.java */
/* loaded from: classes6.dex */
public class a implements PreloadListener {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f9681a;
    private int b = 0;
    private boolean c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f9681a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f9681a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9681a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f9681a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9681a.get().onPreloadSucceed();
    }

    public void a(boolean z) {
        this.c = z;
    }
}
