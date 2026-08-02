package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes3.dex */
public final class FqName {
    public static final kotlin.reflect.jvm.internal.impl.name.FqName.Companion Companion = new kotlin.reflect.jvm.internal.impl.name.FqName.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.name.FqName ROOT = new kotlin.reflect.jvm.internal.impl.name.FqName("");
    private final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe getHighResolutionOutputSizeshNQ4ISI;
    private transient kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRangesFor;

    public FqName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(str, this);
    }

    public FqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqNameUnsafe, "");
        this.getHighResolutionOutputSizeshNQ4ISI = fqNameUnsafe;
    }

    private FqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        this.getHighResolutionOutputSizeshNQ4ISI = fqNameUnsafe;
        this.getHighSpeedVideoFpsRangesFor = fqName;
    }

    public final java.lang.String asString() {
        return this.getHighResolutionOutputSizeshNQ4ISI.asString();
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe toUnsafe() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isRoot() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isRoot();
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName parent() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.getHighSpeedVideoFpsRangesFor;
        if (fqName != null) {
            return fqName;
        }
        if (isRoot()) {
            throw new java.lang.IllegalStateException("root".toString());
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = new kotlin.reflect.jvm.internal.impl.name.FqName(this.getHighResolutionOutputSizeshNQ4ISI.parent());
        this.getHighSpeedVideoFpsRangesFor = fqName2;
        return fqName2;
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName child(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new kotlin.reflect.jvm.internal.impl.name.FqName(this.getHighResolutionOutputSizeshNQ4ISI.child(name2), this);
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name shortName() {
        return this.getHighResolutionOutputSizeshNQ4ISI.shortName();
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name shortNameOrSpecial() {
        return this.getHighResolutionOutputSizeshNQ4ISI.shortNameOrSpecial();
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> pathSegments() {
        return this.getHighResolutionOutputSizeshNQ4ISI.pathSegments();
    }

    public final boolean startsWith(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.startsWith(name2);
    }

    public final java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kotlin.reflect.jvm.internal.impl.name.FqName) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((kotlin.reflect.jvm.internal.impl.name.FqName) obj).getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.name.FqName topLevel(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new kotlin.reflect.jvm.internal.impl.name.FqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe.Companion.topLevel(name2));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
