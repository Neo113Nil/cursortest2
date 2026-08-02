package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class u2 implements java.lang.AutoCloseable, net.idrnd.face.iad.capture.internal.x3, java.lang.Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final net.idrnd.face.iad.capture.internal.s2 f7009a;
    public final int b;
    public final int c;
    public final net.idrnd.face.iad.capture.internal.f d;
    public final java.lang.Object e;
    public boolean f;
    public final kotlin.Lazy g;

    public u2(net.idrnd.face.iad.capture.internal.s2 s2Var, int i, int i2, net.idrnd.face.iad.capture.internal.f fVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s2Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "");
        this.f7009a = s2Var;
        this.b = i;
        this.c = i2;
        this.d = fVar;
        this.e = new java.lang.Object();
        this.g = kotlin.LazyKt.lazy(new net.idrnd.face.iad.capture.internal.t2(this));
    }

    public final long b() {
        return ((java.lang.Number) this.g.getValue()).longValue();
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        net.idrnd.face.iad.capture.internal.x3 x3Var = (net.idrnd.face.iad.capture.internal.x3) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x3Var, "");
        long imageInfoTimestamp = this.d.f6964a.getImageInfoTimestamp() - ((net.idrnd.face.iad.capture.internal.u2) x3Var).d.f6964a.getImageInfoTimestamp();
        if (imageInfoTimestamp > 0) {
            return 1;
        }
        return imageInfoTimestamp < 0 ? -1 : 0;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.e) {
            z = this.f;
        }
        return z;
    }

    public final net.idrnd.face.iad.capture.internal.u2 a() {
        synchronized (this.e) {
            if (c()) {
                return null;
            }
            net.idrnd.face.iad.capture.internal.s2 a2 = this.f7009a.a();
            kotlin.jvm.internal.Intrinsics.checkNotNull(a2);
            return new net.idrnd.face.iad.capture.internal.u2(a2, this.b, this.c, this.d);
        }
    }

    public final android.graphics.YuvImage d() {
        synchronized (this.e) {
            if (c()) {
                return null;
            }
            return new android.graphics.YuvImage(this.f7009a.c(), 17, this.b, this.c, null);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            if (c()) {
                return;
            }
            this.f7009a.close();
            this.f = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(net.idrnd.face.iad.capture.internal.u2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        net.idrnd.face.iad.capture.internal.u2 u2Var = (net.idrnd.face.iad.capture.internal.u2) obj;
        return this.b == u2Var.b && this.c == u2Var.c && kotlin.jvm.internal.Intrinsics.areEqual(this.f7009a, u2Var.f7009a) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, u2Var.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, u2Var.e) && ((java.lang.Number) this.g.getValue()).longValue() == ((java.lang.Number) u2Var.g.getValue()).longValue();
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int hashCode = this.f7009a.hashCode();
        int hashCode2 = this.d.hashCode();
        return java.lang.Long.hashCode(((java.lang.Number) this.g.getValue()).longValue()) + ((this.e.hashCode() + ((hashCode2 + ((hashCode + (((i * 31) + i2) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        int b = this.f7009a.b();
        int i = this.b;
        int i2 = this.c;
        net.idrnd.face.iad.capture.internal.f fVar = this.d;
        boolean c = c();
        long imageInfoTimestamp = this.d.f6964a.getImageInfoTimestamp();
        long b2 = b();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NativeYuvImage(yuvBytes.size=");
        sb.append(b);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", imageInfo=");
        sb.append(fVar);
        sb.append(", isClosed=");
        sb.append(c);
        sb.append(", timestampNs=");
        sb.append(imageInfoTimestamp);
        sb.append(", timestampMs=");
        sb.append(b2);
        sb.append(")");
        return sb.toString();
    }
}
