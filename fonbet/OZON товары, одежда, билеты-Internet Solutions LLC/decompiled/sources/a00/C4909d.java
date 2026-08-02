package a00;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a00.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4909d implements G {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4908c f36127a;

    C4909d(C4908c c4908c) {
        this.f36127a = c4908c;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J source, AbstractC5434v.a event) {
        L l11;
        L l12;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
        boolean c11 = H00.b.c();
        C4908c c4908c = this.f36127a;
        if (c11) {
            H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", V.e.a("onLifecycleStateChanged: [page=", C4908c.d(c4908c), ", lifecycleEvent=", event.name(), "]")), "ComposerViewOwner", null, Boolean.TRUE);
        }
        if (event == AbstractC5434v.a.ON_DESTROY) {
            l12 = c4908c.f36121b;
            l12.e(this);
        }
        l11 = c4908c.f36121b;
        l11.h(event);
    }
}
