package com.zettle.sdk.meta;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class Sessions$getSessionId$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.String> {
    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ java.lang.String invoke() {
        return ((com.zettle.sdk.meta.Sessions) this.receiver).generateSessionId$core_publicRelease();
    }

    Sessions$getSessionId$1(java.lang.Object obj) {
        super(0, obj, com.zettle.sdk.meta.Sessions.class, "generateSessionId", "generateSessionId$core_publicRelease()Ljava/lang/String;", 0);
    }
}
