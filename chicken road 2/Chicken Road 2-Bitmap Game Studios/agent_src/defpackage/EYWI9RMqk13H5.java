package defpackage;

import android.app.RemoteAction;
import android.content.ClipData;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupProperties;
import androidx.navigation.compose.DialogHostKt;
import androidx.navigation.compose.DialogNavigator;
import com.door.brass.knob.ui.challenge.ChallengeScreenKt;
import com.door.brass.knob.ui.challenge.ChallengeViewModel;
import com.door.brass.knob.ui.menudetail.ComposableSingletons$MenuDetailScreenKt;
import com.door.brass.knob.ui.tips.TipsScreenKt;
import com.door.brass.knob.ui.tips.TipsViewModel;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class EYWI9RMqk13H5 implements Function2 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ EYWI9RMqk13H5(MovableContent movableContent, Object obj) {
        this.oyjLVtGms9eZwJ0 = 7;
        this.b41X89IqSbKt = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f2, code lost:
    
        if (r8 == null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f9  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        SheetValue sheetValue;
        Collection vywRyEooKGLFsX;
        CharSequence label;
        CharSequence title;
        String str;
        char c = 7;
        int i = 2;
        Object obj3 = null;
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                return Boolean.valueOf(((TextInclusionStrategy) this.b41X89IqSbKt).yzPsTade5rL7D3(RectHelper_androidKt.oyjLVtGms9eZwJ0((RectF) obj), RectHelper_androidKt.oyjLVtGms9eZwJ0((RectF) obj2)));
            case 1:
                Long l = (Long) obj2;
                if (SelectionRegistrarKt.yzPsTade5rL7D3((SelectionRegistrar) this.b41X89IqSbKt, l.longValue())) {
                    return l;
                }
                return null;
            case 2:
                ((Integer) obj2).getClass();
                ChallengeScreenKt.ra306ClFT3HT((ChallengeViewModel) this.b41X89IqSbKt, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return Unit.yzPsTade5rL7D3;
            case 3:
                RememberManager rememberManager = (RememberManager) this.b41X89IqSbKt;
                ((Integer) obj).getClass();
                if (obj2 instanceof ComposeNodeLifecycleCallback) {
                    rememberManager.yzPsTade5rL7D3((ComposeNodeLifecycleCallback) obj2);
                }
                if (obj2 instanceof RememberObserverHolder) {
                    rememberManager.gmXBnHsR2YSm((RememberObserverHolder) obj2);
                }
                if (obj2 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj2).oyjLVtGms9eZwJ0();
                }
                return Unit.yzPsTade5rL7D3;
            case 4:
                ((Integer) obj2).getClass();
                CoreTextFieldKt.oyjLVtGms9eZwJ0((TextFieldSelectionManager) this.b41X89IqSbKt, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return Unit.yzPsTade5rL7D3;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                TextContextMenuItem textContextMenuItem = (TextContextMenuItem) this.b41X89IqSbKt;
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                PopupProperties popupProperties = DefaultTextContextMenuDropdownProvider_androidKt.yzPsTade5rL7D3;
                composer.mFNFvFv0Eiyk(666084174);
                String str2 = textContextMenuItem.hRNgd2zGCE5kj;
                composer.o4ticBN7g1K8jE();
                return str2;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ((Integer) obj2).getClass();
                DialogHostKt.yzPsTade5rL7D3((DialogNavigator) this.b41X89IqSbKt, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return Unit.yzPsTade5rL7D3;
            case 7:
                Composer composer2 = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer2.ZvpnNpCMEWSR3(intValue & 1, (intValue & 3) != 2)) {
                    throw null;
                }
                composer2.gmXBnHsR2YSm();
                return Unit.yzPsTade5rL7D3;
            case 8:
                ((Integer) obj2).getClass();
                ((InfiniteTransition) this.b41X89IqSbKt).yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(1), (Composer) obj);
                return Unit.yzPsTade5rL7D3;
            case 9:
                ((TextDragObserver) this.b41X89IqSbKt).b41X89IqSbKt(((Offset) obj2).yzPsTade5rL7D3);
                return Unit.yzPsTade5rL7D3;
            case 10:
                Function0 function0 = (Function0) this.b41X89IqSbKt;
                Composer composer3 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (composer3.ZvpnNpCMEWSR3(intValue2 & 1, (intValue2 & 3) != 2)) {
                    IconButtonKt.yzPsTade5rL7D3(function0, null, false, null, null, ComposableSingletons$MenuDetailScreenKt.yzPsTade5rL7D3, composer3, 1572864, 62);
                } else {
                    composer3.gmXBnHsR2YSm();
                }
                return Unit.yzPsTade5rL7D3;
            case 11:
                SheetState sheetState = (SheetState) this.b41X89IqSbKt;
                int i2 = ModalBottomSheetKt.hRNgd2zGCE5kj;
                DraggableAnchors yzPsTade5rL7D3 = AnchoredDraggableKt.yzPsTade5rL7D3(new Gx4wlvRzB4Xo5(Constraints.Uo5pffGf8LUU(((Constraints) obj2).yzPsTade5rL7D3), (IntSize) obj, sheetState, i));
                int ordinal = ((SheetValue) sheetState.oyjLVtGms9eZwJ0.Uo5pffGf8LUU.getOyjLVtGms9eZwJ0()).ordinal();
                if (ordinal == 0) {
                    sheetValue = SheetValue.oyjLVtGms9eZwJ0;
                } else if (ordinal == 1) {
                    sheetValue = SheetValue.b41X89IqSbKt;
                    if (!yzPsTade5rL7D3.b41X89IqSbKt(sheetValue)) {
                        sheetValue = SheetValue.oyjLVtGms9eZwJ0;
                    }
                } else {
                    if (ordinal != 2) {
                        h1.hRNgd2zGCE5kj();
                        return null;
                    }
                    sheetValue = SheetValue.gmXBnHsR2YSm;
                    if (!yzPsTade5rL7D3.b41X89IqSbKt(sheetValue)) {
                        sheetValue = SheetValue.b41X89IqSbKt;
                        if (!yzPsTade5rL7D3.b41X89IqSbKt(sheetValue)) {
                            sheetValue = SheetValue.oyjLVtGms9eZwJ0;
                        }
                    }
                }
                return new Pair(yzPsTade5rL7D3, sheetValue);
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                Recomposer recomposer = (Recomposer) this.b41X89IqSbKt;
                Set set = (Set) obj;
                synchronized (recomposer.ra306ClFT3HT) {
                    try {
                        if (((Recomposer.State) recomposer.pu0JZhzR2Or6.getValue()).compareTo(Recomposer.State.Uo5pffGf8LUU) >= 0) {
                            MutableScatterSet mutableScatterSet = recomposer.Uo5pffGf8LUU;
                            if (set instanceof ScatterSetWrapper) {
                                ScatterSet scatterSet = ((ScatterSetWrapper) set).oyjLVtGms9eZwJ0;
                                Object[] objArr = scatterSet.hRNgd2zGCE5kj;
                                long[] jArr = scatterSet.yzPsTade5rL7D3;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j = jArr[i3];
                                        if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((255 & j) < 128) {
                                                    Object obj4 = objArr[(i3 << 3) + i5];
                                                    if (!(obj4 instanceof StateObjectImpl) || ((StateObjectImpl) obj4).FTJ2XS7ULgY8(1)) {
                                                        mutableScatterSet.oyjLVtGms9eZwJ0(obj4);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i4 != 8) {
                                            }
                                        }
                                        if (i3 != length) {
                                            i3++;
                                            c = 7;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof StateObjectImpl) || ((StateObjectImpl) obj5).FTJ2XS7ULgY8(1)) {
                                        mutableScatterSet.oyjLVtGms9eZwJ0(obj5);
                                    }
                                }
                            }
                            obj3 = recomposer.o4ticBN7g1K8jE();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (obj3 != null) {
                    ((CancellableContinuationImpl) obj3).FsuUJlzzWhYnMlD(Unit.yzPsTade5rL7D3);
                }
                return Unit.yzPsTade5rL7D3;
            case 13:
                SafeCollector safeCollector = (SafeCollector) this.b41X89IqSbKt;
                int intValue3 = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                CoroutineContext.Key oyjLVtGms9eZwJ0 = element.getOyjLVtGms9eZwJ0();
                Object pu0JZhzR2Or6 = safeCollector.Uo5pffGf8LUU.pu0JZhzR2Or6(oyjLVtGms9eZwJ0);
                if (oyjLVtGms9eZwJ0 != Job.Key.oyjLVtGms9eZwJ0) {
                    if (element != pu0JZhzR2Or6) {
                        intValue3 = Integer.MIN_VALUE;
                    }
                    intValue3++;
                } else {
                    Object obj6 = (Job) pu0JZhzR2Or6;
                    Object obj7 = (Job) element;
                    while (obj7 != null) {
                        if (obj7 != obj6 && (obj7 instanceof ScopeCoroutine)) {
                            ChildHandle m2cVaMgRYGrW47M = ((ScopeCoroutine) obj7).m2cVaMgRYGrW47M();
                            obj7 = m2cVaMgRYGrW47M != null ? m2cVaMgRYGrW47M.getParent() : null;
                        } else {
                            obj3 = obj7;
                            if (obj3 == obj6) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + obj3 + ", expected child of " + obj6 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (obj3 == obj6) {
                    }
                }
                return Integer.valueOf(intValue3);
            case 14:
                ((Integer) obj2).getClass();
                SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.yzPsTade5rL7D3;
                ((SegmentedButtonDefaults) this.b41X89IqSbKt).yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(7), (Composer) obj);
                return Unit.yzPsTade5rL7D3;
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                Ref.LongRef longRef = (Ref.LongRef) this.b41X89IqSbKt;
                ((PointerInputChange) obj).yzPsTade5rL7D3();
                longRef.oyjLVtGms9eZwJ0 = ((Offset) obj2).yzPsTade5rL7D3;
                return Unit.yzPsTade5rL7D3;
            case 16:
                Ref.FloatRef floatRef = (Ref.FloatRef) this.b41X89IqSbKt;
                float floatValue = ((Float) obj2).floatValue();
                float f = SliderKt.yzPsTade5rL7D3;
                ((PointerInputChange) obj).yzPsTade5rL7D3();
                floatRef.oyjLVtGms9eZwJ0 = floatValue;
                return Unit.yzPsTade5rL7D3;
            case 17:
                final SnapshotStateObserver snapshotStateObserver = (SnapshotStateObserver) this.b41X89IqSbKt;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = snapshotStateObserver.hRNgd2zGCE5kj;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        vywRyEooKGLFsX = collection;
                    } else if (obj8 instanceof Set) {
                        vywRyEooKGLFsX = CollectionsKt.Yey4RyhSyBRHub(obj8, collection);
                    } else {
                        if (!(obj8 instanceof List)) {
                            throw OcGJUxcOVecQiKb.XrorSzThrtvJ4A("Unexpected notification");
                        }
                        vywRyEooKGLFsX = CollectionsKt.vywRyEooKGLFsX((Collection) obj8, CollectionsKt.o4ticBN7g1K8jE(collection));
                    }
                    while (!atomicReference.compareAndSet(obj8, vywRyEooKGLFsX)) {
                        if (atomicReference.get() != obj8) {
                            break;
                        }
                    }
                    if (snapshotStateObserver.oyjLVtGms9eZwJ0()) {
                        snapshotStateObserver.yzPsTade5rL7D3.uypNJrpDByoB(new Function0() { // from class: androidx.compose.runtime.snapshots.hRNgd2zGCE5kj
                            /* JADX WARN: Finally extract failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object hRNgd2zGCE5kj() {
                                int i6;
                                SnapshotStateObserver snapshotStateObserver2 = SnapshotStateObserver.this;
                                do {
                                    synchronized (snapshotStateObserver2.i7xAcZoXXiIt) {
                                        try {
                                            if (!snapshotStateObserver2.ra306ClFT3HT) {
                                                snapshotStateObserver2.ra306ClFT3HT = true;
                                                try {
                                                    MutableVector mutableVector = snapshotStateObserver2.gmXBnHsR2YSm;
                                                    Object[] objArr2 = mutableVector.oyjLVtGms9eZwJ0;
                                                    int i7 = mutableVector.gmXBnHsR2YSm;
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        SnapshotStateObserver.ObservedScopeMap observedScopeMap = (SnapshotStateObserver.ObservedScopeMap) objArr2[i8];
                                                        MutableScatterSet mutableScatterSet2 = observedScopeMap.i7xAcZoXXiIt;
                                                        Function1 function1 = observedScopeMap.yzPsTade5rL7D3;
                                                        Object[] objArr3 = mutableScatterSet2.hRNgd2zGCE5kj;
                                                        long[] jArr2 = mutableScatterSet2.yzPsTade5rL7D3;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i9 = 0;
                                                            while (true) {
                                                                long j2 = jArr2[i9];
                                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i10 = 8;
                                                                    int i11 = 8 - ((~(i9 - length2)) >>> 31);
                                                                    int i12 = 0;
                                                                    while (i12 < i11) {
                                                                        if ((j2 & 255) < 128) {
                                                                            i6 = i10;
                                                                            function1.uypNJrpDByoB(objArr3[(i9 << 3) + i12]);
                                                                        } else {
                                                                            i6 = i10;
                                                                        }
                                                                        j2 >>= i6;
                                                                        i12++;
                                                                        i10 = i6;
                                                                    }
                                                                    if (i11 != i10) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i9 == length2) {
                                                                    break;
                                                                }
                                                                i9++;
                                                            }
                                                        }
                                                        mutableScatterSet2.gmXBnHsR2YSm();
                                                    }
                                                    snapshotStateObserver2.ra306ClFT3HT = false;
                                                } catch (Throwable th2) {
                                                    snapshotStateObserver2.ra306ClFT3HT = false;
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                } while (snapshotStateObserver2.oyjLVtGms9eZwJ0());
                                return Unit.yzPsTade5rL7D3;
                            }
                        });
                    }
                    return Unit.yzPsTade5rL7D3;
                    break;
                }
            case 18:
                TextClassification textClassification = (TextClassification) this.b41X89IqSbKt;
                Composer composer4 = (Composer) obj;
                ((Integer) obj2).getClass();
                composer4.mFNFvFv0Eiyk(950061013);
                label = textClassification.getLabel();
                String valueOf = String.valueOf(label);
                composer4.o4ticBN7g1K8jE();
                return valueOf;
            case 19:
                RemoteAction remoteAction = (RemoteAction) this.b41X89IqSbKt;
                Composer composer5 = (Composer) obj;
                ((Integer) obj2).getClass();
                composer5.mFNFvFv0Eiyk(-1376593684);
                title = remoteAction.getTitle();
                String obj9 = title.toString();
                composer5.o4ticBN7g1K8jE();
                return obj9;
            case 20:
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) this.b41X89IqSbKt;
                ClipEntry clipEntry = (ClipEntry) obj;
                textFieldDecoratorModifierNode.u0();
                textFieldDecoratorModifierNode.pu0JZhzR2Or6.ra306ClFT3HT();
                ClipData clipData = clipEntry.yzPsTade5rL7D3;
                ClipData clipData2 = clipEntry.yzPsTade5rL7D3;
                int itemCount = clipData.getItemCount();
                boolean z = false;
                for (int i6 = 0; i6 < itemCount; i6++) {
                    z = z || clipData2.getItemAt(i6).getText() != null;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    int itemCount2 = clipData2.getItemCount();
                    boolean z2 = false;
                    for (int i7 = 0; i7 < itemCount2; i7++) {
                        CharSequence text = clipData2.getItemAt(i7).getText();
                        if (text != null) {
                            if (z2) {
                                sb.append("\n");
                            }
                            sb.append(text);
                            z2 = true;
                        }
                    }
                    str = sb.toString();
                } else {
                    str = null;
                }
                ReceiveContentConfiguration yzPsTade5rL7D32 = ReceiveContentConfigurationKt.yzPsTade5rL7D3(textFieldDecoratorModifierNode);
                if (yzPsTade5rL7D32 != null) {
                    ((DynamicReceiveContentConfiguration$receiveContentListener$1) yzPsTade5rL7D32.yzPsTade5rL7D3()).getClass();
                    throw null;
                }
                if (str == null) {
                    return Boolean.TRUE;
                }
                TransformedTextFieldState.hRNgd2zGCE5kj(textFieldDecoratorModifierNode.exVmIuryuB8HeQ, str, false, 14);
                throw null;
            case 21:
                ((Integer) obj2).getClass();
                TipsScreenKt.hRNgd2zGCE5kj((TipsViewModel) this.b41X89IqSbKt, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return Unit.yzPsTade5rL7D3;
            case 22:
                return new IntOffset(((BiasAlignment.Vertical) this.b41X89IqSbKt).yzPsTade5rL7D3(0, (int) (((IntSize) obj).yzPsTade5rL7D3 & 4294967295L)) & 4294967295L);
            default:
                return new IntOffset(((Alignment) this.b41X89IqSbKt).yzPsTade5rL7D3(0L, ((IntSize) obj).yzPsTade5rL7D3, (LayoutDirection) obj2));
        }
    }

    public /* synthetic */ EYWI9RMqk13H5(int i, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
    }

    public /* synthetic */ EYWI9RMqk13H5(int i, int i2, Object obj) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = obj;
    }
}
