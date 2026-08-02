package C8;

import C8.a;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes9.dex */
public abstract class d {

    public static abstract class a {
        @NonNull
        public abstract d a();

        @NonNull
        public abstract a b(@NonNull f fVar);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(@NonNull String str);

        @NonNull
        public abstract a e(@NonNull b bVar);

        @NonNull
        public abstract a f(@NonNull String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BAD_CONFIG;
        public static final b OK;

        static {
            b bVar = new b(DiscountCodeResponse.RESULT_OK, 0);
            OK = bVar;
            b bVar2 = new b("BAD_CONFIG", 1);
            BAD_CONFIG = bVar2;
            $VALUES = new b[]{bVar, bVar2};
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
        return new a.C0110a();
    }

    public abstract f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
