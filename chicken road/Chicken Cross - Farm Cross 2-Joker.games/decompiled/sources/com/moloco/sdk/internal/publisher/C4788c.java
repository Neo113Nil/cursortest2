package com.moloco.sdk.internal.publisher;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: com.moloco.sdk.internal.publisher.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4788c {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Map<t, Duration> f10604a;
    public final long b;

    /* renamed from: com.moloco.sdk.internal.publisher.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10605a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f10688a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[t.g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[t.f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f10605a = iArr;
        }
    }

    public /* synthetic */ C4788c(Map map, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, j);
    }

    public final Map<t, Duration> a() {
        return this.f10604a;
    }

    public final long b() {
        return this.b;
    }

    public final Map<t, Duration> c() {
        return this.f10604a;
    }

    public final long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4788c)) {
            return false;
        }
        C4788c c4788c = (C4788c) obj;
        return Intrinsics.areEqual(this.f10604a, c4788c.f10604a) && Duration.m9431equalsimpl0(this.b, c4788c.b);
    }

    public int hashCode() {
        return (this.f10604a.hashCode() * 31) + Duration.m9447hashCodeimpl(this.b);
    }

    public String toString() {
        return "AdCreatorConfiguration(adTimeouts=" + this.f10604a + ", defaultTimeoutDuration=" + ((Object) Duration.m9466toStringimpl(this.b)) + ')';
    }

    public C4788c(Map<t, Duration> adTimeouts, long j) {
        Intrinsics.checkNotNullParameter(adTimeouts, "adTimeouts");
        this.f10604a = adTimeouts;
        this.b = j;
    }

    public final C4788c a(Map<t, Duration> adTimeouts, long j) {
        Intrinsics.checkNotNullParameter(adTimeouts, "adTimeouts");
        return new C4788c(adTimeouts, j, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4788c a(C4788c c4788c, Map map, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c4788c.f10604a;
        }
        if ((i & 2) != 0) {
            j = c4788c.b;
        }
        return c4788c.a(map, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C4788c(Map map, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? DurationKt.toDuration(5, DurationUnit.SECONDS) : j, null);
        long duration;
        if ((i & 1) != 0) {
            t[] values = t.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
            for (t tVar : values) {
                switch (a.f10605a[tVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        duration = DurationKt.toDuration(15, DurationUnit.SECONDS);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                linkedHashMap.put(tVar, Duration.m9424boximpl(duration));
            }
            map = linkedHashMap;
        }
    }
}
