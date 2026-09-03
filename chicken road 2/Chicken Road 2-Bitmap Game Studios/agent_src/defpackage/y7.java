package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import com.door.brass.knob.ui.theme.ThemeKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class y7 implements Function2 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                return Integer.valueOf(((IntrinsicMeasurable) obj).uypNJrpDByoB(((Integer) obj2).intValue()));
            case 1:
                TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) obj2;
                return CollectionsKt.Yey4RyhSyBRHub(Float.valueOf(((SnapshotMutableFloatStateImpl) textFieldScrollerPosition.yzPsTade5rL7D3).oyjLVtGms9eZwJ0()), Boolean.valueOf(((Orientation) ((SnapshotMutableStateImpl) textFieldScrollerPosition.gmXBnHsR2YSm).getOyjLVtGms9eZwJ0()) == Orientation.oyjLVtGms9eZwJ0));
            case 2:
                SaverScope saverScope = (SaverScope) obj;
                TextFieldValue textFieldValue = (TextFieldValue) obj2;
                return CollectionsKt.UEutaskTsxaI(SaversKt.yzPsTade5rL7D3(textFieldValue.yzPsTade5rL7D3, SaversKt.yzPsTade5rL7D3, saverScope), SaversKt.yzPsTade5rL7D3(new TextRange(textFieldValue.hRNgd2zGCE5kj), SaversKt.GiTAvmtrM6Bh8SJ, saverScope));
            case 3:
                ((Integer) obj2).getClass();
                ThemeKt.yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(7), (Composer) obj);
                return Unit.yzPsTade5rL7D3;
            case 4:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof ThreadContextElement)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? element : Integer.valueOf(intValue + 1);
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ThreadContextElement threadContextElement = (ThreadContextElement) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (threadContextElement != null) {
                    return threadContextElement;
                }
                if (element2 instanceof ThreadContextElement) {
                    return (ThreadContextElement) element2;
                }
                return null;
            default:
                TopAppBarState topAppBarState = (TopAppBarState) obj2;
                return CollectionsKt.Yey4RyhSyBRHub(Float.valueOf(topAppBarState.yzPsTade5rL7D3), Float.valueOf(topAppBarState.hRNgd2zGCE5kj()), Float.valueOf(((SnapshotMutableFloatStateImpl) topAppBarState.hRNgd2zGCE5kj).oyjLVtGms9eZwJ0()));
        }
    }

    public /* synthetic */ y7(int i, byte b) {
        this.oyjLVtGms9eZwJ0 = i;
    }
}
