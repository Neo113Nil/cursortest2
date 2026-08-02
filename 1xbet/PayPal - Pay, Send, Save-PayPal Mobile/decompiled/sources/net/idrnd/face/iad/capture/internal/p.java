package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final net.idrnd.face.iad.capture.ImageFormat f6994a;
    public final byte[] b;
    public final android.util.Size c;
    public final net.idrnd.face.iad.capture.internal.f d;
    public final long e;

    public final java.lang.String toString() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(net.idrnd.face.iad.capture.internal.p.class).getSimpleName();
        net.idrnd.face.iad.capture.ImageFormat imageFormat = this.f6994a;
        int length = this.b.length;
        android.util.Size size = this.c;
        net.idrnd.face.iad.capture.internal.f fVar = this.d;
        long j = this.e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(simpleName);
        sb.append("(format=");
        sb.append(imageFormat);
        sb.append(", content=ByteArray(size=");
        sb.append(length);
        sb.append("), size=");
        sb.append(size);
        sb.append(", imageInfo=");
        sb.append(fVar);
        sb.append(", compressionTimestamp=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public p(net.idrnd.face.iad.capture.ImageFormat imageFormat, byte[] bArr, android.util.Size size, net.idrnd.face.iad.capture.internal.f fVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "");
        this.f6994a = imageFormat;
        this.b = bArr;
        this.c = size;
        this.d = fVar;
        this.e = j;
    }

    public final net.idrnd.face.iad.capture.internal.f b() {
        return this.d;
    }

    public final void d() {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(this.b);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wrap, "");
        new net.idrnd.face.iad.capture.Image(kotlin.collections.CollectionsKt.listOf(new net.idrnd.face.iad.capture.Plane(0, 0, wrap)), this.f6994a, this.c.getHeight(), this.c.getWidth(), a(java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime()), this.d.f6964a.getImageInfoRotationDegrees());
    }

    public final byte[] a() {
        return this.b;
    }

    public final long a(long j) {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.d.f6964a.getImageInfoTimestamp()) + j;
    }

    public final android.util.Size c() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(net.idrnd.face.iad.capture.internal.p.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        net.idrnd.face.iad.capture.internal.p pVar = (net.idrnd.face.iad.capture.internal.p) obj;
        return this.e == pVar.e && this.f6994a == pVar.f6994a && java.util.Arrays.equals(this.b, pVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, pVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, pVar.d);
    }

    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.e);
        int hashCode2 = this.f6994a.hashCode();
        int hashCode3 = java.util.Arrays.hashCode(this.b);
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode3 + ((hashCode2 + (hashCode * 31)) * 31)) * 31)) * 31);
    }
}
