package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.ap, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770ap implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12719a;

    /* renamed from: b, reason: collision with root package name */
    public final C0606Hd f12720b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f12721c;

    public /* synthetic */ C0770ap(Context context, C0606Hd c0606Hd, int i) {
        this.f12719a = i;
        this.f12721c = context;
        this.f12720b = c0606Hd;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        switch (this.f12719a) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 18;
            case 4:
                return 57;
            case 5:
                return 37;
            case 6:
                return 59;
            case 7:
                return 38;
            default:
                return 39;
        }
    }

    public Intent b() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.Ca)).booleanValue();
        Context context = this.f12721c;
        if (!booleanValue || Build.VERSION.SDK_INT < 33) {
            return context.registerReceiver(null, intentFilter);
        }
        registerReceiver = context.registerReceiver(null, intentFilter, 4);
        return registerReceiver;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        switch (this.f12719a) {
            case 0:
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.uc)).booleanValue()) {
                    return AbstractC1400ot.c0(new C0815bp(0, null, false));
                }
                ContentResolver contentResolver = this.f12721c.getContentResolver();
                if (contentResolver == null) {
                    return AbstractC1400ot.c0(new C0815bp(0, null, false));
                }
                return this.f12720b.d(new S4(10, contentResolver));
            case 1:
                return this.f12720b.d(new S4(13, this));
            case 2:
                return this.f12720b.d(new S4(14, this));
            case 3:
                return this.f12720b.d(new S4(16, this));
            case 4:
                return this.f12720b.d(new S4(17, this));
            case 5:
                return this.f12720b.d(new S4(26, this));
            case 6:
                if (!((Boolean) AbstractC0790b8.f12766b.s()).booleanValue()) {
                    return AbstractC1400ot.c0(new Pp(-1, -1));
                }
                return this.f12720b.d(new S4(27, this));
            case 7:
                return this.f12720b.d(new S4(28, this));
            default:
                return this.f12720b.d(new S4(29, this));
        }
    }

    public /* synthetic */ C0770ap(C0606Hd c0606Hd, Context context, int i) {
        this.f12719a = i;
        this.f12720b = c0606Hd;
        this.f12721c = context;
    }
}
