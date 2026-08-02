package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/google/android/gms/identitycredentials/CallingAppInfo;", "", "", com.visa.cbp.ConsumerInfo.setSignature, "", "", "packageCertificates", "origin", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "Ljava/util/List;", "getPackageCertificates", "()Ljava/util/List;", "getOrigin"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CallingAppInfo {
    private final java.lang.String origin;
    private final java.util.List<byte[]> packageCertificates;
    private final java.lang.String packageName;

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public final java.util.List<byte[]> getPackageCertificates() {
        return this.packageCertificates;
    }

    public final java.lang.String getOrigin() {
        return this.origin;
    }

    public CallingAppInfo(java.lang.String str, java.util.List<byte[]> list, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.packageName = str;
        this.packageCertificates = list;
        this.origin = str2;
    }
}
