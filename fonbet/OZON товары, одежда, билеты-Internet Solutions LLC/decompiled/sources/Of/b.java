package Of;

import java.io.IOException;

/* loaded from: classes10.dex */
public abstract class b {

    static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final StringBuilder f20351a;

        a(StringBuilder sb2) {
            this.f20351a = sb2;
        }

        @Override // Of.b
        public final b a(char c11) {
            try {
                this.f20351a.append(c11);
                return this;
            } catch (IOException e11) {
                throw new Lb0.a(e11);
            }
        }

        @Override // Of.b
        public final b b(String str) {
            try {
                this.f20351a.append((CharSequence) str);
                return this;
            } catch (IOException e11) {
                throw new Lb0.a(e11);
            }
        }

        @Override // Of.b
        public final b c(char[] cArr, int i11) {
            try {
                this.f20351a.append((CharSequence) new String(cArr, 0, i11));
                return this;
            } catch (IOException e11) {
                throw new Lb0.a(e11);
            }
        }
    }

    /* renamed from: Of.b$b, reason: collision with other inner class name */
    static final class C0412b extends b {

        /* renamed from: a, reason: collision with root package name */
        private final StringBuilder f20352a;

        C0412b(StringBuilder sb2) {
            this.f20352a = sb2;
        }

        @Override // Of.b
        public final b a(char c11) {
            this.f20352a.append(c11);
            return this;
        }

        @Override // Of.b
        public final b b(String str) {
            this.f20352a.append((CharSequence) str);
            return this;
        }

        @Override // Of.b
        public final b c(char[] cArr, int i11) {
            this.f20352a.append(cArr, 0, i11);
            return this;
        }

        public final String toString() {
            return this.f20352a.toString();
        }
    }

    public static b d(StringBuilder sb2) {
        return sb2 != null ? new C0412b(sb2) : new a(sb2);
    }

    public abstract b a(char c11);

    public abstract b b(String str);

    public abstract b c(char[] cArr, int i11);
}
