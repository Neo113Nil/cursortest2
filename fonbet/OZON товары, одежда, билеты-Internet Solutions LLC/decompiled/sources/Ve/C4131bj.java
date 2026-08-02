package Ve;

import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import spay.sdk.domain.model.response.ErrorEntity;

/* renamed from: Ve.bj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4131bj implements X3 {
    public static ErrorEntity b(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof UnknownHostException ? true : error instanceof SocketException) {
            return ErrorEntity.NoInternet.INSTANCE;
        }
        if (error instanceof SocketTimeoutException) {
            return ErrorEntity.TimeOut.INSTANCE;
        }
        if (!(error instanceof HttpException)) {
            return ErrorEntity.Unknown.INSTANCE;
        }
        int code = ((HttpException) error).code();
        if (code == 400) {
            return new ErrorEntity.BadRequest(null, null, null, 7, null);
        }
        if (code == 401) {
            return ErrorEntity.Unauthorized.INSTANCE;
        }
        if (code != 403) {
            if (code == 404) {
                return ErrorEntity.NotFound.INSTANCE;
            }
            if (code != 408 && code != 423 && code != 429 && code != 500) {
                return code != 503 ? ErrorEntity.Unknown.INSTANCE : ErrorEntity.ServiceUnavailable.INSTANCE;
            }
        }
        return ErrorEntity.UnknownApiResult.INSTANCE;
    }

    @Override // Ve.X3
    public final /* bridge */ /* synthetic */ ErrorEntity a(Object obj) {
        return b((Throwable) obj);
    }
}
