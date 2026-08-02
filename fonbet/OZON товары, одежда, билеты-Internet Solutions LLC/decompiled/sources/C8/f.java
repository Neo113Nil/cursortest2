package C8;

import C8.b;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes9.dex */
public abstract class f {

    public static abstract class a {
        @NonNull
        public abstract f a();

        @NonNull
        public abstract a b(@NonNull b bVar);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(long j11);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b AUTH_ERROR;
        public static final b BAD_CONFIG;
        public static final b OK;

        static {
            b bVar = new b(DiscountCodeResponse.RESULT_OK, 0);
            OK = bVar;
            b bVar2 = new b("BAD_CONFIG", 1);
            BAD_CONFIG = bVar2;
            b bVar3 = new b("AUTH_ERROR", 2);
            AUTH_ERROR = bVar3;
            $VALUES = new b[]{bVar, bVar2, bVar3};
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

    @NonNull
    public static a a() {
        b.a aVar = new b.a();
        aVar.d(0L);
        return aVar;
    }

    public abstract b b();

    public abstract String c();

    @NonNull
    public abstract long d();
}
