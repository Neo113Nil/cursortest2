package defpackage;

import android.content.Context;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.navigation.NavBackStackEntry;
import com.door.brass.knob.ui.challenge.ChallengeScreenKt;
import com.door.brass.knob.ui.tips.TipsScreenKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Function4 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    @Override // kotlin.jvm.functions.Function4
    public final Object o2t7oodqU1bUMaS(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i) {
            case 0:
                ((Integer) obj4).getClass();
                ((AnimatedContentScope) obj).getClass();
                ((NavBackStackEntry) obj2).getClass();
                ChallengeScreenKt.ra306ClFT3HT(null, (Composer) obj3, 0);
                return unit;
            case 1:
                ((Integer) obj4).getClass();
                ((AnimatedContentScope) obj).getClass();
                ((NavBackStackEntry) obj2).getClass();
                TipsScreenKt.hRNgd2zGCE5kj(null, (Composer) obj3, 0);
                return unit;
            default:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = PlatformSelectionBehaviors_androidKt.yzPsTade5rL7D3;
                return new PlatformSelectionBehaviorsImpl((CoroutineContext) obj, (Context) obj2, (SelectedTextType) obj3, (LocaleList) obj4);
        }
    }
}
