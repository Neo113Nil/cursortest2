package R;

import J.m;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.InterfaceC5121u0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.c1;
import java.util.UUID;

/* loaded from: classes8.dex */
final class d implements b1.a<c, e, d> {

    /* renamed from: a, reason: collision with root package name */
    private final C5123v0 f23865a;

    d(@NonNull C5123v0 c5123v0) {
        Object obj;
        this.f23865a = c5123v0;
        Object obj2 = null;
        try {
            obj = c5123v0.a(m.f12652c);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls != null && !cls.equals(c.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        this.f23865a.U(b1.f38264D, c1.b.STREAM_SHARING);
        T.a<Class<?>> aVar = m.f12652c;
        C5123v0 c5123v02 = this.f23865a;
        c5123v02.U(aVar, c.class);
        try {
            obj2 = c5123v02.a(m.f12651b);
        } catch (IllegalArgumentException unused2) {
        }
        if (obj2 == null) {
            c5123v02.U(m.f12651b, c.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // C.B
    @NonNull
    public final InterfaceC5121u0 a() {
        return this.f23865a;
    }

    @Override // androidx.camera.core.impl.b1.a
    @NonNull
    public final e b() {
        return new e(A0.Q(this.f23865a));
    }
}
