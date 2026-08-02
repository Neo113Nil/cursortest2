package Md;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC0345a f17871a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rd.e f17872b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f17873c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f17874d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f17875e;

    /* renamed from: f, reason: collision with root package name */
    private final String f17876f;

    /* renamed from: g, reason: collision with root package name */
    private final int f17877g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Md.a$a, reason: collision with other inner class name */
    public static final class EnumC0345a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC0345a[] $VALUES;
        public static final EnumC0345a CLASS;

        @NotNull
        public static final C0346a Companion;
        public static final EnumC0345a FILE_FACADE;
        public static final EnumC0345a MULTIFILE_CLASS;
        public static final EnumC0345a MULTIFILE_CLASS_PART;
        public static final EnumC0345a SYNTHETIC_CLASS;
        public static final EnumC0345a UNKNOWN;

        @NotNull
        private static final Map<Integer, EnumC0345a> entryById;

        /* renamed from: id, reason: collision with root package name */
        private final int f17878id;

        /* renamed from: Md.a$a$a, reason: collision with other inner class name */
        public static final class C0346a {
        }

        static {
            EnumC0345a enumC0345a = new EnumC0345a(FraudMonInfo.UNKNOWN, 0, 0);
            UNKNOWN = enumC0345a;
            EnumC0345a enumC0345a2 = new EnumC0345a("CLASS", 1, 1);
            CLASS = enumC0345a2;
            EnumC0345a enumC0345a3 = new EnumC0345a("FILE_FACADE", 2, 2);
            FILE_FACADE = enumC0345a3;
            EnumC0345a enumC0345a4 = new EnumC0345a("SYNTHETIC_CLASS", 3, 3);
            SYNTHETIC_CLASS = enumC0345a4;
            EnumC0345a enumC0345a5 = new EnumC0345a("MULTIFILE_CLASS", 4, 4);
            MULTIFILE_CLASS = enumC0345a5;
            EnumC0345a enumC0345a6 = new EnumC0345a("MULTIFILE_CLASS_PART", 5, 5);
            MULTIFILE_CLASS_PART = enumC0345a6;
            EnumC0345a[] enumC0345aArr = {enumC0345a, enumC0345a2, enumC0345a3, enumC0345a4, enumC0345a5, enumC0345a6};
            $VALUES = enumC0345aArr;
            $ENTRIES = Xc.b.a(enumC0345aArr);
            Companion = new C0346a();
            EnumC0345a[] values = values();
            int h11 = U.h(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (EnumC0345a enumC0345a7 : values) {
                linkedHashMap.put(Integer.valueOf(enumC0345a7.f17878id), enumC0345a7);
            }
            entryById = linkedHashMap;
        }

        private EnumC0345a(String str, int i11, int i12) {
            this.f17878id = i12;
        }

        public static EnumC0345a valueOf(String str) {
            return (EnumC0345a) Enum.valueOf(EnumC0345a.class, str);
        }

        public static EnumC0345a[] values() {
            return (EnumC0345a[]) $VALUES.clone();
        }
    }

    public a(@NotNull EnumC0345a kind, @NotNull Rd.e metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i11) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f17871a = kind;
        this.f17872b = metadataVersion;
        this.f17873c = strArr;
        this.f17874d = strArr2;
        this.f17875e = strArr3;
        this.f17876f = str;
        this.f17877g = i11;
    }

    public final String[] a() {
        return this.f17873c;
    }

    public final String[] b() {
        return this.f17874d;
    }

    @NotNull
    public final EnumC0345a c() {
        return this.f17871a;
    }

    @NotNull
    public final Rd.e d() {
        return this.f17872b;
    }

    public final String e() {
        if (this.f17871a == EnumC0345a.MULTIFILE_CLASS_PART) {
            return this.f17876f;
        }
        return null;
    }

    @NotNull
    public final List<String> f() {
        String[] strArr = this.f17871a == EnumC0345a.MULTIFILE_CLASS ? this.f17873c : null;
        List<String> e11 = strArr != null ? C7705l.e(strArr) : null;
        return e11 == null ? K.f71697a : e11;
    }

    public final String[] g() {
        return this.f17875e;
    }

    public final boolean h() {
        return (this.f17877g & 2) != 0;
    }

    public final boolean i() {
        int i11 = this.f17877g;
        return (i11 & 16) != 0 && (i11 & 32) == 0;
    }

    @NotNull
    public final String toString() {
        return this.f17871a + " version=" + this.f17872b;
    }
}
