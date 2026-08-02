package Pj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.tracker.sendEvent.BadRequestException;
import ru.ozon.tracker.sendEvent.ResponseException;
import ru.ozon.tracker.sendEvent.ServerErrorException;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final void a(@NotNull Response response) throws BadRequestException, BadRequestException, ResponseException {
        Intrinsics.checkNotNullParameter(response, "<this>");
        int code = response.code();
        if (400 <= code && code < 500) {
            throw new BadRequestException(code, response.message());
        }
        if (500 <= code && code < 600) {
            throw new ServerErrorException(code, response.message());
        }
        throw new ResponseException(code, response.message());
    }
}
