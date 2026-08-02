package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: ef */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0172ef extends C0657rj {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2084c = AtomicIntegerFieldUpdater.newUpdater(C0172ef.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0172ef(C0136df c0136df, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0136df + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
