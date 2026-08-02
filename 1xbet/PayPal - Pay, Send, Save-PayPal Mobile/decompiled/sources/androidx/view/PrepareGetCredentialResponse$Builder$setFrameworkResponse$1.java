package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class PrepareGetCredentialResponse$Builder$setFrameworkResponse$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Boolean.valueOf(androidx.credentials.PrepareGetCredentialResponse.Builder.access$hasCredentialType((androidx.credentials.PrepareGetCredentialResponse.Builder) this.receiver, str));
    }

    PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(java.lang.Object obj) {
        super(1, obj, androidx.credentials.PrepareGetCredentialResponse.Builder.class, "hasCredentialType", "hasCredentialType(Ljava/lang/String;)Z", 0);
    }
}
