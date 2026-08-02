package Ve;

import spay.sdk.api.SPaymentTool;
import spay.sdk.domain.model.PayStrategy;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class Ao {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28636a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f28637b;

    static {
        int[] iArr = new int[PayStrategy.PayWithBinding.FeatureVersion.values().length];
        try {
            iArr[PayStrategy.PayWithBinding.FeatureVersion.DEPRECATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PayStrategy.PayWithBinding.FeatureVersion.MVP0.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f28636a = iArr;
        int[] iArr2 = new int[SPaymentTool.values().length];
        try {
            iArr2[SPaymentTool.CARDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SPaymentTool.PAYMENT_ACCOUNTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f28637b = iArr2;
    }
}
