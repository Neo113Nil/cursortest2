package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameInput;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Person", "Business", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Business;", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class NameInput {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.domain.model.NameInput.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.NameInput.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.NameInput$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.i18n.domain.model.NameInput.$r8$lambda$He2MNM9pgmyFMnRqeDqB5e3P5Io();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.core.i18n.domain.model.NameInput self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.NameInput> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.core.i18n.domain.model.NameInput.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private NameInput() {
    }

    public /* synthetic */ NameInput(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person;", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput;", "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "name", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/PersonName;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/i18n/domain/model/PersonName;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/PersonName;)Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "getName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Person extends com.paypal.oslo.core.i18n.domain.model.NameInput {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.i18n.domain.model.NameInput.Person.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.NameInput.Person.Companion(null);
        private final com.paypal.oslo.core.i18n.domain.model.PersonName name;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.NameInput.Person> serializer() {
                return com.paypal.oslo.core.i18n.domain.model.NameInput$Person$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Person(int i, com.paypal.oslo.core.i18n.domain.model.PersonName personName, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.i18n.domain.model.NameInput$Person$$serializer.INSTANCE.getDescriptor());
            }
            this.name = personName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Person(com.paypal.oslo.core.i18n.domain.model.PersonName personName) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
            this.name = personName;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$i18n_release(com.paypal.oslo.core.i18n.domain.model.NameInput.Person self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.core.i18n.domain.model.NameInput.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.core.i18n.domain.model.PersonName$$serializer.INSTANCE, self.name);
        }

        public final com.paypal.oslo.core.i18n.domain.model.PersonName getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.PersonName personName = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Person(name=");
            sb.append(personName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Person) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.core.i18n.domain.model.NameInput.Person) other).name);
        }

        public final com.paypal.oslo.core.i18n.domain.model.NameInput.Person copy(com.paypal.oslo.core.i18n.domain.model.PersonName name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.core.i18n.domain.model.NameInput.Person(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.PersonName getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameInput.Person copy$default(com.paypal.oslo.core.i18n.domain.model.NameInput.Person person, com.paypal.oslo.core.i18n.domain.model.PersonName personName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personName = person.name;
            }
            return person.copy(personName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Business;", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput;", "", "businessName", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Business;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Business;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getBusinessName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Business extends com.paypal.oslo.core.i18n.domain.model.NameInput {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.i18n.domain.model.NameInput.Business.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.NameInput.Business.Companion(null);
        private final java.lang.String businessName;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Business$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Business;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.NameInput.Business> serializer() {
                return com.paypal.oslo.core.i18n.domain.model.NameInput$Business$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Business(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.i18n.domain.model.NameInput$Business$$serializer.INSTANCE.getDescriptor());
            }
            this.businessName = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Business(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.businessName = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$i18n_release(com.paypal.oslo.core.i18n.domain.model.NameInput.Business self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.core.i18n.domain.model.NameInput.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.businessName);
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.businessName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Business(businessName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.businessName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Business) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, ((com.paypal.oslo.core.i18n.domain.model.NameInput.Business) other).businessName);
        }

        public final com.paypal.oslo.core.i18n.domain.model.NameInput.Business copy(java.lang.String businessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            return new com.paypal.oslo.core.i18n.domain.model.NameInput.Business(businessName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameInput.Business copy$default(com.paypal.oslo.core.i18n.domain.model.NameInput.Business business, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = business.businessName;
            }
            return business.copy(str);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$He2MNM9pgmyFMnRqeDqB5e3P5Io() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.core.i18n.domain.model.NameInput", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.NameInput.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.NameInput.Business.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.NameInput.Person.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.core.i18n.domain.model.NameInput$Business$$serializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.NameInput$Person$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ NameInput(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
