package Lf0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f17063a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f17064b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17065c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17066d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final EnumC0331a f17067e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Lf0.a$a, reason: collision with other inner class name */
    public static final class EnumC0331a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC0331a[] $VALUES;
        public static final EnumC0331a Default;
        public static final EnumC0331a System;
        public static final EnumC0331a User;

        static {
            EnumC0331a enumC0331a = new EnumC0331a("User", 0);
            User = enumC0331a;
            EnumC0331a enumC0331a2 = new EnumC0331a("System", 1);
            System = enumC0331a2;
            EnumC0331a enumC0331a3 = new EnumC0331a("Default", 2);
            Default = enumC0331a3;
            EnumC0331a[] enumC0331aArr = {enumC0331a, enumC0331a2, enumC0331a3};
            $VALUES = enumC0331aArr;
            $ENTRIES = Xc.b.a(enumC0331aArr);
        }

        private EnumC0331a() {
            throw null;
        }

        public static EnumC0331a valueOf(String str) {
            return (EnumC0331a) Enum.valueOf(EnumC0331a.class, str);
        }

        public static EnumC0331a[] values() {
            return (EnumC0331a[]) $VALUES.clone();
        }
    }

    public a(int i11, Integer num, Integer num2) {
        this.f17063a = num;
        this.f17064b = num2;
        this.f17065c = i11;
        if (num != null) {
            i11 = num.intValue();
        } else if (num2 != null) {
            i11 = num2.intValue();
        }
        this.f17066d = i11;
        this.f17067e = num != null ? EnumC0331a.User : num2 != null ? EnumC0331a.System : EnumC0331a.Default;
    }

    public final int a() {
        return this.f17066d;
    }

    @NotNull
    public final EnumC0331a b() {
        return this.f17067e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f17063a, aVar.f17063a) && Intrinsics.d(this.f17064b, aVar.f17064b) && this.f17065c == aVar.f17065c;
    }

    public final int hashCode() {
        Integer num = this.f17063a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f17064b;
        return Integer.hashCode(this.f17065c) + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigParam(userValue=");
        sb2.append(this.f17063a);
        sb2.append(", systemValue=");
        sb2.append(this.f17064b);
        sb2.append(", defaultValue=");
        return K00.b.e(this.f17065c, ")", sb2);
    }
}
