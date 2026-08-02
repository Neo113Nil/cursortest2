package Ej;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.AndroidLogEntry;
import ru.ozon.android.ozonLogger.core.LogEntry;
import yj.C10910a;

/* loaded from: classes6.dex */
public final class o<E extends LogEntry> {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final ThreadPoolExecutor f8017g = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new j());

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f8018h = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private ru.ozon.android.ozonLogger.core.e<? super E> f8019a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private u<? super E> f8020b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private C10910a f8021c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private h<? super E> f8022d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ThreadPoolExecutor f8023e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList f8024f;

    public o(ru.ozon.android.ozonLogger.core.e config, u standardOutWriter, C10910a logDatabase, h network) {
        ThreadPoolExecutor logDbAccessThread = f8017g;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(standardOutWriter, "standardOutWriter");
        Intrinsics.checkNotNullParameter(logDatabase, "logDatabase");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(logDbAccessThread, "logDbAccessThread");
        this.f8019a = config;
        this.f8020b = standardOutWriter;
        this.f8021c = logDatabase;
        this.f8022d = network;
        this.f8023e = logDbAccessThread;
        this.f8024f = new CopyOnWriteArrayList();
    }

    public static void a(o oVar, AndroidLogEntry androidLogEntry) {
        oVar.f8021c.a(androidLogEntry);
        oVar.g(false);
        Iterator it = oVar.f8024f.iterator();
        while (it.hasNext()) {
            ((ru.ozon.android.ozonLogger.core.g) it.next()).a(androidLogEntry);
        }
    }

    public static void b(o oVar) {
        oVar.f8021c.c();
        p.b("All logs are deleted");
    }

    public static void c(o oVar, boolean z11) {
        long i11 = oVar.f8021c.i();
        if (!z11 && i11 < oVar.f8019a.e()) {
            StringBuilder b11 = Ql.c.b(i11, "Count of logs to send (", oVar.f8019a.e(), ") is less than batch size (");
            b11.append(")");
            p.b(b11.toString());
            return;
        }
        Tc.b h11 = oVar.f8021c.h();
        if (h11.isEmpty()) {
            p.b("There is no logs to send");
        } else {
            try {
                oVar.f8022d.b(h11);
                oVar.f8021c.f(h11);
                p.b("Successfully sent logs:\n" + C7714v.V(h11, "\n\t", "\t", null, new l(), 28));
            } catch (IOException e11) {
                p.c("Logs are not sent, will try next time!", e11);
            }
        }
        oVar.f8021c.d();
        p.b("Expired logs are deleted");
    }

    public final void d() {
        this.f8023e.execute(new n(this, 0));
    }

    @NotNull
    public final List<E> e() {
        return this.f8021c.g();
    }

    public final void f(@NotNull uj.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8024f.add(listener);
    }

    public final void g(final boolean z11) {
        this.f8023e.execute(new Runnable() { // from class: Ej.k
            @Override // java.lang.Runnable
            public final void run() {
                o.c(o.this, z11);
            }
        });
    }

    public final void h(@NotNull uj.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8024f.remove(listener);
    }

    public final void i(@NotNull ru.ozon.android.ozonLogger.core.e<? super E> config, @NotNull u<? super E> standardOutWriter, @NotNull C10910a logDatabase, @NotNull h<? super E> network) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(standardOutWriter, "standardOutWriter");
        Intrinsics.checkNotNullParameter(logDatabase, "logDatabase");
        Intrinsics.checkNotNullParameter(network, "network");
        this.f8021c.b();
        this.f8019a = config;
        this.f8020b = standardOutWriter;
        this.f8021c = logDatabase;
        this.f8022d = network;
    }

    public final void j(@NotNull final AndroidLogEntry logEntry) {
        Intrinsics.checkNotNullParameter(logEntry, "logEntry");
        this.f8020b.a(logEntry);
        this.f8023e.execute(new Runnable() { // from class: Ej.i
            @Override // java.lang.Runnable
            public final void run() {
                o.a(o.this, logEntry);
            }
        });
    }
}
