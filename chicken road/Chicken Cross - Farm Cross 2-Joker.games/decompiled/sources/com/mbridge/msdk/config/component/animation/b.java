package com.mbridge.msdk.config.component.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: AnimationCompiler.java */
/* loaded from: classes6.dex */
public class b {

    /* compiled from: AnimationCompiler.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f8899a;
        final /* synthetic */ int b;
        final /* synthetic */ int[] c;

        a(int i, int[] iArr) {
            this.b = i;
            this.c = iArr;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8899a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8899a) {
                return;
            }
            int i = this.b;
            if (i == -1 || this.c[0] > 0) {
                if (i != -1) {
                    this.c[0] = r0[0] - 1;
                }
                animator.start();
            }
        }
    }

    private Animator b(e eVar, View view) {
        if (eVar != null && view != null && !TextUtils.isEmpty(eVar.c())) {
            String c = eVar.c();
            View b = b(view, eVar.b());
            if ("animation".equals(c)) {
                Animator a2 = a(eVar, b);
                a(a2, eVar.b());
                return a2;
            }
            if ("parallel".equals(c)) {
                Animator c2 = c(eVar, b);
                a(c2, eVar.b());
                return c2;
            }
            if ("sequence".equals(c)) {
                Animator d = d(eVar, b);
                a(d, eVar.b());
                return d;
            }
            if ("stagger".equals(c)) {
                Animator e = e(eVar, b);
                a(e, eVar.b());
                return e;
            }
            if ("translate".equals(c)) {
                Animator j = j(eVar, b);
                a(j, eVar.b());
                return j;
            }
            if ("scale".equals(c)) {
                Animator i = i(eVar, b);
                a(i, eVar.b());
                return i;
            }
            if ("rotate".equals(c)) {
                Animator h = h(eVar, b);
                a(h, eVar.b());
                return h;
            }
            if ("alpha".equals(c)) {
                Animator f = f(eVar, b);
                a(f, eVar.b());
                return f;
            }
            if ("color".equals(c)) {
                Animator g = g(eVar, b);
                a(g, eVar.b());
                return g;
            }
        }
        return null;
    }

    private Animator c(e eVar, View view) {
        List<Animator> a2 = a(eVar.a(), view);
        if (a2.isEmpty()) {
            return a(eVar.b());
        }
        if (a2.size() == 1) {
            return a2.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a2);
        return animatorSet;
    }

    private Animator d(e eVar, View view) {
        List<Animator> a2 = a(eVar.a(), view);
        if (a2.isEmpty()) {
            return a(eVar.b());
        }
        ArrayList arrayList = new ArrayList();
        long a3 = a(eVar.b().get("gap"), 0L);
        for (int i = 0; i < a2.size(); i++) {
            arrayList.add(a2.get(i));
            if (a3 > 0 && i < a2.size() - 1) {
                arrayList.add(a(a3));
            }
        }
        if (arrayList.size() == 1) {
            return (Animator) arrayList.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        return animatorSet;
    }

    private Animator e(e eVar, View view) {
        List<Animator> a2 = a(eVar.a(), view);
        if (a2.isEmpty()) {
            return a(eVar.b());
        }
        if ("BACKWARD".equalsIgnoreCase(d(eVar.b().get("direction")))) {
            Collections.reverse(a2);
        }
        long a3 = a(eVar.b().get("stagger"), 0L);
        for (int i = 0; i < a2.size(); i++) {
            Animator animator = a2.get(i);
            animator.setStartDelay(animator.getStartDelay() + (i * a3));
        }
        if (a2.size() == 1) {
            return a2.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a2);
        return animatorSet;
    }

    private Animator f(e eVar, View view) {
        Map<String, Object> b = eVar.b();
        if (!a(b, "alpha") && !a(b, "fromAlpha")) {
            return null;
        }
        float a2 = a(b.get("alpha"), view.getAlpha());
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, a(b.get("fromAlpha"), view.getAlpha()), a2);
    }

    private Animator g(e eVar, View view) {
        Animator b;
        Animator d;
        Animator c;
        Animator a2;
        Map<String, Object> b2 = eVar.b();
        ArrayList arrayList = new ArrayList();
        if (a(b2, "backgroundColor") && (a2 = a(view, d(b2.get("backgroundColor")))) != null) {
            arrayList.add(a2);
        }
        if (a(b2, "textColor") && (c = c(view, d(b2.get("textColor")))) != null) {
            arrayList.add(c);
        }
        if (a(b2, "tintColor") && (d = d(view, d(b2.get("tintColor")))) != null) {
            arrayList.add(d);
        }
        if (a(b2, "borderColor") && (b = b(view, d(b2.get("borderColor")))) != null) {
            arrayList.add(b);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (Animator) arrayList.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    private Animator h(e eVar, View view) {
        Map<String, Object> b = eVar.b();
        a(view, b);
        ArrayList arrayList = new ArrayList();
        if (a(b, "rotation") || a(b, "fromRotation")) {
            float a2 = a(b.get("rotation"), view.getRotation());
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION, a(b.get("fromRotation"), view.getRotation()), a2));
        }
        if (a(b, "rotationX") || a(b, "fromRotationX")) {
            float a3 = a(b.get("rotationX"), view.getRotationX());
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION_X, a(b.get("fromRotationX"), view.getRotationX()), a3));
        }
        if (a(b, "rotationY") || a(b, "fromRotationY")) {
            float a4 = a(b.get("rotationY"), view.getRotationY());
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION_Y, a(b.get("fromRotationY"), view.getRotationY()), a4));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ObjectAnimator.ofPropertyValuesHolder(view, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
    }

    private Animator i(e eVar, View view) {
        Map<String, Object> b = eVar.b();
        a(view, b);
        ArrayList arrayList = new ArrayList();
        float a2 = a(b, "scaleX", "scale", view.getScaleX());
        float a3 = a(b, "scaleY", "scale", view.getScaleY());
        if (a(b, "scaleX") || a(b, "scale") || a(b, "fromScaleX") || a(b, "fromScale")) {
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, a(b, "fromScaleX", "fromScale", view.getScaleX()), a2));
        }
        if (a(b, "scaleY") || a(b, "scale") || a(b, "fromScaleY") || a(b, "fromScale")) {
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, a(b, "fromScaleY", "fromScale", view.getScaleY()), a3));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ObjectAnimator.ofPropertyValuesHolder(view, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
    }

    private Animator j(e eVar, View view) {
        Map<String, Object> b = eVar.b();
        ArrayList arrayList = new ArrayList();
        if (a(b, "x") || a(b, "fromX")) {
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, a(b, "fromX") ? a(view, b, "fromX", true) : view.getTranslationX(), a(view, b, "x", true)));
        }
        if (a(b, "y") || a(b, "fromY")) {
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, a(b, "fromY") ? a(view, b, "fromY", false) : view.getTranslationY(), a(view, b, "y", false)));
        }
        if (a(b, "z") || a(b, "fromZ")) {
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Z, a(b, "fromZ") ? a(b.get("fromZ"), view.getTranslationZ()) : view.getTranslationZ(), a(b.get("z"), 0.0f)));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ObjectAnimator.ofPropertyValuesHolder(view, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
    }

    public Animator a(g gVar, View view) {
        if (gVar == null || view == null || gVar.b() == null || gVar.b().isEmpty()) {
            return null;
        }
        return b(gVar.b().get(0), view);
    }

    private Animator a(e eVar, View view) {
        List<Animator> a2 = a(eVar.a(), view);
        if (a2.isEmpty()) {
            return a(eVar.b());
        }
        if (a2.size() == 1) {
            return a2.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a2);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View f(View view, String str) {
        View findViewWithTag;
        View resolveAnimationTarget;
        if ((view instanceof h) && (resolveAnimationTarget = ((h) view).resolveAnimationTarget(str)) != null) {
            return resolveAnimationTarget;
        }
        View e = e(view, str);
        if (e != null) {
            return e;
        }
        if ((view instanceof ViewGroup) && (findViewWithTag = ((ViewGroup) view).findViewWithTag(str)) != null) {
            return findViewWithTag;
        }
        View rootView = view.getRootView();
        if (rootView == null || rootView == view) {
            return null;
        }
        return rootView.findViewWithTag(str);
    }

    private Animator c(View view, String str) {
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        int a2 = a(str, textView.getCurrentTextColor());
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(a2));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.config.component.animation.b$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b.a(textView, valueAnimator);
            }
        });
        return ofObject;
    }

    private List<Animator> a(List<e> list, View view) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            Animator b = b(it.next(), view);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    private int c(Map<String, Object> map) {
        if (map == null) {
            return 0;
        }
        if (b(map.get("infinite"))) {
            return -1;
        }
        return a(map.get("count"), 0);
    }

    private Animator d(View view, String str) {
        if (!(view instanceof ImageView)) {
            return null;
        }
        final ImageView imageView = (ImageView) view;
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), 0, Integer.valueOf(a(str, 0)));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.config.component.animation.b$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b.a(imageView, valueAnimator);
            }
        });
        return ofObject;
    }

    private View e(View view, String str) {
        if (view != null && !TextUtils.isEmpty(str)) {
            String name = view.getClass().getName();
            if (!name.endsWith("BaitClickView") && !name.endsWith("MBridgeBaitClickView")) {
                return null;
            }
            String a2 = a(str);
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            try {
                Field a3 = a(view.getClass(), a2);
                if (a3 == null) {
                    return null;
                }
                a3.setAccessible(true);
                Object obj = a3.get(view);
                if (obj instanceof View) {
                    return (View) obj;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private Animator a(final View view, String str) {
        int a2 = a(str, 0);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(view.getBackground() instanceof ColorDrawable ? ((ColorDrawable) view.getBackground()).getColor() : a2), Integer.valueOf(a2));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.config.component.animation.b$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b.a(view, valueAnimator);
            }
        });
        return ofObject;
    }

    private int c(Object obj) {
        return "REVERSE".equalsIgnoreCase(d(obj)) ? 2 : 1;
    }

    private String d(Object obj) {
        return obj == null ? "" : String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(View view, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            view.setBackgroundColor(((Integer) animatedValue).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(TextView textView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            textView.setTextColor(((Integer) animatedValue).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ImageView imageView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            imageView.setColorFilter(((Integer) animatedValue).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(GradientDrawable gradientDrawable, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            gradientDrawable.setStroke(1, ((Integer) animatedValue).intValue());
        }
    }

    private Animator a(Map<String, Object> map) {
        Map<String, Object> a2 = a(map.get(IronSourceConstants.EVENTS_DURATION));
        long b = a2 != null ? b(a2, IronSourceConstants.EVENTS_DURATION) : 0L;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(b);
        return ofFloat;
    }

    private Animator b(View view, String str) {
        Drawable background = view.getBackground();
        if (!(background instanceof GradientDrawable)) {
            return null;
        }
        final GradientDrawable gradientDrawable = (GradientDrawable) background.mutate();
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), 0, Integer.valueOf(a(str, 0)));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.config.component.animation.b$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b.a(gradientDrawable, valueAnimator);
            }
        });
        return ofObject;
    }

    private Animator a(long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        return ofFloat;
    }

    private String a(String str) {
        String lowerCase = d(str).trim().toLowerCase();
        if (!"hand".equals(lowerCase) && !"finger".equals(lowerCase) && !"baithand".equals(lowerCase)) {
            if (!"ripple".equals(lowerCase) && !"circle".equals(lowerCase) && !"baitripple".equals(lowerCase)) {
                if (!"text".equals(lowerCase) && !"label".equals(lowerCase) && !"baittext".equals(lowerCase)) {
                    return "";
                }
                return "mClickTextView";
            }
            return "mCircleImageView";
        }
        return "mHandImageView";
    }

    private View b(View view, Map<String, Object> map) {
        View f;
        if (view != null && a(map, "target")) {
            Object obj = map.get("target");
            if (obj instanceof View) {
                return (View) obj;
            }
            String trim = d(obj).trim();
            if (!TextUtils.isEmpty(trim) && !trim.equals(String.valueOf(view.getTag())) && (f = f(view, trim)) != null) {
                return f;
            }
        }
        return view;
    }

    private Field a(Class<?> cls, String str) {
        while (cls != null) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    private void a(Animator animator, Map<String, Object> map) {
        TimeInterpolator b;
        if (animator == null || map == null) {
            return;
        }
        Map<String, Object> a2 = a(map.get(IronSourceConstants.EVENTS_DURATION));
        if (a2 != null) {
            animator.setDuration(b(a2, IronSourceConstants.EVENTS_DURATION));
        }
        Map<String, Object> a3 = a(map.get("delay"));
        if (a3 != null) {
            animator.setStartDelay(b(a3, "delay"));
        }
        Map<String, Object> a4 = a(map.get("interpolator"));
        if (a4 != null && (b = b(a4)) != null) {
            animator.setInterpolator(b);
        }
        Map<String, Object> a5 = a(map.get("repeat"));
        if (a5 != null) {
            b(animator, a5);
        }
    }

    private void b(Animator animator, Map<String, Object> map) {
        if (animator == null || map == null) {
            return;
        }
        int c = c(map);
        int c2 = c(map.get(U3.a.t));
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(c);
            valueAnimator.setRepeatMode(c2);
        } else {
            if (c == 0) {
                return;
            }
            a(animator, c);
        }
    }

    private TimeInterpolator b(Map<String, Object> map) {
        String d = d(map.get("type"));
        if (TextUtils.isEmpty(d)) {
            d = d(map.get("interpolatorType"));
        }
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        if (!k.q.equalsIgnoreCase(d) && !"LinearInterpolator".equalsIgnoreCase(d)) {
            if (!"AccelerateInterpolator".equalsIgnoreCase(d) && !"easeIn".equalsIgnoreCase(d)) {
                if (!"DecelerateInterpolator".equalsIgnoreCase(d) && !"easeOut".equalsIgnoreCase(d)) {
                    if (!"BounceInterpolator".equalsIgnoreCase(d) && !"bounce".equalsIgnoreCase(d)) {
                        if ("OvershootInterpolator".equalsIgnoreCase(d)) {
                            Map<String, Object> a2 = a(map.get("parameters"));
                            float f = 2.0f;
                            if (a2 != null && a2.containsKey("tension")) {
                                f = a(a2.get("tension"), 2.0f);
                            }
                            return new OvershootInterpolator(f);
                        }
                        return new AccelerateDecelerateInterpolator();
                    }
                    return new BounceInterpolator();
                }
                return new DecelerateInterpolator();
            }
            return new AccelerateInterpolator();
        }
        return new LinearInterpolator();
    }

    private void a(Animator animator, int i) {
        animator.addListener(new a(i, new int[]{i}));
    }

    private void a(View view, Map<String, Object> map) {
        if (view == null || map == null) {
            return;
        }
        if (a(map, "pivotX")) {
            view.setPivotX(a(view.getWidth(), map.get("pivotX")));
        }
        if (a(map, "pivotY")) {
            view.setPivotY(a(view.getHeight(), map.get("pivotY")));
        }
    }

    private float a(int i, Object obj) {
        float a2 = a(obj, 0.5f);
        return (a2 < 0.0f || a2 > 1.0f || i <= 0) ? a2 : a2 * i;
    }

    private float a(Map<String, Object> map, String str, String str2, float f) {
        if (a(map, str)) {
            return a(map.get(str), f);
        }
        return a(map, str2) ? a(map.get(str2), f) : f;
    }

    private float a(View view, Map<String, Object> map, String str, boolean z) {
        View a2;
        int width;
        float a3 = a(map.get(str), 0.0f);
        String d = d(map.get("relativeTo"));
        if (TextUtils.isEmpty(d)) {
            d = "ABSOLUTE";
        }
        if ("RELATIVE_TO_SELF".equalsIgnoreCase(d)) {
            width = z ? view.getWidth() : view.getHeight();
        } else {
            if ("RELATIVE_TO_PARENT".equalsIgnoreCase(d)) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    View view2 = (View) parent;
                    width = z ? view2.getWidth() : view2.getHeight();
                }
            }
            if ((!"RELATIVE_TO_REFERENCE".equalsIgnoreCase(d) && !"REFERENCE_VIEW".equalsIgnoreCase(d)) || (a2 = a(view, map.get("referenceView"))) == null) {
                return a3;
            }
            width = z ? a2.getWidth() : a2.getHeight();
        }
        return a3 * width;
    }

    private long b(Map<String, Object> map, String str) {
        long a2 = a(map.get(str), 0L);
        return "SECONDS".equalsIgnoreCase(d(map.get("timeUnit"))) ? a2 * 1000 : a2;
    }

    private boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        String d = d(obj);
        return "1".equals(d) || "true".equalsIgnoreCase(d) || "yes".equalsIgnoreCase(d);
    }

    private View a(View view, Object obj) {
        View rootView;
        if (obj instanceof View) {
            return (View) obj;
        }
        if (!(obj instanceof String) || TextUtils.isEmpty((String) obj) || (rootView = view.getRootView()) == null) {
            return null;
        }
        return rootView.findViewWithTag(obj);
    }

    private Map<String, Object> a(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    private boolean a(Map<String, Object> map, String str) {
        return (map == null || !map.containsKey(str) || map.get(str) == null) ? false : true;
    }

    private float a(Object obj, float f) {
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        try {
            return Float.parseFloat(String.valueOf(obj));
        } catch (Exception unused) {
            return f;
        }
    }

    private int a(Object obj, int i) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            return Integer.parseInt(String.valueOf(obj));
        } catch (Exception unused) {
            return i;
        }
    }

    private long a(Object obj, long j) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        try {
            return Long.parseLong(String.valueOf(obj));
        } catch (Exception unused) {
            return j;
        }
    }

    private int a(String str, int i) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
