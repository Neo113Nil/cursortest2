package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import spay.sdk.SPaySdkApp;
import spay.sdk.api.InitializationResult;
import spay.sdk.api.SPaySdkInitConfig;

/* renamed from: Ve.wl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4738wl extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SPaySdkApp f32381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4738wl(SPaySdkApp sPaySdkApp) {
        super(0);
        this.f32381b = sPaySdkApp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) this.f32381b.getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease()).f32350a;
        if (sPaySdkInitConfig == null) {
            throw C4549q4.f31841a;
        }
        sPaySdkInitConfig.getInitializationResult().invoke(new InitializationResult.ConfigError("SPaySdkApp initialize with exception : merchantConfig is null on reinitialization. Please initialize SDK again."));
        return Unit.f71690a;
    }
}
