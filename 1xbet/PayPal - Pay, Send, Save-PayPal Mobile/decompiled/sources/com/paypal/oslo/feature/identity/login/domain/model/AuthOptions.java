package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0017\u0018\u0019\u001a"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "OTPAuthOption", "PasswordAuthOption", "PasskeyAuthOption", "BiometricAuthOption", "PhoneChallenge", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$BiometricAuthOption;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$OTPAuthOption;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PasskeyAuthOption;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PasswordAuthOption;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class AuthOptions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.Companion INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.$r8$lambda$CFjs96GphMT9tDNv16TrDVDBjss();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AuthOptions() {
    }

    public /* synthetic */ AuthOptions(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$OTPAuthOption;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "", "nonce", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PhoneChallenge;", "phoneChallenges", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$OTPAuthOption;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$OTPAuthOption;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getNonce", "Ljava/util/List;", "getPhoneChallenges", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class OTPAuthOption extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions {
        private final java.lang.String nonce;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge> phoneChallenges;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption.Companion INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$OTPAuthOption$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption.$r8$lambda$y2dHWXnXgIC8mFQ3ebT1MXPy8DA();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$OTPAuthOption$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$OTPAuthOption;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption> serializer() {
                return com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$OTPAuthOption$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OTPAuthOption(int i, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$OTPAuthOption$$serializer.INSTANCE.getDescriptor());
            }
            this.nonce = str;
            this.phoneChallenges = list;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OTPAuthOption(java.lang.String str, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.nonce = str;
            this.phoneChallenges = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.nonce);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.phoneChallenges);
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge> getPhoneChallenges() {
            return this.phoneChallenges;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$y2dHWXnXgIC8mFQ3ebT1MXPy8DA() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$PhoneChallenge$$serializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.nonce;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge> list = this.phoneChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OTPAuthOption(nonce=");
            sb.append(str);
            sb.append(", phoneChallenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.nonce.hashCode() * 31) + this.phoneChallenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption oTPAuthOption = (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, oTPAuthOption.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneChallenges, oTPAuthOption.phoneChallenges);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption copy(java.lang.String nonce, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge> phoneChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneChallenges, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption(nonce, phoneChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge> component2() {
            return this.phoneChallenges;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption oTPAuthOption, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = oTPAuthOption.nonce;
            }
            if ((i & 2) != 0) {
                list = oTPAuthOption.phoneChallenges;
            }
            return oTPAuthOption.copy(str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PasswordAuthOption;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes5.dex */
    public static final /* data */ class PasswordAuthOption extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$PasswordAuthOption$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.m15169$r8$lambda$7GG2DVwSYuv3OrXnL9i0B_tthg();
            }
        });

        public final int hashCode() {
            return -1800722533;
        }

        private PasswordAuthOption() {
            super(null);
        }

        /* renamed from: $r8$lambda$7GG2DVw-SYuv3OrXnL9i0B_tthg, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m15169$r8$lambda$7GG2DVwSYuv3OrXnL9i0B_tthg() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "PasswordAuthOption";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PasskeyAuthOption;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "", "", "passkeyCredentialIds", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PasskeyAuthOption;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PasskeyAuthOption;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getPasskeyCredentialIds", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class PasskeyAuthOption extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions {
        private final java.util.List<java.lang.String> passkeyCredentialIds;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption.Companion INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$PasskeyAuthOption$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption.$r8$lambda$i6vBGWkmgvS8mSHxeu436ag5Dl4();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PasskeyAuthOption$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PasskeyAuthOption;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption> serializer() {
                return com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$PasskeyAuthOption$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PasskeyAuthOption(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$PasskeyAuthOption$$serializer.INSTANCE.getDescriptor());
            }
            this.passkeyCredentialIds = list;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasskeyAuthOption(java.util.List<java.lang.String> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.passkeyCredentialIds = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.passkeyCredentialIds);
        }

        public final java.util.List<java.lang.String> getPasskeyCredentialIds() {
            return this.passkeyCredentialIds;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$i6vBGWkmgvS8mSHxeu436ag5Dl4() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.passkeyCredentialIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyAuthOption(passkeyCredentialIds=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.passkeyCredentialIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyCredentialIds, ((com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption) other).passkeyCredentialIds);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption copy(java.util.List<java.lang.String> passkeyCredentialIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCredentialIds, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption(passkeyCredentialIds);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.passkeyCredentialIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption passkeyAuthOption, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = passkeyAuthOption.passkeyCredentialIds;
            }
            return passkeyAuthOption.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$BiometricAuthOption;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes5.dex */
    public static final /* data */ class BiometricAuthOption extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$BiometricAuthOption$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption.$r8$lambda$gVWTFaLjzHi7qIiAmMN3mh28TvE();
            }
        });

        public final int hashCode() {
            return 612647186;
        }

        private BiometricAuthOption() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$gVWTFaLjzHi7qIiAmMN3mh28TvE() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "BiometricAuthOption";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b\u0006\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PhoneChallenge;", "", "", "challengeId", "phoneNumber", "", "isNotified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PhoneChallenge;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PhoneChallenge;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getChallengeId", "getPhoneNumber", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class PhoneChallenge {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge.Companion INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge.Companion(null);
        private final java.lang.String challengeId;
        private final boolean isNotified;
        private final java.lang.String phoneNumber;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PhoneChallenge$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions$PhoneChallenge;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge> serializer() {
                return com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$PhoneChallenge$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PhoneChallenge(int i, java.lang.String str, java.lang.String str2, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$PhoneChallenge$$serializer.INSTANCE.getDescriptor());
            }
            this.challengeId = str;
            this.phoneNumber = str2;
            if ((i & 4) == 0) {
                this.isNotified = false;
            } else {
                this.isNotified = z;
            }
        }

        public PhoneChallenge(java.lang.String str, java.lang.String str2, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.challengeId = str;
            this.phoneNumber = str2;
            this.isNotified = z;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.challengeId);
            output.encodeStringElement(serialDesc, 1, self.phoneNumber);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isNotified) {
                output.encodeBooleanElement(serialDesc, 2, self.isNotified);
            }
        }

        public /* synthetic */ PhoneChallenge(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final boolean isNotified() {
            return this.isNotified;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.challengeId;
            java.lang.String str2 = this.phoneNumber;
            boolean z = this.isNotified;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneChallenge(challengeId=");
            sb.append(str);
            sb.append(", phoneNumber=");
            sb.append(str2);
            sb.append(", isNotified=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.challengeId.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isNotified);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge phoneChallenge = (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, phoneChallenge.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, phoneChallenge.phoneNumber) && this.isNotified == phoneChallenge.isNotified;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge copy(java.lang.String challengeId, java.lang.String phoneNumber, boolean isNotified) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge(challengeId, phoneNumber, isNotified);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsNotified() {
            return this.isNotified;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge phoneChallenge, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phoneChallenge.challengeId;
            }
            if ((i & 2) != 0) {
                str2 = phoneChallenge.phoneNumber;
            }
            if ((i & 4) != 0) {
                z = phoneChallenge.isNotified;
            }
            return phoneChallenge.copy(str, str2, z);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$CFjs96GphMT9tDNv16TrDVDBjss() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.identity.login.domain.model.AuthOptions", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption", com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$OTPAuthOption$$serializer.INSTANCE, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions$PasskeyAuthOption$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption", com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ AuthOptions(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
