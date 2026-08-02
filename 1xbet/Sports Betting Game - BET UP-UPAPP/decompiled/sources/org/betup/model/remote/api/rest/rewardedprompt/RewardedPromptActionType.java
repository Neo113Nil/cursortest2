package org.betup.model.remote.api.rest.rewardedprompt;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RewardedPromptInteractors.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/model/remote/api/rest/rewardedprompt/RewardedPromptActionType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "IMPRESSION", "DISMISS", "WATCH_STARTED", "WATCH_COMPLETED", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RewardedPromptActionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardedPromptActionType[] $VALUES;
    public static final RewardedPromptActionType IMPRESSION = new RewardedPromptActionType("IMPRESSION", 0);
    public static final RewardedPromptActionType DISMISS = new RewardedPromptActionType("DISMISS", 1);
    public static final RewardedPromptActionType WATCH_STARTED = new RewardedPromptActionType("WATCH_STARTED", 2);
    public static final RewardedPromptActionType WATCH_COMPLETED = new RewardedPromptActionType("WATCH_COMPLETED", 3);

    private static final /* synthetic */ RewardedPromptActionType[] $values() {
        return new RewardedPromptActionType[]{IMPRESSION, DISMISS, WATCH_STARTED, WATCH_COMPLETED};
    }

    public static EnumEntries<RewardedPromptActionType> getEntries() {
        return $ENTRIES;
    }

    private RewardedPromptActionType(String str, int i) {
    }

    static {
        RewardedPromptActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static RewardedPromptActionType valueOf(String str) {
        return (RewardedPromptActionType) Enum.valueOf(RewardedPromptActionType.class, str);
    }

    public static RewardedPromptActionType[] values() {
        return (RewardedPromptActionType[]) $VALUES.clone();
    }
}
