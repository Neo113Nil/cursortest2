package androidx.compose.runtime.snapshots;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.C1163t0;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit readObserver$lambda$7;
        switch (this.a) {
            case 0:
                readObserver$lambda$7 = SnapshotStateObserver.readObserver$lambda$7((SnapshotStateObserver) this.b, obj);
                return readObserver$lambda$7;
            default:
                C1163t0 c1163t0 = (C1163t0) this.b;
                kotlinx.serialization.descriptors.a buildSerialDescriptor = (kotlinx.serialization.descriptors.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                List<? extends Annotation> list = c1163t0.b;
                buildSerialDescriptor.getClass();
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                buildSerialDescriptor.b = list;
                return Unit.INSTANCE;
        }
    }
}
