package Vb0;

import Sc.C4001c;
import Sc.k;
import Sc.n;
import Vb0.e;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule$provideOzonIdPluginProvider$1;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    private static Limb2PluginProvidersModule$provideOzonIdPluginProvider$1 f28515b;

    /* renamed from: c, reason: collision with root package name */
    private static Ld0.c f28516c;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Object f28519f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Object f28520g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Object f28521h;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f28514a = new a(0);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f28517d = Pattern.compile("(\\$\\d+)+$");

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String[] f28518e = {b.class.getName(), a.class.getName(), Vb0.a.class.getName(), g.class.getName(), f.class.getName()};

    public static final class a {

        /* renamed from: Vb0.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0580a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f28522a;

            static {
                int[] iArr = new int[e.a.values().length];
                try {
                    iArr[e.a.Ozon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.a.Timber.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f28522a = iArr;
            }
        }

        public /* synthetic */ a(int i11) {
            this();
        }

        public static void a(@NotNull String message, @NotNull Map customFields) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(customFields, "customFields");
            b d11 = d();
            if (d11 != null) {
                d11.j(message, customFields);
            }
        }

        public static /* synthetic */ void b(a aVar, String str) {
            Map c11 = U.c();
            aVar.getClass();
            a(str, c11);
        }

        public static void c(a aVar, Throwable t2) {
            Map customFields = U.c();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(t2, "t");
            Intrinsics.checkNotNullParameter(customFields, "customFields");
            a(C4001c.b(t2), customFields);
        }

        private static b d() {
            int i11 = C0580a.f28522a[e.a().ordinal()];
            if (i11 == 1) {
                b bVar = (b) b.f28519f.getValue();
                if (bVar.i()) {
                    return bVar;
                }
                return null;
            }
            if (i11 != 2) {
                b bVar2 = (b) b.f28521h.getValue();
                if (bVar2.i()) {
                    return bVar2;
                }
                return null;
            }
            b bVar3 = (b) b.f28520g.getValue();
            if (bVar3.i()) {
                return bVar3;
            }
            return null;
        }

        public static void e(a aVar, String message) {
            Map<String, ? extends Object> customFields = U.c();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(customFields, "customFields");
            b d11 = d();
            if (d11 != null) {
                d11.k(message, customFields);
            }
        }

        public static void f(a aVar, String key, Exception t2) {
            Map customFields = U.c();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(t2, "t");
            Intrinsics.checkNotNullParameter(customFields, "customFields");
            b d11 = d();
            if (d11 != null) {
                d11.l(key, t2, customFields);
            }
        }

        private a() {
        }
    }

    /* renamed from: Vb0.b$b, reason: collision with other inner class name */
    static final class C0581b extends AbstractC7737t implements Function0<Vb0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0581b f28523b = new C0581b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Vb0.a invoke() {
            return new Vb0.a();
        }
    }

    static final class c extends AbstractC7737t implements Function0<f> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f28524b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final f invoke() {
            Fb0.f fVar = b.f28515b;
            if (fVar == null) {
                Intrinsics.n("ozonIdConfig");
                throw null;
            }
            Ld0.c cVar = b.f28516c;
            if (cVar != null) {
                return new f(fVar, cVar);
            }
            Intrinsics.n("limbDiStore");
            throw null;
        }
    }

    static final class d extends AbstractC7737t implements Function0<g> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f28525b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final g invoke() {
            return new g();
        }
    }

    static {
        n nVar = n.NONE;
        f28519f = k.a(nVar, c.f28524b);
        f28520g = k.a(nVar, d.f28525b);
        f28521h = k.a(nVar, C0581b.f28523b);
    }

    @NotNull
    protected static String h() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!C7705l.m(f28518e, stackTraceElement.getClassName())) {
                Intrinsics.checkNotNullExpressionValue(stackTraceElement, "first(...)");
                f28514a.getClass();
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                String j02 = h.j0('.', className, className);
                Matcher matcher = f28517d.matcher(j02);
                if (matcher.find()) {
                    j02 = matcher.replaceAll("");
                    Intrinsics.f(j02);
                }
                j02.getClass();
                return j02;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    protected abstract boolean i();

    protected abstract void j(@NotNull String str, @NotNull Map<String, ? extends Object> map);

    protected abstract void k(@NotNull String str, @NotNull Map<String, ? extends Object> map);

    protected abstract void l(@NotNull String str, @NotNull Exception exc, @NotNull Map map);
}
