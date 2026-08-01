package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final l f10977a = new l("VAST_AD_EXOPLAYER_VIDEO_LAYER_ERROR", 0);
    public static final l b = new l("VAST_AD_EXOPLAYER_STYLED_PLAYER_VIEW_INFLATE_EXCEPTION_ERROR", 1);
    public static final l c = new l("VAST_AD_EXOPLAYER_SET_MEDIA_ITEM_EXCEPTION_ERROR", 2);
    public static final l d = new l("VAST_AD_EXOPLAYER_SET_MEDIA_FILE_NOT_EXISTS_ERROR", 3);
    public static final l e = new l("VAST_AD_COMPOSE_VIEW_NOT_AVAILABLE", 4);
    public static final /* synthetic */ l[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        l[] b2 = b();
        f = b2;
        g = EnumEntriesKt.enumEntries(b2);
    }

    public l(String str, int i) {
    }

    public static final /* synthetic */ l[] b() {
        return new l[]{f10977a, b, c, d, e};
    }

    public static EnumEntries<l> c() {
        return g;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
