package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* loaded from: classes10.dex */
public final class Dg extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final V8 f28863a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkAuthRequestBody.AuthMethod f28864b;

    public Dg() {
        this.f28863a = null;
        this.f28864b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dg)) {
            return false;
        }
        Dg dg2 = (Dg) obj;
        return Intrinsics.d(this.f28863a, dg2.f28863a) && this.f28864b == dg2.f28864b;
    }

    public final int hashCode() {
        V8 v82 = this.f28863a;
        int hashCode = (v82 == null ? 0 : v82.hashCode()) * 31;
        SdkAuthRequestBody.AuthMethod authMethod = this.f28864b;
        return hashCode + (authMethod != null ? authMethod.hashCode() : 0);
    }

    public final String toString() {
        return "StartSdkAuth(authModel=" + this.f28863a + ", authMethod=" + this.f28864b + ")";
    }

    public Dg(V8 v82, SdkAuthRequestBody.AuthMethod authMethod) {
        this.f28863a = v82;
        this.f28864b = authMethod;
    }
}
