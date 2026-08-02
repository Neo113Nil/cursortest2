package org.betup.domain.quest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.quest.UserDailyQuestAssignedTaskDto;
import org.betup.model.remote.entity.quest.UserDailyQuestInstanceDto;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyQuestMapper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¨\u0006\u0011"}, d2 = {"Lorg/betup/domain/quest/DailyQuestMapper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "toDomain", "Lorg/betup/domain/quest/DailyQuest;", "dto", "Lorg/betup/model/remote/entity/quest/UserDailyQuestInstanceDto;", "toTaskDomain", "Lorg/betup/domain/quest/DailyQuestTask;", "Lorg/betup/model/remote/entity/quest/UserDailyQuestAssignedTaskDto;", "parseQuestStatus", "Lorg/betup/domain/quest/DailyQuestStatus;", "raw", "", "parseTaskStatus", "Lorg/betup/domain/quest/DailyQuestTaskStatus;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DailyQuestMapper {
    public static final int $stable = 0;
    public static final DailyQuestMapper INSTANCE = new DailyQuestMapper();

    private DailyQuestMapper() {
    }

    public final DailyQuest toDomain(UserDailyQuestInstanceDto dto) {
        boolean z;
        Intrinsics.checkNotNullParameter(dto, "dto");
        DailyQuestStatus parseQuestStatus = parseQuestStatus(dto.getStatus());
        List<UserDailyQuestAssignedTaskDto> tasks = dto.getTasks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tasks, 10));
        Iterator<T> it = tasks.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.toTaskDomain((UserDailyQuestAssignedTaskDto) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = arrayList2;
            if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (!((DailyQuestTask) it2.next()).isCompleted()) {
                    }
                }
            }
            z = true;
            return new DailyQuest(dto.getId(), dto.getTitle(), dto.getDescription(), dto.getCoverImageUrl(), dto.getRewardBetcoins(), parseQuestStatus, dto.getExpiresAt().getTime(), arrayList2, dto.getRewardClaimed(), (parseQuestStatus == DailyQuestStatus.COMPLETED || dto.getRewardClaimed() || !z) ? false : true, parseQuestStatus != DailyQuestStatus.PENDING || parseQuestStatus == DailyQuestStatus.COMPLETED);
        }
        z = false;
        return new DailyQuest(dto.getId(), dto.getTitle(), dto.getDescription(), dto.getCoverImageUrl(), dto.getRewardBetcoins(), parseQuestStatus, dto.getExpiresAt().getTime(), arrayList2, dto.getRewardClaimed(), (parseQuestStatus == DailyQuestStatus.COMPLETED || dto.getRewardClaimed() || !z) ? false : true, parseQuestStatus != DailyQuestStatus.PENDING || parseQuestStatus == DailyQuestStatus.COMPLETED);
    }

    private final DailyQuestTask toTaskDomain(UserDailyQuestAssignedTaskDto dto) {
        DailyQuestTaskStatus parseTaskStatus = parseTaskStatus(dto.getStatus());
        String id = dto.getId();
        String name = dto.getName();
        String description = dto.getDescription();
        String taskType = dto.getTaskType();
        String navigationTarget = dto.getNavigationTarget();
        int progressCurrent = dto.getProgressCurrent();
        Integer valueOf = Integer.valueOf(dto.getProgressTarget());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        return new DailyQuestTask(id, name, description, taskType, navigationTarget, progressCurrent, valueOf != null ? valueOf.intValue() : 100, parseTaskStatus, dto.getIconUrl(), parseTaskStatus == DailyQuestTaskStatus.COMPLETED, dto.getRewardBetcoins());
    }

    private final DailyQuestStatus parseQuestStatus(String raw) {
        Object m10853constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            DailyQuestMapper dailyQuestMapper = this;
            if (raw == null) {
                raw = "";
            }
            String upperCase = StringsKt.trim((CharSequence) raw).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            m10853constructorimpl = Result.m10853constructorimpl(DailyQuestStatus.valueOf(upperCase));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        DailyQuestStatus dailyQuestStatus = DailyQuestStatus.UNKNOWN;
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = dailyQuestStatus;
        }
        return (DailyQuestStatus) m10853constructorimpl;
    }

    private final DailyQuestTaskStatus parseTaskStatus(String raw) {
        Object m10853constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            DailyQuestMapper dailyQuestMapper = this;
            if (raw == null) {
                raw = "";
            }
            String upperCase = StringsKt.trim((CharSequence) raw).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            m10853constructorimpl = Result.m10853constructorimpl(DailyQuestTaskStatus.valueOf(upperCase));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        DailyQuestTaskStatus dailyQuestTaskStatus = DailyQuestTaskStatus.UNKNOWN;
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = dailyQuestTaskStatus;
        }
        return (DailyQuestTaskStatus) m10853constructorimpl;
    }
}
