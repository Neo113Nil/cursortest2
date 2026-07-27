package sg.bigo.ads.k1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: sg.bigo.ads.k1.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5277s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13043a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ A c;

    public RunnableC5277s(A a2, C5270k c5270k, r rVar) {
        this.c = a2;
        this.f13043a = c5270k;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DisplayMetrics displayMetrics = this.c.b.getResources().getDisplayMetrics();
        Q q = this.c.g;
        q.b.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        q.a(q.b, q.c);
        int[] iArr = new int[2];
        A a2 = this.c;
        View view = a2.e;
        if (view == null) {
            View a3 = sg.bigo.ads.K0.X.a((Context) a2.f13013a.get(), a2.c);
            view = a3 instanceof ViewGroup ? (ViewGroup) a3 : a2.c;
        }
        view.getLocationOnScreen(iArr);
        Q q2 = this.c.g;
        int i = iArr[0];
        int i2 = iArr[1];
        q2.d.set(i, i2, view.getWidth() + i, view.getHeight() + i2);
        q2.a(q2.d, q2.e);
        this.c.c.getLocationOnScreen(iArr);
        A a4 = this.c;
        Q q3 = a4.g;
        int i3 = iArr[0];
        int i4 = iArr[1];
        q3.h.set(i3, i4, a4.c.getWidth() + i3, this.c.c.getHeight() + i4);
        q3.a(q3.h, q3.i);
        this.f13043a.getLocationOnScreen(iArr);
        Q q4 = this.c.g;
        int i5 = iArr[0];
        int i6 = iArr[1];
        q4.f.set(i5, i6, this.f13043a.getWidth() + i5, this.f13043a.getHeight() + i6);
        q4.a(q4.f, q4.g);
        A a5 = this.c;
        a5.k.a(a5.g);
        A a6 = this.c;
        C5271l c5271l = a6.l;
        if (c5271l.d != null) {
            c5271l.a(a6.g);
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
