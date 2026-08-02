package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSError implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSError> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSError>() { // from class: com.daon.dmds.models.DMDSError.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSError createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSError(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSError[] newArray(int i) {
            return new com.daon.dmds.models.DMDSError[i];
        }
    };
    public java.lang.String description;
    public com.daon.dmds.models.DMDSErrorCode errorCode;
    public java.lang.String reason;
    public java.lang.String recoverySuggestion;

    /* renamed from: com.daon.dmds.models.DMDSError$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.daon.dmds.models.DMDSErrorCode.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeDocumentNotFound.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeDocumentNotRecognized.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeFaceNotFound.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeUnsupportedOrientation.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeCameraAccessUnauthorized.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeScanningLibraryError.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeUnknownInitialisationError.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeLicenseNotValid.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeAutofocusRequiredButNotSupported.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    public DMDSError(android.os.Parcel parcel) {
        this.description = parcel.readString();
        this.reason = parcel.readString();
        this.recoverySuggestion = parcel.readString();
        this.errorCode = com.daon.dmds.models.DMDSErrorCode.valueOf(parcel.readString());
    }

    public static com.daon.dmds.models.DMDSError errorForCode(android.content.Context context, com.daon.dmds.models.DMDSErrorCode dMDSErrorCode) {
        com.daon.dmds.models.DMDSError dMDSError = new com.daon.dmds.models.DMDSError();
        dMDSError.errorCode = dMDSErrorCode;
        switch (com.daon.dmds.models.DMDSError.AnonymousClass2.getHighSpeedVideoFpsRanges[dMDSErrorCode.ordinal()]) {
            case 1:
                dMDSError.description = context.getString(com.daon.dmds.R.string.dmds_error_doc_not_found_desc);
                dMDSError.reason = context.getString(com.daon.dmds.R.string.dmds_error_doc_not_found_reason);
                dMDSError.recoverySuggestion = context.getString(com.daon.dmds.R.string.dmds_error_doc_not_found_recover);
                break;
            case 2:
                dMDSError.description = context.getString(com.daon.dmds.R.string.dmds_error_doc_not_recognise_desc);
                dMDSError.reason = context.getString(com.daon.dmds.R.string.dmds_error_doc_not_recognise_reason);
                dMDSError.recoverySuggestion = context.getString(com.daon.dmds.R.string.dmds_error_doc_not_recognise_recover);
                break;
            case 3:
                dMDSError.description = context.getString(com.daon.dmds.R.string.dmds_error_face_not_found_desc);
                dMDSError.reason = context.getString(com.daon.dmds.R.string.dmds_error_face_not_found_reason);
                dMDSError.recoverySuggestion = context.getString(com.daon.dmds.R.string.dmds_error_face_not_found_recover);
                break;
            case 4:
                dMDSError.description = context.getString(com.daon.dmds.R.string.dmds_error_orient_desc);
                dMDSError.reason = context.getString(com.daon.dmds.R.string.dmds_error_orient_reason);
                dMDSError.recoverySuggestion = context.getString(com.daon.dmds.R.string.dmds_error_orient_recover);
                break;
            case 5:
                dMDSError.description = context.getString(com.daon.dmds.R.string.dmds_error_camera_access_desc);
                dMDSError.reason = context.getString(com.daon.dmds.R.string.dmds_error_camera_access_reason);
                dMDSError.recoverySuggestion = context.getString(com.daon.dmds.R.string.dmds_error_camera_access_recover);
                break;
            case 6:
                dMDSError.description = context.getString(com.daon.dmds.R.string.dmds_error_scan_lib_desc);
                dMDSError.reason = context.getString(com.daon.dmds.R.string.dmds_error_scan_lib_reason);
                dMDSError.recoverySuggestion = context.getString(com.daon.dmds.R.string.dmds_error_scan_lib_recover);
                break;
            case 7:
                dMDSError.description = context.getString(com.daon.dmds.R.string.dmds_error_init_error_desc);
                dMDSError.reason = context.getString(com.daon.dmds.R.string.dmds_error_init_error_reason);
                dMDSError.recoverySuggestion = context.getString(com.daon.dmds.R.string.dmds_error_init_error_recover);
                break;
            case 8:
                dMDSError.description = context.getString(com.daon.dmds.R.string.dmds_error_scan_lib_license_desc);
                dMDSError.reason = context.getString(com.daon.dmds.R.string.dmds_error_scan_lib_license_reason);
                dMDSError.recoverySuggestion = context.getString(com.daon.dmds.R.string.dmds_error_scan_lib_license_recover);
                break;
            case 9:
                dMDSError.description = context.getString(com.daon.dmds.R.string.dmds_error_af_required_not_supported_desc);
                dMDSError.reason = context.getString(com.daon.dmds.R.string.dmds_error_af_required_not_supported_desc);
                dMDSError.recoverySuggestion = context.getString(com.daon.dmds.R.string.dmds_error_af_required_not_supported_desc);
                break;
            default:
                dMDSError.description = context.getString(com.daon.dmds.R.string.dmds_error_unknown_desc);
                dMDSError.reason = context.getString(com.daon.dmds.R.string.dmds_error_unknown_reason);
                dMDSError.recoverySuggestion = context.getString(com.daon.dmds.R.string.dmds_error_unknown_recover);
                break;
        }
        return dMDSError;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.description);
        parcel.writeString(this.reason);
        parcel.writeString(this.recoverySuggestion);
        parcel.writeString(this.errorCode.toString());
    }

    public DMDSError(java.lang.String str, com.daon.dmds.models.DMDSErrorCode dMDSErrorCode) {
        this.description = str;
        this.errorCode = dMDSErrorCode;
    }

    public DMDSError() {
        this.description = "";
        this.reason = "";
        this.recoverySuggestion = "";
        this.errorCode = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeSuccess;
    }
}
