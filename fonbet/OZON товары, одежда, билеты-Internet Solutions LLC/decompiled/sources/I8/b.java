package I8;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import n8.C8451a;
import n8.f;

/* loaded from: classes.dex */
public final class b implements f {
    @Override // n8.f
    public final List<C8451a<?>> c(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C8451a<?> c8451a : componentRegistrar.getComponents()) {
            String g10 = c8451a.g();
            if (g10 != null) {
                c8451a = c8451a.o(new a(g10, c8451a));
            }
            arrayList.add(c8451a);
        }
        return arrayList;
    }
}
