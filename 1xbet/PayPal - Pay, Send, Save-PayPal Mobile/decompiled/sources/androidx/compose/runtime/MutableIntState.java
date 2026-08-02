package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038'@'X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/IntState;", "Landroidx/compose/runtime/MutableState;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "()Ljava/lang/Integer;", "setValue", "(I)V", "getIntValue", "()I", "setIntValue", "intValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MutableIntState extends androidx.compose.runtime.IntState, androidx.compose.runtime.MutableState<java.lang.Integer> {
    @Override // androidx.compose.runtime.IntState
    int getIntValue();

    void setIntValue(int i);

    static /* synthetic */ int access$getValue$jd(androidx.compose.runtime.MutableIntState mutableIntState) {
        return super.getValue().intValue();
    }

    @Override // androidx.compose.runtime.MutableState
    /* synthetic */ default void setValue(java.lang.Integer num) {
        setValue(num.intValue());
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.Integer getValue(androidx.compose.runtime.MutableIntState mutableIntState) {
            return java.lang.Integer.valueOf(androidx.compose.runtime.MutableIntState.access$getValue$jd(mutableIntState));
        }

        @java.lang.Deprecated
        public static void setValue(androidx.compose.runtime.MutableIntState mutableIntState, int i) {
            androidx.compose.runtime.MutableIntState.super.setValue(i);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    default java.lang.Integer getValue() {
        return java.lang.Integer.valueOf(getIntValue());
    }

    default void setValue(int i) {
        setIntValue(i);
    }
}
