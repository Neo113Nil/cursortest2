package I5;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final b f11974a;

    /* renamed from: b, reason: collision with root package name */
    private final b f11975b;

    public i(b bVar, b bVar2) {
        this.f11974a = bVar;
        this.f11975b = bVar2;
    }

    @Override // I5.m
    public final boolean g() {
        return this.f11974a.g() && this.f11975b.g();
    }

    @Override // I5.m
    public final E5.a<PointF, PointF> h() {
        return new E5.n((E5.d) this.f11974a.h(), (E5.d) this.f11975b.h());
    }

    @Override // I5.m
    public final List<P5.a<PointF>> i() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
