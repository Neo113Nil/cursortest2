package Ve;

import spay.sdk.domain.model.PayStrategy;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class Lc {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f29404a;

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
        f29404a = iArr;
    }
}
