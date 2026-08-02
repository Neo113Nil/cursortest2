package com.paypal.oslo.feature.mosaic.api.widget.docupload;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0003\b\u0086\u0001\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Companion", "AadharCard", "AlienRegistrationCard", "BankCheque", "BankDoc", "BankLetter", "BankPassbook", "BankStatement", "BirthCertificate", "CcStatement", "CertificateOfLongtermCareInsurance", "CertificateOfLossOfNationality", "CertificateOfResidence", "CertificateOfResidenceWithRegisteredItems", "CertificateOfResidenceWithTaxId", "CitizenshipCertificate", "CorporateContract", "CouncilRatesNotice", "CouncilRatesNotices", "Cpf", "CraStatement", "CreditCardCopy", "CurpCertificate", "DefenceCard", "DefenceDependentCard", "DematStatement", "DisabilityIdCard", "DriversLicense", "Ein", "ElectricityBill", "EmployeePaySlip", "EmployerIssuedLetter", "FacePhoto", "FcraRegistration", "FiscalCode", "GasBill", "GovernmentIssuedId", "Gstinuin", "GstCertification", "HealthInsuranceCard", "HkId", "IdCard", "ImmigrantId", "IndiaPostIssuedAddressProof", "Inn", "InsurancePremiumReceipt", "Itin", "Kpp", "LeaseAgreement", "LetterFromCouncil", "LetterIssuedByEmployer", "LetterOfAuthorization", "LetterOfBankDebitAuthorization", "LetterOfTrustee", "LoanStatement", "MigrationCard", "MilitaryIdentificationCard", "MortgageStatement", "MutualFundCertificate", "MyNumber", "MyNumberNotificationCard", "NationalId", "NationalIdCard", "NexusCard", "NotaryAffidavit", "NregaCard", "OfficialGovernmentLetter", "OrganisationIdentityCard", "Other", "OtherGovtId", "OwnershipCertificate", "Pan", "PanIntimationLetter", "Passbook", "Passport", "PensionBooks", "PensionCard", "PersonalIncomeTaxReturn", "PhoneBill", "PhotoId", "PostalAddressProof", "PowerOfAttorney", "ProofOfAddress", "ProofOfAgeCard", "ProofOfBusinessAddress", "ProofOfId", "ProofOfIdentity", "ProofOfName", "ProofOfSin", "PropertyTaxAssessment", "RationCard", "ReceiptOfTaxPayment", "RelationshipDocument", "ResidenceCard", "ResidentRegistrationCard", "SelfAssessmentTaxForm", "Sin", "Snils", "SocialInsurancePremium", "SocialRationCard", "SocialSecurityBenefitsStatement", "SocialSecurityCard", "SpecialPermanentResidenceCard", "Ssn", "StateIdCard", "StudentRecord", "TaxAssessmentNotice", "TaxExemptionProof", "TaxId", "TaxInfoCorrectionForm", "TaxRegistrationCertificate", "TaxStatement", "TravelPermit", "TvBill", "UsirsW9Form", "UtilitiesBill", "VeoCertificate", "Visa", "VoidedBankCheck", "VoidedCheck", "VoterId", "VoterIdCard", "WaterBill", "WelfareBooks", "W8benForm", "W8beneForm", "W8eciForm"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DocumentTypeID {
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID AadharCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID AlienRegistrationCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID BankCheque;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID BankDoc;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID BankLetter;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID BankPassbook;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID BankStatement;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID BirthCertificate;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CcStatement;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CertificateOfLongtermCareInsurance;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CertificateOfLossOfNationality;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CertificateOfResidence;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CertificateOfResidenceWithRegisteredItems;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CertificateOfResidenceWithTaxId;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CitizenshipCertificate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Companion INSTANCE;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CorporateContract;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CouncilRatesNotice;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CouncilRatesNotices;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Cpf;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CraStatement;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CreditCardCopy;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID CurpCertificate;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID DefenceCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID DefenceDependentCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID DematStatement;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID DisabilityIdCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID DriversLicense;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Ein;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ElectricityBill;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID EmployeePaySlip;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID EmployerIssuedLetter;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID FacePhoto;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID FcraRegistration;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID FiscalCode;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID GasBill;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID GovernmentIssuedId;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID GstCertification;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Gstinuin;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID HealthInsuranceCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID HkId;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID IdCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ImmigrantId;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID IndiaPostIssuedAddressProof;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Inn;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID InsurancePremiumReceipt;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Itin;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Kpp;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID LeaseAgreement;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID LetterFromCouncil;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID LetterIssuedByEmployer;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID LetterOfAuthorization;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID LetterOfBankDebitAuthorization;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID LetterOfTrustee;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID LoanStatement;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID MigrationCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID MilitaryIdentificationCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID MortgageStatement;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID MutualFundCertificate;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID MyNumber;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID MyNumberNotificationCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID NationalId;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID NationalIdCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID NexusCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID NotaryAffidavit;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID NregaCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID OfficialGovernmentLetter;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID OrganisationIdentityCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Other;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID OtherGovtId;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID OwnershipCertificate;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Pan;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID PanIntimationLetter;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Passbook;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Passport;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID PensionBooks;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID PensionCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID PersonalIncomeTaxReturn;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID PhoneBill;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID PhotoId;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID PostalAddressProof;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID PowerOfAttorney;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ProofOfAddress;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ProofOfAgeCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ProofOfBusinessAddress;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ProofOfId;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ProofOfIdentity;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ProofOfName;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ProofOfSin;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID PropertyTaxAssessment;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID RationCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ReceiptOfTaxPayment;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID RelationshipDocument;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ResidenceCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID ResidentRegistrationCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID SelfAssessmentTaxForm;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Sin;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Snils;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID SocialInsurancePremium;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID SocialRationCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID SocialSecurityBenefitsStatement;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID SocialSecurityCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID SpecialPermanentResidenceCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Ssn;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID StateIdCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID StudentRecord;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID TaxAssessmentNotice;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID TaxExemptionProof;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID TaxId;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID TaxInfoCorrectionForm;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID TaxRegistrationCertificate;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID TaxStatement;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID TravelPermit;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID TvBill;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID UsirsW9Form;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID UtilitiesBill;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID VeoCertificate;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID Visa;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID VoidedBankCheck;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID VoidedCheck;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID VoterId;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID VoterIdCard;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID W8benForm;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID W8beneForm;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID W8eciForm;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID WaterBill;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID WelfareBooks;
    private static final /* synthetic */ com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final kotlin.Lazy<java.util.Map<java.lang.String, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID>> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String key;

    private DocumentTypeID(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    static {
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("AadharCard", 0, "AADHAR_CARD");
        AadharCard = documentTypeID;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID2 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("AlienRegistrationCard", 1, "ALIEN_REGISTRATION_CARD");
        AlienRegistrationCard = documentTypeID2;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID3 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("BankCheque", 2, "BANK_CHEQUE");
        BankCheque = documentTypeID3;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID4 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("BankDoc", 3, "BANK_DOC");
        BankDoc = documentTypeID4;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID5 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("BankLetter", 4, "BANK_LETTER");
        BankLetter = documentTypeID5;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID6 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("BankPassbook", 5, "BANK_PASSBOOK");
        BankPassbook = documentTypeID6;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID7 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("BankStatement", 6, "BANK_STATEMENT");
        BankStatement = documentTypeID7;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID8 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("BirthCertificate", 7, "BIRTH_CERTIFICATE");
        BirthCertificate = documentTypeID8;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID9 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CcStatement", 8, "CC_STATEMENT");
        CcStatement = documentTypeID9;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID10 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CertificateOfLongtermCareInsurance", 9, "CERTIFICATE_OF_LONGTERM_CARE_INSURANCE");
        CertificateOfLongtermCareInsurance = documentTypeID10;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID11 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CertificateOfLossOfNationality", 10, "CERTIFICATE_OF_LOSS_OF_NATIONALITY");
        CertificateOfLossOfNationality = documentTypeID11;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID12 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CertificateOfResidence", 11, "CERTIFICATE_OF_RESIDENCE");
        CertificateOfResidence = documentTypeID12;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID13 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CertificateOfResidenceWithRegisteredItems", 12, "CERTIFICATE_OF_RESIDENCE_WITH_REGISTERED_ITEMS");
        CertificateOfResidenceWithRegisteredItems = documentTypeID13;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID14 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CertificateOfResidenceWithTaxId", 13, "CERTIFICATE_OF_RESIDENCE_WITH_TAX_ID");
        CertificateOfResidenceWithTaxId = documentTypeID14;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID15 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CitizenshipCertificate", 14, "CITIZENSHIP_CERTIFICATE");
        CitizenshipCertificate = documentTypeID15;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID16 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CorporateContract", 15, "CORPORATE_CONTRACT");
        CorporateContract = documentTypeID16;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID17 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CouncilRatesNotice", 16, "COUNCIL_RATES_NOTICE");
        CouncilRatesNotice = documentTypeID17;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID18 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CouncilRatesNotices", 17, "COUNCIL_RATES_NOTICES");
        CouncilRatesNotices = documentTypeID18;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID19 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Cpf", 18, "CPF");
        Cpf = documentTypeID19;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID20 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CraStatement", 19, "CRA_STATEMENT");
        CraStatement = documentTypeID20;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID21 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CreditCardCopy", 20, "CREDIT_CARD_COPY");
        CreditCardCopy = documentTypeID21;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID22 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("CurpCertificate", 21, "CURP_CERTIFICATE");
        CurpCertificate = documentTypeID22;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID23 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("DefenceCard", 22, "DEFENCE_CARD");
        DefenceCard = documentTypeID23;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID24 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("DefenceDependentCard", 23, "DEFENCE_DEPENDENT_CARD");
        DefenceDependentCard = documentTypeID24;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID25 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("DematStatement", 24, "DEMAT_STATEMENT");
        DematStatement = documentTypeID25;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID26 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("DisabilityIdCard", 25, "DISABILITY_ID_CARD");
        DisabilityIdCard = documentTypeID26;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID27 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("DriversLicense", 26, "DRIVERS_LICENSE");
        DriversLicense = documentTypeID27;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID28 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Ein", 27, "EIN");
        Ein = documentTypeID28;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID29 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ElectricityBill", 28, "ELECTRICITY_BILL");
        ElectricityBill = documentTypeID29;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID30 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("EmployeePaySlip", 29, "EMPLOYEE_PAY_SLIP");
        EmployeePaySlip = documentTypeID30;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID31 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("EmployerIssuedLetter", 30, "EMPLOYER_ISSUED_LETTER");
        EmployerIssuedLetter = documentTypeID31;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID32 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("FacePhoto", 31, "FACE_PHOTO");
        FacePhoto = documentTypeID32;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID33 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("FcraRegistration", 32, "FCRA_REGISTRATION");
        FcraRegistration = documentTypeID33;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID34 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("FiscalCode", 33, "FISCAL_CODE");
        FiscalCode = documentTypeID34;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID35 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("GasBill", 34, "GAS_BILL");
        GasBill = documentTypeID35;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID36 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("GovernmentIssuedId", 35, "GOVERNMENT_ISSUED_ID");
        GovernmentIssuedId = documentTypeID36;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID37 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Gstinuin", 36, "GSTINUIN");
        Gstinuin = documentTypeID37;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID38 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("GstCertification", 37, "GST_CERTIFICATION");
        GstCertification = documentTypeID38;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID39 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("HealthInsuranceCard", 38, "HEALTH_INSURANCE_CARD");
        HealthInsuranceCard = documentTypeID39;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID40 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("HkId", 39, "HK_ID");
        HkId = documentTypeID40;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID41 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("IdCard", 40, "ID_CARD");
        IdCard = documentTypeID41;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID42 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ImmigrantId", 41, "IMMIGRANT_ID");
        ImmigrantId = documentTypeID42;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID43 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("IndiaPostIssuedAddressProof", 42, "INDIA_POST_ISSUED_ADDRESS_PROOF");
        IndiaPostIssuedAddressProof = documentTypeID43;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID44 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Inn", 43, "INN");
        Inn = documentTypeID44;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID45 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("InsurancePremiumReceipt", 44, "INSURANCE_PREMIUM_RECEIPT");
        InsurancePremiumReceipt = documentTypeID45;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID46 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Itin", 45, "ITIN");
        Itin = documentTypeID46;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID47 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Kpp", 46, "KPP");
        Kpp = documentTypeID47;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID48 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("LeaseAgreement", 47, "LEASE_AGREEMENT");
        LeaseAgreement = documentTypeID48;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID49 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("LetterFromCouncil", 48, "LETTER_FROM_COUNCIL");
        LetterFromCouncil = documentTypeID49;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID50 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("LetterIssuedByEmployer", 49, "LETTER_ISSUED_BY_EMPLOYER");
        LetterIssuedByEmployer = documentTypeID50;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID51 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("LetterOfAuthorization", 50, "LETTER_OF_AUTHORIZATION");
        LetterOfAuthorization = documentTypeID51;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID52 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("LetterOfBankDebitAuthorization", 51, "LETTER_OF_BANK_DEBIT_AUTHORIZATION");
        LetterOfBankDebitAuthorization = documentTypeID52;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID53 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("LetterOfTrustee", 52, "LETTER_OF_TRUSTEE");
        LetterOfTrustee = documentTypeID53;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID54 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("LoanStatement", 53, "LOAN_STATEMENT");
        LoanStatement = documentTypeID54;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID55 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("MigrationCard", 54, "MIGRATION_CARD");
        MigrationCard = documentTypeID55;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID56 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("MilitaryIdentificationCard", 55, "MILITARY_IDENTIFICATION_CARD");
        MilitaryIdentificationCard = documentTypeID56;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID57 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("MortgageStatement", 56, "MORTGAGE_STATEMENT");
        MortgageStatement = documentTypeID57;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID58 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("MutualFundCertificate", 57, "MUTUAL_FUND_CERTIFICATE");
        MutualFundCertificate = documentTypeID58;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID59 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("MyNumber", 58, "MY_NUMBER");
        MyNumber = documentTypeID59;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID60 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("MyNumberNotificationCard", 59, "MY_NUMBER_NOTIFICATION_CARD");
        MyNumberNotificationCard = documentTypeID60;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID61 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("NationalId", 60, "NATIONAL_ID");
        NationalId = documentTypeID61;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID62 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("NationalIdCard", 61, "NATIONAL_ID_CARD");
        NationalIdCard = documentTypeID62;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID63 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("NexusCard", 62, "NEXUS_CARD");
        NexusCard = documentTypeID63;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID64 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("NotaryAffidavit", 63, "NOTARY_AFFIDAVIT");
        NotaryAffidavit = documentTypeID64;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID65 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("NregaCard", 64, "NREGA_CARD");
        NregaCard = documentTypeID65;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID66 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("OfficialGovernmentLetter", 65, "OFFICIAL_GOVERNMENT_LETTER");
        OfficialGovernmentLetter = documentTypeID66;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID67 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("OrganisationIdentityCard", 66, "ORGANISATION_IDENTITY_CARD");
        OrganisationIdentityCard = documentTypeID67;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID68 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Other", 67, "OTHER");
        Other = documentTypeID68;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID69 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("OtherGovtId", 68, "OTHER_GOVT_ID");
        OtherGovtId = documentTypeID69;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID70 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("OwnershipCertificate", 69, "OWNERSHIP_CERTIFICATE");
        OwnershipCertificate = documentTypeID70;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID71 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Pan", 70, "PAN");
        Pan = documentTypeID71;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID72 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("PanIntimationLetter", 71, "PAN_INTIMATION_LETTER");
        PanIntimationLetter = documentTypeID72;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID73 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Passbook", 72, "PASSBOOK");
        Passbook = documentTypeID73;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID74 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Passport", 73, com.daon.dmds.utils.face.FaceFinderImpl.PASSPORT_DOCUMENT_CLASS);
        Passport = documentTypeID74;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID75 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("PensionBooks", 74, "PENSION_BOOKS");
        PensionBooks = documentTypeID75;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID76 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("PensionCard", 75, "PENSION_CARD");
        PensionCard = documentTypeID76;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID77 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("PersonalIncomeTaxReturn", 76, "PERSONAL_INCOME_TAX_RETURN");
        PersonalIncomeTaxReturn = documentTypeID77;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID78 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("PhoneBill", 77, "PHONE_BILL");
        PhoneBill = documentTypeID78;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID79 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("PhotoId", 78, "PHOTO_ID");
        PhotoId = documentTypeID79;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID80 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("PostalAddressProof", 79, "POSTAL_ADDRESS_PROOF");
        PostalAddressProof = documentTypeID80;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID81 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("PowerOfAttorney", 80, "POWER_OF_ATTORNEY");
        PowerOfAttorney = documentTypeID81;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID82 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ProofOfAddress", 81, "PROOF_OF_ADDRESS");
        ProofOfAddress = documentTypeID82;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID83 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ProofOfAgeCard", 82, "PROOF_OF_AGE_CARD");
        ProofOfAgeCard = documentTypeID83;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID84 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ProofOfBusinessAddress", 83, "PROOF_OF_BUSINESS_ADDRESS");
        ProofOfBusinessAddress = documentTypeID84;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID85 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ProofOfId", 84, "PROOF_OF_ID");
        ProofOfId = documentTypeID85;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID86 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ProofOfIdentity", 85, "PROOF_OF_IDENTITY");
        ProofOfIdentity = documentTypeID86;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID87 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ProofOfName", 86, "PROOF_OF_NAME");
        ProofOfName = documentTypeID87;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID88 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ProofOfSin", 87, "PROOF_OF_SIN");
        ProofOfSin = documentTypeID88;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID89 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("PropertyTaxAssessment", 88, "PROPERTY_TAX_ASSESSMENT");
        PropertyTaxAssessment = documentTypeID89;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID90 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("RationCard", 89, "RATION_CARD");
        RationCard = documentTypeID90;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID91 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ReceiptOfTaxPayment", 90, "RECEIPT_OF_TAX_PAYMENT");
        ReceiptOfTaxPayment = documentTypeID91;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID92 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("RelationshipDocument", 91, "RELATIONSHIP_DOCUMENT");
        RelationshipDocument = documentTypeID92;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID93 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ResidenceCard", 92, "RESIDENCE_CARD");
        ResidenceCard = documentTypeID93;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID94 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("ResidentRegistrationCard", 93, "RESIDENT_REGISTRATION_CARD");
        ResidentRegistrationCard = documentTypeID94;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID95 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("SelfAssessmentTaxForm", 94, "SELF_ASSESSMENT_TAX_FORM");
        SelfAssessmentTaxForm = documentTypeID95;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID96 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Sin", 95, "SIN");
        Sin = documentTypeID96;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID97 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Snils", 96, "SNILS");
        Snils = documentTypeID97;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID98 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("SocialInsurancePremium", 97, "SOCIAL_INSURANCE_PREMIUM");
        SocialInsurancePremium = documentTypeID98;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID99 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("SocialRationCard", 98, "SOCIAL_RATION_CARD");
        SocialRationCard = documentTypeID99;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID100 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("SocialSecurityBenefitsStatement", 99, "SOCIAL_SECURITY_BENEFITS_STATEMENT");
        SocialSecurityBenefitsStatement = documentTypeID100;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID101 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("SocialSecurityCard", 100, "SOCIAL_SECURITY_CARD");
        SocialSecurityCard = documentTypeID101;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID102 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("SpecialPermanentResidenceCard", 101, "SPECIAL_PERMANENT_RESIDENCE_CARD");
        SpecialPermanentResidenceCard = documentTypeID102;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID103 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Ssn", 102, "SSN");
        Ssn = documentTypeID103;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID104 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("StateIdCard", 103, "STATE_ID_CARD");
        StateIdCard = documentTypeID104;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID105 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("StudentRecord", 104, "STUDENT_RECORD");
        StudentRecord = documentTypeID105;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID106 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("TaxAssessmentNotice", 105, "TAX_ASSESSMENT_NOTICE");
        TaxAssessmentNotice = documentTypeID106;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID107 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("TaxExemptionProof", 106, "TAX_EXEMPTION_PROOF");
        TaxExemptionProof = documentTypeID107;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID108 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("TaxId", 107, "TAX_ID");
        TaxId = documentTypeID108;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID109 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("TaxInfoCorrectionForm", 108, "TAX_INFO_CORRECTION_FORM");
        TaxInfoCorrectionForm = documentTypeID109;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID110 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("TaxRegistrationCertificate", 109, "TAX_REGISTRATION_CERTIFICATE");
        TaxRegistrationCertificate = documentTypeID110;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID111 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("TaxStatement", 110, "TAX_STATEMENT");
        TaxStatement = documentTypeID111;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID112 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("TravelPermit", 111, "TRAVEL_PERMIT");
        TravelPermit = documentTypeID112;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID113 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("TvBill", 112, "TV_BILL");
        TvBill = documentTypeID113;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID114 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("UsirsW9Form", 113, "USIRS_W9_FORM");
        UsirsW9Form = documentTypeID114;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID115 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("UtilitiesBill", 114, "UTILITIES_BILL");
        UtilitiesBill = documentTypeID115;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID116 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("VeoCertificate", 115, "VEO_CERTIFICATE");
        VeoCertificate = documentTypeID116;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID117 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("Visa", 116, "VISA");
        Visa = documentTypeID117;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID118 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("VoidedBankCheck", 117, "VOIDED_BANK_CHECK");
        VoidedBankCheck = documentTypeID118;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID119 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("VoidedCheck", 118, "VOIDED_CHECK");
        VoidedCheck = documentTypeID119;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID120 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("VoterId", 119, "VOTER_ID");
        VoterId = documentTypeID120;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID121 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("VoterIdCard", 120, "VOTER_ID_CARD");
        VoterIdCard = documentTypeID121;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID122 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("WaterBill", 121, "WATER_BILL");
        WaterBill = documentTypeID122;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID123 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("WelfareBooks", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, "WELFARE_BOOKS");
        WelfareBooks = documentTypeID123;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID124 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("W8benForm", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, "W8BEN_FORM");
        W8benForm = documentTypeID124;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID125 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("W8beneForm", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, "W8BENE_FORM");
        W8beneForm = documentTypeID125;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID126 = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID("W8eciForm", 125, "W8ECI_FORM");
        W8eciForm = documentTypeID126;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID[] documentTypeIDArr = {documentTypeID, documentTypeID2, documentTypeID3, documentTypeID4, documentTypeID5, documentTypeID6, documentTypeID7, documentTypeID8, documentTypeID9, documentTypeID10, documentTypeID11, documentTypeID12, documentTypeID13, documentTypeID14, documentTypeID15, documentTypeID16, documentTypeID17, documentTypeID18, documentTypeID19, documentTypeID20, documentTypeID21, documentTypeID22, documentTypeID23, documentTypeID24, documentTypeID25, documentTypeID26, documentTypeID27, documentTypeID28, documentTypeID29, documentTypeID30, documentTypeID31, documentTypeID32, documentTypeID33, documentTypeID34, documentTypeID35, documentTypeID36, documentTypeID37, documentTypeID38, documentTypeID39, documentTypeID40, documentTypeID41, documentTypeID42, documentTypeID43, documentTypeID44, documentTypeID45, documentTypeID46, documentTypeID47, documentTypeID48, documentTypeID49, documentTypeID50, documentTypeID51, documentTypeID52, documentTypeID53, documentTypeID54, documentTypeID55, documentTypeID56, documentTypeID57, documentTypeID58, documentTypeID59, documentTypeID60, documentTypeID61, documentTypeID62, documentTypeID63, documentTypeID64, documentTypeID65, documentTypeID66, documentTypeID67, documentTypeID68, documentTypeID69, documentTypeID70, documentTypeID71, documentTypeID72, documentTypeID73, documentTypeID74, documentTypeID75, documentTypeID76, documentTypeID77, documentTypeID78, documentTypeID79, documentTypeID80, documentTypeID81, documentTypeID82, documentTypeID83, documentTypeID84, documentTypeID85, documentTypeID86, documentTypeID87, documentTypeID88, documentTypeID89, documentTypeID90, documentTypeID91, documentTypeID92, documentTypeID93, documentTypeID94, documentTypeID95, documentTypeID96, documentTypeID97, documentTypeID98, documentTypeID99, documentTypeID100, documentTypeID101, documentTypeID102, documentTypeID103, documentTypeID104, documentTypeID105, documentTypeID106, documentTypeID107, documentTypeID108, documentTypeID109, documentTypeID110, documentTypeID111, documentTypeID112, documentTypeID113, documentTypeID114, documentTypeID115, documentTypeID116, documentTypeID117, documentTypeID118, documentTypeID119, documentTypeID120, documentTypeID121, documentTypeID122, documentTypeID123, documentTypeID124, documentTypeID125, documentTypeID126};
        getHighResolutionOutputSizeshNQ4ISI = documentTypeIDArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(documentTypeIDArr);
        INSTANCE = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Companion(null);
        getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.$r8$lambda$7KDHFwXWMO7ssNk5avFtdzvAnx8();
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID$Companion;", "", "<init>", "()V", "", "key", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "fromKey", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID fromKey(java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID) ((java.util.Map) com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.getHighSpeedVideoFpsRangesFor.getValue()).get(key);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ java.util.Map $r8$lambda$7KDHFwXWMO7ssNk5avFtdzvAnx8() {
        kotlin.enums.EnumEntries<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> entries = getEntries();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (java.lang.Object obj : entries) {
            linkedHashMap.put(((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID) obj).key, obj);
        }
        return linkedHashMap;
    }

    public static com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID[] values() {
        return (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID) java.lang.Enum.valueOf(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
