package org.betup.games.warGame.ui.animation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WarGameAnimationHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/betup/games/warGame/ui/animation/TargetAnimation;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "HIDE_BET_DIALOG", "SHOW_BET_DIALOG", "HIDE_DRAW_DIALOG", "SHOW_DRAW_DIALOG", "HIDE_RESULT_DIALOG", "SHOW_RESULT_DIALOG", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TargetAnimation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TargetAnimation[] $VALUES;
    public static final TargetAnimation HIDE_BET_DIALOG = new TargetAnimation("HIDE_BET_DIALOG", 0);
    public static final TargetAnimation SHOW_BET_DIALOG = new TargetAnimation("SHOW_BET_DIALOG", 1);
    public static final TargetAnimation HIDE_DRAW_DIALOG = new TargetAnimation("HIDE_DRAW_DIALOG", 2);
    public static final TargetAnimation SHOW_DRAW_DIALOG = new TargetAnimation("SHOW_DRAW_DIALOG", 3);
    public static final TargetAnimation HIDE_RESULT_DIALOG = new TargetAnimation("HIDE_RESULT_DIALOG", 4);
    public static final TargetAnimation SHOW_RESULT_DIALOG = new TargetAnimation("SHOW_RESULT_DIALOG", 5);

    private static final /* synthetic */ TargetAnimation[] $values() {
        return new TargetAnimation[]{HIDE_BET_DIALOG, SHOW_BET_DIALOG, HIDE_DRAW_DIALOG, SHOW_DRAW_DIALOG, HIDE_RESULT_DIALOG, SHOW_RESULT_DIALOG};
    }

    public static EnumEntries<TargetAnimation> getEntries() {
        return $ENTRIES;
    }

    private TargetAnimation(String str, int i) {
    }

    static {
        TargetAnimation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TargetAnimation valueOf(String str) {
        return (TargetAnimation) Enum.valueOf(TargetAnimation.class, str);
    }

    public static TargetAnimation[] values() {
        return (TargetAnimation[]) $VALUES.clone();
    }
}
