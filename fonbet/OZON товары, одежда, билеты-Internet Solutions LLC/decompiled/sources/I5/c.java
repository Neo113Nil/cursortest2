package I5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class c extends n<J5.d, J5.d> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(ArrayList arrayList) {
        super(arrayList);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            P5.a aVar = (P5.a) arrayList.get(i11);
            J5.d dVar = (J5.d) aVar.f21849b;
            J5.d dVar2 = (J5.d) aVar.f21850c;
            if (dVar != null && dVar2 != null && dVar.c().length != dVar2.c().length) {
                float[] c11 = dVar.c();
                float[] c12 = dVar2.c();
                int length = c11.length + c12.length;
                float[] fArr = new float[length];
                System.arraycopy(c11, 0, fArr, 0, c11.length);
                System.arraycopy(c12, 0, fArr, c11.length, c12.length);
                Arrays.sort(fArr);
                float f7 = Float.NaN;
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    float f11 = fArr[i13];
                    if (f11 != f7) {
                        fArr[i12] = f11;
                        i12++;
                        f7 = fArr[i13];
                    }
                }
                float[] copyOfRange = Arrays.copyOfRange(fArr, 0, i12);
                aVar = P5.a.a(dVar.a(copyOfRange), dVar2.a(copyOfRange));
            }
            arrayList.set(i11, aVar);
        }
    }

    @Override // I5.m
    public final E5.a<J5.d, J5.d> h() {
        return new E5.e(this.f11990a);
    }

    @Override // I5.m
    public final List i() {
        return this.f11990a;
    }
}
