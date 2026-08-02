package K00;

import a10.InterfaceC4918f;
import a10.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements InterfaceC4918f {
    f() {
    }

    @Override // a10.InterfaceC4918f
    public final void onRedirect(String uuid, L00.j response, k type) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // a10.InterfaceC4918f
    public final void onRedirectCompleted(String uuid, L00.j response, k type) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
