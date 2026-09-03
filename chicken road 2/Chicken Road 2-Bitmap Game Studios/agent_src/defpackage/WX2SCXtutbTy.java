package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material.icons.filled.BookmarkBorderKt;
import androidx.compose.material.icons.filled.BookmarkKt;
import androidx.compose.material3.AssistChipDefaults;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.data.db.entity.TipEntity;
import defpackage.l4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class WX2SCXtutbTy implements Function3 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ WX2SCXtutbTy(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        this.oyjLVtGms9eZwJ0 = 11;
        this.b41X89IqSbKt = mutexImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
        int uMAEPvJoKWq8X;
        Modifier yzPsTade5rL7D3;
        ImageVector imageVector;
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = 11;
        int i3 = 2;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.yzPsTade5rL7D3;
        int i4 = 0;
        r7 = false;
        r7 = false;
        boolean z = false;
        int i5 = 1;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj4 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                NavHostController navHostController = (NavHostController) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= composer.zgejW39NNp2D(paddingValues) ? 4 : 2;
                }
                if (!composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 19) != 18)) {
                    composer.gmXBnHsR2YSm();
                    break;
                } else {
                    Modifier b41X89IqSbKt = PaddingKt.b41X89IqSbKt(Modifier.Companion.oyjLVtGms9eZwJ0, paddingValues);
                    boolean NIabVTHf6LMJyXq = composer.NIabVTHf6LMJyXq(navHostController);
                    Object UEutaskTsxaI = composer.UEutaskTsxaI();
                    if (NIabVTHf6LMJyXq || UEutaskTsxaI == composer$Companion$Empty$1) {
                        UEutaskTsxaI = new wODz8ZxcAenOnyR(navHostController, i3);
                        composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                    }
                    NavHostKt.yzPsTade5rL7D3(navHostController, b41X89IqSbKt, null, null, null, null, null, (Function1) UEutaskTsxaI, composer, 48);
                    break;
                }
            case 1:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CancellableContinuationImpl.FsuUJlzzWhYnMlD;
                ((s5) obj4).uypNJrpDByoB((Throwable) obj);
                break;
            case 2:
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = (CoreTextFieldSemanticsModifierNode) obj4;
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue2 = coreTextFieldSemanticsModifierNode.uY26rxeEAFnDq.yzPsTade5rL7D3(intValue2);
                }
                if (!booleanValue) {
                    intValue3 = coreTextFieldSemanticsModifierNode.uY26rxeEAFnDq.yzPsTade5rL7D3(intValue3);
                }
                if (coreTextFieldSemanticsModifierNode.XrorSzThrtvJ4A) {
                    long j = coreTextFieldSemanticsModifierNode.AGl7HBCQ8xrHABq.hRNgd2zGCE5kj;
                    int i6 = TextRange.ra306ClFT3HT;
                    if (intValue2 != ((int) (j >> 32)) || intValue3 != ((int) (j & 4294967295L))) {
                        if (Math.min(intValue2, intValue3) < 0 || Math.max(intValue2, intValue3) > coreTextFieldSemanticsModifierNode.AGl7HBCQ8xrHABq.yzPsTade5rL7D3.b41X89IqSbKt.length()) {
                            TextFieldSelectionManager textFieldSelectionManager = coreTextFieldSemanticsModifierNode.BD2CRjLJ8EtOqGQ;
                            textFieldSelectionManager.AGl7HBCQ8xrHABq(false);
                            textFieldSelectionManager.MCcLy95b8Awzmw(HandleState.oyjLVtGms9eZwJ0);
                        } else {
                            if (booleanValue || intValue2 == intValue3) {
                                TextFieldSelectionManager textFieldSelectionManager2 = coreTextFieldSemanticsModifierNode.BD2CRjLJ8EtOqGQ;
                                textFieldSelectionManager2.AGl7HBCQ8xrHABq(false);
                                textFieldSelectionManager2.MCcLy95b8Awzmw(HandleState.oyjLVtGms9eZwJ0);
                            } else {
                                coreTextFieldSemanticsModifierNode.BD2CRjLJ8EtOqGQ.Uo5pffGf8LUU(true);
                            }
                            coreTextFieldSemanticsModifierNode.pu0JZhzR2Or6.pu0JZhzR2Or6.uypNJrpDByoB(new TextFieldValue(coreTextFieldSemanticsModifierNode.AGl7HBCQ8xrHABq.yzPsTade5rL7D3, TextRangeKt.yzPsTade5rL7D3(intValue2, intValue3), (TextRange) null));
                            z = true;
                        }
                    }
                }
                break;
            case 3:
                ((DragAndDropStartDetectorScope) obj4).o4ticBN7g1K8jE(((PointerInputChange) obj).ra306ClFT3HT);
                break;
            case 4:
                float f = DragGestureDetectorKt.yzPsTade5rL7D3;
                ((Function1) obj4).uypNJrpDByoB(new Offset(((PointerInputChange) obj2).ra306ClFT3HT));
                break;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                MenuItemEntity menuItemEntity = (MenuItemEntity) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                if (!composer2.ZvpnNpCMEWSR3(intValue4 & 1, (intValue4 & 17) != 16)) {
                    composer2.gmXBnHsR2YSm();
                    break;
                } else {
                    Object UEutaskTsxaI2 = composer2.UEutaskTsxaI();
                    if (UEutaskTsxaI2 == composer$Companion$Empty$1) {
                        UEutaskTsxaI2 = new pu0JZhzR2Or6(i2);
                        composer2.Yey4RyhSyBRHub(UEutaskTsxaI2);
                    }
                    Function0 function0 = (Function0) UEutaskTsxaI2;
                    ComposableLambdaImpl hRNgd2zGCE5kj = ComposableLambdaKt.hRNgd2zGCE5kj(-36598956, new q3(menuItemEntity, r7 ? 1 : 0), composer2);
                    float f2 = AssistChipDefaults.yzPsTade5rL7D3;
                    ChipKt.hRNgd2zGCE5kj(function0, hRNgd2zGCE5kj, null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer2).kSPEzfraxudm4i, MaterialTheme.yzPsTade5rL7D3(composer2).uypNJrpDByoB, composer2), null, null, composer2, 54);
                    Object UEutaskTsxaI3 = composer2.UEutaskTsxaI();
                    if (UEutaskTsxaI3 == composer$Companion$Empty$1) {
                        UEutaskTsxaI3 = new pu0JZhzR2Or6(i2);
                        composer2.Yey4RyhSyBRHub(UEutaskTsxaI3);
                    }
                    ChipKt.hRNgd2zGCE5kj((Function0) UEutaskTsxaI3, ComposableLambdaKt.hRNgd2zGCE5kj(-239588867, new q3(menuItemEntity, i5), composer2), null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer2).Uo5pffGf8LUU, MaterialTheme.yzPsTade5rL7D3(composer2).FsuUJlzzWhYnMlD, composer2), null, null, composer2, 54);
                    Object UEutaskTsxaI4 = composer2.UEutaskTsxaI();
                    if (UEutaskTsxaI4 == composer$Companion$Empty$1) {
                        UEutaskTsxaI4 = new pu0JZhzR2Or6(i2);
                        composer2.Yey4RyhSyBRHub(UEutaskTsxaI4);
                    }
                    ChipKt.hRNgd2zGCE5kj((Function0) UEutaskTsxaI4, ComposableLambdaKt.hRNgd2zGCE5kj(-89447524, new q3(menuItemEntity, i3), composer2), null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer2).ra306ClFT3HT, MaterialTheme.yzPsTade5rL7D3(composer2).oyjLVtGms9eZwJ0, composer2), null, null, composer2, 54);
                    break;
                }
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ArrayList arrayList = (ArrayList) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                if (!composer3.ZvpnNpCMEWSR3(intValue5 & 1, (intValue5 & 17) != 16)) {
                    composer3.gmXBnHsR2YSm();
                    break;
                } else {
                    int size = arrayList.size();
                    while (i4 < size) {
                        Object obj5 = arrayList.get(i4);
                        i4++;
                        String str = (String) obj5;
                        Object UEutaskTsxaI5 = composer3.UEutaskTsxaI();
                        if (UEutaskTsxaI5 == composer$Companion$Empty$1) {
                            UEutaskTsxaI5 = new pu0JZhzR2Or6(i2);
                            composer3.Yey4RyhSyBRHub(UEutaskTsxaI5);
                        }
                        ComposableLambdaImpl hRNgd2zGCE5kj2 = ComposableLambdaKt.hRNgd2zGCE5kj(-1762793233, new f(str, i5), composer3);
                        float f3 = AssistChipDefaults.yzPsTade5rL7D3;
                        ChipKt.hRNgd2zGCE5kj((Function0) UEutaskTsxaI5, hRNgd2zGCE5kj2, null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer3).MCcLy95b8Awzmw, MaterialTheme.yzPsTade5rL7D3(composer3).FTJ2XS7ULgY8, composer3), null, null, composer3, 54);
                    }
                    break;
                }
            case 7:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SemaphoreAndMutexImpl.gmXBnHsR2YSm;
                ((SemaphoreAndMutexImpl) obj4).oyjLVtGms9eZwJ0();
                break;
            case 8:
                SliderState sliderState = (SliderState) obj4;
                MeasureScope measureScope = (MeasureScope) obj;
                SliderDefaults sliderDefaults = SliderDefaults.yzPsTade5rL7D3;
                Placeable kSPEzfraxudm4i = ((Measurable) obj2).kSPEzfraxudm4i(((Constraints) obj3).yzPsTade5rL7D3);
                if (Dp.hRNgd2zGCE5kj(Float.NaN, Float.NaN)) {
                    sliderState.getClass();
                    Orientation orientation = Orientation.oyjLVtGms9eZwJ0;
                    uMAEPvJoKWq8X = kSPEzfraxudm4i.b41X89IqSbKt / 2;
                } else {
                    uMAEPvJoKWq8X = measureScope.uMAEPvJoKWq8X(Float.NaN);
                }
                int i7 = kSPEzfraxudm4i.oyjLVtGms9eZwJ0;
                int i8 = kSPEzfraxudm4i.b41X89IqSbKt;
                Map singletonMap = Collections.singletonMap(SliderKt.gmXBnHsR2YSm, Integer.valueOf(uMAEPvJoKWq8X));
                singletonMap.getClass();
                break;
            case 9:
                TextFieldSelectionManager textFieldSelectionManager3 = (TextFieldSelectionManager) obj4;
                Modifier modifier = (Modifier) obj;
                Composer composer4 = (Composer) obj2;
                ((Integer) obj3).getClass();
                composer4.mFNFvFv0Eiyk(1980580247);
                Density density = (Density) composer4.Uo5pffGf8LUU(CompositionLocalsKt.Uo5pffGf8LUU);
                Object UEutaskTsxaI6 = composer4.UEutaskTsxaI();
                Object obj6 = UEutaskTsxaI6;
                if (UEutaskTsxaI6 == composer$Companion$Empty$1) {
                    MutableState i7xAcZoXXiIt = SnapshotStateKt.i7xAcZoXXiIt(new IntSize(0L));
                    composer4.Yey4RyhSyBRHub(i7xAcZoXXiIt);
                    obj6 = i7xAcZoXXiIt;
                }
                MutableState mutableState = (MutableState) obj6;
                boolean NIabVTHf6LMJyXq2 = composer4.NIabVTHf6LMJyXq(textFieldSelectionManager3);
                Object UEutaskTsxaI7 = composer4.UEutaskTsxaI();
                Object obj7 = UEutaskTsxaI7;
                if (NIabVTHf6LMJyXq2 || UEutaskTsxaI7 == composer$Companion$Empty$1) {
                    VoAHKqpbZzH9eE voAHKqpbZzH9eE = new VoAHKqpbZzH9eE(26, textFieldSelectionManager3, mutableState);
                    composer4.Yey4RyhSyBRHub(voAHKqpbZzH9eE);
                    obj7 = voAHKqpbZzH9eE;
                }
                final Function0 function02 = (Function0) obj7;
                boolean zgejW39NNp2D = composer4.zgejW39NNp2D(density);
                Object UEutaskTsxaI8 = composer4.UEutaskTsxaI();
                Object obj8 = UEutaskTsxaI8;
                if (zgejW39NNp2D || UEutaskTsxaI8 == composer$Companion$Empty$1) {
                    b8 b8Var = new b8(density, mutableState, r7 ? 1 : 0);
                    composer4.Yey4RyhSyBRHub(b8Var);
                    obj8 = b8Var;
                }
                final Function1 function1 = (Function1) obj8;
                AnimationVector2D animationVector2D = SelectionMagnifierKt.yzPsTade5rL7D3;
                yzPsTade5rL7D3 = ComposedModifierKt.yzPsTade5rL7D3(modifier, InspectableValueKt.yzPsTade5rL7D3(), new Function3() { // from class: androidx.compose.foundation.text.selection.ra306ClFT3HT
                    @Override // kotlin.jvm.functions.Function3
                    public final Object MRfxZSx8l5UG62U(Object obj9, Object obj10, Object obj11) {
                        Composer composer5 = (Composer) obj10;
                        ((Integer) obj11).getClass();
                        AnimationVector2D animationVector2D2 = SelectionMagnifierKt.yzPsTade5rL7D3;
                        composer5.mFNFvFv0Eiyk(759876635);
                        Object UEutaskTsxaI9 = composer5.UEutaskTsxaI();
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.yzPsTade5rL7D3;
                        if (UEutaskTsxaI9 == composer$Companion$Empty$12) {
                            UEutaskTsxaI9 = SnapshotStateKt.b41X89IqSbKt(Function0.this);
                            composer5.Yey4RyhSyBRHub(UEutaskTsxaI9);
                        }
                        State state = (State) UEutaskTsxaI9;
                        Object UEutaskTsxaI10 = composer5.UEutaskTsxaI();
                        if (UEutaskTsxaI10 == composer$Companion$Empty$12) {
                            UEutaskTsxaI10 = new Animatable(new Offset(((Offset) state.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3), SelectionMagnifierKt.hRNgd2zGCE5kj, new Offset(SelectionMagnifierKt.ra306ClFT3HT), 8);
                            composer5.Yey4RyhSyBRHub(UEutaskTsxaI10);
                        }
                        Animatable animatable = (Animatable) UEutaskTsxaI10;
                        boolean NIabVTHf6LMJyXq3 = composer5.NIabVTHf6LMJyXq(animatable);
                        Object UEutaskTsxaI11 = composer5.UEutaskTsxaI();
                        if (NIabVTHf6LMJyXq3 || UEutaskTsxaI11 == composer$Companion$Empty$12) {
                            UEutaskTsxaI11 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(state, animatable, null);
                            composer5.Yey4RyhSyBRHub(UEutaskTsxaI11);
                        }
                        EffectsKt.oyjLVtGms9eZwJ0(composer5, Unit.yzPsTade5rL7D3, (Function2) UEutaskTsxaI11);
                        AnimationState animationState = animatable.ra306ClFT3HT;
                        boolean zgejW39NNp2D2 = composer5.zgejW39NNp2D(animationState);
                        Object UEutaskTsxaI12 = composer5.UEutaskTsxaI();
                        if (zgejW39NNp2D2 || UEutaskTsxaI12 == composer$Companion$Empty$12) {
                            UEutaskTsxaI12 = new l4(animationState, 3);
                            composer5.Yey4RyhSyBRHub(UEutaskTsxaI12);
                        }
                        Modifier modifier2 = (Modifier) function1.uypNJrpDByoB((Function0) UEutaskTsxaI12);
                        composer5.o4ticBN7g1K8jE();
                        return modifier2;
                    }
                });
                composer4.o4ticBN7g1K8jE();
                break;
            case 10:
                boolean z2 = ((TipEntity) obj4).b41X89IqSbKt;
                Composer composer5 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer5.ZvpnNpCMEWSR3(intValue6 & 1, (intValue6 & 17) != 16)) {
                    composer5.gmXBnHsR2YSm();
                    break;
                } else {
                    if (z2) {
                        imageVector = BookmarkKt.yzPsTade5rL7D3();
                    } else {
                        imageVector = BookmarkBorderKt.yzPsTade5rL7D3;
                        if (imageVector == null) {
                            ImageVector.Builder builder = new ImageVector.Builder("Filled.BookmarkBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i9 = VectorKt.yzPsTade5rL7D3;
                            SolidColor solidColor = new SolidColor(Color.hRNgd2zGCE5kj);
                            PathBuilder pathBuilder = new PathBuilder();
                            pathBuilder.Uo5pffGf8LUU(17.0f, 3.0f);
                            pathBuilder.gmXBnHsR2YSm(7.0f, 3.0f);
                            pathBuilder.ra306ClFT3HT(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                            pathBuilder.gmXBnHsR2YSm(5.0f, 21.0f);
                            pathBuilder.i7xAcZoXXiIt(7.0f, -3.0f);
                            pathBuilder.i7xAcZoXXiIt(7.0f, 3.0f);
                            pathBuilder.gmXBnHsR2YSm(19.0f, 5.0f);
                            pathBuilder.ra306ClFT3HT(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            pathBuilder.yzPsTade5rL7D3();
                            pathBuilder.Uo5pffGf8LUU(17.0f, 18.0f);
                            pathBuilder.i7xAcZoXXiIt(-5.0f, -2.18f);
                            pathBuilder.gmXBnHsR2YSm(7.0f, 18.0f);
                            pathBuilder.gmXBnHsR2YSm(7.0f, 5.0f);
                            pathBuilder.b41X89IqSbKt(10.0f);
                            pathBuilder.MRfxZSx8l5UG62U(13.0f);
                            pathBuilder.yzPsTade5rL7D3();
                            builder.hRNgd2zGCE5kj(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", pathBuilder.yzPsTade5rL7D3);
                            imageVector = builder.oyjLVtGms9eZwJ0();
                            BookmarkBorderKt.yzPsTade5rL7D3 = imageVector;
                        }
                    }
                    IconKt.hRNgd2zGCE5kj(imageVector, null, null, 0L, composer5, 48, 12);
                    TextKt.hRNgd2zGCE5kj(z2 ? "Bookmarked" : "Bookmark", PaddingKt.UEutaskTsxaI(Modifier.Companion.oyjLVtGms9eZwJ0, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer5, 48, 0, 262140);
                    break;
                }
            default:
                MutexImpl mutexImpl = (MutexImpl) obj4;
                MutexImpl.uypNJrpDByoB.set(mutexImpl, null);
                mutexImpl.yzPsTade5rL7D3(null);
                break;
        }
        return unit;
    }

    public /* synthetic */ WX2SCXtutbTy(int i, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
    }
}
