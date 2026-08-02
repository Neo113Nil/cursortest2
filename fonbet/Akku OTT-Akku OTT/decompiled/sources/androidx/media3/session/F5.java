package androidx.media3.session;

import android.os.HandlerThread;

/* loaded from: classes3.dex */
public final /* synthetic */ class F5 implements Runnable {
    public final /* synthetic */ HandlerThread a;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.quit();
    }
}
