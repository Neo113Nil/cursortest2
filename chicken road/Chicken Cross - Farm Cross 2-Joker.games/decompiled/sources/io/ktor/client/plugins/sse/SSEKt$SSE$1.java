package io.ktor.client.plugins.sse;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SSE.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class SSEKt$SSE$1 extends FunctionReferenceImpl implements Function0<SSEConfig> {
    public static final SSEKt$SSE$1 INSTANCE = new SSEKt$SSE$1();

    SSEKt$SSE$1() {
        super(0, SSEConfig.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SSEConfig invoke() {
        return new SSEConfig();
    }
}
