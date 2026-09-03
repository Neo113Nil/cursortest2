package defpackage;

import androidx.compose.animation.core.AnimationState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements Function0 {
    public final /* synthetic */ AnimationState b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ i7(int i, AnimationState animationState) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = animationState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        AnimationState animationState = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                animationState.isRunning = false;
                break;
            default:
                animationState.isRunning = false;
                break;
        }
        return unit;
    }
}
