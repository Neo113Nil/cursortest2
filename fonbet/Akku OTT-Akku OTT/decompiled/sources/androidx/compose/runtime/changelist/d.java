package androidx.compose.runtime.changelist;

import com.android.billingclient.api.BillingResult;

/* loaded from: classes.dex */
public final /* synthetic */ class d {
    public static BillingResult a(int i, String str) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        newBuilder.setDebugMessage(str);
        return newBuilder.build();
    }

    public static String b(String str, String str2) {
        return str + str2;
    }
}
