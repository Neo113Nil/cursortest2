package androidx.glance.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class BoxKt$Box$1 extends FunctionReferenceImpl implements Function0<EmittableBox> {
    public static final BoxKt$Box$1 INSTANCE = new BoxKt$Box$1();

    public BoxKt$Box$1() {
        super(0, EmittableBox.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableBox invoke() {
        return new EmittableBox();
    }
}
