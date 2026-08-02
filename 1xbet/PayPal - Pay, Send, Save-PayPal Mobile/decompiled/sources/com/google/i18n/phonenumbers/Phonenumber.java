package com.google.i18n.phonenumbers;

/* loaded from: classes9.dex */
public final class Phonenumber {
    private Phonenumber() {
    }

    public static class PhoneNumber implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        private boolean hasCountryCode;
        private boolean hasCountryCodeSource;
        private boolean hasExtension;
        private boolean hasItalianLeadingZero;
        private boolean hasNationalNumber;
        private boolean hasNumberOfLeadingZeros;
        private boolean hasPreferredDomesticCarrierCode;
        private boolean hasRawInput;
        private int countryCode_ = 0;
        private long nationalNumber_ = 0;
        private java.lang.String extension_ = "";
        private boolean italianLeadingZero_ = false;
        private int numberOfLeadingZeros_ = 1;
        private java.lang.String rawInput_ = "";
        private java.lang.String preferredDomesticCarrierCode_ = "";
        private com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource countryCodeSource_ = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.UNSPECIFIED;

        public enum CountryCodeSource {
            FROM_NUMBER_WITH_PLUS_SIGN,
            FROM_NUMBER_WITH_IDD,
            FROM_NUMBER_WITHOUT_PLUS_SIGN,
            FROM_DEFAULT_COUNTRY,
            UNSPECIFIED
        }

        public boolean hasCountryCode() {
            return this.hasCountryCode;
        }

