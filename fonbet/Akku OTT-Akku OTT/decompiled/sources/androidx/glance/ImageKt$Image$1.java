package androidx.glance;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class ImageKt$Image$1 extends FunctionReferenceImpl implements Function0<EmittableImage> {
    public static final ImageKt$Image$1 INSTANCE = new ImageKt$Image$1();

    public ImageKt$Image$1() {
        super(0, EmittableImage.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableImage invoke() {
        return new EmittableImage();
    }
}
