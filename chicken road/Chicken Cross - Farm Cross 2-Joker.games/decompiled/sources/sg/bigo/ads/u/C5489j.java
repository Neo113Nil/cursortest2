package sg.bigo.ads.u;

import android.view.View;

/* renamed from: sg.bigo.ads.u.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5489j extends sg.bigo.ads.E0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f13331a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public C5489j(boolean[] zArr, View view, boolean z, long j) {
        this.f13331a = zArr;
        this.b = view;
        this.c = z;
        this.d = j;
    }

    @Override // sg.bigo.ads.E0.k
    public final long a() {
        return this.d;
    }

    @Override // sg.bigo.ads.E0.k
    public final void a(int i) {
        boolean[] zArr = this.f13331a;
        zArr[1] = true;
        AbstractC5490k.a(this.b, zArr[0], true, this.c);
    }
}
