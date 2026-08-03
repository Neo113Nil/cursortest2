package androidx.compose.foundation.lazy;

/* compiled from: LazyItemScopeImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0001¨\u0006\u0007"}, d2 = {"animateItem", "Landroidx/compose/ui/Modifier;", "appearanceSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "placementSpec", "Landroidx/compose/ui/unit/IntOffset;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyItemScopeImplKt {
    public static /* synthetic */ androidx.compose.ui.Modifier animateItem$default(androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.tween$default(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 0, null, 6, null);
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec2 = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        return animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2);
    }

    public static final androidx.compose.ui.Modifier animateItem(androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec2) {
        return (finiteAnimationSpec == null && finiteAnimationSpec2 == null) ? modifier : modifier.then(new androidx.compose.foundation.lazy.AnimateItemElement(finiteAnimationSpec, finiteAnimationSpec2));
    }
}
