package k1;

import D6.y0;
import android.content.Context;
import d1.n;
import j1.AbstractC1301b;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p1.InterfaceC1533a;
import w1.C1759x1;

/* renamed from: k1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1332d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f14663f = n.g("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1533a f14664a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14665b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14666c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f14667d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f14668e;

    public AbstractC1332d(Context context, InterfaceC1533a interfaceC1533a) {
        this.f14665b = context.getApplicationContext();
        this.f14664a = interfaceC1533a;
    }

    public abstract Object a();

    public final void b(AbstractC1301b abstractC1301b) {
        synchronized (this.f14666c) {
            try {
                if (this.f14667d.remove(abstractC1301b) && this.f14667d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f14666c) {
            try {
                Object obj2 = this.f14668e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f14668e = obj;
                    ((L.f) ((C1759x1) this.f14664a).f17927d).execute(new y0(29, this, new ArrayList(this.f14667d), false));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
