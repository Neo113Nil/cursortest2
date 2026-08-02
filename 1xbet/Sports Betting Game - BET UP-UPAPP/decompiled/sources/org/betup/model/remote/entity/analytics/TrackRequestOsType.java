package org.betup.model.remote.entity.analytics;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrackRequestOsType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/model/remote/entity/analytics/TrackRequestOsType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "ANDROID", "IOS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrackRequestOsType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrackRequestOsType[] $VALUES;

    @SerializedName("android")
    public static final TrackRequestOsType ANDROID = new TrackRequestOsType("ANDROID", 0);

    @SerializedName("ios")
    public static final TrackRequestOsType IOS = new TrackRequestOsType("IOS", 1);

    private static final /* synthetic */ TrackRequestOsType[] $values() {
        return new TrackRequestOsType[]{ANDROID, IOS};
    }

    public static EnumEntries<TrackRequestOsType> getEntries() {
        return $ENTRIES;
    }

    private TrackRequestOsType(String str, int i) {
    }

    static {
        TrackRequestOsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TrackRequestOsType valueOf(String str) {
        return (TrackRequestOsType) Enum.valueOf(TrackRequestOsType.class, str);
    }

    public static TrackRequestOsType[] values() {
        return (TrackRequestOsType[]) $VALUES.clone();
    }
}
