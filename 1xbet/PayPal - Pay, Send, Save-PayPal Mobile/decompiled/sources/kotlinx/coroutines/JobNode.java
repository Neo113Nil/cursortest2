package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Incomplete;", "<init>", "()V", "", "dispose", "", "toString", "()Ljava/lang/String;", "", "cause", "invoke", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/JobSupport;", "job", "Lkotlinx/coroutines/JobSupport;", "getJob", "()Lkotlinx/coroutines/JobSupport;", "setJob", "(Lkotlinx/coroutines/JobSupport;)V", "", "getOnCancelling", "()Z", "onCancelling", "isActive", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "list"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class JobNode extends kotlinx.coroutines.internal.LockFreeLinkedListNode implements kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.Incomplete {
    public kotlinx.coroutines.JobSupport job;

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: getList */
    public kotlinx.coroutines.NodeList getCamera2StreamConfigurationMap() {
        return null;
    }

    public abstract boolean getOnCancelling();

    public abstract void invoke(java.lang.Throwable cause);

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: isActive */
    public boolean getGetHighSpeedVideoSizes() {
        return true;
    }

    public final kotlinx.coroutines.JobSupport getJob() {
        kotlinx.coroutines.JobSupport jobSupport = this.job;
        if (jobSupport != null) {
            return jobSupport;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setJob(kotlinx.coroutines.JobSupport jobSupport) {
        this.job = jobSupport;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        getJob().removeNode$kotlinx_coroutines_core(this);
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this));
        sb.append('@');
        sb.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this));
        sb.append("[job@");
        sb.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(getJob()));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
