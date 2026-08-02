package S70;

import B0.A0;
import Xc.b;
import java.util.List;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SHEET_1;
    public static final a SHEET_2;
    public static final a SHEET_3;
    public static final a SHEET_4;

    @NotNull
    private final String fileName;
    private final List<EnumC0515a> placeholders;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: S70.a$a, reason: collision with other inner class name */
    public static final class EnumC0515a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC0515a[] $VALUES;
        public static final EnumC0515a BANK_KEY;
        public static final EnumC0515a DESCRIPTION_KEY;
        public static final EnumC0515a TYPE_ENTER_KEY;

        static {
            EnumC0515a enumC0515a = new EnumC0515a("TYPE_ENTER_KEY", 0);
            TYPE_ENTER_KEY = enumC0515a;
            EnumC0515a enumC0515a2 = new EnumC0515a("DESCRIPTION_KEY", 1);
            DESCRIPTION_KEY = enumC0515a2;
            EnumC0515a enumC0515a3 = new EnumC0515a("BANK_KEY", 2);
            BANK_KEY = enumC0515a3;
            EnumC0515a[] enumC0515aArr = {enumC0515a, enumC0515a2, enumC0515a3};
            $VALUES = enumC0515aArr;
            $ENTRIES = b.a(enumC0515aArr);
        }

        private EnumC0515a() {
            throw null;
        }

        public static EnumC0515a valueOf(String str) {
            return (EnumC0515a) Enum.valueOf(EnumC0515a.class, str);
        }

        public static EnumC0515a[] values() {
            return (EnumC0515a[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public final String toString() {
            return A0.b("<", name(), ">");
        }
    }

    static {
        EnumC0515a enumC0515a = EnumC0515a.TYPE_ENTER_KEY;
        a aVar = new a(0, C7714v.a0(enumC0515a), "SHEET_1", "cbottom_pinpad_sheet_1.json");
        SHEET_1 = aVar;
        EnumC0515a enumC0515a2 = EnumC0515a.DESCRIPTION_KEY;
        EnumC0515a enumC0515a3 = EnumC0515a.BANK_KEY;
        a aVar2 = new a(1, C7714v.b0(enumC0515a2, enumC0515a3), "SHEET_2", "cbottom_pinpad_sheet_2.json");
        SHEET_2 = aVar2;
        a aVar3 = new a(2, null, "SHEET_3", "cbottom_pinpad_sheet_3.json");
        SHEET_3 = aVar3;
        a aVar4 = new a(3, C7714v.b0(enumC0515a, enumC0515a3), "SHEET_4", "cbottom_pinpad_sheet_4.json");
        SHEET_4 = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = b.a(aVarArr);
    }

    private a(int i11, List list, String str, String str2) {
        this.fileName = str2;
        this.placeholders = list;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.fileName;
    }

    public final List<EnumC0515a> b() {
        return this.placeholders;
    }
}
