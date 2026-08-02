package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationEndReason;", "", "<init>", "(Ljava/lang/String;I)V", "BoundReached", "Finished"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimationEndReason {
    public static final androidx.compose.animation.core.AnimationEndReason BoundReached = new androidx.compose.animation.core.AnimationEndReason("BoundReached", 0);
    public static final androidx.compose.animation.core.AnimationEndReason Finished = new androidx.compose.animation.core.AnimationEndReason("Finished", 1);
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ androidx.compose.animation.core.AnimationEndReason[] getHighSpeedVideoSizes;

    private AnimationEndReason(java.lang.String str, int i) {
    }

    static {
        androidx.compose.animation.core.AnimationEndReason[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoSizes = highResolutionOutputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(highResolutionOutputSizeshNQ4ISI);
    }

    public static androidx.compose.animation.core.AnimationEndReason[] values() {
        return (androidx.compose.animation.core.AnimationEndReason[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.compose.animation.core.AnimationEndReason valueOf(java.lang.String str) {
        return (androidx.compose.animation.core.AnimationEndReason) java.lang.Enum.valueOf(androidx.compose.animation.core.AnimationEndReason.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.animation.core.AnimationEndReason> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    private static final /* synthetic */ androidx.compose.animation.core.AnimationEndReason[] getHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.animation.core.AnimationEndReason[]{BoundReached, Finished};
    }
}
