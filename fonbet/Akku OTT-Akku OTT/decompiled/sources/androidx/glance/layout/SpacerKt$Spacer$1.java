package androidx.glance.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class SpacerKt$Spacer$1 extends FunctionReferenceImpl implements Function0<EmittableSpacer> {
    public static final SpacerKt$Spacer$1 INSTANCE = new SpacerKt$Spacer$1();

    public SpacerKt$Spacer$1() {
        super(0, EmittableSpacer.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableSpacer invoke() {
        return new EmittableSpacer();
    }
}
