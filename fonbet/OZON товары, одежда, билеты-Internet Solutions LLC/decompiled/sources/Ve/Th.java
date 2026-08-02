package Ve;

import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;
import spay.sdk.api.SPaySdkInitConfig;

/* loaded from: classes6.dex */
public final class Th implements C8588a.b {

    /* renamed from: a, reason: collision with root package name */
    public final Tf f30052a;

    /* renamed from: b, reason: collision with root package name */
    public final T8 f30053b;

    public Th(Tf loggingContract, T8 sPaySdkMerchantOptionsRepository) {
        Intrinsics.checkNotNullParameter(loggingContract, "loggingContract");
        Intrinsics.checkNotNullParameter(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        this.f30052a = loggingContract;
        this.f30053b = sPaySdkMerchantOptionsRepository;
    }

    @Override // nf.C8588a.b
    public final void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) this.f30053b).f32350a;
        if (sPaySdkInitConfig == null) {
            throw C4549q4.f31841a;
        }
        Intrinsics.checkNotNullParameter(new Ng(this, message), "block");
        C4619sh block = new C4619sh(this, sPaySdkInitConfig, message);
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke();
    }
}
