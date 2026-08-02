package kotlin.reflect.full;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0004*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0002\u0010\u0007"}, d2 = {"Lkotlin/reflect/KProperty1;", "", "getExtensionDelegate", "(Lkotlin/reflect/KProperty1;)Ljava/lang/Object;", "D", "Lkotlin/reflect/KProperty2;", "receiver", "(Lkotlin/reflect/KProperty2;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KProperties {
    public static final java.lang.Object getExtensionDelegate(kotlin.reflect.KProperty1<?, ?> kProperty1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty1, "");
        return kProperty1.getDelegate(kotlin.reflect.jvm.internal.DescriptorKProperty.INSTANCE.getEXTENSION_PROPERTY_DELEGATE());
    }

    public static final <D> java.lang.Object getExtensionDelegate(kotlin.reflect.KProperty2<D, ?, ?> kProperty2, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty2, "");
        return kProperty2.getDelegate(d, kotlin.reflect.jvm.internal.DescriptorKProperty.INSTANCE.getEXTENSION_PROPERTY_DELEGATE());
    }
}
