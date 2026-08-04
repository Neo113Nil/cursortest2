package p165y;

import android.view.View;
import r6.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f18106d;

    @Override // p165y.f
    public final void d(View view, float f7) {
        float fA = a(f7);
        float[] fArr = this.f18106d;
        fArr[0] = fA;
        a.d(null, view, fArr);
    }
}
