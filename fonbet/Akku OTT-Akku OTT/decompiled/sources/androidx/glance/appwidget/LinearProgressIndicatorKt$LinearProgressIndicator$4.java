package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class LinearProgressIndicatorKt$LinearProgressIndicator$4 extends FunctionReferenceImpl implements Function0<EmittableLinearProgressIndicator> {
    public static final LinearProgressIndicatorKt$LinearProgressIndicator$4 INSTANCE = new LinearProgressIndicatorKt$LinearProgressIndicator$4();

    public LinearProgressIndicatorKt$LinearProgressIndicator$4() {
        super(0, EmittableLinearProgressIndicator.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableLinearProgressIndicator invoke() {
        return new EmittableLinearProgressIndicator();
    }
}
