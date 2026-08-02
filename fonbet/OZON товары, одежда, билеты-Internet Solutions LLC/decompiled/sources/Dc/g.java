package Dc;

import io.reactivex.x;

/* loaded from: classes.dex */
public final class g extends x {

    /* renamed from: c, reason: collision with root package name */
    private static final i f6375c = new i("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* renamed from: b, reason: collision with root package name */
    final i f6376b = f6375c;

    @Override // io.reactivex.x
    public final x.c b() {
        return new h(this.f6376b);
    }
}
