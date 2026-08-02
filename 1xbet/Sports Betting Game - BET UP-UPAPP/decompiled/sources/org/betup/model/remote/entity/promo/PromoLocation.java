package org.betup.model.remote.entity.promo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoBanner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/model/remote/entity/promo/PromoLocation;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Header", "Bets", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoLocation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PromoLocation[] $VALUES;
    public static final PromoLocation Header = new PromoLocation("Header", 0);
    public static final PromoLocation Bets = new PromoLocation("Bets", 1);

    private static final /* synthetic */ PromoLocation[] $values() {
        return new PromoLocation[]{Header, Bets};
    }

    public static EnumEntries<PromoLocation> getEntries() {
        return $ENTRIES;
    }

    private PromoLocation(String str, int i) {
    }

    static {
        PromoLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static PromoLocation valueOf(String str) {
        return (PromoLocation) Enum.valueOf(PromoLocation.class, str);
    }

    public static PromoLocation[] values() {
        return (PromoLocation[]) $VALUES.clone();
    }
}
