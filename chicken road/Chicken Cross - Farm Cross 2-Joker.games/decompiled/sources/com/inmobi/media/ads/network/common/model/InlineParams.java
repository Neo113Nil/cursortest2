package com.inmobi.media.ads.network.common.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.inmobi.media.InterfaceC3732g9;
import com.inmobi.media.Va;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/InlineParams;", "", "", "url", "targetBundleId", "", "pingMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/inmobi/media/ads/network/common/model/InlineParams;", InAppPurchaseConstants.METHOD_TO_STRING, "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getTargetBundleId", "setTargetBundleId", "(Ljava/lang/String;)V", "I", "getPingMode", "setPingMode", "(I)V", k.M, "com/inmobi/media/Va", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InlineParams {
    public static final Va Companion = new Va();
    public static final int PING_MODE_DISABLED = 0;
    public static final int PING_MODE_IN_WEBVIEW = 2;
    public static final int PING_MODE_REGULAR = 1;

    @InterfaceC3732g9
    private int pingMode;

    @InterfaceC3732g9
    private String targetBundleId;
    private final String url;

    public InlineParams() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ InlineParams copy$default(InlineParams inlineParams, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = inlineParams.url;
        }
        if ((i2 & 2) != 0) {
            str2 = inlineParams.targetBundleId;
        }
        if ((i2 & 4) != 0) {
            i = inlineParams.pingMode;
        }
        return inlineParams.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTargetBundleId() {
        return this.targetBundleId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPingMode() {
        return this.pingMode;
    }

    public final InlineParams copy(String url, String targetBundleId, int pingMode) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new InlineParams(url, targetBundleId, pingMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InlineParams)) {
            return false;
        }
        InlineParams inlineParams = (InlineParams) other;
        return Intrinsics.areEqual(this.url, inlineParams.url) && Intrinsics.areEqual(this.targetBundleId, inlineParams.targetBundleId) && this.pingMode == inlineParams.pingMode;
    }

    public final int getPingMode() {
        return this.pingMode;
    }

    public final String getTargetBundleId() {
        return this.targetBundleId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.targetBundleId;
        return Integer.hashCode(this.pingMode) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void setPingMode(int i) {
        this.pingMode = i;
    }

    public final void setTargetBundleId(String str) {
        this.targetBundleId = str;
    }

    public String toString() {
        return "InlineParams(url=" + this.url + ", targetBundleId=" + this.targetBundleId + ", pingMode=" + this.pingMode + ")";
    }

    public InlineParams(String url, String str, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.targetBundleId = str;
        this.pingMode = i;
    }

    public /* synthetic */ InlineParams(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "https://play.google.com/d?" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 2 : i);
    }
}
