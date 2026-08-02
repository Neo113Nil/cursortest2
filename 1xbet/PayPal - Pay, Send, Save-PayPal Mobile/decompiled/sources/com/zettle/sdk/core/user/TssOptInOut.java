package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/TssOptInOut;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "OPT_IN", "OPT_OUT", "NO_TSS_OPT_IN_OUT_DECISION"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public enum TssOptInOut {
    OPT_IN,
    OPT_OUT,
    NO_TSS_OPT_IN_OUT_DECISION;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.TssOptInOut.Companion INSTANCE = new com.zettle.sdk.core.user.TssOptInOut.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.zettle.sdk.core.user.TssOptInOut$Companion$$cachedSerializer$delegate$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
            return kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.zettle.sdk.core.user.TssOptInOut", com.zettle.sdk.core.user.TssOptInOut.values());
        }
    });

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/TssOptInOut$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/TssOptInOut;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.TssOptInOut> serializer() {
            return (kotlinx.serialization.KSerializer) com.zettle.sdk.core.user.TssOptInOut.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
