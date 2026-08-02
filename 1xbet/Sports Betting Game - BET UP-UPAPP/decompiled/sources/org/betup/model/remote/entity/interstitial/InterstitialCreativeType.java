package org.betup.model.remote.entity.interstitial;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InterstitialCampaignDto.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/model/remote/entity/interstitial/InterstitialCreativeType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "HTML", ShareConstants.VIDEO_URL, "HTML_WITH_VIDEO", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InterstitialCreativeType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InterstitialCreativeType[] $VALUES;
    public static final InterstitialCreativeType HTML = new InterstitialCreativeType("HTML", 0);
    public static final InterstitialCreativeType VIDEO = new InterstitialCreativeType(ShareConstants.VIDEO_URL, 1);
    public static final InterstitialCreativeType HTML_WITH_VIDEO = new InterstitialCreativeType("HTML_WITH_VIDEO", 2);

    private static final /* synthetic */ InterstitialCreativeType[] $values() {
        return new InterstitialCreativeType[]{HTML, VIDEO, HTML_WITH_VIDEO};
    }

    public static EnumEntries<InterstitialCreativeType> getEntries() {
        return $ENTRIES;
    }

    private InterstitialCreativeType(String str, int i) {
    }

    static {
        InterstitialCreativeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static InterstitialCreativeType valueOf(String str) {
        return (InterstitialCreativeType) Enum.valueOf(InterstitialCreativeType.class, str);
    }

    public static InterstitialCreativeType[] values() {
        return (InterstitialCreativeType[]) $VALUES.clone();
    }
}
