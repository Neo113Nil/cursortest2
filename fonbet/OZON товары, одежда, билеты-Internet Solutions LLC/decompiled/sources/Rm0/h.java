package Rm0;

import B90.C2618u;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import k5.T;
import k5.Y1;

/* loaded from: classes4.dex */
final class h extends f implements b {

    /* renamed from: b, reason: collision with root package name */
    private final M8.b f25171b;

    /* renamed from: c, reason: collision with root package name */
    private final C2618u f25172c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.d<T> f25173d;

    h(@NonNull Context context, @NonNull M8.b bVar, @NonNull C2618u c2618u) {
        super(context);
        this.f25173d = (Jb.d) Jb.d.b(new Pc.a() { // from class: Rm0.g
            @Override // Pc.a
            public final Object get() {
                return h.c(h.this);
            }
        });
        this.f25171b = bVar;
        this.f25172c = c2618u;
    }

    public static T c(h hVar) {
        Y1 y12 = (Y1) hVar.b().a(Y1.class);
        y12.c();
        return new T(y12.w(), hVar.f25171b, hVar.f25172c);
    }

    @Override // Rm0.b
    @NonNull
    public final a a() {
        return (a) b().a(a.class);
    }

    protected final void d() {
        ((Y1) b().a(Y1.class)).c().d(Collections.singletonMap(a.class, this.f25173d.get()));
    }
}
