package A0;

import android.content.res.Resources;
import android.os.Build;
import h0.C1991e;

/* renamed from: A0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0062v extends kotlin.jvm.internal.j implements i4.f {
    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            throw new ClassCastException();
        }
        F f = (F) this.receiver;
        Resources resources = f.getContext().getResources();
        e0.b bVar = new e0.b(new W0.d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((C1991e) obj2).f17204a, (i4.c) obj3);
        if (Build.VERSION.SDK_INT >= 24) {
            return Boolean.valueOf(S.f386a.a(f, null, bVar));
        }
        throw null;
    }
}
