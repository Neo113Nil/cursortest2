package com.adobe.marketing.mobile.launch.rulesengine.json;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONMeta;", "", "", "p0", "<init>", "(Z)V", "Lcom/adobe/marketing/mobile/launch/rulesengine/RuleMeta;", "toMeta$core_phoneRelease", "()Lcom/adobe/marketing/mobile/launch/rulesengine/RuleMeta;", "Camera2StreamConfigurationMap", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class JSONMeta {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.launch.rulesengine.json.JSONMeta.Companion INSTANCE = new com.adobe.marketing.mobile.launch.rulesengine.json.JSONMeta.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    private JSONMeta(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONMeta$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONMeta;", "invoke", "(Lorg/json/JSONObject;)Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONMeta;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.adobe.marketing.mobile.launch.rulesengine.json.JSONMeta invoke(org.json.JSONObject jsonObject) {
            return new com.adobe.marketing.mobile.launch.rulesengine.json.JSONMeta(jsonObject != null ? jsonObject.optBoolean("reEvaluate", false) : false, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ com.adobe.marketing.mobile.launch.rulesengine.RuleMeta toMeta$core_phoneRelease() {
        return new com.adobe.marketing.mobile.launch.rulesengine.RuleMeta(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public /* synthetic */ JSONMeta(boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
