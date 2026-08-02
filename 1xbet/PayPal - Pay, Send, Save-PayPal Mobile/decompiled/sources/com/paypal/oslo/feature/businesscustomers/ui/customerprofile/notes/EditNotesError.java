package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesError;", "", "<init>", "(Ljava/lang/String;I)V", "NotesTooLong", "UpdateFailed", "ClearFailed"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditNotesError {
    private static final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError ClearFailed;
    public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError NotesTooLong;
    public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError UpdateFailed;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private EditNotesError(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError editNotesError = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError("NotesTooLong", 0);
        NotesTooLong = editNotesError;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError editNotesError2 = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError("UpdateFailed", 1);
        UpdateFailed = editNotesError2;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError editNotesError3 = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError("ClearFailed", 2);
        ClearFailed = editNotesError3;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError[] editNotesErrorArr = {editNotesError, editNotesError2, editNotesError3};
        Camera2StreamConfigurationMap = editNotesErrorArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(editNotesErrorArr);
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError[] values() {
        return (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
