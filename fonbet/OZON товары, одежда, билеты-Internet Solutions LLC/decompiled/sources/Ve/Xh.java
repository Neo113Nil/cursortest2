package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.data.dto.response.SPayErrorDto;
import spay.sdk.data.dto.response.SPayErrorDtoKt;
import spay.sdk.data.dto.response.paymentToken.FraudMonCheckResultResponseBodyDto;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes6.dex */
public final class Xh implements X3 {
    public static ErrorEntity b(SPayErrorDto error) {
        String description;
        Intrinsics.checkNotNullParameter(error, "error");
        String errorCode = error.getErrorCode();
        if ((errorCode == null || errorCode.length() == 0) && ((description = error.getDescription()) == null || description.length() == 0)) {
            return ErrorEntity.Unknown.INSTANCE;
        }
        String errorCode2 = error.getErrorCode();
        if (errorCode2 != null && errorCode2.length() != 0 && SPayErrorDtoKt.findOutCurrentVerdict(error) != null) {
            String errorCode3 = error.getErrorCode();
            String description2 = error.getDescription();
            FraudMonCheckResultResponseBodyDto findOutCurrentVerdict = SPayErrorDtoKt.findOutCurrentVerdict(error);
            return new ErrorEntity.BadRequest(errorCode3, description2, findOutCurrentVerdict != null ? findOutCurrentVerdict.toModel() : null);
        }
        String errorCode4 = error.getErrorCode();
        if (errorCode4 == null) {
            errorCode4 = "13";
        }
        String description3 = error.getDescription();
        if (description3 == null) {
            description3 = "";
        }
        return new ErrorEntity.ApiError(errorCode4, description3);
    }

    @Override // Ve.X3
    public final /* bridge */ /* synthetic */ ErrorEntity a(Object obj) {
        return b((SPayErrorDto) obj);
    }
}
