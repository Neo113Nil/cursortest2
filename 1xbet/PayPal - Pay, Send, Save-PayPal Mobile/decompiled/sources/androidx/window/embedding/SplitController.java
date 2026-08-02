package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/window/embedding/SplitController;", "", "Landroidx/window/embedding/EmbeddingBackend;", "embeddingBackend", "<init>", "(Landroidx/window/embedding/EmbeddingBackend;)V", "Landroid/app/Activity;", "activity", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/window/embedding/SplitInfo;", "splitInfoList", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/Flow;", "", "taskId", "Landroidx/window/embedding/SplitPinRule;", "splitPinRule", "", "pinTopActivityStack", "(ILandroidx/window/embedding/SplitPinRule;)Z", "", "unpinTopActivityStack", "(I)V", "Lkotlin/Function1;", "Landroidx/window/embedding/SplitAttributesCalculatorParams;", "Landroidx/window/embedding/SplitAttributes;", "calculator", "setSplitAttributesCalculator", "(Lkotlin/jvm/functions/Function1;)V", "clearSplitAttributesCalculator", "()V", "splitInfo", "splitAttributes", "updateSplitAttributes", "(Landroidx/window/embedding/SplitInfo;Landroidx/window/embedding/SplitAttributes;)V", "Camera2StreamConfigurationMap", "Landroidx/window/embedding/EmbeddingBackend;", "getHighSpeedVideoFpsRanges", "Landroidx/window/embedding/SplitController$SplitSupportStatus;", "getSplitSupportStatus", "()Landroidx/window/embedding/SplitController$SplitSupportStatus;", "splitSupportStatus", "Companion", "SplitSupportStatus"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SplitController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.SplitController.Companion INSTANCE = new androidx.window.embedding.SplitController.Companion(null);
    public static final boolean sDebug = false;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.window.embedding.EmbeddingBackend getHighSpeedVideoFpsRanges;

    public SplitController(androidx.window.embedding.EmbeddingBackend embeddingBackend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingBackend, "");
        this.getHighSpeedVideoFpsRanges = embeddingBackend;
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<androidx.window.embedding.SplitInfo>> splitInfoList(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.window.embedding.SplitController$splitInfoList$1(this, activity, null));
    }

    public final androidx.window.embedding.SplitController.SplitSupportStatus getSplitSupportStatus() {
        return this.getHighSpeedVideoFpsRanges.getSplitSupportStatus();
    }

    public final boolean pinTopActivityStack(int taskId, androidx.window.embedding.SplitPinRule splitPinRule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitPinRule, "");
        return this.getHighSpeedVideoFpsRanges.pinTopActivityStack(taskId, splitPinRule);
    }

    public final void unpinTopActivityStack(int taskId) {
        this.getHighSpeedVideoFpsRanges.unpinTopActivityStack(taskId);
    }

    public final void setSplitAttributesCalculator(kotlin.jvm.functions.Function1<? super androidx.window.embedding.SplitAttributesCalculatorParams, androidx.window.embedding.SplitAttributes> calculator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calculator, "");
        this.getHighSpeedVideoFpsRanges.setSplitAttributesCalculator(calculator);
    }

    public final void clearSplitAttributesCalculator() {
        this.getHighSpeedVideoFpsRanges.clearSplitAttributesCalculator();
    }

    public final void updateSplitAttributes(androidx.window.embedding.SplitInfo splitInfo, androidx.window.embedding.SplitAttributes splitAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
        this.getHighSpeedVideoFpsRanges.updateSplitAttributes(splitInfo, splitAttributes);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/window/embedding/SplitController$SplitSupportStatus;", "", "", "p0", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SplitSupportStatus {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final int getHighSpeedVideoSizes;
        public static final androidx.window.embedding.SplitController.SplitSupportStatus SPLIT_AVAILABLE = new androidx.window.embedding.SplitController.SplitSupportStatus(0);
        public static final androidx.window.embedding.SplitController.SplitSupportStatus SPLIT_UNAVAILABLE = new androidx.window.embedding.SplitController.SplitSupportStatus(1);
        public static final androidx.window.embedding.SplitController.SplitSupportStatus SPLIT_ERROR_PROPERTY_NOT_DECLARED = new androidx.window.embedding.SplitController.SplitSupportStatus(2);

        private SplitSupportStatus(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        public final java.lang.String toString() {
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                return "SplitSupportStatus: AVAILABLE";
            }
            if (i == 1) {
                return "SplitSupportStatus: UNAVAILABLE";
            }
            if (i == 2) {
                return "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED";
            }
            return "UNKNOWN";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/embedding/SplitController;", "getInstance", "(Landroid/content/Context;)Landroidx/window/embedding/SplitController;", "", "sDebug", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.embedding.SplitController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.window.embedding.SplitController(androidx.window.embedding.EmbeddingBackend.INSTANCE.getInstance(context));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.embedding.SplitController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}
