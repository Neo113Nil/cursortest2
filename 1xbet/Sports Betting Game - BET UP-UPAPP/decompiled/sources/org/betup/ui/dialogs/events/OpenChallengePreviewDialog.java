package org.betup.ui.dialogs.events;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lorg/betup/ui/dialogs/events/OpenChallengePreviewDialog;", "", "challengeId", "", "challengeIds", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Integer;Ljava/util/List;)V", "getChallengeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChallengeIds", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lorg/betup/ui/dialogs/events/OpenChallengePreviewDialog;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OpenChallengePreviewDialog {
    public static final int $stable = 8;
    private final Integer challengeId;
    private final List<Integer> challengeIds;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenChallengePreviewDialog copy$default(OpenChallengePreviewDialog openChallengePreviewDialog, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = openChallengePreviewDialog.challengeId;
        }
        if ((i & 2) != 0) {
            list = openChallengePreviewDialog.challengeIds;
        }
        return openChallengePreviewDialog.copy(num, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getChallengeId() {
        return this.challengeId;
    }

    public final List<Integer> component2() {
        return this.challengeIds;
    }

    public final OpenChallengePreviewDialog copy(Integer challengeId, List<Integer> challengeIds) {
        return new OpenChallengePreviewDialog(challengeId, challengeIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenChallengePreviewDialog)) {
            return false;
        }
        OpenChallengePreviewDialog openChallengePreviewDialog = (OpenChallengePreviewDialog) other;
        return Intrinsics.areEqual(this.challengeId, openChallengePreviewDialog.challengeId) && Intrinsics.areEqual(this.challengeIds, openChallengePreviewDialog.challengeIds);
    }

    public int hashCode() {
        Integer num = this.challengeId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Integer> list = this.challengeIds;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "OpenChallengePreviewDialog(challengeId=" + this.challengeId + ", challengeIds=" + this.challengeIds + ")";
    }

    public OpenChallengePreviewDialog(Integer num, List<Integer> list) {
        this.challengeId = num;
        this.challengeIds = list;
    }

    public /* synthetic */ OpenChallengePreviewDialog(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? null : list);
    }

    public final Integer getChallengeId() {
        return this.challengeId;
    }

    public final List<Integer> getChallengeIds() {
        return this.challengeIds;
    }
}
