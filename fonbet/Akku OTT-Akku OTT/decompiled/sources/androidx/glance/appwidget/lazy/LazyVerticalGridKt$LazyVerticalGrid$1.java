package androidx.glance.appwidget.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class LazyVerticalGridKt$LazyVerticalGrid$1 extends FunctionReferenceImpl implements Function0<EmittableLazyVerticalGrid> {
    public static final LazyVerticalGridKt$LazyVerticalGrid$1 INSTANCE = new LazyVerticalGridKt$LazyVerticalGrid$1();

    public LazyVerticalGridKt$LazyVerticalGrid$1() {
        super(0, EmittableLazyVerticalGrid.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableLazyVerticalGrid invoke() {
        return new EmittableLazyVerticalGrid();
    }
}
