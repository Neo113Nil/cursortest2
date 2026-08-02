package org.betup.games.warGame.model.rest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WarGameAction.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/betup/games/warGame/model/rest/WarGameAction;", "", "value", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GIVE_UP", "WAR", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WarGameAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WarGameAction[] $VALUES;

    @SerializedName("GiveUp")
    public static final WarGameAction GIVE_UP = new WarGameAction("GIVE_UP", 0, "GiveUp");

    @SerializedName("War")
    public static final WarGameAction WAR = new WarGameAction("WAR", 1, "War");
    private final String value;

    private static final /* synthetic */ WarGameAction[] $values() {
        return new WarGameAction[]{GIVE_UP, WAR};
    }

    public static EnumEntries<WarGameAction> getEntries() {
        return $ENTRIES;
    }

    private WarGameAction(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        WarGameAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static WarGameAction valueOf(String str) {
        return (WarGameAction) Enum.valueOf(WarGameAction.class, str);
    }

    public static WarGameAction[] values() {
        return (WarGameAction[]) $VALUES.clone();
    }
}
