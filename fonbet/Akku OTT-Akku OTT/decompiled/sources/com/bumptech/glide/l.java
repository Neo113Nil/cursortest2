package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.manager.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class l<TranscodeType> extends com.bumptech.glide.request.a<l<TranscodeType>> {

    @Nullable
    public l<TranscodeType> A;
    public boolean C;
    public boolean D;
    public final Context s;
    public final m t;
    public final f v;

    @NonNull
    public n<?, ? super TranscodeType> w;

    @Nullable
    public Object x;

    @Nullable
    public ArrayList y;

    @Nullable
    public l<TranscodeType> z;
    public final boolean B = true;
    public final Class<TranscodeType> u = Bitmap.class;

    static {
    }

    @SuppressLint({"CheckResult"})
    public l(@NonNull b bVar, m mVar, Context context) {
        com.bumptech.glide.request.i iVar;
        this.t = mVar;
        this.s = context;
        Map<Class<?>, n<?, ?>> map = mVar.a.c.e;
        n nVar = map.get(Bitmap.class);
        if (nVar == null) {
            for (Map.Entry<Class<?>, n<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(Bitmap.class)) {
                    nVar = entry.getValue();
                }
            }
        }
        this.w = nVar == null ? f.j : nVar;
        this.v = bVar.c;
        Iterator<com.bumptech.glide.request.h<Object>> it = mVar.k.iterator();
        while (it.hasNext()) {
            q((com.bumptech.glide.request.h) it.next());
        }
        synchronized (mVar) {
            iVar = mVar.l;
        }
        a(iVar);
    }

    @Override // com.bumptech.glide.request.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return super.equals(lVar) && Objects.equals(this.u, lVar.u) && this.w.equals(lVar.w) && Objects.equals(this.x, lVar.x) && Objects.equals(this.y, lVar.y) && Objects.equals(this.z, lVar.z) && Objects.equals(this.A, lVar.A) && this.B == lVar.B && this.C == lVar.C;
    }

    @Override // com.bumptech.glide.request.a
    public final int hashCode() {
        return com.bumptech.glide.util.m.g(this.C ? 1 : 0, com.bumptech.glide.util.m.g(this.B ? 1 : 0, com.bumptech.glide.util.m.h(com.bumptech.glide.util.m.h(com.bumptech.glide.util.m.h(com.bumptech.glide.util.m.h(com.bumptech.glide.util.m.h(com.bumptech.glide.util.m.h(com.bumptech.glide.util.m.h(super.hashCode(), this.u), this.w), this.x), this.y), this.z), this.A), null)));
    }

    @NonNull
    @CheckResult
    public final l<TranscodeType> q(@Nullable com.bumptech.glide.request.h<TranscodeType> hVar) {
        if (this.p) {
            return clone().q(hVar);
        }
        if (hVar != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(hVar);
        }
        i();
        return this;
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final l<TranscodeType> a(@NonNull com.bumptech.glide.request.a<?> aVar) {
        com.bumptech.glide.util.l.b(aVar);
        return (l) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.bumptech.glide.request.d s(Object obj, com.bumptech.glide.request.target.b<TranscodeType> bVar, @Nullable com.bumptech.glide.request.h<TranscodeType> hVar, @Nullable com.bumptech.glide.request.f fVar, n<?, ? super TranscodeType> nVar, h hVar2, int i, int i2, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        com.bumptech.glide.request.f fVar2;
        com.bumptech.glide.request.f fVar3;
        com.bumptech.glide.request.a<?> aVar2;
        com.bumptech.glide.request.j jVar;
        h hVar3;
        if (this.A != null) {
            fVar3 = new com.bumptech.glide.request.b(obj, fVar);
            fVar2 = fVar3;
        } else {
            fVar2 = null;
            fVar3 = fVar;
        }
        l<TranscodeType> lVar = this.z;
        if (lVar == null) {
            Context context = this.s;
            f fVar4 = this.v;
            Object obj2 = this.x;
            Class<TranscodeType> cls = this.u;
            ArrayList arrayList = this.y;
            com.bumptech.glide.load.engine.m mVar = fVar4.f;
            nVar.getClass();
            aVar2 = aVar;
            jVar = new com.bumptech.glide.request.j(context, fVar4, obj, obj2, cls, aVar2, i, i2, hVar2, bVar, hVar, arrayList, fVar3, mVar, executor);
        } else {
            if (this.D) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            n<?, ? super TranscodeType> nVar2 = lVar.B ? nVar : lVar.w;
            if (com.bumptech.glide.request.a.f(lVar.a, 8)) {
                hVar3 = this.z.c;
            } else {
                int ordinal = hVar2.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    hVar3 = h.a;
                } else if (ordinal == 2) {
                    hVar3 = h.b;
                } else {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.c);
                    }
                    hVar3 = h.c;
                }
            }
            h hVar4 = hVar3;
            l<TranscodeType> lVar2 = this.z;
            int i3 = lVar2.f;
            int i4 = lVar2.e;
            if (com.bumptech.glide.util.m.i(i, i2)) {
                l<TranscodeType> lVar3 = this.z;
                if (!com.bumptech.glide.util.m.i(lVar3.f, lVar3.e)) {
                    i3 = aVar.f;
                    i4 = aVar.e;
                }
            }
            int i5 = i4;
            com.bumptech.glide.request.k kVar = new com.bumptech.glide.request.k(obj, fVar3);
            Context context2 = this.s;
            f fVar5 = this.v;
            com.bumptech.glide.request.k kVar2 = kVar;
            Object obj3 = this.x;
            Class<TranscodeType> cls2 = this.u;
            ArrayList arrayList2 = this.y;
            com.bumptech.glide.load.engine.m mVar2 = fVar5.f;
            nVar.getClass();
            com.bumptech.glide.request.j jVar2 = new com.bumptech.glide.request.j(context2, fVar5, obj, obj3, cls2, aVar, i, i2, hVar2, bVar, hVar, arrayList2, kVar2, mVar2, executor);
            this.D = true;
            l lVar4 = (l<TranscodeType>) this.z;
            com.bumptech.glide.request.d s = lVar4.s(obj, bVar, hVar, kVar2, nVar2, hVar4, i3, i5, lVar4, executor);
            this.D = false;
            kVar2.c = jVar2;
            kVar2.d = s;
            aVar2 = aVar;
            jVar = kVar2;
        }
        if (fVar2 == null) {
            return jVar;
        }
        l<TranscodeType> lVar5 = this.A;
        int i6 = lVar5.f;
        int i7 = lVar5.e;
        if (com.bumptech.glide.util.m.i(i, i2)) {
            l<TranscodeType> lVar6 = this.A;
            if (!com.bumptech.glide.util.m.i(lVar6.f, lVar6.e)) {
                i6 = aVar2.f;
                i7 = aVar2.e;
            }
        }
        int i8 = i7;
        l lVar7 = (l<TranscodeType>) this.A;
        com.bumptech.glide.request.b bVar2 = fVar2;
        com.bumptech.glide.request.d s2 = lVar7.s(obj, bVar, hVar, bVar2, lVar7.w, lVar7.c, i6, i8, lVar7, executor);
        bVar2.c = jVar;
        bVar2.d = s2;
        return bVar2;
    }

    @Override // com.bumptech.glide.request.a
    @CheckResult
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final l<TranscodeType> clone() {
        l<TranscodeType> lVar = (l) super.clone();
        lVar.w = (n<?, ? super TranscodeType>) lVar.w.clone();
        if (lVar.y != null) {
            lVar.y = new ArrayList(lVar.y);
        }
        l<TranscodeType> lVar2 = lVar.z;
        if (lVar2 != null) {
            lVar.z = lVar2.clone();
        }
        l<TranscodeType> lVar3 = lVar.A;
        if (lVar3 != null) {
            lVar.A = lVar3.clone();
        }
        return lVar;
    }

    @NonNull
    public final void u(@NonNull com.bumptech.glide.request.target.b bVar, @Nullable com.bumptech.glide.request.g gVar, Executor executor) {
        com.bumptech.glide.util.l.b(bVar);
        if (!this.C) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        com.bumptech.glide.request.d s = s(new Object(), bVar, gVar, null, this.w, this.c, this.f, this.e, this, executor);
        com.bumptech.glide.request.d d = bVar.d();
        if (s.f(d) && (this.d || !d.isComplete())) {
            com.bumptech.glide.util.l.c(d, "Argument must not be null");
            if (d.isRunning()) {
                return;
            }
            d.g();
            return;
        }
        this.t.e(bVar);
        bVar.g(s);
        m mVar = this.t;
        synchronized (mVar) {
            mVar.f.a.add(bVar);
            r rVar = mVar.d;
            rVar.a.add(s);
            if (rVar.c) {
                s.clear();
                Log.isLoggable("RequestTracker", 2);
                rVar.b.add(s);
            } else {
                s.g();
            }
        }
    }

    @NonNull
    public final l<TranscodeType> v(@Nullable Object obj) {
        if (this.p) {
            return clone().v(obj);
        }
        this.x = obj;
        this.C = true;
        i();
        return this;
    }
}
