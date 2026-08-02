package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* loaded from: classes5.dex */
public class JvmClassName {
    private kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName byInternalName(java.lang.String str) {
        if (str == null) {
            Camera2StreamConfigurationMap(0);
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName(str);
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName byClassId(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        if (classId == null) {
            Camera2StreamConfigurationMap(1);
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName(internalNameByClassId(classId));
    }

    public static java.lang.String internalNameByClassId(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        if (classId == null) {
            Camera2StreamConfigurationMap(2);
        }
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
        java.lang.String replace = classId.getRelativeClassName().asString().replace(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlin.text.Typography.dollar);
        if (!packageFqName.isRoot()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(packageFqName.asString().replace(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator));
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(replace);
            replace = sb.toString();
        }
        if (replace == null) {
            Camera2StreamConfigurationMap(3);
        }
        return replace;
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName byFqNameWithoutInnerClasses(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        if (fqName == null) {
            Camera2StreamConfigurationMap(4);
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassName = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName(fqName.asString().replace(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator));
        jvmClassName.getHighSpeedVideoFpsRanges = fqName;
        return jvmClassName;
    }

    private JvmClassName(java.lang.String str) {
        if (str == null) {
            Camera2StreamConfigurationMap(7);
        }
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new kotlin.reflect.jvm.internal.impl.name.FqName(this.getHighSpeedVideoFpsRangesFor.replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR));
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName getPackageFqName() {
        int lastIndexOf = this.getHighSpeedVideoFpsRangesFor.lastIndexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        if (lastIndexOf == -1) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.name.FqName.ROOT;
            if (fqName == null) {
                Camera2StreamConfigurationMap(9);
            }
            return fqName;
        }
        return new kotlin.reflect.jvm.internal.impl.name.FqName(this.getHighSpeedVideoFpsRangesFor.substring(0, lastIndexOf).replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR));
    }

    public java.lang.String getInternalName() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (str == null) {
            Camera2StreamConfigurationMap(10);
        }
        return str;
    }

    public java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.getHighSpeedVideoFpsRangesFor.equals(((kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName) obj).getHighSpeedVideoFpsRangesFor);
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String str;
        int i2;
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 3 && i != 5) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                java.lang.Object[] objArr = new java.lang.Object[i2];
                switch (i) {
                    case 1:
                    case 2:
                        objArr[0] = "classId";
                        break;
                    case 3:
                    case 5:
                    case 8:
                    case 9:
                    case 10:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                        break;
                    case 4:
                    case 6:
                        objArr[0] = "fqName";
                        break;
                    case 7:
                    default:
                        objArr[0] = "internalName";
                        break;
                }
                if (i != 3) {
                    objArr[1] = "internalNameByClassId";
                } else if (i != 5) {
                    switch (i) {
                        case 8:
                            objArr[1] = "getFqNameForClassNameWithoutDollars";
                            break;
                        case 9:
                            objArr[1] = "getPackageFqName";
                            break;
                        case 10:
                            objArr[1] = "getInternalName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                            break;
                    }
                } else {
                    objArr[1] = "byFqNameWithoutInnerClasses";
                }
                switch (i) {
                    case 1:
                        objArr[2] = "byClassId";
                        break;
                    case 2:
                        objArr[2] = "internalNameByClassId";
                        break;
                    case 3:
                    case 5:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    case 4:
                    case 6:
                        objArr[2] = "byFqNameWithoutInnerClasses";
                        break;
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "byInternalName";
                        break;
                }
                java.lang.String format = java.lang.String.format(str, objArr);
                if (i != 3 && i != 5) {
                    switch (i) {
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException(format);
                    }
                }
                throw new java.lang.IllegalStateException(format);
            }
            i2 = 2;
            java.lang.Object[] objArr2 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 3) {
            }
            switch (i) {
            }
            java.lang.String format2 = java.lang.String.format(str, objArr2);
            if (i != 3) {
                switch (i) {
                }
            }
            throw new java.lang.IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 3) {
            switch (i) {
            }
            java.lang.Object[] objArr22 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 3) {
            }
            switch (i) {
            }
            java.lang.String format22 = java.lang.String.format(str, objArr22);
            if (i != 3) {
            }
            throw new java.lang.IllegalStateException(format22);
        }
        i2 = 2;
        java.lang.Object[] objArr222 = new java.lang.Object[i2];
        switch (i) {
        }
        if (i != 3) {
        }
        switch (i) {
        }
        java.lang.String format222 = java.lang.String.format(str, objArr222);
        if (i != 3) {
        }
        throw new java.lang.IllegalStateException(format222);
    }
}
