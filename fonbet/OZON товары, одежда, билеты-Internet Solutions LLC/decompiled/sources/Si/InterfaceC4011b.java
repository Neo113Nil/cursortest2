package Si;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Si.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC4011b {

    /* renamed from: Si.b$a */
    public static final class a implements InterfaceC4011b {

        /* renamed from: a, reason: collision with root package name */
        private final int f26260a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final c f26261b;

        public a(int i11, @NotNull c selectedType) {
            Intrinsics.checkNotNullParameter(selectedType, "selectedType");
            this.f26260a = i11;
            this.f26261b = selectedType;
        }

        public final int a() {
            return this.f26260a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26260a == aVar.f26260a && this.f26261b == aVar.f26261b;
        }

        public final int hashCode() {
            return this.f26261b.hashCode() + (Integer.hashCode(this.f26260a) * 31);
        }

        @NotNull
        public final String toString() {
            return "LimitOfAttachments(maxCount=" + this.f26260a + ", selectedType=" + this.f26261b + ")";
        }
    }
}
