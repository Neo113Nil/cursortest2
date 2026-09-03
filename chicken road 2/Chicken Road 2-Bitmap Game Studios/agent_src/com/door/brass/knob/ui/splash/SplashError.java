package com.door.brass.knob.ui.splash;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/splash/SplashError;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplashError {
    public static final /* synthetic */ EnumEntries Uo5pffGf8LUU;
    public static final SplashError b41X89IqSbKt;
    public static final SplashError gmXBnHsR2YSm;
    public static final /* synthetic */ SplashError[] i7xAcZoXXiIt;
    public static final SplashError oyjLVtGms9eZwJ0;

    static {
        SplashError splashError = new SplashError("NO_CONNECTION", 0);
        oyjLVtGms9eZwJ0 = splashError;
        SplashError splashError2 = new SplashError("TIMEOUT", 1);
        b41X89IqSbKt = splashError2;
        SplashError splashError3 = new SplashError("UNEXPECTED", 2);
        gmXBnHsR2YSm = splashError3;
        SplashError[] splashErrorArr = {splashError, splashError2, splashError3};
        i7xAcZoXXiIt = splashErrorArr;
        Uo5pffGf8LUU = EnumEntriesKt.yzPsTade5rL7D3(splashErrorArr);
    }

    public static SplashError valueOf(String str) {
        return (SplashError) Enum.valueOf(SplashError.class, str);
    }

    public static SplashError[] values() {
        return (SplashError[]) i7xAcZoXXiIt.clone();
    }
}
