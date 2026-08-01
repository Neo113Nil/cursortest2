package sg.bigo.ads.k1;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f13031a;

    public c0(d0 d0Var) {
        this.f13031a = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        float f2;
        d0 d0Var;
        InterfaceC5269j interfaceC5269j;
        InterfaceC5267h interfaceC5267h;
        boolean z4;
        boolean z5;
        boolean z6;
        View view2;
        d0 d0Var2 = this.f13031a;
        d0Var2.f = false;
        if (d0Var2.d == null || (view = (View) d0Var2.f13033a.get()) == null) {
            return;
        }
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        boolean isShown = view.isShown();
        float f3 = 0.0f;
        boolean z7 = true;
        boolean z8 = view.getAlpha() == 0.0f;
        new ArrayList();
        if (globalVisibleRect && isShown && !z8) {
            this.f13031a.getClass();
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroup = (ViewGroup) view.getRootView();
            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            View view3 = view;
            boolean z9 = z8;
            while (true) {
                if (viewGroup2 == null) {
                    z = isShown;
                    z4 = z9;
                    z7 = false;
                    break;
                }
                if (viewGroup2.getAlpha() == f3) {
                    z = isShown;
                    z4 = z9;
                    break;
                }
                int indexOfChild = viewGroup2.indexOfChild(view3) + (z7 ? 1 : 0);
                boolean z10 = z9;
                while (indexOfChild < viewGroup2.getChildCount()) {
                    View childAt = viewGroup2.getChildAt(indexOfChild);
                    if (childAt.getVisibility() == 0) {
                        Rect rect3 = new Rect();
                        childAt.getGlobalVisibleRect(rect3);
                        if (Rect.intersects(rect2, rect3)) {
                            view2 = view3;
                            z6 = z10;
                            z5 = isShown;
                            arrayList.add(new Rect(Math.max(rect2.left, rect3.left), Math.max(rect2.top, rect3.top), Math.min(rect2.right, rect3.right), Math.min(rect2.bottom, rect3.bottom)));
                            indexOfChild++;
                            view3 = view2;
                            z10 = z6;
                            isShown = z5;
                        }
                    }
                    z5 = isShown;
                    z6 = z10;
                    view2 = view3;
                    indexOfChild++;
                    view3 = view2;
                    z10 = z6;
                    isShown = z5;
                }
                boolean z11 = isShown;
                boolean z12 = z10;
                View view4 = view3;
                if (viewGroup2 != viewGroup) {
                    view3 = viewGroup2;
                    viewGroup2 = (ViewGroup) viewGroup2.getParent();
                } else {
                    viewGroup2 = null;
                    view3 = view4;
                }
                z9 = z12;
                isShown = z11;
                f3 = 0.0f;
                z7 = true;
            }
            Pair pair = new Pair(Boolean.valueOf(z7), arrayList);
            if (((Boolean) pair.first).booleanValue()) {
                f = 0.0f;
                z2 = z4;
            } else {
                Iterator it = new Y((List) pair.second, iArr).f13026a.iterator();
                while (it.hasNext()) {
                    Rect rect4 = (Rect) it.next();
                    rect4.width();
                    rect4.height();
                }
                float height = view.getHeight() * view.getWidth();
                float height2 = rect.height() * rect.width();
                f = 0.0f;
                z2 = z4;
                if (height > 0.0f) {
                    f2 = (height2 * 100.0f) / height;
                    z3 = z4;
                    d0Var = this.f13031a;
                    if (f2 == d0Var.g || !rect.equals(d0Var.h)) {
                        d0 d0Var3 = this.f13031a;
                        d0Var3.getClass();
                        d0Var3.g = f2;
                        this.f13031a.h = rect;
                        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                        this.f13031a.getClass();
                        d0 d0Var4 = this.f13031a;
                        C5268i c5268i = d0Var4.d;
                        boolean z13 = (globalVisibleRect || !z || z3) ? false : true;
                        float f4 = d0Var4.g;
                        Rect rect5 = d0Var4.h;
                        int i = displayMetrics.densityDpi;
                        C5261b c5261b = new C5261b(f4, new Rect((rect5.left * 160) / i, (rect5.top * 160) / i, (rect5.right * 160) / i, (rect5.bottom * 160) / i));
                        c5268i.f13037a.setMraidViewable(z13);
                        interfaceC5269j = c5268i.f13037a.h;
                        if (interfaceC5269j != null || (interfaceC5267h = ((C5264e) interfaceC5269j).f13034a.c) == null) {
                        }
                        interfaceC5267h.a(c5261b);
                        return;
                    }
                    return;
                }
            }
        } else {
            z = isShown;
            z2 = z8;
            f = 0.0f;
        }
        f2 = f;
        z3 = z2;
        d0Var = this.f13031a;
        if (f2 == d0Var.g) {
        }
        d0 d0Var32 = this.f13031a;
        d0Var32.getClass();
        d0Var32.g = f2;
        this.f13031a.h = rect;
        DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
        this.f13031a.getClass();
        d0 d0Var42 = this.f13031a;
        C5268i c5268i2 = d0Var42.d;
        if (globalVisibleRect) {
        }
        float f42 = d0Var42.g;
        Rect rect52 = d0Var42.h;
        int i2 = displayMetrics2.densityDpi;
        C5261b c5261b2 = new C5261b(f42, new Rect((rect52.left * 160) / i2, (rect52.top * 160) / i2, (rect52.right * 160) / i2, (rect52.bottom * 160) / i2));
        c5268i2.f13037a.setMraidViewable(z13);
        interfaceC5269j = c5268i2.f13037a.h;
        if (interfaceC5269j != null) {
        }
    }
}
