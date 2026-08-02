package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class Visibilities {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibilities();
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.Visibility, java.lang.Integer> getHighSpeedVideoFpsRanges;
    private static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Public getHighSpeedVideoFpsRangesFor;

    public static final class Private extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private();

        private Private() {
            super(io.ktor.client.utils.CacheControl.PRIVATE, false);
        }
    }

    private Visibilities() {
    }

    public static final class PrivateToThis extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PrivateToThis INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PrivateToThis();

        private PrivateToThis() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final java.lang.String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    public static final class Protected extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Protected INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Protected();

        private Protected() {
            super("protected", true);
        }
    }

    public static final class Internal extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Internal INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Internal();

        private Internal() {
            super("internal", false);
        }
    }

    public static final class Public extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Public INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Public();

        private Public() {
            super("public", true);
        }
    }

    public static final class Local extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Local INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Local();

        private Local() {
            super(com.google.android.gms.common.internal.ImagesContract.LOCAL, false);
        }
    }

    public static final class Inherited extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Inherited INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Inherited();

        private Inherited() {
            super("inherited", false);
        }
    }

    public static final class InvisibleFake extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.InvisibleFake INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.InvisibleFake();

        private InvisibleFake() {
            super("invisible_fake", false);
        }
    }

    public static final class Unknown extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Unknown INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Unknown();

        private Unknown() {
            super("unknown", false);
        }
    }

    static {
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PrivateToThis.INSTANCE, 0);
        createMapBuilder.put(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private.INSTANCE, 0);
        createMapBuilder.put(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Internal.INSTANCE, 1);
        createMapBuilder.put(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Protected.INSTANCE, 1);
        createMapBuilder.put(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Public.INSTANCE, 2);
        getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.build(createMapBuilder);
        getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Public.INSTANCE;
    }

    public final java.lang.Integer compareLocal$compiler_common(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility, kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibility, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibility2, "");
        if (visibility == visibility2) {
            return 0;
        }
        java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.Visibility, java.lang.Integer> map = getHighSpeedVideoFpsRanges;
        java.lang.Integer num = map.get(visibility);
        java.lang.Integer num2 = map.get(visibility2);
        if (num == null || num2 == null || kotlin.jvm.internal.Intrinsics.areEqual(num, num2)) {
            return null;
        }
        return java.lang.Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean isPrivate(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibility, "");
        return visibility == kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private.INSTANCE || visibility == kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PrivateToThis.INSTANCE;
    }
}
