package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0013H\u0084\b¢\u0006\u0004\b\u0015\u0010\u0016R8\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0005@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010#R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0%8G¢\u0006\u0006\u001a\u0004\b&\u0010'"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "createSlot", "()Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "allocateSlot", "slot", "", "freeSlot", "(Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;)V", "Lkotlin/Function1;", "block", "forEachSlotLocked", "(Lkotlin/jvm/functions/Function1;)V", "p0", "slots", "[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "getSlots", "()[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "nCollectors", com.visa.cbp.getEncExpo.warmup, "getNCollectors", "()I", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "subscriptionCount"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractSharedFlow<S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;
    private int nCollectors;
    private S[] slots;

    protected abstract S createSlot();

    protected abstract S[] createSlotArray(int size);

    protected final S[] getSlots() {
        return this.slots;
    }

    protected final int getNCollectors() {
        return this.nCollectors;
    }

    protected final void forEachSlotLocked(kotlin.jvm.functions.Function1<? super S, kotlin.Unit> block) {
        kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (this.nCollectors == 0 || (abstractSharedFlowSlotArr = this.slots) == null) {
            return;
        }
        for (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
            if (abstractSharedFlowSlot != null) {
                block.invoke(abstractSharedFlowSlot);
            }
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSubscriptionCount() {
        kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this.getHighSpeedVideoFpsRanges;
            if (subscriptionCountStateFlow == null) {
                subscriptionCountStateFlow = new kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow(this.nCollectors);
                this.getHighSpeedVideoFpsRanges = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }

    public final S allocateSlot() {
        S s;
        kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            S[] sArr = this.slots;
            if (sArr == null) {
                sArr = createSlotArray(2);
                this.slots = sArr;
            } else if (this.nCollectors >= sArr.length) {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(sArr, sArr.length * 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                this.slots = (S[]) ((kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) copyOf);
                sArr = (S[]) ((kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) copyOf);
            }
            int i = this.Camera2StreamConfigurationMap;
            do {
                s = sArr[i];
                if (s == null) {
                    s = createSlot();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(s, "");
            } while (!s.allocateLocked(this));
            this.Camera2StreamConfigurationMap = i;
            this.nCollectors++;
            subscriptionCountStateFlow = this.getHighSpeedVideoFpsRanges;
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.Camera2StreamConfigurationMap(1);
        }
        return s;
    }

    public final void freeSlot(S slot) {
        kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i;
        kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked;
        synchronized (this) {
            int i2 = this.nCollectors - 1;
            this.nCollectors = i2;
            subscriptionCountStateFlow = this.getHighSpeedVideoFpsRanges;
            if (i2 == 0) {
                this.Camera2StreamConfigurationMap = 0;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(slot, "");
            freeLocked = slot.freeLocked(this);
        }
        for (kotlin.coroutines.Continuation<kotlin.Unit> continuation : freeLocked) {
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.Camera2StreamConfigurationMap(-1);
        }
    }
}
