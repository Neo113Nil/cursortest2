package E5;

import java.util.List;

/* loaded from: classes8.dex */
public final class e extends g<J5.d> {

    /* renamed from: i, reason: collision with root package name */
    private final J5.d f7497i;

    public e(List<P5.a<J5.d>> list) {
        super(list);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            J5.d dVar = list.get(i12).f21849b;
            if (dVar != null) {
                i11 = Math.max(i11, dVar.d());
            }
        }
        this.f7497i = new J5.d(new float[i11], new int[i11]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E5.a
    final Object h(P5.a aVar, float f7) {
        J5.d dVar = (J5.d) aVar.f21849b;
        J5.d dVar2 = (J5.d) aVar.f21850c;
        J5.d dVar3 = this.f7497i;
        dVar3.e(dVar, dVar2, f7);
        return dVar3;
    }
}
