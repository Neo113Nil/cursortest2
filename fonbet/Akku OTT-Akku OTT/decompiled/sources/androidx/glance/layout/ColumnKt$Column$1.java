package androidx.glance.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class ColumnKt$Column$1 extends FunctionReferenceImpl implements Function0<EmittableColumn> {
    public static final ColumnKt$Column$1 INSTANCE = new ColumnKt$Column$1();

    public ColumnKt$Column$1() {
        super(0, EmittableColumn.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableColumn invoke() {
        return new EmittableColumn();
    }
}
