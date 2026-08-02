package androidx.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u001aK\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010"}, d2 = {"Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "Ljava/lang/reflect/Constructor;", "constructor", "", "", "params", "newInstance", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "", "signature", "findMatchingConstructor", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "getHighSpeedVideoSizes", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedStateViewModelFactory_androidKt {
    private static final java.util.List<java.lang.Class<?>> getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Class[]{android.app.Application.class, androidx.view.SavedStateHandle.class});
    private static final java.util.List<java.lang.Class<?>> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf(androidx.view.SavedStateHandle.class);

    public static final <T extends androidx.view.ViewModel> T newInstance(java.lang.Class<T> cls, java.lang.reflect.Constructor<T> constructor, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        try {
            return constructor.newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Failed to access ".concat(java.lang.String.valueOf(cls)), e);
        } catch (java.lang.InstantiationException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("A ");
            sb.append(cls);
            sb.append(" cannot be instantiated.");
            throw new java.lang.RuntimeException(sb.toString(), e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException("An exception happened in constructor of ".concat(java.lang.String.valueOf(cls)), e3.getCause());
        }
    }

    public static final <T> java.lang.reflect.Constructor<T> findMatchingConstructor(java.lang.Class<T> cls, java.util.List<? extends java.lang.Class<?>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object[] constructors = cls.getConstructors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructors, "");
        for (java.lang.Object obj : constructors) {
            java.lang.reflect.Constructor<T> constructor = (java.lang.reflect.Constructor<T>) obj;
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
            java.util.List list2 = kotlin.collections.ArraysKt.toList(parameterTypes);
            if (kotlin.jvm.internal.Intrinsics.areEqual(list, list2)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(constructor, "");
                return constructor;
            }
            if (list.size() == list2.size() && list2.containsAll(list)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Class ");
                sb.append(cls.getSimpleName());
                sb.append(" must have parameters in the proper order: ");
                sb.append(list);
                throw new java.lang.UnsupportedOperationException(sb.toString());
            }
        }
        return null;
    }
}
