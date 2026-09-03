package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements ThreadFactory {
    public final /* synthetic */ String yzPsTade5rL7D3;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.yzPsTade5rL7D3);
        thread.setPriority(10);
        return thread;
    }
}
