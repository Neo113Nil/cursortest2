package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;", "", "", com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, "formatLocale", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getLanguage", "getLanguage$annotations", "()V", "getFormatLocale", "getFormatLocale$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SupportedLanguage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.domain.model.SupportedLanguage.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.SupportedLanguage.Companion(null);
    private final java.lang.String formatLocale;
    private final java.lang.String language;

    @kotlinx.serialization.SerialName("formatLocale")
    public static /* synthetic */ void getFormatLocale$annotations() {
    }

    @kotlinx.serialization.SerialName(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY)
    public static /* synthetic */ void getLanguage$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.SupportedLanguage> serializer() {
            return com.paypal.oslo.core.i18n.domain.model.SupportedLanguage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SupportedLanguage(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.core.i18n.domain.model.SupportedLanguage$$serializer.INSTANCE.getDescriptor());
        }
        this.language = str;
        this.formatLocale = str2;
    }

    public SupportedLanguage(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.language = str;
        this.formatLocale = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$i18n_release(com.paypal.oslo.core.i18n.domain.model.SupportedLanguage self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.language);
        output.encodeStringElement(serialDesc, 1, self.formatLocale);
    }

    public final java.lang.String getLanguage() {
        return this.language;
    }

    public final java.lang.String getFormatLocale() {
        return this.formatLocale;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.language;
        java.lang.String str2 = this.formatLocale;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SupportedLanguage(language=");
        sb.append(str);
        sb.append(", formatLocale=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.language.hashCode() * 31) + this.formatLocale.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.SupportedLanguage)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.SupportedLanguage supportedLanguage = (com.paypal.oslo.core.i18n.domain.model.SupportedLanguage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.language, supportedLanguage.language) && kotlin.jvm.internal.Intrinsics.areEqual(this.formatLocale, supportedLanguage.formatLocale);
    }

    public final com.paypal.oslo.core.i18n.domain.model.SupportedLanguage copy(java.lang.String language, java.lang.String formatLocale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatLocale, "");
        return new com.paypal.oslo.core.i18n.domain.model.SupportedLanguage(language, formatLocale);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFormatLocale() {
        return this.formatLocale;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLanguage() {
        return this.language;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.SupportedLanguage copy$default(com.paypal.oslo.core.i18n.domain.model.SupportedLanguage supportedLanguage, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = supportedLanguage.language;
        }
        if ((i & 2) != 0) {
            str2 = supportedLanguage.formatLocale;
        }
        return supportedLanguage.copy(str, str2);
    }
}
