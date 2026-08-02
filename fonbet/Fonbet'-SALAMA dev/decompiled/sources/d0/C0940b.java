package d0;

import D6.C;
import X0.j;
import Y4.D;
import android.content.Context;
import b0.C0757e;
import b0.O;
import b0.T;
import java.util.List;
import kotlin.jvm.functions.Function1;
import w1.C1722m0;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940b implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f12327a;

    /* renamed from: b, reason: collision with root package name */
    public final C f12328b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12329c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile e0.d f12330d;

    public C0940b(Function1 function1, C c3) {
        this.f12327a = function1;
        this.f12328b = c3;
    }

    @Override // w6.a
    public final Object getValue(Object obj, A6.d dVar) {
        e0.d dVar2;
        Context context = (Context) obj;
        t6.h.e(context, "thisRef");
        t6.h.e(dVar, "property");
        e0.d dVar3 = this.f12330d;
        if (dVar3 != null) {
            return dVar3;
        }
        synchronized (this.f12329c) {
            try {
                if (this.f12330d == null) {
                    Context applicationContext = context.getApplicationContext();
                    Function1 function1 = this.f12327a;
                    t6.h.d(applicationContext, "applicationContext");
                    List list = (List) function1.invoke(applicationContext);
                    C c3 = this.f12328b;
                    j jVar = new j(1, applicationContext, this);
                    t6.h.e(list, "migrations");
                    this.f12330d = new e0.d(new e0.d(new O(new T(new U0.i(jVar, 3)), D.D(new C0757e(list, null)), new C1722m0(14), c3)));
                }
                dVar2 = this.f12330d;
                t6.h.b(dVar2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar2;
    }
}
