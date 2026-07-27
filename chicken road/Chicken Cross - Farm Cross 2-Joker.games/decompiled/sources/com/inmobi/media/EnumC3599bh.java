package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.bh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC3599bh {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3599bh f7030a;
    public static final EnumC3599bh b;
    public static final /* synthetic */ EnumC3599bh[] c;

    static {
        EnumC3599bh enumC3599bh = new EnumC3599bh("STOPPED", 0);
        f7030a = enumC3599bh;
        EnumC3599bh enumC3599bh2 = new EnumC3599bh("STARTED", 1);
        b = enumC3599bh2;
        EnumC3599bh[] enumC3599bhArr = {enumC3599bh, enumC3599bh2};
        c = enumC3599bhArr;
        EnumEntriesKt.enumEntries(enumC3599bhArr);
    }

    public EnumC3599bh(String str, int i) {
    }

    public static EnumC3599bh valueOf(String str) {
        return (EnumC3599bh) Enum.valueOf(EnumC3599bh.class, str);
    }

    public static EnumC3599bh[] values() {
        return (EnumC3599bh[]) c.clone();
    }
}
