package G9;

/* loaded from: classes9.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9774a;

    /* renamed from: b, reason: collision with root package name */
    private int f9775b = 0;

    b(int i11) {
        this.f9774a = new byte[i11];
    }

    final void a(int i11, boolean z11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f9775b;
            this.f9775b = i13 + 1;
            this.f9774a[i13] = z11 ? (byte) 1 : (byte) 0;
        }
    }

    final byte[] b(int i11) {
        byte[] bArr = this.f9774a;
        int length = bArr.length * i11;
        byte[] bArr2 = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            bArr2[i12] = bArr[i12 / i11];
        }
        return bArr2;
    }
}
