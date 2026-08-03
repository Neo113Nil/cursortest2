package androidx.compose.runtime;

/* compiled from: SnapshotDoubleState.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0012\u0010\u0003\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/State;", "", "doubleValue", "getDoubleValue", "()D", "value", "getValue", "()Ljava/lang/Double;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DoubleState extends androidx.compose.runtime.State<java.lang.Double> {
    double getDoubleValue();

    @Override // androidx.compose.runtime.State
    java.lang.Double getValue();

    /* compiled from: SnapshotDoubleState.kt */
    /* renamed from: androidx.compose.runtime.DoubleState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ double access$getValue$jd(androidx.compose.runtime.DoubleState doubleState) {
            return $default$getValue(doubleState).doubleValue();
        }

        public static java.lang.Double $default$getValue(androidx.compose.runtime.DoubleState _this) {
            return java.lang.Double.valueOf(_this.getDoubleValue());
        }
    }

    /* compiled from: SnapshotDoubleState.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.Double getValue(androidx.compose.runtime.DoubleState doubleState) {
            return java.lang.Double.valueOf(androidx.compose.runtime.DoubleState.CC.access$getValue$jd(doubleState));
        }
    }
}
