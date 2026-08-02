package androidx.media3.exoplayer.drm;

import com.google.android.exoplayer2.util.Util;
import com.google.common.util.concurrent.x;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(Object obj, x xVar, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = xVar;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((OfflineLicenseHelper) this.c).lambda$getLicenseDurationRemainingSec$0(this.b, (DrmSession) this.d);
                break;
            default:
                Util.lambda$transformFutureAsync$2((com.google.common.util.concurrent.u) this.c, this.b, (com.google.common.util.concurrent.h) this.d);
                break;
        }
    }
}
