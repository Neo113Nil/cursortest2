package com.bbflight.background_downloader;

import com.google.firebase.messaging.Constants;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.bbflight.background_downloader.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0668s0 {
    public static final EnumC0668s0 a;
    public static final EnumC0668s0 b;
    public static final EnumC0668s0 c;
    public static final EnumC0668s0 d;
    public static final /* synthetic */ EnumC0668s0[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        EnumC0668s0 enumC0668s0 = new EnumC0668s0("running", 0);
        a = enumC0668s0;
        EnumC0668s0 enumC0668s02 = new EnumC0668s0("complete", 1);
        b = enumC0668s02;
        EnumC0668s0 enumC0668s03 = new EnumC0668s0(Constants.IPC_BUNDLE_KEY_SEND_ERROR, 2);
        c = enumC0668s03;
        EnumC0668s0 enumC0668s04 = new EnumC0668s0("paused", 3);
        d = enumC0668s04;
        EnumC0668s0[] enumC0668s0Arr = {enumC0668s0, enumC0668s02, enumC0668s03, enumC0668s04};
        e = enumC0668s0Arr;
        f = EnumEntriesKt.enumEntries(enumC0668s0Arr);
    }

    public EnumC0668s0() {
        throw null;
    }

    public static EnumC0668s0 valueOf(String str) {
        return (EnumC0668s0) Enum.valueOf(EnumC0668s0.class, str);
    }

    public static EnumC0668s0[] values() {
        return (EnumC0668s0[]) e.clone();
    }
}
