package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material3/internal/SwipeEdge;", "", "<init>", "(Ljava/lang/String;I)V", "Left", "Right", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwipeEdge {
    private static final /* synthetic */ androidx.compose.material3.internal.SwipeEdge[] Camera2StreamConfigurationMap;
    public static final androidx.compose.material3.internal.SwipeEdge Left;
    public static final androidx.compose.material3.internal.SwipeEdge None;
    public static final androidx.compose.material3.internal.SwipeEdge Right;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SwipeEdge(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.internal.SwipeEdge swipeEdge = new androidx.compose.material3.internal.SwipeEdge("Left", 0);
        Left = swipeEdge;
        androidx.compose.material3.internal.SwipeEdge swipeEdge2 = new androidx.compose.material3.internal.SwipeEdge("Right", 1);
        Right = swipeEdge2;
        androidx.compose.material3.internal.SwipeEdge swipeEdge3 = new androidx.compose.material3.internal.SwipeEdge(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 2);
        None = swipeEdge3;
        androidx.compose.material3.internal.SwipeEdge[] swipeEdgeArr = {swipeEdge, swipeEdge2, swipeEdge3};
        Camera2StreamConfigurationMap = swipeEdgeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(swipeEdgeArr);
    }

    public static androidx.compose.material3.internal.SwipeEdge valueOf(java.lang.String str) {
        return (androidx.compose.material3.internal.SwipeEdge) java.lang.Enum.valueOf(androidx.compose.material3.internal.SwipeEdge.class, str);
    }

    public static androidx.compose.material3.internal.SwipeEdge[] values() {
        return (androidx.compose.material3.internal.SwipeEdge[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material3.internal.SwipeEdge> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
