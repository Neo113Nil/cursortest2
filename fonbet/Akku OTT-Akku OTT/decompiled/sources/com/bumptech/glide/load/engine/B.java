package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.model.ModelLoader;

/* loaded from: classes3.dex */
public final class B implements d.a<Object> {
    public final /* synthetic */ ModelLoader.LoadData a;
    public final /* synthetic */ C b;

    public B(C c, ModelLoader.LoadData loadData) {
        this.b = c;
        this.a = loadData;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void onDataReady(@Nullable Object obj) {
        C c = this.b;
        ModelLoader.LoadData<?> loadData = this.a;
        ModelLoader.LoadData<?> loadData2 = c.f;
        if (loadData2 == null || loadData2 != loadData) {
            return;
        }
        C c2 = this.b;
        ModelLoader.LoadData loadData3 = this.a;
        l lVar = c2.a.p;
        if (obj != null && lVar.c(loadData3.fetcher.getDataSource())) {
            c2.e = obj;
            c2.b.k(j.e.b);
        } else {
            j jVar = c2.b;
            com.bumptech.glide.load.g gVar = loadData3.sourceKey;
            com.bumptech.glide.load.data.d<Data> dVar = loadData3.fetcher;
            jVar.c(gVar, obj, dVar, dVar.getDataSource(), c2.i);
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void onLoadFailed(@NonNull Exception exc) {
        C c = this.b;
        ModelLoader.LoadData<?> loadData = this.a;
        ModelLoader.LoadData<?> loadData2 = c.f;
        if (loadData2 == null || loadData2 != loadData) {
            return;
        }
        C c2 = this.b;
        ModelLoader.LoadData loadData3 = this.a;
        j jVar = c2.b;
        com.bumptech.glide.load.g gVar = c2.i;
        com.bumptech.glide.load.data.d<Data> dVar = loadData3.fetcher;
        jVar.a(gVar, exc, dVar, dVar.getDataSource());
    }
}
