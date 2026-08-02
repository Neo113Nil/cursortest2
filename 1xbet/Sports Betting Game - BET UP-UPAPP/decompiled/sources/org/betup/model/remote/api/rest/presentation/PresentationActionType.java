package org.betup.model.remote.api.rest.presentation;

import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostPresentationActionInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/model/remote/api/rest/presentation/PresentationActionType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "IMPRESSION", "CLOSE", HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP, "LATER", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationActionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PresentationActionType[] $VALUES;
    public static final PresentationActionType IMPRESSION = new PresentationActionType("IMPRESSION", 0);
    public static final PresentationActionType CLOSE = new PresentationActionType("CLOSE", 1);
    public static final PresentationActionType SKIP = new PresentationActionType(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP, 2);
    public static final PresentationActionType LATER = new PresentationActionType("LATER", 3);

    private static final /* synthetic */ PresentationActionType[] $values() {
        return new PresentationActionType[]{IMPRESSION, CLOSE, SKIP, LATER};
    }

    public static EnumEntries<PresentationActionType> getEntries() {
        return $ENTRIES;
    }

    private PresentationActionType(String str, int i) {
    }

    static {
        PresentationActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static PresentationActionType valueOf(String str) {
        return (PresentationActionType) Enum.valueOf(PresentationActionType.class, str);
    }

    public static PresentationActionType[] values() {
        return (PresentationActionType[]) $VALUES.clone();
    }
}
