package N10;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import jk0.j;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes3.dex */
public final class d<VH extends RecyclerView.C> extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final N10.b<VH> f18407a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f18408b;

    /* renamed from: c, reason: collision with root package name */
    private final SwipeRefreshLayout f18409c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b<VH> f18410d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18411e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18412f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final LinearLayout f18413g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final N10.e f18414h;

    private static final class a<VH extends RecyclerView.C> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final VH f18415a;

        /* renamed from: b, reason: collision with root package name */
        private final int f18416b;

        /* renamed from: c, reason: collision with root package name */
        private final int f18417c;

        public a(@NotNull VH holder, int i11, int i12) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            this.f18415a = holder;
            this.f18416b = i11;
            this.f18417c = i12;
        }

        @NotNull
        public final VH a() {
            return this.f18415a;
        }

        public final int b() {
            return this.f18417c;
        }

        public final int c() {
            return this.f18416b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b<VH extends RecyclerView.C> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final N10.b<VH> f18418a;

        /* renamed from: b, reason: collision with root package name */
        private String f18419b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final HashSet f18420c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final HashMap f18421d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final TreeSet<N10.c> f18422e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final HashMap<Integer, List<N10.c>> f18423f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final HashMap<Integer, List<N10.c>> f18424g;

        public b(@NotNull N10.b<VH> adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f18418a = adapter;
            this.f18420c = new HashSet();
            this.f18421d = new HashMap();
            this.f18422e = new TreeSet<>();
            this.f18423f = new HashMap<>();
            this.f18424g = new HashMap<>();
        }

        public final boolean a() {
            return !Intrinsics.d(this.f18424g, this.f18423f);
        }

        public final void b() {
            HashMap<Integer, List<N10.c>> hashMap = this.f18424g;
            hashMap.clear();
            HashMap<Integer, List<N10.c>> hashMap2 = this.f18423f;
            hashMap.putAll(hashMap2);
            hashMap2.clear();
            TreeSet<N10.c> treeSet = this.f18422e;
            treeSet.clear();
            treeSet.addAll(this.f18418a.e());
            ArrayList arrayList = new ArrayList();
            Iterator<N10.c> it = treeSet.iterator();
            while (it.hasNext()) {
                N10.c next = it.next();
                if (!arrayList.isEmpty() && !Intrinsics.d(((N10.c) C7714v.K(arrayList)).b(), next.b())) {
                    arrayList.clear();
                }
                arrayList.add(next);
                hashMap2.put(Integer.valueOf(next.a()), new ArrayList(arrayList));
            }
        }

        public final String c() {
            return this.f18419b;
        }

        @NotNull
        public final HashSet d() {
            return this.f18420c;
        }

        @NotNull
        public final HashMap<Integer, List<N10.c>> e() {
            return this.f18423f;
        }

        @NotNull
        public final TreeSet<N10.c> f() {
            return this.f18422e;
        }

        @NotNull
        public final HashMap g() {
            return this.f18421d;
        }

        public final void h(String str) {
            this.f18419b = str;
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f18425a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d<VH> f18426b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N10.c f18427c;

        c(RecyclerView.C c11, d<VH> dVar, N10.c cVar) {
            this.f18425a = c11;
            this.f18426b = dVar;
            this.f18427c = cVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            ((j) this.f18425a).setLifecycleState(AbstractC5434v.b.CREATED);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            v11.removeOnAttachStateChangeListener(this);
            RecyclerView.C c11 = this.f18425a;
            ((j) c11).setLifecycleState(AbstractC5434v.b.DESTROYED);
            d<VH> dVar = this.f18426b;
            dVar.getClass();
            View itemView = c11.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            Object tag = itemView.getTag(R.id.sticky_header_tag_holder);
            Intrinsics.g(tag, "null cannot be cast to non-null type ru.ozon.composer.ui.sticky.StickyHeaderDecoration.HolderConfig<VH of ru.ozon.composer.ui.sticky.StickyHeaderDecoration>");
            d.a(dVar, (a) tag);
            ((d) dVar).f18410d.d().remove(Integer.valueOf(this.f18427c.a()));
        }
    }

    /* renamed from: N10.d$d, reason: collision with other inner class name */
    public static final class ViewOnAttachStateChangeListenerC0353d implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinearLayout f18428a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f18429b;

        public ViewOnAttachStateChangeListenerC0353d(LinearLayout linearLayout, d dVar) {
            this.f18428a = linearLayout;
            this.f18429b = dVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NotNull View view) {
            this.f18428a.removeOnAttachStateChangeListener(this);
            d dVar = this.f18429b;
            d.g(dVar, dVar.f18407a, dVar.f18414h);
            d.f(dVar);
            LinearLayout linearLayout = dVar.f18413g;
            if (linearLayout.isAttachedToWindow()) {
                linearLayout.addOnAttachStateChangeListener(new e(linearLayout, dVar));
            } else {
                d.h(dVar, dVar.f18407a, dVar.f18414h);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NotNull View view) {
        }
    }

    public static final class e implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinearLayout f18430a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f18431b;

        public e(LinearLayout linearLayout, d dVar) {
            this.f18430a = linearLayout;
            this.f18431b = dVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NotNull View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NotNull View view) {
            this.f18430a.removeOnAttachStateChangeListener(this);
            d dVar = this.f18431b;
            d.h(dVar, dVar.f18407a, dVar.f18414h);
        }
    }

    public static final class f implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f18433b;

        public f(RecyclerView recyclerView) {
            this.f18433b = recyclerView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@NotNull View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            view.removeOnLayoutChangeListener(this);
            d.this.n(this.f18433b);
        }
    }

    public d(@NotNull N10.b adapter, @NotNull ViewGroup stickyContainer, SwipeRefreshLayout swipeRefreshLayout) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(stickyContainer, "stickyContainer");
        this.f18407a = adapter;
        this.f18408b = stickyContainer;
        this.f18409c = swipeRefreshLayout;
        this.f18410d = new b<>(adapter);
        LinearLayout linearLayout = new LinearLayout(stickyContainer.getContext());
        linearLayout.setOrientation(1);
        this.f18413g = linearLayout;
        this.f18414h = new N10.e(this);
        l();
    }

    public static final void a(d dVar, a aVar) {
        dVar.f18410d.g().put(Integer.valueOf(aVar.c()), aVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(d dVar) {
        b<VH> bVar = dVar.f18410d;
        bVar.b();
        boolean a11 = bVar.a();
        b<VH> bVar2 = dVar.f18410d;
        LinearLayout linearLayout = dVar.f18413g;
        if (a11) {
            bVar2.g().clear();
            linearLayout.removeAllViews();
            dVar.m(C7714v.U0(bVar2.f()));
            return;
        }
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            Intrinsics.f(childAt);
            Object tag = childAt.getTag(R.id.sticky_header_tag_holder);
            Intrinsics.g(tag, "null cannot be cast to non-null type ru.ozon.composer.ui.sticky.StickyHeaderDecoration.HolderConfig<VH of ru.ozon.composer.ui.sticky.StickyHeaderDecoration>");
            a aVar = (a) tag;
            Object tag2 = childAt.getTag(R.id.sticky_header_tag_data);
            Intrinsics.g(tag2, "null cannot be cast to non-null type ru.ozon.composer.ui.sticky.StickyData");
            N10.a aVar2 = (N10.a) tag2;
            int b11 = aVar.b();
            N10.b<VH> bVar3 = dVar.f18407a;
            l d11 = bVar3.d(b11);
            if (!Intrinsics.d(d11.a(), aVar2.a())) {
                bVar2.g().clear();
                linearLayout.removeAllViews();
                dVar.m(C7714v.U0(bVar2.f()));
                return;
            } else {
                if (!d11.equals(aVar2)) {
                    bVar3.onBindViewHolder(aVar.a(), aVar.b());
                    childAt.setTag(R.id.sticky_header_tag_data, d11);
                }
            }
        }
    }

    public static final void g(d dVar, N10.b bVar, RecyclerView.i iVar) {
        if (dVar.f18412f) {
            return;
        }
        bVar.registerAdapterDataObserver(iVar);
        dVar.f18412f = true;
    }

    public static final void h(d dVar, N10.b bVar, N10.e eVar) {
        if (dVar.f18412f) {
            bVar.unregisterAdapterDataObserver(eVar);
            dVar.f18412f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void j(N10.c cVar) {
        b<VH> bVar = this.f18410d;
        if (bVar.d().contains(Integer.valueOf(cVar.a()))) {
            return;
        }
        int a11 = cVar.a();
        N10.b<VH> bVar2 = this.f18407a;
        int itemViewType = bVar2.getItemViewType(a11);
        RecyclerView.C c11 = (RecyclerView.C) bVar.g().remove(Integer.valueOf(itemViewType));
        LinearLayout linearLayout = this.f18413g;
        if (c11 == null) {
            c11 = bVar2.onCreateViewHolder(linearLayout, itemViewType);
        }
        View itemView = c11.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.setTag(R.id.sticky_header_tag_holder, new a(c11, itemViewType, a11));
        bVar2.onBindViewHolder(c11, cVar.a());
        if (c11 instanceof k) {
            c11.itemView.addOnAttachStateChangeListener(new c(c11, this, cVar));
        }
        linearLayout.addView(c11.itemView);
        bVar.d().add(Integer.valueOf(cVar.a()));
        View itemView2 = c11.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        itemView2.setTag(R.id.sticky_header_tag_data, bVar2.d(cVar.a()));
    }

    private final void m(List<N10.c> list) {
        N10.c cVar;
        List<N10.c> list2 = list;
        LinearLayout linearLayout = this.f18413g;
        String str = null;
        if (list2 != null && !list2.isEmpty()) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                N10.c cVar2 = (N10.c) obj;
                View childAt = linearLayout.getChildAt(i11);
                if (childAt != null) {
                    Object tag = childAt.getTag(R.id.sticky_header_tag_holder);
                    Intrinsics.g(tag, "null cannot be cast to non-null type ru.ozon.composer.ui.sticky.StickyHeaderDecoration.HolderConfig<VH of ru.ozon.composer.ui.sticky.StickyHeaderDecoration>");
                    if (((a) tag).b() != cVar2.a()) {
                        linearLayout.removeView(childAt);
                        j(cVar2);
                    }
                } else {
                    j(cVar2);
                }
                i11 = i12;
            }
        }
        int size = list != null ? list.size() : 0;
        if (linearLayout.getChildCount() > size) {
            int childCount = linearLayout.getChildCount() - 1;
            if (size <= childCount) {
                while (true) {
                    linearLayout.removeViewInLayout(linearLayout.getChildAt(childCount));
                    if (childCount == size) {
                        break;
                    } else {
                        childCount--;
                    }
                }
            }
            linearLayout.requestLayout();
        }
        if (list != null && (cVar = (N10.c) C7714v.M(list)) != null) {
            str = cVar.b();
        }
        this.f18410d.h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(RecyclerView recyclerView) {
        List<N10.c> list;
        if (!recyclerView.canScrollVertically(-1)) {
            m(null);
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f18409c;
        float y11 = this.f18408b.getY() - (swipeRefreshLayout != null ? swipeRefreshLayout.getY() : 0.0f);
        LinearLayout linearLayout = this.f18413g;
        View findChildViewUnder = recyclerView.findChildViewUnder(linearLayout.getWidth() / 2.0f, linearLayout.getHeight() + y11);
        if (findChildViewUnder == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(findChildViewUnder);
        b<VH> bVar = this.f18410d;
        Iterator<N10.c> it = bVar.f().iterator();
        N10.c cVar = null;
        while (it.hasNext()) {
            N10.c next = it.next();
            if (next.a() <= childAdapterPosition) {
                cVar = next;
            }
        }
        N10.c cVar2 = cVar;
        List<N10.c> list2 = bVar.e().get(cVar2 != null ? Integer.valueOf(cVar2.a()) : null);
        if (cVar2 == null || (list = list2) == null || list.isEmpty()) {
            m(null);
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(cVar2.a()) : null;
        if (!Intrinsics.d(bVar.c(), cVar2.b()) && findViewByPosition != null && !bVar.d().contains(Integer.valueOf(cVar2.a())) && findViewByPosition.getTop() > y11) {
            linearLayout.setTranslationY(((-linearLayout.getHeight()) + findViewByPosition.getTop()) - y11);
            return;
        }
        linearLayout.setTranslationY(0.0f);
        if (!Intrinsics.d(bVar.c(), cVar2.b()) || findViewByPosition == null || !bVar.d().contains(Integer.valueOf(cVar2.a())) || findViewByPosition.getBottom() - y11 <= linearLayout.getHeight()) {
            m(list2);
        } else {
            m(null);
            recyclerView.addOnLayoutChangeListener(new f(recyclerView));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.ui.sticky.StickyHeaderDecoration<*>");
        return Intrinsics.d(this.f18407a, ((d) obj).f18407a);
    }

    public final int hashCode() {
        return this.f18407a.hashCode();
    }

    public final void k() {
        this.f18408b.removeView(this.f18413g);
        if (this.f18412f) {
            this.f18407a.unregisterAdapterDataObserver(this.f18414h);
            this.f18412f = false;
        }
        this.f18411e = false;
    }

    public final void l() {
        if (this.f18411e) {
            return;
        }
        LinearLayout linearLayout = this.f18413g;
        ViewParent parent = linearLayout.getParent();
        if (parent != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(linearLayout);
            }
        }
        this.f18408b.addView(linearLayout);
        if (linearLayout.isAttachedToWindow()) {
            N10.b<VH> bVar = this.f18407a;
            N10.e eVar = this.f18414h;
            g(this, bVar, eVar);
            f(this);
            if (linearLayout.isAttachedToWindow()) {
                linearLayout.addOnAttachStateChangeListener(new e(linearLayout, this));
            } else if (this.f18412f) {
                bVar.unregisterAdapterDataObserver(eVar);
                this.f18412f = false;
            }
        } else {
            linearLayout.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0353d(linearLayout, this));
        }
        this.f18411e = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c11, parent, state);
        if (parent.getChildCount() > 0) {
            n(parent);
        }
    }
}
