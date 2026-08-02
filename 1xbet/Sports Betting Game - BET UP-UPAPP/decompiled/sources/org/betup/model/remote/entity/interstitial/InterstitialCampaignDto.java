package org.betup.model.remote.entity.interstitial;

import com.ironsource.K1;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: InterstitialCampaignDto.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bQ\b\u0087\b\u0018\u00002\u00020\u0001B«\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b&\u0010'J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0007HÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\t\u0010S\u001a\u00020\u000bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00107J\u0017\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012HÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010`\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00107J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\tHÆ\u0003J\t\u0010c\u001a\u00020\tHÆ\u0003J\t\u0010d\u001a\u00020\tHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010 HÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\t\u0010h\u001a\u00020\u0007HÆ\u0003J\t\u0010i\u001a\u00020 HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010 HÆ\u0003Jê\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020 2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\u00072\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020\tHÖ\u0001J\t\u0010p\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b@\u0010<R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00108\u001a\u0004\bA\u00107R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00108\u001a\u0004\bB\u00107R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0011\u0010\u001c\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bD\u0010/R\u0011\u0010\u001d\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bE\u0010/R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bF\u0010/R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0011\u0010\"\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010-R\u0011\u0010#\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bK\u0010-R\u0011\u0010$\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bL\u0010HR\u0013\u0010%\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bM\u0010H¨\u0006q"}, d2 = {"Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "", "id", "", "slug", "name", "enabled", "", "priority", "", VastAttributes.CREATIVE_TYPE, "Lorg/betup/model/remote/entity/interstitial/InterstitialCreativeType;", "htmlContent", "remoteUrl", "htmlTemplateId", UnifiedMediationParams.KEY_VIDEO_URL, "skipAfterSeconds", "templateMeta", "", K1.l, "", "screenKeys", "userTags", "tourCompletion", "osTypes", "minBuild", "maxBuild", "frequencyMode", "maxImpressionsPerUser", "maxImpressionsPerDay", "cooldownMinutes", "startAt", "Ljava/util/Date;", "endAt", "allowSkip", "requireClickToClose", "createdAt", "updatedAt", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILorg/betup/model/remote/entity/interstitial/InterstitialCreativeType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IIILjava/util/Date;Ljava/util/Date;ZZLjava/util/Date;Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "getSlug", "getName", "getEnabled", "()Z", "getPriority", "()I", "getCreativeType", "()Lorg/betup/model/remote/entity/interstitial/InterstitialCreativeType;", "getHtmlContent", "getRemoteUrl", "getHtmlTemplateId", "getVideoUrl", "getSkipAfterSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTemplateMeta", "()Ljava/util/Map;", "getTriggerEvents", "()Ljava/util/List;", "getScreenKeys", "getUserTags", "getTourCompletion", "getOsTypes", "getMinBuild", "getMaxBuild", "getFrequencyMode", "getMaxImpressionsPerUser", "getMaxImpressionsPerDay", "getCooldownMinutes", "getStartAt", "()Ljava/util/Date;", "getEndAt", "getAllowSkip", "getRequireClickToClose", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILorg/betup/model/remote/entity/interstitial/InterstitialCreativeType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IIILjava/util/Date;Ljava/util/Date;ZZLjava/util/Date;Ljava/util/Date;)Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InterstitialCampaignDto {
    public static final int $stable = 8;
    private final boolean allowSkip;
    private final int cooldownMinutes;
    private final Date createdAt;
    private final InterstitialCreativeType creativeType;
    private final boolean enabled;
    private final Date endAt;
    private final String frequencyMode;
    private final String htmlContent;
    private final String htmlTemplateId;
    private final String id;
    private final Integer maxBuild;
    private final int maxImpressionsPerDay;
    private final int maxImpressionsPerUser;
    private final Integer minBuild;
    private final String name;
    private final List<String> osTypes;
    private final int priority;
    private final String remoteUrl;
    private final boolean requireClickToClose;
    private final List<String> screenKeys;
    private final Integer skipAfterSeconds;
    private final String slug;
    private final Date startAt;
    private final Map<String, Object> templateMeta;
    private final String tourCompletion;
    private final List<String> triggerEvents;
    private final Date updatedAt;
    private final List<String> userTags;
    private final String videoUrl;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getSkipAfterSeconds() {
        return this.skipAfterSeconds;
    }

    public final Map<String, Object> component12() {
        return this.templateMeta;
    }

    public final List<String> component13() {
        return this.triggerEvents;
    }

    public final List<String> component14() {
        return this.screenKeys;
    }

    public final List<String> component15() {
        return this.userTags;
    }

    /* renamed from: component16, reason: from getter */
    public final String getTourCompletion() {
        return this.tourCompletion;
    }

    public final List<String> component17() {
        return this.osTypes;
    }

    /* renamed from: component18, reason: from getter */
    public final Integer getMinBuild() {
        return this.minBuild;
    }

    /* renamed from: component19, reason: from getter */
    public final Integer getMaxBuild() {
        return this.maxBuild;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component20, reason: from getter */
    public final String getFrequencyMode() {
        return this.frequencyMode;
    }

    /* renamed from: component21, reason: from getter */
    public final int getMaxImpressionsPerUser() {
        return this.maxImpressionsPerUser;
    }

    /* renamed from: component22, reason: from getter */
    public final int getMaxImpressionsPerDay() {
        return this.maxImpressionsPerDay;
    }

    /* renamed from: component23, reason: from getter */
    public final int getCooldownMinutes() {
        return this.cooldownMinutes;
    }

    /* renamed from: component24, reason: from getter */
    public final Date getStartAt() {
        return this.startAt;
    }

    /* renamed from: component25, reason: from getter */
    public final Date getEndAt() {
        return this.endAt;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getAllowSkip() {
        return this.allowSkip;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getRequireClickToClose() {
        return this.requireClickToClose;
    }

    /* renamed from: component28, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component29, reason: from getter */
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
    public final InterstitialCreativeType getCreativeType() {
        return this.creativeType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getHtmlContent() {
        return this.htmlContent;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getHtmlTemplateId() {
        return this.htmlTemplateId;
    }

    public final InterstitialCampaignDto copy(String id, String slug, String name, boolean enabled, int priority, InterstitialCreativeType creativeType, String htmlContent, String remoteUrl, String htmlTemplateId, String videoUrl, Integer skipAfterSeconds, Map<String, ? extends Object> templateMeta, List<String> triggerEvents, List<String> screenKeys, List<String> userTags, String tourCompletion, List<String> osTypes, Integer minBuild, Integer maxBuild, String frequencyMode, int maxImpressionsPerUser, int maxImpressionsPerDay, int cooldownMinutes, Date startAt, Date endAt, boolean allowSkip, boolean requireClickToClose, Date createdAt, Date updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(templateMeta, "templateMeta");
        Intrinsics.checkNotNullParameter(triggerEvents, "triggerEvents");
        Intrinsics.checkNotNullParameter(screenKeys, "screenKeys");
        Intrinsics.checkNotNullParameter(userTags, "userTags");
        Intrinsics.checkNotNullParameter(tourCompletion, "tourCompletion");
        Intrinsics.checkNotNullParameter(osTypes, "osTypes");
        Intrinsics.checkNotNullParameter(frequencyMode, "frequencyMode");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new InterstitialCampaignDto(id, slug, name, enabled, priority, creativeType, htmlContent, remoteUrl, htmlTemplateId, videoUrl, skipAfterSeconds, templateMeta, triggerEvents, screenKeys, userTags, tourCompletion, osTypes, minBuild, maxBuild, frequencyMode, maxImpressionsPerUser, maxImpressionsPerDay, cooldownMinutes, startAt, endAt, allowSkip, requireClickToClose, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterstitialCampaignDto)) {
            return false;
        }
        InterstitialCampaignDto interstitialCampaignDto = (InterstitialCampaignDto) other;
        return Intrinsics.areEqual(this.id, interstitialCampaignDto.id) && Intrinsics.areEqual(this.slug, interstitialCampaignDto.slug) && Intrinsics.areEqual(this.name, interstitialCampaignDto.name) && this.enabled == interstitialCampaignDto.enabled && this.priority == interstitialCampaignDto.priority && this.creativeType == interstitialCampaignDto.creativeType && Intrinsics.areEqual(this.htmlContent, interstitialCampaignDto.htmlContent) && Intrinsics.areEqual(this.remoteUrl, interstitialCampaignDto.remoteUrl) && Intrinsics.areEqual(this.htmlTemplateId, interstitialCampaignDto.htmlTemplateId) && Intrinsics.areEqual(this.videoUrl, interstitialCampaignDto.videoUrl) && Intrinsics.areEqual(this.skipAfterSeconds, interstitialCampaignDto.skipAfterSeconds) && Intrinsics.areEqual(this.templateMeta, interstitialCampaignDto.templateMeta) && Intrinsics.areEqual(this.triggerEvents, interstitialCampaignDto.triggerEvents) && Intrinsics.areEqual(this.screenKeys, interstitialCampaignDto.screenKeys) && Intrinsics.areEqual(this.userTags, interstitialCampaignDto.userTags) && Intrinsics.areEqual(this.tourCompletion, interstitialCampaignDto.tourCompletion) && Intrinsics.areEqual(this.osTypes, interstitialCampaignDto.osTypes) && Intrinsics.areEqual(this.minBuild, interstitialCampaignDto.minBuild) && Intrinsics.areEqual(this.maxBuild, interstitialCampaignDto.maxBuild) && Intrinsics.areEqual(this.frequencyMode, interstitialCampaignDto.frequencyMode) && this.maxImpressionsPerUser == interstitialCampaignDto.maxImpressionsPerUser && this.maxImpressionsPerDay == interstitialCampaignDto.maxImpressionsPerDay && this.cooldownMinutes == interstitialCampaignDto.cooldownMinutes && Intrinsics.areEqual(this.startAt, interstitialCampaignDto.startAt) && Intrinsics.areEqual(this.endAt, interstitialCampaignDto.endAt) && this.allowSkip == interstitialCampaignDto.allowSkip && this.requireClickToClose == interstitialCampaignDto.requireClickToClose && Intrinsics.areEqual(this.createdAt, interstitialCampaignDto.createdAt) && Intrinsics.areEqual(this.updatedAt, interstitialCampaignDto.updatedAt);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.id.hashCode() * 31) + this.slug.hashCode()) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Integer.hashCode(this.priority)) * 31) + this.creativeType.hashCode()) * 31;
        String str = this.htmlContent;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remoteUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.htmlTemplateId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.videoUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.skipAfterSeconds;
        int hashCode6 = (((((((((((((hashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.templateMeta.hashCode()) * 31) + this.triggerEvents.hashCode()) * 31) + this.screenKeys.hashCode()) * 31) + this.userTags.hashCode()) * 31) + this.tourCompletion.hashCode()) * 31) + this.osTypes.hashCode()) * 31;
        Integer num2 = this.minBuild;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxBuild;
        int hashCode8 = (((((((((hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.frequencyMode.hashCode()) * 31) + Integer.hashCode(this.maxImpressionsPerUser)) * 31) + Integer.hashCode(this.maxImpressionsPerDay)) * 31) + Integer.hashCode(this.cooldownMinutes)) * 31;
        Date date = this.startAt;
        int hashCode9 = (hashCode8 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endAt;
        int hashCode10 = (((((((hashCode9 + (date2 == null ? 0 : date2.hashCode())) * 31) + Boolean.hashCode(this.allowSkip)) * 31) + Boolean.hashCode(this.requireClickToClose)) * 31) + this.createdAt.hashCode()) * 31;
        Date date3 = this.updatedAt;
        return hashCode10 + (date3 != null ? date3.hashCode() : 0);
    }

    public String toString() {
        return "InterstitialCampaignDto(id=" + this.id + ", slug=" + this.slug + ", name=" + this.name + ", enabled=" + this.enabled + ", priority=" + this.priority + ", creativeType=" + this.creativeType + ", htmlContent=" + this.htmlContent + ", remoteUrl=" + this.remoteUrl + ", htmlTemplateId=" + this.htmlTemplateId + ", videoUrl=" + this.videoUrl + ", skipAfterSeconds=" + this.skipAfterSeconds + ", templateMeta=" + this.templateMeta + ", triggerEvents=" + this.triggerEvents + ", screenKeys=" + this.screenKeys + ", userTags=" + this.userTags + ", tourCompletion=" + this.tourCompletion + ", osTypes=" + this.osTypes + ", minBuild=" + this.minBuild + ", maxBuild=" + this.maxBuild + ", frequencyMode=" + this.frequencyMode + ", maxImpressionsPerUser=" + this.maxImpressionsPerUser + ", maxImpressionsPerDay=" + this.maxImpressionsPerDay + ", cooldownMinutes=" + this.cooldownMinutes + ", startAt=" + this.startAt + ", endAt=" + this.endAt + ", allowSkip=" + this.allowSkip + ", requireClickToClose=" + this.requireClickToClose + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public InterstitialCampaignDto(String id, String slug, String name, boolean z, int i, InterstitialCreativeType creativeType, String str, String str2, String str3, String str4, Integer num, Map<String, ? extends Object> templateMeta, List<String> triggerEvents, List<String> screenKeys, List<String> userTags, String tourCompletion, List<String> osTypes, Integer num2, Integer num3, String frequencyMode, int i2, int i3, int i4, Date date, Date date2, boolean z2, boolean z3, Date createdAt, Date date3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(templateMeta, "templateMeta");
        Intrinsics.checkNotNullParameter(triggerEvents, "triggerEvents");
        Intrinsics.checkNotNullParameter(screenKeys, "screenKeys");
        Intrinsics.checkNotNullParameter(userTags, "userTags");
        Intrinsics.checkNotNullParameter(tourCompletion, "tourCompletion");
        Intrinsics.checkNotNullParameter(osTypes, "osTypes");
        Intrinsics.checkNotNullParameter(frequencyMode, "frequencyMode");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.enabled = z;
        this.priority = i;
        this.creativeType = creativeType;
        this.htmlContent = str;
        this.remoteUrl = str2;
        this.htmlTemplateId = str3;
        this.videoUrl = str4;
        this.skipAfterSeconds = num;
        this.templateMeta = templateMeta;
        this.triggerEvents = triggerEvents;
        this.screenKeys = screenKeys;
        this.userTags = userTags;
        this.tourCompletion = tourCompletion;
        this.osTypes = osTypes;
        this.minBuild = num2;
        this.maxBuild = num3;
        this.frequencyMode = frequencyMode;
        this.maxImpressionsPerUser = i2;
        this.maxImpressionsPerDay = i3;
        this.cooldownMinutes = i4;
        this.startAt = date;
        this.endAt = date2;
        this.allowSkip = z2;
        this.requireClickToClose = z3;
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

    public final InterstitialCreativeType getCreativeType() {
        return this.creativeType;
    }

    public final String getHtmlContent() {
        return this.htmlContent;
    }

    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    public final String getHtmlTemplateId() {
        return this.htmlTemplateId;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final Integer getSkipAfterSeconds() {
        return this.skipAfterSeconds;
    }

    public final Map<String, Object> getTemplateMeta() {
        return this.templateMeta;
    }

    public final List<String> getTriggerEvents() {
        return this.triggerEvents;
    }

    public final List<String> getScreenKeys() {
        return this.screenKeys;
    }

    public final List<String> getUserTags() {
        return this.userTags;
    }

    public /* synthetic */ InterstitialCampaignDto(String str, String str2, String str3, boolean z, int i, InterstitialCreativeType interstitialCreativeType, String str4, String str5, String str6, String str7, Integer num, Map map, List list, List list2, List list3, String str8, List list4, Integer num2, Integer num3, String str9, int i2, int i3, int i4, Date date, Date date2, boolean z2, boolean z3, Date date3, Date date4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, i, interstitialCreativeType, str4, str5, str6, str7, num, map, list, list2, list3, (i5 & 32768) != 0 ? "any" : str8, list4, num2, num3, str9, i2, i3, i4, date, date2, z2, z3, date3, date4);
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

    public final boolean getAllowSkip() {
        return this.allowSkip;
    }

    public final boolean getRequireClickToClose() {
        return this.requireClickToClose;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }
}
