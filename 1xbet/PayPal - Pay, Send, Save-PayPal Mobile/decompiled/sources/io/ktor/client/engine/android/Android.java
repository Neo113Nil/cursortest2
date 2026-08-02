package io.ktor.client.engine.android;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lio/ktor/client/engine/android/Android;", "Lio/ktor/client/engine/HttpClientEngineFactory;", "Lio/ktor/client/engine/android/AndroidEngineConfig;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/engine/HttpClientEngine;", "create", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/engine/HttpClientEngine;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Android implements io.ktor.client.engine.HttpClientEngineFactory<io.ktor.client.engine.android.AndroidEngineConfig> {
    public static final io.ktor.client.engine.android.Android INSTANCE = new io.ktor.client.engine.android.Android();

    public final int hashCode() {
        return 885084173;
    }

    private Android() {
    }

    @Override // io.ktor.client.engine.HttpClientEngineFactory
    public final io.ktor.client.engine.HttpClientEngine create(kotlin.jvm.functions.Function1<? super io.ktor.client.engine.android.AndroidEngineConfig, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        io.ktor.client.engine.android.AndroidEngineConfig androidEngineConfig = new io.ktor.client.engine.android.AndroidEngineConfig();
        block.invoke(androidEngineConfig);
        return new io.ktor.client.engine.android.AndroidClientEngine(androidEngineConfig);
    }

    public final java.lang.String toString() {
        return "Android";
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.client.engine.android.Android)) {
            return false;
        }
        return true;
    }
}
