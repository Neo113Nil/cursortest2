package D1;

import J2.n;
import j2.AbstractC1308e;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1707a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1708b;

    public j(String str) {
        this.f1708b = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f1707a) {
            case 0:
                AbstractC1308e abstractC1308e = (AbstractC1308e) this.f1708b;
                abstractC1308e.getClass();
                do {
                    try {
                    } catch (InterruptedException e7) {
                        throw new IllegalStateException(e7);
                    }
                } while (abstractC1308e.g());
                return;
            default:
                new n(null).zza((String) this.f1708b);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AbstractC1308e abstractC1308e) {
        super("ExoPlayer:SimpleDecoder");
        this.f1708b = abstractC1308e;
    }
}
