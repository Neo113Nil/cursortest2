package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J;\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "T", "", "Lkotlin/reflect/KClass;", "key", "", "Lkotlin/reflect/KType;", "types", "Lkotlin/Result;", "Lkotlinx/serialization/KSerializer;", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "get"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ParametrizedSerializerCache<T> {
    /* renamed from: get-gIAlu-s */
    java.lang.Object mo24214getgIAlus(kotlin.reflect.KClass<java.lang.Object> key, java.util.List<? extends kotlin.reflect.KType> types);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: get-gIAlu-s$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m24220getgIAlus$default(kotlinx.serialization.internal.ParametrizedSerializerCache parametrizedSerializerCache, kotlin.reflect.KClass kClass, java.util.List list, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
        }
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return parametrizedSerializerCache.mo24214getgIAlus(kClass, list);
    }
}
