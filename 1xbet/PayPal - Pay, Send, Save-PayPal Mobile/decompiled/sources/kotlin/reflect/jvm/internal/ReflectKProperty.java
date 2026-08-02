package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectKProperty;", "V", "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "Lkotlin/reflect/KProperty;", "", "getSignature", "()Ljava/lang/String;", "signature", "Ljava/lang/reflect/Field;", "getJavaField", "()Ljava/lang/reflect/Field;", "javaField"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ReflectKProperty<V> extends kotlin.reflect.KProperty<V>, kotlin.reflect.jvm.internal.ReflectKCallable<V> {
    java.lang.reflect.Field getJavaField();

    java.lang.String getSignature();
}
