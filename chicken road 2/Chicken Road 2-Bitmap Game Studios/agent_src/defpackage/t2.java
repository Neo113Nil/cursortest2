package defpackage;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.ScrollNode;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListPrefetchResultScopeImpl;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class t2 implements Function1 {
    public final /* synthetic */ int b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ t2(int i, String str, ArrayList arrayList) {
        this.oyjLVtGms9eZwJ0 = 0;
        this.gmXBnHsR2YSm = str;
        this.i7xAcZoXXiIt = arrayList;
        this.b41X89IqSbKt = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        Composition composition;
        long[] jArr;
        boolean z;
        Composition composition2;
        long[] jArr2;
        boolean z2;
        int i;
        int i2 = this.oyjLVtGms9eZwJ0;
        boolean z3 = true;
        int i3 = 0;
        Object obj2 = this.i7xAcZoXXiIt;
        int i4 = this.b41X89IqSbKt;
        Object obj3 = this.gmXBnHsR2YSm;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i2) {
            case 0:
                String str = (String) obj3;
                List list = (List) obj2;
                TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
                TextRange textRange = textFieldBuffer.Uo5pffGf8LUU;
                if (textRange != null) {
                    long j = textRange.yzPsTade5rL7D3;
                    int i5 = (int) (j >> 32);
                    ImeEditCommand_androidKt.hRNgd2zGCE5kj(textFieldBuffer, i5, (int) (4294967295L & j), str);
                    if (str.length() > 0) {
                        textFieldBuffer.ra306ClFT3HT(i5, str.length() + i5, list);
                    }
                } else {
                    int i7xAcZoXXiIt = TextRange.i7xAcZoXXiIt(textFieldBuffer.i7xAcZoXXiIt);
                    ImeEditCommand_androidKt.hRNgd2zGCE5kj(textFieldBuffer, i7xAcZoXXiIt, TextRange.gmXBnHsR2YSm(textFieldBuffer.i7xAcZoXXiIt), str);
                    if (str.length() > 0) {
                        textFieldBuffer.ra306ClFT3HT(i7xAcZoXXiIt, str.length() + i7xAcZoXXiIt, list);
                    }
                }
                int ra306ClFT3HT = RangesKt.ra306ClFT3HT(i4 > 0 ? (r2 + i4) - 1 : (TextRange.i7xAcZoXXiIt(textFieldBuffer.i7xAcZoXXiIt) + i4) - str.length(), 0, textFieldBuffer.b41X89IqSbKt.length());
                textFieldBuffer.b41X89IqSbKt(TextRangeKt.yzPsTade5rL7D3(ra306ClFT3HT, ra306ClFT3HT));
                break;
            case 1:
                Function1 function1 = (Function1) obj3;
                LazyListMeasureResult lazyListMeasureResult = (LazyListMeasureResult) obj2;
                LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope = (LazyLayoutPrefetchState.PrefetchResultScope) obj;
                if (function1 != null) {
                    int hRNgd2zGCE5kj = prefetchResultScope.hRNgd2zGCE5kj();
                    for (int i6 = 0; i6 < hRNgd2zGCE5kj; i6++) {
                        if (lazyListMeasureResult.NIabVTHf6LMJyXq == Orientation.oyjLVtGms9eZwJ0) {
                            prefetchResultScope.ra306ClFT3HT(i6);
                        } else {
                            prefetchResultScope.ra306ClFT3HT(i6);
                        }
                    }
                    function1.uypNJrpDByoB(new LazyListPrefetchResultScopeImpl());
                    break;
                }
                break;
            case 2:
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj3;
                MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) obj2;
                Composition composition3 = (Composition) obj;
                if (recomposeScopeImpl.b41X89IqSbKt == i4 && Intrinsics.yzPsTade5rL7D3(mutableObjectIntMap, recomposeScopeImpl.gmXBnHsR2YSm) && (composition3 instanceof CompositionImpl)) {
                    long[] jArr3 = mutableObjectIntMap.yzPsTade5rL7D3;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j2 = jArr3[i7];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = i3;
                                while (i10 < i9) {
                                    if ((255 & j2) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        z2 = z3;
                                        Object obj4 = mutableObjectIntMap.hRNgd2zGCE5kj[i11];
                                        boolean z4 = mutableObjectIntMap.ra306ClFT3HT[i11] != i4 ? z2 : false;
                                        if (z4) {
                                            i = i8;
                                            CompositionImpl compositionImpl = (CompositionImpl) composition3;
                                            composition2 = composition3;
                                            MutableScatterMap mutableScatterMap = compositionImpl.UEutaskTsxaI;
                                            ScopeMap.ra306ClFT3HT(mutableScatterMap, obj4, recomposeScopeImpl);
                                            jArr2 = jArr3;
                                            if (obj4 instanceof DerivedState) {
                                                DerivedState derivedState = (DerivedState) obj4;
                                                if (!mutableScatterMap.ra306ClFT3HT(derivedState)) {
                                                    ScopeMap.oyjLVtGms9eZwJ0(compositionImpl.uypNJrpDByoB, derivedState);
                                                }
                                                MutableScatterMap mutableScatterMap2 = recomposeScopeImpl.i7xAcZoXXiIt;
                                                if (mutableScatterMap2 != null) {
                                                    mutableScatterMap2.uypNJrpDByoB(obj4);
                                                }
                                            }
                                        } else {
                                            composition2 = composition3;
                                            jArr2 = jArr3;
                                            i = i8;
                                        }
                                        if (z4) {
                                            mutableObjectIntMap.gmXBnHsR2YSm(i11);
                                        }
                                    } else {
                                        composition2 = composition3;
                                        jArr2 = jArr3;
                                        z2 = z3;
                                        i = i8;
                                    }
                                    j2 >>= i;
                                    i10++;
                                    i8 = i;
                                    composition3 = composition2;
                                    z3 = z2;
                                    jArr3 = jArr2;
                                }
                                composition = composition3;
                                jArr = jArr3;
                                z = z3;
                                if (i9 != i8) {
                                    break;
                                }
                            } else {
                                composition = composition3;
                                jArr = jArr3;
                                z = z3;
                            }
                            if (i7 == length) {
                                break;
                            } else {
                                i7++;
                                composition3 = composition;
                                z3 = z;
                                jArr3 = jArr;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            default:
                ScrollNode scrollNode = (ScrollNode) obj3;
                Placeable placeable = (Placeable) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int hRNgd2zGCE5kj2 = ((SnapshotMutableIntStateImpl) scrollNode.MCcLy95b8Awzmw.yzPsTade5rL7D3).hRNgd2zGCE5kj();
                if (hRNgd2zGCE5kj2 < 0) {
                    hRNgd2zGCE5kj2 = 0;
                }
                if (hRNgd2zGCE5kj2 <= i4) {
                    i4 = hRNgd2zGCE5kj2;
                }
                int i12 = -i4;
                boolean z5 = scrollNode.FTJ2XS7ULgY8;
                int i13 = z5 ? 0 : i12;
                int i14 = z5 ? i12 : 0;
                placementScope.oyjLVtGms9eZwJ0 = true;
                Placeable.PlacementScope.MCcLy95b8Awzmw(placementScope, placeable, i13, i14, null, 12);
                placementScope.oyjLVtGms9eZwJ0 = false;
                break;
        }
        return unit;
    }

    public /* synthetic */ t2(Object obj, int i, Object obj2, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.gmXBnHsR2YSm = obj;
        this.b41X89IqSbKt = i;
        this.i7xAcZoXXiIt = obj2;
    }
}
