package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f43001a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f43002b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f43003c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f43004d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ArrayList f43005e;

    W(int i11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f43001a = i11;
        this.f43002b = arrayList;
        this.f43003c = arrayList2;
        this.f43004d = arrayList3;
        this.f43005e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i11 = 0; i11 < this.f43001a; i11++) {
            androidx.core.view.Y.O((View) this.f43002b.get(i11), (String) this.f43003c.get(i11));
            androidx.core.view.Y.O((View) this.f43004d.get(i11), (String) this.f43005e.get(i11));
        }
    }
}
