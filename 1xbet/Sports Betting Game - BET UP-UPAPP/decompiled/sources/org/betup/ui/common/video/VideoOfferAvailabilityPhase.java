package org.betup.ui.common.video;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoOfferAvailabilityPhase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/betup/ui/common/video/VideoOfferAvailabilityPhase;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "CHECKING", "READY", "UNAVAILABLE", "COOLDOWN", "LIMIT_REACHED", "ACTION_IN_PROGRESS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoOfferAvailabilityPhase {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoOfferAvailabilityPhase[] $VALUES;
    public static final VideoOfferAvailabilityPhase CHECKING = new VideoOfferAvailabilityPhase("CHECKING", 0);
    public static final VideoOfferAvailabilityPhase READY = new VideoOfferAvailabilityPhase("READY", 1);
    public static final VideoOfferAvailabilityPhase UNAVAILABLE = new VideoOfferAvailabilityPhase("UNAVAILABLE", 2);
    public static final VideoOfferAvailabilityPhase COOLDOWN = new VideoOfferAvailabilityPhase("COOLDOWN", 3);
    public static final VideoOfferAvailabilityPhase LIMIT_REACHED = new VideoOfferAvailabilityPhase("LIMIT_REACHED", 4);
    public static final VideoOfferAvailabilityPhase ACTION_IN_PROGRESS = new VideoOfferAvailabilityPhase("ACTION_IN_PROGRESS", 5);

    private static final /* synthetic */ VideoOfferAvailabilityPhase[] $values() {
        return new VideoOfferAvailabilityPhase[]{CHECKING, READY, UNAVAILABLE, COOLDOWN, LIMIT_REACHED, ACTION_IN_PROGRESS};
    }

    public static EnumEntries<VideoOfferAvailabilityPhase> getEntries() {
        return $ENTRIES;
    }

    private VideoOfferAvailabilityPhase(String str, int i) {
    }

    static {
        VideoOfferAvailabilityPhase[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static VideoOfferAvailabilityPhase valueOf(String str) {
        return (VideoOfferAvailabilityPhase) Enum.valueOf(VideoOfferAvailabilityPhase.class, str);
    }

    public static VideoOfferAvailabilityPhase[] values() {
        return (VideoOfferAvailabilityPhase[]) $VALUES.clone();
    }
}
