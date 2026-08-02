package androidx.glance.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class TextKt$Text$1 extends FunctionReferenceImpl implements Function0<EmittableText> {
    public static final TextKt$Text$1 INSTANCE = new TextKt$Text$1();

    public TextKt$Text$1() {
        super(0, EmittableText.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableText invoke() {
        return new EmittableText();
    }
}
