package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public interface JavaClassFinder {
    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass findClass(kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request request);

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage findPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName, boolean z);

    java.util.Set<java.lang.String> knownClassNamesInPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    public static final class Request {
        private final kotlin.reflect.jvm.internal.impl.name.ClassId Camera2StreamConfigurationMap;
        private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass getHighSpeedVideoFpsRanges;
        private final byte[] getHighSpeedVideoSizes;

        public Request(kotlin.reflect.jvm.internal.impl.name.ClassId classId, byte[] bArr, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
            this.Camera2StreamConfigurationMap = classId;
            this.getHighSpeedVideoSizes = bArr;
            this.getHighSpeedVideoFpsRanges = javaClass;
        }

        public /* synthetic */ Request(kotlin.reflect.jvm.internal.impl.name.ClassId classId, byte[] bArr, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : javaClass);
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(classId=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", previouslyFoundClassFileContent=");
            sb.append(java.util.Arrays.toString(this.getHighSpeedVideoSizes));
            sb.append(", outerClass=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.Camera2StreamConfigurationMap.hashCode();
            byte[] bArr = this.getHighSpeedVideoSizes;
            int hashCode2 = bArr == null ? 0 : java.util.Arrays.hashCode(bArr);
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass = this.getHighSpeedVideoFpsRanges;
            return (((hashCode * 31) + hashCode2) * 31) + (javaClass != null ? javaClass.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request request = (kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, request.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, request.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, request.getHighSpeedVideoFpsRanges);
        }
    }
}
