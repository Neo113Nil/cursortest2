package O7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f20018a;

        /* renamed from: b, reason: collision with root package name */
        private final b f20019b;

        /* renamed from: c, reason: collision with root package name */
        private b f20020c;

        /* renamed from: O7.g$a$a, reason: collision with other inner class name */
        private static final class C0401a extends b {
        }

        static class b {

            /* renamed from: a, reason: collision with root package name */
            String f20021a;

            /* renamed from: b, reason: collision with root package name */
            Object f20022b;

            /* renamed from: c, reason: collision with root package name */
            b f20023c;
        }

        a(String str) {
            b bVar = new b();
            this.f20019b = bVar;
            this.f20020c = bVar;
            this.f20018a = str;
        }

        public final void a(int i11, String str) {
            String valueOf = String.valueOf(i11);
            C0401a c0401a = new C0401a();
            this.f20020c.f20023c = c0401a;
            this.f20020c = c0401a;
            c0401a.f20022b = valueOf;
            c0401a.f20021a = str;
        }

        public final void b(long j11, String str) {
            String valueOf = String.valueOf(j11);
            C0401a c0401a = new C0401a();
            this.f20020c.f20023c = c0401a;
            this.f20020c = c0401a;
            c0401a.f20022b = valueOf;
            c0401a.f20021a = str;
        }

        public final void c(String str, String str2) {
            b bVar = new b();
            this.f20020c.f20023c = bVar;
            this.f20020c = bVar;
            bVar.f20022b = str2;
            bVar.f20021a = str;
        }

        public final void d(Object obj) {
            b bVar = new b();
            this.f20020c.f20023c = bVar;
            this.f20020c = bVar;
            bVar.f20022b = obj;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f20018a);
            sb2.append('{');
            b bVar = this.f20019b.f20023c;
            String str = "";
            while (bVar != null) {
                Object obj = bVar.f20022b;
                boolean z11 = bVar instanceof C0401a;
                sb2.append(str);
                String str2 = bVar.f20021a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb2.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                bVar = bVar.f20023c;
                str = ", ";
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static <T> T a(T t2, T t11) {
        if (t2 != null) {
            return t2;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
