package C;

import android.media.metrics.PlaybackStateEvent;

/* loaded from: classes8.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4095c;

    public /* synthetic */ E(int i11, Object obj, Object obj2) {
        this.f4093a = i11;
        this.f4094b = obj;
        this.f4095c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4093a) {
            case 0:
                ((androidx.camera.core.u) this.f4094b).j();
                androidx.camera.core.u uVar = (androidx.camera.core.u) this.f4095c;
                if (uVar != null) {
                    uVar.j();
                    break;
                }
                break;
            default:
                ((u3.N) this.f4094b).f99771d.reportPlaybackStateEvent((PlaybackStateEvent) this.f4095c);
                break;
        }
    }
}
