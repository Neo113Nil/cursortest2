package com.facebook.bolts;

/* compiled from: AggregateException.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/bolts/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "detailMessage", "", "innerThrowables", "", "", "(Ljava/lang/String;Ljava/util/List;)V", "printStackTrace", "", androidx.core.app.NotificationCompat.CATEGORY_ERROR, "Ljava/io/PrintStream;", "Ljava/io/PrintWriter;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AggregateException extends java.lang.Exception {
    private static final long serialVersionUID = 1;
    private final java.util.List<java.lang.Throwable> innerThrowables;

    public AggregateException(java.lang.String str, java.util.List<? extends java.lang.Throwable> list) {
        super(str, (list == null || !(list.isEmpty() ^ true)) ? null : list.get(0));
        java.util.List<java.lang.Throwable> unmodifiableList = java.util.Collections.unmodifiableList(list == null ? kotlin.collections.CollectionsKt.emptyList() : list);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(innerThrowables ?: emptyList())");
        this.innerThrowables = unmodifiableList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream err) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(err, "err");
        super.printStackTrace(err);
        int i = -1;
        for (java.lang.Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i++;
            err.append((java.lang.CharSequence) java.lang.String.valueOf(i));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter err) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(err, "err");
        super.printStackTrace(err);
        int i = -1;
        for (java.lang.Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i++;
            err.append((java.lang.CharSequence) java.lang.String.valueOf(i));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }
}
