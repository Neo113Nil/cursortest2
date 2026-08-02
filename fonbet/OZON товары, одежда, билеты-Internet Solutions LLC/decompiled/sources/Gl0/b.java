package Gl0;

import bb.AbstractC5615b;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b extends AbstractC5615b {

    /* renamed from: b, reason: collision with root package name */
    public final long f10283b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10284c;

    public b(long j11, long j12) {
        super("PushMessageSkippedOnClientSdk");
        this.f10283b = j11;
        this.f10284c = j12;
    }

    @Override // bb.AbstractC5615b
    @NotNull
    public final Map<String, String> b() {
        long j11 = this.f10284c;
        long j12 = this.f10283b;
        return U.j(new Pair("received_by_server_at", String.valueOf(j12)), new Pair("received_by_endpoint_at", String.valueOf(j11)), new Pair("time_spent", String.valueOf(j11 - j12)));
    }
}
