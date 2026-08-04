package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C0 f8320g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f8322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f8323b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f8324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Q3.o f8326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f8319f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final B0 f8321h = new B0(6);

    public static synchronized C0 b() {
        try {
            if (f8320g == null) {
                f8320g = new C0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8320g;
    }

    public static synchronized PorterDuffColorFilter e(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        B0 b7 = f8321h;
        b7.getClass();
        int i8 = (31 + i7) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) b7.get(Integer.valueOf(mode.hashCode() + i8));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(int i7, Context context) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f8324c == null) {
            this.f8324c = new TypedValue();
        }
        TypedValue typedValue = this.f8324c;
        context.getResources().getValue(i7, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            p122r.f fVar = (p122r.f) this.f8323b.get(context);
            drawableNewDrawable = null;
            if (fVar != null && (weakReference = (WeakReference) fVar.c(j, null)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iB = p122r.e.b(fVar.f15992b, fVar.f15994d, j);
                    if (iB >= 0) {
                        Object[] objArr = fVar.f15993c;
                        Object obj = objArr[iB];
                        Object obj2 = p122r.f.f15990e;
                        if (obj != obj2) {
                            objArr[iB] = obj2;
                            fVar.f15991a = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableG = null;
        if (this.f8326e != null) {
            if (i7 == R.drawable.abc_cab_background_top_material) {
                layerDrawableG = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
            } else if (i7 == R.drawable.abc_ratingbar_material) {
                layerDrawableG = Q3.o.g(this, context, R.dimen.abc_star_big);
            } else if (i7 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableG = Q3.o.g(this, context, R.dimen.abc_star_medium);
            } else if (i7 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableG = Q3.o.g(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableG != null) {
            layerDrawableG.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawableG.getConstantState();
                    if (constantState2 != null) {
                        p122r.f fVar2 = (p122r.f) this.f8323b.get(context);
                        if (fVar2 == null) {
                            fVar2 = new p122r.f();
                            this.f8323b.put(context, fVar2);
                        }
                        fVar2.d(j, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawableG;
    }

    public final synchronized Drawable c(Context context, int i7) {
        return d(context, i7, false);
    }

    public final synchronized Drawable d(Context context, int i7, boolean z4) {
        Drawable drawableA;
        try {
            if (!this.f8325d) {
                this.f8325d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof P0.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f8325d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(i7, context);
            if (drawableA == null) {
                drawableA = G.h.getDrawable(context, i7);
            }
            if (drawableA != null) {
                drawableA = g(context, i7, z4, drawableA);
            }
            if (drawableA != null) {
                AbstractC0616f0.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(int i7, Context context) {
        ColorStateList colorStateList;
        p122r.m mVar;
        WeakHashMap weakHashMap = this.f8322a;
        ColorStateList colorStateListH = null;
        colorStateList = (weakHashMap == null || (mVar = (p122r.m) weakHashMap.get(context)) == null) ? null : (ColorStateList) mVar.b(i7, null);
        if (colorStateList == null) {
            Q3.o oVar = this.f8326e;
            if (oVar != null) {
                colorStateListH = oVar.h(i7, context);
            }
            if (colorStateListH != null) {
                if (this.f8322a == null) {
                    this.f8322a = new WeakHashMap();
                }
                p122r.m mVar2 = (p122r.m) this.f8322a.get(context);
                if (mVar2 == null) {
                    mVar2 = new p122r.m();
                    this.f8322a.put(context, mVar2);
                }
                mVar2.a(i7, colorStateListH);
            }
            colorStateList = colorStateListH;
        }
        return colorStateList;
    }

    public final Drawable g(Context context, int i7, boolean z4, Drawable drawable) {
        boolean z7;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterE;
        int i8 = R.attr.colorControlNormal;
        int i9 = R.attr.colorControlActivated;
        ColorStateList colorStateListF = f(i7, context);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            int[] iArr = AbstractC0616f0.f8620a;
            Drawable drawableMutate = drawable.mutate();
            J.a.h(drawableMutate, colorStateListF);
            if (this.f8326e != null && i7 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawableMutate;
            }
            J.a.i(drawableMutate, mode);
            return drawableMutate;
        }
        if (this.f8326e != null) {
            if (i7 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = X0.c(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode2 = C0644u.f8746b;
                Q3.o.o(drawableFindDrawableByLayerId, iC, mode2);
                Q3.o.o(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), X0.c(R.attr.colorControlNormal, context), mode2);
                Q3.o.o(layerDrawable.findDrawableByLayerId(android.R.id.progress), X0.c(R.attr.colorControlActivated, context), mode2);
                return drawable;
            }
            if (i7 == R.drawable.abc_ratingbar_material || i7 == R.drawable.abc_ratingbar_indicator_material || i7 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = X0.b(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode3 = C0644u.f8746b;
                Q3.o.o(drawableFindDrawableByLayerId2, iB, mode3);
                Q3.o.o(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), X0.c(R.attr.colorControlActivated, context), mode3);
                Q3.o.o(layerDrawable2.findDrawableByLayerId(android.R.id.progress), X0.c(R.attr.colorControlActivated, context), mode3);
                return drawable;
            }
        }
        Q3.o oVar = this.f8326e;
        boolean z8 = false;
        if (oVar != null) {
            PorterDuff.Mode mode4 = C0644u.f8746b;
            if (Q3.o.b(i7, (int[]) oVar.f5822a)) {
                z7 = true;
                iRound = -1;
            } else {
                if (!Q3.o.b(i7, (int[]) oVar.f5824c)) {
                    boolean zB = Q3.o.b(i7, (int[]) oVar.f5825d);
                    i9 = android.R.attr.colorBackground;
                    if (zB) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i7 == 2131165221) {
                        iRound = Math.round(40.8f);
                        i8 = android.R.attr.colorForeground;
                        z7 = true;
                    } else {
                        if (i7 != R.drawable.abc_dialog_material_background) {
                            i8 = 0;
                            z7 = false;
                        }
                        iRound = -1;
                    }
                }
                i8 = i9;
                z7 = true;
                iRound = -1;
            }
            if (z7) {
                int[] iArr2 = AbstractC0616f0.f8620a;
                Drawable drawableMutate2 = drawable.mutate();
                int iC2 = X0.c(i8, context);
                synchronized (C0644u.class) {
                    porterDuffColorFilterE = e(iC2, mode4);
                }
                drawableMutate2.setColorFilter(porterDuffColorFilterE);
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z8 = true;
            }
        }
        if (z8 || !z4) {
            return drawable;
        }
        return null;
    }
}
