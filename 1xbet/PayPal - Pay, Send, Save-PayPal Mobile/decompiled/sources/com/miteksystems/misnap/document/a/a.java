package com.miteksystems.misnap.document.a;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/miteksystems/misnap/document/a/a;", "", "", "alignedWithDevice", "Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(ZLandroid/util/Size;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", util.h.xy.cb.b.f1091, "Landroid/util/Size;", "()Landroid/util/Size;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean alignedWithDevice;

    /* renamed from: b, reason: from kotlin metadata */
    private final android.util.Size size;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameMetadata(alignedWithDevice=");
        sb.append(this.alignedWithDevice);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.alignedWithDevice;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.size.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.miteksystems.misnap.document.a.a)) {
            return false;
        }
        com.miteksystems.misnap.document.a.a aVar = (com.miteksystems.misnap.document.a.a) other;
        return this.alignedWithDevice == aVar.alignedWithDevice && kotlin.jvm.internal.Intrinsics.areEqual(this.size, aVar.size);
    }

    /* renamed from: b, reason: from getter */
    public final android.util.Size getSize() {
        return this.size;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAlignedWithDevice() {
        return this.alignedWithDevice;
    }

    public a(boolean z, android.util.Size size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        this.alignedWithDevice = z;
        this.size = size;
    }
}
