package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.collection.C5155y;
import androidx.core.content.res.e;
import androidx.core.content.res.g;
import v2.C10195j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final l f42156a;

    /* renamed from: b, reason: collision with root package name */
    private static final C5155y<String, Typeface> f42157b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f42158c = 0;

    /* loaded from: classes8.dex */
    public static class a extends C10195j.c {

        /* renamed from: a, reason: collision with root package name */
        private g.e f42159a;

        public a(g.e eVar) {
            this.f42159a = eVar;
        }

        public final void a(int i11) {
            g.e eVar = this.f42159a;
            if (eVar != null) {
                eVar.b(i11);
            }
        }

        public final void b(@NonNull Typeface typeface) {
            g.e eVar = this.f42159a;
            if (eVar != null) {
                eVar.c(typeface);
            }
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            f42156a = new k();
        } else if (i11 >= 28) {
            f42156a = new j();
        } else {
            f42156a = new i();
        }
        f42157b = new C5155y<>(16);
    }

    public static Typeface a(@NonNull Context context, @NonNull C10195j.b[] bVarArr, int i11) {
        return f42156a.b(context, bVarArr, i11);
    }

    public static Typeface b(@NonNull Context context, @NonNull e.b bVar, @NonNull Resources resources, int i11, String str, int i12, int i13, g.e eVar, boolean z11) {
        Typeface a11;
        if (bVar instanceof e.C0767e) {
            e.C0767e c0767e = (e.C0767e) bVar;
            String c11 = c0767e.c();
            Typeface typeface = null;
            if (c11 != null && !c11.isEmpty()) {
                Typeface create = Typeface.create(c11, 0);
                Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                if (create != null && !create.equals(create2)) {
                    typeface = create;
                }
            }
            if (typeface != null) {
                if (eVar != null) {
                    new Handler(Looper.getMainLooper()).post(new androidx.core.content.res.h(eVar, typeface));
                }
                return typeface;
            }
            a11 = C10195j.b(context, c0767e.b(), i13, !z11 ? eVar != null : c0767e.a() != 0, z11 ? c0767e.d() : -1, new Handler(Looper.getMainLooper()), new a(eVar));
        } else {
            a11 = f42156a.a(context, (e.c) bVar, resources, i13);
            if (eVar != null) {
                if (a11 != null) {
                    new Handler(Looper.getMainLooper()).post(new androidx.core.content.res.h(eVar, a11));
                } else {
                    eVar.a(-3);
                }
            }
        }
        if (a11 != null) {
            f42157b.put(d(resources, i11, str, i12, i13), a11);
        }
        return a11;
    }

    public static Typeface c(@NonNull Context context, @NonNull Resources resources, int i11, String str, int i12, int i13) {
        Typeface c11 = f42156a.c(context, resources, i11, str, i13);
        if (c11 != null) {
            f42157b.put(d(resources, i11, str, i12, i13), c11);
        }
        return c11;
    }

    private static String d(Resources resources, int i11, String str, int i12, int i13) {
        return resources.getResourcePackageName(i11) + '-' + str + '-' + i12 + '-' + i11 + '-' + i13;
    }

    public static Typeface e(@NonNull Resources resources, int i11, String str, int i12, int i13) {
        return f42157b.get(d(resources, i11, str, i12, i13));
    }
}
