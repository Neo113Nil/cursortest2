package O7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class j {

    private static class a<T> implements i<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends i<? super T>> f20024a;

        private a() {
            throw null;
        }

        a(List list) {
            this.f20024a = list;
        }

        @Override // O7.i
        public final boolean apply(T t2) {
            int i11 = 0;
            while (true) {
                List<? extends i<? super T>> list = this.f20024a;
                if (i11 >= list.size()) {
                    return true;
                }
                if (!list.get(i11).apply(t2)) {
                    return false;
                }
                i11++;
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f20024a.equals(((a) obj).f20024a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f20024a.hashCode() + 306654252;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Predicates.and(");
            boolean z11 = true;
            for (T t2 : this.f20024a) {
                if (!z11) {
                    sb2.append(',');
                }
                sb2.append(t2);
                z11 = false;
            }
            sb2.append(')');
            return sb2.toString();
        }
    }

    public static <T> i<T> a(i<? super T> iVar, i<? super T> iVar2) {
        iVar.getClass();
        return new a(Arrays.asList(iVar, iVar2));
    }
}
