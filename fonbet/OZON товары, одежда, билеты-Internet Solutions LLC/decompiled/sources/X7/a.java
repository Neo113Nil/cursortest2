package X7;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f34153a = Logger.getLogger(a.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f34154b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: X7.a$a, reason: collision with other inner class name */
    public static abstract class EnumC0605a {
        private static final /* synthetic */ EnumC0605a[] $VALUES;
        public static final EnumC0605a ALGORITHM_NOT_FIPS;
        public static final EnumC0605a ALGORITHM_REQUIRES_BORINGCRYPTO;

        /* renamed from: X7.a$a$a, reason: collision with other inner class name */
        enum C0606a extends EnumC0605a {
            C0606a() {
                super("ALGORITHM_NOT_FIPS", 0);
            }

            @Override // X7.a.EnumC0605a
            public final boolean a() {
                return !a.b();
            }
        }

        /* renamed from: X7.a$a$b */
        enum b extends EnumC0605a {
            b() {
                super("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            }

            @Override // X7.a.EnumC0605a
            public final boolean a() {
                return !a.b() || a.a();
            }
        }

        static {
            C0606a c0606a = new C0606a();
            ALGORITHM_NOT_FIPS = c0606a;
            b bVar = new b();
            ALGORITHM_REQUIRES_BORINGCRYPTO = bVar;
            $VALUES = new EnumC0605a[]{c0606a, bVar};
        }

        private EnumC0605a() {
            throw null;
        }

        public static EnumC0605a valueOf(String str) {
            return (EnumC0605a) Enum.valueOf(EnumC0605a.class, str);
        }

        public static EnumC0605a[] values() {
            return (EnumC0605a[]) $VALUES.clone();
        }

        public abstract boolean a();
    }

    private a() {
    }

    public static boolean a() {
        Boolean bool;
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f34153a.info("Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static boolean b() {
        return f34154b.get();
    }
}
