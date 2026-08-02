package K5;

import J5.q;
import M5.C3614j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: A, reason: collision with root package name */
    private final D5.d f15252A;

    /* renamed from: B, reason: collision with root package name */
    private final c f15253B;

    g(com.airbnb.lottie.g gVar, e eVar, c cVar, B5.g gVar2) {
        super(gVar, eVar);
        this.f15253B = cVar;
        D5.d dVar = new D5.d(gVar, this, new q("__container", eVar.o(), false), gVar2);
        this.f15252A = dVar;
        List<D5.c> list = Collections.EMPTY_LIST;
        dVar.g(list, list);
    }

    @Override // K5.b, D5.e
    public final void a(RectF rectF, Matrix matrix, boolean z11) {
        super.a(rectF, matrix, z11);
        this.f15252A.a(rectF, this.f15199n, z11);
    }

    @Override // K5.b
    final void l(@NonNull Canvas canvas, Matrix matrix, int i11) {
        this.f15252A.e(canvas, matrix, i11);
    }

    @Override // K5.b
    public final J5.a n() {
        J5.a b11 = this.f15201p.b();
        return b11 != null ? b11 : this.f15253B.f15201p.b();
    }

    @Override // K5.b
    public final C3614j p() {
        C3614j d11 = this.f15201p.d();
        return d11 != null ? d11 : this.f15253B.f15201p.d();
    }

    @Override // K5.b
    protected final void s(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        this.f15252A.h(eVar, i11, arrayList, eVar2);
    }
}
