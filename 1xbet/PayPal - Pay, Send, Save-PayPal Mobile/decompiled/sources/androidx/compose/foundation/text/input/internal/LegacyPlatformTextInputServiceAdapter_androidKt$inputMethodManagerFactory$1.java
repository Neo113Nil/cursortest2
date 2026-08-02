package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.View, androidx.compose.foundation.text.input.internal.InputMethodManagerImpl> {
    public static final androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.foundation.text.input.internal.InputMethodManagerImpl invoke(android.view.View view) {
        return new androidx.compose.foundation.text.input.internal.InputMethodManagerImpl(view);
    }

    LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1() {
        super(1, androidx.compose.foundation.text.input.internal.InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }
}
