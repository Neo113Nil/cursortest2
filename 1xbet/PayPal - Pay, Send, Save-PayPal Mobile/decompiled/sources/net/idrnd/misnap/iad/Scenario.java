package net.idrnd.misnap.iad;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lnet/idrnd/misnap/iad/Scenario;", "", "Lnet/idrnd/face/iad/capture/internal/k3;", "a", "Lnet/idrnd/face/iad/capture/internal/k3;", "getProductType$iad_2_4_3_misnap", "()Lnet/idrnd/capture/internal/k3;", "productType", "Lnet/idrnd/face/iad/capture/internal/n2;", util.h.xy.cb.b.f1091, "Lnet/idrnd/face/iad/capture/internal/n2;", "getPayloadSize$iad_2_4_3_misnap", "()Lnet/idrnd/capture/internal/n2;", "payloadSize", "Companion", "iad-2.4.3_misnap"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class Scenario {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final net.idrnd.misnap.iad.Scenario.Companion INSTANCE = new net.idrnd.misnap.iad.Scenario.Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final net.idrnd.face.iad.capture.internal.k3 productType;

    /* renamed from: b, reason: from kotlin metadata */
    public final net.idrnd.face.iad.capture.internal.n2 payloadSize;

    /* renamed from: getProductType$iad_2_4_3_misnap, reason: from getter */
    public final net.idrnd.face.iad.capture.internal.k3 getProductType() {
        return this.productType;
    }

    /* renamed from: getPayloadSize$iad_2_4_3_misnap, reason: from getter */
    public final net.idrnd.face.iad.capture.internal.n2 getPayloadSize() {
        return this.payloadSize;
    }

    public Scenario(net.idrnd.face.iad.capture.internal.k3 k3Var, net.idrnd.misnap.iad.PayloadSize payloadSize) {
        net.idrnd.face.iad.capture.internal.n2 n2Var;
        this.productType = k3Var;
        int i = payloadSize == null ? -1 : net.idrnd.face.iad.capture.internal.u3.f7010a[payloadSize.ordinal()];
        if (i == -1) {
            n2Var = null;
        } else if (i == 1) {
            n2Var = net.idrnd.face.iad.capture.internal.n2.b;
        } else if (i == 2) {
            n2Var = net.idrnd.face.iad.capture.internal.n2.f6990a;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.payloadSize = n2Var;
    }

    public /* synthetic */ Scenario(net.idrnd.face.iad.capture.internal.k3 k3Var, net.idrnd.misnap.iad.PayloadSize payloadSize, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(k3Var, payloadSize);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnet/idrnd/misnap/iad/Scenario$Companion;", "", "Lnet/idrnd/misnap/iad/PayloadSize;", "payloadSize", "Lnet/idrnd/misnap/iad/Scenario;", "createFaceScenario", "(Lnet/idrnd/misnap/iad/PayloadSize;)Lnet/idrnd/misnap/iad/Scenario;", "createDocumentScenario", "()Lnet/idrnd/misnap/iad/Scenario;"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final net.idrnd.misnap.iad.Scenario createDocumentScenario() {
            return new net.idrnd.misnap.iad.Scenario(net.idrnd.face.iad.capture.internal.k3.b, null, 0 == true ? 1 : 0);
        }

        public final net.idrnd.misnap.iad.Scenario createFaceScenario(net.idrnd.misnap.iad.PayloadSize payloadSize) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadSize, "");
            return new net.idrnd.misnap.iad.Scenario(net.idrnd.face.iad.capture.internal.k3.f6979a, payloadSize, null);
        }

        public Companion() {
        }
    }
}
