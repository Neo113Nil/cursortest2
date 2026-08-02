package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.api.SPayStage;

/* renamed from: Ve.sh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4619sh extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Th f32053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SPaySdkInitConfig f32054c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f32055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4619sh(Th th2, SPaySdkInitConfig sPaySdkInitConfig, String str) {
        super(0);
        this.f32053b = th2;
        this.f32054c = sPaySdkInitConfig;
        this.f32055d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        p002if.j jVar;
        if (!((C4618sg) this.f32053b.f30052a).f32052a) {
            SPaySdkInitConfig sPaySdkInitConfig = this.f32054c;
            if (sPaySdkInitConfig.getEnableLogging() && (sPaySdkInitConfig.getStage() == SPayStage.SandboxRealBankApp || sPaySdkInitConfig.getStage() == SPayStage.SandBoxWithoutBankApp)) {
                p002if.j.f66400c.getClass();
                jVar = p002if.j.f66398a;
                p002if.j.k(jVar, this.f32055d, 6);
            }
        }
        return Unit.f71690a;
    }
}
