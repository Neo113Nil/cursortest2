package org.betup.ui.dialogs.offer.content;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfferSubtitleContentType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/dialogs/offer/content/OfferSubtitleContentType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "HTML", "PLAIN_TEXT", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferSubtitleContentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OfferSubtitleContentType[] $VALUES;
    public static final OfferSubtitleContentType HTML = new OfferSubtitleContentType("HTML", 0);
    public static final OfferSubtitleContentType PLAIN_TEXT = new OfferSubtitleContentType("PLAIN_TEXT", 1);

    private static final /* synthetic */ OfferSubtitleContentType[] $values() {
        return new OfferSubtitleContentType[]{HTML, PLAIN_TEXT};
    }

    public static EnumEntries<OfferSubtitleContentType> getEntries() {
        return $ENTRIES;
    }

    private OfferSubtitleContentType(String str, int i) {
    }

    static {
        OfferSubtitleContentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static OfferSubtitleContentType valueOf(String str) {
        return (OfferSubtitleContentType) Enum.valueOf(OfferSubtitleContentType.class, str);
    }

    public static OfferSubtitleContentType[] values() {
        return (OfferSubtitleContentType[]) $VALUES.clone();
    }
}
