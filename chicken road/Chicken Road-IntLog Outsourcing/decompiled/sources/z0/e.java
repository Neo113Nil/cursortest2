package z0;

import android.content.Context;
import g4.AbstractC0465j;
import java.util.LinkedHashSet;
import y0.AbstractC1552b;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final B4.i f12452a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12453b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12454c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f12455d;

    /* renamed from: e, reason: collision with root package name */
    public Object f12456e;

    public e(Context context, B4.i iVar) {
        this.f12452a = iVar;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "context.applicationContext");
        this.f12453b = applicationContext;
        this.f12454c = new Object();
        this.f12455d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(AbstractC1552b listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        synchronized (this.f12454c) {
            if (this.f12455d.remove(listener) && this.f12455d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f12454c) {
            Object obj2 = this.f12456e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f12456e = obj;
                ((A.c) this.f12452a.f313d).execute(new B3.c(AbstractC0465j.S0(this.f12455d), 27, this));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
