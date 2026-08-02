package androidx.glance.appwidget.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class LazyListKt$LazyColumn$4 extends FunctionReferenceImpl implements Function0<EmittableLazyColumn> {
    public static final LazyListKt$LazyColumn$4 INSTANCE = new LazyListKt$LazyColumn$4();

    public LazyListKt$LazyColumn$4() {
        super(0, EmittableLazyColumn.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableLazyColumn invoke() {
        return new EmittableLazyColumn();
    }
}
