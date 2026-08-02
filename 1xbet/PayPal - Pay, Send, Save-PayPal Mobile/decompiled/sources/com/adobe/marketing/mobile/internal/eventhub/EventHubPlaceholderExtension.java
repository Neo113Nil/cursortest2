package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHubPlaceholderExtension;", "Lcom/adobe/marketing/mobile/Extension;", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/ExtensionApi;)V", "", "getFriendlyName", "()Ljava/lang/String;", "getName", "getVersion", "Lcom/adobe/marketing/mobile/ExtensionApi;", "getExtensionApi", "()Lcom/adobe/marketing/mobile/ExtensionApi;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class EventHubPlaceholderExtension extends com.adobe.marketing.mobile.Extension {
    private final com.adobe.marketing.mobile.ExtensionApi extensionApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventHubPlaceholderExtension(com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        super(extensionApi);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        this.extensionApi = extensionApi;
    }

    public final com.adobe.marketing.mobile.ExtensionApi getExtensionApi() {
        return this.extensionApi;
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final java.lang.String getName() {
        return com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.NAME;
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final java.lang.String getFriendlyName() {
        return "EventHub";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final java.lang.String getVersion() {
        return "3.6.0";
    }
}
