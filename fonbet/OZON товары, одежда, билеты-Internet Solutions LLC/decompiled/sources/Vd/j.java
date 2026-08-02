package Vd;

import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;
import td.InterfaceC9835a;
import td.InterfaceC9839e;

/* loaded from: classes.dex */
public interface j {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a BOTH;
        public static final a CONFLICTS_ONLY;
        public static final a SUCCESS_ONLY;

        static {
            a aVar = new a("CONFLICTS_ONLY", 0);
            CONFLICTS_ONLY = aVar;
            a aVar2 = new a("SUCCESS_ONLY", 1);
            SUCCESS_ONLY = aVar2;
            a aVar3 = new a("BOTH", 2);
            BOTH = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b INCOMPATIBLE;
        public static final b OVERRIDABLE;
        public static final b UNKNOWN;

        static {
            b bVar = new b("OVERRIDABLE", 0);
            OVERRIDABLE = bVar;
            b bVar2 = new b("INCOMPATIBLE", 1);
            INCOMPATIBLE = bVar2;
            b bVar3 = new b(FraudMonInfo.UNKNOWN, 2);
            UNKNOWN = bVar3;
            $VALUES = new b[]{bVar, bVar2, bVar3};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    @NotNull
    b a(@NotNull InterfaceC9835a interfaceC9835a, @NotNull InterfaceC9835a interfaceC9835a2, InterfaceC9839e interfaceC9839e);

    @NotNull
    a b();
}
