package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.runtime.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0216g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0216g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean stackTraceForValue$lambda$43;
        switch (this.a) {
            case 0:
                stackTraceForValue$lambda$43 = ComposerImpl.stackTraceForValue$lambda$43(this.b, obj);
                break;
            default:
                stackTraceForValue$lambda$43 = SnapshotStateList.retainAll$lambda$10((Collection) this.b, (List) obj);
                break;
        }
        return Boolean.valueOf(stackTraceForValue$lambda$43);
    }
}
