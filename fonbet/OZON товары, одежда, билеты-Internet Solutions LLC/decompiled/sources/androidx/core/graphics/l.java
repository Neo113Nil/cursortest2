package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.core.content.res.e;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import v2.C10195j;

/* loaded from: classes.dex */
class l {

    /* loaded from: classes8.dex */
    final class a implements b<C10195j.b> {
        a() {
        }

        @Override // androidx.core.graphics.l.b
        public final int a(C10195j.b bVar) {
            return bVar.d();
        }

        @Override // androidx.core.graphics.l.b
        public final boolean b(C10195j.b bVar) {
            return bVar.e();
        }
    }

    /* loaded from: classes8.dex */
    private interface b<T> {
        int a(T t2);

        boolean b(T t2);
    }

    l() {
        new ConcurrentHashMap();
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i11) {
        throw null;
    }

    public Typeface b(Context context, @NonNull C10195j.b[] bVarArr, int i11) {
        throw null;
    }

    public Typeface c(Context context, Resources resources, int i11, String str, int i12) {
        File d11 = m.d(context);
        if (d11 == null) {
            return null;
        }
        try {
            if (m.b(d11, resources, i11)) {
                return Typeface.createFromFile(d11.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d11.delete();
        }
    }

    protected C10195j.b d(int i11, C10195j.b[] bVarArr) {
        a aVar = new a();
        int i12 = (i11 & 1) == 0 ? 400 : 700;
        boolean z11 = (i11 & 2) != 0;
        C10195j.b bVar = null;
        int i13 = Integer.MAX_VALUE;
        for (C10195j.b bVar2 : bVarArr) {
            int abs = (Math.abs(aVar.a(bVar2) - i12) * 2) + (aVar.b(bVar2) == z11 ? 0 : 1);
            if (bVar == null || i13 > abs) {
                bVar = bVar2;
                i13 = abs;
            }
        }
        return bVar;
    }
}
