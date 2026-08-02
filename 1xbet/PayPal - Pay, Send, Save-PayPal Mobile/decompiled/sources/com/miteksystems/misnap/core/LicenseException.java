package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/miteksystems/misnap/core/LicenseException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "message", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class LicenseException extends java.lang.Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String message;

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LicenseException(java.lang.String str) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }
}
