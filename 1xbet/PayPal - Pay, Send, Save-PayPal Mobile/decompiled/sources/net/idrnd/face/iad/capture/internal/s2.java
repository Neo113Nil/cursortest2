package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class s2 implements java.lang.AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final long f7004a;
    public final int b;
    public boolean c;
    public final java.lang.Object d = new java.lang.Object();

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof net.idrnd.face.iad.capture.internal.s2)) {
            return false;
        }
        net.idrnd.face.iad.capture.internal.s2 s2Var = (net.idrnd.face.iad.capture.internal.s2) obj;
        return this.f7004a == s2Var.f7004a && this.b == s2Var.b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.b) + (java.lang.Long.hashCode(this.f7004a) * 31);
    }

    public final java.lang.String toString() {
        long j = this.f7004a;
        int i = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NativeByteArray(pointer=");
        sb.append(j);
        sb.append(", size=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public s2(long j, int i) {
        this.f7004a = j;
        this.b = i;
    }

    public final int b() {
        return this.b;
    }

    public final net.idrnd.face.iad.capture.internal.s2 a() {
        synchronized (this.d) {
            if (this.c) {
                return null;
            }
            return new net.idrnd.face.iad.capture.internal.s2(net.idrnd.face.iad.capture.NativeImageProcessor.f6950a.copyNativeByteArray(this.f7004a, this.b), this.b);
        }
    }

    public final byte[] c() {
        synchronized (this.d) {
            if (this.c) {
                return null;
            }
            return net.idrnd.face.iad.capture.NativeImageProcessor.f6950a.copyToJavaByteArray(this.f7004a, this.b);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.c) {
                return;
            }
            net.idrnd.face.iad.capture.NativeImageProcessor.f6950a.freeNativeByteArray(this.f7004a);
            this.c = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
