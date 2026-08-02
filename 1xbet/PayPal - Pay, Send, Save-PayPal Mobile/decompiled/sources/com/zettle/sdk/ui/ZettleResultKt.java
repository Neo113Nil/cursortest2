package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0004H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "Landroid/os/Parcelable;", "asPayload", "(Landroid/os/Parcelable;)Ljava/lang/Object;", "Lcom/zettle/sdk/ui/ZettleResult$Completed;", "(Lcom/zettle/sdk/ui/ZettleResult$Completed;)Ljava/lang/Object;", "Landroid/content/Intent;", "Lcom/zettle/sdk/ui/ZettleResult;", "zettleResult", "(Landroid/content/Intent;)Lcom/zettle/sdk/ui/ZettleResult;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZettleResultKt {
    public static final /* synthetic */ <T> T asPayload(com.zettle.sdk.ui.ZettleResult.Completed<?> completed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completed, "");
        java.lang.Object payload = completed.getPayload();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        T t = (T) payload;
        if (t != null) {
            return t;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Payload is not of type ");
        sb.append(java.lang.Object.class);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final /* synthetic */ <T> T asPayload(android.os.Parcelable parcelable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcelable, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        T t = (T) parcelable;
        if (t != null) {
            return t;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Payload is not of type ");
        sb.append(java.lang.Object.class);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final com.zettle.sdk.ui.ZettleResult zettleResult(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return (com.zettle.sdk.ui.ZettleResult) intent.getParcelableExtra("ZettleSDKActivity::Result");
    }
}
