package F4;

import F4.F;
import androidx.recyclerview.widget.C5468b;

/* renamed from: F4.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3024d extends F.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3021a<Object> f8868a;

    C3024d(C3021a<Object> c3021a) {
        this.f8868a = c3021a;
    }

    @Override // F4.F.b
    public final void a(int i11, int i12) {
        ((C5468b) this.f8868a.h()).onChanged(i11, i12, null);
    }

    @Override // F4.F.b
    public final void b(int i11, int i12) {
        ((C5468b) this.f8868a.h()).onInserted(i11, i12);
    }

    @Override // F4.F.b
    public final void c(int i11, int i12) {
        ((C5468b) this.f8868a.h()).onRemoved(i11, i12);
    }
}
