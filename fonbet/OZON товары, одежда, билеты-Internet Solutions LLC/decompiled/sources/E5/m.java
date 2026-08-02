package E5;

import D5.s;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends a<J5.o, Path> {

    /* renamed from: i, reason: collision with root package name */
    private final J5.o f7509i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f7510j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f7511k;

    public m(List<P5.a<J5.o>> list) {
        super(list);
        this.f7509i = new J5.o();
        this.f7510j = new Path();
    }

    @Override // E5.a
    public final Path h(P5.a<J5.o> aVar, float f7) {
        J5.o oVar = aVar.f21849b;
        J5.o oVar2 = aVar.f21850c;
        J5.o oVar3 = this.f7509i;
        oVar3.c(oVar, oVar2, f7);
        ArrayList arrayList = this.f7511k;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                oVar3 = ((s) this.f7511k.get(size)).b(oVar3);
            }
        }
        Path path = this.f7510j;
        O5.f.d(oVar3, path);
        return path;
    }

    public final void n(ArrayList arrayList) {
        this.f7511k = arrayList;
    }
}
