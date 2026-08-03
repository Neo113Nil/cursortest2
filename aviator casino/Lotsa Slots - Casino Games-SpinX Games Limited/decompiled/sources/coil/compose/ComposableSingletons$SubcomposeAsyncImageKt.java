package coil.compose;

/* compiled from: SubcomposeAsyncImage.kt */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$SubcomposeAsyncImageKt {
    public static final coil.compose.ComposableSingletons$SubcomposeAsyncImageKt INSTANCE = new coil.compose.ComposableSingletons$SubcomposeAsyncImageKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static kotlin.jvm.functions.Function3<coil.compose.SubcomposeAsyncImageScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f23lambda1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1783408023, false, new kotlin.jvm.functions.Function3<coil.compose.SubcomposeAsyncImageScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: coil.compose.ComposableSingletons$SubcomposeAsyncImageKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(coil.compose.SubcomposeAsyncImageScope subcomposeAsyncImageScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(subcomposeAsyncImageScope, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(coil.compose.SubcomposeAsyncImageScope subcomposeAsyncImageScope, androidx.compose.runtime.Composer composer, int i) {
            int i2;
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(subcomposeAsyncImageScope) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                coil.compose.SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, composer, i2 & 14, 255);
            }
        }
    });

    /* renamed from: getLambda-1$coil_compose_base_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<coil.compose.SubcomposeAsyncImageScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m4957getLambda1$coil_compose_base_release() {
        return f23lambda1;
    }
}
