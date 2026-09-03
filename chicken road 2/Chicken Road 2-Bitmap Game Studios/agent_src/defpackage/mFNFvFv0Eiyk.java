package defpackage;

import android.os.Bundle;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScopeImpl;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.internal.NavControllerImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class mFNFvFv0Eiyk implements Function1 {
    public final /* synthetic */ Object FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ mFNFvFv0Eiyk(CursorAnimationState cursorAnimationState, OffsetMapping offsetMapping, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, Brush brush) {
        this.oyjLVtGms9eZwJ0 = 3;
        this.i7xAcZoXXiIt = cursorAnimationState;
        this.Uo5pffGf8LUU = offsetMapping;
        this.gmXBnHsR2YSm = textFieldValue;
        this.FsuUJlzzWhYnMlD = legacyTextFieldState;
        this.b41X89IqSbKt = brush;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        List list;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.b41X89IqSbKt;
        Object obj3 = this.FsuUJlzzWhYnMlD;
        Object obj4 = this.gmXBnHsR2YSm;
        Object obj5 = this.Uo5pffGf8LUU;
        Object obj6 = this.i7xAcZoXXiIt;
        switch (i) {
            case 0:
                LegacyTextInputMethodRequest legacyTextInputMethodRequest = (LegacyTextInputMethodRequest) obj;
                LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode = ((AndroidLegacyPlatformTextInputServiceAdapter) obj6).yzPsTade5rL7D3;
                legacyTextInputMethodRequest.Uo5pffGf8LUU = (TextFieldValue) obj4;
                legacyTextInputMethodRequest.FsuUJlzzWhYnMlD = (ImeOptions) obj5;
                legacyTextInputMethodRequest.ra306ClFT3HT = (yRx9jbDCTnXb3) obj3;
                legacyTextInputMethodRequest.oyjLVtGms9eZwJ0 = (Function1) obj2;
                legacyTextInputMethodRequest.b41X89IqSbKt = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getFTJ2XS7ULgY8() : null;
                legacyTextInputMethodRequest.gmXBnHsR2YSm = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getExVmIuryuB8HeQ() : null;
                legacyTextInputMethodRequest.i7xAcZoXXiIt = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getViewConfiguration() : null;
                break;
            case 1:
                List list2 = (List) obj4;
                Ref.IntRef intRef = (Ref.IntRef) obj6;
                List list3 = (List) obj5;
                Function1 function1 = (Function1) obj2;
                LazyGridMeasureResult lazyGridMeasureResult = (LazyGridMeasureResult) obj3;
                LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope = (LazyLayoutPrefetchState.PrefetchResultScope) obj;
                int hRNgd2zGCE5kj = prefetchResultScope.hRNgd2zGCE5kj();
                int i2 = 0;
                for (int i3 = 0; i3 < hRNgd2zGCE5kj; i3++) {
                    i2 += (int) (lazyGridMeasureResult.o2t7oodqU1bUMaS == Orientation.oyjLVtGms9eZwJ0 ? prefetchResultScope.ra306ClFT3HT(i3) & 4294967295L : prefetchResultScope.ra306ClFT3HT(i3) >> 32);
                }
                if (list2 != null) {
                    list2.add(Integer.valueOf(i2));
                }
                if (intRef.oyjLVtGms9eZwJ0 == list3.size()) {
                    if (function1 != null && list2 != null) {
                        function1.uypNJrpDByoB(new LazyGridPrefetchResultScopeImpl(list2));
                        break;
                    }
                } else {
                    intRef.oyjLVtGms9eZwJ0++;
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj6;
                Ref.IntRef intRef2 = (Ref.IntRef) obj5;
                NavControllerImpl navControllerImpl = (NavControllerImpl) obj3;
                Bundle bundle = (Bundle) obj2;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                navBackStackEntry.getClass();
                ((Ref.BooleanRef) obj4).oyjLVtGms9eZwJ0 = true;
                int indexOf = arrayList.indexOf(navBackStackEntry);
                if (indexOf != -1) {
                    int i4 = indexOf + 1;
                    list = arrayList.subList(intRef2.oyjLVtGms9eZwJ0, i4);
                    intRef2.oyjLVtGms9eZwJ0 = i4;
                } else {
                    list = EmptyList.oyjLVtGms9eZwJ0;
                }
                navControllerImpl.yzPsTade5rL7D3(navBackStackEntry.b41X89IqSbKt, bundle, navBackStackEntry, list);
                break;
            default:
                OffsetMapping offsetMapping = (OffsetMapping) obj5;
                TextFieldValue textFieldValue = (TextFieldValue) obj4;
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj3;
                Brush brush = (Brush) obj2;
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                contentDrawScope.N();
                float oyjLVtGms9eZwJ0 = ((SnapshotMutableFloatStateImpl) ((CursorAnimationState) obj6).ra306ClFT3HT).oyjLVtGms9eZwJ0();
                if (oyjLVtGms9eZwJ0 != 0.0f) {
                    long j = textFieldValue.hRNgd2zGCE5kj;
                    int i5 = TextRange.ra306ClFT3HT;
                    int hRNgd2zGCE5kj2 = offsetMapping.hRNgd2zGCE5kj((int) (j >> 32));
                    TextLayoutResultProxy oyjLVtGms9eZwJ02 = legacyTextFieldState.oyjLVtGms9eZwJ0();
                    Rect ra306ClFT3HT = oyjLVtGms9eZwJ02 != null ? oyjLVtGms9eZwJ02.yzPsTade5rL7D3.ra306ClFT3HT(hRNgd2zGCE5kj2) : new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                    float floor = (float) Math.floor(contentDrawScope.rw91HsWWsh17Nm(2.0f));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f = floor / 2.0f;
                    float f2 = ra306ClFT3HT.yzPsTade5rL7D3 + f;
                    float intBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.b41X89IqSbKt() >> 32)) - f;
                    if (f2 > intBitsToFloat) {
                        f2 = intBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float floor2 = ((int) floor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    contentDrawScope.w(brush, (Float.floatToRawIntBits(ra306ClFT3HT.hRNgd2zGCE5kj) & 4294967295L) | (Float.floatToRawIntBits(floor2) << 32), (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(ra306ClFT3HT.oyjLVtGms9eZwJ0) & 4294967295L), floor, oyjLVtGms9eZwJ0);
                    break;
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ mFNFvFv0Eiyk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.gmXBnHsR2YSm = obj;
        this.i7xAcZoXXiIt = obj2;
        this.Uo5pffGf8LUU = obj3;
        this.FsuUJlzzWhYnMlD = obj4;
        this.b41X89IqSbKt = obj5;
    }

    public /* synthetic */ mFNFvFv0Eiyk(ArrayList arrayList, Ref.IntRef intRef, List list, Function1 function1, int i, LazyGridMeasureResult lazyGridMeasureResult) {
        this.oyjLVtGms9eZwJ0 = 1;
        this.gmXBnHsR2YSm = arrayList;
        this.i7xAcZoXXiIt = intRef;
        this.Uo5pffGf8LUU = list;
        this.b41X89IqSbKt = function1;
        this.FsuUJlzzWhYnMlD = lazyGridMeasureResult;
    }
}
