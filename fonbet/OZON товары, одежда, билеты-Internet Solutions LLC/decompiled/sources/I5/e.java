package I5;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f11973a;

    public e(ArrayList arrayList) {
        this.f11973a = arrayList;
    }

    @Override // I5.m
    public final boolean g() {
        ArrayList arrayList = this.f11973a;
        return arrayList.size() == 1 && ((P5.a) arrayList.get(0)).h();
    }

    @Override // I5.m
    public final E5.a<PointF, PointF> h() {
        ArrayList arrayList = this.f11973a;
        return ((P5.a) arrayList.get(0)).h() ? new E5.k(arrayList) : new E5.j(arrayList);
    }

    @Override // I5.m
    public final List<P5.a<PointF>> i() {
        return this.f11973a;
    }
}
