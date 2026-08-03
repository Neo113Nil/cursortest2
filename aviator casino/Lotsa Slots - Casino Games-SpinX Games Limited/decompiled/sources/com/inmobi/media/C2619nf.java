package com.inmobi.media;

/* renamed from: com.inmobi.media.nf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2619nf {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5357a;
    public final com.inmobi.media.C2799u9 b;
    public java.lang.String c;
    public boolean d;
    public final com.inmobi.media.core.config.models.SignalsConfig.NovatiqConfig e;

    public C2619nf(android.content.Context context, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f5357a = context;
        this.b = c2799u9;
        this.c = "";
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        this.e = ((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getNovatiqConfig();
        b();
    }

    public final com.inmobi.media.C2565lf a() {
        if (this.d) {
            return new com.inmobi.media.C2565lf(kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("n-h-id", this.c)));
        }
        com.inmobi.media.C2799u9 c2799u9 = this.b;
        if (c2799u9 != null) {
            c2799u9.a("NovatiqDataHandler", "Novatiq disabled. skip");
        }
        return new com.inmobi.media.C2565lf(kotlin.collections.MapsKt.emptyMap());
    }

    public final void b() {
        java.lang.String str;
        android.content.Context context = this.f5357a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (this.e.getIsNovatiqEnabled()) {
            java.lang.Object systemService = context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            android.telephony.TelephonyManager telephonyManager = systemService instanceof android.telephony.TelephonyManager ? (android.telephony.TelephonyManager) systemService : null;
            if (telephonyManager == null || (str = telephonyManager.getNetworkOperatorName()) == null) {
                str = "";
            }
            java.util.List<java.lang.String> carrierNames = this.e.getCarrierNames();
            if (!(carrierNames instanceof java.util.Collection) || !carrierNames.isEmpty()) {
                java.util.Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) it.next(), true)) {
                        try {
                            java.lang.String a2 = a(this.f5357a);
                            this.d = true;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.util.Random random = new java.util.Random();
                            for (int i = 0; i < 40; i++) {
                                char charAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i);
                                if (charAt == 'x') {
                                    sb.append(java.lang.Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb.append(charAt);
                                }
                            }
                            java.lang.String sb2 = sb.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                            this.c = sb2;
                            ((com.inmobi.media.B9) com.inmobi.media.Pe.c.getValue()).a(new com.inmobi.media.C2645of(this.e, new com.inmobi.media.C2591mf(sb2, a2), this.b).a()).invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.nf$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.inmobi.media.C2619nf.a(com.inmobi.media.C2619nf.this, (java.lang.Throwable) obj);
                                }
                            });
                            return;
                        } catch (java.lang.Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        com.inmobi.media.C2799u9 c2799u9 = this.b;
        if (c2799u9 != null) {
            c2799u9.a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.C2619nf c2619nf, java.lang.Throwable th) {
        if (th == null) {
            com.inmobi.media.C2799u9 c2799u9 = c2619nf.b;
            if (c2799u9 != null) {
                c2799u9.a("NovatiqDataHandler", "Novatiq data sync successful");
            }
        } else {
            com.inmobi.media.C2799u9 c2799u92 = c2619nf.b;
            if (c2799u92 != null) {
                c2799u92.a("NovatiqDataHandler", "Error: " + th);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static java.lang.String a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return kotlin.text.StringsKt.replace$default(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), ' ', '_', false, 4, (java.lang.Object) null) + "_app";
    }
}
