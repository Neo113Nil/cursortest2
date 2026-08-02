package B4;

import B0.A0;
import B4.H;
import B4.b0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@b0.a("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB4/O;", "LB4/b0;", "LB4/L;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class O extends b0<L> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d0 f2547c;

    public O(@NotNull d0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f2547c = navigatorProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, android.os.Bundle] */
    @Override // B4.b0
    public final void e(@NotNull List entries, S s11) {
        H h11;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            C2581j c2581j = (C2581j) it.next();
            H d11 = c2581j.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            L l11 = (L) d11;
            kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
            m11.f71787a = c2581j.c();
            int F11 = l11.F();
            String G11 = l11.G();
            if (F11 == 0 && G11 == null) {
                throw new IllegalStateException(("no start destination defined via app:startDestination for " + l11.l()).toString());
            }
            if (G11 != null) {
                h11 = l11.B(G11, false);
            } else {
                androidx.collection.a0<H> D11 = l11.D();
                D11.getClass();
                h11 = (H) androidx.collection.b0.c(D11, F11);
            }
            if (h11 == null) {
                throw new IllegalArgumentException(A0.b("navigation destination ", l11.E(), " is not a direct child of this NavGraph"));
            }
            if (G11 != null) {
                if (!G11.equals(h11.q())) {
                    H.b s12 = h11.s(G11);
                    Bundle c11 = s12 != null ? s12.c() : null;
                    if (c11 != null && !c11.isEmpty()) {
                        ?? bundle = new Bundle();
                        bundle.putAll(c11);
                        Bundle bundle2 = (Bundle) m11.f71787a;
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        m11.f71787a = bundle;
                    }
                }
                if (h11.k().isEmpty()) {
                    continue;
                } else {
                    ArrayList a11 = C2580i.a(h11.k(), new N(m11));
                    if (!a11.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + h11 + ". Missing required arguments [" + a11 + ']').toString());
                    }
                }
            }
            this.f2547c.c(h11.n()).e(C7714v.a0(b().a(h11, h11.e((Bundle) m11.f71787a))), s11);
        }
    }

    @Override // B4.b0
    @NotNull
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public L a() {
        return new L(this);
    }
}
