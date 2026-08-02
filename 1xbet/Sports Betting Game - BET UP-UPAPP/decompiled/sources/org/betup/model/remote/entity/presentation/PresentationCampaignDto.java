package org.betup.model.remote.entity.presentation;

import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationCampaignDto.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bG\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b \u0010!J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rHÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010P\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\t\u0010Q\u001a\u00020\tHÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\t\u0010V\u001a\u00020\u0007HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\t\u0010X\u001a\u00020\u0019HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0019HÆ\u0003J´\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020\u00072\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\tHÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00106\u001a\u0004\b7\u00105R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0011\u0010\u001b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010'R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010'R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00106\u001a\u0004\b?\u00105R\u0011\u0010\u001e\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b@\u0010;R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bA\u0010;¨\u0006`"}, d2 = {"Lorg/betup/model/remote/entity/presentation/PresentationCampaignDto;", "", "id", "", "slug", "name", "enabled", "", "priority", "", "htmlContent", "remoteUrl", "templateMeta", "", "screenKeys", "", "eventKeys", "userTags", "tourCompletion", "osTypes", "minBuild", "maxBuild", "maxViewsPerUser", "cooldownMinutes", "startAt", "Ljava/util/Date;", "endAt", "allowSkip", "allowRemindLater", "remindLaterMinutes", "createdAt", "updatedAt", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;IILjava/util/Date;Ljava/util/Date;ZZLjava/lang/Integer;Ljava/util/Date;Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "getSlug", "getName", "getEnabled", "()Z", "getPriority", "()I", "getHtmlContent", "getRemoteUrl", "getTemplateMeta", "()Ljava/util/Map;", "getScreenKeys", "()Ljava/util/List;", "getEventKeys", "getUserTags", "getTourCompletion", "getOsTypes", "getMinBuild", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxBuild", "getMaxViewsPerUser", "getCooldownMinutes", "getStartAt", "()Ljava/util/Date;", "getEndAt", "getAllowSkip", "getAllowRemindLater", "getRemindLaterMinutes", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;IILjava/util/Date;Ljava/util/Date;ZZLjava/lang/Integer;Ljava/util/Date;Ljava/util/Date;)Lorg/betup/model/remote/entity/presentation/PresentationCampaignDto;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PresentationCampaignDto {
    public static final int $stable = 8;
    private final boolean allowRemindLater;
    private final boolean allowSkip;
    private final int cooldownMinutes;
    private final Date createdAt;
    private final boolean enabled;
    private final Date endAt;
    private final List<String> eventKeys;
    private final String htmlContent;
    private final String id;
    private final Integer maxBuild;
    private final int maxViewsPerUser;
    private final Integer minBuild;
    private final String name;
    private final List<String> osTypes;
    private final int priority;
    private final Integer remindLaterMinutes;
    private final String remoteUrl;
    private final List<String> screenKeys;
    private final String slug;
    private final Date startAt;
    private final Map<String, Object> templateMeta;
    private final String tourCompletion;
    private final Date updatedAt;
    private final List<String> userTags;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.eventKeys;
    }

    public final List<String> component11() {
        return this.userTags;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTourCompletion() {
        return this.tourCompletion;
    }

    public final List<String> component13() {
        return this.osTypes;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getMinBuild() {
        return this.minBuild;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getMaxBuild() {
        return this.maxBuild;
    }

    /* renamed from: component16, reason: from getter */
    public final int getMaxViewsPerUser() {
        return this.maxViewsPerUser;
    }

    /* renamed from: component17, reason: from getter */
    public final int getCooldownMinutes() {
        return this.cooldownMinutes;
    }

    /* renamed from: component18, reason: from getter */
    public final Date getStartAt() {
        return this.startAt;
    }

    /* renamed from: component19, reason: from getter */
    public final Date getEndAt() {
        return this.endAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getAllowSkip() {
        return this.allowSkip;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getAllowRemindLater() {
        return this.allowRemindLater;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getRemindLaterMinutes() {
        return this.remindLaterMinutes;
    }

    /* renamed from: component23, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component24, reason: from getter */
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
    public final String getHtmlContent() {
        return this.htmlContent;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    public final Map<String, Object> component8() {
        return this.templateMeta;
    }

    public final List<String> component9() {
        return this.screenKeys;
    }

    public final PresentationCampaignDto copy(String id, String slug, String name, boolean enabled, int priority, String htmlContent, String remoteUrl, Map<String, ? extends Object> templateMeta, List<String> screenKeys, List<String> eventKeys, List<String> userTags, String tourCompletion, List<String> osTypes, Integer minBuild, Integer maxBuild, int maxViewsPerUser, int cooldownMinutes, Date startAt, Date endAt, boolean allowSkip, boolean allowRemindLater, Integer remindLaterMinutes, Date createdAt, Date updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(templateMeta, "templateMeta");
        Intrinsics.checkNotNullParameter(screenKeys, "screenKeys");
        Intrinsics.checkNotNullParameter(eventKeys, "eventKeys");
        Intrinsics.checkNotNullParameter(userTags, "userTags");
        Intrinsics.checkNotNullParameter(tourCompletion, "tourCompletion");
        Intrinsics.checkNotNullParameter(osTypes, "osTypes");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new PresentationCampaignDto(id, slug, name, enabled, priority, htmlContent, remoteUrl, templateMeta, screenKeys, eventKeys, userTags, tourCompletion, osTypes, minBuild, maxBuild, maxViewsPerUser, cooldownMinutes, startAt, endAt, allowSkip, allowRemindLater, remindLaterMinutes, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PresentationCampaignDto)) {
            return false;
        }
        PresentationCampaignDto presentationCampaignDto = (PresentationCampaignDto) other;
        return Intrinsics.areEqual(this.id, presentationCampaignDto.id) && Intrinsics.areEqual(this.slug, presentationCampaignDto.slug) && Intrinsics.areEqual(this.name, presentationCampaignDto.name) && this.enabled == presentationCampaignDto.enabled && this.priority == presentationCampaignDto.priority && Intrinsics.areEqual(this.htmlContent, presentationCampaignDto.htmlContent) && Intrinsics.areEqual(this.remoteUrl, presentationCampaignDto.remoteUrl) && Intrinsics.areEqual(this.templateMeta, presentationCampaignDto.templateMeta) && Intrinsics.areEqual(this.screenKeys, presentationCampaignDto.screenKeys) && Intrinsics.areEqual(this.eventKeys, presentationCampaignDto.eventKeys) && Intrinsics.areEqual(this.userTags, presentationCampaignDto.userTags) && Intrinsics.areEqual(this.tourCompletion, presentationCampaignDto.tourCompletion) && Intrinsics.areEqual(this.osTypes, presentationCampaignDto.osTypes) && Intrinsics.areEqual(this.minBuild, presentationCampaignDto.minBuild) && Intrinsics.areEqual(this.maxBuild, presentationCampaignDto.maxBuild) && this.maxViewsPerUser == presentationCampaignDto.maxViewsPerUser && this.cooldownMinutes == presentationCampaignDto.cooldownMinutes && Intrinsics.areEqual(this.startAt, presentationCampaignDto.startAt) && Intrinsics.areEqual(this.endAt, presentationCampaignDto.endAt) && this.allowSkip == presentationCampaignDto.allowSkip && this.allowRemindLater == presentationCampaignDto.allowRemindLater && Intrinsics.areEqual(this.remindLaterMinutes, presentationCampaignDto.remindLaterMinutes) && Intrinsics.areEqual(this.createdAt, presentationCampaignDto.createdAt) && Intrinsics.areEqual(this.updatedAt, presentationCampaignDto.updatedAt);
    }

    public int hashCode() {
        int hashCode = ((((((((this.id.hashCode() * 31) + this.slug.hashCode()) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Integer.hashCode(this.priority)) * 31;
        String str = this.htmlContent;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remoteUrl;
        int hashCode3 = (((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.templateMeta.hashCode()) * 31) + this.screenKeys.hashCode()) * 31) + this.eventKeys.hashCode()) * 31) + this.userTags.hashCode()) * 31) + this.tourCompletion.hashCode()) * 31) + this.osTypes.hashCode()) * 31;
        Integer num = this.minBuild;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxBuild;
        int hashCode5 = (((((hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + Integer.hashCode(this.maxViewsPerUser)) * 31) + Integer.hashCode(this.cooldownMinutes)) * 31;
        Date date = this.startAt;
        int hashCode6 = (hashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endAt;
        int hashCode7 = (((((hashCode6 + (date2 == null ? 0 : date2.hashCode())) * 31) + Boolean.hashCode(this.allowSkip)) * 31) + Boolean.hashCode(this.allowRemindLater)) * 31;
        Integer num3 = this.remindLaterMinutes;
        int hashCode8 = (((hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.createdAt.hashCode()) * 31;
        Date date3 = this.updatedAt;
        return hashCode8 + (date3 != null ? date3.hashCode() : 0);
    }

    public String toString() {
        return "PresentationCampaignDto(id=" + this.id + ", slug=" + this.slug + ", name=" + this.name + ", enabled=" + this.enabled + ", priority=" + this.priority + ", htmlContent=" + this.htmlContent + ", remoteUrl=" + this.remoteUrl + ", templateMeta=" + this.templateMeta + ", screenKeys=" + this.screenKeys + ", eventKeys=" + this.eventKeys + ", userTags=" + this.userTags + ", tourCompletion=" + this.tourCompletion + ", osTypes=" + this.osTypes + ", minBuild=" + this.minBuild + ", maxBuild=" + this.maxBuild + ", maxViewsPerUser=" + this.maxViewsPerUser + ", cooldownMinutes=" + this.cooldownMinutes + ", startAt=" + this.startAt + ", endAt=" + this.endAt + ", allowSkip=" + this.allowSkip + ", allowRemindLater=" + this.allowRemindLater + ", remindLaterMinutes=" + this.remindLaterMinutes + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public PresentationCampaignDto(String id, String slug, String name, boolean z, int i, String str, String str2, Map<String, ? extends Object> templateMeta, List<String> screenKeys, List<String> eventKeys, List<String> userTags, String tourCompletion, List<String> osTypes, Integer num, Integer num2, int i2, int i3, Date date, Date date2, boolean z2, boolean z3, Integer num3, Date createdAt, Date date3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(templateMeta, "templateMeta");
        Intrinsics.checkNotNullParameter(screenKeys, "screenKeys");
        Intrinsics.checkNotNullParameter(eventKeys, "eventKeys");
        Intrinsics.checkNotNullParameter(userTags, "userTags");
        Intrinsics.checkNotNullParameter(tourCompletion, "tourCompletion");
        Intrinsics.checkNotNullParameter(osTypes, "osTypes");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.enabled = z;
        this.priority = i;
        this.htmlContent = str;
        this.remoteUrl = str2;
        this.templateMeta = templateMeta;
        this.screenKeys = screenKeys;
        this.eventKeys = eventKeys;
        this.userTags = userTags;
        this.tourCompletion = tourCompletion;
        this.osTypes = osTypes;
        this.minBuild = num;
        this.maxBuild = num2;
        this.maxViewsPerUser = i2;
        this.cooldownMinutes = i3;
        this.startAt = date;
        this.endAt = date2;
        this.allowSkip = z2;
        this.allowRemindLater = z3;
        this.remindLaterMinutes = num3;
        this.createdAt = createdAt;
        this.updatedAt = date3;
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

    public final String getHtmlContent() {
        return this.htmlContent;
    }

    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    public final Map<String, Object> getTemplateMeta() {
        return this.templateMeta;
    }

    public final List<String> getScreenKeys() {
        return this.screenKeys;
    }

    public final List<String> getEventKeys() {
        return this.eventKeys;
    }

    public final List<String> getUserTags() {
        return this.userTags;
    }

    public /* synthetic */ PresentationCampaignDto(String str, String str2, String str3, boolean z, int i, String str4, String str5, Map map, List list, List list2, List list3, String str6, List list4, Integer num, Integer num2, int i2, int i3, Date date, Date date2, boolean z2, boolean z3, Integer num3, Date date3, Date date4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, i, str4, str5, map, list, list2, list3, (i4 & 2048) != 0 ? "any" : str6, list4, num, num2, i2, i3, date, date2, z2, z3, num3, date3, date4);
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

    public final int getMaxViewsPerUser() {
        return this.maxViewsPerUser;
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

    public final boolean getAllowSkip() {
        return this.allowSkip;
    }

    public final boolean getAllowRemindLater() {
        return this.allowRemindLater;
    }

    public final Integer getRemindLaterMinutes() {
        return this.remindLaterMinutes;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }
}
