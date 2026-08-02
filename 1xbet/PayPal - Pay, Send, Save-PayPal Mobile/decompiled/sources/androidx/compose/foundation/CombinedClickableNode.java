package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u00016B\u007f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J}\u0010\u001a\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0004*\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001fH\u0014¢\u0006\u0004\b#\u0010!J\u000f\u0010%\u001a\u00020\u0004H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\"\u0010\u001a\u001a\u00020\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010/\u001a\u0004\b-\u00100\"\u0004\b\u001a\u00101R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u00104R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u000205028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u00104"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "Lkotlin/Function0;", "", "p0", "", "p1", "p2", "p3", "", "p4", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p5", "Landroidx/compose/foundation/IndicationNodeFactory;", "p6", "p7", "p8", "p9", "Landroidx/compose/ui/semantics/Role;", "p10", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "createPointerInputNodeIfNeeded", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getHighSpeedVideoSizes", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLjava/lang/String;Landroidx/compose/ui/semantics/Role;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applyAdditionalSemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/input/key/KeyEvent;", "onClickKeyDownEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onClickKeyDownEvent", "onClickKeyUpEvent-ZmokQxo", "onClickKeyUpEvent", "onCancelKeyInput", "()V", "onReset", "getOutputFormats", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Z", "()Z", "(Z)V", "Landroidx/collection/MutableLongObjectMap;", "Lkotlinx/coroutines/Job;", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "DoubleKeyClickState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CombinedClickableNode extends androidx.compose.foundation.AbstractClickableNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.collection.MutableLongObjectMap<kotlinx.coroutines.Job> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.MutableLongObjectMap<androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState> getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;

    private CombinedClickableNode(kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, java.lang.String str2, androidx.compose.ui.semantics.Role role) {
        super(mutableInteractionSource, indicationNodeFactory, z2, z3, str2, role, function0, null);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = function02;
        this.Camera2StreamConfigurationMap = function03;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = androidx.collection.LongObjectMapKt.mutableLongObjectMapOf();
        this.getOutputFormats = androidx.collection.LongObjectMapKt.mutableLongObjectMapOf();
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final void getHighSpeedVideoSizes(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lkotlinx/coroutines/Job;)V", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "", "doubleTapMinTimeMillisElapsed", "Z", "getDoubleTapMinTimeMillisElapsed", "()Z", "setDoubleTapMinTimeMillisElapsed", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DoubleKeyClickState {
        public static final int $stable = 8;
        private boolean doubleTapMinTimeMillisElapsed;
        private final kotlinx.coroutines.Job job;

        public DoubleKeyClickState(kotlinx.coroutines.Job job) {
            this.job = job;
        }

        public final kotlinx.coroutines.Job getJob() {
            return this.job;
        }

        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        public final void setDoubleTapMinTimeMillisElapsed(boolean z) {
            this.doubleTapMinTimeMillisElapsed = z;
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode createPointerInputNodeIfNeeded() {
        return androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1(this));
    }

    public final void getHighSpeedVideoSizes(kotlin.jvm.functions.Function0<kotlin.Unit> p0, java.lang.String p1, kotlin.jvm.functions.Function0<kotlin.Unit> p2, kotlin.jvm.functions.Function0<kotlin.Unit> p3, androidx.compose.foundation.interaction.MutableInteractionSource p4, androidx.compose.foundation.IndicationNodeFactory p5, boolean p6, boolean p7, java.lang.String p8, androidx.compose.ui.semantics.Role p9) {
        boolean z;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, p1)) {
            this.getHighSpeedVideoFpsRanges = p1;
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if ((this.getHighResolutionOutputSizeshNQ4ISI == null) != (p2 == null)) {
            disposeInteractions();
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
            z = true;
        } else {
            z = false;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = p2;
        if ((this.Camera2StreamConfigurationMap == null) != (p3 == null)) {
            z = true;
        }
        this.Camera2StreamConfigurationMap = p3;
        boolean z2 = getEnabled() != p7 ? true : z;
        m1264updateCommonO2vRcR0(p4, p5, p6, p7, p8, p9, p0);
        if (z2) {
            resetPointerInputHandler();
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.CombinedClickableNode$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.CombinedClickableNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.CombinedClickableNode.this);
                    return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.CombinedClickableNode combinedClickableNode) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = combinedClickableNode.getHighResolutionOutputSizeshNQ4ISI;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    protected final boolean mo1259onClickKeyDownEventZmokQxo(android.view.KeyEvent p0) {
        boolean z;
        kotlinx.coroutines.Job launch$default;
        long m7089getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(p0);
        if (this.getHighResolutionOutputSizeshNQ4ISI == null || this.getHighSpeedVideoFpsRangesFor.get(m7089getKeyZmokQxo) != null) {
            z = false;
        } else {
            androidx.collection.MutableLongObjectMap<kotlinx.coroutines.Job> mutableLongObjectMap = this.getHighSpeedVideoFpsRangesFor;
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3, null);
            mutableLongObjectMap.set(m7089getKeyZmokQxo, launch$default);
            z = true;
        }
        androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState doubleKeyClickState = this.getOutputFormats.get(m7089getKeyZmokQxo);
        if (doubleKeyClickState != null) {
            if (doubleKeyClickState.getJob().isActive()) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(doubleKeyClickState.getJob(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                if (!doubleKeyClickState.getDoubleTapMinTimeMillisElapsed()) {
                    getOnClick().invoke();
                    this.getOutputFormats.remove(m7089getKeyZmokQxo);
                    return z;
                }
            } else {
                this.getOutputFormats.remove(m7089getKeyZmokQxo);
            }
        }
        return z;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    protected final boolean mo1260onClickKeyUpEventZmokQxo(android.view.KeyEvent p0) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0;
        kotlinx.coroutines.Job launch$default;
        long m7089getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(p0);
        boolean z = false;
        if (this.getHighSpeedVideoFpsRangesFor.get(m7089getKeyZmokQxo) != null) {
            kotlinx.coroutines.Job job = this.getHighSpeedVideoFpsRangesFor.get(m7089getKeyZmokQxo);
            if (job != null) {
                if (job.isActive()) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                } else {
                    z = true;
                }
            }
            this.getHighSpeedVideoFpsRangesFor.remove(m7089getKeyZmokQxo);
        }
        if (this.Camera2StreamConfigurationMap != null) {
            if (this.getOutputFormats.get(m7089getKeyZmokQxo) != null) {
                if (!z && (function0 = this.Camera2StreamConfigurationMap) != null) {
                    function0.invoke();
                }
                this.getOutputFormats.remove(m7089getKeyZmokQxo);
            } else if (!z) {
                androidx.collection.MutableLongObjectMap<androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState> mutableLongObjectMap = this.getOutputFormats;
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2(this, m7089getKeyZmokQxo, null), 3, null);
                mutableLongObjectMap.set(m7089getKeyZmokQxo, new androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState(launch$default));
            }
        } else if (!z) {
            getOnClick().invoke();
        }
        return true;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    protected final void onCancelKeyInput() {
        getHighSpeedVideoSizes();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        getHighSpeedVideoSizes();
    }

    private final void getHighSpeedVideoSizes() {
        androidx.collection.MutableLongObjectMap<kotlinx.coroutines.Job> mutableLongObjectMap = this.getHighSpeedVideoFpsRangesFor;
        androidx.collection.MutableLongObjectMap<kotlinx.coroutines.Job> mutableLongObjectMap2 = mutableLongObjectMap;
        java.lang.Object[] objArr = mutableLongObjectMap2.values;
        long[] jArr = mutableLongObjectMap2.metadata;
        int length = jArr.length - 2;
        char c = 7;
        long j = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & j) != j) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j2 & 255) < 128) {
                            kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) objArr[(i << 3) + i3], (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        }
                        j2 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
                j = -9187201950435737472L;
            }
        }
        mutableLongObjectMap.clear();
        androidx.collection.MutableLongObjectMap<androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState> mutableLongObjectMap3 = this.getOutputFormats;
        androidx.collection.MutableLongObjectMap<androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState> mutableLongObjectMap4 = mutableLongObjectMap3;
        java.lang.Object[] objArr2 = mutableLongObjectMap4.values;
        long[] jArr2 = mutableLongObjectMap4.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j3 = jArr2[i4];
                if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j3 & 255) < 128) {
                            kotlinx.coroutines.Job.DefaultImpls.cancel$default(((androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState) objArr2[(i4 << 3) + i6]).getJob(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                }
                i4++;
                c = 7;
            }
        }
        mutableLongObjectMap3.clear();
    }

    public /* synthetic */ CombinedClickableNode(kotlin.jvm.functions.Function0 function0, java.lang.String str, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, java.lang.String str2, androidx.compose.ui.semantics.Role role, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, str, function02, function03, z, mutableInteractionSource, indicationNodeFactory, z2, z3, str2, role);
    }
}
