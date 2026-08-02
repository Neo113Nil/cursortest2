package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.core.content.res.e;
import androidx.core.content.res.g;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f42097a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<d, SparseArray<c>> f42098b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f42099c = new Object();

    static class a {
        static Drawable a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getDrawable(i11, theme);
        }

        static Drawable b(Resources resources, int i11, int i12, Resources.Theme theme) {
            return resources.getDrawableForDensity(i11, i12, theme);
        }
    }

    static class b {
        static int a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getColor(i11, theme);
        }

        @NonNull
        static ColorStateList b(@NonNull Resources resources, int i11, Resources.Theme theme) {
            return resources.getColorStateList(i11, theme);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f42100a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f42101b;

        /* renamed from: c, reason: collision with root package name */
        final int f42102c;

        c(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, Resources.Theme theme) {
            this.f42100a = colorStateList;
            this.f42101b = configuration;
            this.f42102c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Resources f42103a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f42104b;

        d(@NonNull Resources resources, Resources.Theme theme) {
            this.f42103a = resources;
            this.f42104b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f42103a.equals(dVar.f42103a) && Objects.equals(this.f42104b, dVar.f42104b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f42103a, this.f42104b);
        }
    }

    public static abstract class e {
        public final void a(final int i11) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.core.content.res.i
                @Override // java.lang.Runnable
                public final void run() {
                    g.e.this.b(i11);
                }
            });
        }

        public abstract void b(int i11);

        public abstract void c(@NonNull Typeface typeface);
    }

    /* loaded from: classes8.dex */
    public static final class f {

        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f42105a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f42106b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f42107c;

            @SuppressLint({"BanUncheckedReflection"})
            static void a(@NonNull Resources.Theme theme) {
                synchronized (f42105a) {
                    if (!f42107c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f42106b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e11) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e11);
                        }
                        f42107c = true;
                    }
                    Method method = f42106b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e12) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e12);
                            f42106b = null;
                        }
                    }
                }
            }
        }

        static class b {
            static void a(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(@NonNull Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static Typeface a(int i11, @NonNull Context context) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return h(context, i11, new TypedValue(), 0, null, false, true);
    }

    public static int b(@NonNull Resources resources, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i11, theme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x003f, code lost:
    
        if (r4.f42102c == r9.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList c(@NonNull Resources resources, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        c cVar;
        d dVar = new d(resources, theme);
        synchronized (f42099c) {
            try {
                SparseArray<c> sparseArray = f42098b.get(dVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i11)) != null) {
                    if (cVar.f42101b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (cVar.f42102c != 0) {
                            }
                            colorStateList2 = cVar.f42100a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i11);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = f42097a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i11, typedValue, true);
        int i12 = typedValue.type;
        if (i12 < 28 || i12 > 31) {
            try {
                colorStateList = androidx.core.content.res.c.a(resources, resources.getXml(i11), theme);
            } catch (Exception e11) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e11);
            }
        }
        if (colorStateList == null) {
            return b.b(resources, i11, theme);
        }
        synchronized (f42099c) {
            try {
                WeakHashMap<d, SparseArray<c>> weakHashMap = f42098b;
                SparseArray<c> sparseArray2 = weakHashMap.get(dVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray2);
                }
                sparseArray2.append(i11, new c(colorStateList, dVar.f42103a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static Drawable d(@NonNull Resources resources, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        return a.a(resources, i11, theme);
    }

    public static Typeface e(int i11, @NonNull Context context) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return h(context, i11, new TypedValue(), 0, null, false, false);
    }

    public static Typeface f(@NonNull Context context, int i11, @NonNull TypedValue typedValue, int i12, e eVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return h(context, i11, typedValue, i12, eVar, true, false);
    }

    public static void g(@NonNull Context context, int i11, @NonNull e eVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            eVar.a(-4);
        } else {
            h(context, i11, new TypedValue(), 0, eVar, false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface h(@NonNull Context context, int i11, @NonNull TypedValue typedValue, int i12, e eVar, boolean z11, boolean z12) {
        Resources resources = context.getResources();
        resources.getValue(i11, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i11) + "\" (" + Integer.toHexString(i11) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            Typeface e11 = androidx.core.graphics.g.e(resources, i11, charSequence2, typedValue.assetCookie, i12);
            if (e11 != null) {
                if (eVar != null) {
                    new Handler(Looper.getMainLooper()).post(new h(eVar, e11));
                }
                typeface = e11;
            } else if (!z12) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        e.b a11 = androidx.core.content.res.e.a(resources.getXml(i11), resources);
                        if (a11 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (eVar != null) {
                                eVar.a(-3);
                            }
                        } else {
                            try {
                                typeface = androidx.core.graphics.g.b(context, a11, resources, i11, charSequence2, typedValue.assetCookie, i12, eVar, z11);
                            } catch (IOException e12) {
                                e = e12;
                                charSequence2 = charSequence2;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                                if (eVar != null) {
                                    eVar.a(-3);
                                }
                                if (typeface == null) {
                                }
                                return typeface;
                            } catch (XmlPullParserException e13) {
                                e = e13;
                                charSequence2 = charSequence2;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e);
                                if (eVar != null) {
                                }
                                if (typeface == null) {
                                }
                                return typeface;
                            }
                        }
                    } else {
                        Typeface c11 = androidx.core.graphics.g.c(context, resources, i11, charSequence2, typedValue.assetCookie, i12);
                        if (eVar != null) {
                            if (c11 != null) {
                                new Handler(Looper.getMainLooper()).post(new h(eVar, c11));
                            } else {
                                eVar.a(-3);
                            }
                        }
                        typeface = c11;
                    }
                } catch (IOException e14) {
                    e = e14;
                } catch (XmlPullParserException e15) {
                    e = e15;
                }
            }
        } else if (eVar != null) {
            eVar.a(-3);
        }
        if (typeface == null || eVar != null || z12) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i11) + " could not be retrieved.");
    }
}
