package defpackage;

import android.content.ClipDescription;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.style.ResolvedStyle;
import androidx.compose.foundation.style.StyleOuterNode;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.composer.gapbuffer.GapAnchorKt;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.text.input.EditCommand;
import androidx.room.RoomConnectionManager;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.TripleSerializer;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class s5 implements Function1 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ s5(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        this.oyjLVtGms9eZwJ0 = 16;
        this.b41X89IqSbKt = mutexImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        CancellableContinuationImpl cancellableContinuationImpl;
        int i = this.oyjLVtGms9eZwJ0;
        CancellableContinuationImpl cancellableContinuationImpl2 = null;
        Object obj2 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                Recomposer recomposer = (Recomposer) obj2;
                Throwable th = (Throwable) obj;
                MutableStateFlow mutableStateFlow = Recomposer.BD2CRjLJ8EtOqGQ;
                CancellationException yzPsTade5rL7D3 = ExceptionsKt.yzPsTade5rL7D3("Recomposer effect job completed", th);
                synchronized (recomposer.ra306ClFT3HT) {
                    try {
                        Job job = recomposer.oyjLVtGms9eZwJ0;
                        if (job != null) {
                            recomposer.pu0JZhzR2Or6.setValue(Recomposer.State.b41X89IqSbKt);
                            if (recomposer.FTJ2XS7ULgY8) {
                                cancellableContinuationImpl = recomposer.MCcLy95b8Awzmw;
                                if (cancellableContinuationImpl != null) {
                                    recomposer.MCcLy95b8Awzmw = null;
                                    job.jJwKDtysO3vm5E(new u3(7, recomposer, th));
                                    cancellableContinuationImpl2 = cancellableContinuationImpl;
                                }
                            } else {
                                job.yzPsTade5rL7D3(yzPsTade5rL7D3);
                            }
                            cancellableContinuationImpl = null;
                            recomposer.MCcLy95b8Awzmw = null;
                            job.jJwKDtysO3vm5E(new u3(7, recomposer, th));
                            cancellableContinuationImpl2 = cancellableContinuationImpl;
                        } else {
                            recomposer.b41X89IqSbKt = yzPsTade5rL7D3;
                            recomposer.pu0JZhzR2Or6.setValue(Recomposer.State.oyjLVtGms9eZwJ0);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (cancellableContinuationImpl2 != null) {
                    cancellableContinuationImpl2.FsuUJlzzWhYnMlD(Unit.yzPsTade5rL7D3);
                }
                return Unit.yzPsTade5rL7D3;
            case 1:
                ((RecordingInputConnection) obj2).hRNgd2zGCE5kj((EditCommand) obj);
                return Unit.yzPsTade5rL7D3;
            case 2:
                SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj;
                supportSQLiteDatabase.getClass();
                ((RoomConnectionManager) obj2).Uo5pffGf8LUU = supportSQLiteDatabase;
                return Unit.yzPsTade5rL7D3;
            case 3:
                ScrollState scrollState = (ScrollState) obj2;
                float floatValue = ((Float) obj).floatValue();
                MutableIntState mutableIntState = scrollState.yzPsTade5rL7D3;
                SnapshotMutableIntStateImpl snapshotMutableIntStateImpl = (SnapshotMutableIntStateImpl) mutableIntState;
                float hRNgd2zGCE5kj = snapshotMutableIntStateImpl.hRNgd2zGCE5kj() + floatValue + scrollState.gmXBnHsR2YSm;
                float hRNgd2zGCE5kj2 = RangesKt.hRNgd2zGCE5kj(hRNgd2zGCE5kj, 0.0f, ((SnapshotMutableIntStateImpl) scrollState.b41X89IqSbKt).hRNgd2zGCE5kj());
                r2 = hRNgd2zGCE5kj == hRNgd2zGCE5kj2;
                float hRNgd2zGCE5kj3 = hRNgd2zGCE5kj2 - snapshotMutableIntStateImpl.hRNgd2zGCE5kj();
                int round = Math.round(hRNgd2zGCE5kj3);
                ((SnapshotMutableIntStateImpl) mutableIntState).uypNJrpDByoB(snapshotMutableIntStateImpl.hRNgd2zGCE5kj() + round);
                scrollState.gmXBnHsR2YSm = hRNgd2zGCE5kj3 - round;
                if (!r2) {
                    floatValue = hRNgd2zGCE5kj3;
                }
                return Float.valueOf(floatValue);
            case 4:
                ((NestedScrollScope) obj2).yzPsTade5rL7D3(1, ((DragEvent.DragDelta) obj).yzPsTade5rL7D3);
                return Unit.yzPsTade5rL7D3;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ScrollingLogic scrollingLogic = (ScrollingLogic) obj2;
                return new Offset(scrollingLogic.b41X89IqSbKt(scrollingLogic.MRfxZSx8l5UG62U, ((Offset) obj).yzPsTade5rL7D3, scrollingLogic.UEutaskTsxaI));
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (((MouseSelectionObserver) obj2).ra306ClFT3HT(pointerInputChange.ra306ClFT3HT)) {
                    pointerInputChange.yzPsTade5rL7D3();
                }
                return Unit.yzPsTade5rL7D3;
            case 7:
                SerialDescriptorImpl serialDescriptorImpl = (SerialDescriptorImpl) obj2;
                int intValue = ((Integer) obj).intValue();
                return serialDescriptorImpl.b41X89IqSbKt[intValue] + ": " + serialDescriptorImpl.gmXBnHsR2YSm[intValue].getYzPsTade5rL7D3();
            case 8:
                return Integer.valueOf(((SlotTable) obj2).oyjLVtGms9eZwJ0(GapAnchorKt.yzPsTade5rL7D3(((MovableContentStateReference) obj).b41X89IqSbKt)));
            case 9:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                ResolvedStyle resolvedStyle = ((StyleOuterNode) obj2).AGl7HBCQ8xrHABq;
                graphicsLayerScope.yzPsTade5rL7D3(resolvedStyle.vAthhQhzH5WQr3);
                graphicsLayerScope.exVmIuryuB8HeQ(resolvedStyle.fZcu2pOOfz9l);
                graphicsLayerScope.Yey4RyhSyBRHub(resolvedStyle.Rp7eugjcSpMRpm);
                graphicsLayerScope.BD2CRjLJ8EtOqGQ(resolvedStyle.GDGFDp2lxiHY);
                graphicsLayerScope.GiTAvmtrM6Bh8SJ(resolvedStyle.K6HLhdE38aTVLa);
                graphicsLayerScope.fZcu2pOOfz9l(resolvedStyle.Gx4wlvRzB4Xo5);
                graphicsLayerScope.i7xAcZoXXiIt(resolvedStyle.PyXrjLswZZoWpho);
                graphicsLayerScope.yRx9jbDCTnXb3(resolvedStyle.zgejW39NNp2D);
                graphicsLayerScope.pJp52Z5NdMAiw(resolvedStyle.mFNFvFv0Eiyk);
                graphicsLayerScope.ZvpnNpCMEWSR3(false);
                graphicsLayerScope.n8dpKKeaNB4O0(resolvedStyle.vywRyEooKGLFsX);
                return Unit.yzPsTade5rL7D3;
            case 10:
                Drawable drawable = (Drawable) obj2;
                DrawScope drawScope = (DrawScope) obj;
                Canvas yzPsTade5rL7D32 = drawScope.getB41X89IqSbKt().yzPsTade5rL7D3();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (drawScope.b41X89IqSbKt() >> 32)), (int) Float.intBitsToFloat((int) (drawScope.b41X89IqSbKt() & 4294967295L)));
                drawable.draw(AndroidCanvas_androidKt.yzPsTade5rL7D3(yzPsTade5rL7D32));
                return Unit.yzPsTade5rL7D3;
            case 11:
                ((Function1) obj).uypNJrpDByoB((TextContextMenuBuilderScope) obj2);
                return Unit.yzPsTade5rL7D3;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                ((TextFieldCoreModifierNode) obj2).XrorSzThrtvJ4A.getClass();
                throw null;
            case 13:
                ClipDescription clipDescription = ((DragAndDropEvent) obj).yzPsTade5rL7D3.getClipDescription();
                Iterable<MediaType> iterable = (Iterable) ((u7) obj2).hRNgd2zGCE5kj();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (MediaType mediaType : iterable) {
                        if (!Intrinsics.yzPsTade5rL7D3(mediaType, MediaType.ra306ClFT3HT) && (clipDescription == null || !clipDescription.hasMimeType(mediaType.yzPsTade5rL7D3))) {
                        }
                        return Boolean.valueOf(r2);
                        break;
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 14:
                TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) obj2;
                float floatValue2 = ((Float) obj).floatValue();
                MutableFloatState mutableFloatState = textFieldScrollerPosition.yzPsTade5rL7D3;
                SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) mutableFloatState;
                float oyjLVtGms9eZwJ0 = snapshotMutableFloatStateImpl.oyjLVtGms9eZwJ0() + floatValue2;
                SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl2 = (SnapshotMutableFloatStateImpl) textFieldScrollerPosition.hRNgd2zGCE5kj;
                if (oyjLVtGms9eZwJ0 > snapshotMutableFloatStateImpl2.oyjLVtGms9eZwJ0()) {
                    floatValue2 = snapshotMutableFloatStateImpl2.oyjLVtGms9eZwJ0() - snapshotMutableFloatStateImpl.oyjLVtGms9eZwJ0();
                } else if (oyjLVtGms9eZwJ0 < 0.0f) {
                    floatValue2 = -snapshotMutableFloatStateImpl.oyjLVtGms9eZwJ0();
                }
                ((SnapshotMutableFloatStateImpl) mutableFloatState).UEutaskTsxaI(snapshotMutableFloatStateImpl.oyjLVtGms9eZwJ0() + floatValue2);
                return Float.valueOf(floatValue2);
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                TripleSerializer tripleSerializer = (TripleSerializer) obj2;
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                ClassSerialDescriptorBuilder.yzPsTade5rL7D3(classSerialDescriptorBuilder, "first", tripleSerializer.yzPsTade5rL7D3.getHRNgd2zGCE5kj());
                ClassSerialDescriptorBuilder.yzPsTade5rL7D3(classSerialDescriptorBuilder, "second", tripleSerializer.hRNgd2zGCE5kj.getHRNgd2zGCE5kj());
                ClassSerialDescriptorBuilder.yzPsTade5rL7D3(classSerialDescriptorBuilder, "third", tripleSerializer.ra306ClFT3HT.getHRNgd2zGCE5kj());
                return Unit.yzPsTade5rL7D3;
            default:
                ((MutexImpl) obj2).yzPsTade5rL7D3(null);
                return Unit.yzPsTade5rL7D3;
        }
    }

    public /* synthetic */ s5(int i, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
    }
}
