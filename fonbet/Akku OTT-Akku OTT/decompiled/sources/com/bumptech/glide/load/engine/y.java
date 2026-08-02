package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class y implements h, d.a<Object> {
    public final j a;
    public final i<?> b;
    public int c;
    public int d = -1;
    public com.bumptech.glide.load.g e;
    public List<ModelLoader<File, ?>> f;
    public int i;
    public volatile ModelLoader.LoadData<?> j;
    public File k;
    public z l;

    public y(i iVar, j jVar) {
        this.b = iVar;
        this.a = jVar;
    }

    @Override // com.bumptech.glide.load.engine.h
    public final boolean b() {
        List<Class<?>> list;
        ArrayList a = this.b.a();
        boolean z = false;
        if (!a.isEmpty()) {
            i<?> iVar = this.b;
            com.bumptech.glide.i a2 = iVar.c.a();
            Class<?> cls = iVar.d.getClass();
            Class<?> cls2 = iVar.g;
            Class<?> cls3 = iVar.k;
            com.bumptech.glide.provider.d dVar = a2.h;
            com.bumptech.glide.util.k andSet = dVar.a.getAndSet(null);
            if (andSet == null) {
                andSet = new com.bumptech.glide.util.k(cls, cls2, cls3);
            } else {
                andSet.a = cls;
                andSet.b = cls2;
                andSet.c = cls3;
            }
            synchronized (dVar.b) {
                list = dVar.b.get(andSet);
            }
            dVar.a.set(andSet);
            List<Class<?>> list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                Iterator<Class<?>> it = a2.a.getDataClasses(cls).iterator();
                while (it.hasNext()) {
                    Iterator it2 = a2.c.b(it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!a2.f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                com.bumptech.glide.provider.d dVar2 = a2.h;
                List<Class<?>> unmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (dVar2.b) {
                    dVar2.b.put(new com.bumptech.glide.util.k(cls, cls2, cls3), unmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List<ModelLoader<File, ?>> list3 = this.f;
                    if (list3 != null && this.i < list3.size()) {
                        this.j = null;
                        while (!z && this.i < this.f.size()) {
                            List<ModelLoader<File, ?>> list4 = this.f;
                            int i = this.i;
                            this.i = i + 1;
                            ModelLoader<File, ?> modelLoader = list4.get(i);
                            File file = this.k;
                            i<?> iVar2 = this.b;
                            this.j = modelLoader.buildLoadData(file, iVar2.e, iVar2.f, iVar2.i);
                            if (this.j != null && this.b.c(this.j.fetcher.getDataClass()) != null) {
                                this.j.fetcher.loadData(this.b.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.c + 1;
                        this.c = i3;
                        if (i3 >= a.size()) {
                            break;
                        }
                        this.d = 0;
                    }
                    com.bumptech.glide.load.g gVar = (com.bumptech.glide.load.g) a.get(this.c);
                    Class<?> cls5 = list2.get(this.d);
                    com.bumptech.glide.load.m<Z> e = this.b.e(cls5);
                    i<?> iVar3 = this.b;
                    this.l = new z(iVar3.c.a, gVar, iVar3.n, iVar3.e, iVar3.f, e, cls5, iVar3.i);
                    File b = ((m.c) iVar3.h).a().b(this.l);
                    this.k = b;
                    if (b != null) {
                        this.e = gVar;
                        this.f = this.b.c.a().a.getModelLoaders(b);
                        this.i = 0;
                    }
                }
            } else if (!File.class.equals(this.b.k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.b.d.getClass() + " to " + this.b.k);
            }
        }
        return false;
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
        this.a.c(this.e, obj, this.j.fetcher, com.bumptech.glide.load.a.d, this.l);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void onLoadFailed(@NonNull Exception exc) {
        this.a.a(this.l, exc, this.j.fetcher, com.bumptech.glide.load.a.d);
    }
}
