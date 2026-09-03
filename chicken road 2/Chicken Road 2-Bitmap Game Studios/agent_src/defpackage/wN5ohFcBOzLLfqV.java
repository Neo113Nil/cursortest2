package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.collection.MutableObjectList;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.Scroll2DScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl;
import androidx.compose.foundation.pager.PagerScrollScopeKt$LazyLayoutScrollScope$1;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.DefaultNavigationBarOverride;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.NavigationBarOverrideScope;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.ReusableRememberObserverHolder;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Constraints;
import androidx.navigation.compose.DialogHostKt;
import androidx.navigation.compose.NavBackStackEntryProviderKt;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.data.db.entity.TipEntity;
import com.door.brass.knob.ui.challenge.ChallengeScreenKt;
import com.door.brass.knob.ui.menu.MenuScreenKt;
import com.door.brass.knob.ui.menu.MenuViewModel;
import com.door.brass.knob.ui.splash.SplashScreenKt;
import com.door.brass.knob.ui.splash.SplashViewModel;
import com.door.brass.knob.ui.tips.TipsScreenKt;
import defpackage.u3;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class wN5ohFcBOzLLfqV implements Function2 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ wN5ohFcBOzLLfqV(Handle handle, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef, Ref.LongRef longRef2, boolean z) {
        this.oyjLVtGms9eZwJ0 = 21;
        this.b41X89IqSbKt = longRef;
        this.gmXBnHsR2YSm = textFieldSelectionState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        TextRange textRange = null;
        int i2 = 1;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj3 = this.gmXBnHsR2YSm;
        Object obj4 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CanvasKt.yzPsTade5rL7D3((Modifier) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                ChallengeScreenKt.yzPsTade5rL7D3((ChallengeEntity) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 2:
                ((Integer) obj2).getClass();
                ((ContextMenuScope) obj4).yzPsTade5rL7D3((ContextMenuColors) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 3:
                ((Integer) obj2).getClass();
                ((DefaultNavigationBarOverride) obj4).yzPsTade5rL7D3((NavigationBarOverrideScope) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 4:
                ((Integer) obj2).getClass();
                ((DefaultSingleRowTopAppBarOverride) obj4).yzPsTade5rL7D3((SingleRowTopAppBarOverrideScope) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ((Integer) obj2).getClass();
                DefaultTextContextMenuDropdownProvider_androidKt.yzPsTade5rL7D3((TextContextMenuSession) obj4, (TextContextMenuData) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ((Integer) obj2).getClass();
                DialogHostKt.hRNgd2zGCE5kj((List) obj4, (Collection) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 7:
                RememberManager rememberManager = (RememberManager) obj4;
                SlotWriter slotWriter = (SlotWriter) obj3;
                int intValue = ((Integer) obj).intValue();
                if (obj2 instanceof ComposeNodeLifecycleCallback) {
                    rememberManager.hRNgd2zGCE5kj((ComposeNodeLifecycleCallback) obj2);
                } else if (!(obj2 instanceof ReusableRememberObserverHolder)) {
                    if (obj2 instanceof RememberObserverHolder) {
                        GapComposerKt.oyjLVtGms9eZwJ0(slotWriter, intValue, obj2);
                        rememberManager.gmXBnHsR2YSm((RememberObserverHolder) obj2);
                    } else if (obj2 instanceof RecomposeScopeImpl) {
                        GapComposerKt.oyjLVtGms9eZwJ0(slotWriter, intValue, obj2);
                        ((RecomposeScopeImpl) obj2).oyjLVtGms9eZwJ0();
                    }
                }
                return unit;
            case 8:
                return ((LazyLayoutMeasurePolicy) obj3).yzPsTade5rL7D3(new LazyLayoutMeasureScopeImpl((LazyLayoutItemContentFactory) obj4, (SubcomposeMeasureScope) obj), ((Constraints) obj2).yzPsTade5rL7D3);
            case 9:
                MutableState mutableState = (MutableState) obj4;
                Function0 function0 = (Function0) obj3;
                Composer composer = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (composer.ZvpnNpCMEWSR3(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AppBarKt.hRNgd2zGCE5kj(ComposableLambdaKt.hRNgd2zGCE5kj(521550729, new l1(mutableState, i2), composer), null, ComposableLambdaKt.hRNgd2zGCE5kj(1424471307, new EYWI9RMqk13H5(10, function0), composer), null, 0.0f, WindowInsetsKt.yzPsTade5rL7D3(0, 14), null, composer, 390, 218);
                } else {
                    composer.gmXBnHsR2YSm();
                }
                return unit;
            case 10:
                ((Integer) obj2).getClass();
                MenuScreenKt.hRNgd2zGCE5kj((Function1) obj3, (MenuViewModel) obj4, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 11:
                ((Integer) obj2).getClass();
                MenuScreenKt.yzPsTade5rL7D3((MenuItemEntity) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                ((Integer) obj2).getClass();
                NavBackStackEntryProviderKt.hRNgd2zGCE5kj((SaveableStateHolder) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 13:
                Ref.FloatRef floatRef = (Ref.FloatRef) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1 = PagerStateKt.yzPsTade5rL7D3;
                floatRef.oyjLVtGms9eZwJ0 += ((PagerScrollScopeKt$LazyLayoutScrollScope$1) obj3).yzPsTade5rL7D3.b41X89IqSbKt(floatValue - floatRef.oyjLVtGms9eZwJ0);
                return unit;
            case 14:
                Ref.FloatRef floatRef2 = (Ref.FloatRef) obj4;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = floatRef2.oyjLVtGms9eZwJ0;
                floatRef2.oyjLVtGms9eZwJ0 = ((ScrollScope) obj3).b41X89IqSbKt(floatValue2 - f) + f;
                return unit;
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                Ref.LongRef longRef = (Ref.LongRef) obj4;
                long j = longRef.oyjLVtGms9eZwJ0;
                longRef.oyjLVtGms9eZwJ0 = Offset.gmXBnHsR2YSm(j, ((Scroll2DScope) obj3).yzPsTade5rL7D3(Offset.b41X89IqSbKt(((Offset) obj).yzPsTade5rL7D3, j)));
                return unit;
            case 16:
                Ref.LongRef longRef2 = (Ref.LongRef) obj4;
                longRef2.oyjLVtGms9eZwJ0 = Offset.gmXBnHsR2YSm(longRef2.oyjLVtGms9eZwJ0, ((NestedScrollScope) obj3).hRNgd2zGCE5kj(Offset.b41X89IqSbKt(((Offset) obj).yzPsTade5rL7D3, longRef2.oyjLVtGms9eZwJ0)));
                return unit;
            case 17:
                ((Integer) obj2).getClass();
                SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.yzPsTade5rL7D3;
                ((SegmentedButtonDefaults) obj4).hRNgd2zGCE5kj((Function2) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(3073));
                return unit;
            case 18:
                ((Integer) obj2).getClass();
                SimpleLayoutKt.yzPsTade5rL7D3((Modifier) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(49));
                return unit;
            case 19:
                ((Integer) obj2).getClass();
                SplashScreenKt.ra306ClFT3HT((Function0) obj4, (SplashViewModel) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 20:
                final TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj4;
                final CoroutineScope coroutineScope = (CoroutineScope) obj3;
                TextContextMenuBuilderScope textContextMenuBuilderScope = (TextContextMenuBuilderScope) obj;
                final Context context = (Context) obj2;
                boolean MRfxZSx8l5UG62U = textFieldSelectionManager.MRfxZSx8l5UG62U();
                AnnotatedString yRx9jbDCTnXb3 = textFieldSelectionManager.yRx9jbDCTnXb3();
                String str = yRx9jbDCTnXb3 != null ? yRx9jbDCTnXb3.b41X89IqSbKt : null;
                TextRange textRange2 = textFieldSelectionManager.XrorSzThrtvJ4A;
                if (textRange2 != null) {
                    long j2 = textRange2.yzPsTade5rL7D3;
                    OffsetMapping offsetMapping = textFieldSelectionManager.hRNgd2zGCE5kj;
                    textRange = new TextRange(TextRangeKt.yzPsTade5rL7D3(offsetMapping.hRNgd2zGCE5kj((int) (j2 >> 32)), offsetMapping.hRNgd2zGCE5kj((int) (j2 & 4294967295L))));
                }
                PlatformSelectionBehaviors_androidKt.yzPsTade5rL7D3(textContextMenuBuilderScope, context, MRfxZSx8l5UG62U, str, textRange, textFieldSelectionManager.UEutaskTsxaI, new Function1() { // from class: androidx.compose.foundation.text.selection.b41X89IqSbKt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object uypNJrpDByoB(Object obj5) {
                        TextContextMenuBuilderScope textContextMenuBuilderScope2 = (TextContextMenuBuilderScope) obj5;
                        textContextMenuBuilderScope2.yzPsTade5rL7D3();
                        MutableObjectList mutableObjectList = textContextMenuBuilderScope2.yzPsTade5rL7D3;
                        TextContextMenuItems textContextMenuItems = TextContextMenuItems.i7xAcZoXXiIt;
                        final TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                        final int i3 = 0;
                        final int i4 = 1;
                        boolean z = (TextRange.oyjLVtGms9eZwJ0(textFieldSelectionManager2.NIabVTHf6LMJyXq().hRNgd2zGCE5kj) || !textFieldSelectionManager2.MRfxZSx8l5UG62U() || (textFieldSelectionManager2.gmXBnHsR2YSm instanceof PasswordVisualTransformation) || textFieldSelectionManager2.Uo5pffGf8LUU == null) ? false : true;
                        Function0 function02 = null;
                        final TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1 = new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1(textFieldSelectionManager2, null);
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        Function0 function03 = new Function0() { // from class: androidx.compose.foundation.text.selection.oyjLVtGms9eZwJ0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object hRNgd2zGCE5kj() {
                                BuildersKt.ra306ClFT3HT(CoroutineScope.this, null, CoroutineStart.i7xAcZoXXiIt, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(null, textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1), 1);
                                return Unit.yzPsTade5rL7D3;
                            }
                        };
                        Context context2 = context;
                        Resources resources = context2.getResources();
                        u3 u3Var = new u3(function03, function02);
                        if (z) {
                            mutableObjectList.i7xAcZoXXiIt(new TextContextMenuItem(TextContextMenuKeys.yzPsTade5rL7D3, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, u3Var));
                        }
                        TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.i7xAcZoXXiIt;
                        boolean z2 = (TextRange.oyjLVtGms9eZwJ0(textFieldSelectionManager2.NIabVTHf6LMJyXq().hRNgd2zGCE5kj) || (textFieldSelectionManager2.gmXBnHsR2YSm instanceof PasswordVisualTransformation) || textFieldSelectionManager2.Uo5pffGf8LUU == null) ? false : true;
                        final TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 = new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(textFieldSelectionManager2, null);
                        Function0 function04 = new Function0() { // from class: androidx.compose.foundation.text.selection.oyjLVtGms9eZwJ0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object hRNgd2zGCE5kj() {
                                BuildersKt.ra306ClFT3HT(CoroutineScope.this, null, CoroutineStart.i7xAcZoXXiIt, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(null, textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2), 1);
                                return Unit.yzPsTade5rL7D3;
                            }
                        };
                        Resources resources2 = context2.getResources();
                        u3 u3Var2 = new u3(function04, function02);
                        if (z2) {
                            mutableObjectList.i7xAcZoXXiIt(new TextContextMenuItem(TextContextMenuKeys.hRNgd2zGCE5kj, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, u3Var2));
                        }
                        TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.i7xAcZoXXiIt;
                        boolean z3 = textFieldSelectionManager2.MRfxZSx8l5UG62U() && ((Boolean) ((SnapshotMutableStateImpl) textFieldSelectionManager2.ZvpnNpCMEWSR3).getOyjLVtGms9eZwJ0()).booleanValue() && textFieldSelectionManager2.Uo5pffGf8LUU != null;
                        final TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3 = new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3(textFieldSelectionManager2, null);
                        Function0 function05 = new Function0() { // from class: androidx.compose.foundation.text.selection.oyjLVtGms9eZwJ0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object hRNgd2zGCE5kj() {
                                BuildersKt.ra306ClFT3HT(CoroutineScope.this, null, CoroutineStart.i7xAcZoXXiIt, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(null, textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3), 1);
                                return Unit.yzPsTade5rL7D3;
                            }
                        };
                        Resources resources3 = context2.getResources();
                        u3 u3Var3 = new u3(function05, function02);
                        if (z3) {
                            mutableObjectList.i7xAcZoXXiIt(new TextContextMenuItem(TextContextMenuKeys.ra306ClFT3HT, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, u3Var3));
                        }
                        TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.i7xAcZoXXiIt;
                        boolean z4 = TextRange.b41X89IqSbKt(textFieldSelectionManager2.NIabVTHf6LMJyXq().hRNgd2zGCE5kj) != textFieldSelectionManager2.NIabVTHf6LMJyXq().yzPsTade5rL7D3.b41X89IqSbKt.length();
                        Function0 function06 = new Function0() { // from class: c8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object hRNgd2zGCE5kj() {
                                int i5 = i3;
                                Unit unit2 = Unit.yzPsTade5rL7D3;
                                TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                switch (i5) {
                                    case 0:
                                        break;
                                    case 1:
                                        TextFieldValue b41X89IqSbKt = TextFieldSelectionManager.b41X89IqSbKt(textFieldSelectionManager3.NIabVTHf6LMJyXq().yzPsTade5rL7D3, TextRangeKt.yzPsTade5rL7D3(0, textFieldSelectionManager3.NIabVTHf6LMJyXq().yzPsTade5rL7D3.b41X89IqSbKt.length()));
                                        textFieldSelectionManager3.ra306ClFT3HT.uypNJrpDByoB(b41X89IqSbKt);
                                        long j3 = b41X89IqSbKt.hRNgd2zGCE5kj;
                                        textFieldSelectionManager3.XrorSzThrtvJ4A = new TextRange(j3);
                                        textFieldSelectionManager3.pu0JZhzR2Or6 = TextFieldValue.yzPsTade5rL7D3(textFieldSelectionManager3.pu0JZhzR2Or6, null, j3, 5);
                                        textFieldSelectionManager3.Uo5pffGf8LUU(true);
                                        break;
                                    default:
                                        Function0 function07 = textFieldSelectionManager3.i7xAcZoXXiIt;
                                        if (function07 != null) {
                                            function07.hRNgd2zGCE5kj();
                                            break;
                                        }
                                        break;
                                }
                                return unit2;
                            }
                        };
                        Function0 function07 = new Function0() { // from class: c8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object hRNgd2zGCE5kj() {
                                int i5 = i4;
                                Unit unit2 = Unit.yzPsTade5rL7D3;
                                TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                switch (i5) {
                                    case 0:
                                        break;
                                    case 1:
                                        TextFieldValue b41X89IqSbKt = TextFieldSelectionManager.b41X89IqSbKt(textFieldSelectionManager3.NIabVTHf6LMJyXq().yzPsTade5rL7D3, TextRangeKt.yzPsTade5rL7D3(0, textFieldSelectionManager3.NIabVTHf6LMJyXq().yzPsTade5rL7D3.b41X89IqSbKt.length()));
                                        textFieldSelectionManager3.ra306ClFT3HT.uypNJrpDByoB(b41X89IqSbKt);
                                        long j3 = b41X89IqSbKt.hRNgd2zGCE5kj;
                                        textFieldSelectionManager3.XrorSzThrtvJ4A = new TextRange(j3);
                                        textFieldSelectionManager3.pu0JZhzR2Or6 = TextFieldValue.yzPsTade5rL7D3(textFieldSelectionManager3.pu0JZhzR2Or6, null, j3, 5);
                                        textFieldSelectionManager3.Uo5pffGf8LUU(true);
                                        break;
                                    default:
                                        Function0 function072 = textFieldSelectionManager3.i7xAcZoXXiIt;
                                        if (function072 != null) {
                                            function072.hRNgd2zGCE5kj();
                                            break;
                                        }
                                        break;
                                }
                                return unit2;
                            }
                        };
                        Resources resources4 = context2.getResources();
                        u3 u3Var4 = new u3(function07, function06);
                        if (z4) {
                            mutableObjectList.i7xAcZoXXiIt(new TextContextMenuItem(TextContextMenuKeys.oyjLVtGms9eZwJ0, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, u3Var4));
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.i7xAcZoXXiIt;
                            if (textFieldSelectionManager2.MRfxZSx8l5UG62U() && TextRange.oyjLVtGms9eZwJ0(textFieldSelectionManager2.NIabVTHf6LMJyXq().hRNgd2zGCE5kj)) {
                                i3 = 1;
                            }
                            final int i5 = 2;
                            Function0 function08 = new Function0() { // from class: c8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object hRNgd2zGCE5kj() {
                                    int i52 = i5;
                                    Unit unit2 = Unit.yzPsTade5rL7D3;
                                    TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                    switch (i52) {
                                        case 0:
                                            break;
                                        case 1:
                                            TextFieldValue b41X89IqSbKt = TextFieldSelectionManager.b41X89IqSbKt(textFieldSelectionManager3.NIabVTHf6LMJyXq().yzPsTade5rL7D3, TextRangeKt.yzPsTade5rL7D3(0, textFieldSelectionManager3.NIabVTHf6LMJyXq().yzPsTade5rL7D3.b41X89IqSbKt.length()));
                                            textFieldSelectionManager3.ra306ClFT3HT.uypNJrpDByoB(b41X89IqSbKt);
                                            long j3 = b41X89IqSbKt.hRNgd2zGCE5kj;
                                            textFieldSelectionManager3.XrorSzThrtvJ4A = new TextRange(j3);
                                            textFieldSelectionManager3.pu0JZhzR2Or6 = TextFieldValue.yzPsTade5rL7D3(textFieldSelectionManager3.pu0JZhzR2Or6, null, j3, 5);
                                            textFieldSelectionManager3.Uo5pffGf8LUU(true);
                                            break;
                                        default:
                                            Function0 function072 = textFieldSelectionManager3.i7xAcZoXXiIt;
                                            if (function072 != null) {
                                                function072.hRNgd2zGCE5kj();
                                                break;
                                            }
                                            break;
                                    }
                                    return unit2;
                                }
                            };
                            Resources resources5 = context2.getResources();
                            u3 u3Var5 = new u3(function08, function02);
                            if (i3 != 0) {
                                mutableObjectList.i7xAcZoXXiIt(new TextContextMenuItem(textContextMenuItems5.oyjLVtGms9eZwJ0, resources5.getString(textContextMenuItems5.b41X89IqSbKt), textContextMenuItems5.gmXBnHsR2YSm, u3Var5));
                            }
                        }
                        textContextMenuBuilderScope2.yzPsTade5rL7D3();
                        return Unit.yzPsTade5rL7D3;
                    }
                });
                return unit;
            case 21:
                Ref.LongRef longRef3 = (Ref.LongRef) obj4;
                longRef3.oyjLVtGms9eZwJ0 = Offset.gmXBnHsR2YSm(longRef3.oyjLVtGms9eZwJ0, ((Offset) obj2).yzPsTade5rL7D3);
                throw null;
            default:
                ((Integer) obj2).getClass();
                TipsScreenKt.yzPsTade5rL7D3((TipEntity) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
        }
    }

    public /* synthetic */ wN5ohFcBOzLLfqV(int i, Object obj, Object obj2) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
    }

    public /* synthetic */ wN5ohFcBOzLLfqV(Object obj, Object obj2, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
    }

    public /* synthetic */ wN5ohFcBOzLLfqV(Function1 function1, MenuViewModel menuViewModel, int i) {
        this.oyjLVtGms9eZwJ0 = 10;
        this.gmXBnHsR2YSm = function1;
        this.b41X89IqSbKt = menuViewModel;
    }
}
