package androidx.compose.foundation.text;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class CommonContextMenuAreaKt$TextItem$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, java.lang.String> {
    final /* synthetic */ androidx.compose.foundation.text.TextContextMenuItems Camera2StreamConfigurationMap;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.String invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(composer, num.intValue());
    }

    public final java.lang.String invoke(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-35972707);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-35972707, i, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (CommonContextMenuArea.kt:190)");
        }
        java.lang.String resolvedString = this.Camera2StreamConfigurationMap.resolvedString(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return resolvedString;
    }

    public CommonContextMenuAreaKt$TextItem$1(androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems) {
        this.Camera2StreamConfigurationMap = textContextMenuItems;
    }
}
