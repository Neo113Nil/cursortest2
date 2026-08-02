package com.amplitude.common;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* loaded from: classes3.dex */
public interface a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.amplitude.common.a$a, reason: collision with other inner class name */
    public static final class EnumC0038a {
        public static final EnumC0038a a;
        public static final EnumC0038a b;
        public static final EnumC0038a c;
        public static final EnumC0038a d;
        public static final /* synthetic */ EnumC0038a[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            EnumC0038a enumC0038a = new EnumC0038a("DEBUG", 0);
            a = enumC0038a;
            EnumC0038a enumC0038a2 = new EnumC0038a("INFO", 1);
            b = enumC0038a2;
            EnumC0038a enumC0038a3 = new EnumC0038a("WARN", 2);
            c = enumC0038a3;
            EnumC0038a enumC0038a4 = new EnumC0038a("ERROR", 3);
            d = enumC0038a4;
            EnumC0038a[] enumC0038aArr = {enumC0038a, enumC0038a2, enumC0038a3, enumC0038a4, new EnumC0038a("OFF", 4)};
            e = enumC0038aArr;
            f = EnumEntriesKt.enumEntries(enumC0038aArr);
        }

        public EnumC0038a() {
            throw null;
        }

        public static EnumC0038a valueOf(String str) {
            return (EnumC0038a) Enum.valueOf(EnumC0038a.class, str);
        }

        public static EnumC0038a[] values() {
            return (EnumC0038a[]) e.clone();
        }
    }

    void a();

    void b(String str);

    void c(String str);

    void d(String str);

    void e(EnumC0038a enumC0038a);
}
