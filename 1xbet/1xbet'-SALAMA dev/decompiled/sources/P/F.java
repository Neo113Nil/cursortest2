package P;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5028d;

    public F() {
        if (p036e6.c.f12743b == null) {
            p036e6.c.f12743b = new p036e6.c(18);
        }
    }

    public int a(int i7) {
        if (i7 < this.f5027c) {
            return ((ByteBuffer) this.f5028d).getShort(this.f5026b + i7);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        C0346b c0346b;
        if (Build.VERSION.SDK_INT >= this.f5026b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f5026b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f5025a);
            if (!((Class) this.f5028d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = U.c(view);
            if (accessibilityDelegateC == null) {
                c0346b = null;
            } else {
                c0346b = accessibilityDelegateC instanceof C0345a ? ((C0345a) accessibilityDelegateC).f5043a : new C0346b(accessibilityDelegateC);
            }
            if (c0346b == null) {
                c0346b = new C0346b();
            }
            U.h(view, c0346b);
            view.setTag(this.f5025a, obj);
            U.e(view, this.f5027c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
