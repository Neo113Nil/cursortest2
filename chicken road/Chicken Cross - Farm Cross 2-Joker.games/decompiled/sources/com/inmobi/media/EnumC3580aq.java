package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.aq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC3580aq {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3580aq f7019a;
    public static final EnumC3580aq b;
    public static final /* synthetic */ EnumC3580aq[] c;

    static {
        EnumC3580aq enumC3580aq = new EnumC3580aq("HIDDEN", 0);
        f7019a = enumC3580aq;
        EnumC3580aq enumC3580aq2 = new EnumC3580aq("VISIBLE", 1);
        b = enumC3580aq2;
        EnumC3580aq[] enumC3580aqArr = {enumC3580aq, enumC3580aq2};
        c = enumC3580aqArr;
        EnumEntriesKt.enumEntries(enumC3580aqArr);
    }

    public EnumC3580aq(String str, int i) {
    }

    public static EnumC3580aq valueOf(String str) {
        return (EnumC3580aq) Enum.valueOf(EnumC3580aq.class, str);
    }

    public static EnumC3580aq[] values() {
        return (EnumC3580aq[]) c.clone();
    }
}