        public int getCountryCode() {
            return this.countryCode_;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber setCountryCode(int i) {
            this.hasCountryCode = true;
            this.countryCode_ = i;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber clearCountryCode() {
            this.hasCountryCode = false;
            this.countryCode_ = 0;
            return this;
        }

        public boolean hasNationalNumber() {
            return this.hasNationalNumber;
        }

        public long getNationalNumber() {
            return this.nationalNumber_;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber setNationalNumber(long j) {
            this.hasNationalNumber = true;
            this.nationalNumber_ = j;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber clearNationalNumber() {
            this.hasNationalNumber = false;
            this.nationalNumber_ = 0L;
            return this;
        }

        public boolean hasExtension() {
            return this.hasExtension;
        }

        public java.lang.String getExtension() {
            return this.extension_;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber setExtension(java.lang.String str) {
            this.hasExtension = true;
            this.extension_ = str;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber clearExtension() {
            this.hasExtension = false;
            this.extension_ = "";
            return this;
        }

        public boolean hasItalianLeadingZero() {
            return this.hasItalianLeadingZero;
        }

        public boolean isItalianLeadingZero() {
            return this.italianLeadingZero_;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber setItalianLeadingZero(boolean z) {
            this.hasItalianLeadingZero = true;
            this.italianLeadingZero_ = z;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber clearItalianLeadingZero() {
            this.hasItalianLeadingZero = false;
            this.italianLeadingZero_ = false;
            return this;
        }

        public boolean hasNumberOfLeadingZeros() {
            return this.hasNumberOfLeadingZeros;
        }

        public int getNumberOfLeadingZeros() {
            return this.numberOfLeadingZeros_;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber setNumberOfLeadingZeros(int i) {
            this.hasNumberOfLeadingZeros = true;
            this.numberOfLeadingZeros_ = i;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber clearNumberOfLeadingZeros() {
            this.hasNumberOfLeadingZeros = false;
            this.numberOfLeadingZeros_ = 1;
            return this;
        }

        public boolean hasRawInput() {
            return this.hasRawInput;
        }

        public java.lang.String getRawInput() {
            return this.rawInput_;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber setRawInput(java.lang.String str) {
            this.hasRawInput = true;
            this.rawInput_ = str;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber clearRawInput() {
            this.hasRawInput = false;
            this.rawInput_ = "";
            return this;
        }

        public boolean hasCountryCodeSource() {
            return this.hasCountryCodeSource;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource getCountryCodeSource() {
            return this.countryCodeSource_;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber setCountryCodeSource(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource countryCodeSource) {
            this.hasCountryCodeSource = true;
            this.countryCodeSource_ = countryCodeSource;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber clearCountryCodeSource() {
            this.hasCountryCodeSource = false;
            this.countryCodeSource_ = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.UNSPECIFIED;
            return this;
        }

        public boolean hasPreferredDomesticCarrierCode() {
            return this.hasPreferredDomesticCarrierCode;
        }

        public java.lang.String getPreferredDomesticCarrierCode() {
            return this.preferredDomesticCarrierCode_;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber setPreferredDomesticCarrierCode(java.lang.String str) {
            this.hasPreferredDomesticCarrierCode = true;
            this.preferredDomesticCarrierCode_ = str;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber clearPreferredDomesticCarrierCode() {
            this.hasPreferredDomesticCarrierCode = false;
            this.preferredDomesticCarrierCode_ = "";
            return this;
        }

        public final com.google.i18n.phonenumbers.Phonenumber.PhoneNumber clear() {
            clearCountryCode();
            clearNationalNumber();
            clearExtension();
            clearItalianLeadingZero();
            clearNumberOfLeadingZeros();
            clearRawInput();
            clearCountryCodeSource();
            clearPreferredDomesticCarrierCode();
            return this;
        }

        public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber mergeFrom(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
            if (phoneNumber.hasCountryCode()) {
                setCountryCode(phoneNumber.getCountryCode());
            }
            if (phoneNumber.hasNationalNumber()) {
                setNationalNumber(phoneNumber.getNationalNumber());
            }
            if (phoneNumber.hasExtension()) {
                setExtension(phoneNumber.getExtension());
            }
            if (phoneNumber.hasItalianLeadingZero()) {
                setItalianLeadingZero(phoneNumber.isItalianLeadingZero());
            }
            if (phoneNumber.hasNumberOfLeadingZeros()) {
                setNumberOfLeadingZeros(phoneNumber.getNumberOfLeadingZeros());
            }
            if (phoneNumber.hasRawInput()) {
                setRawInput(phoneNumber.getRawInput());
            }
            if (phoneNumber.hasCountryCodeSource()) {
                setCountryCodeSource(phoneNumber.getCountryCodeSource());
            }
            if (phoneNumber.hasPreferredDomesticCarrierCode()) {
                setPreferredDomesticCarrierCode(phoneNumber.getPreferredDomesticCarrierCode());
            }
            return this;
        }

        public boolean exactlySameAs(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
            if (phoneNumber == null) {
                return false;
            }
            if (this == phoneNumber) {
                return true;
            }
            return this.countryCode_ == phoneNumber.countryCode_ && this.nationalNumber_ == phoneNumber.nationalNumber_ && this.extension_.equals(phoneNumber.extension_) && this.italianLeadingZero_ == phoneNumber.italianLeadingZero_ && this.numberOfLeadingZeros_ == phoneNumber.numberOfLeadingZeros_ && this.rawInput_.equals(phoneNumber.rawInput_) && this.countryCodeSource_ == phoneNumber.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(phoneNumber.preferredDomesticCarrierCode_) && hasPreferredDomesticCarrierCode() == phoneNumber.hasPreferredDomesticCarrierCode();
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof com.google.i18n.phonenumbers.Phonenumber.PhoneNumber) && exactlySameAs((com.google.i18n.phonenumbers.Phonenumber.PhoneNumber) obj);
        }

        public int hashCode() {
            int countryCode = getCountryCode();
            int hashCode = java.lang.Long.valueOf(getNationalNumber()).hashCode();
            int hashCode2 = getExtension().hashCode();
            int i = isItalianLeadingZero() ? 1231 : 1237;
            int numberOfLeadingZeros = getNumberOfLeadingZeros();
            int hashCode3 = getRawInput().hashCode();
            int hashCode4 = getCountryCodeSource().hashCode();
            return ((((((((((((((((countryCode + 2173) * 53) + hashCode) * 53) + hashCode2) * 53) + i) * 53) + numberOfLeadingZeros) * 53) + hashCode3) * 53) + hashCode4) * 53) + getPreferredDomesticCarrierCode().hashCode()) * 53) + (hasPreferredDomesticCarrierCode() ? 1231 : 1237);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Country Code: ");
            sb.append(this.countryCode_);
            sb.append(" National Number: ");
            sb.append(this.nationalNumber_);
            if (hasItalianLeadingZero() && isItalianLeadingZero()) {
                sb.append(" Leading Zero(s): true");
            }
            if (hasNumberOfLeadingZeros()) {
                sb.append(" Number of leading zeros: ");
                sb.append(this.numberOfLeadingZeros_);
            }
            if (hasExtension()) {
                sb.append(" Extension: ");
                sb.append(this.extension_);
            }
            if (hasCountryCodeSource()) {
                sb.append(" Country Code Source: ");
                sb.append(this.countryCodeSource_);
            }
            if (hasPreferredDomesticCarrierCode()) {
                sb.append(" Preferred Domestic Carrier Code: ");
                sb.append(this.preferredDomesticCarrierCode_);
            }
            return sb.toString();
        }
    }
}
