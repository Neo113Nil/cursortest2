package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes5.dex */
public interface Annotations extends java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion Companion = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.Camera2StreamConfigurationMap;

    /* renamed from: findAnnotation */
    kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo23890findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    boolean isEmpty();

    public static final class DefaultImpls {
        public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor findAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    annotationDescriptor = null;
                    break;
                }
                annotationDescriptor = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(annotationDescriptor.getFqName(), fqName)) {
                    break;
                }
            }
            return annotationDescriptor;
        }

        public static boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
            return annotations.mo23890findAnnotation(fqName) != null;
        }
    }

    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion();
        private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public final boolean isEmpty() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            /* renamed from: findAnnotation, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo23890findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) findAnnotation(fqName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public final /* bridge */ boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
                return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls.hasAnnotation(this, fqName);
            }

            @Override // java.lang.Iterable
            public final java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> iterator() {
                return kotlin.collections.CollectionsKt.emptyList().iterator();
            }

            public final java.lang.String toString() {
                return "EMPTY";
            }

            public final java.lang.Void findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
                return null;
            }
        };

        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getEMPTY() {
            return getHighSpeedVideoSizes;
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations create(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            return list.isEmpty() ? getHighSpeedVideoSizes : new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsImpl(list);
        }
    }
}
