package com.ingo.sdk.kotlin.common.model.result;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 #2\u00020\u0001:\u0001#B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013R\u0014\u0010 \u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0014\u0010\"\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013\u0082\u0001\u0003$%&"}, d2 = {"Lcom/ingo/sdk/kotlin/common/model/result/BaseIngoSdkResult;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/ingo/sdk/kotlin/common/model/result/BaseIngoSdkResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getExitCode", "()Ljava/lang/String;", "exitCode", "", "getExitOnUTC", "()J", "exitOnUTC", "getCustomerIdentifier", com.ingo.sdk.android.ux.activity.IngoSdkActivity.CUSTOMER_IDENTIFIER, "getTransactionReferenceNumber", "transactionReferenceNumber", "getTitle", "title", "getDetail", "detail", "getLastModule", "lastModule", "Companion", "Lcom/ingo/sdk/kotlin/common/model/result/CustomerEnrollmentNotCompleteResult;", "Lcom/ingo/sdk/kotlin/common/model/result/IngoSdkResult;", "Lcom/ingo/sdk/kotlin/common/model/result/LegalDocumentsPendingAcceptanceResult;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes9.dex */
public abstract class BaseIngoSdkResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.model.result.BaseIngoSdkResult.Companion INSTANCE = new com.ingo.sdk.kotlin.common.model.result.BaseIngoSdkResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.model.result.BaseIngoSdkResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.ingo.sdk.kotlin.common.model.result.BaseIngoSdkResult.$r8$lambda$CNa1QLqThK42_PYZqK2jo7u7zY8();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.ingo.sdk.kotlin.common.model.result.BaseIngoSdkResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    public abstract java.lang.String getCustomerIdentifier();

    public abstract java.lang.String getDetail();

    public abstract java.lang.String getExitCode();

    public abstract long getExitOnUTC();

    public abstract java.lang.String getLastModule();

    public abstract java.lang.String getTitle();

    public abstract java.lang.String getTransactionReferenceNumber();

    private BaseIngoSdkResult() {
    }

    public /* synthetic */ BaseIngoSdkResult(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/model/result/BaseIngoSdkResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/model/result/BaseIngoSdkResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.model.result.BaseIngoSdkResult> serializer() {
            return (kotlinx.serialization.KSerializer) com.ingo.sdk.kotlin.common.model.result.BaseIngoSdkResult.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$CNa1QLqThK42_PYZqK2jo7u7zY8() {
        return new kotlinx.serialization.SealedClassSerializer("com.ingo.sdk.kotlin.common.model.result.BaseIngoSdkResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.model.result.BaseIngoSdkResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.model.result.CustomerEnrollmentNotCompleteResult.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.model.result.IngoSdkResult.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.model.result.LegalDocumentsPendingAcceptanceResult.class)}, new kotlinx.serialization.KSerializer[]{com.ingo.sdk.kotlin.common.model.result.CustomerEnrollmentNotCompleteResult$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.model.result.IngoSdkResult$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.model.result.LegalDocumentsPendingAcceptanceResult$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ BaseIngoSdkResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
