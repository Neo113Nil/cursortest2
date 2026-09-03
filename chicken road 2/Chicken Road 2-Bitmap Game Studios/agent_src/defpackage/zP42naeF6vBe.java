package defpackage;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class zP42naeF6vBe implements Function0 {
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider b41X89IqSbKt;
    public final /* synthetic */ TextContextMenuDataProvider gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ zP42naeF6vBe(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = androidTextContextMenuToolbarProvider;
        this.gmXBnHsR2YSm = textContextMenuDataProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = 2;
        TextContextMenuDataProvider textContextMenuDataProvider = this.gmXBnHsR2YSm;
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                QLxGKa0co2zAEvd qLxGKa0co2zAEvd = androidTextContextMenuToolbarProvider.gmXBnHsR2YSm;
                uY26rxeEAFnDq uy26rxeeafndq = new uY26rxeEAFnDq(2, textContextMenuDataProvider);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                androidTextContextMenuToolbarProvider.b41X89IqSbKt.b41X89IqSbKt("dataBuilder", qLxGKa0co2zAEvd, new VoAHKqpbZzH9eE(0, objectRef, uy26rxeeafndq));
                Object obj = objectRef.oyjLVtGms9eZwJ0;
                if (obj != null) {
                    return (TextContextMenuData) obj;
                }
                Intrinsics.gmXBnHsR2YSm("result");
                throw null;
            case 1:
                QLxGKa0co2zAEvd qLxGKa0co2zAEvd2 = androidTextContextMenuToolbarProvider.i7xAcZoXXiIt;
                zP42naeF6vBe zp42naef6vbe = new zP42naeF6vBe(androidTextContextMenuToolbarProvider, textContextMenuDataProvider, i2);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                androidTextContextMenuToolbarProvider.b41X89IqSbKt.b41X89IqSbKt("positioner", qLxGKa0co2zAEvd2, new VoAHKqpbZzH9eE(0, objectRef2, zp42naef6vbe));
                Object obj2 = objectRef2.oyjLVtGms9eZwJ0;
                if (obj2 != null) {
                    return (Rect) obj2;
                }
                Intrinsics.gmXBnHsR2YSm("result");
                throw null;
            default:
                Object hRNgd2zGCE5kj = androidTextContextMenuToolbarProvider.ra306ClFT3HT.hRNgd2zGCE5kj();
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) (((LayoutCoordinates) hRNgd2zGCE5kj).FsuUJlzzWhYnMlD() ? hRNgd2zGCE5kj : null);
                return layoutCoordinates == null ? Rect.b41X89IqSbKt : textContextMenuDataProvider.UT6drkZTpbSI(layoutCoordinates).UEutaskTsxaI(layoutCoordinates.WogNAwiJP7IHm(0L));
        }
    }
}
