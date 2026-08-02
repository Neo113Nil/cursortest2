package org.betup.model.remote.entity.analytics;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.Language;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TrackEventModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\\\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006("}, d2 = {"Lorg/betup/model/remote/entity/analytics/TrackEventModel;", "", "eventType", "Lorg/betup/model/remote/entity/analytics/TrackEventType;", "params", "", "", "lang", "osType", "Lorg/betup/model/remote/entity/analytics/TrackRequestOsType;", "buildNumber", "", "buildVersion", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/analytics/TrackEventType;Ljava/util/Map;Ljava/lang/String;Lorg/betup/model/remote/entity/analytics/TrackRequestOsType;Ljava/lang/Integer;Ljava/lang/String;)V", "getEventType", "()Lorg/betup/model/remote/entity/analytics/TrackEventType;", "getParams", "()Ljava/util/Map;", "getLang", "()Ljava/lang/String;", "getOsType", "()Lorg/betup/model/remote/entity/analytics/TrackRequestOsType;", "getBuildNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBuildVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lorg/betup/model/remote/entity/analytics/TrackEventType;Ljava/util/Map;Ljava/lang/String;Lorg/betup/model/remote/entity/analytics/TrackRequestOsType;Ljava/lang/Integer;Ljava/lang/String;)Lorg/betup/model/remote/entity/analytics/TrackEventModel;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TrackEventModel {
    public static final int $stable = 8;
    private final Integer buildNumber;
    private final String buildVersion;
    private final TrackEventType eventType;
    private final String lang;
    private final TrackRequestOsType osType;
    private final Map<String, String> params;

    public static /* synthetic */ TrackEventModel copy$default(TrackEventModel trackEventModel, TrackEventType trackEventType, Map map, String str, TrackRequestOsType trackRequestOsType, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            trackEventType = trackEventModel.eventType;
        }
        if ((i & 2) != 0) {
            map = trackEventModel.params;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            str = trackEventModel.lang;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            trackRequestOsType = trackEventModel.osType;
        }
        TrackRequestOsType trackRequestOsType2 = trackRequestOsType;
        if ((i & 16) != 0) {
            num = trackEventModel.buildNumber;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            str2 = trackEventModel.buildVersion;
        }
        return trackEventModel.copy(trackEventType, map2, str3, trackRequestOsType2, num2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final TrackEventType getEventType() {
        return this.eventType;
    }

    public final Map<String, String> component2() {
        return this.params;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    /* renamed from: component4, reason: from getter */
    public final TrackRequestOsType getOsType() {
        return this.osType;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getBuildNumber() {
        return this.buildNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBuildVersion() {
        return this.buildVersion;
    }

    public final TrackEventModel copy(TrackEventType eventType, Map<String, String> params, String lang, TrackRequestOsType osType, Integer buildNumber, String buildVersion) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(osType, "osType");
        return new TrackEventModel(eventType, params, lang, osType, buildNumber, buildVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackEventModel)) {
            return false;
        }
        TrackEventModel trackEventModel = (TrackEventModel) other;
        return this.eventType == trackEventModel.eventType && Intrinsics.areEqual(this.params, trackEventModel.params) && Intrinsics.areEqual(this.lang, trackEventModel.lang) && this.osType == trackEventModel.osType && Intrinsics.areEqual(this.buildNumber, trackEventModel.buildNumber) && Intrinsics.areEqual(this.buildVersion, trackEventModel.buildVersion);
    }

    public int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Map<String, String> map = this.params;
        int hashCode2 = (((((hashCode + (map == null ? 0 : map.hashCode())) * 31) + this.lang.hashCode()) * 31) + this.osType.hashCode()) * 31;
        Integer num = this.buildNumber;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.buildVersion;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TrackEventModel(eventType=" + this.eventType + ", params=" + this.params + ", lang=" + this.lang + ", osType=" + this.osType + ", buildNumber=" + this.buildNumber + ", buildVersion=" + this.buildVersion + ")";
    }

    public TrackEventModel(TrackEventType eventType, Map<String, String> map, String lang, TrackRequestOsType osType, Integer num, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(osType, "osType");
        this.eventType = eventType;
        this.params = map;
        this.lang = lang;
        this.osType = osType;
        this.buildNumber = num;
        this.buildVersion = str;
    }

    public final TrackEventType getEventType() {
        return this.eventType;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public /* synthetic */ TrackEventModel(TrackEventType trackEventType, Map map, String str, TrackRequestOsType trackRequestOsType, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(trackEventType, map, (i & 4) != 0 ? Language.getCurrent().getCode() : str, (i & 8) != 0 ? TrackRequestOsType.ANDROID : trackRequestOsType, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str2);
    }

    public final String getLang() {
        return this.lang;
    }

    public final TrackRequestOsType getOsType() {
        return this.osType;
    }

    public final Integer getBuildNumber() {
        return this.buildNumber;
    }

    public final String getBuildVersion() {
        return this.buildVersion;
    }
}
