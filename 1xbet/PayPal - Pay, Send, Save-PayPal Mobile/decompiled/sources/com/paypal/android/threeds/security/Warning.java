package com.paypal.android.threeds.security;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/android/threeds/security/Warning;", "", "", "id", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/android/threeds/security/Warning$Severity;", "severity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/security/Warning$Severity;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/android/threeds/security/Warning$Severity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/security/Warning$Severity;)Lcom/paypal/android/threeds/security/Warning;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getDescription", "Lcom/paypal/android/threeds/security/Warning$Severity;", "getSeverity", "Severity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Warning {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final java.lang.String id;
    private final com.paypal.android.threeds.security.Warning.Severity severity;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/android/threeds/security/Warning$Severity;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "MEDIUM", "HIGH"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Severity {
        public static final com.paypal.android.threeds.security.Warning.Severity HIGH;
        public static final com.paypal.android.threeds.security.Warning.Severity LOW;
        public static final com.paypal.android.threeds.security.Warning.Severity MEDIUM;
        private static final /* synthetic */ com.paypal.android.threeds.security.Warning.Severity[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

        private Severity(java.lang.String str, int i) {
        }

        static {
            com.paypal.android.threeds.security.Warning.Severity severity = new com.paypal.android.threeds.security.Warning.Severity("LOW", 0);
            LOW = severity;
            com.paypal.android.threeds.security.Warning.Severity severity2 = new com.paypal.android.threeds.security.Warning.Severity("MEDIUM", 1);
            MEDIUM = severity2;
            com.paypal.android.threeds.security.Warning.Severity severity3 = new com.paypal.android.threeds.security.Warning.Severity("HIGH", 2);
            HIGH = severity3;
            com.paypal.android.threeds.security.Warning.Severity[] severityArr = {severity, severity2, severity3};
            getHighResolutionOutputSizeshNQ4ISI = severityArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(severityArr);
        }

        public static com.paypal.android.threeds.security.Warning.Severity[] values() {
            return (com.paypal.android.threeds.security.Warning.Severity[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.android.threeds.security.Warning.Severity valueOf(java.lang.String str) {
            return (com.paypal.android.threeds.security.Warning.Severity) java.lang.Enum.valueOf(com.paypal.android.threeds.security.Warning.Severity.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.android.threeds.security.Warning.Severity> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    public Warning(java.lang.String str, java.lang.String str2, com.paypal.android.threeds.security.Warning.Severity severity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(severity, "");
        this.id = str;
        this.description = str2;
        this.severity = severity;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.android.threeds.security.Warning.Severity getSeverity() {
        return this.severity;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.description;
        com.paypal.android.threeds.security.Warning.Severity severity = this.severity;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Warning(id=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", severity=");
        sb.append(severity);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.description.hashCode()) * 31) + this.severity.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.security.Warning)) {
            return false;
        }
        com.paypal.android.threeds.security.Warning warning = (com.paypal.android.threeds.security.Warning) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, warning.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, warning.description) && this.severity == warning.severity;
    }

    public final com.paypal.android.threeds.security.Warning copy(java.lang.String id, java.lang.String description, com.paypal.android.threeds.security.Warning.Severity severity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(severity, "");
        return new com.paypal.android.threeds.security.Warning(id, description, severity);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.android.threeds.security.Warning.Severity getSeverity() {
        return this.severity;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.android.threeds.security.Warning copy$default(com.paypal.android.threeds.security.Warning warning, java.lang.String str, java.lang.String str2, com.paypal.android.threeds.security.Warning.Severity severity, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = warning.id;
        }
        if ((i & 2) != 0) {
            str2 = warning.description;
        }
        if ((i & 4) != 0) {
            severity = warning.severity;
        }
        return warning.copy(str, str2, severity);
    }
}
