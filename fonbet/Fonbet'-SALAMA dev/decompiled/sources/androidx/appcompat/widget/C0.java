package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: g, reason: collision with root package name */
    public static C0 f8320g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f8322a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f8323b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f8324c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8325d;

    /* renamed from: e, reason: collision with root package name */
    public Q3.o f8326e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f8319f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final B0 f8321h = new B0(6);

    public static synchronized C0 b() {
        C0 c0;
        synchronized (C0.class) {
            try {
                if (f8320g == null) {
                    f8320g = new C0();
                }
                c0 = f8320g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0;
    }

    public static synchronized PorterDuffColorFilter e(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0.class) {
            B0 b02 = f8321h;
            b02.getClass();
            int i8 = (31 + i7) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) b02.get(Integer.valueOf(mode.hashCode() + i8));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(int i7, Context context) {
        Drawable drawable;
        if (this.f8324c == null) {
            this.f8324c = new TypedValue();
        }
        TypedValue typedValue = this.f8324c;
        context.getResources().getValue(i7, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            r.f fVar = (r.f) this.f8323b.get(context);
            drawable = null;
            if (fVar != null) {
                WeakReference weakReference = (WeakReference) fVar.c(j, null);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b7 = r.e.b(fVar.f15986b, fVar.f15988d, j);
                        if (b7 >= 0) {
                            Object[] objArr = fVar.f15987c;
                            Object obj = objArr[b7];
                            Object obj2 = r.f.f15984e;
                            if (obj != obj2) {
                                objArr[b7] = obj2;
                                fVar.f15985a = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f8326e != null) {
            if (i7 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
            } else if (i7 == R.drawable.abc_ratingbar_material) {
                layerDrawable = Q3.o.g(this, context, R.dimen.abc_star_big);
            } else if (i7 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = Q3.o.g(this, context, R.dimen.abc_star_medium);
            } else if (i7 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = Q3.o.g(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        r.f fVar2 = (r.f) this.f8323b.get(context);
                        if (fVar2 == null) {
                            fVar2 = new r.f();
                            this.f8323b.put(context, fVar2);
                        }
                        fVar2.d(j, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i7) {
        return d(context, i7, false);
    }

    public final synchronized Drawable d(Context context, int i7, boolean z4) {
        Drawable a2;
        try {
            if (!this.f8325d) {
                this.f8325d = true;
                Drawable c3 = c(context, R.drawable.abc_vector_test);
                if (c3 == null || (!(c3 instanceof P0.a) && !"android.graphics.drawable.VectorDrawable".equals(c3.getClass().getName()))) {
                    this.f8325d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(i7, context);
            if (a2 == null) {
                a2 = G.h.getDrawable(context, i7);
            }
            if (a2 != null) {
                a2 = g(context, i7, z4, a2);
            }
            if (a2 != null) {
                AbstractC0637f0.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(int i7, Context context) {
        ColorStateList colorStateList;
        r.m mVar;
        WeakHashMap weakHashMap = this.f8322a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (mVar = (r.m) weakHashMap.get(context)) == null) ? null : (ColorStateList) mVar.b(i7, null);
        if (colorStateList == null) {
            Q3.o oVar = this.f8326e;
            if (oVar != null) {
                colorStateList2 = oVar.h(i7, context);
            }
            if (colorStateList2 != null) {
                if (this.f8322a == null) {
                    this.f8322a = new WeakHashMap();
                }
                r.m mVar2 = (r.m) this.f8322a.get(context);
                if (mVar2 == null) {
                    mVar2 = new r.m();
                    this.f8322a.put(context, mVar2);
                }
                mVar2.a(i7, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i7, boolean z4, Drawable drawable) {
        boolean z7;
        int round;
        PorterDuffColorFilter e7;
        int i8 = R.attr.colorControlNormal;
        int i9 = R.attr.colorControlActivated;
        ColorStateList f7 = f(i7, context);
        PorterDuff.Mode mode = null;
        if (f7 != null) {
            int[] iArr = AbstractC0637f0.f8620a;
            Drawable mutate = drawable.mutate();
            J.a.h(mutate, f7);
            if (this.f8326e != null && i7 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return mutate;
            }
            J.a.i(mutate, mode);
            return mutate;
        }
        if (this.f8326e != null) {
            if (i7 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c3 = X0.c(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode2 = C0665u.f8746b;
                Q3.o.o(findDrawableByLayerId, c3, mode2);
                Q3.o.o(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), X0.c(R.attr.colorControlNormal, context), mode2);
                Q3.o.o(layerDrawable.findDrawableByLayerId(android.R.id.progress), X0.c(R.attr.colorControlActivated, context), mode2);
                return drawable;
            }
            if (i7 == R.drawable.abc_ratingbar_material || i7 == R.drawable.abc_ratingbar_indicator_material || i7 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b7 = X0.b(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode3 = C0665u.f8746b;
                Q3.o.o(findDrawableByLayerId2, b7, mode3);
                Q3.o.o(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), X0.c(R.attr.colorControlActivated, context), mode3);
                Q3.o.o(layerDrawable2.findDrawableByLayerId(android.R.id.progress), X0.c(R.attr.colorControlActivated, context), mode3);
                return drawable;
            }
        }
        Q3.o oVar = this.f8326e;
        boolean z8 = false;
        if (oVar != null) {
            PorterDuff.Mode mode4 = C0665u.f8746b;
            if (!Q3.o.b(i7, (int[]) oVar.f5822a)) {
                if (!Q3.o.b(i7, (int[]) oVar.f5824c)) {
                    boolean b8 = Q3.o.b(i7, (int[]) oVar.f5825d);
                    i9 = android.R.attr.colorBackground;
                    if (b8) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i7 == 2131165221) {
                        round = Math.round(40.8f);
                        i8 = android.R.attr.colorForeground;
                        z7 = true;
                        if (z7) {
                            int[] iArr2 = AbstractC0637f0.f8620a;
                            Drawable mutate2 = drawable.mutate();
                            int c4 = X0.c(i8, context);
                            synchronized (C0665u.class) {
                                e7 = e(c4, mode4);
                            }
                            mutate2.setColorFilter(e7);
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                            z8 = true;
                        }
                    } else if (i7 != R.drawable.abc_dialog_material_background) {
                        i8 = 0;
                        z7 = false;
                        round = -1;
                        if (z7) {
                        }
                    }
                }
                i8 = i9;
            }
            z7 = true;
            round = -1;
            if (z7) {
            }
        }
        if (z8 || !z4) {
            return drawable;
        }
        return null;
    }
}
