package Ej;

import com.google.crypto.tink.internal.B;
import io.sentry.Z0;
import io.sentry.util.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import m3.InterfaceC8068j;
import m3.r;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigServiceImpl;
import u3.InterfaceC9928b;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements InterfaceC8068j, B.b, qc.o, l.a, r.a {
    public static String a(int i11, String str) {
        return str + i11;
    }

    public static void b(int i11, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i11);
    }

    @Override // m3.InterfaceC8068j
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // qc.o
    public Object apply(Object obj) {
        List isLibraryAvailable$lambda$1;
        isLibraryAvailable$lambda$1 = ThirdPartyLibrariesConfigServiceImpl.isLibraryAvailable$lambda$1((Throwable) obj);
        return isLibraryAvailable$lambda$1;
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        return i8.q.c((b8.g) gVar);
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        return Z0.c();
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
