package Ej;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static ru.ozon.android.ozonLogger.core.e<?> f8025a;

    /* loaded from: classes10.dex */
    public static final class a extends RuntimeException {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ASSERT;
        public static final b DEBUG;
        public static final b ERROR;

        static {
            b bVar = new b("ASSERT", 0);
            ASSERT = bVar;
            b bVar2 = new b("ERROR", 1);
            ERROR = bVar2;
            b bVar3 = new b("DEBUG", 2);
            DEBUG = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static void a(RuntimeException runtimeException, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        e(b.ASSERT, message, runtimeException);
    }

    public static void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        e(b.DEBUG, message, null);
    }

    public static void c(@NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        e(b.ERROR, message, th2);
    }

    public static void d(@NotNull ru.ozon.android.ozonLogger.core.e config) {
        Intrinsics.checkNotNullParameter(config, "config");
        f8025a = config;
    }

    private static void e(b bVar, String str, Throwable th2) {
        ru.ozon.android.ozonLogger.core.e<?> eVar = f8025a;
        if (eVar == null) {
            throw new IllegalStateException("SelfLogger is not initialized!");
        }
        if (eVar.m()) {
            if (bVar == b.DEBUG) {
                ru.ozon.android.ozonLogger.core.e<?> eVar2 = f8025a;
                if (eVar2 == null) {
                    throw new IllegalStateException("SelfLogger is not initialized!");
                }
                if (!eVar2.i().isDebugEnabled()) {
                    return;
                }
            }
            if (bVar == b.ERROR) {
                ru.ozon.android.ozonLogger.core.e<?> eVar3 = f8025a;
                if (eVar3 == null) {
                    throw new IllegalStateException("SelfLogger is not initialized!");
                }
                if (!eVar3.i().b()) {
                    return;
                }
            }
            b bVar2 = b.ASSERT;
            if (bVar == bVar2) {
                ru.ozon.android.ozonLogger.core.e<?> eVar4 = f8025a;
                if (eVar4 == null) {
                    throw new IllegalStateException("SelfLogger is not initialized!");
                }
                if (!eVar4.i().c()) {
                    return;
                }
            }
            r.f8026a.a(bVar, str, th2);
            if (bVar == bVar2) {
                if (th2 != null) {
                    throw th2;
                }
                throw new a();
            }
        }
    }
}
