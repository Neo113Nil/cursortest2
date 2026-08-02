package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class v implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f8130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f8131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s6.a f8132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s6.a f8133d;

    public v(Function1 function1, Function1 function12, s6.a aVar, s6.a aVar2) {
        this.f8130a = function1;
        this.f8131b = function12;
        this.f8132c = aVar;
        this.f8133d = aVar2;
    }

    public final void onBackCancelled() {
        this.f8133d.invoke();
    }

    public final void onBackInvoked() {
        this.f8132c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        t6.h.e(backEvent, "backEvent");
        this.f8131b.invoke(new C0625b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        t6.h.e(backEvent, "backEvent");
        this.f8130a.invoke(new C0625b(backEvent));
    }
}
