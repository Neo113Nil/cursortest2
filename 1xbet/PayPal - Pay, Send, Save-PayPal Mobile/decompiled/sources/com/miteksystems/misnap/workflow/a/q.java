package com.miteksystems.misnap.workflow.a;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/miteksystems/misnap/workflow/a/q;", "Landroid/app/AlertDialog;", "", "a", com.visa.cbp.getEncExpo.warmup, "getLayoutId$workflow_release", "()I", "layoutId", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;I)V", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class q extends android.app.AlertDialog {
    private final int getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, int i) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = i;
        if (i != 0) {
            setView(getLayoutInflater().inflate(i, (android.view.ViewGroup) null));
        }
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
    }
}
