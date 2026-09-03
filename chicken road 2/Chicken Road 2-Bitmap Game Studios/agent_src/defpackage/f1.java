package defpackage;

import android.os.Bundle;
import androidx.compose.foundation.draganddrop.DragAndDropSourceNode;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.SaversKt$NonNullValueClassSaver$1;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.os.BundleKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavControllerImpl;
import androidx.os.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Function2 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ f1(DragAndDropSourceNode dragAndDropSourceNode) {
        this.oyjLVtGms9eZwJ0 = 1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Bundle bundle = null;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i) {
            case 0:
                return unit;
            case 1:
                throw null;
            case 2:
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3(obj, obj2));
            case 3:
                ((Integer) obj2).getClass();
                return new GridItemSpan(1L);
            case 4:
                LazyGridState lazyGridState = (LazyGridState) obj2;
                int i2 = LazyGridState.pu0JZhzR2Or6;
                return CollectionsKt.Yey4RyhSyBRHub(Integer.valueOf(((SnapshotMutableIntStateImpl) lazyGridState.oyjLVtGms9eZwJ0.yzPsTade5rL7D3).hRNgd2zGCE5kj()), Integer.valueOf(((SnapshotMutableIntStateImpl) lazyGridState.oyjLVtGms9eZwJ0.hRNgd2zGCE5kj).hRNgd2zGCE5kj()));
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                LazyListState lazyListState = (LazyListState) obj2;
                SaverKt$Saver$1 saverKt$Saver$1 = LazyListState.ZvpnNpCMEWSR3;
                return CollectionsKt.Yey4RyhSyBRHub(Integer.valueOf(lazyListState.Uo5pffGf8LUU()), Integer.valueOf(lazyListState.FsuUJlzzWhYnMlD()));
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = ((LazyStaggeredGridState) obj2).ra306ClFT3HT;
                return CollectionsKt.Yey4RyhSyBRHub(lazyStaggeredGridScrollPosition.hRNgd2zGCE5kj, lazyStaggeredGridScrollPosition.oyjLVtGms9eZwJ0);
            case 7:
                ((Integer) obj2).getClass();
                ListItemKt.yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(385), (Composer) obj);
                return unit;
            case 8:
                NavHostController navHostController = (NavHostController) obj2;
                NavControllerImpl navControllerImpl = navHostController.hRNgd2zGCE5kj;
                LinkedHashMap linkedHashMap = navControllerImpl.yRx9jbDCTnXb3;
                ArrayDeque arrayDeque = navControllerImpl.gmXBnHsR2YSm;
                LinkedHashMap linkedHashMap2 = navControllerImpl.uypNJrpDByoB;
                ArrayList arrayList = new ArrayList();
                Bundle yzPsTade5rL7D3 = BundleKt.yzPsTade5rL7D3((Pair[]) Arrays.copyOf(new Pair[0], 0));
                for (Map.Entry entry : MapsKt.FsuUJlzzWhYnMlD(navControllerImpl.exVmIuryuB8HeQ.yzPsTade5rL7D3).entrySet()) {
                    ((Navigator) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundle = BundleKt.yzPsTade5rL7D3((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    SavedStateWriter.hRNgd2zGCE5kj(yzPsTade5rL7D3, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", yzPsTade5rL7D3);
                }
                if (!arrayDeque.isEmpty()) {
                    if (bundle == null) {
                        bundle = BundleKt.yzPsTade5rL7D3((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<E> it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new NavBackStackEntryState((NavBackStackEntry) it.next()).hRNgd2zGCE5kj());
                    }
                    SavedStateWriter.yzPsTade5rL7D3(bundle, "android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = BundleKt.yzPsTade5rL7D3((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str = (String) entry2.getValue();
                        int i4 = i3 + 1;
                        iArr[i3] = intValue;
                        if (str == null) {
                            str = "";
                        }
                        arrayList3.add(str);
                        i3 = i4;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    SavedStateWriter.hRNgd2zGCE5kj(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = BundleKt.yzPsTade5rL7D3((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str2 = (String) entry3.getKey();
                        ArrayDeque arrayDeque2 = (ArrayDeque) entry3.getValue();
                        arrayList4.add(str2);
                        ArrayList arrayList5 = new ArrayList();
                        Iterator<E> it2 = arrayDeque2.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(((NavBackStackEntryState) it2.next()).hRNgd2zGCE5kj());
                        }
                        SavedStateWriter.yzPsTade5rL7D3(bundle, "android-support-nav:controller:backStackStates:" + str2, arrayList5);
                    }
                    SavedStateWriter.hRNgd2zGCE5kj(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (navHostController.b41X89IqSbKt) {
                    if (bundle == null) {
                        bundle = BundleKt.yzPsTade5rL7D3((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", navHostController.b41X89IqSbKt);
                }
                return bundle;
            case 9:
                ((Integer) obj2).getClass();
                NavigationItemKt.yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(1), (Composer) obj);
                return unit;
            case 10:
                return Integer.valueOf(((IntrinsicMeasurable) obj).qWMdVyDND2HO1(((Integer) obj2).intValue()));
            case 11:
                return Integer.valueOf(((IntrinsicMeasurable) obj).zBlwxQG5AB2UBQ(((Integer) obj2).intValue()));
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                return Integer.valueOf(((IntrinsicMeasurable) obj).uypNJrpDByoB(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((IntrinsicMeasurable) obj).sb2TpovOJ8wNlST(((Integer) obj2).intValue()));
            case 14:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                return obj2;
            case 16:
                AnnotatedString annotatedString = (AnnotatedString) obj2;
                SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.yzPsTade5rL7D3;
                return CollectionsKt.UEutaskTsxaI(annotatedString.b41X89IqSbKt, SaversKt.yzPsTade5rL7D3(annotatedString.oyjLVtGms9eZwJ0, SaversKt.hRNgd2zGCE5kj, (SaverScope) obj));
            case 17:
                SaverKt$Saver$1 saverKt$Saver$13 = SaversKt.yzPsTade5rL7D3;
                return Integer.valueOf(((TextDecoration) obj2).yzPsTade5rL7D3);
            case 18:
                TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj2;
                SaverKt$Saver$1 saverKt$Saver$14 = SaversKt.yzPsTade5rL7D3;
                return CollectionsKt.UEutaskTsxaI(Float.valueOf(textGeometricTransform.yzPsTade5rL7D3), Float.valueOf(textGeometricTransform.hRNgd2zGCE5kj));
            case 19:
                SaverScope saverScope = (SaverScope) obj;
                TextIndent textIndent = (TextIndent) obj2;
                SaverKt$Saver$1 saverKt$Saver$15 = SaversKt.yzPsTade5rL7D3;
                TextUnit textUnit = new TextUnit(textIndent.yzPsTade5rL7D3);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.XrorSzThrtvJ4A;
                return CollectionsKt.UEutaskTsxaI(SaversKt.yzPsTade5rL7D3(textUnit, saversKt$NonNullValueClassSaver$1, saverScope), SaversKt.yzPsTade5rL7D3(new TextUnit(textIndent.hRNgd2zGCE5kj), saversKt$NonNullValueClassSaver$1, saverScope));
            case 20:
                SaverKt$Saver$1 saverKt$Saver$16 = SaversKt.yzPsTade5rL7D3;
                return Integer.valueOf(((FontWeight) obj2).oyjLVtGms9eZwJ0);
            case 21:
                LinkAnnotation.Url url = (LinkAnnotation.Url) obj2;
                SaverKt$Saver$1 saverKt$Saver$17 = SaversKt.yzPsTade5rL7D3;
                return CollectionsKt.UEutaskTsxaI(url.yzPsTade5rL7D3, SaversKt.yzPsTade5rL7D3(url.hRNgd2zGCE5kj, SaversKt.UEutaskTsxaI, (SaverScope) obj));
            case 22:
                SaverKt$Saver$1 saverKt$Saver$18 = SaversKt.yzPsTade5rL7D3;
                return Float.valueOf(((BaselineShift) obj2).yzPsTade5rL7D3);
            case 23:
                SaverScope saverScope2 = (SaverScope) obj;
                List list = (List) obj2;
                SaverKt$Saver$1 saverKt$Saver$19 = SaversKt.yzPsTade5rL7D3;
                ArrayList arrayList6 = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList6.add(SaversKt.yzPsTade5rL7D3((AnnotatedString.Range) list.get(i5), SaversKt.ra306ClFT3HT, saverScope2));
                }
                return arrayList6;
            case 24:
                TextRange textRange = (TextRange) obj2;
                SaverKt$Saver$1 saverKt$Saver$110 = SaversKt.yzPsTade5rL7D3;
                return CollectionsKt.UEutaskTsxaI(Integer.valueOf((int) (textRange.yzPsTade5rL7D3 >> 32)), Integer.valueOf((int) (textRange.yzPsTade5rL7D3 & 4294967295L)));
            case 25:
                SaverScope saverScope3 = (SaverScope) obj;
                Shadow shadow = (Shadow) obj2;
                SaverKt$Saver$1 saverKt$Saver$111 = SaversKt.yzPsTade5rL7D3;
                return CollectionsKt.UEutaskTsxaI(SaversKt.yzPsTade5rL7D3(new Color(shadow.yzPsTade5rL7D3), SaversKt.MCcLy95b8Awzmw, saverScope3), SaversKt.yzPsTade5rL7D3(new Offset(shadow.hRNgd2zGCE5kj), SaversKt.uY26rxeEAFnDq, saverScope3), Float.valueOf(shadow.ra306ClFT3HT));
            case 26:
                SaverKt$Saver$1 saverKt$Saver$112 = SaversKt.yzPsTade5rL7D3;
                return Integer.valueOf(((TextAlign) obj2).yzPsTade5rL7D3);
            case 27:
                SaverKt$Saver$1 saverKt$Saver$113 = SaversKt.yzPsTade5rL7D3;
                return Integer.valueOf(((TextDirection) obj2).yzPsTade5rL7D3);
            case 28:
                SaverKt$Saver$1 saverKt$Saver$114 = SaversKt.yzPsTade5rL7D3;
                return Integer.valueOf(((Hyphens) obj2).yzPsTade5rL7D3);
            default:
                SaverKt$Saver$1 saverKt$Saver$115 = SaversKt.yzPsTade5rL7D3;
                return Integer.valueOf(((FontStyle) obj2).yzPsTade5rL7D3);
        }
    }

    public /* synthetic */ f1(int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
    }

    public /* synthetic */ f1(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }
}
