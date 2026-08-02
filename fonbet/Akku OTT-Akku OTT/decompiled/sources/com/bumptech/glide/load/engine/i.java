package com.bumptech.glide.load.engine;

import com.bumptech.glide.i;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.transcode.f;
import com.bumptech.glide.provider.a;
import com.bumptech.glide.provider.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i<Transcode> {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public com.bumptech.glide.f c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public j.c h;
    public com.bumptech.glide.load.i i;
    public Map<Class<?>, com.bumptech.glide.load.m<?>> j;
    public Class<Transcode> k;
    public boolean l;
    public boolean m;
    public com.bumptech.glide.load.g n;
    public com.bumptech.glide.h o;
    public l p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList b = b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.LoadData loadData = (ModelLoader.LoadData) b.get(i);
                if (!arrayList.contains(loadData.sourceKey)) {
                    arrayList.add(loadData.sourceKey);
                }
                for (int i2 = 0; i2 < loadData.alternateKeys.size(); i2++) {
                    if (!arrayList.contains(loadData.alternateKeys.get(i2))) {
                        arrayList.add(loadData.alternateKeys.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            com.bumptech.glide.i a = this.c.a();
            List modelLoaders = a.a.getModelLoaders(this.d);
            int size = modelLoaders.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.LoadData buildLoadData = ((ModelLoader) modelLoaders.get(i)).buildLoadData(this.d, this.e, this.f, this.i);
                if (buildLoadData != null) {
                    arrayList.add(buildLoadData);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data> v<Data, ?, Transcode> c(Class<Data> cls) {
        v<Data, ?, Transcode> vVar;
        Class<Data> cls2;
        Class<?> cls3;
        Class cls4;
        v<Data, ?, Transcode> vVar2;
        ArrayList arrayList;
        com.bumptech.glide.load.resource.transcode.e eVar;
        Class cls5 = cls;
        com.bumptech.glide.i a = this.c.a();
        Class<?> cls6 = this.g;
        Class cls7 = this.k;
        com.bumptech.glide.provider.c cVar = a.i;
        com.bumptech.glide.util.k andSet = cVar.b.getAndSet(null);
        if (andSet == null) {
            andSet = new com.bumptech.glide.util.k();
        }
        andSet.a = cls5;
        andSet.b = cls6;
        andSet.c = cls7;
        synchronized (cVar.a) {
            vVar = (v) cVar.a.get(andSet);
        }
        cVar.b.set(andSet);
        a.i.getClass();
        if (com.bumptech.glide.provider.c.c.equals(vVar)) {
            return null;
        }
        if (vVar != null) {
            return vVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a.c.b(cls5, cls6).iterator();
        while (it.hasNext()) {
            Class<?> cls8 = (Class) it.next();
            Iterator it2 = a.f.a(cls8, cls7).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                com.bumptech.glide.provider.e eVar2 = a.c;
                synchronized (eVar2) {
                    arrayList = new ArrayList();
                    Iterator it3 = eVar2.a.iterator();
                    while (it3.hasNext()) {
                        List<e.a> list = (List) eVar2.b.get((String) it3.next());
                        if (list != null) {
                            for (e.a aVar : list) {
                                if (aVar.a.isAssignableFrom(cls5) && cls8.isAssignableFrom(aVar.b)) {
                                    arrayList.add(aVar.c);
                                }
                            }
                        }
                    }
                }
                com.bumptech.glide.load.resource.transcode.f fVar = a.f;
                synchronized (fVar) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        Iterator it4 = fVar.a.iterator();
                        while (it4.hasNext()) {
                            f.a aVar2 = (f.a) it4.next();
                            if (aVar2.a.isAssignableFrom(cls8) && cls9.isAssignableFrom(aVar2.b)) {
                                eVar = aVar2.c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    eVar = com.bumptech.glide.load.resource.transcode.g.a;
                }
                arrayList2.add(new k(cls5, cls8, cls9, arrayList, eVar, a.j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            vVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            vVar2 = new v<>(cls2, cls3, cls4, arrayList2, a.j);
        }
        com.bumptech.glide.provider.c cVar2 = a.i;
        synchronized (cVar2.a) {
            cVar2.a.put(new com.bumptech.glide.util.k(cls2, cls3, cls4), vVar2 != null ? vVar2 : com.bumptech.glide.provider.c.c);
        }
        return vVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = (com.bumptech.glide.load.d<X>) r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <X> com.bumptech.glide.load.d<X> d(X x) throws i.e {
        com.bumptech.glide.load.d<X> dVar;
        com.bumptech.glide.provider.a aVar = this.c.a().b;
        Class<?> cls = x.getClass();
        synchronized (aVar) {
            Iterator it = aVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                a.C0065a c0065a = (a.C0065a) it.next();
                if (c0065a.a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new i.e(androidx.datastore.preferences.protobuf.b.a(x.getClass(), "Failed to find source encoder for data class: "));
    }

    public final <Z> com.bumptech.glide.load.m<Z> e(Class<Z> cls) {
        com.bumptech.glide.load.m<Z> mVar = (com.bumptech.glide.load.m) this.j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, com.bumptech.glide.load.m<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, com.bumptech.glide.load.m<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    mVar = (com.bumptech.glide.load.m) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return com.bumptech.glide.load.resource.c.b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
