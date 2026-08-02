package androidx.glance.color;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.appwidget.unit.a;
import androidx.glance.unit.ColorProvider;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B×\u0001\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003¢\u0006\u0002\u0010\u001dJ\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020?H\u0016R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001f\u0082\u0001\u0002@A¨\u0006B"}, d2 = {"Landroidx/glance/color/ColorProviders;", "", "primary", "Landroidx/glance/unit/ColorProvider;", "onPrimary", "primaryContainer", "onPrimaryContainer", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "errorContainer", "onError", "onErrorContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "outline", "inverseOnSurface", "inverseSurface", "inversePrimary", "(Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;)V", "getBackground", "()Landroidx/glance/unit/ColorProvider;", "getError", "getErrorContainer", "getInverseOnSurface", "getInversePrimary", "getInverseSurface", "getOnBackground", "getOnError", "getOnErrorContainer", "getOnPrimary", "getOnPrimaryContainer", "getOnSecondary", "getOnSecondaryContainer", "getOnSurface", "getOnSurfaceVariant", "getOnTertiary", "getOnTertiaryContainer", "getOutline", "getPrimary", "getPrimaryContainer", "getSecondary", "getSecondaryContainer", "getSurface", "getSurfaceVariant", "getTertiary", "getTertiaryContainer", "equals", "", "other", "hashCode", "", "toString", "", "Landroidx/glance/color/CustomColorProviders;", "Landroidx/glance/color/DynamicThemeColorProviders;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ColorProviders {
    public static final int $stable = 0;
    private final ColorProvider background;
    private final ColorProvider error;
    private final ColorProvider errorContainer;
    private final ColorProvider inverseOnSurface;
    private final ColorProvider inversePrimary;
    private final ColorProvider inverseSurface;
    private final ColorProvider onBackground;
    private final ColorProvider onError;
    private final ColorProvider onErrorContainer;
    private final ColorProvider onPrimary;
    private final ColorProvider onPrimaryContainer;
    private final ColorProvider onSecondary;
    private final ColorProvider onSecondaryContainer;
    private final ColorProvider onSurface;
    private final ColorProvider onSurfaceVariant;
    private final ColorProvider onTertiary;
    private final ColorProvider onTertiaryContainer;
    private final ColorProvider outline;
    private final ColorProvider primary;
    private final ColorProvider primaryContainer;
    private final ColorProvider secondary;
    private final ColorProvider secondaryContainer;
    private final ColorProvider surface;
    private final ColorProvider surfaceVariant;
    private final ColorProvider tertiary;
    private final ColorProvider tertiaryContainer;

    public /* synthetic */ ColorProviders(ColorProvider colorProvider, ColorProvider colorProvider2, ColorProvider colorProvider3, ColorProvider colorProvider4, ColorProvider colorProvider5, ColorProvider colorProvider6, ColorProvider colorProvider7, ColorProvider colorProvider8, ColorProvider colorProvider9, ColorProvider colorProvider10, ColorProvider colorProvider11, ColorProvider colorProvider12, ColorProvider colorProvider13, ColorProvider colorProvider14, ColorProvider colorProvider15, ColorProvider colorProvider16, ColorProvider colorProvider17, ColorProvider colorProvider18, ColorProvider colorProvider19, ColorProvider colorProvider20, ColorProvider colorProvider21, ColorProvider colorProvider22, ColorProvider colorProvider23, ColorProvider colorProvider24, ColorProvider colorProvider25, ColorProvider colorProvider26, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorProvider, colorProvider2, colorProvider3, colorProvider4, colorProvider5, colorProvider6, colorProvider7, colorProvider8, colorProvider9, colorProvider10, colorProvider11, colorProvider12, colorProvider13, colorProvider14, colorProvider15, colorProvider16, colorProvider17, colorProvider18, colorProvider19, colorProvider20, colorProvider21, colorProvider22, colorProvider23, colorProvider24, colorProvider25, colorProvider26);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.glance.color.ColorProviders");
        ColorProviders colorProviders = (ColorProviders) other;
        return Intrinsics.areEqual(this.primary, colorProviders.primary) && Intrinsics.areEqual(this.onPrimary, colorProviders.onPrimary) && Intrinsics.areEqual(this.primaryContainer, colorProviders.primaryContainer) && Intrinsics.areEqual(this.onPrimaryContainer, colorProviders.onPrimaryContainer) && Intrinsics.areEqual(this.secondary, colorProviders.secondary) && Intrinsics.areEqual(this.onSecondary, colorProviders.onSecondary) && Intrinsics.areEqual(this.secondaryContainer, colorProviders.secondaryContainer) && Intrinsics.areEqual(this.onSecondaryContainer, colorProviders.onSecondaryContainer) && Intrinsics.areEqual(this.tertiary, colorProviders.tertiary) && Intrinsics.areEqual(this.onTertiary, colorProviders.onTertiary) && Intrinsics.areEqual(this.tertiaryContainer, colorProviders.tertiaryContainer) && Intrinsics.areEqual(this.onTertiaryContainer, colorProviders.onTertiaryContainer) && Intrinsics.areEqual(this.error, colorProviders.error) && Intrinsics.areEqual(this.errorContainer, colorProviders.errorContainer) && Intrinsics.areEqual(this.onError, colorProviders.onError) && Intrinsics.areEqual(this.onErrorContainer, colorProviders.onErrorContainer) && Intrinsics.areEqual(this.background, colorProviders.background) && Intrinsics.areEqual(this.onBackground, colorProviders.onBackground) && Intrinsics.areEqual(this.surface, colorProviders.surface) && Intrinsics.areEqual(this.onSurface, colorProviders.onSurface) && Intrinsics.areEqual(this.surfaceVariant, colorProviders.surfaceVariant) && Intrinsics.areEqual(this.onSurfaceVariant, colorProviders.onSurfaceVariant) && Intrinsics.areEqual(this.outline, colorProviders.outline) && Intrinsics.areEqual(this.inverseOnSurface, colorProviders.inverseOnSurface) && Intrinsics.areEqual(this.inverseSurface, colorProviders.inverseSurface) && Intrinsics.areEqual(this.inversePrimary, colorProviders.inversePrimary);
    }

    public final ColorProvider getBackground() {
        return this.background;
    }

    public final ColorProvider getError() {
        return this.error;
    }

    public final ColorProvider getErrorContainer() {
        return this.errorContainer;
    }

    public final ColorProvider getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public final ColorProvider getInversePrimary() {
        return this.inversePrimary;
    }

    public final ColorProvider getInverseSurface() {
        return this.inverseSurface;
    }

    public final ColorProvider getOnBackground() {
        return this.onBackground;
    }

    public final ColorProvider getOnError() {
        return this.onError;
    }

    public final ColorProvider getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public final ColorProvider getOnPrimary() {
        return this.onPrimary;
    }

    public final ColorProvider getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public final ColorProvider getOnSecondary() {
        return this.onSecondary;
    }

    public final ColorProvider getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public final ColorProvider getOnSurface() {
        return this.onSurface;
    }

    public final ColorProvider getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public final ColorProvider getOnTertiary() {
        return this.onTertiary;
    }

    public final ColorProvider getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public final ColorProvider getOutline() {
        return this.outline;
    }

    public final ColorProvider getPrimary() {
        return this.primary;
    }

    public final ColorProvider getPrimaryContainer() {
        return this.primaryContainer;
    }

    public final ColorProvider getSecondary() {
        return this.secondary;
    }

    public final ColorProvider getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public final ColorProvider getSurface() {
        return this.surface;
    }

    public final ColorProvider getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public final ColorProvider getTertiary() {
        return this.tertiary;
    }

    public final ColorProvider getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public int hashCode() {
        return this.inversePrimary.hashCode() + a.a(this.inverseSurface, a.a(this.inverseOnSurface, a.a(this.outline, a.a(this.onSurfaceVariant, a.a(this.surfaceVariant, a.a(this.onSurface, a.a(this.surface, a.a(this.onBackground, a.a(this.background, a.a(this.onErrorContainer, a.a(this.onError, a.a(this.errorContainer, a.a(this.error, a.a(this.onTertiaryContainer, a.a(this.tertiaryContainer, a.a(this.onTertiary, a.a(this.tertiary, a.a(this.onSecondaryContainer, a.a(this.secondaryContainer, a.a(this.onSecondary, a.a(this.secondary, a.a(this.onPrimaryContainer, a.a(this.primaryContainer, a.a(this.onPrimary, this.primary.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "ColorProviders(primary=" + this.primary + ", onPrimary=" + this.onPrimary + ", primaryContainer=" + this.primaryContainer + ", onPrimaryContainer=" + this.onPrimaryContainer + ", secondary=" + this.secondary + ", onSecondary=" + this.onSecondary + ", secondaryContainer=" + this.secondaryContainer + ", onSecondaryContainer=" + this.onSecondaryContainer + ", tertiary=" + this.tertiary + ", onTertiary=" + this.onTertiary + ", tertiaryContainer=" + this.tertiaryContainer + ", onTertiaryContainer=" + this.onTertiaryContainer + ", error=" + this.error + ", errorContainer=" + this.errorContainer + ", onError=" + this.onError + ", onErrorContainer=" + this.onErrorContainer + ", background=" + this.background + ", onBackground=" + this.onBackground + ", surface=" + this.surface + ", onSurface=" + this.onSurface + ", surfaceVariant=" + this.surfaceVariant + ", onSurfaceVariant=" + this.onSurfaceVariant + ", outline=" + this.outline + ", inverseOnSurface=" + this.inverseOnSurface + ", inverseSurface=" + this.inverseSurface + ", inversePrimary=" + this.inversePrimary + ')';
    }

    private ColorProviders(ColorProvider colorProvider, ColorProvider colorProvider2, ColorProvider colorProvider3, ColorProvider colorProvider4, ColorProvider colorProvider5, ColorProvider colorProvider6, ColorProvider colorProvider7, ColorProvider colorProvider8, ColorProvider colorProvider9, ColorProvider colorProvider10, ColorProvider colorProvider11, ColorProvider colorProvider12, ColorProvider colorProvider13, ColorProvider colorProvider14, ColorProvider colorProvider15, ColorProvider colorProvider16, ColorProvider colorProvider17, ColorProvider colorProvider18, ColorProvider colorProvider19, ColorProvider colorProvider20, ColorProvider colorProvider21, ColorProvider colorProvider22, ColorProvider colorProvider23, ColorProvider colorProvider24, ColorProvider colorProvider25, ColorProvider colorProvider26) {
        this.primary = colorProvider;
        this.onPrimary = colorProvider2;
        this.primaryContainer = colorProvider3;
        this.onPrimaryContainer = colorProvider4;
        this.secondary = colorProvider5;
        this.onSecondary = colorProvider6;
        this.secondaryContainer = colorProvider7;
        this.onSecondaryContainer = colorProvider8;
        this.tertiary = colorProvider9;
        this.onTertiary = colorProvider10;
        this.tertiaryContainer = colorProvider11;
        this.onTertiaryContainer = colorProvider12;
        this.error = colorProvider13;
        this.errorContainer = colorProvider14;
        this.onError = colorProvider15;
        this.onErrorContainer = colorProvider16;
        this.background = colorProvider17;
        this.onBackground = colorProvider18;
        this.surface = colorProvider19;
        this.onSurface = colorProvider20;
        this.surfaceVariant = colorProvider21;
        this.onSurfaceVariant = colorProvider22;
        this.outline = colorProvider23;
        this.inverseOnSurface = colorProvider24;
        this.inverseSurface = colorProvider25;
        this.inversePrimary = colorProvider26;
    }
}
