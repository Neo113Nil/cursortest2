package Vi;

import Di.C2872a;
import F4.AbstractC3028h;
import F4.C3037q;
import F4.F;
import F4.J;
import F4.M;
import Sc.o;
import Si.InterfaceC4010a;
import Si.d;
import Ui.k;
import Ve.C4636t5;
import Zi.f;
import Zi.g;
import Zi.h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

/* loaded from: classes10.dex */
public final class c extends J<InterfaceC4010a, RecyclerView.C> {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final C2872a f32802j = new C2872a(1.0d);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.lifecycle.J f32803c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Xi.a> f32804d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final k f32805e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f32806f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function1<Long, Integer> f32807g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private Map<Integer, C2872a> f32808h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private d f32809i;

    static final class a extends AbstractC7737t implements Function2<InterfaceC4010a.e, Integer, Unit> {
        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC4010a.e eVar, Integer num) {
            InterfaceC4010a.e item = eVar;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "item");
            ((k) c.this.f32805e).c().invoke(item, Integer.valueOf(intValue), Boolean.FALSE);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull androidx.lifecycle.J lifecycleOwner, @NotNull List itemLayoutConfigurators, @NotNull k delegates, boolean z11, @NotNull Function1 selectionIndexProvider) {
        super(new Vi.a());
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(itemLayoutConfigurators, "itemLayoutConfigurators");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(selectionIndexProvider, "selectionIndexProvider");
        this.f32803c = lifecycleOwner;
        this.f32804d = itemLayoutConfigurators;
        this.f32805e = delegates;
        this.f32806f = z11;
        this.f32807g = selectionIndexProvider;
        this.f32808h = U.c();
        this.f32809i = d.NUMBER;
    }

    private final void j(ViewGroup viewGroup, ViewGroup viewGroup2, int i11) {
        Iterator<T> it = this.f32804d.iterator();
        while (it.hasNext()) {
            ((Xi.a) it.next()).a(this, viewGroup, viewGroup2, i11);
        }
    }

    private final InterfaceC4010a q(InterfaceC4010a interfaceC4010a) {
        boolean z11 = interfaceC4010a instanceof InterfaceC4010a.e.c;
        Function1<Long, Integer> function1 = this.f32807g;
        if (z11) {
            InterfaceC4010a.e.c cVar = (InterfaceC4010a.e.c) interfaceC4010a;
            return InterfaceC4010a.e.c.e(cVar, function1.invoke(Long.valueOf(cVar.getId())).intValue());
        }
        if (!(interfaceC4010a instanceof InterfaceC4010a.e.d)) {
            return interfaceC4010a;
        }
        InterfaceC4010a.e.d dVar = (InterfaceC4010a.e.d) interfaceC4010a;
        return InterfaceC4010a.e.d.e(dVar, function1.invoke(Long.valueOf(dVar.getId())).intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        InterfaceC4010a item = getItem(i11);
        if (item instanceof InterfaceC4010a.e) {
            return 0;
        }
        if (item instanceof InterfaceC4010a.C0522a) {
            return 1;
        }
        if (item instanceof InterfaceC4010a.f) {
            return 3;
        }
        if (item instanceof InterfaceC4010a.d) {
            return 4;
        }
        if (item == null) {
            return 2;
        }
        throw new o();
    }

    public final void i(@NotNull androidx.lifecycle.J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f32803c = lifecycleOwner;
    }

    public final int k(long j11) {
        int itemCount = getItemCount();
        for (int i11 = 0; i11 < itemCount; i11++) {
            InterfaceC4010a l11 = l(i11);
            if (l11 != null && (l11 instanceof InterfaceC4010a.e) && ((InterfaceC4010a.e) l11).d().getId() == j11) {
                return i11;
            }
        }
        return -1;
    }

    public final InterfaceC4010a l(int i11) {
        if (i11 < 0 || i11 >= getItemCount()) {
            return null;
        }
        try {
            return getItem(i11);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @NotNull
    public final C2872a m(int i11) {
        C2872a c2872a = this.f32808h.get(Integer.valueOf(i11));
        if (c2872a != null) {
            return c2872a;
        }
        C2872a c2872a2 = this.f32808h.get(0);
        return c2872a2 == null ? f32802j : c2872a2;
    }

    public final void n() {
        F<InterfaceC4010a> f7 = f();
        if (f7 != null) {
            M<?, InterfaceC4010a> m11 = f7.m();
            if (!(m11 instanceof C3037q)) {
                throw new IllegalStateException("Attempt to access dataSource on a PagedList that was instantiated with a " + ((Object) m11.getClass().getSimpleName()) + " instead of a DataSource");
            }
            AbstractC3028h g10 = ((C3037q) m11).g();
            if (g10 != null) {
                g10.d();
            }
        }
    }

    public final void o(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f32809i = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NotNull RecyclerView.C holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        InterfaceC4010a item = getItem(i11);
        InterfaceC4010a q11 = item != null ? q(item) : null;
        if (q11 instanceof InterfaceC4010a.e) {
            f fVar = (f) holder;
            InterfaceC4010a.e media = (InterfaceC4010a.e) q11;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(media, "media");
            fVar.h(media, media.a());
            return;
        }
        if (!(q11 instanceof InterfaceC4010a.C0522a)) {
            if (q11 instanceof InterfaceC4010a.f) {
                ((g) holder).f((InterfaceC4010a.f) q11);
            }
        } else {
            Zi.c cVar = (Zi.c) holder;
            ViewGroup.LayoutParams layoutParams = cVar.k().f12562c.getLayoutParams();
            StaggeredGridLayoutManager.c cVar2 = layoutParams instanceof StaggeredGridLayoutManager.c ? (StaggeredGridLayoutManager.c) layoutParams : null;
            if (cVar2 != null) {
                cVar2.e(((InterfaceC4010a.C0522a) q11).f());
            }
            cVar.j((InterfaceC4010a.C0522a) q11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public final RecyclerView.C onCreateViewHolder(@NotNull ViewGroup viewGroup, int i11) {
        int i12;
        LayoutInflater a11 = C4636t5.a(viewGroup, "parent");
        k kVar = this.f32805e;
        if (i11 == 1) {
            Ii.d b11 = Ii.d.b(a11, viewGroup);
            ViewGroup a12 = b11.a();
            Intrinsics.checkNotNullExpressionValue(a12, "getRoot(...)");
            j(viewGroup, a12, i11);
            Intrinsics.checkNotNullExpressionValue(b11, "also(...)");
            return new Zi.c(b11, this.f32803c, kVar.a(), kVar.b());
        }
        if (i11 == 2) {
            ViewGroup containerView = new FrameLayout(viewGroup.getContext());
            j(viewGroup, containerView, i11);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            return new h(containerView);
        }
        if (i11 == 3) {
            Ii.f b12 = Ii.f.b(a11, viewGroup);
            ViewGroup a13 = b12.a();
            Intrinsics.checkNotNullExpressionValue(a13, "getRoot(...)");
            j(viewGroup, a13, i11);
            Intrinsics.checkNotNullExpressionValue(b12, "also(...)");
            return new g(b12, kVar.a());
        }
        if (i11 != 4) {
            int i13 = this.f32806f ? R.style.Widget_Ozon_Gallery_MediaCell_Select : R.style.Widget_Ozon_Gallery_MediaCell;
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Yi.a aVar = new Yi.a(context, i13);
            j(viewGroup, aVar, i11);
            return new f(aVar, this.f32809i, kVar.a(), kVar.b(), new a());
        }
        int i14 = Zi.d.f35993b;
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.checkNotNullParameter(context2, "context");
        LinearLayout containerView2 = new LinearLayout(context2);
        containerView2.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.bgDarkKey));
        containerView2.setOrientation(1);
        containerView2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        i12 = Zi.d.f35992a;
        containerView2.setPadding(i12, i12, i12, i12);
        containerView2.setLayoutParams(layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        appCompatTextView.setTextAppearance(context2, R.style.TextStyle_Head_L);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(context2.getString(R.string.gallery_empty_state_title_android));
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(context2, R.attr.textLightKey));
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        appCompatTextView2.setTextAppearance(context2, R.style.TextStyle_Body_L);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setText(context2.getString(R.string.gallery_empty_state_body_android));
        appCompatTextView2.setTextColor(ThemeExtKt.themeColor(context2, R.attr.textSecondaryOnDark));
        containerView2.addView(appCompatTextView);
        containerView2.addView(appCompatTextView2);
        j(viewGroup, containerView2, i11);
        Intrinsics.checkNotNullParameter(containerView2, "containerView");
        return new Zi.d(containerView2);
    }

    public final void p(@NotNull Map<Integer, C2872a> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f32808h = map;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NotNull RecyclerView.C holder, int i11, @NotNull List<Object> payloads) {
        Object q11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = payloads.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            q11 = next instanceof Set ? (Set) next : null;
            if (q11 != null) {
                linkedHashSet.addAll((Collection) q11);
            }
        }
        if (linkedHashSet.isEmpty()) {
            onBindViewHolder(holder, i11);
            return;
        }
        InterfaceC4010a item = getItem(i11);
        q11 = item != null ? q(item) : null;
        if (q11 instanceof InterfaceC4010a.e) {
            ((f) holder).h((InterfaceC4010a.e) q11, linkedHashSet);
        } else {
            onBindViewHolder(holder, i11);
        }
    }
}
