package c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class o implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2.l f2521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2.l f2522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o2.a f2523c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o2.a f2524d;

    public o(o2.l lVar, o2.l lVar2, o2.a aVar, o2.a aVar2) {
        this.f2521a = lVar;
        this.f2522b = lVar2;
        this.f2523c = aVar;
        this.f2524d = aVar2;
    }

    public final void onBackCancelled() {
        this.f2524d.invoke();
    }

    public final void onBackInvoked() {
        this.f2523c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        this.f2522b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        this.f2521a.invoke(new b(backEvent));
    }
}
