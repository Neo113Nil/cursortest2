package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C5064i;
import androidx.collection.C5153w;
import androidx.collection.C5155y;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: g, reason: collision with root package name */
    private static T f37812g;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, androidx.collection.a0<ColorStateList>> f37814a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<Context, C5153w<WeakReference<Drawable.ConstantState>>> f37815b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f37816c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37817d;

    /* renamed from: e, reason: collision with root package name */
    private b f37818e;

    /* renamed from: f, reason: collision with root package name */
    private static final PorterDuff.Mode f37811f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    private static final a f37813h = new a(6);

    private static class a extends C5155y<Integer, PorterDuffColorFilter> {
    }

    public interface b {
    }

    private Drawable a(int i11, @NonNull Context context) {
        Drawable drawable;
        if (this.f37816c == null) {
            this.f37816c = new TypedValue();
        }
        TypedValue typedValue = this.f37816c;
        context.getResources().getValue(i11, typedValue, true);
        long j11 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C5153w<WeakReference<Drawable.ConstantState>> c5153w = this.f37815b.get(context);
            drawable = null;
            if (c5153w != null) {
                WeakReference<Drawable.ConstantState> b11 = c5153w.b(j11);
                if (b11 != null) {
                    Drawable.ConstantState constantState = b11.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        c5153w.g(j11);
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        b bVar = this.f37818e;
        LayerDrawable c11 = bVar == null ? null : ((C5064i.a) bVar).c(this, context, i11);
        if (c11 == null) {
            return c11;
        }
        c11.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = c11.getConstantState();
                if (constantState2 != null) {
                    C5153w<WeakReference<Drawable.ConstantState>> c5153w2 = this.f37815b.get(context);
                    if (c5153w2 == null) {
                        c5153w2 = new C5153w<>();
                        this.f37815b.put(context, c5153w2);
                    }
                    c5153w2.f(j11, new WeakReference<>(constantState2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11;
    }

    public static synchronized T b() {
        T t2;
        synchronized (T.class) {
            try {
                if (f37812g == null) {
                    f37812g = new T();
                }
                t2 = f37812g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t2;
    }

    public static synchronized PorterDuffColorFilter e(int i11, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (T.class) {
            a aVar = f37813h;
            aVar.getClass();
            int i12 = (31 + i11) * 31;
            porterDuffColorFilter = aVar.get(Integer.valueOf(mode.hashCode() + i12));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i11, mode);
                aVar.put(Integer.valueOf(mode.hashCode() + i12), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    static void i(Drawable drawable, Z z11, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z12 = z11.f37852d;
        if (!z12 && !z11.f37851c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z12 ? z11.f37849a : null;
        PorterDuff.Mode mode = z11.f37851c ? z11.f37850b : f37811f;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = e(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable c(@NonNull Context context, int i11) {
        return d(context, i11, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        androidx.core.graphics.drawable.a.k(r2, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized Drawable d(@NonNull Context context, int i11, boolean z11) {
        Drawable a11;
        boolean z12 = false;
        synchronized (this) {
            try {
                if (!this.f37817d) {
                    this.f37817d = true;
                    Drawable c11 = c(context, R.drawable.abc_vector_test);
                    if (c11 == null || (!(c11 instanceof androidx.vectordrawable.graphics.drawable.e) && !"android.graphics.drawable.VectorDrawable".equals(c11.getClass().getName()))) {
                        this.f37817d = false;
                        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                    }
                }
                a11 = a(i11, context);
                if (a11 == null) {
                    a11 = androidx.core.content.a.getDrawable(context, i11);
                }
                if (a11 != null) {
                    ColorStateList f7 = f(i11, context);
                    PorterDuff.Mode mode = null;
                    if (f7 != null) {
                        a11 = a11.mutate();
                        androidx.core.graphics.drawable.a.j(a11, f7);
                        if (this.f37818e != null && i11 == R.drawable.abc_switch_thumb_material) {
                            mode = PorterDuff.Mode.MULTIPLY;
                        }
                    } else {
                        b bVar = this.f37818e;
                        if (bVar == null || !((C5064i.a) bVar).g(context, i11, a11)) {
                            b bVar2 = this.f37818e;
                            if (bVar2 != null && ((C5064i.a) bVar2).h(context, i11, a11)) {
                                z12 = true;
                            }
                            if (!z12 && z11) {
                                a11 = null;
                            }
                        }
                    }
                }
                if (a11 != null) {
                    H.a(a11);
                }
            } finally {
            }
        }
        return a11;
    }

    final synchronized ColorStateList f(int i11, @NonNull Context context) {
        ColorStateList colorStateList;
        androidx.collection.a0<ColorStateList> a0Var;
        WeakHashMap<Context, androidx.collection.a0<ColorStateList>> weakHashMap = this.f37814a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (a0Var = weakHashMap.get(context)) == null) ? null : (ColorStateList) androidx.collection.b0.c(a0Var, i11);
        if (colorStateList == null) {
            b bVar = this.f37818e;
            if (bVar != null) {
                colorStateList2 = ((C5064i.a) bVar).e(i11, context);
            }
            if (colorStateList2 != null) {
                if (this.f37814a == null) {
                    this.f37814a = new WeakHashMap<>();
                }
                androidx.collection.a0<ColorStateList> a0Var2 = this.f37814a.get(context);
                if (a0Var2 == null) {
                    a0Var2 = new androidx.collection.a0<>();
                    this.f37814a.put(context, a0Var2);
                }
                a0Var2.a(i11, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final synchronized void g(@NonNull Context context) {
        C5153w<WeakReference<Drawable.ConstantState>> c5153w = this.f37815b.get(context);
        if (c5153w != null) {
            c5153w.a();
        }
    }

    public final synchronized void h(b bVar) {
        this.f37818e = bVar;
    }
}
