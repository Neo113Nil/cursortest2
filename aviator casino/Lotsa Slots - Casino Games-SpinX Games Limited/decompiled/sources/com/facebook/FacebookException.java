package com.facebook;

/* compiled from: FacebookException.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B)\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB\u0011\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "message", "", "(Ljava/lang/String;)V", "format", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "toString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class FacebookException extends java.lang.RuntimeException {
    public static final long serialVersionUID = 1;

    public FacebookException() {
    }

    public FacebookException(final java.lang.String str) {
        super(str);
        java.util.Random random = new java.util.Random();
        if (str != null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (!com.facebook.FacebookSdk.isInitialized() || random.nextInt(100) <= 50) {
                return;
            }
            com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
            com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.ErrorReport, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.FacebookException$$ExternalSyntheticLambda0
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    com.facebook.FacebookException.m5051_init_$lambda0(str, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m5051_init_$lambda0(java.lang.String str, boolean z) {
        if (z) {
            try {
                com.facebook.internal.instrument.errorreport.ErrorReportHandler errorReportHandler = com.facebook.internal.instrument.errorreport.ErrorReportHandler.INSTANCE;
                com.facebook.internal.instrument.errorreport.ErrorReportHandler.save(str);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FacebookException(java.lang.String str, java.lang.Object... args) {
        this(r2);
        java.lang.String format;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        if (str == null) {
            format = null;
        } else {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(args, args.length);
            format = java.lang.String.format(str, java.util.Arrays.copyOf(copyOf, copyOf.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        }
    }

    public FacebookException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public FacebookException(java.lang.Throwable th) {
        super(th);
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        java.lang.String message = getMessage();
        return message == null ? "" : message;
    }
}
