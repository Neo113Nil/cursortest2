package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\f\"@\u0010\u0010\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e0\rj\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e`\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"*\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0007@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0014\u0010\u0016"}, d2 = {"", "enableLiveLiterals", "()V", "T", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/State;", "liveLiteral", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/compose/runtime/State;", "", "updateLiveLiteralValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/util/HashMap;", "Landroidx/compose/runtime/MutableState;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "getHighSpeedVideoSizes", "Ljava/util/HashMap;", "", "p0", "isLiveLiteralsEnabled", "Z", "()Z", "isLiveLiteralsEnabled$annotations"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LiveLiteralKt {
    private static final java.util.HashMap<java.lang.String, androidx.compose.runtime.MutableState<java.lang.Object>> getHighSpeedVideoSizes = new java.util.HashMap<>();
    private static boolean isLiveLiteralsEnabled;

    @androidx.compose.runtime.ComposeCompilerApi
    public static /* synthetic */ void isLiveLiteralsEnabled$annotations() {
    }

    public static final boolean isLiveLiteralsEnabled() {
        return isLiveLiteralsEnabled;
    }

    public static final void enableLiveLiterals() {
        isLiveLiteralsEnabled = true;
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final <T> androidx.compose.runtime.State<T> liveLiteral(java.lang.String str, T t) {
        java.util.HashMap<java.lang.String, androidx.compose.runtime.MutableState<java.lang.Object>> hashMap = getHighSpeedVideoSizes;
        androidx.compose.runtime.MutableState<java.lang.Object> mutableState = hashMap.get(str);
        if (mutableState == null) {
            mutableState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            hashMap.put(str, mutableState);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableState, "");
        return mutableState;
    }

    public static final void updateLiveLiteralValue(java.lang.String str, java.lang.Object obj) {
        boolean z;
        java.util.HashMap<java.lang.String, androidx.compose.runtime.MutableState<java.lang.Object>> hashMap = getHighSpeedVideoSizes;
        androidx.compose.runtime.MutableState<java.lang.Object> mutableState = hashMap.get(str);
        if (mutableState == null) {
            mutableState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            hashMap.put(str, mutableState);
            z = false;
        } else {
            z = true;
        }
        androidx.compose.runtime.MutableState<java.lang.Object> mutableState2 = mutableState;
        if (z) {
            mutableState2.setValue(obj);
        }
    }
}
