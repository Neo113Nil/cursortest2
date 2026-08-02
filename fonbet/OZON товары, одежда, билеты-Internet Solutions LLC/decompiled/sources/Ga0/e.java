package Ga0;

import Jb.f;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import lj0.C7967a;

/* loaded from: classes7.dex */
public final class e implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9898a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f9899b;

    public /* synthetic */ e(Pc.a aVar, int i11) {
        this.f9898a = i11;
        this.f9899b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f9898a) {
            case 0:
                return new b((Context) ((f) this.f9899b).get());
            default:
                C7967a serviceLocator = (C7967a) this.f9899b.get();
                Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
                return serviceLocator.d();
        }
    }
}
