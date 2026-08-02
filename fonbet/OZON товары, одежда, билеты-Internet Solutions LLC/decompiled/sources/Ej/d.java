package Ej;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.LogEntry;
import ru.ozon.android.ozonLogger.core.d;
import ru.ozon.android.ozonLogger.core.e;
import yj.C10910a;

/* loaded from: classes6.dex */
public abstract class d<E extends LogEntry, C extends ru.ozon.android.ozonLogger.core.d<? super E>, GC extends ru.ozon.android.ozonLogger.core.e<? super E>> {

    /* renamed from: a, reason: collision with root package name */
    private volatile GC f8003a;

    /* renamed from: b, reason: collision with root package name */
    private volatile o<E> f8004b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f8005c = new b();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f8006d = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f8007e;

    private static final void n() {
        p.c("OzonLoggerManager уже инициализирован! Убедитесь, что OzonLoggerManager.setup() вызывается только один раз! Текущий тред: " + Thread.currentThread() + ".", new IllegalStateException());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o(GC config) {
        p.d(config);
        boolean z11 = this.f8003a == null;
        this.f8003a = config;
        xj.d standardOutWriter = d(config);
        C10910a logDatabase = c(config, this.f8005c);
        Intrinsics.checkNotNullParameter(config, "config");
        h<? super E> network = new h<>(config);
        if (this.f8004b == null) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(standardOutWriter, "standardOutWriter");
            Intrinsics.checkNotNullParameter(logDatabase, "logDatabase");
            Intrinsics.checkNotNullParameter(network, "network");
            this.f8004b = new o<>(config, standardOutWriter, logDatabase, network);
        } else {
            i().i(config, standardOutWriter, logDatabase, network);
        }
        if (z11) {
            j();
        }
        o<E> i11 = i();
        int i12 = o.f8018h;
        i11.g(false);
    }

    public final void a() {
        i().d();
    }

    @NotNull
    protected abstract sj.c b();

    @NotNull
    protected abstract C10910a c(@NotNull ru.ozon.android.ozonLogger.core.e eVar, @NotNull b bVar);

    @NotNull
    protected abstract xj.d d(@NotNull ru.ozon.android.ozonLogger.core.e eVar);

    @NotNull
    public final File e(@NotNull String path, ru.ozon.android.ozonLogger.core.i iVar) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), 8192);
        try {
            Iterator<T> it = i().e().iterator();
            while (it.hasNext()) {
                bufferedWriter.write(((LogEntry) it.next()).formatted(iVar == null ? h().k() : iVar));
                bufferedWriter.write(System.lineSeparator());
            }
            Unit unit = Unit.f71690a;
            bufferedWriter.close();
            return file;
        } finally {
        }
    }

    @NotNull
    public final List<E> f() {
        return i().e();
    }

    @NotNull
    protected final b g() {
        return this.f8005c;
    }

    @NotNull
    protected final GC h() {
        GC gc2 = this.f8003a;
        if (gc2 != null) {
            return gc2;
        }
        try {
            sj.c b11 = b();
            ReentrantLock reentrantLock = this.f8006d;
            reentrantLock.lock();
            try {
                GC gc3 = this.f8003a;
                if (gc3 != null) {
                    return gc3;
                }
                o(b11);
                GC gc4 = this.f8003a;
                if (gc4 != null) {
                    return gc4;
                }
                throw new IllegalArgumentException("Не удалось инициализировать OzonLogger с помощью дефолтного конфига: unsafeConfig is null");
            } finally {
                reentrantLock.unlock();
            }
        } catch (Exception e11) {
            throw new IllegalStateException("Недопустимое внутреннее состояние OzonLogger! Вызовите OzonLoggerManager.setup() перед использованием!", e11);
        }
    }

    @NotNull
    protected final o<E> i() {
        o<E> oVar = this.f8004b;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Недопустимое внутреннее состояние OzonLogger! Вызовите OzonLoggerManager.setup() перед использованием!");
    }

    protected abstract void j();

    public final void k(@NotNull uj.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        i().f(listener);
    }

    public final void l(boolean z11) {
        h().p(z11);
        h().s(new c(z11));
    }

    public final void m(@NotNull sj.c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.f8007e) {
            n();
            return;
        }
        ReentrantLock reentrantLock = this.f8006d;
        reentrantLock.lock();
        try {
            if (this.f8007e) {
                n();
            } else {
                this.f8007e = true;
                o(config);
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void p(@NotNull uj.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        i().h(listener);
    }
}
