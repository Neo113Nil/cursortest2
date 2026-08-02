package org.betup.ui.common.video;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: VideoOfferMotion.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/common/video/VideoOfferMotion;", "", "cardScale", "", "animatedEllipsis", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(FLjava/lang/String;)V", "getCardScale", "()F", "getAnimatedEllipsis", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoOfferMotion {
    public static final int $stable = 0;
    private final String animatedEllipsis;
    private final float cardScale;

    public static /* synthetic */ VideoOfferMotion copy$default(VideoOfferMotion videoOfferMotion, float f, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = videoOfferMotion.cardScale;
        }
        if ((i & 2) != 0) {
            str = videoOfferMotion.animatedEllipsis;
        }
        return videoOfferMotion.copy(f, str);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCardScale() {
        return this.cardScale;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAnimatedEllipsis() {
        return this.animatedEllipsis;
    }

    public final VideoOfferMotion copy(float cardScale, String animatedEllipsis) {
        Intrinsics.checkNotNullParameter(animatedEllipsis, "animatedEllipsis");
        return new VideoOfferMotion(cardScale, animatedEllipsis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoOfferMotion)) {
            return false;
        }
        VideoOfferMotion videoOfferMotion = (VideoOfferMotion) other;
        return Float.compare(this.cardScale, videoOfferMotion.cardScale) == 0 && Intrinsics.areEqual(this.animatedEllipsis, videoOfferMotion.animatedEllipsis);
    }

    public int hashCode() {
        return (Float.hashCode(this.cardScale) * 31) + this.animatedEllipsis.hashCode();
    }

    public String toString() {
        return "VideoOfferMotion(cardScale=" + this.cardScale + ", animatedEllipsis=" + this.animatedEllipsis + ")";
    }

    public VideoOfferMotion(float f, String animatedEllipsis) {
        Intrinsics.checkNotNullParameter(animatedEllipsis, "animatedEllipsis");
        this.cardScale = f;
        this.animatedEllipsis = animatedEllipsis;
    }

    public final float getCardScale() {
        return this.cardScale;
    }

    public final String getAnimatedEllipsis() {
        return this.animatedEllipsis;
    }
}
