package com.plaid.internal.core.protos.income_verification_manager;

/* loaded from: classes16.dex */
public enum d implements com.google.protobuf.Internal.EnumLite {
    UPLOAD_FILE_TYPE_NONE(0),
    UPLOAD_FILE_TYPE_PDF(1),
    UPLOAD_FILE_TYPE_PNG(2),
    UPLOAD_FILE_TYPE_JPEG(3),
    UPLOAD_FILE_TYPE_BMP(4),
    UPLOAD_FILE_TYPE_TIFF(5),
    UPLOAD_FILE_TYPE_GIF(6),
    UNRECOGNIZED(-1);

    public static final int UPLOAD_FILE_TYPE_BMP_VALUE = 4;
    public static final int UPLOAD_FILE_TYPE_GIF_VALUE = 6;
    public static final int UPLOAD_FILE_TYPE_JPEG_VALUE = 3;
    public static final int UPLOAD_FILE_TYPE_NONE_VALUE = 0;
    public static final int UPLOAD_FILE_TYPE_PDF_VALUE = 1;
    public static final int UPLOAD_FILE_TYPE_PNG_VALUE = 2;
    public static final int UPLOAD_FILE_TYPE_TIFF_VALUE = 5;
    public static final com.plaid.internal.core.protos.income_verification_manager.d.a b = new com.plaid.internal.core.protos.income_verification_manager.d.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6034a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.income_verification_manager.d> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.income_verification_manager.d findValueByNumber(int i) {
            return com.plaid.internal.core.protos.income_verification_manager.d.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.income_verification_manager.d.b f6035a = new com.plaid.internal.core.protos.income_verification_manager.d.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.income_verification_manager.d.forNumber(i) != null;
        }
    }

    d(int i) {
        this.f6034a = i;
    }

    public static com.plaid.internal.core.protos.income_verification_manager.d forNumber(int i) {
        switch (i) {
            case 0:
                return UPLOAD_FILE_TYPE_NONE;
            case 1:
                return UPLOAD_FILE_TYPE_PDF;
            case 2:
                return UPLOAD_FILE_TYPE_PNG;
            case 3:
                return UPLOAD_FILE_TYPE_JPEG;
            case 4:
                return UPLOAD_FILE_TYPE_BMP;
            case 5:
                return UPLOAD_FILE_TYPE_TIFF;
            case 6:
                return UPLOAD_FILE_TYPE_GIF;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.income_verification_manager.d> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.income_verification_manager.d.b.f6035a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6034a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.income_verification_manager.d valueOf(int i) {
        return forNumber(i);
    }
}
