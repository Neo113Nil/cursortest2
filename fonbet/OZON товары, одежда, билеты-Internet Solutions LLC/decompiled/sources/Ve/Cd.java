package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;

/* loaded from: classes10.dex */
public final class Cd {

    /* renamed from: a, reason: collision with root package name */
    public final CreateBindingOtpRequestBody f28757a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28758b;

    public Cd(CreateBindingOtpRequestBody request, boolean z11) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f28757a = request;
        this.f28758b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cd)) {
            return false;
        }
        Cd cd2 = (Cd) obj;
        return this.f28757a.equals(cd2.f28757a) && this.f28758b == cd2.f28758b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a11 = Pk0.c.a(this.f28757a.hashCode() * 31, 31, 45000L);
        boolean z11 = this.f28758b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return a11 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateBindingOtpUseCaseParams(request=");
        sb2.append(this.f28757a);
        sb2.append(", timerTime=45000, fromOtpView=");
        return Pk0.a.a(")", sb2, this.f28758b);
    }
}
