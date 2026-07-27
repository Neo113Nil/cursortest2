package l3;

import B0.f;
import V0.j;
import e4.InterfaceC0412a;
import g3.C0454a;
import g3.C0455b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import m2.C1278a;
import m3.C1291a;
import m3.C1292b;
import r3.C1405a;
import r3.C1406b;

/* renamed from: l3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258d implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11046a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11047b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11048c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11049d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11050e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11051f;

    /* renamed from: g, reason: collision with root package name */
    public Object f11052g;

    public /* synthetic */ C1258d() {
        this.f11046a = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1257c a(C0455b c0455b, int i2) {
        byte[] a6;
        if (((AtomicBoolean) this.f11049d).get()) {
            ((Logger) this.f11047b).fine("Refusing to read from storage after being closed.");
            return null;
        }
        if (i2 > 3) {
            ((Logger) this.f11047b).log(Level.WARNING, "Maximum number of attempts to read buffered data exceeded.");
            return null;
        }
        C1291a c1291a = (C1291a) ((AtomicReference) this.f11052g).get();
        if (c1291a == null) {
            ((Logger) this.f11047b).finer("Obtaining a new readableFile from the folderManager.");
            C1256b c1256b = (C1256b) this.f11048c;
            synchronized (c1256b) {
                c1256b.f11039c = null;
                File a7 = c1256b.a();
                if (a7 != null) {
                    C1291a c1291a2 = new C1291a(a7, Long.parseLong(a7.getName()), c1256b.f11038b);
                    c1256b.f11039c = c1291a2;
                    c1291a = c1291a2;
                } else {
                    c1291a = null;
                }
            }
            ((AtomicReference) this.f11052g).set(c1291a);
            if (c1291a == null) {
                ((Logger) this.f11047b).fine("Unable to get or create readable file.");
                return null;
            }
        }
        ((Logger) this.f11047b).finer("Attempting to read data from " + c1291a);
        synchronized (c1291a) {
            if (!c1291a.f11199f.get()) {
                synchronized (c1291a) {
                    boolean z = TimeUnit.NANOSECONDS.toMillis(c1291a.f11197d.a(true)) >= c1291a.f11198e;
                    if (z) {
                        c1291a.close();
                    } else {
                        a6 = c1291a.f11196c.a();
                        if (a6 == null) {
                            c1291a.a();
                        }
                    }
                }
                if (a6 != null) {
                    try {
                        c0455b.getClass();
                        try {
                            C1405a c1405a = C1406b.f11722d;
                            c1405a.getClass();
                            ArrayList s2 = f.s((C1406b) c1405a.c(new C1278a(a6, 0, a6.length)));
                            ((AtomicBoolean) this.f11050e).set(true);
                            return new C1257c(this, s2, c1291a);
                        } catch (IOException e3) {
                            e = e3;
                            throw new C0454a(e);
                        } catch (IllegalStateException e6) {
                            e = e6;
                            throw new C0454a(e);
                        }
                    } catch (C0454a unused) {
                        c1291a.a();
                    }
                }
                ((AtomicReference) this.f11052g).set(null);
                return a(c0455b, i2 + 1);
            }
        }
        a6 = null;
        if (a6 != null) {
        }
        ((AtomicReference) this.f11052g).set(null);
        return a(c0455b, i2 + 1);
    }

    public boolean b(j jVar, int i2) {
        C1292b c1292b;
        if (((AtomicBoolean) this.f11049d).get()) {
            ((Logger) this.f11047b).fine("Refusing to write to storage after being closed.");
            return false;
        }
        if (i2 > 3) {
            ((Logger) this.f11047b).log(Level.WARNING, "Max number of attempts to write buffered data exceeded.");
            return false;
        }
        C1292b c1292b2 = (C1292b) ((AtomicReference) this.f11051f).get();
        if (c1292b2 == null) {
            C1256b c1256b = (C1256b) this.f11048c;
            synchronized (c1256b) {
                try {
                    long millis = TimeUnit.NANOSECONDS.toMillis(J3.d.f1367a.a(true));
                    File[] listFiles = c1256b.f11037a.listFiles();
                    if (listFiles != null) {
                        int i3 = 0;
                        for (File file : listFiles) {
                            if (millis > Long.parseLong(file.getName()) + c1256b.f11038b.f11641c) {
                                C1291a c1291a = c1256b.f11039c;
                                if (c1291a != null && file.equals(c1291a.f11194a)) {
                                    c1256b.f11039c.close();
                                }
                                if (file.delete()) {
                                    i3++;
                                }
                            }
                        }
                        if (i3 == 0) {
                            c1256b.b(listFiles);
                        }
                    }
                    c1292b = new C1292b(new File(c1256b.f11037a, String.valueOf(millis)), millis, c1256b.f11038b);
                    c1256b.f11040d = c1292b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AtomicReference) this.f11051f).set(c1292b);
            ((Logger) this.f11047b).finer("Created new writableFile: " + c1292b);
            c1292b2 = c1292b;
        }
        synchronized (c1292b2) {
            if (!c1292b2.f11205f.get()) {
                synchronized (c1292b2) {
                    boolean z = TimeUnit.NANOSECONDS.toMillis(c1292b2.f11202c.a(true)) >= c1292b2.f11203d;
                    if (z) {
                        c1292b2.close();
                    } else {
                        int i6 = c1292b2.f11206g + ((B3.e) jVar.f3212b).f283c;
                        c1292b2.f11201b.getClass();
                        if (i6 <= 1048576) {
                            jVar.T(c1292b2.f11204e);
                            c1292b2.f11206g = i6;
                            return true;
                        }
                        c1292b2.close();
                    }
                }
            }
        }
        ((AtomicReference) this.f11051f).set(null);
        return b(jVar, i2 + 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f11046a) {
            case 0:
                ((Logger) this.f11047b).fine("Closing disk buffering storage.");
                if (((AtomicBoolean) this.f11049d).compareAndSet(false, true)) {
                    ((C1256b) this.f11048c).close();
                    ((AtomicReference) this.f11051f).set(null);
                    ((AtomicReference) this.f11052g).set(null);
                    break;
                }
                break;
            default:
                ((c1.d) ((InterfaceC0412a) this.f11051f).get()).close();
                break;
        }
    }

    public C1258d(C1256b c1256b) {
        this.f11046a = 0;
        this.f11047b = Logger.getLogger(C1258d.class.getName());
        this.f11049d = new AtomicBoolean(false);
        this.f11050e = new AtomicBoolean(false);
        this.f11051f = new AtomicReference();
        this.f11052g = new AtomicReference();
        this.f11048c = c1256b;
    }
}
