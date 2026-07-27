package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4531m8;
import com.ironsource.InterfaceC4581p4;
import com.ironsource.InterfaceC4599q4;
import com.ironsource.InterfaceC4616r4;
import com.ironsource.Lb;
import com.ironsource.Q4;
import com.ironsource.sdk.controller.f;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface l {

    public interface a {
        void a(f.a aVar);
    }

    public interface b {
        void a(Lb lb);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(Q4 q4);

    void a(Q4 q4, Map<String, String> map, InterfaceC4581p4 interfaceC4581p4);

    void a(Q4 q4, Map<String, String> map, InterfaceC4599q4 interfaceC4599q4);

    void a(f.c cVar, a aVar);

    void a(String str, InterfaceC4599q4 interfaceC4599q4);

    void a(String str, String str2, Q4 q4, InterfaceC4581p4 interfaceC4581p4);

    void a(String str, String str2, Q4 q4, InterfaceC4599q4 interfaceC4599q4);

    void a(String str, String str2, Q4 q4, InterfaceC4616r4 interfaceC4616r4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC4581p4 interfaceC4581p4);

    void a(JSONObject jSONObject, InterfaceC4599q4 interfaceC4599q4);

    void a(JSONObject jSONObject, InterfaceC4616r4 interfaceC4616r4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(Q4 q4);

    void b(Q4 q4, Map<String, String> map, InterfaceC4599q4 interfaceC4599q4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C4531m8.c h();
}
