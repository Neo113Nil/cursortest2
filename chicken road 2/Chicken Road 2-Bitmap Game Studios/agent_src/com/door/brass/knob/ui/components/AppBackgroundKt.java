package com.door.brass.knob.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.door.brass.knob.R;
import com.door.brass.knob.ui.theme.ColorKt;
import defpackage.OcGJUxcOVecQiKb;
import defpackage.n2IngT64plxYCgL;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"app"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBackgroundKt {
    public static final void yzPsTade5rL7D3(int i, Composer composer) {
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(-173677013);
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i & 1, (i & 3) != 2)) {
            FillElement fillElement = SizeKt.ra306ClFT3HT;
            MeasurePolicy oyjLVtGms9eZwJ0 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.yzPsTade5rL7D3, false);
            int hashCode = Long.hashCode(BD2CRjLJ8EtOqGQ.getH5JgSr7BP0b5Z());
            PersistentCompositionLocalMap FTJ2XS7ULgY8 = BD2CRjLJ8EtOqGQ.FTJ2XS7ULgY8();
            Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(BD2CRjLJ8EtOqGQ, fillElement);
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
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, oyjLVtGms9eZwJ0, ComposeUiNode.Companion.gmXBnHsR2YSm);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, FTJ2XS7ULgY8, ComposeUiNode.Companion.b41X89IqSbKt);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, Integer.valueOf(hashCode), ComposeUiNode.Companion.i7xAcZoXXiIt);
            Updater.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ, ComposeUiNode.Companion.Uo5pffGf8LUU);
            Updater.hRNgd2zGCE5kj(BD2CRjLJ8EtOqGQ, oyjLVtGms9eZwJ02, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
            ImageKt.yzPsTade5rL7D3(PainterResources_androidKt.yzPsTade5rL7D3(R.drawable.background, BD2CRjLJ8EtOqGQ), fillElement, null, ContentScale.Companion.yzPsTade5rL7D3, 0.0f, BD2CRjLJ8EtOqGQ, 25016);
            Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{new Pair(Float.valueOf(0.0f), new Color(ColorKt.dKtTSxQHF2Mg8U)), new Pair(Float.valueOf(0.12f), new Color(ColorKt.vywRyEooKGLFsX)), new Pair(Float.valueOf(0.55f), new Color(ColorKt.vAthhQhzH5WQr3)), new Pair(Float.valueOf(1.0f), new Color(ColorKt.fZcu2pOOfz9l))}, 4);
            long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L);
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair pair : pairArr) {
                arrayList.add(new Color(((Color) pair.b41X89IqSbKt).yzPsTade5rL7D3));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair pair2 : pairArr) {
                arrayList2.add(Float.valueOf(((Number) pair2.oyjLVtGms9eZwJ0).floatValue()));
            }
            BoxKt.yzPsTade5rL7D3(BackgroundKt.yzPsTade5rL7D3(fillElement, new LinearGradient(arrayList, arrayList2, floatToRawIntBits, floatToRawIntBits2)), BD2CRjLJ8EtOqGQ, 6);
            CompositionLocalKt.yzPsTade5rL7D3(OcGJUxcOVecQiKb.b41X89IqSbKt(MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).o2t7oodqU1bUMaS, ContentColorKt.yzPsTade5rL7D3), ComposableLambdaKt.hRNgd2zGCE5kj(-11971035, new n2IngT64plxYCgL(0), BD2CRjLJ8EtOqGQ), BD2CRjLJ8EtOqGQ, 56);
            BD2CRjLJ8EtOqGQ.GDGFDp2lxiHY();
        } else {
            BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
        }
        ScopeUpdateScope AwgywP6bDNsW = BD2CRjLJ8EtOqGQ.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new n2IngT64plxYCgL(i, 1));
        }
    }
}
