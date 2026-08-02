package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 y*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u00020\u0006:\u0003wxyB\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\"\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020.2\u0006\u00103\u001a\u00020(2\u0006\u00104\u001a\u000205H\u0002J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020:0.2\u0006\u0010;\u001a\u00020<H\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020>0.2\u0006\u0010;\u001a\u00020<H\u0016J\u0012\u0010?\u001a\u0004\u0018\u00010:2\u0006\u0010@\u001a\u00020AH\u0016J\u0014\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0002H\u0096\u0080\u0004J\u0014\u0010o\u001a\u00020Q2\b\u0010p\u001a\u0004\u0018\u00010\u0002H\u0096\u0082\u0004J\n\u0010q\u001a\u00020AH\u0096\u0080\u0004J\n\u0010r\u001a\u00020CH\u0096\u0080\u0004J\u0018\u0010s\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010t\u001a\u00020uH\u0002J\u0018\u0010v\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010t\u001a\u00020uH\u0002R\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\u0012\u0012\u000e\u0012\f0\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00000\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u001f\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0.8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002070.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00101R\u0017\u0010B\u001a\u0004\u0018\u00010C8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0017\u0010F\u001a\u0004\u0018\u00010C8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bG\u0010ER!\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000I0.8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bJ\u00101R\u001f\u0010K\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040.8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bL\u00101R\u0017\u0010M\u001a\u0004\u0018\u00018\u00008VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001b\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u001b8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bU\u0010\u001eR\u001b\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u001b8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bX\u0010\u001eR#\u0010Y\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\u001b8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bZ\u0010\u001eR\u0017\u0010[\u001a\u0004\u0018\u00010\\8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020`8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0015\u0010c\u001a\u00020Q8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0015\u0010e\u001a\u00020Q8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\be\u0010dR\u0015\u0010f\u001a\u00020Q8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bf\u0010dR\u0015\u0010g\u001a\u00020Q8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bg\u0010dR\u0015\u0010h\u001a\u00020Q8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bh\u0010dR\u0015\u0010i\u001a\u00020Q8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bi\u0010dR\u0015\u0010j\u001a\u00020Q8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bj\u0010dR\u0015\u0010k\u001a\u00020Q8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bk\u0010dR\u0015\u0010l\u001a\u00020Q8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\bl\u0010dR\u0014\u0010m\u001a\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010d¨\u0006z"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Lkotlin/reflect/jvm/internal/impl/types/model/TypeConstructorMarker;", "jClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "getData", "()Lkotlin/Lazy;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "kmClass", "Lkotlin/reflect/jvm/internal/impl/km/KmClass;", "getKmClass", "()Lkotlin/metadata/KmClass;", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classKind", "Lkotlin/reflect/jvm/internal/impl/km/ClassKind;", "getClassKind$kotlin_reflection", "()Lkotlin/metadata/ClassKind;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "staticScope", "getStaticScope$kotlin_reflection", "members", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "belonginess", "Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "getProperties", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getLocalProperty", "index", "", "simpleName", "", "getSimpleName", "()Ljava/lang/String;", "qualifiedName", "getQualifiedName", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "isInstance", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "sealedSubclasses", "getSealedSubclasses", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "modality", "Lkotlin/reflect/jvm/internal/impl/km/Modality;", "getModality", "()Lkotlin/metadata/Modality;", "isFinal", "()Z", "isOpen", "isAbstract", "isSealed", "isData", "isInner", "isCompanion", "isFun", "isValue", "isInline", "isInline$kotlin_reflection", "equals", "other", "hashCode", "toString", "createSyntheticClassOrFail", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "createSyntheticClass", "Data", "MemberBelonginess", "Companion", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KClassImpl<T> extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl implements kotlin.reflect.KClass<T>, kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker {
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes;
    private final kotlin.Lazy<kotlin.reflect.jvm.internal.KClassImpl<T>.Data> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Class<T> getHighSpeedVideoFpsRangesFor;

    public KClassImpl(java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        this.getHighSpeedVideoFpsRangesFor = cls;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$$Lambda$0
            private final kotlin.reflect.jvm.internal.KClassImpl Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.KClassImpl.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final java.lang.Class<T> getJClass() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u001f\u001a\u00020\u00182\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!H\u0002J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020=0\u0012H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001d\u0010\u001aR-\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0#8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0010\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R%\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b,\u0010(R#\u0010.\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b2\u0010\n\u0012\u0004\b/\u0010&\u001a\u0004\b0\u00101R!\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0010\u001a\u0004\b5\u0010\u0015R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\b9\u0010:R!\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0010\u001a\u0004\b>\u0010\u0015R)\u0010A\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000+0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0010\u001a\u0004\bB\u0010\u0015R%\u0010D\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u0010\u001a\u0004\bF\u0010(R%\u0010H\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u0010\u001a\u0004\bI\u0010(R%\u0010K\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\u0010\u001a\u0004\bL\u0010(R%\u0010N\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\u0010\u001a\u0004\bO\u0010(R%\u0010Q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010\u0010\u001a\u0004\bR\u0010(R%\u0010T\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010\u0010\u001a\u0004\bU\u0010(R%\u0010W\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010\u0010\u001a\u0004\bX\u0010(R%\u0010Z\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010\u0010\u001a\u0004\b[\u0010(¨\u0006]"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "kmClass", "Lkotlin/reflect/jvm/internal/impl/km/KmClass;", "getKmClass", "()Lkotlin/metadata/KmClass;", "kmClass$delegate", "Lkotlin/Lazy;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "simpleName", "", "getSimpleName", "()Ljava/lang/String;", "simpleName$delegate", "qualifiedName", "getQualifiedName", "qualifiedName$delegate", "calculateLocalClassName", "jClass", "Ljava/lang/Class;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors$annotations", "()V", "getConstructors", "()Ljava/util/Collection;", "constructors$delegate", "nestedClasses", "Lkotlin/reflect/KClass;", "getNestedClasses", "nestedClasses$delegate", "objectInstance", "getObjectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance$delegate", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters$delegate", "typeParameterTable", "Lkotlin/reflect/jvm/internal/TypeParameterTable;", "getTypeParameterTable", "()Lkotlin/reflect/jvm/internal/TypeParameterTable;", "typeParameterTable$delegate", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes$delegate", "computeLegacySupertypes", "sealedSubclasses", "getSealedSubclasses", "sealedSubclasses$delegate", "declaredNonStaticMembers", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "getDeclaredNonStaticMembers", "declaredNonStaticMembers$delegate", "declaredStaticMembers", "getDeclaredStaticMembers", "declaredStaticMembers$delegate", "inheritedNonStaticMembers", "getInheritedNonStaticMembers", "inheritedNonStaticMembers$delegate", "inheritedStaticMembers", "getInheritedStaticMembers", "inheritedStaticMembers$delegate", "allNonStaticMembers", "getAllNonStaticMembers", "allNonStaticMembers$delegate", "allStaticMembers", "getAllStaticMembers", "allStaticMembers$delegate", "declaredMembers", "getDeclaredMembers", "declaredMembers$delegate", "allMembers", "getAllMembers", "allMembers$delegate", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Data extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "annotations", "getAnnotations()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "constructors", "getConstructors()Ljava/util/Collection;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "typeParameterTable", "getTypeParameterTable()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "supertypes", "getSupertypes()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KClassImpl.Data.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0))};
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal ArtificialStackFrames;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal CoroutineDebuggingKt;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal accessartificialFrame;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal coroutineCreation;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getHighSpeedVideoFpsRangesFor;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getHighSpeedVideoSizesFor;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getInputFormats;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getInputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getOutputFormats;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getOutputMinFrameDuration;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getOutputMinFrameDurationlomOqCM;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getOutputSizes;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getOutputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getOutputStallDuration;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getOutputStallDurationlomOqCM;
        private final kotlin.Lazy getValidOutputFormatsForInputhNQ4ISI;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal isOutputSupportedFor;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal isOutputSupportedForhNQ4ISI;
        private final kotlin.Lazy toString;
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal unwrapAs;

        public Data() {
            super();
            this.getValidOutputFormatsForInputhNQ4ISI = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this, this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$0
                private final kotlin.reflect.jvm.internal.KClassImpl.Data getHighSpeedVideoFpsRanges;
                private final kotlin.reflect.jvm.internal.KClassImpl getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = r1;
                    this.getHighSpeedVideoFpsRanges = this;
                }
            });
            this.getOutputStallDuration = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$1
                private final kotlin.reflect.jvm.internal.KClassImpl getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.getHighSpeedVideoFpsRanges = r1;
                }
            });
            this.getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$2
                private final kotlin.reflect.jvm.internal.KClassImpl getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getInputFormats(this.getHighSpeedVideoSizes);
                }

                {
                    this.getHighSpeedVideoSizes = r1;
                }
            });
            this.ArtificialStackFrames = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this, this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$3
                private final kotlin.reflect.jvm.internal.KClassImpl Camera2StreamConfigurationMap;
                private final kotlin.reflect.jvm.internal.KClassImpl.Data getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.Camera2StreamConfigurationMap = r1;
                    this.getHighSpeedVideoFpsRanges = this;
                }
            });
            this.unwrapAs = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$4
                private final kotlin.reflect.jvm.internal.KClassImpl getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getOutputFormats(this.getHighResolutionOutputSizeshNQ4ISI);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = r1;
                }
            });
            this.getOutputFormats = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$5
                private final kotlin.reflect.jvm.internal.KClassImpl Camera2StreamConfigurationMap;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighSpeedVideoSizesFor(this.Camera2StreamConfigurationMap);
                }

                {
                    this.Camera2StreamConfigurationMap = r1;
                }
            });
            this.isOutputSupportedForhNQ4ISI = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this, kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$6
                private final kotlin.reflect.jvm.internal.KClassImpl getHighResolutionOutputSizeshNQ4ISI;
                private final kotlin.reflect.jvm.internal.KClassImpl.Data getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
                }

                {
                    this.getHighSpeedVideoSizes = this;
                    this.getHighResolutionOutputSizeshNQ4ISI = r2;
                }
            });
            this.toString = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this, kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$7
                private final kotlin.reflect.jvm.internal.KClassImpl getHighResolutionOutputSizeshNQ4ISI;
                private final kotlin.reflect.jvm.internal.KClassImpl.Data getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                }

                {
                    this.getHighSpeedVideoFpsRanges = this;
                    this.getHighResolutionOutputSizeshNQ4ISI = r2;
                }
            });
            this.accessartificialFrame = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this, kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$8
                private final kotlin.reflect.jvm.internal.KClassImpl getHighSpeedVideoFpsRanges;
                private final kotlin.reflect.jvm.internal.KClassImpl.Data getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.getHighSpeedVideoSizes = this;
                    this.getHighSpeedVideoFpsRanges = r2;
                }
            });
            this.CoroutineDebuggingKt = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this, kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$9
                private final kotlin.reflect.jvm.internal.KClassImpl.Data Camera2StreamConfigurationMap;
                private final kotlin.reflect.jvm.internal.KClassImpl getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
                }

                {
                    this.Camera2StreamConfigurationMap = this;
                    this.getHighSpeedVideoSizes = r2;
                }
            });
            this.coroutineCreation = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this, this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$10
                private final kotlin.reflect.jvm.internal.KClassImpl.Data Camera2StreamConfigurationMap;
                private final kotlin.reflect.jvm.internal.KClassImpl getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = r1;
                    this.Camera2StreamConfigurationMap = this;
                }
            });
            this.isOutputSupportedFor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this, this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$11
                private final kotlin.reflect.jvm.internal.KClassImpl Camera2StreamConfigurationMap;
                private final kotlin.reflect.jvm.internal.KClassImpl.Data getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
                }

                {
                    this.Camera2StreamConfigurationMap = r1;
                    this.getHighSpeedVideoFpsRangesFor = this;
                }
            });
            this.getOutputSizes = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$12
                private final kotlin.reflect.jvm.internal.KClassImpl getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.Collection access$getMembers;
                    access$getMembers = kotlin.reflect.jvm.internal.KClassImpl.access$getMembers(r0, this.getHighSpeedVideoSizes.getMemberScope$kotlin_reflection(), kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess.getHighSpeedVideoFpsRanges);
                    return access$getMembers;
                }

                {
                    this.getHighSpeedVideoSizes = r1;
                }
            });
            this.getOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$13
                private final kotlin.reflect.jvm.internal.KClassImpl getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.Collection access$getMembers;
                    access$getMembers = kotlin.reflect.jvm.internal.KClassImpl.access$getMembers(r0, this.getHighSpeedVideoFpsRanges.getStaticScope$kotlin_reflection(), kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess.getHighSpeedVideoFpsRanges);
                    return access$getMembers;
                }

                {
                    this.getHighSpeedVideoFpsRanges = r1;
                }
            });
            this.getOutputMinFrameDurationlomOqCM = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$14
                private final kotlin.reflect.jvm.internal.KClassImpl getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.Collection access$getMembers;
                    access$getMembers = kotlin.reflect.jvm.internal.KClassImpl.access$getMembers(r0, this.getHighSpeedVideoSizes.getMemberScope$kotlin_reflection(), kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess.getHighSpeedVideoFpsRangesFor);
                    return access$getMembers;
                }

                {
                    this.getHighSpeedVideoSizes = r1;
                }
            });
            this.getOutputStallDurationlomOqCM = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$15
                private final kotlin.reflect.jvm.internal.KClassImpl Camera2StreamConfigurationMap;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.Collection access$getMembers;
                    access$getMembers = kotlin.reflect.jvm.internal.KClassImpl.access$getMembers(r0, this.Camera2StreamConfigurationMap.getStaticScope$kotlin_reflection(), kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess.getHighSpeedVideoFpsRangesFor);
                    return access$getMembers;
                }

                {
                    this.Camera2StreamConfigurationMap = r1;
                }
            });
            this.getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$16
                private final kotlin.reflect.jvm.internal.KClassImpl.Data getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes);
                }

                {
                    this.getHighSpeedVideoSizes = this;
                }
            });
            this.getOutputMinFrameDuration = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$17
                private final kotlin.reflect.jvm.internal.KClassImpl.Data getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = this;
                }
            });
            this.getInputFormats = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$18
                private final kotlin.reflect.jvm.internal.KClassImpl.Data getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.Data.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.getHighSpeedVideoFpsRanges = this;
                }
            });
            this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$19
                private final kotlin.reflect.jvm.internal.KClassImpl.Data getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.List plus;
                    plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) r0.getAllNonStaticMembers(), (java.lang.Iterable) this.getHighSpeedVideoFpsRangesFor.getAllStaticMembers());
                    return plus;
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = this;
                }
            });
        }

        public final kotlin.reflect.jvm.internal.impl.km.KmClass getKmClass() {
            return (kotlin.reflect.jvm.internal.impl.km.KmClass) this.getValidOutputFormatsForInputhNQ4ISI.getValue();
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getDescriptor() {
            T value = this.getOutputStallDuration.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) value;
        }

        public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            T value = this.getInputSizeshNQ4ISI.getValue(this, getHighResolutionOutputSizeshNQ4ISI[1]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.List) value;
        }

        public final java.lang.String getSimpleName() {
            return (java.lang.String) this.ArtificialStackFrames.getValue(this, getHighResolutionOutputSizeshNQ4ISI[2]);
        }

        public final java.lang.String getQualifiedName() {
            return (java.lang.String) this.unwrapAs.getValue(this, getHighResolutionOutputSizeshNQ4ISI[3]);
        }

        public final java.util.Collection<kotlin.reflect.KFunction<T>> getConstructors() {
            T value = this.getOutputFormats.getValue(this, getHighResolutionOutputSizeshNQ4ISI[4]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.Collection) value;
        }

        public final java.util.Collection<kotlin.reflect.KClass<?>> getNestedClasses() {
            T value = this.isOutputSupportedForhNQ4ISI.getValue(this, getHighResolutionOutputSizeshNQ4ISI[5]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.Collection) value;
        }

        public final T getObjectInstance() {
            return (T) this.toString.getValue();
        }

        public final java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
            T value = this.accessartificialFrame.getValue(this, getHighResolutionOutputSizeshNQ4ISI[6]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.List) value;
        }

        public final java.util.List<kotlin.reflect.KType> getSupertypes() {
            T value = this.coroutineCreation.getValue(this, getHighResolutionOutputSizeshNQ4ISI[8]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.List) value;
        }

        public final java.util.List<kotlin.reflect.KClass<? extends T>> getSealedSubclasses() {
            T value = this.isOutputSupportedFor.getValue(this, getHighResolutionOutputSizeshNQ4ISI[9]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.List) value;
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> getDeclaredNonStaticMembers() {
            T value = this.getOutputSizes.getValue(this, getHighResolutionOutputSizeshNQ4ISI[10]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.Collection) value;
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> getAllNonStaticMembers() {
            T value = this.getHighSpeedVideoSizesFor.getValue(this, getHighResolutionOutputSizeshNQ4ISI[14]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.Collection) value;
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> getAllStaticMembers() {
            T value = this.getOutputMinFrameDuration.getValue(this, getHighResolutionOutputSizeshNQ4ISI[15]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.Collection) value;
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> getDeclaredMembers() {
            T value = this.getInputFormats.getValue(this, getHighResolutionOutputSizeshNQ4ISI[16]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.Collection) value;
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> getAllMembers() {
            T value = this.getHighSpeedVideoFpsRangesFor.getValue(this, getHighResolutionOutputSizeshNQ4ISI[17]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (java.util.Collection) value;
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmClass getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.KClassImpl kClassImpl, kotlin.reflect.jvm.internal.KClassImpl.Data data) {
            if (kotlin.reflect.jvm.internal.SystemPropertiesKt.getLoadMetadataDirectly()) {
                kotlin.Metadata metadata = (kotlin.Metadata) kClassImpl.getJClass().getAnnotation(kotlin.Metadata.class);
                if (metadata != null) {
                    kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata readLenient = kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.Companion.readLenient(metadata);
                    kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.Class r8 = readLenient instanceof kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.Class ? (kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.Class) readLenient : null;
                    if (r8 != null) {
                        return r8.getKmClass();
                    }
                }
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor = data.getDescriptor();
            if (descriptor instanceof kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor) {
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor functionClassDescriptor = (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor) descriptor;
                if (!(functionClassDescriptor.getFunctionTypeKind() instanceof kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported function type kind: ");
                    sb.append(functionClassDescriptor.getFunctionTypeKind());
                    sb.append(" (");
                    sb.append(descriptor);
                    sb.append(')');
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
                }
                return kotlin.reflect.jvm.internal.BuiltinsKt.createFunctionKmClass(functionClassDescriptor.getArity());
            }
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = descriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) descriptor : null;
            if (deserializedClassDescriptor != null) {
                return kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.toKmClass$default(deserializedClassDescriptor.getClassProto(), deserializedClassDescriptor.getC().getNameResolver(), false, null, 6, null);
            }
            return null;
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies;
            kotlin.reflect.jvm.internal.impl.name.ClassId access$getClassId = kotlin.reflect.jvm.internal.KClassImpl.access$getClassId(kClassImpl);
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData moduleData = kClassImpl.getData().getValue().getModuleData();
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module = moduleData.getModule();
            if (access$getClassId.isLocal() && kClassImpl.getJClass().isAnnotationPresent(kotlin.Metadata.class)) {
                findClassAcrossModuleDependencies = moduleData.getDeserialization().deserializeClass(access$getClassId);
            } else {
                findClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(module, access$getClassId);
            }
            return findClassAcrossModuleDependencies == null ? kotlin.reflect.jvm.internal.KClassImpl.access$createSyntheticClassOrFail(kClassImpl, access$getClassId, moduleData) : findClassAcrossModuleDependencies;
        }

        static /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor(final kotlin.reflect.jvm.internal.KClassImpl kClassImpl, kotlin.reflect.jvm.internal.KClassImpl.Data data) {
            java.lang.String qualifiedName;
            java.lang.String name2;
            final kotlin.reflect.jvm.internal.impl.name.ClassId classId;
            if (kotlin.jvm.internal.Intrinsics.areEqual(kClassImpl.getJClass(), java.lang.Object.class)) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            if (!kotlin.reflect.jvm.internal.SystemPropertiesKt.getUseK1Implementation()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = data.getKmClass();
                java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> supertypes = kmClass != null ? kmClass.getSupertypes() : null;
                if (supertypes == null) {
                    java.lang.reflect.Type genericSuperclass = kClassImpl.getJClass().getGenericSuperclass();
                    if (genericSuperclass != null) {
                        java.lang.reflect.Type type = kotlin.jvm.internal.Intrinsics.areEqual(genericSuperclass, java.lang.Object.class) ? null : genericSuperclass;
                        if (type != null) {
                            arrayList.add(kotlin.reflect.jvm.internal.ConvertFromJavaKt.toKType$default(type, kotlin.collections.MapsKt.emptyMap(), kotlin.reflect.jvm.internal.TypeNullability.NOT_NULL, false, 4, null));
                        }
                    }
                    java.lang.reflect.Type[] genericInterfaces = kClassImpl.getJClass().getGenericInterfaces();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericInterfaces, "");
                    java.util.ArrayList arrayList2 = arrayList;
                    for (java.lang.reflect.Type type2 : genericInterfaces) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(type2);
                        arrayList2.add(kotlin.reflect.jvm.internal.ConvertFromJavaKt.toKType$default(type2, kotlin.collections.MapsKt.emptyMap(), kotlin.reflect.jvm.internal.TypeNullability.NOT_NULL, false, 4, null));
                    }
                } else {
                    java.util.ArrayList arrayList3 = arrayList;
                    for (kotlin.reflect.jvm.internal.impl.km.KmType kmType : supertypes) {
                        kotlin.reflect.jvm.internal.impl.km.KmClassifier classifier = kmType.getClassifier();
                        kotlin.reflect.jvm.internal.impl.km.KmClassifier.Class r8 = classifier instanceof kotlin.reflect.jvm.internal.impl.km.KmClassifier.Class ? (kotlin.reflect.jvm.internal.impl.km.KmClassifier.Class) classifier : null;
                        if (r8 == null || (name2 = r8.getName()) == null || (classId = kotlin.reflect.jvm.internal.ConvertFromMetadataKt.toClassId(name2)) == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Supertype of ");
                            sb.append(kClassImpl);
                            sb.append(" not a class: ");
                            sb.append(kmType.getClassifier());
                            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
                        }
                        final java.lang.Class loadClass$default = kotlin.reflect.jvm.internal.UtilKt.loadClass$default(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(kClassImpl.getJClass()), classId, 0, 2, null);
                        if (loadClass$default == null) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported superclass of ");
                            sb2.append(kClassImpl);
                            sb2.append(": ");
                            sb2.append(classId);
                            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb2.toString());
                        }
                        java.lang.ClassLoader safeClassLoader = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(kClassImpl.getJClass());
                        T value = data.CoroutineDebuggingKt.getValue(data, getHighResolutionOutputSizeshNQ4ISI[7]);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
                        arrayList3.add(kotlin.reflect.jvm.internal.ConvertFromMetadataKt.toKType(kmType, safeClassLoader, (kotlin.reflect.jvm.internal.TypeParameterTable) value, new kotlin.jvm.functions.Function0(kClassImpl, loadClass$default, classId) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$21
                            private final java.lang.Class getHighResolutionOutputSizeshNQ4ISI;
                            private final kotlin.reflect.jvm.internal.KClassImpl getHighSpeedVideoFpsRanges;
                            private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoSizes;

                            @Override // kotlin.jvm.functions.Function0
                            public java.lang.Object invoke() {
                                return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
                            }

                            {
                                this.getHighSpeedVideoFpsRanges = kClassImpl;
                                this.getHighResolutionOutputSizeshNQ4ISI = loadClass$default;
                                this.getHighSpeedVideoSizes = classId;
                            }
                        }));
                    }
                    if (kClassImpl.getJClass().isArray()) {
                        arrayList3.add(kotlin.reflect.jvm.internal.StandardKTypes.INSTANCE.getCLONEABLE());
                    }
                    if (java.io.Serializable.class.isAssignableFrom(kClassImpl.getJClass()) && !arrayList.contains(kotlin.reflect.jvm.internal.StandardKTypes.INSTANCE.getSERIALIZABLE()) && (qualifiedName = data.getQualifiedName()) != null && kotlin.text.StringsKt.startsWith$default(qualifiedName, "kotlin.", false, 2, (java.lang.Object) null)) {
                        arrayList3.add(kotlin.reflect.jvm.internal.StandardKTypes.INSTANCE.getSERIALIZABLE());
                    }
                }
                java.util.ArrayList arrayList4 = arrayList;
                if (!arrayList4.isEmpty()) {
                    java.util.Iterator<T> it = arrayList4.iterator();
                    while (it.hasNext()) {
                        kotlin.reflect.KClassifier classifier2 = ((kotlin.reflect.KType) it.next()).getClassifier();
                        kotlin.reflect.jvm.internal.KClassImpl kClassImpl2 = classifier2 instanceof kotlin.reflect.jvm.internal.KClassImpl ? (kotlin.reflect.jvm.internal.KClassImpl) classifier2 : null;
                        if (kClassImpl2 == null || (kClassImpl2.getClassKind$kotlin_reflection() != kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE && kClassImpl2.getClassKind$kotlin_reflection() != kotlin.reflect.jvm.internal.impl.km.ClassKind.ANNOTATION_CLASS)) {
                            break;
                        }
                    }
                }
                arrayList.add(kotlin.reflect.jvm.internal.StandardKTypes.INSTANCE.getANY());
                return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
            }
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes2 = data.getDescriptor().getTypeConstructor().getSupertypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes2, "");
            java.util.ArrayList arrayList5 = new java.util.ArrayList(supertypes2.size());
            java.util.ArrayList arrayList6 = arrayList5;
            final kotlin.reflect.jvm.internal.KClassImpl<T> kClassImpl3 = kotlin.reflect.jvm.internal.KClassImpl.this;
            for (final kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : supertypes2) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType);
                arrayList6.add(new kotlin.reflect.jvm.internal.types.DescriptorKType(kotlinType, new kotlin.jvm.functions.Function0(kotlinType, kClassImpl3) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$20
                    private final kotlin.reflect.jvm.internal.KClassImpl getHighResolutionOutputSizeshNQ4ISI;
                    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoSizes;

                    @Override // kotlin.jvm.functions.Function0
                    public java.lang.Object invoke() {
                        return kotlin.reflect.jvm.internal.KClassImpl.Data.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
                    }

                    {
                        this.getHighSpeedVideoSizes = kotlinType;
                        this.getHighResolutionOutputSizeshNQ4ISI = kClassImpl3;
                    }
                }));
            }
            if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isSpecialClassWithNoSupertypes(data.getDescriptor())) {
                java.util.ArrayList arrayList7 = arrayList5;
                if (!arrayList7.isEmpty()) {
                    java.util.Iterator<T> it2 = arrayList7.iterator();
                    while (it2.hasNext()) {
                        kotlin.reflect.KClassifier classifier3 = ((kotlin.reflect.KType) it2.next()).getClassifier();
                        kotlin.reflect.jvm.internal.KClassImpl kClassImpl4 = classifier3 instanceof kotlin.reflect.jvm.internal.KClassImpl ? (kotlin.reflect.jvm.internal.KClassImpl) classifier3 : null;
                        if (kClassImpl4 == null || (kClassImpl4.getClassKind$kotlin_reflection() != kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE && kClassImpl4.getClassKind$kotlin_reflection() != kotlin.reflect.jvm.internal.impl.km.ClassKind.ANNOTATION_CLASS)) {
                            break;
                        }
                    }
                }
                arrayList6.add(kotlin.reflect.jvm.internal.StandardKTypes.INSTANCE.getANY());
            }
            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        
            if (r4 == null) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static /* synthetic */ java.util.List Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.KClassImpl kClassImpl, kotlin.reflect.jvm.internal.KClassImpl.Data data) {
            java.util.ArrayList emptyList;
            java.lang.ClassLoader safeClassLoader = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(kClassImpl.getJClass());
            kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = data.getKmClass();
            if (kmClass != null) {
                java.util.List<java.lang.String> sealedSubclasses = kmClass.getSealedSubclasses();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = sealedSubclasses.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.KClass<?> loadKClass = kotlin.reflect.jvm.internal.ConvertFromMetadataKt.loadKClass(safeClassLoader, (java.lang.String) it.next());
                    if (loadKClass != null) {
                        arrayList.add(loadKClass);
                    }
                }
                emptyList = arrayList;
            } else {
                if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.INSTANCE.loadIsSealed(kClassImpl.getJClass()), java.lang.Boolean.TRUE)) {
                    java.lang.Class<?>[] loadGetPermittedSubclasses = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.INSTANCE.loadGetPermittedSubclasses(kClassImpl.getJClass());
                    if (loadGetPermittedSubclasses != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(loadGetPermittedSubclasses.length);
                        for (java.lang.Class<?> cls : loadGetPermittedSubclasses) {
                            arrayList2.add(kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls));
                        }
                        emptyList = arrayList2;
                    } else {
                        emptyList = null;
                    }
                }
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(emptyList, "");
            return emptyList;
        }

        static /* synthetic */ java.util.List getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.KClassImpl.Data data) {
            java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> declaredNonStaticMembers = data.getDeclaredNonStaticMembers();
            T value = data.getOutputMinFrameDurationlomOqCM.getValue(data, getHighResolutionOutputSizeshNQ4ISI[12]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return kotlin.collections.CollectionsKt.plus((java.util.Collection) declaredNonStaticMembers, (java.lang.Iterable) value);
        }

        static /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.KClassImpl.Data data) {
            kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal lazySoftVal = data.getOutputSizeshNQ4ISI;
            kotlin.reflect.KProperty<java.lang.Object>[] kPropertyArr = getHighResolutionOutputSizeshNQ4ISI;
            T value = lazySoftVal.getValue(data, kPropertyArr[11]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            T value2 = data.getOutputStallDurationlomOqCM.getValue(data, kPropertyArr[13]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "");
            return kotlin.collections.CollectionsKt.plus((java.util.Collection) value, (java.lang.Iterable) value2);
        }

        static /* synthetic */ java.util.List Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.KClassImpl.Data data) {
            java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> declaredNonStaticMembers = data.getDeclaredNonStaticMembers();
            T value = data.getOutputSizeshNQ4ISI.getValue(data, getHighResolutionOutputSizeshNQ4ISI[11]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return kotlin.collections.CollectionsKt.plus((java.util.Collection) declaredNonStaticMembers, (java.lang.Iterable) value);
        }

        static /* synthetic */ java.util.List getInputFormats(kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
            java.lang.annotation.Annotation[] annotations = kClassImpl.getJClass().getAnnotations();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotations, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.annotation.Annotation annotation : annotations) {
                if (!kotlin.reflect.jvm.internal.KClassImpl.getHighSpeedVideoSizes.contains(kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation)).getName())) {
                    arrayList.add(annotation);
                }
            }
            return kotlin.reflect.jvm.internal.UtilKt.unwrapRepeatableAnnotations(arrayList);
        }

        static /* synthetic */ java.lang.reflect.Type getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
            if (!(mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Supertype not a class: ".concat(java.lang.String.valueOf(mo23898getDeclarationDescriptor)));
            }
            java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor);
            if (javaClass == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported superclass of ");
                sb.append(kClassImpl);
                sb.append(": ");
                sb.append(mo23898getDeclarationDescriptor);
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(kClassImpl.getJClass().getSuperclass(), javaClass)) {
                java.lang.reflect.Type genericSuperclass = kClassImpl.getJClass().getGenericSuperclass();
                kotlin.jvm.internal.Intrinsics.checkNotNull(genericSuperclass);
                return genericSuperclass;
            }
            java.lang.Class<?>[] interfaces = kClassImpl.getJClass().getInterfaces();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interfaces, "");
            int indexOf = kotlin.collections.ArraysKt.indexOf(interfaces, javaClass);
            if (indexOf < 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No superclass of ");
                sb2.append(kClassImpl);
                sb2.append(" in Java reflection for ");
                sb2.append(mo23898getDeclarationDescriptor);
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb2.toString());
            }
            java.lang.reflect.Type type = kClassImpl.getJClass().getGenericInterfaces()[indexOf];
            kotlin.jvm.internal.Intrinsics.checkNotNull(type);
            return type;
        }

        static /* synthetic */ java.lang.reflect.Type getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.KClassImpl kClassImpl, java.lang.Class cls, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(kClassImpl.getJClass().getSuperclass(), cls)) {
                java.lang.reflect.Type genericSuperclass = kClassImpl.getJClass().getGenericSuperclass();
                kotlin.jvm.internal.Intrinsics.checkNotNull(genericSuperclass);
                return genericSuperclass;
            }
            java.lang.Class<?>[] interfaces = kClassImpl.getJClass().getInterfaces();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interfaces, "");
            int indexOf = kotlin.collections.ArraysKt.indexOf(interfaces, cls);
            if (indexOf < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No superclass of ");
                sb.append(kClassImpl);
                sb.append(" in Java reflection for ");
                sb.append(classId);
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
            }
            java.lang.reflect.Type type = kClassImpl.getJClass().getGenericInterfaces()[indexOf];
            kotlin.jvm.internal.Intrinsics.checkNotNull(type);
            return type;
        }

        static /* synthetic */ java.lang.String getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.KClassImpl kClassImpl, kotlin.reflect.jvm.internal.KClassImpl.Data data) {
            if (kClassImpl.getJClass().isAnonymousClass()) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.ClassId access$getClassId = kotlin.reflect.jvm.internal.KClassImpl.access$getClassId(kClassImpl);
            if (!access$getClassId.isLocal()) {
                java.lang.String asString = access$getClassId.getShortClassName().asString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                return asString;
            }
            java.lang.Class<T> jClass = kClassImpl.getJClass();
            java.lang.String simpleName = jClass.getSimpleName();
            java.lang.reflect.Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(enclosingMethod.getName());
                sb.append(kotlin.text.Typography.dollar);
                return kotlin.text.StringsKt.substringAfter$default(simpleName, sb.toString(), (java.lang.String) null, 2, (java.lang.Object) null);
            }
            java.lang.reflect.Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(enclosingConstructor.getName());
                sb2.append(kotlin.text.Typography.dollar);
                return kotlin.text.StringsKt.substringAfter$default(simpleName, sb2.toString(), (java.lang.String) null, 2, (java.lang.Object) null);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
            return kotlin.text.StringsKt.substringAfter$default(simpleName, kotlin.text.Typography.dollar, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        static /* synthetic */ java.lang.String getOutputFormats(kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
            if (kClassImpl.getJClass().isAnonymousClass()) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.ClassId access$getClassId = kotlin.reflect.jvm.internal.KClassImpl.access$getClassId(kClassImpl);
            if (access$getClassId.isLocal()) {
                return null;
            }
            return access$getClassId.asSingleFqName().asString();
        }

        static /* synthetic */ java.util.List getHighSpeedVideoSizesFor(kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
            java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor> constructorDescriptors = kClassImpl.getConstructorDescriptors();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(constructorDescriptors, 10));
            java.util.Iterator<T> it = constructorDescriptors.iterator();
            while (it.hasNext()) {
                arrayList.add(new kotlin.reflect.jvm.internal.DescriptorKFunction(kClassImpl, (kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) it.next()));
            }
            return arrayList;
        }

        static /* synthetic */ java.util.List getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.KClassImpl.Data data, kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
            kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = data.getKmClass();
            if (kmClass != null) {
                kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.ConvertFromMetadataKt.toClassId(kmClass.getName());
                java.lang.ClassLoader safeClassLoader = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(kClassImpl.getJClass());
                java.util.List<java.lang.String> nestedClasses = kmClass.getNestedClasses();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = nestedClasses.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier((java.lang.String) it.next());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
                    java.lang.Class loadClass$default = kotlin.reflect.jvm.internal.UtilKt.loadClass$default(safeClassLoader, classId.createNestedClassId(identifier), 0, 2, null);
                    kotlin.reflect.KClass kotlinClass = loadClass$default != null ? kotlin.jvm.JvmClassMappingKt.getKotlinClass(loadClass$default) : null;
                    if (kotlinClass != null) {
                        arrayList.add(kotlinClass);
                    }
                }
                return arrayList;
            }
            java.lang.Class<?>[] declaredClasses = kClassImpl.getJClass().getDeclaredClasses();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredClasses, "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Class<?> cls : declaredClasses) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
                kotlin.reflect.KClass kotlinClass2 = kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls);
                if (kotlinClass2 != null) {
                    arrayList2.add(kotlinClass2);
                }
            }
            return arrayList2;
        }

        static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.KClassImpl.Data data, kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
            java.lang.reflect.Field declaredField;
            kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = data.getKmClass();
            if (kmClass == null || !(kotlin.reflect.jvm.internal.impl.km.Attributes.getKind(kmClass) == kotlin.reflect.jvm.internal.impl.km.ClassKind.OBJECT || kotlin.reflect.jvm.internal.impl.km.Attributes.getKind(kmClass) == kotlin.reflect.jvm.internal.impl.km.ClassKind.COMPANION_OBJECT)) {
                return null;
            }
            if (kotlin.reflect.jvm.internal.impl.km.Attributes.getKind(kmClass) == kotlin.reflect.jvm.internal.impl.km.ClassKind.COMPANION_OBJECT && !kotlin.collections.CollectionsKt.contains(kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping.INSTANCE.getClassIds(), kotlin.reflect.jvm.internal.ConvertFromMetadataKt.toClassId(kmClass.getName()).getOuterClassId())) {
                declaredField = kClassImpl.getJClass().getEnclosingClass().getDeclaredField(kotlin.reflect.jvm.internal.ConvertFromMetadataKt.toNonLocalSimpleName(kmClass.getName()));
            } else {
                declaredField = kClassImpl.getJClass().getDeclaredField("INSTANCE");
            }
            java.lang.Object obj = declaredField.get(null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return obj;
        }

        static /* synthetic */ java.util.List Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.KClassImpl.Data data, kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
            if (kotlin.reflect.jvm.internal.SystemPropertiesKt.getUseK1Implementation()) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = data.getDescriptor().getDeclaredTypeParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = declaredTypeParameters;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor);
                    arrayList.add(new kotlin.reflect.jvm.internal.KTypeParameterImpl(kClassImpl, typeParameterDescriptor));
                }
                return arrayList;
            }
            if (data.getKmClass() == null) {
                java.lang.reflect.TypeVariable<java.lang.Class<T>>[] typeParameters = kClassImpl.getJClass().getTypeParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
                return kotlin.reflect.jvm.internal.ConvertFromJavaKt.toKTypeParameters(typeParameters);
            }
            T value = data.CoroutineDebuggingKt.getValue(data, getHighResolutionOutputSizeshNQ4ISI[7]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return ((kotlin.reflect.jvm.internal.TypeParameterTable) value).getOwnTypeParameters();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static /* synthetic */ kotlin.reflect.jvm.internal.TypeParameterTable getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.KClassImpl.Data data, kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
            kotlin.reflect.KClass kClass;
            kotlin.reflect.jvm.internal.KClassImpl kClassImpl2;
            kotlin.Lazy<kotlin.reflect.jvm.internal.KClassImpl<T>.Data> data2;
            kotlin.reflect.jvm.internal.KClassImpl<T>.Data value;
            if (data.getKmClass() == null) {
                return kotlin.reflect.jvm.internal.TypeParameterTable.EMPTY;
            }
            kotlin.reflect.jvm.internal.TypeParameterTable.Companion companion = kotlin.reflect.jvm.internal.TypeParameterTable.INSTANCE;
            kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = data.getKmClass();
            kotlin.jvm.internal.Intrinsics.checkNotNull(kmClass);
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> typeParameters = kmClass.getTypeParameters();
            java.lang.Class<?> enclosingClass = kClassImpl.getJClass().getEnclosingClass();
            kotlin.reflect.jvm.internal.TypeParameterTable typeParameterTable = null;
            if (enclosingClass != null) {
                kotlin.reflect.jvm.internal.impl.km.KmClass kmClass2 = data.getKmClass();
                kotlin.jvm.internal.Intrinsics.checkNotNull(kmClass2);
                if (!kotlin.reflect.jvm.internal.impl.km.Attributes.isInner(kmClass2)) {
                    enclosingClass = null;
                }
                if (enclosingClass != null) {
                    kClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(enclosingClass);
                    kClassImpl2 = !(kClass instanceof kotlin.reflect.jvm.internal.KClassImpl) ? (kotlin.reflect.jvm.internal.KClassImpl) kClass : null;
                    if (kClassImpl2 != null && (data2 = kClassImpl2.getData()) != null && (value = data2.getValue()) != null) {
                        T value2 = ((kotlin.reflect.jvm.internal.KClassImpl.Data) value).CoroutineDebuggingKt.getValue(value, getHighResolutionOutputSizeshNQ4ISI[7]);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "");
                        typeParameterTable = (kotlin.reflect.jvm.internal.TypeParameterTable) value2;
                    }
                    return companion.create(typeParameters, typeParameterTable, kClassImpl, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(kClassImpl.getJClass()));
                }
            }
            kClass = null;
            if (!(kClass instanceof kotlin.reflect.jvm.internal.KClassImpl)) {
            }
            if (kClassImpl2 != null) {
                T value22 = ((kotlin.reflect.jvm.internal.KClassImpl.Data) value).CoroutineDebuggingKt.getValue(value, getHighResolutionOutputSizeshNQ4ISI[7]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value22, "");
                typeParameterTable = (kotlin.reflect.jvm.internal.TypeParameterTable) value22;
            }
            return companion.create(typeParameters, typeParameterTable, kClassImpl, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(kClassImpl.getJClass()));
        }
    }

    public final kotlin.Lazy<kotlin.reflect.jvm.internal.KClassImpl<T>.Data> getData() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getDescriptor() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getDescriptor();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getAnnotations();
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope$kotlin_reflection() {
        return getDescriptor().getDefaultType().getMemberScope();
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope$kotlin_reflection() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope staticScope = getDescriptor().getStaticScope();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(staticScope, "");
        return staticScope;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    public final java.util.Collection<kotlin.reflect.KCallable<?>> getMembers() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getAllMembers();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    static final class MemberBelonginess {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess getHighSpeedVideoFpsRanges;
        public static final kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess[] getHighSpeedVideoSizes;

        private MemberBelonginess(java.lang.String str, int i) {
        }

        static {
            kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess memberBelonginess = new kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess("DECLARED", 0);
            getHighSpeedVideoFpsRanges = memberBelonginess;
            kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess memberBelonginess2 = new kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess("INHERITED", 1);
            getHighSpeedVideoFpsRangesFor = memberBelonginess2;
            kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess[] memberBelonginessArr = {memberBelonginess, memberBelonginess2};
            getHighSpeedVideoSizes = memberBelonginessArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(memberBelonginessArr);
        }

        public static kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess[] values() {
            return (kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess[]) getHighSpeedVideoSizes.clone();
        }

        public static kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess.class, str);
        }
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor> getConstructorDescriptors() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor = getDescriptor();
        if (descriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || descriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = descriptor.getConstructors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructors, "");
        return constructors;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getProperties(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) getMemberScope$kotlin_reflection().getContributedVariables(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION), (java.lang.Iterable) getStaticScope$kotlin_reflection().getContributedVariables(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) getMemberScope$kotlin_reflection().getContributedFunctions(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION), (java.lang.Iterable) getStaticScope$kotlin_reflection().getContributedFunctions(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getLocalProperty(int index) {
        java.lang.Class<?> declaringClass;
        kotlin.reflect.jvm.internal.KClassImpl<T> kClassImpl = this;
        while (kotlin.jvm.internal.Intrinsics.areEqual(kClassImpl.getJClass().getSimpleName(), "DefaultImpls") && (declaringClass = kClassImpl.getJClass().getDeclaringClass()) != null && declaringClass.isInterface()) {
            kotlin.reflect.KClass kotlinClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(declaringClass);
            kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinClass, "");
            kClassImpl = (kotlin.reflect.jvm.internal.KClassImpl) kotlinClass;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor = kClassImpl.getDescriptor();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = descriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) descriptor : null;
        if (deserializedClassDescriptor != null) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classProto = deserializedClassDescriptor.getClassProto();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property>> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.classLocalVariable;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(classProto, generatedExtension, index);
            if (property != null) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) kotlin.reflect.jvm.internal.UtilKt.deserializeToDescriptor(kClassImpl.getJClass(), property, deserializedClassDescriptor.getC().getNameResolver(), deserializedClassDescriptor.getC().getTypeTable(), deserializedClassDescriptor.getMetadataVersion(), new kotlin.jvm.functions.Function2() { // from class: kotlin.reflect.jvm.internal.KClassImpl$$Lambda$1
                    @Override // kotlin.jvm.functions.Function2
                    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return kotlin.reflect.jvm.internal.KClassImpl.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer) obj, (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) obj2);
                    }
                });
            }
        }
        return null;
    }

    @Override // kotlin.reflect.KClass
    public final java.lang.String getSimpleName() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getSimpleName();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: getQualifiedName */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getQualifiedName();
    }

    @Override // kotlin.reflect.KClass
    public final java.util.Collection<kotlin.reflect.KFunction<T>> getConstructors() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getConstructors();
    }

    @Override // kotlin.reflect.KClass
    public final java.util.Collection<kotlin.reflect.KClass<?>> getNestedClasses() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getNestedClasses();
    }

    @Override // kotlin.reflect.KClass
    public final T getObjectInstance() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getObjectInstance();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(java.lang.Object value) {
        java.lang.Integer functionClassArity = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getFunctionClassArity(getJClass());
        if (functionClassArity != null) {
            return kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(value, functionClassArity.intValue());
        }
        java.lang.Class wrapperByPrimitive = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        if (wrapperByPrimitive == null) {
            wrapperByPrimitive = getJClass();
        }
        return wrapperByPrimitive.isInstance(value);
    }

    @Override // kotlin.reflect.KClass
    public final java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getTypeParameters();
    }

    @Override // kotlin.reflect.KClass
    public final java.util.List<kotlin.reflect.KType> getSupertypes() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getSupertypes();
    }

    @Override // kotlin.reflect.KClass
    public final java.util.List<kotlin.reflect.KClass<? extends T>> getSealedSubclasses() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getSealedSubclasses();
    }

    @Override // kotlin.reflect.KClass
    public final kotlin.reflect.KVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = getDescriptor().getVisibility();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visibility, "");
        return kotlin.reflect.jvm.internal.UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFinal() {
        return getHighSpeedVideoFpsRangesFor() == kotlin.reflect.jvm.internal.impl.km.Modality.FINAL;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isOpen() {
        return getHighSpeedVideoFpsRangesFor() == kotlin.reflect.jvm.internal.impl.km.Modality.OPEN;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isAbstract() {
        return getHighSpeedVideoFpsRangesFor() == kotlin.reflect.jvm.internal.impl.km.Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isSealed() {
        return getHighSpeedVideoFpsRangesFor() == kotlin.reflect.jvm.internal.impl.km.Modality.SEALED;
    }

    @Override // kotlin.reflect.KClass
    public final boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.KClassImpl) && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.jvm.JvmClassMappingKt.getJavaObjectType(this), kotlin.jvm.JvmClassMappingKt.getJavaObjectType((kotlin.reflect.KClass) other));
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return kotlin.jvm.JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("class ");
        kotlin.reflect.jvm.internal.impl.name.ClassId mapJvmClassToKotlinClassId = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(getJClass());
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = mapJvmClassToKotlinClassId.getPackageFqName();
        if (packageFqName.isRoot()) {
            obj = "";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(packageFqName.asString());
            sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            obj = sb2.toString();
        }
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(mapJvmClassToKotlinClassId.getRelativeClassName().asString(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlin.text.Typography.dollar, false, 4, (java.lang.Object) null);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj);
        sb3.append(replace$default);
        sb.append(sb3.toString());
        return sb.toString();
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData runtimeModuleData) {
        final kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl classDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl(new kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor(runtimeModuleData.getModule(), classId.getPackageFqName()), classId.getShortClassName(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS, kotlin.collections.CollectionsKt.listOf(runtimeModuleData.getModule().getBuiltIns().getAny().getDefaultType()), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false, runtimeModuleData.getDeserialization().getStorageManager());
        final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = runtimeModuleData.getDeserialization().getStorageManager();
        classDescriptorImpl.initialize(new kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope(classDescriptorImpl, storageManager) { // from class: kotlin.reflect.jvm.internal.KClassImpl$createSyntheticClass$1$1
            {
                super(storageManager, classDescriptorImpl);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
            public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> computeDeclaredFunctions() {
                return kotlin.collections.CollectionsKt.emptyList();
            }
        }, kotlin.collections.SetsKt.emptySet(), null);
        return classDescriptorImpl;
    }

    static {
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> special_annotations = kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<T> it = special_annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(((kotlin.reflect.jvm.internal.impl.name.ClassId) it.next()).asSingleFqName().toString());
        }
        getHighSpeedVideoSizes = hashSet;
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor access$createSyntheticClassOrFail(kotlin.reflect.jvm.internal.KClassImpl kClassImpl, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData runtimeModuleData) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader classHeader;
        if (kClassImpl.getJClass().isSynthetic()) {
            return getHighResolutionOutputSizeshNQ4ISI(classId, runtimeModuleData);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass create = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass.Factory.create(kClassImpl.getJClass());
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind = (create == null || (classHeader = create.getClassHeader()) == null) ? null : classHeader.getKind();
        switch (kind == null ? -1 : kotlin.reflect.jvm.internal.KClassImpl.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()]) {
            case -1:
            case 6:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unresolved class: ");
                sb.append(kClassImpl.getJClass());
                sb.append(" (kind = ");
                sb.append(kind);
                sb.append(')');
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
            case 0:
            default:
                throw new kotlin.NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return getHighResolutionOutputSizeshNQ4ISI(classId, runtimeModuleData);
            case 5:
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown class: ");
                sb2.append(kClassImpl.getJClass());
                sb2.append(" (kind = ");
                sb2.append(kind);
                sb2.append(')');
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb2.toString());
        }
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId access$getClassId(kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
        return kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(kClassImpl.getJClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.util.Collection access$getMembers(final kotlin.reflect.jvm.internal.KClassImpl kClassImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess memberBelonginess) {
        kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable;
        kotlin.reflect.jvm.internal.CreateKCallableVisitor createKCallableVisitor = new kotlin.reflect.jvm.internal.CreateKCallableVisitor(kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$getMembers$visitor$1
            {
                super(kClassImpl);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
            public final kotlin.reflect.jvm.internal.DescriptorKCallable<?> visitConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, kotlin.Unit unit) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructorDescriptor, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
                throw new java.lang.IllegalStateException("No constructors should appear here: ".concat(java.lang.String.valueOf(constructorDescriptor)));
            }
        };
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> contributedDescriptors$default = kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, null, null, 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor : contributedDescriptors$default) {
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) declarationDescriptor;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INVISIBLE_FAKE)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
                    if (callableMemberDescriptor.getKind().isReal() == (memberBelonginess == kotlin.reflect.jvm.internal.KClassImpl.MemberBelonginess.getHighSpeedVideoFpsRanges)) {
                        descriptorKCallable = (kotlin.reflect.jvm.internal.DescriptorKCallable) declarationDescriptor.accept(createKCallableVisitor, kotlin.Unit.INSTANCE);
                        if (descriptorKCallable == null) {
                            arrayList.add(descriptorKCallable);
                        }
                    }
                }
            }
            descriptorKCallable = null;
            if (descriptorKCallable == null) {
            }
        }
        return kotlin.collections.CollectionsKt.toList(arrayList);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.KClassImpl.Data getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.KClassImpl kClassImpl) {
        return new kotlin.reflect.jvm.internal.KClassImpl.Data();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberDeserializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        return memberDeserializer.loadProperty(property, true);
    }

    private final kotlin.reflect.jvm.internal.impl.km.Modality getHighSpeedVideoFpsRangesFor() {
        kotlin.reflect.jvm.internal.impl.km.Modality modality;
        kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = this.getHighResolutionOutputSizeshNQ4ISI.getValue().getKmClass();
        if (kmClass != null && (modality = kotlin.reflect.jvm.internal.impl.km.Attributes.getModality(kmClass)) != null) {
            return modality;
        }
        if (getJClass().isAnnotation() || getJClass().isEnum()) {
            return kotlin.reflect.jvm.internal.impl.km.Modality.FINAL;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.INSTANCE.loadIsSealed(getJClass()), java.lang.Boolean.TRUE) ? kotlin.reflect.jvm.internal.impl.km.Modality.SEALED : java.lang.reflect.Modifier.isAbstract(getJClass().getModifiers()) ? kotlin.reflect.jvm.internal.impl.km.Modality.ABSTRACT : !java.lang.reflect.Modifier.isFinal(getJClass().getModifiers()) ? kotlin.reflect.jvm.internal.impl.km.Modality.OPEN : kotlin.reflect.jvm.internal.impl.km.Modality.FINAL;
    }

    public final kotlin.reflect.jvm.internal.impl.km.ClassKind getClassKind$kotlin_reflection() {
        kotlin.reflect.jvm.internal.impl.km.ClassKind kind;
        kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = this.getHighResolutionOutputSizeshNQ4ISI.getValue().getKmClass();
        return (kmClass == null || (kind = kotlin.reflect.jvm.internal.impl.km.Attributes.getKind(kmClass)) == null) ? getJClass().isAnnotation() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ANNOTATION_CLASS : getJClass().isInterface() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE : getJClass().isEnum() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_CLASS : getJClass().getSuperclass().isEnum() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_ENTRY : kotlin.reflect.jvm.internal.impl.km.ClassKind.CLASS : kind;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isCompanion() {
        kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = this.getHighResolutionOutputSizeshNQ4ISI.getValue().getKmClass();
        return (kmClass != null ? kotlin.reflect.jvm.internal.impl.km.Attributes.getKind(kmClass) : null) == kotlin.reflect.jvm.internal.impl.km.ClassKind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isData() {
        kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = this.getHighResolutionOutputSizeshNQ4ISI.getValue().getKmClass();
        return kmClass != null && kotlin.reflect.jvm.internal.impl.km.Attributes.isData(kmClass);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFun() {
        kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = this.getHighResolutionOutputSizeshNQ4ISI.getValue().getKmClass();
        return kmClass != null && kotlin.reflect.jvm.internal.impl.km.Attributes.isFunInterface(kmClass);
    }

    public final boolean isInline$kotlin_reflection() {
        kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = this.getHighResolutionOutputSizeshNQ4ISI.getValue().getKmClass();
        return (kmClass != null ? kmClass.getInlineClassUnderlyingType() : null) != null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = this.getHighResolutionOutputSizeshNQ4ISI.getValue().getKmClass();
        if (kmClass == null) {
            return (getJClass().getDeclaringClass() == null || java.lang.reflect.Modifier.isStatic(getJClass().getModifiers())) ? false : true;
        }
        return kotlin.reflect.jvm.internal.impl.km.Attributes.isInner(kmClass);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = this.getHighResolutionOutputSizeshNQ4ISI.getValue().getKmClass();
        return kmClass != null && kotlin.reflect.jvm.internal.impl.km.Attributes.isValue(kmClass);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
