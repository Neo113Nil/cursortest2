package defpackage;

import androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.foundation.style.ResolvedStyle;
import androidx.compose.foundation.style.StyleOuterNode;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.AwaiterQueue;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.SourceInformation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Density;
import com.door.brass.knob.ui.menu.MenuUiState;
import com.door.brass.knob.ui.menu.MenuViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class Ae8HxJ6tiidOhX implements Function0 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ Ae8HxJ6tiidOhX(ResolvedStyle resolvedStyle, StyleOuterNode styleOuterNode, Density density, ResolvedStyle resolvedStyle2, Ref.IntRef intRef, boolean z) {
        this.oyjLVtGms9eZwJ0 = 6;
        this.b41X89IqSbKt = resolvedStyle;
        this.gmXBnHsR2YSm = styleOuterNode;
        this.i7xAcZoXXiIt = density;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if (r4.OcGJUxcOVecQiKb == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        r0 = (androidx.compose.ui.geometry.Rect) r4.AGl7HBCQ8xrHABq.hRNgd2zGCE5kj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011b, code lost:
    
        r3 = r4;
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0127, code lost:
    
        if (androidx.compose.foundation.gestures.ContentInViewNode.s0(r3, r0, 0, 0, 3) != true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0129, code lost:
    
        r4.OcGJUxcOVecQiKb = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012c, code lost:
    
        r1.b41X89IqSbKt = androidx.compose.foundation.gestures.ContentInViewNode.q0(r4, r11, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0134, code lost:
    
        return r2;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hRNgd2zGCE5kj() {
        int i;
        ContentInViewNode contentInViewNode;
        boolean s0;
        Object value;
        MenuUiState menuUiState;
        MenuUiState yzPsTade5rL7D3;
        int i2 = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj = this.i7xAcZoXXiIt;
        Object obj2 = this.gmXBnHsR2YSm;
        Object obj3 = this.b41X89IqSbKt;
        switch (i2) {
            case 0:
                ((AwaiterQueue.Awaiter) obj3).yzPsTade5rL7D3();
                AtomicInt atomicInt = ((AwaiterQueue) obj2).ra306ClFT3HT;
                int i3 = ((Ref.IntRef) obj).oyjLVtGms9eZwJ0;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return unit;
            case 1:
                BringIntoViewResponderNode bringIntoViewResponderNode = (BringIntoViewResponderNode) obj3;
                Rect q0 = BringIntoViewResponderNode.q0(bringIntoViewResponderNode, (NodeCoordinator) obj2, (Function0) obj);
                if (q0 != null) {
                    return bringIntoViewResponderNode.MCcLy95b8Awzmw.B(q0);
                }
                return null;
            case 2:
                CertificateChainCleaner certificateChainCleaner = ((CertificatePinner) obj3).hRNgd2zGCE5kj;
                certificateChainCleaner.getClass();
                return certificateChainCleaner.yzPsTade5rL7D3(((Address) obj).Uo5pffGf8LUU.oyjLVtGms9eZwJ0, ((Handshake) obj2).yzPsTade5rL7D3());
            case 3:
                ContentInViewNode contentInViewNode2 = (ContentInViewNode) obj3;
                UpdatableAnimationState updatableAnimationState = (UpdatableAnimationState) obj2;
                BringIntoViewSpec bringIntoViewSpec = (BringIntoViewSpec) obj;
                BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode2.pu0JZhzR2Or6;
                while (true) {
                    MutableVector mutableVector = bringIntoViewRequestPriorityQueue.yzPsTade5rL7D3;
                    int i4 = mutableVector.gmXBnHsR2YSm;
                    if (i4 == 0) {
                        contentInViewNode = contentInViewNode2;
                        break;
                    } else {
                        if (i4 == 0) {
                            h1.FTJ2XS7ULgY8("MutableVector is empty.");
                            return null;
                        }
                        Rect rect = (Rect) ((ContentInViewNode.Request) mutableVector.oyjLVtGms9eZwJ0[i4 - 1]).yzPsTade5rL7D3.hRNgd2zGCE5kj();
                        if (rect == null) {
                            contentInViewNode = contentInViewNode2;
                            s0 = true;
                        } else {
                            contentInViewNode = contentInViewNode2;
                            s0 = ContentInViewNode.s0(contentInViewNode, rect, 0L, 0L, 3);
                        }
                        if (!s0) {
                            break;
                        } else {
                            MutableVector mutableVector2 = bringIntoViewRequestPriorityQueue.yzPsTade5rL7D3;
                            ((ContentInViewNode.Request) mutableVector2.MRfxZSx8l5UG62U(mutableVector2.gmXBnHsR2YSm - 1)).hRNgd2zGCE5kj.FsuUJlzzWhYnMlD(unit);
                            contentInViewNode2 = contentInViewNode;
                        }
                    }
                }
            case 4:
                MenuViewModel menuViewModel = (MenuViewModel) obj3;
                String str = (String) obj2;
                MutableState mutableState = (MutableState) obj;
                str.getClass();
                MutableStateFlow mutableStateFlow = menuViewModel.ra306ClFT3HT;
                do {
                    value = mutableStateFlow.getValue();
                    menuUiState = (MenuUiState) value;
                    yzPsTade5rL7D3 = MenuUiState.yzPsTade5rL7D3(menuUiState, null, null, null, str, null, false, 247);
                } while (!mutableStateFlow.i7xAcZoXXiIt(value, MenuUiState.yzPsTade5rL7D3(yzPsTade5rL7D3, null, menuViewModel.gmXBnHsR2YSm(yzPsTade5rL7D3, menuUiState.yzPsTade5rL7D3), null, null, null, false, 253)));
                mutableState.setValue(Boolean.FALSE);
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                GapAnchor gapAnchor = (GapAnchor) obj3;
                SlotWriter slotWriter = (SlotWriter) obj2;
                OperationErrorContext operationErrorContext = (OperationErrorContext) obj;
                if (gapAnchor != null) {
                    slotWriter.yzPsTade5rL7D3(slotWriter.ra306ClFT3HT(gapAnchor) - slotWriter.exVmIuryuB8HeQ);
                }
                List yzPsTade5rL7D32 = ComposeStackTraceBuilderKt.yzPsTade5rL7D3(slotWriter, null, slotWriter.exVmIuryuB8HeQ, null);
                ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) CollectionsKt.jJwKDtysO3vm5E(yzPsTade5rL7D32);
                Integer num = composeStackTraceFrame != null ? composeStackTraceFrame.ra306ClFT3HT : null;
                List oyjLVtGms9eZwJ0 = operationErrorContext.oyjLVtGms9eZwJ0(num);
                if (num != null && !oyjLVtGms9eZwJ0.isEmpty()) {
                    ComposeStackTraceFrame composeStackTraceFrame2 = (ComposeStackTraceFrame) CollectionsKt.exVmIuryuB8HeQ(oyjLVtGms9eZwJ0);
                    List MCcLy95b8Awzmw = CollectionsKt.MCcLy95b8Awzmw(oyjLVtGms9eZwJ0);
                    int i5 = composeStackTraceFrame2.yzPsTade5rL7D3;
                    SourceInformation sourceInformation = composeStackTraceFrame2.hRNgd2zGCE5kj;
                    composeStackTraceFrame2.getClass();
                    oyjLVtGms9eZwJ0 = CollectionsKt.vywRyEooKGLFsX(CollectionsKt.o4ticBN7g1K8jE(new ComposeStackTraceFrame(i5, sourceInformation, num)), MCcLy95b8Awzmw);
                }
                return new ComposeStackTrace(CollectionsKt.vywRyEooKGLFsX(yzPsTade5rL7D32, oyjLVtGms9eZwJ0), operationErrorContext.b41X89IqSbKt());
            default:
                ResolvedStyle resolvedStyle = (ResolvedStyle) obj3;
                resolvedStyle.gmXBnHsR2YSm = (StyleOuterNode) obj2;
                resolvedStyle.b41X89IqSbKt = ((Density) obj).getB41X89IqSbKt();
                throw null;
        }
    }

    public /* synthetic */ Ae8HxJ6tiidOhX(Object obj, Object obj2, Object obj3, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
        this.i7xAcZoXXiIt = obj3;
    }
}
