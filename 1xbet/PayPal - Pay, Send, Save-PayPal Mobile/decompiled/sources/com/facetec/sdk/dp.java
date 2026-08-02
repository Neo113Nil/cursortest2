package com.facetec.sdk;

/* loaded from: classes8.dex */
final class dp {
    private static final com.facetec.sdk.f<android.content.res.Resources> c = new com.facetec.sdk.f<>();
    private static final com.facetec.sdk.f<android.content.res.Resources> e = new com.facetec.sdk.f<>();
    private static final com.facetec.sdk.f<android.util.DisplayMetrics> b = new com.facetec.sdk.f<>();

    /* renamed from: a, reason: collision with root package name */
    private static final com.facetec.sdk.f<com.facetec.sdk.FaceTecSize> f3517a = new com.facetec.sdk.f<>();
    private static java.lang.ref.WeakReference<android.app.Activity> f = null;
    static final boolean d = com.facetec.sdk.ay.d(new java.lang.String[]{"Surface Duo 2", "HZ1-00006", "SM-F90"});

    enum d {
        COLOR,
        RESOURCE
    }

    dp() {
    }

    static android.content.res.Resources e() {
        return c.d(new com.facetec.sdk.f.d() { // from class: com.facetec.sdk.dp$$ExternalSyntheticLambda0
            @Override // com.facetec.sdk.f.d
            public final java.lang.Object create() {
                android.content.res.Resources system;
                system = android.content.res.Resources.getSystem();
                return system;
            }
        });
    }

    static android.content.res.Resources a(final android.content.Context context) {
        com.facetec.sdk.f<android.content.res.Resources> fVar = e;
        java.util.Objects.requireNonNull(context);
        return fVar.d(new com.facetec.sdk.f.d() { // from class: com.facetec.sdk.dp$$ExternalSyntheticLambda1
            @Override // com.facetec.sdk.f.d
            public final java.lang.Object create() {
                android.content.res.Resources resources;
                resources = context.getResources();
                return resources;
            }
        });
    }

