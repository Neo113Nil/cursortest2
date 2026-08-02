package Ve;

import spay.sdk.api.SPayStage;

/* renamed from: Ve.nj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC4477nj {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f31664a;

    static {
        int[] iArr = new int[SPayStage.values().length];
        try {
            iArr[SPayStage.SandboxRealBankApp.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SPayStage.SandBoxWithoutBankApp.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f31664a = iArr;
    }
}
