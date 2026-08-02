package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<X2.a> f42757d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final int f42758a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final u f42759b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f42760c = 0;

    w(@NonNull u uVar, int i11) {
        this.f42759b = uVar;
        this.f42758a = i11;
    }

    private X2.a g() {
        ThreadLocal<X2.a> threadLocal = f42757d;
        X2.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new X2.a();
            threadLocal.set(aVar);
        }
        this.f42759b.c().d(aVar, this.f42758a);
        return aVar;
    }

    public final void a(@NonNull Canvas canvas, @NonNull Paint paint, float f7, float f11) {
        u uVar = this.f42759b;
        Typeface f12 = uVar.f();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(f12);
        canvas.drawText(uVar.b(), this.f42758a * 2, 2, f7, f11, paint);
        paint.setTypeface(typeface);
    }

    public final int b(int i11) {
        return g().c(i11);
    }

    public final int c() {
        return g().d();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final int d() {
        return this.f42760c & 3;
    }

    public final int e() {
        return g().f();
    }

    public final int f() {
        return g().g();
    }

    public final short h() {
        return g().h();
    }

    public final int i() {
        return g().i();
    }

    public final boolean j() {
        return g().e();
    }

    public final boolean k() {
        return (this.f42760c & 4) > 0;
    }

    public final void l() {
        this.f42760c = (this.f42760c & 3) | 4;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final void m(boolean z11) {
        int i11 = this.f42760c & 4;
        this.f42760c = z11 ? i11 | 2 : i11 | 1;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c11 = c();
        for (int i11 = 0; i11 < c11; i11++) {
            sb2.append(Integer.toHexString(b(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
