package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ḭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0998 extends AbstractC0543 implements InterfaceC0947 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0956 f2924 = new C0956();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f2923 = StringFog.decrypt("jEJ8HXgWAqGCb38nbhQC\n", "7SYYSQFmZ/U=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2922 = StringFog.decrypt("kmAA4ea3nsOTQBny5quM1ZFg\n", "4QVhk4Xf2Kw=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2921 = StringFog.decrypt("OatNnCdq6GMusw==\n", "SsAk7GEDjQ8=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2920 = StringFog.decrypt("fUXuvv8LW8FhZvOE4g==\n", "DiCa6oZ7PpU=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0947
    /* renamed from: ﾒ */
    public final Object mo5313(C1226 c1226, String str, ArrayList arrayList, C0807 c0807, C1074 c1074) {
        char c;
        try {
            switch (str.hashCode()) {
                case -1347544616:
                    if (str.equals(f2922)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -923635536:
                    if (str.equals(f2920)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -216533736:
                    if (str.equals(f2921)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 94094958:
                    if (str.equals(StringFog.decrypt("JSYKJyQ=\n", "R1NjS0De32Y=\n"))) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 108404047:
                    if (str.equals(StringFog.decrypt("w2cU7R0=\n", "sQJniGkV180=\n"))) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 387034026:
                    if (str.equals(StringFog.decrypt("ppeYrbvmTkKGh4m6qu1rTaaB\n", "1fL539iOByw=\n"))) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 391966482:
                    if (str.equals(StringFog.decrypt("OK2M0s0EfEAwrJrs9g9cSDqlnfvH\n", "Wcnon6JgFSY=\n"))) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1067445448:
                    if (str.equals(f2923)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1423210564:
                    if (str.equals(StringFog.decrypt("Fh8nrKELhAUeHjGSmgCoGxQXNoWr\n", "d3tD4c5v7WM=\n"))) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Exception e) {
            AbstractC1086.m5875(c1226.m5929(), AbstractC1257.m5940("EQ==\n", "Nuh/1mWvR/Y=\n", AbstractC1196.m5920("D5aS1Adx5gUjiIWbECn0Dj+QidUScdcEL4iE/xA3+AMjkInUG3H/DD6Nlt5VPPQZIouEm1I=\n", "SuTgu3VRkW0=\n", new StringBuilder(), str)), e, null);
        }
        switch (c) {
            case 0:
                this.f2924.f2666 = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
                return this;
            case 1:
                this.f2924.f2665 = ((Integer) AbstractC0599.m5554(arrayList, 0, Integer.class)).intValue();
                return this;
            case 2:
                this.f2924.f2664 = ((Boolean) AbstractC0599.m5554(arrayList, 0, Boolean.class)).booleanValue();
                return this;
            case 3:
                int intValue = ((Integer) AbstractC0599.m5554(arrayList, 0, Integer.class)).intValue();
                C0956 c0956 = this.f2924;
                c0956.f1237 = intValue | c0956.f1237;
                return this;
            case 4:
                int intValue2 = ((Integer) AbstractC0599.m5554(arrayList, 0, Integer.class)).intValue();
                C0956 c09562 = this.f2924;
                c09562.f1236 = intValue2 | c09562.f1236;
                return this;
            case 5:
                boolean booleanValue = ((Boolean) AbstractC0599.m5554(arrayList, 0, Boolean.class)).booleanValue();
                int intValue3 = arrayList.size() > 1 ? ((Integer) AbstractC0599.m5554(arrayList, 1, Integer.class)).intValue() : -1;
                C0956 c09563 = this.f2924;
                c09563.f1239 = booleanValue;
                c09563.f1238 = intValue3;
                return this;
            case 6:
                this.f2924.f2663.add((Class) AbstractC0599.m5554(arrayList, 0, Class.class));
                return this;
            case 7:
                this.f2924.m5784();
                return this;
            case '\b':
                return this.f2924;
            default:
                new C0440(c1226, c1074, StringFog.decrypt("6oy2VdBkedXFi7pN3U9y\n", "rOXTObQgHLM=\n"), str).m5536(c1226.m5929());
                return null;
        }
    }
}
