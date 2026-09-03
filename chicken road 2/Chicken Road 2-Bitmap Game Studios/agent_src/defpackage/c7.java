package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.filled.CloudOffKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import com.door.brass.knob.R;
import com.door.brass.knob.ui.splash.ComposableSingletons$SplashScreenKt;
import com.door.brass.knob.ui.splash.SplashError;
import com.door.brass.knob.ui.splash.SplashScreenKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class c7 implements Function2 {
    public final /* synthetic */ SplashError b41X89IqSbKt;
    public final /* synthetic */ Function0 gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ c7(SplashError splashError, Function0 function0) {
        this.b41X89IqSbKt = splashError;
        this.gmXBnHsR2YSm = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i;
        int i2 = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        SplashError splashError = this.b41X89IqSbKt;
        switch (i2) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 3) != 2)) {
                    composer.gmXBnHsR2YSm();
                    return unit;
                }
                Modifier.Companion companion = Modifier.Companion.oyjLVtGms9eZwJ0;
                Modifier i7xAcZoXXiIt = PaddingKt.i7xAcZoXXiIt(companion, 24.0f, 32.0f);
                ColumnMeasurePolicy yzPsTade5rL7D3 = ColumnKt.yzPsTade5rL7D3(Arrangement.ra306ClFT3HT, Alignment.Companion.yRx9jbDCTnXb3, composer, 48);
                int hashCode = Long.hashCode(composer.getOyjLVtGms9eZwJ0());
                PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer.FTJ2XS7ULgY8();
                Modifier oyjLVtGms9eZwJ0 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer, i7xAcZoXXiIt);
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
                Updater.hRNgd2zGCE5kj(composer, yzPsTade5rL7D3, ComposeUiNode.Companion.gmXBnHsR2YSm);
                Updater.hRNgd2zGCE5kj(composer, FTJ2XS7ULgY8, ComposeUiNode.Companion.b41X89IqSbKt);
                Updater.hRNgd2zGCE5kj(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.i7xAcZoXXiIt);
                Updater.yzPsTade5rL7D3(composer, ComposeUiNode.Companion.Uo5pffGf8LUU);
                Updater.hRNgd2zGCE5kj(composer, oyjLVtGms9eZwJ0, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
                ImageVector imageVector = CloudOffKt.yzPsTade5rL7D3;
                if (imageVector == null) {
                    ImageVector.Builder builder = new ImageVector.Builder("Filled.CloudOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i3 = VectorKt.yzPsTade5rL7D3;
                    SolidColor solidColor = new SolidColor(Color.hRNgd2zGCE5kj);
                    PathBuilder pathBuilder = new PathBuilder();
                    pathBuilder.Uo5pffGf8LUU(19.35f, 10.04f);
                    pathBuilder.hRNgd2zGCE5kj(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
                    pathBuilder.ra306ClFT3HT(-1.48f, 0.0f, -2.85f, 0.43f, -4.01f, 1.17f);
                    pathBuilder.i7xAcZoXXiIt(1.46f, 1.46f);
                    pathBuilder.hRNgd2zGCE5kj(10.21f, 6.23f, 11.08f, 6.0f, 12.0f, 6.0f);
                    pathBuilder.ra306ClFT3HT(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
                    pathBuilder.MRfxZSx8l5UG62U(0.5f);
                    pathBuilder.oyjLVtGms9eZwJ0(19.0f);
                    pathBuilder.ra306ClFT3HT(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
                    pathBuilder.ra306ClFT3HT(0.0f, 1.13f, -0.64f, 2.11f, -1.56f, 2.62f);
                    pathBuilder.i7xAcZoXXiIt(1.45f, 1.45f);
                    pathBuilder.hRNgd2zGCE5kj(23.16f, 18.16f, 24.0f, 16.68f, 24.0f, 15.0f);
                    pathBuilder.ra306ClFT3HT(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
                    pathBuilder.yzPsTade5rL7D3();
                    pathBuilder.Uo5pffGf8LUU(3.0f, 5.27f);
                    pathBuilder.i7xAcZoXXiIt(2.75f, 2.74f);
                    pathBuilder.hRNgd2zGCE5kj(2.56f, 8.15f, 0.0f, 10.77f, 0.0f, 14.0f);
                    pathBuilder.ra306ClFT3HT(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
                    pathBuilder.b41X89IqSbKt(11.73f);
                    pathBuilder.i7xAcZoXXiIt(2.0f, 2.0f);
                    pathBuilder.gmXBnHsR2YSm(21.0f, 20.73f);
                    pathBuilder.gmXBnHsR2YSm(4.27f, 4.0f);
                    pathBuilder.gmXBnHsR2YSm(3.0f, 5.27f);
                    pathBuilder.yzPsTade5rL7D3();
                    pathBuilder.Uo5pffGf8LUU(7.73f, 10.0f);
                    pathBuilder.i7xAcZoXXiIt(8.0f, 8.0f);
                    pathBuilder.oyjLVtGms9eZwJ0(6.0f);
                    pathBuilder.ra306ClFT3HT(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
                    PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(1.79f, -4.0f, 4.0f, -4.0f);
                    ArrayList arrayList = pathBuilder.yzPsTade5rL7D3;
                    arrayList.add(relativeReflectiveCurveTo);
                    pathBuilder.b41X89IqSbKt(1.73f);
                    pathBuilder.yzPsTade5rL7D3();
                    builder.hRNgd2zGCE5kj(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", arrayList);
                    imageVector = builder.oyjLVtGms9eZwJ0();
                    CloudOffKt.yzPsTade5rL7D3 = imageVector;
                }
                IconKt.hRNgd2zGCE5kj(imageVector, null, SizeKt.UEutaskTsxaI(companion, 52.0f), MaterialTheme.yzPsTade5rL7D3(composer).yzPsTade5rL7D3, composer, 432, 0);
                TextKt.hRNgd2zGCE5kj(StringResources_androidKt.yzPsTade5rL7D3(R.string.splash_error_title, composer), PaddingKt.UEutaskTsxaI(companion, 0.0f, 20.0f, 0.0f, 0.0f, 13), MaterialTheme.yzPsTade5rL7D3(composer).o2t7oodqU1bUMaS, 0L, 0L, new TextAlign(3), 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer).i7xAcZoXXiIt, composer, 48, 0, 130040);
                int ordinal = splashError.ordinal();
                if (ordinal == 0) {
                    i = R.string.splash_error_no_connection;
                } else if (ordinal == 1) {
                    i = R.string.splash_error_timeout;
                } else {
                    if (ordinal != 2) {
                        h1.hRNgd2zGCE5kj();
                        return null;
                    }
                    i = R.string.splash_error_unexpected;
                }
                TextKt.hRNgd2zGCE5kj(StringResources_androidKt.yzPsTade5rL7D3(i, composer), PaddingKt.UEutaskTsxaI(companion, 0.0f, 12.0f, 0.0f, 0.0f, 13), MaterialTheme.yzPsTade5rL7D3(composer).FTJ2XS7ULgY8, 0L, 0L, new TextAlign(3), 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer).MRfxZSx8l5UG62U, composer, 48, 0, 130040);
                PaddingValuesImpl paddingValuesImpl = ButtonDefaults.yzPsTade5rL7D3;
                ButtonKt.yzPsTade5rL7D3(this.gmXBnHsR2YSm, PaddingKt.UEutaskTsxaI(companion, 0.0f, 28.0f, 0.0f, 0.0f, 13), false, null, ButtonDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer).yzPsTade5rL7D3, MaterialTheme.yzPsTade5rL7D3(composer).hRNgd2zGCE5kj, composer), null, null, null, ComposableSingletons$SplashScreenKt.yzPsTade5rL7D3, composer, 805306416, 492);
                composer.GDGFDp2lxiHY();
                return unit;
            default:
                ((Integer) obj2).getClass();
                SplashScreenKt.yzPsTade5rL7D3(splashError, this.gmXBnHsR2YSm, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
        }
    }

    public /* synthetic */ c7(SplashError splashError, Function0 function0, int i) {
        this.b41X89IqSbKt = splashError;
        this.gmXBnHsR2YSm = function0;
    }
}
