package androidx.glance.appwidget.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class LazyVerticalGridKt$LazyVerticalGridItem$1 extends FunctionReferenceImpl implements Function0<EmittableLazyVerticalGridListItem> {
    public static final LazyVerticalGridKt$LazyVerticalGridItem$1 INSTANCE = new LazyVerticalGridKt$LazyVerticalGridItem$1();

    public LazyVerticalGridKt$LazyVerticalGridItem$1() {
        super(0, EmittableLazyVerticalGridListItem.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableLazyVerticalGridListItem invoke() {
        return new EmittableLazyVerticalGridListItem();
    }
}
