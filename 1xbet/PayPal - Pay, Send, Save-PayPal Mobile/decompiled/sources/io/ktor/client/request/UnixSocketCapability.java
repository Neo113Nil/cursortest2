package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lio/ktor/client/request/UnixSocketCapability;", "Lio/ktor/client/engine/HttpClientEngineCapability;", "Lio/ktor/client/request/UnixSocketSettings;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UnixSocketCapability implements io.ktor.client.engine.HttpClientEngineCapability<io.ktor.client.request.UnixSocketSettings> {
    public static final io.ktor.client.request.UnixSocketCapability INSTANCE = new io.ktor.client.request.UnixSocketCapability();

    public final int hashCode() {
        return 620284891;
    }

    private UnixSocketCapability() {
    }

    public final java.lang.String toString() {
        return "UnixSocketCapability";
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.client.request.UnixSocketCapability)) {
            return false;
        }
        return true;
    }
}
