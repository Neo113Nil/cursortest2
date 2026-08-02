package com.bumptech.glide.manager;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class r {
    public final Set<com.bumptech.glide.request.d> a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(@Nullable com.bumptech.glide.request.d dVar) {
        boolean z = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.a.remove(dVar);
        if (!this.b.remove(dVar) && !remove) {
            z = false;
        }
        if (z) {
            dVar.clear();
        }
        return z;
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
