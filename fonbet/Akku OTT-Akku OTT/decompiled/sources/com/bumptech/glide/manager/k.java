package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k implements j, LifecycleObserver {

    @NonNull
    public final HashSet a = new HashSet();

    @NonNull
    public final Lifecycle b;

    public k(Lifecycle lifecycle) {
        this.b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.j
    public final void a(@NonNull l lVar) {
        this.a.remove(lVar);
    }

    @Override // com.bumptech.glide.manager.j
    public final void b(@NonNull l lVar) {
        this.a.add(lVar);
        Lifecycle lifecycle = this.b;
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            lVar.onDestroy();
        } else if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            lVar.onStart();
        } else {
            lVar.h();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = com.bumptech.glide.util.m.e(this.a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = com.bumptech.glide.util.m.e(this.a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = com.bumptech.glide.util.m.e(this.a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).h();
        }
    }
}
