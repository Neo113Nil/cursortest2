package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10968a = new b("FULLSCREEN_AD_SHOW_FAILED_NO_SUPPORTED_TYPE", 0);
    public static final b b = new b("FULLSCREEN_AD_COMPOSE_VIEW_NOT_AVAILABLE", 1);
    public static final /* synthetic */ b[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        b[] b2 = b();
        c = b2;
        d = EnumEntriesKt.enumEntries(b2);
    }

    public b(String str, int i) {
    }

    public static final /* synthetic */ b[] b() {
        return new b[]{f10968a, b};
    }

    public static EnumEntries<b> c() {
        return d;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) c.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
