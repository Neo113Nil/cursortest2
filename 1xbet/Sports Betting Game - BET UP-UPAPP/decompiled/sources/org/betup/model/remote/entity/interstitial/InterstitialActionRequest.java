package org.betup.model.remote.entity.interstitial;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: InterstitialActionRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/entity/interstitial/InterstitialActionRequest;", "", "eventKey", "", "screenKey", "targetUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventKey", "()Ljava/lang/String;", "getScreenKey", "getTargetUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InterstitialActionRequest {
    public static final int $stable = 0;
    private final String eventKey;
    private final String screenKey;
    private final String targetUrl;

    public InterstitialActionRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ InterstitialActionRequest copy$default(InterstitialActionRequest interstitialActionRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interstitialActionRequest.eventKey;
        }
        if ((i & 2) != 0) {
            str2 = interstitialActionRequest.screenKey;
        }
        if ((i & 4) != 0) {
            str3 = interstitialActionRequest.targetUrl;
        }
        return interstitialActionRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventKey() {
        return this.eventKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScreenKey() {
        return this.screenKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    public final InterstitialActionRequest copy(String eventKey, String screenKey, String targetUrl) {
        return new InterstitialActionRequest(eventKey, screenKey, targetUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterstitialActionRequest)) {
            return false;
        }
        InterstitialActionRequest interstitialActionRequest = (InterstitialActionRequest) other;
        return Intrinsics.areEqual(this.eventKey, interstitialActionRequest.eventKey) && Intrinsics.areEqual(this.screenKey, interstitialActionRequest.screenKey) && Intrinsics.areEqual(this.targetUrl, interstitialActionRequest.targetUrl);
    }

    public int hashCode() {
        String str = this.eventKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.screenKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.targetUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "InterstitialActionRequest(eventKey=" + this.eventKey + ", screenKey=" + this.screenKey + ", targetUrl=" + this.targetUrl + ")";
    }

    public InterstitialActionRequest(String str, String str2, String str3) {
        this.eventKey = str;
        this.screenKey = str2;
        this.targetUrl = str3;
    }

    public /* synthetic */ InterstitialActionRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final String getEventKey() {
        return this.eventKey;
    }

    public final String getScreenKey() {
        return this.screenKey;
    }

    public final String getTargetUrl() {
        return this.targetUrl;
    }
}
