package Ch0;

import Fh0.i;
import Ih0.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.status.data.network.api.PushStatusApiV3;

/* loaded from: classes7.dex */
public final class e extends a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final PushStatusApiV3 f5055c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f5056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull PushStatusApiV3 pushStatusApi, @NotNull b deviceStatsRepository, @NotNull Fh0.d pushStatusDao, @NotNull i pushStatusWithStatsDao) {
        super(pushStatusDao, pushStatusWithStatsDao);
        Intrinsics.checkNotNullParameter(pushStatusApi, "pushStatusApi");
        Intrinsics.checkNotNullParameter(deviceStatsRepository, "deviceStatsRepository");
        Intrinsics.checkNotNullParameter(pushStatusDao, "pushStatusDao");
        Intrinsics.checkNotNullParameter(pushStatusWithStatsDao, "pushStatusWithStatsDao");
        this.f5055c = pushStatusApi;
        this.f5056d = deviceStatsRepository;
    }

    @Override // Ch0.a
    public final int e(@NotNull List<Ih0.c> events, String str, @NotNull n senderPlace, boolean z11) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(senderPlace, "senderPlace");
        b bVar = this.f5056d;
        PushStatusApiV3 pushStatusApiV3 = this.f5055c;
        return (z11 ? pushStatusApiV3.sendPushStatusWithSmallCallTimeout(c.j(events, str, senderPlace, bVar.a())) : pushStatusApiV3.sendPushStatus(c.j(events, str, senderPlace, bVar.a()))).execute().code();
    }
}
