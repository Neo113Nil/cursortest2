package org.betup.model.remote.api.rest.user.bets.models;

import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.media3.exoplayer.upstream.CmcdData;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Participation.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lorg/betup/model/remote/api/rest/user/bets/models/ParticipationStatus;", "", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "getI", "()I", "CANCELLED", "IN_PROGRESS", "WON", "LOST", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ParticipationStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ParticipationStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int i;
    public static final ParticipationStatus CANCELLED = new ParticipationStatus("CANCELLED", 0, 1);
    public static final ParticipationStatus IN_PROGRESS = new ParticipationStatus("IN_PROGRESS", 1, 2);
    public static final ParticipationStatus WON = new ParticipationStatus("WON", 2, 4);
    public static final ParticipationStatus LOST = new ParticipationStatus("LOST", 3, 8);

    private static final /* synthetic */ ParticipationStatus[] $values() {
        return new ParticipationStatus[]{CANCELLED, IN_PROGRESS, WON, LOST};
    }

    public static EnumEntries<ParticipationStatus> getEntries() {
        return $ENTRIES;
    }

    private ParticipationStatus(String str, int i, int i2) {
        this.i = i2;
    }

    public final int getI() {
        return this.i;
    }

    static {
        ParticipationStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Participation.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lorg/betup/model/remote/api/rest/user/bets/models/ParticipationStatus$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "from", "Lorg/betup/model/remote/api/rest/user/bets/models/ParticipationStatus;", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ParticipationStatus from(int i) {
            for (ParticipationStatus participationStatus : ParticipationStatus.getEntries()) {
                if (participationStatus.getI() == i) {
                    return participationStatus;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public static ParticipationStatus valueOf(String str) {
        return (ParticipationStatus) Enum.valueOf(ParticipationStatus.class, str);
    }

    public static ParticipationStatus[] values() {
        return (ParticipationStatus[]) $VALUES.clone();
    }
}
