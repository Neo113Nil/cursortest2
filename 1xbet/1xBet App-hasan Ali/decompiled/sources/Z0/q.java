package Z0;

import A0.AbstractC0012b;
import P.C0310p;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import s0.C2355d;
import z0.n0;

/* loaded from: classes.dex */
public final class q extends j {
    public final View J;
    public final C2355d K;

    /* renamed from: L, reason: collision with root package name */
    public Y.e f6331L;

    /* renamed from: M, reason: collision with root package name */
    public i4.c f6332M;

    /* renamed from: N, reason: collision with root package name */
    public i4.c f6333N;

    /* renamed from: O, reason: collision with root package name */
    public i4.c f6334O;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(Context context, i4.c cVar, C0310p c0310p, Y.f fVar, int i, n0 n0Var) {
        super(context, c0310p, i, r4, r5, n0Var);
        View view = (View) cVar.c(context);
        C2355d c2355d = new C2355d();
        this.J = view;
        this.K = c2355d;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        Object f = fVar != null ? fVar.f(valueOf) : null;
        SparseArray<Parcelable> sparseArray = f instanceof SparseArray ? (SparseArray) f : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (fVar != null) {
            setSavableRegistryEntry(fVar.e(valueOf, new i(this, 2)));
        }
        b bVar = b.f6262p;
        this.f6332M = bVar;
        this.f6333N = bVar;
        this.f6334O = bVar;
    }

    public static final void n(q qVar) {
        qVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(Y.e eVar) {
        Y.e eVar2 = this.f6331L;
        if (eVar2 != null) {
            ((v3.e) eVar2).Q();
        }
        this.f6331L = eVar;
    }

    public final C2355d getDispatcher() {
        return this.K;
    }

    public final i4.c getReleaseBlock() {
        return this.f6334O;
    }

    public final i4.c getResetBlock() {
        return this.f6333N;
    }

    public /* bridge */ /* synthetic */ AbstractC0012b getSubCompositionView() {
        return null;
    }

    public final i4.c getUpdateBlock() {
        return this.f6332M;
    }

    public final void setReleaseBlock(i4.c cVar) {
        this.f6334O = cVar;
        setRelease(new i(this, 3));
    }

    public final void setResetBlock(i4.c cVar) {
        this.f6333N = cVar;
        setReset(new i(this, 4));
    }

    public final void setUpdateBlock(i4.c cVar) {
        this.f6332M = cVar;
        setUpdate(new i(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
