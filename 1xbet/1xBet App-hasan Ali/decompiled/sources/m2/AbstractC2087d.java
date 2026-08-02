package m2;

import D3.h;
import D3.n;
import android.content.Context;
import f2.m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import r2.InterfaceC2348a;

/* renamed from: m2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2087d {
    public static final String f = m.f("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2348a f17984a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17985b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17986c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f17987d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f17988e;

    public AbstractC2087d(Context context, InterfaceC2348a interfaceC2348a) {
        this.f17985b = context.getApplicationContext();
        this.f17984a = interfaceC2348a;
    }

    public abstract Object a();

    public final void b(l2.b bVar) {
        synchronized (this.f17986c) {
            try {
                if (this.f17987d.remove(bVar) && this.f17987d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f17986c) {
            try {
                Object obj2 = this.f17988e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f17988e = obj;
                    ((n) ((v3.e) this.f17984a).f20434n).execute(new h(21, this, new ArrayList(this.f17987d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
