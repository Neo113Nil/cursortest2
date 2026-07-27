package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.MediationInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadConfiguration.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "", "placementId", "", "adMarkup", "mediationAdUnitId", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "extras", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/MediationInfo;Ljava/util/Map;)V", "getPlacementId", "()Ljava/lang/String;", "getAdMarkup", "getMediationAdUnitId", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "getExtras", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LoadConfigurationInternal {
    private final String adMarkup;
    private final Map<String, String> extras;
    private final String mediationAdUnitId;
    private final MediationInfo mediationInfo;
    private final String placementId;

    public static /* synthetic */ LoadConfigurationInternal copy$default(LoadConfigurationInternal loadConfigurationInternal, String str, String str2, String str3, MediationInfo mediationInfo, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loadConfigurationInternal.placementId;
        }
        if ((i & 2) != 0) {
            str2 = loadConfigurationInternal.adMarkup;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = loadConfigurationInternal.mediationAdUnitId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            mediationInfo = loadConfigurationInternal.mediationInfo;
        }
        MediationInfo mediationInfo2 = mediationInfo;
        if ((i & 16) != 0) {
            map = loadConfigurationInternal.extras;
        }
        return loadConfigurationInternal.copy(str, str4, str5, mediationInfo2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdMarkup() {
        return this.adMarkup;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    /* renamed from: component4, reason: from getter */
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final Map<String, String> component5() {
        return this.extras;
    }

    public final LoadConfigurationInternal copy(String placementId, String adMarkup, String mediationAdUnitId, MediationInfo mediationInfo, Map<String, String> extras) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new LoadConfigurationInternal(placementId, adMarkup, mediationAdUnitId, mediationInfo, extras);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadConfigurationInternal)) {
            return false;
        }
        LoadConfigurationInternal loadConfigurationInternal = (LoadConfigurationInternal) other;
        return Intrinsics.areEqual(this.placementId, loadConfigurationInternal.placementId) && Intrinsics.areEqual(this.adMarkup, loadConfigurationInternal.adMarkup) && Intrinsics.areEqual(this.mediationAdUnitId, loadConfigurationInternal.mediationAdUnitId) && Intrinsics.areEqual(this.mediationInfo, loadConfigurationInternal.mediationInfo) && Intrinsics.areEqual(this.extras, loadConfigurationInternal.extras);
    }

    public int hashCode() {
        int hashCode = this.placementId.hashCode() * 31;
        String str = this.adMarkup;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediationAdUnitId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MediationInfo mediationInfo = this.mediationInfo;
        return ((hashCode3 + (mediationInfo != null ? mediationInfo.hashCode() : 0)) * 31) + this.extras.hashCode();
    }

    public String toString() {
        return "LoadConfigurationInternal(placementId=" + this.placementId + ", adMarkup=" + this.adMarkup + ", mediationAdUnitId=" + this.mediationAdUnitId + ", mediationInfo=" + this.mediationInfo + ", extras=" + this.extras + ')';
    }

    public LoadConfigurationInternal(String placementId, String str, String str2, MediationInfo mediationInfo, Map<String, String> extras) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.placementId = placementId;
        this.adMarkup = str;
        this.mediationAdUnitId = str2;
        this.mediationInfo = mediationInfo;
        this.extras = extras;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public /* synthetic */ LoadConfigurationInternal(String str, String str2, String str3, MediationInfo mediationInfo, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : mediationInfo, (i & 16) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }
}
