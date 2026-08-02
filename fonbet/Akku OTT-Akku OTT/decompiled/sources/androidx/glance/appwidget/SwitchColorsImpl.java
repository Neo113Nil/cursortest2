package androidx.glance.appwidget;

import androidx.glance.appwidget.unit.CheckableColorProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\nJ\u000e\u0010\u000b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Landroidx/glance/appwidget/SwitchColorsImpl;", "Landroidx/glance/appwidget/SwitchColors;", "thumb", "Landroidx/glance/appwidget/unit/CheckableColorProvider;", "track", "(Landroidx/glance/appwidget/unit/CheckableColorProvider;Landroidx/glance/appwidget/unit/CheckableColorProvider;)V", "getThumb$glance_appwidget_release", "()Landroidx/glance/appwidget/unit/CheckableColorProvider;", "getTrack$glance_appwidget_release", "component1", "component1$glance_appwidget_release", "component2", "component2$glance_appwidget_release", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SwitchColorsImpl extends SwitchColors {
    private final CheckableColorProvider thumb;
    private final CheckableColorProvider track;

    public SwitchColorsImpl(CheckableColorProvider checkableColorProvider, CheckableColorProvider checkableColorProvider2) {
        super(null);
        this.thumb = checkableColorProvider;
        this.track = checkableColorProvider2;
    }

    public static /* synthetic */ SwitchColorsImpl copy$default(SwitchColorsImpl switchColorsImpl, CheckableColorProvider checkableColorProvider, CheckableColorProvider checkableColorProvider2, int i, Object obj) {
        if ((i & 1) != 0) {
            checkableColorProvider = switchColorsImpl.thumb;
        }
        if ((i & 2) != 0) {
            checkableColorProvider2 = switchColorsImpl.track;
        }
        return switchColorsImpl.copy(checkableColorProvider, checkableColorProvider2);
    }

    /* renamed from: component1$glance_appwidget_release, reason: from getter */
    public final CheckableColorProvider getThumb() {
        return this.thumb;
    }

    /* renamed from: component2$glance_appwidget_release, reason: from getter */
    public final CheckableColorProvider getTrack() {
        return this.track;
    }

    public final SwitchColorsImpl copy(CheckableColorProvider thumb, CheckableColorProvider track) {
        return new SwitchColorsImpl(thumb, track);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchColorsImpl)) {
            return false;
        }
        SwitchColorsImpl switchColorsImpl = (SwitchColorsImpl) other;
        return Intrinsics.areEqual(this.thumb, switchColorsImpl.thumb) && Intrinsics.areEqual(this.track, switchColorsImpl.track);
    }

    @Override // androidx.glance.appwidget.SwitchColors
    public CheckableColorProvider getThumb$glance_appwidget_release() {
        return this.thumb;
    }

    @Override // androidx.glance.appwidget.SwitchColors
    public CheckableColorProvider getTrack$glance_appwidget_release() {
        return this.track;
    }

    public int hashCode() {
        return this.track.hashCode() + (this.thumb.hashCode() * 31);
    }

    public String toString() {
        return "SwitchColorsImpl(thumb=" + this.thumb + ", track=" + this.track + ')';
    }
}
