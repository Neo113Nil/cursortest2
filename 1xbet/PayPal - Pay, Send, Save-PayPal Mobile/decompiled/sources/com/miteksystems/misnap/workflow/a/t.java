package com.miteksystems.misnap.workflow.a;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017"}, d2 = {"Lcom/miteksystems/misnap/workflow/a/t;", "", "", "error", "", "Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel$a;", "voiceRecordings", "<init>", "(ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", util.h.xy.cb.b.f1091, "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean error;

    /* renamed from: b, reason: from kotlin metadata */
    private final java.util.List<com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel.a> voiceRecordings;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VoiceProgressResult(error=");
        sb.append(this.error);
        sb.append(", voiceRecordings=");
        sb.append(this.voiceRecordings);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.error;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.voiceRecordings.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.miteksystems.misnap.workflow.a.t)) {
            return false;
        }
        com.miteksystems.misnap.workflow.a.t tVar = (com.miteksystems.misnap.workflow.a.t) other;
        return this.error == tVar.error && kotlin.jvm.internal.Intrinsics.areEqual(this.voiceRecordings, tVar.voiceRecordings);
    }

    public final java.util.List<com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel.a> b() {
        return this.voiceRecordings;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    public t(boolean z, java.util.List<com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel.a> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.error = z;
        this.voiceRecordings = list;
    }
}
