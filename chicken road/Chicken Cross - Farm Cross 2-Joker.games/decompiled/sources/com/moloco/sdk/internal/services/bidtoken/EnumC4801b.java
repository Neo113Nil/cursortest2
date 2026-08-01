package com.moloco.sdk.internal.services.bidtoken;

import androidx.media3.common.PlaybackException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.moloco.sdk.internal.services.bidtoken.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC4801b {
    public static final EnumC4801b b = new EnumC4801b("UNKNOWN", 0, -100);
    public static final EnumC4801b c = new EnumC4801b("HTTP_REQUEST_TIMEOUT", 1, -101);
    public static final EnumC4801b d = new EnumC4801b("UNKNOWN_HOST", 2, PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
    public static final /* synthetic */ EnumC4801b[] e;
    public static final /* synthetic */ EnumEntries f;

    /* renamed from: a, reason: collision with root package name */
    public final int f10737a;

    static {
        EnumC4801b[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
    }

    public EnumC4801b(String str, int i, int i2) {
        this.f10737a = i2;
    }

    public static final /* synthetic */ EnumC4801b[] a() {
        return new EnumC4801b[]{b, c, d};
    }

    public static EnumEntries<EnumC4801b> b() {
        return f;
    }

    public static EnumC4801b valueOf(String str) {
        return (EnumC4801b) Enum.valueOf(EnumC4801b.class, str);
    }

    public static EnumC4801b[] values() {
        return (EnumC4801b[]) e.clone();
    }

    public final int c() {
        return this.f10737a;
    }
}
