package GZ;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J f9863a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f9864b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MZ.c f9865c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ LZ.c f9866d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f9867e;

    public i(J j11, h hVar, MZ.c cVar, LZ.c cVar2, int i11) {
        this.f9863a = j11;
        this.f9864b = hVar;
        this.f9865c = cVar;
        this.f9866d = cVar2;
        this.f9867e = i11;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f9863a.getLifecycle().e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(J owner) {
        EZ.h hVar;
        EZ.h hVar2;
        Intrinsics.checkNotNullParameter(owner, "owner");
        h hVar3 = this.f9864b;
        hVar = hVar3.f9855b;
        EZ.e<?> b11 = this.f9865c.b(hVar.e().getActivity(), this.f9866d);
        if (b11 != null) {
            hVar2 = hVar3.f9855b;
            hVar2.f(b11, this.f9867e);
        }
        this.f9863a.getLifecycle().e(this);
    }
}
