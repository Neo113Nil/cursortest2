package defpackage;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class k1 implements Function1 {
    public final /* synthetic */ Function1 b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ k1(int i, Function1 function1) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        Object failure;
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                Function1 function1 = this.b41X89IqSbKt;
                Throwable th = (Throwable) obj;
                int i = ExceptionsConstructorKt.yzPsTade5rL7D3;
                try {
                    Throwable th2 = (Throwable) function1.uypNJrpDByoB(th);
                    boolean yzPsTade5rL7D3 = Intrinsics.yzPsTade5rL7D3(th.getMessage(), th2.getMessage());
                    failure = th2;
                    if (!yzPsTade5rL7D3) {
                        boolean yzPsTade5rL7D32 = Intrinsics.yzPsTade5rL7D3(th2.getMessage(), th.toString());
                        failure = th2;
                        if (!yzPsTade5rL7D32) {
                            failure = null;
                        }
                    }
                } catch (Throwable th3) {
                    failure = new Result.Failure(th3);
                }
                return (Throwable) (failure instanceof Result.Failure ? null : failure);
            case 1:
                ((InspectorInfo) obj).getClass();
                throw null;
            case 2:
                z5 z5Var = SnapshotKt.yzPsTade5rL7D3;
                Snapshot snapshot = (Snapshot) this.b41X89IqSbKt.uypNJrpDByoB((SnapshotIdSet) obj);
                synchronized (SnapshotKt.ra306ClFT3HT) {
                    SnapshotKt.oyjLVtGms9eZwJ0 = SnapshotKt.oyjLVtGms9eZwJ0.gmXBnHsR2YSm(snapshot.getHRNgd2zGCE5kj());
                }
                return snapshot;
            default:
                Function1 function12 = this.b41X89IqSbKt;
                Long l = (Long) obj;
                l.getClass();
                return function12.uypNJrpDByoB(l);
        }
    }
}
