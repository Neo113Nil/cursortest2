package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007"}, d2 = {"Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "androidRenderEffect", "<init>", "(Landroid/graphics/RenderEffect;)V", "createRenderEffect", "()Landroid/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "getAndroidRenderEffect"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidRenderEffect extends androidx.compose.ui.graphics.RenderEffect {
    public static final int $stable = 0;
    private final android.graphics.RenderEffect androidRenderEffect;

    public AndroidRenderEffect(android.graphics.RenderEffect renderEffect) {
        super(null);
        this.androidRenderEffect = renderEffect;
    }

    public final android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    /* renamed from: createRenderEffect, reason: from getter */
    protected final android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
