package androidx.glance;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.ContentScale;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001a\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\tB(\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/glance/BackgroundModifier;", "Landroidx/glance/GlanceModifier$Element;", "colorProvider", "Landroidx/glance/unit/ColorProvider;", "(Landroidx/glance/unit/ColorProvider;)V", "imageProvider", "Landroidx/glance/ImageProvider;", "contentScale", "Landroidx/glance/layout/ContentScale;", "(Landroidx/glance/ImageProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/glance/unit/ColorProvider;Landroidx/glance/ImageProvider;I)V", "getColorProvider", "()Landroidx/glance/unit/ColorProvider;", "getContentScale-Ae3V0ko", "()I", "I", "getImageProvider", "()Landroidx/glance/ImageProvider;", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class BackgroundModifier implements GlanceModifier.Element {
    public static final int $stable = 0;
    private final ColorProvider colorProvider;
    private final int contentScale;
    private final ImageProvider imageProvider;

    public /* synthetic */ BackgroundModifier(ImageProvider imageProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageProvider, i);
    }

    public final ColorProvider getColorProvider() {
        return this.colorProvider;
    }

    /* renamed from: getContentScale-Ae3V0ko, reason: not valid java name and from getter */
    public final int getContentScale() {
        return this.contentScale;
    }

    public final ImageProvider getImageProvider() {
        return this.imageProvider;
    }

    public String toString() {
        return "BackgroundModifier(colorProvider=" + this.colorProvider + ", imageProvider=" + this.imageProvider + ", contentScale=" + ((Object) ContentScale.m1397toStringimpl(this.contentScale)) + ')';
    }

    private BackgroundModifier(ColorProvider colorProvider, ImageProvider imageProvider, int i) {
        this.colorProvider = colorProvider;
        this.imageProvider = imageProvider;
        this.contentScale = i;
        if (!((colorProvider != null) ^ (imageProvider != null))) {
            throw new IllegalArgumentException("Exactly one of colorProvider and imageProvider must be non-null");
        }
    }

    public /* synthetic */ BackgroundModifier(ColorProvider colorProvider, ImageProvider imageProvider, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorProvider, imageProvider, (i2 & 4) != 0 ? ContentScale.INSTANCE.m1400getFillBoundsAe3V0ko() : i);
    }

    public BackgroundModifier(ColorProvider colorProvider) {
        this(colorProvider, null, 0, 4, null);
    }

    private BackgroundModifier(ImageProvider imageProvider, int i) {
        this((ColorProvider) null, imageProvider, i);
    }
}
