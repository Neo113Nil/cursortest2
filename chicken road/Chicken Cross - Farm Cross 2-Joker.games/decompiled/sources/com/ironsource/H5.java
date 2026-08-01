package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public class H5 {
    private static final String e = "EventsTracker";

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4476j7 f7656a;
    private B5 b;
    private C7 c;
    private ExecutorService d;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7657a;

        a(String str) {
            this.f7657a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Od od = new Od();
                ArrayList<Pair<String, String>> d = H5.this.b.d();
                if ("POST".equals(H5.this.b.e())) {
                    od = Z7.b(H5.this.b.b(), this.f7657a, d);
                } else if ("GET".equals(H5.this.b.e())) {
                    od = Z7.a(H5.this.b.b(), this.f7657a, d);
                }
                H5.this.a("response status code: " + od.f7840a);
            } catch (Exception e) {
                C4491k4.d().a(e);
            }
        }
    }

    public H5(B5 b5, InterfaceC4476j7 interfaceC4476j7) {
        if (b5 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (b5.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.b = b5;
        this.f7656a = interfaceC4476j7;
        this.c = b5.c();
        this.d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            a(hashMap, this.f7656a.a());
            a(hashMap, map);
            b(this.c.a(hashMap));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e2) {
            C4491k4.d().a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b.f()) {
            Log.d(e, str);
        }
    }
}
