package com.paypal.oslo.feature.webview.api.navigation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000212B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010J'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0010R\u0011\u0010-\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00100\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b/\u0010."}, d2 = {"Lcom/paypal/oslo/feature/webview/api/navigation/OpenWebDeepLinkDestination;", "Landroidx/navigation3/runtime/NavKey;", "", "url", "type", "title", "source", "authenticationRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/webview/api/navigation/OpenWebDeepLinkDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$webview_api_prodRelease", "(Lcom/paypal/oslo/feature/webview/api/navigation/OpenWebDeepLinkDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getUrl", "getType", "getTitle", "getSource", "getAuthenticationRequired", "isExternal", "()Z", "getShouldRequireAuth", "shouldRequireAuth", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class OpenWebDeepLinkDestination implements androidx.navigation3.runtime.NavKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.Companion INSTANCE = new com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.Companion(null);
    public static final java.lang.String TYPE_EXTERNAL = "external";
    public static final java.lang.String TYPE_INTERNAL = "internal";
    private final java.lang.String authenticationRequired;
    private final java.lang.String source;
    private final java.lang.String title;
    private final java.lang.String type;
    private final java.lang.String url;

    public /* synthetic */ OpenWebDeepLinkDestination(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.source = null;
        } else {
            this.source = str4;
        }
        if ((i & 16) == 0) {
            this.authenticationRequired = null;
        } else {
            this.authenticationRequired = str5;
        }
    }

    public OpenWebDeepLinkDestination(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
        this.type = str2;
        this.title = str3;
        this.source = str4;
        this.authenticationRequired = str5;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$webview_api_prodRelease(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.url);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.source);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.authenticationRequired != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.authenticationRequired);
        }
    }

    public /* synthetic */ OpenWebDeepLinkDestination(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String getAuthenticationRequired() {
        return this.authenticationRequired;
    }

    public final boolean isExternal() {
        java.lang.String str = this.type;
        if (str == null) {
            str = "internal";
        }
        return kotlin.text.StringsKt.equals(str, TYPE_EXTERNAL, true);
    }

    public final boolean getShouldRequireAuth() {
        java.lang.Boolean booleanStrictOrNull;
        java.lang.String str = this.authenticationRequired;
        if (str == null || (booleanStrictOrNull = kotlin.text.StringsKt.toBooleanStrictOrNull(str)) == null) {
            return true;
        }
        return booleanStrictOrNull.booleanValue();
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/webview/api/navigation/OpenWebDeepLinkDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/webview/api/navigation/OpenWebDeepLinkDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "TYPE_INTERNAL", "Ljava/lang/String;", "TYPE_EXTERNAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination> serializer() {
            return com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.lang.String str2 = this.type;
        java.lang.String str3 = this.title;
        java.lang.String str4 = this.source;
        java.lang.String str5 = this.authenticationRequired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenWebDeepLinkDestination(url=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", source=");
        sb.append(str4);
        sb.append(", authenticationRequired=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode();
        java.lang.String str = this.type;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.title;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.source;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.authenticationRequired;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination)) {
            return false;
        }
        com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination = (com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, openWebDeepLinkDestination.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, openWebDeepLinkDestination.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, openWebDeepLinkDestination.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, openWebDeepLinkDestination.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationRequired, openWebDeepLinkDestination.authenticationRequired);
    }

    public final com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination copy(java.lang.String url, java.lang.String type, java.lang.String title, java.lang.String source, java.lang.String authenticationRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return new com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination(url, type, title, source, authenticationRequired);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAuthenticationRequired() {
        return this.authenticationRequired;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination copy$default(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = openWebDeepLinkDestination.url;
        }
        if ((i & 2) != 0) {
            str2 = openWebDeepLinkDestination.type;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = openWebDeepLinkDestination.title;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = openWebDeepLinkDestination.source;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = openWebDeepLinkDestination.authenticationRequired;
        }
        return openWebDeepLinkDestination.copy(str, str6, str7, str8, str5);
    }
}
