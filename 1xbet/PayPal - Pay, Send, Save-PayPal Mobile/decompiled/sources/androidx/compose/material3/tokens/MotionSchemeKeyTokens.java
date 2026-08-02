package androidx.compose.material3.tokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Landroidx/compose/material3/tokens/MotionSchemeKeyTokens;", "", "<init>", "(Ljava/lang/String;I)V", "DefaultSpatial", "FastSpatial", "SlowSpatial", "DefaultEffects", "FastEffects", "SlowEffects"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MotionSchemeKeyTokens {
    private static final /* synthetic */ androidx.compose.material3.tokens.MotionSchemeKeyTokens[] Camera2StreamConfigurationMap;
    public static final androidx.compose.material3.tokens.MotionSchemeKeyTokens DefaultEffects;
    public static final androidx.compose.material3.tokens.MotionSchemeKeyTokens DefaultSpatial;
    public static final androidx.compose.material3.tokens.MotionSchemeKeyTokens FastEffects;
    public static final androidx.compose.material3.tokens.MotionSchemeKeyTokens FastSpatial;
    public static final androidx.compose.material3.tokens.MotionSchemeKeyTokens SlowEffects;
    public static final androidx.compose.material3.tokens.MotionSchemeKeyTokens SlowSpatial;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private MotionSchemeKeyTokens(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.tokens.MotionSchemeKeyTokens motionSchemeKeyTokens = new androidx.compose.material3.tokens.MotionSchemeKeyTokens("DefaultSpatial", 0);
        DefaultSpatial = motionSchemeKeyTokens;
        androidx.compose.material3.tokens.MotionSchemeKeyTokens motionSchemeKeyTokens2 = new androidx.compose.material3.tokens.MotionSchemeKeyTokens("FastSpatial", 1);
        FastSpatial = motionSchemeKeyTokens2;
        androidx.compose.material3.tokens.MotionSchemeKeyTokens motionSchemeKeyTokens3 = new androidx.compose.material3.tokens.MotionSchemeKeyTokens("SlowSpatial", 2);
        SlowSpatial = motionSchemeKeyTokens3;
        androidx.compose.material3.tokens.MotionSchemeKeyTokens motionSchemeKeyTokens4 = new androidx.compose.material3.tokens.MotionSchemeKeyTokens("DefaultEffects", 3);
        DefaultEffects = motionSchemeKeyTokens4;
        androidx.compose.material3.tokens.MotionSchemeKeyTokens motionSchemeKeyTokens5 = new androidx.compose.material3.tokens.MotionSchemeKeyTokens("FastEffects", 4);
        FastEffects = motionSchemeKeyTokens5;
        androidx.compose.material3.tokens.MotionSchemeKeyTokens motionSchemeKeyTokens6 = new androidx.compose.material3.tokens.MotionSchemeKeyTokens("SlowEffects", 5);
        SlowEffects = motionSchemeKeyTokens6;
        androidx.compose.material3.tokens.MotionSchemeKeyTokens[] motionSchemeKeyTokensArr = {motionSchemeKeyTokens, motionSchemeKeyTokens2, motionSchemeKeyTokens3, motionSchemeKeyTokens4, motionSchemeKeyTokens5, motionSchemeKeyTokens6};
        Camera2StreamConfigurationMap = motionSchemeKeyTokensArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(motionSchemeKeyTokensArr);
    }

    public static androidx.compose.material3.tokens.MotionSchemeKeyTokens valueOf(java.lang.String str) {
        return (androidx.compose.material3.tokens.MotionSchemeKeyTokens) java.lang.Enum.valueOf(androidx.compose.material3.tokens.MotionSchemeKeyTokens.class, str);
    }

    public static androidx.compose.material3.tokens.MotionSchemeKeyTokens[] values() {
        return (androidx.compose.material3.tokens.MotionSchemeKeyTokens[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material3.tokens.MotionSchemeKeyTokens> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
