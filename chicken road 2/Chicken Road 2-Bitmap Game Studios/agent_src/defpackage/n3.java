package defpackage;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class n3 implements Function1 {
    public final /* synthetic */ TextDragObserver b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ n3(TextDragObserver textDragObserver, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        TextDragObserver textDragObserver = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                textDragObserver.oyjLVtGms9eZwJ0(((Offset) obj).yzPsTade5rL7D3, SelectionAdjustment.Companion.yzPsTade5rL7D3);
                break;
            case 1:
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                textDragObserver.b41X89IqSbKt(PointerEventKt.gmXBnHsR2YSm(pointerInputChange, false));
                pointerInputChange.yzPsTade5rL7D3();
                break;
            default:
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                textDragObserver.b41X89IqSbKt(PointerEventKt.gmXBnHsR2YSm(pointerInputChange2, false));
                pointerInputChange2.yzPsTade5rL7D3();
                break;
        }
        return unit;
    }
}
