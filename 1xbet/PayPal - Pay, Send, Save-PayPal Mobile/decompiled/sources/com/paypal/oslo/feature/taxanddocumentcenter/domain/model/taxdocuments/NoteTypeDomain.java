package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/NoteTypeDomain;", "", "<init>", "(Ljava/lang/String;I)V", "SELF_CORRECTION_IN_PROGRESS", "RECON_UNAVAILABLE", "RECON_REQUEST_INPROGRESS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NoteTypeDomain {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain RECON_REQUEST_INPROGRESS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain RECON_UNAVAILABLE;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain SELF_CORRECTION_IN_PROGRESS;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private NoteTypeDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain noteTypeDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain("SELF_CORRECTION_IN_PROGRESS", 0);
        SELF_CORRECTION_IN_PROGRESS = noteTypeDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain noteTypeDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain("RECON_UNAVAILABLE", 1);
        RECON_UNAVAILABLE = noteTypeDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain noteTypeDomain3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain("RECON_REQUEST_INPROGRESS", 2);
        RECON_REQUEST_INPROGRESS = noteTypeDomain3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain[] noteTypeDomainArr = {noteTypeDomain, noteTypeDomain2, noteTypeDomain3};
        getHighResolutionOutputSizeshNQ4ISI = noteTypeDomainArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(noteTypeDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
