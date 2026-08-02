package kotlin.reflect.jvm.internal.calls;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 #*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b$%&'()*#B5\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0001\u0007+,-./01"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "p0", "Ljava/lang/reflect/Type;", "p1", "Ljava/lang/Class;", "p2", "", "p3", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "", "obj", "", "checkObjectInstance", "(Ljava/lang/Object;)V", "member", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "returnType", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "instanceClass", "Ljava/lang/Class;", "getInstanceClass", "()Ljava/lang/Class;", "", "parameterTypes", "Ljava/util/List;", "getParameterTypes", "()Ljava/util/List;", "Companion", "Constructor", "BoundConstructor", "AccessorForHiddenConstructor", "AccessorForHiddenBoundConstructor", "Method", "FieldGetter", "FieldSetter", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CallerImpl<M extends java.lang.reflect.Member> implements kotlin.reflect.jvm.internal.calls.Caller<M> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.calls.CallerImpl.Companion INSTANCE = new kotlin.reflect.jvm.internal.calls.CallerImpl.Companion(null);
    private final java.lang.Class<?> instanceClass;
    private final M member;
    private final java.util.List<java.lang.reflect.Type> parameterTypes;
    private final java.lang.reflect.Type returnType;

    public boolean default$isBoundInstanceCallWithValueClasses() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CallerImpl(M m, java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type[] typeArr) {
        java.util.List<java.lang.reflect.Type> list;
        this.member = m;
        this.returnType = type;
        this.instanceClass = cls;
        if (cls != null) {
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
            spreadBuilder.add(cls);
            spreadBuilder.addSpread(typeArr);
            list = kotlin.collections.CollectionsKt.listOf(spreadBuilder.toArray(new java.lang.reflect.Type[spreadBuilder.size()]));
        }
        list = kotlin.collections.ArraysKt.toList(typeArr);
        this.parameterTypes = list;
    }

    public void checkArguments(java.lang.Object[] objArr) {
        default$checkArguments(objArr);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public boolean isBoundInstanceCallWithValueClasses() {
        return default$isBoundInstanceCallWithValueClasses();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: getMember */
    public final M mo23887getMember() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final java.lang.reflect.Type getReturnType() {
        return this.returnType;
    }

    public final java.lang.Class<?> getInstanceClass() {
        return this.instanceClass;
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
    public java.util.List<java.lang.reflect.Type> getParameterTypes() {
        return this.parameterTypes;
    }

    protected final void checkObjectInstance(java.lang.Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new java.lang.IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Constructor extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Constructor(java.lang.reflect.Constructor<?> constructor) {
            super(r2, r3, r4, r5, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
            java.lang.reflect.Constructor<?> constructor2 = constructor;
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaringClass, "");
            java.lang.Class<?> cls = declaringClass;
            java.lang.Class<?> declaringClass2 = constructor.getDeclaringClass();
            java.lang.Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            declaringClass3 = (declaringClass3 == null || java.lang.reflect.Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            checkArguments(args);
            return mo23887getMember().newInstance(java.util.Arrays.copyOf(args, args.length));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BoundConstructor extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Constructor<?>> implements kotlin.reflect.jvm.internal.calls.BoundCaller {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.Object getHighSpeedVideoFpsRanges;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BoundConstructor(java.lang.reflect.Constructor<?> constructor, java.lang.Object obj) {
            super(constructor, r1, null, r5, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaringClass, "");
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
            this.getHighSpeedVideoFpsRanges = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            checkArguments(args);
            java.lang.reflect.Constructor<?> mo23887getMember = mo23887getMember();
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
            spreadBuilder.add(this.getHighSpeedVideoFpsRanges);
            spreadBuilder.addSpread(args);
            return mo23887getMember.newInstance(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AccessorForHiddenConstructor extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AccessorForHiddenConstructor(java.lang.reflect.Constructor<?> constructor) {
            super(r2, r3, null, (java.lang.reflect.Type[]) (r8.length <= 1 ? new java.lang.reflect.Type[0] : kotlin.collections.ArraysKt.copyOfRange(r8, 0, r8.length - 1)), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
            java.lang.reflect.Constructor<?> constructor2 = constructor;
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaringClass, "");
            java.lang.Class<?> cls = declaringClass;
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
            java.lang.reflect.Type[] typeArr = genericParameterTypes;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            checkArguments(args);
            java.lang.reflect.Constructor<?> mo23887getMember = mo23887getMember();
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
            spreadBuilder.addSpread(args);
            spreadBuilder.add(null);
            return mo23887getMember.newInstance(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AccessorForHiddenBoundConstructor extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Constructor<?>> implements kotlin.reflect.jvm.internal.calls.BoundCaller {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.Object Camera2StreamConfigurationMap;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AccessorForHiddenBoundConstructor(java.lang.reflect.Constructor<?> constructor, java.lang.Object obj) {
            super(r2, r3, null, (java.lang.reflect.Type[]) (r8.length <= 2 ? new java.lang.reflect.Type[0] : kotlin.collections.ArraysKt.copyOfRange(r8, 1, r8.length - 1)), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
            java.lang.reflect.Constructor<?> constructor2 = constructor;
            java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaringClass, "");
            java.lang.Class<?> cls = declaringClass;
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
            java.lang.reflect.Type[] typeArr = genericParameterTypes;
            this.Camera2StreamConfigurationMap = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            checkArguments(args);
            java.lang.reflect.Constructor<?> mo23887getMember = mo23887getMember();
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(3);
            spreadBuilder.add(this.Camera2StreamConfigurationMap);
            spreadBuilder.addSpread(args);
            spreadBuilder.add(null);
            return mo23887getMember.newInstance(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018B+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "p0", "", "p1", "", "Ljava/lang/reflect/Type;", "p2", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "", "instance", "args", "callMethod", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Static", "Instance", "JvmStaticInObject", "BoundStatic", "BoundStaticMultiFieldValueClass", "BoundInstance", "BoundJvmStaticInObject", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Method extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Method> {
        private final boolean getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Method(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z, typeArr, null);
            z = (i & 2) != 0 ? !java.lang.reflect.Modifier.isStatic(method.getModifiers()) : z;
            if ((i & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeArr, "");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Method(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr) {
            super(r1, r2, z ? method.getDeclaringClass() : null, typeArr, null);
            java.lang.reflect.Method method2 = method;
            java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericReturnType, "");
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.jvm.internal.Intrinsics.areEqual(getReturnType(), java.lang.Void.TYPE);
        }

        protected final java.lang.Object callMethod(java.lang.Object instance, java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return this.getHighResolutionOutputSizeshNQ4ISI ? kotlin.Unit.INSTANCE : mo23887getMember().invoke(instance, java.util.Arrays.copyOf(args, args.length));
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Static extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                checkArguments(args);
                return callMethod(null, args);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Instance extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                checkArguments(args);
                return callMethod(args[0], args.length <= 1 ? new java.lang.Object[0] : kotlin.collections.ArraysKt.copyOfRange(args, 1, args.length));
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class JvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(java.lang.reflect.Method method) {
                super(method, true, null, 4, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                checkArguments(args);
                checkObjectInstance(kotlin.collections.ArraysKt.firstOrNull(args));
                return callMethod(null, args.length <= 1 ? new java.lang.Object[0] : kotlin.collections.ArraysKt.copyOfRange(args, 1, args.length));
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u0004\u0018\u00010\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "method", "", "isCallByToValueClassMangledMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;ZLjava/lang/Object;)V", "", "args", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "Z", "isCallByToValueClassMangledMethod$kotlin_reflection", "()Z", "Ljava/lang/Object;", "getBoundReceiver$kotlin_reflection", "()Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BoundStatic extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            private final java.lang.Object boundReceiver;
            private final boolean isCallByToValueClassMangledMethod;

            /* renamed from: getBoundReceiver$kotlin_reflection, reason: from getter */
            public final java.lang.Object getBoundReceiver() {
                return this.boundReceiver;
            }

            /* renamed from: isCallByToValueClassMangledMethod$kotlin_reflection, reason: from getter */
            public final boolean getIsCallByToValueClassMangledMethod() {
                return this.isCallByToValueClassMangledMethod;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public BoundStatic(java.lang.reflect.Method method, boolean z, java.lang.Object obj) {
                super(method, false, (java.lang.reflect.Type[]) (r1.length <= 1 ? new java.lang.reflect.Type[0] : kotlin.collections.ArraysKt.copyOfRange(r1, 1, r1.length)), null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
                java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
                java.lang.reflect.Type[] typeArr = genericParameterTypes;
                this.isCallByToValueClassMangledMethod = z;
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                checkArguments(args);
                kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
                spreadBuilder.add(this.boundReceiver);
                spreadBuilder.addSpread(args);
                return callMethod(null, spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "method", "", "", "boundReceiverComponents", "<init>", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "args", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "[Ljava/lang/Object;", "getBoundReceiverComponents$kotlin_reflection", "()[Ljava/lang/Object;", "", "getReceiverComponentsCount", "()I", "receiverComponentsCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BoundStaticMultiFieldValueClass extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            private final java.lang.Object[] boundReceiverComponents;

            /* renamed from: getBoundReceiverComponents$kotlin_reflection, reason: from getter */
            public final java.lang.Object[] getBoundReceiverComponents() {
                return this.boundReceiverComponents;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public BoundStaticMultiFieldValueClass(java.lang.reflect.Method method, java.lang.Object[] objArr) {
                super(method, false, (java.lang.reflect.Type[]) kotlin.collections.ArraysKt.drop(r1, objArr.length).toArray(new java.lang.reflect.Type[0]), null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
                java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
                this.boundReceiverComponents = objArr;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                checkArguments(args);
                kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
                spreadBuilder.addSpread(this.boundReceiverComponents);
                spreadBuilder.addSpread(args);
                return callMethod(null, spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
            }

            public final int getReceiverComponentsCount() {
                return this.boundReceiverComponents.length;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BoundInstance extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method implements kotlin.reflect.jvm.internal.calls.BoundCaller {

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private final java.lang.Object getHighSpeedVideoFpsRangesFor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(java.lang.reflect.Method method, java.lang.Object obj) {
                super(method, false, null, 4, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
                this.getHighSpeedVideoFpsRangesFor = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                checkArguments(args);
                return callMethod(this.getHighSpeedVideoFpsRangesFor, args);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.Method implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(java.lang.reflect.Method method) {
                super(method, false, null, 4, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                checkArguments(args);
                return callMethod(null, args);
            }
        }

        public /* synthetic */ Method(java.lang.reflect.Method method, boolean z, java.lang.reflect.Type[] typeArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z, typeArr);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "p0", "", "p1", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "Static", "Instance", "JvmStaticInObject", "BoundInstance", "BoundJvmStaticInObject", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class FieldGetter extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Field> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private FieldGetter(java.lang.reflect.Field field, boolean z) {
            super(r1, r2, z ? field.getDeclaringClass() : null, new java.lang.reflect.Type[0], null);
            java.lang.reflect.Field field2 = field;
            java.lang.reflect.Type genericType = field.getGenericType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericType, "");
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            checkArguments(args);
            return mo23887getMember().get(getInstanceClass() != null ? kotlin.collections.ArraysKt.first(args) : null);
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Static extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(java.lang.reflect.Field field) {
                super(field, false, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Instance extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(java.lang.reflect.Field field) {
                super(field, true, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "args", "", "checkArguments", "([Ljava/lang/Object;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class JvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(java.lang.reflect.Field field) {
                super(field, true, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
            public final void checkArguments(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                super.checkArguments(args);
                checkObjectInstance(kotlin.collections.ArraysKt.firstOrNull(args));
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Ljava/lang/reflect/Field;", "field", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "", "args", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BoundInstance extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter implements kotlin.reflect.jvm.internal.calls.BoundCaller {

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(java.lang.reflect.Field field, java.lang.Object obj) {
                super(field, false, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
                this.getHighResolutionOutputSizeshNQ4ISI = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter, kotlin.reflect.jvm.internal.calls.Caller
            public final java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                checkArguments(args);
                return mo23887getMember().get(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(java.lang.reflect.Field field) {
                super(field, false, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            }
        }

        public /* synthetic */ FieldGetter(java.lang.reflect.Field field, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0001\u0005\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "", "args", "", "checkArguments", "([Ljava/lang/Object;)V", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Camera2StreamConfigurationMap", "Static", "Instance", "JvmStaticInObject", "BoundInstance", "BoundJvmStaticInObject", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class FieldSetter extends kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Field> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final boolean Camera2StreamConfigurationMap;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private FieldSetter(java.lang.reflect.Field field, boolean z, boolean z2) {
            super(r1, r3, r9, new java.lang.reflect.Type[]{r7}, null);
            java.lang.reflect.Field field2 = field;
            java.lang.Class cls = java.lang.Void.TYPE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls, "");
            java.lang.Class cls2 = cls;
            java.lang.Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
            java.lang.reflect.Type genericType = field.getGenericType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericType, "");
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
        public void checkArguments(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            super.checkArguments(args);
            if (this.Camera2StreamConfigurationMap && kotlin.collections.ArraysKt.last(args) == null) {
                throw new java.lang.IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            checkArguments(args);
            mo23887getMember().set(getInstanceClass() != null ? kotlin.collections.ArraysKt.first(args) : null, kotlin.collections.ArraysKt.last(args));
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Static extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(java.lang.reflect.Field field, boolean z) {
                super(field, z, false, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Instance extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(java.lang.reflect.Field field, boolean z) {
                super(field, z, true, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", "checkArguments", "([Ljava/lang/Object;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class JvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(java.lang.reflect.Field field, boolean z) {
                super(field, z, true, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.CallerImpl
            public final void checkArguments(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                super.checkArguments(args);
                checkObjectInstance(kotlin.collections.ArraysKt.firstOrNull(args));
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "", "args", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BoundInstance extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter implements kotlin.reflect.jvm.internal.calls.BoundCaller {

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private final java.lang.Object getHighSpeedVideoSizes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(java.lang.reflect.Field field, boolean z, java.lang.Object obj) {
                super(field, z, false, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
                this.getHighSpeedVideoSizes = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            public final java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                checkArguments(args);
                mo23887getMember().set(this.getHighSpeedVideoSizes, kotlin.collections.ArraysKt.first(args));
                return kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter implements kotlin.reflect.jvm.internal.calls.BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(java.lang.reflect.Field field, boolean z) {
                super(field, z, false, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            public final java.lang.Object call(java.lang.Object[] args) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
                checkArguments(args);
                mo23887getMember().set(null, kotlin.collections.ArraysKt.last(args));
                return kotlin.Unit.INSTANCE;
            }
        }

        public /* synthetic */ FieldSetter(java.lang.reflect.Field field, boolean z, boolean z2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0006\b\u0001\u0010\u0006\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\u0005H\u0086\b¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0006\b\u0001\u0010\u0006\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\u0005H\u0086\b¢\u0006\u0002\u0010\u0007J(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0006\b\u0001\u0010\u0006\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\u0005H\u0086\b¢\u0006\u0002\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Companion;", "", "<init>", "()V", "dropFirst", "", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropLast", "dropFirstAndLast", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CallerImpl(java.lang.reflect.Member member, java.lang.reflect.Type type, java.lang.Class cls, java.lang.reflect.Type[] typeArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }
}
