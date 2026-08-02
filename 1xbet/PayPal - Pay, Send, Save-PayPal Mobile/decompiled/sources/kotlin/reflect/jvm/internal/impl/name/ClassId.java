package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes5.dex */
public final class ClassId {
    public static final kotlin.reflect.jvm.internal.impl.name.ClassId.Companion Companion = new kotlin.reflect.jvm.internal.impl.name.ClassId.Companion(null);
    private final boolean getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoSizes;

    public ClassId(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.FqName fqName2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName2, "");
        this.getHighSpeedVideoFpsRangesFor = fqName;
        this.getHighSpeedVideoSizes = fqName2;
        this.getHighSpeedVideoFpsRanges = z;
        fqName2.isRoot();
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName getPackageFqName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName getRelativeClassName() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean isLocal() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        this(fqName, kotlin.reflect.jvm.internal.impl.name.FqName.Companion.topLevel(name2), false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getShortClassName() {
        return this.getHighSpeedVideoSizes.shortName();
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getOuterClassId() {
        kotlin.reflect.jvm.internal.impl.name.FqName parent = this.getHighSpeedVideoSizes.parent();
        if (parent.isRoot()) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(this.getHighSpeedVideoFpsRangesFor, parent, this.getHighSpeedVideoFpsRanges);
    }

    public final boolean isNestedClass() {
        return !this.getHighSpeedVideoSizes.parent().isRoot();
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId createNestedClassId(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.child(name2), this.getHighSpeedVideoFpsRanges);
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName() {
        if (this.getHighSpeedVideoFpsRangesFor.isRoot()) {
            return this.getHighSpeedVideoSizes;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.asString());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.getHighSpeedVideoSizes.asString());
        return new kotlin.reflect.jvm.internal.impl.name.FqName(sb.toString());
    }

    private static final java.lang.String getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        java.lang.String asString = fqName.asString();
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) asString, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 2, (java.lang.Object) null)) {
            return asString;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("`");
        sb.append(asString);
        sb.append('`');
        return sb.toString();
    }

    public final java.lang.String asString() {
        if (this.getHighSpeedVideoFpsRangesFor.isRoot()) {
            return getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.StringsKt.replace$default(this.getHighSpeedVideoFpsRangesFor.asString(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null));
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes));
        return sb.toString();
    }

    public final java.lang.String toString() {
        if (!this.getHighSpeedVideoFpsRangesFor.isRoot()) {
            return asString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(asString());
        return sb.toString();
    }

    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.name.ClassId topLevel(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
            return new kotlin.reflect.jvm.internal.impl.name.ClassId(fqName.parent(), fqName.shortName());
        }

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.ClassId fromString$default(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.fromString(str, z);
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.name.ClassId fromString(java.lang.String str, boolean z) {
            java.lang.String replace$default;
            java.lang.String str2 = "";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.lang.String str3 = str;
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, '`', 0, false, 6, (java.lang.Object) null);
            if (indexOf$default == -1) {
                indexOf$default = str.length();
            }
            int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str3, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, indexOf$default, false, 4, (java.lang.Object) null);
            if (lastIndexOf$default == -1) {
                replace$default = kotlin.text.StringsKt.replace$default(str, "`", "", false, 4, (java.lang.Object) null);
            } else {
                java.lang.String substring = str.substring(0, lastIndexOf$default);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                java.lang.String replace$default2 = kotlin.text.StringsKt.replace$default(substring, kotlinx.io.files.FileSystemKt.UnixPathSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 4, (java.lang.Object) null);
                java.lang.String substring2 = str.substring(lastIndexOf$default + 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                replace$default = kotlin.text.StringsKt.replace$default(substring2, "`", "", false, 4, (java.lang.Object) null);
                str2 = replace$default2;
            }
            return new kotlin.reflect.jvm.internal.impl.name.ClassId(new kotlin.reflect.jvm.internal.impl.name.FqName(str2), new kotlin.reflect.jvm.internal.impl.name.FqName(replace$default), z);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.name.ClassId)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = (kotlin.reflect.jvm.internal.impl.name.ClassId) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, classId.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, classId.getHighSpeedVideoSizes) && this.getHighSpeedVideoFpsRanges == classId.getHighSpeedVideoFpsRanges;
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.name.ClassId topLevel(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        return Companion.topLevel(fqName);
    }
}
