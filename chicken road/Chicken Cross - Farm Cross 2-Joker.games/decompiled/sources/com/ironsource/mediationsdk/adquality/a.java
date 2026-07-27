package com.ironsource.mediationsdk.adquality;

import com.ironsource.C4389e9;
import com.ironsource.EnumC4644se;
import com.ironsource.L6;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8368a = new b(null);
    private static EnumC1330a b = EnumC1330a.DONT_INITIALIZE;

    /* renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC1330a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);

        public static final C1331a b = new C1331a(null);

        /* renamed from: a, reason: collision with root package name */
        private final int f8369a;

        /* renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C1331a {
            public /* synthetic */ C1331a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC1330a a(int i) {
                EnumC1330a enumC1330a;
                EnumC1330a[] values = EnumC1330a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        enumC1330a = null;
                        break;
                    }
                    enumC1330a = values[i2];
                    if (enumC1330a.b() == i) {
                        break;
                    }
                    i2++;
                }
                return enumC1330a == null ? EnumC1330a.DONT_INITIALIZE : enumC1330a;
            }

            private C1331a() {
            }
        }

        EnumC1330a(int i) {
            this.f8369a = i;
        }

        public final int b() {
            return this.f8369a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC1330a a() {
            return a.b;
        }

        private b() {
        }

        public final void a(EnumC1330a enumC1330a) {
            Intrinsics.checkNotNullParameter(enumC1330a, "<set-?>");
            a.b = enumC1330a;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8370a;

        static {
            int[] iArr = new int[EnumC1330a.values().length];
            try {
                iArr[EnumC1330a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1330a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1330a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8370a = iArr;
        }
    }

    public final boolean b() {
        EnumC4644se enumC4644se;
        JSONArray optJSONArray = new C4389e9().a().optJSONArray(L6.g0);
        if (optJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = optJSONArray.getInt(i);
            EnumC4644se[] values = EnumC4644se.values();
            int length2 = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    enumC4644se = null;
                    break;
                }
                enumC4644se = values[i3];
                if (enumC4644se.b() == i2) {
                    break;
                }
                i3++;
            }
            if (enumC4644se != null) {
                linkedHashSet.add(enumC4644se);
            }
        }
        int i4 = c.f8370a[b.ordinal()];
        if (i4 == 1) {
            return linkedHashSet.contains(EnumC4644se.LEVEL_PLAY_INIT);
        }
        if (i4 == 2) {
            return linkedHashSet.contains(EnumC4644se.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC4644se.EXTERNAL_MEDIATION_INIT);
        }
        if (i4 != 3) {
            return false;
        }
        return linkedHashSet.contains(EnumC4644se.EXTERNAL_MEDIATION_INIT);
    }

    public final void a(int i) {
        b = EnumC1330a.b.a(i);
    }
}
