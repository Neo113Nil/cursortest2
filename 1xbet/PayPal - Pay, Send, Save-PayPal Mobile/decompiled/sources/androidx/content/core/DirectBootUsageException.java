package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/datastore/core/DirectBootUsageException;", "Ljava/io/IOException;", "Landroidx/datastore/core/getHighResolutionOutputSizeshNQ4ISI;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "ex", "<init>", "(Ljava/lang/Exception;)V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DirectBootUsageException extends java.io.IOException {
    private final java.lang.String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectBootUsageException(java.lang.Exception exc) {
        super(exc);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Encountered a [");
        sb.append(exc.getMessage());
        sb.append("]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.");
        this.message = sb.toString();
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.message;
    }
}
