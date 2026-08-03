package kotlinx.serialization.internal;

/* compiled from: Platform.common.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J;\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "T", "", "get", "Lkotlin/Result;", "Lkotlinx/serialization/KSerializer;", com.ironsource.X3.i.W, "Lkotlin/reflect/KClass;", "types", "", "Lkotlin/reflect/KType;", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ParametrizedSerializerCache<T> {
    /* renamed from: get-gIAlu-s */
    java.lang.Object mo12403getgIAlus(kotlin.reflect.KClass<java.lang.Object> key, java.util.List<? extends kotlin.reflect.KType> types);

    /* compiled from: Platform.common.kt */
    /* renamed from: kotlinx.serialization.internal.ParametrizedSerializerCache$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: get-gIAlu-s$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m12409getgIAlus$default(kotlinx.serialization.internal.ParametrizedSerializerCache parametrizedSerializerCache, kotlin.reflect.KClass kClass, java.util.List list, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
            }
            if ((i & 2) != 0) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            return parametrizedSerializerCache.mo12403getgIAlus(kClass, list);
        }
    }

    /* compiled from: Platform.common.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }
}
