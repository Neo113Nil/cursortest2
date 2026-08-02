package org.betup.model.remote.api.rest.user.bets.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Participation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/model/remote/api/rest/user/bets/models/ParticipationTier;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "GOLD", "SILVER", "BRONZE", "NONE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ParticipationTier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ParticipationTier[] $VALUES;
    public static final ParticipationTier GOLD = new ParticipationTier("GOLD", 0);
    public static final ParticipationTier SILVER = new ParticipationTier("SILVER", 1);
    public static final ParticipationTier BRONZE = new ParticipationTier("BRONZE", 2);
    public static final ParticipationTier NONE = new ParticipationTier("NONE", 3);

    private static final /* synthetic */ ParticipationTier[] $values() {
        return new ParticipationTier[]{GOLD, SILVER, BRONZE, NONE};
    }

    public static EnumEntries<ParticipationTier> getEntries() {
        return $ENTRIES;
    }

    private ParticipationTier(String str, int i) {
    }

    static {
        ParticipationTier[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ParticipationTier valueOf(String str) {
        return (ParticipationTier) Enum.valueOf(ParticipationTier.class, str);
    }

    public static ParticipationTier[] values() {
        return (ParticipationTier[]) $VALUES.clone();
    }
}
