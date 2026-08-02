package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, d2 = {"Landroidx/compose/animation/core/Spring;", "", "<init>", "()V", "", "StiffnessHigh", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "StiffnessMedium", "StiffnessMediumLow", "StiffnessLow", "StiffnessVeryLow", "DampingRatioHighBouncy", "DampingRatioMediumBouncy", "DampingRatioLowBouncy", "DampingRatioNoBouncy", "DefaultDisplacementThreshold"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Spring {
    public static final int $stable = 0;
    public static final float DampingRatioHighBouncy = 0.2f;
    public static final float DampingRatioLowBouncy = 0.75f;
    public static final float DampingRatioMediumBouncy = 0.5f;
    public static final float DampingRatioNoBouncy = 1.0f;
    public static final float DefaultDisplacementThreshold = 0.01f;
    public static final androidx.compose.animation.core.Spring INSTANCE = new androidx.compose.animation.core.Spring();
    public static final float StiffnessHigh = 10000.0f;
    public static final float StiffnessLow = 200.0f;
    public static final float StiffnessMedium = 1500.0f;
    public static final float StiffnessMediumLow = 400.0f;
    public static final float StiffnessVeryLow = 50.0f;

    private Spring() {
    }
}
