package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/atomicfu/TraceFormatThread;", "Lkotlinx/atomicfu/TraceFormat;", "<init>", "()V", "", "p0", "", "p1", "", "format", "(ILjava/lang/Object;)Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TraceFormatThread extends kotlinx.atomicfu.TraceFormat {
    @Override // kotlinx.atomicfu.TraceFormat
    public final java.lang.String format(int p0, java.lang.Object p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p0);
        sb.append(": [");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append("] ");
        sb.append(p1);
        return sb.toString();
    }
}
