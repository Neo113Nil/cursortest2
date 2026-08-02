package Y;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x2.i;

/* loaded from: classes8.dex */
public abstract class f implements InterfaceC5086c0 {
    @NonNull
    public static f e(@NonNull InterfaceC5086c0 interfaceC5086c0) {
        int c11 = interfaceC5086c0.c();
        int a11 = interfaceC5086c0.a();
        List<InterfaceC5086c0.a> b11 = interfaceC5086c0.b();
        List<InterfaceC5086c0.c> d11 = interfaceC5086c0.d();
        i.a("Should contain at least one VideoProfile.", !d11.isEmpty());
        return new a(c11, a11, Collections.unmodifiableList(new ArrayList(b11)), Collections.unmodifiableList(new ArrayList(d11)), !b11.isEmpty() ? b11.get(0) : null, d11.get(0));
    }

    public abstract InterfaceC5086c0.a f();

    @NonNull
    public abstract InterfaceC5086c0.c g();
}
