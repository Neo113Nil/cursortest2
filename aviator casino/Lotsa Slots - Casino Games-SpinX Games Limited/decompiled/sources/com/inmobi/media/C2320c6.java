package com.inmobi.media;

/* renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2320c6 {
    public static com.inmobi.media.EnumC2372e6 a(int i) {
        if (400 <= i && 500 > i) {
            return com.inmobi.media.EnumC2372e6.f;
        }
        if (200 < i && 300 > i) {
            return com.inmobi.media.EnumC2372e6.g;
        }
        com.inmobi.media.EnumC2372e6 enumC2372e6 = (com.inmobi.media.EnumC2372e6) com.inmobi.media.EnumC2372e6.c.get(i);
        return enumC2372e6 == null ? com.inmobi.media.EnumC2372e6.d : enumC2372e6;
    }
}
