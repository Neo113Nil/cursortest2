package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import defpackage.AQjFgAcRSdD7Ysn;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class QLxGKa0co2zAEvd implements Function1 {
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ QLxGKa0co2zAEvd(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = androidTextContextMenuToolbarProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                View view = androidTextContextMenuToolbarProvider.yzPsTade5rL7D3;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.hRNgd2zGCE5kj();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new elPM8kURv8Fp(2, function0));
                    }
                }
                return unit;
            case 1:
                ActionMode actionMode = androidTextContextMenuToolbarProvider.Uo5pffGf8LUU;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return unit;
            case 2:
                ActionMode actionMode2 = androidTextContextMenuToolbarProvider.Uo5pffGf8LUU;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return unit;
            default:
                SnapshotStateObserver snapshotStateObserver = androidTextContextMenuToolbarProvider.b41X89IqSbKt;
                snapshotStateObserver.Uo5pffGf8LUU = Snapshot.Companion.oyjLVtGms9eZwJ0(snapshotStateObserver.oyjLVtGms9eZwJ0);
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt$platformTextContextMenuToolbarProvider$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider2 = AndroidTextContextMenuToolbarProvider.this;
                        SnapshotStateObserver snapshotStateObserver2 = androidTextContextMenuToolbarProvider2.b41X89IqSbKt;
                        AQjFgAcRSdD7Ysn aQjFgAcRSdD7Ysn = snapshotStateObserver2.Uo5pffGf8LUU;
                        if (aQjFgAcRSdD7Ysn != null) {
                            aQjFgAcRSdD7Ysn.yzPsTade5rL7D3();
                        }
                        snapshotStateObserver2.yzPsTade5rL7D3();
                        ActionMode actionMode3 = androidTextContextMenuToolbarProvider2.Uo5pffGf8LUU;
                        if (actionMode3 != null) {
                            actionMode3.finish();
                        }
                        androidTextContextMenuToolbarProvider2.Uo5pffGf8LUU = null;
                    }
                };
        }
    }
}
