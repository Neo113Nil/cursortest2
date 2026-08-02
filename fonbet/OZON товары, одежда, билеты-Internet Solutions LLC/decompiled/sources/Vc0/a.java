package Vc0;

import Rc0.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.OtpDTO;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final t a(@NotNull OtpDTO.AgreementSheet sheet, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(sheet, "sheet");
        OtpDTO.Agreement termsOfUse = sheet.getTermsOfUse();
        Boolean bool3 = Boolean.FALSE;
        boolean z11 = Intrinsics.d(bool, bool3) && termsOfUse != null && termsOfUse.isConfirmationRequired();
        OtpDTO.Agreement isAdsAllowed = sheet.isAdsAllowed();
        return new t(!(z11 || (Intrinsics.d(bool2, bool3) && isAdsAllowed != null && isAdsAllowed.isConfirmationRequired())), bool, bool2);
    }

    @NotNull
    public static final t b(@NotNull OtpDTO.AgreementSheet agreementSheet) {
        Intrinsics.checkNotNullParameter(agreementSheet, "<this>");
        OtpDTO.Agreement termsOfUse = agreementSheet.getTermsOfUse();
        Boolean valueOf = termsOfUse != null ? Boolean.valueOf(termsOfUse.isCheckboxConfirmed()) : null;
        OtpDTO.Agreement isAdsAllowed = agreementSheet.isAdsAllowed();
        return a(agreementSheet, valueOf, isAdsAllowed != null ? Boolean.valueOf(isAdsAllowed.isCheckboxConfirmed()) : null);
    }
}
