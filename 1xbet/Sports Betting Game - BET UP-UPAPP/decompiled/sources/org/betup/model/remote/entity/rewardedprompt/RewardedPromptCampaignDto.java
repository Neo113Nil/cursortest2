package org.betup.model.remote.entity.rewardedprompt;

import com.ironsource.K1;
import com.ironsource.X3;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RewardedPromptDtos.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00100J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u008e\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u00072\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\tHÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00101\u001a\u0004\b2\u00100R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u00108¨\u0006X"}, d2 = {"Lorg/betup/model/remote/entity/rewardedprompt/RewardedPromptCampaignDto;", "", "id", "", "slug", "name", "enabled", "", "priority", "", X3.k, K1.l, "", "screenKeys", "triggerMatchMode", "userTags", "tourCompletion", "osTypes", "minBuild", "maxBuild", "frequencyMode", "maxImpressionsPerUser", "maxImpressionsPerDay", "cooldownMinutes", "startAt", "Ljava/util/Date;", "endAt", "createdAt", "updatedAt", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IIILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "getSlug", "getName", "getEnabled", "()Z", "getPriority", "()I", "getPlacementId", "getTriggerEvents", "()Ljava/util/List;", "getScreenKeys", "getTriggerMatchMode", "getUserTags", "getTourCompletion", "getOsTypes", "getMinBuild", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxBuild", "getFrequencyMode", "getMaxImpressionsPerUser", "getMaxImpressionsPerDay", "getCooldownMinutes", "getStartAt", "()Ljava/util/Date;", "getEndAt", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IIILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lorg/betup/model/remote/entity/rewardedprompt/RewardedPromptCampaignDto;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RewardedPromptCampaignDto {
    public static final int $stable = 8;
    private final int cooldownMinutes;
    private final Date createdAt;
    private final boolean enabled;
    private final Date endAt;
    private final String frequencyMode;
    private final String id;
    private final Integer maxBuild;
    private final int maxImpressionsPerDay;
    private final int maxImpressionsPerUser;
    private final Integer minBuild;
    private final String name;
    private final List<String> osTypes;
    private final String placementId;
    private final int priority;
    private final List<String> screenKeys;
    private final String slug;
    private final Date startAt;
    private final String tourCompletion;
    private final List<String> triggerEvents;
    private final String triggerMatchMode;
    private final Date updatedAt;
    private final List<String> userTags;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.userTags;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTourCompletion() {
        return this.tourCompletion;
    }

    public final List<String> component12() {
        return this.osTypes;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getMinBuild() {
        return this.minBuild;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getMaxBuild() {
        return this.maxBuild;
    }

    /* renamed from: component15, reason: from getter */
    public final String getFrequencyMode() {
        return this.frequencyMode;
    }

    /* renamed from: component16, reason: from getter */
    public final int getMaxImpressionsPerUser() {
        return this.maxImpressionsPerUser;
    }

    /* renamed from: component17, reason: from getter */
    public final int getMaxImpressionsPerDay() {
        return this.maxImpressionsPerDay;
    }

    /* renamed from: component18, reason: from getter */
    public final int getCooldownMinutes() {
        return this.cooldownMinutes;
    }

    /* renamed from: component19, reason: from getter */
    public final Date getStartAt() {
        return this.startAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component20, reason: from getter */
    public final Date getEndAt() {
        return this.endAt;
    }

    /* renamed from: component21, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component22, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    public final List<String> component7() {
        return this.triggerEvents;
    }

    public final List<String> component8() {
        return this.screenKeys;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTriggerMatchMode() {
        return this.triggerMatchMode;
    }

    public final RewardedPromptCampaignDto copy(String id, String slug, String name, boolean enabled, int priority, String placementId, List<String> triggerEvents, List<String> screenKeys, String triggerMatchMode, List<String> userTags, String tourCompletion, List<String> osTypes, Integer minBuild, Integer maxBuild, String frequencyMode, int maxImpressionsPerUser, int maxImpressionsPerDay, int cooldownMinutes, Date startAt, Date endAt, Date createdAt, Date updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(triggerEvents, "triggerEvents");
        Intrinsics.checkNotNullParameter(screenKeys, "screenKeys");
        Intrinsics.checkNotNullParameter(triggerMatchMode, "triggerMatchMode");
        Intrinsics.checkNotNullParameter(userTags, "userTags");
        Intrinsics.checkNotNullParameter(tourCompletion, "tourCompletion");
        Intrinsics.checkNotNullParameter(osTypes, "osTypes");
        Intrinsics.checkNotNullParameter(frequencyMode, "frequencyMode");
        return new RewardedPromptCampaignDto(id, slug, name, enabled, priority, placementId, triggerEvents, screenKeys, triggerMatchMode, userTags, tourCompletion, osTypes, minBuild, maxBuild, frequencyMode, maxImpressionsPerUser, maxImpressionsPerDay, cooldownMinutes, startAt, endAt, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardedPromptCampaignDto)) {
            return false;
        }
        RewardedPromptCampaignDto rewardedPromptCampaignDto = (RewardedPromptCampaignDto) other;
        return Intrinsics.areEqual(this.id, rewardedPromptCampaignDto.id) && Intrinsics.areEqual(this.slug, rewardedPromptCampaignDto.slug) && Intrinsics.areEqual(this.name, rewardedPromptCampaignDto.name) && this.enabled == rewardedPromptCampaignDto.enabled && this.priority == rewardedPromptCampaignDto.priority && Intrinsics.areEqual(this.placementId, rewardedPromptCampaignDto.placementId) && Intrinsics.areEqual(this.triggerEvents, rewardedPromptCampaignDto.triggerEvents) && Intrinsics.areEqual(this.screenKeys, rewardedPromptCampaignDto.screenKeys) && Intrinsics.areEqual(this.triggerMatchMode, rewardedPromptCampaignDto.triggerMatchMode) && Intrinsics.areEqual(this.userTags, rewardedPromptCampaignDto.userTags) && Intrinsics.areEqual(this.tourCompletion, rewardedPromptCampaignDto.tourCompletion) && Intrinsics.areEqual(this.osTypes, rewardedPromptCampaignDto.osTypes) && Intrinsics.areEqual(this.minBuild, rewardedPromptCampaignDto.minBuild) && Intrinsics.areEqual(this.maxBuild, rewardedPromptCampaignDto.maxBuild) && Intrinsics.areEqual(this.frequencyMode, rewardedPromptCampaignDto.frequencyMode) && this.maxImpressionsPerUser == rewardedPromptCampaignDto.maxImpressionsPerUser && this.maxImpressionsPerDay == rewardedPromptCampaignDto.maxImpressionsPerDay && this.cooldownMinutes == rewardedPromptCampaignDto.cooldownMinutes && Intrinsics.areEqual(this.startAt, rewardedPromptCampaignDto.startAt) && Intrinsics.areEqual(this.endAt, rewardedPromptCampaignDto.endAt) && Intrinsics.areEqual(this.createdAt, rewardedPromptCampaignDto.createdAt) && Intrinsics.areEqual(this.updatedAt, rewardedPromptCampaignDto.updatedAt);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.id.hashCode() * 31) + this.slug.hashCode()) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Integer.hashCode(this.priority)) * 31) + this.placementId.hashCode()) * 31) + this.triggerEvents.hashCode()) * 31) + this.screenKeys.hashCode()) * 31) + this.triggerMatchMode.hashCode()) * 31) + this.userTags.hashCode()) * 31) + this.tourCompletion.hashCode()) * 31) + this.osTypes.hashCode()) * 31;
        Integer num = this.minBuild;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxBuild;
        int hashCode3 = (((((((((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.frequencyMode.hashCode()) * 31) + Integer.hashCode(this.maxImpressionsPerUser)) * 31) + Integer.hashCode(this.maxImpressionsPerDay)) * 31) + Integer.hashCode(this.cooldownMinutes)) * 31;
        Date date = this.startAt;
        int hashCode4 = (hashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endAt;
        int hashCode5 = (hashCode4 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.createdAt;
        int hashCode6 = (hashCode5 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.updatedAt;
        return hashCode6 + (date4 != null ? date4.hashCode() : 0);
    }

    public String toString() {
        return "RewardedPromptCampaignDto(id=" + this.id + ", slug=" + this.slug + ", name=" + this.name + ", enabled=" + this.enabled + ", priority=" + this.priority + ", placementId=" + this.placementId + ", triggerEvents=" + this.triggerEvents + ", screenKeys=" + this.screenKeys + ", triggerMatchMode=" + this.triggerMatchMode + ", userTags=" + this.userTags + ", tourCompletion=" + this.tourCompletion + ", osTypes=" + this.osTypes + ", minBuild=" + this.minBuild + ", maxBuild=" + this.maxBuild + ", frequencyMode=" + this.frequencyMode + ", maxImpressionsPerUser=" + this.maxImpressionsPerUser + ", maxImpressionsPerDay=" + this.maxImpressionsPerDay + ", cooldownMinutes=" + this.cooldownMinutes + ", startAt=" + this.startAt + ", endAt=" + this.endAt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public RewardedPromptCampaignDto(String id, String slug, String name, boolean z, int i, String placementId, List<String> triggerEvents, List<String> screenKeys, String triggerMatchMode, List<String> userTags, String tourCompletion, List<String> osTypes, Integer num, Integer num2, String frequencyMode, int i2, int i3, int i4, Date date, Date date2, Date date3, Date date4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(triggerEvents, "triggerEvents");
        Intrinsics.checkNotNullParameter(screenKeys, "screenKeys");
        Intrinsics.checkNotNullParameter(triggerMatchMode, "triggerMatchMode");
        Intrinsics.checkNotNullParameter(userTags, "userTags");
        Intrinsics.checkNotNullParameter(tourCompletion, "tourCompletion");
        Intrinsics.checkNotNullParameter(osTypes, "osTypes");
        Intrinsics.checkNotNullParameter(frequencyMode, "frequencyMode");
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.enabled = z;
        this.priority = i;
        this.placementId = placementId;
        this.triggerEvents = triggerEvents;
        this.screenKeys = screenKeys;
        this.triggerMatchMode = triggerMatchMode;
        this.userTags = userTags;
        this.tourCompletion = tourCompletion;
        this.osTypes = osTypes;
        this.minBuild = num;
        this.maxBuild = num2;
        this.frequencyMode = frequencyMode;
        this.maxImpressionsPerUser = i2;
        this.maxImpressionsPerDay = i3;
        this.cooldownMinutes = i4;
        this.startAt = date;
        this.endAt = date2;
        this.createdAt = date3;
        this.updatedAt = date4;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ RewardedPromptCampaignDto(String str, String str2, String str3, boolean z, int i, String str4, List list, List list2, String str5, List list3, String str6, List list4, Integer num, Integer num2, String str7, int i2, int i3, int i4, Date date, Date date2, Date date3, Date date4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, i, str4, (i5 & 64) != 0 ? CollectionsKt.emptyList() : list, (i5 & 128) != 0 ? CollectionsKt.emptyList() : list2, (i5 & 256) != 0 ? "ANY" : str5, (i5 & 512) != 0 ? CollectionsKt.emptyList() : list3, (i5 & 1024) != 0 ? "any" : str6, (i5 & 2048) != 0 ? CollectionsKt.emptyList() : list4, (i5 & 4096) != 0 ? null : num, (i5 & 8192) != 0 ? null : num2, (i5 & 16384) != 0 ? "N_PER_DAY" : str7, (32768 & i5) != 0 ? 1000 : i2, (65536 & i5) != 0 ? 3 : i3, (131072 & i5) != 0 ? 60 : i4, (262144 & i5) != 0 ? null : date, (524288 & i5) != 0 ? null : date2, (1048576 & i5) != 0 ? null : date3, (i5 & 2097152) != 0 ? null : date4);
    }

    public final List<String> getTriggerEvents() {
        return this.triggerEvents;
    }

    public final List<String> getScreenKeys() {
        return this.screenKeys;
    }

    public final String getTriggerMatchMode() {
        return this.triggerMatchMode;
    }

    public final List<String> getUserTags() {
        return this.userTags;
    }

    public final String getTourCompletion() {
        return this.tourCompletion;
    }

    public final List<String> getOsTypes() {
        return this.osTypes;
    }

    public final Integer getMinBuild() {
        return this.minBuild;
    }

    public final Integer getMaxBuild() {
        return this.maxBuild;
    }

    public final String getFrequencyMode() {
        return this.frequencyMode;
    }

    public final int getMaxImpressionsPerUser() {
        return this.maxImpressionsPerUser;
    }

    public final int getMaxImpressionsPerDay() {
        return this.maxImpressionsPerDay;
    }

    public final int getCooldownMinutes() {
        return this.cooldownMinutes;
    }

    public final Date getStartAt() {
        return this.startAt;
    }

    public final Date getEndAt() {
        return this.endAt;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }
}
