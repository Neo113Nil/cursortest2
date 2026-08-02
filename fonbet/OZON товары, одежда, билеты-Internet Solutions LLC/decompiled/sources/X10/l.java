package X10;

import Sc.InterfaceC4008j;
import a00.C4908c;
import androidx.collection.J;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.recycler.layout.ComposerGridLayoutManager;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f33997a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.g f33998b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8042d f33999c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f34000d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4908c f34001e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f34002f;

    /* renamed from: g, reason: collision with root package name */
    private int f34003g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<fk0.c> f34004h;

    /* renamed from: i, reason: collision with root package name */
    private int f34005i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final J<d> f34006j;

    public l(@NotNull r activity, @NotNull androidx.recyclerview.widget.g recyclerView, @NotNull C8042d adapter, @NotNull n20.k widgetStore, @NotNull C4908c lifecycleOwner, boolean z11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f33997a = activity;
        this.f33998b = recyclerView;
        this.f33999c = adapter;
        this.f34000d = widgetStore;
        this.f34001e = lifecycleOwner;
        this.f34002f = z11;
        this.f34003g = -1;
        this.f34004h = Sc.k.b(new k(this));
        this.f34005i = -1;
        this.f34006j = new J<>((Object) null);
    }

    public static void a(l lVar, int i11) {
        fk0.c value = lVar.f34004h.getValue();
        if (value != null && lVar.f34005i < i11) {
            lVar.f34005i = i11;
            e eVar = new e(lVar.f33998b, lVar.f34001e, lVar.f34002f);
            lVar.f34006j.b(eVar);
            List<ru.ozon.composer.ui.widget.l> g10 = lVar.f33999c.g();
            int i12 = i11 + 1;
            int min = Math.min(i11 + 6, g10.size());
            int max = Math.max(i12, lVar.f34003g + 1);
            while (max < min) {
                ru.ozon.composer.ui.widget.l lVar2 = g10.get(max);
                int j11 = lVar2.j();
                InterfaceC8046a<?, ? extends l20.c> viewMapper = lVar.f34000d.getViewMapper(lVar2.j());
                if (!(viewMapper instanceof ru.ozon.composer.ui.widget.g)) {
                    viewMapper = null;
                }
                ru.ozon.composer.ui.widget.g<?, l20.c> gVar = (ru.ozon.composer.ui.widget.g) viewMapper;
                if (gVar != null) {
                    Integer d11 = value.d(j11);
                    if ((d11 != null ? d11.intValue() : 0) < value.c(j11)) {
                        try {
                            eVar.b(gVar, new j(value, j11));
                        } catch (Exception unused) {
                        }
                    }
                    max++;
                }
            }
            lVar.f34003g = min - 1;
        }
    }

    public static void d(final l lVar) {
        RecyclerView.o layoutManager = lVar.f33998b.getLayoutManager();
        if (layoutManager instanceof ComposerGridLayoutManager) {
            ((ComposerGridLayoutManager) layoutManager).a(new E10.e() { // from class: X10.i
                @Override // E10.e
                public final void a(int i11) {
                    l.a(l.this, i11);
                }
            });
        }
    }

    public final void c() {
        fk0.c value;
        this.f34005i = -1;
        this.f34003g = -1;
        InterfaceC4008j<fk0.c> interfaceC4008j = this.f34004h;
        if (interfaceC4008j.isInitialized() && (value = interfaceC4008j.getValue()) != null) {
            value.a();
        }
        J<d> j11 = this.f34006j;
        Object[] objArr = j11.f38646a;
        int i11 = j11.f38647b;
        for (int i12 = 0; i12 < i11; i12++) {
            ((d) objArr[i12]).a();
        }
        j11.c();
    }
}
