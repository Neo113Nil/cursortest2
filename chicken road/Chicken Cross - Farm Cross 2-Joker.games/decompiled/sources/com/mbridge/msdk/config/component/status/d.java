package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MBPreferenceChangeEventPublisher.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f9043a;
    private final List<String> b = new ArrayList();
    private final List<com.mbridge.msdk.config.component.status.a> c = new CopyOnWriteArrayList();
    SharedPreferences.OnSharedPreferenceChangeListener d = new a();

    /* compiled from: MBPreferenceChangeEventPublisher.java */
    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (d.this.f9043a == null || !d.this.f9043a.contains(str)) {
                return;
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916006");
            HashMap hashMap = new HashMap();
            try {
                Object obj = d.this.f9043a.getAll().get(str);
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("key"), str);
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("value"), obj);
            } catch (Exception unused) {
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("key"), str);
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("value"), d.this.f9043a.getString(str, ""));
            }
            if (d.this.b.isEmpty()) {
                bVar.a(hashMap);
                d.this.a(bVar);
            } else if (d.this.b.contains(str)) {
                bVar.a(hashMap);
                d.this.a(bVar);
            }
        }
    }

    public d(String str) {
        Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        if (d == null) {
            return;
        }
        Context applicationContext = d.getApplicationContext();
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(TextUtils.isEmpty(str) ? applicationContext.getPackageName() + "_preferences" : str, 0);
        this.f9043a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.d);
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.c.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.c.add(aVar);
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            this.b.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th) {
            q0.b("PreferencePublisher", th.getMessage());
        }
    }
}
