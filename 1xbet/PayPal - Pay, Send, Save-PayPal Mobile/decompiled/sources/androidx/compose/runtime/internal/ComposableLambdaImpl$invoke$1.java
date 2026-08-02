package androidx.compose.runtime.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ComposableLambdaImpl$invoke$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    private void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, int i) {
        ((androidx.compose.runtime.internal.ComposableLambdaImpl) this.receiver).invoke(composer, i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        getHighSpeedVideoSizes(composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    ComposableLambdaImpl$invoke$1(java.lang.Object obj) {
        super(2, obj, androidx.compose.runtime.internal.ComposableLambdaImpl.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
    }
}
