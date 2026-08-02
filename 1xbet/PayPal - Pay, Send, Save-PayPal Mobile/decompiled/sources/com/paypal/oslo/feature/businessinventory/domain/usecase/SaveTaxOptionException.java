package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "<init>", "()V", "NameTooLong", "Duplicated", "ExceedsMaxItemLimit", "NotFound", "Unknown", "FeatureDisabled", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$Duplicated;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$ExceedsMaxItemLimit;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$FeatureDisabled;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$NameTooLong;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$NotFound;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class SaveTaxOptionException extends java.lang.Exception {
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$NameTooLong;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NameTooLong extends com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException {
        public static final com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.NameTooLong INSTANCE = new com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.NameTooLong();
        public static final int $stable = 8;

        private NameTooLong() {
            super(null);
        }
    }

    private SaveTaxOptionException() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$Duplicated;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Duplicated extends com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException {
        public static final com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.Duplicated INSTANCE = new com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.Duplicated();
        public static final int $stable = 8;

        private Duplicated() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$ExceedsMaxItemLimit;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ExceedsMaxItemLimit extends com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException {
        public static final com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.ExceedsMaxItemLimit INSTANCE = new com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.ExceedsMaxItemLimit();
        public static final int $stable = 8;

        private ExceedsMaxItemLimit() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$NotFound;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NotFound extends com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException {
        public static final com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.NotFound INSTANCE = new com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.NotFound();
        public static final int $stable = 8;

        private NotFound() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$Unknown;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Unknown extends com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException {
        public static final com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.Unknown INSTANCE = new com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.Unknown();
        public static final int $stable = 8;

        private Unknown() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException$FeatureDisabled;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeatureDisabled extends com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException {
        public static final com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.FeatureDisabled INSTANCE = new com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.FeatureDisabled();
        public static final int $stable = 8;

        private FeatureDisabled() {
            super(null);
        }
    }

    public /* synthetic */ SaveTaxOptionException(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
