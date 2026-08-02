package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public final class e implements h, d.a<Object> {
    public final List<com.bumptech.glide.load.g> a;
    public final i<?> b;
    public final h.a c;
    public int d = -1;
    public com.bumptech.glide.load.g e;
    public List<ModelLoader<File, ?>> f;
    public int i;
    public volatile ModelLoader.LoadData<?> j;
    public File k;

    public e(List<com.bumptech.glide.load.g> list, i<?> iVar, h.a aVar) {
        this.a = list;
        this.b = iVar;
        this.c = aVar;
    }

    @Override // com.bumptech.glide.load.engine.h
    public final boolean b() {
        while (true) {
            List<ModelLoader<File, ?>> list = this.f;
            boolean z = false;
            if (list != null && this.i < list.size()) {
                this.j = null;
                while (!z && this.i < this.f.size()) {
                    List<ModelLoader<File, ?>> list2 = this.f;
                    int i = this.i;
                    this.i = i + 1;
                    ModelLoader<File, ?> modelLoader = list2.get(i);
                    File file = this.k;
                    i<?> iVar = this.b;
                    this.j = modelLoader.buildLoadData(file, iVar.e, iVar.f, iVar.i);
                    if (this.j != null && this.b.c(this.j.fetcher.getDataClass()) != null) {
                        this.j.fetcher.loadData(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            com.bumptech.glide.load.g gVar = this.a.get(this.d);
            i<?> iVar2 = this.b;
            File b = ((m.c) iVar2.h).a().b(new f(gVar, iVar2.n));
            this.k = b;
            if (b != null) {
                this.e = gVar;
                this.f = this.b.c.a().a.getModelLoaders(b);
                this.i = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.h
    public final void cancel() {
        ModelLoader.LoadData<?> loadData = this.j;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void onDataReady(Object obj) {
        this.c.c(this.e, obj, this.j.fetcher, com.bumptech.glide.load.a.c, this.e);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void onLoadFailed(@NonNull Exception exc) {
        this.c.a(this.e, exc, this.j.fetcher, com.bumptech.glide.load.a.c);
    }
}
