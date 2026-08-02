package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import spay.sdk.api.SPaySdkInitConfig;

/* renamed from: Ve.gi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4274gi extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31114c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4274gi(Object obj, int i11) {
        super(0);
        this.f31113b = i11;
        this.f31114c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31113b) {
            case 0:
                ((C4449mk) this.f31114c).f31600f.setValue(Boolean.FALSE);
                return Unit.f71690a;
            case 1:
                We.L l11 = (We.L) this.f31114c;
                String w11 = l11.w();
                l11.r().c("x-elk-error-code");
                return new C4347j5(w11);
            default:
                SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) ((T8) this.f31114c)).f32350a;
                if (sPaySdkInitConfig != null) {
                    return Boolean.valueOf(sPaySdkInitConfig.getResultViewNeeded());
                }
                throw C4549q4.f31841a;
        }
    }
}
