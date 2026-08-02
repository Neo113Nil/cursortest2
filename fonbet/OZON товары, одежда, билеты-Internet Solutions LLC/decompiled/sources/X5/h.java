package X5;

import V5.l;
import V5.v;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class h extends p6.h<T5.f, v<?>> {

    /* renamed from: e, reason: collision with root package name */
    private l f34095e;

    @Override // p6.h
    protected final int d(v<?> vVar) {
        v<?> vVar2 = vVar;
        if (vVar2 == null) {
            return 1;
        }
        return vVar2.getSize();
    }

    @Override // p6.h
    protected final void e(@NonNull T5.f fVar, v<?> vVar) {
        v<?> vVar2 = vVar;
        l lVar = this.f34095e;
        if (lVar == null || vVar2 == null) {
            return;
        }
        lVar.g(vVar2);
    }

    public final void j(@NonNull l lVar) {
        this.f34095e = lVar;
    }

    @SuppressLint({"InlinedApi"})
    public final void k(int i11) {
        if (i11 >= 40) {
            a();
        } else if (i11 >= 20 || i11 == 15) {
            i(c() / 2);
        }
    }
}
