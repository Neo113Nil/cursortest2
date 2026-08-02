package org.betup.model.remote.entity.matches.history;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewMatchHistoryResponseModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/model/remote/entity/matches/history/MatchHistoryType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "PREVIOUS_MEETINGS", "RECENT_GAMES", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MatchHistoryType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MatchHistoryType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MatchHistoryType PREVIOUS_MEETINGS = new MatchHistoryType("PREVIOUS_MEETINGS", 0);
    public static final MatchHistoryType RECENT_GAMES = new MatchHistoryType("RECENT_GAMES", 1);

    private static final /* synthetic */ MatchHistoryType[] $values() {
        return new MatchHistoryType[]{PREVIOUS_MEETINGS, RECENT_GAMES};
    }

    public static EnumEntries<MatchHistoryType> getEntries() {
        return $ENTRIES;
    }

    private MatchHistoryType(String str, int i) {
    }

    static {
        MatchHistoryType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: NewMatchHistoryResponseModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lorg/betup/model/remote/entity/matches/history/MatchHistoryType$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "fromString", "Lorg/betup/model/remote/entity/matches/history/MatchHistoryType;", "value", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MatchHistoryType fromString(String value) {
            Object obj;
            Iterator<E> it = MatchHistoryType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((MatchHistoryType) obj).name(), value)) {
                    break;
                }
            }
            return (MatchHistoryType) obj;
        }
    }

    public static MatchHistoryType valueOf(String str) {
        return (MatchHistoryType) Enum.valueOf(MatchHistoryType.class, str);
    }

    public static MatchHistoryType[] values() {
        return (MatchHistoryType[]) $VALUES.clone();
    }
}
