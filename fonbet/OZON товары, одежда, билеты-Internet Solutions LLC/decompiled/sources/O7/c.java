package O7;

/* loaded from: classes.dex */
public abstract class c implements i<Character> {

    static abstract class a extends c {
        @Override // O7.i
        @Deprecated
        public final boolean apply(Character ch2) {
            return a(ch2.charValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final char f20013a;

        b(char c11) {
            this.f20013a = c11;
        }

        @Override // O7.c
        public final boolean a(char c11) {
            return c11 == this.f20013a;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
            char[] cArr = new char[6];
            cArr[0] = '\\';
            cArr[1] = 'u';
            cArr[2] = 0;
            cArr[3] = 0;
            cArr[4] = 0;
            cArr[5] = 0;
            char c11 = this.f20013a;
            for (int i11 = 0; i11 < 4; i11++) {
                cArr[5 - i11] = "0123456789ABCDEF".charAt(c11 & 15);
                c11 = (char) (c11 >> 4);
            }
            sb2.append(String.copyValueOf(cArr));
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* renamed from: O7.c$c, reason: collision with other inner class name */
    static abstract class AbstractC0400c extends a {
        public final String toString() {
            return "CharMatcher.none()";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d extends AbstractC0400c {

        /* renamed from: a, reason: collision with root package name */
        static final c f20014a = new d();

        @Override // O7.c
        public final boolean a(char c11) {
            return false;
        }
    }

    public abstract boolean a(char c11);
}
