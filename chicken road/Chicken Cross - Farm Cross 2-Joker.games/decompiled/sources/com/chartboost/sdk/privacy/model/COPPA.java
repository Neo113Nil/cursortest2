package com.chartboost.sdk.privacy.model;

import com.ironsource.U3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/chartboost/sdk/privacy/model/COPPA;", "Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "isChildDirected", "", "<init>", "(Z)V", U3.j.b0, "getConsent", "()Ljava/lang/Boolean;", k.M, "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class COPPA extends GenericDataUseConsent {
    public static final String COPPA_STANDARD = "coppa";

    /* JADX WARN: Multi-variable type inference failed */
    public COPPA(boolean z) {
        super(null, 1, 0 == true ? 1 : 0);
        b(COPPA_STANDARD);
        a(Boolean.valueOf(z));
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public Boolean getConsent() {
        Object consentValue = getConsentValue();
        Intrinsics.checkNotNull(consentValue, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) consentValue;
    }
}
