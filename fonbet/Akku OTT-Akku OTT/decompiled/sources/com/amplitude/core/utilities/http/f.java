package com.amplitude.core.utilities.http;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.IntRange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f i;
    public static final /* synthetic */ f[] j;
    public static final /* synthetic */ EnumEntries k;
    public final IntRange a;

    static {
        f fVar = new f("SUCCESS", 0, new IntRange(200, 299));
        b = fVar;
        f fVar2 = new f("BAD_REQUEST", 1, 400);
        c = fVar2;
        f fVar3 = new f("TIMEOUT", 2, 408);
        d = fVar3;
        f fVar4 = new f("PAYLOAD_TOO_LARGE", 3, WalletConstants.ERROR_CODE_UNKNOWN);
        e = fVar4;
        f fVar5 = new f("TOO_MANY_REQUESTS", 4, 429);
        f = fVar5;
        f fVar6 = new f("FAILED", 5, new IntRange(500, 599));
        i = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        j = fVarArr;
        k = EnumEntriesKt.enumEntries(fVarArr);
    }

    public f(String str, int i2, IntRange intRange) {
        this.a = intRange;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) j.clone();
    }

    public /* synthetic */ f(String str, int i2, int i3) {
        this(str, i2, new IntRange(i3, i3));
    }
}
