package H6;

import java.io.IOException;

/* loaded from: classes8.dex */
final class j extends e {

    /* renamed from: f, reason: collision with root package name */
    static final int f10684f = e.a("IHDR");

    /* renamed from: c, reason: collision with root package name */
    int f10685c;

    /* renamed from: d, reason: collision with root package name */
    int f10686d;

    /* renamed from: e, reason: collision with root package name */
    byte[] f10687e = new byte[5];

    j() {
    }

    @Override // H6.e
    final void b(I6.a aVar) throws IOException {
        this.f10685c = aVar.d();
        this.f10686d = aVar.d();
        byte[] bArr = this.f10687e;
        aVar.read(bArr, 0, bArr.length);
    }
}
