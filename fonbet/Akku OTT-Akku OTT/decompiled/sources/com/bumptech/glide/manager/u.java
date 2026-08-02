package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class u implements l {
    public final Set<com.bumptech.glide.request.target.b<?>> a = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.l
    public final void h() {
        Iterator it = com.bumptech.glide.util.m.e(this.a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.b) it.next()).h();
        }
    }

    @Override // com.bumptech.glide.manager.l
    public final void onDestroy() {
        Iterator it = com.bumptech.glide.util.m.e(this.a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.b) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.l
    public final void onStart() {
        Iterator it = com.bumptech.glide.util.m.e(this.a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.b) it.next()).onStart();
        }
    }
}
