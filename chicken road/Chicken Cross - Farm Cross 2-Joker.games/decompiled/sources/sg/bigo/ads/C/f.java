package sg.bigo.ads.C;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import sg.bigo.ads.api.NativeAdView;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static int f12227a = 5;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((r0 instanceof java.lang.Integer) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(View view, View view2, View view3, int i, int i2, int i3, int i4, int i5, sg.bigo.ads.d1.u uVar, Object obj) {
        Object obj2 = obj;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        for (View view4 = view2; (view4.getParent() instanceof ViewGroup) && view4 != view && !(view4 instanceof NativeAdView); view4 = (View) view4.getParent()) {
            i6 += view4.getLeft();
            i8 += view4.getLeft();
            i7 += view4.getTop();
            i9 += view4.getTop();
        }
        obj2 = view3.getTag();
        uVar.a(i6, i7, i8, i9, i5, obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0);
    }

    public static l a(sg.bigo.ads.P.j jVar) {
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) jVar.f12482a;
        int i = bVar.Y;
        int i2 = bVar.k;
        int i3 = bVar.l;
        sg.bigo.ads.T0.q qVar = bVar.I;
        if (qVar != null && 2 == i) {
            boolean z = i3 == 3 || i3 == 4;
            boolean z2 = i2 == 1 || i2 == 2;
            if (z && z2) {
                Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("multi_ads.multi_ads_type"));
                int intValue = a2 != null ? a2.intValue() : 0;
                if (3 == intValue || 2 == intValue) {
                    return new sg.bigo.ads.E.d(jVar, intValue);
                }
            }
        }
        if (i3 != 12 && i3 != 20 && i3 != 1) {
            if (i3 == 2) {
                if (i2 == 1) {
                    return new sg.bigo.ads.D.a(jVar);
                }
                if (i2 == 2) {
                    return new sg.bigo.ads.D.g(jVar);
                }
                return null;
            }
            if (i3 != 3 && i3 != 4) {
                switch (i3) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        if (i2 == 5) {
                            return new sg.bigo.ads.D.h(jVar);
                        }
                        return null;
                    default:
                        if (i2 == 1) {
                            return new l(jVar);
                        }
                        if (i2 == 2) {
                            return new t(jVar);
                        }
                        if (i2 != 5) {
                            return null;
                        }
                        return new sg.bigo.ads.D.h(jVar);
                }
            }
        }
        if (i2 == 1) {
            return new sg.bigo.ads.D.i(jVar);
        }
        if (i2 == 2) {
            return new sg.bigo.ads.D.k(jVar);
        }
        return null;
    }

    public static void a(View view, Integer num) {
        if (view != null) {
            view.setTag(num);
            view.setTag(1662622472, "internal_ad_component_view");
        }
    }

    public static void a(View view, View view2, int i, sg.bigo.ads.d1.u uVar, int i2) {
        if (uVar == null) {
            view2.setOnTouchListener(null);
            return;
        }
        if (i2 == 2) {
            view2.setOnTouchListener(new ViewOnTouchListenerC4942a(view, view2, new c(new int[]{0, 0}, view2, view, i, uVar)));
        } else if (i2 == 3) {
            a(view, view2, i, uVar, (e) null);
        } else {
            view2.setOnTouchListener(new ViewOnTouchListenerC4942a(view, view2, new ViewOnTouchListenerC4943b(new int[]{0, 0}, view, view2, i, uVar)));
        }
    }

    public static void a(View view, View view2, int i, sg.bigo.ads.d1.u uVar, e eVar) {
        view2.setOnTouchListener(new ViewOnTouchListenerC4942a(view, view2, new d(new int[]{0, 0}, new boolean[]{true}, view2, ViewConfiguration.get(view.getContext()).getScaledTouchSlop(), eVar, view, i, uVar)));
    }
}
