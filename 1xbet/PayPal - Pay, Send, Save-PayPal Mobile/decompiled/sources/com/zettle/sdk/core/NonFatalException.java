package com.zettle.sdk.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/core/NonFatalException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "tag", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "cause", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class NonFatalException extends java.lang.Exception {
    private final java.lang.String tag;

    public final java.lang.String getTag() {
        return this.tag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonFatalException(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        super(str2, th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.tag = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonFatalException(java.lang.String str, java.lang.String str2) {
        this(str, str2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }
}
