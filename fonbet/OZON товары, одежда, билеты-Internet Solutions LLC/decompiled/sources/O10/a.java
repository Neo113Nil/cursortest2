package O10;

import N10.h;
import P10.i;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.g;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f19841a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f19842b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ViewGroup f19843c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final P10.b f19844d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19845e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ViewGroup f19846f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19847g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19848h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19849i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f19850j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f19851k;

    /* renamed from: O10.a$a, reason: collision with other inner class name */
    public final class C0392a {

        /* renamed from: O10.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class ViewOnLayoutChangeListenerC0393a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f19853a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f19854b;

            public ViewOnLayoutChangeListenerC0393a(a aVar, int i11) {
                this.f19853a = aVar;
                this.f19854b = i11;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(@NotNull View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                view.removeOnLayoutChangeListener(this);
                this.f19853a.f19843c.scrollBy(this.f19854b);
            }
        }

        public C0392a() {
        }

        public final void a() {
            a.this.p(!r0.f19841a.canScrollVertically(-1));
        }

        public final void b(int i11) {
            a aVar = a.this;
            if (aVar.f19848h || a.g(aVar).isEmpty()) {
                return;
            }
            aVar.f19847g = false;
            if (!aVar.f19843c.isEmpty() && !aVar.f19841a.canScrollVertically(-1)) {
                aVar.f19843c.a();
                aVar.t();
                return;
            }
            if (i11 > 0 || (aVar.f19843c.getCurrentOffset() == 0.0f && !aVar.f19843c.isEmpty())) {
                aVar.q(i11 < 0);
            }
            if (aVar.f19847g) {
                return;
            }
            ViewGroup viewGroup = aVar.f19846f;
            if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
                viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0393a(aVar, i11));
            } else {
                aVar.f19843c.scrollBy(i11);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f19856b;

        public b(boolean z11) {
            this.f19856b = z11;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@NotNull View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            view.removeOnLayoutChangeListener(this);
            a aVar = a.this;
            aVar.f19849i = false;
            aVar.q(this.f19856b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull g composerRecyclerView, @NotNull c scrollHelper, @NotNull Q10.a stickyHeader, @NotNull P10.b adapter, boolean z11) {
        Intrinsics.checkNotNullParameter(composerRecyclerView, "composerRecyclerView");
        Intrinsics.checkNotNullParameter(scrollHelper, "scrollHelper");
        Intrinsics.checkNotNullParameter(stickyHeader, "stickyHeader");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f19841a = composerRecyclerView;
        this.f19842b = scrollHelper;
        this.f19843c = (ViewGroup) stickyHeader;
        this.f19844d = adapter;
        this.f19845e = z11;
        Intrinsics.checkNotNullParameter(stickyHeader, "<this>");
        this.f19846f = (ViewGroup) stickyHeader;
    }

    public static final int c(a aVar, List list) {
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) list.get(i12);
            e.a(view);
            int measuredHeight = view.getMeasuredHeight();
            d.b(view).d().getClass();
            i11 += measuredHeight;
        }
        return i11;
    }

    public static final List g(a aVar) {
        return aVar.f19844d.c();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Q10.a, android.view.ViewGroup] */
    private final boolean n(boolean z11, int i11, Integer num) {
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        c cVar = this.f19842b;
        View view = cVar.d().get();
        if (view == null || i11 < intValue) {
            return false;
        }
        if (i11 <= intValue && this.f19845e && z11) {
            float b11 = f.b(view, true);
            float a11 = f.a(view);
            if (this.f19843c.d() + cVar.f() + (a11 - b11) < a11) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [Q10.a, android.view.ViewGroup] */
    private final List<View> o(int i11) {
        int i12;
        h b11;
        h b12;
        int e11 = this.f19842b.e();
        Integer num = this.f19851k;
        if (num != null && e11 == num.intValue()) {
            e11--;
        }
        P10.b bVar = this.f19844d;
        List<i> c11 = bVar.c();
        ListIterator<i> listIterator = c11.listIterator(c11.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i12 = -1;
                break;
            }
            if (listIterator.previous().a() <= e11) {
                i12 = listIterator.nextIndex();
                break;
            }
        }
        i iVar = (i) C7714v.Q(i12, bVar.c());
        if (iVar == null) {
            return K.f71697a;
        }
        String b13 = iVar.b().b();
        int i13 = i12;
        while (i13 >= i11) {
            i iVar2 = (i) C7714v.Q(i13, bVar.c());
            if (!((iVar2 == null || (b12 = iVar2.b()) == null) ? false : Intrinsics.d(b13, b12.b()))) {
                break;
            }
            i13--;
        }
        View e12 = this.f19843c.e();
        if (e12 != null) {
            String b14 = d.b(e12).b();
            int c12 = d.c(e12);
            int i14 = i13;
            while (i14 > c12) {
                i iVar3 = (i) C7714v.Q(i14, bVar.c());
                if (!((iVar3 == null || (b11 = iVar3.b()) == null) ? false : Intrinsics.d(b14, b11.b()))) {
                    break;
                }
                i14--;
            }
            if (i14 == c12) {
                i13 = i14;
            }
        }
        int i15 = i13 + 1;
        Tc.b builder = new Tc.b((i12 - i15) + 1);
        if (i15 <= i12) {
            while (true) {
                builder.add(bVar.d(i15, this.f19846f));
                if (i15 == i12) {
                    break;
                }
                i15++;
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018b, code lost:
    
        if (O10.d.c(r0) == (O10.d.c(r2) + 1)) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Q10.a, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z11) {
        boolean z12;
        String b11;
        P10.b bVar;
        ViewGroup viewGroup = this.f19846f;
        int i11 = 0;
        if (viewGroup.isLayoutRequested() && !this.f19849i) {
            this.f19849i = true;
            if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
                viewGroup.addOnLayoutChangeListener(new b(z11));
                return;
            } else {
                this.f19849i = false;
                q(z11);
                return;
            }
        }
        if (viewGroup.isLayoutRequested()) {
            return;
        }
        c cVar = this.f19842b;
        cVar.i(z11);
        Integer num = this.f19851k;
        Integer num2 = this.f19850j;
        int e11 = cVar.e();
        if (e11 != -1) {
            if (num == null) {
                z12 = n(z11, e11, num2);
            } else if (num2 != null ? e11 <= num.intValue() || n(z11, e11, num2) : e11 <= num.intValue()) {
                z12 = true;
            }
            if (z12) {
                return;
            }
            int e12 = cVar.e();
            if (e12 != -1) {
                Integer num3 = this.f19851k;
                ?? r52 = this.f19843c;
                Integer num4 = null;
                if (num3 == null || e12 > num3.intValue()) {
                    Integer num5 = this.f19850j;
                    if (num5 != null && e12 >= num5.intValue()) {
                        View e13 = r52.e();
                        List<View> o11 = o((e13 != null ? d.c(e13) : -1) + 1);
                        View view = (View) C7714v.M(o11);
                        if (view != null) {
                            e.a(view);
                        } else {
                            view = null;
                        }
                        if (view != null && (b11 = d.b(view).b()) != null) {
                            View e14 = r52.e();
                            if (!b11.equals(e14 != null ? d.b(e14).b() : null)) {
                                if (e14 != null) {
                                }
                                r52.f(o11);
                                this.f19847g = true;
                            }
                            r52.b(o11);
                            this.f19847g = true;
                        }
                    }
                } else {
                    int e15 = cVar.e();
                    int childCount = viewGroup.getChildCount() - 1;
                    while (true) {
                        bVar = this.f19844d;
                        if (-1 >= childCount) {
                            break;
                        }
                        i iVar = (i) C7714v.Q(d.c(r52.c(childCount)), bVar.c());
                        if ((iVar != null ? iVar.a() : Integer.MAX_VALUE) < e15) {
                            break;
                        }
                        viewGroup.removeViewAt(childCount);
                        childCount--;
                    }
                    if (r52.isEmpty()) {
                        List<View> o12 = o(0);
                        r52.f(o12);
                        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
                            viewGroup.addOnLayoutChangeListener(new O10.b(this, o12));
                        } else {
                            int b12 = cVar.b();
                            if (this.f19845e) {
                                i11 = c(this, o12);
                            } else {
                                Iterator<T> it = o12.iterator();
                                while (it.hasNext()) {
                                    i11 += ((View) it.next()).getMeasuredHeight();
                                }
                            }
                            float f7 = i11;
                            if (b12 == -1) {
                                r52.h(f7, f7);
                            } else {
                                View view2 = (View) C7714v.Z(o12);
                                if (view2 != null) {
                                    e.a(view2);
                                    num4 = Integer.valueOf(d.c(view2));
                                }
                                if (num4 != null) {
                                    i iVar2 = (i) C7714v.Q(num4.intValue(), bVar.c());
                                    if (iVar2 != null) {
                                        int a11 = iVar2.a();
                                        if (a11 < b12) {
                                            r52.h(f7, f7);
                                        } else if (a11 == b12) {
                                            r52.h(f7, viewGroup.getMeasuredHeight() - cVar.g());
                                        }
                                    }
                                }
                            }
                        }
                        this.f19847g = true;
                    }
                }
            }
            t();
            return;
        }
        z12 = false;
        if (z12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [Q10.a, android.view.ViewGroup] */
    public final void t() {
        i iVar;
        View e11 = this.f19843c.e();
        Integer valueOf = e11 != null ? Integer.valueOf(d.c(e11)) : null;
        int intValue = (valueOf != null ? valueOf.intValue() : -1) + 1;
        P10.b bVar = this.f19844d;
        this.f19851k = (valueOf == null || (iVar = (i) C7714v.Q(valueOf.intValue(), bVar.c())) == null) ? null : Integer.valueOf(iVar.a());
        i iVar2 = (i) C7714v.Q(intValue, bVar.c());
        this.f19850j = iVar2 != null ? Integer.valueOf(iVar2.a()) : null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Q10.a, android.view.ViewGroup] */
    public final void p(boolean z11) {
        View e11;
        i iVar;
        l c11;
        l viewItem;
        if (this.f19848h) {
            return;
        }
        ?? r02 = this.f19843c;
        if (z11 || ((e11 = r02.e()) != null && (iVar = (i) C7714v.Q(d.c(e11), this.f19844d.c())) != null && (c11 = iVar.c()) != null && ((viewItem = d.d(e11).getViewItem()) == null || c11.j() != viewItem.j() || c11.d().getId() != viewItem.d().getId() || !Intrinsics.d(c11.a(), viewItem.a())))) {
            r02.a();
        }
        this.f19842b.h();
        t();
        q(false);
    }

    public final void r() {
        if (this.f19848h) {
            this.f19848h = false;
            p(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Q10.a, android.view.ViewGroup] */
    public final void s() {
        if (this.f19848h) {
            return;
        }
        this.f19843c.a();
        t();
        this.f19848h = true;
    }
}
