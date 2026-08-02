package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.C5058c;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes8.dex */
public class ActionMenuView extends LinearLayoutCompat implements g.b, androidx.appcompat.view.menu.n {

    /* renamed from: e, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f37585e;

    /* renamed from: f, reason: collision with root package name */
    private Context f37586f;

    /* renamed from: g, reason: collision with root package name */
    private int f37587g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37588h;

    /* renamed from: i, reason: collision with root package name */
    private C5058c f37589i;

    /* renamed from: j, reason: collision with root package name */
    private m.a f37590j;

    /* renamed from: k, reason: collision with root package name */
    g.a f37591k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f37592l;

    /* renamed from: m, reason: collision with root package name */
    private int f37593m;

    /* renamed from: n, reason: collision with root package name */
    private int f37594n;

    /* renamed from: o, reason: collision with root package name */
    private int f37595o;

    /* renamed from: p, reason: collision with root package name */
    e f37596p;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements m.a {
        @Override // androidx.appcompat.view.menu.m.a
        public final void b(@NonNull androidx.appcompat.view.menu.g gVar, boolean z11) {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final boolean c(@NonNull androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.a {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f37597a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f37598b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f37599c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f37600d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f37601e;

        /* renamed from: f, reason: collision with root package name */
        boolean f37602f;
    }

    private class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public final void a(@NonNull androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.f37591k;
            if (aVar != null) {
                aVar.a(gVar);
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull androidx.appcompat.view.menu.i iVar) {
            boolean a11;
            e eVar = ActionMenuView.this.f37596p;
            if (eVar != null) {
                Toolbar toolbar = Toolbar.this;
                if (toolbar.mMenuHostHelper.g(iVar)) {
                    a11 = true;
                } else {
                    Toolbar.h hVar = toolbar.mOnMenuItemClickListener;
                    a11 = hVar != null ? hVar.a(iVar) : false;
                }
                if (a11) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    protected static c i() {
        c cVar = new c(-2, -2);
        cVar.f37597a = false;
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    protected static c j(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof c) {
            c cVar2 = (c) layoutParams;
            cVar = new c(cVar2);
            cVar.f37597a = cVar2.f37597a;
        } else {
            cVar = new c(layoutParams);
        }
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void a(androidx.appcompat.view.menu.g gVar) {
        this.f37585e = gVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.g.b
    public final boolean f(androidx.appcompat.view.menu.i iVar) {
        return this.f37585e.z(iVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final void h() {
        C5058c c5058c = this.f37589i;
        if (c5058c != null) {
            c5058c.z();
            C5058c.a aVar = c5058c.f37879u;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final Menu k() {
        if (this.f37585e == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.f37585e = gVar;
            gVar.F(new d());
            C5058c c5058c = new C5058c(context);
            this.f37589i = c5058c;
            c5058c.F();
            C5058c c5058c2 = this.f37589i;
            m.a aVar = this.f37590j;
            if (aVar == null) {
                aVar = new b();
            }
            c5058c2.i(aVar);
            this.f37585e.c(this.f37589i, this.f37586f);
            this.f37589i.D(this);
        }
        return this.f37585e;
    }

    public final Drawable l() {
        k();
        return this.f37589i.y();
    }

    protected final boolean m(int i11) {
        boolean z11 = false;
        if (i11 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i11 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i11);
        if (i11 < getChildCount() && (childAt instanceof a)) {
            z11 = ((a) childAt).a();
        }
        return (i11 <= 0 || !(childAt2 instanceof a)) ? z11 : ((a) childAt2).b() | z11;
    }

    public final boolean n() {
        C5058c c5058c = this.f37589i;
        return c5058c != null && c5058c.z();
    }

    public final boolean o() {
        C5058c c5058c = this.f37589i;
        if (c5058c != null) {
            return c5058c.f37880v != null || c5058c.A();
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5058c c5058c = this.f37589i;
        if (c5058c != null) {
            c5058c.e(false);
            if (this.f37589i.A()) {
                this.f37589i.z();
                this.f37589i.G();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int width;
        int i15;
        if (!this.f37592l) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i14 - i12) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i13 - i11;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        int i18 = i0.f37951d;
        boolean z12 = getLayoutDirection() == 1;
        int i19 = 0;
        int i21 = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f37597a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i22)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z12) {
                        i15 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i15 = width - measuredWidth;
                    }
                    int i23 = i16 - (measuredHeight / 2);
                    childAt.layout(i15, i23, width, measuredHeight + i23);
                    paddingRight -= measuredWidth;
                    i19 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    m(i22);
                    i21++;
                }
            }
        }
        if (childCount == 1 && i19 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i24 = (i17 / 2) - (measuredWidth2 / 2);
            int i25 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i24, i25, measuredWidth2 + i24, measuredHeight2 + i25);
            return;
        }
        int i26 = i21 - (i19 ^ 1);
        int max = Math.max(0, i26 > 0 ? paddingRight / i26 : 0);
        if (z12) {
            int width2 = getWidth() - getPaddingRight();
            for (int i27 = 0; i27 < childCount; i27++) {
                View childAt3 = getChildAt(i27);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f37597a) {
                    int i28 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i29 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i28 - measuredWidth3, i29, i28, measuredHeight3 + i29);
                    width2 = i28 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i31 = 0; i31 < childCount; i31++) {
            View childAt4 = getChildAt(i31);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f37597a) {
                int i32 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i33 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i32, i33, i32 + measuredWidth4, measuredHeight4 + i33);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max + i32;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        ?? r11;
        int i15;
        int i16;
        androidx.appcompat.view.menu.g gVar;
        boolean z11 = this.f37592l;
        boolean z12 = View.MeasureSpec.getMode(i11) == 1073741824;
        this.f37592l = z12;
        if (z11 != z12) {
            this.f37593m = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (this.f37592l && (gVar = this.f37585e) != null && size != this.f37593m) {
            this.f37593m = size;
            gVar.y(true);
        }
        int childCount = getChildCount();
        if (!this.f37592l || childCount <= 0) {
            for (int i17 = 0; i17 < childCount; i17++) {
                c cVar = (c) getChildAt(i17).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i11, i12);
            return;
        }
        int mode = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i11);
        int size3 = View.MeasureSpec.getSize(i12);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingBottom, -2);
        int i18 = size2 - paddingRight;
        int i19 = this.f37594n;
        int i21 = i18 / i19;
        int i22 = i18 % i19;
        if (i21 == 0) {
            setMeasuredDimension(i18, 0);
            return;
        }
        int i23 = (i22 / i21) + i19;
        int childCount2 = getChildCount();
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z13 = false;
        int i28 = 0;
        long j11 = 0;
        while (true) {
            i13 = this.f37595o;
            if (i27 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i27);
            int i29 = size3;
            int i31 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i15 = i23;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                i25++;
                if (z14) {
                    childAt.setPadding(i13, 0, i13, 0);
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f37602f = false;
                cVar2.f37599c = 0;
                cVar2.f37598b = 0;
                cVar2.f37600d = false;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = 0;
                cVar2.f37601e = z14 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i32 = cVar2.f37597a ? 1 : i21;
                c cVar3 = (c) childAt.getLayoutParams();
                int i33 = i21;
                i15 = i23;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i31, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z14 ? (ActionMenuItemView) childAt : null;
                boolean z15 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z16 = z15;
                if (i32 <= 0 || (z15 && i32 < 2)) {
                    i16 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i32, LinearLayoutManager.INVALID_OFFSET), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i16 = measuredWidth / i15;
                    if (measuredWidth % i15 != 0) {
                        i16++;
                    }
                    if (z16 && i16 < 2) {
                        i16 = 2;
                    }
                }
                cVar3.f37600d = !cVar3.f37597a && z16;
                cVar3.f37598b = i16;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i15, 1073741824), makeMeasureSpec);
                i26 = Math.max(i26, i16);
                if (cVar2.f37600d) {
                    i28++;
                }
                if (cVar2.f37597a) {
                    z13 = true;
                }
                i21 = i33 - i16;
                i24 = Math.max(i24, childAt.getMeasuredHeight());
                if (i16 == 1) {
                    j11 |= 1 << i27;
                }
            }
            i27++;
            size3 = i29;
            paddingBottom = i31;
            i23 = i15;
        }
        int i34 = size3;
        int i35 = i21;
        int i36 = i23;
        boolean z17 = z13 && i25 == 2;
        int i37 = i35;
        boolean z18 = false;
        while (i28 > 0 && i37 > 0) {
            int i38 = Integer.MAX_VALUE;
            long j12 = 0;
            int i39 = 0;
            int i41 = 0;
            while (i41 < childCount2) {
                boolean z19 = z17;
                c cVar4 = (c) getChildAt(i41).getLayoutParams();
                int i42 = i24;
                if (cVar4.f37600d) {
                    int i43 = cVar4.f37598b;
                    if (i43 < i38) {
                        j12 = 1 << i41;
                        i38 = i43;
                        i39 = 1;
                    } else if (i43 == i38) {
                        j12 |= 1 << i41;
                        i39++;
                    }
                }
                i41++;
                i24 = i42;
                z17 = z19;
            }
            boolean z21 = z17;
            i14 = i24;
            j11 |= j12;
            if (i39 > i37) {
                break;
            }
            int i44 = i38 + 1;
            int i45 = 0;
            while (i45 < childCount2) {
                View childAt2 = getChildAt(i45);
                c cVar5 = (c) childAt2.getLayoutParams();
                boolean z22 = z13;
                long j13 = 1 << i45;
                if ((j12 & j13) != 0) {
                    if (z21 && cVar5.f37601e) {
                        r11 = 1;
                        r11 = 1;
                        if (i37 == 1) {
                            childAt2.setPadding(i13 + i36, 0, i13, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    cVar5.f37598b += r11;
                    cVar5.f37602f = r11;
                    i37--;
                } else if (cVar5.f37598b == i44) {
                    j11 |= j13;
                }
                i45++;
                z13 = z22;
            }
            i24 = i14;
            z17 = z21;
            z18 = true;
        }
        i14 = i24;
        boolean z23 = !z13 && i25 == 1;
        if (i37 > 0 && j11 != 0 && (i37 < i25 - 1 || z23 || i26 > 1)) {
            float bitCount = Long.bitCount(j11);
            if (!z23) {
                if ((j11 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f37601e) {
                    bitCount -= 0.5f;
                }
                int i46 = childCount2 - 1;
                if ((j11 & (1 << i46)) != 0 && !((c) getChildAt(i46).getLayoutParams()).f37601e) {
                    bitCount -= 0.5f;
                }
            }
            int i47 = bitCount > 0.0f ? (int) ((i37 * i36) / bitCount) : 0;
            boolean z24 = z18;
            for (int i48 = 0; i48 < childCount2; i48++) {
                if ((j11 & (1 << i48)) != 0) {
                    View childAt3 = getChildAt(i48);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f37599c = i47;
                        cVar6.f37602f = true;
                        if (i48 == 0 && !cVar6.f37601e) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = (-i47) / 2;
                        }
                        z24 = true;
                    } else if (cVar6.f37597a) {
                        cVar6.f37599c = i47;
                        cVar6.f37602f = true;
                        ((LinearLayout.LayoutParams) cVar6).rightMargin = (-i47) / 2;
                        z24 = true;
                    } else {
                        if (i48 != 0) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = i47 / 2;
                        }
                        if (i48 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) cVar6).rightMargin = i47 / 2;
                        }
                    }
                }
            }
            z18 = z24;
        }
        if (z18) {
            for (int i49 = 0; i49 < childCount2; i49++) {
                View childAt4 = getChildAt(i49);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f37602f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f37598b * i36) + cVar7.f37599c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i18, mode != 1073741824 ? i14 : i34);
    }

    public final boolean p() {
        C5058c c5058c = this.f37589i;
        return c5058c != null && c5058c.A();
    }

    public final boolean q() {
        return this.f37588h;
    }

    public final androidx.appcompat.view.menu.g r() {
        return this.f37585e;
    }

    public final void s() {
        this.f37589i.C();
    }

    public final void t(m.a aVar, g.a aVar2) {
        this.f37590j = aVar;
        this.f37591k = aVar2;
    }

    public final void u(e eVar) {
        this.f37596p = eVar;
    }

    public final void v(Drawable drawable) {
        k();
        this.f37589i.E(drawable);
    }

    public final void w(boolean z11) {
        this.f37588h = z11;
    }

    public final void x(int i11) {
        if (this.f37587g != i11) {
            this.f37587g = i11;
            if (i11 == 0) {
                this.f37586f = getContext();
            } else {
                this.f37586f = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public final void y(C5058c c5058c) {
        this.f37589i = c5058c;
        c5058c.D(this);
    }

    public final boolean z() {
        C5058c c5058c = this.f37589i;
        return c5058c != null && c5058c.G();
    }

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f37594n = (int) (56.0f * f7);
        this.f37595o = (int) (f7 * 4.0f);
        this.f37586f = context;
        this.f37587g = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateDefaultLayoutParams() {
        return i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final LinearLayoutCompat.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
