package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class c3 {
    public net.idrnd.face.iad.capture.internal.x2 c;
    public final java.util.TreeSet b = new java.util.TreeSet();

    /* renamed from: a, reason: collision with root package name */
    public final long f6959a = 1165;

    public final net.idrnd.face.iad.capture.internal.x3 b() {
        synchronized (this) {
            if (this.b.size() < 2) {
                return null;
            }
            long b = ((net.idrnd.face.iad.capture.internal.u2) ((net.idrnd.face.iad.capture.internal.x3) this.b.last())).b() - 1000;
            if (b < 0) {
                return null;
            }
            return a(new android.util.Range(0L, java.lang.Long.valueOf(b)));
        }
    }

    public final void a() {
        synchronized (this) {
            java.util.List list = kotlin.collections.CollectionsKt.toList(this.b);
            this.b.clear();
            net.idrnd.face.iad.capture.internal.x2 x2Var = this.c;
            if (x2Var != null) {
                x2Var.a(list);
            }
        }
    }

    public final net.idrnd.face.iad.capture.internal.x3 a(long j) {
        synchronized (this) {
            if (this.b.size() < 2) {
                return null;
            }
            long j2 = j - 1000;
            if (j2 < 0) {
                return null;
            }
            return a(new android.util.Range(0L, java.lang.Long.valueOf(j2)));
        }
    }

    public final int c() {
        int size;
        synchronized (this) {
            size = this.b.size();
        }
        return size;
    }

    public final java.util.List d() {
        java.util.List list;
        synchronized (this) {
            list = kotlin.collections.CollectionsKt.toList(this.b);
        }
        return list;
    }

    public final net.idrnd.face.iad.capture.internal.x3 a(android.util.Range range) {
        int i;
        if (this.b.size() < 2) {
            return null;
        }
        java.lang.Object lower = range.getLower();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lower, "");
        if (((java.lang.Number) lower).longValue() < 0) {
            return null;
        }
        synchronized (this.b) {
            java.util.Iterator it = this.b.iterator();
            i = -1;
            int i2 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                if (range.contains((android.util.Range) java.lang.Long.valueOf(((net.idrnd.face.iad.capture.internal.u2) ((net.idrnd.face.iad.capture.internal.x3) next)).b()))) {
                    i = i2;
                }
                i2++;
            }
        }
        if (i >= 0) {
            return (net.idrnd.face.iad.capture.internal.x3) kotlin.collections.CollectionsKt.elementAt(this.b, i);
        }
        return null;
    }

    public final void a(net.idrnd.face.iad.capture.internal.x3 x3Var) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x3Var, "");
            this.b.add(x3Var);
            java.util.TreeSet treeSet = this.b;
            if (treeSet.size() > 2 && ((net.idrnd.face.iad.capture.internal.u2) ((net.idrnd.face.iad.capture.internal.x3) kotlin.collections.CollectionsKt.last(treeSet))).b() - ((net.idrnd.face.iad.capture.internal.u2) ((net.idrnd.face.iad.capture.internal.x3) kotlin.collections.CollectionsKt.first(treeSet))).b() > this.f6959a) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (((net.idrnd.face.iad.capture.internal.u2) ((net.idrnd.face.iad.capture.internal.x3) kotlin.collections.CollectionsKt.last(treeSet))).b() - ((net.idrnd.face.iad.capture.internal.u2) ((net.idrnd.face.iad.capture.internal.x3) kotlin.collections.CollectionsKt.elementAt(treeSet, 1))).b() >= this.f6959a) {
                    net.idrnd.face.iad.capture.internal.x3 x3Var2 = (net.idrnd.face.iad.capture.internal.x3) kotlin.collections.CollectionsKt.first(treeSet);
                    treeSet.remove(x3Var2);
                    arrayList.add(x3Var2);
                }
                net.idrnd.face.iad.capture.internal.x2 x2Var = this.c;
                if (x2Var != null) {
                    x2Var.a(arrayList);
                }
            }
        }
    }
}
