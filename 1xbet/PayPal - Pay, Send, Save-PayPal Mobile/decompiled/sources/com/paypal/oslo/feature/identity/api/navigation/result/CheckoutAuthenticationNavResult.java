package com.paypal.oslo.feature.identity.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/CheckoutAuthenticationNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/UserCanceled;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "result", "<init>", "(Larrow/core/Either;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Larrow/core/Either;", "copy", "(Larrow/core/Either;)Lcom/paypal/oslo/feature/identity/api/navigation/result/CheckoutAuthenticationNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/CheckoutAuthenticationNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Larrow/core/Either;", "getResult", "getResult$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CheckoutAuthenticationNavResult implements com.paypal.oslo.core.navigation.result.NavResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult.Companion(null);
    private final arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> result;

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getResult$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/CheckoutAuthenticationNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/CheckoutAuthenticationNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult> serializer() {
            return com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CheckoutAuthenticationNavResult(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            defaultRaise.raise(com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            this.result = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public CheckoutAuthenticationNavResult(arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        this.result = either;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> getResult() {
        return this.result;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CheckoutAuthenticationNavResult(arrow.core.Either either, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(either);
        if ((i & 1) != 0) {
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                defaultRaise.raise(com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.RaiseCancellationException e) {
                defaultRaise.complete();
                either = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        }
    }

    public final java.lang.String toString() {
        arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> either = this.result;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutAuthenticationNavResult(result=");
        sb.append(either);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.result.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult) other).result);
    }

    public final com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult copy(arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        return new com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult(result);
    }

    public final arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> component1() {
        return this.result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult copy$default(com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult checkoutAuthenticationNavResult, arrow.core.Either either, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            either = checkoutAuthenticationNavResult.result;
        }
        return checkoutAuthenticationNavResult.copy(either);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutAuthenticationNavResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
