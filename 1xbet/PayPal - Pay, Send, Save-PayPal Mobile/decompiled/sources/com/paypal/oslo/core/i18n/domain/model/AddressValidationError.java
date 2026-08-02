package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "", "<init>", "()V", "MissingRequired", "InvalidPattern", "MissingOneOf", "InvalidAllOffensive", "AddressContainsPOBox", "AddressContainsRuralRoute", "AddressContainsInvalidCharacter", "UnknownError", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$AddressContainsInvalidCharacter;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$AddressContainsPOBox;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$AddressContainsRuralRoute;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$InvalidAllOffensive;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$InvalidPattern;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$MissingOneOf;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$MissingRequired;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AddressValidationError {
    private AddressValidationError() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$MissingRequired;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "fields", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$MissingRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class MissingRequired extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError {
        private final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> fields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MissingRequired(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.fields = list;
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> getFields() {
            return this.fields;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> list = this.fields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MissingRequired(fields=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.fields, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired) other).fields);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired copy(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> fields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired(fields);
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> component1() {
            return this.fields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired copy$default(com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired missingRequired, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = missingRequired.fields;
            }
            return missingRequired.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$InvalidPattern;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "fields", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$InvalidPattern;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class InvalidPattern extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError {
        private final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> fields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidPattern(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.fields = list;
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> getFields() {
            return this.fields;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> list = this.fields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidPattern(fields=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern) && kotlin.jvm.internal.Intrinsics.areEqual(this.fields, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern) other).fields);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern copy(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> fields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern(fields);
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> component1() {
            return this.fields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern copy$default(com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern invalidPattern, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = invalidPattern.fields;
            }
            return invalidPattern.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$MissingOneOf;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "fields", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$MissingOneOf;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class MissingOneOf extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError {
        private final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> fields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MissingOneOf(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.fields = list;
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> getFields() {
            return this.fields;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> list = this.fields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MissingOneOf(fields=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf) && kotlin.jvm.internal.Intrinsics.areEqual(this.fields, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf) other).fields);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf copy(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> fields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf(fields);
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> component1() {
            return this.fields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf copy$default(com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf missingOneOf, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = missingOneOf.fields;
            }
            return missingOneOf.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$InvalidAllOffensive;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "fields", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$InvalidAllOffensive;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class InvalidAllOffensive extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError {
        private final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> fields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidAllOffensive(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.fields = list;
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> getFields() {
            return this.fields;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> list = this.fields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidAllOffensive(fields=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive) && kotlin.jvm.internal.Intrinsics.areEqual(this.fields, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive) other).fields);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive copy(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> fields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive(fields);
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> component1() {
            return this.fields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive copy$default(com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive invalidAllOffensive, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = invalidAllOffensive.fields;
            }
            return invalidAllOffensive.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$AddressContainsPOBox;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "fields", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$AddressContainsPOBox;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class AddressContainsPOBox extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError {
        private final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> fields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AddressContainsPOBox(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.fields = list;
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> getFields() {
            return this.fields;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> list = this.fields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressContainsPOBox(fields=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox) && kotlin.jvm.internal.Intrinsics.areEqual(this.fields, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox) other).fields);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox copy(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> fields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox(fields);
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> component1() {
            return this.fields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox copy$default(com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox addressContainsPOBox, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = addressContainsPOBox.fields;
            }
            return addressContainsPOBox.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$AddressContainsRuralRoute;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "fields", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$AddressContainsRuralRoute;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class AddressContainsRuralRoute extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError {
        private final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> fields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AddressContainsRuralRoute(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.fields = list;
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> getFields() {
            return this.fields;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> list = this.fields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressContainsRuralRoute(fields=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute) && kotlin.jvm.internal.Intrinsics.areEqual(this.fields, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute) other).fields);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute copy(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> fields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute(fields);
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> component1() {
            return this.fields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute copy$default(com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute addressContainsRuralRoute, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = addressContainsRuralRoute.fields;
            }
            return addressContainsRuralRoute.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$AddressContainsInvalidCharacter;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "fields", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$AddressContainsInvalidCharacter;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class AddressContainsInvalidCharacter extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError {
        private final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> fields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AddressContainsInvalidCharacter(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.fields = list;
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> getFields() {
            return this.fields;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> list = this.fields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressContainsInvalidCharacter(fields=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter) && kotlin.jvm.internal.Intrinsics.areEqual(this.fields, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter) other).fields);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter copy(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> fields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter(fields);
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> component1() {
            return this.fields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter copy$default(com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter addressContainsInvalidCharacter, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = addressContainsInvalidCharacter.fields;
            }
            return addressContainsInvalidCharacter.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$UnknownError;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class UnknownError extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError {
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.UnknownError) other).reason);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressValidationError.UnknownError copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressValidationError.UnknownError(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressValidationError.UnknownError copy$default(com.paypal.oslo.core.i18n.domain.model.AddressValidationError.UnknownError unknownError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.reason;
            }
            return unknownError.copy(str);
        }
    }

    public /* synthetic */ AddressValidationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
