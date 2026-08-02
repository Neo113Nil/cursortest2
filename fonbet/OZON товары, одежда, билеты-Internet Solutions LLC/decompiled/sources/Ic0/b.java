package Ic0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final AuthTokenDTO f12184a;

    public b(AuthTokenDTO authTokenDTO) {
        this.f12184a = authTokenDTO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f12184a, ((b) obj).f12184a);
    }

    public final int hashCode() {
        AuthTokenDTO authTokenDTO = this.f12184a;
        if (authTokenDTO == null) {
            return 0;
        }
        return authTokenDTO.hashCode();
    }

    @NotNull
    public final String toString() {
        return "InitAuthResult(token=" + this.f12184a + ")";
    }
}
