package org.betup.ui.views;

import io.bidmachine.iab.vast.tags.VastTagName;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BetUpLabelView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/LabelBackground;", "", "value", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "getValue", "()I", "BLUE", "GREEN", "GOLD_DRAWABLE_ID", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LabelBackground {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LabelBackground[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final LabelBackground BLUE = new LabelBackground("BLUE", 0, R.color.stats_dark_blue_background);
    public static final LabelBackground GREEN = new LabelBackground("GREEN", 1, R.color.green_dark);
    public static final LabelBackground GOLD_DRAWABLE_ID = new LabelBackground("GOLD_DRAWABLE_ID", 2, R.drawable.betup_name_visible);

    private static final /* synthetic */ LabelBackground[] $values() {
        return new LabelBackground[]{BLUE, GREEN, GOLD_DRAWABLE_ID};
    }

    public static EnumEntries<LabelBackground> getEntries() {
        return $ENTRIES;
    }

    private LabelBackground(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        LabelBackground[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: BetUpLabelView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/views/LabelBackground$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getLabelBackgroundByNumber", "Lorg/betup/ui/views/LabelBackground;", RRWebVideoEvent.REPLAY_FRAME_RATE_TYPE_VARIABLE, "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LabelBackground getLabelBackgroundByNumber(String variable) {
            return Intrinsics.areEqual(variable, "0") ? LabelBackground.BLUE : LabelBackground.GREEN;
        }
    }

    public static LabelBackground valueOf(String str) {
        return (LabelBackground) Enum.valueOf(LabelBackground.class, str);
    }

    public static LabelBackground[] values() {
        return (LabelBackground[]) $VALUES.clone();
    }
}
