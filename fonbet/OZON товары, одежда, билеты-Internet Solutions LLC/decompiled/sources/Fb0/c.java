package Fb0;

import C.o0;
import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

@InterfaceC3999a
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9247a;

    /* renamed from: b, reason: collision with root package name */
    private final AuthTokenDTO f9248b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9249c;

    public /* synthetic */ c(boolean z11, AuthTokenDTO authTokenDTO, int i11) {
        this(z11, (i11 & 2) != 0 ? null : authTokenDTO, (String) null);
    }

    public final String a() {
        return this.f9249c;
    }

    public final boolean b() {
        return this.f9247a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9247a == cVar.f9247a && Intrinsics.d(this.f9248b, cVar.f9248b) && Intrinsics.d(this.f9249c, cVar.f9249c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f9247a) * 31;
        AuthTokenDTO authTokenDTO = this.f9248b;
        int hashCode2 = (hashCode + (authTokenDTO == null ? 0 : authTokenDTO.hashCode())) * 31;
        String str = this.f9249c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoginResult(isSignedIn=");
        sb2.append(this.f9247a);
        sb2.append(", authTokenDTO=");
        sb2.append(this.f9248b);
        sb2.append(", redirectDeeplink=");
        return o0.c(sb2, this.f9249c, ")");
    }

    public c(boolean z11, AuthTokenDTO authTokenDTO, String str) {
        this.f9247a = z11;
        this.f9248b = authTokenDTO;
        this.f9249c = str;
    }
}
