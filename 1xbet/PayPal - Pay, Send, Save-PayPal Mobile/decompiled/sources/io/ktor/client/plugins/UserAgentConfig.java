package io.ktor.client.plugins;

@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/UserAgentConfig;", "", "", "agent", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getAgent", "()Ljava/lang/String;", "setAgent"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserAgentConfig {
    private java.lang.String agent;

    public UserAgentConfig(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.agent = str;
    }

    public /* synthetic */ UserAgentConfig(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Ktor http-client" : str);
    }

    public final java.lang.String getAgent() {
        return this.agent;
    }

    public final void setAgent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.agent = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserAgentConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
