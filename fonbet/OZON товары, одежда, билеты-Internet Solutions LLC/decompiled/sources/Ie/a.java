package Ie;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f12279a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f12280b;

    public a(c cVar, j jVar) {
        this.f12279a = jVar;
        this.f12280b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12279a.d(this.f12280b, Unit.f71690a);
    }
}
