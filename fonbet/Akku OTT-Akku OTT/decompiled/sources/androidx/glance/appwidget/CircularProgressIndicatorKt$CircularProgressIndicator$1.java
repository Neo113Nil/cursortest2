package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class CircularProgressIndicatorKt$CircularProgressIndicator$1 extends FunctionReferenceImpl implements Function0<EmittableCircularProgressIndicator> {
    public static final CircularProgressIndicatorKt$CircularProgressIndicator$1 INSTANCE = new CircularProgressIndicatorKt$CircularProgressIndicator$1();

    public CircularProgressIndicatorKt$CircularProgressIndicator$1() {
        super(0, EmittableCircularProgressIndicator.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableCircularProgressIndicator invoke() {
        return new EmittableCircularProgressIndicator();
    }
}
