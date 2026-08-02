package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/controller/a/c;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;)V", "a", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", "()Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class c extends java.lang.RuntimeException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.miteksystems.misnap.controller.MiSnapController.ErrorResult data;

    /* renamed from: a, reason: from getter */
    public final com.miteksystems.misnap.controller.MiSnapController.ErrorResult getData() {
        return this.data;
    }

    public c(com.miteksystems.misnap.controller.MiSnapController.ErrorResult errorResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorResult, "");
        this.data = errorResult;
    }
}
