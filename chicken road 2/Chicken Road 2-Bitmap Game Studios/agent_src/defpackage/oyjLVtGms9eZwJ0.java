package defpackage;

import android.os.Bundle;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope;
import androidx.compose.foundation.gestures.Drag2DScope;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1;
import androidx.compose.foundation.lazy.LazyListMeasuredItemProvider;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.IndicatorLineNode;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.input.BackspaceCommand;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.MoveCursorCommand;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractMap;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class oyjLVtGms9eZwJ0 implements Function1 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ oyjLVtGms9eZwJ0(float f, float f2, Shape shape) {
        this.oyjLVtGms9eZwJ0 = 26;
        this.b41X89IqSbKt = shape;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        String concat;
        StringBuilder sb;
        int i;
        Object failure;
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult;
        int i2 = this.oyjLVtGms9eZwJ0;
        int i3 = 0;
        float f = 0.0f;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.b41X89IqSbKt;
        switch (i2) {
            case 0:
                return obj == ((AbstractCollection) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                AbstractMap abstractMap = (AbstractMap) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == abstractMap ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != abstractMap ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 2:
                float f2 = AndroidCursorHandle_androidKt.yzPsTade5rL7D3;
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(SelectionHandlesKt.yzPsTade5rL7D3, new SelectionHandleInfo(Handle.oyjLVtGms9eZwJ0, ((OffsetProvider) obj2).yzPsTade5rL7D3(), SelectionHandleAnchor.b41X89IqSbKt, true));
                return unit;
            case 3:
                TopAppBarState topAppBarState = (TopAppBarState) obj2;
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AppBarKt.yzPsTade5rL7D3;
                ((SnapshotMutableFloatStateImpl) topAppBarState.ra306ClFT3HT).UEutaskTsxaI(RangesKt.hRNgd2zGCE5kj(((Number) ((SnapshotMutableStateImpl) ((AnimationScope) obj).b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue(), topAppBarState.yzPsTade5rL7D3, 0.0f));
                return unit;
            case 4:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = AppBarKt.yzPsTade5rL7D3;
                ((BottomAppBarState) obj2).yzPsTade5rL7D3(((Number) ((SnapshotMutableStateImpl) ((AnimationScope) obj).b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue());
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                final BasicTextContextMenuProvider basicTextContextMenuProvider = (BasicTextContextMenuProvider) obj2;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt$basicTextContextMenuProvider$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        BasicTextContextMenuProvider.SessionImpl sessionImpl = (BasicTextContextMenuProvider.SessionImpl) ((SnapshotMutableStateImpl) BasicTextContextMenuProvider.this.ra306ClFT3HT).getOyjLVtGms9eZwJ0();
                        if (sessionImpl != null) {
                            sessionImpl.close();
                        }
                    }
                };
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                final TooltipState tooltipState = (TooltipState) obj2;
                return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.BasicTooltipKt$BasicTooltipBox$lambda$4$lambda$3$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        TooltipState.this.yzPsTade5rL7D3();
                    }
                };
            case 7:
                ((DragAndDropStartDetectorScope) obj2).o4ticBN7g1K8jE(((Offset) obj).yzPsTade5rL7D3);
                return unit;
            case 8:
                long j = ((DragEvent.DragDelta) obj).yzPsTade5rL7D3;
                ((Drag2DScope) obj2).yzPsTade5rL7D3();
                throw null;
            case 9:
                EditCommand editCommand = (EditCommand) obj;
                String str = ((EditCommand) obj2) == editCommand ? " > " : "   ";
                if (editCommand instanceof CommitTextCommand) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
                    sb.append(commitTextCommand.yzPsTade5rL7D3.b41X89IqSbKt.length());
                    sb.append(", newCursorPosition=");
                    i = commitTextCommand.hRNgd2zGCE5kj;
                } else {
                    if (!(editCommand instanceof SetComposingTextCommand)) {
                        if (editCommand instanceof SetComposingRegionCommand) {
                            concat = ((SetComposingRegionCommand) editCommand).toString();
                        } else if (editCommand instanceof DeleteSurroundingTextCommand) {
                            concat = ((DeleteSurroundingTextCommand) editCommand).toString();
                        } else if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
                            concat = ((DeleteSurroundingTextInCodePointsCommand) editCommand).toString();
                        } else if (editCommand instanceof SetSelectionCommand) {
                            concat = ((SetSelectionCommand) editCommand).toString();
                        } else if (editCommand instanceof FinishComposingTextCommand) {
                            concat = "FinishComposingTextCommand()";
                        } else if (editCommand instanceof BackspaceCommand) {
                            concat = "BackspaceCommand()";
                        } else if (editCommand instanceof MoveCursorCommand) {
                            concat = "MoveCursorCommand(amount=0)";
                        } else if (editCommand instanceof DeleteAllCommand) {
                            concat = "DeleteAllCommand()";
                        } else {
                            String yRx9jbDCTnXb3 = Reflection.yzPsTade5rL7D3(editCommand.getClass()).yRx9jbDCTnXb3();
                            if (yRx9jbDCTnXb3 == null) {
                                yRx9jbDCTnXb3 = "{anonymous EditCommand}";
                            }
                            concat = "Unknown EditCommand: ".concat(yRx9jbDCTnXb3);
                        }
                        return str.concat(concat);
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
                    sb.append(setComposingTextCommand.yzPsTade5rL7D3.b41X89IqSbKt.length());
                    sb.append(", newCursorPosition=");
                    i = setComposingTextCommand.hRNgd2zGCE5kj;
                }
                concat = OcGJUxcOVecQiKb.kSPEzfraxudm4i(sb, i, ')');
                return str.concat(concat);
            case 10:
                Method method = (Method) obj2;
                Throwable th = (Throwable) obj;
                int i4 = ExceptionsConstructorKt.yzPsTade5rL7D3;
                try {
                    failure = (Throwable) method.invoke(th, null);
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                return (Throwable) (failure instanceof Result.Failure ? null : failure);
            case 11:
                MutableVector mutableVector = (MutableVector) obj2;
                Object[] objArr = mutableVector.oyjLVtGms9eZwJ0;
                int i5 = mutableVector.gmXBnHsR2YSm;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((MeasureResult) objArr[i6]).uypNJrpDByoB();
                }
                return unit;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
                return ((FontFamilyResolverImpl) obj2).hRNgd2zGCE5kj(new TypefaceRequest(null, typefaceRequest.hRNgd2zGCE5kj, typefaceRequest.ra306ClFT3HT, typefaceRequest.oyjLVtGms9eZwJ0, typefaceRequest.b41X89IqSbKt)).getOyjLVtGms9eZwJ0();
            case 13:
                IndicatorLineNode indicatorLineNode = (IndicatorLineNode) obj2;
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                float b41X89IqSbKt = cacheDrawScope.getB41X89IqSbKt() * ((Dp) indicatorLineNode.Yey4RyhSyBRHub.oyjLVtGms9eZwJ0()).oyjLVtGms9eZwJ0;
                AndroidPath yzPsTade5rL7D3 = AndroidPath_androidKt.yzPsTade5rL7D3();
                Shape shape = indicatorLineNode.o4ticBN7g1K8jE;
                if (shape == null) {
                    shape = ShapesKt.yzPsTade5rL7D3((Shapes) CompositionLocalConsumerModifierNodeKt.yzPsTade5rL7D3(indicatorLineNode, ShapesKt.yzPsTade5rL7D3), FilledTextFieldTokens.oyjLVtGms9eZwJ0);
                }
                Outline yzPsTade5rL7D32 = shape.yzPsTade5rL7D3(cacheDrawScope.oyjLVtGms9eZwJ0.b41X89IqSbKt(), cacheDrawScope.oyjLVtGms9eZwJ0.getLayoutDirection(), cacheDrawScope);
                if (yzPsTade5rL7D32 instanceof Outline.Rectangle) {
                    Path.Uo5pffGf8LUU(yzPsTade5rL7D3, ((Outline.Rectangle) yzPsTade5rL7D32).yzPsTade5rL7D3);
                } else if (yzPsTade5rL7D32 instanceof Outline.Rounded) {
                    Path.o2t7oodqU1bUMaS(yzPsTade5rL7D3, ((Outline.Rounded) yzPsTade5rL7D32).yzPsTade5rL7D3);
                } else {
                    if (!(yzPsTade5rL7D32 instanceof Outline.Generic)) {
                        h1.hRNgd2zGCE5kj();
                        return null;
                    }
                    Path.kSPEzfraxudm4i(yzPsTade5rL7D3, ((Outline.Generic) yzPsTade5rL7D32).yzPsTade5rL7D3);
                }
                AndroidPath yzPsTade5rL7D33 = AndroidPath_androidKt.yzPsTade5rL7D3();
                Path.Uo5pffGf8LUU(yzPsTade5rL7D33, new Rect(0.0f, Float.intBitsToFloat((int) (cacheDrawScope.oyjLVtGms9eZwJ0.b41X89IqSbKt() & 4294967295L)) - b41X89IqSbKt, Float.intBitsToFloat((int) (cacheDrawScope.oyjLVtGms9eZwJ0.b41X89IqSbKt() >> 32)), Float.intBitsToFloat((int) (cacheDrawScope.oyjLVtGms9eZwJ0.b41X89IqSbKt() & 4294967295L))));
                AndroidPath yzPsTade5rL7D34 = AndroidPath_androidKt.yzPsTade5rL7D3();
                yzPsTade5rL7D34.uypNJrpDByoB(yzPsTade5rL7D33, yzPsTade5rL7D3, 1);
                return cacheDrawScope.gmXBnHsR2YSm(new ra306ClFT3HT(23, yzPsTade5rL7D34, indicatorLineNode));
            case 14:
                LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = (LazyGridSpanLayoutProvider) obj2;
                int intValue = ((Integer) obj).intValue();
                if (lazyGridSpanLayoutProvider.ra306ClFT3HT() > 0) {
                    if (intValue >= lazyGridSpanLayoutProvider.ra306ClFT3HT()) {
                        InlineClassHelperKt.yzPsTade5rL7D3("ItemIndex > total count");
                    }
                    i3 = intValue / lazyGridSpanLayoutProvider.gmXBnHsR2YSm;
                }
                return Integer.valueOf(i3);
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                return LazyListMeasuredItemProvider.oyjLVtGms9eZwJ0((LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1) obj2, ((Integer) obj).intValue());
            case 16:
                SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) obj2;
                return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.hRNgd2zGCE5kj(obj) : true);
            case 17:
                LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) obj2;
                float f3 = -((Float) obj).floatValue();
                MutableState mutableState = lazyStaggeredGridState.oyjLVtGms9eZwJ0;
                if ((f3 >= 0.0f || lazyStaggeredGridState.oyjLVtGms9eZwJ0()) && (f3 <= 0.0f || lazyStaggeredGridState.yzPsTade5rL7D3())) {
                    if (Math.abs(lazyStaggeredGridState.uypNJrpDByoB) > 0.5f) {
                        InlineClassHelperKt.ra306ClFT3HT("entered drag with non-zero pending scroll");
                    }
                    float f4 = lazyStaggeredGridState.uypNJrpDByoB + f3;
                    lazyStaggeredGridState.uypNJrpDByoB = f4;
                    if (Math.abs(f4) > 0.5f) {
                        float f5 = lazyStaggeredGridState.uypNJrpDByoB;
                        int hRNgd2zGCE5kj = MathKt.hRNgd2zGCE5kj(f5);
                        SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState;
                        LazyStaggeredGridMeasureResult yzPsTade5rL7D35 = ((LazyStaggeredGridMeasureResult) snapshotMutableStateImpl.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3(hRNgd2zGCE5kj, !lazyStaggeredGridState.yzPsTade5rL7D3);
                        if (yzPsTade5rL7D35 != null && (lazyStaggeredGridMeasureResult = lazyStaggeredGridState.hRNgd2zGCE5kj) != null) {
                            LazyStaggeredGridMeasureResult yzPsTade5rL7D36 = lazyStaggeredGridMeasureResult.yzPsTade5rL7D3(hRNgd2zGCE5kj, true);
                            if (yzPsTade5rL7D36 != null) {
                                lazyStaggeredGridState.hRNgd2zGCE5kj = yzPsTade5rL7D36;
                            } else {
                                yzPsTade5rL7D35 = null;
                            }
                        }
                        if (yzPsTade5rL7D35 != null) {
                            boolean z = lazyStaggeredGridState.yzPsTade5rL7D3;
                            int[] iArr = yzPsTade5rL7D35.hRNgd2zGCE5kj;
                            int[] iArr2 = yzPsTade5rL7D35.yzPsTade5rL7D3;
                            LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = lazyStaggeredGridState.ra306ClFT3HT;
                            LazyLayoutScrollDeltaBetweenPasses lazyLayoutScrollDeltaBetweenPasses = lazyStaggeredGridState.FTJ2XS7ULgY8;
                            if (z || !z) {
                                if (z) {
                                    lazyStaggeredGridState.yzPsTade5rL7D3 = true;
                                }
                                lazyStaggeredGridState.uypNJrpDByoB -= yzPsTade5rL7D35.ra306ClFT3HT;
                                ((SnapshotMutableStateImpl) mutableState).setValue(yzPsTade5rL7D35);
                                lazyStaggeredGridScrollPosition.oyjLVtGms9eZwJ0 = iArr;
                                ((SnapshotMutableIntStateImpl) lazyStaggeredGridScrollPosition.b41X89IqSbKt).uypNJrpDByoB(LazyStaggeredGridScrollPosition.hRNgd2zGCE5kj(lazyStaggeredGridScrollPosition.hRNgd2zGCE5kj, iArr));
                                ((SnapshotMutableStateImpl) lazyStaggeredGridState.i7xAcZoXXiIt).setValue(Boolean.valueOf(iArr2[0] != 0 || iArr[0] > 0));
                                ((SnapshotMutableStateImpl) lazyStaggeredGridState.gmXBnHsR2YSm).setValue(Boolean.valueOf(yzPsTade5rL7D35.gmXBnHsR2YSm));
                                if (z) {
                                    lazyLayoutScrollDeltaBetweenPasses.ra306ClFT3HT(yzPsTade5rL7D35.b41X89IqSbKt, yzPsTade5rL7D35.MRfxZSx8l5UG62U, yzPsTade5rL7D35.exVmIuryuB8HeQ);
                                }
                            } else {
                                lazyStaggeredGridState.hRNgd2zGCE5kj = yzPsTade5rL7D35;
                                Snapshot yzPsTade5rL7D37 = Snapshot.Companion.yzPsTade5rL7D3();
                                Function1 b41X89IqSbKt2 = yzPsTade5rL7D37 != null ? yzPsTade5rL7D37.getB41X89IqSbKt() : null;
                                Snapshot hRNgd2zGCE5kj2 = Snapshot.Companion.hRNgd2zGCE5kj(yzPsTade5rL7D37);
                                try {
                                    if (lazyLayoutScrollDeltaBetweenPasses.yzPsTade5rL7D3() && Arrays.equals(iArr2, lazyStaggeredGridScrollPosition.hRNgd2zGCE5kj) && Arrays.equals(iArr, lazyStaggeredGridScrollPosition.oyjLVtGms9eZwJ0)) {
                                        lazyLayoutScrollDeltaBetweenPasses.hRNgd2zGCE5kj();
                                    }
                                    Snapshot.Companion.b41X89IqSbKt(yzPsTade5rL7D37, hRNgd2zGCE5kj2, b41X89IqSbKt2);
                                } catch (Throwable th3) {
                                    Snapshot.Companion.b41X89IqSbKt(yzPsTade5rL7D37, hRNgd2zGCE5kj2, b41X89IqSbKt2);
                                    throw th3;
                                }
                            }
                            ObservableScopeInvalidator.hRNgd2zGCE5kj(lazyStaggeredGridState.o2t7oodqU1bUMaS);
                            lazyStaggeredGridState.gmXBnHsR2YSm(f5 - lazyStaggeredGridState.uypNJrpDByoB, yzPsTade5rL7D35);
                        } else {
                            Remeasurement remeasurement = lazyStaggeredGridState.Uo5pffGf8LUU;
                            if (remeasurement != null) {
                                remeasurement.ra306ClFT3HT();
                            }
                            lazyStaggeredGridState.gmXBnHsR2YSm(f5 - lazyStaggeredGridState.uypNJrpDByoB, (LazyStaggeredGridMeasureResult) snapshotMutableStateImpl.getOyjLVtGms9eZwJ0());
                        }
                    }
                    if (Math.abs(lazyStaggeredGridState.uypNJrpDByoB) > 0.5f) {
                        f3 -= lazyStaggeredGridState.uypNJrpDByoB;
                        lazyStaggeredGridState.uypNJrpDByoB = 0.0f;
                    }
                    f = f3;
                }
                return Float.valueOf(-f);
            case 18:
                ((LayoutNodeDrawScope) obj2).N();
                return unit;
            case 19:
                return ((MatcherMatchResult$groups$1) obj2).ra306ClFT3HT(((Integer) obj).intValue());
            case 20:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                float floatValue = ((Number) ((Animatable) obj2).oyjLVtGms9eZwJ0()).floatValue();
                float oyjLVtGms9eZwJ0 = ModalBottomSheetKt.oyjLVtGms9eZwJ0(graphicsLayerScope, floatValue);
                float b41X89IqSbKt3 = ModalBottomSheetKt.b41X89IqSbKt(graphicsLayerScope, floatValue);
                graphicsLayerScope.Yey4RyhSyBRHub(b41X89IqSbKt3 != 0.0f ? oyjLVtGms9eZwJ0 / b41X89IqSbKt3 : 1.0f);
                graphicsLayerScope.pJp52Z5NdMAiw(ModalBottomSheetKt.yzPsTade5rL7D3);
                return unit;
            case 21:
                String str2 = (String) obj;
                str2.getClass();
                Object obj3 = ((Ref.ObjectRef) obj2).oyjLVtGms9eZwJ0;
                return Boolean.valueOf(obj3 == null || !((Bundle) obj3).containsKey(str2));
            case 22:
                float f6 = NavigationBarKt.yzPsTade5rL7D3;
                ((MutableIntState) obj2).uypNJrpDByoB((int) (((IntSize) obj).yzPsTade5rL7D3 >> 32));
                return unit;
            case 23:
                ((InspectorInfo) obj).getClass();
                throw null;
            case 24:
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = (PluginGeneratedSerialDescriptor) obj2;
                int intValue2 = ((Integer) obj).intValue();
                return pluginGeneratedSerialDescriptor.b41X89IqSbKt[intValue2] + ": " + pluginGeneratedSerialDescriptor.i7xAcZoXXiIt(intValue2).getYzPsTade5rL7D3();
            case 25:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                ClassSerialDescriptorBuilder.yzPsTade5rL7D3(classSerialDescriptorBuilder, "type", StringSerializer.hRNgd2zGCE5kj);
                String str3 = "kotlinx.serialization.Polymorphic<" + ((PolymorphicSerializer) obj2).yzPsTade5rL7D3.yRx9jbDCTnXb3() + '>';
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (StringsKt.GiTAvmtrM6Bh8SJ(str3)) {
                    yzPsTade5rL7D3.yRx9jbDCTnXb3("Blank serial names are prohibited");
                    return null;
                }
                StructureKind.CLASS r0 = StructureKind.CLASS.yzPsTade5rL7D3;
                SerialKind.CONTEXTUAL contextual = SerialKind.CONTEXTUAL.yzPsTade5rL7D3;
                if (contextual == r0) {
                    yzPsTade5rL7D3.yRx9jbDCTnXb3("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    return null;
                }
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder2 = new ClassSerialDescriptorBuilder(str3);
                ClassSerialDescriptorBuilder.yzPsTade5rL7D3(classSerialDescriptorBuilder, "value", new SerialDescriptorImpl(str3, contextual, classSerialDescriptorBuilder2.hRNgd2zGCE5kj.size(), ArraysKt.BD2CRjLJ8EtOqGQ(serialDescriptorArr), classSerialDescriptorBuilder2));
                return unit;
            case 26:
                PullToRefreshDefaults pullToRefreshDefaults = PullToRefreshDefaults.yzPsTade5rL7D3;
                throw null;
            case 27:
                FloatProducer floatProducer = (FloatProducer) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                if (floatProducer.hRNgd2zGCE5kj() > 0.0f) {
                    ProgressBarRangeInfo progressBarRangeInfo = new ProgressBarRangeInfo(floatProducer.hRNgd2zGCE5kj(), RangesKt.b41X89IqSbKt(0.0f, 1.0f));
                    KProperty[] kPropertyArr = SemanticsPropertiesKt.yzPsTade5rL7D3;
                    SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ra306ClFT3HT;
                    KProperty kProperty = SemanticsPropertiesKt.yzPsTade5rL7D3[1];
                    semanticsPropertyReceiver.hRNgd2zGCE5kj(semanticsPropertyKey, progressBarRangeInfo);
                }
                return unit;
            case 28:
                DragAndDropRequestPermission_androidKt.yzPsTade5rL7D3((ReceiveContentNode) obj2, (DragAndDropEvent) obj);
                return unit;
            default:
                MutableStateFlow mutableStateFlow = Recomposer.BD2CRjLJ8EtOqGQ;
                ((ControlledComposition) obj2).hRNgd2zGCE5kj(obj);
                return unit;
        }
    }

    public /* synthetic */ oyjLVtGms9eZwJ0(int i, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
    }

    public /* synthetic */ oyjLVtGms9eZwJ0(int i, Object obj, Object obj2) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
    }
}
