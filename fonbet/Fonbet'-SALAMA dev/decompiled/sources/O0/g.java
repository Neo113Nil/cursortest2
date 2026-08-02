package O0;

import P.U;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import w1.C1718l0;

/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: N, reason: collision with root package name */
    public static final String[] f4845N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: O, reason: collision with root package name */
    public static final c f4846O;

    /* renamed from: P, reason: collision with root package name */
    public static final c f4847P;

    /* renamed from: Q, reason: collision with root package name */
    public static final c f4848Q;

    /* renamed from: R, reason: collision with root package name */
    public static final c f4849R;

    /* renamed from: S, reason: collision with root package name */
    public static final c f4850S;

    static {
        new b(PointF.class, "boundsOrigin").f4834a = new Rect();
        f4846O = new c(PointF.class, "topLeft", 0);
        f4847P = new c(PointF.class, "bottomRight", 1);
        f4848Q = new c(PointF.class, "bottomRight", 2);
        f4849R = new c(PointF.class, "topLeft", 3);
        f4850S = new c(PointF.class, "position", 4);
    }

    public static void G(s sVar) {
        View view = sVar.f4895b;
        WeakHashMap weakHashMap = U.f5037a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = sVar.f4894a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", sVar.f4895b.getParent());
    }

    @Override // O0.m
    public final void d(s sVar) {
        G(sVar);
    }

    @Override // O0.m
    public final void g(s sVar) {
        G(sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O0.m
    public final Animator k(ViewGroup viewGroup, s sVar, s sVar2) {
        int i7;
        g gVar;
        ObjectAnimator ofObject;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        HashMap hashMap = sVar.f4894a;
        HashMap hashMap2 = sVar2.f4894a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i8 = rect.left;
        int i9 = rect2.left;
        int i10 = rect.top;
        int i11 = rect2.top;
        int i12 = rect.right;
        int i13 = rect2.right;
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        int i16 = i12 - i8;
        int i17 = i14 - i10;
        int i18 = i13 - i9;
        int i19 = i15 - i11;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i16 == 0 || i17 == 0) && (i18 == 0 || i19 == 0)) {
            i7 = 0;
        } else {
            i7 = (i8 == i9 && i10 == i11) ? 0 : 1;
            if (i12 != i13 || i14 != i15) {
                i7++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i7++;
        }
        if (i7 <= 0) {
            return null;
        }
        View view = sVar2.f4895b;
        t.a(view, i8, i10, i12, i14);
        if (i7 != 2) {
            gVar = this;
            if (i8 == i9 && i10 == i11) {
                gVar.f4875J.getClass();
                ofObject = ObjectAnimator.ofObject(view, f4848Q, (TypeConverter) null, C1718l0.j(i12, i14, i13, i15));
            } else {
                gVar.f4875J.getClass();
                ofObject = ObjectAnimator.ofObject(view, f4849R, (TypeConverter) null, C1718l0.j(i8, i10, i9, i11));
            }
        } else if (i16 == i18 && i17 == i19) {
            gVar = this;
            gVar.f4875J.getClass();
            ofObject = ObjectAnimator.ofObject(view, f4850S, (TypeConverter) null, C1718l0.j(i8, i10, i9, i11));
        } else {
            gVar = this;
            f fVar = new f();
            fVar.f4842e = view;
            gVar.f4875J.getClass();
            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(fVar, f4846O, (TypeConverter) null, C1718l0.j(i8, i10, i9, i11));
            gVar.f4875J.getClass();
            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(fVar, f4847P, (TypeConverter) null, C1718l0.j(i12, i14, i13, i15));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject2, ofObject3);
            animatorSet.addListener(new d(fVar));
            ofObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            P6.b.N(viewGroup4, true);
            gVar.a(new e(viewGroup4));
        }
        return ofObject;
    }

    @Override // O0.m
    public final String[] p() {
        return f4845N;
    }
}
