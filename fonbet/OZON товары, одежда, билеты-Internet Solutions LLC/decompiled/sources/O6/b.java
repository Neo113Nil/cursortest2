package O6;

import Sc.InterfaceC3999a;
import kotlin.jvm.functions.Function1;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes8.dex */
public interface b {
    static /* synthetic */ void a(b bVar, long j11) {
        Function1 function1;
        boolean z11 = C7811b0.h(j11) > 0.5f;
        function1 = c.f19996b;
        bVar.b(j11, z11, function1);
    }

    void b(long j11, boolean z11, @NotNull Function1 function1);

    void c(long j11, boolean z11, @NotNull Function1<? super C7807Z, C7807Z> function1);
}
