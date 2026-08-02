package ae;

import org.jetbrains.annotations.NotNull;

/* renamed from: ae.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5002d {

    /* renamed from: a, reason: collision with root package name */
    private final String f36618a;

    private C5002d(@NotNull String str) {
        if (str != null) {
            this.f36618a = str;
        } else {
            a(7);
            throw null;
        }
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
    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        if (i11 != 3 && i11 != 5) {
            switch (i11) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i11 != 3 && i11 != 5) {
                switch (i11) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        i12 = 3;
                        break;
                }
                Object[] objArr = new Object[i12];
                switch (i11) {
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
                if (i11 != 3) {
                    objArr[1] = "internalNameByClassId";
                } else if (i11 != 5) {
                    switch (i11) {
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
                switch (i11) {
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
                String format = String.format(str, objArr);
                if (i11 != 3 && i11 != 5) {
                    switch (i11) {
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i12 = 2;
            Object[] objArr2 = new Object[i12];
            switch (i11) {
            }
            if (i11 != 3) {
            }
            switch (i11) {
            }
            String format2 = String.format(str, objArr2);
            if (i11 != 3) {
                switch (i11) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i11 != 3) {
            switch (i11) {
            }
            Object[] objArr22 = new Object[i12];
            switch (i11) {
            }
            if (i11 != 3) {
            }
            switch (i11) {
            }
            String format22 = String.format(str, objArr22);
            if (i11 != 3) {
            }
            throw new IllegalStateException(format22);
        }
        i12 = 2;
        Object[] objArr222 = new Object[i12];
        switch (i11) {
        }
        if (i11 != 3) {
        }
        switch (i11) {
        }
        String format222 = String.format(str, objArr222);
        if (i11 != 3) {
        }
        throw new IllegalStateException(format222);
    }

    @NotNull
    public static C5002d b(@NotNull Sd.b bVar) {
        if (bVar != null) {
            return new C5002d(h(bVar));
        }
        a(1);
        throw null;
    }

    @NotNull
    public static C5002d c(@NotNull Sd.c cVar) {
        if (cVar != null) {
            return new C5002d(cVar.b().replace('.', '/'));
        }
        a(4);
        throw null;
    }

    @NotNull
    public static C5002d d(@NotNull String str) {
        if (str != null) {
            return new C5002d(str);
        }
        a(0);
        throw null;
    }

    @NotNull
    public static String h(@NotNull Sd.b bVar) {
        if (bVar == null) {
            a(2);
            throw null;
        }
        Sd.c f7 = bVar.f();
        String replace = bVar.g().b().replace('.', '$');
        if (!f7.d()) {
            replace = f7.b().replace('.', '/') + "/" + replace;
        }
        if (replace != null) {
            return replace;
        }
        a(3);
        throw null;
    }

    @NotNull
    public final Sd.c e() {
        return new Sd.c(this.f36618a.replace('/', '.'));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5002d.class != obj.getClass()) {
            return false;
        }
        return this.f36618a.equals(((C5002d) obj).f36618a);
    }

    @NotNull
    public final String f() {
        String str = this.f36618a;
        if (str != null) {
            return str;
        }
        a(10);
        throw null;
    }

    @NotNull
    public final Sd.c g() {
        String str = this.f36618a;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new Sd.c(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        Sd.c cVar = Sd.c.f26129c;
        if (cVar != null) {
            return cVar;
        }
        a(9);
        throw null;
    }

    public final int hashCode() {
        return this.f36618a.hashCode();
    }

    public final String toString() {
        return this.f36618a;
    }
}
