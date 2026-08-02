package org.betup.ui.views;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import com.ironsource.Hc;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardTypes.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/views/CardValue;", "", "value", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardValue[] $VALUES;
    private final String value;

    @SerializedName("Two")
    public static final CardValue TWO = new CardValue("TWO", 0, ExifInterface.GPS_MEASUREMENT_2D);

    @SerializedName("Three")
    public static final CardValue THREE = new CardValue("THREE", 1, ExifInterface.GPS_MEASUREMENT_3D);

    @SerializedName("Four")
    public static final CardValue FOUR = new CardValue("FOUR", 2, "4");

    @SerializedName("Five")
    public static final CardValue FIVE = new CardValue("FIVE", 3, "5");

    @SerializedName("Six")
    public static final CardValue SIX = new CardValue("SIX", 4, "6");

    @SerializedName("Seven")
    public static final CardValue SEVEN = new CardValue("SEVEN", 5, Hc.e);

    @SerializedName("Eight")
    public static final CardValue EIGHT = new CardValue("EIGHT", 6, "8");

    @SerializedName("Nine")
    public static final CardValue NINE = new CardValue("NINE", 7, "9");

    @SerializedName("Ten")
    public static final CardValue TEN = new CardValue("TEN", 8, "10");

    @SerializedName("Jack")
    public static final CardValue JACK = new CardValue("JACK", 9, "J");

    @SerializedName("Queen")
    public static final CardValue QUEEN = new CardValue("QUEEN", 10, "Q");

    @SerializedName("King")
    public static final CardValue KING = new CardValue("KING", 11, "K");

    @SerializedName("Ace")
    public static final CardValue ACE = new CardValue("ACE", 12, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);

    private static final /* synthetic */ CardValue[] $values() {
        return new CardValue[]{TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};
    }

    public static EnumEntries<CardValue> getEntries() {
        return $ENTRIES;
    }

    private CardValue(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        CardValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static CardValue valueOf(String str) {
        return (CardValue) Enum.valueOf(CardValue.class, str);
    }

    public static CardValue[] values() {
        return (CardValue[]) $VALUES.clone();
    }
}
