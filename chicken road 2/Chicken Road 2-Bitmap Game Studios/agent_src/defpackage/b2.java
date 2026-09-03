package defpackage;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.changelist.ChangeList;
import androidx.compose.runtime.composer.gapbuffer.changelist.ComposerChangeListWriter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class b2 implements Function0 {
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ b2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
        this.i7xAcZoXXiIt = obj3;
        this.Uo5pffGf8LUU = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj = this.Uo5pffGf8LUU;
        Object obj2 = this.i7xAcZoXXiIt;
        Object obj3 = this.gmXBnHsR2YSm;
        Object obj4 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) obj4;
                ChangeList changeList = (ChangeList) obj3;
                SlotReader slotReader = (SlotReader) obj2;
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) obj;
                ComposerChangeListWriter composerChangeListWriter = gapComposer.K6HLhdE38aTVLa;
                ChangeList changeList2 = composerChangeListWriter.hRNgd2zGCE5kj;
                try {
                    composerChangeListWriter.hRNgd2zGCE5kj = changeList;
                    SlotReader slotReader2 = gapComposer.dKtTSxQHF2Mg8U;
                    int[] iArr = gapComposer.NIabVTHf6LMJyXq;
                    MutableIntObjectMap mutableIntObjectMap = gapComposer.pu0JZhzR2Or6;
                    gapComposer.NIabVTHf6LMJyXq = null;
                    gapComposer.pu0JZhzR2Or6 = null;
                    try {
                        gapComposer.dKtTSxQHF2Mg8U = slotReader;
                        boolean z = composerChangeListWriter.b41X89IqSbKt;
                        try {
                            composerChangeListWriter.b41X89IqSbKt = false;
                            gapComposer.jhOZP2kU3fsYi(movableContentStateReference.yzPsTade5rL7D3, movableContentStateReference.i7xAcZoXXiIt, movableContentStateReference.hRNgd2zGCE5kj);
                            composerChangeListWriter.hRNgd2zGCE5kj = changeList2;
                            return unit;
                        } finally {
                            composerChangeListWriter.b41X89IqSbKt = z;
                        }
                    } finally {
                        gapComposer.dKtTSxQHF2Mg8U = slotReader2;
                        gapComposer.NIabVTHf6LMJyXq = iArr;
                        gapComposer.pu0JZhzR2Or6 = mutableIntObjectMap;
                    }
                } catch (Throwable th) {
                    composerChangeListWriter.hRNgd2zGCE5kj = changeList2;
                    throw th;
                }
            case 1:
                Float f = (Float) obj4;
                InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) obj3;
                Float f2 = (Float) obj2;
                InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
                if (!f.equals(transitionAnimationState.oyjLVtGms9eZwJ0) || !f2.equals(transitionAnimationState.b41X89IqSbKt)) {
                    transitionAnimationState.oyjLVtGms9eZwJ0 = f;
                    transitionAnimationState.b41X89IqSbKt = f2;
                    transitionAnimationState.FsuUJlzzWhYnMlD = new TargetBasedAnimation(infiniteRepeatableSpec, VectorConvertersKt.yzPsTade5rL7D3, f, f2, null);
                    ((SnapshotMutableStateImpl) InfiniteTransition.this.hRNgd2zGCE5kj).setValue(Boolean.TRUE);
                    transitionAnimationState.UEutaskTsxaI = false;
                    transitionAnimationState.MRfxZSx8l5UG62U = true;
                }
                return unit;
            default:
                SheetState sheetState = (SheetState) obj4;
                int i2 = ModalBottomSheetKt.hRNgd2zGCE5kj;
                sheetState.b41X89IqSbKt = (FiniteAnimationSpec) obj3;
                sheetState.gmXBnHsR2YSm = (FiniteAnimationSpec) obj2;
                sheetState.ra306ClFT3HT = (FiniteAnimationSpec) obj;
                return unit;
        }
    }
}
