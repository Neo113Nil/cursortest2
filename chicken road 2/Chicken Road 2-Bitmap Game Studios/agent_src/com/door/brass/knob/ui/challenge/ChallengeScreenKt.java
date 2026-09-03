package com.door.brass.knob.ui.challenge;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AssistChipDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStoreOwnerDefaults;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.ui.challenge.ChallengeUiState;
import com.door.brass.knob.ui.challenge.ChallengeViewModel;
import defpackage.EYWI9RMqk13H5;
import defpackage.NIabVTHf6LMJyXq;
import defpackage.b;
import defpackage.g;
import defpackage.h;
import defpackage.pu0JZhzR2Or6;
import defpackage.wN5ohFcBOzLLfqV;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/door/brass/knob/ui/challenge/ChallengeUiState;", "uiState", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChallengeScreenKt {
    public static final void hRNgd2zGCE5kj(ChallengeEntity challengeEntity, Function0 function0, Function0 function02, Composer composer, int i) {
        Function0 function03;
        Function0 function04;
        Composer composer2;
        int i2;
        float f;
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(-471006350);
        int i3 = (BD2CRjLJ8EtOqGQ.zgejW39NNp2D(challengeEntity) ? 4 : 2) | i | (BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(function0) ? 32 : 16) | (BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(function02) ? 256 : 128);
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i3 & 1, (i3 & 147) != 146)) {
            FillElement fillElement = SizeKt.yzPsTade5rL7D3;
            Modifier gmXBnHsR2YSm = PaddingKt.gmXBnHsR2YSm(ScrollKt.hRNgd2zGCE5kj(fillElement, ScrollKt.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ), true), 16.0f);
            ColumnMeasurePolicy yzPsTade5rL7D3 = ColumnKt.yzPsTade5rL7D3(Arrangement.ra306ClFT3HT, Alignment.Companion.uypNJrpDByoB, BD2CRjLJ8EtOqGQ, 0);
            int hashCode = Long.hashCode(BD2CRjLJ8EtOqGQ.getOyjLVtGms9eZwJ0());
            PersistentCompositionLocalMap FTJ2XS7ULgY8 = BD2CRjLJ8EtOqGQ.FTJ2XS7ULgY8();
            Modifier oyjLVtGms9eZwJ0 = ComposedModifierKt.oyjLVtGms9eZwJ0(BD2CRjLJ8EtOqGQ, gmXBnHsR2YSm);
            ComposeUiNode.hRNgd2zGCE5kj.getClass();
            Function0 function05 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
            if (BD2CRjLJ8EtOqGQ.PyXrjLswZZoWpho() == null) {
                ComposablesKt.yzPsTade5rL7D3();
                throw null;
            }
            BD2CRjLJ8EtOqGQ.tp5sG1Fy0ZCmW();
            if (BD2CRjLJ8EtOqGQ.getEYWI9RMqk13H5()) {
                BD2CRjLJ8EtOqGQ.EYWI9RMqk13H5(function05);
            } else {
                BD2CRjLJ8EtOqGQ.AGl7HBCQ8xrHABq();
            }
            Function2 function2 = ComposeUiNode.Companion.gmXBnHsR2YSm;
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, yzPsTade5rL7D3, function2);
            Function2 function22 = ComposeUiNode.Companion.b41X89IqSbKt;
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, FTJ2XS7ULgY8, function22);
            Integer valueOf = Integer.valueOf(hashCode);
            Function2 function23 = ComposeUiNode.Companion.i7xAcZoXXiIt;
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, valueOf, function23);
            Function1 function1 = ComposeUiNode.Companion.Uo5pffGf8LUU;
            Updater.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, function1);
            Function2 function24 = ComposeUiNode.Companion.oyjLVtGms9eZwJ0;
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, oyjLVtGms9eZwJ0, function24);
            RowMeasurePolicy yzPsTade5rL7D32 = RowKt.yzPsTade5rL7D3(Arrangement.b41X89IqSbKt, Alignment.Companion.MRfxZSx8l5UG62U, BD2CRjLJ8EtOqGQ, 54);
            int hashCode2 = Long.hashCode(BD2CRjLJ8EtOqGQ.getOyjLVtGms9eZwJ0());
            PersistentCompositionLocalMap FTJ2XS7ULgY82 = BD2CRjLJ8EtOqGQ.FTJ2XS7ULgY8();
            Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(BD2CRjLJ8EtOqGQ, fillElement);
            if (BD2CRjLJ8EtOqGQ.PyXrjLswZZoWpho() == null) {
                ComposablesKt.yzPsTade5rL7D3();
                throw null;
            }
            BD2CRjLJ8EtOqGQ.tp5sG1Fy0ZCmW();
            if (BD2CRjLJ8EtOqGQ.getEYWI9RMqk13H5()) {
                BD2CRjLJ8EtOqGQ.EYWI9RMqk13H5(function05);
            } else {
                BD2CRjLJ8EtOqGQ.AGl7HBCQ8xrHABq();
            }
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, yzPsTade5rL7D32, function2);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, FTJ2XS7ULgY82, function22);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, Integer.valueOf(hashCode2), function23);
            Updater.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, function1);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, oyjLVtGms9eZwJ02, function24);
            TextKt.hRNgd2zGCE5kj("Challenge Detail", null, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ).i7xAcZoXXiIt, BD2CRjLJ8EtOqGQ, 6, 0, 131066);
            int i4 = 0;
            IconButtonKt.yzPsTade5rL7D3(function0, null, false, null, null, ComposableSingletons$ChallengeScreenKt.ra306ClFT3HT, BD2CRjLJ8EtOqGQ, ((i3 >> 3) & 14) | 1572864, 62);
            BD2CRjLJ8EtOqGQ.GDGFDp2lxiHY();
            Modifier.Companion companion = Modifier.Companion.oyjLVtGms9eZwJ0;
            SpacerKt.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, SizeKt.ra306ClFT3HT(companion, 12.0f));
            String str = challengeEntity.hRNgd2zGCE5kj;
            int i5 = challengeEntity.gmXBnHsR2YSm;
            int i6 = challengeEntity.b41X89IqSbKt;
            boolean z = challengeEntity.i7xAcZoXXiIt;
            TextKt.hRNgd2zGCE5kj(str, null, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ).Uo5pffGf8LUU, BD2CRjLJ8EtOqGQ, 0, 0, 131066);
            SpacerKt.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, SizeKt.ra306ClFT3HT(companion, 8.0f));
            Object UEutaskTsxaI = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.yzPsTade5rL7D3;
            if (UEutaskTsxaI == composer$Companion$Empty$1) {
                UEutaskTsxaI = new pu0JZhzR2Or6(11);
                BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI);
            }
            ComposableLambdaImpl hRNgd2zGCE5kj = ComposableLambdaKt.hRNgd2zGCE5kj(-2019471879, new g(challengeEntity, i4), BD2CRjLJ8EtOqGQ);
            float f2 = AssistChipDefaults.yzPsTade5rL7D3;
            ChipKt.hRNgd2zGCE5kj((Function0) UEutaskTsxaI, hRNgd2zGCE5kj, null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).kSPEzfraxudm4i, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).uypNJrpDByoB, BD2CRjLJ8EtOqGQ), null, null, BD2CRjLJ8EtOqGQ, 54);
            SpacerKt.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, SizeKt.ra306ClFT3HT(companion, 12.0f));
            TextKt.hRNgd2zGCE5kj(challengeEntity.ra306ClFT3HT, null, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ).MRfxZSx8l5UG62U, BD2CRjLJ8EtOqGQ, 0, 0, 131066);
            SpacerKt.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, SizeKt.ra306ClFT3HT(companion, 16.0f));
            if (i6 > 0) {
                i2 = i5;
                f = i2 / i6;
            } else {
                i2 = i5;
                f = 0.0f;
            }
            boolean MRfxZSx8l5UG62U = BD2CRjLJ8EtOqGQ.MRfxZSx8l5UG62U(f);
            Object UEutaskTsxaI2 = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
            if (MRfxZSx8l5UG62U || UEutaskTsxaI2 == composer$Companion$Empty$1) {
                UEutaskTsxaI2 = new h(f, 0);
                BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI2);
            }
            ProgressIndicatorKt.hRNgd2zGCE5kj((Function0) UEutaskTsxaI2, fillElement, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).yzPsTade5rL7D3, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).MCcLy95b8Awzmw, 0, 0.0f, null, BD2CRjLJ8EtOqGQ, 48);
            SpacerKt.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, SizeKt.ra306ClFT3HT(companion, 6.0f));
            TextKt.hRNgd2zGCE5kj("Progress: " + i2 + " of " + i6, null, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ).kSPEzfraxudm4i, BD2CRjLJ8EtOqGQ, 0, 0, 131066);
            TextKt.hRNgd2zGCE5kj(z ? "Status: Completed" : "Status: In Progress", null, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ).kSPEzfraxudm4i, BD2CRjLJ8EtOqGQ, 0, 0, 131066);
            if (z) {
                BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(-1720609338);
                BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
            } else {
                BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(-1720917819);
                SpacerKt.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, SizeKt.ra306ClFT3HT(companion, 8.0f));
                TextKt.hRNgd2zGCE5kj("Open matching menu items from the Menu tab to progress this challenge.", null, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ).MRfxZSx8l5UG62U, BD2CRjLJ8EtOqGQ, 6, 0, 131066);
                BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
            }
            SpacerKt.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, SizeKt.ra306ClFT3HT(companion, 24.0f));
            composer2 = BD2CRjLJ8EtOqGQ;
            function04 = function02;
            function03 = function0;
            ButtonKt.hRNgd2zGCE5kj(function04, fillElement, !z, null, null, null, null, composer2, ((i3 >> 6) & 14) | 805306416);
            composer2.GDGFDp2lxiHY();
        } else {
            function03 = function0;
            function04 = function02;
            composer2 = BD2CRjLJ8EtOqGQ;
            composer2.gmXBnHsR2YSm();
        }
        ScopeUpdateScope AwgywP6bDNsW = composer2.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new NIabVTHf6LMJyXq(challengeEntity, function03, function04, i));
        }
    }

    public static final void ra306ClFT3HT(ChallengeViewModel challengeViewModel, Composer composer, int i) {
        int i2;
        final ChallengeViewModel challengeViewModel2;
        Object obj;
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(-365809978);
        int i3 = i | 2;
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i3 & 1, (i3 & 3) != 2)) {
            BD2CRjLJ8EtOqGQ.uY26rxeEAFnDq();
            if ((i & 1) == 0 || BD2CRjLJ8EtOqGQ.exVmIuryuB8HeQ()) {
                ViewModelStoreOwner yzPsTade5rL7D3 = LocalViewModelStoreOwner.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ);
                if (yzPsTade5rL7D3 == null) {
                    defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                challengeViewModel2 = (ChallengeViewModel) ViewModelKt.yzPsTade5rL7D3(Reflection.yzPsTade5rL7D3(ChallengeViewModel.class), yzPsTade5rL7D3, HiltViewModelKt.yzPsTade5rL7D3(ViewModelStoreOwnerDefaults.hRNgd2zGCE5kj(yzPsTade5rL7D3), BD2CRjLJ8EtOqGQ), ViewModelStoreOwnerDefaults.yzPsTade5rL7D3(yzPsTade5rL7D3), BD2CRjLJ8EtOqGQ);
            } else {
                BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
                challengeViewModel2 = challengeViewModel;
            }
            BD2CRjLJ8EtOqGQ.K6HLhdE38aTVLa();
            final MutableState hRNgd2zGCE5kj = SnapshotStateKt.hRNgd2zGCE5kj(challengeViewModel2.oyjLVtGms9eZwJ0, BD2CRjLJ8EtOqGQ);
            final List Yey4RyhSyBRHub = CollectionsKt.Yey4RyhSyBRHub("All", "In Progress", "Completed");
            final List Yey4RyhSyBRHub2 = CollectionsKt.Yey4RyhSyBRHub("Variety Explorer", "Signature Sweets", "Frequent Visits", "Seasonal Specials");
            int indexOf = Yey4RyhSyBRHub.indexOf(((ChallengeUiState) hRNgd2zGCE5kj.getOyjLVtGms9eZwJ0()).ra306ClFT3HT);
            final int i4 = indexOf < 0 ? 0 : indexOf;
            Iterator it = ((ChallengeUiState) hRNgd2zGCE5kj.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long j = ((ChallengeEntity) obj).yzPsTade5rL7D3;
                Long l = ((ChallengeUiState) hRNgd2zGCE5kj.getOyjLVtGms9eZwJ0()).b41X89IqSbKt;
                if (l != null && j == l.longValue()) {
                    break;
                }
            }
            final ChallengeEntity challengeEntity = (ChallengeEntity) obj;
            challengeViewModel = challengeViewModel2;
            i2 = 2;
            ScaffoldKt.yzPsTade5rL7D3(null, ComposableSingletons$ChallengeScreenKt.hRNgd2zGCE5kj, null, null, null, 0, 0L, 0L, WindowInsetsKt.yzPsTade5rL7D3(0, 14), ComposableLambdaKt.hRNgd2zGCE5kj(1554526295, new Function3() { // from class: i
                @Override // kotlin.jvm.functions.Function3
                public final Object MRfxZSx8l5UG62U(Object obj2, Object obj3, Object obj4) {
                    final ChallengeViewModel challengeViewModel3;
                    String str;
                    Modifier ra306ClFT3HT;
                    Object obj5;
                    Modifier ra306ClFT3HT2;
                    PaddingValues paddingValues = (PaddingValues) obj2;
                    Composer composer2 = (Composer) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    paddingValues.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= composer2.zgejW39NNp2D(paddingValues) ? 4 : 2;
                    }
                    if (composer2.ZvpnNpCMEWSR3(intValue & 1, (intValue & 19) != 18)) {
                        FillElement fillElement = SizeKt.ra306ClFT3HT;
                        Modifier b41X89IqSbKt = PaddingKt.b41X89IqSbKt(fillElement, paddingValues);
                        MeasurePolicy oyjLVtGms9eZwJ0 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.yzPsTade5rL7D3, false);
                        int hashCode = Long.hashCode(composer2.getOyjLVtGms9eZwJ0());
                        PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer2.FTJ2XS7ULgY8();
                        Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer2, b41X89IqSbKt);
                        ComposeUiNode.hRNgd2zGCE5kj.getClass();
                        Function0 function0 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
                        if (composer2.PyXrjLswZZoWpho() == null) {
                            ComposablesKt.yzPsTade5rL7D3();
                            throw null;
                        }
                        composer2.tp5sG1Fy0ZCmW();
                        if (composer2.getEYWI9RMqk13H5()) {
                            composer2.EYWI9RMqk13H5(function0);
                        } else {
                            composer2.AGl7HBCQ8xrHABq();
                        }
                        Function2 function2 = ComposeUiNode.Companion.gmXBnHsR2YSm;
                        Updater.hRNgd2zGCE5kj(composer2, oyjLVtGms9eZwJ0, function2);
                        Function2 function22 = ComposeUiNode.Companion.b41X89IqSbKt;
                        Updater.hRNgd2zGCE5kj(composer2, FTJ2XS7ULgY8, function22);
                        Integer valueOf = Integer.valueOf(hashCode);
                        Function2 function23 = ComposeUiNode.Companion.i7xAcZoXXiIt;
                        Updater.hRNgd2zGCE5kj(composer2, valueOf, function23);
                        Function1 function1 = ComposeUiNode.Companion.Uo5pffGf8LUU;
                        Updater.yzPsTade5rL7D3(composer2, function1);
                        Function2 function24 = ComposeUiNode.Companion.oyjLVtGms9eZwJ0;
                        Updater.hRNgd2zGCE5kj(composer2, oyjLVtGms9eZwJ02, function24);
                        ColumnMeasurePolicy yzPsTade5rL7D32 = ColumnKt.yzPsTade5rL7D3(Arrangement.ra306ClFT3HT, Alignment.Companion.uypNJrpDByoB, composer2, 0);
                        int hashCode2 = Long.hashCode(composer2.getOyjLVtGms9eZwJ0());
                        PersistentCompositionLocalMap FTJ2XS7ULgY82 = composer2.FTJ2XS7ULgY8();
                        Modifier oyjLVtGms9eZwJ03 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer2, fillElement);
                        if (composer2.PyXrjLswZZoWpho() == null) {
                            ComposablesKt.yzPsTade5rL7D3();
                            throw null;
                        }
                        composer2.tp5sG1Fy0ZCmW();
                        if (composer2.getEYWI9RMqk13H5()) {
                            composer2.EYWI9RMqk13H5(function0);
                        } else {
                            composer2.AGl7HBCQ8xrHABq();
                        }
                        Updater.hRNgd2zGCE5kj(composer2, yzPsTade5rL7D32, function2);
                        Updater.hRNgd2zGCE5kj(composer2, FTJ2XS7ULgY82, function22);
                        Updater.hRNgd2zGCE5kj(composer2, Integer.valueOf(hashCode2), function23);
                        Updater.yzPsTade5rL7D3(composer2, function1);
                        Updater.hRNgd2zGCE5kj(composer2, oyjLVtGms9eZwJ03, function24);
                        List list = Yey4RyhSyBRHub;
                        int i5 = i4;
                        ChallengeViewModel challengeViewModel4 = challengeViewModel2;
                        TabRowKt.yzPsTade5rL7D3(i5, null, 0L, 0L, null, null, ComposableLambdaKt.hRNgd2zGCE5kj(-1354728213, new j(list, i5, challengeViewModel4, 0), composer2), composer2, 1572864);
                        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 8.0f, 16.0f, 8.0f);
                        Arrangement.SpacedAligned i7xAcZoXXiIt = Arrangement.i7xAcZoXXiIt(8.0f);
                        MutableState mutableState = hRNgd2zGCE5kj;
                        boolean zgejW39NNp2D = composer2.zgejW39NNp2D(mutableState) | composer2.NIabVTHf6LMJyXq(challengeViewModel4);
                        Object UEutaskTsxaI = composer2.UEutaskTsxaI();
                        Object obj6 = Composer.Companion.yzPsTade5rL7D3;
                        if (zgejW39NNp2D || UEutaskTsxaI == obj6) {
                            UEutaskTsxaI = new yRx9jbDCTnXb3(Yey4RyhSyBRHub2, challengeViewModel4, mutableState, 7);
                            composer2.Yey4RyhSyBRHub(UEutaskTsxaI);
                        }
                        LazyDslKt.hRNgd2zGCE5kj(null, null, paddingValuesImpl, i7xAcZoXXiIt, null, null, false, null, (Function1) UEutaskTsxaI, composer2, 24960, 491);
                        if (((ChallengeUiState) mutableState.getOyjLVtGms9eZwJ0()).hRNgd2zGCE5kj.isEmpty()) {
                            composer2.mFNFvFv0Eiyk(-1137404305);
                            ra306ClFT3HT2 = ColumnScopeInstance.yzPsTade5rL7D3.ra306ClFT3HT(true);
                            Modifier yzUZju8lbdmWa = ra306ClFT3HT2.yzUZju8lbdmWa(SizeKt.yzPsTade5rL7D3);
                            MeasurePolicy oyjLVtGms9eZwJ04 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.b41X89IqSbKt, false);
                            int hashCode3 = Long.hashCode(composer2.getOyjLVtGms9eZwJ0());
                            PersistentCompositionLocalMap FTJ2XS7ULgY83 = composer2.FTJ2XS7ULgY8();
                            Modifier oyjLVtGms9eZwJ05 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer2, yzUZju8lbdmWa);
                            if (composer2.PyXrjLswZZoWpho() == null) {
                                ComposablesKt.yzPsTade5rL7D3();
                                throw null;
                            }
                            composer2.tp5sG1Fy0ZCmW();
                            if (composer2.getEYWI9RMqk13H5()) {
                                composer2.EYWI9RMqk13H5(function0);
                            } else {
                                composer2.AGl7HBCQ8xrHABq();
                            }
                            Updater.hRNgd2zGCE5kj(composer2, oyjLVtGms9eZwJ04, function2);
                            Updater.hRNgd2zGCE5kj(composer2, FTJ2XS7ULgY83, function22);
                            Updater.hRNgd2zGCE5kj(composer2, Integer.valueOf(hashCode3), function23);
                            Updater.yzPsTade5rL7D3(composer2, function1);
                            Updater.hRNgd2zGCE5kj(composer2, oyjLVtGms9eZwJ05, function24);
                            challengeViewModel3 = challengeViewModel4;
                            TextKt.hRNgd2zGCE5kj("No challenges found", null, MaterialTheme.yzPsTade5rL7D3(composer2).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer2).UEutaskTsxaI, composer2, 6, 0, 131066);
                            composer2 = composer2;
                            composer2.GDGFDp2lxiHY();
                            composer2.o4ticBN7g1K8jE();
                            obj5 = obj6;
                            str = null;
                        } else {
                            challengeViewModel3 = challengeViewModel4;
                            str = null;
                            composer2.mFNFvFv0Eiyk(-1136852877);
                            ra306ClFT3HT = ColumnScopeInstance.yzPsTade5rL7D3.ra306ClFT3HT(true);
                            Modifier yzUZju8lbdmWa2 = ra306ClFT3HT.yzUZju8lbdmWa(SizeKt.yzPsTade5rL7D3);
                            PaddingValuesImpl paddingValuesImpl2 = new PaddingValuesImpl(16.0f, 16.0f, 16.0f, 16.0f);
                            Arrangement.SpacedAligned i7xAcZoXXiIt2 = Arrangement.i7xAcZoXXiIt(12.0f);
                            boolean zgejW39NNp2D2 = composer2.zgejW39NNp2D(mutableState) | composer2.NIabVTHf6LMJyXq(challengeViewModel3);
                            Object UEutaskTsxaI2 = composer2.UEutaskTsxaI();
                            obj5 = obj6;
                            if (zgejW39NNp2D2 || UEutaskTsxaI2 == obj5) {
                                UEutaskTsxaI2 = new ra306ClFT3HT(10, mutableState, challengeViewModel3);
                                composer2.Yey4RyhSyBRHub(UEutaskTsxaI2);
                            }
                            LazyDslKt.yzPsTade5rL7D3(yzUZju8lbdmWa2, null, paddingValuesImpl2, i7xAcZoXXiIt2, null, null, false, null, (Function1) UEutaskTsxaI2, composer2, 24960, 490);
                            composer2.o4ticBN7g1K8jE();
                        }
                        composer2.GDGFDp2lxiHY();
                        final ChallengeEntity challengeEntity2 = ChallengeEntity.this;
                        if (challengeEntity2 != null) {
                            composer2.mFNFvFv0Eiyk(1210547003);
                            boolean NIabVTHf6LMJyXq = composer2.NIabVTHf6LMJyXq(challengeViewModel3);
                            Object UEutaskTsxaI3 = composer2.UEutaskTsxaI();
                            if (NIabVTHf6LMJyXq || UEutaskTsxaI3 == obj5) {
                                UEutaskTsxaI3 = new uY26rxeEAFnDq(6, challengeViewModel3);
                                composer2.Yey4RyhSyBRHub(UEutaskTsxaI3);
                            }
                            BoxKt.yzPsTade5rL7D3(ClickableKt.oyjLVtGms9eZwJ0(fillElement, false, str, (Function0) UEutaskTsxaI3, 15), composer2, 0);
                            Composer composer3 = composer2;
                            SurfaceKt.yzPsTade5rL7D3(BoxScopeInstance.yzPsTade5rL7D3.yzPsTade5rL7D3(SizeKt.NIabVTHf6LMJyXq(SizeKt.hRNgd2zGCE5kj, 320.0f), Alignment.Companion.gmXBnHsR2YSm), null, MaterialTheme.yzPsTade5rL7D3(composer2).GiTAvmtrM6Bh8SJ, 0L, 4.0f, 8.0f, null, ComposableLambdaKt.hRNgd2zGCE5kj(-617124845, new Function2() { // from class: com.door.brass.knob.ui.challenge.yzPsTade5rL7D3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object kSPEzfraxudm4i(Object obj7, Object obj8) {
                                    Composer composer4 = (Composer) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    if (composer4.ZvpnNpCMEWSR3(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        final ChallengeViewModel challengeViewModel5 = challengeViewModel3;
                                        boolean NIabVTHf6LMJyXq2 = composer4.NIabVTHf6LMJyXq(challengeViewModel5);
                                        Object UEutaskTsxaI4 = composer4.UEutaskTsxaI();
                                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.yzPsTade5rL7D3;
                                        if (NIabVTHf6LMJyXq2 || UEutaskTsxaI4 == composer$Companion$Empty$1) {
                                            ChallengeScreenKt$ChallengeScreen$1$1$3$1$1 challengeScreenKt$ChallengeScreen$1$1$3$1$1 = new ChallengeScreenKt$ChallengeScreen$1$1$3$1$1(0, challengeViewModel5, ChallengeViewModel.class, "hideChallengeDetail", "hideChallengeDetail()V", 0);
                                            composer4.Yey4RyhSyBRHub(challengeScreenKt$ChallengeScreen$1$1$3$1$1);
                                            UEutaskTsxaI4 = challengeScreenKt$ChallengeScreen$1$1$3$1$1;
                                        }
                                        Function0 function02 = (Function0) ((KFunction) UEutaskTsxaI4);
                                        boolean NIabVTHf6LMJyXq3 = composer4.NIabVTHf6LMJyXq(challengeViewModel5);
                                        final ChallengeEntity challengeEntity3 = ChallengeEntity.this;
                                        boolean zgejW39NNp2D3 = NIabVTHf6LMJyXq3 | composer4.zgejW39NNp2D(challengeEntity3);
                                        Object UEutaskTsxaI5 = composer4.UEutaskTsxaI();
                                        if (zgejW39NNp2D3 || UEutaskTsxaI5 == composer$Companion$Empty$1) {
                                            UEutaskTsxaI5 = new Function0() { // from class: com.door.brass.knob.ui.challenge.hRNgd2zGCE5kj
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object hRNgd2zGCE5kj() {
                                                    long j2 = challengeEntity3.yzPsTade5rL7D3;
                                                    ChallengeViewModel challengeViewModel6 = challengeViewModel5;
                                                    if (!((ChallengeUiState) challengeViewModel6.ra306ClFT3HT.getValue()).gmXBnHsR2YSm) {
                                                        CloseableCoroutineScope yzPsTade5rL7D33 = androidx.lifecycle.ViewModelKt.yzPsTade5rL7D3(challengeViewModel6);
                                                        DefaultScheduler defaultScheduler = Dispatchers.yzPsTade5rL7D3;
                                                        BuildersKt.ra306ClFT3HT(yzPsTade5rL7D33, DefaultIoScheduler.gmXBnHsR2YSm, null, new ChallengeViewModel$markComplete$1(challengeViewModel6, j2, null), 2);
                                                    }
                                                    return Unit.yzPsTade5rL7D3;
                                                }
                                            };
                                            composer4.Yey4RyhSyBRHub(UEutaskTsxaI5);
                                        }
                                        ChallengeScreenKt.hRNgd2zGCE5kj(challengeEntity3, function02, (Function0) UEutaskTsxaI5, composer4, 0);
                                    } else {
                                        composer4.gmXBnHsR2YSm();
                                    }
                                    return Unit.yzPsTade5rL7D3;
                                }
                            }, composer2), composer3, 12804096, 74);
                            composer2 = composer3;
                            composer2.o4ticBN7g1K8jE();
                        } else {
                            composer2.mFNFvFv0Eiyk(1211417669);
                            composer2.o4ticBN7g1K8jE();
                        }
                        composer2.GDGFDp2lxiHY();
                    } else {
                        composer2.gmXBnHsR2YSm();
                    }
                    return Unit.yzPsTade5rL7D3;
                }
            }, BD2CRjLJ8EtOqGQ), BD2CRjLJ8EtOqGQ, 805306416, 253);
        } else {
            i2 = 2;
            BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
        }
        ChallengeViewModel challengeViewModel3 = challengeViewModel;
        ScopeUpdateScope AwgywP6bDNsW = BD2CRjLJ8EtOqGQ.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new EYWI9RMqk13H5(i, i2, challengeViewModel3));
        }
    }

    public static final void yzPsTade5rL7D3(ChallengeEntity challengeEntity, Function0 function0, Composer composer, int i) {
        RoundedCornerShape roundedCornerShape;
        int i2;
        long j;
        CardColors cardColors;
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(-1516384755);
        int i3 = (BD2CRjLJ8EtOqGQ.zgejW39NNp2D(challengeEntity) ? 4 : 2) | i | (BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(function0) ? 32 : 16);
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i3 & 1, (i3 & 19) != 18)) {
            RoundedCornerShape yzPsTade5rL7D3 = RoundedCornerShapeKt.yzPsTade5rL7D3(12.0f);
            long j2 = MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).MCcLy95b8Awzmw;
            long hRNgd2zGCE5kj = ColorSchemeKt.hRNgd2zGCE5kj(j2, BD2CRjLJ8EtOqGQ);
            long j3 = Color.i7xAcZoXXiIt;
            long hRNgd2zGCE5kj2 = Color.hRNgd2zGCE5kj(0.38f, hRNgd2zGCE5kj);
            ColorScheme yzPsTade5rL7D32 = MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ);
            CardColors cardColors2 = yzPsTade5rL7D32.o3OPt85Nfb1a71n;
            if (cardColors2 == null) {
                ColorSchemeKeyTokens colorSchemeKeyTokens = ElevatedCardTokens.yzPsTade5rL7D3;
                long ra306ClFT3HT = ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens);
                i2 = 1;
                long yzPsTade5rL7D33 = ColorSchemeKt.yzPsTade5rL7D3(yzPsTade5rL7D32, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens));
                ColorSchemeKeyTokens colorSchemeKeyTokens2 = ElevatedCardTokens.ra306ClFT3HT;
                roundedCornerShape = yzPsTade5rL7D3;
                CardColors cardColors3 = new CardColors(ra306ClFT3HT, yzPsTade5rL7D33, ColorKt.i7xAcZoXXiIt(Color.hRNgd2zGCE5kj(ElevatedCardTokens.b41X89IqSbKt, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens2)), ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens2)), Color.hRNgd2zGCE5kj(0.38f, ColorSchemeKt.yzPsTade5rL7D3(yzPsTade5rL7D32, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens))));
                yzPsTade5rL7D32.o3OPt85Nfb1a71n = cardColors3;
                j2 = j2;
                cardColors = cardColors3;
                j = hRNgd2zGCE5kj;
            } else {
                roundedCornerShape = yzPsTade5rL7D3;
                i2 = 1;
                j = hRNgd2zGCE5kj;
                cardColors = cardColors2;
            }
            CardKt.hRNgd2zGCE5kj(function0, SizeKt.yzPsTade5rL7D3, false, roundedCornerShape, cardColors.yzPsTade5rL7D3(j2, j, j3, hRNgd2zGCE5kj2), new CardElevation((62 & 1) != 0 ? ElevatedCardTokens.hRNgd2zGCE5kj : 4.0f, ElevatedCardTokens.FsuUJlzzWhYnMlD, ElevatedCardTokens.i7xAcZoXXiIt, ElevatedCardTokens.Uo5pffGf8LUU, ElevatedCardTokens.gmXBnHsR2YSm, ElevatedCardTokens.oyjLVtGms9eZwJ0), ComposableLambdaKt.hRNgd2zGCE5kj(662165707, new b(i2, function0, challengeEntity), BD2CRjLJ8EtOqGQ), BD2CRjLJ8EtOqGQ, ((i3 >> 3) & 14) | 12582960);
        } else {
            BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
        }
        ScopeUpdateScope AwgywP6bDNsW = BD2CRjLJ8EtOqGQ.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new wN5ohFcBOzLLfqV(challengeEntity, function0, i, 1));
        }
    }
}
