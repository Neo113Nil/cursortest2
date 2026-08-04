package D1;

import J2.n;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1707a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1708b;

    public j(String str) {
        this.f1708b = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f1707a) {
            case 0:
                p068j2.e eVar = (p068j2.e) this.f1708b;
                eVar.getClass();
                do {
                    try {
                    } catch (InterruptedException e7) {
                        throw new IllegalStateException(e7);
                    }
                    break;
                } while (eVar.g());
                return;
            default:
                new n(null).zza((String) this.f1708b);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p068j2.e eVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f1708b = eVar;
    }
}
