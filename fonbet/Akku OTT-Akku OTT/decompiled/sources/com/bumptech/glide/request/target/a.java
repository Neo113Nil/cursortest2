package com.bumptech.glide.request.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.d;
import com.bumptech.glide.request.j;
import com.bumptech.glide.util.m;

/* loaded from: classes3.dex */
public abstract class a<T> implements b<T> {
    public final int a;
    public final int b;

    @Nullable
    public d c;

    public a() {
        if (!m.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }

    @Override // com.bumptech.glide.request.target.b
    public final void b(@NonNull j jVar) {
        jVar.j(this.a, this.b);
    }

    @Override // com.bumptech.glide.request.target.b
    @Nullable
    public final d d() {
        return this.c;
    }

    @Override // com.bumptech.glide.request.target.b
    public final void g(@Nullable d dVar) {
        this.c = dVar;
    }

    @Override // com.bumptech.glide.manager.l
    public final void h() {
    }

    @Override // com.bumptech.glide.manager.l
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.l
    public final void onStart() {
    }

    @Override // com.bumptech.glide.request.target.b
    public final void c() {
    }
}
