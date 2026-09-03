package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class u8 implements Function1 {
    public final /* synthetic */ Transition b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ u8(Transition transition, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = transition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        final Transition transition = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$3$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        Transition transition2 = Transition.this;
                        transition2.MRfxZSx8l5UG62U();
                        transition2.yzPsTade5rL7D3.b41X89IqSbKt();
                    }
                };
            default:
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        Transition transition2 = Transition.this;
                        transition2.MRfxZSx8l5UG62U();
                        transition2.yzPsTade5rL7D3.b41X89IqSbKt();
                    }
                };
        }
    }
}
