package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0018\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001d8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/animation/ContentScaleTransitionEffect;", "Landroidx/compose/animation/TransitionEffect;", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Landroidx/compose/ui/Alignment;", "alignment", "<init>", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)V", "component1", "()Landroidx/compose/ui/layout/ContentScale;", "component2", "()Landroidx/compose/ui/Alignment;", "copy", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)Landroidx/compose/animation/ContentScaleTransitionEffect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "Landroidx/compose/ui/Alignment;", "getAlignment", "Landroidx/compose/animation/TransitionEffectKey;", "getKey$animation", "()Landroidx/compose/animation/TransitionEffectKey;", "key", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ContentScaleTransitionEffect extends androidx.compose.animation.TransitionEffect {
    public static final int $stable = 0;

    /* renamed from: Key, reason: from kotlin metadata */
    public static final androidx.compose.animation.ContentScaleTransitionEffect.Companion INSTANCE = new androidx.compose.animation.ContentScaleTransitionEffect.Companion(null);
    private final androidx.compose.ui.Alignment alignment;
    private final androidx.compose.ui.layout.ContentScale contentScale;

    public ContentScaleTransitionEffect(androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.ui.Alignment alignment) {
        super(null);
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    public final androidx.compose.ui.layout.ContentScale getContentScale() {
        return this.contentScale;
    }

    public final androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/ContentScaleTransitionEffect$Key;", "Landroidx/compose/animation/TransitionEffectKey;", "Landroidx/compose/animation/ContentScaleTransitionEffect;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.ContentScaleTransitionEffect$Key, reason: from kotlin metadata */
    public static final class Companion implements androidx.compose.animation.TransitionEffectKey<androidx.compose.animation.ContentScaleTransitionEffect> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.compose.animation.TransitionEffect
    public final androidx.compose.animation.TransitionEffectKey<?> getKey$animation() {
        return INSTANCE;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentScaleTransitionEffect(contentScale=");
        sb.append(this.contentScale);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.contentScale.hashCode() * 31) + this.alignment.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.animation.ContentScaleTransitionEffect)) {
            return false;
        }
        androidx.compose.animation.ContentScaleTransitionEffect contentScaleTransitionEffect = (androidx.compose.animation.ContentScaleTransitionEffect) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.contentScale, contentScaleTransitionEffect.contentScale) && kotlin.jvm.internal.Intrinsics.areEqual(this.alignment, contentScaleTransitionEffect.alignment);
    }

    public final androidx.compose.animation.ContentScaleTransitionEffect copy(androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.ui.Alignment alignment) {
        return new androidx.compose.animation.ContentScaleTransitionEffect(contentScale, alignment);
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.layout.ContentScale getContentScale() {
        return this.contentScale;
    }

    public static /* synthetic */ androidx.compose.animation.ContentScaleTransitionEffect copy$default(androidx.compose.animation.ContentScaleTransitionEffect contentScaleTransitionEffect, androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.ui.Alignment alignment, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contentScale = contentScaleTransitionEffect.contentScale;
        }
        if ((i & 2) != 0) {
            alignment = contentScaleTransitionEffect.alignment;
        }
        return contentScaleTransitionEffect.copy(contentScale, alignment);
    }
}
