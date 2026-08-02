package Hi;

import We.C;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface l {

    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        private final long f11058a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Uri f11059b;

        /* renamed from: c, reason: collision with root package name */
        private final String f11060c;

        /* renamed from: d, reason: collision with root package name */
        private final C f11061d;

        public a(long j11, @NotNull Uri uri, String str, C c11) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f11058a = j11;
            this.f11059b = uri;
            this.f11060c = str;
            this.f11061d = c11;
        }

        public final String a() {
            return this.f11060c;
        }

        public final C b() {
            return this.f11061d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11058a == aVar.f11058a && Intrinsics.d(this.f11059b, aVar.f11059b) && Intrinsics.d(this.f11060c, aVar.f11060c) && Intrinsics.d(this.f11061d, aVar.f11061d);
        }

        @Override // Hi.l
        public final long getId() {
            return this.f11058a;
        }

        @Override // Hi.l
        @NotNull
        public final Uri getUri() {
            return this.f11059b;
        }

        public final int hashCode() {
            int hashCode = (this.f11059b.hashCode() + (Long.hashCode(this.f11058a) * 31)) * 31;
            String str = this.f11060c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C c11 = this.f11061d;
            return hashCode2 + (c11 != null ? c11.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Image(id=" + this.f11058a + ", uri=" + this.f11059b + ", fileName=" + this.f11060c + ", mediaType=" + this.f11061d + ")";
        }
    }

    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final long f11062a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Uri f11063b;

        /* renamed from: c, reason: collision with root package name */
        private final String f11064c;

        /* renamed from: d, reason: collision with root package name */
        private final C f11065d;

        /* renamed from: e, reason: collision with root package name */
        private final long f11066e;

        public b(long j11, @NotNull Uri uri, String str, C c11, long j12) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f11062a = j11;
            this.f11063b = uri;
            this.f11064c = str;
            this.f11065d = c11;
            this.f11066e = j12;
        }

        public final String a() {
            return this.f11064c;
        }

        public final C b() {
            return this.f11065d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11062a == bVar.f11062a && Intrinsics.d(this.f11063b, bVar.f11063b) && Intrinsics.d(this.f11064c, bVar.f11064c) && Intrinsics.d(this.f11065d, bVar.f11065d) && this.f11066e == bVar.f11066e;
        }

        @Override // Hi.l
        public final long getId() {
            return this.f11062a;
        }

        @Override // Hi.l
        @NotNull
        public final Uri getUri() {
            return this.f11063b;
        }

        public final int hashCode() {
            int hashCode = (this.f11063b.hashCode() + (Long.hashCode(this.f11062a) * 31)) * 31;
            String str = this.f11064c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C c11 = this.f11065d;
            return Long.hashCode(this.f11066e) + ((hashCode2 + (c11 != null ? c11.hashCode() : 0)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Video(id=");
            sb2.append(this.f11062a);
            sb2.append(", uri=");
            sb2.append(this.f11063b);
            sb2.append(", fileName=");
            sb2.append(this.f11064c);
            sb2.append(", mediaType=");
            sb2.append(this.f11065d);
            sb2.append(", duration=");
            return P4.f.a(this.f11066e, ")", sb2);
        }
    }

    long getId();

    @NotNull
    Uri getUri();
}
