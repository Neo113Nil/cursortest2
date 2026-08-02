package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f extends ContextWrapper {

    @VisibleForTesting
    public static final a j = new a();
    public final com.bumptech.glide.load.engine.bitmap_recycle.b a;
    public final com.bumptech.glide.util.f b;
    public final b.a c;
    public final List<com.bumptech.glide.request.h<Object>> d;
    public final Map<Class<?>, n<?, ?>> e;
    public final com.bumptech.glide.load.engine.m f;
    public final g g;
    public final int h;

    @Nullable
    @GuardedBy("this")
    public com.bumptech.glide.request.i i;

    public f(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @NonNull j jVar, @NonNull b.a aVar, @NonNull Map map, @NonNull List list, @NonNull com.bumptech.glide.load.engine.m mVar, @NonNull g gVar, int i) {
        super(context.getApplicationContext());
        this.a = bVar;
        this.c = aVar;
        this.d = list;
        this.e = map;
        this.f = mVar;
        this.g = gVar;
        this.h = i;
        this.b = new com.bumptech.glide.util.f(jVar);
    }

    @NonNull
    public final i a() {
        return (i) this.b.get();
    }
}
