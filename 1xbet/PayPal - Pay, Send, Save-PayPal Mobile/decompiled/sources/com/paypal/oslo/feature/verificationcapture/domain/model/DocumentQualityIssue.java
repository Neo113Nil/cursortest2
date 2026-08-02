package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "", "<init>", "()V", "Blurry", "PoorLighting", "TooSmall", "TooLarge", "MissingCorners", "Expired", "UnsupportedFormat", "Corrupted", "Other", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$Blurry;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$Corrupted;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$Expired;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$MissingCorners;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$Other;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$PoorLighting;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$TooLarge;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$TooSmall;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$UnsupportedFormat;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DocumentQualityIssue {
    public static final int $stable = 0;

    private DocumentQualityIssue() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$Blurry;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Blurry extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Blurry INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Blurry();

        public final int hashCode() {
            return -483185236;
        }

        private Blurry() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Blurry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Blurry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$PoorLighting;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PoorLighting extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.PoorLighting INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.PoorLighting();

        public final int hashCode() {
            return -526621812;
        }

        private PoorLighting() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PoorLighting";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.PoorLighting)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$TooSmall;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TooSmall extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.TooSmall INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.TooSmall();

        public final int hashCode() {
            return -1011757743;
        }

        private TooSmall() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TooSmall";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.TooSmall)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$TooLarge;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TooLarge extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.TooLarge INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.TooLarge();

        public final int hashCode() {
            return -1018563707;
        }

        private TooLarge() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TooLarge";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.TooLarge)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$MissingCorners;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MissingCorners extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.MissingCorners INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.MissingCorners();

        public final int hashCode() {
            return -2039906506;
        }

        private MissingCorners() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MissingCorners";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.MissingCorners)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$Expired;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Expired extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Expired INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Expired();

        public final int hashCode() {
            return 907334183;
        }

        private Expired() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Expired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Expired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$UnsupportedFormat;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnsupportedFormat extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.UnsupportedFormat INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.UnsupportedFormat();

        public final int hashCode() {
            return -836658418;
        }

        private UnsupportedFormat() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnsupportedFormat";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.UnsupportedFormat)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$Corrupted;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Corrupted extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Corrupted INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Corrupted();

        public final int hashCode() {
            return -1374874130;
        }

        private Corrupted() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Corrupted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Corrupted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$Other;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue$Other;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Other extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Other(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Other(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Other) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Other) other).message);
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Other copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Other(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Other copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.Other other, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = other.message;
            }
            return other.copy(str);
        }
    }

    public /* synthetic */ DocumentQualityIssue(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
