package N3;

import C.o0;

/* loaded from: classes.dex */
public interface H {

    /* loaded from: classes8.dex */
    public static class b implements H {

        /* renamed from: a, reason: collision with root package name */
        private final long f18504a;

        /* renamed from: b, reason: collision with root package name */
        private final a f18505b;

        public b(long j11) {
            this(j11, 0L);
        }

        @Override // N3.H
        public final long getDurationUs() {
            return this.f18504a;
        }

        @Override // N3.H
        public final a getSeekPoints(long j11) {
            return this.f18505b;
        }

        @Override // N3.H
        public final boolean isSeekable() {
            return false;
        }

        public b(long j11, long j12) {
            this.f18504a = j11;
            I i11 = j12 == 0 ? I.f18506c : new I(0L, j12);
            this.f18505b = new a(i11, i11);
        }
    }

    long getDurationUs();

    a getSeekPoints(long j11);

    boolean isSeekable();

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final I f18502a;

        /* renamed from: b, reason: collision with root package name */
        public final I f18503b;

        public a(I i11) {
            this.f18502a = i11;
            this.f18503b = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f18502a.equals(aVar.f18502a) && this.f18503b.equals(aVar.f18503b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f18503b.hashCode() + (this.f18502a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("[");
            I i11 = this.f18502a;
            sb2.append(i11);
            I i12 = this.f18503b;
            if (i11.equals(i12)) {
                str = "";
            } else {
                str = ", " + i12;
            }
            return o0.c(sb2, str, "]");
        }

        public a(I i11, I i12) {
            this.f18502a = i11;
            this.f18503b = i12;
        }
    }
}
