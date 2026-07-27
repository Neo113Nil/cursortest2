package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC3779i {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3779i f7154a;
    public static final EnumC3779i b;
    public static final EnumC3779i c;
    public static final /* synthetic */ EnumC3779i[] d;

    static {
        EnumC3779i enumC3779i = new EnumC3779i("NONE", 0);
        f7154a = enumC3779i;
        EnumC3779i enumC3779i2 = new EnumC3779i("BLOCK_INIT", 1);
        b = enumC3779i2;
        EnumC3779i enumC3779i3 = new EnumC3779i("RESET_STATE", 2);
        c = enumC3779i3;
        EnumC3779i[] enumC3779iArr = {enumC3779i, enumC3779i2, enumC3779i3};
        d = enumC3779iArr;
        EnumEntriesKt.enumEntries(enumC3779iArr);
    }

    public EnumC3779i(String str, int i) {
    }

    public static EnumC3779i valueOf(String str) {
        return (EnumC3779i) Enum.valueOf(EnumC3779i.class, str);
    }

    public static EnumC3779i[] values() {
        return (EnumC3779i[]) d.clone();
    }
}
