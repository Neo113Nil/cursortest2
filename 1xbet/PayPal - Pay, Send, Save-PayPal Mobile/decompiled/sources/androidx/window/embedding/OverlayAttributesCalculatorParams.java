package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/window/embedding/OverlayAttributesCalculatorParams;", "", "Landroidx/window/layout/WindowMetrics;", "parentWindowMetrics", "Landroid/content/res/Configuration;", "parentConfiguration", "Landroidx/window/layout/WindowLayoutInfo;", "parentWindowLayoutInfo", "", "overlayTag", "Landroidx/window/embedding/OverlayAttributes;", "defaultOverlayAttributes", "<init>", "(Landroidx/window/layout/WindowMetrics;Landroid/content/res/Configuration;Landroidx/window/layout/WindowLayoutInfo;Ljava/lang/String;Landroidx/window/embedding/OverlayAttributes;)V", "toString", "()Ljava/lang/String;", "Landroidx/window/layout/WindowMetrics;", "getParentWindowMetrics", "()Landroidx/window/layout/WindowMetrics;", "Landroid/content/res/Configuration;", "getParentConfiguration", "()Landroid/content/res/Configuration;", "Landroidx/window/layout/WindowLayoutInfo;", "getParentWindowLayoutInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "Ljava/lang/String;", "getOverlayTag", "Landroidx/window/embedding/OverlayAttributes;", "getDefaultOverlayAttributes", "()Landroidx/window/embedding/OverlayAttributes;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OverlayAttributesCalculatorParams {
    private final androidx.window.embedding.OverlayAttributes defaultOverlayAttributes;
    private final java.lang.String overlayTag;
    private final android.content.res.Configuration parentConfiguration;
    private final androidx.window.layout.WindowLayoutInfo parentWindowLayoutInfo;
    private final androidx.window.layout.WindowMetrics parentWindowMetrics;

    public OverlayAttributesCalculatorParams(androidx.window.layout.WindowMetrics windowMetrics, android.content.res.Configuration configuration, androidx.window.layout.WindowLayoutInfo windowLayoutInfo, java.lang.String str, androidx.window.embedding.OverlayAttributes overlayAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayAttributes, "");
        this.parentWindowMetrics = windowMetrics;
        this.parentConfiguration = configuration;
        this.parentWindowLayoutInfo = windowLayoutInfo;
        this.overlayTag = str;
        this.defaultOverlayAttributes = overlayAttributes;
    }

    public final androidx.window.layout.WindowMetrics getParentWindowMetrics() {
        return this.parentWindowMetrics;
    }

    public final android.content.res.Configuration getParentConfiguration() {
        return this.parentConfiguration;
    }

    public final androidx.window.layout.WindowLayoutInfo getParentWindowLayoutInfo() {
        return this.parentWindowLayoutInfo;
    }

    public final java.lang.String getOverlayTag() {
        return this.overlayTag;
    }

    public final androidx.window.embedding.OverlayAttributes getDefaultOverlayAttributes() {
        return this.defaultOverlayAttributes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(androidx.window.embedding.OverlayAttributesCalculatorParams.class);
        sb.append(":{parentWindowMetrics=");
        sb.append(this.parentWindowMetrics);
        sb.append("parentConfiguration=");
        sb.append(this.parentConfiguration);
        sb.append("parentWindowLayoutInfo=");
        sb.append(this.parentWindowLayoutInfo);
        sb.append("overlayTag=");
        sb.append(this.overlayTag);
        sb.append("defaultOverlayAttributes=");
        sb.append(this.defaultOverlayAttributes);
        return sb.toString();
    }
}
