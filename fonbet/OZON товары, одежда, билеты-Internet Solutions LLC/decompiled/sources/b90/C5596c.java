package b90;

import Sc.InterfaceC4008j;
import Sc.k;
import We.B;
import We.E;
import We.InterfaceC4875q;
import a90.C4970h;
import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: b90.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5596c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f55745a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<B> f55746b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5594a f55747c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4970h f55748d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f55749e;

    public C5596c(@NotNull Context app, @NotNull Set interceptorsSet, @NotNull C5594a externalOkHttpSettings, @NotNull C4970h okHttpClientSetup) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(interceptorsSet, "interceptorsSet");
        Intrinsics.checkNotNullParameter(externalOkHttpSettings, "externalOkHttpSettings");
        Intrinsics.checkNotNullParameter(okHttpClientSetup, "okHttpClientSetup");
        this.f55745a = app;
        this.f55746b = interceptorsSet;
        this.f55747c = externalOkHttpSettings;
        this.f55748d = okHttpClientSetup;
        this.f55749e = k.b(new C5595b(this, 0));
    }

    public static E a(C5596c c5596c) {
        c5596c.getClass();
        E.a aVar = new E.a(new E());
        Iterator<T> it = c5596c.f55746b.iterator();
        while (it.hasNext()) {
            aVar.a((B) it.next());
        }
        InterfaceC4875q b11 = c5596c.f55747c.b();
        if (b11 != null) {
            aVar.h(b11);
        }
        return new E((E.a) c5596c.f55748d.invoke(aVar, c5596c.f55745a));
    }

    @NotNull
    public final E b() {
        return (E) this.f55749e.getValue();
    }
}
