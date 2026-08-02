package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f21 {

    /* JADX INFO: renamed from: g */
    public static f21 f2274g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f2276a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f2277b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f2278c;

    /* JADX INFO: renamed from: d */
    public boolean f2279d;

    /* JADX INFO: renamed from: e */
    public C0902y5 f2280e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f2273f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final e21 f2275h = new e21(6);

    /* JADX INFO: renamed from: b */
    public static synchronized f21 m1576b() {
        try {
            if (f2274g == null) {
                f2274g = new f21();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2274g;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m1577e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        e21 e21Var = f2275h;
        e21Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) e21Var.m4362b(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m1578a(Context context, int i) {
        LayerDrawable layerDrawableM5728n;
        Object obj;
        Drawable drawableNewDrawable;
        int i2;
        if (this.f2278c == null) {
            this.f2278c = new TypedValue();
        }
        TypedValue typedValue = this.f2278c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            kk0 kk0Var = (kk0) this.f2277b.get(context);
            layerDrawableM5728n = null;
            if (kk0Var != null) {
                int iM3009b = kd0.m3009b(kk0Var.f4401k, kk0Var.f4403m, j);
                if (iM3009b < 0 || (obj = kk0Var.f4402l[iM3009b]) == m80.f5001l) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int iM3009b2 = kd0.m3009b(kk0Var.f4401k, kk0Var.f4403m, j);
                        if (iM3009b2 >= 0) {
                            Object[] objArr = kk0Var.f4402l;
                            Object obj2 = objArr[iM3009b2];
                            Object obj3 = m80.f5001l;
                            if (obj2 != obj3) {
                                objArr[iM3009b2] = obj3;
                                kk0Var.f4400j = true;
                            }
                        }
                    }
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.f2280e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM5728n = new LayerDrawable(new Drawable[]{m1579c(context, R.drawable.abc_cab_background_internal_bg), m1579c(context, 2131165203)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM5728n = C0902y5.m5728n(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM5728n = C0902y5.m5728n(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM5728n = C0902y5.m5728n(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM5728n == null) {
            return layerDrawableM5728n;
        }
        layerDrawableM5728n.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM5728n.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableM5728n;
                }
                kk0 kk0Var2 = (kk0) this.f2277b.get(context);
                if (kk0Var2 == null) {
                    kk0Var2 = new kk0();
                    int i3 = 4;
                    while (true) {
                        i2 = 80;
                        if (i3 >= 32) {
                            break;
                        }
                        int i4 = (1 << i3) - 12;
                        if (80 <= i4) {
                            i2 = i4;
                            break;
                        }
                        i3++;
                    }
                    int i5 = i2 / 8;
                    kk0Var2.f4401k = new long[i5];
                    kk0Var2.f4402l = new Object[i5];
                    this.f2277b.put(context, kk0Var2);
                }
                kk0Var2.m3047a(j, new WeakReference(constantState2));
                return layerDrawableM5728n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m1579c(Context context, int i) {
        return m1580d(context, i, false);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m1580d(Context context, int i, boolean z) {
        Drawable drawableM1578a;
        try {
            if (!this.f2279d) {
                this.f2279d = true;
                Drawable drawableM1579c = m1579c(context, R.drawable.abc_vector_test);
                if (drawableM1579c == null || !"android.graphics.drawable.VectorDrawable".equals(drawableM1579c.getClass().getName())) {
                    this.f2279d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM1578a = m1578a(context, i);
            if (drawableM1578a == null) {
                drawableM1578a = context.getDrawable(i);
            }
            if (drawableM1578a != null) {
                drawableM1578a = m1582g(context, i, z, drawableM1578a);
            }
            if (drawableM1578a != null) {
                AbstractC0890xu.m5688a(drawableM1578a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM1578a;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized ColorStateList m1581f(Context context, int i) {
        ColorStateList colorStateList;
        g91 g91Var;
        Object obj;
        WeakHashMap weakHashMap = this.f2276a;
        ColorStateList colorStateListM5733o = null;
        if (weakHashMap == null || (g91Var = (g91) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int iM3008a = kd0.m3008a(g91Var.f2669l, i, g91Var.f2667j);
            if (iM3008a < 0 || (obj = g91Var.f2668k[iM3008a]) == wm1.f8588c) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            C0902y5 c0902y5 = this.f2280e;
            if (c0902y5 != null) {
                colorStateListM5733o = c0902y5.m5733o(context, i);
            }
            if (colorStateListM5733o != null) {
                if (this.f2276a == null) {
                    this.f2276a = new WeakHashMap();
                }
                g91 g91Var2 = (g91) this.f2276a.get(context);
                if (g91Var2 == null) {
                    g91Var2 = new g91();
                    this.f2276a.put(context, g91Var2);
                }
                g91Var2.m2003a(i, colorStateListM5733o);
            }
            colorStateList = colorStateListM5733o;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m1582g(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterM1577e;
        ColorStateList colorStateListM1581f = m1581f(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM1581f != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListM1581f);
            if (this.f2280e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        C0902y5 c0902y5 = this.f2280e;
        int i2 = R.attr.colorControlNormal;
        if (c0902y5 != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM5878c = zc1.m5878c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0939z5.f9605b;
                C0902y5.m5729q(drawableFindDrawableByLayerId, iM5878c, mode2);
                C0902y5.m5729q(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), zc1.m5878c(context, R.attr.colorControlNormal), mode2);
                C0902y5.m5729q(layerDrawable.findDrawableByLayerId(android.R.id.progress), zc1.m5878c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM5877b = zc1.m5877b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0939z5.f9605b;
                C0902y5.m5729q(drawableFindDrawableByLayerId2, iM5877b, mode3);
                C0902y5.m5729q(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), zc1.m5878c(context, R.attr.colorControlActivated), mode3);
                C0902y5.m5729q(layerDrawable2.findDrawableByLayerId(android.R.id.progress), zc1.m5878c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0902y5 c0902y6 = this.f2280e;
        boolean z3 = false;
        if (c0902y6 != null) {
            PorterDuff.Mode mode4 = C0939z5.f9605b;
            if (C0902y5.m5726j((int[]) c0902y6.f9154a, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (C0902y5.m5726j((int[]) c0902y6.f9156c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zM5726j = C0902y5.m5726j((int[]) c0902y6.f9157d, i);
                    i2 = android.R.attr.colorBackground;
                    if (zM5726j) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131165223) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                int iM5878c2 = zc1.m5878c(context, i2);
                synchronized (C0939z5.class) {
                    porterDuffColorFilterM1577e = m1577e(iM5878c2, mode4);
                }
                drawableMutate2.setColorFilter(porterDuffColorFilterM1577e);
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
