package defpackage;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.material3.TooltipKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class fuDJENIYBwmKgKU implements Function0 {
    public final /* synthetic */ MutableState b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ fuDJENIYBwmKgKU(MutableState mutableState, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        MutableState mutableState = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) mutableState.getOyjLVtGms9eZwJ0();
                if (layoutCoordinates != null) {
                    return layoutCoordinates;
                }
                InlineClassHelperKt.oyjLVtGms9eZwJ0("Required value was null.");
                yzPsTade5rL7D3.UEutaskTsxaI();
                return null;
            case 1:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) mutableState.getOyjLVtGms9eZwJ0();
                if (layoutCoordinates2 != null) {
                    return layoutCoordinates2;
                }
                InlineClassHelperKt.oyjLVtGms9eZwJ0("Required value was null.");
                yzPsTade5rL7D3.UEutaskTsxaI();
                return null;
            case 2:
                Boolean bool = (Boolean) mutableState.getOyjLVtGms9eZwJ0();
                bool.booleanValue();
                return bool;
            case 3:
                mutableState.setValue(unit);
                return unit;
            case 4:
                ((ExposedDropdownMenuAnchorType) mutableState.getOyjLVtGms9eZwJ0()).getClass();
                mutableState.setValue(new ExposedDropdownMenuAnchorType());
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                return (LazyLayoutItemProvider) ((Function0) mutableState.getOyjLVtGms9eZwJ0()).hRNgd2zGCE5kj();
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                return new LazyListIntervalContent((Function1) mutableState.getOyjLVtGms9eZwJ0());
            case 7:
                mutableState.setValue(Boolean.FALSE);
                return unit;
            case 8:
                LayoutCoordinates layoutCoordinates3 = (LayoutCoordinates) mutableState.getOyjLVtGms9eZwJ0();
                if (layoutCoordinates3 != null) {
                    return layoutCoordinates3;
                }
                InlineClassHelperKt.oyjLVtGms9eZwJ0("Required value was null.");
                yzPsTade5rL7D3.UEutaskTsxaI();
                return null;
            default:
                PaddingValuesImpl paddingValuesImpl = TooltipKt.yzPsTade5rL7D3;
                return (LayoutCoordinates) mutableState.getOyjLVtGms9eZwJ0();
        }
    }
}
