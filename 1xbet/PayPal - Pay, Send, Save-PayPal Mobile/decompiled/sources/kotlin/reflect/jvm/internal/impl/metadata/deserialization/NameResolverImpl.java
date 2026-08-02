package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* loaded from: classes5.dex */
public final class NameResolverImpl implements kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver {
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getHighSpeedVideoFpsRangesFor;

    public NameResolverImpl(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualifiedNameTable, "");
        this.getHighSpeedVideoFpsRangesFor = stringTable;
        this.getHighResolutionOutputSizeshNQ4ISI = qualifiedNameTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final java.lang.String getString(int i) {
        java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final java.lang.String getQualifiedClassName(int i) {
        kotlin.Triple<java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.Boolean> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        java.util.List<java.lang.String> component1 = Camera2StreamConfigurationMap.component1();
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(Camera2StreamConfigurationMap.component2(), ".", null, null, 0, null, null, 62, null);
        if (component1.isEmpty()) {
            return joinToString$default;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(component1, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, null, null, 0, null, null, 62, null));
        sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        sb.append(joinToString$default);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final boolean isLocalClassName(int i) {
        return Camera2StreamConfigurationMap(i).getThird().booleanValue();
    }

    private final kotlin.Triple<java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.Boolean> Camera2StreamConfigurationMap(int i) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        boolean z = false;
        while (i != -1) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.getHighResolutionOutputSizeshNQ4ISI.getQualifiedName(i);
            java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(qualifiedName.getShortName());
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            kotlin.jvm.internal.Intrinsics.checkNotNull(kind);
            int i2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(string);
            } else if (i2 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(string);
                z = true;
            }
            i = qualifiedName.getParentQualifiedName();
        }
        return new kotlin.Triple<>(linkedList, linkedList2, java.lang.Boolean.valueOf(z));
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
