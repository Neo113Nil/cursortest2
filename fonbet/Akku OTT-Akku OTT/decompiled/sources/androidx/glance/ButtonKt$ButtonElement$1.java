package androidx.glance;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class ButtonKt$ButtonElement$1 extends FunctionReferenceImpl implements Function0<EmittableButton> {
    public static final ButtonKt$ButtonElement$1 INSTANCE = new ButtonKt$ButtonElement$1();

    public ButtonKt$ButtonElement$1() {
        super(0, EmittableButton.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableButton invoke() {
        return new EmittableButton();
    }
}
