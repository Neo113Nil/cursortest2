package io.ktor.client.plugins.observer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ResponseObserver.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class ResponseObserverKt$ResponseObserver$1 extends FunctionReferenceImpl implements Function0<ResponseObserverConfig> {
    public static final ResponseObserverKt$ResponseObserver$1 INSTANCE = new ResponseObserverKt$ResponseObserver$1();

    ResponseObserverKt$ResponseObserver$1() {
        super(0, ResponseObserverConfig.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ResponseObserverConfig invoke() {
        return new ResponseObserverConfig();
    }
}
