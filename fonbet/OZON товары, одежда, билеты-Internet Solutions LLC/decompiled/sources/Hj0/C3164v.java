package Hj0;

import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;

/* renamed from: Hj0.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3164v implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11198a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f11199b;

    public /* synthetic */ C3164v(Object obj, Pc.a aVar, int i11) {
        this.f11198a = i11;
        this.f11199b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11198a) {
            case 0:
                Mj0.i trackerLogger = (Mj0.i) this.f11199b.get();
                Intrinsics.checkNotNullParameter(trackerLogger, "trackerLogger");
                return new Nj0.a(trackerLogger);
            default:
                QZ.a composer = (QZ.a) this.f11199b.get();
                Intrinsics.checkNotNullParameter(composer, "composer");
                InterfaceC7851b o11 = composer.o();
                Jb.j.d(o11);
                return o11;
        }
    }
}
