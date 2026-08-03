package androidx.compose.runtime;

/* compiled from: SnapshotFloatState.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0012\u0010\u0003\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/FloatState;", "Landroidx/compose/runtime/State;", "", "floatValue", "getFloatValue", "()F", "value", "getValue", "()Ljava/lang/Float;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FloatState extends androidx.compose.runtime.State<java.lang.Float> {
    float getFloatValue();

    @Override // androidx.compose.runtime.State
    java.lang.Float getValue();

    /* compiled from: SnapshotFloatState.kt */
    /* renamed from: androidx.compose.runtime.FloatState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ float access$getValue$jd(androidx.compose.runtime.FloatState floatState) {
            return $default$getValue(floatState).floatValue();
        }

        public static java.lang.Float $default$getValue(androidx.compose.runtime.FloatState _this) {
            return java.lang.Float.valueOf(_this.getFloatValue());
        }
    }

    /* compiled from: SnapshotFloatState.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.Float getValue(androidx.compose.runtime.FloatState floatState) {
            return java.lang.Float.valueOf(androidx.compose.runtime.FloatState.CC.access$getValue$jd(floatState));
        }
    }
}
