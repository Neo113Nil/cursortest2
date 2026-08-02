package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;

/* loaded from: classes4.dex */
public final class O extends D {
    public final com.google.android.gms.common.api.g b;

    public O(com.google.android.gms.common.api.g gVar) {
        this.b = gVar;
    }

    @Override // com.google.android.gms.common.api.h
    public final <A extends a.b, R extends com.google.android.gms.common.api.l, T extends AbstractC0830d<R, A>> T a(@NonNull T t) {
        return (T) this.b.doRead((com.google.android.gms.common.api.g) t);
    }

    @Override // com.google.android.gms.common.api.h
    public final <A extends a.b, T extends AbstractC0830d<? extends com.google.android.gms.common.api.l, A>> T b(@NonNull T t) {
        return (T) this.b.doWrite((com.google.android.gms.common.api.g) t);
    }

    @Override // com.google.android.gms.common.api.h
    public final Looper c() {
        return this.b.getLooper();
    }

    @Override // com.google.android.gms.common.api.h
    public final void d() {
    }

    @Override // com.google.android.gms.common.api.h
    public final void e() {
    }
}