    static com.facetec.sdk.FaceTecSize c(android.app.Activity activity) {
        return a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facetec.sdk.FaceTecSize a(android.app.Activity activity) {
        float f2;
        try {
            f2 = com.facetec.sdk.ai.j();
        } catch (com.facetec.sdk.ak unused) {
            f2 = 1.77f;
        }
        int measuredWidth = activity.getWindow().getDecorView().getMeasuredWidth();
        return new com.facetec.sdk.FaceTecSize(measuredWidth, (int) (measuredWidth * f2));
    }

    static com.facetec.sdk.FaceTecSize b() {
        if (!d) {
            return c();
        }
        java.lang.ref.WeakReference<android.app.Activity> weakReference = f;
        final android.app.Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            return c();
        }
        com.facetec.sdk.f<com.facetec.sdk.FaceTecSize> fVar = f3517a;
        if (fVar.a() != null && (fVar.a().height == 0 || fVar.a().width == 0)) {
            fVar.c();
        }
        return fVar.d(new com.facetec.sdk.f.d() { // from class: com.facetec.sdk.dp$$ExternalSyntheticLambda3
            @Override // com.facetec.sdk.f.d
            public final java.lang.Object create() {
                java.lang.Object a2;
                a2 = com.facetec.sdk.dp.a(activity);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object a() {
        return e().getDisplayMetrics();
    }

    static android.util.DisplayMetrics d() {
        return b.d(new com.facetec.sdk.f.d() { // from class: com.facetec.sdk.dp$$ExternalSyntheticLambda4
            @Override // com.facetec.sdk.f.d
            public final java.lang.Object create() {
                java.lang.Object a2;
                a2 = com.facetec.sdk.dp.a();
                return a2;
            }
        });
    }

    static com.facetec.sdk.FaceTecSize c() {
        android.util.DisplayMetrics d2 = d();
        return new com.facetec.sdk.FaceTecSize(d2.widthPixels, d2.heightPixels);
    }

    static com.facetec.sdk.dp.d c(android.content.Context context, int i) {
        long j = i & 4294967295L;
        if (j == 0 || j > com.datadog.android.sessionreplay.utils.ColorConstantsKt.MASK_RGB) {
            return com.facetec.sdk.dp.d.COLOR;
        }
        try {
            a(context).getValue(i, new android.util.TypedValue(), true);
            return com.facetec.sdk.dp.d.RESOURCE;
        } catch (java.lang.Exception unused) {
            return com.facetec.sdk.dp.d.COLOR;
        }
    }

    static int a(int i) {
        return android.graphics.Color.argb(java.lang.Math.round(android.graphics.Color.alpha(i) * 0.5f), android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i));
    }

    static int d(int i, int i2) {
        return android.graphics.Color.argb(i2, android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i));
    }

    /* renamed from: com.facetec.sdk.dp$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[com.facetec.sdk.dp.d.values().length];
            e = iArr;
            try {
                iArr[com.facetec.sdk.dp.d.RESOURCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                e[com.facetec.sdk.dp.d.COLOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static int e(android.content.Context context, int i) {
        if (com.facetec.sdk.dp.AnonymousClass2.e[c(context, i).ordinal()] != 1) {
            return i;
        }
        try {
            return androidx.core.content.ContextCompat.getColor(context, i);
        } catch (java.lang.Throwable unused) {
            return i;
        }
    }

    static int b(android.content.Context context, int i, int i2) {
        int i3;
        int i4 = com.facetec.sdk.dp.AnonymousClass2.e[c(context, i).ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                return 255;
            }
            return (i >> 24) & 255;
        }
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, i);
        if (drawable != null) {
            if (drawable instanceof android.graphics.drawable.ShapeDrawable) {
                return ((android.graphics.drawable.ShapeDrawable) drawable).getPaint().getAlpha();
            }
            if (drawable instanceof android.graphics.drawable.GradientDrawable) {
                int[] colors = ((android.graphics.drawable.GradientDrawable) drawable).getColors();
                if (colors == null) {
                    return 255;
                }
                int length = colors.length;
                int i5 = 0;
                while (i3 < length) {
                    int i6 = colors[i3];
                    int i7 = com.facetec.sdk.dp.AnonymousClass2.e[c(context, i6).ordinal()];
                    if (i7 != 1) {
                        i3 = i7 != 2 ? i3 + 1 : 0;
                    } else {
                        i6 = androidx.core.content.ContextCompat.getColor(context, i6);
                    }
                    i5 += (i6 >> 24) & 255;
                }
                return i5 / colors.length;
            }
            if (drawable instanceof android.graphics.drawable.ColorDrawable) {
                return drawable.getAlpha();
            }
            return 255;
        }
        return (androidx.core.content.ContextCompat.getColor(context, i) >> 24) & 255;
    }

    static android.graphics.drawable.GradientDrawable c(android.content.Context context, android.graphics.drawable.GradientDrawable gradientDrawable, int i) {
        int[] colors = gradientDrawable.getColors();
        if (colors != null) {
            for (int i2 = 0; i2 < colors.length; i2++) {
                int i3 = com.facetec.sdk.dp.AnonymousClass2.e[c(context, colors[i2]).ordinal()];
                if (i3 == 1) {
                    colors[i2] = d(e(context, colors[i2]), 255);
                } else if (i3 == 2) {
                    colors[i2] = d(colors[i2], 255);
                }
            }
        }
        gradientDrawable.setColors(colors);
        return gradientDrawable;
    }

    static void a(android.view.View view, int i, int i2) {
        int i3 = com.facetec.sdk.dp.AnonymousClass2.e[c(view.getContext(), i).ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return;
            }
            view.setBackgroundColor(d(i, 255));
        } else {
            if (androidx.core.content.ContextCompat.getDrawable(view.getContext(), i) != null) {
                android.graphics.drawable.Drawable mutate = androidx.core.content.ContextCompat.getDrawable(view.getContext(), i).mutate();
                if (mutate instanceof android.graphics.drawable.ShapeDrawable) {
                    ((android.graphics.drawable.ShapeDrawable) mutate).getPaint().setAlpha(255);
                } else if (mutate instanceof android.graphics.drawable.GradientDrawable) {
                    mutate = c(view.getContext(), (android.graphics.drawable.GradientDrawable) mutate, i2);
                } else if (mutate instanceof android.graphics.drawable.ColorDrawable) {
                    mutate.setAlpha(255);
                }
                view.setBackground(mutate);
                return;
            }
            view.setBackgroundColor(d(androidx.core.content.ContextCompat.getColor(view.getContext(), i), 255));
        }
    }

    static void b(android.content.Context context, android.graphics.drawable.Drawable drawable, int i) {
        int i2 = com.facetec.sdk.dp.AnonymousClass2.e[c(context, i).ordinal()];
        if (i2 == 1) {
            if (drawable instanceof android.graphics.drawable.GradientDrawable) {
                ((android.graphics.drawable.GradientDrawable) drawable).setColor(androidx.core.content.ContextCompat.getColor(context, i));
            }
        } else if (i2 == 2 && (drawable instanceof android.graphics.drawable.GradientDrawable)) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i);
        }
    }

    static void e(android.widget.TextView textView, java.lang.String str) {
        textView.setText(android.text.Html.fromHtml(str.replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "<br/>"), 63));
    }

    static void e(android.graphics.drawable.Drawable drawable, int i) {
        if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i);
        } else if (drawable instanceof android.graphics.drawable.ColorDrawable) {
            ((android.graphics.drawable.ColorDrawable) drawable).setColor(i);
        } else if (drawable instanceof android.graphics.drawable.ShapeDrawable) {
            ((android.graphics.drawable.ShapeDrawable) drawable).getPaint().setColor(i);
        }
    }

    static void c(android.graphics.drawable.Drawable drawable, int i) {
        if (drawable instanceof android.graphics.drawable.ShapeDrawable) {
            ((android.graphics.drawable.ShapeDrawable) drawable).getPaint().setColor(i);
        } else if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i);
        } else if (drawable instanceof android.graphics.drawable.ColorDrawable) {
            ((android.graphics.drawable.ColorDrawable) drawable).setColor(i);
        }
    }

    static void a(android.graphics.drawable.Drawable drawable, int i, int i2, double d2) {
        if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) drawable;
            gradientDrawable.setStroke(i2, i);
            gradientDrawable.setCornerRadius((float) d2);
        }
    }

    static void e(android.content.Context context, android.widget.TextView textView, android.graphics.drawable.Drawable drawable, int i) {
        int i2 = com.facetec.sdk.dp.AnonymousClass2.e[c(textView.getContext(), i).ordinal()];
        if (i2 == 1) {
            if (drawable instanceof android.graphics.drawable.ShapeDrawable) {
                ((android.graphics.drawable.ShapeDrawable) drawable).getPaint().setColor(androidx.core.content.ContextCompat.getColor(context, i));
                return;
            } else if (drawable instanceof android.graphics.drawable.GradientDrawable) {
                ((android.graphics.drawable.GradientDrawable) drawable).setColor(androidx.core.content.ContextCompat.getColor(context, i));
                return;
            } else {
                if (drawable instanceof android.graphics.drawable.ColorDrawable) {
                    ((android.graphics.drawable.ColorDrawable) drawable).setColor(androidx.core.content.ContextCompat.getColor(context, i));
                    return;
                }
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        if (drawable instanceof android.graphics.drawable.ShapeDrawable) {
            ((android.graphics.drawable.ShapeDrawable) drawable).getPaint().setColor(i);
        } else if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i);
        } else if (drawable instanceof android.graphics.drawable.ColorDrawable) {
            ((android.graphics.drawable.ColorDrawable) drawable).setColor(i);
        }
    }

    static void e(android.widget.TextView textView, int i) {
        int i2 = com.facetec.sdk.dp.AnonymousClass2.e[c(textView.getContext(), i).ordinal()];
        if (i2 == 1) {
            textView.setTextColor(androidx.core.content.ContextCompat.getColor(textView.getContext(), i));
        } else {
            if (i2 != 2) {
                return;
            }
            textView.setTextColor(i);
        }
    }

    static void d(android.widget.Button button, int i) {
        button.setTextColor(i);
    }

    static void c(android.content.Context context, android.widget.TextView textView, android.graphics.drawable.Drawable drawable, int i, int i2, double d2) {
        int i3 = com.facetec.sdk.dp.AnonymousClass2.e[c(textView.getContext(), i).ordinal()];
        if (i3 == 1) {
            if (drawable instanceof android.graphics.drawable.GradientDrawable) {
                android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) drawable;
                gradientDrawable.setStroke(i2, androidx.core.content.ContextCompat.getColor(context, i));
                gradientDrawable.setCornerRadius((float) d2);
                return;
            }
            return;
        }
        if (i3 == 2 && (drawable instanceof android.graphics.drawable.GradientDrawable)) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = (android.graphics.drawable.GradientDrawable) drawable;
            gradientDrawable2.setStroke(i2, i);
            gradientDrawable2.setCornerRadius((float) d2);
        }
    }

    static void d(android.widget.ImageView imageView, int i, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback, boolean z) {
        android.graphics.drawable.Drawable drawable;
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat e2;
        if (imageView == null || (drawable = androidx.core.content.ContextCompat.getDrawable(imageView.getContext(), i)) == null) {
            return;
        }
        if ((drawable instanceof android.graphics.drawable.Animatable) && (e2 = com.facetec.sdk.ay.e(imageView.getContext(), i)) != null) {
            imageView.setImageDrawable(e2);
            if (animationCallback != null) {
                e2.registerAnimationCallback(animationCallback);
            }
            if (z) {
                a(imageView);
                return;
            }
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    static void a(android.widget.ImageView imageView) {
        java.lang.Object drawable;
        if (imageView == null || (drawable = imageView.getDrawable()) == null || !(drawable instanceof android.graphics.drawable.Animatable)) {
            return;
        }
        try {
            ((android.graphics.drawable.Animatable) drawable).start();
        } catch (java.lang.Exception unused) {
        }
    }

    static android.animation.ObjectAnimator d(android.view.View view, float f2, final java.lang.Runnable runnable) {
        if (view == null) {
            return null;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f2);
        ofFloat.setDuration(500L);
        ofFloat.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.dp$$ExternalSyntheticLambda2
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                com.facetec.sdk.dp.b(runnable, animator);
            }
        });
        ofFloat.start();
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(java.lang.Runnable runnable, android.animation.Animator animator) {
        if (runnable != null) {
            runnable.run();
        }
    }

    static void a(com.facetec.sdk.bl blVar) {
        f3517a.c();
        f = new java.lang.ref.WeakReference<>(blVar);
    }
}
