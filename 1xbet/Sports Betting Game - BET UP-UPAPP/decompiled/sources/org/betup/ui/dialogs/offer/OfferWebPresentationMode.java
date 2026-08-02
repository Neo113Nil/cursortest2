package org.betup.ui.dialogs.offer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfferWebPresentation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferWebPresentationMode;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "None", "RemoteUrl", "InlineHtml", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferWebPresentationMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OfferWebPresentationMode[] $VALUES;
    public static final OfferWebPresentationMode None = new OfferWebPresentationMode("None", 0);
    public static final OfferWebPresentationMode RemoteUrl = new OfferWebPresentationMode("RemoteUrl", 1);
    public static final OfferWebPresentationMode InlineHtml = new OfferWebPresentationMode("InlineHtml", 2);

    private static final /* synthetic */ OfferWebPresentationMode[] $values() {
        return new OfferWebPresentationMode[]{None, RemoteUrl, InlineHtml};
    }

    public static EnumEntries<OfferWebPresentationMode> getEntries() {
        return $ENTRIES;
    }

    private OfferWebPresentationMode(String str, int i) {
    }

    static {
        OfferWebPresentationMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static OfferWebPresentationMode valueOf(String str) {
        return (OfferWebPresentationMode) Enum.valueOf(OfferWebPresentationMode.class, str);
    }

    public static OfferWebPresentationMode[] values() {
        return (OfferWebPresentationMode[]) $VALUES.clone();
    }
}
