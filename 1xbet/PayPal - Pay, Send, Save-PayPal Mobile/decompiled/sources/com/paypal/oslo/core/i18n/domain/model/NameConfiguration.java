package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Person", "Business", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Business;", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Person;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class NameConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.NameConfiguration$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.i18n.domain.model.NameConfiguration.$r8$lambda$yyeFIsc_wjUXenexvbW16308DXE();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.core.i18n.domain.model.NameConfiguration self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.NameConfiguration> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.core.i18n.domain.model.NameConfiguration.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private NameConfiguration() {
    }

    public /* synthetic */ NameConfiguration(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J'\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001aR\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Person;", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;", "Lcom/paypal/oslo/core/i18n/domain/model/NameStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "nationality", "Lcom/paypal/oslo/core/i18n/domain/model/PersonType;", "personType", "Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;", "formatOptions", "Ljava/util/Locale;", "locale", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/NameStyle;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/PersonType;Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;Ljava/util/Locale;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/i18n/domain/model/NameStyle;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/PersonType;Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;Ljava/util/Locale;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/NameStyle;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/PersonType;", "component4", "()Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;", "component5", "()Ljava/util/Locale;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/NameStyle;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/PersonType;Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;Ljava/util/Locale;)Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Person;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Person;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/i18n/domain/model/NameStyle;", "getStyle", "Ljava/lang/String;", "getNationality", "Lcom/paypal/oslo/core/i18n/domain/model/PersonType;", "getPersonType", "Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;", "getFormatOptions", "Ljava/util/Locale;", "getLocale", "getLocale$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Person extends com.paypal.oslo.core.i18n.domain.model.NameConfiguration {
        private final com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions;
        private final java.util.Locale locale;
        private final java.lang.String nationality;
        private final com.paypal.oslo.core.i18n.domain.model.PersonType personType;
        private final com.paypal.oslo.core.i18n.domain.model.NameStyle style;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Person$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.core.i18n.domain.model.NameStyle", com.paypal.oslo.core.i18n.domain.model.NameStyle.values());
                return createSimpleEnumSerializer;
            }
        }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Person$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.core.i18n.domain.model.PersonType", com.paypal.oslo.core.i18n.domain.model.PersonType.values());
                return createSimpleEnumSerializer;
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Person$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.core.i18n.domain.model.FormatOptions.INSTANCE.serializer();
                return serializer;
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Person$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person.$r8$lambda$s_82pHav59oDB2QEE1thgIdx3ro();
            }
        })};

        public static /* synthetic */ void getLocale$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Person$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Person;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person> serializer() {
                return com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Person$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Person(int i, com.paypal.oslo.core.i18n.domain.model.NameStyle nameStyle, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.PersonType personType, com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions, java.util.Locale locale, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            this.style = (i & 1) == 0 ? com.paypal.oslo.core.i18n.domain.model.NameStyle.FULL : nameStyle;
            if ((i & 2) == 0) {
                this.nationality = null;
            } else {
                this.nationality = str;
            }
            if ((i & 4) == 0) {
                this.personType = com.paypal.oslo.core.i18n.domain.model.PersonType.LEGAL;
            } else {
                this.personType = personType;
            }
            if ((i & 8) == 0) {
                this.formatOptions = new com.paypal.oslo.core.i18n.domain.model.FormatOptions.TitleCase(false);
            } else {
                this.formatOptions = formatOptions;
            }
            if ((i & 16) == 0) {
                this.locale = null;
            } else {
                this.locale = locale;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Person(com.paypal.oslo.core.i18n.domain.model.NameStyle nameStyle, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.PersonType personType, com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions, java.util.Locale locale) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameStyle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatOptions, "");
            this.style = nameStyle;
            this.nationality = str;
            this.personType = personType;
            this.formatOptions = formatOptions;
            this.locale = locale;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$i18n_release(com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.core.i18n.domain.model.NameConfiguration.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.style != com.paypal.oslo.core.i18n.domain.model.NameStyle.FULL) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.style);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.nationality != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.nationality);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.personType != com.paypal.oslo.core.i18n.domain.model.PersonType.LEGAL) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.personType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.formatOptions, new com.paypal.oslo.core.i18n.domain.model.FormatOptions.TitleCase(false))) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.formatOptions);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.locale != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.locale);
            }
        }

        public /* synthetic */ Person(com.paypal.oslo.core.i18n.domain.model.NameStyle nameStyle, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.PersonType personType, com.paypal.oslo.core.i18n.domain.model.FormatOptions.TitleCase titleCase, java.util.Locale locale, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.core.i18n.domain.model.NameStyle.FULL : nameStyle, (i & 2) != 0 ? null : str, (i & 4) != 0 ? com.paypal.oslo.core.i18n.domain.model.PersonType.LEGAL : personType, (i & 8) != 0 ? new com.paypal.oslo.core.i18n.domain.model.FormatOptions.TitleCase(false) : titleCase, (i & 16) == 0 ? locale : null);
        }

        public final com.paypal.oslo.core.i18n.domain.model.NameStyle getStyle() {
            return this.style;
        }

        public final java.lang.String getNationality() {
            return this.nationality;
        }

        public final com.paypal.oslo.core.i18n.domain.model.PersonType getPersonType() {
            return this.personType;
        }

        public final com.paypal.oslo.core.i18n.domain.model.FormatOptions getFormatOptions() {
            return this.formatOptions;
        }

        public final java.util.Locale getLocale() {
            return this.locale;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$s_82pHav59oDB2QEE1thgIdx3ro() {
            return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Locale.class), null, new kotlinx.serialization.KSerializer[0]);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.NameStyle nameStyle = this.style;
            java.lang.String str = this.nationality;
            com.paypal.oslo.core.i18n.domain.model.PersonType personType = this.personType;
            com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions = this.formatOptions;
            java.util.Locale locale = this.locale;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Person(style=");
            sb.append(nameStyle);
            sb.append(", nationality=");
            sb.append(str);
            sb.append(", personType=");
            sb.append(personType);
            sb.append(", formatOptions=");
            sb.append(formatOptions);
            sb.append(", locale=");
            sb.append(locale);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.style.hashCode();
            java.lang.String str = this.nationality;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.personType.hashCode();
            int hashCode4 = this.formatOptions.hashCode();
            java.util.Locale locale = this.locale;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (locale != null ? locale.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person)) {
                return false;
            }
            com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person person = (com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person) other;
            return this.style == person.style && kotlin.jvm.internal.Intrinsics.areEqual(this.nationality, person.nationality) && this.personType == person.personType && kotlin.jvm.internal.Intrinsics.areEqual(this.formatOptions, person.formatOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, person.locale);
        }

        public final com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person copy(com.paypal.oslo.core.i18n.domain.model.NameStyle style, java.lang.String nationality, com.paypal.oslo.core.i18n.domain.model.PersonType personType, com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions, java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatOptions, "");
            return new com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person(style, nationality, personType, formatOptions, locale);
        }

        /* renamed from: component5, reason: from getter */
        public final java.util.Locale getLocale() {
            return this.locale;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.FormatOptions getFormatOptions() {
            return this.formatOptions;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.PersonType getPersonType() {
            return this.personType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNationality() {
            return this.nationality;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.NameStyle getStyle() {
            return this.style;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person copy$default(com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person person, com.paypal.oslo.core.i18n.domain.model.NameStyle nameStyle, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.PersonType personType, com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions, java.util.Locale locale, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                nameStyle = person.style;
            }
            if ((i & 2) != 0) {
                str = person.nationality;
            }
            java.lang.String str2 = str;
            if ((i & 4) != 0) {
                personType = person.personType;
            }
            com.paypal.oslo.core.i18n.domain.model.PersonType personType2 = personType;
            if ((i & 8) != 0) {
                formatOptions = person.formatOptions;
            }
            com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions2 = formatOptions;
            if ((i & 16) != 0) {
                locale = person.locale;
            }
            return person.copy(nameStyle, str2, personType2, formatOptions2, locale);
        }

        public Person() {
            this((com.paypal.oslo.core.i18n.domain.model.NameStyle) null, (java.lang.String) null, (com.paypal.oslo.core.i18n.domain.model.PersonType) null, (com.paypal.oslo.core.i18n.domain.model.FormatOptions) null, (java.util.Locale) null, 31, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J'\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0016R\u001f\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Business;", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;", "Lcom/paypal/oslo/core/i18n/domain/model/BusinessCategory;", "businessCategory", "Lcom/paypal/oslo/core/i18n/domain/model/BusinessType;", "businessType", "Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;", "formatOptions", "Ljava/util/Locale;", "locale", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/BusinessCategory;Lcom/paypal/oslo/core/i18n/domain/model/BusinessType;Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;Ljava/util/Locale;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/i18n/domain/model/BusinessCategory;Lcom/paypal/oslo/core/i18n/domain/model/BusinessType;Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;Ljava/util/Locale;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/BusinessCategory;", "component2", "()Lcom/paypal/oslo/core/i18n/domain/model/BusinessType;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;", "component4", "()Ljava/util/Locale;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/BusinessCategory;Lcom/paypal/oslo/core/i18n/domain/model/BusinessType;Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;Ljava/util/Locale;)Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Business;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Business;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/i18n/domain/model/BusinessCategory;", "getBusinessCategory", "Lcom/paypal/oslo/core/i18n/domain/model/BusinessType;", "getBusinessType", "Lcom/paypal/oslo/core/i18n/domain/model/FormatOptions;", "getFormatOptions", "Ljava/util/Locale;", "getLocale", "getLocale$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Business extends com.paypal.oslo.core.i18n.domain.model.NameConfiguration {
        private final com.paypal.oslo.core.i18n.domain.model.BusinessCategory businessCategory;
        private final com.paypal.oslo.core.i18n.domain.model.BusinessType businessType;
        private final com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions;
        private final java.util.Locale locale;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Business$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.core.i18n.domain.model.BusinessCategory", com.paypal.oslo.core.i18n.domain.model.BusinessCategory.values());
                return createSimpleEnumSerializer;
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Business$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.core.i18n.domain.model.BusinessType", com.paypal.oslo.core.i18n.domain.model.BusinessType.values());
                return createSimpleEnumSerializer;
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Business$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.core.i18n.domain.model.FormatOptions.INSTANCE.serializer();
                return serializer;
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Business$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business.$r8$lambda$T4le7hrugyq0zWQNBhCB1LzIaQM();
            }
        })};

        public static /* synthetic */ void getLocale$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Business$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Business;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business> serializer() {
                return com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Business$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Business(int i, com.paypal.oslo.core.i18n.domain.model.BusinessCategory businessCategory, com.paypal.oslo.core.i18n.domain.model.BusinessType businessType, com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions, java.util.Locale locale, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            this.businessCategory = (i & 1) == 0 ? com.paypal.oslo.core.i18n.domain.model.BusinessCategory.DEFAULT : businessCategory;
            if ((i & 2) == 0) {
                this.businessType = com.paypal.oslo.core.i18n.domain.model.BusinessType.REGISTERED;
            } else {
                this.businessType = businessType;
            }
            if ((i & 4) == 0) {
                this.formatOptions = new com.paypal.oslo.core.i18n.domain.model.FormatOptions.TitleCase(false);
            } else {
                this.formatOptions = formatOptions;
            }
            if ((i & 8) == 0) {
                this.locale = null;
            } else {
                this.locale = locale;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Business(com.paypal.oslo.core.i18n.domain.model.BusinessCategory businessCategory, com.paypal.oslo.core.i18n.domain.model.BusinessType businessType, com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions, java.util.Locale locale) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessCategory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatOptions, "");
            this.businessCategory = businessCategory;
            this.businessType = businessType;
            this.formatOptions = formatOptions;
            this.locale = locale;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$i18n_release(com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.core.i18n.domain.model.NameConfiguration.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.businessCategory != com.paypal.oslo.core.i18n.domain.model.BusinessCategory.DEFAULT) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.businessCategory);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.businessType != com.paypal.oslo.core.i18n.domain.model.BusinessType.REGISTERED) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.businessType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(self.formatOptions, new com.paypal.oslo.core.i18n.domain.model.FormatOptions.TitleCase(false))) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.formatOptions);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.locale != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.locale);
            }
        }

        public /* synthetic */ Business(com.paypal.oslo.core.i18n.domain.model.BusinessCategory businessCategory, com.paypal.oslo.core.i18n.domain.model.BusinessType businessType, com.paypal.oslo.core.i18n.domain.model.FormatOptions.TitleCase titleCase, java.util.Locale locale, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.core.i18n.domain.model.BusinessCategory.DEFAULT : businessCategory, (i & 2) != 0 ? com.paypal.oslo.core.i18n.domain.model.BusinessType.REGISTERED : businessType, (i & 4) != 0 ? new com.paypal.oslo.core.i18n.domain.model.FormatOptions.TitleCase(false) : titleCase, (i & 8) != 0 ? null : locale);
        }

        public final com.paypal.oslo.core.i18n.domain.model.BusinessCategory getBusinessCategory() {
            return this.businessCategory;
        }

        public final com.paypal.oslo.core.i18n.domain.model.BusinessType getBusinessType() {
            return this.businessType;
        }

        public final com.paypal.oslo.core.i18n.domain.model.FormatOptions getFormatOptions() {
            return this.formatOptions;
        }

        public final java.util.Locale getLocale() {
            return this.locale;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$T4le7hrugyq0zWQNBhCB1LzIaQM() {
            return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Locale.class), null, new kotlinx.serialization.KSerializer[0]);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.BusinessCategory businessCategory = this.businessCategory;
            com.paypal.oslo.core.i18n.domain.model.BusinessType businessType = this.businessType;
            com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions = this.formatOptions;
            java.util.Locale locale = this.locale;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Business(businessCategory=");
            sb.append(businessCategory);
            sb.append(", businessType=");
            sb.append(businessType);
            sb.append(", formatOptions=");
            sb.append(formatOptions);
            sb.append(", locale=");
            sb.append(locale);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.businessCategory.hashCode();
            int hashCode2 = this.businessType.hashCode();
            int hashCode3 = this.formatOptions.hashCode();
            java.util.Locale locale = this.locale;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (locale == null ? 0 : locale.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business)) {
                return false;
            }
            com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business business = (com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business) other;
            return this.businessCategory == business.businessCategory && this.businessType == business.businessType && kotlin.jvm.internal.Intrinsics.areEqual(this.formatOptions, business.formatOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, business.locale);
        }

        public final com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business copy(com.paypal.oslo.core.i18n.domain.model.BusinessCategory businessCategory, com.paypal.oslo.core.i18n.domain.model.BusinessType businessType, com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions, java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessCategory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatOptions, "");
            return new com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business(businessCategory, businessType, formatOptions, locale);
        }

        /* renamed from: component4, reason: from getter */
        public final java.util.Locale getLocale() {
            return this.locale;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.FormatOptions getFormatOptions() {
            return this.formatOptions;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.BusinessType getBusinessType() {
            return this.businessType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.BusinessCategory getBusinessCategory() {
            return this.businessCategory;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business copy$default(com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business business, com.paypal.oslo.core.i18n.domain.model.BusinessCategory businessCategory, com.paypal.oslo.core.i18n.domain.model.BusinessType businessType, com.paypal.oslo.core.i18n.domain.model.FormatOptions formatOptions, java.util.Locale locale, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                businessCategory = business.businessCategory;
            }
            if ((i & 2) != 0) {
                businessType = business.businessType;
            }
            if ((i & 4) != 0) {
                formatOptions = business.formatOptions;
            }
            if ((i & 8) != 0) {
                locale = business.locale;
            }
            return business.copy(businessCategory, businessType, formatOptions, locale);
        }

        public Business() {
            this((com.paypal.oslo.core.i18n.domain.model.BusinessCategory) null, (com.paypal.oslo.core.i18n.domain.model.BusinessType) null, (com.paypal.oslo.core.i18n.domain.model.FormatOptions) null, (java.util.Locale) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$yyeFIsc_wjUXenexvbW16308DXE() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.core.i18n.domain.model.NameConfiguration", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.NameConfiguration.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Business$$serializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.NameConfiguration$Person$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ NameConfiguration(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
