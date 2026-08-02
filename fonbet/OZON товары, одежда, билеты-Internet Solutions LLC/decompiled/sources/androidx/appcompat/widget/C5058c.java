package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.g0;
import java.util.ArrayList;
import m.InterfaceC7975b;
import ru.ozon.app.android.R;

/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5058c extends androidx.appcompat.view.menu.a {

    /* renamed from: j, reason: collision with root package name */
    d f37868j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f37869k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f37870l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f37871m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37872n;

    /* renamed from: o, reason: collision with root package name */
    private int f37873o;

    /* renamed from: p, reason: collision with root package name */
    private int f37874p;

    /* renamed from: q, reason: collision with root package name */
    private int f37875q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f37876r;

    /* renamed from: s, reason: collision with root package name */
    private final SparseBooleanArray f37877s;

    /* renamed from: t, reason: collision with root package name */
    e f37878t;

    /* renamed from: u, reason: collision with root package name */
    a f37879u;

    /* renamed from: v, reason: collision with root package name */
    RunnableC0716c f37880v;

    /* renamed from: w, reason: collision with root package name */
    private b f37881w;

    /* renamed from: x, reason: collision with root package name */
    final f f37882x;

    /* renamed from: y, reason: collision with root package name */
    int f37883y;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$a */
    class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.q qVar, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, qVar, false);
            if (!((androidx.appcompat.view.menu.i) qVar.getItem()).k()) {
                View view2 = C5058c.this.f37868j;
                e(view2 == null ? (View) ((androidx.appcompat.view.menu.a) C5058c.this).f37356h : view2);
            }
            i(C5058c.this.f37882x);
        }

        @Override // androidx.appcompat.view.menu.l
        protected final void d() {
            C5058c c5058c = C5058c.this;
            c5058c.f37879u = null;
            c5058c.f37883y = 0;
            super.d();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public final InterfaceC7975b a() {
            a aVar = C5058c.this.f37879u;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    class RunnableC0716c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private e f37886a;

        public RunnableC0716c(e eVar) {
            this.f37886a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5058c c5058c = C5058c.this;
            if (((androidx.appcompat.view.menu.a) c5058c).f37351c != null) {
                ((androidx.appcompat.view.menu.a) c5058c).f37351c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c5058c).f37356h;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f37886a;
                if (eVar.k()) {
                    c5058c.f37878t = eVar;
                }
            }
            c5058c.f37880v = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        final class a extends K {
            a(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.K
            public final InterfaceC7975b b() {
                e eVar = C5058c.this.f37878t;
                if (eVar == null) {
                    return null;
                }
                return eVar.b();
            }

            @Override // androidx.appcompat.widget.K
            public final boolean c() {
                C5058c.this.G();
                return true;
            }

            @Override // androidx.appcompat.widget.K
            public final boolean d() {
                C5058c c5058c = C5058c.this;
                if (c5058c.f37880v != null) {
                    return false;
                }
                c5058c.z();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            g0.a.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C5058c.this.G();
            return true;
        }

        @Override // android.widget.ImageView
        protected final boolean setFrame(int i11, int i12, int i13, int i14) {
            boolean frame = super.setFrame(i11, i12, i13, i14);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.g(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, gVar, true);
            g(8388613);
            i(C5058c.this.f37882x);
        }

        @Override // androidx.appcompat.view.menu.l
        protected final void d() {
            C5058c c5058c = C5058c.this;
            if (((androidx.appcompat.view.menu.a) c5058c).f37351c != null) {
                ((androidx.appcompat.view.menu.a) c5058c).f37351c.e(true);
            }
            c5058c.f37878t = null;
            super.d();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final void b(@NonNull androidx.appcompat.view.menu.g gVar, boolean z11) {
            if (gVar instanceof androidx.appcompat.view.menu.q) {
                gVar.q().e(false);
            }
            m.a m11 = C5058c.this.m();
            if (m11 != null) {
                m11.b(gVar, z11);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final boolean c(@NonNull androidx.appcompat.view.menu.g gVar) {
            C5058c c5058c = C5058c.this;
            if (gVar == ((androidx.appcompat.view.menu.a) c5058c).f37351c) {
                return false;
            }
            c5058c.f37883y = ((androidx.appcompat.view.menu.i) ((androidx.appcompat.view.menu.q) gVar).getItem()).getItemId();
            m.a m11 = c5058c.m();
            if (m11 != null) {
                return m11.c(gVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.appcompat.widget.c$g */
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f37892a;

        /* renamed from: androidx.appcompat.widget.c$g$a */
        final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                g gVar = new g();
                gVar.f37892a = parcel.readInt();
                return gVar;
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i11) {
                return new g[i11];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f37892a);
        }
    }

    public C5058c(Context context) {
        super(context);
        this.f37877s = new SparseBooleanArray();
        this.f37882x = new f();
    }

    public final boolean A() {
        e eVar = this.f37878t;
        return eVar != null && eVar.c();
    }

    public final void B() {
        this.f37875q = androidx.appcompat.view.a.b(this.f37350b).d();
        androidx.appcompat.view.menu.g gVar = this.f37351c;
        if (gVar != null) {
            gVar.y(true);
        }
    }

    public final void C() {
        this.f37876r = true;
    }

    public final void D(ActionMenuView actionMenuView) {
        this.f37356h = actionMenuView;
        actionMenuView.a(this.f37351c);
    }

    public final void E(Drawable drawable) {
        d dVar = this.f37868j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f37870l = true;
            this.f37869k = drawable;
        }
    }

    public final void F() {
        this.f37871m = true;
        this.f37872n = true;
    }

    public final boolean G() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f37871m || A() || (gVar = this.f37351c) == null || this.f37356h == null || this.f37880v != null || gVar.p().isEmpty()) {
            return false;
        }
        RunnableC0716c runnableC0716c = new RunnableC0716c(new e(this.f37350b, this.f37351c, this.f37868j));
        this.f37880v = runnableC0716c;
        ((View) this.f37356h).post(runnableC0716c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public final void a(androidx.appcompat.view.menu.i iVar, n.a aVar) {
        aVar.e(iVar);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.d((ActionMenuView) this.f37356h);
        if (this.f37881w == null) {
            this.f37881w = new b();
        }
        actionMenuItemView.f(this.f37881w);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.m
    public final void b(androidx.appcompat.view.menu.g gVar, boolean z11) {
        z();
        a aVar = this.f37879u;
        if (aVar != null) {
            aVar.a();
        }
        super.b(gVar, z11);
    }

    @Override // androidx.appcompat.view.menu.m
    public final Parcelable c() {
        g gVar = new g();
        gVar.f37892a = this.f37883y;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.m
    public final void e(boolean z11) {
        super.e(z11);
        ((View) this.f37356h).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f37351c;
        boolean z12 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.i> l11 = gVar.l();
            int size = l11.size();
            for (int i11 = 0; i11 < size; i11++) {
                l11.get(i11).getClass();
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f37351c;
        ArrayList<androidx.appcompat.view.menu.i> p11 = gVar2 != null ? gVar2.p() : null;
        if (this.f37871m && p11 != null) {
            int size2 = p11.size();
            if (size2 == 1) {
                z12 = !p11.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z12 = true;
            }
        }
        if (z12) {
            if (this.f37868j == null) {
                this.f37868j = new d(this.f37349a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f37868j.getParent();
            if (viewGroup != this.f37356h) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f37868j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f37356h;
                d dVar = this.f37868j;
                actionMenuView.getClass();
                ActionMenuView.c i12 = ActionMenuView.i();
                i12.f37597a = true;
                actionMenuView.addView(dVar, i12);
            }
        } else {
            d dVar2 = this.f37868j;
            if (dVar2 != null) {
                Object parent = dVar2.getParent();
                Object obj = this.f37356h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f37868j);
                }
            }
        }
        ((ActionMenuView) this.f37356h).w(this.f37871m);
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean f() {
        ArrayList<androidx.appcompat.view.menu.i> arrayList;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        androidx.appcompat.view.menu.g gVar = this.f37351c;
        View view = null;
        boolean z14 = false;
        if (gVar != null) {
            arrayList = gVar.r();
            i11 = arrayList.size();
        } else {
            arrayList = null;
            i11 = 0;
        }
        int i12 = this.f37875q;
        int i13 = this.f37874p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f37356h;
        int i14 = 0;
        boolean z15 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            z11 = true;
            if (i14 >= i11) {
                break;
            }
            androidx.appcompat.view.menu.i iVar = arrayList.get(i14);
            if (iVar.n()) {
                i15++;
            } else if (iVar.m()) {
                i16++;
            } else {
                z15 = true;
            }
            if (this.f37876r && iVar.isActionViewExpanded()) {
                i12 = 0;
            }
            i14++;
        }
        if (this.f37871m && (z15 || i16 + i15 > i12)) {
            i12--;
        }
        int i17 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = this.f37877s;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i11) {
            androidx.appcompat.view.menu.i iVar2 = arrayList.get(i18);
            if (iVar2.n()) {
                View n11 = n(iVar2, view, viewGroup);
                n11.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = n11.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z11);
                }
                iVar2.r(z11);
                z12 = z14;
                z13 = z11;
            } else if (iVar2.m()) {
                int groupId2 = iVar2.getGroupId();
                boolean z16 = sparseBooleanArray.get(groupId2);
                boolean z17 = ((i17 > 0 || z16) && i13 > 0) ? z11 : z14;
                if (z17) {
                    View n12 = n(iVar2, view, viewGroup);
                    n12.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = n12.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z17 &= i13 + i19 > 0 ? z11 : false;
                }
                boolean z18 = z17;
                if (z18 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z11);
                } else if (z16) {
                    sparseBooleanArray.put(groupId2, false);
                    int i21 = 0;
                    while (i21 < i18) {
                        androidx.appcompat.view.menu.i iVar3 = arrayList.get(i21);
                        boolean z19 = z11;
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.k()) {
                                i17++;
                            }
                            iVar3.r(false);
                        }
                        i21++;
                        z11 = z19;
                    }
                }
                z13 = z11;
                if (z18) {
                    i17--;
                }
                iVar2.r(z18);
                z12 = false;
            } else {
                z12 = z14;
                z13 = z11;
                iVar2.r(z12);
            }
            i18++;
            z14 = z12;
            z11 = z13;
            view = null;
        }
        return z11;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.m
    public final void g(@NonNull Context context, androidx.appcompat.view.menu.g gVar) {
        super.g(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b11 = androidx.appcompat.view.a.b(context);
        if (!this.f37872n) {
            this.f37871m = true;
        }
        this.f37873o = b11.c();
        this.f37875q = b11.d();
        int i11 = this.f37873o;
        if (this.f37871m) {
            if (this.f37868j == null) {
                d dVar = new d(this.f37349a);
                this.f37868j = dVar;
                if (this.f37870l) {
                    dVar.setImageDrawable(this.f37869k);
                    this.f37869k = null;
                    this.f37870l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f37868j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i11 -= this.f37868j.getMeasuredWidth();
        } else {
            this.f37868j = null;
        }
        this.f37874p = i11;
        float f7 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.a
    public final boolean h(int i11, ViewGroup viewGroup) {
        if (viewGroup.getChildAt(i11) == this.f37868j) {
            return false;
        }
        viewGroup.removeViewAt(i11);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void k(Parcelable parcelable) {
        int i11;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i11 = ((g) parcelable).f37892a) > 0 && (findItem = this.f37351c.findItem(i11)) != null) {
            l((androidx.appcompat.view.menu.q) findItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.m
    public final boolean l(androidx.appcompat.view.menu.q qVar) {
        boolean z11 = false;
        if (qVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.q qVar2 = qVar;
            while (qVar2.R() != this.f37351c) {
                qVar2 = (androidx.appcompat.view.menu.q) qVar2.R();
            }
            MenuItem item = qVar2.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f37356h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i11);
                    if ((childAt instanceof n.a) && ((n.a) childAt).g() == item) {
                        view = childAt;
                        break;
                    }
                    i11++;
                }
            }
            if (view != null) {
                this.f37883y = ((androidx.appcompat.view.menu.i) qVar.getItem()).getItemId();
                int size = qVar.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    MenuItem item2 = qVar.getItem(i12);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z11 = true;
                        break;
                    }
                    i12++;
                }
                a aVar = new a(this.f37350b, qVar, view);
                this.f37879u = aVar;
                aVar.f(z11);
                if (!this.f37879u.k()) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                super.l(qVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.a
    public final View n(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.i()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.c)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public final androidx.appcompat.view.menu.n o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f37356h;
        androidx.appcompat.view.menu.n o11 = super.o(viewGroup);
        if (nVar != o11) {
            ((ActionMenuView) o11).y(this);
        }
        return o11;
    }

    @Override // androidx.appcompat.view.menu.a
    public final boolean q(androidx.appcompat.view.menu.i iVar) {
        return iVar.k();
    }

    public final Drawable y() {
        d dVar = this.f37868j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f37870l) {
            return this.f37869k;
        }
        return null;
    }

    public final boolean z() {
        Object obj;
        RunnableC0716c runnableC0716c = this.f37880v;
        if (runnableC0716c != null && (obj = this.f37356h) != null) {
            ((View) obj).removeCallbacks(runnableC0716c);
            this.f37880v = null;
            return true;
        }
        e eVar = this.f37878t;
        if (eVar == null) {
            return false;
        }
        eVar.a();
        return true;
    }
}
