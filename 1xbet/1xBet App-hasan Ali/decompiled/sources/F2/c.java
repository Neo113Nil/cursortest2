package F2;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.l;
import t2.C2418f;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: k, reason: collision with root package name */
    public final Context f1527k;

    public c(Context context) {
        this.f1527k = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return l.a(this.f1527k, ((c) obj).f1527k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1527k.hashCode();
    }

    @Override // F2.i
    public final Object i(C2418f c2418f) {
        DisplayMetrics displayMetrics = this.f1527k.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(aVar, aVar);
    }
}
