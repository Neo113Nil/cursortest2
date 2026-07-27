package l3;

import g3.C0455b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: l3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final C1258d f11053a;

    /* renamed from: b, reason: collision with root package name */
    public final C0455b f11054b;

    /* renamed from: d, reason: collision with root package name */
    public C1257c f11056d;

    /* renamed from: c, reason: collision with root package name */
    public final Logger f11055c = Logger.getLogger(C1259e.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public boolean f11057e = false;

    public C1259e(C1258d c1258d, C0455b c0455b) {
        this.f11053a = c1258d;
        this.f11054b = c0455b;
    }

    public final synchronized boolean a() {
        C1258d c1258d;
        C0455b c0455b;
        try {
            try {
                C1257c c1257c = this.f11056d;
                if (c1257c != null) {
                    if (!this.f11057e) {
                        return true;
                    }
                    c1257c.a();
                    this.f11056d.close();
                    this.f11056d = null;
                }
                this.f11057e = false;
                c1258d = this.f11053a;
                c0455b = this.f11054b;
            } catch (IOException e3) {
                this.f11055c.log(Level.SEVERE, "Error reading from storage", (Throwable) e3);
            }
            if (((AtomicBoolean) c1258d.f11050e).get()) {
                throw new IllegalStateException("You must close any previous ReadableResult before requesting a new one");
            }
            C1257c a6 = c1258d.a(c0455b, 1);
            if (a6 != null) {
                this.f11056d = a6;
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.Iterator
    public final synchronized boolean hasNext() {
        if (((AtomicBoolean) this.f11053a.f11049d).get()) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = null;
            if (!((AtomicBoolean) this.f11053a.f11049d).get()) {
                if (a()) {
                    this.f11057e = true;
                    C1257c c1257c = this.f11056d;
                    Objects.requireNonNull(c1257c);
                    arrayList = c1257c.f11041a;
                }
            }
        }
        return arrayList;
    }

    @Override // java.util.Iterator
    public final synchronized void remove() {
        C1257c c1257c = this.f11056d;
        if (c1257c != null) {
            try {
                c1257c.a();
            } catch (IOException e3) {
                this.f11055c.log(Level.SEVERE, "Error deleting stored item", (Throwable) e3);
            }
        }
    }
}
