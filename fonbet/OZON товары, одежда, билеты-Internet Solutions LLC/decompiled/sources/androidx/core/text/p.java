package androidx.core.text;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final o f42219a = new c(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final o f42220b = new c(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final o f42221c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f42222d;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final a f42223a = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class b implements o {

        /* renamed from: a, reason: collision with root package name */
        private final a f42224a;

        b(a aVar) {
            this.f42224a = aVar;
        }

        @Override // androidx.core.text.o
        public final boolean a(int i11, CharSequence charSequence) {
            if (charSequence == null || i11 < 0 || charSequence.length() - i11 < 0) {
                throw new IllegalArgumentException();
            }
            if (this.f42224a == null) {
                return b();
            }
            char c11 = 2;
            for (int i12 = 0; i12 < i11 && c11 == 2; i12++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i12));
                o oVar = p.f42219a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c11 = 2;
                                break;
                        }
                    }
                    c11 = 0;
                }
                c11 = 1;
            }
            if (c11 == 0) {
                return true;
            }
            if (c11 != 1) {
                return b();
            }
            return false;
        }

        protected abstract boolean b();
    }

    private static class c extends b {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f42225b;

        c(a aVar, boolean z11) {
            super(aVar);
            this.f42225b = z11;
        }

        @Override // androidx.core.text.p.b
        protected final boolean b() {
            return this.f42225b;
        }
    }

    static {
        a aVar = a.f42223a;
        f42221c = new c(aVar, false);
        f42222d = new c(aVar, true);
    }
}
