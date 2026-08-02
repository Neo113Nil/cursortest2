package Ej;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.AndroidLogEntry;
import ru.ozon.android.ozonLogger.core.LogEntry;

/* renamed from: Ej.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC2970a<E extends LogEntry> implements ru.ozon.android.ozonLogger.core.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sj.c f7998a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sj.a f7999b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o<E> f8000c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f8001d;

    public AbstractC2970a(@NotNull sj.c globalConfig, @NotNull sj.a config, @NotNull o repository, @NotNull b currentTimeProvider) {
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f7998a = globalConfig;
        this.f7999b = config;
        this.f8000c = repository;
        this.f8001d = currentTimeProvider;
    }

    @Override // ru.ozon.android.ozonLogger.core.h
    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        f(ru.ozon.android.ozonLogger.core.c.WARNING, message, null, null);
    }

    @Override // ru.ozon.android.ozonLogger.core.h
    public final void b(@NotNull String message, ru.ozon.android.ozonLogger.core.a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        f(ru.ozon.android.ozonLogger.core.c.DEBUG, message, aVar, bool);
    }

    @Override // ru.ozon.android.ozonLogger.core.h
    public final void c(@NotNull String message, ru.ozon.android.ozonLogger.core.a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        f(ru.ozon.android.ozonLogger.core.c.ERROR, message, aVar, bool);
    }

    @Override // ru.ozon.android.ozonLogger.core.h
    public final void d(@NotNull String message, xj.a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        f(ru.ozon.android.ozonLogger.core.c.INFO, message, aVar, bool);
    }

    @Override // ru.ozon.android.ozonLogger.core.h
    public final void e(@NotNull ru.ozon.android.ozonLogger.core.c level, @NotNull String message, String str, ru.ozon.android.ozonLogger.core.a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.length() == 0) {
            return;
        }
        this.f8001d.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        AndroidLogEntry androidLogEntry = new AndroidLogEntry(currentTimeMillis, level, message, null, aVar, bool, str, 8, null);
        this.f7999b.a(androidLogEntry);
        this.f7998a.t(androidLogEntry);
        this.f8000c.j(androidLogEntry);
    }

    @Override // ru.ozon.android.ozonLogger.core.h
    public final void f(@NotNull ru.ozon.android.ozonLogger.core.c level, @NotNull String message, ru.ozon.android.ozonLogger.core.a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        e(level, message, null, aVar, bool);
    }
}
