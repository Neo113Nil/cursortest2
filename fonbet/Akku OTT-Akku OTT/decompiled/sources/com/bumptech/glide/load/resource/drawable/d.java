package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class d extends c<Drawable> {
    @Override // com.bumptech.glide.load.engine.x
    public final int a() {
        T t = this.a;
        return Math.max(1, t.getIntrinsicHeight() * t.getIntrinsicWidth() * 4);
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Class<Drawable> c() {
        return this.a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.x
    public final void recycle() {
    }
}
