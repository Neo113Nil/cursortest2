package z6;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f18555d = new i(1, 0);

    public i(long j, long j3) {
        super(j, j3, 1L);
    }

    @Override // z6.g
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (this.f18548a == iVar.f18548a) {
                    if (this.f18549b == iVar.f18549b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // z6.g
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f18548a;
        long j3 = ((long) 31) * (j ^ (j >>> 32));
        long j7 = this.f18549b;
        return (int) (j3 + (j7 ^ (j7 >>> 32)));
    }

    @Override // z6.g
    public final boolean isEmpty() {
        return this.f18548a > this.f18549b;
    }

    @Override // z6.g
    public final String toString() {
        return this.f18548a + ".." + this.f18549b;
    }
}
