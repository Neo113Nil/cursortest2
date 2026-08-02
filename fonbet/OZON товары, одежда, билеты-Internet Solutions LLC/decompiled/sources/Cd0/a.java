package Cd0;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.inapp.push.sdk.internal.data.dto.ActionProcessRequest;
import ru.ozon.inapp.push.sdk.internal.data.dto.ActionProcessResponse;

/* loaded from: classes7.dex */
public interface a {
    Object actionProcess(@NotNull ActionProcessRequest actionProcessRequest, @NotNull kotlin.coroutines.d<? super ActionProcessResponse> dVar);

    Object callPixelUrl(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
