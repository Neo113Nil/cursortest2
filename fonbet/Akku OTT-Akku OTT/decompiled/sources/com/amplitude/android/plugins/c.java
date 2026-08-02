package com.amplitude.android.plugins;

import android.location.Location;
import androidx.core.os.EnvironmentCompat;
import androidx.exifinterface.media.ExifInterface;
import com.amplitude.android.h;
import com.amplitude.android.y;
import com.amplitude.core.platform.k;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public class c implements k {
    public static final a Companion = new a();
    public static final Set<String> d = SetsKt.setOf((Object[]) new String[]{"", "9774d56d682e549c", EnvironmentCompat.MEDIA_UNKNOWN, "000000000000000", "Android", "DEFACE", "00000000-0000-0000-0000-000000000000"});
    public final k.a a = k.a.a;
    public com.amplitude.core.b b;
    public com.amplitude.common.android.a c;

    public static final class a {
        public static boolean a(String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return (deviceId.length() == 0 || c.d.contains(deviceId)) ? false : true;
        }
    }

    @Override // com.amplitude.core.platform.k
    public final void b(com.amplitude.core.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.b = bVar;
    }

    @Override // com.amplitude.core.platform.k
    public final void c(com.amplitude.core.b amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.c(amplitude);
        h hVar = amplitude.a;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        this.c = new com.amplitude.common.android.a(hVar.b, hVar.s, hVar.q.b("adid"), hVar.q.b("app_set_id"));
        i(hVar);
    }

    @Override // com.amplitude.core.platform.k
    public final com.amplitude.core.events.a f(com.amplitude.core.events.a event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        h hVar = h().a;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        if (event.c == null) {
            event.c = Long.valueOf(System.currentTimeMillis());
            Unit unit = Unit.INSTANCE;
        }
        if (event.f == null) {
            event.f = UUID.randomUUID().toString();
            Unit unit2 = Unit.INSTANCE;
        }
        if (event.B == null) {
            event.B = "amplitude-analytics-android/1.22.4";
            Unit unit3 = Unit.INSTANCE;
        }
        if (event.a == null) {
            event.a = h().b.a;
            Unit unit4 = Unit.INSTANCE;
        }
        if (event.b == null) {
            event.b = h().b.b;
            Unit unit5 = Unit.INSTANCE;
        }
        y yVar = hVar.q;
        if (hVar.r) {
            y.Companion.getClass();
            y other = new y();
            for (int i = 0; i < 4; i++) {
                other.a(y.b[i]);
            }
            yVar.getClass();
            Intrinsics.checkNotNullParameter(other, "other");
            Iterator it = other.a.iterator();
            while (it.hasNext()) {
                yVar.a((String) it.next());
            }
        }
        com.amplitude.common.android.a aVar = null;
        if (yVar.b("version_name")) {
            com.amplitude.common.android.a aVar2 = this.c;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar2 = null;
            }
            event.j = aVar2.b().c;
        }
        if (yVar.b("os_name")) {
            com.amplitude.common.android.a aVar3 = this.c;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar3 = null;
            }
            aVar3.b().getClass();
            event.l = "android";
        }
        if (yVar.b("os_version")) {
            com.amplitude.common.android.a aVar4 = this.c;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar4 = null;
            }
            event.m = aVar4.b().d;
        }
        if (yVar.b("device_brand")) {
            com.amplitude.common.android.a aVar5 = this.c;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar5 = null;
            }
            event.n = aVar5.b().e;
        }
        if (yVar.b("device_manufacturer")) {
            com.amplitude.common.android.a aVar6 = this.c;
            if (aVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar6 = null;
            }
            event.o = aVar6.b().f;
        }
        if (yVar.b("device_model")) {
            com.amplitude.common.android.a aVar7 = this.c;
            if (aVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar7 = null;
            }
            event.p = aVar7.b().g;
        }
        if (yVar.b("carrier")) {
            com.amplitude.common.android.a aVar8 = this.c;
            if (aVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar8 = null;
            }
            event.q = aVar8.b().h;
        }
        if (yVar.b("ip_address") && event.C == null) {
            event.C = "$remote";
            Unit unit6 = Unit.INSTANCE;
        }
        if (yVar.b("country") && event.C != "$remote") {
            com.amplitude.common.android.a aVar9 = this.c;
            if (aVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar9 = null;
            }
            event.r = aVar9.b().b;
        }
        if (yVar.b("language")) {
            com.amplitude.common.android.a aVar10 = this.c;
            if (aVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar10 = null;
            }
            event.A = aVar10.b().i;
        }
        if (yVar.b("platform")) {
            event.k = "Android";
        }
        if (yVar.b("lat_lng")) {
            com.amplitude.common.android.a aVar11 = this.c;
            if (aVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar11 = null;
            }
            Location c = aVar11.c();
            if (c != null) {
                event.g = Double.valueOf(c.getLatitude());
                event.h = Double.valueOf(c.getLongitude());
            }
        }
        if (yVar.b("adid")) {
            com.amplitude.common.android.a aVar12 = this.c;
            if (aVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar12 = null;
            }
            String str2 = aVar12.b().a;
            if (str2 != null) {
                event.x = str2;
            }
        }
        if (yVar.b("app_set_id")) {
            com.amplitude.common.android.a aVar13 = this.c;
            if (aVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
            } else {
                aVar = aVar13;
            }
            String str3 = aVar.b().k;
            if (str3 != null) {
                event.y = str3;
            }
        }
        if (event.M == null && (str = h().a.j) != null) {
            event.M = str;
            Unit unit7 = Unit.INSTANCE;
        }
        if (event.D == null) {
            h hVar2 = h().a;
        }
        if (event.E == null) {
            h hVar3 = h().a;
        }
        return event;
    }

    @Override // com.amplitude.core.platform.k
    public final k.a getType() {
        return this.a;
    }

    public final com.amplitude.core.b h() {
        com.amplitude.core.b bVar = this.b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
        return null;
    }

    public final void i(h configuration) {
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String str = configuration.A;
        if (str != null) {
            j(str);
            return;
        }
        String str2 = h().b.b;
        if (str2 != null) {
            Companion.getClass();
            if (a.a(str2)) {
                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str2, ExifInterface.LATITUDE_SOUTH, false, 2, null);
                if (!endsWith$default) {
                    return;
                }
            }
        }
        com.amplitude.common.android.a aVar = null;
        if (configuration.o) {
            com.amplitude.common.android.a aVar2 = this.c;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                aVar2 = null;
            }
            if (!aVar2.b().j) {
                com.amplitude.common.android.a aVar3 = this.c;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                    aVar3 = null;
                }
                String str3 = aVar3.b().a;
                if (str3 != null) {
                    Companion.getClass();
                    if (a.a(str3)) {
                        j(str3);
                        return;
                    }
                }
            }
        }
        if (configuration.p) {
            com.amplitude.common.android.a aVar4 = this.c;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
            } else {
                aVar = aVar4;
            }
            String str4 = aVar.b().k;
            if (str4 != null) {
                Companion.getClass();
                if (a.a(str4)) {
                    j(str4.concat(ExifInterface.LATITUDE_SOUTH));
                    return;
                }
            }
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        j(uuid + 'R');
    }

    public void j(String str) {
        throw null;
    }
}
