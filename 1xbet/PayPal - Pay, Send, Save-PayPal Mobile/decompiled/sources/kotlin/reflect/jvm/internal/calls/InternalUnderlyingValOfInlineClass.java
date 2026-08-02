package kotlin.reflect.jvm.internal.calls;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u001d\u001eB\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0002\u001f "}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "p0", "", "Ljava/lang/reflect/Type;", "p1", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "", "instance", "", "args", "callMethod", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ljava/lang/reflect/Method;", "getHighResolutionOutputSizeshNQ4ISI", "parameterTypes", "Ljava/util/List;", "getParameterTypes", "()Ljava/util/List;", "getMember", "()Ljava/lang/reflect/Method;", "member", "returnType", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "Unbound", "Bound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class InternalUnderlyingValOfInlineClass implements kotlin.reflect.jvm.internal.calls.Caller<java.lang.reflect.Method> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<java.lang.reflect.Type> parameterTypes;
    private final java.lang.reflect.Type returnType;

    public boolean default$isBoundInstanceCallWithValueClasses() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: getMember, reason: avoid collision after fix types in other method */
    public final java.lang.reflect.Method mo23887getMember() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InternalUnderlyingValOfInlineClass(java.lang.reflect.Method method, java.util.List<? extends java.lang.reflect.Type> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = method;
        this.parameterTypes = list;
        java.lang.Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
        this.returnType = returnType;
    }

    public void checkArguments(java.lang.Object[] objArr) {
        default$checkArguments(objArr);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public boolean isBoundInstanceCallWithValueClasses() {
        return default$isBoundInstanceCallWithValueClasses();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final java.util.List<java.lang.reflect.Type> getParameterTypes() {
        return this.parameterTypes;
    }

    public void default$checkArguments(java.lang.Object[] objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        if (kotlin.reflect.jvm.internal.calls.CallerKt.getArity(this) == objArr.length) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Callable expects ");
        sb.append(kotlin.reflect.jvm.internal.calls.CallerKt.getArity(this));
        sb.append(" arguments, but ");
        sb.append(objArr.length);
        sb.append(" were provided.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final java.lang.reflect.Type getReturnType() {
        return this.returnType;
    }

    protected final java.lang.Object callMethod(java.lang.Object instance, java.lang.Object[] args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(instance, java.util.Arrays.copyOf(args, args.length));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Unbound extends kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unbound(java.lang.reflect.Method method) {
            super(method, kotlin.collections.CollectionsKt.listOf(method.getDeclaringClass()), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            checkArguments(args);
            java.lang.Object obj = args[0];
            kotlin.reflect.jvm.internal.calls.CallerImpl.Companion companion = kotlin.reflect.jvm.internal.calls.CallerImpl.INSTANCE;
            return callMethod(obj, args.length <= 1 ? new java.lang.Object[0] : kotlin.collections.ArraysKt.copyOfRange(args, 1, args.length));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Bound extends kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass implements kotlin.reflect.jvm.internal.calls.BoundCaller {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.Object getHighSpeedVideoFpsRanges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bound(java.lang.reflect.Method method, java.lang.Object obj) {
            super(method, kotlin.collections.CollectionsKt.emptyList(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            this.getHighSpeedVideoFpsRanges = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            checkArguments(args);
            return callMethod(this.getHighSpeedVideoFpsRanges, args);
        }
    }

    public /* synthetic */ InternalUnderlyingValOfInlineClass(java.lang.reflect.Method method, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }
}
