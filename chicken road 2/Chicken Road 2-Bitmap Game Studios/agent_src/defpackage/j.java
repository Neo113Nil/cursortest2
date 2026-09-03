package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import com.door.brass.knob.ui.challenge.ChallengeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Function2 {
    public final /* synthetic */ int b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ j(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, Object obj, int i2) {
        this.oyjLVtGms9eZwJ0 = 5;
        this.gmXBnHsR2YSm = pagerLazyLayoutItemProvider;
        this.b41X89IqSbKt = i;
        this.i7xAcZoXXiIt = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = 0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i3 = this.b41X89IqSbKt;
        Object obj3 = this.i7xAcZoXXiIt;
        Object obj4 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                List list = (List) obj4;
                Object obj5 = (ChallengeViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 3) != 2)) {
                    int i4 = 0;
                    for (Object obj6 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.H5JgSr7BP0b5Z();
                            throw null;
                        }
                        String str = (String) obj6;
                        boolean z = i3 == i4;
                        boolean NIabVTHf6LMJyXq = composer.NIabVTHf6LMJyXq(obj5) | composer.zgejW39NNp2D(str);
                        Object UEutaskTsxaI = composer.UEutaskTsxaI();
                        if (NIabVTHf6LMJyXq || UEutaskTsxaI == Composer.Companion.yzPsTade5rL7D3) {
                            UEutaskTsxaI = new VoAHKqpbZzH9eE(4, obj5, str);
                            composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                        }
                        TabKt.hRNgd2zGCE5kj(z, (Function0) UEutaskTsxaI, null, false, ComposableLambdaKt.hRNgd2zGCE5kj(-1388228041, new f(str, i2), composer), 0L, 0L, composer, 24576);
                        i4 = i5;
                    }
                } else {
                    composer.gmXBnHsR2YSm();
                }
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                ((ComposableLambdaImpl) obj4).gmXBnHsR2YSm(obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i3) | 1);
                return unit;
            case 2:
                ((Integer) obj2).intValue();
                CompositionLocalKt.yzPsTade5rL7D3((ProvidedValue) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i3 | 1));
                return unit;
            case 3:
                ((Integer) obj2).getClass();
                CompositionLocalKt.hRNgd2zGCE5kj((ProvidedValue[]) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i3 | 1));
                return unit;
            case 4:
                LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (composer2.ZvpnNpCMEWSR3(1 & intValue2, (intValue2 & 3) != 2)) {
                    lazyLayoutItemProvider.Uo5pffGf8LUU(i3, obj3, composer2, 0);
                } else {
                    composer2.gmXBnHsR2YSm();
                }
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ((Integer) obj2).getClass();
                ((PagerLazyLayoutItemProvider) obj4).Uo5pffGf8LUU(i3, obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ((Integer) obj2).getClass();
                TextKt.yzPsTade5rL7D3((TextStyle) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i3 | 1));
                return unit;
            default:
                ((Integer) obj2).intValue();
                ((Transition) obj4).yzPsTade5rL7D3(obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i3 | 1));
                return unit;
        }
    }

    public /* synthetic */ j(Object obj, int i, Object obj2, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.gmXBnHsR2YSm = obj;
        this.b41X89IqSbKt = i;
        this.i7xAcZoXXiIt = obj2;
    }

    public /* synthetic */ j(Object obj, Object obj2, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.gmXBnHsR2YSm = obj;
        this.i7xAcZoXXiIt = obj2;
        this.b41X89IqSbKt = i;
    }
}
