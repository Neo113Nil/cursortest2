package p022d0;

import D6.C;
import U0.i;
import X0.j;
import Y4.D;
import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p010b0.C0734e;
import p010b0.O;
import p010b0.T;
import p030e0.d;
import p155w1.C1013m0;
import t6.h;
import w6.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f12333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f12334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12335c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile d f12336d;

    public b(Function1 function1, C c3) {
        this.f12333a = function1;
        this.f12334b = c3;
    }

    @Override // w6.a
    public final Object getValue(Object obj, A6.d dVar) {
        d dVar2;
        Context context = (Context) obj;
        h.e(context, "thisRef");
        h.e(dVar, "property");
        d dVar3 = this.f12336d;
        if (dVar3 != null) {
            return dVar3;
        }
        synchronized (this.f12335c) {
            try {
                if (this.f12336d == null) {
                    Context applicationContext = context.getApplicationContext();
                    Function1 function1 = this.f12333a;
                    h.d(applicationContext, "applicationContext");
                    List list = (List) function1.invoke(applicationContext);
                    C c3 = this.f12334b;
                    j jVar = new j(1, applicationContext, this);
                    h.e(list, "migrations");
                    this.f12336d = new d(new d(new O(new T(new i(jVar, 3)), D.D(new C0734e(list, null)), new C1013m0(14), c3)));
                }
                dVar2 = this.f12336d;
                h.b(dVar2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar2;
    }
}
