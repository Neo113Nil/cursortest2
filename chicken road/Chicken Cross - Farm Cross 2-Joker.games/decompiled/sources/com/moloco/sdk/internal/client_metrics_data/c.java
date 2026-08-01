package com.moloco.sdk.internal.client_metrics_data;

import com.facebook.login.LoginLogger;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f10445a = new c("success", 0);
    public static final c b = new c(LoginLogger.EVENT_EXTRAS_FAILURE, 1);
    public static final /* synthetic */ c[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        c[] a2 = a();
        c = a2;
        d = EnumEntriesKt.enumEntries(a2);
    }

    public c(String str, int i) {
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f10445a, b};
    }

    public static EnumEntries<c> b() {
        return d;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) c.clone();
    }
}
