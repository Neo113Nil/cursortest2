package com.door.brass.knob.ui.splash;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStoreOwnerDefaults;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.door.brass.knob.R;
import com.door.brass.knob.ui.splash.SplashDestination;
import com.door.brass.knob.ui.splash.SplashUiState;
import defpackage.VoAHKqpbZzH9eE;
import defpackage.c7;
import defpackage.h1;
import defpackage.wN5ohFcBOzLLfqV;
import defpackage.y5;
import defpackage.yzPsTade5rL7D3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/door/brass/knob/ui/splash/SplashUiState;", "state", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplashScreenKt {

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SplashError.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SplashError splashError = SplashError.oyjLVtGms9eZwJ0;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SplashError splashError2 = SplashError.oyjLVtGms9eZwJ0;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void hRNgd2zGCE5kj(int i, Composer composer) {
        Composer composer2;
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(818457826);
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i & 1, i != 0)) {
            ColumnMeasurePolicy yzPsTade5rL7D3 = ColumnKt.yzPsTade5rL7D3(Arrangement.oyjLVtGms9eZwJ0, Alignment.Companion.yRx9jbDCTnXb3, BD2CRjLJ8EtOqGQ, 54);
            int hashCode = Long.hashCode(BD2CRjLJ8EtOqGQ.getH5JgSr7BP0b5Z());
            PersistentCompositionLocalMap FTJ2XS7ULgY8 = BD2CRjLJ8EtOqGQ.FTJ2XS7ULgY8();
            Modifier.Companion companion = Modifier.Companion.oyjLVtGms9eZwJ0;
            Modifier oyjLVtGms9eZwJ0 = ComposedModifierKt.oyjLVtGms9eZwJ0(BD2CRjLJ8EtOqGQ, companion);
            ComposeUiNode.hRNgd2zGCE5kj.getClass();
            Function0 function0 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
            if (BD2CRjLJ8EtOqGQ.PyXrjLswZZoWpho() == null) {
                ComposablesKt.yzPsTade5rL7D3();
                throw null;
            }
            BD2CRjLJ8EtOqGQ.tp5sG1Fy0ZCmW();
            if (BD2CRjLJ8EtOqGQ.getEYWI9RMqk13H5()) {
                BD2CRjLJ8EtOqGQ.EYWI9RMqk13H5(function0);
            } else {
                BD2CRjLJ8EtOqGQ.AGl7HBCQ8xrHABq();
            }
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, yzPsTade5rL7D3, ComposeUiNode.Companion.gmXBnHsR2YSm);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, FTJ2XS7ULgY8, ComposeUiNode.Companion.b41X89IqSbKt);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, Integer.valueOf(hashCode), ComposeUiNode.Companion.i7xAcZoXXiIt);
            Updater.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, ComposeUiNode.Companion.Uo5pffGf8LUU);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, oyjLVtGms9eZwJ0, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
            ProgressIndicatorKt.yzPsTade5rL7D3(SizeKt.UEutaskTsxaI(companion, 48.0f), MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).yzPsTade5rL7D3, 0.0f, Color.hRNgd2zGCE5kj(0.22f, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).yzPsTade5rL7D3), 0, 0.0f, BD2CRjLJ8EtOqGQ, 6, 52);
            composer2 = BD2CRjLJ8EtOqGQ;
            TextKt.hRNgd2zGCE5kj(StringResources_androidKt.yzPsTade5rL7D3(R.string.splash_loading, BD2CRjLJ8EtOqGQ), PaddingKt.UEutaskTsxaI(companion, 0.0f, 20.0f, 0.0f, 0.0f, 13), MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ).MRfxZSx8l5UG62U, composer2, 48, 0, 131064);
            composer2.GDGFDp2lxiHY();
        } else {
            composer2 = BD2CRjLJ8EtOqGQ;
            composer2.gmXBnHsR2YSm();
        }
        ScopeUpdateScope AwgywP6bDNsW = composer2.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new y5(i, 26));
        }
    }

    public static final void ra306ClFT3HT(Function0 function0, SplashViewModel splashViewModel, Composer composer, int i) {
        SplashViewModel splashViewModel2;
        int i2;
        function0.getClass();
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(381880654);
        int i3 = (BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(function0) ? 4 : 2) | i | 16;
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i3 & 1, (i3 & 19) != 18)) {
            BD2CRjLJ8EtOqGQ.uY26rxeEAFnDq();
            if ((i & 1) == 0 || BD2CRjLJ8EtOqGQ.exVmIuryuB8HeQ()) {
                ViewModelStoreOwner yzPsTade5rL7D3 = LocalViewModelStoreOwner.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ);
                if (yzPsTade5rL7D3 == null) {
                    yzPsTade5rL7D3.kSPEzfraxudm4i("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i3 & (-113);
                    splashViewModel2 = (SplashViewModel) ViewModelKt.yzPsTade5rL7D3(Reflection.yzPsTade5rL7D3(SplashViewModel.class), yzPsTade5rL7D3, HiltViewModelKt.yzPsTade5rL7D3(ViewModelStoreOwnerDefaults.hRNgd2zGCE5kj(yzPsTade5rL7D3), BD2CRjLJ8EtOqGQ), ViewModelStoreOwnerDefaults.yzPsTade5rL7D3(yzPsTade5rL7D3), BD2CRjLJ8EtOqGQ);
                }
            } else {
                BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
                i2 = i3 & (-113);
                splashViewModel2 = splashViewModel;
            }
            BD2CRjLJ8EtOqGQ.K6HLhdE38aTVLa();
            MutableState yzPsTade5rL7D32 = FlowExtKt.yzPsTade5rL7D3(splashViewModel2.oyjLVtGms9eZwJ0, BD2CRjLJ8EtOqGQ);
            Context context = (Context) BD2CRjLJ8EtOqGQ.Uo5pffGf8LUU(AndroidCompositionLocals_androidKt.hRNgd2zGCE5kj);
            boolean zgejW39NNp2D = BD2CRjLJ8EtOqGQ.zgejW39NNp2D(yzPsTade5rL7D32) | BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(splashViewModel2);
            Object UEutaskTsxaI = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.yzPsTade5rL7D3;
            if (zgejW39NNp2D || UEutaskTsxaI == composer$Companion$Empty$1) {
                UEutaskTsxaI = new VoAHKqpbZzH9eE(22, splashViewModel2, yzPsTade5rL7D32);
                BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI);
            }
            BackHandlerKt.yzPsTade5rL7D3(false, (Function0) UEutaskTsxaI, BD2CRjLJ8EtOqGQ, 0, 1);
            SplashUiState splashUiState = (SplashUiState) yzPsTade5rL7D32.getOyjLVtGms9eZwJ0();
            if (splashUiState instanceof SplashUiState.Ready) {
                BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(-761320591);
                SplashDestination splashDestination = ((SplashUiState.Ready) splashUiState).yzPsTade5rL7D3;
                if (splashDestination.equals(SplashDestination.Cafe.yzPsTade5rL7D3)) {
                    BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(1915106388);
                    boolean z = (i2 & 14) == 4;
                    Object UEutaskTsxaI2 = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
                    if (z || UEutaskTsxaI2 == composer$Companion$Empty$1) {
                        UEutaskTsxaI2 = new SplashScreenKt$SplashScreen$2$1(function0, null);
                        BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI2);
                    }
                    EffectsKt.oyjLVtGms9eZwJ0(BD2CRjLJ8EtOqGQ, Unit.yzPsTade5rL7D3, (Function2) UEutaskTsxaI2);
                    BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
                } else {
                    if (!(splashDestination instanceof SplashDestination.Offer)) {
                        BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(1915103921);
                        BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
                        h1.hRNgd2zGCE5kj();
                        return;
                    }
                    BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(1915109057);
                    Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
                    boolean NIabVTHf6LMJyXq = BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(context) | BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(splashDestination);
                    Object UEutaskTsxaI3 = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
                    if (NIabVTHf6LMJyXq || UEutaskTsxaI3 == composer$Companion$Empty$1) {
                        UEutaskTsxaI3 = new VoAHKqpbZzH9eE(23, context, splashDestination);
                        BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI3);
                    }
                    LifecycleEffectKt.yzPsTade5rL7D3(event, null, (Function0) UEutaskTsxaI3, BD2CRjLJ8EtOqGQ, 6);
                    BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
                }
                BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
            } else {
                BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(-761034988);
                BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
            }
            FillElement fillElement = SizeKt.ra306ClFT3HT;
            MeasurePolicy oyjLVtGms9eZwJ0 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.b41X89IqSbKt, false);
            int hashCode = Long.hashCode(BD2CRjLJ8EtOqGQ.getH5JgSr7BP0b5Z());
            PersistentCompositionLocalMap FTJ2XS7ULgY8 = BD2CRjLJ8EtOqGQ.FTJ2XS7ULgY8();
            Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(BD2CRjLJ8EtOqGQ, fillElement);
            ComposeUiNode.hRNgd2zGCE5kj.getClass();
            Function0 function02 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
            if (BD2CRjLJ8EtOqGQ.PyXrjLswZZoWpho() == null) {
                ComposablesKt.yzPsTade5rL7D3();
                throw null;
            }
            BD2CRjLJ8EtOqGQ.tp5sG1Fy0ZCmW();
            if (BD2CRjLJ8EtOqGQ.getEYWI9RMqk13H5()) {
                BD2CRjLJ8EtOqGQ.EYWI9RMqk13H5(function02);
            } else {
                BD2CRjLJ8EtOqGQ.AGl7HBCQ8xrHABq();
            }
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, oyjLVtGms9eZwJ0, ComposeUiNode.Companion.gmXBnHsR2YSm);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, FTJ2XS7ULgY8, ComposeUiNode.Companion.b41X89IqSbKt);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, Integer.valueOf(hashCode), ComposeUiNode.Companion.i7xAcZoXXiIt);
            Updater.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, ComposeUiNode.Companion.Uo5pffGf8LUU);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, oyjLVtGms9eZwJ02, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
            if (splashUiState instanceof SplashUiState.Failed) {
                BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(1523125437);
                SplashError splashError = ((SplashUiState.Failed) splashUiState).yzPsTade5rL7D3;
                boolean NIabVTHf6LMJyXq2 = BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(splashViewModel2);
                Object UEutaskTsxaI4 = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
                if (NIabVTHf6LMJyXq2 || UEutaskTsxaI4 == composer$Companion$Empty$1) {
                    SplashScreenKt$SplashScreen$4$1$1 splashScreenKt$SplashScreen$4$1$1 = new SplashScreenKt$SplashScreen$4$1$1(0, splashViewModel2, SplashViewModel.class, "retry", "retry()V", 0);
                    BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(splashScreenKt$SplashScreen$4$1$1);
                    UEutaskTsxaI4 = splashScreenKt$SplashScreen$4$1$1;
                }
                yzPsTade5rL7D3(splashError, (Function0) ((KFunction) UEutaskTsxaI4), BD2CRjLJ8EtOqGQ, 0);
                BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
            } else {
                BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(1523132638);
                hRNgd2zGCE5kj(0, BD2CRjLJ8EtOqGQ);
                BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
            }
            BD2CRjLJ8EtOqGQ.GDGFDp2lxiHY();
        } else {
            BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
            splashViewModel2 = splashViewModel;
        }
        ScopeUpdateScope AwgywP6bDNsW = BD2CRjLJ8EtOqGQ.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new wN5ohFcBOzLLfqV(function0, splashViewModel2, i, 19));
        }
    }

    public static final void yzPsTade5rL7D3(SplashError splashError, Function0 function0, Composer composer, int i) {
        Composer composer2;
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(-378485129);
        int i2 = (BD2CRjLJ8EtOqGQ.kSPEzfraxudm4i(splashError.ordinal()) ? 4 : 2) | i | (BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(function0) ? 32 : 16);
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i2 & 1, (i2 & 19) != 18)) {
            Object UEutaskTsxaI = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
            if (UEutaskTsxaI == Composer.Companion.yzPsTade5rL7D3) {
                UEutaskTsxaI = InteractionSourceKt.yzPsTade5rL7D3();
                BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI);
            }
            Modifier Uo5pffGf8LUU = PaddingKt.Uo5pffGf8LUU(ClickableKt.hRNgd2zGCE5kj(SizeKt.ra306ClFT3HT, (MutableInteractionSource) UEutaskTsxaI, null, false, null, function0, 28), 28.0f, 0.0f, 2);
            MeasurePolicy oyjLVtGms9eZwJ0 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.b41X89IqSbKt, false);
            int hashCode = Long.hashCode(BD2CRjLJ8EtOqGQ.getH5JgSr7BP0b5Z());
            PersistentCompositionLocalMap FTJ2XS7ULgY8 = BD2CRjLJ8EtOqGQ.FTJ2XS7ULgY8();
            Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(BD2CRjLJ8EtOqGQ, Uo5pffGf8LUU);
            ComposeUiNode.hRNgd2zGCE5kj.getClass();
            Function0 function02 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
            if (BD2CRjLJ8EtOqGQ.PyXrjLswZZoWpho() == null) {
                ComposablesKt.yzPsTade5rL7D3();
                throw null;
            }
            BD2CRjLJ8EtOqGQ.tp5sG1Fy0ZCmW();
            if (BD2CRjLJ8EtOqGQ.getEYWI9RMqk13H5()) {
                BD2CRjLJ8EtOqGQ.EYWI9RMqk13H5(function02);
            } else {
                BD2CRjLJ8EtOqGQ.AGl7HBCQ8xrHABq();
            }
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, oyjLVtGms9eZwJ0, ComposeUiNode.Companion.gmXBnHsR2YSm);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, FTJ2XS7ULgY8, ComposeUiNode.Companion.b41X89IqSbKt);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, Integer.valueOf(hashCode), ComposeUiNode.Companion.i7xAcZoXXiIt);
            Updater.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, ComposeUiNode.Companion.Uo5pffGf8LUU);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, oyjLVtGms9eZwJ02, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
            composer2 = BD2CRjLJ8EtOqGQ;
            SurfaceKt.yzPsTade5rL7D3(SizeKt.yzPsTade5rL7D3, RoundedCornerShapeKt.yzPsTade5rL7D3(28.0f), MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).dKtTSxQHF2Mg8U, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.hRNgd2zGCE5kj(-1500087946, new c7(splashError, function0), BD2CRjLJ8EtOqGQ), composer2, 12582918, 120);
            composer2.GDGFDp2lxiHY();
        } else {
            composer2 = BD2CRjLJ8EtOqGQ;
            composer2.gmXBnHsR2YSm();
        }
        ScopeUpdateScope AwgywP6bDNsW = composer2.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new c7(splashError, function0, i));
        }
    }
}
