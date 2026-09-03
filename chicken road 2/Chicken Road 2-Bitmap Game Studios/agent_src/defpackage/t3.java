package defpackage;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import com.door.brass.knob.ui.menu.MenuUiState;
import com.door.brass.knob.ui.menu.MenuViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class t3 implements Function3 {
    public final /* synthetic */ List b41X89IqSbKt;
    public final /* synthetic */ MenuViewModel gmXBnHsR2YSm;
    public final /* synthetic */ MutableState i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ t3(List list, MenuViewModel menuViewModel, MutableState mutableState, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = list;
        this.gmXBnHsR2YSm = menuViewModel;
        this.i7xAcZoXXiIt = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj4 = Composer.Companion.yzPsTade5rL7D3;
        MutableState mutableState = this.i7xAcZoXXiIt;
        Object obj5 = this.gmXBnHsR2YSm;
        List<String> list = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 17) != 16)) {
                    for (String str : list) {
                        ComposableLambdaImpl hRNgd2zGCE5kj = ComposableLambdaKt.hRNgd2zGCE5kj(-1618936418, new f(str, 4), composer);
                        boolean NIabVTHf6LMJyXq = composer.NIabVTHf6LMJyXq(obj5) | composer.zgejW39NNp2D(str);
                        Object UEutaskTsxaI = composer.UEutaskTsxaI();
                        if (NIabVTHf6LMJyXq || UEutaskTsxaI == obj4) {
                            UEutaskTsxaI = new Ae8HxJ6tiidOhX(obj5, str, mutableState, 4);
                            composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                        }
                        AndroidMenu_androidKt.yzPsTade5rL7D3(hRNgd2zGCE5kj, (Function0) UEutaskTsxaI, null, false, null, null, composer, 6, 508);
                    }
                } else {
                    composer.gmXBnHsR2YSm();
                }
                return unit;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.ZvpnNpCMEWSR3(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier FsuUJlzzWhYnMlD = PaddingKt.FsuUJlzzWhYnMlD(ScrollKt.hRNgd2zGCE5kj(SizeKt.yzPsTade5rL7D3, ScrollKt.yzPsTade5rL7D3(composer2), true), 16.0f, 8.0f, 16.0f, 32.0f);
                    ColumnMeasurePolicy yzPsTade5rL7D3 = ColumnKt.yzPsTade5rL7D3(Arrangement.ra306ClFT3HT, Alignment.Companion.uypNJrpDByoB, composer2, 0);
                    int hashCode = Long.hashCode(composer2.getOyjLVtGms9eZwJ0());
                    PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer2.FTJ2XS7ULgY8();
                    Modifier oyjLVtGms9eZwJ0 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer2, FsuUJlzzWhYnMlD);
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
                    Updater.hRNgd2zGCE5kj(composer2, yzPsTade5rL7D3, ComposeUiNode.Companion.gmXBnHsR2YSm);
                    Updater.hRNgd2zGCE5kj(composer2, FTJ2XS7ULgY8, ComposeUiNode.Companion.b41X89IqSbKt);
                    Updater.hRNgd2zGCE5kj(composer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.i7xAcZoXXiIt);
                    Updater.yzPsTade5rL7D3(composer2, ComposeUiNode.Companion.Uo5pffGf8LUU);
                    Updater.hRNgd2zGCE5kj(composer2, oyjLVtGms9eZwJ0, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
                    TextKt.hRNgd2zGCE5kj("Sort by", null, MaterialTheme.yzPsTade5rL7D3(composer2).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer2).Uo5pffGf8LUU, composer2, 6, 0, 131066);
                    SpacerKt.yzPsTade5rL7D3(composer2, SizeKt.ra306ClFT3HT(Modifier.Companion.oyjLVtGms9eZwJ0, 8.0f));
                    composer2.mFNFvFv0Eiyk(1324064840);
                    for (String str2 : list) {
                        boolean equals = ((MenuUiState) mutableState.getOyjLVtGms9eZwJ0()).b41X89IqSbKt.equals(str2);
                        RoundedCornerShape yzPsTade5rL7D32 = RoundedCornerShapeKt.yzPsTade5rL7D3(12.0f);
                        if (equals) {
                            composer2.mFNFvFv0Eiyk(-778996790);
                            j = Color.hRNgd2zGCE5kj(0.2f, MaterialTheme.yzPsTade5rL7D3(composer2).yzPsTade5rL7D3);
                            composer2.o4ticBN7g1K8jE();
                        } else {
                            composer2.mFNFvFv0Eiyk(-778884291);
                            j = MaterialTheme.yzPsTade5rL7D3(composer2).GiTAvmtrM6Bh8SJ;
                            composer2.o4ticBN7g1K8jE();
                        }
                        long j2 = j;
                        float f = equals ? 2.0f : 0.0f;
                        Modifier Uo5pffGf8LUU = PaddingKt.Uo5pffGf8LUU(SizeKt.yzPsTade5rL7D3, 0.0f, 4.0f, 1);
                        boolean NIabVTHf6LMJyXq2 = composer2.NIabVTHf6LMJyXq(obj5) | composer2.zgejW39NNp2D(str2);
                        Object UEutaskTsxaI2 = composer2.UEutaskTsxaI();
                        if (NIabVTHf6LMJyXq2 || UEutaskTsxaI2 == obj4) {
                            UEutaskTsxaI2 = new VoAHKqpbZzH9eE(17, obj5, str2);
                            composer2.Yey4RyhSyBRHub(UEutaskTsxaI2);
                        }
                        SurfaceKt.hRNgd2zGCE5kj((Function0) UEutaskTsxaI2, Uo5pffGf8LUU, false, yzPsTade5rL7D32, j2, 0L, f, 0.0f, null, null, ComposableLambdaKt.hRNgd2zGCE5kj(2059399009, new f(str2, 3), composer2), composer2, 48, 932);
                    }
                    composer2.o4ticBN7g1K8jE();
                    composer2.GDGFDp2lxiHY();
                } else {
                    composer2.gmXBnHsR2YSm();
                }
                return unit;
        }
    }
}
