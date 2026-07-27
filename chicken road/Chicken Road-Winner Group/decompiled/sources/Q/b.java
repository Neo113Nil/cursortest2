package Q;

import U.C0075o;
import U.u;
import android.graphics.Rect;
import android.view.View;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1156a;

    public b() {
        this.f1156a = new LinkedHashMap();
    }

    public static b a(u uVar, int i3) {
        if (i3 == 0) {
            return new C0075o(uVar, 0);
        }
        if (i3 == 1) {
            return new C0075o(uVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public b(u uVar) {
        new Rect();
        this.f1156a = uVar;
    }
}
