package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.gestures.Scrollable2DNode;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.style.StyleOuterNode;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelperApi28;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.unit.IntSize;
import androidx.window.core.Version;
import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KType;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class f6 implements Function0 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ f6(TextFieldCoreModifierNode textFieldCoreModifierNode, Ref.IntRef intRef) {
        this.oyjLVtGms9eZwJ0 = 11;
        this.b41X89IqSbKt = textFieldCoreModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        PendingIntent actionIntent;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Scrollable2DNode) obj).o2t7oodqU1bUMaS);
            case 1:
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj;
                Transition transition = seekableTransitionState.b41X89IqSbKt;
                seekableTransitionState.gmXBnHsR2YSm = transition != null ? ((Number) transition.kSPEzfraxudm4i.getOyjLVtGms9eZwJ0()).longValue() : 0L;
                return unit;
            case 2:
                return obj;
            case 3:
                SerialDescriptorImpl serialDescriptorImpl = (SerialDescriptorImpl) obj;
                return Integer.valueOf(PluginGeneratedSerialDescriptorKt.yzPsTade5rL7D3(serialDescriptorImpl, serialDescriptorImpl.FsuUJlzzWhYnMlD));
            case 4:
                return ((KType) ((ArrayList) obj).get(0)).Uo5pffGf8LUU();
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ShaderBrushSpan shaderBrushSpan = (ShaderBrushSpan) obj;
                int i2 = ShaderBrushSpan.Uo5pffGf8LUU;
                MutableState mutableState = shaderBrushSpan.gmXBnHsR2YSm;
                if (((Size) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3 == 9205357640488583168L || Size.b41X89IqSbKt(((Size) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3)) {
                    return null;
                }
                return shaderBrushSpan.oyjLVtGms9eZwJ0.hRNgd2zGCE5kj(((Size) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3);
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                return ((SheetState) obj).ra306ClFT3HT;
            case 7:
                StyleOuterNode styleOuterNode = (StyleOuterNode) obj;
                GraphicsLayer graphicsLayer = styleOuterNode.OcGJUxcOVecQiKb;
                if (graphicsLayer != null) {
                    return graphicsLayer;
                }
                GraphicsLayer ra306ClFT3HT = DelegatableNodeKt.Uo5pffGf8LUU(styleOuterNode).getGraphicsContext().ra306ClFT3HT();
                styleOuterNode.OcGJUxcOVecQiKb = ra306ClFT3HT;
                return ra306ClFT3HT;
            case 8:
                TextAnnotatedStringNode textAnnotatedStringNode = (TextAnnotatedStringNode) obj;
                textAnnotatedStringNode.tp5sG1Fy0ZCmW = null;
                DelegatableNodeKt.i7xAcZoXXiIt(textAnnotatedStringNode).sb2TpovOJ8wNlST();
                DelegatableNodeKt.i7xAcZoXXiIt(textAnnotatedStringNode).LKH4PK2NjbMM();
                DrawModifierNodeKt.yzPsTade5rL7D3(textAnnotatedStringNode);
                return Boolean.TRUE;
            case 9:
                actionIntent = ((RemoteAction) obj).getActionIntent();
                TextClassificationHelperApi28.yzPsTade5rL7D3(actionIntent);
                return unit;
            case 10:
                TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = (TextContextMenuToolbarHandlerNode) obj;
                return textContextMenuToolbarHandlerNode.o2t7oodqU1bUMaS ? TextContextMenuModifierKt.yzPsTade5rL7D3(textContextMenuToolbarHandlerNode) : TextContextMenuData.hRNgd2zGCE5kj;
            case 11:
                ((TextFieldCoreModifierNode) obj).OcGJUxcOVecQiKb.getClass();
                throw null;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = (TextFieldMagnifierNodeImpl28) obj;
                if (textFieldMagnifierNodeImpl28.OcGJUxcOVecQiKb) {
                    TextFieldMagnifierKt.yzPsTade5rL7D3(textFieldMagnifierNodeImpl28.exVmIuryuB8HeQ, textFieldMagnifierNodeImpl28.AGl7HBCQ8xrHABq, textFieldMagnifierNodeImpl28.pu0JZhzR2Or6, ((IntSize) ((SnapshotMutableStateImpl) textFieldMagnifierNodeImpl28.XrorSzThrtvJ4A).getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3);
                    return new Offset(9205357640488583168L);
                }
                textFieldMagnifierNodeImpl28.AGl7HBCQ8xrHABq.getClass();
                throw null;
            case 13:
                return (TextForegroundStyle) obj;
            case 14:
                TextStringSimpleNode textStringSimpleNode = (TextStringSimpleNode) obj;
                textStringSimpleNode.jJwKDtysO3vm5E = null;
                DelegatableNodeKt.i7xAcZoXXiIt(textStringSimpleNode).sb2TpovOJ8wNlST();
                DelegatableNodeKt.i7xAcZoXXiIt(textStringSimpleNode).LKH4PK2NjbMM();
                DrawModifierNodeKt.yzPsTade5rL7D3(textStringSimpleNode);
                return Boolean.TRUE;
            default:
                Version version = (Version) obj;
                return BigInteger.valueOf(version.oyjLVtGms9eZwJ0).shiftLeft(32).or(BigInteger.valueOf(version.b41X89IqSbKt)).shiftLeft(32).or(BigInteger.valueOf(version.gmXBnHsR2YSm));
        }
    }

    public /* synthetic */ f6(int i, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
    }
}
