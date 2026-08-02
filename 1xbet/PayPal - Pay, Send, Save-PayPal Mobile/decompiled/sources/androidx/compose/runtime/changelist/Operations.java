package androidx.compose.runtime.changelist;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0002NOB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\rJ>\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0002\b\u001aH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0017\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\rJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u0003J\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u00020\b2\u001b\u0010#\u001a\u0017\u0012\b\u0012\u00060\"R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0002\b\u001aH\u0086\b¢\u0006\u0004\b$\u0010%J-\u0010'\u001a\u00020\b2\u001b\u0010&\u001a\u0017\u0012\b\u0012\u00060\"R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0002\b\u001aH\u0086\b¢\u0006\u0004\b'\u0010%J3\u00100\u001a\u00020\b2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0013\u0010\u0014\u001a\u000202*\u000202H\u0002¢\u0006\u0004\b\u0014\u00103J\u000f\u00104\u001a\u000202H\u0017¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002022\u0006\u00106\u001a\u000202H\u0016¢\u0006\u0004\b7\u00103J\u001f\u0010\u0016\u001a\u000202*\u00060\"R\u00020\u00002\u0006\u0010\u000f\u001a\u000202H\u0002¢\u0006\u0004\b\u0016\u00108J\u001d\u0010\u0014\u001a\u000202*\u0004\u0018\u0001092\u0006\u0010\u000f\u001a\u000202H\u0002¢\u0006\u0004\b\u0014\u0010:J'\u0010\u0013\u001a\u000202\"\u0004\b\u0000\u0010;*\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010\u000f\u001a\u000202H\u0002¢\u0006\u0004\b\u0013\u0010=R\"\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0>8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b?\u0010@\u0012\u0004\bA\u0010\u0003R\u0016\u0010B\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\bG\u0010CR\u001e\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090>8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\bJ\u0010CR\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010CR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010CR\u0011\u0010M\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bK\u0010L"}, d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/changelist/Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "pushOp", "(Landroidx/compose/runtime/changelist/Operation;)V", "", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(II)I", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "(II)V", "Camera2StreamConfigurationMap", com.adjust.sdk.Constants.PUSH, "Lkotlin/Function1;", "Landroidx/compose/runtime/changelist/Operations$WriteScope;", "Lkotlin/ExtensionFunctionType;", "args", "(Landroidx/compose/runtime/changelist/Operation;Lkotlin/jvm/functions/Function1;)V", "ensureAllArgumentsPushedFor", "pop", "other", "popInto", "(Landroidx/compose/runtime/changelist/Operations;)V", "Landroidx/compose/runtime/changelist/Operations$OpIterator;", "sink", "drain", "(Lkotlin/jvm/functions/Function1;)V", "action", "forEach", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "errorContext", "executeAndFlushAllPendingOperations", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;Landroidx/compose/runtime/changelist/OperationErrorContext;)V", "", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "linePrefix", "toDebugString", "(Landroidx/compose/runtime/changelist/Operations$OpIterator;Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "T", "", "(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;", "", "opCodes", "[Landroidx/compose/runtime/changelist/Operation;", "getOpCodes$runtime$annotations", "opCodesSize", com.visa.cbp.getEncExpo.warmup, "", "intArgs", "[I", "intArgsSize", "objectArgs", "[Ljava/lang/Object;", "objectArgsSize", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "WriteScope", "OpIterator"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Operations extends androidx.compose.runtime.changelist.OperationsDebugStringFormattable {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;
    private int getHighResolutionOutputSizeshNQ4ISI;
    public int intArgsSize;
    public int objectArgsSize;
    public int opCodesSize;
    public androidx.compose.runtime.changelist.Operation[] opCodes = new androidx.compose.runtime.changelist.Operation[16];
    public int[] intArgs = new int[16];
    public java.lang.Object[] objectArgs = new java.lang.Object[16];

    public static /* synthetic */ void getOpCodes$runtime$annotations() {
    }

    /* renamed from: getSize, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        return getOpCodesSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getOpCodesSize() != 0;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        kotlin.collections.ArraysKt.fill(this.objectArgs, (java.lang.Object) null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void pushOp(androidx.compose.runtime.changelist.Operation operation) {
        if (this.opCodesSize == this.opCodes.length) {
            getHighSpeedVideoFpsRanges();
        }
        int ints = this.intArgsSize + operation.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            getHighSpeedVideoSizes(length, ints);
        }
        int objects = this.objectArgsSize + operation.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            Camera2StreamConfigurationMap(length2, objects);
        }
        androidx.compose.runtime.changelist.Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize;
        this.opCodesSize = i + 1;
        operationArr[i] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int p0, int p1) {
        return kotlin.ranges.RangesKt.coerceAtLeast(p0 + kotlin.ranges.RangesKt.coerceAtMost(p0, 1024), p1);
    }

    private final void getHighSpeedVideoFpsRanges() {
        int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(this.opCodesSize, 1024);
        int i = this.opCodesSize;
        androidx.compose.runtime.changelist.Operation[] operationArr = new androidx.compose.runtime.changelist.Operation[coerceAtMost + i];
        java.lang.System.arraycopy(this.opCodes, 0, operationArr, 0, i);
        this.opCodes = operationArr;
    }

    private final void getHighSpeedVideoSizes(int p0, int p1) {
        int[] iArr = new int[getHighResolutionOutputSizeshNQ4ISI(p0, p1)];
        kotlin.collections.ArraysKt.copyInto(this.intArgs, iArr, 0, 0, p0);
        this.intArgs = iArr;
    }

    private final void Camera2StreamConfigurationMap(int p0, int p1) {
        java.lang.Object[] objArr = new java.lang.Object[getHighResolutionOutputSizeshNQ4ISI(p0, p1)];
        java.lang.System.arraycopy(this.objectArgs, 0, objArr, 0, p0);
        this.objectArgs = objArr;
    }

    public final void push(androidx.compose.runtime.changelist.Operation operation) {
        pushOp(operation);
    }

    public final void push(androidx.compose.runtime.changelist.Operation operation, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.changelist.Operations.WriteScope, kotlin.Unit> args) {
        pushOp(operation);
        args.invoke(androidx.compose.runtime.changelist.Operations.WriteScope.m5362boximpl(androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(this)));
        ensureAllArgumentsPushedFor(operation);
    }

    public final void ensureAllArgumentsPushedFor(androidx.compose.runtime.changelist.Operation operation) {
        int i = this.getHighSpeedVideoFpsRanges;
        int ints = operation.getInts();
        if (i == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void pop() {
        androidx.compose.runtime.changelist.Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize - 1;
        this.opCodesSize = i;
        androidx.compose.runtime.changelist.Operation operation = operationArr[i];
        operationArr[i] = null;
        int objects = operation.getObjects();
        for (int i2 = 0; i2 < objects; i2++) {
            java.lang.Object[] objArr = this.objectArgs;
            int i3 = this.objectArgsSize - 1;
            this.objectArgsSize = i3;
            objArr[i3] = null;
        }
        this.intArgsSize -= operation.getInts();
    }

    public final void popInto(androidx.compose.runtime.changelist.Operations other) {
        androidx.compose.runtime.changelist.Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize - 1;
        this.opCodesSize = i;
        androidx.compose.runtime.changelist.Operation operation = operationArr[i];
        operationArr[i] = null;
        other.pushOp(operation);
        java.lang.Object[] objArr = this.objectArgs;
        java.lang.Object[] objArr2 = other.objectArgs;
        int i2 = other.objectArgsSize;
        int objects = operation.getObjects();
        int objects2 = this.objectArgsSize - operation.getObjects();
        java.lang.System.arraycopy(objArr, objects2, objArr2, i2 - objects, this.objectArgsSize - objects2);
        kotlin.collections.ArraysKt.fill(this.objectArgs, (java.lang.Object) null, this.objectArgsSize - operation.getObjects(), this.objectArgsSize);
        kotlin.collections.ArraysKt.copyInto(this.intArgs, other.intArgs, other.intArgsSize - operation.getInts(), this.intArgsSize - operation.getInts(), this.intArgsSize);
        this.objectArgsSize -= operation.getObjects();
        this.intArgsSize -= operation.getInts();
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.changelist.Operations.OpIterator, kotlin.Unit> action) {
        if (isNotEmpty()) {
            androidx.compose.runtime.changelist.Operations.OpIterator opIterator = new androidx.compose.runtime.changelist.Operations.OpIterator();
            do {
                action.invoke(opIterator);
            } while (opIterator.next());
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("    ");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\r\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\u0014\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000f\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0011\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000f\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0011\u001a\u00020\u00062\n\u0010\u0015\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0016\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0017J)\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u00182\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJE\u0010 \u001a\u00020\n\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001d2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u001e\u0010\u001fJa\u0010 \u001a\u00020\n\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001d\"\u0004\b\u0002\u0010!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u0002¢\u0006\u0004\b\"\u0010#J}\u0010 \u001a\u00020\n\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001d\"\u0004\b\u0002\u0010!\"\u0004\b\u0003\u0010$2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u00022\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00030\u00192\u0006\u0010&\u001a\u00028\u0003¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0011\u00108\u001a\u0002058G¢\u0006\u0006\u001a\u0004\b6\u00107\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "Landroidx/compose/runtime/changelist/Operations;", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "constructor-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", "", "Landroidx/compose/runtime/changelist/IntParameter;", "parameter", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setInt-impl", "(Landroidx/compose/runtime/changelist/Operations;II)V", "setInt", "parameter1", "value1", "parameter2", "value2", "setInts-impl", "(Landroidx/compose/runtime/changelist/Operations;IIII)V", "setInts", "parameter3", "value3", "(Landroidx/compose/runtime/changelist/Operations;IIIIII)V", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "setObject-DKhxnng", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "setObject", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "setObjects-4uCC6AY", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;)V", "setObjects", "V", "setObjects-t7hvbck", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "W", "parameter4", "value4", "setObjects-OGa0p1M", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/changelist/Operations;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/changelist/Operation;", "getOperation-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class WriteScope {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.compose.runtime.changelist.Operations getHighSpeedVideoFpsRanges;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static androidx.compose.runtime.changelist.Operations m5363constructorimpl(androidx.compose.runtime.changelist.Operations operations) {
            return operations;
        }

        private /* synthetic */ WriteScope(androidx.compose.runtime.changelist.Operations operations) {
            this.getHighSpeedVideoFpsRanges = operations;
        }

        /* renamed from: setInt-impl, reason: not valid java name */
        public static final void m5368setIntimpl(androidx.compose.runtime.changelist.Operations operations, int i, int i2) {
            operations.intArgs[(operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()) + i] = i2;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m5369setIntsimpl(androidx.compose.runtime.changelist.Operations operations, int i, int i2, int i3, int i4) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i + ints] = i2;
            iArr[ints + i3] = i4;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m5370setIntsimpl(androidx.compose.runtime.changelist.Operations operations, int i, int i2, int i3, int i4, int i5, int i6) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i + ints] = i2;
            iArr[i3 + ints] = i4;
            iArr[ints + i5] = i6;
        }

        /* renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m5371setObjectDKhxnng(androidx.compose.runtime.changelist.Operations operations, int i, T t) {
            operations.objectArgs[(operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects()) + i] = t;
        }

        /* renamed from: setObjects-4uCC6AY, reason: not valid java name */
        public static final <T, U> void m5372setObjects4uCC6AY(androidx.compose.runtime.changelist.Operations operations, int i, T t, int i2, U u) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            java.lang.Object[] objArr = operations.objectArgs;
            objArr[i + objects] = t;
            objArr[objects + i2] = u;
        }

        /* renamed from: setObjects-t7hvbck, reason: not valid java name */
        public static final <T, U, V> void m5374setObjectst7hvbck(androidx.compose.runtime.changelist.Operations operations, int i, T t, int i2, U u, int i3, V v) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            java.lang.Object[] objArr = operations.objectArgs;
            objArr[i + objects] = t;
            objArr[i2 + objects] = u;
            objArr[objects + i3] = v;
        }

        /* renamed from: setObjects-OGa0p1M, reason: not valid java name */
        public static final <T, U, V, W> void m5373setObjectsOGa0p1M(androidx.compose.runtime.changelist.Operations operations, int i, T t, int i2, U u, int i3, V v, int i4, W w) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            java.lang.Object[] objArr = operations.objectArgs;
            objArr[i + objects] = t;
            objArr[i2 + objects] = u;
            objArr[i3 + objects] = v;
            objArr[objects + i4] = w;
        }

        /* renamed from: getOperation-impl, reason: not valid java name */
        public static final androidx.compose.runtime.changelist.Operation m5366getOperationimpl(androidx.compose.runtime.changelist.Operations operations) {
            return operations.opCodes[operations.opCodesSize - 1];
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ androidx.compose.runtime.changelist.Operations getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String toString() {
            return m5375toStringimpl(this.getHighSpeedVideoFpsRanges);
        }

        public final int hashCode() {
            return m5367hashCodeimpl(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object other) {
            return m5364equalsimpl(this.getHighSpeedVideoFpsRanges, other);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m5375toStringimpl(androidx.compose.runtime.changelist.Operations operations) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WriteScope(stack=");
            sb.append(operations);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5367hashCodeimpl(androidx.compose.runtime.changelist.Operations operations) {
            return operations.hashCode();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5365equalsimpl0(androidx.compose.runtime.changelist.Operations operations, androidx.compose.runtime.changelist.Operations operations2) {
            return kotlin.jvm.internal.Intrinsics.areEqual(operations, operations2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5364equalsimpl(androidx.compose.runtime.changelist.Operations operations, java.lang.Object obj) {
            return (obj instanceof androidx.compose.runtime.changelist.Operations.WriteScope) && kotlin.jvm.internal.Intrinsics.areEqual(operations, ((androidx.compose.runtime.changelist.Operations.WriteScope) obj).getGetHighSpeedVideoFpsRanges());
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.runtime.changelist.Operations.WriteScope m5362boximpl(androidx.compose.runtime.changelist.Operations operations) {
            return new androidx.compose.runtime.changelist.Operations.WriteScope(operations);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0011\u0010\u001d\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "<init>", "(Landroidx/compose/runtime/changelist/Operations;)V", "", io.ktor.http.LinkHeader.Rel.Next, "()Z", "", "Landroidx/compose/runtime/changelist/IntParameter;", "parameter", "getInt", "(I)I", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "getObject", "", "currentOperationDebugString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/changelist/Operation;", "getOperation", "()Landroidx/compose/runtime/changelist/Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class OpIterator implements androidx.compose.runtime.changelist.OperationArgContainer {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;

        public OpIterator() {
        }

        public final boolean next() {
            if (this.getHighResolutionOutputSizeshNQ4ISI >= androidx.compose.runtime.changelist.Operations.this.opCodesSize) {
                return false;
            }
            androidx.compose.runtime.changelist.Operation operation = getOperation();
            this.getHighSpeedVideoFpsRangesFor += operation.getInts();
            this.getHighSpeedVideoSizes += operation.getObjects();
            int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return i < androidx.compose.runtime.changelist.Operations.this.opCodesSize;
        }

        public final androidx.compose.runtime.changelist.Operation getOperation() {
            return androidx.compose.runtime.changelist.Operations.this.opCodes[this.getHighResolutionOutputSizeshNQ4ISI];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public final int getInt(int parameter) {
            return androidx.compose.runtime.changelist.Operations.this.intArgs[this.getHighSpeedVideoFpsRangesFor + parameter];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public final <T> T mo5359getObject31yXWZQ(int parameter) {
            return (T) androidx.compose.runtime.changelist.Operations.this.objectArgs[this.getHighSpeedVideoSizes + parameter];
        }

        public final java.lang.String currentOperationDebugString() {
            androidx.compose.runtime.changelist.Operations operations = androidx.compose.runtime.changelist.Operations.this;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("operation[");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("] = ");
            sb.append(operations.Camera2StreamConfigurationMap(this, ""));
            java.lang.String obj = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }
    }

    @kotlin.Deprecated(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @kotlin.ReplaceWith(expression = "toDebugString()", imports = {}))
    public final java.lang.String toString() {
        return super.toString();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final java.lang.String toDebugString(java.lang.String linePrefix) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (isNotEmpty()) {
            androidx.compose.runtime.changelist.Operations.OpIterator opIterator = new androidx.compose.runtime.changelist.Operations.OpIterator();
            int i = 0;
            while (true) {
                sb.append(linePrefix);
                sb.append(i);
                sb.append(". ");
                sb.append(Camera2StreamConfigurationMap(opIterator, linePrefix));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
                if (!opIterator.next()) {
                    break;
                }
                i++;
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String Camera2StreamConfigurationMap(androidx.compose.runtime.changelist.Operations.OpIterator opIterator, java.lang.String str) {
        androidx.compose.runtime.changelist.Operation operation = opIterator.getOperation();
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            return operation.getName();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(operation.getName());
        sb.append('(');
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        int ints = operation.getInts();
        boolean z = true;
        for (int i = 0; i < ints; i++) {
            java.lang.String intParamName = operation.intParamName(i);
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append(highSpeedVideoSizes);
            sb.append(intParamName);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
            sb.append(opIterator.getInt(i));
        }
        int objects = operation.getObjects();
        for (int i2 = 0; i2 < objects; i2++) {
            int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(i2);
            java.lang.String mo5312objectParamName31yXWZQ = operation.mo5312objectParamName31yXWZQ(m5338constructorimpl);
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append(highSpeedVideoSizes);
            sb.append(mo5312objectParamName31yXWZQ);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
            sb.append(getHighSpeedVideoSizes(opIterator.mo5359getObject31yXWZQ(m5338constructorimpl), highSpeedVideoSizes));
        }
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(str);
        sb.append(")");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    private final java.lang.String getHighSpeedVideoSizes(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            return "null";
        }
        return obj instanceof java.lang.Object[] ? getHighSpeedVideoFpsRanges(kotlin.collections.ArraysKt.asIterable((java.lang.Object[]) obj), str) : obj instanceof int[] ? getHighSpeedVideoFpsRanges(kotlin.collections.ArraysKt.asIterable((int[]) obj), str) : obj instanceof long[] ? getHighSpeedVideoFpsRanges(kotlin.collections.ArraysKt.asIterable((long[]) obj), str) : obj instanceof float[] ? getHighSpeedVideoFpsRanges(kotlin.collections.ArraysKt.asIterable((float[]) obj), str) : obj instanceof double[] ? getHighSpeedVideoFpsRanges(kotlin.collections.ArraysKt.asIterable((double[]) obj), str) : obj instanceof java.lang.Iterable ? getHighSpeedVideoFpsRanges((java.lang.Iterable) obj, str) : obj instanceof androidx.compose.runtime.changelist.OperationsDebugStringFormattable ? ((androidx.compose.runtime.changelist.OperationsDebugStringFormattable) obj).toDebugString(str) : obj.toString();
    }

    private final <T> java.lang.String getHighSpeedVideoFpsRanges(java.lang.Iterable<? extends T> iterable, final java.lang.String str) {
        return kotlin.collections.CollectionsKt.joinToString$default(iterable, ", ", "[", "]", 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.changelist.Operations$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.CharSequence highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.changelist.Operations.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.changelist.Operations.this, str, obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.changelist.Operations operations, java.lang.String str, java.lang.Object obj) {
        return operations.getHighSpeedVideoSizes(obj, str);
    }

    public final void drain(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.changelist.Operations.OpIterator, kotlin.Unit> sink) {
        if (isNotEmpty()) {
            androidx.compose.runtime.changelist.Operations.OpIterator opIterator = new androidx.compose.runtime.changelist.Operations.OpIterator();
            do {
                sink.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void executeAndFlushAllPendingOperations(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slots, androidx.compose.runtime.RememberManager rememberManager, androidx.compose.runtime.changelist.OperationErrorContext errorContext) {
        if (isNotEmpty()) {
            androidx.compose.runtime.changelist.Operations.OpIterator opIterator = new androidx.compose.runtime.changelist.Operations.OpIterator();
            do {
                opIterator.getOperation().executeWithComposeStackTrace(opIterator, applier, slots, rememberManager, errorContext);
            } while (opIterator.next());
        }
        clear();
    }
}
