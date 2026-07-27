package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.v2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC4149v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4149v2 f7427a;
    public static final EnumC4149v2 b;
    public static final EnumC4149v2 c;
    public static final /* synthetic */ EnumC4149v2[] d;

    static {
        EnumC4149v2 enumC4149v2 = new EnumC4149v2("OFF", 0);
        f7427a = enumC4149v2;
        EnumC4149v2 enumC4149v22 = new EnumC4149v2("OBSERVE", 1);
        b = enumC4149v22;
        EnumC4149v2 enumC4149v23 = new EnumC4149v2("RELEASE", 2);
        c = enumC4149v23;
        EnumC4149v2[] enumC4149v2Arr = {enumC4149v2, enumC4149v22, enumC4149v23};
        d = enumC4149v2Arr;
        EnumEntriesKt.enumEntries(enumC4149v2Arr);
    }

    public EnumC4149v2(String str, int i) {
    }

    public static EnumC4149v2 valueOf(String str) {
        return (EnumC4149v2) Enum.valueOf(EnumC4149v2.class, str);
    }

    public static EnumC4149v2[] values() {
        return (EnumC4149v2[]) d.clone();
    }
}
