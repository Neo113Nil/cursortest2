package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class IgnoreResultKt$IgnoreResult$1 extends FunctionReferenceImpl implements Function0<EmittableIgnoreResult> {
    public static final IgnoreResultKt$IgnoreResult$1 INSTANCE = new IgnoreResultKt$IgnoreResult$1();

    public IgnoreResultKt$IgnoreResult$1() {
        super(0, EmittableIgnoreResult.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableIgnoreResult invoke() {
        return new EmittableIgnoreResult();
    }
}
