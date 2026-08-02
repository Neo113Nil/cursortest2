package org.betup.model.remote.entity.analytics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrackEventParamType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lorg/betup/model/remote/entity/analytics/TrackEventParamType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "ProductId", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrackEventParamType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrackEventParamType[] $VALUES;
    public static final TrackEventParamType ProductId = new TrackEventParamType("ProductId", 0);

    private static final /* synthetic */ TrackEventParamType[] $values() {
        return new TrackEventParamType[]{ProductId};
    }

    public static EnumEntries<TrackEventParamType> getEntries() {
        return $ENTRIES;
    }

    private TrackEventParamType(String str, int i) {
    }

    static {
        TrackEventParamType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TrackEventParamType valueOf(String str) {
        return (TrackEventParamType) Enum.valueOf(TrackEventParamType.class, str);
    }

    public static TrackEventParamType[] values() {
        return (TrackEventParamType[]) $VALUES.clone();
    }
}
