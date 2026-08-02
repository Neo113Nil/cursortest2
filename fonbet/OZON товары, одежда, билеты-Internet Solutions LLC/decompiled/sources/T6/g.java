package T6;

import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes9.dex */
public abstract class g {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a FATAL_ERROR;
        public static final a INVALID_PAYLOAD;
        public static final a OK;
        public static final a TRANSIENT_ERROR;

        static {
            a aVar = new a(DiscountCodeResponse.RESULT_OK, 0);
            OK = aVar;
            a aVar2 = new a("TRANSIENT_ERROR", 1);
            TRANSIENT_ERROR = aVar2;
            a aVar3 = new a("FATAL_ERROR", 2);
            FATAL_ERROR = aVar3;
            a aVar4 = new a("INVALID_PAYLOAD", 3);
            INVALID_PAYLOAD = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
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
    }

    public static g a() {
        return new b(a.FATAL_ERROR, -1L);
    }

    public static g d() {
        return new b(a.INVALID_PAYLOAD, -1L);
    }

    public static g e(long j11) {
        return new b(a.OK, j11);
    }

    public static g f() {
        return new b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
