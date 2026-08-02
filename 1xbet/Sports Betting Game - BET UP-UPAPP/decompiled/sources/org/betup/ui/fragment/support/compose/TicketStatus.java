package org.betup.ui.fragment.support.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/fragment/support/compose/TicketStatus;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "ACTIVE", "CLOSED", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TicketStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TicketStatus[] $VALUES;
    public static final TicketStatus ACTIVE = new TicketStatus("ACTIVE", 0);
    public static final TicketStatus CLOSED = new TicketStatus("CLOSED", 1);

    private static final /* synthetic */ TicketStatus[] $values() {
        return new TicketStatus[]{ACTIVE, CLOSED};
    }

    public static EnumEntries<TicketStatus> getEntries() {
        return $ENTRIES;
    }

    private TicketStatus(String str, int i) {
    }

    static {
        TicketStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TicketStatus valueOf(String str) {
        return (TicketStatus) Enum.valueOf(TicketStatus.class, str);
    }

    public static TicketStatus[] values() {
        return (TicketStatus[]) $VALUES.clone();
    }
}
