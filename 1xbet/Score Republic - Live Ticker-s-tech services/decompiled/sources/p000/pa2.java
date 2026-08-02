package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pa2 extends hb2 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f6043d = 0;

    /* JADX INFO: renamed from: c */
    public final AtomicLong f6044c = new AtomicLong(-1);

    static {
        new ma2(1);
    }

    @Override // p000.hb2
    /* JADX INFO: renamed from: a */
    public final void mo1399a() {
        AtomicLong atomicLong = this.f6044c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
