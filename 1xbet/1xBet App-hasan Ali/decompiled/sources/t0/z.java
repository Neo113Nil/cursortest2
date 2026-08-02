package t0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements PointerInputEventHandler, kotlin.jvm.internal.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i4.e f19534k;

    public z(i4.e eVar) {
        this.f19534k = eVar;
    }

    @Override // kotlin.jvm.internal.g
    public final W3.c b() {
        return this.f19534k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f19534k, ((kotlin.jvm.internal.g) obj).b());
    }

    public final int hashCode() {
        return this.f19534k.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(v vVar, a4.c cVar) {
        return this.f19534k.invoke(vVar, cVar);
    }
}
