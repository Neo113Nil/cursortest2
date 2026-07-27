package sg.bigo.ads.E0;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f12272a;
    public final Object b;
    public final int c;

    public n(View view, Object obj, int i) {
        this.f12272a = view;
        this.b = obj;
        this.c = i;
    }

    public abstract int a();

    public int a(float f) {
        return p.a(f, a(), this.c);
    }

    public abstract void a(int i);

    public abstract void a(boolean z);
}
