package dev.fluttercommunity.workmanager;

import android.os.Build;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import dev.fluttercommunity.workmanager.pigeon.EnumC0980a;
import dev.fluttercommunity.workmanager.pigeon.d;
import dev.fluttercommunity.workmanager.pigeon.e;
import dev.fluttercommunity.workmanager.pigeon.h;
import dev.fluttercommunity.workmanager.pigeon.j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWorkManagerUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkManagerUtils.kt\ndev/fluttercommunity/workmanager/WorkManagerUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,253:1\n1#2:254\n1#2:266\n139#3,10:255\n221#3:265\n222#3:267\n149#3:268\n*S KotlinDebug\n*F\n+ 1 WorkManagerUtils.kt\ndev/fluttercommunity/workmanager/WorkManagerUtilsKt\n*L\n94#1:266\n94#1:255,10\n94#1:265\n94#1:267\n94#1:268\n*E\n"})
/* loaded from: classes4.dex */
public final class g {
    public static final ExistingWorkPolicy a = ExistingWorkPolicy.KEEP;
    public static final ExistingPeriodicWorkPolicy b = ExistingPeriodicWorkPolicy.UPDATE;
    public static final Constraints c = Constraints.NONE;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[dev.fluttercommunity.workmanager.pigeon.e.values().length];
            try {
                e.a aVar = dev.fluttercommunity.workmanager.pigeon.e.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e.a aVar2 = dev.fluttercommunity.workmanager.pigeon.e.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e.a aVar3 = dev.fluttercommunity.workmanager.pigeon.e.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e.a aVar4 = dev.fluttercommunity.workmanager.pigeon.e.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[dev.fluttercommunity.workmanager.pigeon.d.values().length];
            try {
                d.a aVar5 = dev.fluttercommunity.workmanager.pigeon.d.Companion;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d.a aVar6 = dev.fluttercommunity.workmanager.pigeon.d.Companion;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d.a aVar7 = dev.fluttercommunity.workmanager.pigeon.d.Companion;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[dev.fluttercommunity.workmanager.pigeon.j.values().length];
            try {
                j.a aVar8 = dev.fluttercommunity.workmanager.pigeon.j.Companion;
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                j.a aVar9 = dev.fluttercommunity.workmanager.pigeon.j.Companion;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[dev.fluttercommunity.workmanager.pigeon.h.values().length];
            try {
                h.a aVar10 = dev.fluttercommunity.workmanager.pigeon.h.Companion;
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                h.a aVar11 = dev.fluttercommunity.workmanager.pigeon.h.Companion;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                h.a aVar12 = dev.fluttercommunity.workmanager.pigeon.h.Companion;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                h.a aVar13 = dev.fluttercommunity.workmanager.pigeon.h.Companion;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                h.a aVar14 = dev.fluttercommunity.workmanager.pigeon.h.Companion;
                iArr4[4] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                h.a aVar15 = dev.fluttercommunity.workmanager.pigeon.h.Companion;
                iArr4[5] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[EnumC0980a.values().length];
            try {
                EnumC0980a.C0147a c0147a = EnumC0980a.Companion;
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                EnumC0980a.C0147a c0147a2 = EnumC0980a.Companion;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final Map a(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            Pair pair = (str == null || value == null) ? null : TuplesKt.to(str, value);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    public static final Constraints b(dev.fluttercommunity.workmanager.pigeon.c cVar) {
        NetworkType networkType;
        Constraints.Builder builder = new Constraints.Builder();
        dev.fluttercommunity.workmanager.pigeon.h hVar = cVar.a;
        if (hVar != null) {
            switch (a.$EnumSwitchMapping$3[hVar.ordinal()]) {
                case 1:
                    networkType = NetworkType.CONNECTED;
                    break;
                case 2:
                    networkType = NetworkType.METERED;
                    break;
                case 3:
                    networkType = NetworkType.NOT_REQUIRED;
                    break;
                case 4:
                    networkType = NetworkType.NOT_ROAMING;
                    break;
                case 5:
                    networkType = NetworkType.UNMETERED;
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT < 30) {
                        networkType = NetworkType.UNMETERED;
                        break;
                    } else {
                        networkType = NetworkType.TEMPORARILY_UNMETERED;
                        break;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
            builder.setRequiredNetworkType(networkType);
        }
        Boolean bool = cVar.b;
        if (bool != null) {
            builder.setRequiresBatteryNotLow(bool.booleanValue());
        }
        Boolean bool2 = cVar.c;
        if (bool2 != null) {
            builder.setRequiresCharging(bool2.booleanValue());
        }
        Boolean bool3 = cVar.d;
        if (bool3 != null) {
            builder.setRequiresDeviceIdle(bool3.booleanValue());
        }
        Boolean bool4 = cVar.e;
        if (bool4 != null) {
            builder.setRequiresStorageNotLow(bool4.booleanValue());
        }
        return builder.build();
    }
}
