package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/miteksystems/misnap/controller/a/f;", "Lcom/miteksystems/misnap/controller/a/b0;", "Lcom/miteksystems/misnap/core/UserAction;", "userAction", "Lcom/miteksystems/misnap/controller/a/b;", "barcodeControllerResult", "Lcom/miteksystems/misnap/controller/a/j;", "documentControllerResult", "<init>", "(Lcom/miteksystems/misnap/core/UserAction;Lcom/miteksystems/misnap/controller/a/b;Lcom/miteksystems/misnap/controller/a/j;)V", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/controller/a/b;", "()Lcom/miteksystems/misnap/controller/a/b;", "c", "Lcom/miteksystems/misnap/controller/a/j;", "()Lcom/miteksystems/misnap/controller/a/j;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class f extends com.miteksystems.misnap.controller.a.b0 {

    /* renamed from: b, reason: from kotlin metadata */
    private final com.miteksystems.misnap.controller.a.b barcodeControllerResult;

    /* renamed from: c, reason: from kotlin metadata */
    private final com.miteksystems.misnap.controller.a.j documentControllerResult;

    /* renamed from: c, reason: from getter */
    public final com.miteksystems.misnap.controller.a.j getDocumentControllerResult() {
        return this.documentControllerResult;
    }

    /* renamed from: b, reason: from getter */
    public final com.miteksystems.misnap.controller.a.b getBarcodeControllerResult() {
        return this.barcodeControllerResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.miteksystems.misnap.core.UserAction userAction, com.miteksystems.misnap.controller.a.b bVar, com.miteksystems.misnap.controller.a.j jVar) {
        super(userAction, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "");
        this.barcodeControllerResult = bVar;
        this.documentControllerResult = jVar;
    }
}
