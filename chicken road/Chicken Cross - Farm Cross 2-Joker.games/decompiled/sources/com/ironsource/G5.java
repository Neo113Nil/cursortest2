package com.ironsource;

import android.util.Pair;
import com.ironsource.InterfaceC4763z7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class G5 implements Runnable {
    private static final String e = "Content-Type";
    private static final String f = "application/json";

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4763z7 f7636a;
    String b;
    String c;
    ArrayList<C4689v5> d;

    public G5(InterfaceC4763z7 interfaceC4763z7, String str, String str2, ArrayList<C4689v5> arrayList) {
        this.f7636a = interfaceC4763z7;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC4763z7.a a2;
        InterfaceC4763z7.a aVar = new InterfaceC4763z7.a(this.d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            Od b = Z7.b(this.c, this.b, arrayList);
            a2 = aVar.a(b.a()).a(b.f7840a);
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e2.getLocalizedMessage());
            a2 = aVar.a(e2 instanceof Ec).a(e2);
        }
        InterfaceC4763z7 interfaceC4763z7 = this.f7636a;
        if (interfaceC4763z7 != null) {
            interfaceC4763z7.a(a2);
        }
    }
}
