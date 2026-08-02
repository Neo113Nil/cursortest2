package K1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC3429i {

    /* renamed from: K1.i$a */
    public static final class a extends AbstractC3429i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f15053a;

        /* renamed from: b, reason: collision with root package name */
        private final L f15054b;

        public a(@NotNull String str, L l11) {
            super(0);
            this.f15053a = str;
            this.f15054b = l11;
        }

        @Override // K1.AbstractC3429i
        public final InterfaceC3430j a() {
            return null;
        }

        @Override // K1.AbstractC3429i
        public final L b() {
            return this.f15054b;
        }

        @NotNull
        public final String c() {
            return this.f15053a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f15053a, aVar.f15053a) && Intrinsics.d(this.f15054b, aVar.f15054b);
        }

        public final int hashCode() {
            int hashCode = this.f15053a.hashCode() * 31;
            L l11 = this.f15054b;
            return (hashCode + (l11 != null ? l11.hashCode() : 0)) * 31;
        }

        @NotNull
        public final String toString() {
            return B3.D.c(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f15053a, ')');
        }
    }

    /* renamed from: K1.i$b */
    public static final class b extends AbstractC3429i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f15055a;

        /* renamed from: b, reason: collision with root package name */
        private final L f15056b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3430j f15057c;

        public /* synthetic */ b(String str, L l11) {
            this(str, l11, null);
        }

        @Override // K1.AbstractC3429i
        public final InterfaceC3430j a() {
            return this.f15057c;
        }

        @Override // K1.AbstractC3429i
        public final L b() {
            return this.f15056b;
        }

        @NotNull
        public final String c() {
            return this.f15055a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!Intrinsics.d(this.f15055a, bVar.f15055a)) {
                return false;
            }
            if (Intrinsics.d(this.f15056b, bVar.f15056b)) {
                return Intrinsics.d(this.f15057c, bVar.f15057c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f15055a.hashCode() * 31;
            L l11 = this.f15056b;
            int hashCode2 = (hashCode + (l11 != null ? l11.hashCode() : 0)) * 31;
            InterfaceC3430j interfaceC3430j = this.f15057c;
            return hashCode2 + (interfaceC3430j != null ? interfaceC3430j.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return B3.D.c(new StringBuilder("LinkAnnotation.Url(url="), this.f15055a, ')');
        }

        public b(@NotNull String str, L l11, InterfaceC3430j interfaceC3430j) {
            super(0);
            this.f15055a = str;
            this.f15056b = l11;
            this.f15057c = interfaceC3430j;
        }
    }

    public /* synthetic */ AbstractC3429i(int i11) {
        this();
    }

    public abstract InterfaceC3430j a();

    public abstract L b();

    private AbstractC3429i() {
    }
}
