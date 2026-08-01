package sg.bigo.ads.U0;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class p extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12579a;

    public p(int i) {
        this.f12579a = i;
    }

    @Override // sg.bigo.ads.U0.q
    public final int a() {
        return 4;
    }

    @Override // sg.bigo.ads.U0.q
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f12579a);
    }
}
