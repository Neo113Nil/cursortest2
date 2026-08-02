package androidx.lifecycle;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5434v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private AtomicReference<Object> f43392a = new AtomicReference<>(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: androidx.lifecycle.v$a */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        @NotNull
        public static final C0798a Companion;
        public static final a ON_ANY;
        public static final a ON_CREATE;
        public static final a ON_DESTROY;
        public static final a ON_PAUSE;
        public static final a ON_RESUME;
        public static final a ON_START;
        public static final a ON_STOP;

        /* renamed from: androidx.lifecycle.v$a$a, reason: collision with other inner class name */
        public static final class C0798a {

            /* renamed from: androidx.lifecycle.v$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0799a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f43393a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f43393a = iArr;
                }
            }

            public static a a(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i11 = C0799a.f43393a[state.ordinal()];
                if (i11 == 1) {
                    return a.ON_DESTROY;
                }
                if (i11 == 2) {
                    return a.ON_STOP;
                }
                if (i11 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public static a b(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i11 = C0799a.f43393a[state.ordinal()];
                if (i11 == 1) {
                    return a.ON_START;
                }
                if (i11 == 2) {
                    return a.ON_RESUME;
                }
                if (i11 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public static a c(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i11 = C0799a.f43393a[state.ordinal()];
                if (i11 == 1) {
                    return a.ON_CREATE;
                }
                if (i11 == 2) {
                    return a.ON_START;
                }
                if (i11 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        /* renamed from: androidx.lifecycle.v$a$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43394a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f43394a = iArr;
            }
        }

        static {
            a aVar = new a("ON_CREATE", 0);
            ON_CREATE = aVar;
            a aVar2 = new a("ON_START", 1);
            ON_START = aVar2;
            a aVar3 = new a("ON_RESUME", 2);
            ON_RESUME = aVar3;
            a aVar4 = new a("ON_PAUSE", 3);
            ON_PAUSE = aVar4;
            a aVar5 = new a("ON_STOP", 4);
            ON_STOP = aVar5;
            a aVar6 = new a("ON_DESTROY", 5);
            ON_DESTROY = aVar6;
            a aVar7 = new a("ON_ANY", 6);
            ON_ANY = aVar7;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            Companion = new C0798a();
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final b a() {
            switch (b.f43394a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: androidx.lifecycle.v$b */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CREATED;
        public static final b DESTROYED;
        public static final b INITIALIZED;
        public static final b RESUMED;
        public static final b STARTED;

        static {
            b bVar = new b("DESTROYED", 0);
            DESTROYED = bVar;
            b bVar2 = new b("INITIALIZED", 1);
            INITIALIZED = bVar2;
            b bVar3 = new b("CREATED", 2);
            CREATED = bVar3;
            b bVar4 = new b("STARTED", 3);
            STARTED = bVar4;
            b bVar5 = new b("RESUMED", 4);
            RESUMED = bVar5;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
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

        public final boolean a(@NotNull b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(@NotNull I i11);

    @NotNull
    public abstract b b();

    @NotNull
    public M0<b> c() {
        Ae.x0 a11 = O0.a(b());
        a(new C5433u(a11, 0));
        return C2399j.b(a11);
    }

    @NotNull
    public final AtomicReference<Object> d() {
        return this.f43392a;
    }

    public abstract void e(@NotNull I i11);
}
