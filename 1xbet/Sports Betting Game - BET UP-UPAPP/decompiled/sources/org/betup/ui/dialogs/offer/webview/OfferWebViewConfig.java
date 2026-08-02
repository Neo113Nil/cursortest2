package org.betup.ui.dialogs.offer.webview;

import com.ironsource.B5;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferWebViewConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;", "", "javascriptEnabled", "", "domStorageEnabled", "allowFileAccess", "baseUrl", "", B5.N, "mimeType", "cacheRemoteResources", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getJavascriptEnabled", "()Z", "getDomStorageEnabled", "getAllowFileAccess", "getBaseUrl", "()Ljava/lang/String;", "getCharset", "getMimeType", "getCacheRemoteResources", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OfferWebViewConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final OfferWebViewConfig DEFAULT = new OfferWebViewConfig(false, false, false, null, null, null, false, 127, null);
    private final boolean allowFileAccess;
    private final String baseUrl;
    private final boolean cacheRemoteResources;
    private final String charset;
    private final boolean domStorageEnabled;
    private final boolean javascriptEnabled;
    private final String mimeType;

    public OfferWebViewConfig() {
        this(false, false, false, null, null, null, false, 127, null);
    }

    public static /* synthetic */ OfferWebViewConfig copy$default(OfferWebViewConfig offerWebViewConfig, boolean z, boolean z2, boolean z3, String str, String str2, String str3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = offerWebViewConfig.javascriptEnabled;
        }
        if ((i & 2) != 0) {
            z2 = offerWebViewConfig.domStorageEnabled;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = offerWebViewConfig.allowFileAccess;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            str = offerWebViewConfig.baseUrl;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = offerWebViewConfig.charset;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = offerWebViewConfig.mimeType;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            z4 = offerWebViewConfig.cacheRemoteResources;
        }
        return offerWebViewConfig.copy(z, z5, z6, str4, str5, str6, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getJavascriptEnabled() {
        return this.javascriptEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDomStorageEnabled() {
        return this.domStorageEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAllowFileAccess() {
        return this.allowFileAccess;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCharset() {
        return this.charset;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getCacheRemoteResources() {
        return this.cacheRemoteResources;
    }

    public final OfferWebViewConfig copy(boolean javascriptEnabled, boolean domStorageEnabled, boolean allowFileAccess, String baseUrl, String charset, String mimeType, boolean cacheRemoteResources) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new OfferWebViewConfig(javascriptEnabled, domStorageEnabled, allowFileAccess, baseUrl, charset, mimeType, cacheRemoteResources);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferWebViewConfig)) {
            return false;
        }
        OfferWebViewConfig offerWebViewConfig = (OfferWebViewConfig) other;
        return this.javascriptEnabled == offerWebViewConfig.javascriptEnabled && this.domStorageEnabled == offerWebViewConfig.domStorageEnabled && this.allowFileAccess == offerWebViewConfig.allowFileAccess && Intrinsics.areEqual(this.baseUrl, offerWebViewConfig.baseUrl) && Intrinsics.areEqual(this.charset, offerWebViewConfig.charset) && Intrinsics.areEqual(this.mimeType, offerWebViewConfig.mimeType) && this.cacheRemoteResources == offerWebViewConfig.cacheRemoteResources;
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.javascriptEnabled) * 31) + Boolean.hashCode(this.domStorageEnabled)) * 31) + Boolean.hashCode(this.allowFileAccess)) * 31;
        String str = this.baseUrl;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.charset.hashCode()) * 31) + this.mimeType.hashCode()) * 31) + Boolean.hashCode(this.cacheRemoteResources);
    }

    public String toString() {
        return "OfferWebViewConfig(javascriptEnabled=" + this.javascriptEnabled + ", domStorageEnabled=" + this.domStorageEnabled + ", allowFileAccess=" + this.allowFileAccess + ", baseUrl=" + this.baseUrl + ", charset=" + this.charset + ", mimeType=" + this.mimeType + ", cacheRemoteResources=" + this.cacheRemoteResources + ")";
    }

    public OfferWebViewConfig(boolean z, boolean z2, boolean z3, String str, String charset, String mimeType, boolean z4) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.javascriptEnabled = z;
        this.domStorageEnabled = z2;
        this.allowFileAccess = z3;
        this.baseUrl = str;
        this.charset = charset;
        this.mimeType = mimeType;
        this.cacheRemoteResources = z4;
    }

    public final boolean getJavascriptEnabled() {
        return this.javascriptEnabled;
    }

    public final boolean getDomStorageEnabled() {
        return this.domStorageEnabled;
    }

    public final boolean getAllowFileAccess() {
        return this.allowFileAccess;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public /* synthetic */ OfferWebViewConfig(boolean z, boolean z2, boolean z3, String str, String str2, String str3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) == 0 ? z3 : true, (i & 8) != 0 ? null : str, (i & 16) != 0 ? "UTF-8" : str2, (i & 32) != 0 ? "text/html" : str3, (i & 64) != 0 ? false : z4);
    }

    public final String getCharset() {
        return this.charset;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final boolean getCacheRemoteResources() {
        return this.cacheRemoteResources;
    }

    /* compiled from: OfferWebViewConfig.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "DEFAULT", "Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;", "getDEFAULT", "()Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OfferWebViewConfig getDEFAULT() {
            return OfferWebViewConfig.DEFAULT;
        }
    }
}
