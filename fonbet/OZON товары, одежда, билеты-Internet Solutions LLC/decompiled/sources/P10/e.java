package P10;

import H00.b;
import Sc.o;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.u;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.I;
import kotlin.sequences.l;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final O10.c f21631a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f21632b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final P10.b f21633c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C8042d f21634d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f21635e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ViewGroup f21636f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private a f21637g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final b f21638h;

    private interface a {

        /* renamed from: P10.e$a$a, reason: collision with other inner class name */
        public static final class C0424a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final LinkedHashSet f21639a = new LinkedHashSet();

            public final void a(int i11) {
                this.f21639a.add(Integer.valueOf(i11));
            }

            @NotNull
            public final LinkedHashSet b() {
                return this.f21639a;
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f21640a = new b();
        }
    }

    public static final class b implements u {

        /* loaded from: classes3.dex */
        /* synthetic */ class a extends C7735q implements Function1<View, O10.d> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f21642a = new a(1, O10.e.class, "asStickyView", "asStickyView(Landroid/view/View;)Landroid/view/View;", 1);

            @Override // kotlin.jvm.functions.Function1
            public final O10.d invoke(View view) {
                View p02 = view;
                Intrinsics.checkNotNullParameter(p02, "p0");
                O10.e.a(p02);
                return O10.d.a(p02);
            }
        }

        b() {
        }

        @Override // androidx.recyclerview.widget.u
        public final void onChanged(int i11, int i12, Object obj) {
            View e11;
            e eVar = e.this;
            a aVar = eVar.f21637g;
            a.C0424a c0424a = aVar instanceof a.C0424a ? (a.C0424a) aVar : null;
            if (c0424a == null || (e11 = eVar.f21632b.e()) == null) {
                return;
            }
            int c11 = O10.d.c(e11);
            View g10 = eVar.f21632b.g();
            if (g10 == null) {
                return;
            }
            int c12 = O10.d.c(g10);
            int i13 = (i12 + i11) - 1;
            if (i11 > c11 || i13 < c12) {
                return;
            }
            IntRange intRange = new IntRange(i11, i13, 1);
            Iterator it = l.v(C5316f0.b(eVar.f21636f), a.f21642a).iterator();
            while (true) {
                I.a aVar2 = (I.a) it;
                if (!aVar2.hasNext()) {
                    return;
                }
                int c13 = O10.d.c(((O10.d) aVar2.next()).h());
                int f71842a = intRange.getF71842a();
                if (c13 <= intRange.getF71843b() && f71842a <= c13) {
                    c0424a.a(c13);
                }
            }
        }

        @Override // androidx.recyclerview.widget.u
        public final void onInserted(int i11, int i12) {
            e eVar = e.this;
            if (i11 > eVar.f21631a.c()) {
                return;
            }
            e.e(eVar);
        }

        @Override // androidx.recyclerview.widget.u
        public final void onMoved(int i11, int i12) {
        }

        @Override // androidx.recyclerview.widget.u
        public final void onRemoved(int i11, int i12) {
            e eVar = e.this;
            View e11 = eVar.f21632b.e();
            if (e11 == null || i11 > O10.d.c(e11)) {
                return;
            }
            e.e(eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull O10.c scrollHelper, @NotNull Q10.a stickyHeader, @NotNull P10.b adapter, @NotNull C8042d composerAdapter, @NotNull Function0<Unit> refreshStickyHeader) {
        Intrinsics.checkNotNullParameter(scrollHelper, "scrollHelper");
        Intrinsics.checkNotNullParameter(stickyHeader, "stickyHeader");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(composerAdapter, "composerAdapter");
        Intrinsics.checkNotNullParameter(refreshStickyHeader, "refreshStickyHeader");
        this.f21631a = scrollHelper;
        this.f21632b = (ViewGroup) stickyHeader;
        this.f21633c = adapter;
        this.f21634d = composerAdapter;
        this.f21635e = refreshStickyHeader;
        Intrinsics.checkNotNullParameter(stickyHeader, "<this>");
        this.f21636f = (ViewGroup) stickyHeader;
        this.f21637g = new a.C0424a();
        this.f21638h = new b();
    }

    public static final /* synthetic */ void e(e eVar) {
        eVar.f21637g = a.b.f21640a;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Q10.a, android.view.ViewGroup] */
    public final void f(@NotNull i.c diffResult) {
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        this.f21637g = new a.C0424a();
        diffResult.b(this.f21638h);
        a aVar = this.f21637g;
        boolean z11 = aVar instanceof a.b;
        Function0<Unit> function0 = this.f21635e;
        if (z11) {
            function0.invoke();
            return;
        }
        if (!(aVar instanceof a.C0424a)) {
            throw new o();
        }
        a.C0424a c0424a = (a.C0424a) aVar;
        IntRange o11 = kotlin.ranges.h.o(0, this.f21636f.getChildCount());
        int f71842a = o11.getF71842a();
        int f71843b = o11.getF71843b();
        if (f71842a > f71843b) {
            return;
        }
        while (true) {
            View c11 = this.f21632b.c(f71842a);
            int c12 = O10.d.c(c11);
            if (c0424a.b().contains(Integer.valueOf(c12))) {
                P10.b bVar = this.f21633c;
                i iVar = (i) C7714v.Q(c12, bVar.c());
                Integer valueOf = iVar != null ? Integer.valueOf(iVar.a()) : null;
                if (valueOf == null) {
                    function0.invoke();
                    return;
                }
                try {
                    bVar.b(valueOf.intValue(), O10.d.d(c11));
                } catch (Exception e11) {
                    int intValue = valueOf.intValue();
                    l20.c boundData = O10.d.d(c11).getBoundData();
                    RuntimeException a11 = h.a(e11, c12, intValue, boundData != null ? boundData.toString() : null, this.f21634d.g());
                    if (H00.b.a() != b.a.C0214a.a()) {
                        H00.b.a().logError(a11);
                    }
                    function0.invoke();
                    return;
                }
            }
            if (f71842a == f71843b) {
                return;
            } else {
                f71842a++;
            }
        }
    }
}
