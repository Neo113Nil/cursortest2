package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H$¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u000e\u000f\u0010"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffect;", "", "<init>", "()V", "Landroid/graphics/RenderEffect;", "asAndroidRenderEffect", "()Landroid/graphics/RenderEffect;", "createRenderEffect", "", "isSupported", "()Z", "getHighSpeedVideoFpsRangesFor", "Landroid/graphics/RenderEffect;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/OffsetEffect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RenderEffect {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.graphics.RenderEffect getHighSpeedVideoSizes;

    protected abstract android.graphics.RenderEffect createRenderEffect();

    private RenderEffect() {
    }

    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.getHighSpeedVideoSizes;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect createRenderEffect = createRenderEffect();
        this.getHighSpeedVideoSizes = createRenderEffect;
        return createRenderEffect;
    }

    public boolean isSupported() {
        return android.os.Build.VERSION.SDK_INT >= 31;
    }

    public /* synthetic */ RenderEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
