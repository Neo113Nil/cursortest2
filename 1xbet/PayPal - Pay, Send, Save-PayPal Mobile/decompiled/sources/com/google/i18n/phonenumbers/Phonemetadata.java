package com.google.i18n.phonenumbers;

/* loaded from: classes9.dex */
public final class Phonemetadata {
    private Phonemetadata() {
    }

    public static class NumberFormat implements java.io.Externalizable {
        private static final long serialVersionUID = 1;
        private boolean hasDomesticCarrierCodeFormattingRule;
        private boolean hasFormat;
        private boolean hasNationalPrefixFormattingRule;
        private boolean hasNationalPrefixOptionalWhenFormatting;
        private boolean hasPattern;
        private java.lang.String pattern_ = "";
        private java.lang.String format_ = "";
        private java.util.List<java.lang.String> leadingDigitsPattern_ = new java.util.ArrayList();
        private java.lang.String nationalPrefixFormattingRule_ = "";
        private boolean nationalPrefixOptionalWhenFormatting_ = false;
        private java.lang.String domesticCarrierCodeFormattingRule_ = "";

        public static final class Builder extends com.google.i18n.phonenumbers.Phonemetadata.NumberFormat {
            public final com.google.i18n.phonenumbers.Phonemetadata.NumberFormat build() {
                return this;
            }

            public final com.google.i18n.phonenumbers.Phonemetadata.NumberFormat.Builder mergeFrom(com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat) {
                if (numberFormat.hasPattern()) {
                    setPattern(numberFormat.getPattern());
                }
                if (numberFormat.hasFormat()) {
                    setFormat(numberFormat.getFormat());
                }
                for (int i = 0; i < numberFormat.leadingDigitsPatternSize(); i++) {
                    addLeadingDigitsPattern(numberFormat.getLeadingDigitsPattern(i));
                }
                if (numberFormat.hasNationalPrefixFormattingRule()) {
                    setNationalPrefixFormattingRule(numberFormat.getNationalPrefixFormattingRule());
                }
                if (numberFormat.hasDomesticCarrierCodeFormattingRule()) {
                    setDomesticCarrierCodeFormattingRule(numberFormat.getDomesticCarrierCodeFormattingRule());
                }
                if (numberFormat.hasNationalPrefixOptionalWhenFormatting()) {
                    setNationalPrefixOptionalWhenFormatting(numberFormat.getNationalPrefixOptionalWhenFormatting());
                }
                return this;
            }
        }

        public static com.google.i18n.phonenumbers.Phonemetadata.NumberFormat.Builder newBuilder() {
            return new com.google.i18n.phonenumbers.Phonemetadata.NumberFormat.Builder();
        }

        public boolean hasPattern() {
            return this.hasPattern;
        }

