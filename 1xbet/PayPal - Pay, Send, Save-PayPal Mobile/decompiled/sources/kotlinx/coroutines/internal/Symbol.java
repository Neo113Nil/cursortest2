package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\f"}, d2 = {"Lkotlinx/coroutines/internal/Symbol;", "", "", "symbol", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "T", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "unbox", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Symbol {
    public final java.lang.String symbol;

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T unbox(java.lang.Object value) {
        if (value == this) {
            return null;
        }
        return value;
    }

    public Symbol(java.lang.String str) {
        this.symbol = str;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
        sb.append(this.symbol);
        sb.append(kotlin.text.Typography.greater);
        return sb.toString();
    }
}
