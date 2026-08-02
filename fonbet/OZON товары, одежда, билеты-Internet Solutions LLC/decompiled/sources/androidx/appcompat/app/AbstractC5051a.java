package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* renamed from: androidx.appcompat.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5051a {

    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes8.dex */
    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z11);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    void h() {
    }

    public abstract boolean i(int i11, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z11);

    public abstract void m(boolean z11);

    public abstract void n();

    public abstract void o();

    public abstract void p(int i11);

    public abstract void q(Drawable drawable);

    public abstract void r(boolean z11);

    public abstract void s(String str);

    public abstract void t(CharSequence charSequence);

    public androidx.appcompat.view.b u(b.a aVar) {
        return null;
    }

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0712a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f37109a;

        public C0712a(C0712a c0712a) {
            super((ViewGroup.MarginLayoutParams) c0712a);
            this.f37109a = 0;
            this.f37109a = c0712a.f37109a;
        }

        public C0712a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f37109a = 0;
        }
    }
}
