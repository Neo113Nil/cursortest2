package org.betup.ui.views;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardTypes.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/CardSuite;", "", "value", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "getValue", "()I", "SPADES", "HEARTS", "DIAMONDS", "CLUBS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardSuite {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardSuite[] $VALUES;
    private final int value;

    @SerializedName("Spades")
    public static final CardSuite SPADES = new CardSuite("SPADES", 0, R.drawable.spades_icon);

    @SerializedName("Hearts")
    public static final CardSuite HEARTS = new CardSuite("HEARTS", 1, R.drawable.hearts_icon);

    @SerializedName("Diamonds")
    public static final CardSuite DIAMONDS = new CardSuite("DIAMONDS", 2, R.drawable.diamonds_icon);

    @SerializedName("Clubs")
    public static final CardSuite CLUBS = new CardSuite("CLUBS", 3, R.drawable.clubs_icon);

    private static final /* synthetic */ CardSuite[] $values() {
        return new CardSuite[]{SPADES, HEARTS, DIAMONDS, CLUBS};
    }

    public static EnumEntries<CardSuite> getEntries() {
        return $ENTRIES;
    }

    private CardSuite(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CardSuite[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static CardSuite valueOf(String str) {
        return (CardSuite) Enum.valueOf(CardSuite.class, str);
    }

    public static CardSuite[] values() {
        return (CardSuite[]) $VALUES.clone();
    }
}
