package Ed0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Retrofit f7858a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7859b;

    public i(@NotNull Retrofit retrofit, boolean z11) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.f7858a = retrofit;
        this.f7859b = z11;
    }

    @NotNull
    public final Retrofit a() {
        return this.f7858a;
    }

    public final boolean b() {
        return this.f7859b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f7858a, iVar.f7858a) && this.f7859b == iVar.f7859b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7859b) + (this.f7858a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RetrofitWrapper(retrofit=" + this.f7858a + ", isSharedNetworkClientEnabled=" + this.f7859b + ")";
    }
}
