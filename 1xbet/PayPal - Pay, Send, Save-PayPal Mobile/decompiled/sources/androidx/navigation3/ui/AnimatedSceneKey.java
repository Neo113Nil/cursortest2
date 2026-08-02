package androidx.navigation3.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006B\u0015\b\u0016\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0014\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Landroidx/navigation3/ui/AnimatedSceneKey;", "", "Lkotlin/reflect/KClass;", "clazz", "key", "<init>", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)V", "Landroidx/navigation3/scene/Scene;", "scene", "(Landroidx/navigation3/scene/Scene;)V", "component1", "()Lkotlin/reflect/KClass;", "component2", "()Ljava/lang/Object;", "copy", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Landroidx/navigation3/ui/AnimatedSceneKey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/KClass;", "getClazz", "Ljava/lang/Object;", "getKey"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnimatedSceneKey {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<?> clazz;
    private final java.lang.Object key;

    public AnimatedSceneKey(kotlin.reflect.KClass<?> kClass, java.lang.Object obj) {
        this.clazz = kClass;
        this.key = obj;
    }

    public final kotlin.reflect.KClass<?> getClazz() {
        return this.clazz;
    }

    public final java.lang.Object getKey() {
        return this.key;
    }

    public AnimatedSceneKey(androidx.navigation3.scene.Scene<?> scene) {
        this(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(scene.getClass()), scene.getKey());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnimatedSceneKey(clazz=");
        sb.append(this.clazz);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.clazz.hashCode() * 31) + this.key.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.navigation3.ui.AnimatedSceneKey)) {
            return false;
        }
        androidx.navigation3.ui.AnimatedSceneKey animatedSceneKey = (androidx.navigation3.ui.AnimatedSceneKey) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.clazz, animatedSceneKey.clazz) && kotlin.jvm.internal.Intrinsics.areEqual(this.key, animatedSceneKey.key);
    }

    public final androidx.navigation3.ui.AnimatedSceneKey copy(kotlin.reflect.KClass<?> clazz, java.lang.Object key) {
        return new androidx.navigation3.ui.AnimatedSceneKey(clazz, key);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getKey() {
        return this.key;
    }

    public final kotlin.reflect.KClass<?> component1() {
        return this.clazz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.navigation3.ui.AnimatedSceneKey copy$default(androidx.navigation3.ui.AnimatedSceneKey animatedSceneKey, kotlin.reflect.KClass kClass, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            kClass = animatedSceneKey.clazz;
        }
        if ((i & 2) != 0) {
            obj = animatedSceneKey.key;
        }
        return animatedSceneKey.copy(kClass, obj);
    }
}
