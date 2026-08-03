package N;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1132a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1133b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1134c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1135d;

    public k(int i2, int i3, long j2, long j3) {
        this.f1132a = i2;
        this.f1133b = i3;
        this.f1134c = j2;
        this.f1135d = j3;
    }

    public static N.k a(java.io.File file) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
        try {
            N.k kVar = new N.k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } catch (java.lang.Throwable th) {
            try {
                dataInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(java.io.File file) {
        file.delete();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1132a);
            dataOutputStream.writeInt(this.f1133b);
            dataOutputStream.writeLong(this.f1134c);
            dataOutputStream.writeLong(this.f1135d);
            dataOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                dataOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof N.k)) {
            return false;
        }
        N.k kVar = (N.k) obj;
        return this.f1133b == kVar.f1133b && this.f1134c == kVar.f1134c && this.f1132a == kVar.f1132a && this.f1135d == kVar.f1135d;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f1133b), java.lang.Long.valueOf(this.f1134c), java.lang.Integer.valueOf(this.f1132a), java.lang.Long.valueOf(this.f1135d));
    }
}
