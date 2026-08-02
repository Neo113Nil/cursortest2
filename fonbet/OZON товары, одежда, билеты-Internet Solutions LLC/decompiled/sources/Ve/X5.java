package Ve;

import spay.sdk.api.SPaymentTool;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class X5 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f30337a;

    static {
        int[] iArr = new int[SPaymentTool.values().length];
        try {
            iArr[SPaymentTool.PAYMENT_ACCOUNTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SPaymentTool.CARDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f30337a = iArr;
    }
}
