package Wb0;

import I0.C3173b;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Wb0.a;
import Wb0.c;
import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q20.InterfaceC8978a;
import q20.InterfaceC8979b;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f33430a;

    static final class a extends AbstractC7737t implements Function0<InterfaceC8979b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ld0.c f33431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ld0.c cVar) {
            super(0);
            this.f33431b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC8979b invoke() {
            return (InterfaceC8979b) this.f33431b.e(InterfaceC8978a.class);
        }
    }

    public b(@NotNull Ld0.c limbDiStore) {
        Intrinsics.checkNotNullParameter(limbDiStore, "limbDiStore");
        this.f33430a = k.b(new a(limbDiStore));
    }

    public final void a(@NotNull c.d event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        if (((InterfaceC8979b) this.f33430a.getValue()).c() != q20.c.QA_BUILDS_OR_AUTOTEST) {
            return;
        }
        boolean z11 = event.c() instanceof a.InterfaceC0593a.b;
        a.InterfaceC0593a c11 = event.c();
        if (Intrinsics.d(c11, a.InterfaceC0593a.C0594a.f33428a)) {
            str = "cancel";
        } else if (c11 instanceof a.InterfaceC0593a.b) {
            str = "failure";
        } else {
            if (!Intrinsics.d(c11, a.InterfaceC0593a.c.f33429a)) {
                throw new o();
            }
            str = "success";
        }
        String b11 = event.b();
        String a11 = event.a();
        String d11 = event.d();
        if (d11 == null) {
            d11 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b11);
        sb2.append(" | ");
        sb2.append(a11);
        sb2.append(" | ");
        sb2.append(str);
        Log.i("OPAutotestLog", C3173b.c(sb2, " | ", "", " ", d11));
    }
}
