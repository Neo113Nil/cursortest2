package defpackage;

import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntRect;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.ui.menudetail.MenuDetailUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements Function2 {
    public final /* synthetic */ MutableState b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ l1(MutableState mutableState, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        float min;
        String str;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        MutableState mutableState = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                IntRect intRect = (IntRect) obj;
                IntRect intRect2 = (IntRect) obj2;
                int i2 = intRect2.yzPsTade5rL7D3;
                int i3 = intRect2.oyjLVtGms9eZwJ0;
                int i4 = intRect2.yzPsTade5rL7D3;
                int i5 = intRect2.ra306ClFT3HT;
                int i6 = intRect2.hRNgd2zGCE5kj;
                int i7 = intRect.ra306ClFT3HT;
                int i8 = intRect.hRNgd2zGCE5kj;
                int i9 = intRect.oyjLVtGms9eZwJ0;
                int i10 = intRect.yzPsTade5rL7D3;
                float f = 1.0f;
                if (i2 < i7) {
                    if (i5 <= i10) {
                        min = 1.0f;
                    } else if (intRect2.oyjLVtGms9eZwJ0() != 0) {
                        min = (((Math.min(intRect.ra306ClFT3HT, i5) + Math.max(i10, i4)) / 2) - i4) / intRect2.oyjLVtGms9eZwJ0();
                    }
                    if (i6 < i9) {
                        if (i3 > i8) {
                            if (intRect2.hRNgd2zGCE5kj() != 0) {
                                f = (((Math.min(i9, i3) + Math.max(i8, i6)) / 2) - i6) / intRect2.hRNgd2zGCE5kj();
                            }
                        }
                        mutableState.setValue(new TransformOrigin(TransformOriginKt.yzPsTade5rL7D3(min, f)));
                        break;
                    }
                    f = 0.0f;
                    mutableState.setValue(new TransformOrigin(TransformOriginKt.yzPsTade5rL7D3(min, f)));
                }
                min = 0.0f;
                if (i6 < i9) {
                }
                f = 0.0f;
                mutableState.setValue(new TransformOrigin(TransformOriginKt.yzPsTade5rL7D3(min, f)));
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.ZvpnNpCMEWSR3(1 & intValue, (intValue & 3) != 2)) {
                    composer.gmXBnHsR2YSm();
                    break;
                } else {
                    MenuItemEntity menuItemEntity = ((MenuDetailUiState) mutableState.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3;
                    if (menuItemEntity == null || (str = menuItemEntity.hRNgd2zGCE5kj) == null) {
                        str = "Menu Detail";
                    }
                    TextKt.hRNgd2zGCE5kj(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer, 0, 0, 262142);
                    break;
                }
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.ZvpnNpCMEWSR3(1 & intValue2, (intValue2 & 3) != 2)) {
                    composer2.gmXBnHsR2YSm();
                    break;
                } else {
                    ExposedDropdownMenuDefaults.yzPsTade5rL7D3.yzPsTade5rL7D3(((Boolean) mutableState.getOyjLVtGms9eZwJ0()).booleanValue(), null, composer2, 0);
                    break;
                }
        }
        return unit;
    }
}
