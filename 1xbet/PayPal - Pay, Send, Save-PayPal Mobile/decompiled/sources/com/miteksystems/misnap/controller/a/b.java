package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/miteksystems/misnap/controller/a/b;", "Lcom/miteksystems/misnap/controller/a/b0;", "Lcom/miteksystems/misnap/core/UserAction;", "userAction", "Lcom/miteksystems/misnap/core/Barcode;", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "", "licenseExpired", "<init>", "(Lcom/miteksystems/misnap/core/UserAction;Lcom/miteksystems/misnap/core/Barcode;Z)V", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/core/Barcode;", "()Lcom/miteksystems/misnap/core/Barcode;", "c", "Z", "()Z"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class b extends com.miteksystems.misnap.controller.a.b0 {

    /* renamed from: b, reason: from kotlin metadata */
    private final com.miteksystems.misnap.core.Barcode barcode;

    /* renamed from: c, reason: from kotlin metadata */
    private final boolean licenseExpired;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.miteksystems.misnap.core.UserAction userAction, com.miteksystems.misnap.core.Barcode barcode, boolean z) {
        super(userAction, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAction, "");
        this.barcode = barcode;
        this.licenseExpired = z;
    }

    public /* synthetic */ b(com.miteksystems.misnap.core.UserAction userAction, com.miteksystems.misnap.core.Barcode barcode, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userAction, (i & 2) != 0 ? null : barcode, z);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getLicenseExpired() {
        return this.licenseExpired;
    }

    /* renamed from: b, reason: from getter */
    public final com.miteksystems.misnap.core.Barcode getBarcode() {
        return this.barcode;
    }
}
