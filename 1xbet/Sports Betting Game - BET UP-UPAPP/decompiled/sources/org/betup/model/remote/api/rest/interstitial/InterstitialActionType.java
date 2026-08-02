package org.betup.model.remote.api.rest.interstitial;

import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostInterstitialActionInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/betup/model/remote/api/rest/interstitial/InterstitialActionType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "IMPRESSION", "CLICK", "CLOSE", HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP, "VIDEO_COMPLETE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InterstitialActionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InterstitialActionType[] $VALUES;
    public static final InterstitialActionType IMPRESSION = new InterstitialActionType("IMPRESSION", 0);
    public static final InterstitialActionType CLICK = new InterstitialActionType("CLICK", 1);
    public static final InterstitialActionType CLOSE = new InterstitialActionType("CLOSE", 2);
    public static final InterstitialActionType SKIP = new InterstitialActionType(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP, 3);
    public static final InterstitialActionType VIDEO_COMPLETE = new InterstitialActionType("VIDEO_COMPLETE", 4);

    private static final /* synthetic */ InterstitialActionType[] $values() {
        return new InterstitialActionType[]{IMPRESSION, CLICK, CLOSE, SKIP, VIDEO_COMPLETE};
    }

    public static EnumEntries<InterstitialActionType> getEntries() {
        return $ENTRIES;
    }

    private InterstitialActionType(String str, int i) {
    }

    static {
        InterstitialActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static InterstitialActionType valueOf(String str) {
        return (InterstitialActionType) Enum.valueOf(InterstitialActionType.class, str);
    }

    public static InterstitialActionType[] values() {
        return (InterstitialActionType[]) $VALUES.clone();
    }
}
