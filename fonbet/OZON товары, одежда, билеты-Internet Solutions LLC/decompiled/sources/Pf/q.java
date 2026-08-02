package Pf;

import java.util.Objects;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    static final q f22497c;

    /* renamed from: a, reason: collision with root package name */
    private final b f22498a;

    /* renamed from: b, reason: collision with root package name */
    private final b f22499b;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        static final a f22500c;

        /* renamed from: a, reason: collision with root package name */
        private final q f22501a;

        /* renamed from: b, reason: collision with root package name */
        private final q f22502b;

        static {
            q qVar = q.f22497c;
            f22500c = new a(qVar, qVar);
        }

        public a(q qVar, q qVar2) {
            this.f22501a = qVar;
            this.f22502b = qVar2;
        }

        public final q a() {
            return this.f22501a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f22501a.equals(aVar.f22501a)) {
                return this.f22502b.equals(aVar.f22502b);
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f22501a, this.f22502b);
        }

        public final String toString() {
            StringBuilder b11 = Of.k.b();
            b11.append(this.f22501a);
            b11.append('=');
            b11.append(this.f22502b);
            return Of.k.l(b11);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f22503a;

        /* renamed from: b, reason: collision with root package name */
        private final int f22504b;

        /* renamed from: c, reason: collision with root package name */
        private final int f22505c;

        public b(int i11, int i12, int i13) {
            this.f22503a = i11;
            this.f22504b = i12;
            this.f22505c = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f22503a == bVar.f22503a && this.f22504b == bVar.f22504b && this.f22505c == bVar.f22505c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f22503a), Integer.valueOf(this.f22504b), Integer.valueOf(this.f22505c));
        }

        public final String toString() {
            return this.f22504b + "," + this.f22505c + ProductContainerDTO.RATIO_DELIMITER + this.f22503a;
        }
    }

    static {
        b bVar = new b(-1, -1, -1);
        f22497c = new q(bVar, bVar);
    }

    public q(b bVar, b bVar2) {
        this.f22498a = bVar;
        this.f22499b = bVar2;
    }

    public final boolean a() {
        return this != f22497c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f22498a.equals(qVar.f22498a)) {
            return this.f22499b.equals(qVar.f22499b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f22498a, this.f22499b);
    }

    public final String toString() {
        return this.f22498a + "-" + this.f22499b;
    }
}
