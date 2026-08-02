package Yh0;

import Xh0.c;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f35083a = a.f35084a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f35084a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final LinkedList<Function0<String>> f35085b = new LinkedList<>();

        @NotNull
        public static c a(@NotNull c.b.InterfaceC0625b loggingConfiguration) {
            c eVar;
            Intrinsics.checkNotNullParameter(loggingConfiguration, "loggingConfiguration");
            if (Intrinsics.d(loggingConfiguration, c.b.InterfaceC0625b.a.f34481a)) {
                eVar = d.f35086b;
            } else {
                if (!(loggingConfiguration instanceof c.b.InterfaceC0625b.C0626b)) {
                    throw new Sc.o();
                }
                eVar = new e(((c.b.InterfaceC0625b.C0626b) loggingConfiguration).a());
            }
            LinkedList<Function0<String>> linkedList = f35085b;
            Iterator<T> it = linkedList.iterator();
            while (it.hasNext()) {
                eVar.a((Function0) it.next());
            }
            linkedList.clear();
            return eVar;
        }

        public static void b(@NotNull Function0 message) {
            Intrinsics.checkNotNullParameter(message, "message");
            f35085b.add(message);
        }
    }

    void a(@NotNull Function0<String> function0);
}
