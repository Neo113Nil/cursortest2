package Z30;

import B50.e;
import Ca.h;
import F90.d;
import U50.l;
import U50.m;
import a40.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: Z30.a$a, reason: collision with other inner class name */
    public static final class C0655a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0656a f35352a = new C0656a();

        /* renamed from: Z30.a$a$a, reason: collision with other inner class name */
        public static final class C0656a implements a {
            @Override // Z30.a
            public final void a(b source) {
                Intrinsics.checkNotNullParameter(source, "source");
            }

            @Override // Z30.a
            public final b.a.C0690a b(Function1 postMessageCallback, m contextProvider, e allowBridge, h fragmentManagerProvider) {
                Intrinsics.checkNotNullParameter(postMessageCallback, "postMessageCallback");
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                Intrinsics.checkNotNullParameter(allowBridge, "allowBridge");
                Intrinsics.checkNotNullParameter(fragmentManagerProvider, "fragmentManagerProvider");
                return b.a.a();
            }

            @Override // Z30.a
            public final b c() {
                return b.DefaultAssets;
            }

            @Override // Z30.a
            public final void d(d contextProvider, l jsScriptInjector) {
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                Intrinsics.checkNotNullParameter(jsScriptInjector, "jsScriptInjector");
                jsScriptInjector.invoke(null);
            }
        }

        @NotNull
        public static C0656a a() {
            return f35352a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DefaultAssets;
        public static final b NewDownloaded;
        public static final b None;

        static {
            b bVar = new b("DefaultAssets", 0);
            DefaultAssets = bVar;
            b bVar2 = new b("NewDownloaded", 1);
            NewDownloaded = bVar2;
            b bVar3 = new b("None", 2);
            None = bVar3;
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

    void a(@NotNull b bVar);

    @NotNull
    b.a.C0690a b(@NotNull Function1 function1, @NotNull m mVar, @NotNull e eVar, @NotNull h hVar);

    @NotNull
    b c();

    void d(@NotNull d dVar, @NotNull l lVar);
}
