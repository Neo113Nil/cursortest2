package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/NotCompleted;", "", "cause", "", "invoke", "(Ljava/lang/Throwable;)V", "UserSupplied"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CancelHandler extends kotlinx.coroutines.NotCompleted {
    void invoke(java.lang.Throwable cause);

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\"\u0012\u0019\u0010\u0006\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR'\u0010\u0011\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/coroutines/CancelHandler$UserSupplied;", "Lkotlinx/coroutines/CancelHandler;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "cause", "invoke", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class UserSupplied implements kotlinx.coroutines.CancelHandler {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public UserSupplied(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1) {
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
        }

        @Override // kotlinx.coroutines.CancelHandler
        public final void invoke(java.lang.Throwable cause) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(cause);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelHandler.UserSupplied[");
            sb.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this.getHighResolutionOutputSizeshNQ4ISI));
            sb.append('@');
            sb.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this));
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }
    }
}
