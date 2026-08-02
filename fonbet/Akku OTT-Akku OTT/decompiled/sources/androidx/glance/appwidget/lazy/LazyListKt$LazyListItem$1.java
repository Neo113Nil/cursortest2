package androidx.glance.appwidget.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class LazyListKt$LazyListItem$1 extends FunctionReferenceImpl implements Function0<EmittableLazyListItem> {
    public static final LazyListKt$LazyListItem$1 INSTANCE = new LazyListKt$LazyListItem$1();

    public LazyListKt$LazyListItem$1() {
        super(0, EmittableLazyListItem.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableLazyListItem invoke() {
        return new EmittableLazyListItem();
    }
}
