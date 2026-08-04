package A1;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements p151v2.e, D3.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f72b;

    public /* synthetic */ B(int i7, int i8) {
        this.f71a = i8;
        this.f72b = i7;
    }

    @Override // D3.q
    public Object get() {
        switch (this.f71a) {
            case 2:
                return new HandlerThread(R1.b.b(this.f72b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(R1.b.b(this.f72b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }

    @Override // p151v2.e
    public void invoke(Object obj) {
        switch (this.f71a) {
            case 0:
                ((z0) obj).b(this.f72b);
                break;
            default:
                B1.b bVar = (B1.b) obj;
                bVar.getClass();
                B1.n nVar = (B1.n) bVar;
                int i7 = this.f72b;
                if (i7 == 1) {
                    nVar.f1037u = true;
                }
                nVar.f1027k = i7;
                break;
        }
    }

    public /* synthetic */ B(B1.a aVar, int i7, A0 a2, A0 a4) {
        this.f71a = 1;
        this.f72b = i7;
    }
}
