package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013"}, d2 = {"Landroidx/window/embedding/ParentContainerInfo;", "", "Landroidx/window/core/Bounds;", "windowBounds", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "Landroid/content/res/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "density", "<init>", "(Landroidx/window/core/Bounds;Landroidx/window/layout/WindowLayoutInfo;Landroid/content/res/Configuration;F)V", "component1", "()Landroidx/window/core/Bounds;", "component2", "()Landroidx/window/layout/WindowLayoutInfo;", "component3", "()Landroid/content/res/Configuration;", "component4", "()F", "copy", "(Landroidx/window/core/Bounds;Landroidx/window/layout/WindowLayoutInfo;Landroid/content/res/Configuration;F)Landroidx/window/embedding/ParentContainerInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/window/core/Bounds;", "getWindowBounds", "Landroidx/window/layout/WindowLayoutInfo;", "getWindowLayoutInfo", "Landroid/content/res/Configuration;", "getConfiguration", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDensity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ParentContainerInfo {
    private final android.content.res.Configuration configuration;
    private final float density;
    private final androidx.window.core.Bounds windowBounds;
    private final androidx.window.layout.WindowLayoutInfo windowLayoutInfo;

    public ParentContainerInfo(androidx.window.core.Bounds bounds, androidx.window.layout.WindowLayoutInfo windowLayoutInfo, android.content.res.Configuration configuration, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        this.windowBounds = bounds;
        this.windowLayoutInfo = windowLayoutInfo;
        this.configuration = configuration;
        this.density = f;
    }

    public final androidx.window.core.Bounds getWindowBounds() {
        return this.windowBounds;
    }

    public final androidx.window.layout.WindowLayoutInfo getWindowLayoutInfo() {
        return this.windowLayoutInfo;
    }

    public final android.content.res.Configuration getConfiguration() {
        return this.configuration;
    }

    public final float getDensity() {
        return this.density;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParentContainerInfo(windowBounds=");
        sb.append(this.windowBounds);
        sb.append(", windowLayoutInfo=");
        sb.append(this.windowLayoutInfo);
        sb.append(", configuration=");
        sb.append(this.configuration);
        sb.append(", density=");
        sb.append(this.density);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.windowBounds.hashCode() * 31) + this.windowLayoutInfo.hashCode()) * 31) + this.configuration.hashCode()) * 31) + java.lang.Float.hashCode(this.density);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.ParentContainerInfo)) {
            return false;
        }
        androidx.window.embedding.ParentContainerInfo parentContainerInfo = (androidx.window.embedding.ParentContainerInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.windowBounds, parentContainerInfo.windowBounds) && kotlin.jvm.internal.Intrinsics.areEqual(this.windowLayoutInfo, parentContainerInfo.windowLayoutInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, parentContainerInfo.configuration) && java.lang.Float.compare(this.density, parentContainerInfo.density) == 0;
    }

    public final androidx.window.embedding.ParentContainerInfo copy(androidx.window.core.Bounds windowBounds, androidx.window.layout.WindowLayoutInfo windowLayoutInfo, android.content.res.Configuration configuration, float density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowBounds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        return new androidx.window.embedding.ParentContainerInfo(windowBounds, windowLayoutInfo, configuration, density);
    }

    /* renamed from: component4, reason: from getter */
    public final float getDensity() {
        return this.density;
    }

    /* renamed from: component3, reason: from getter */
    public final android.content.res.Configuration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.window.layout.WindowLayoutInfo getWindowLayoutInfo() {
        return this.windowLayoutInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.window.core.Bounds getWindowBounds() {
        return this.windowBounds;
    }

    public static /* synthetic */ androidx.window.embedding.ParentContainerInfo copy$default(androidx.window.embedding.ParentContainerInfo parentContainerInfo, androidx.window.core.Bounds bounds, androidx.window.layout.WindowLayoutInfo windowLayoutInfo, android.content.res.Configuration configuration, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bounds = parentContainerInfo.windowBounds;
        }
        if ((i & 2) != 0) {
            windowLayoutInfo = parentContainerInfo.windowLayoutInfo;
        }
        if ((i & 4) != 0) {
            configuration = parentContainerInfo.configuration;
        }
        if ((i & 8) != 0) {
            f = parentContainerInfo.density;
        }
        return parentContainerInfo.copy(bounds, windowLayoutInfo, configuration, f);
    }
}
