package androidx.media3.exoplayer.drm;

import com.google.android.exoplayer2.util.Util;
import com.google.common.util.concurrent.x;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t(x xVar, Runnable runnable, Object obj) {
        this.a = 1;
        this.b = xVar;
        this.c = runnable;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((OfflineLicenseHelper) this.c).lambda$acquireFirstSessionOnHandlerThread$3((DrmSession) this.d, (x) this.b);
                break;
            case 1:
                Util.lambda$postOrRunWithCompletion$0((x) this.b, (Runnable) this.c, this.d);
                break;
            default:
                ((CrashlyticsCore) this.c).lambda$setInternalKey$7((String) this.d, (String) this.b);
                break;
        }
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
