package kotlin.reflect.jvm.internal.impl.metadata.builtins;

/* loaded from: classes5.dex */
public final class BuiltInsBinaryVersion extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion {
    public static final kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion INSTANCE = new kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion(1, 0, 7);
    public static final kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion INVALID_VERSION = new kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion(new int[0]);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(int... iArr) {
        super(java.util.Arrays.copyOf(iArr, iArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
    }

    public final boolean isCompatibleWithCurrentCompilerVersion() {
        return isCompatibleTo(INSTANCE);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion readFrom(java.io.InputStream inputStream) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
            kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, dataInputStream.readInt());
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
            java.util.Iterator<java.lang.Integer> it = intRange.iterator();
            while (it.hasNext()) {
                ((kotlin.collections.IntIterator) it).nextInt();
                arrayList.add(java.lang.Integer.valueOf(dataInputStream.readInt()));
            }
            int[] intArray = kotlin.collections.CollectionsKt.toIntArray(arrayList);
            return new kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion(java.util.Arrays.copyOf(intArray, intArray.length));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
