package androidx.media3.exoplayer.drm;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.work.ListenableFutureKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) this.b).lambda$drmSessionManagerError$2((DrmSessionEventListener) this.c, (Exception) this.d);
                break;
            default:
                ListenableFutureKt.executeAsync$lambda$4$lambda$3((AtomicBoolean) this.b, (CallbackToFutureAdapter.Completer) this.c, (Function0) this.d);
                break;
        }
    }
}
