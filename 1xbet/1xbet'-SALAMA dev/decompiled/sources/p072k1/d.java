package p072k1;

import D6.y0;
import L.f;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p023d1.n;
import p067j1.b;
import p111p1.a;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14669f = n.g("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14672c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f14673d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14674e;

    public d(Context context, a aVar) {
        this.f14671b = context.getApplicationContext();
        this.f14670a = aVar;
    }

    public abstract Object a();

    public final void b(b bVar) {
        synchronized (this.f14672c) {
            try {
                if (this.f14673d.remove(bVar) && this.f14673d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f14672c) {
            try {
                Object obj2 = this.f14674e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f14674e = obj;
                    ((f) ((C1050x1) this.f14670a).f17933d).execute(new y0(29, this, new ArrayList(this.f14673d), false));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
