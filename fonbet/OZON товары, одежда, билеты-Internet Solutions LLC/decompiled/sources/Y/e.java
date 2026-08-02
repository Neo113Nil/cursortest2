package Y;

import C.A;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5084b0;
import androidx.camera.core.impl.InterfaceC5086c0;
import e0.C6245b;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class e implements InterfaceC5084b0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5084b0 f34513b;

    /* renamed from: c, reason: collision with root package name */
    private final A f34514c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f34515d = new HashMap();

    public e(@NonNull InterfaceC5084b0 interfaceC5084b0, @NonNull A a11) {
        this.f34513b = interfaceC5084b0;
        this.f34514c = a11;
    }

    private InterfaceC5086c0 c(int i11) {
        HashMap hashMap = this.f34515d;
        if (hashMap.containsKey(Integer.valueOf(i11))) {
            return (InterfaceC5086c0) hashMap.get(Integer.valueOf(i11));
        }
        InterfaceC5084b0 interfaceC5084b0 = this.f34513b;
        InterfaceC5086c0.b bVar = null;
        if (interfaceC5084b0.b(i11)) {
            InterfaceC5086c0 a11 = interfaceC5084b0.a(i11);
            if (a11 != null) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC5086c0.c cVar : a11.d()) {
                    if (C6245b.b(cVar, this.f34514c)) {
                        arrayList.add(cVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    bVar = InterfaceC5086c0.b.e(a11.c(), a11.a(), a11.b(), arrayList);
                }
            }
            hashMap.put(Integer.valueOf(i11), bVar);
        }
        return bVar;
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final InterfaceC5086c0 a(int i11) {
        return c(i11);
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final boolean b(int i11) {
        return this.f34513b.b(i11) && c(i11) != null;
    }
}
