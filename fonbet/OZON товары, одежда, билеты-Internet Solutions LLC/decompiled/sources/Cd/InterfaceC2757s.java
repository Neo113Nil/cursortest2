package Cd;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Cd.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2757s {

    /* renamed from: Cd.s$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Sd.b f4770a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f4771b;

        /* renamed from: c, reason: collision with root package name */
        private final Jd.g f4772c;

        public a(Sd.b classId, Jd.g gVar, int i11) {
            gVar = (i11 & 4) != 0 ? null : gVar;
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f4770a = classId;
            this.f4771b = null;
            this.f4772c = gVar;
        }

        @NotNull
        public final Sd.b a() {
            return this.f4770a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f4770a, aVar.f4770a) && Intrinsics.d(this.f4771b, aVar.f4771b) && Intrinsics.d(this.f4772c, aVar.f4772c);
        }

        public final int hashCode() {
            int hashCode = this.f4770a.hashCode() * 31;
            byte[] bArr = this.f4771b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            Jd.g gVar = this.f4772c;
            return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Request(classId=" + this.f4770a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f4771b) + ", outerClass=" + this.f4772c + ')';
        }
    }
}
