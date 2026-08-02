package kotlinx.serialization.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.descriptors.n;
import okhttp3.internal.ws.RealWebSocket;

/* renamed from: kotlinx.serialization.internal.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C1161s0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1161s0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit writeOneFrame$lambda$10$lambda$9;
        switch (this.a) {
            case 0:
                return kotlinx.serialization.descriptors.l.c("kotlin.Unit", n.d.a, new kotlinx.serialization.descriptors.f[0], new androidx.compose.runtime.snapshots.l((C1163t0) this.b, 1));
            default:
                writeOneFrame$lambda$10$lambda$9 = RealWebSocket.writeOneFrame$lambda$10$lambda$9((RealWebSocket) this.b);
                return writeOneFrame$lambda$10$lambda$9;
        }
    }
}
