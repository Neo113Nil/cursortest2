package com.goldenboot.saga.zone;

import android.graphics.ColorFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/goldenboot/saga/zone/OverlayMigration;", "Landroidx/compose/ui/graphics/LayerUseCase;", "Lcom/goldenboot/saga/zone/ContainerSource;", "multiply", "add", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JJLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "injectMetric", "J", "()J", "detachStream", "growPayload", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.OverlayMigration, reason: from toString */
/* loaded from: classes.dex */
public final class LightingColorFilter extends androidx.compose.ui.graphics.LayerUseCase {

    /* renamed from: detachStream, reason: from kotlin metadata and from toString */
    private final long add;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final long multiply;

    public /* synthetic */ LightingColorFilter(long j, long j2, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, colorFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) other;
        return ContainerSource.drawScope(this.multiply, lightingColorFilter.multiply) && ContainerSource.drawScope(this.add, lightingColorFilter.add);
    }

    /* renamed from: growPayload, reason: from getter */
    public final long getAdd() {
        return this.add;
    }

    public int hashCode() {
        return (ContainerSource.unlockMessage(this.multiply) * 31) + ContainerSource.unlockMessage(this.add);
    }

    /* renamed from: injectMetric, reason: from getter */
    public final long getMultiply() {
        return this.multiply;
    }

    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) ContainerSource.bindBody(this.multiply)) + ", add=" + ((Object) ContainerSource.bindBody(this.add)) + ')';
    }

    public /* synthetic */ LightingColorFilter(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private LightingColorFilter(long j, long j2, ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j;
        this.add = j2;
    }

    private LightingColorFilter(long j, long j2) {
        this(j, j2, FontMemento.injectMetric(j, j2), null);
    }
}
