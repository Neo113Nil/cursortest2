package com.paypal.oslo.feature.userprofile.data.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/data/model/DmsFile;", "", "getDownloadLink", "(Lcom/paypal/oslo/feature/userprofile/data/model/DmsFile;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/data/model/DmsResponse;", "(Lcom/paypal/oslo/feature/userprofile/data/model/DmsResponse;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DmsResponseKt {
    public static final java.lang.String getDownloadLink(com.paypal.oslo.feature.userprofile.data.model.DmsFile dmsFile) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dmsFile, "");
        java.util.Iterator<T> it = dmsFile.getLinks().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.userprofile.data.model.DmsLink) obj).getRel(), "download")) {
                break;
            }
        }
        com.paypal.oslo.feature.userprofile.data.model.DmsLink dmsLink = (com.paypal.oslo.feature.userprofile.data.model.DmsLink) obj;
        if (dmsLink != null) {
            return dmsLink.getHref();
        }
        return null;
    }

    public static final java.lang.String getDownloadLink(com.paypal.oslo.feature.userprofile.data.model.DmsResponse dmsResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dmsResponse, "");
        com.paypal.oslo.feature.userprofile.data.model.DmsFile dmsFile = (com.paypal.oslo.feature.userprofile.data.model.DmsFile) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) dmsResponse.getFiles());
        if (dmsFile != null) {
            return getDownloadLink(dmsFile);
        }
        return null;
    }
}
