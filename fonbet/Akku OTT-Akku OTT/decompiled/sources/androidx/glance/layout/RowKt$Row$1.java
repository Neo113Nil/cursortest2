package androidx.glance.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class RowKt$Row$1 extends FunctionReferenceImpl implements Function0<EmittableRow> {
    public static final RowKt$Row$1 INSTANCE = new RowKt$Row$1();

    public RowKt$Row$1() {
        super(0, EmittableRow.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableRow invoke() {
        return new EmittableRow();
    }
}
