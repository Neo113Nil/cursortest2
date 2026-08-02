package androidx.compose.ui.spatial;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ-\u0010!\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J(\u0010$\u001a\u00020\u00182\u0016\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060#R\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u0016H\u0086\b¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b(\u0010'J\u0015\u0010)\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b)\u0010'J3\u0010+\u001a\u00020\u00182\n\u0010*\u001a\u00060#R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b+\u0010,J=\u00102\u001a\u00020\u00182\n\u0010-\u001a\u00060#R\u00020\u00002\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u00072\u0006\u00101\u001a\u00020\u0011H\u0002¢\u0006\u0004\b2\u00103JE\u00105\u001a\u00020\u00112\n\u0010-\u001a\u00060#R\u00020\u00002\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u00072\u0006\u00101\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u0011H\u0002¢\u0006\u0004\b5\u00106J\u001b\u00107\u001a\u00020\u00182\n\u0010-\u001a\u00060#R\u00020\u0000H\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\f2\n\u0010-\u001a\u00060#R\u00020\u0000H\u0002¢\u0006\u0004\b9\u0010:J5\u0010<\u001a\u00060#R\u00020\u0000*\f\u0012\b\u0012\u00060#R\u00020\u00000;2\u0006\u0010-\u001a\u00020\t2\n\u0010.\u001a\u00060#R\u00020\u0000H\u0002¢\u0006\u0004\b<\u0010=J1\u00107\u001a\u00020\f*\f\u0012\b\u0012\u00060#R\u00020\u00000;2\u0006\u0010-\u001a\u00020\t2\n\u0010.\u001a\u00060#R\u00020\u0000H\u0002¢\u0006\u0004\b7\u0010>R!\u0010?\u001a\f\u0012\b\u0012\u00060#R\u00020\u00000;8\u0007¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR(\u0010C\u001a\b\u0018\u00010#R\u00020\u00008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u00108R\"\u0010H\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010'R\"\u0010M\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010I\u001a\u0004\bN\u0010K\"\u0004\bO\u0010'R\"\u0010P\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010K\"\u0004\bR\u0010'R\"\u0010S\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010I\u001a\u0004\bT\u0010K\"\u0004\bU\u0010'R$\u0010V\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010["}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntOffset;", "screen", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "windowWidth", "windowHeight", "", "updateOffsets-LDcG7Xg", "(JJ[FII)Z", "updateOffsets", "id", "", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", com.sun.jna.Callback.METHOD_NAME, "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnRectChanged", "(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnGlobalChange", "topLeft", "bottomRight", "currentMillis", "fireOnUpdatedRect", "(IJJJ)V", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "forEachNewCallbackNeverInvoked", "(Lkotlin/jvm/functions/Function1;)V", "fireOnRectChangedEntries", "(J)V", "fireGlobalChangeEntries", "triggerDebounced", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "fireWithUpdatedRect$ui", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJJ)V", "p0", "p1", "p2", "p3", "p4", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V", "p5", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z", "Landroidx/collection/MutableIntObjectMap;", "Camera2StreamConfigurationMap", "(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z", "rectChangedMap", "Landroidx/collection/MutableIntObjectMap;", "getRectChangedMap", "()Landroidx/collection/MutableIntObjectMap;", "globalChangeEntries", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getGlobalChangeEntries", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setGlobalChangeEntries", "minDebounceDeadline", "J", "getMinDebounceDeadline", "()J", "setMinDebounceDeadline", "windowOffset", "getWindowOffset-nOcc-ac", "setWindowOffset--gyyYBs", "screenOffset", "getScreenOffset-nOcc-ac", "setScreenOffset--gyyYBs", "windowSize", "getWindowSize", "setWindowSize", "viewToWindowMatrix", "[F", "getViewToWindowMatrix-3i98HWw", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "Entry"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThrottledCallbacks {
    public static final int $stable = 8;
    private androidx.compose.ui.spatial.ThrottledCallbacks.Entry globalChangeEntries;
    private float[] viewToWindowMatrix;
    private long windowSize;
    private final androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks.Entry> rectChangedMap = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();
    private long minDebounceDeadline = -1;
    private long windowOffset = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
    private long screenOffset = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();

    public static final /* synthetic */ boolean access$multiRemove(androidx.compose.ui.spatial.ThrottledCallbacks throttledCallbacks, androidx.collection.MutableIntObjectMap mutableIntObjectMap, int i, androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry) {
        return getHighResolutionOutputSizeshNQ4ISI(mutableIntObjectMap, i, entry);
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R(\u0010)\u001a\b\u0018\u00010\u0000R\u00020(8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0011\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b/\u0010 \"\u0004\b0\u00101R\"\u0010\u0012\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b2\u0010 \"\u0004\b3\u00101R\"\u00104\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u00101R\"\u00107\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001e\u001a\u0004\b8\u0010 \"\u0004\b9\u00101"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "", "id", "", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)V", "unregister", "()V", "topLeft", "bottomRight", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "fire-9b-9wPM", "(JJJJ[F)V", "fire", com.visa.cbp.getEncExpo.warmup, "getId", "()I", "J", "getThrottleMillis", "()J", "getDebounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", io.ktor.http.LinkHeader.Rel.Next, "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getNext", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setNext", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "getTopLeft", "setTopLeft", "(J)V", "getBottomRight", "setBottomRight", "lastInvokeMillis", "getLastInvokeMillis", "setLastInvokeMillis", "lastUninvokedFireMillis", "getLastUninvokedFireMillis", "setLastUninvokedFireMillis"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Entry implements androidx.compose.ui.node.DelegatableNode.RegistrationHandle {
        private long bottomRight;
        private final kotlin.jvm.functions.Function1<androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> callback;
        private final long debounceMillis;
        private final int id;
        private long lastInvokeMillis = Long.MIN_VALUE;
        private long lastUninvokedFireMillis = -1;
        private androidx.compose.ui.spatial.ThrottledCallbacks.Entry next;
        private final androidx.compose.ui.node.DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        /* JADX WARN: Multi-variable type inference failed */
        public Entry(int i, long j, long j2, androidx.compose.ui.node.DelegatableNode delegatableNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> function1) {
            this.id = i;
            this.throttleMillis = j;
            this.debounceMillis = j2;
            this.node = delegatableNode;
            this.callback = function1;
        }

        public final int getId() {
            return this.id;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final androidx.compose.ui.node.DelegatableNode getNode() {
            return this.node;
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> getCallback() {
            return this.callback;
        }

        public final androidx.compose.ui.spatial.ThrottledCallbacks.Entry getNext() {
            return this.next;
        }

        public final void setNext(androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry) {
            this.next = entry;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setTopLeft(long j) {
            this.topLeft = j;
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final void setBottomRight(long j) {
            this.bottomRight = j;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final void setLastInvokeMillis(long j) {
            this.lastInvokeMillis = j;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        public final void setLastUninvokedFireMillis(long j) {
            this.lastUninvokedFireMillis = j;
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public final void unregister() {
            androidx.compose.ui.spatial.ThrottledCallbacks throttledCallbacks = androidx.compose.ui.spatial.ThrottledCallbacks.this;
            if (androidx.compose.ui.spatial.ThrottledCallbacks.access$multiRemove(throttledCallbacks, throttledCallbacks.getRectChangedMap(), this.id, this)) {
                return;
            }
            androidx.compose.ui.spatial.ThrottledCallbacks.this.getHighSpeedVideoSizes(this);
        }

        /* renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m7832fire9b9wPM(long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix) {
            androidx.compose.ui.spatial.RelativeLayoutBounds m7833rectInfoForDg36KO4 = androidx.compose.ui.spatial.ThrottledCallbacksKt.m7833rectInfoForDg36KO4(this.node, topLeft, bottomRight, windowOffset, screenOffset, androidx.compose.ui.spatial.ThrottledCallbacks.this.getWindowSize(), viewToWindowMatrix);
            if (m7833rectInfoForDg36KO4 == null) {
                return;
            }
            this.callback.invoke(m7833rectInfoForDg36KO4);
        }
    }

    public final androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks.Entry> getRectChangedMap() {
        return this.rectChangedMap;
    }

    public final androidx.compose.ui.spatial.ThrottledCallbacks.Entry getGlobalChangeEntries() {
        return this.globalChangeEntries;
    }

    public final void setGlobalChangeEntries(androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry) {
        this.globalChangeEntries = entry;
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public final void setMinDebounceDeadline(long j) {
        this.minDebounceDeadline = j;
    }

    /* renamed from: getWindowOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getWindowOffset() {
        return this.windowOffset;
    }

    /* renamed from: setWindowOffset--gyyYBs, reason: not valid java name */
    public final void m7830setWindowOffsetgyyYBs(long j) {
        this.windowOffset = j;
    }

    /* renamed from: getScreenOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getScreenOffset() {
        return this.screenOffset;
    }

    /* renamed from: setScreenOffset--gyyYBs, reason: not valid java name */
    public final void m7828setScreenOffsetgyyYBs(long j) {
        this.screenOffset = j;
    }

    public final long getWindowSize() {
        return this.windowSize;
    }

    public final void setWindowSize(long j) {
        this.windowSize = j;
    }

    /* renamed from: getViewToWindowMatrix-3i98HWw, reason: not valid java name and from getter */
    public final float[] getViewToWindowMatrix() {
        return this.viewToWindowMatrix;
    }

    /* renamed from: setViewToWindowMatrix-Q8lPUPs, reason: not valid java name */
    public final void m7829setViewToWindowMatrixQ8lPUPs(float[] fArr) {
        this.viewToWindowMatrix = fArr;
    }

    /* renamed from: updateOffsets-LDcG7Xg, reason: not valid java name */
    public final boolean m7831updateOffsetsLDcG7Xg(long screen, long window, float[] matrix, int windowWidth, int windowHeight) {
        boolean z;
        if (androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(window, this.windowOffset)) {
            z = false;
        } else {
            this.windowOffset = window;
            z = true;
        }
        if (!androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(screen, this.screenOffset)) {
            this.screenOffset = screen;
            z = true;
        }
        if (matrix != null) {
            this.viewToWindowMatrix = matrix;
            z = true;
        }
        long j = (windowWidth << 32) | (windowHeight & 4294967295L);
        if (j == this.windowSize) {
            return z;
        }
        this.windowSize = j;
        return true;
    }

    public final androidx.compose.ui.node.DelegatableNode.RegistrationHandle registerOnRectChanged(int id, long throttleMillis, long debounceMillis, androidx.compose.ui.node.DelegatableNode node, kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> callback) {
        androidx.compose.ui.spatial.ThrottledCallbacks throttledCallbacks;
        long j;
        if (debounceMillis == 0) {
            throttledCallbacks = this;
            j = throttleMillis;
        } else {
            throttledCallbacks = this;
            j = debounceMillis;
        }
        return Camera2StreamConfigurationMap(throttledCallbacks.rectChangedMap, id, new androidx.compose.ui.spatial.ThrottledCallbacks.Entry(id, throttleMillis, j, node, callback));
    }

    public final androidx.compose.ui.node.DelegatableNode.RegistrationHandle registerOnGlobalChange(int id, long throttleMillis, long debounceMillis, androidx.compose.ui.node.DelegatableNode node, kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> callback) {
        androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry = new androidx.compose.ui.spatial.ThrottledCallbacks.Entry(id, throttleMillis, debounceMillis == 0 ? throttleMillis : debounceMillis, node, callback);
        getHighResolutionOutputSizeshNQ4ISI(entry);
        return entry;
    }

    public final void fireOnUpdatedRect(int id, long topLeft, long bottomRight, long currentMillis) {
        androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry = this.rectChangedMap.get(id);
        while (true) {
            androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry2 = entry;
            if (entry2 == null) {
                return;
            }
            entry = entry2.getNext();
            fireWithUpdatedRect$ui(entry2, topLeft, bottomRight, currentMillis);
        }
    }

    public final void forEachNewCallbackNeverInvoked(kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.ThrottledCallbacks.Entry, kotlin.Unit> callback) {
        androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks.Entry> rectChangedMap = getRectChangedMap();
        java.lang.Object[] objArr = rectChangedMap.values;
        long[] jArr = rectChangedMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry = (androidx.compose.ui.spatial.ThrottledCallbacks.Entry) objArr[(i << 3) + i3];
                        for (androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry2 = entry; entry2 != null; entry2 = entry2.getNext()) {
                            if (entry.getLastInvokeMillis() == Long.MIN_VALUE) {
                                callback.invoke(entry);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void fireOnRectChangedEntries(long currentMillis) {
        long[] jArr;
        long j;
        int i;
        int i2;
        long j2 = this.windowOffset;
        long j3 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks.Entry> mutableIntObjectMap = this.rectChangedMap;
        java.lang.Object[] objArr = mutableIntObjectMap.values;
        long[] jArr2 = mutableIntObjectMap.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j4 = jArr2[i3];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                long j5 = j4;
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry = (androidx.compose.ui.spatial.ThrottledCallbacks.Entry) objArr[(i3 << 3) + i6];
                        while (entry != null) {
                            getHighSpeedVideoFpsRanges(entry, j2, j3, fArr, currentMillis);
                            entry = entry.getNext();
                            i5 = i5;
                            i4 = i4;
                            i3 = i3;
                            i6 = i6;
                            j2 = j2;
                            jArr2 = jArr2;
                            length = length;
                        }
                    }
                    long j6 = j2;
                    int i7 = i4;
                    j5 >>= i7;
                    i6++;
                    i5 = i5;
                    i4 = i7;
                    i3 = i3;
                    j2 = j6;
                    jArr2 = jArr2;
                    length = length;
                }
                jArr = jArr2;
                int i8 = length;
                j = j2;
                i = i3;
                if (i5 != i4) {
                    return;
                } else {
                    i2 = i8;
                }
            } else {
                jArr = jArr2;
                j = j2;
                i = i3;
                i2 = length;
            }
            if (i == i2) {
                return;
            }
            i3 = i + 1;
            length = i2;
            j2 = j;
            jArr2 = jArr;
        }
    }

    public final void fireGlobalChangeEntries(long currentMillis) {
        long j = this.windowOffset;
        long j2 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry2 = entry; entry2 != null; entry2 = entry2.getNext()) {
                androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(entry2.getNode());
                long m7817getOffsetFromRectListForBjo55l4 = androidx.compose.ui.node.LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().m7817getOffsetFromRectListForBjo55l4(requireLayoutNode);
                long lastSize = requireLayoutNode.getLastSize();
                entry2.setTopLeft(m7817getOffsetFromRectListForBjo55l4);
                int i = (int) (lastSize & 4294967295L);
                entry2.setBottomRight(((androidx.compose.ui.unit.IntOffset.m8730getYimpl(m7817getOffsetFromRectListForBjo55l4) + i) & 4294967295L) | ((androidx.compose.ui.unit.IntOffset.m8729getXimpl(m7817getOffsetFromRectListForBjo55l4) + ((int) (lastSize >> 32))) << 32));
                getHighSpeedVideoFpsRanges(entry2, j, j2, fArr, currentMillis);
            }
        }
    }

    public final void triggerDebounced(long currentMillis) {
        long j;
        long j2;
        long j3;
        java.lang.Object[] objArr;
        long[] jArr;
        int i;
        int i2;
        long j4;
        int i3;
        int i4;
        int i5;
        java.lang.Object[] objArr2;
        long[] jArr2;
        long j5;
        int i6;
        int i7;
        if (this.minDebounceDeadline > currentMillis) {
            return;
        }
        long j6 = this.windowOffset;
        long j7 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks.Entry> mutableIntObjectMap = this.rectChangedMap;
        java.lang.Object[] objArr3 = mutableIntObjectMap.values;
        long[] jArr3 = mutableIntObjectMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            j3 = Long.MAX_VALUE;
            int i8 = 0;
            while (true) {
                long j8 = jArr3[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    long j9 = j8;
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j9 & 255) < 128) {
                            long j10 = j3;
                            androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry = (androidx.compose.ui.spatial.ThrottledCallbacks.Entry) objArr3[(i8 << 3) + i11];
                            while (entry != null) {
                                j10 = getHighSpeedVideoFpsRangesFor(entry, j6, j7, fArr, currentMillis, j10);
                                entry = entry.getNext();
                                i10 = i10;
                                i11 = i11;
                                i9 = i9;
                                length = length;
                                j6 = j6;
                                j7 = j7;
                                i8 = i8;
                                objArr3 = objArr3;
                                jArr3 = jArr3;
                            }
                            j4 = j6;
                            i3 = i11;
                            i4 = i10;
                            i5 = i8;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            j5 = j7;
                            i6 = i9;
                            i7 = length;
                            j3 = j10;
                        } else {
                            j4 = j6;
                            i3 = i11;
                            i4 = i10;
                            i5 = i8;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            j5 = j7;
                            i6 = i9;
                            i7 = length;
                        }
                        j9 >>= i6;
                        i11 = i3 + 1;
                        i10 = i4;
                        i9 = i6;
                        length = i7;
                        j6 = j4;
                        j7 = j5;
                        i8 = i5;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                    }
                    j = j6;
                    int i12 = i8;
                    objArr = objArr3;
                    jArr = jArr3;
                    j2 = j7;
                    i = length;
                    if (i10 != i9) {
                        break;
                    } else {
                        i2 = i12;
                    }
                } else {
                    j = j6;
                    objArr = objArr3;
                    jArr = jArr3;
                    j2 = j7;
                    i = length;
                    i2 = i8;
                }
                if (i2 == i) {
                    break;
                }
                i8 = i2 + 1;
                length = i;
                j6 = j;
                j7 = j2;
                objArr3 = objArr;
                jArr3 = jArr;
            }
        } else {
            j = j6;
            j2 = j7;
            j3 = Long.MAX_VALUE;
        }
        androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry2 = this.globalChangeEntries;
        if (entry2 != null) {
            long j11 = j3;
            while (entry2 != null) {
                j11 = getHighSpeedVideoFpsRangesFor(entry2, j, j2, fArr, currentMillis, j11);
                entry2 = entry2.getNext();
            }
            j3 = j11;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = -1;
        }
        this.minDebounceDeadline = j3;
    }

    public final void fireWithUpdatedRect$ui(androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry, long topLeft, long bottomRight, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z = currentMillis - lastInvokeMillis >= throttleMillis || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = debounceMillis == 0;
        boolean z3 = throttleMillis == 0;
        entry.setTopLeft(topLeft);
        entry.setBottomRight(bottomRight);
        boolean z4 = !(z2 || z3) || z2;
        if (z && z4) {
            entry.setLastUninvokedFireMillis(-1L);
            entry.setLastInvokeMillis(currentMillis);
            entry.m7832fire9b9wPM(topLeft, bottomRight, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z2) {
                return;
            }
            entry.setLastUninvokedFireMillis(currentMillis);
            long j = this.minDebounceDeadline;
            if (j <= 0 || currentMillis + debounceMillis >= j) {
                return;
            }
            this.minDebounceDeadline = j;
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.spatial.ThrottledCallbacks.Entry p0, long p1, long p2, float[] p3, long p4) {
        long lastInvokeMillis = p0.getLastInvokeMillis();
        boolean z = p4 - lastInvokeMillis > p0.getThrottleMillis() || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = p0.getDebounceMillis() == 0;
        p0.setLastUninvokedFireMillis(p4);
        if (z && z2) {
            p0.setLastInvokeMillis(p4);
            p0.m7832fire9b9wPM(p0.getTopLeft(), p0.getBottomRight(), p1, p2, p3);
        }
        if (z2) {
            return;
        }
        long j = this.minDebounceDeadline;
        long debounceMillis = p0.getDebounceMillis();
        if (j <= 0 || debounceMillis + p4 >= j) {
            return;
        }
        this.minDebounceDeadline = j;
    }

    private static long getHighSpeedVideoFpsRangesFor(androidx.compose.ui.spatial.ThrottledCallbacks.Entry p0, long p1, long p2, float[] p3, long p4, long p5) {
        if (p0.getDebounceMillis() <= 0 || p0.getLastUninvokedFireMillis() <= 0) {
            return p5;
        }
        if (p4 - p0.getLastUninvokedFireMillis() >= p0.getDebounceMillis()) {
            p0.setLastInvokeMillis(p4);
            p0.setLastUninvokedFireMillis(-1L);
            p0.m7832fire9b9wPM(p0.getTopLeft(), p0.getBottomRight(), p1, p2, p3);
            return p5;
        }
        return java.lang.Math.min(p5, p0.getLastUninvokedFireMillis() + p0.getDebounceMillis());
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.spatial.ThrottledCallbacks.Entry p0) {
        p0.setNext(this.globalChangeEntries);
        this.globalChangeEntries = p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:8:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getHighSpeedVideoSizes(androidx.compose.ui.spatial.ThrottledCallbacks.Entry p0) {
        androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry;
        androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry2 = this.globalChangeEntries;
        if (entry2 == p0) {
            this.globalChangeEntries = entry2.getNext();
            p0.setNext(null);
            return true;
        }
        if (entry2 != null) {
            androidx.compose.ui.spatial.ThrottledCallbacks.Entry next = entry2.getNext();
            androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry3 = next;
            entry = entry2;
            entry2 = entry3;
            if (entry2 == null) {
                return false;
            }
            if (entry2 == p0) {
                if (entry != null) {
                    entry.setNext(entry2.getNext());
                }
                p0.setNext(null);
                return true;
            }
            next = entry2.getNext();
            androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry32 = next;
            entry = entry2;
            entry2 = entry32;
            if (entry2 == null) {
            }
        } else {
            entry = entry2;
            entry2 = null;
            if (entry2 == null) {
            }
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks.Entry> mutableIntObjectMap, int i, androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry) {
        androidx.compose.ui.spatial.ThrottledCallbacks.Entry remove = mutableIntObjectMap.remove(i);
        if (remove == null) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(remove, entry)) {
            androidx.compose.ui.spatial.ThrottledCallbacks.Entry next = entry.getNext();
            entry.setNext(null);
            if (next != null) {
                mutableIntObjectMap.put(i, next);
            } else {
                androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(entry.getNode().getNode());
                if (requireLayoutNode.getAddedToRectList()) {
                    androidx.compose.ui.node.LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().unsetHasCallbacksFor(requireLayoutNode);
                }
            }
            return true;
        }
        mutableIntObjectMap.put(i, remove);
        while (true) {
            if (remove == null) {
                break;
            }
            androidx.compose.ui.spatial.ThrottledCallbacks.Entry next2 = remove.getNext();
            if (next2 == null) {
                return false;
            }
            if (next2 == entry) {
                remove.setNext(entry.getNext());
                entry.setNext(null);
                break;
            }
            remove = remove.getNext();
        }
        return true;
    }

    private static androidx.compose.ui.spatial.ThrottledCallbacks.Entry Camera2StreamConfigurationMap(androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks.Entry> mutableIntObjectMap, int i, androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry) {
        androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry2 = mutableIntObjectMap.get(i);
        if (entry2 == null) {
            mutableIntObjectMap.set(i, entry);
            entry2 = entry;
        }
        androidx.compose.ui.spatial.ThrottledCallbacks.Entry entry3 = entry2;
        if (entry3 != entry) {
            while (entry3.getNext() != null) {
                entry3 = entry3.getNext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(entry3);
            }
            entry3.setNext(entry);
        }
        return entry;
    }
}
