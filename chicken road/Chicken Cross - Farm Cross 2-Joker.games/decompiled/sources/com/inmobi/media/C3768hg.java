package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.hg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3768hg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7144a;
    public final Z9 b;
    public String c;
    public boolean d;
    public final SignalsConfig.NovatiqConfig e;

    public C3768hg(Context context, Z9 z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7144a = context;
        this.b = z9;
        this.c = "";
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        this.e = ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getNovatiqConfig();
        b();
    }

    public final C3711fg a() {
        if (this.d) {
            return new C3711fg(MapsKt.hashMapOf(TuplesKt.to("n-h-id", this.c)));
        }
        Z9 z9 = this.b;
        if (z9 != null) {
            z9.a("NovatiqDataHandler", "Novatiq disabled. skip");
        }
        return new C3711fg(MapsKt.emptyMap());
    }

    public final void b() {
        String str;
        Context context = this.f7144a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.e.getIsNovatiqEnabled()) {
            Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null || (str = telephonyManager.getNetworkOperatorName()) == null) {
                str = "";
            }
            List<String> carrierNames = this.e.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (StringsKt.contains((CharSequence) str, (CharSequence) it.next(), true)) {
                        try {
                            String a2 = a(this.f7144a);
                            this.d = true;
                            StringBuilder sb = new StringBuilder();
                            Random random = new Random();
                            for (int i = 0; i < 40; i++) {
                                char charAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i);
                                if (charAt == 'x') {
                                    sb.append(Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb.append(charAt);
                                }
                            }
                            String sb2 = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                            this.c = sb2;
                            ((C3733ga) If.c.getValue()).a(new C3795ig(this.e, new C3739gg(sb2, a2), this.b).a()).invokeOnCompletion(new Function1() { // from class: com.inmobi.media.hg$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C3768hg.a(C3768hg.this, (Throwable) obj);
                                }
                            });
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        Z9 z9 = this.b;
        if (z9 != null) {
            z9.a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }

    public static final Unit a(C3768hg c3768hg, Throwable th) {
        if (th == null) {
            Z9 z9 = c3768hg.b;
            if (z9 != null) {
                z9.a("NovatiqDataHandler", "Novatiq data sync successful");
            }
        } else {
            Z9 z92 = c3768hg.b;
            if (z92 != null) {
                z92.a("NovatiqDataHandler", "Error: " + th);
            }
        }
        return Unit.INSTANCE;
    }

    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return StringsKt.replace$default(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), ' ', '_', false, 4, (Object) null) + "_app";
    }
}
