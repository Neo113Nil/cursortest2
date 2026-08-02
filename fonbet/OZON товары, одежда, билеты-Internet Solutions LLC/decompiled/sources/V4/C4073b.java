package V4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import java.util.HashMap;

/* renamed from: V4.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C4073b extends l {
    private static final String[] sTransitionProperties = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> DRAWABLE_ORIGIN_PROPERTY = new C0571b();
    private static final Property<k, PointF> TOP_LEFT_PROPERTY = new c(PointF.class, "topLeft");
    private static final Property<k, PointF> BOTTOM_RIGHT_PROPERTY = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> POSITION_PROPERTY = new g(PointF.class, "position");
    private static V4.j sRectEvaluator = new V4.j();
    private int[] mTempLocation = new int[2];
    private boolean mResizeClip = false;
    private boolean mReparent = false;

    /* renamed from: V4.b$a */
    final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28003a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f28004b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f28005c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f28006d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f7) {
            this.f28003a = viewGroup;
            this.f28004b = bitmapDrawable;
            this.f28005c = view;
            this.f28006d = f7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Property<View, Float> property = y.f28073b;
            new x(this.f28003a).b(this.f28004b);
            y.e(this.f28005c, this.f28006d);
        }
    }

    /* renamed from: V4.b$b, reason: collision with other inner class name */
    final class C0571b extends Property<Drawable, PointF> {

        /* renamed from: a, reason: collision with root package name */
        private Rect f28007a;

        C0571b() {
            super(PointF.class, "boundsOrigin");
            this.f28007a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            drawable.copyBounds(this.f28007a);
            return new PointF(r0.left, r0.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f28007a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* renamed from: V4.b$c */
    final class c extends Property<k, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(k kVar, PointF pointF) {
            kVar.b(pointF);
        }
    }

    /* renamed from: V4.b$d */
    final class d extends Property<k, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* renamed from: V4.b$e */
    final class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            y.d(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* renamed from: V4.b$f */
    final class f extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            y.d(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* renamed from: V4.b$g */
    final class g extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            y.d(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* renamed from: V4.b$h */
    final class h extends AnimatorListenerAdapter {
        private k mViewBounds;

        h(k kVar) {
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: V4.b$i */
    final class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f28008a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f28009b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f28010c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28011d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f28012e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f28013f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f28014g;

        i(View view, Rect rect, int i11, int i12, int i13, int i14) {
            this.f28009b = view;
            this.f28010c = rect;
            this.f28011d = i11;
            this.f28012e = i12;
            this.f28013f = i13;
            this.f28014g = i14;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f28008a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f28008a) {
                return;
            }
            int i11 = Y.f42258g;
            Rect rect = this.f28010c;
            View view = this.f28009b;
            view.setClipBounds(rect);
            y.d(view, this.f28011d, this.f28012e, this.f28013f, this.f28014g);
        }
    }

    /* renamed from: V4.b$j */
    final class j extends m {

        /* renamed from: a, reason: collision with root package name */
        boolean f28015a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28016b;

        j(ViewGroup viewGroup) {
            this.f28016b = viewGroup;
        }

        @Override // V4.m, V4.l.f
        public final void onTransitionCancel(@NonNull l lVar) {
            w.a(this.f28016b, false);
            this.f28015a = true;
        }

        @Override // V4.l.f
        public final void onTransitionEnd(@NonNull l lVar) {
            if (!this.f28015a) {
                w.a(this.f28016b, false);
            }
            lVar.removeListener(this);
        }

        @Override // V4.m, V4.l.f
        public final void onTransitionPause(@NonNull l lVar) {
            w.a(this.f28016b, false);
        }

        @Override // V4.m, V4.l.f
        public final void onTransitionResume(@NonNull l lVar) {
            w.a(this.f28016b, true);
        }
    }

    /* renamed from: V4.b$k */
    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f28017a;

        /* renamed from: b, reason: collision with root package name */
        private int f28018b;

        /* renamed from: c, reason: collision with root package name */
        private int f28019c;

        /* renamed from: d, reason: collision with root package name */
        private int f28020d;

        /* renamed from: e, reason: collision with root package name */
        private View f28021e;

        /* renamed from: f, reason: collision with root package name */
        private int f28022f;

        /* renamed from: g, reason: collision with root package name */
        private int f28023g;

        k(View view) {
            this.f28021e = view;
        }

        final void a(PointF pointF) {
            this.f28019c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            this.f28020d = round;
            int i11 = this.f28023g + 1;
            this.f28023g = i11;
            if (this.f28022f == i11) {
                y.d(this.f28021e, this.f28017a, this.f28018b, this.f28019c, round);
                this.f28022f = 0;
                this.f28023g = 0;
            }
        }

        final void b(PointF pointF) {
            this.f28017a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            this.f28018b = round;
            int i11 = this.f28022f + 1;
            this.f28022f = i11;
            if (i11 == this.f28023g) {
                y.d(this.f28021e, this.f28017a, round, this.f28019c, this.f28020d);
                this.f28022f = 0;
                this.f28023g = 0;
            }
        }
    }

    private void captureValues(s sVar) {
        View view = sVar.f28063b;
        int i11 = Y.f42258g;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = sVar.f28062a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        View view2 = sVar.f28063b;
        hashMap.put("android:changeBounds:parent", view2.getParent());
        if (this.mReparent) {
            view2.getLocationInWindow(this.mTempLocation);
            hashMap.put("android:changeBounds:windowX", Integer.valueOf(this.mTempLocation[0]));
            hashMap.put("android:changeBounds:windowY", Integer.valueOf(this.mTempLocation[1]));
        }
        if (this.mResizeClip) {
            hashMap.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    private boolean parentMatches(View view, View view2) {
        if (!this.mReparent) {
            return true;
        }
        s matchedTransitionValues = getMatchedTransitionValues(view, true);
        return matchedTransitionValues == null ? view == view2 : view2 == matchedTransitionValues.f28063b;
    }

    @Override // V4.l
    public void captureEndValues(@NonNull s sVar) {
        captureValues(sVar);
    }

    @Override // V4.l
    public void captureStartValues(@NonNull s sVar) {
        captureValues(sVar);
    }

    @Override // V4.l
    public Animator createAnimator(@NonNull ViewGroup viewGroup, s sVar, s sVar2) {
        int i11;
        int i12;
        Rect rect;
        Animator animator;
        Animator animator2;
        Animator animator3;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        HashMap hashMap = sVar.f28062a;
        HashMap hashMap2 = sVar2.f28062a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        boolean parentMatches = parentMatches(viewGroup2, viewGroup3);
        View view = sVar2.f28063b;
        if (!parentMatches) {
            int intValue = ((Integer) hashMap.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) hashMap.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) hashMap2.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) hashMap2.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.mTempLocation);
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float b11 = y.b(view);
            y.e(view, 0.0f);
            new x(viewGroup).a(bitmapDrawable);
            V4.i pathMotion = getPathMotion();
            int[] iArr = this.mTempLocation;
            int i13 = iArr[0];
            int i14 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, PropertyValuesHolder.ofObject(DRAWABLE_ORIGIN_PROPERTY, (TypeConverter) null, pathMotion.a(intValue - i13, intValue2 - i14, intValue3 - i13, intValue4 - i14)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view, b11));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i15 = rect2.left;
        int i16 = rect3.left;
        int i17 = rect2.top;
        int i18 = rect3.top;
        int i19 = rect2.right;
        int i21 = rect3.right;
        int i22 = rect2.bottom;
        int i23 = rect3.bottom;
        int i24 = i19 - i15;
        int i25 = i22 - i17;
        int i26 = i21 - i16;
        int i27 = i23 - i18;
        Rect rect4 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect5 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i24 == 0 || i25 == 0) && (i26 == 0 || i27 == 0)) {
            i11 = 0;
        } else {
            i11 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i21 || i22 != i23) {
                i11++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i11++;
        }
        if (i11 <= 0) {
            return null;
        }
        if (this.mResizeClip) {
            y.d(view, i15, i17, Math.max(i24, i26) + i15, Math.max(i25, i27) + i17);
            Animator ofObject = (i15 == i16 && i17 == i18) ? null : ObjectAnimator.ofObject(view, (Property<View, V>) POSITION_PROPERTY, (TypeConverter) null, getPathMotion().a(i15, i17, i16, i18));
            if (rect4 == null) {
                i12 = 0;
                rect = new Rect(0, 0, i24, i25);
            } else {
                i12 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i12, i12, i26, i27) : rect5;
            if (rect.equals(rect6)) {
                animator = null;
            } else {
                int i28 = Y.f42258g;
                view.setClipBounds(rect);
                animator = ObjectAnimator.ofObject(view, "clipBounds", sRectEvaluator, rect, rect6);
                animator.addListener(new i(view, rect5, i16, i18, i21, i23));
            }
            int i29 = r.f28061d;
            animator3 = ofObject;
            if (ofObject == null) {
                animator2 = animator;
            } else {
                if (animator != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofObject, animator);
                    animator2 = animatorSet;
                }
                animator2 = animator3;
            }
        } else {
            y.d(view, i15, i17, i19, i22);
            if (i11 != 2) {
                animator2 = (i15 == i16 && i17 == i18) ? ObjectAnimator.ofObject(view, (Property<View, V>) BOTTOM_RIGHT_ONLY_PROPERTY, (TypeConverter) null, getPathMotion().a(i19, i22, i21, i23)) : ObjectAnimator.ofObject(view, (Property<View, V>) TOP_LEFT_ONLY_PROPERTY, (TypeConverter) null, getPathMotion().a(i15, i17, i16, i18));
            } else if (i24 == i26 && i25 == i27) {
                animator2 = ObjectAnimator.ofObject(view, (Property<View, V>) POSITION_PROPERTY, (TypeConverter) null, getPathMotion().a(i15, i17, i16, i18));
            } else {
                k kVar = new k(view);
                Animator ofObject2 = ObjectAnimator.ofObject(kVar, (Property<k, V>) TOP_LEFT_PROPERTY, (TypeConverter) null, getPathMotion().a(i15, i17, i16, i18));
                Animator ofObject3 = ObjectAnimator.ofObject(kVar, (Property<k, V>) BOTTOM_RIGHT_PROPERTY, (TypeConverter) null, getPathMotion().a(i19, i22, i21, i23));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ofObject2, ofObject3);
                animatorSet2.addListener(new h(kVar));
                animator3 = animatorSet2;
                animator2 = animator3;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            w.a(viewGroup4, true);
            addListener(new j(viewGroup4));
        }
        return animator2;
    }

    @Override // V4.l
    @NonNull
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }
}
