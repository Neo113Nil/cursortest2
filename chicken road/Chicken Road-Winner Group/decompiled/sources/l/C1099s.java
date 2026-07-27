package l;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1099s {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f9875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9876b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9877c;

    public C1099s(C1100t c1100t, int i3, int i4) {
        this.f9875a = new WeakReference(c1100t);
        this.f9876b = i3;
        this.f9877c = i4;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new G0.m(24, this));
    }

    public final void b(Typeface typeface) {
        int i3;
        WeakReference weakReference = this.f9875a;
        C1100t c1100t = (C1100t) weakReference.get();
        if (c1100t == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f9876b) != -1) {
            typeface = Typeface.create(typeface, i3, (this.f9877c & 2) != 0);
        }
        c1100t.f9884a.post(new A.a(weakReference, 10, typeface));
    }
}
