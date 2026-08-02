package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* loaded from: classes10.dex */
public final class Wf extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final V8 f30272a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkAuthRequestBody.AuthMethod f30273b;

    public Wf(V8 v82, SdkAuthRequestBody.AuthMethod authMethod) {
        this.f30272a = v82;
        this.f30273b = authMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wf)) {
            return false;
        }
        Wf wf2 = (Wf) obj;
        return Intrinsics.d(this.f30272a, wf2.f30272a) && this.f30273b == wf2.f30273b;
    }

    public final int hashCode() {
        V8 v82 = this.f30272a;
        int hashCode = (v82 == null ? 0 : v82.hashCode()) * 31;
        SdkAuthRequestBody.AuthMethod authMethod = this.f30273b;
        return hashCode + (authMethod != null ? authMethod.hashCode() : 0);
    }

    public final String toString() {
        return "StartSdkAuth(sidAuthResultModel=" + this.f30272a + ", authMethod=" + this.f30273b + ")";
    }
}
