package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u001a!\u0010\u0003\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0014\u0010\u0005\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\f*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a9\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0015\u001a\u00020\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "asPreviewProviderClass", "(Ljava/lang/String;)Ljava/lang/Class;", "parameterProviderClass", "", "parameterProviderIndex", "", "", "getPreviewProviderParameters", "(Ljava/lang/Class;I)[Ljava/lang/Object;", "Landroidx/compose/ui/tooling/data/Group;", "Lkotlin/Function1;", "", "predicate", "firstOrNull", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/tooling/data/Group;", "", "findAll", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/jvm/functions/Function1;Z)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewUtils_androidKt {
    public static final java.lang.Class<? extends androidx.compose.ui.tooling.preview.PreviewParameterProvider<?>> asPreviewProviderClass(java.lang.String str) {
        try {
            java.lang.Class cls = java.lang.Class.forName(str);
            if (cls instanceof java.lang.Class) {
                return cls;
            }
            return null;
        } catch (java.lang.ClassNotFoundException e) {
            androidx.compose.ui.tooling.PreviewLogger.Companion companion = androidx.compose.ui.tooling.PreviewLogger.INSTANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find PreviewProvider '");
            sb.append(str);
            sb.append('\'');
            companion.logError$ui_tooling(sb.toString(), e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object[] getPreviewProviderParameters(java.lang.Class<? extends androidx.compose.ui.tooling.preview.PreviewParameterProvider<?>> cls, int i) {
        if (cls != null) {
            try {
                java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                java.lang.reflect.Constructor<?> constructor = null;
                int i2 = 0;
                boolean z = false;
                java.lang.reflect.Constructor<?> constructor2 = null;
                while (true) {
                    if (i2 < length) {
                        java.lang.reflect.Constructor<?> constructor3 = constructors[i2];
                        if (constructor3.getParameterTypes().length == 0) {
                            if (z) {
                                break;
                            }
                            z = true;
                            constructor2 = constructor3;
                        }
                        i2++;
                    } else if (z) {
                        constructor = constructor2;
                    }
                }
                if (constructor != null) {
                    constructor.setAccessible(true);
                    java.lang.Object newInstance = constructor.newInstance(new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "");
                    androidx.compose.ui.tooling.preview.PreviewParameterProvider previewParameterProvider = (androidx.compose.ui.tooling.preview.PreviewParameterProvider) newInstance;
                    if (i < 0) {
                        kotlin.sequences.Sequence values = previewParameterProvider.getValues();
                        int count = previewParameterProvider.getCount();
                        java.util.Iterator it = values.iterator();
                        java.lang.Object[] objArr = new java.lang.Object[count];
                        for (int i3 = 0; i3 < count; i3++) {
                            objArr[i3] = it.next();
                        }
                        return objArr;
                    }
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(kotlin.sequences.SequencesKt.elementAt(previewParameterProvider.getValues(), i));
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
                    for (java.lang.Object obj : listOf) {
                        if (obj != null) {
                            java.lang.annotation.Annotation[] annotations = obj.getClass().getAnnotations();
                            int length2 = annotations.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length2) {
                                    break;
                                }
                                if (annotations[i4] instanceof kotlin.jvm.JvmInline) {
                                    for (java.lang.reflect.Field field : obj.getClass().getDeclaredFields()) {
                                        if (field.getType().isPrimitive()) {
                                            java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField(field.getName());
                                            declaredField.setAccessible(true);
                                            obj = declaredField.get(obj);
                                        }
                                    }
                                    throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
                                }
                                i4++;
                            }
                        }
                        arrayList.add(obj);
                    }
                    return arrayList.toArray(new java.lang.Object[0]);
                }
                throw new java.lang.IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            } catch (kotlin.jvm.KotlinReflectionNotSupportedError unused) {
                throw new java.lang.IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            }
        }
        return new java.lang.Object[0];
    }

    public static final androidx.compose.ui.tooling.data.Group firstOrNull(androidx.compose.ui.tooling.data.Group group, kotlin.jvm.functions.Function1<? super androidx.compose.ui.tooling.data.Group, java.lang.Boolean> function1) {
        return (androidx.compose.ui.tooling.data.Group) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) getHighResolutionOutputSizeshNQ4ISI(group, function1, true));
    }

    private static final java.util.List<androidx.compose.ui.tooling.data.Group> getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.tooling.data.Group group, kotlin.jvm.functions.Function1<? super androidx.compose.ui.tooling.data.Group, java.lang.Boolean> function1, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(group);
        while (!mutableListOf.isEmpty()) {
            androidx.compose.ui.tooling.data.Group group2 = (androidx.compose.ui.tooling.data.Group) kotlin.collections.CollectionsKt.removeLast(mutableListOf);
            if (function1.invoke(group2).booleanValue()) {
                if (z) {
                    return kotlin.collections.CollectionsKt.listOf(group2);
                }
                arrayList.add(group2);
            }
            mutableListOf.addAll(group2.getChildren());
        }
        return arrayList;
    }

    public static final java.util.List<androidx.compose.ui.tooling.data.Group> findAll(androidx.compose.ui.tooling.data.Group group, kotlin.jvm.functions.Function1<? super androidx.compose.ui.tooling.data.Group, java.lang.Boolean> function1) {
        return getHighResolutionOutputSizeshNQ4ISI(group, function1, false);
    }
}
