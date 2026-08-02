package Ve;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import retrofit2.Response;
import spay.sdk.data.dto.response.SPayErrorDto;
import spay.sdk.domain.model.response.ErrorEntity;

/* renamed from: Ve.de, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4184de {
    public AbstractC4184de(C4131bj networkErrorHandlerImpl, Xh apiResponseErrorHandlerImpl) {
        Intrinsics.checkNotNullParameter(networkErrorHandlerImpl, "networkErrorHandlerImpl");
        Intrinsics.checkNotNullParameter(apiResponseErrorHandlerImpl, "apiResponseErrorHandlerImpl");
    }

    public static Object a(Response response, Te te2, InterfaceC4443me successAction, InterfaceC4443me failAction, Ur view) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Intrinsics.checkNotNullParameter(successAction, "successAction");
        Intrinsics.checkNotNullParameter(failAction, "failAction");
        Intrinsics.checkNotNullParameter(view, "view");
        return b(response, te2, successAction, failAction, view, Id.f29226b);
    }

    public static Object b(Response response, Te te2, InterfaceC4443me successAction, InterfaceC4443me failAction, Ur view, Function1 transform) {
        Object invoke;
        Intrinsics.checkNotNullParameter(response, "<this>");
        Intrinsics.checkNotNullParameter(successAction, "successAction");
        Intrinsics.checkNotNullParameter(failAction, "failAction");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(transform, "transform");
        try {
            Object body = response.body();
            if (body == null || (invoke = transform.invoke(body)) == null) {
                We.L raw = response.raw();
                Intrinsics.checkNotNullExpressionValue(raw, "this.raw()");
                Intrinsics.checkNotNullParameter(raw, "<this>");
                throw new Nm((String) ((ArrayList) raw.L().j().l()).get(raw.L().j().m() - 1));
            }
            if (te2 == null) {
                return invoke;
            }
            te2.b(new Bi(successAction, view, Pe.RS_GOOD, null, null, null, null, 120));
            return invoke;
        } catch (C4452mn e11) {
            if (te2 == null) {
                throw e11;
            }
            te2.b(new Bi(failAction, view, Pe.RS_FAIL, null, null, null, e11.f31607a, 56));
            throw e11;
        }
    }

    public final ErrorEntity c(Response raw, SPayErrorDto sPayErrorDto) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        return (raw.body() == null && sPayErrorDto == null) ? C4131bj.b(new HttpException(raw)) : (raw.body() == null || sPayErrorDto == null) ? (raw.body() != null || sPayErrorDto == null) ? (raw.body() == null || sPayErrorDto != null) ? ErrorEntity.Unknown.INSTANCE : ErrorEntity.Unknown.INSTANCE : Xh.b(sPayErrorDto) : ErrorEntity.Unknown.INSTANCE;
    }
}
