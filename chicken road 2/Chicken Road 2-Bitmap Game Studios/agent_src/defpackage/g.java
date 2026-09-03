package defpackage;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ ChallengeEntity b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ g(ChallengeEntity challengeEntity, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = challengeEntity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        ChallengeEntity challengeEntity = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 3) != 2)) {
                    composer.gmXBnHsR2YSm();
                    break;
                } else {
                    TextKt.hRNgd2zGCE5kj(challengeEntity.oyjLVtGms9eZwJ0, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer, 0, 0, 262142);
                    break;
                }
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.ZvpnNpCMEWSR3(intValue2 & 1, (intValue2 & 3) != 2)) {
                    composer2.gmXBnHsR2YSm();
                    break;
                } else {
                    TextKt.hRNgd2zGCE5kj(challengeEntity.oyjLVtGms9eZwJ0, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer2, 0, 0, 262142);
                    break;
                }
        }
        return unit;
    }
}
