package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4539mg {
    private NetworkSettings b;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f8444a = new ArrayList<>();
    private JSONObject c = null;
    private boolean d = true;

    C4539mg() {
    }

    public void a(NetworkSettings networkSettings) {
        this.b = networkSettings;
    }

    public JSONObject b() {
        return this.c;
    }

    public NetworkSettings c() {
        return this.b;
    }

    public ArrayList<String> d() {
        return this.f8444a;
    }

    public boolean e() {
        return this.d;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f8444a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public static C4539mg a() {
        return new C4539mg();
    }
}
