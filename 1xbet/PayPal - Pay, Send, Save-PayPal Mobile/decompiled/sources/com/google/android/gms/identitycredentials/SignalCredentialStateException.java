package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/google/android/gms/identitycredentials/SignalCredentialStateException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "type", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SignalCredentialStateException extends java.lang.Exception {
    public static final java.lang.String ERROR_TYPE_UNKNOWN = "android.credentials.SignalCredentialStateException.TYPE_UNKNOWN";
    private final java.lang.String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCredentialStateException(java.lang.String str, java.lang.String str2) {
        super(str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    public final java.lang.String getType() {
        return this.type;
    }
}
