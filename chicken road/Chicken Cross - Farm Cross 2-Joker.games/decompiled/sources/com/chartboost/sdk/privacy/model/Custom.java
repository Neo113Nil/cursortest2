package com.chartboost.sdk.privacy.model;

import com.ironsource.U3;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/privacy/model/Custom;", "Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "", "customPrivacyStandard", "customConsent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", U3.j.b0, "", "d", "(Ljava/lang/String;)Z", "", "b", "()V", "privacyStandard", "c", "Ljava/lang/String;", "e", "getConsent", "()Ljava/lang/String;", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Custom extends GenericDataUseConsent {

    /* renamed from: d, reason: from kotlin metadata */
    public final String customPrivacyStandard;

    /* renamed from: e, reason: from kotlin metadata */
    public final String customConsent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Custom(String customPrivacyStandard, String customConsent) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(customPrivacyStandard, "customPrivacyStandard");
        Intrinsics.checkNotNullParameter(customConsent, "customConsent");
        this.customPrivacyStandard = customPrivacyStandard;
        this.customConsent = customConsent;
        b();
    }

    private final boolean d(String consent) {
        int length = consent.length();
        return 1 <= length && length < 100;
    }

    public final void b() {
        if (this.customPrivacyStandard.length() == 0 || this.customConsent.length() == 0) {
            a("Invalid Custom privacy standard name. Values cannot be null");
            return;
        }
        if (c(this.customPrivacyStandard)) {
            a("Invalid Custom privacy standard name. Cannot use GDPR as privacy standard");
            return;
        }
        if (d(this.customPrivacyStandard) && d(this.customConsent)) {
            b(this.customPrivacyStandard);
            a((Object) this.customConsent);
        } else {
            a("Invalid Custom consent values. Use valid values between 1 and 100 characters. privacyStandard: " + this.customPrivacyStandard + " consent: " + this.customConsent);
        }
    }

    public final boolean c(String privacyStandard) {
        String str;
        String obj;
        if (privacyStandard == null || (obj = StringsKt.trim((CharSequence) privacyStandard).toString()) == null) {
            str = null;
        } else {
            str = obj.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        }
        return Intrinsics.areEqual("gdpr", str);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public String getConsent() {
        Object consentValue = getConsentValue();
        Intrinsics.checkNotNull(consentValue, "null cannot be cast to non-null type kotlin.String");
        return (String) consentValue;
    }
}
