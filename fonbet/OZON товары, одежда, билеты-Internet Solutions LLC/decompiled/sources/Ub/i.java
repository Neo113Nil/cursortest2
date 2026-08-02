package Ub;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class i {

    static class a extends i {
        @Override // Ub.i
        @NonNull
        public final List<Hf.u> b(@NonNull Hf.u uVar) {
            Hf.u c11 = uVar.c();
            if (c11 == null) {
                return Collections.singletonList(uVar);
            }
            ArrayList arrayList = new ArrayList();
            while (c11 != null) {
                if (!(c11 instanceof Hf.r)) {
                    arrayList.add(c11);
                }
                Hf.u e11 = c11.e();
                c11.l();
                c11 = e11;
            }
            return arrayList;
        }
    }

    @NonNull
    public static i a() {
        return new a();
    }

    @NonNull
    public abstract List<Hf.u> b(@NonNull Hf.u uVar);
}
