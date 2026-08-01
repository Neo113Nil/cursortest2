package sg.bigo.ads.h;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class T0 {
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    public float k;
    public float l;
    public View m;
    public View n;
    public View o;
    public Y0 p;

    /* renamed from: a, reason: collision with root package name */
    public int f12855a = 0;
    public final HashMap q = new HashMap();
    public final Q0 r = new Q0();

    public static sg.bigo.ads.d1.u a(T0 t0, sg.bigo.ads.C.l lVar, sg.bigo.ads.d1.u uVar) {
        t0.getClass();
        return uVar == lVar ? new S0(t0, lVar) : uVar;
    }

    public final void a(View view, float f, float f2, int i, int[] iArr, ArrayList arrayList) {
        if (i > 10) {
            return;
        }
        int i2 = i + 1;
        if (view == null) {
            return;
        }
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        if (f > i3 && f < view.getWidth() + i3 && f2 > i4 && f2 < view.getHeight() + i4 && (view.getTag() instanceof Integer) && this.q.containsKey(view)) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                a(viewGroup.getChildAt(i5), f, f2, i2, iArr, arrayList);
            }
        }
    }

    public final void a(sg.bigo.ads.C.l lVar, View view, View view2, int i, sg.bigo.ads.d1.u uVar) {
        view.getTag();
        view.setTag(R.id.content, "TouchView");
        view2.setTag(Integer.valueOf(i));
        if (uVar != null) {
            this.q.put(view2, uVar);
        }
        int i2 = this.f12855a;
        if (uVar == null) {
            view2.setOnTouchListener(null);
        } else {
            view.setOnTouchListener(new R0(this, view, i2, ViewConfiguration.get(view.getContext()).getScaledTouchSlop(), lVar));
        }
    }
}
