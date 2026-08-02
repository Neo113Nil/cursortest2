package O9;

import android.graphics.Rect;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private N9.m f20120a;

    /* renamed from: b, reason: collision with root package name */
    private int f20121b;

    /* renamed from: c, reason: collision with root package name */
    private p f20122c = new l();

    public k(int i11, N9.m mVar) {
        this.f20121b = i11;
        this.f20120a = mVar;
    }

    public final N9.m a(ArrayList arrayList, boolean z11) {
        N9.m mVar = this.f20120a;
        if (mVar == null) {
            mVar = null;
        } else if (z11) {
            mVar = new N9.m(mVar.f18816b, mVar.f18815a);
        }
        p pVar = this.f20122c;
        pVar.getClass();
        if (mVar != null) {
            Collections.sort(arrayList, new o(pVar, mVar));
        }
        Log.i("p", "Viewfinder size: " + mVar);
        Log.i("p", "Preview in order of preference: " + arrayList);
        return (N9.m) arrayList.get(0);
    }

    public final int b() {
        return this.f20121b;
    }

    public final Rect c(N9.m mVar) {
        return this.f20122c.b(mVar, this.f20120a);
    }

    public final void d(p pVar) {
        this.f20122c = pVar;
    }
}
