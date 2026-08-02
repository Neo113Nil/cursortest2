package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u000bJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\rJ/\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/atomicfu/NamedTrace;", "Lkotlinx/atomicfu/TraceBase;", "p0", "", "p1", "<init>", "(Lkotlinx/atomicfu/TraceBase;Ljava/lang/String;)V", "", "", "append", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "p3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/atomicfu/TraceBase;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class NamedTrace extends kotlinx.atomicfu.TraceBase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.atomicfu.TraceBase getHighResolutionOutputSizeshNQ4ISI;

    public NamedTrace(kotlinx.atomicfu.TraceBase traceBase, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceBase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = traceBase;
        this.getHighSpeedVideoSizes = str;
    }

    @Override // kotlinx.atomicfu.TraceBase
    public final void append(java.lang.Object p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.atomicfu.TraceBase traceBase = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(p0);
        traceBase.append(sb.toString());
    }

    @Override // kotlinx.atomicfu.TraceBase
    public final void append(java.lang.Object p0, java.lang.Object p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlinx.atomicfu.TraceBase traceBase = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(p0);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.getHighSpeedVideoSizes);
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb2.append(p1);
        traceBase.append(obj, sb2.toString());
    }

    @Override // kotlinx.atomicfu.TraceBase
    public final void append(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        kotlinx.atomicfu.TraceBase traceBase = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(p0);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.getHighSpeedVideoSizes);
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb2.append(p1);
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(this.getHighSpeedVideoSizes);
        sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb3.append(p2);
        traceBase.append(obj, obj2, sb3.toString());
    }

    @Override // kotlinx.atomicfu.TraceBase
    public final void append(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
        kotlinx.atomicfu.TraceBase traceBase = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(p0);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.getHighSpeedVideoSizes);
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb2.append(p1);
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(this.getHighSpeedVideoSizes);
        sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb3.append(p2);
        java.lang.String obj3 = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.getHighSpeedVideoSizes);
        sb4.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb4.append(p3);
        traceBase.append(obj, obj2, obj3, sb4.toString());
    }

    public final java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toString();
    }
}
