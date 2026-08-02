package Jh;

import Qj0.C3887g;
import Qj0.U;
import ci0.C5836a;
import ci0.InterfaceC5837b;
import di0.C6201a;
import di0.C6203c;
import java.util.Iterator;
import k10.EnumC7467b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.MetricType;
import ve.EnumC10311b;

/* loaded from: classes6.dex */
public final class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14767a;

        static {
            int[] iArr = new int[EnumC7467b.values().length];
            try {
                iArr[EnumC7467b.SCREEN_CREATE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7467b.DECODING_TIME_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7467b.DECODING_TIME_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7467b.PREPARE_PRESENTATION_DATA_TIME_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC7467b.PREPARE_PRESENTATION_DATA_TIME_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC7467b.LAYOUT_TIME_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC7467b.LAYOUT_TIME_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC7467b.LOADER_TIME_START.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC7467b.LOADER_TIME_END.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC7467b.CACHE_TIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC7467b.PREFETCH_TIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f14767a = iArr;
        }
    }

    private static final long a(C6201a c6201a, EnumC7467b enumC7467b) {
        Long b11 = c6201a.b(enumC7467b);
        if (b11 != null) {
            return b11.longValue();
        }
        return 0L;
    }

    private static final long b(C6201a c6201a, EnumC7467b enumC7467b, EnumC7467b enumC7467b2) {
        long a11 = a(c6201a, enumC7467b2);
        long a12 = a(c6201a, enumC7467b);
        if (a11 == 0 || a12 == 0) {
            return 0L;
        }
        return a11 - a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(@NotNull String uuid, @NotNull U targetTrace) {
        U u11;
        long longValue;
        long longValue2;
        long longValue3;
        boolean z11;
        Long valueOf;
        Long valueOf2;
        Long b11;
        EnumC7467b enumC7467b;
        C3887g c3887g;
        Intrinsics.checkNotNullParameter(targetTrace, "targetTrace");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        C6201a endTrace = C6203c.f61631a.endTrace(uuid);
        if (endTrace == null) {
            return;
        }
        Iterator it = endTrace.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                MetricType metricType = MetricType.REDIRECT_TIME;
                EnumC7467b enumC7467b2 = EnumC7467b.REDIRECT_TIME_START;
                EnumC7467b enumC7467b3 = EnumC7467b.REDIRECT_TIME_END;
                d(targetTrace, metricType, b(endTrace, enumC7467b2, enumC7467b3));
                long b12 = b(endTrace, enumC7467b2, enumC7467b3);
                EnumC7467b enumC7467b4 = EnumC7467b.SCREEN_CREATE_TIME;
                d(targetTrace, MetricType.PREPARE_PAGE_TIME, b12 + a(endTrace, enumC7467b4));
                EnumC7467b enumC7467b5 = EnumC7467b.COMPOSER_REQUEST_PREPARE_TIME_START;
                Long b13 = endTrace.b(enumC7467b5);
                if (b13 != null) {
                    long longValue4 = b13.longValue();
                    Long b14 = endTrace.b(EnumC7467b.COMPOSER_REQUEST_PREPARE_TIME_END);
                    if (b14 != null) {
                        long longValue5 = b14.longValue();
                        Long b15 = endTrace.b(EnumC7467b.NETWORK_REQUEST_PREPARE_TIME_START);
                        if (b15 != null) {
                            long longValue6 = b15.longValue();
                            Long b16 = endTrace.b(EnumC7467b.NETWORK_REQUEST_PREPARE_TIME_END);
                            if (b16 != null) {
                                long longValue7 = b16.longValue();
                                u11 = targetTrace;
                                U.p(u11, MetricType.REQUEST_PREPARE_TIME_START, longValue6, false, 4);
                                U.p(u11, MetricType.REQUEST_PREPARE_TIME_END, (longValue5 - longValue4) + longValue7, false, 4);
                                Long b17 = endTrace.b(EnumC7467b.NETWORK_ADDITIONAL_REQUEST_TIME_START);
                                longValue = b17 == null ? b17.longValue() : 0L;
                                Long b18 = endTrace.b(EnumC7467b.NETWORK_ADDITIONAL_REQUEST_TIME_END);
                                long longValue8 = b18 == null ? b18.longValue() : 0L;
                                EnumC7467b enumC7467b6 = EnumC7467b.ADDITIONAL_REQUEST_TIME_START;
                                Long b19 = endTrace.b(enumC7467b6);
                                longValue2 = b19 == null ? b19.longValue() : 0L;
                                EnumC7467b enumC7467b7 = EnumC7467b.ADDITIONAL_REQUEST_TIME_END;
                                Long b21 = endTrace.b(enumC7467b7);
                                longValue3 = b21 == null ? b21.longValue() : 0L;
                                Object[] objArr = longValue != 0 || longValue8 == 0;
                                z11 = longValue2 != 0 || longValue3 == 0;
                                if (!z11 && objArr == true) {
                                    longValue8 = 0;
                                    longValue2 = 0;
                                } else if (!z11 || objArr == true) {
                                    valueOf = Long.valueOf(longValue2);
                                    if (longValue2 == 0) {
                                        valueOf = null;
                                    }
                                    if (valueOf != null) {
                                        longValue = valueOf.longValue();
                                    }
                                    valueOf2 = longValue3 != 0 ? Long.valueOf(longValue3) : null;
                                    if (valueOf2 != null) {
                                        longValue8 = valueOf2.longValue();
                                    }
                                    longValue2 = longValue;
                                } else {
                                    longValue8 = (longValue8 - longValue) + longValue3;
                                }
                                u11.o(MetricType.ADDITIONAL_REQUESTS_TIME_START, longValue2, true);
                                u11.o(MetricType.ADDITIONAL_REQUESTS_TIME_END, longValue8, true);
                                MetricType metricType2 = MetricType.TOTAL_TIME_START;
                                b11 = endTrace.b(EnumC7467b.TOTAL_TIME_START);
                                if (b11 == null) {
                                    enumC7467b = enumC7467b7;
                                    U.p(u11, metricType2, b11.longValue(), false, 4);
                                    MetricType metricType3 = MetricType.TOTAL_TIME_END;
                                    Long b22 = endTrace.b(EnumC7467b.TOTAL_TIME_END);
                                    if (b22 != null) {
                                        long longValue9 = b22.longValue();
                                        Long b23 = endTrace.b(enumC7467b4);
                                        long longValue10 = b23 != null ? b23.longValue() : 0L;
                                        u11 = targetTrace;
                                        U.p(u11, metricType3, longValue9 + longValue10, false, 4);
                                    } else {
                                        u11 = targetTrace;
                                    }
                                } else {
                                    enumC7467b = enumC7467b7;
                                }
                                d(u11, MetricType.FETCH_TIME, b(endTrace, enumC7467b5, EnumC7467b.COMPOSER_REQUEST_PREPARE_TIME_END) + b(endTrace, EnumC7467b.NETWORK_REQUEST_PREPARE_TIME_START, EnumC7467b.NETWORK_CALL_END) + b(endTrace, EnumC7467b.DECODING_TIME_START, EnumC7467b.DECODING_TIME_END) + b(endTrace, enumC7467b6, enumC7467b));
                                d(u11, MetricType.PRESENTATION_TIME, a(endTrace, EnumC7467b.LAYOUT_TIME_END) - a(endTrace, EnumC7467b.PREPARE_PRESENTATION_DATA_TIME_START));
                                return;
                            }
                        }
                    }
                }
                u11 = targetTrace;
                Long b172 = endTrace.b(EnumC7467b.NETWORK_ADDITIONAL_REQUEST_TIME_START);
                if (b172 == null) {
                }
                Long b182 = endTrace.b(EnumC7467b.NETWORK_ADDITIONAL_REQUEST_TIME_END);
                if (b182 == null) {
                }
                EnumC7467b enumC7467b62 = EnumC7467b.ADDITIONAL_REQUEST_TIME_START;
                Long b192 = endTrace.b(enumC7467b62);
                if (b192 == null) {
                }
                EnumC7467b enumC7467b72 = EnumC7467b.ADDITIONAL_REQUEST_TIME_END;
                Long b212 = endTrace.b(enumC7467b72);
                if (b212 == null) {
                }
                if (longValue != 0) {
                }
                if (longValue2 != 0) {
                }
                if (!z11) {
                }
                if (z11) {
                }
                valueOf = Long.valueOf(longValue2);
                if (longValue2 == 0) {
                }
                if (valueOf != null) {
                }
                if (longValue3 != 0) {
                }
                if (valueOf2 != null) {
                }
                longValue2 = longValue;
                u11.o(MetricType.ADDITIONAL_REQUESTS_TIME_START, longValue2, true);
                u11.o(MetricType.ADDITIONAL_REQUESTS_TIME_END, longValue8, true);
                MetricType metricType22 = MetricType.TOTAL_TIME_START;
                b11 = endTrace.b(EnumC7467b.TOTAL_TIME_START);
                if (b11 == null) {
                }
                d(u11, MetricType.FETCH_TIME, b(endTrace, enumC7467b5, EnumC7467b.COMPOSER_REQUEST_PREPARE_TIME_END) + b(endTrace, EnumC7467b.NETWORK_REQUEST_PREPARE_TIME_START, EnumC7467b.NETWORK_CALL_END) + b(endTrace, EnumC7467b.DECODING_TIME_START, EnumC7467b.DECODING_TIME_END) + b(endTrace, enumC7467b62, enumC7467b));
                d(u11, MetricType.PRESENTATION_TIME, a(endTrace, EnumC7467b.LAYOUT_TIME_END) - a(endTrace, EnumC7467b.PREPARE_PRESENTATION_DATA_TIME_START));
                return;
            }
            C5836a c5836a = (C5836a) it.next();
            Intrinsics.f(c5836a);
            InterfaceC5837b a11 = c5836a.a();
            EnumC7467b enumC7467b8 = a11 instanceof EnumC7467b ? (EnumC7467b) a11 : null;
            if (enumC7467b8 != null) {
                switch (a.f14767a[enumC7467b8.ordinal()]) {
                    case 1:
                        c3887g = Jh.a.f14753k;
                        long b24 = c5836a.b();
                        b.Companion companion = kotlin.time.b.INSTANCE;
                        targetTrace.o(c3887g, kotlin.time.b.h(kotlin.time.c.h(b24, EnumC10311b.NANOSECONDS)), true);
                        break;
                    case 2:
                        targetTrace.o(MetricType.DECODING_TIME_START, c5836a.b(), true);
                        break;
                    case 3:
                        targetTrace.o(MetricType.DECODING_TIME_END, c5836a.b(), true);
                        break;
                    case 4:
                        targetTrace.o(MetricType.PREPARE_PRESENTATION_DATA_TIME_START, c5836a.b(), true);
                        break;
                    case 5:
                        targetTrace.o(MetricType.PREPARE_PRESENTATION_DATA_TIME_END, c5836a.b(), true);
                        break;
                    case 6:
                        targetTrace.o(MetricType.LAYOUT_TIME_START, c5836a.b(), true);
                        break;
                    case 7:
                        targetTrace.o(MetricType.LAYOUT_TIME_END, c5836a.b(), true);
                        break;
                    case 8:
                        targetTrace.o(MetricType.LOADER_TIME_START, c5836a.b(), true);
                        break;
                    case 9:
                        targetTrace.o(MetricType.LOADER_TIME_END, c5836a.b(), true);
                        break;
                    case 10:
                        d(targetTrace, MetricType.CACHE_TIME, c5836a.b());
                        break;
                    case 11:
                        d(targetTrace, MetricType.PREFETCH_TIME, c5836a.b());
                        break;
                }
            }
        }
    }

    private static final void d(U u11, MetricType metricType, long j11) {
        b.Companion companion = kotlin.time.b.INSTANCE;
        u11.o(metricType, kotlin.time.b.h(kotlin.time.c.h(j11, EnumC10311b.NANOSECONDS)), true);
    }
}
