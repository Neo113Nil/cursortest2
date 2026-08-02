package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/atomicfu/TraceFormat;", "", "<init>", "()V", "", "index", "event", "", "format", "(ILjava/lang/Object;)Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public class TraceFormat {
    public java.lang.String format(int index, java.lang.Object event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(index);
        sb.append(": ");
        sb.append(event);
        return sb.toString();
    }
}
