package com.inmobi.media;

import android.util.SparseArray;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.o2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC3952o2 {
    public static final C3924n2 b;
    public static final SparseArray c;
    public static final EnumC3952o2 d;
    public static final EnumC3952o2 e;
    public static final /* synthetic */ EnumC3952o2[] f;

    /* renamed from: a, reason: collision with root package name */
    public final int f7277a;

    static {
        EnumC3952o2 enumC3952o2 = new EnumC3952o2(0, 0, "UNKNOWN");
        d = enumC3952o2;
        EnumC3952o2 enumC3952o22 = new EnumC3952o2(1, 1, "PLAYING");
        e = enumC3952o22;
        EnumC3952o2[] enumC3952o2Arr = {enumC3952o2, enumC3952o22, new EnumC3952o2(2, 2, "PAUSED"), new EnumC3952o2(3, 3, "COMPLETED")};
        f = enumC3952o2Arr;
        EnumEntriesKt.enumEntries(enumC3952o2Arr);
        b = new C3924n2();
        c = new SparseArray();
        for (EnumC3952o2 enumC3952o23 : values()) {
            c.put(enumC3952o23.f7277a, enumC3952o23);
        }
    }

    public EnumC3952o2(int i, int i2, String str) {
        this.f7277a = i2;
    }

    public static EnumC3952o2 valueOf(String str) {
        return (EnumC3952o2) Enum.valueOf(EnumC3952o2.class, str);
    }

    public static EnumC3952o2[] values() {
        return (EnumC3952o2[]) f.clone();
    }
}
