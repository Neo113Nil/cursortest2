package io.ktor.client.plugins;

@kotlin.Deprecated(message = "This plugin is no longer needed.\nThis API is deprecated and will be removed in Ktor 4.0.0")
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lio/ktor/client/plugins/SaveBodyPluginConfig;", "", "<init>", "()V", "", "disabled", "Z", "getDisabled", "()Z", "setDisabled", "(Z)V", "getDisabled$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveBodyPluginConfig {
    private boolean disabled;

    @kotlin.Deprecated(message = "It is no longer possible to disable body saving for all requests. Use client.prepareRequest(...).execute { ... } syntax to prevent saving the body in memory.\n\nThis API is deprecated and will be removed in Ktor 4.0.0\nIf you were relying on this functionality, share your use case by commenting on this issue: https://youtrack.jetbrains.com/issue/KTOR-8367/")
    public static /* synthetic */ void getDisabled$annotations() {
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final void setDisabled(boolean z) {
        this.disabled = z;
    }
}
