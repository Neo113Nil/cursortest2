package androidx.compose.foundation.text;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class CommonContextMenuAreaKt$TextItem$2 implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.contextmenu.ContextMenuState getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        invoke2();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.Camera2StreamConfigurationMap.invoke();
        androidx.compose.foundation.contextmenu.ContextMenuStateKt.close(this.getHighSpeedVideoSizes);
    }

    public CommonContextMenuAreaKt$TextItem$2(kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState) {
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = contextMenuState;
    }
}
