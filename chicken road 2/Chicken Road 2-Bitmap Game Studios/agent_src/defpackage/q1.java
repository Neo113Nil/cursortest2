package defpackage;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Function3 {
    public final /* synthetic */ boolean b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    public /* synthetic */ q1(TextFieldScrollerPosition textFieldScrollerPosition, boolean z, MutableInteractionSource mutableInteractionSource) {
        this.gmXBnHsR2YSm = textFieldScrollerPosition;
        this.b41X89IqSbKt = z;
        this.i7xAcZoXXiIt = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
        int i = this.oyjLVtGms9eZwJ0;
        Object obj4 = this.i7xAcZoXXiIt;
        boolean z = this.b41X89IqSbKt;
        Object obj5 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                Constraints constraints = (Constraints) obj3;
                int i7xAcZoXXiIt = ConstraintsKt.i7xAcZoXXiIt(((MutableIntState) obj5).hRNgd2zGCE5kj(), constraints.yzPsTade5rL7D3);
                long j = constraints.yzPsTade5rL7D3;
                int gmXBnHsR2YSm = ConstraintsKt.gmXBnHsR2YSm(((MutableIntState) obj4).hRNgd2zGCE5kj(), j);
                int MRfxZSx8l5UG62U = z ? i7xAcZoXXiIt : Constraints.MRfxZSx8l5UG62U(j);
                if (!z) {
                    i7xAcZoXXiIt = Constraints.FsuUJlzzWhYnMlD(j);
                }
                Placeable kSPEzfraxudm4i = measurable.kSPEzfraxudm4i(Constraints.hRNgd2zGCE5kj(constraints.yzPsTade5rL7D3, MRfxZSx8l5UG62U, i7xAcZoXXiIt, 0, gmXBnHsR2YSm, 4));
                return MeasureScope.OL5dzh3MEyfV(measureScope, kSPEzfraxudm4i.oyjLVtGms9eZwJ0, kSPEzfraxudm4i.b41X89IqSbKt, new tY4RqfA4k7DmtD(kSPEzfraxudm4i, 3));
            default:
                final TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) obj5;
                MutableState mutableState = textFieldScrollerPosition.gmXBnHsR2YSm;
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) obj4;
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                composer.mFNFvFv0Eiyk(-2137546592);
                boolean z2 = ((Orientation) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()) == Orientation.oyjLVtGms9eZwJ0 || !(composer.Uo5pffGf8LUU(CompositionLocalsKt.yRx9jbDCTnXb3) == LayoutDirection.b41X89IqSbKt);
                boolean zgejW39NNp2D = composer.zgejW39NNp2D(textFieldScrollerPosition);
                Object UEutaskTsxaI = composer.UEutaskTsxaI();
                Object obj6 = Composer.Companion.yzPsTade5rL7D3;
                if (zgejW39NNp2D || UEutaskTsxaI == obj6) {
                    UEutaskTsxaI = new s5(14, textFieldScrollerPosition);
                    composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                }
                final ScrollableState hRNgd2zGCE5kj = ScrollableStateKt.hRNgd2zGCE5kj(composer, (Function1) UEutaskTsxaI);
                boolean zgejW39NNp2D2 = composer.zgejW39NNp2D(hRNgd2zGCE5kj) | composer.zgejW39NNp2D(textFieldScrollerPosition);
                Object UEutaskTsxaI2 = composer.UEutaskTsxaI();
                if (zgejW39NNp2D2 || UEutaskTsxaI2 == obj6) {
                    UEutaskTsxaI2 = new ScrollableState(textFieldScrollerPosition) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                        public final State hRNgd2zGCE5kj;
                        public final State ra306ClFT3HT;

                        {
                            final int i2 = 0;
                            this.hRNgd2zGCE5kj = SnapshotStateKt.b41X89IqSbKt(new Function0() { // from class: a8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object hRNgd2zGCE5kj() {
                                    int i3 = i2;
                                    TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                    switch (i3) {
                                        case 0:
                                            return Boolean.valueOf(((SnapshotMutableFloatStateImpl) textFieldScrollerPosition2.yzPsTade5rL7D3).oyjLVtGms9eZwJ0() < ((SnapshotMutableFloatStateImpl) textFieldScrollerPosition2.hRNgd2zGCE5kj).oyjLVtGms9eZwJ0());
                                        default:
                                            return Boolean.valueOf(((SnapshotMutableFloatStateImpl) textFieldScrollerPosition2.yzPsTade5rL7D3).oyjLVtGms9eZwJ0() > 0.0f);
                                    }
                                }
                            });
                            final int i3 = 1;
                            this.ra306ClFT3HT = SnapshotStateKt.b41X89IqSbKt(new Function0() { // from class: a8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object hRNgd2zGCE5kj() {
                                    int i32 = i3;
                                    TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                    switch (i32) {
                                        case 0:
                                            return Boolean.valueOf(((SnapshotMutableFloatStateImpl) textFieldScrollerPosition2.yzPsTade5rL7D3).oyjLVtGms9eZwJ0() < ((SnapshotMutableFloatStateImpl) textFieldScrollerPosition2.hRNgd2zGCE5kj).oyjLVtGms9eZwJ0());
                                        default:
                                            return Boolean.valueOf(((SnapshotMutableFloatStateImpl) textFieldScrollerPosition2.yzPsTade5rL7D3).oyjLVtGms9eZwJ0() > 0.0f);
                                    }
                                }
                            });
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public final float b41X89IqSbKt(float f) {
                            return ScrollableState.this.b41X89IqSbKt(f);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public final boolean hRNgd2zGCE5kj() {
                            return ScrollableState.this.hRNgd2zGCE5kj();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public final boolean oyjLVtGms9eZwJ0() {
                            return ((Boolean) this.hRNgd2zGCE5kj.getOyjLVtGms9eZwJ0()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public final Object ra306ClFT3HT(MutatePriority mutatePriority, Function2 function2, ContinuationImpl continuationImpl) {
                            return ScrollableState.this.ra306ClFT3HT(mutatePriority, function2, continuationImpl);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public final boolean yzPsTade5rL7D3() {
                            return ((Boolean) this.ra306ClFT3HT.getOyjLVtGms9eZwJ0()).booleanValue();
                        }
                    };
                    composer.Yey4RyhSyBRHub(UEutaskTsxaI2);
                }
                Modifier hRNgd2zGCE5kj2 = ScrollableKt.hRNgd2zGCE5kj(Modifier.Companion.oyjLVtGms9eZwJ0, (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) UEutaskTsxaI2, (Orientation) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0(), z && ((SnapshotMutableFloatStateImpl) textFieldScrollerPosition.hRNgd2zGCE5kj).oyjLVtGms9eZwJ0() != 0.0f, z2, mutableInteractionSource);
                composer.o4ticBN7g1K8jE();
                return hRNgd2zGCE5kj2;
        }
    }

    public /* synthetic */ q1(boolean z, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.b41X89IqSbKt = z;
        this.gmXBnHsR2YSm = mutableIntState;
        this.i7xAcZoXXiIt = mutableIntState2;
    }
}
