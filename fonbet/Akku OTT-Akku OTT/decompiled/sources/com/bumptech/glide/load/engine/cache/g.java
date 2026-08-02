package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.engine.x;

/* loaded from: classes3.dex */
public final class g extends com.bumptech.glide.util.i<com.bumptech.glide.load.g, x<?>> {
    public m a;

    @Nullable
    public final /* bridge */ /* synthetic */ x a(@NonNull com.bumptech.glide.load.g gVar, @Nullable r rVar) {
        return (x) super.put(gVar, rVar);
    }

    @Nullable
    public final /* bridge */ /* synthetic */ x b(@NonNull p pVar) {
        return (x) super.remove(pVar);
    }

    @Override // com.bumptech.glide.util.i
    public final int getSize(@Nullable x<?> xVar) {
        x<?> xVar2 = xVar;
        return xVar2 == null ? super.getSize(null) : xVar2.a();
    }

    @Override // com.bumptech.glide.util.i
    public final void onItemEvicted(@NonNull com.bumptech.glide.load.g gVar, @Nullable x<?> xVar) {
        x<?> xVar2 = xVar;
        m mVar = this.a;
        if (mVar == null || xVar2 == null) {
            return;
        }
        mVar.e.a(xVar2, true);
    }
}
