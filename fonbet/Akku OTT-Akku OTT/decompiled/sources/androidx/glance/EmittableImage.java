package androidx.glance;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.layout.ContentScale;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u0001H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u00020\nX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/glance/EmittableImage;", "Landroidx/glance/Emittable;", "()V", "colorFilterParams", "Landroidx/glance/ColorFilterParams;", "getColorFilterParams", "()Landroidx/glance/ColorFilterParams;", "setColorFilterParams", "(Landroidx/glance/ColorFilterParams;)V", "contentScale", "Landroidx/glance/layout/ContentScale;", "getContentScale-Ae3V0ko", "()I", "setContentScale-HwT0Evw", "(I)V", "I", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "provider", "Landroidx/glance/ImageProvider;", "getProvider", "()Landroidx/glance/ImageProvider;", "setProvider", "(Landroidx/glance/ImageProvider;)V", "copy", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class EmittableImage implements Emittable {
    public static final int $stable = 8;
    private ColorFilterParams colorFilterParams;
    private ImageProvider provider;
    private GlanceModifier modifier = GlanceModifier.INSTANCE;
    private int contentScale = ContentScale.INSTANCE.m1401getFitAe3V0ko();

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        EmittableImage emittableImage = new EmittableImage();
        emittableImage.setModifier(getModifier());
        emittableImage.provider = this.provider;
        emittableImage.colorFilterParams = this.colorFilterParams;
        emittableImage.contentScale = this.contentScale;
        return emittableImage;
    }

    public final ColorFilterParams getColorFilterParams() {
        return this.colorFilterParams;
    }

    /* renamed from: getContentScale-Ae3V0ko, reason: not valid java name and from getter */
    public final int getContentScale() {
        return this.contentScale;
    }

    @Override // androidx.glance.Emittable
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    public final ImageProvider getProvider() {
        return this.provider;
    }

    public final void setColorFilterParams(ColorFilterParams colorFilterParams) {
        this.colorFilterParams = colorFilterParams;
    }

    /* renamed from: setContentScale-HwT0Evw, reason: not valid java name */
    public final void m1275setContentScaleHwT0Evw(int i) {
        this.contentScale = i;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    public final void setProvider(ImageProvider imageProvider) {
        this.provider = imageProvider;
    }

    public String toString() {
        return "EmittableImage(modifier=" + getModifier() + ", provider=" + this.provider + ", colorFilterParams=" + this.colorFilterParams + ", contentScale=" + ((Object) ContentScale.m1397toStringimpl(this.contentScale)) + ')';
    }
}
