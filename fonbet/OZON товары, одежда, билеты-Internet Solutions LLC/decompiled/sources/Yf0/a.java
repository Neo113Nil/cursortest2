package Yf0;

import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Yf0.a$a, reason: collision with other inner class name */
    public static final class C0651a extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0651a f34993a = new C0651a(0);
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<String> f34994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull List<String> urls) {
            super(0);
            Intrinsics.checkNotNullParameter(urls, "urls");
            this.f34994a = urls;
        }

        @NotNull
        public final List<String> a() {
            return this.f34994a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f34994a, ((b) obj).f34994a);
        }

        public final int hashCode() {
            return this.f34994a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("WritenUrls(urls="), this.f34994a, ")");
        }
    }

    public /* synthetic */ a(int i11) {
        this();
    }

    private a() {
    }
}
