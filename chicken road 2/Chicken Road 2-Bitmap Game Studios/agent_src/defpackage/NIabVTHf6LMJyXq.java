package defpackage;

import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.NavBackStackEntryProviderKt;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.ui.challenge.ChallengeScreenKt;
import com.door.brass.knob.ui.menudetail.MenuDetailScreenKt;
import com.door.brass.knob.ui.menudetail.MenuDetailViewModel;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class NIabVTHf6LMJyXq implements Function2 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ NIabVTHf6LMJyXq(Lifecycle.Event event, LifecycleOwner lifecycleOwner, Function0 function0, int i) {
        this.oyjLVtGms9eZwJ0 = 4;
        this.gmXBnHsR2YSm = event;
        this.b41X89IqSbKt = lifecycleOwner;
        this.i7xAcZoXXiIt = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj3 = this.i7xAcZoXXiIt;
        Object obj4 = this.gmXBnHsR2YSm;
        Object obj5 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AccessibilityServiceStateProvider_androidKt.yzPsTade5rL7D3((LifecycleOwner) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 1:
                Modifier modifier = (Modifier) obj5;
                MutableState mutableState = (MutableState) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 3) != 2)) {
                    Object UEutaskTsxaI = composer.UEutaskTsxaI();
                    if (UEutaskTsxaI == Composer.Companion.yzPsTade5rL7D3) {
                        UEutaskTsxaI = new P3UQsRX4QVEGd28(mutableState, 0);
                        composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                    }
                    Modifier yzPsTade5rL7D3 = OnGloballyPositionedModifierKt.yzPsTade5rL7D3(modifier, (Function1) UEutaskTsxaI);
                    MeasurePolicy oyjLVtGms9eZwJ0 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.yzPsTade5rL7D3, true);
                    int hashCode = Long.hashCode(composer.getH5JgSr7BP0b5Z());
                    PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer.FTJ2XS7ULgY8();
                    Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer, yzPsTade5rL7D3);
                    ComposeUiNode.hRNgd2zGCE5kj.getClass();
                    Function0 function0 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
                    if (composer.PyXrjLswZZoWpho() == null) {
                        ComposablesKt.yzPsTade5rL7D3();
                        throw null;
                    }
                    composer.tp5sG1Fy0ZCmW();
                    if (composer.getEYWI9RMqk13H5()) {
                        composer.EYWI9RMqk13H5(function0);
                    } else {
                        composer.AGl7HBCQ8xrHABq();
                    }
                    Updater.hRNgd2zGCE5kj(composer, oyjLVtGms9eZwJ0, ComposeUiNode.Companion.gmXBnHsR2YSm);
                    Updater.hRNgd2zGCE5kj(composer, FTJ2XS7ULgY8, ComposeUiNode.Companion.b41X89IqSbKt);
                    Updater.hRNgd2zGCE5kj(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.i7xAcZoXXiIt);
                    Updater.yzPsTade5rL7D3(composer, ComposeUiNode.Companion.Uo5pffGf8LUU);
                    Updater.hRNgd2zGCE5kj(composer, oyjLVtGms9eZwJ02, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
                    OcGJUxcOVecQiKb.exVmIuryuB8HeQ(0, composer, composableLambdaImpl);
                } else {
                    composer.gmXBnHsR2YSm();
                }
                return unit;
            case 2:
                ((Integer) obj2).getClass();
                ChallengeScreenKt.hRNgd2zGCE5kj((ChallengeEntity) obj5, (Function0) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 3:
                ((Integer) obj2).getClass();
                CoreTextFieldKt.hRNgd2zGCE5kj((Modifier) obj5, (TextFieldSelectionManager) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(385));
                return unit;
            case 4:
                ((Integer) obj2).getClass();
                LifecycleEffectKt.yzPsTade5rL7D3((Lifecycle.Event) obj4, (LifecycleOwner) obj5, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(7));
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ((Integer) obj2).getClass();
                MenuDetailScreenKt.yzPsTade5rL7D3((Function0) obj3, (Function1) obj4, (MenuDetailViewModel) obj5, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ((Integer) obj2).getClass();
                NavBackStackEntryProviderKt.yzPsTade5rL7D3((NavBackStackEntry) obj5, (SaveableStateHolder) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(385));
                return unit;
            case 7:
                Ref.FloatRef floatRef = (Ref.FloatRef) obj5;
                ScrollingLogic scrollingLogic = (ScrollingLogic) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                floatRef.oyjLVtGms9eZwJ0 += scrollingLogic.gmXBnHsR2YSm(scrollingLogic.FsuUJlzzWhYnMlD(((NestedScrollScope) obj3).hRNgd2zGCE5kj(scrollingLogic.UEutaskTsxaI(scrollingLogic.gmXBnHsR2YSm(floatValue - floatRef.oyjLVtGms9eZwJ0)))));
                return unit;
            default:
                Ref.LongRef longRef = (Ref.LongRef) obj5;
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) obj4;
                long gmXBnHsR2YSm = Offset.gmXBnHsR2YSm(longRef.oyjLVtGms9eZwJ0, ((Offset) obj2).yzPsTade5rL7D3);
                longRef.oyjLVtGms9eZwJ0 = gmXBnHsR2YSm;
                textFieldSelectionState.uY26rxeEAFnDq(Handle.oyjLVtGms9eZwJ0, Offset.gmXBnHsR2YSm(((Ref.LongRef) obj3).oyjLVtGms9eZwJ0, gmXBnHsR2YSm));
                textFieldSelectionState.uypNJrpDByoB();
                throw null;
        }
    }

    public /* synthetic */ NIabVTHf6LMJyXq(ChallengeEntity challengeEntity, Function0 function0, Function0 function02, int i) {
        this.oyjLVtGms9eZwJ0 = 2;
        this.b41X89IqSbKt = challengeEntity;
        this.i7xAcZoXXiIt = function0;
        this.gmXBnHsR2YSm = function02;
    }

    public /* synthetic */ NIabVTHf6LMJyXq(Object obj, Object obj2, Object obj3, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
        this.i7xAcZoXXiIt = obj3;
    }

    public /* synthetic */ NIabVTHf6LMJyXq(Object obj, Object obj2, Function function, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
        this.i7xAcZoXXiIt = function;
    }

    public /* synthetic */ NIabVTHf6LMJyXq(Function0 function0, Function1 function1, MenuDetailViewModel menuDetailViewModel, int i) {
        this.oyjLVtGms9eZwJ0 = 5;
        this.i7xAcZoXXiIt = function0;
        this.gmXBnHsR2YSm = function1;
        this.b41X89IqSbKt = menuDetailViewModel;
    }
}
