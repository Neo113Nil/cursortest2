package B30;

import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: B30.a$a, reason: collision with other inner class name */
    public static final class EnumC0054a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC0054a[] $VALUES;
        public static final EnumC0054a CANCELED;
        public static final EnumC0054a FAILED;
        public static final EnumC0054a SUCCESS;

        static {
            EnumC0054a enumC0054a = new EnumC0054a("SUCCESS", 0);
            SUCCESS = enumC0054a;
            EnumC0054a enumC0054a2 = new EnumC0054a("CANCELED", 1);
            CANCELED = enumC0054a2;
            EnumC0054a enumC0054a3 = new EnumC0054a("FAILED", 2);
            FAILED = enumC0054a3;
            EnumC0054a[] enumC0054aArr = {enumC0054a, enumC0054a2, enumC0054a3};
            $VALUES = enumC0054aArr;
            $ENTRIES = Xc.b.a(enumC0054aArr);
        }

        private EnumC0054a() {
            throw null;
        }

        public static EnumC0054a valueOf(String str) {
            return (EnumC0054a) Enum.valueOf(EnumC0054a.class, str);
        }

        public static EnumC0054a[] values() {
            return (EnumC0054a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b AVAILABLE;
        public static final b NOT_AVAILABLE;
        public static final b NOT_ENROLLED;

        static {
            b bVar = new b("AVAILABLE", 0);
            AVAILABLE = bVar;
            b bVar2 = new b("NOT_AVAILABLE", 1);
            NOT_AVAILABLE = bVar2;
            b bVar3 = new b("NOT_ENROLLED", 2);
            NOT_ENROLLED = bVar3;
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

    @NotNull
    b a();

    boolean b();

    void c(@NotNull androidx.fragment.app.r rVar, @NotNull String str, Executor executor, @NotNull Function1<? super EnumC0054a, Unit> function1);

    void d(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull String str, Executor executor, @NotNull Function1<? super EnumC0054a, Unit> function1);
}
