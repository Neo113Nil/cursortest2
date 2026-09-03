package defpackage;

import android.graphics.Typeface;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.foundation.GestureConnection;
import androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableNode;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1;
import androidx.compose.material3.IndicatorLineNode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.DefaultFontFamily;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.PlatformTypefaces;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Constraints;
import androidx.sqlite.SQLiteConnection;
import com.door.brass.knob.data.db.dao.ChallengeDao_Impl;
import com.door.brass.knob.data.db.dao.ChallengeProgressDao_Impl;
import com.door.brass.knob.data.db.dao.DessertConfigDao_Impl;
import com.door.brass.knob.data.db.dao.MenuItemDao_Impl;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.data.db.entity.ChallengeProgressEventEntity;
import com.door.brass.knob.data.db.entity.DessertConfigEntity;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.ui.challenge.ChallengeUiState;
import com.door.brass.knob.ui.challenge.ChallengeViewModel;
import com.door.brass.knob.ui.menu.MenuUiState;
import defpackage.e;
import defpackage.l3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class ra306ClFT3HT implements Function1 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ ra306ClFT3HT(boolean z, String str, String str2, String str3, r1 r1Var, SoftwareKeyboardController softwareKeyboardController) {
        this.oyjLVtGms9eZwJ0 = 17;
        this.b41X89IqSbKt = r1Var;
        this.gmXBnHsR2YSm = softwareKeyboardController;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018e  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uypNJrpDByoB(Object obj) {
        Typeface hRNgd2zGCE5kj;
        TypefaceResult.Immutable immutable;
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = 4;
        r7 = false;
        boolean z = false;
        int i3 = 1;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.gmXBnHsR2YSm;
        Object obj3 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                ((MutableInteractionSource) obj3).hRNgd2zGCE5kj((PressInteraction.Cancel) obj2);
                return unit;
            case 1:
                AwaitFirstLayoutModifier.Node node = (AwaitFirstLayoutModifier.Node) obj3;
                AwaitFirstLayoutModifier awaitFirstLayoutModifier = (AwaitFirstLayoutModifier) obj2;
                ThrottledCallbacks.Entry entry = node.MCcLy95b8Awzmw;
                if (entry != null) {
                    entry.hRNgd2zGCE5kj();
                }
                node.MCcLy95b8Awzmw = null;
                CompletableDeferred completableDeferred = awaitFirstLayoutModifier.b41X89IqSbKt;
                if (completableDeferred != null) {
                    completableDeferred.GDGFDp2lxiHY(unit);
                }
                awaitFirstLayoutModifier.b41X89IqSbKt = null;
                return unit;
            case 2:
                Function1 function1 = (Function1) obj2;
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                TextFieldDecorator textFieldDecorator = BasicTextFieldKt.yzPsTade5rL7D3;
                if (!Intrinsics.yzPsTade5rL7D3((TextFieldValue) obj3, textFieldValue)) {
                    function1.uypNJrpDByoB(textFieldValue);
                }
                return unit;
            case 3:
                Brush brush = (Brush) obj2;
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                contentDrawScope.N();
                DrawScope.x(contentDrawScope, (Path) obj3, brush, 0.0f, null, null, 0, 60);
                return unit;
            case 4:
                ContentDrawScope contentDrawScope2 = (ContentDrawScope) obj;
                contentDrawScope2.N();
                DrawScope.x(contentDrawScope2, ((Outline.Generic) obj3).yzPsTade5rL7D3, (Brush) obj2, 0.0f, null, null, 0, 60);
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ((BringIntoViewRequestPriorityQueue) obj3).yzPsTade5rL7D3.UEutaskTsxaI((ContentInViewNode.Request) obj2);
                return unit;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ArrayList arrayList = (ArrayList) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int i4 = ((Ref.IntRef) obj3).oyjLVtGms9eZwJ0;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Placeable placeable = (Placeable) arrayList.get(i5);
                    Placeable.PlacementScope.NIabVTHf6LMJyXq(placementScope, placeable, i4, 0);
                    i4 += placeable.oyjLVtGms9eZwJ0;
                }
                return unit;
            case 7:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                ((ChallengeDao_Impl) obj3).hRNgd2zGCE5kj.ra306ClFT3HT(sQLiteConnection, (List) obj2);
                return unit;
            case 8:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                ((ChallengeDao_Impl) obj3).ra306ClFT3HT.ra306ClFT3HT(sQLiteConnection2, (ChallengeEntity) obj2);
                return unit;
            case 9:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                ((ChallengeProgressDao_Impl) obj3).hRNgd2zGCE5kj.oyjLVtGms9eZwJ0(sQLiteConnection3, (ChallengeProgressEventEntity) obj2);
                return unit;
            case 10:
                final ChallengeViewModel challengeViewModel = (ChallengeViewModel) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                final List list = ((ChallengeUiState) ((MutableState) obj3).getOyjLVtGms9eZwJ0()).hRNgd2zGCE5kj;
                final e eVar = new e(i3);
                lazyListScope.yzPsTade5rL7D3(list.size(), new Function1<Integer, Object>() { // from class: com.door.brass.knob.ui.challenge.ChallengeScreenKt$ChallengeScreen$lambda$2$0$0$3$0$$inlined$items$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object uypNJrpDByoB(Object obj4) {
                        return e.this.uypNJrpDByoB(list.get(((Number) obj4).intValue()));
                    }
                }, new Function1<Integer, Object>() { // from class: com.door.brass.knob.ui.challenge.ChallengeScreenKt$ChallengeScreen$lambda$2$0$0$3$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object uypNJrpDByoB(Object obj4) {
                        list.get(((Number) obj4).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(802480018, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.door.brass.knob.ui.challenge.ChallengeScreenKt$ChallengeScreen$lambda$2$0$0$3$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object o2t7oodqU1bUMaS(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                        int intValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int intValue2 = ((Number) obj7).intValue();
                        if ((intValue2 & 6) == 0) {
                            i6 = (composer.zgejW39NNp2D(lazyItemScope) ? 4 : 2) | intValue2;
                        } else {
                            i6 = intValue2;
                        }
                        if ((intValue2 & 48) == 0) {
                            i6 |= composer.kSPEzfraxudm4i(intValue) ? 32 : 16;
                        }
                        if (composer.ZvpnNpCMEWSR3(i6 & 1, (i6 & 147) != 146)) {
                            final ChallengeEntity challengeEntity = (ChallengeEntity) list.get(intValue);
                            composer.mFNFvFv0Eiyk(-1604366982);
                            final ChallengeViewModel challengeViewModel2 = challengeViewModel;
                            boolean NIabVTHf6LMJyXq = composer.NIabVTHf6LMJyXq(challengeViewModel2) | composer.zgejW39NNp2D(challengeEntity);
                            Object UEutaskTsxaI = composer.UEutaskTsxaI();
                            if (NIabVTHf6LMJyXq || UEutaskTsxaI == Composer.Companion.yzPsTade5rL7D3) {
                                UEutaskTsxaI = new Function0<Unit>() { // from class: com.door.brass.knob.ui.challenge.ChallengeScreenKt$ChallengeScreen$1$1$1$4$1$2$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object hRNgd2zGCE5kj() {
                                        Object value;
                                        long j = challengeEntity.yzPsTade5rL7D3;
                                        MutableStateFlow mutableStateFlow = challengeViewModel2.ra306ClFT3HT;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.i7xAcZoXXiIt(value, ChallengeUiState.yzPsTade5rL7D3((ChallengeUiState) value, null, null, null, null, Long.valueOf(j), false, 239)));
                                        return Unit.yzPsTade5rL7D3;
                                    }
                                };
                                composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                            }
                            ChallengeScreenKt.yzPsTade5rL7D3(challengeEntity, (Function0) UEutaskTsxaI, composer, 0);
                            composer.o4ticBN7g1K8jE();
                        } else {
                            composer.gmXBnHsR2YSm();
                        }
                        return Unit.yzPsTade5rL7D3;
                    }
                }, true));
                return unit;
            case 11:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj2;
                boolean z2 = booleanRef.oyjLVtGms9eZwJ0 || ((GestureConnection) obj).Hfp3fJWlgkDz0((IndirectPointerInputChange) obj3);
                booleanRef.oyjLVtGms9eZwJ0 = z2;
                return Boolean.valueOf(!z2);
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) obj2;
                boolean z3 = booleanRef2.oyjLVtGms9eZwJ0 || ((GestureConnection) obj).Q((PointerInputChange) obj3);
                booleanRef2.oyjLVtGms9eZwJ0 = z3;
                return Boolean.valueOf(!z3);
            case 13:
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj3;
                Brush brush2 = (Brush) obj2;
                ContentDrawScope contentDrawScope3 = (ContentDrawScope) obj;
                contentDrawScope3.N();
                if (((Boolean) ((SnapshotMutableStateImpl) legacyTextFieldState.FTJ2XS7ULgY8).getOyjLVtGms9eZwJ0()).booleanValue() || ((Boolean) ((SnapshotMutableStateImpl) legacyTextFieldState.exVmIuryuB8HeQ).getOyjLVtGms9eZwJ0()).booleanValue()) {
                    DrawScope.LKH4PK2NjbMM(contentDrawScope3, brush2, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return unit;
            case 14:
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = (CoreTextFieldSemanticsModifierNode) obj3;
                AnnotatedString annotatedString = (AnnotatedString) obj;
                if (!coreTextFieldSemanticsModifierNode.OcGJUxcOVecQiKb && coreTextFieldSemanticsModifierNode.XrorSzThrtvJ4A) {
                    TextInputSession textInputSession = coreTextFieldSemanticsModifierNode.pu0JZhzR2Or6.b41X89IqSbKt;
                    if (textInputSession != null) {
                        List Yey4RyhSyBRHub = CollectionsKt.Yey4RyhSyBRHub(new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1));
                        LegacyTextFieldState legacyTextFieldState2 = coreTextFieldSemanticsModifierNode.pu0JZhzR2Or6;
                        EditProcessor editProcessor = legacyTextFieldState2.oyjLVtGms9eZwJ0;
                        p0 p0Var = legacyTextFieldState2.pu0JZhzR2Or6;
                        TextFieldValue yzPsTade5rL7D3 = editProcessor.yzPsTade5rL7D3(Yey4RyhSyBRHub);
                        if (Intrinsics.yzPsTade5rL7D3((TextInputSession) textInputSession.yzPsTade5rL7D3.hRNgd2zGCE5kj.get(), textInputSession)) {
                            textInputSession.hRNgd2zGCE5kj.oyjLVtGms9eZwJ0(null, yzPsTade5rL7D3);
                        }
                        p0Var.uypNJrpDByoB(yzPsTade5rL7D3);
                    } else {
                        TextFieldValue textFieldValue2 = coreTextFieldSemanticsModifierNode.AGl7HBCQ8xrHABq;
                        String str = textFieldValue2.yzPsTade5rL7D3.b41X89IqSbKt;
                        long j = textFieldValue2.hRNgd2zGCE5kj;
                        int i6 = TextRange.ra306ClFT3HT;
                        String obj4 = StringsKt.ZvpnNpCMEWSR3(str, (int) (j >> 32), (int) (4294967295L & j), annotatedString).toString();
                        int length = annotatedString.b41X89IqSbKt.length() + ((int) (coreTextFieldSemanticsModifierNode.AGl7HBCQ8xrHABq.hRNgd2zGCE5kj >> 32));
                        coreTextFieldSemanticsModifierNode.pu0JZhzR2Or6.pu0JZhzR2Or6.uypNJrpDByoB(new TextFieldValue(4, TextRangeKt.yzPsTade5rL7D3(length, length), obj4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                ((DessertConfigDao_Impl) obj3).hRNgd2zGCE5kj.oyjLVtGms9eZwJ0(sQLiteConnection4, (DessertConfigEntity) obj2);
                return unit;
            case 16:
                DragScope dragScope = (DragScope) obj3;
                DraggableNode draggableNode = (DraggableNode) obj2;
                long i7xAcZoXXiIt = Offset.i7xAcZoXXiIt(draggableNode.AwgywP6bDNsW ? -1.0f : 1.0f, ((DragEvent.DragDelta) obj).yzPsTade5rL7D3);
                Orientation orientation = draggableNode.Gx4wlvRzB4Xo5;
                Function3 function3 = DraggableKt.yzPsTade5rL7D3;
                dragScope.yzPsTade5rL7D3(Float.intBitsToFloat((int) (orientation == Orientation.oyjLVtGms9eZwJ0 ? i7xAcZoXXiIt & 4294967295L : i7xAcZoXXiIt >> 32)));
                return unit;
            case 17:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.MRfxZSx8l5UG62U(semanticsPropertyReceiver, 6);
                SemanticsPropertiesKt.ra306ClFT3HT(semanticsPropertyReceiver, new VoAHKqpbZzH9eE(10, (r1) obj3, (SoftwareKeyboardController) obj2));
                return unit;
            case 18:
                final ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1((View) obj3, (Function0) obj2);
                return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$lambda$5$lambda$4$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12 = ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1.this;
                        View view = exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12.b41X89IqSbKt;
                        if (exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12.oyjLVtGms9eZwJ0) {
                            view.getViewTreeObserver().removeOnGlobalLayoutListener(exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12);
                            exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12.oyjLVtGms9eZwJ0 = false;
                        }
                        view.removeOnAttachStateChangeListener(exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12);
                    }
                };
            case 19:
                ((MutableInteractionSource) obj3).hRNgd2zGCE5kj((FocusInteraction) obj2);
                return unit;
            case 20:
                FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) obj3;
                TypefaceRequest typefaceRequest = (TypefaceRequest) obj2;
                fontFamilyResolverImpl.oyjLVtGms9eZwJ0.getClass();
                if (typefaceRequest.yzPsTade5rL7D3 instanceof FontListFontFamily) {
                    throw null;
                }
                PlatformTypefaces platformTypefaces = fontFamilyResolverImpl.b41X89IqSbKt.yzPsTade5rL7D3;
                FontFamily fontFamily = typefaceRequest.yzPsTade5rL7D3;
                int i7 = typefaceRequest.ra306ClFT3HT;
                FontWeight fontWeight = typefaceRequest.hRNgd2zGCE5kj;
                if (fontFamily == null || (fontFamily instanceof DefaultFontFamily)) {
                    hRNgd2zGCE5kj = platformTypefaces.hRNgd2zGCE5kj(fontWeight, i7);
                } else if (fontFamily instanceof GenericFontFamily) {
                    hRNgd2zGCE5kj = platformTypefaces.yzPsTade5rL7D3((GenericFontFamily) fontFamily, fontWeight, i7);
                } else {
                    if (!(fontFamily instanceof LoadedFontFamily)) {
                        immutable = null;
                        if (immutable == null) {
                            return immutable;
                        }
                        yzPsTade5rL7D3.kSPEzfraxudm4i("Could not load font");
                        return null;
                    }
                    hRNgd2zGCE5kj = ((LoadedFontFamily) fontFamily).FsuUJlzzWhYnMlD.yzPsTade5rL7D3;
                }
                immutable = new TypefaceResult.Immutable(hRNgd2zGCE5kj, true);
                if (immutable == null) {
                }
                break;
            case 21:
                ((HandlerContext) obj3).gmXBnHsR2YSm.removeCallbacks((x) obj2);
                return unit;
            case 22:
                Ref.IntRef intRef = (Ref.IntRef) obj3;
                Ref.IntRef intRef2 = (Ref.IntRef) obj2;
                MatchResult matchResult = (MatchResult) obj;
                if (intRef.oyjLVtGms9eZwJ0 == -1) {
                    intRef.oyjLVtGms9eZwJ0 = matchResult.ra306ClFT3HT().oyjLVtGms9eZwJ0;
                }
                intRef2.oyjLVtGms9eZwJ0 = matchResult.ra306ClFT3HT().b41X89IqSbKt + 1;
                return "";
            case 23:
                AndroidPath androidPath = (AndroidPath) obj3;
                ContentDrawScope contentDrawScope4 = (ContentDrawScope) obj;
                contentDrawScope4.N();
                Animatable animatable = ((IndicatorLineNode) obj2).jJwKDtysO3vm5E;
                animatable.getClass();
                DrawScope.x(contentDrawScope4, androidPath, new SolidColor(((Color) animatable.oyjLVtGms9eZwJ0()).yzPsTade5rL7D3), 0.0f, null, null, 0, 60);
                return unit;
            case 24:
                final InfiniteTransition infiniteTransition = (InfiniteTransition) obj3;
                final InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) obj2;
                infiniteTransition.yzPsTade5rL7D3.hRNgd2zGCE5kj(transitionAnimationState);
                ((SnapshotMutableStateImpl) infiniteTransition.hRNgd2zGCE5kj).setValue(Boolean.TRUE);
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$lambda$2$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        InfiniteTransition.this.yzPsTade5rL7D3.UEutaskTsxaI(transitionAnimationState);
                    }
                };
            case 25:
                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = (LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1) obj2;
                LazyGridSpanLayoutProvider.LineConfiguration hRNgd2zGCE5kj2 = ((LazyGridSpanLayoutProvider) obj3).hRNgd2zGCE5kj(((Integer) obj).intValue());
                int i8 = hRNgd2zGCE5kj2.yzPsTade5rL7D3;
                List list2 = hRNgd2zGCE5kj2.hRNgd2zGCE5kj;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                int i9 = 0;
                for (int i10 = 0; i10 < size2; i10++) {
                    int i11 = (int) ((GridItemSpan) list2.get(i10)).yzPsTade5rL7D3;
                    arrayList2.add(new Pair(Integer.valueOf(i8), new Constraints(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.yzPsTade5rL7D3(i9, i11))));
                    i8++;
                    i9 += i11;
                }
                return arrayList2;
            case 26:
                ((Integer) obj).intValue();
                LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = ((LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1) obj3).b41X89IqSbKt;
                throw null;
            case 27:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                ClassSerialDescriptorBuilder.yzPsTade5rL7D3(classSerialDescriptorBuilder, "key", ((KSerializer) obj3).getHRNgd2zGCE5kj());
                ClassSerialDescriptorBuilder.yzPsTade5rL7D3(classSerialDescriptorBuilder, "value", ((KSerializer) obj2).getHRNgd2zGCE5kj());
                return unit;
            case 28:
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                ((MenuItemDao_Impl) obj3).hRNgd2zGCE5kj.ra306ClFT3HT(sQLiteConnection5, (List) obj2);
                return unit;
            default:
                final Function1 function12 = (Function1) obj2;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                final List list3 = ((MenuUiState) ((State) obj3).getOyjLVtGms9eZwJ0()).hRNgd2zGCE5kj;
                final l3 l3Var = new l3(i2);
                lazyListScope2.yzPsTade5rL7D3(list3.size(), new Function1<Integer, Object>() { // from class: com.door.brass.knob.ui.menu.MenuScreenKt$MenuScreen$lambda$4$0$3$0$$inlined$items$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object uypNJrpDByoB(Object obj5) {
                        return l3.this.uypNJrpDByoB(list3.get(((Number) obj5).intValue()));
                    }
                }, new Function1<Integer, Object>() { // from class: com.door.brass.knob.ui.menu.MenuScreenKt$MenuScreen$lambda$4$0$3$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object uypNJrpDByoB(Object obj5) {
                        list3.get(((Number) obj5).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(802480018, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.door.brass.knob.ui.menu.MenuScreenKt$MenuScreen$lambda$4$0$3$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object o2t7oodqU1bUMaS(Object obj5, Object obj6, Object obj7, Object obj8) {
                        int i12;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj5;
                        int intValue = ((Number) obj6).intValue();
                        Composer composer = (Composer) obj7;
                        int intValue2 = ((Number) obj8).intValue();
                        if ((intValue2 & 6) == 0) {
                            i12 = (composer.zgejW39NNp2D(lazyItemScope) ? 4 : 2) | intValue2;
                        } else {
                            i12 = intValue2;
                        }
                        if ((intValue2 & 48) == 0) {
                            i12 |= composer.kSPEzfraxudm4i(intValue) ? 32 : 16;
                        }
                        if (composer.ZvpnNpCMEWSR3(i12 & 1, (i12 & 147) != 146)) {
                            final MenuItemEntity menuItemEntity = (MenuItemEntity) list3.get(intValue);
                            composer.mFNFvFv0Eiyk(1405126521);
                            final Function1 function13 = function12;
                            boolean zgejW39NNp2D = composer.zgejW39NNp2D(function13) | composer.zgejW39NNp2D(menuItemEntity);
                            Object UEutaskTsxaI = composer.UEutaskTsxaI();
                            if (zgejW39NNp2D || UEutaskTsxaI == Composer.Companion.yzPsTade5rL7D3) {
                                UEutaskTsxaI = new Function0<Unit>() { // from class: com.door.brass.knob.ui.menu.MenuScreenKt$MenuScreen$1$1$4$1$2$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object hRNgd2zGCE5kj() {
                                        Function1.this.uypNJrpDByoB(Long.valueOf(menuItemEntity.yzPsTade5rL7D3));
                                        return Unit.yzPsTade5rL7D3;
                                    }
                                };
                                composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                            }
                            MenuScreenKt.yzPsTade5rL7D3(menuItemEntity, (Function0) UEutaskTsxaI, composer, 0);
                            composer.o4ticBN7g1K8jE();
                        } else {
                            composer.gmXBnHsR2YSm();
                        }
                        return Unit.yzPsTade5rL7D3;
                    }
                }, true));
                return unit;
        }
    }

    public /* synthetic */ ra306ClFT3HT(int i, Object obj, Object obj2) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
    }
}
