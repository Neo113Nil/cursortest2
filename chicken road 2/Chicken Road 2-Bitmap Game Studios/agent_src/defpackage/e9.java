package defpackage;

import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class e9 implements ThreadFactory {
    public final /* synthetic */ boolean hRNgd2zGCE5kj;
    public final /* synthetic */ String yzPsTade5rL7D3;

    public /* synthetic */ e9(String str, boolean z) {
        this.yzPsTade5rL7D3 = str;
        this.hRNgd2zGCE5kj = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        TimeZone timeZone = _UtilJvmKt.yzPsTade5rL7D3;
        Thread thread = new Thread(runnable, this.yzPsTade5rL7D3);
        thread.setDaemon(this.hRNgd2zGCE5kj);
        return thread;
    }
}
