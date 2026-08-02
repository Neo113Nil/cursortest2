package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import l.InterfaceC1365c;
import m.SubMenuC1416D;

/* loaded from: classes.dex */
public final class d1 implements m.x {

    /* renamed from: a, reason: collision with root package name */
    public m.k f8612a;

    /* renamed from: b, reason: collision with root package name */
    public m.m f8613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f8614c;

    public d1(Toolbar toolbar) {
        this.f8614c = toolbar;
    }

    @Override // m.x
    public final void c(Context context, m.k kVar) {
        m.m mVar;
        m.k kVar2 = this.f8612a;
        if (kVar2 != null && (mVar = this.f8613b) != null) {
            kVar2.d(mVar);
        }
        this.f8612a = kVar;
    }

    @Override // m.x
    public final boolean d() {
        return false;
    }

    @Override // m.x
    public final void f() {
        if (this.f8613b != null) {
            m.k kVar = this.f8612a;
            if (kVar != null) {
                int size = kVar.f15143f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f8612a.getItem(i7) == this.f8613b) {
                        return;
                    }
                }
            }
            j(this.f8613b);
        }
    }

    @Override // m.x
    public final boolean g(m.m mVar) {
        Toolbar toolbar = this.f8614c;
        toolbar.c();
        ViewParent parent = toolbar.f8552y.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f8552y);
            }
            toolbar.addView(toolbar.f8552y);
        }
        View actionView = mVar.getActionView();
        toolbar.f8553z = actionView;
        this.f8613b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f8553z);
            }
            e1 h6 = Toolbar.h();
            h6.f8617a = (toolbar.f8513E & 112) | 8388611;
            h6.f8618b = 2;
            toolbar.f8553z.setLayoutParams(h6);
            toolbar.addView(toolbar.f8553z);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((e1) childAt.getLayoutParams()).f8618b != 2 && childAt != toolbar.f8532a) {
                toolbar.removeViewAt(childCount);
                toolbar.f8530V.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.f15169T = true;
        mVar.f15154E.p(false);
        KeyEvent.Callback callback = toolbar.f8553z;
        if (callback instanceof InterfaceC1365c) {
            ((InterfaceC1365c) callback).c();
        }
        toolbar.w();
        return true;
    }

    @Override // m.x
    public final boolean i(SubMenuC1416D subMenuC1416D) {
        return false;
    }

    @Override // m.x
    public final boolean j(m.m mVar) {
        Toolbar toolbar = this.f8614c;
        KeyEvent.Callback callback = toolbar.f8553z;
        if (callback instanceof InterfaceC1365c) {
            ((InterfaceC1365c) callback).d();
        }
        toolbar.removeView(toolbar.f8553z);
        toolbar.removeView(toolbar.f8552y);
        toolbar.f8553z = null;
        ArrayList arrayList = toolbar.f8530V;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f8613b = null;
        toolbar.requestLayout();
        mVar.f15169T = false;
        mVar.f15154E.p(false);
        toolbar.w();
        return true;
    }

    @Override // m.x
    public final void a(m.k kVar, boolean z4) {
    }
}
