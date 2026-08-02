package A1;

import C1.AbstractC0102h;
import C1.C0103i;
import C1.InterfaceC0106l;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import j2.C1314k;
import java.util.ArrayList;
import w1.C1722m0;
import w1.C1726n0;
import x2.C1787a;

/* renamed from: A1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f525a;

    /* renamed from: b, reason: collision with root package name */
    public final C1722m0 f526b = new C1722m0(8);

    /* renamed from: c, reason: collision with root package name */
    public boolean f527c;

    public C0037p(Context context) {
        this.f525a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0023i[] a(Handler handler, K k7, K k8, K k9, K k10) {
        ArrayList arrayList = new ArrayList();
        C1722m0 c1722m0 = this.f526b;
        Context context = this.f525a;
        arrayList.add(new w2.h(context, c1722m0, handler, k7));
        boolean z4 = this.f527c;
        v2.n nVar = new v2.n();
        C0103i c0103i = C0103i.f1492c;
        nVar.f17137b = c0103i;
        nVar.f17136a = 0;
        nVar.f17139d = C1.F.f1393a;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i7 = v2.t.f17153a;
        if (i7 >= 17) {
            String str = v2.t.f17155c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                c0103i = C0103i.f1493d;
                c0103i.getClass();
                nVar.f17137b = c0103i;
                nVar.f17136a = z4 ? 1 : 0;
                if (((C1726n0) nVar.f17138c) == null) {
                    nVar.f17138c = new C1726n0(new InterfaceC0106l[0]);
                }
                arrayList.add(new C1.H(this.f525a, c1722m0, handler, k8, new C1.E(nVar)));
                arrayList.add(new C1314k(k9, handler.getLooper()));
                arrayList.add(new com.google.android.exoplayer2.metadata.a(k10, handler.getLooper()));
                arrayList.add(new C1787a());
                return (AbstractC0023i[]) arrayList.toArray(new AbstractC0023i[0]);
            }
        }
        if (i7 >= 29 && (v2.t.D(context) || (i7 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            c0103i = new C0103i(AbstractC0102h.a(), 8);
        } else if (registerReceiver != null && registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            c0103i = new C0103i(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        c0103i.getClass();
        nVar.f17137b = c0103i;
        nVar.f17136a = z4 ? 1 : 0;
        if (((C1726n0) nVar.f17138c) == null) {
        }
        arrayList.add(new C1.H(this.f525a, c1722m0, handler, k8, new C1.E(nVar)));
        arrayList.add(new C1314k(k9, handler.getLooper()));
        arrayList.add(new com.google.android.exoplayer2.metadata.a(k10, handler.getLooper()));
        arrayList.add(new C1787a());
        return (AbstractC0023i[]) arrayList.toArray(new AbstractC0023i[0]);
    }
}
