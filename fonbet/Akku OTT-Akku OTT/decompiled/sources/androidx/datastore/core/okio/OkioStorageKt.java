package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/C;", "path", "Landroidx/datastore/core/InterProcessCoordinator;", "createSingleProcessCoordinator", "(Lokio/C;)Landroidx/datastore/core/InterProcessCoordinator;", "datastore-core-okio"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkioStorageKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(C path) {
        Intrinsics.checkNotNullParameter(path, "path");
        C.a aVar = C.Companion;
        String r = path.a.r();
        aVar.getClass();
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(C.a.a(r, true).a.r());
    }
}
