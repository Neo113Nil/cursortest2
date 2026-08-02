package common.emv.configuration;

/* loaded from: classes17.dex */
public final class EntryConfigurationData {
    public static final common.emv.configuration.EntryConfigurationData EMPTY = new common.emv.configuration.EntryConfigurationData.Builder().build();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f6691a;
    public final java.lang.Boolean b;
    public final java.lang.Boolean c;
    public final java.lang.Boolean d;
    public final java.lang.Boolean e;
    public final java.lang.Long f;
    public final java.lang.Long g;
    public final java.lang.Long h;
    public final java.lang.Long i;
    public final java.lang.Long j;
    public final byte[] k;
    public final java.lang.String l;

    public final java.lang.Boolean isZeroAmountOfflineAllowed() {
        return this.c;
    }

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Boolean f6692a = null;
        public java.lang.Boolean b = null;
        public java.lang.Boolean c = null;
        public java.lang.Boolean d = null;
        public java.lang.Boolean e = null;
        public java.lang.Long f = null;
        public java.lang.Long g = null;
        public java.lang.Long h = null;
        public java.lang.Long i = null;
        public java.lang.Long j = null;
        public byte[] k = null;
        public java.lang.String l = null;

        public common.emv.configuration.EntryConfigurationData build() {
            return new common.emv.configuration.EntryConfigurationData(this.f6692a, this.b, this.c, this.f, this.g, this.h, this.i, this.k, this.d, this.e, this.j, this.l);
        }

        public common.emv.configuration.EntryConfigurationData.Builder setZeroAmountOfflineAllowed(java.lang.Boolean bool) {
            this.c = bool;
            return this;
        }

        public common.emv.configuration.EntryConfigurationData.Builder setZeroAmountAllowed(java.lang.Boolean bool) {
            this.b = bool;
            return this;
        }

        public common.emv.configuration.EntryConfigurationData.Builder setTerminalTransactionQualifier(byte[] bArr) {
            this.k = bArr;
            return this;
        }

        public common.emv.configuration.EntryConfigurationData.Builder setTerminalFloorLimit(java.lang.Long l) {
            this.h = l;
            return this;
        }

        public common.emv.configuration.EntryConfigurationData.Builder setStatusCheckSupport(java.lang.Boolean bool) {
            this.f6692a = bool;
            return this;
        }

        public common.emv.configuration.EntryConfigurationData.Builder setReaderCvmRequiredLimitCashback(java.lang.Long l) {
            this.j = l;
            return this;
        }

        public common.emv.configuration.EntryConfigurationData.Builder setReaderCvmRequiredLimit(java.lang.Long l) {
            this.i = l;
            return this;
        }

        public common.emv.configuration.EntryConfigurationData.Builder setReaderContactlessTransactionLimit(java.lang.Long l) {
            this.f = l;
            return this;
        }

        public common.emv.configuration.EntryConfigurationData.Builder setReaderContactlessFloorLimit(java.lang.Long l) {
            this.g = l;
            return this;
        }

        public void setListOfSupportedAidsForNonPPSE(java.lang.String str) {
            this.l = str;
        }

        public common.emv.configuration.EntryConfigurationData.Builder setExtendedSelectionSupport(java.lang.Boolean bool) {
            this.e = bool;
            return this;
        }

        public common.emv.configuration.EntryConfigurationData.Builder setAllowFormatError(java.lang.Boolean bool) {
            this.d = bool;
            return this;
        }

        public java.lang.String getListOfSupportedAidsForNonPPSE() {
            return this.l;
        }
    }

    public final java.lang.Boolean isZeroAmountAllowed() {
        return this.b;
    }

    public final java.lang.Boolean isStatusCheckSupport() {
        return this.f6691a;
    }

    public final java.lang.Boolean isExtendedSelectionSupport() {
        return this.e;
    }

    public final java.lang.Boolean isAllowFormatError() {
        return this.d;
    }

    public final int hashCode() {
        return (java.util.Objects.hash(this.f6691a, this.b, this.c, this.f, this.g, this.h, this.i, this.d, this.e, this.j, this.l) * 31) + java.util.Arrays.hashCode(this.k);
    }

    public final byte[] getTerminalTransactionQualifier() {
        return this.k;
    }

    public final java.lang.Long getTerminalFloorLimit() {
        return this.h;
    }

    public final java.lang.Long getReaderCvmRequiredLimitCashback() {
        return this.j;
    }

    public final java.lang.Long getReaderCvmRequiredLimit() {
        return this.i;
    }

    public final java.lang.Long getReaderContactlessTransactionLimit() {
        return this.f;
    }

    public final java.lang.Long getReaderContactlessFloorLimit() {
        return this.g;
    }

    public final java.lang.String getListOfSupportedAidsForNonPPSE() {
        return this.l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || common.emv.configuration.EntryConfigurationData.class != obj.getClass()) {
            return false;
        }
        common.emv.configuration.EntryConfigurationData entryConfigurationData = (common.emv.configuration.EntryConfigurationData) obj;
        return java.util.Objects.equals(this.f6691a, entryConfigurationData.f6691a) && java.util.Objects.equals(this.b, entryConfigurationData.b) && java.util.Objects.equals(this.c, entryConfigurationData.c) && java.util.Objects.equals(this.f, entryConfigurationData.f) && java.util.Objects.equals(this.g, entryConfigurationData.g) && java.util.Objects.equals(this.h, entryConfigurationData.h) && java.util.Objects.equals(this.i, entryConfigurationData.i) && java.util.Objects.equals(this.d, entryConfigurationData.d) && java.util.Objects.equals(this.e, entryConfigurationData.e) && java.util.Objects.equals(this.j, entryConfigurationData.j) && java.util.Arrays.equals(this.k, entryConfigurationData.k) && java.util.Objects.equals(this.l, entryConfigurationData.l);
    }

    public EntryConfigurationData(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, byte[] bArr, java.lang.Boolean bool4, java.lang.Boolean bool5, java.lang.Long l5, java.lang.String str) {
        this.f6691a = bool;
        this.b = bool2;
        this.c = bool3;
        this.f = l;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.k = bArr;
        this.d = bool4;
        this.e = bool5;
        this.j = l5;
        this.l = str;
    }
}
