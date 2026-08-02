package W8;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f33314a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33315b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f33316c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f33317a = 0;

        /* renamed from: b, reason: collision with root package name */
        private boolean f33318b;

        /* renamed from: c, reason: collision with root package name */
        private ExecutorService f33319c;

        @NonNull
        public final b a() {
            return new b(this.f33317a, this.f33318b, this.f33319c);
        }

        @NonNull
        public final void b() {
            this.f33318b = true;
        }

        @NonNull
        public final void c(@NonNull int[] iArr, int i11) {
            this.f33317a = i11;
            if (iArr != null) {
                for (int i12 : iArr) {
                    this.f33317a = i12 | this.f33317a;
                }
            }
        }

        @NonNull
        public final void d(@NonNull ExecutorService executorService) {
            this.f33319c = executorService;
        }
    }

    /* synthetic */ b(int i11, boolean z11, ExecutorService executorService) {
        this.f33314a = i11;
        this.f33315b = z11;
        this.f33316c = executorService;
    }

    public final int a() {
        return this.f33314a;
    }

    public final Executor b() {
        return this.f33316c;
    }

    public final boolean c() {
        return this.f33315b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f33314a == bVar.f33314a && this.f33315b == bVar.f33315b && Objects.equal(this.f33316c, bVar.f33316c) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f33314a), Boolean.valueOf(this.f33315b), this.f33316c, null);
    }
}
