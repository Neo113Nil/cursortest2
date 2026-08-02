package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* renamed from: com.google.android.gms.internal.ads.wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1741wb implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1786xb f16116b;

    public /* synthetic */ DialogInterfaceOnClickListenerC1741wb(C1786xb c1786xb, int i) {
        this.f16115a = i;
        this.f16116b = c1786xb;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f16115a) {
            case 0:
                C1786xb c1786xb = this.f16116b;
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", c1786xb.f16295q);
                data.putExtra("eventLocation", c1786xb.f16299u);
                data.putExtra("description", c1786xb.f16298t);
                long j5 = c1786xb.f16296r;
                if (j5 > -1) {
                    data.putExtra("beginTime", j5);
                }
                long j6 = c1786xb.f16297s;
                if (j6 > -1) {
                    data.putExtra("endTime", j6);
                }
                data.setFlags(268435456);
                T2.L l5 = P2.o.f4767B.f4771c;
                T2.L.p(c1786xb.f16294p, data);
                break;
            default:
                this.f16116b.t("Operation denied by user.");
                break;
        }
    }
}
