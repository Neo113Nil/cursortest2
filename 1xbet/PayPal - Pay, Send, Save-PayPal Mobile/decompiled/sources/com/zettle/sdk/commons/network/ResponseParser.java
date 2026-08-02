package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/commons/network/ResponseParser;", "", "", "json", "Lcom/zettle/sdk/commons/network/Response;", "parse", "(Ljava/lang/String;)Lcom/zettle/sdk/commons/network/Response;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ResponseParser {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.commons.network.ResponseParser.Companion INSTANCE = com.zettle.sdk.commons.network.ResponseParser.Companion.getHighSpeedVideoSizes;

    com.zettle.sdk.commons.network.Response parse(java.lang.String json);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/commons/network/ResponseParser$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/commons/network/ResponseParser;", "create", "()Lcom/zettle/sdk/commons/network/ResponseParser;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.commons.network.ResponseParser.Companion getHighSpeedVideoSizes = new com.zettle.sdk.commons.network.ResponseParser.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.commons.network.ResponseParser create() {
            return new com.zettle.sdk.commons.network.ResponseParserImpl();
        }
    }
}