        public java.lang.String getPattern() {
            return this.pattern_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.NumberFormat setPattern(java.lang.String str) {
            this.hasPattern = true;
            this.pattern_ = str;
            return this;
        }

        public boolean hasFormat() {
            return this.hasFormat;
        }

        public java.lang.String getFormat() {
            return this.format_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.NumberFormat setFormat(java.lang.String str) {
            this.hasFormat = true;
            this.format_ = str;
            return this;
        }

        public java.util.List<java.lang.String> leadingDigitPatterns() {
            return this.leadingDigitsPattern_;
        }

        @java.lang.Deprecated
        public int leadingDigitsPatternSize() {
            return getLeadingDigitsPatternCount();
        }

        public int getLeadingDigitsPatternCount() {
            return this.leadingDigitsPattern_.size();
        }

        public java.lang.String getLeadingDigitsPattern(int i) {
            return this.leadingDigitsPattern_.get(i);
        }

        public com.google.i18n.phonenumbers.Phonemetadata.NumberFormat addLeadingDigitsPattern(java.lang.String str) {
            this.leadingDigitsPattern_.add(str);
            return this;
        }

        public boolean hasNationalPrefixFormattingRule() {
            return this.hasNationalPrefixFormattingRule;
        }

        public java.lang.String getNationalPrefixFormattingRule() {
            return this.nationalPrefixFormattingRule_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.NumberFormat setNationalPrefixFormattingRule(java.lang.String str) {
            this.hasNationalPrefixFormattingRule = true;
            this.nationalPrefixFormattingRule_ = str;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.NumberFormat clearNationalPrefixFormattingRule() {
            this.hasNationalPrefixFormattingRule = false;
            this.nationalPrefixFormattingRule_ = "";
            return this;
        }

        public boolean hasNationalPrefixOptionalWhenFormatting() {
            return this.hasNationalPrefixOptionalWhenFormatting;
        }

        public boolean getNationalPrefixOptionalWhenFormatting() {
            return this.nationalPrefixOptionalWhenFormatting_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.NumberFormat setNationalPrefixOptionalWhenFormatting(boolean z) {
            this.hasNationalPrefixOptionalWhenFormatting = true;
            this.nationalPrefixOptionalWhenFormatting_ = z;
            return this;
        }

        public boolean hasDomesticCarrierCodeFormattingRule() {
            return this.hasDomesticCarrierCodeFormattingRule;
        }

        public java.lang.String getDomesticCarrierCodeFormattingRule() {
            return this.domesticCarrierCodeFormattingRule_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.NumberFormat setDomesticCarrierCodeFormattingRule(java.lang.String str) {
            this.hasDomesticCarrierCodeFormattingRule = true;
            this.domesticCarrierCodeFormattingRule_ = str;
            return this;
        }

        @Override // java.io.Externalizable
        public void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
            objectOutput.writeUTF(this.pattern_);
            objectOutput.writeUTF(this.format_);
            int leadingDigitsPatternSize = leadingDigitsPatternSize();
            objectOutput.writeInt(leadingDigitsPatternSize);
            for (int i = 0; i < leadingDigitsPatternSize; i++) {
                objectOutput.writeUTF(this.leadingDigitsPattern_.get(i));
            }
            objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
            if (this.hasNationalPrefixFormattingRule) {
                objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
            }
            objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
            if (this.hasDomesticCarrierCodeFormattingRule) {
                objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
            }
            objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
        }

        @Override // java.io.Externalizable
        public void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
            setPattern(objectInput.readUTF());
            setFormat(objectInput.readUTF());
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.leadingDigitsPattern_.add(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixFormattingRule(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setDomesticCarrierCodeFormattingRule(objectInput.readUTF());
            }
            setNationalPrefixOptionalWhenFormatting(objectInput.readBoolean());
        }
    }

    public static class PhoneNumberDesc implements java.io.Externalizable {
        private static final long serialVersionUID = 1;
        private boolean hasExampleNumber;
        private boolean hasNationalNumberPattern;
        private java.lang.String nationalNumberPattern_ = "";
        private java.util.List<java.lang.Integer> possibleLength_ = new java.util.ArrayList();
        private java.util.List<java.lang.Integer> possibleLengthLocalOnly_ = new java.util.ArrayList();
        private java.lang.String exampleNumber_ = "";

        public static final class Builder extends com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc {
            public final com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc build() {
                return this;
            }

            public final com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc.Builder mergeFrom(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
                if (phoneNumberDesc.hasNationalNumberPattern()) {
                    setNationalNumberPattern(phoneNumberDesc.getNationalNumberPattern());
                }
                for (int i = 0; i < phoneNumberDesc.getPossibleLengthCount(); i++) {
                    addPossibleLength(phoneNumberDesc.getPossibleLength(i));
                }
                for (int i2 = 0; i2 < phoneNumberDesc.getPossibleLengthLocalOnlyCount(); i2++) {
                    addPossibleLengthLocalOnly(phoneNumberDesc.getPossibleLengthLocalOnly(i2));
                }
                if (phoneNumberDesc.hasExampleNumber()) {
                    setExampleNumber(phoneNumberDesc.getExampleNumber());
                }
                return this;
            }
        }

        public static com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc.Builder newBuilder() {
            return new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc.Builder();
        }

        public boolean hasNationalNumberPattern() {
            return this.hasNationalNumberPattern;
        }

        public java.lang.String getNationalNumberPattern() {
            return this.nationalNumberPattern_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc setNationalNumberPattern(java.lang.String str) {
            this.hasNationalNumberPattern = true;
            this.nationalNumberPattern_ = str;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc clearNationalNumberPattern() {
            this.hasNationalNumberPattern = false;
            this.nationalNumberPattern_ = "";
            return this;
        }

        public java.util.List<java.lang.Integer> getPossibleLengthList() {
            return this.possibleLength_;
        }

        public int getPossibleLengthCount() {
            return this.possibleLength_.size();
        }

        public int getPossibleLength(int i) {
            return this.possibleLength_.get(i).intValue();
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc addPossibleLength(int i) {
            this.possibleLength_.add(java.lang.Integer.valueOf(i));
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc clearPossibleLength() {
            this.possibleLength_.clear();
            return this;
        }

        public java.util.List<java.lang.Integer> getPossibleLengthLocalOnlyList() {
            return this.possibleLengthLocalOnly_;
        }

        public int getPossibleLengthLocalOnlyCount() {
            return this.possibleLengthLocalOnly_.size();
        }

        public int getPossibleLengthLocalOnly(int i) {
            return this.possibleLengthLocalOnly_.get(i).intValue();
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc addPossibleLengthLocalOnly(int i) {
            this.possibleLengthLocalOnly_.add(java.lang.Integer.valueOf(i));
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc clearPossibleLengthLocalOnly() {
            this.possibleLengthLocalOnly_.clear();
            return this;
        }

        public boolean hasExampleNumber() {
            return this.hasExampleNumber;
        }

        public java.lang.String getExampleNumber() {
            return this.exampleNumber_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc setExampleNumber(java.lang.String str) {
            this.hasExampleNumber = true;
            this.exampleNumber_ = str;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc clearExampleNumber() {
            this.hasExampleNumber = false;
            this.exampleNumber_ = "";
            return this;
        }

        public boolean exactlySameAs(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            return this.nationalNumberPattern_.equals(phoneNumberDesc.nationalNumberPattern_) && this.possibleLength_.equals(phoneNumberDesc.possibleLength_) && this.possibleLengthLocalOnly_.equals(phoneNumberDesc.possibleLengthLocalOnly_) && this.exampleNumber_.equals(phoneNumberDesc.exampleNumber_);
        }

        @Override // java.io.Externalizable
        public void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
            objectOutput.writeBoolean(this.hasNationalNumberPattern);
            if (this.hasNationalNumberPattern) {
                objectOutput.writeUTF(this.nationalNumberPattern_);
            }
            int possibleLengthCount = getPossibleLengthCount();
            objectOutput.writeInt(possibleLengthCount);
            for (int i = 0; i < possibleLengthCount; i++) {
                objectOutput.writeInt(this.possibleLength_.get(i).intValue());
            }
            int possibleLengthLocalOnlyCount = getPossibleLengthLocalOnlyCount();
            objectOutput.writeInt(possibleLengthLocalOnlyCount);
            for (int i2 = 0; i2 < possibleLengthLocalOnlyCount; i2++) {
                objectOutput.writeInt(this.possibleLengthLocalOnly_.get(i2).intValue());
            }
            objectOutput.writeBoolean(this.hasExampleNumber);
            if (this.hasExampleNumber) {
                objectOutput.writeUTF(this.exampleNumber_);
            }
        }

        @Override // java.io.Externalizable
        public void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
            if (objectInput.readBoolean()) {
                setNationalNumberPattern(objectInput.readUTF());
            }
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.possibleLength_.add(java.lang.Integer.valueOf(objectInput.readInt()));
            }
            int readInt2 = objectInput.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                this.possibleLengthLocalOnly_.add(java.lang.Integer.valueOf(objectInput.readInt()));
            }
            if (objectInput.readBoolean()) {
                setExampleNumber(objectInput.readUTF());
            }
        }
    }

    public static class PhoneMetadata implements java.io.Externalizable {
        private static final long serialVersionUID = 1;
        private boolean hasCarrierSpecific;
        private boolean hasCountryCode;
        private boolean hasEmergency;
        private boolean hasFixedLine;
        private boolean hasGeneralDesc;
        private boolean hasId;
        private boolean hasInternationalPrefix;
        private boolean hasLeadingDigits;
        private boolean hasMainCountryForCode;
        private boolean hasMobile;
        private boolean hasMobileNumberPortableRegion;
        private boolean hasNationalPrefix;
        private boolean hasNationalPrefixForParsing;
        private boolean hasNationalPrefixTransformRule;
        private boolean hasNoInternationalDialling;
        private boolean hasPager;
        private boolean hasPersonalNumber;
        private boolean hasPreferredExtnPrefix;
        private boolean hasPreferredInternationalPrefix;
        private boolean hasPremiumRate;
        private boolean hasSameMobileAndFixedLinePattern;
        private boolean hasSharedCost;
        private boolean hasShortCode;
        private boolean hasSmsServices;
        private boolean hasStandardRate;
        private boolean hasTollFree;
        private boolean hasUan;
        private boolean hasVoicemail;
        private boolean hasVoip;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc generalDesc_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc fixedLine_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc mobile_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc tollFree_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc premiumRate_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc sharedCost_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc personalNumber_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc voip_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc pager_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc uan_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc emergency_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc voicemail_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc shortCode_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc standardRate_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc carrierSpecific_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc smsServices_ = null;
        private com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc noInternationalDialling_ = null;
        private java.lang.String id_ = "";
        private int countryCode_ = 0;
        private java.lang.String internationalPrefix_ = "";
        private java.lang.String preferredInternationalPrefix_ = "";
        private java.lang.String nationalPrefix_ = "";
        private java.lang.String preferredExtnPrefix_ = "";
        private java.lang.String nationalPrefixForParsing_ = "";
        private java.lang.String nationalPrefixTransformRule_ = "";
        private boolean sameMobileAndFixedLinePattern_ = false;
        private java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> numberFormat_ = new java.util.ArrayList();
        private java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> intlNumberFormat_ = new java.util.ArrayList();
        private boolean mainCountryForCode_ = false;
        private java.lang.String leadingDigits_ = "";
        private boolean mobileNumberPortableRegion_ = false;

        public static final class Builder extends com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata {
            public final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata build() {
                return this;
            }

            @Override // com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata
            public final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata.Builder setId(java.lang.String str) {
                super.setId(str);
                return this;
            }

            @Override // com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata
            public final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata.Builder setInternationalPrefix(java.lang.String str) {
                super.setInternationalPrefix(str);
                return this;
            }
        }

        public static com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata.Builder newBuilder() {
            return new com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata.Builder();
        }

        public boolean hasGeneralDesc() {
            return this.hasGeneralDesc;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getGeneralDesc() {
            return this.generalDesc_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getGeneralDescBuilder() {
            if (this.generalDesc_ == null) {
                this.generalDesc_ = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
            }
            return this.generalDesc_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setGeneralDesc(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasGeneralDesc = true;
            this.generalDesc_ = phoneNumberDesc;
            return this;
        }

        public boolean hasFixedLine() {
            return this.hasFixedLine;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getFixedLine() {
            return this.fixedLine_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setFixedLine(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasFixedLine = true;
            this.fixedLine_ = phoneNumberDesc;
            return this;
        }

        public boolean hasMobile() {
            return this.hasMobile;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getMobile() {
            return this.mobile_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setMobile(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasMobile = true;
            this.mobile_ = phoneNumberDesc;
            return this;
        }

        public boolean hasTollFree() {
            return this.hasTollFree;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getTollFree() {
            return this.tollFree_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setTollFree(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasTollFree = true;
            this.tollFree_ = phoneNumberDesc;
            return this;
        }

        public boolean hasPremiumRate() {
            return this.hasPremiumRate;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getPremiumRate() {
            return this.premiumRate_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setPremiumRate(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasPremiumRate = true;
            this.premiumRate_ = phoneNumberDesc;
            return this;
        }

        public boolean hasSharedCost() {
            return this.hasSharedCost;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getSharedCost() {
            return this.sharedCost_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setSharedCost(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasSharedCost = true;
            this.sharedCost_ = phoneNumberDesc;
            return this;
        }

        public boolean hasPersonalNumber() {
            return this.hasPersonalNumber;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getPersonalNumber() {
            return this.personalNumber_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setPersonalNumber(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasPersonalNumber = true;
            this.personalNumber_ = phoneNumberDesc;
            return this;
        }

        public boolean hasVoip() {
            return this.hasVoip;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getVoip() {
            return this.voip_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setVoip(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasVoip = true;
            this.voip_ = phoneNumberDesc;
            return this;
        }

        public boolean hasPager() {
            return this.hasPager;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getPager() {
            return this.pager_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setPager(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasPager = true;
            this.pager_ = phoneNumberDesc;
            return this;
        }

        public boolean hasUan() {
            return this.hasUan;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getUan() {
            return this.uan_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setUan(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasUan = true;
            this.uan_ = phoneNumberDesc;
            return this;
        }

        public boolean hasEmergency() {
            return this.hasEmergency;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getEmergency() {
            return this.emergency_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setEmergency(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasEmergency = true;
            this.emergency_ = phoneNumberDesc;
            return this;
        }

        public boolean hasVoicemail() {
            return this.hasVoicemail;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getVoicemail() {
            return this.voicemail_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setVoicemail(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasVoicemail = true;
            this.voicemail_ = phoneNumberDesc;
            return this;
        }

        public boolean hasShortCode() {
            return this.hasShortCode;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getShortCode() {
            return this.shortCode_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setShortCode(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasShortCode = true;
            this.shortCode_ = phoneNumberDesc;
            return this;
        }

        public boolean hasStandardRate() {
            return this.hasStandardRate;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getStandardRate() {
            return this.standardRate_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setStandardRate(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasStandardRate = true;
            this.standardRate_ = phoneNumberDesc;
            return this;
        }

        public boolean hasCarrierSpecific() {
            return this.hasCarrierSpecific;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getCarrierSpecific() {
            return this.carrierSpecific_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setCarrierSpecific(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasCarrierSpecific = true;
            this.carrierSpecific_ = phoneNumberDesc;
            return this;
        }

        public boolean hasSmsServices() {
            return this.hasSmsServices;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getSmsServices() {
            return this.smsServices_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setSmsServices(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasSmsServices = true;
            this.smsServices_ = phoneNumberDesc;
            return this;
        }

        public boolean hasNoInternationalDialling() {
            return this.hasNoInternationalDialling;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getNoInternationalDialling() {
            return this.noInternationalDialling_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setNoInternationalDialling(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = phoneNumberDesc;
            return this;
        }

        public boolean hasId() {
            return this.hasId;
        }

        public java.lang.String getId() {
            return this.id_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setId(java.lang.String str) {
            this.hasId = true;
            this.id_ = str;
            return this;
        }

        public boolean hasCountryCode() {
            return this.hasCountryCode;
        }

        public int getCountryCode() {
            return this.countryCode_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setCountryCode(int i) {
            this.hasCountryCode = true;
            this.countryCode_ = i;
            return this;
        }

        public boolean hasInternationalPrefix() {
            return this.hasInternationalPrefix;
        }

        public java.lang.String getInternationalPrefix() {
            return this.internationalPrefix_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setInternationalPrefix(java.lang.String str) {
            this.hasInternationalPrefix = true;
            this.internationalPrefix_ = str;
            return this;
        }

        public boolean hasPreferredInternationalPrefix() {
            return this.hasPreferredInternationalPrefix;
        }

        public java.lang.String getPreferredInternationalPrefix() {
            return this.preferredInternationalPrefix_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setPreferredInternationalPrefix(java.lang.String str) {
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = str;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata clearPreferredInternationalPrefix() {
            this.hasPreferredInternationalPrefix = false;
            this.preferredInternationalPrefix_ = "";
            return this;
        }

        public boolean hasNationalPrefix() {
            return this.hasNationalPrefix;
        }

        public java.lang.String getNationalPrefix() {
            return this.nationalPrefix_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setNationalPrefix(java.lang.String str) {
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = str;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata clearNationalPrefix() {
            this.hasNationalPrefix = false;
            this.nationalPrefix_ = "";
            return this;
        }

        public boolean hasPreferredExtnPrefix() {
            return this.hasPreferredExtnPrefix;
        }

        public java.lang.String getPreferredExtnPrefix() {
            return this.preferredExtnPrefix_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setPreferredExtnPrefix(java.lang.String str) {
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = str;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata clearPreferredExtnPrefix() {
            this.hasPreferredExtnPrefix = false;
            this.preferredExtnPrefix_ = "";
            return this;
        }

        public boolean hasNationalPrefixForParsing() {
            return this.hasNationalPrefixForParsing;
        }

        public java.lang.String getNationalPrefixForParsing() {
            return this.nationalPrefixForParsing_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setNationalPrefixForParsing(java.lang.String str) {
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = str;
            return this;
        }

        public boolean hasNationalPrefixTransformRule() {
            return this.hasNationalPrefixTransformRule;
        }

        public java.lang.String getNationalPrefixTransformRule() {
            return this.nationalPrefixTransformRule_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setNationalPrefixTransformRule(java.lang.String str) {
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = str;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata clearNationalPrefixTransformRule() {
            this.hasNationalPrefixTransformRule = false;
            this.nationalPrefixTransformRule_ = "";
            return this;
        }

        public boolean hasSameMobileAndFixedLinePattern() {
            return this.hasSameMobileAndFixedLinePattern;
        }

        public boolean getSameMobileAndFixedLinePattern() {
            return this.sameMobileAndFixedLinePattern_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setSameMobileAndFixedLinePattern(boolean z) {
            this.hasSameMobileAndFixedLinePattern = true;
            this.sameMobileAndFixedLinePattern_ = z;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata clearSameMobileAndFixedLinePattern() {
            this.hasSameMobileAndFixedLinePattern = false;
            this.sameMobileAndFixedLinePattern_ = false;
            return this;
        }

        @java.lang.Deprecated
        public java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> numberFormats() {
            return getNumberFormatList();
        }

        public java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> getNumberFormatList() {
            return this.numberFormat_;
        }

        @java.lang.Deprecated
        public int numberFormatSize() {
            return getNumberFormatCount();
        }

        public int getNumberFormatCount() {
            return this.numberFormat_.size();
        }

        public com.google.i18n.phonenumbers.Phonemetadata.NumberFormat getNumberFormat(int i) {
            return this.numberFormat_.get(i);
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata addNumberFormat(com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat) {
            this.numberFormat_.add(numberFormat);
            return this;
        }

        @java.lang.Deprecated
        public java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> intlNumberFormats() {
            return getIntlNumberFormatList();
        }

        public java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> getIntlNumberFormatList() {
            return this.intlNumberFormat_;
        }

        @java.lang.Deprecated
        public int intlNumberFormatSize() {
            return getIntlNumberFormatCount();
        }

        public int getIntlNumberFormatCount() {
            return this.intlNumberFormat_.size();
        }

        public com.google.i18n.phonenumbers.Phonemetadata.NumberFormat getIntlNumberFormat(int i) {
            return this.intlNumberFormat_.get(i);
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata addIntlNumberFormat(com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat) {
            this.intlNumberFormat_.add(numberFormat);
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata clearIntlNumberFormat() {
            this.intlNumberFormat_.clear();
            return this;
        }

        public boolean hasMainCountryForCode() {
            return this.hasMainCountryForCode;
        }

        public boolean isMainCountryForCode() {
            return this.mainCountryForCode_;
        }

        public boolean getMainCountryForCode() {
            return this.mainCountryForCode_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setMainCountryForCode(boolean z) {
            this.hasMainCountryForCode = true;
            this.mainCountryForCode_ = z;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata clearMainCountryForCode() {
            this.hasMainCountryForCode = false;
            this.mainCountryForCode_ = false;
            return this;
        }

        public boolean hasLeadingDigits() {
            return this.hasLeadingDigits;
        }

        public java.lang.String getLeadingDigits() {
            return this.leadingDigits_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setLeadingDigits(java.lang.String str) {
            this.hasLeadingDigits = true;
            this.leadingDigits_ = str;
            return this;
        }

        public boolean hasMobileNumberPortableRegion() {
            return this.hasMobileNumberPortableRegion;
        }

        @java.lang.Deprecated
        public boolean isMobileNumberPortableRegion() {
            return getMobileNumberPortableRegion();
        }

        public boolean getMobileNumberPortableRegion() {
            return this.mobileNumberPortableRegion_;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata setMobileNumberPortableRegion(boolean z) {
            this.hasMobileNumberPortableRegion = true;
            this.mobileNumberPortableRegion_ = z;
            return this;
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata clearMobileNumberPortableRegion() {
            this.hasMobileNumberPortableRegion = false;
            this.mobileNumberPortableRegion_ = false;
            return this;
        }

        @Override // java.io.Externalizable
        public void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
            objectOutput.writeBoolean(this.hasGeneralDesc);
            if (this.hasGeneralDesc) {
                this.generalDesc_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasFixedLine);
            if (this.hasFixedLine) {
                this.fixedLine_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasMobile);
            if (this.hasMobile) {
                this.mobile_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasTollFree);
            if (this.hasTollFree) {
                this.tollFree_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPremiumRate);
            if (this.hasPremiumRate) {
                this.premiumRate_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasSharedCost);
            if (this.hasSharedCost) {
                this.sharedCost_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPersonalNumber);
            if (this.hasPersonalNumber) {
                this.personalNumber_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasVoip);
            if (this.hasVoip) {
                this.voip_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPager);
            if (this.hasPager) {
                this.pager_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasUan);
            if (this.hasUan) {
                this.uan_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasEmergency);
            if (this.hasEmergency) {
                this.emergency_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasVoicemail);
            if (this.hasVoicemail) {
                this.voicemail_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasShortCode);
            if (this.hasShortCode) {
                this.shortCode_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasStandardRate);
            if (this.hasStandardRate) {
                this.standardRate_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasCarrierSpecific);
            if (this.hasCarrierSpecific) {
                this.carrierSpecific_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasSmsServices);
            if (this.hasSmsServices) {
                this.smsServices_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasNoInternationalDialling);
            if (this.hasNoInternationalDialling) {
                this.noInternationalDialling_.writeExternal(objectOutput);
            }
            objectOutput.writeUTF(this.id_);
            objectOutput.writeInt(this.countryCode_);
            objectOutput.writeUTF(this.internationalPrefix_);
            objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
            if (this.hasPreferredInternationalPrefix) {
                objectOutput.writeUTF(this.preferredInternationalPrefix_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefix);
            if (this.hasNationalPrefix) {
                objectOutput.writeUTF(this.nationalPrefix_);
            }
            objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
            if (this.hasPreferredExtnPrefix) {
                objectOutput.writeUTF(this.preferredExtnPrefix_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
            if (this.hasNationalPrefixForParsing) {
                objectOutput.writeUTF(this.nationalPrefixForParsing_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
            if (this.hasNationalPrefixTransformRule) {
                objectOutput.writeUTF(this.nationalPrefixTransformRule_);
            }
            objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
            int numberFormatSize = numberFormatSize();
            objectOutput.writeInt(numberFormatSize);
            for (int i = 0; i < numberFormatSize; i++) {
                this.numberFormat_.get(i).writeExternal(objectOutput);
            }
            int intlNumberFormatSize = intlNumberFormatSize();
            objectOutput.writeInt(intlNumberFormatSize);
            for (int i2 = 0; i2 < intlNumberFormatSize; i2++) {
                this.intlNumberFormat_.get(i2).writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.mainCountryForCode_);
            objectOutput.writeBoolean(this.hasLeadingDigits);
            if (this.hasLeadingDigits) {
                objectOutput.writeUTF(this.leadingDigits_);
            }
            objectOutput.writeBoolean(this.mobileNumberPortableRegion_);
        }

        @Override // java.io.Externalizable
        public void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                setGeneralDesc(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc2 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc2.readExternal(objectInput);
                setFixedLine(phoneNumberDesc2);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc3 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc3.readExternal(objectInput);
                setMobile(phoneNumberDesc3);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc4 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc4.readExternal(objectInput);
                setTollFree(phoneNumberDesc4);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc5 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc5.readExternal(objectInput);
                setPremiumRate(phoneNumberDesc5);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc6 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc6.readExternal(objectInput);
                setSharedCost(phoneNumberDesc6);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc7 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc7.readExternal(objectInput);
                setPersonalNumber(phoneNumberDesc7);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc8 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc8.readExternal(objectInput);
                setVoip(phoneNumberDesc8);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc9 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc9.readExternal(objectInput);
                setPager(phoneNumberDesc9);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc10 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc10.readExternal(objectInput);
                setUan(phoneNumberDesc10);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc11 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc11.readExternal(objectInput);
                setEmergency(phoneNumberDesc11);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc12 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc12.readExternal(objectInput);
                setVoicemail(phoneNumberDesc12);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc13 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc13.readExternal(objectInput);
                setShortCode(phoneNumberDesc13);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc14 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc14.readExternal(objectInput);
                setStandardRate(phoneNumberDesc14);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc15 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc15.readExternal(objectInput);
                setCarrierSpecific(phoneNumberDesc15);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc16 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc16.readExternal(objectInput);
                setSmsServices(phoneNumberDesc16);
            }
            if (objectInput.readBoolean()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc17 = new com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc();
                phoneNumberDesc17.readExternal(objectInput);
                setNoInternationalDialling(phoneNumberDesc17);
            }
            setId(objectInput.readUTF());
            setCountryCode(objectInput.readInt());
            setInternationalPrefix(objectInput.readUTF());
            if (objectInput.readBoolean()) {
                setPreferredInternationalPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setPreferredExtnPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixForParsing(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixTransformRule(objectInput.readUTF());
            }
            setSameMobileAndFixedLinePattern(objectInput.readBoolean());
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat = new com.google.i18n.phonenumbers.Phonemetadata.NumberFormat();
                numberFormat.readExternal(objectInput);
                this.numberFormat_.add(numberFormat);
            }
            int readInt2 = objectInput.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat2 = new com.google.i18n.phonenumbers.Phonemetadata.NumberFormat();
                numberFormat2.readExternal(objectInput);
                this.intlNumberFormat_.add(numberFormat2);
            }
            setMainCountryForCode(objectInput.readBoolean());
            if (objectInput.readBoolean()) {
                setLeadingDigits(objectInput.readUTF());
            }
            setMobileNumberPortableRegion(objectInput.readBoolean());
        }
    }

    public static class PhoneMetadataCollection implements java.io.Externalizable {
        private static final long serialVersionUID = 1;
        private java.util.List<com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata> metadata_ = new java.util.ArrayList();

        public static final class Builder extends com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection {
            public final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection build() {
                return this;
            }
        }

        public static com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection.Builder newBuilder() {
            return new com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection.Builder();
        }

        public java.util.List<com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata> getMetadataList() {
            return this.metadata_;
        }

        public int getMetadataCount() {
            return this.metadata_.size();
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection addMetadata(com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata) {
            this.metadata_.add(phoneMetadata);
            return this;
        }

        @Override // java.io.Externalizable
        public void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
            int metadataCount = getMetadataCount();
            objectOutput.writeInt(metadataCount);
            for (int i = 0; i < metadataCount; i++) {
                this.metadata_.get(i).writeExternal(objectOutput);
            }
        }

        @Override // java.io.Externalizable
        public void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata = new com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata();
                phoneMetadata.readExternal(objectInput);
                this.metadata_.add(phoneMetadata);
            }
        }

        public com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection clear() {
            this.metadata_.clear();
            return this;
        }
    }
}
