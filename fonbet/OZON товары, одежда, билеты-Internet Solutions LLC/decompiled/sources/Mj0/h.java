package Mj0;

import We.M;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.tracker.model.SendEventsRequest;
import ru.ozon.tracker.model.SendPerfEventsTraceEntity;

/* loaded from: classes7.dex */
public interface h {
    Object sendMultiEvent(@NotNull SendEventsRequest sendEventsRequest, @NotNull kotlin.coroutines.d<? super Response<M>> dVar);

    Object sendPerfMetricsV2(@NotNull SendPerfEventsTraceEntity sendPerfEventsTraceEntity, @NotNull kotlin.coroutines.d<? super Response<M>> dVar);

    Object sendPerfMetricsV3(@NotNull SendPerfEventsTraceEntity sendPerfEventsTraceEntity, @NotNull kotlin.coroutines.d<? super Response<M>> dVar);
}
