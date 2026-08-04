package A1;

import C1.AbstractC0102h;
import C1.C0103i;
import C1.InterfaceC0106l;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import java.util.ArrayList;
import p155w1.C1013m0;
import p155w1.C1017n0;

/* JADX INFO: renamed from: A1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0037p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1013m0 f526b = new C1013m0(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f527c;

    public C0037p(Context context) {
        this.f525a = context;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    public final AbstractC0023i[] a(Handler handler, K k7, K k8, K k9, K k10) {
        ArrayList arrayList = new ArrayList();
        C1013m0 c1013m0 = this.f526b;
        Context context = this.f525a;
        arrayList.add(new p156w2.h(context, c1013m0, handler, k7));
        boolean z4 = this.f527c;
        p151v2.n nVar = new p151v2.n();
        C0103i c0103i = C0103i.f1492c;
        nVar.f17143b = c0103i;
        nVar.f17142a = 0;
        nVar.f17145d = C1.F.f1393a;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i7 = p151v2.t.f17159a;
        if (i7 >= 17) {
            String str = p151v2.t.f17161c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                c0103i = C0103i.f1493d;
            } else if (i7 < 29 && (p151v2.t.D(context) || (i7 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
                c0103i = new C0103i(AbstractC0102h.a(), 8);
            } else if (intentRegisterReceiver != null && intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
                c0103i = new C0103i(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
            }
        } else if (i7 < 29) {
            if (intentRegisterReceiver != null) {
                c0103i = new C0103i(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
            }
        } else if (intentRegisterReceiver != null) {
            c0103i = new C0103i(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        c0103i.getClass();
        nVar.f17143b = c0103i;
        nVar.f17142a = z4 ? 1 : 0;
        if (((C1017n0) nVar.f17144c) == null) {
            nVar.f17144c = new C1017n0(new InterfaceC0106l[0]);
        }
        arrayList.add(new C1.H(this.f525a, c1013m0, handler, k8, new C1.E(nVar)));
        arrayList.add(new p068j2.k(k9, handler.getLooper()));
        arrayList.add(new com.google.android.exoplayer2.metadata.a(k10, handler.getLooper()));
        arrayList.add(new p162x2.a());
        return (AbstractC0023i[]) arrayList.toArray(new AbstractC0023i[0]);
    }
}
