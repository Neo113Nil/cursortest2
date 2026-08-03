package androidx.privacysandbox.ads.adservices.adid;

/* compiled from: AdIdManagerApi31Ext9Impl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerApi31Ext9Impl;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdIdManagerApi31Ext9Impl extends androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdIdManagerApi31Ext9Impl(android.content.Context context) {
        super(r2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.adservices.adid.AdIdManager adIdManager = android.adservices.adid.AdIdManager.get(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adIdManager, "get(context)");
    }
}
