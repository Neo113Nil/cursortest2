package Ch0;

import Fh0.i;
import Ih0.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.status.data.network.api.PushStatusApiV2;

/* loaded from: classes3.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final PushStatusApiV2 f5054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull PushStatusApiV2 pushStatusApi, @NotNull Fh0.d pushStatusDao, @NotNull i pushStatusWithStatsDao) {
        super(pushStatusDao, pushStatusWithStatsDao);
        Intrinsics.checkNotNullParameter(pushStatusApi, "pushStatusApi");
        Intrinsics.checkNotNullParameter(pushStatusDao, "pushStatusDao");
        Intrinsics.checkNotNullParameter(pushStatusWithStatsDao, "pushStatusWithStatsDao");
        this.f5054c = pushStatusApi;
    }

    @Override // Ch0.a
    public final int e(@NotNull List<Ih0.c> events, String str, @NotNull n senderPlace, boolean z11) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(senderPlace, "senderPlace");
        PushStatusApiV2 pushStatusApiV2 = this.f5054c;
        return (z11 ? pushStatusApiV2.sendPushStatusWithSmallCallTimeout(c.i(events, str, senderPlace)) : pushStatusApiV2.sendPushStatus(c.i(events, str, senderPlace))).execute().code();
    }
}
