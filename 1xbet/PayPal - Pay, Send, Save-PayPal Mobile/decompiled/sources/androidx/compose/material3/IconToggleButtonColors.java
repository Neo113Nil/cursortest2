package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJI\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\"\u0010\u001d"}, d2 = {"Landroidx/compose/material3/IconToggleButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/IconToggleButtonColors;", "copy", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "containerColor$material3", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor$material3", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getDisabledContentColor-0d7_KjU", "getCheckedContainerColor-0d7_KjU", "getCheckedContentColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconToggleButtonColors {
    public static final int $stable = 0;
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    private IconToggleButtonColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.containerColor = j;
        this.contentColor = j2;
        this.disabledContainerColor = j3;
        this.disabledContentColor = j4;
        this.checkedContainerColor = j5;
        this.checkedContentColor = j6;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContentColor() {
        return this.disabledContentColor;
    }

    /* renamed from: getCheckedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedContainerColor() {
        return this.checkedContainerColor;
    }

    /* renamed from: getCheckedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedContentColor() {
        return this.checkedContentColor;
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final androidx.compose.material3.IconToggleButtonColors m3377copytNS2XkQ(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, long checkedContainerColor, long checkedContentColor) {
        return new androidx.compose.material3.IconToggleButtonColors(containerColor == 16 ? this.containerColor : containerColor, contentColor == 16 ? this.contentColor : contentColor, disabledContainerColor == 16 ? this.disabledContainerColor : disabledContainerColor, disabledContentColor == 16 ? this.disabledContentColor : disabledContentColor, checkedContainerColor == 16 ? this.checkedContainerColor : checkedContainerColor, checkedContentColor == 16 ? this.checkedContentColor : checkedContentColor, null);
    }

    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> containerColor$material3(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1175394478, i, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:882)");
        }
        if (!z) {
            j = this.disabledContainerColor;
        } else if (!z2) {
            j = this.containerColor;
        } else {
            j = this.checkedContainerColor;
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(j), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> contentColor$material3(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        long j;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1340854054, i, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:899)");
        }
        if (!z) {
            j = this.disabledContentColor;
        } else if (!z2) {
            j = this.contentColor;
        } else {
            j = this.checkedContentColor;
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(j), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.IconToggleButtonColors)) {
            return false;
        }
        androidx.compose.material3.IconToggleButtonColors iconToggleButtonColors = (androidx.compose.material3.IconToggleButtonColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.containerColor, iconToggleButtonColors.containerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.contentColor, iconToggleButtonColors.contentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.checkedContentColor, iconToggleButtonColors.checkedContentColor);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.containerColor);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.contentColor);
        int m6003hashCodeimpl3 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledContainerColor);
        return (((((((((m6003hashCodeimpl * 31) + m6003hashCodeimpl2) * 31) + m6003hashCodeimpl3) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledContentColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.checkedContainerColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.checkedContentColor);
    }

    public /* synthetic */ IconToggleButtonColors(long j, long j2, long j3, long j4, long j5, long j6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }
}
